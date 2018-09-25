package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public OrderDetailExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Long value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Long value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Long value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Long value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Long value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Long value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Long> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Long> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Long value1, Long value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Long value1, Long value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidIsNull() {
            addCriterion("goodsDetailId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidIsNotNull() {
            addCriterion("goodsDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidEqualTo(Long value) {
            addCriterion("goodsDetailId =", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidNotEqualTo(Long value) {
            addCriterion("goodsDetailId <>", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidGreaterThan(Long value) {
            addCriterion("goodsDetailId >", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsDetailId >=", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidLessThan(Long value) {
            addCriterion("goodsDetailId <", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidLessThanOrEqualTo(Long value) {
            addCriterion("goodsDetailId <=", value, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidIn(List<Long> values) {
            addCriterion("goodsDetailId in", values, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidNotIn(List<Long> values) {
            addCriterion("goodsDetailId not in", values, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidBetween(Long value1, Long value2) {
            addCriterion("goodsDetailId between", value1, value2, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsdetailidNotBetween(Long value1, Long value2) {
            addCriterion("goodsDetailId not between", value1, value2, "goodsdetailid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
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

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Double value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Double value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Double value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Double value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Double> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Double> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Double value1, Double value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIsNull() {
            addCriterion("avgprice is null");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIsNotNull() {
            addCriterion("avgprice is not null");
            return (Criteria) this;
        }

        public Criteria andAvgpriceEqualTo(Double value) {
            addCriterion("avgprice =", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotEqualTo(Double value) {
            addCriterion("avgprice <>", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceGreaterThan(Double value) {
            addCriterion("avgprice >", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("avgprice >=", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLessThan(Double value) {
            addCriterion("avgprice <", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceLessThanOrEqualTo(Double value) {
            addCriterion("avgprice <=", value, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceIn(List<Double> values) {
            addCriterion("avgprice in", values, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotIn(List<Double> values) {
            addCriterion("avgprice not in", values, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceBetween(Double value1, Double value2) {
            addCriterion("avgprice between", value1, value2, "avgprice");
            return (Criteria) this;
        }

        public Criteria andAvgpriceNotBetween(Double value1, Double value2) {
            addCriterion("avgprice not between", value1, value2, "avgprice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andGoodsnameLikeInsensitive(String value) {
            addCriterion("upper(goodsName) like", value.toUpperCase(), "goodsname");
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