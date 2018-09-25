package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Coupon implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[1 NOTNULL] 类型,0:用户兑换，1:现金购买，2:系统发放*/
    private String type;

    /**[100 NOTNULL] 优惠券名称*/
    private String name;

    /**[200] 副标题*/
    private String subtitle;

    /**[500] 描述*/
    private String remark;

    /**[100] 优惠券图标*/
    private String logourl;

    /**[10 NOTNULL] 数量*/
    private Integer amount;

    /**[10 NOTNULL] 剩余数量*/
    private Integer leftamount;

    /**[10 NOTNULL] 面值*/
    private Integer money;

    /**[22] 价格*/
    private Double price;

    /**[10] 兑换所需积分*/
    private Integer integral;

    /**[1] 有效期类型，0：固定日期，1：天数*/
    private String timetype;

    /**[10] 有效期天数*/
    private Integer days;

    /**[19] 有效期起*/
    private Date starttime;

    /**[19] 有效期止*/
    private Date endtime;

    /**[10 NOTNULL] 兑换上限*/
    private Integer maxget;

    /**[10 NOTNULL] 兑换会员级别起点*/
    private Integer getgrade;

    /**[1 NOTNULL] 状态,0:正常、1：禁用*/
    private String status;

    /**[19 NOTNULL] 创建时间*/
    private Date createtime;

    /**[36 NOTNULL] 创建人*/
    private String createuser;

    private static final long serialVersionUID = 1L;

    /**
     * @return  Long  id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param  Long[19 NOTNULL] id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return  String  类型,0:用户兑换，1:现金购买，2:系统发放
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1 NOTNULL] 类型,0:用户兑换，1:现金购买，2:系统发放
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  String  优惠券名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[100 NOTNULL] 优惠券名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  副标题
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param  String[200] 副标题
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * @return  String  描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param  String[500] 描述
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return  String  优惠券图标
     */
    public String getLogourl() {
        return logourl;
    }

    /**
     * @param  String[100] 优惠券图标
     */
    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    /**
     * @return  Integer  数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param  Integer[10 NOTNULL] 数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return  Integer  剩余数量
     */
    public Integer getLeftamount() {
        return leftamount;
    }

    /**
     * @param  Integer[10 NOTNULL] 剩余数量
     */
    public void setLeftamount(Integer leftamount) {
        this.leftamount = leftamount;
    }

    /**
     * @return  Integer  面值
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * @param  Integer[10 NOTNULL] 面值
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * @return  Double  价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param  Double[22] 价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return  Integer  兑换所需积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * @param  Integer[10] 兑换所需积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * @return  String  有效期类型，0：固定日期，1：天数
     */
    public String getTimetype() {
        return timetype;
    }

    /**
     * @param  String[1] 有效期类型，0：固定日期，1：天数
     */
    public void setTimetype(String timetype) {
        this.timetype = timetype == null ? null : timetype.trim();
    }

    /**
     * @return  Integer  有效期天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * @param  Integer[10] 有效期天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * @return  Date  有效期起
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param  Date[19] 有效期起
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return  Date  有效期止
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param  Date[19] 有效期止
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return  Integer  兑换上限
     */
    public Integer getMaxget() {
        return maxget;
    }

    /**
     * @param  Integer[10 NOTNULL] 兑换上限
     */
    public void setMaxget(Integer maxget) {
        this.maxget = maxget;
    }

    /**
     * @return  Integer  兑换会员级别起点
     */
    public Integer getGetgrade() {
        return getgrade;
    }

    /**
     * @param  Integer[10 NOTNULL] 兑换会员级别起点
     */
    public void setGetgrade(Integer getgrade) {
        this.getgrade = getgrade;
    }

    /**
     * @return  String  状态,0:正常、1：禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1 NOTNULL] 状态,0:正常、1：禁用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  Date  创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[19 NOTNULL] 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return  String  创建人
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * @param  String[36 NOTNULL] 创建人
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Coupon other = (Coupon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLogourl() == null ? other.getLogourl() == null : this.getLogourl().equals(other.getLogourl()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getLeftamount() == null ? other.getLeftamount() == null : this.getLeftamount().equals(other.getLeftamount()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getTimetype() == null ? other.getTimetype() == null : this.getTimetype().equals(other.getTimetype()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getMaxget() == null ? other.getMaxget() == null : this.getMaxget().equals(other.getMaxget()))
            && (this.getGetgrade() == null ? other.getGetgrade() == null : this.getGetgrade().equals(other.getGetgrade()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateuser() == null ? other.getCreateuser() == null : this.getCreateuser().equals(other.getCreateuser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLogourl() == null) ? 0 : getLogourl().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getLeftamount() == null) ? 0 : getLeftamount().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getTimetype() == null) ? 0 : getTimetype().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getMaxget() == null) ? 0 : getMaxget().hashCode());
        result = prime * result + ((getGetgrade() == null) ? 0 : getGetgrade().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateuser() == null) ? 0 : getCreateuser().hashCode());
        return result;
    }
}