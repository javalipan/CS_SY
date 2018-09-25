package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Repertory implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19] 商品详情id*/
    private Long goodsdetailid;

    /**[10] 入库前数量*/
    private Integer beforeamount;

    /**[10] 入库数量*/
    private Integer amount;

    /**[10] 入库后数量*/
    private Integer afteramount;

    /**[500] 备注*/
    private String remark;

    /**[19 NOTNULL] 入库时间*/
    private Date intime;

    /**[36] 操作员*/
    private String operator;

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
     * @return  Long  商品详情id
     */
    public Long getGoodsdetailid() {
        return goodsdetailid;
    }

    /**
     * @param  Long[19] 商品详情id
     */
    public void setGoodsdetailid(Long goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }

    /**
     * @return  Integer  入库前数量
     */
    public Integer getBeforeamount() {
        return beforeamount;
    }

    /**
     * @param  Integer[10] 入库前数量
     */
    public void setBeforeamount(Integer beforeamount) {
        this.beforeamount = beforeamount;
    }

    /**
     * @return  Integer  入库数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param  Integer[10] 入库数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return  Integer  入库后数量
     */
    public Integer getAfteramount() {
        return afteramount;
    }

    /**
     * @param  Integer[10] 入库后数量
     */
    public void setAfteramount(Integer afteramount) {
        this.afteramount = afteramount;
    }

    /**
     * @return  String  备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param  String[500] 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return  Date  入库时间
     */
    public Date getIntime() {
        return intime;
    }

    /**
     * @param  Date[19 NOTNULL] 入库时间
     */
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    /**
     * @return  String  操作员
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param  String[36] 操作员
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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
        Repertory other = (Repertory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsdetailid() == null ? other.getGoodsdetailid() == null : this.getGoodsdetailid().equals(other.getGoodsdetailid()))
            && (this.getBeforeamount() == null ? other.getBeforeamount() == null : this.getBeforeamount().equals(other.getBeforeamount()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getAfteramount() == null ? other.getAfteramount() == null : this.getAfteramount().equals(other.getAfteramount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getIntime() == null ? other.getIntime() == null : this.getIntime().equals(other.getIntime()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsdetailid() == null) ? 0 : getGoodsdetailid().hashCode());
        result = prime * result + ((getBeforeamount() == null) ? 0 : getBeforeamount().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getAfteramount() == null) ? 0 : getAfteramount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getIntime() == null) ? 0 : getIntime().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}