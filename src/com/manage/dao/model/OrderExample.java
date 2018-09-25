package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public OrderExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberId is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberId is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Long value) {
            addCriterion("memberId =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Long value) {
            addCriterion("memberId <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Long value) {
            addCriterion("memberId >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Long value) {
            addCriterion("memberId >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Long value) {
            addCriterion("memberId <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Long value) {
            addCriterion("memberId <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Long> values) {
            addCriterion("memberId in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Long> values) {
            addCriterion("memberId not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Long value1, Long value2) {
            addCriterion("memberId between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Long value1, Long value2) {
            addCriterion("memberId not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNull() {
            addCriterion("modifyUser is null");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNotNull() {
            addCriterion("modifyUser is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuserEqualTo(String value) {
            addCriterion("modifyUser =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(String value) {
            addCriterion("modifyUser <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(String value) {
            addCriterion("modifyUser >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(String value) {
            addCriterion("modifyUser >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(String value) {
            addCriterion("modifyUser <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(String value) {
            addCriterion("modifyUser <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLike(String value) {
            addCriterion("modifyUser like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotLike(String value) {
            addCriterion("modifyUser not like", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<String> values) {
            addCriterion("modifyUser in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<String> values) {
            addCriterion("modifyUser not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(String value1, String value2) {
            addCriterion("modifyUser between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(String value1, String value2) {
            addCriterion("modifyUser not between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedIsNull() {
            addCriterion("priceModified is null");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedIsNotNull() {
            addCriterion("priceModified is not null");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedEqualTo(String value) {
            addCriterion("priceModified =", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedNotEqualTo(String value) {
            addCriterion("priceModified <>", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedGreaterThan(String value) {
            addCriterion("priceModified >", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedGreaterThanOrEqualTo(String value) {
            addCriterion("priceModified >=", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedLessThan(String value) {
            addCriterion("priceModified <", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedLessThanOrEqualTo(String value) {
            addCriterion("priceModified <=", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedLike(String value) {
            addCriterion("priceModified like", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedNotLike(String value) {
            addCriterion("priceModified not like", value, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedIn(List<String> values) {
            addCriterion("priceModified in", values, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedNotIn(List<String> values) {
            addCriterion("priceModified not in", values, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedBetween(String value1, String value2) {
            addCriterion("priceModified between", value1, value2, "pricemodified");
            return (Criteria) this;
        }

        public Criteria andPricemodifiedNotBetween(String value1, String value2) {
            addCriterion("priceModified not between", value1, value2, "pricemodified");
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

        public Criteria andIntegralpriceIsNull() {
            addCriterion("integralPrice is null");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceIsNotNull() {
            addCriterion("integralPrice is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceEqualTo(Double value) {
            addCriterion("integralPrice =", value, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceNotEqualTo(Double value) {
            addCriterion("integralPrice <>", value, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceGreaterThan(Double value) {
            addCriterion("integralPrice >", value, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("integralPrice >=", value, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceLessThan(Double value) {
            addCriterion("integralPrice <", value, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceLessThanOrEqualTo(Double value) {
            addCriterion("integralPrice <=", value, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceIn(List<Double> values) {
            addCriterion("integralPrice in", values, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceNotIn(List<Double> values) {
            addCriterion("integralPrice not in", values, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceBetween(Double value1, Double value2) {
            addCriterion("integralPrice between", value1, value2, "integralprice");
            return (Criteria) this;
        }

        public Criteria andIntegralpriceNotBetween(Double value1, Double value2) {
            addCriterion("integralPrice not between", value1, value2, "integralprice");
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

        public Criteria andIspayIsNull() {
            addCriterion("isPay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("isPay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(String value) {
            addCriterion("isPay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(String value) {
            addCriterion("isPay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(String value) {
            addCriterion("isPay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(String value) {
            addCriterion("isPay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(String value) {
            addCriterion("isPay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(String value) {
            addCriterion("isPay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLike(String value) {
            addCriterion("isPay like", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotLike(String value) {
            addCriterion("isPay not like", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<String> values) {
            addCriterion("isPay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<String> values) {
            addCriterion("isPay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(String value1, String value2) {
            addCriterion("isPay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(String value1, String value2) {
            addCriterion("isPay not between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIssendIsNull() {
            addCriterion("isSend is null");
            return (Criteria) this;
        }

        public Criteria andIssendIsNotNull() {
            addCriterion("isSend is not null");
            return (Criteria) this;
        }

        public Criteria andIssendEqualTo(String value) {
            addCriterion("isSend =", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotEqualTo(String value) {
            addCriterion("isSend <>", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThan(String value) {
            addCriterion("isSend >", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendGreaterThanOrEqualTo(String value) {
            addCriterion("isSend >=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThan(String value) {
            addCriterion("isSend <", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLessThanOrEqualTo(String value) {
            addCriterion("isSend <=", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendLike(String value) {
            addCriterion("isSend like", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotLike(String value) {
            addCriterion("isSend not like", value, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendIn(List<String> values) {
            addCriterion("isSend in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotIn(List<String> values) {
            addCriterion("isSend not in", values, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendBetween(String value1, String value2) {
            addCriterion("isSend between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andIssendNotBetween(String value1, String value2) {
            addCriterion("isSend not between", value1, value2, "issend");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNull() {
            addCriterion("isReceive is null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNotNull() {
            addCriterion("isReceive is not null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveEqualTo(String value) {
            addCriterion("isReceive =", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotEqualTo(String value) {
            addCriterion("isReceive <>", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThan(String value) {
            addCriterion("isReceive >", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThanOrEqualTo(String value) {
            addCriterion("isReceive >=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThan(String value) {
            addCriterion("isReceive <", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThanOrEqualTo(String value) {
            addCriterion("isReceive <=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLike(String value) {
            addCriterion("isReceive like", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotLike(String value) {
            addCriterion("isReceive not like", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIn(List<String> values) {
            addCriterion("isReceive in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotIn(List<String> values) {
            addCriterion("isReceive not in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveBetween(String value1, String value2) {
            addCriterion("isReceive between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotBetween(String value1, String value2) {
            addCriterion("isReceive not between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDelwayIsNull() {
            addCriterion("delWay is null");
            return (Criteria) this;
        }

        public Criteria andDelwayIsNotNull() {
            addCriterion("delWay is not null");
            return (Criteria) this;
        }

        public Criteria andDelwayEqualTo(String value) {
            addCriterion("delWay =", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayNotEqualTo(String value) {
            addCriterion("delWay <>", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayGreaterThan(String value) {
            addCriterion("delWay >", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayGreaterThanOrEqualTo(String value) {
            addCriterion("delWay >=", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayLessThan(String value) {
            addCriterion("delWay <", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayLessThanOrEqualTo(String value) {
            addCriterion("delWay <=", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayLike(String value) {
            addCriterion("delWay like", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayNotLike(String value) {
            addCriterion("delWay not like", value, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayIn(List<String> values) {
            addCriterion("delWay in", values, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayNotIn(List<String> values) {
            addCriterion("delWay not in", values, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayBetween(String value1, String value2) {
            addCriterion("delWay between", value1, value2, "delway");
            return (Criteria) this;
        }

        public Criteria andDelwayNotBetween(String value1, String value2) {
            addCriterion("delWay not between", value1, value2, "delway");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNull() {
            addCriterion("getTime is null");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNotNull() {
            addCriterion("getTime is not null");
            return (Criteria) this;
        }

        public Criteria andGettimeEqualTo(Date value) {
            addCriterion("getTime =", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotEqualTo(Date value) {
            addCriterion("getTime <>", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThan(Date value) {
            addCriterion("getTime >", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("getTime >=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThan(Date value) {
            addCriterion("getTime <", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThanOrEqualTo(Date value) {
            addCriterion("getTime <=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeIn(List<Date> values) {
            addCriterion("getTime in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotIn(List<Date> values) {
            addCriterion("getTime not in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeBetween(Date value1, Date value2) {
            addCriterion("getTime between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotBetween(Date value1, Date value2) {
            addCriterion("getTime not between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andReveivenameIsNull() {
            addCriterion("reveiveName is null");
            return (Criteria) this;
        }

        public Criteria andReveivenameIsNotNull() {
            addCriterion("reveiveName is not null");
            return (Criteria) this;
        }

        public Criteria andReveivenameEqualTo(String value) {
            addCriterion("reveiveName =", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameNotEqualTo(String value) {
            addCriterion("reveiveName <>", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameGreaterThan(String value) {
            addCriterion("reveiveName >", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameGreaterThanOrEqualTo(String value) {
            addCriterion("reveiveName >=", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameLessThan(String value) {
            addCriterion("reveiveName <", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameLessThanOrEqualTo(String value) {
            addCriterion("reveiveName <=", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameLike(String value) {
            addCriterion("reveiveName like", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameNotLike(String value) {
            addCriterion("reveiveName not like", value, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameIn(List<String> values) {
            addCriterion("reveiveName in", values, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameNotIn(List<String> values) {
            addCriterion("reveiveName not in", values, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameBetween(String value1, String value2) {
            addCriterion("reveiveName between", value1, value2, "reveivename");
            return (Criteria) this;
        }

        public Criteria andReveivenameNotBetween(String value1, String value2) {
            addCriterion("reveiveName not between", value1, value2, "reveivename");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("orderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("orderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("orderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("orderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("orderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("orderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("orderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("orderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("orderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("orderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("orderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendTime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendTime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendTime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendTime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendTime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendTime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendTime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendTime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendTime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendTime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendTime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receiveTime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receiveTime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receiveTime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveTime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receiveTime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receiveTime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receiveTime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receiveTime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receiveTime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receiveTime not between", value1, value2, "receivetime");
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

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andBalancepayIsNull() {
            addCriterion("balancePay is null");
            return (Criteria) this;
        }

        public Criteria andBalancepayIsNotNull() {
            addCriterion("balancePay is not null");
            return (Criteria) this;
        }

        public Criteria andBalancepayEqualTo(Double value) {
            addCriterion("balancePay =", value, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayNotEqualTo(Double value) {
            addCriterion("balancePay <>", value, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayGreaterThan(Double value) {
            addCriterion("balancePay >", value, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayGreaterThanOrEqualTo(Double value) {
            addCriterion("balancePay >=", value, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayLessThan(Double value) {
            addCriterion("balancePay <", value, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayLessThanOrEqualTo(Double value) {
            addCriterion("balancePay <=", value, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayIn(List<Double> values) {
            addCriterion("balancePay in", values, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayNotIn(List<Double> values) {
            addCriterion("balancePay not in", values, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayBetween(Double value1, Double value2) {
            addCriterion("balancePay between", value1, value2, "balancepay");
            return (Criteria) this;
        }

        public Criteria andBalancepayNotBetween(Double value1, Double value2) {
            addCriterion("balancePay not between", value1, value2, "balancepay");
            return (Criteria) this;
        }

        public Criteria andUsercouponsIsNull() {
            addCriterion("userCoupons is null");
            return (Criteria) this;
        }

        public Criteria andUsercouponsIsNotNull() {
            addCriterion("userCoupons is not null");
            return (Criteria) this;
        }

        public Criteria andUsercouponsEqualTo(String value) {
            addCriterion("userCoupons =", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsNotEqualTo(String value) {
            addCriterion("userCoupons <>", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsGreaterThan(String value) {
            addCriterion("userCoupons >", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsGreaterThanOrEqualTo(String value) {
            addCriterion("userCoupons >=", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsLessThan(String value) {
            addCriterion("userCoupons <", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsLessThanOrEqualTo(String value) {
            addCriterion("userCoupons <=", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsLike(String value) {
            addCriterion("userCoupons like", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsNotLike(String value) {
            addCriterion("userCoupons not like", value, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsIn(List<String> values) {
            addCriterion("userCoupons in", values, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsNotIn(List<String> values) {
            addCriterion("userCoupons not in", values, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsBetween(String value1, String value2) {
            addCriterion("userCoupons between", value1, value2, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andUsercouponsNotBetween(String value1, String value2) {
            addCriterion("userCoupons not between", value1, value2, "usercoupons");
            return (Criteria) this;
        }

        public Criteria andCouponspayIsNull() {
            addCriterion("couponsPay is null");
            return (Criteria) this;
        }

        public Criteria andCouponspayIsNotNull() {
            addCriterion("couponsPay is not null");
            return (Criteria) this;
        }

        public Criteria andCouponspayEqualTo(Integer value) {
            addCriterion("couponsPay =", value, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayNotEqualTo(Integer value) {
            addCriterion("couponsPay <>", value, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayGreaterThan(Integer value) {
            addCriterion("couponsPay >", value, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponsPay >=", value, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayLessThan(Integer value) {
            addCriterion("couponsPay <", value, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayLessThanOrEqualTo(Integer value) {
            addCriterion("couponsPay <=", value, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayIn(List<Integer> values) {
            addCriterion("couponsPay in", values, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayNotIn(List<Integer> values) {
            addCriterion("couponsPay not in", values, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayBetween(Integer value1, Integer value2) {
            addCriterion("couponsPay between", value1, value2, "couponspay");
            return (Criteria) this;
        }

        public Criteria andCouponspayNotBetween(Integer value1, Integer value2) {
            addCriterion("couponsPay not between", value1, value2, "couponspay");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyIsNull() {
            addCriterion("subtractMoney is null");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyIsNotNull() {
            addCriterion("subtractMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyEqualTo(Integer value) {
            addCriterion("subtractMoney =", value, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyNotEqualTo(Integer value) {
            addCriterion("subtractMoney <>", value, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyGreaterThan(Integer value) {
            addCriterion("subtractMoney >", value, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("subtractMoney >=", value, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyLessThan(Integer value) {
            addCriterion("subtractMoney <", value, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("subtractMoney <=", value, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyIn(List<Integer> values) {
            addCriterion("subtractMoney in", values, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyNotIn(List<Integer> values) {
            addCriterion("subtractMoney not in", values, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyBetween(Integer value1, Integer value2) {
            addCriterion("subtractMoney between", value1, value2, "subtractmoney");
            return (Criteria) this;
        }

        public Criteria andSubtractmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("subtractMoney not between", value1, value2, "subtractmoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return this;
        }

        public Criteria andModifyuserLikeInsensitive(String value) {
            addCriterion("upper(modifyUser) like", value.toUpperCase(), "modifyuser");
            return this;
        }

        public Criteria andPricemodifiedLikeInsensitive(String value) {
            addCriterion("upper(priceModified) like", value.toUpperCase(), "pricemodified");
            return this;
        }

        public Criteria andIspayLikeInsensitive(String value) {
            addCriterion("upper(isPay) like", value.toUpperCase(), "ispay");
            return this;
        }

        public Criteria andIssendLikeInsensitive(String value) {
            addCriterion("upper(isSend) like", value.toUpperCase(), "issend");
            return this;
        }

        public Criteria andIsreceiveLikeInsensitive(String value) {
            addCriterion("upper(isReceive) like", value.toUpperCase(), "isreceive");
            return this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return this;
        }

        public Criteria andDelwayLikeInsensitive(String value) {
            addCriterion("upper(delWay) like", value.toUpperCase(), "delway");
            return this;
        }

        public Criteria andReveivenameLikeInsensitive(String value) {
            addCriterion("upper(reveiveName) like", value.toUpperCase(), "reveivename");
            return this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return this;
        }

        public Criteria andPaywayLikeInsensitive(String value) {
            addCriterion("upper(payway) like", value.toUpperCase(), "payway");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
        }

        public Criteria andUsercouponsLikeInsensitive(String value) {
            addCriterion("upper(userCoupons) like", value.toUpperCase(), "usercoupons");
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