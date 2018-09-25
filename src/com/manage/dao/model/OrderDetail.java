package com.manage.dao.model;

import java.io.Serializable;

public class OrderDetail implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19] 订单id*/
    private Long orderid;

    /**[19] 子商品id*/
    private Long goodsdetailid;

    /**[50] 商品名称*/
    private String goodsname;

    /**[19] 尺寸*/
    private Long sizeid;

    /**[19] 颜色*/
    private Long colorid;

    /**[22] 成本价*/
    private Double costprice;

    /**[22] 吊牌价*/
    private Double oldprice;

    /**[22] 成交价*/
    private Double price;

    /**[22] 折扣价*/
    private Double vipprice;

    /**[10] 购买数量*/
    private Integer amount;

    /**[22] 合计*/
    private Double totalprice;

    /**[22] 折扣*/
    private Double discount;

    /**[22] 成交均价*/
    private Double avgprice;

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
     * @return  Long  订单id
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * @param  Long[19] 订单id
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * @return  Long  子商品id
     */
    public Long getGoodsdetailid() {
        return goodsdetailid;
    }

    /**
     * @param  Long[19] 子商品id
     */
    public void setGoodsdetailid(Long goodsdetailid) {
        this.goodsdetailid = goodsdetailid;
    }

    /**
     * @return  String  商品名称
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * @param  String[50] 商品名称
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * @return  Long  尺寸
     */
    public Long getSizeid() {
        return sizeid;
    }

    /**
     * @param  Long[19] 尺寸
     */
    public void setSizeid(Long sizeid) {
        this.sizeid = sizeid;
    }

    /**
     * @return  Long  颜色
     */
    public Long getColorid() {
        return colorid;
    }

    /**
     * @param  Long[19] 颜色
     */
    public void setColorid(Long colorid) {
        this.colorid = colorid;
    }

    /**
     * @return  Double  成本价
     */
    public Double getCostprice() {
        return costprice;
    }

    /**
     * @param  Double[22] 成本价
     */
    public void setCostprice(Double costprice) {
        this.costprice = costprice;
    }

    /**
     * @return  Double  吊牌价
     */
    public Double getOldprice() {
        return oldprice;
    }

    /**
     * @param  Double[22] 吊牌价
     */
    public void setOldprice(Double oldprice) {
        this.oldprice = oldprice;
    }

    /**
     * @return  Double  成交价
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param  Double[22] 成交价
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return  Double  折扣价
     */
    public Double getVipprice() {
        return vipprice;
    }

    /**
     * @param  Double[22] 折扣价
     */
    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }

    /**
     * @return  Integer  购买数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param  Integer[10] 购买数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return  Double  合计
     */
    public Double getTotalprice() {
        return totalprice;
    }

    /**
     * @param  Double[22] 合计
     */
    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return  Double  折扣
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param  Double[22] 折扣
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return  Double  成交均价
     */
    public Double getAvgprice() {
        return avgprice;
    }

    /**
     * @param  Double[22] 成交均价
     */
    public void setAvgprice(Double avgprice) {
        this.avgprice = avgprice;
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
        OrderDetail other = (OrderDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getGoodsdetailid() == null ? other.getGoodsdetailid() == null : this.getGoodsdetailid().equals(other.getGoodsdetailid()))
            && (this.getGoodsname() == null ? other.getGoodsname() == null : this.getGoodsname().equals(other.getGoodsname()))
            && (this.getSizeid() == null ? other.getSizeid() == null : this.getSizeid().equals(other.getSizeid()))
            && (this.getColorid() == null ? other.getColorid() == null : this.getColorid().equals(other.getColorid()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getOldprice() == null ? other.getOldprice() == null : this.getOldprice().equals(other.getOldprice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getVipprice() == null ? other.getVipprice() == null : this.getVipprice().equals(other.getVipprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getTotalprice() == null ? other.getTotalprice() == null : this.getTotalprice().equals(other.getTotalprice()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getAvgprice() == null ? other.getAvgprice() == null : this.getAvgprice().equals(other.getAvgprice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getGoodsdetailid() == null) ? 0 : getGoodsdetailid().hashCode());
        result = prime * result + ((getGoodsname() == null) ? 0 : getGoodsname().hashCode());
        result = prime * result + ((getSizeid() == null) ? 0 : getSizeid().hashCode());
        result = prime * result + ((getColorid() == null) ? 0 : getColorid().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getOldprice() == null) ? 0 : getOldprice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getVipprice() == null) ? 0 : getVipprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getTotalprice() == null) ? 0 : getTotalprice().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getAvgprice() == null) ? 0 : getAvgprice().hashCode());
        return result;
    }
}