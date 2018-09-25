package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class BalanceRecord implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] 会员id*/
    private Long memberid;

    /**[1 NOTNULL] 类型,0:订单消费，1 :优惠券购买*/
    private String type;

    /**[19] 单据id*/
    private Long businessid;

    /**[22 NOTNULL] 金额*/
    private Double amount;

    /**[22 NOTNULL] 使用前余额*/
    private Double beforeamount;

    /**[22 NOTNULL] 使用后余额*/
    private Double afteramount;

    /**[19 NOTNULL] 使用时间*/
    private Date usetime;

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
     * @return  String  类型,0:订单消费，1 :优惠券购买
     */
    public String getType() {
        return type;
    }

    /**
     * @param  String[1 NOTNULL] 类型,0:订单消费，1 :优惠券购买
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return  Long  单据id
     */
    public Long getBusinessid() {
        return businessid;
    }

    /**
     * @param  Long[19] 单据id
     */
    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }

    /**
     * @return  Double  金额
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param  Double[22 NOTNULL] 金额
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return  Double  使用前余额
     */
    public Double getBeforeamount() {
        return beforeamount;
    }

    /**
     * @param  Double[22 NOTNULL] 使用前余额
     */
    public void setBeforeamount(Double beforeamount) {
        this.beforeamount = beforeamount;
    }

    /**
     * @return  Double  使用后余额
     */
    public Double getAfteramount() {
        return afteramount;
    }

    /**
     * @param  Double[22 NOTNULL] 使用后余额
     */
    public void setAfteramount(Double afteramount) {
        this.afteramount = afteramount;
    }

    /**
     * @return  Date  使用时间
     */
    public Date getUsetime() {
        return usetime;
    }

    /**
     * @param  Date[19 NOTNULL] 使用时间
     */
    public void setUsetime(Date usetime) {
        this.usetime = usetime;
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
        BalanceRecord other = (BalanceRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getBusinessid() == null ? other.getBusinessid() == null : this.getBusinessid().equals(other.getBusinessid()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBeforeamount() == null ? other.getBeforeamount() == null : this.getBeforeamount().equals(other.getBeforeamount()))
            && (this.getAfteramount() == null ? other.getAfteramount() == null : this.getAfteramount().equals(other.getAfteramount()))
            && (this.getUsetime() == null ? other.getUsetime() == null : this.getUsetime().equals(other.getUsetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getBusinessid() == null) ? 0 : getBusinessid().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBeforeamount() == null) ? 0 : getBeforeamount().hashCode());
        result = prime * result + ((getAfteramount() == null) ? 0 : getAfteramount().hashCode());
        result = prime * result + ((getUsetime() == null) ? 0 : getUsetime().hashCode());
        return result;
    }
}