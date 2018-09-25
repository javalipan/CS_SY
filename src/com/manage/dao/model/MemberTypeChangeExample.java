package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberTypeChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public MemberTypeChangeExample() {
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

        public Criteria andBeforetypeIsNull() {
            addCriterion("beforeType is null");
            return (Criteria) this;
        }

        public Criteria andBeforetypeIsNotNull() {
            addCriterion("beforeType is not null");
            return (Criteria) this;
        }

        public Criteria andBeforetypeEqualTo(String value) {
            addCriterion("beforeType =", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeNotEqualTo(String value) {
            addCriterion("beforeType <>", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeGreaterThan(String value) {
            addCriterion("beforeType >", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeGreaterThanOrEqualTo(String value) {
            addCriterion("beforeType >=", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeLessThan(String value) {
            addCriterion("beforeType <", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeLessThanOrEqualTo(String value) {
            addCriterion("beforeType <=", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeLike(String value) {
            addCriterion("beforeType like", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeNotLike(String value) {
            addCriterion("beforeType not like", value, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeIn(List<String> values) {
            addCriterion("beforeType in", values, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeNotIn(List<String> values) {
            addCriterion("beforeType not in", values, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeBetween(String value1, String value2) {
            addCriterion("beforeType between", value1, value2, "beforetype");
            return (Criteria) this;
        }

        public Criteria andBeforetypeNotBetween(String value1, String value2) {
            addCriterion("beforeType not between", value1, value2, "beforetype");
            return (Criteria) this;
        }

        public Criteria andAftertypeIsNull() {
            addCriterion("afterType is null");
            return (Criteria) this;
        }

        public Criteria andAftertypeIsNotNull() {
            addCriterion("afterType is not null");
            return (Criteria) this;
        }

        public Criteria andAftertypeEqualTo(String value) {
            addCriterion("afterType =", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeNotEqualTo(String value) {
            addCriterion("afterType <>", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeGreaterThan(String value) {
            addCriterion("afterType >", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeGreaterThanOrEqualTo(String value) {
            addCriterion("afterType >=", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeLessThan(String value) {
            addCriterion("afterType <", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeLessThanOrEqualTo(String value) {
            addCriterion("afterType <=", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeLike(String value) {
            addCriterion("afterType like", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeNotLike(String value) {
            addCriterion("afterType not like", value, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeIn(List<String> values) {
            addCriterion("afterType in", values, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeNotIn(List<String> values) {
            addCriterion("afterType not in", values, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeBetween(String value1, String value2) {
            addCriterion("afterType between", value1, value2, "aftertype");
            return (Criteria) this;
        }

        public Criteria andAftertypeNotBetween(String value1, String value2) {
            addCriterion("afterType not between", value1, value2, "aftertype");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("changeTime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changeTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("changeTime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("changeTime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("changeTime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("changeTime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("changeTime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("changeTime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("changeTime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("changeTime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("changeTime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("changeTime not between", value1, value2, "changetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andBeforetypeLikeInsensitive(String value) {
            addCriterion("upper(beforeType) like", value.toUpperCase(), "beforetype");
            return this;
        }

        public Criteria andAftertypeLikeInsensitive(String value) {
            addCriterion("upper(afterType) like", value.toUpperCase(), "aftertype");
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