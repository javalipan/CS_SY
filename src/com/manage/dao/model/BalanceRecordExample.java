package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BalanceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public BalanceRecordExample() {
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

        public Criteria andBusinessidIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Long value) {
            addCriterion("businessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Long value) {
            addCriterion("businessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Long value) {
            addCriterion("businessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Long value) {
            addCriterion("businessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Long value) {
            addCriterion("businessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Long value) {
            addCriterion("businessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Long> values) {
            addCriterion("businessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Long> values) {
            addCriterion("businessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Long value1, Long value2) {
            addCriterion("businessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Long value1, Long value2) {
            addCriterion("businessId not between", value1, value2, "businessid");
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

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andBeforeamountEqualTo(Double value) {
            addCriterion("beforeAmount =", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotEqualTo(Double value) {
            addCriterion("beforeAmount <>", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountGreaterThan(Double value) {
            addCriterion("beforeAmount >", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountGreaterThanOrEqualTo(Double value) {
            addCriterion("beforeAmount >=", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountLessThan(Double value) {
            addCriterion("beforeAmount <", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountLessThanOrEqualTo(Double value) {
            addCriterion("beforeAmount <=", value, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountIn(List<Double> values) {
            addCriterion("beforeAmount in", values, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotIn(List<Double> values) {
            addCriterion("beforeAmount not in", values, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountBetween(Double value1, Double value2) {
            addCriterion("beforeAmount between", value1, value2, "beforeamount");
            return (Criteria) this;
        }

        public Criteria andBeforeamountNotBetween(Double value1, Double value2) {
            addCriterion("beforeAmount not between", value1, value2, "beforeamount");
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

        public Criteria andAfteramountEqualTo(Double value) {
            addCriterion("afterAmount =", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotEqualTo(Double value) {
            addCriterion("afterAmount <>", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThan(Double value) {
            addCriterion("afterAmount >", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThanOrEqualTo(Double value) {
            addCriterion("afterAmount >=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThan(Double value) {
            addCriterion("afterAmount <", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThanOrEqualTo(Double value) {
            addCriterion("afterAmount <=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountIn(List<Double> values) {
            addCriterion("afterAmount in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotIn(List<Double> values) {
            addCriterion("afterAmount not in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountBetween(Double value1, Double value2) {
            addCriterion("afterAmount between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotBetween(Double value1, Double value2) {
            addCriterion("afterAmount not between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNull() {
            addCriterion("useTime is null");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNotNull() {
            addCriterion("useTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsetimeEqualTo(Date value) {
            addCriterion("useTime =", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotEqualTo(Date value) {
            addCriterion("useTime <>", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThan(Date value) {
            addCriterion("useTime >", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("useTime >=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThan(Date value) {
            addCriterion("useTime <", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThanOrEqualTo(Date value) {
            addCriterion("useTime <=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeIn(List<Date> values) {
            addCriterion("useTime in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotIn(List<Date> values) {
            addCriterion("useTime not in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeBetween(Date value1, Date value2) {
            addCriterion("useTime between", value1, value2, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotBetween(Date value1, Date value2) {
            addCriterion("useTime not between", value1, value2, "usetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
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