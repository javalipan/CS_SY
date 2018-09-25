package com.manage.dao.model;

import java.io.Serializable;

public class CooperateGoods implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19 NOTNULL] cooperateId*/
    private Long cooperateid;

    /**[19 NOTNULL] goodsId*/
    private Long goodsid;

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
     * @return  Long  cooperateId
     */
    public Long getCooperateid() {
        return cooperateid;
    }

    /**
     * @param  Long[19 NOTNULL] cooperateId
     */
    public void setCooperateid(Long cooperateid) {
        this.cooperateid = cooperateid;
    }

    /**
     * @return  Long  goodsId
     */
    public Long getGoodsid() {
        return goodsid;
    }

    /**
     * @param  Long[19 NOTNULL] goodsId
     */
    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
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
        CooperateGoods other = (CooperateGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCooperateid() == null ? other.getCooperateid() == null : this.getCooperateid().equals(other.getCooperateid()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCooperateid() == null) ? 0 : getCooperateid().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        return result;
    }
}