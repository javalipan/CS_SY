package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.List;

public class SysSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public SysSettingExample() {
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

        public Criteria andTypekeyIsNull() {
            addCriterion("typekey is null");
            return (Criteria) this;
        }

        public Criteria andTypekeyIsNotNull() {
            addCriterion("typekey is not null");
            return (Criteria) this;
        }

        public Criteria andTypekeyEqualTo(String value) {
            addCriterion("typekey =", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyNotEqualTo(String value) {
            addCriterion("typekey <>", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyGreaterThan(String value) {
            addCriterion("typekey >", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyGreaterThanOrEqualTo(String value) {
            addCriterion("typekey >=", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyLessThan(String value) {
            addCriterion("typekey <", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyLessThanOrEqualTo(String value) {
            addCriterion("typekey <=", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyLike(String value) {
            addCriterion("typekey like", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyNotLike(String value) {
            addCriterion("typekey not like", value, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyIn(List<String> values) {
            addCriterion("typekey in", values, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyNotIn(List<String> values) {
            addCriterion("typekey not in", values, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyBetween(String value1, String value2) {
            addCriterion("typekey between", value1, value2, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypekeyNotBetween(String value1, String value2) {
            addCriterion("typekey not between", value1, value2, "typekey");
            return (Criteria) this;
        }

        public Criteria andTypevalueIsNull() {
            addCriterion("typevalue is null");
            return (Criteria) this;
        }

        public Criteria andTypevalueIsNotNull() {
            addCriterion("typevalue is not null");
            return (Criteria) this;
        }

        public Criteria andTypevalueEqualTo(String value) {
            addCriterion("typevalue =", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotEqualTo(String value) {
            addCriterion("typevalue <>", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueGreaterThan(String value) {
            addCriterion("typevalue >", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueGreaterThanOrEqualTo(String value) {
            addCriterion("typevalue >=", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLessThan(String value) {
            addCriterion("typevalue <", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLessThanOrEqualTo(String value) {
            addCriterion("typevalue <=", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLike(String value) {
            addCriterion("typevalue like", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotLike(String value) {
            addCriterion("typevalue not like", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueIn(List<String> values) {
            addCriterion("typevalue in", values, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotIn(List<String> values) {
            addCriterion("typevalue not in", values, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueBetween(String value1, String value2) {
            addCriterion("typevalue between", value1, value2, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotBetween(String value1, String value2) {
            addCriterion("typevalue not between", value1, value2, "typevalue");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andTypekeyLikeInsensitive(String value) {
            addCriterion("upper(typekey) like", value.toUpperCase(), "typekey");
            return this;
        }

        public Criteria andTypevalueLikeInsensitive(String value) {
            addCriterion("upper(typevalue) like", value.toUpperCase(), "typevalue");
            return this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
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