package com.manage.dao.model;

import java.io.Serializable;

public class RechargeRule implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[10 NOTNULL] 金额*/
    private Integer amount;

    /**[10 NOTNULL] 赠送金额*/
    private Integer giveamount;

    /**[22 NOTNULL] 享受折扣*/
    private Double discount;

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
     * @return  Double  享受折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param  Double[22 NOTNULL] 享受折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
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
        RechargeRule other = (RechargeRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getGiveamount() == null ? other.getGiveamount() == null : this.getGiveamount().equals(other.getGiveamount()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getGiveamount() == null) ? 0 : getGiveamount().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        return result;
    }
}