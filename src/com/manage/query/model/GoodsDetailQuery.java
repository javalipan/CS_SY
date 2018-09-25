package com.manage.query.model;

import com.manage.dao.model.GoodsDetail;
import com.manage.util.Pager;

public class GoodsDetailQuery extends GoodsDetail{

	private static final long serialVersionUID = 1L;
	
	private String isdiscount;
	private Double discount;
	private String colorName;
	private String sizeName;
	private String goodsName;
	private String code;
	private String name;
	
	private String codelike;
	private String detailcodelike;
	
	private Pager pager;
	private String orderBy;

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodelike() {
		return codelike;
	}

	public void setCodelike(String codelike) {
		this.codelike = codelike;
	}

	public String getDetailcodelike() {
		return detailcodelike;
	}

	public void setDetailcodelike(String detailcodelike) {
		this.detailcodelike = detailcodelike;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getIsdiscount() {
		return isdiscount;
	}

	public void setIsdiscount(String isdiscount) {
		this.isdiscount = isdiscount;
	}
	
}
