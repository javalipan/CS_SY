package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public GoodsDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPager(Pager pager) {
        this.pager=pager;
    }

    public Pager getPager() {
        return pager;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Long value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Long value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Long value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Long value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Long value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Long> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Long> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Long value1, Long value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Long value1, Long value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andDetailcodeIsNull() {
            addCriterion("detailcode is null");
            return (Criteria) this;
        }

        public Criteria andDetailcodeIsNotNull() {
            addCriterion("detailcode is not null");
            return (Criteria) this;
        }

        public Criteria andDetailcodeEqualTo(String value) {
            addCriterion("detailcode =", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotEqualTo(String value) {
            addCriterion("detailcode <>", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeGreaterThan(String value) {
            addCriterion("detailcode >", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeGreaterThanOrEqualTo(String value) {
            addCriterion("detailcode >=", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeLessThan(String value) {
            addCriterion("detailcode <", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeLessThanOrEqualTo(String value) {
            addCriterion("detailcode <=", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeLike(String value) {
            addCriterion("detailcode like", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotLike(String value) {
            addCriterion("detailcode not like", value, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeIn(List<String> values) {
            addCriterion("detailcode in", values, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotIn(List<String> values) {
            addCriterion("detailcode not in", values, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeBetween(String value1, String value2) {
            addCriterion("detailcode between", value1, value2, "detailcode");
            return (Criteria) this;
        }

        public Criteria andDetailcodeNotBetween(String value1, String value2) {
            addCriterion("detailcode not between", value1, value2, "detailcode");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNull() {
            addCriterion("sizeId is null");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNotNull() {
            addCriterion("sizeId is not null");
            return (Criteria) this;
        }

        public Criteria andSizeidEqualTo(Long value) {
            addCriterion("sizeId =", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotEqualTo(Long value) {
            addCriterion("sizeId <>", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThan(Long value) {
            addCriterion("sizeId >", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThanOrEqualTo(Long value) {
            addCriterion("sizeId >=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThan(Long value) {
            addCriterion("sizeId <", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThanOrEqualTo(Long value) {
            addCriterion("sizeId <=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidIn(List<Long> values) {
            addCriterion("sizeId in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotIn(List<Long> values) {
            addCriterion("sizeId not in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidBetween(Long value1, Long value2) {
            addCriterion("sizeId between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotBetween(Long value1, Long value2) {
            addCriterion("sizeId not between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andColoridIsNull() {
            addCriterion("colorId is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("colorId is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Long value) {
            addCriterion("colorId =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Long value) {
            addCriterion("colorId <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Long value) {
            addCriterion("colorId >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Long value) {
            addCriterion("colorId >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Long value) {
            addCriterion("colorId <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Long value) {
            addCriterion("colorId <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Long> values) {
            addCriterion("colorId in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Long> values) {
            addCriterion("colorId not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Long value1, Long value2) {
            addCriterion("colorId between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Long value1, Long value2) {
            addCriterion("colorId not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andSpecid3IsNull() {
            addCriterion("specId3 is null");
            return (Criteria) this;
        }

        public Criteria andSpecid3IsNotNull() {
            addCriterion("specId3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecid3EqualTo(Long value) {
            addCriterion("specId3 =", value, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3NotEqualTo(Long value) {
            addCriterion("specId3 <>", value, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3GreaterThan(Long value) {
            addCriterion("specId3 >", value, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3GreaterThanOrEqualTo(Long value) {
            addCriterion("specId3 >=", value, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3LessThan(Long value) {
            addCriterion("specId3 <", value, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3LessThanOrEqualTo(Long value) {
            addCriterion("specId3 <=", value, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3In(List<Long> values) {
            addCriterion("specId3 in", values, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3NotIn(List<Long> values) {
            addCriterion("specId3 not in", values, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3Between(Long value1, Long value2) {
            addCriterion("specId3 between", value1, value2, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid3NotBetween(Long value1, Long value2) {
            addCriterion("specId3 not between", value1, value2, "specid3");
            return (Criteria) this;
        }

        public Criteria andSpecid4IsNull() {
            addCriterion("specId4 is null");
            return (Criteria) this;
        }

        public Criteria andSpecid4IsNotNull() {
            addCriterion("specId4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpecid4EqualTo(Long value) {
            addCriterion("specId4 =", value, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4NotEqualTo(Long value) {
            addCriterion("specId4 <>", value, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4GreaterThan(Long value) {
            addCriterion("specId4 >", value, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4GreaterThanOrEqualTo(Long value) {
            addCriterion("specId4 >=", value, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4LessThan(Long value) {
            addCriterion("specId4 <", value, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4LessThanOrEqualTo(Long value) {
            addCriterion("specId4 <=", value, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4In(List<Long> values) {
            addCriterion("specId4 in", values, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4NotIn(List<Long> values) {
            addCriterion("specId4 not in", values, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4Between(Long value1, Long value2) {
            addCriterion("specId4 between", value1, value2, "specid4");
            return (Criteria) this;
        }

        public Criteria andSpecid4NotBetween(Long value1, Long value2) {
            addCriterion("specId4 not between", value1, value2, "specid4");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("costPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("costPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(Double value) {
            addCriterion("costPrice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(Double value) {
            addCriterion("costPrice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(Double value) {
            addCriterion("costPrice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("costPrice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(Double value) {
            addCriterion("costPrice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(Double value) {
            addCriterion("costPrice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<Double> values) {
            addCriterion("costPrice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<Double> values) {
            addCriterion("costPrice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(Double value1, Double value2) {
            addCriterion("costPrice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(Double value1, Double value2) {
            addCriterion("costPrice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNull() {
            addCriterion("oldPrice is null");
            return (Criteria) this;
        }

        public Criteria andOldpriceIsNotNull() {
            addCriterion("oldPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOldpriceEqualTo(Double value) {
            addCriterion("oldPrice =", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotEqualTo(Double value) {
            addCriterion("oldPrice <>", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThan(Double value) {
            addCriterion("oldPrice >", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("oldPrice >=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThan(Double value) {
            addCriterion("oldPrice <", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceLessThanOrEqualTo(Double value) {
            addCriterion("oldPrice <=", value, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceIn(List<Double> values) {
            addCriterion("oldPrice in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotIn(List<Double> values) {
            addCriterion("oldPrice not in", values, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceBetween(Double value1, Double value2) {
            addCriterion("oldPrice between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andOldpriceNotBetween(Double value1, Double value2) {
            addCriterion("oldPrice not between", value1, value2, "oldprice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipPrice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Double value) {
            addCriterion("vipPrice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Double value) {
            addCriterion("vipPrice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Double value) {
            addCriterion("vipPrice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vipPrice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Double value) {
            addCriterion("vipPrice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Double value) {
            addCriterion("vipPrice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Double> values) {
            addCriterion("vipPrice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Double> values) {
            addCriterion("vipPrice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Double value1, Double value2) {
            addCriterion("vipPrice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Double value1, Double value2) {
            addCriterion("vipPrice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("sortno is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("sortno is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(Long value) {
            addCriterion("sortno =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(Long value) {
            addCriterion("sortno <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(Long value) {
            addCriterion("sortno >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Long value) {
            addCriterion("sortno >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(Long value) {
            addCriterion("sortno <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Long value) {
            addCriterion("sortno <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<Long> values) {
            addCriterion("sortno in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<Long> values) {
            addCriterion("sortno not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(Long value1, Long value2) {
            addCriterion("sortno between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(Long value1, Long value2) {
            addCriterion("sortno not between", value1, value2, "sortno");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andDetailcodeLikeInsensitive(String value) {
            addCriterion("upper(detailcode) like", value.toUpperCase(), "detailcode");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}