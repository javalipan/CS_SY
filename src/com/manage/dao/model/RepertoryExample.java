package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepertoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public RepertoryExample() {
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

        public Criteria andBeforeamountIsNull() {
            addCriterion("beforeAmount is null");
            return (Criteria) this;
        }

        public Criteria andBeforeamountIsNotNull() {
            addCriterion("beforeAmount is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeamountEqualTo(Integer value) {
            addCriterion("beforeAmount =", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotEqualTo(Integer value) {
            addCriterion("beforeAmount <>", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountGreaterThan(Integer value) {
            addCriterion("beforeAmount >", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("beforeAmount >=", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountLessThan(Integer value) {
            addCriterion("beforeAmount <", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountLessThanOrEqualTo(Integer value) {
            addCriterion("beforeAmount <=", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountIn(List<Integer> values) {
            addCriterion("beforeAmount in", values, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotIn(List<Integer> values) {
            addCriterion("beforeAmount not in", values, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountBetween(Integer value1, Integer value2) {
            addCriterion("beforeAmount between", value1, value2, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotBetween(Integer value1, Integer value2) {
            addCriterion("beforeAmount not between", value1, value2, "beforeamount");
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

        public Criteria andAfteramountIsNull() {
            addCriterion("afterAmount is null");
            return (Criteria) this;
        }

        public Criteria andAfteramountIsNotNull() {
            addCriterion("afterAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramountEqualTo(Integer value) {
            addCriterion("afterAmount =", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotEqualTo(Integer value) {
            addCriterion("afterAmount <>", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThan(Integer value) {
            addCriterion("afterAmount >", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterAmount >=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThan(Integer value) {
            addCriterion("afterAmount <", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThanOrEqualTo(Integer value) {
            addCriterion("afterAmount <=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountIn(List<Integer> values) {
            addCriterion("afterAmount in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotIn(List<Integer> values) {
            addCriterion("afterAmount not in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount not between", value1, value2, "afteramount");
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

        public Criteria andIntimeIsNull() {
            addCriterion("inTime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("inTime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterion("inTime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterion("inTime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterion("inTime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inTime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterion("inTime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterion("inTime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterion("inTime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterion("inTime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterion("inTime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterion("inTime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(operator) like", value.toUpperCase(), "operator");
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