package com.manage.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    /**[19 NOTNULL] id*/
    private Long id;

    /**[50] 编号*/
    private String code;

    /**[19] 分类id*/
    private Long typeid;

    /**[19] 所属品牌*/
    private Long brandid;

    /**[1] 性别，0：男装，1：女装*/
    private String sex;

    /**[1] 季节，0：春装，1：夏装，2：秋装，3：冬装*/
    private String season;

    /**[50] 商品名称*/
    private String name;

    /**[500] 图片*/
    private String img;

    /**[19] 点击量*/
    private Long clickcnt;

    /**[1] 状态,0:未上架、1：上架、2：下架*/
    private String status;

    /**[10] 排序*/
    private Integer sortno;

    /**[500] 生产地址*/
    private String productaddress;

    /**[500] 面料*/
    private String material;

    /**[100] 洗涤方式*/
    private String washway;

    /**[100] 简介*/
    private String shortintro;

    /**[1000] 价格json冗余*/
    private String pricejson;

    /**[5000] 规格json冗余,例如:{"size":[{"id":1,"name":"XL"},{"id":2,"name":"XXL"}],"color":[{"id":3,"name":"黑色"},{"id":4,"name":"白色"}]}*/
    private String specjson;

    /**[1] 是否推荐,0:否，1：是*/
    private String isrecomment;

    /**[19] 创建时间*/
    private Date createtime;

    /**[19] 更新时间*/
    private Date updatetime;

    /**[50] unit*/
    private String unit;

    /**[500] 执行标准*/
    private String standard;

    /**[50] 进货入库类型*/
    private String stocktype;

    /**[50] 贺品季节*/
    private String goodsSeason;

    /**[10] 浏览次数*/
    private Integer browsecnt;

    /**[4] 年*/
    private String goodsyear;

    /**[19] 风格*/
    private Long styletypeid;

    /**[1] 是否折扣（0：否，1：未开始，2：折扣中，3：已过期）*/
    private String isdiscount;

    /**[22] 折扣*/
    private Double discount;

    /**[19] 折扣开始时间*/
    private Date starttime;

    /**[19] 折扣结束时间*/
    private Date endtime;

    /**[10] 销量*/
    private Integer soldcnt;

    /**[22] 所有规格中最低价*/
    private Double minprice;

    /**[1] 是否新品,0:否，1:是*/
    private String isnew;

    /**[65535] 详细介绍*/
    private String intro;

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
     * @return  String  编号
     */
    public String getCode() {
        return code;
    }

    /**
     * @param  String[50] 编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return  Long  分类id
     */
    public Long getTypeid() {
        return typeid;
    }

    /**
     * @param  Long[19] 分类id
     */
    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    /**
     * @return  Long  所属品牌
     */
    public Long getBrandid() {
        return brandid;
    }

    /**
     * @param  Long[19] 所属品牌
     */
    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    /**
     * @return  String  性别，0：男装，1：女装
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param  String[1] 性别，0：男装，1：女装
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return  String  季节，0：春装，1：夏装，2：秋装，3：冬装
     */
    public String getSeason() {
        return season;
    }

    /**
     * @param  String[1] 季节，0：春装，1：夏装，2：秋装，3：冬装
     */
    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }

    /**
     * @return  String  商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * @param  String[50] 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return  String  图片
     */
    public String getImg() {
        return img;
    }

    /**
     * @param  String[500] 图片
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * @return  Long  点击量
     */
    public Long getClickcnt() {
        return clickcnt;
    }

    /**
     * @param  Long[19] 点击量
     */
    public void setClickcnt(Long clickcnt) {
        this.clickcnt = clickcnt;
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
     * @return  Integer  排序
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * @param  Integer[10] 排序
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * @return  String  生产地址
     */
    public String getProductaddress() {
        return productaddress;
    }

    /**
     * @param  String[500] 生产地址
     */
    public void setProductaddress(String productaddress) {
        this.productaddress = productaddress == null ? null : productaddress.trim();
    }

    /**
     * @return  String  面料
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param  String[500] 面料
     */
    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    /**
     * @return  String  洗涤方式
     */
    public String getWashway() {
        return washway;
    }

    /**
     * @param  String[100] 洗涤方式
     */
    public void setWashway(String washway) {
        this.washway = washway == null ? null : washway.trim();
    }

    /**
     * @return  String  简介
     */
    public String getShortintro() {
        return shortintro;
    }

    /**
     * @param  String[100] 简介
     */
    public void setShortintro(String shortintro) {
        this.shortintro = shortintro == null ? null : shortintro.trim();
    }

    /**
     * @return  String  价格json冗余
     */
    public String getPricejson() {
        return pricejson;
    }

    /**
     * @param  String[1000] 价格json冗余
     */
    public void setPricejson(String pricejson) {
        this.pricejson = pricejson == null ? null : pricejson.trim();
    }

    /**
     * @return  String  规格json冗余,例如:{"size":[{"id":1,"name":"XL"},{"id":2,"name":"XXL"}],"color":[{"id":3,"name":"黑色"},{"id":4,"name":"白色"}]}
     */
    public String getSpecjson() {
        return specjson;
    }

    /**
     * @param  String[5000] 规格json冗余,例如:{"size":[{"id":1,"name":"XL"},{"id":2,"name":"XXL"}],"color":[{"id":3,"name":"黑色"},{"id":4,"name":"白色"}]}
     */
    public void setSpecjson(String specjson) {
        this.specjson = specjson == null ? null : specjson.trim();
    }

    /**
     * @return  String  是否推荐,0:否，1：是
     */
    public String getIsrecomment() {
        return isrecomment;
    }

    /**
     * @param  String[1] 是否推荐,0:否，1：是
     */
    public void setIsrecomment(String isrecomment) {
        this.isrecomment = isrecomment == null ? null : isrecomment.trim();
    }

    /**
     * @return  Date  创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param  Date[19] 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return  Date  更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param  Date[19] 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return  String  unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param  String[50] unit
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * @return  String  执行标准
     */
    public String getStandard() {
        return standard;
    }

    /**
     * @param  String[500] 执行标准
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * @return  String  进货入库类型
     */
    public String getStocktype() {
        return stocktype;
    }

    /**
     * @param  String[50] 进货入库类型
     */
    public void setStocktype(String stocktype) {
        this.stocktype = stocktype == null ? null : stocktype.trim();
    }

    /**
     * @return  String  贺品季节
     */
    public String getGoodsSeason() {
        return goodsSeason;
    }

    /**
     * @param  String[50] 贺品季节
     */
    public void setGoodsSeason(String goodsSeason) {
        this.goodsSeason = goodsSeason == null ? null : goodsSeason.trim();
    }

    /**
     * @return  Integer  浏览次数
     */
    public Integer getBrowsecnt() {
        return browsecnt;
    }

    /**
     * @param  Integer[10] 浏览次数
     */
    public void setBrowsecnt(Integer browsecnt) {
        this.browsecnt = browsecnt;
    }

    /**
     * @return  String  年
     */
    public String getGoodsyear() {
        return goodsyear;
    }

    /**
     * @param  String[4] 年
     */
    public void setGoodsyear(String goodsyear) {
        this.goodsyear = goodsyear == null ? null : goodsyear.trim();
    }

    /**
     * @return  Long  风格
     */
    public Long getStyletypeid() {
        return styletypeid;
    }

    /**
     * @param  Long[19] 风格
     */
    public void setStyletypeid(Long styletypeid) {
        this.styletypeid = styletypeid;
    }

    /**
     * @return  String  是否折扣（0：否，1：未开始，2：折扣中，3：已过期）
     */
    public String getIsdiscount() {
        return isdiscount;
    }

    /**
     * @param  String[1] 是否折扣（0：否，1：未开始，2：折扣中，3：已过期）
     */
    public void setIsdiscount(String isdiscount) {
        this.isdiscount = isdiscount == null ? null : isdiscount.trim();
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
     * @return  Date  折扣开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param  Date[19] 折扣开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return  Date  折扣结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param  Date[19] 折扣结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return  Integer  销量
     */
    public Integer getSoldcnt() {
        return soldcnt;
    }

    /**
     * @param  Integer[10] 销量
     */
    public void setSoldcnt(Integer soldcnt) {
        this.soldcnt = soldcnt;
    }

    /**
     * @return  Double  所有规格中最低价
     */
    public Double getMinprice() {
        return minprice;
    }

    /**
     * @param  Double[22] 所有规格中最低价
     */
    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    /**
     * @return  String  是否新品,0:否，1:是
     */
    public String getIsnew() {
        return isnew;
    }

    /**
     * @param  String[1] 是否新品,0:否，1:是
     */
    public void setIsnew(String isnew) {
        this.isnew = isnew == null ? null : isnew.trim();
    }

    /**
     * @return  String  详细介绍
     */
    public String getIntro() {
        return intro;
    }

    /**
     * @param  String[65535] 详细介绍
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getTypeid() == null ? other.getTypeid() == null : this.getTypeid().equals(other.getTypeid()))
            && (this.getBrandid() == null ? other.getBrandid() == null : this.getBrandid().equals(other.getBrandid()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getSeason() == null ? other.getSeason() == null : this.getSeason().equals(other.getSeason()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getClickcnt() == null ? other.getClickcnt() == null : this.getClickcnt().equals(other.getClickcnt()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSortno() == null ? other.getSortno() == null : this.getSortno().equals(other.getSortno()))
            && (this.getProductaddress() == null ? other.getProductaddress() == null : this.getProductaddress().equals(other.getProductaddress()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getWashway() == null ? other.getWashway() == null : this.getWashway().equals(other.getWashway()))
            && (this.getShortintro() == null ? other.getShortintro() == null : this.getShortintro().equals(other.getShortintro()))
            && (this.getPricejson() == null ? other.getPricejson() == null : this.getPricejson().equals(other.getPricejson()))
            && (this.getSpecjson() == null ? other.getSpecjson() == null : this.getSpecjson().equals(other.getSpecjson()))
            && (this.getIsrecomment() == null ? other.getIsrecomment() == null : this.getIsrecomment().equals(other.getIsrecomment()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getStandard() == null ? other.getStandard() == null : this.getStandard().equals(other.getStandard()))
            && (this.getStocktype() == null ? other.getStocktype() == null : this.getStocktype().equals(other.getStocktype()))
            && (this.getGoodsSeason() == null ? other.getGoodsSeason() == null : this.getGoodsSeason().equals(other.getGoodsSeason()))
            && (this.getBrowsecnt() == null ? other.getBrowsecnt() == null : this.getBrowsecnt().equals(other.getBrowsecnt()))
            && (this.getGoodsyear() == null ? other.getGoodsyear() == null : this.getGoodsyear().equals(other.getGoodsyear()))
            && (this.getStyletypeid() == null ? other.getStyletypeid() == null : this.getStyletypeid().equals(other.getStyletypeid()))
            && (this.getIsdiscount() == null ? other.getIsdiscount() == null : this.getIsdiscount().equals(other.getIsdiscount()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getSoldcnt() == null ? other.getSoldcnt() == null : this.getSoldcnt().equals(other.getSoldcnt()))
            && (this.getMinprice() == null ? other.getMinprice() == null : this.getMinprice().equals(other.getMinprice()))
            && (this.getIsnew() == null ? other.getIsnew() == null : this.getIsnew().equals(other.getIsnew()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getTypeid() == null) ? 0 : getTypeid().hashCode());
        result = prime * result + ((getBrandid() == null) ? 0 : getBrandid().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getSeason() == null) ? 0 : getSeason().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getClickcnt() == null) ? 0 : getClickcnt().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSortno() == null) ? 0 : getSortno().hashCode());
        result = prime * result + ((getProductaddress() == null) ? 0 : getProductaddress().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getWashway() == null) ? 0 : getWashway().hashCode());
        result = prime * result + ((getShortintro() == null) ? 0 : getShortintro().hashCode());
        result = prime * result + ((getPricejson() == null) ? 0 : getPricejson().hashCode());
        result = prime * result + ((getSpecjson() == null) ? 0 : getSpecjson().hashCode());
        result = prime * result + ((getIsrecomment() == null) ? 0 : getIsrecomment().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getStandard() == null) ? 0 : getStandard().hashCode());
        result = prime * result + ((getStocktype() == null) ? 0 : getStocktype().hashCode());
        result = prime * result + ((getGoodsSeason() == null) ? 0 : getGoodsSeason().hashCode());
        result = prime * result + ((getBrowsecnt() == null) ? 0 : getBrowsecnt().hashCode());
        result = prime * result + ((getGoodsyear() == null) ? 0 : getGoodsyear().hashCode());
        result = prime * result + ((getStyletypeid() == null) ? 0 : getStyletypeid().hashCode());
        result = prime * result + ((getIsdiscount() == null) ? 0 : getIsdiscount().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getSoldcnt() == null) ? 0 : getSoldcnt().hashCode());
        result = prime * result + ((getMinprice() == null) ? 0 : getMinprice().hashCode());
        result = prime * result + ((getIsnew() == null) ? 0 : getIsnew().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        return result;
    }
}