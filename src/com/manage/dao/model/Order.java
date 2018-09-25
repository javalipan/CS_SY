package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[50] 订单编号*/
    private String code;

    /**[1] 订单类型,0：微信线上订单、1：线下订单*/
    private String type;

    /**[19] 下单人*/
    private Long memberid;

    /**[36] 金额修改人*/
    private String modifyuser;

    /**[1] 是否手动修改金额,0：否，1：是*/
    private String pricemodified;

    /**[22] 优惠前金额*/
    private Double oldprice;

    /**[22] 享受折扣*/
    private Double discount;

    /**[22] 积分抵换金额*/
    private Double integralprice;

    /**[22] 订单实付金额*/
    private Double totalprice;

    /**[1] 是否支付,0:未支付，1：已支付*/
    private String ispay;

    /**[1] 是否发货,0：未发货，1：已发货*/
    private String issend;

    /**[1] 是否收货，0：未收货，1：已收货*/
    private String isreceive;

    /**[500] 订单备注*/
    private String remark;

    /**[1] 配送方式,0:商家配送，1：到点自提*/
    private String delway;

    /**[19] 提货时间*/
    private Date gettime;

    /**[50] 收货人姓名*/
    private String reveivename;

    /**[20] 收货人电话*/
    private String phone;

    /**[500] 收货人地址*/
    private String address;

    /**[19] 下单时间*/
    private Date ordertime;

    /**[1] 支付方式,0：微信支付、1：现金支付、2：支付宝、3：银行卡*/
    private String payway;

    /**[19] 支付时间*/
    private Date paytime;

    /**[19] 发货时间*/
    private Date sendtime;

    /**[19] 收货时间*/
    private Date receivetime;

    /**[1] 0：正常,1：作废*/
    private String status;

    /**[10 NOTNULL] 获得积分*/
    private Integer integral;

    /**[22 NOTNULL] 余额支付*/
    private Double balancepay;

    /**[1000] 用户使用优惠券编号列表，逗号隔开*/
    private String usercoupons;

    /**[10 NOTNULL] 优惠券支付*/
    private Integer couponspay;

    /**[10 NOTNULL] 满减金额*/
    private Integer subtractmoney;

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
     * @return  String  订单编号
     */
    public String getCode() {
        return code;
    }

    /**
     * @param  String[50] 订单编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return  String  订单类型,0：微信线上订单、1：线下订单
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1] 订单类型,0：微信线上订单、1：线下订单
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  Long  下单人
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * @param  Long[19] 下单人
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * @return  String  金额修改人
     */
    public String getModifyuser() {
        return modifyuser;
    }

    /**
     * @param  String[36] 金额修改人
     */
    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser == null ? null : modifyuser.trim();
    }

    /**
     * @return  String  是否手动修改金额,0：否，1：是
     */
    public String getPricemodified() {
        return pricemodified;
    }

    /**
     * @param  String[1] 是否手动修改金额,0：否，1：是
     */
    public void setPricemodified(String pricemodified) {
        this.pricemodified = pricemodified == null ? null : pricemodified.trim();
    }

    /**
     * @return  Double  优惠前金额
     */
    public Double getOldprice() {
        return oldprice;
    }

    /**
     * @param  Double[22] 优惠前金额
     */
    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    /**
     * @return  Double  享受折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param  Double[22] 享受折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return  Double  积分抵换金额
     */
    public Double getIntegralprice() {
        return integralprice;
    }

    /**
     * @param  Double[22] 积分抵换金额
     */
    public void setIntegralprice(Double integralprice) {
        this.integralprice = integralprice;
    }

    /**
     * @return  Double  订单实付金额
     */
    public Double getTotalprice() {
        return totalprice;
    }

    /**
     * @param  Double[22] 订单实付金额
     */
    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return  String  是否支付,0:未支付，1：已支付
     */
    public String getIspay() {
        return ispay;
    }

    /**
     * @param  String[1] 是否支付,0:未支付，1：已支付
     */
    public void setIspay(String ispay) {
        this.ispay = ispay == null ? null : ispay.trim();
    }

    /**
     * @return  String  是否发货,0：未发货，1：已发货
     */
    public String getIssend() {
        return issend;
    }

    /**
     * @param  String[1] 是否发货,0：未发货，1：已发货
     */
    public void setIssend(String issend) {
        this.issend = issend == null ? null : issend.trim();
    }

    /**
     * @return  String  是否收货，0：未收货，1：已收货
     */
    public String getIsreceive() {
        return isreceive;
    }

    /**
     * @param  String[1] 是否收货，0：未收货，1：已收货
     */
    public void setIsreceive(String isreceive) {
        this.isreceive = isreceive == null ? null : isreceive.trim();
    }

    /**
     * @return  String  订单备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param  String[500] 订单备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return  String  配送方式,0:商家配送，1：到点自提
     */
    public String getDelway() {
        return delway;
    }

    /**
     * @param  String[1] 配送方式,0:商家配送，1：到点自提
     */
    public void setDelway(String delway) {
        this.delway = delway == null ? null : delway.trim();
    }

    /**
     * @return  Date  提货时间
     */
    public Date getGettime() {
        return gettime;
    }

    /**
     * @param  Date[19] 提货时间
     */
    public void setGettime(Date gettime) {
        this.gettime = gettime;
    }

    /**
     * @return  String  收货人姓名
     */
    public String getReveivename() {
        return reveivename;
    }

    /**
     * @param  String[50] 收货人姓名
     */
    public void setReveivename(String reveivename) {
        this.reveivename = reveivename == null ? null : reveivename.trim();
    }

    /**
     * @return  String  收货人电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param  String[20] 收货人电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return  String  收货人地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param  String[500] 收货人地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return  Date  下单时间
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * @param  Date[19] 下单时间
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * @return  String  支付方式,0：微信支付、1：现金支付、2：支付宝、3：银行卡
     */
    public String getPayway() {
        return payway;
    }

    /**
     * @param  String[1] 支付方式,0：微信支付、1：现金支付、2：支付宝、3：银行卡
     */
    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    /**
     * @return  Date  支付时间
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * @param  Date[19] 支付时间
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * @return  Date  发货时间
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * @param  Date[19] 发货时间
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * @return  Date  收货时间
     */
    public Date getReceivetime() {
        return receivetime;
    }

    /**
     * @param  Date[19] 收货时间
     */
    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    /**
     * @return  String  0：正常,1：作废
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1] 0：正常,1：作废
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  Integer  获得积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * @param  Integer[10 NOTNULL] 获得积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * @return  Double  余额支付
     */
    public Double getBalancepay() {
        return balancepay;
    }

    /**
     * @param  Double[22 NOTNULL] 余额支付
     */
    public void setBalancepay(Double balancepay) {
        this.balancepay = balancepay;
    }

    /**
     * @return  String  用户使用优惠券编号列表，逗号隔开
     */
    public String getUsercoupons() {
        return usercoupons;
    }

    /**
     * @param  String[1000] 用户使用优惠券编号列表，逗号隔开
     */
    public void setUsercoupons(String usercoupons) {
        this.usercoupons = usercoupons == null ? null : usercoupons.trim();
    }

    /**
     * @return  Integer  优惠券支付
     */
    public Integer getCouponspay() {
        return couponspay;
    }

    /**
     * @param  Integer[10 NOTNULL] 优惠券支付
     */
    public void setCouponspay(Integer couponspay) {
        this.couponspay = couponspay;
    }

    /**
     * @return  Integer  满减金额
     */
    public Integer getSubtractmoney() {
        return subtractmoney;
    }

    /**
     * @param  Integer[10 NOTNULL] 满减金额
     */
    public void setSubtractmoney(Integer subtractmoney) {
        this.subtractmoney = subtractmoney;
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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getModifyuser() == null ? other.getModifyuser() == null : this.getModifyuser().equals(other.getModifyuser()))
            && (this.getPricemodified() == null ? other.getPricemodified() == null : this.getPricemodified().equals(other.getPricemodified()))
            && (this.getOldprice() == null ? other.getOldprice() == null : this.getOldprice().equals(other.getOldprice()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getIntegralprice() == null ? other.getIntegralprice() == null : this.getIntegralprice().equals(other.getIntegralprice()))
            && (this.getTotalprice() == null ? other.getTotalprice() == null : this.getTotalprice().equals(other.getTotalprice()))
            && (this.getIspay() == null ? other.getIspay() == null : this.getIspay().equals(other.getIspay()))
            && (this.getIssend() == null ? other.getIssend() == null : this.getIssend().equals(other.getIssend()))
            && (this.getIsreceive() == null ? other.getIsreceive() == null : this.getIsreceive().equals(other.getIsreceive()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDelway() == null ? other.getDelway() == null : this.getDelway().equals(other.getDelway()))
            && (this.getGettime() == null ? other.getGettime() == null : this.getGettime().equals(other.getGettime()))
            && (this.getReveivename() == null ? other.getReveivename() == null : this.getReveivename().equals(other.getReveivename()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getPayway() == null ? other.getPayway() == null : this.getPayway().equals(other.getPayway()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getSendtime() == null ? other.getSendtime() == null : this.getSendtime().equals(other.getSendtime()))
            && (this.getReceivetime() == null ? other.getReceivetime() == null : this.getReceivetime().equals(other.getReceivetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getBalancepay() == null ? other.getBalancepay() == null : this.getBalancepay().equals(other.getBalancepay()))
            && (this.getUsercoupons() == null ? other.getUsercoupons() == null : this.getUsercoupons().equals(other.getUsercoupons()))
            && (this.getCouponspay() == null ? other.getCouponspay() == null : this.getCouponspay().equals(other.getCouponspay()))
            && (this.getSubtractmoney() == null ? other.getSubtractmoney() == null : this.getSubtractmoney().equals(other.getSubtractmoney()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getModifyuser() == null) ? 0 : getModifyuser().hashCode());
        result = prime * result + ((getPricemodified() == null) ? 0 : getPricemodified().hashCode());
        result = prime * result + ((getOldprice() == null) ? 0 : getOldprice().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getIntegralprice() == null) ? 0 : getIntegralprice().hashCode());
        result = prime * result + ((getTotalprice() == null) ? 0 : getTotalprice().hashCode());
        result = prime * result + ((getIspay() == null) ? 0 : getIspay().hashCode());
        result = prime * result + ((getIssend() == null) ? 0 : getIssend().hashCode());
        result = prime * result + ((getIsreceive() == null) ? 0 : getIsreceive().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDelway() == null) ? 0 : getDelway().hashCode());
        result = prime * result + ((getGettime() == null) ? 0 : getGettime().hashCode());
        result = prime * result + ((getReveivename() == null) ? 0 : getReveivename().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getPayway() == null) ? 0 : getPayway().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getSendtime() == null) ? 0 : getSendtime().hashCode());
        result = prime * result + ((getReceivetime() == null) ? 0 : getReceivetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getBalancepay() == null) ? 0 : getBalancepay().hashCode());
        result = prime * result + ((getUsercoupons() == null) ? 0 : getUsercoupons().hashCode());
        result = prime * result + ((getCouponspay() == null) ? 0 : getCouponspay().hashCode());
        result = prime * result + ((getSubtractmoney() == null) ? 0 : getSubtractmoney().hashCode());
        return result;
    }
}