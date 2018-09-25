package com.manage.query.model;

import com.manage.dao.model.Goods;
import com.manage.util.Pager;

public class GoodsQuery extends Goods{

	private static final long serialVersionUID = 1L;
	
	/**
	* @Fields brandname : 品牌名称
	*/
	private String brandname;
	/**
	 * @Fields typename : 分类名称
	 */
	private String typename;

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

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
	
}
