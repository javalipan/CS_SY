package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class GoodsDetail implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[19] 商品id*/
    private Long goodsid;

    /**[50] 编号*/
    private String detailcode;

    /**[19] 尺寸*/
    private Long sizeid;

    /**[19] 颜色*/
    private Long colorid;

    /**[19] 规格三*/
    private Long specid3;

    /**[19] 规格四*/
    private Long specid4;

    /**[22] 成本价*/
    private Double costprice;

    /**[22] 吊牌价*/
    private Double oldprice;

    /**[22] 成交价*/
    private Double price;

    /**[22] 折扣价*/
    private Double vipprice;

    /**[10] 库存数量*/
    private Integer amount;

    /**[1] 状态,0:未上架、1：上架、2：下架*/
    private String status;

    /**[19 NOTNULL] 更新时间*/
    private Date updatetime;

    /**[19] 排序*/
    private Long sortno;

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
     * @return  Long  商品id
     */
    public Long getGoodsid() {
        return goodsid;
    }

    /**
     * @param  Long[19] 商品id
     */
    public void setGoodsid(Long goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * @return  String  编号
     */
    public String getDetailcode() {
        return detailcode;
    }

    /**
     * @param  String[50] 编号
     */
    public void setDetailcode(String detailcode) {
        this.detailcode = detailcode == null ? null : detailcode.trim();
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
     * @return  Long  规格三
     */
    public Long getSpecid3() {
        return specid3;
    }

    /**
     * @param  Long[19] 规格三
     */
    public void setSpecid3(Long specid3) {
        this.specid3 = specid3;
    }

    /**
     * @return  Long  规格四
     */
    public Long getSpecid4() {
        return specid4;
    }

    /**
     * @param  Long[19] 规格四
     */
    public void setSpecid4(Long specid4) {
        this.specid4 = specid4;
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
     * @return  Integer  库存数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param  Integer[10] 库存数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return  String  状态,0:未上架、1：上架、2：下架
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param  String[1] 状态,0:未上架、1：上架、2：下架
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return  Date  更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param  Date[19 NOTNULL] 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return  Long  排序
     */
    public Long getSortno() {
        return sortno;
    }

    /**
     * @param  Long[19] 排序
     */
    public void setSortno(Long sortno) {
        this.sortno = sortno;
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
        GoodsDetail other = (GoodsDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getDetailcode() == null ? other.getDetailcode() == null : this.getDetailcode().equals(other.getDetailcode()))
            && (this.getSizeid() == null ? other.getSizeid() == null : this.getSizeid().equals(other.getSizeid()))
            && (this.getColorid() == null ? other.getColorid() == null : this.getColorid().equals(other.getColorid()))
            && (this.getSpecid3() == null ? other.getSpecid3() == null : this.getSpecid3().equals(other.getSpecid3()))
            && (this.getSpecid4() == null ? other.getSpecid4() == null : this.getSpecid4().equals(other.getSpecid4()))
            && (this.getCostprice() == null ? other.getCostprice() == null : this.getCostprice().equals(other.getCostprice()))
            && (this.getOldprice() == null ? other.getOldprice() == null : this.getOldprice().equals(other.getOldprice()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getVipprice() == null ? other.getVipprice() == null : this.getVipprice().equals(other.getVipprice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getDetailcode() == null) ? 0 : getDetailcode().hashCode());
        result = prime * result + ((getSizeid() == null) ? 0 : getSizeid().hashCode());
        result = prime * result + ((getColorid() == null) ? 0 : getColorid().hashCode());
        result = prime * result + ((getSpecid3() == null) ? 0 : getSpecid3().hashCode());
        result = prime * result + ((getSpecid4() == null) ? 0 : getSpecid4().hashCode());
        result = prime * result + ((getCostprice() == null) ? 0 : getCostprice().hashCode());
        result = prime * result + ((getOldprice() == null) ? 0 : getOldprice().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getVipprice() == null) ? 0 : getVipprice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        return result;
    }
}