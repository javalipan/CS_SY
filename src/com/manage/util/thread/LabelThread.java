package com.manage.util.thread;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.manage.constant.LabelTypeEnum;
import com.manage.dao.mapper.LevelSettingMapper;
import com.manage.dao.mapper.MemberLabelMapper;
import com.manage.dao.model.LevelSetting;
import com.manage.dao.model.LevelSettingExample;
import com.manage.dao.model.Member;
import com.manage.dao.model.MemberLabel;
import com.manage.dao.model.MemberLabelExample;
import com.manage.query.mapper.OrderQueryMapper;
import com.manage.query.model.OrderQuery;
import com.manage.util.DateUtil;

/**
 * 标签计算
 * @author Administrator
 *
 */
public class LabelThread implements Runnable{
	
	private	Member member;
	private OrderQueryMapper orderQueryMapper;
	private MemberLabelMapper memberLabelMapper;
	private LevelSettingMapper levelSettingMapper;
	
	public LabelThread(Member member,OrderQueryMapper orderQueryMapper,MemberLabelMapper memberLabelMapper,LevelSettingMapper levelSettingMapper){
		this.member=member;
		this.orderQueryMapper=orderQueryMapper;
		this.memberLabelMapper=memberLabelMapper;
		this.levelSettingMapper=levelSettingMapper;
	}

	public void run() {
		MemberLabel levelLabel=new MemberLabel();		//会员级别
		levelLabel.setIssystem("1");
		levelLabel.setTypecode(LabelTypeEnum.LABELTYPE_LEVEL.getCode());
		levelLabel.setTypename(LabelTypeEnum.LABELTYPE_LEVEL.getName());
		levelLabel.setMemberid(member.getId());
		LevelSettingExample levelSettingExample=new LevelSettingExample();
		levelSettingExample.createCriteria().andGradeEqualTo(member.getMemberlevel());
		List<LevelSetting> levelSettings=levelSettingMapper.selectByExample(levelSettingExample);
		if(levelSettings.size()>0){
			levelLabel.setLabelname(levelSettings.get(0).getGradename()+"会员");
		}
		
		MemberLabel moneyLabel=new MemberLabel();		//购物金额
		moneyLabel.setIssystem("1");
		moneyLabel.setTypecode(LabelTypeEnum.LABELTYPE_MONEY.getCode());
		moneyLabel.setTypename(LabelTypeEnum.LABELTYPE_MONEY.getName());
		moneyLabel.setMemberid(member.getId());
		if(member.getTotalmoney()<2000){
			moneyLabel.setLabelname("低消费买家");
		}
		else if(member.getTotalmoney()>=2000&&member.getTotalmoney()<=5000){
			moneyLabel.setLabelname("中消费买家");
		}
		else{
			moneyLabel.setLabelname("高消费买家");
		}
		
		OrderQuery orderQuery=orderQueryMapper.getOrderCnt(member.getId());
		MemberLabel repeatLabel=new MemberLabel();		//回头客
		repeatLabel.setIssystem("1");
		repeatLabel.setTypecode(LabelTypeEnum.LABELTYPE_REPEAT.getCode());
		repeatLabel.setTypename(LabelTypeEnum.LABELTYPE_REPEAT.getName());
		repeatLabel.setMemberid(member.getId());
		if(orderQuery.getCnt()<3){
			repeatLabel.setLabelname("低回头顾客");
		}
		else if(orderQuery.getCnt()>=3&&orderQuery.getCnt()<=5){
			repeatLabel.setLabelname("中回头顾客");
		}
		else if(orderQuery.getCnt()>=6&&orderQuery.getCnt()<=10){
			repeatLabel.setLabelname("高回头顾客");
		}
		else{
			repeatLabel.setLabelname("超高回头顾客");
		}
		
		MemberLabel recentLabel=new MemberLabel();		//近期购物情境
		recentLabel.setIssystem("1");
		recentLabel.setTypecode(LabelTypeEnum.LABELTYPE_RECENT.getCode());
		recentLabel.setTypename(LabelTypeEnum.LABELTYPE_RECENT.getName());
		recentLabel.setMemberid(member.getId());
		double days=DateUtil.daysRange(member.getLastbuytime(), new Date());
		if(days<30){
			recentLabel.setLabelname("最近买家");
		}
		else if(days>30&&days<=90){
			recentLabel.setLabelname("中期未购物买家");
		}
		else{
			recentLabel.setLabelname("长期未购物买家");
		}
		
		OrderQuery brandLabelQuery=orderQueryMapper.getBrandLabel(member.getId());
		MemberLabel brandLabel=new MemberLabel();		//品牌
		brandLabel.setIssystem("1");
		brandLabel.setTypecode(LabelTypeEnum.LABELTYPE_BRAND.getCode());
		brandLabel.setTypename(LabelTypeEnum.LABELTYPE_BRAND.getName());
		brandLabel.setMemberid(member.getId());
		brandLabel.setLabelname(brandLabelQuery.getLabelName());
		
		OrderQuery sizeLabelQuery=orderQueryMapper.getSizeLabel(member.getId());
		MemberLabel sizeLabel=new MemberLabel();		//身形
		sizeLabel.setIssystem("1");
		sizeLabel.setTypecode(LabelTypeEnum.LABELTYPE_SIZE.getCode());
		sizeLabel.setTypename(LabelTypeEnum.LABELTYPE_SIZE.getName());
		sizeLabel.setMemberid(member.getId());
		sizeLabel.setLabelname(sizeLabelQuery.getLabelName());
		
		OrderQuery styleLabelQuery=orderQueryMapper.getStyleLabel(member.getId());
		MemberLabel styleLabel=new MemberLabel();		//风格
		styleLabel.setIssystem("1");
		styleLabel.setTypecode(LabelTypeEnum.LABELTYPE_STYLE.getCode());
		styleLabel.setTypename(LabelTypeEnum.LABELTYPE_STYLE.getName());
		styleLabel.setMemberid(member.getId());
		String ln=styleLabelQuery.getLabelName();
		styleLabel.setLabelname(StringUtils.isBlank(ln)?"":ln);
		
		MemberLabel timeLabel=new MemberLabel();		//入店资历
		timeLabel.setIssystem("1");
		timeLabel.setTypecode(LabelTypeEnum.LABELTYPE_TIME.getCode());
		timeLabel.setTypename(LabelTypeEnum.LABELTYPE_TIME.getName());
		timeLabel.setMemberid(member.getId());
		timeLabel.setLabelname(DateUtil.getInTimeLabel(member.getRegistertime()));
		
		MemberLabelExample levelLabelExample=new MemberLabelExample();
		levelLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_LEVEL.getCode());
		if(memberLabelMapper.countByExample(levelLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(levelLabel, levelLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(levelLabel);
		}
		
		MemberLabelExample moneyLabelExample=new MemberLabelExample();
		moneyLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_MONEY.getCode());
		if(memberLabelMapper.countByExample(moneyLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(moneyLabel, moneyLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(moneyLabel);
		}
		
		MemberLabelExample recentLabelExample=new MemberLabelExample();
		recentLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_RECENT.getCode());
		if(memberLabelMapper.countByExample(recentLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(recentLabel, recentLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(recentLabel);
		}
		
		MemberLabelExample repeatLabelExample=new MemberLabelExample();
		repeatLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_REPEAT.getCode());
		if(memberLabelMapper.countByExample(repeatLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(repeatLabel, repeatLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(repeatLabel);
		}
		
		MemberLabelExample brandLabelExample=new MemberLabelExample();
		brandLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_BRAND.getCode());
		if(memberLabelMapper.countByExample(brandLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(brandLabel, brandLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(brandLabel);
		}
		
		MemberLabelExample sizeLabelExample=new MemberLabelExample();
		sizeLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_SIZE.getCode());
		if(memberLabelMapper.countByExample(sizeLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(sizeLabel, sizeLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(sizeLabel);
		}
		
		MemberLabelExample styleLabelExample=new MemberLabelExample();
		styleLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_STYLE.getCode());
		if(memberLabelMapper.countByExample(styleLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(styleLabel, styleLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(styleLabel);
		}
		
		MemberLabelExample timeLabelExample=new MemberLabelExample();
		timeLabelExample.createCriteria().andMemberidEqualTo(member.getId()).andTypecodeEqualTo(LabelTypeEnum.LABELTYPE_TIME.getCode());
		if(memberLabelMapper.countByExample(timeLabelExample)>0){
			memberLabelMapper.updateByExampleSelective(timeLabel, timeLabelExample);
		}
		else{
			memberLabelMapper.insertSelective(timeLabel);
		}
	}
}
