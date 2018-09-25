package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.List;

public class LevelSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public LevelSettingExample() {
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

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andLevelstartIsNull() {
            addCriterion("levelstart is null");
            return (Criteria) this;
        }

        public Criteria andLevelstartIsNotNull() {
            addCriterion("levelstart is not null");
            return (Criteria) this;
        }

        public Criteria andLevelstartEqualTo(Integer value) {
            addCriterion("levelstart =", value, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartNotEqualTo(Integer value) {
            addCriterion("levelstart <>", value, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartGreaterThan(Integer value) {
            addCriterion("levelstart >", value, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelstart >=", value, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartLessThan(Integer value) {
            addCriterion("levelstart <", value, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartLessThanOrEqualTo(Integer value) {
            addCriterion("levelstart <=", value, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartIn(List<Integer> values) {
            addCriterion("levelstart in", values, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartNotIn(List<Integer> values) {
            addCriterion("levelstart not in", values, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartBetween(Integer value1, Integer value2) {
            addCriterion("levelstart between", value1, value2, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelstartNotBetween(Integer value1, Integer value2) {
            addCriterion("levelstart not between", value1, value2, "levelstart");
            return (Criteria) this;
        }

        public Criteria andLevelendIsNull() {
            addCriterion("levelend is null");
            return (Criteria) this;
        }

        public Criteria andLevelendIsNotNull() {
            addCriterion("levelend is not null");
            return (Criteria) this;
        }

        public Criteria andLevelendEqualTo(Integer value) {
            addCriterion("levelend =", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendNotEqualTo(Integer value) {
            addCriterion("levelend <>", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendGreaterThan(Integer value) {
            addCriterion("levelend >", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelend >=", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendLessThan(Integer value) {
            addCriterion("levelend <", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendLessThanOrEqualTo(Integer value) {
            addCriterion("levelend <=", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendIn(List<Integer> values) {
            addCriterion("levelend in", values, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendNotIn(List<Integer> values) {
            addCriterion("levelend not in", values, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendBetween(Integer value1, Integer value2) {
            addCriterion("levelend between", value1, value2, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendNotBetween(Integer value1, Integer value2) {
            addCriterion("levelend not between", value1, value2, "levelend");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNull() {
            addCriterion("gradename is null");
            return (Criteria) this;
        }

        public Criteria andGradenameIsNotNull() {
            addCriterion("gradename is not null");
            return (Criteria) this;
        }

        public Criteria andGradenameEqualTo(String value) {
            addCriterion("gradename =", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotEqualTo(String value) {
            addCriterion("gradename <>", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThan(String value) {
            addCriterion("gradename >", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameGreaterThanOrEqualTo(String value) {
            addCriterion("gradename >=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThan(String value) {
            addCriterion("gradename <", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLessThanOrEqualTo(String value) {
            addCriterion("gradename <=", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameLike(String value) {
            addCriterion("gradename like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotLike(String value) {
            addCriterion("gradename not like", value, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameIn(List<String> values) {
            addCriterion("gradename in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotIn(List<String> values) {
            addCriterion("gradename not in", values, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameBetween(String value1, String value2) {
            addCriterion("gradename between", value1, value2, "gradename");
            return (Criteria) this;
        }

        public Criteria andGradenameNotBetween(String value1, String value2) {
            addCriterion("gradename not between", value1, value2, "gradename");
            return (Criteria) this;
        }

        public Criteria andPointspeedIsNull() {
            addCriterion("pointSpeed is null");
            return (Criteria) this;
        }

        public Criteria andPointspeedIsNotNull() {
            addCriterion("pointSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andPointspeedEqualTo(Float value) {
            addCriterion("pointSpeed =", value, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedNotEqualTo(Float value) {
            addCriterion("pointSpeed <>", value, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedGreaterThan(Float value) {
            addCriterion("pointSpeed >", value, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedGreaterThanOrEqualTo(Float value) {
            addCriterion("pointSpeed >=", value, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedLessThan(Float value) {
            addCriterion("pointSpeed <", value, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedLessThanOrEqualTo(Float value) {
            addCriterion("pointSpeed <=", value, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedIn(List<Float> values) {
            addCriterion("pointSpeed in", values, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedNotIn(List<Float> values) {
            addCriterion("pointSpeed not in", values, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedBetween(Float value1, Float value2) {
            addCriterion("pointSpeed between", value1, value2, "pointspeed");
            return (Criteria) this;
        }

        public Criteria andPointspeedNotBetween(Float value1, Float value2) {
            addCriterion("pointSpeed not between", value1, value2, "pointspeed");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andIconLikeInsensitive(String value) {
            addCriterion("upper(icon) like", value.toUpperCase(), "icon");
            return this;
        }

        public Criteria andGradenameLikeInsensitive(String value) {
            addCriterion("upper(gradename) like", value.toUpperCase(), "gradename");
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