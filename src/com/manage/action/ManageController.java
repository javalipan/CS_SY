package com.manage.action;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manage.constant.CommonConstant;
import com.manage.dao.model.FullRule;
import com.manage.dao.model.FullRuleExample;
import com.manage.dao.model.GoodsDetail;
import com.manage.dao.model.GoodsDetailExample;
import com.manage.dao.model.Member;
import com.manage.dao.model.MemberCoupon;
import com.manage.dao.model.MemberCouponExample;
import com.manage.dao.model.MemberExample;
import com.manage.dao.model.Order;
import com.manage.dao.model.OrderExample;
import com.manage.dao.model.Recharge;
import com.manage.dao.model.RechargeExample;
import com.manage.dao.model.RechargeRule;
import com.manage.dao.model.RechargeRuleExample;
import com.manage.dao.model.Region;
import com.manage.dao.model.RegionExample;
import com.manage.dao.model.User;
import com.manage.dao.model.UserExample;
import com.manage.query.model.GoodsDetailQuery;
import com.manage.query.model.GoodsQuery;
import com.manage.service.IFullRuleService;
import com.manage.service.IGoodsDetailService;
import com.manage.service.IGoodsService;
import com.manage.service.ILogService;
import com.manage.service.IMemberCouponService;
import com.manage.service.IMemberService;
import com.manage.service.IOrderService;
import com.manage.service.IRechargeRuleService;
import com.manage.service.IRechargeService;
import com.manage.service.IRegionService;
import com.manage.service.IUserService;
import com.manage.util.CommonUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/manage")
public class ManageController extends BaseController{
	
	@Autowired
	private IUserService userService;
	@Autowired
	private ILogService logService;
	@Autowired
	private IRegionService regionService;
	@Autowired
	private IMemberService memberService;
	@Autowired
	private IOrderService orderService;
	@Autowired
	private IGoodsService goodsService;
	@Autowired
	private IGoodsDetailService goodsDetailService;
	@Autowired
	private IRechargeRuleService rechargeRuleService;
	@Autowired
	private IRechargeService rechargeService;
	@Autowired
	private IMemberCouponService memberCouponService;
	@Autowired
	private IFullRuleService fullRuleService;
	
	@RequestMapping(value="/main.action")
	public String initManagePage(ModelMap model){
		model.put("INT_WEIGHT", CommonConstant.INT_WEIGHT);
		model.put("INT_TIMES", CommonConstant.INT_TIMES);
		RechargeRuleExample rechargeRuleExample=new RechargeRuleExample();
		List<RechargeRule> rechargeRules=rechargeRuleService.selectByExample(rechargeRuleExample);
		model.put("rechargeRules", rechargeRules);
		
		FullRuleExample fullRuleExample=new FullRuleExample();
		fullRuleExample.setOrderByClause("amount asc");
		List<FullRule> fullRules=fullRuleService.selectByExample(fullRuleExample);
		model.put("fullRules", JSONArray.fromObject(fullRules).toString());
		
		return "main";
	}
	
	@RequestMapping(value="/initLogin.do")
	public String initLogin(){
		return "login";
	}
	
	@RequestMapping(value="/login.do")
	public String login(HttpServletRequest request,ModelMap model,User user){
		UserExample userExample=new UserExample();
		UserExample.Criteria crit=userExample.createCriteria();
		crit.andLoginnameEqualTo(user.getLoginname());
		crit.andTypeEqualTo("2");
		try {
			crit.andPasswordEqualTo(CommonUtil.md5(user.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		List<User> users=userService.selectByExample(userExample);
		if(users.size()>0){
			user=users.get(0);
			if("1".equals(user.getStatus())){
				model.put("errormes", "用户被禁用!");
				return "login";
			}
			request.getSession().setAttribute("USER_INFO_CASHIER", user);
			logService.insertLoginLog("用户"+user.getName()+"登录系统");
			return "redirect:/manage/main.action";
		}
		model.put("errormes", "用户名或密码错误!");
		return "login";
	}
	
	@RequestMapping(value="/logout.do")
	public String logout(){
		return "login";
	}
	
	@RequestMapping(value="/getProvinces.action")
	@ResponseBody
	public String getProvinces(){
		RegionExample regionExample=new RegionExample();
		regionExample.createCriteria().andSuperiorcodeEqualTo(100000);
		List<Region> regions=regionService.selectByExample(regionExample);
		return JSONArray.fromObject(regions).toString();
	}
	
	@RequestMapping(value="/getChildrenArea.action")
	@ResponseBody
	public String getChildrenArea(Integer parent){
		RegionExample regionExample=new RegionExample();
		regionExample.createCriteria().andSuperiorcodeEqualTo(parent);
		List<Region> regions=regionService.selectByExample(regionExample);
		return JSONArray.fromObject(regions).toString();
	}
	
	@RequestMapping(value="/searchMember.action",method=RequestMethod.POST)
	@ResponseBody
	public String searchMember(ModelMap model,String phone){
		MemberExample memberExample=new MemberExample();
		MemberExample.Criteria crit=memberExample.createCriteria();
		crit.andPhoneLike(phone);
		List<Member> members=memberService.selectByExample(memberExample);
		if(members.size()==1){
			Member member=members.get(0);
			JSONObject result=JSONObject.fromObject(member);
			OrderExample orderExample=new OrderExample();
			orderExample.createCriteria().andMemberidEqualTo(member.getId()).andIspayEqualTo("1");
			int count=orderService.countByExample(orderExample);
			result.put("ordercount", count);
			
			MemberCouponExample memberCouponExample=new MemberCouponExample();
			Calendar calendar=Calendar.getInstance();
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			memberCouponExample.createCriteria().andMemberidEqualTo(member.getId()).andStatusEqualTo("0").andStarttimeLessThanOrEqualTo(calendar.getTime()).andEndtimeGreaterThanOrEqualTo(calendar.getTime());
			List<MemberCoupon> memberCoupons=memberCouponService.selectByExample(memberCouponExample);
			int total=0;
			for(MemberCoupon memberCoupon:memberCoupons){
				total+=memberCoupon.getMoney();
			}
			result.put("memberCoupons", memberCoupons);
			result.put("couponBalance", total);
			
			return result.toString();
		}
		return "{}";
	}
	
	@RequestMapping(value="/getGoodsDetail.action",method=RequestMethod.POST)
	@ResponseBody
	public String getGoodsDetail(String code){
		Map<String, Object> result=new HashMap<String, Object>();
		GoodsDetailExample goodsDetailExample=new GoodsDetailExample();
		goodsDetailExample.createCriteria().andDetailcodeEqualTo(code);
		List<GoodsDetail> goodsdetails=goodsDetailService.selectByExample(goodsDetailExample);
		if(goodsdetails.size()>0){
			GoodsQuery goodsQuery=goodsService.selectGoodsQueryById(goodsdetails.get(0).getGoodsid());
			if(goodsQuery==null){
				return new JSONObject().toString();
			}
			result.put("goodsQuery", goodsQuery);
			GoodsDetailQuery goodsDetailQuery=new GoodsDetailQuery();
			goodsDetailQuery.setDetailcode(code);
			List<GoodsDetailQuery> details=goodsDetailService.selectByGoodsDetailQuery(goodsDetailQuery);
			result.put("details", details);
		}
		return JSONObject.fromObject(result).toString();
	}
	
	@RequestMapping(value="/goodsSearch.action")
	@ResponseBody
	public String goodsSearch(ModelMap model,GoodsDetailQuery goodsDetailQuery){
		List<GoodsDetailQuery> details=goodsDetailService.selectByGoodsDetailQuery(goodsDetailQuery);
		return JSONArray.fromObject(details).toString();
	}
	
	/**
	 * @param order
	 * @param orderJson :订单详情json
	 * @param exchange ：兑换的积分
	 * @param joinpoints ：是否参与积分计算
	 * @param balancepay ：余额支付
	 * @param couponids ：优惠券id列表
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/saveOrder.action")
	@ResponseBody
	public String saveOrder(Order order,String orderJson,Integer exchange,boolean joinpoints,Double balancepay,String couponids){
		order.setIspay("1");
		order.setIssend("1");
		order.setIsreceive("1");
		order.setDelway("1");
		Date now=new Date();
		order.setGettime(now);
		order.setPaytime(now);
		order.setSendtime(now);
		order.setReceivetime(now);
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			if(orderService.saveOrder(order, orderJson, exchange, joinpoints,balancepay,couponids)){
				map.put("status", true);
				map.put("orderid", order.getId());
			}
			else{
				map.put("status", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", false);
			map.put("msg", e.getMessage());
			return JSONObject.fromObject(map).toString();
		}
		return JSONObject.fromObject(map).toString();
	}
	
	@RequestMapping(value="/initPrintPage.action")
	public String initPrintPage(ModelMap model,long orderid) throws Exception{
		JSONObject result=orderService.initPrintPage(orderid);
		model.put("data", result);
		return "printpage";
	}
	
	@RequestMapping(value="/getRechargeHis.action")
	@ResponseBody
	public String getRechargeHis(Long memberid){
		RechargeExample rechargeExample=new RechargeExample();
		rechargeExample.createCriteria().andMemberidEqualTo(memberid).andStatusEqualTo("1");
		rechargeExample.setOrderByClause("dealTime desc");
		List<Recharge> rechargeList=rechargeService.selectByExample(rechargeExample);
		return JSONArray.fromObject(rechargeList).toString();
	}
	
	@RequestMapping(value="/recharge.action")
	@ResponseBody
	public String recharge(Long memberid,Long ruleid,Integer amount,Integer giveamount,Double discount){
		Member member=rechargeService.recharge(memberid, ruleid, amount, giveamount, discount);
		if(member!=null){
			return JSONObject.fromObject(member).toString();
		}
		else{
			return "{}";
		}
	}
}
