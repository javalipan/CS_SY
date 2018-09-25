package com.manage.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.mapper.MemberMapper;
import com.manage.dao.mapper.RechargeMapper;
import com.manage.dao.mapper.RechargeRuleMapper;
import com.manage.dao.model.LevelSetting;
import com.manage.dao.model.Member;
import com.manage.dao.model.Recharge;
import com.manage.dao.model.RechargeExample;
import com.manage.dao.model.RechargeRule;
import com.manage.query.mapper.LevelSettingQueryMapper;
import com.manage.service.IRechargeService;
import com.manage.util.MathUtils;
import com.manage.util.NumberUtil;

@Service
public class RechargeService implements IRechargeService{

	@Autowired
	private RechargeMapper rechargeMapper;
	@Autowired
	private MemberMapper memberMapper;
	@Autowired
	private RechargeRuleMapper rechargeRuleMapper;
	@Autowired
	private LevelSettingQueryMapper levelSettingQueryMapper;
	
	public int countByExample(RechargeExample example) {
		return rechargeMapper.countByExample(example);
	}

	public int deleteByExample(RechargeExample example) {
		return rechargeMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return rechargeMapper.deleteByPrimaryKey(id);
	}

	public int insertSelective(Recharge record) {
		return rechargeMapper.insertSelective(record);
	}

	public List<Recharge> selectByExample(RechargeExample example) {
		return rechargeMapper.selectByExample(example);
	}

	public Recharge selectByPrimaryKey(Long id) {
		return rechargeMapper.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(Recharge record, RechargeExample example) {
		return rechargeMapper.updateByExampleSelective(record, example);
	}

	public int updateByPrimaryKeySelective(Recharge record) {
		return rechargeMapper.updateByPrimaryKeySelective(record);
	}

	public Member recharge(Long memberid, Long ruleid, Integer amount,
			Integer giveamount, Double discount) {
		Member member=memberMapper.selectByPrimaryKey(memberid);
		if(ruleid!=null&&ruleid>0){		//根据规则充值
			RechargeRule rechargeRule=rechargeRuleMapper.selectByPrimaryKey(ruleid);
			amount=rechargeRule.getAmount();
			giveamount=rechargeRule.getGiveamount();
			discount=rechargeRule.getDiscount();
		}
		else{
			if(amount==null||amount==0||giveamount==null||discount==null){
				return null;
			}
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Recharge recharge=new Recharge();
		recharge.setMemberid(memberid);
		recharge.setAmount(amount);
		recharge.setGiveamount(giveamount);
		recharge.setRealamount(amount+giveamount);
		recharge.setDiscount(discount);
		recharge.setStatus("1");
		recharge.setPayway("3");
		recharge.setOrderno("C"+sdf.format(new Date()));
		recharge.setDealtime(new Date());
		recharge.setCreatetime(new Date());
		rechargeMapper.insertSelective(recharge);		//插入充值记录
		
		member.setBalance(MathUtils.round(MathUtils.add(member.getBalance(), recharge.getRealamount()), 2));
		if(member.getDiscount()==null||discount<member.getDiscount()||member.getDiscount()==0){
			member.setDiscount(discount);
		}
		member.setTotalmoney(NumberUtil.toFixed(NumberUtil.add(member.getTotalmoney(),recharge.getAmount()), 2));		//累计消费
		LevelSetting levelSetting=levelSettingQueryMapper.getLevel(MathUtils.round(member.getTotalmoney(), 0));
		if(levelSetting.getGrade()!=member.getMemberlevel()){	//会员等级变动
			member.setMemberlevel(levelSetting.getGrade());		//会员等级
			member.setLevelchangetime(new Date());		//会员等级变动日期
			
			if(member.getDiscount()==null||member.getDiscount()==0){
				member.setDiscount(levelSetting.getDiscount());
			}
			else{
				member.setDiscount(member.getDiscount()>levelSetting.getDiscount()?levelSetting.getDiscount():member.getDiscount());
			}
		}
		
		memberMapper.updateByPrimaryKeySelective(member);		//更新用户余额
		return member;
	}

}
