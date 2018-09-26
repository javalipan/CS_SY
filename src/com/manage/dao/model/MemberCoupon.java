package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class MemberCoupon implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] 会员id*/
    private Long memberid;

    /**[100 NOTNULL] 优惠券名称*/
    private String name;

    /**[200 NOTNULL] 副标题*/
    private String subtitle;

    /**[500 NOTNULL] 描述*/
    private String remark;

    /**[100 NOTNULL] 优惠券图标*/
    private String logourl;

    /**[100 NOTNULL] 优惠券编号*/
    private String code;

    /**[19 NOTNULL] 优惠券id*/
    private Long couponid;

    /**[10 NOTNULL] 面值*/
    private Integer money;

    /**[19 NOTNULL] 有效期起*/
    private Date starttime;

    /**[19 NOTNULL] 有效期止*/
    private Date endtime;

    /**[1 NOTNULL] 状态,0:未使用，1：已使用*/
    private String status;

    /**[19] 使用时间*/
    private Date usetime;

    /**[19] 使用订单*/
    private Long orderid;

    /**[10 NOTNULL] 金额制限*/
    private Integer limitmoney;

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
     * @return  Long  会员id
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * @param  Long[19 NOTNULL] 会员id
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
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
     * @param  String[200 NOTNULL] 副标题
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
     * @param  String[500 NOTNULL] 描述
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
     * @param  String[100 NOTNULL] 优惠券图标
     */
    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    /**
     * @return  String  优惠券编号
     */
    public String getCode() {
        return code;
    }

    /**
     * @param  String[100 NOTNULL] 优惠券编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return  Long  优惠券id
     */
    public Long getCouponid() {
        return couponid;
    }

    /**
     * @param  Long[19 NOTNULL] 优惠券id
     */
    public void setCouponid(Long couponid) {
        this.couponid = couponid;
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
     * @return  Date  有效期起
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param  Date[19 NOTNULL] 有效期起
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
     * @param  Date[19 NOTNULL] 有效期止
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return  String  状态,0:未使用，1：已使用
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1 NOTNULL] 状态,0:未使用，1：已使用
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  Date  使用时间
     */
    public Date getUsetime() {
        return usetime;
    }

    /**
     * @param  Date[19] 使用时间
     */
    public void setUsetime(Date usetime) {
        this.usetime = usetime;
    }

    /**
     * @return  Long  使用订单
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * @param  Long[19] 使用订单
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * @return  Integer  金额制限
     */
    public Integer getLimitmoney() {
        return limitmoney;
    }

    /**
     * @param  Integer[10 NOTNULL] 金额制限
     */
    public void setLimitmoney(Integer limitmoney) {
        this.limitmoney = limitmoney;
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
        MemberCoupon other = (MemberCoupon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSubtitle() == null ? other.getSubtitle() == null : this.getSubtitle().equals(other.getSubtitle()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLogourl() == null ? other.getLogourl() == null : this.getLogourl().equals(other.getLogourl()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCouponid() == null ? other.getCouponid() == null : this.getCouponid().equals(other.getCouponid()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUsetime() == null ? other.getUsetime() == null : this.getUsetime().equals(other.getUsetime()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getLimitmoney() == null ? other.getLimitmoney() == null : this.getLimitmoney().equals(other.getLimitmoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLogourl() == null) ? 0 : getLogourl().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCouponid() == null) ? 0 : getCouponid().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUsetime() == null) ? 0 : getUsetime().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getLimitmoney() == null) ? 0 : getLimitmoney().hashCode());
        return result;
    }
}