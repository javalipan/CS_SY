package com.manage.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.manage.constant.CommonConstant;
import com.manage.dao.mapper.BalanceRecordMapper;
import com.manage.dao.mapper.CouponMapper;
import com.manage.dao.mapper.FullRuleMapper;
import com.manage.dao.mapper.GoodsDetailMapper;
import com.manage.dao.mapper.GoodsMapper;
import com.manage.dao.mapper.LevelSettingMapper;
import com.manage.dao.mapper.MemberCouponMapper;
import com.manage.dao.mapper.MemberLabelMapper;
import com.manage.dao.mapper.MemberMapper;
import com.manage.dao.mapper.MemberTypeChangeMapper;
import com.manage.dao.mapper.OrderDetailMapper;
import com.manage.dao.mapper.OrderMapper;
import com.manage.dao.mapper.PointLogMapper;
import com.manage.dao.mapper.SysSettingMapper;
import com.manage.dao.model.BalanceRecord;
import com.manage.dao.model.Coupon;
import com.manage.dao.model.FullRule;
import com.manage.dao.model.FullRuleExample;
import com.manage.dao.model.Goods;
import com.manage.dao.model.GoodsDetail;
import com.manage.dao.model.LevelSetting;
import com.manage.dao.model.LevelSettingExample;
import com.manage.dao.model.Member;
import com.manage.dao.model.MemberCoupon;
import com.manage.dao.model.MemberCouponExample;
import com.manage.dao.model.MemberTypeChange;
import com.manage.dao.model.Order;
import com.manage.dao.model.OrderDetail;
import com.manage.dao.model.OrderDetailExample;
import com.manage.dao.model.OrderExample;
import com.manage.dao.model.PointLog;
import com.manage.dao.model.SysSetting;
import com.manage.dao.model.SysSettingExample;
import com.manage.dao.model.User;
import com.manage.query.mapper.GoodsDetailQueryMapper;
import com.manage.query.mapper.LevelSettingQueryMapper;
import com.manage.query.mapper.OrderQueryMapper;
import com.manage.query.mapper.SequenceQueryMapper;
import com.manage.query.model.GoodsDetailQuery;
import com.manage.service.IOrderService;
import com.manage.util.DateUtil;
import com.manage.util.MathUtils;
import com.manage.util.NumberToCN;
import com.manage.util.NumberUtil;
import com.manage.util.thread.LabelThread;

@Service
public class OrderService implements IOrderService {

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsDetailMapper goodsDetailMapper;
	@Autowired
	private GoodsDetailQueryMapper goodsDetailQueryMapper;
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	@Autowired
	private SequenceQueryMapper sequenceQueryMapper;
	@Autowired
	private LevelSettingQueryMapper levelSettingQueryMapper;
	@Autowired
	private LevelSettingMapper levelSettingMapper;
	@Autowired
	private PointLogMapper pointLogMapper;
	@Autowired
	private MemberMapper memberMapper;
	@Autowired
	private SysSettingMapper settingMapper;
	@Autowired
	private MemberTypeChangeMapper memberTypeChangeMapper;
	@Autowired
	private FullRuleMapper fullRuleMapper;
	@Autowired
	private MemberCouponMapper memberCouponMapper;
	@Autowired
	private BalanceRecordMapper balanceRecordMapper;
	@Autowired
	private OrderQueryMapper orderQueryMapper;
	@Autowired
	private MemberLabelMapper memberLabelMapper;
	@Autowired
	private CouponMapper couponMapper;
	
	public int countByExample(OrderExample example) {
		return orderMapper.countByExample(example);
	}

	public int deleteByExample(OrderExample example) {
		return orderMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return orderMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(Order record) {
		return orderMapper.insertSelective(record);
	}

	public List<Order> selectByExample(OrderExample example) {
		return orderMapper.selectByExample(example);
	}

	public Order selectByPrimaryKey(Long id) {
		return orderMapper.selectByPrimaryKey(id);
	}
	
	public int updateByExampleSelective(Order record, OrderExample example) {
		return orderMapper.updateByExampleSelective(record, example);
	}

	public int updateByPrimaryKeySelective(Order record) {
		return orderMapper.updateByPrimaryKeySelective(record);
	}

//	public boolean saveOrder(Order order, String orderJson, Integer exchange,boolean joinpoints) throws Exception {
//		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
//		User user= (User) request.getSession().getAttribute("USER_INFO_CASHIER");
//		
//		JSONArray details=JSONArray.fromObject(orderJson);
//		List<OrderDetail> orderDetails=new ArrayList<OrderDetail>();
//		List<GoodsDetail> goodsDetails=new ArrayList<GoodsDetail>();
//		double total=0;
//		double viptotal=0;
//		List<Goods> updateGoodsSoldCnt=new ArrayList<Goods>();		//待修改销量商品列表
//		for(int i=0;i<details.size();i++){		//遍历商品详情json
//			Long id=details.getJSONObject(i).getLong("id");
//			int num=details.getJSONObject(i).getInt("num");
//			GoodsDetail goodsDetail=goodsDetailMapper.selectByPrimaryKey(id);
//			goodsDetail.setAmount(goodsDetail.getAmount()-num);
//			goodsDetails.add(goodsDetail);		//需要修改库存的商品
//			Goods goods=goodsMapper.selectByPrimaryKey(goodsDetail.getGoodsid());
//			goods.setSoldcnt(goods.getSoldcnt()+num);
//			updateGoodsSoldCnt.add(goods);
//			OrderDetail od=new OrderDetail();
//			od.setGoodsdetailid(id);
//			od.setGoodsname(goods.getName());
//			od.setSizeid(goodsDetail.getSizeid());
//			od.setColorid(goodsDetail.getColorid());
//			od.setCostprice(goodsDetail.getCostprice());
//			od.setOldprice(goodsDetail.getOldprice());
//			od.setPrice(goodsDetail.getPrice());
//			od.setVipprice(goodsDetail.getVipprice());
//			od.setAmount(num);
//			total=NumberUtil.add(total, NumberUtil.multiply(goodsDetail.getPrice(), num));
//			viptotal=NumberUtil.add(viptotal, NumberUtil.multiply(goodsDetail.getPrice(), num));
//			od.setTotalprice(NumberUtil.toFixed(NumberUtil.multiply(goodsDetail.getPrice(), num), 2));
//			orderDetails.add(od);
//		}
//		Date now=new Date();
//		SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMM");
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
//		Long seqval=sequenceQueryMapper.getSeqNextVal("order"+sdf1.format(now));
//		order.setCode(sdf.format(now)+String.format("%06d", seqval));		//订单编号
//		order.setPricemodified("0");
//		order.setOldprice(NumberUtil.toFixed(total, 2));
//		order.setDiscount(NumberUtil.toFixed(NumberUtil.subtract(total, viptotal), 2));
//		
//		Member member = null;
//		if(order.getMemberid()!=null&&order.getMemberid()>0){
//			member=memberMapper.selectByPrimaryKey(order.getMemberid());
//			
//			if(order.getBalancepay()!=null&&member.getBalance()<order.getBalancepay()){
//				throw new Exception("余额不足!");
//			}
//		}
//		
//		double totalprice=0.0;
//		if(order.getMemberid()!=null&&order.getMemberid()>0&&exchange!=null&&exchange>0){
//			if(member.getMemberpoint()<exchange){
//				throw new Exception("积分不足!");
//			}
//			
//			double exchangeprice=exchange/CommonConstant.INT_WEIGHT;
//			order.setIntegralprice(exchangeprice);
//			totalprice=NumberUtil.toFixed(NumberUtil.subtract(viptotal, exchangeprice), 2);
//		}
//		else{
//			totalprice=NumberUtil.toFixed(viptotal, 2);
//		}
//		if(order.getTotalprice()!=totalprice){
//			order.setPricemodified("1");
//			order.setModifyuser(user.getId());
//		}
//		order.setOrdertime(now);
//		if(orderMapper.insertSelective(order)<=0){
//			return false;
//		}
//		for(OrderDetail od:orderDetails){		//插入商品详情
//			od.setOrderid(order.getId());
//			if("1".equals(order.getPricemodified())){		//修改了金额
//				od.setPrice(Double.valueOf(NumberUtil.toFixed(od.getPrice().doubleValue() / totalprice * order.getTotalprice().doubleValue(), 2)));
//				od.setTotalprice(NumberUtil.toFixed(od.getPrice()*od.getAmount(),2));
//			}
//			if(orderDetailMapper.insertSelective(od)<=0){
//				return false;
//			}
//		}
//		for(GoodsDetail gd:goodsDetails){		//修改库存
//			if(goodsDetailMapper.updateByPrimaryKeySelective(gd)<=0){
//				return false;
//			}
//		}
//		for(Goods goods:updateGoodsSoldCnt){		//修改增加商品销量
//			goodsMapper.updateByPrimaryKeySelective(goods);
//		}
//		
//		if(order.getMemberid()!=null&&order.getMemberid()>0&&exchange!=null&&exchange>0){
//			member.setMemberpoint(member.getMemberpoint()-exchange);		//减少积分
////			memberMapper.updateByPrimaryKeySelective(member);		//减少会员积分
//			
//			PointLog pointLog=new PointLog();
//			pointLog.setChangetime(now);
//			pointLog.setMemberid(member.getId());
//			pointLog.setOrderid(order.getId());
//			pointLog.setPoint(exchange);
//			pointLog.setReason("0");
//			pointLog.setType("1");
//			pointLogMapper.insertSelective(pointLog);		//插入积分变更记录(减少)
//		}
//		if(order.getMemberid()!=null&&order.getMemberid()>0){		//选择了会员修改会员积分
//			if(joinpoints){		//是否增加积分
//				LevelSettingExample levelSettingExample=new LevelSettingExample();
//				levelSettingExample.createCriteria().andGradeEqualTo(member.getMemberlevel());
//				List<LevelSetting> levelSettings=levelSettingMapper.selectByExample(levelSettingExample);
//				LevelSetting levelSetting=levelSettings.get(0);
//				int thispoint=new Double(NumberUtil.multiply(order.getTotalprice(), levelSetting.getPointspeed())).intValue();
//				
//				member.setMemberpoint(member.getMemberpoint()+thispoint);		//增加用户消费积分
//				
//				PointLog pointLog=new PointLog();
//				pointLog.setChangetime(now);
//				pointLog.setMemberid(member.getId());
//				pointLog.setOrderid(order.getId());
//				pointLog.setPoint(thispoint);
//				pointLog.setReason("0");
//				pointLog.setType("0");
//				pointLogMapper.insertSelective(pointLog);		//插入积分变更记录(增加)
//			}
//			member.setTotalmoney(member.getTotalmoney()+order.getTotalprice());		//增加消费金额
//			Date lasttime=member.getLastbuytime();
//			if(lasttime==null){
//				MemberTypeChange memberTypeChange=new MemberTypeChange();
//				memberTypeChange.setMemberid(member.getId());
//				memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
//				memberTypeChange.setAftertype("E");
//				memberTypeChange.setChangetime(now);
//				memberTypeChangeMapper.insertSelective(memberTypeChange);
//				
//				member.setMembertype("N");		//第一次购买为新顾客
//				member.setOldornew("1");
//			}
//			else{
//				member.setOldornew("2");
//				SysSettingExample sysSettingExample=new SysSettingExample();
//				sysSettingExample.createCriteria().andTypekeyEqualTo(CommonConstant.BUYPERIOD);
//				List<SysSetting> sysSettings=settingMapper.selectByExample(sysSettingExample);
//				SysSetting setting=sysSettings.get(0);
//				int buyperiod=Integer.parseInt(setting.getTypevalue());		//获取购买周期设置的天数
//				double days=DateUtil.daysRange(lasttime, now);
//				if(days<buyperiod){
//					MemberTypeChange memberTypeChange=new MemberTypeChange();
//					memberTypeChange.setMemberid(member.getId());
//					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
//					memberTypeChange.setAftertype("E");
//					memberTypeChange.setChangetime(now);
//					memberTypeChangeMapper.insertSelective(memberTypeChange);
//					
//					member.setMembertype("E");		//一个购买周期非第一次购买
//				}
//				if("S1".equals(member.getMembertype())){
//					MemberTypeChange memberTypeChange=new MemberTypeChange();
//					memberTypeChange.setMemberid(member.getId());
//					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
//					memberTypeChange.setAftertype("X1");
//					memberTypeChange.setChangetime(now);
//					memberTypeChangeMapper.insertSelective(memberTypeChange);
//					
//					member.setMembertype("X1");		//唤醒瞌睡
//				}
//				if("S2".equals(member.getMembertype())){
//					MemberTypeChange memberTypeChange=new MemberTypeChange();
//					memberTypeChange.setMemberid(member.getId());
//					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
//					memberTypeChange.setAftertype("X2");
//					memberTypeChange.setChangetime(now);
//					memberTypeChangeMapper.insertSelective(memberTypeChange);
//					
//					member.setMembertype("X2");		//唤醒半睡
//				}
//				if("S3".equals(member.getMembertype())){
//					MemberTypeChange memberTypeChange=new MemberTypeChange();
//					memberTypeChange.setMemberid(member.getId());
//					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
//					memberTypeChange.setAftertype("X3");
//					memberTypeChange.setChangetime(now);
//					memberTypeChangeMapper.insertSelective(memberTypeChange);
//					
//					member.setMembertype("X3");		//唤醒沉睡
//				}
//			}
//			
//			LevelSetting levelSetting=levelSettingQueryMapper.getLevel(MathUtils.round(member.getTotalmoney(), 0));
//			if(levelSetting.getGrade()!=member.getMemberlevel()){	//会员等级变动
//				member.setMemberlevel(levelSetting.getGrade());		//会员等级
//				member.setLevelchangetime(now);		//会员等级变动日期
//				
//				if(member.getDiscount()==null||member.getDiscount()==0){
//					member.setDiscount(levelSetting.getDiscount());
//				}
//				else{
//					member.setDiscount(member.getDiscount()>levelSetting.getDiscount()?levelSetting.getDiscount():member.getDiscount());
//				}
//			}
//			
//			member.setLastbuytime(now);
//			memberMapper.updateByPrimaryKeySelective(member);
//		}
//		return true;
//	}
	
	public boolean saveOrder(Order order, String orderJson, Integer exchange,boolean joinpoints,Double balancepay,String couponids) throws Exception {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		User user= (User) request.getSession().getAttribute("USER_INFO_CASHIER");
		
		JSONArray details=JSONArray.fromObject(orderJson);
		List<OrderDetail> orderDetails=new ArrayList<OrderDetail>();
		List<GoodsDetail> goodsDetails=new ArrayList<GoodsDetail>();
		double total=0;
		double viptotal=0;
		List<Goods> updateGoodsSoldCnt=new ArrayList<Goods>();		//待修改销量商品列表
		for(int i=0;i<details.size();i++){		//遍历商品详情json
			Long id=details.getJSONObject(i).getLong("id");
			int num=details.getJSONObject(i).getInt("num");
			Double discount=details.getJSONObject(i).getDouble("discount");
			GoodsDetail goodsDetail=goodsDetailMapper.selectByPrimaryKey(id);
			goodsDetail.setAmount(goodsDetail.getAmount()-num);
			goodsDetails.add(goodsDetail);		//需要修改库存的商品
			Goods goods=goodsMapper.selectByPrimaryKey(goodsDetail.getGoodsid());
			goods.setSoldcnt(goods.getSoldcnt()+num);
			updateGoodsSoldCnt.add(goods);
			OrderDetail od=new OrderDetail();
			od.setGoodsdetailid(id);
			od.setGoodsname(goods.getName());
			od.setSizeid(goodsDetail.getSizeid());
			od.setColorid(goodsDetail.getColorid());
			od.setCostprice(goodsDetail.getCostprice());
			od.setOldprice(goodsDetail.getOldprice());
			od.setPrice(goodsDetail.getPrice());
			od.setVipprice(goodsDetail.getVipprice());
			od.setAmount(num);
			od.setDiscount("2".equals(goods.getIsdiscount())?goods.getDiscount():0);
			total=NumberUtil.add(total, NumberUtil.multiply(goodsDetail.getPrice(), num));
			if(discount>0&&discount<10&&goods.getDiscount()!=discount){		//修改了折扣
				double vippricenew=NumberUtil.toFixed(NumberUtil.divide(NumberUtil.multiply(goodsDetail.getPrice(), discount), 10), 2);
				od.setVipprice(vippricenew);	//新折扣价
				od.setDiscount(discount);		//新折扣
				viptotal=NumberUtil.add(viptotal, NumberUtil.multiply(vippricenew, num));
				od.setTotalprice(NumberUtil.toFixed(NumberUtil.multiply(vippricenew, num), 2));
			}else{	//未修改折扣
				if("2".equals(goods.getIsdiscount())){
					viptotal=NumberUtil.add(viptotal, NumberUtil.multiply(goodsDetail.getVipprice(), num));
					od.setTotalprice(NumberUtil.toFixed(NumberUtil.multiply(goodsDetail.getVipprice(), num), 2));
				}
				else{
					viptotal=NumberUtil.add(viptotal, NumberUtil.multiply(goodsDetail.getPrice(), num));
					od.setTotalprice(NumberUtil.toFixed(NumberUtil.multiply(goodsDetail.getPrice(), num), 2));
				}
			}
			
			orderDetails.add(od);
		}
		double viptotal2=viptotal;
		Date now=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMM");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Long seqval=sequenceQueryMapper.getSeqNextVal("order"+sdf1.format(now));
		order.setCode(sdf.format(now)+String.format("%06d", seqval));		//订单编号
		order.setPricemodified("0");
		order.setOldprice(NumberUtil.toFixed(total, 2));
		
		Member member = null;
		if(order.getMemberid()!=null&&order.getMemberid()>0){
			member=memberMapper.selectByPrimaryKey(order.getMemberid());
			
			order.setDiscount(member.getDiscount());
			if(order.getBalancepay()!=null&&member.getBalance()<order.getBalancepay()){
				throw new Exception("余额不足!");
			}
		}
		
		List<MemberCoupon> memberCoupons=null;
		if(StringUtils.isNotBlank(couponids)){		//选择了优惠券
			String idarray[]=couponids.split(",");
			List<Long> ids=new ArrayList<Long>();
			for(String id:idarray){
				ids.add(Long.parseLong(id));
			}
			MemberCouponExample memberCouponExample=new MemberCouponExample();
			memberCouponExample.createCriteria().andIdIn(ids);
			memberCoupons=memberCouponMapper.selectByExample(memberCouponExample);
			int coupontotal=0;		//优惠券使用总金额
			String userCoupons="";
			for(MemberCoupon memberCoupon:memberCoupons){
				if(memberCoupon.getLimitmoney()>viptotal){
					throw new Exception("订单金额未达到优惠券限制金额，无法使用!");
				}
				coupontotal+=memberCoupon.getMoney();
				userCoupons+=memberCoupon.getCode()+",";
			}
			viptotal=MathUtils.reduce(viptotal,coupontotal);
			if(viptotal<0){
				viptotal=0;
			}
			order.setCouponspay(coupontotal);
			order.setUsercoupons(userCoupons.substring(0,userCoupons.length()-1));
		}
		else{
			order.setCouponspay(0);
		}
		
		FullRuleExample fullRuleExample=new FullRuleExample();
		fullRuleExample.setOrderByClause("amount asc");
		List<FullRule> fullRules=fullRuleMapper.selectByExample(fullRuleExample);
		int subtractmoney=calcFullReduce(viptotal, fullRules);
		if(subtractmoney>0){
			viptotal=MathUtils.reduce(viptotal, subtractmoney);	//减去满减部分
			order.setSubtractmoney(subtractmoney);
		}
		
		if(order.getMemberid()!=null&&order.getMemberid()>0&&exchange!=null&&exchange>0){
			if(member.getMemberpoint()<exchange){
				throw new Exception("积分不足!");
			}
			
			double exchangeprice=exchange/CommonConstant.INT_WEIGHT;
			order.setIntegralprice(exchangeprice);
			viptotal=NumberUtil.toFixed(NumberUtil.subtract(viptotal, exchangeprice), 2);
		}
		else{
			viptotal=NumberUtil.toFixed(viptotal, 2);
		}
		
		
		if(member.getDiscount()!=null&&member.getDiscount()>0&&member.getDiscount()<10){		//会员折扣
			viptotal=MathUtils.div(MathUtils.mul(viptotal, member.getDiscount()), 10);
		}
		
		double qdTotal=order.getTotalprice();		//页面传递的totalprice
		order.setTotalprice(viptotal);
		if(order.getBalancepay()!=null&&order.getBalancepay()>0){	//余额支付
			order.setTotalprice(MathUtils.reduce(order.getTotalprice(),order.getBalancepay()));
		}
		else{
			order.setBalancepay(0.0);
		}
		
		if(order.getTotalprice()!=qdTotal){
			order.setPricemodified("1");
			order.setTotalprice(qdTotal);
			order.setModifyuser(user.getId());
		}
		
		order.setOrdertime(now);
		int thispoint=0;
		if(order.getMemberid()!=null&&order.getMemberid()>0){		//选择了会员修改会员积分
			if(joinpoints){		//是否增加积分
				LevelSettingExample levelSettingExample=new LevelSettingExample();
				levelSettingExample.createCriteria().andGradeEqualTo(member.getMemberlevel());
				List<LevelSetting> levelSettings=levelSettingMapper.selectByExample(levelSettingExample);
				LevelSetting levelSetting=levelSettings.get(0);
				thispoint=new Double(NumberUtil.multiply(MathUtils.add(order.getTotalprice(), order.getBalancepay()), levelSetting.getPointspeed())).intValue();
				
				order.setIntegral(thispoint);
			}
		}
		if(orderMapper.insertSelective(order)<=0){
			return false;
		}
		if(memberCoupons!=null&&memberCoupons.size()>0){
			for(MemberCoupon memberCoupon:memberCoupons){
				memberCoupon.setStatus("1");
				memberCoupon.setUsetime(now);
				memberCoupon.setOrderid(order.getId());
				memberCouponMapper.updateByPrimaryKeySelective(memberCoupon);		//更新优惠券状态，使用日期
			}
		}
		for(OrderDetail od:orderDetails){		//插入商品详情
			od.setOrderid(order.getId());
			od.setAvgprice(Double.valueOf(NumberUtil.toFixed((od.getDiscount()>0?od.getVipprice().doubleValue():od.getPrice().doubleValue()) / viptotal2 * (order.getTotalprice()+order.getBalancepay()), 2)));
			od.setTotalprice(NumberUtil.toFixed(od.getAvgprice()*od.getAmount(),2));
			if(orderDetailMapper.insertSelective(od)<=0){
				return false;
			}
		}
		for(GoodsDetail gd:goodsDetails){		//修改库存
			if(goodsDetailMapper.updateByPrimaryKeySelective(gd)<=0){
				return false;
			}
		}
		for(Goods goods:updateGoodsSoldCnt){		//修改增加商品销量
			goodsMapper.updateByPrimaryKeySelective(goods);
		}
		
		if(order.getMemberid()!=null&&order.getMemberid()>0&&exchange!=null&&exchange>0){
			member.setMemberpoint(member.getMemberpoint()-exchange);		//减少积分
//			memberMapper.updateByPrimaryKeySelective(member);		//减少会员积分
			
			PointLog pointLog=new PointLog();
			pointLog.setChangetime(now);
			pointLog.setMemberid(member.getId());
			pointLog.setOrderid(order.getId());
			pointLog.setPoint(exchange);
			pointLog.setReason("0");
			pointLog.setType("1");
			pointLogMapper.insertSelective(pointLog);		//插入积分变更记录(减少)
		}
		if(order.getMemberid()!=null&&order.getMemberid()>0){		//选择了会员修改会员积分
			if(joinpoints){		//是否增加积分
				member.setMemberpoint(member.getMemberpoint()+thispoint);		//增加用户消费积分
				
				PointLog pointLog=new PointLog();
				pointLog.setChangetime(now);
				pointLog.setMemberid(member.getId());
				pointLog.setOrderid(order.getId());
				pointLog.setPoint(thispoint);
				pointLog.setReason("0");
				pointLog.setType("0");
				pointLogMapper.insertSelective(pointLog);		//插入积分变更记录(增加)
			}
			member.setTotalmoney(MathUtils.round(MathUtils.add(member.getTotalmoney(),order.getTotalprice()), 2));		//增加消费金额
			Date lasttime=member.getLastbuytime();
			if(lasttime==null){
				MemberTypeChange memberTypeChange=new MemberTypeChange();
				memberTypeChange.setMemberid(member.getId());
				memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
				memberTypeChange.setAftertype("N");
				memberTypeChange.setChangetime(now);
				memberTypeChangeMapper.insertSelective(memberTypeChange);
				
				member.setMembertype("N");		//第一次购买为新顾客
				member.setOldornew("1");
				
				if(member.getFromuser()!=null){		//邀请人不为空送券
					Coupon invitedcoupon=couponMapper.selectByPrimaryKey(CommonConstant.INVITED_COUPON_ID);		//被邀请人优惠券
					if("0".equals(invitedcoupon.getStatus())){
						MemberCoupon memberCoupon=new MemberCoupon();
						memberCoupon.setMemberid(member.getId());
						SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
						memberCoupon.setCode("J"+simpleDateFormat.format(new Date()));
						memberCoupon.setCouponid(invitedcoupon.getId());
						memberCoupon.setName(invitedcoupon.getName());
						memberCoupon.setSubtitle(invitedcoupon.getSubtitle());
						memberCoupon.setRemark(invitedcoupon.getRemark());
						memberCoupon.setLogourl(invitedcoupon.getLogourl());
						memberCoupon.setMoney(invitedcoupon.getMoney());
						if("0".equals(invitedcoupon.getTimetype())){		//优惠券有效期为固定日期
							memberCoupon.setStarttime(invitedcoupon.getStarttime());
							memberCoupon.setEndtime(invitedcoupon.getStarttime());
						}
						else{		//优惠券有效期为固定天数
							Calendar end=Calendar.getInstance();
							end.add(Calendar.DAY_OF_MONTH, invitedcoupon.getDays());
							Calendar calendar=Calendar.getInstance();
							calendar.set(Calendar.HOUR_OF_DAY, 0);
							calendar.set(Calendar.MINUTE, 0);
							calendar.set(Calendar.SECOND, 0);
							memberCoupon.setStarttime(calendar.getTime());
							memberCoupon.setEndtime(end.getTime());
						}
						memberCoupon.setStatus("0");
						memberCouponMapper.insertSelective(memberCoupon);		//被邀请人优惠券
					}
					
					Coupon invitercoupon=couponMapper.selectByPrimaryKey(CommonConstant.INVITER_COUPON_ID);		//邀请人优惠券
					if("0".equals(invitercoupon.getStatus())){
						MemberCoupon memberCoupon=new MemberCoupon();
						memberCoupon.setMemberid(member.getFromuser());
						SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmssSSS");
						memberCoupon.setCode("J"+simpleDateFormat.format(new Date()));
						memberCoupon.setCouponid(invitercoupon.getId());
						memberCoupon.setName(invitercoupon.getName());
						memberCoupon.setSubtitle(invitercoupon.getSubtitle());
						memberCoupon.setRemark(invitercoupon.getRemark());
						memberCoupon.setLogourl(invitercoupon.getLogourl());
						memberCoupon.setMoney(invitercoupon.getMoney());
						if("0".equals(invitercoupon.getTimetype())){		//优惠券有效期为固定日期
							memberCoupon.setStarttime(invitercoupon.getStarttime());
							memberCoupon.setEndtime(invitercoupon.getEndtime());
						}
						else{		//优惠券有效期为固定天数
							Calendar end=Calendar.getInstance();
							end.add(Calendar.DAY_OF_MONTH, invitercoupon.getDays());
							Calendar calendar=Calendar.getInstance();
							calendar.set(Calendar.HOUR_OF_DAY, 0);
							calendar.set(Calendar.MINUTE, 0);
							calendar.set(Calendar.SECOND, 0);
							memberCoupon.setStarttime(calendar.getTime());
							memberCoupon.setEndtime(end.getTime());
						}
						memberCoupon.setStatus("0");
						memberCouponMapper.insertSelective(memberCoupon);		//邀请人优惠券
					}
				}
			}
			else{
				member.setOldornew("2");
				SysSettingExample sysSettingExample=new SysSettingExample();
				sysSettingExample.createCriteria().andTypekeyEqualTo(CommonConstant.BUYPERIOD);
				List<SysSetting> sysSettings=settingMapper.selectByExample(sysSettingExample);
				SysSetting setting=sysSettings.get(0);
				int buyperiod=Integer.parseInt(setting.getTypevalue());		//获取购买周期设置的天数
				double days=DateUtil.daysRange(lasttime, now);
				if(days<buyperiod&&!"E".equals(member.getMembertype())){
					MemberTypeChange memberTypeChange=new MemberTypeChange();
					memberTypeChange.setMemberid(member.getId());
					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
					memberTypeChange.setAftertype("E");
					memberTypeChange.setChangetime(now);
					memberTypeChangeMapper.insertSelective(memberTypeChange);
					
					member.setMembertype("E");		//一个购买周期非第一次购买
				}
				if("S1".equals(member.getMembertype())){
					MemberTypeChange memberTypeChange=new MemberTypeChange();
					memberTypeChange.setMemberid(member.getId());
					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
					memberTypeChange.setAftertype("X1");
					memberTypeChange.setChangetime(now);
					memberTypeChangeMapper.insertSelective(memberTypeChange);
					
					member.setMembertype("X1");		//唤醒瞌睡
				}
				if("S2".equals(member.getMembertype())){
					MemberTypeChange memberTypeChange=new MemberTypeChange();
					memberTypeChange.setMemberid(member.getId());
					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
					memberTypeChange.setAftertype("X2");
					memberTypeChange.setChangetime(now);
					memberTypeChangeMapper.insertSelective(memberTypeChange);
					
					member.setMembertype("X2");		//唤醒半睡
				}
				if("S3".equals(member.getMembertype())){
					MemberTypeChange memberTypeChange=new MemberTypeChange();
					memberTypeChange.setMemberid(member.getId());
					memberTypeChange.setBeforetype(member.getMembertype()==null?"":member.getMembertype());
					memberTypeChange.setAftertype("X3");
					memberTypeChange.setChangetime(now);
					memberTypeChangeMapper.insertSelective(memberTypeChange);
					
					member.setMembertype("X3");		//唤醒沉睡
				}
			}
			
			LevelSetting levelSetting=levelSettingQueryMapper.getLevel(MathUtils.round(member.getTotalmoney(), 0));
			if(levelSetting.getGrade()!=member.getMemberlevel()){	//会员等级变动
				member.setMemberlevel(levelSetting.getGrade());		//会员等级
				member.setLevelchangetime(now);		//会员等级变动日期
				
				if(member.getDiscount()==null||member.getDiscount()==0){
					member.setDiscount(levelSetting.getDiscount());
				}
				else{
					member.setDiscount(member.getDiscount()>levelSetting.getDiscount()?levelSetting.getDiscount():member.getDiscount());
				}
			}
			
			if(order.getBalancepay()!=null&&order.getBalancepay()>0){
				BalanceRecord balanceRecord=new BalanceRecord();
				balanceRecord.setMemberid(member.getId());
				balanceRecord.setAmount(order.getBalancepay());
				balanceRecord.setBeforeamount(member.getBalance());
				member.setBalance(NumberUtil.subtract(member.getBalance(), order.getBalancepay()));		//扣除用户余额
				balanceRecord.setAfteramount(member.getBalance());
				balanceRecord.setBusinessid(order.getId());
				balanceRecord.setType("0");
				balanceRecord.setUsetime(new Date());
				balanceRecordMapper.insertSelective(balanceRecord);		//插入余额使用记录
			}
			
			member.setLastbuytime(now);
			memberMapper.updateByPrimaryKeySelective(member);
			
			LabelThread labelThread=new LabelThread(member, orderQueryMapper, memberLabelMapper,levelSettingMapper);
			ExecutorService e = Executors.newFixedThreadPool(1);
			e.execute(labelThread);
		}
		return true;
	}
	
	public JSONObject initPrintPage(Long orderid) throws Exception {
		JSONObject result=new JSONObject();
		result.put("now", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		Order order=orderMapper.selectByPrimaryKey(orderid);
		OrderDetailExample orderDetailExample=new OrderDetailExample();
		orderDetailExample.createCriteria().andOrderidEqualTo(orderid);
		List<OrderDetail> orderDetails=orderDetailMapper.selectByExample(orderDetailExample);
		JSONArray jsonArray=new JSONArray();
		double viptotal=0;
		for(OrderDetail orderDetail:orderDetails){		//遍历商品详情json
			GoodsDetailQuery goodsDetail=goodsDetailQueryMapper.selectGoodsDetailQueryById(orderDetail.getGoodsdetailid());
			goodsDetail.setPrice(orderDetail.getDiscount()>0?goodsDetail.getVipprice():goodsDetail.getPrice());
			JSONObject goods=JSONObject.fromObject(goodsDetail);
			goods.put("num", orderDetail.getAmount());
			goods.put("price", orderDetail.getDiscount()>0?orderDetail.getVipprice():orderDetail.getPrice());
			goods.put("totalprice", NumberUtil.toFixed(NumberUtil.multiply((orderDetail.getDiscount()>0?orderDetail.getVipprice():orderDetail.getPrice()), orderDetail.getAmount()), 2));
			jsonArray.add(goods);
			if(orderDetail.getDiscount()>0){		//折扣中的以折扣价计算
				viptotal=NumberUtil.add(viptotal, NumberUtil.multiply(orderDetail.getVipprice(), orderDetail.getAmount()));
			}else{
				viptotal=NumberUtil.add(viptotal, NumberUtil.multiply(orderDetail.getPrice(), orderDetail.getAmount()));
			}
		}
		result.put("oldprice", viptotal);
		result.put("priceRMB", NumberToCN.number2CNMontrayUnit(new BigDecimal(viptotal)));
		result.put("goods", jsonArray);
		result.put("exchangeprice", order.getIntegralprice()==null?0:order.getIntegralprice());
		result.put("balancepay", order.getBalancepay());
		result.put("couponspay", order.getCouponspay());
		result.put("subtractmoney", order.getSubtractmoney());
		result.put("discount", order.getDiscount());
		result.put("totalprice", NumberUtil.toFixed(order.getTotalprice()+order.getBalancepay(), 2));
		return result;
	}

	/**
	 * 满减计算
	 * @param money
	 * @param fullRules
	 * @return
	 */
	public int calcFullReduce(Double money,List<FullRule> fullRules){
		for(int i=fullRules.size()-1;i>=0;i--){
			if(money>fullRules.get(i).getAmount()){
				return fullRules.get(i).getSubtractamount();
			}
		}
		return 0;
	}

}
