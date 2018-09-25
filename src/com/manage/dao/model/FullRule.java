package com.manage.dao.model;

import java.io.Serializable;

public class FullRule implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[10 NOTNULL] 金额*/
    private Integer amount;

    /**[10 NOTNULL] 减少金额*/
    private Integer subtractamount;

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
     * @return  Integer  减少金额
     */
    public Integer getSubtractamount() {
        return subtractamount;
    }

    /**
     * @param  Integer[10 NOTNULL] 减少金额
     */
    public void setSubtractamount(Integer subtractamount) {
        this.subtractamount = subtractamount;
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
        FullRule other = (FullRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getSubtractamount() == null ? other.getSubtractamount() == null : this.getSubtractamount().equals(other.getSubtractamount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getSubtractamount() == null) ? 0 : getSubtractamount().hashCode());
        return result;
    }
}