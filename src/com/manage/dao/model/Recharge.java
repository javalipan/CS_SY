package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Recharge implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] 会员id*/
    private Long memberid;

    /**[10 NOTNULL] 金额*/
    private Integer amount;

    /**[10 NOTNULL] 赠送金额*/
    private Integer giveamount;

    /**[10 NOTNULL] 实际到账金额*/
    private Integer realamount;

    /**[22 NOTNULL] 充值享受折扣*/
    private Double discount;

    /**[1 NOTNULL] 状态,0:充值中，1：充值成功，2：充值失败*/
    private String status;

    /**[1 NOTNULL] 付款方式,0:银行卡、1：微信、2：支付宝、3：后台充值*/
    private String payway;

    /**[50 NOTNULL] 充值订单号,系统生成充值订单号*/
    private String orderno;

    /**[100] 交易单号，支付平台返回交易单号*/
    private String transactno;

    /**[19] 交易时间，支付回调时更新*/
    private Date dealtime;

    /**[19] 操作时间*/
    private Date createtime;

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
     * @return  Integer  金额
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param  Integer[10 NOTNULL] 金额
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return  Integer  赠送金额
     */
    public Integer getGiveamount() {
        return giveamount;
    }

    /**
     * @param  Integer[10 NOTNULL] 赠送金额
     */
    public void setGiveamount(Integer giveamount) {
        this.giveamount = giveamount;
    }

    /**
     * @return  Integer  实际到账金额
     */
    public Integer getRealamount() {
        return realamount;
    }

    /**
     * @param  Integer[10 NOTNULL] 实际到账金额
     */
    public void setRealamount(Integer realamount) {
        this.realamount = realamount;
    }

    /**
     * @return  Double  充值享受折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param  Double[22 NOTNULL] 充值享受折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return  String  状态,0:充值中，1：充值成功，2：充值失败
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1 NOTNULL] 状态,0:充值中，1：充值成功，2：充值失败
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  String  付款方式,0:银行卡、1：微信、2：支付宝、3：后台充值
     */
    public String getPayway() {
        return payway;
    }

    /**
     * @param  String[1 NOTNULL] 付款方式,0:银行卡、1：微信、2：支付宝、3：后台充值
     */
    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    /**
     * @return  String  充值订单号,系统生成充值订单号
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * @param  String[50 NOTNULL] 充值订单号,系统生成充值订单号
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    /**
     * @return  String  交易单号，支付平台返回交易单号
     */
    public String getTransactno() {
        return transactno;
    }

    /**
     * @param  String[100] 交易单号，支付平台返回交易单号
     */
    public void setTransactno(String transactno) {
        this.transactno = transactno == null ? null : transactno.trim();
    }

    /**
     * @return  Date  交易时间，支付回调时更新
     */
    public Date getDealtime() {
        return dealtime;
    }

    /**
     * @param  Date[19] 交易时间，支付回调时更新
     */
    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }

    /**
     * @return  Date  操作时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[19] 操作时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        Recharge other = (Recharge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getGiveamount() == null ? other.getGiveamount() == null : this.getGiveamount().equals(other.getGiveamount()))
            && (this.getRealamount() == null ? other.getRealamount() == null : this.getRealamount().equals(other.getRealamount()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPayway() == null ? other.getPayway() == null : this.getPayway().equals(other.getPayway()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getTransactno() == null ? other.getTransactno() == null : this.getTransactno().equals(other.getTransactno()))
            && (this.getDealtime() == null ? other.getDealtime() == null : this.getDealtime().equals(other.getDealtime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getGiveamount() == null) ? 0 : getGiveamount().hashCode());
        result = prime * result + ((getRealamount() == null) ? 0 : getRealamount().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPayway() == null) ? 0 : getPayway().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getTransactno() == null) ? 0 : getTransactno().hashCode());
        result = prime * result + ((getDealtime() == null) ? 0 : getDealtime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}