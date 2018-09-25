package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.List;

public class MsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public MsgExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNull() {
            addCriterion("msgtype is null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNotNull() {
            addCriterion("msgtype is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeEqualTo(String value) {
            addCriterion("msgtype =", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotEqualTo(String value) {
            addCriterion("msgtype <>", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThan(String value) {
            addCriterion("msgtype >", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("msgtype >=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThan(String value) {
            addCriterion("msgtype <", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThanOrEqualTo(String value) {
            addCriterion("msgtype <=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLike(String value) {
            addCriterion("msgtype like", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotLike(String value) {
            addCriterion("msgtype not like", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIn(List<String> values) {
            addCriterion("msgtype in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotIn(List<String> values) {
            addCriterion("msgtype not in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeBetween(String value1, String value2) {
            addCriterion("msgtype between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotBetween(String value1, String value2) {
            addCriterion("msgtype not between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andPicaddrIsNull() {
            addCriterion("picaddr is null");
            return (Criteria) this;
        }

        public Criteria andPicaddrIsNotNull() {
            addCriterion("picaddr is not null");
            return (Criteria) this;
        }

        public Criteria andPicaddrEqualTo(String value) {
            addCriterion("picaddr =", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrNotEqualTo(String value) {
            addCriterion("picaddr <>", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrGreaterThan(String value) {
            addCriterion("picaddr >", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("picaddr >=", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrLessThan(String value) {
            addCriterion("picaddr <", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrLessThanOrEqualTo(String value) {
            addCriterion("picaddr <=", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrLike(String value) {
            addCriterion("picaddr like", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrNotLike(String value) {
            addCriterion("picaddr not like", value, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrIn(List<String> values) {
            addCriterion("picaddr in", values, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrNotIn(List<String> values) {
            addCriterion("picaddr not in", values, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrBetween(String value1, String value2) {
            addCriterion("picaddr between", value1, value2, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicaddrNotBetween(String value1, String value2) {
            addCriterion("picaddr not between", value1, value2, "picaddr");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNull() {
            addCriterion("contenttype is null");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNotNull() {
            addCriterion("contenttype is not null");
            return (Criteria) this;
        }

        public Criteria andContenttypeEqualTo(String value) {
            addCriterion("contenttype =", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotEqualTo(String value) {
            addCriterion("contenttype <>", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThan(String value) {
            addCriterion("contenttype >", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("contenttype >=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThan(String value) {
            addCriterion("contenttype <", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThanOrEqualTo(String value) {
            addCriterion("contenttype <=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLike(String value) {
            addCriterion("contenttype like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotLike(String value) {
            addCriterion("contenttype not like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeIn(List<String> values) {
            addCriterion("contenttype in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotIn(List<String> values) {
            addCriterion("contenttype not in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeBetween(String value1, String value2) {
            addCriterion("contenttype between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotBetween(String value1, String value2) {
            addCriterion("contenttype not between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andLinkaddrIsNull() {
            addCriterion("linkaddr is null");
            return (Criteria) this;
        }

        public Criteria andLinkaddrIsNotNull() {
            addCriterion("linkaddr is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaddrEqualTo(String value) {
            addCriterion("linkaddr =", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotEqualTo(String value) {
            addCriterion("linkaddr <>", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrGreaterThan(String value) {
            addCriterion("linkaddr >", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrGreaterThanOrEqualTo(String value) {
            addCriterion("linkaddr >=", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrLessThan(String value) {
            addCriterion("linkaddr <", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrLessThanOrEqualTo(String value) {
            addCriterion("linkaddr <=", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrLike(String value) {
            addCriterion("linkaddr like", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotLike(String value) {
            addCriterion("linkaddr not like", value, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrIn(List<String> values) {
            addCriterion("linkaddr in", values, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotIn(List<String> values) {
            addCriterion("linkaddr not in", values, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrBetween(String value1, String value2) {
            addCriterion("linkaddr between", value1, value2, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andLinkaddrNotBetween(String value1, String value2) {
            addCriterion("linkaddr not between", value1, value2, "linkaddr");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andFdorderIsNull() {
            addCriterion("fdorder is null");
            return (Criteria) this;
        }

        public Criteria andFdorderIsNotNull() {
            addCriterion("fdorder is not null");
            return (Criteria) this;
        }

        public Criteria andFdorderEqualTo(String value) {
            addCriterion("fdorder =", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderNotEqualTo(String value) {
            addCriterion("fdorder <>", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderGreaterThan(String value) {
            addCriterion("fdorder >", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderGreaterThanOrEqualTo(String value) {
            addCriterion("fdorder >=", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderLessThan(String value) {
            addCriterion("fdorder <", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderLessThanOrEqualTo(String value) {
            addCriterion("fdorder <=", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderLike(String value) {
            addCriterion("fdorder like", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderNotLike(String value) {
            addCriterion("fdorder not like", value, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderIn(List<String> values) {
            addCriterion("fdorder in", values, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderNotIn(List<String> values) {
            addCriterion("fdorder not in", values, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderBetween(String value1, String value2) {
            addCriterion("fdorder between", value1, value2, "fdorder");
            return (Criteria) this;
        }

        public Criteria andFdorderNotBetween(String value1, String value2) {
            addCriterion("fdorder not between", value1, value2, "fdorder");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return this;
        }

        public Criteria andMsgtypeLikeInsensitive(String value) {
            addCriterion("upper(msgtype) like", value.toUpperCase(), "msgtype");
            return this;
        }

        public Criteria andPicaddrLikeInsensitive(String value) {
            addCriterion("upper(picaddr) like", value.toUpperCase(), "picaddr");
            return this;
        }

        public Criteria andPicLikeInsensitive(String value) {
            addCriterion("upper(pic) like", value.toUpperCase(), "pic");
            return this;
        }

        public Criteria andContenttypeLikeInsensitive(String value) {
            addCriterion("upper(contenttype) like", value.toUpperCase(), "contenttype");
            return this;
        }

        public Criteria andLinkaddrLikeInsensitive(String value) {
            addCriterion("upper(linkaddr) like", value.toUpperCase(), "linkaddr");
            return this;
        }

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
            return this;
        }

        public Criteria andFdorderLikeInsensitive(String value) {
            addCriterion("upper(fdorder) like", value.toUpperCase(), "fdorder");
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