package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public GoodsExample() {
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Long value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Long value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Long value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Long value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Long value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Long> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Long> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Long value1, Long value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Long value1, Long value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Long value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Long value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Long value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Long value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Long value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Long value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Long> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Long> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Long value1, Long value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Long value1, Long value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andClickcntIsNull() {
            addCriterion("clickCnt is null");
            return (Criteria) this;
        }

        public Criteria andClickcntIsNotNull() {
            addCriterion("clickCnt is not null");
            return (Criteria) this;
        }

        public Criteria andClickcntEqualTo(Long value) {
            addCriterion("clickCnt =", value, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntNotEqualTo(Long value) {
            addCriterion("clickCnt <>", value, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntGreaterThan(Long value) {
            addCriterion("clickCnt >", value, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntGreaterThanOrEqualTo(Long value) {
            addCriterion("clickCnt >=", value, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntLessThan(Long value) {
            addCriterion("clickCnt <", value, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntLessThanOrEqualTo(Long value) {
            addCriterion("clickCnt <=", value, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntIn(List<Long> values) {
            addCriterion("clickCnt in", values, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntNotIn(List<Long> values) {
            addCriterion("clickCnt not in", values, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntBetween(Long value1, Long value2) {
            addCriterion("clickCnt between", value1, value2, "clickcnt");
            return (Criteria) this;
        }

        public Criteria andClickcntNotBetween(Long value1, Long value2) {
            addCriterion("clickCnt not between", value1, value2, "clickcnt");
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

        public Criteria andSortnoIsNull() {
            addCriterion("sortno is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("sortno is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(Integer value) {
            addCriterion("sortno =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(Integer value) {
            addCriterion("sortno <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(Integer value) {
            addCriterion("sortno >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortno >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(Integer value) {
            addCriterion("sortno <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("sortno <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<Integer> values) {
            addCriterion("sortno in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<Integer> values) {
            addCriterion("sortno not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(Integer value1, Integer value2) {
            addCriterion("sortno between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sortno not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andProductaddressIsNull() {
            addCriterion("productAddress is null");
            return (Criteria) this;
        }

        public Criteria andProductaddressIsNotNull() {
            addCriterion("productAddress is not null");
            return (Criteria) this;
        }

        public Criteria andProductaddressEqualTo(String value) {
            addCriterion("productAddress =", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotEqualTo(String value) {
            addCriterion("productAddress <>", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressGreaterThan(String value) {
            addCriterion("productAddress >", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressGreaterThanOrEqualTo(String value) {
            addCriterion("productAddress >=", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressLessThan(String value) {
            addCriterion("productAddress <", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressLessThanOrEqualTo(String value) {
            addCriterion("productAddress <=", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressLike(String value) {
            addCriterion("productAddress like", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotLike(String value) {
            addCriterion("productAddress not like", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressIn(List<String> values) {
            addCriterion("productAddress in", values, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotIn(List<String> values) {
            addCriterion("productAddress not in", values, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressBetween(String value1, String value2) {
            addCriterion("productAddress between", value1, value2, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotBetween(String value1, String value2) {
            addCriterion("productAddress not between", value1, value2, "productaddress");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andWashwayIsNull() {
            addCriterion("washWay is null");
            return (Criteria) this;
        }

        public Criteria andWashwayIsNotNull() {
            addCriterion("washWay is not null");
            return (Criteria) this;
        }

        public Criteria andWashwayEqualTo(String value) {
            addCriterion("washWay =", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayNotEqualTo(String value) {
            addCriterion("washWay <>", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayGreaterThan(String value) {
            addCriterion("washWay >", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayGreaterThanOrEqualTo(String value) {
            addCriterion("washWay >=", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayLessThan(String value) {
            addCriterion("washWay <", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayLessThanOrEqualTo(String value) {
            addCriterion("washWay <=", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayLike(String value) {
            addCriterion("washWay like", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayNotLike(String value) {
            addCriterion("washWay not like", value, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayIn(List<String> values) {
            addCriterion("washWay in", values, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayNotIn(List<String> values) {
            addCriterion("washWay not in", values, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayBetween(String value1, String value2) {
            addCriterion("washWay between", value1, value2, "washway");
            return (Criteria) this;
        }

        public Criteria andWashwayNotBetween(String value1, String value2) {
            addCriterion("washWay not between", value1, value2, "washway");
            return (Criteria) this;
        }

        public Criteria andShortintroIsNull() {
            addCriterion("shortIntro is null");
            return (Criteria) this;
        }

        public Criteria andShortintroIsNotNull() {
            addCriterion("shortIntro is not null");
            return (Criteria) this;
        }

        public Criteria andShortintroEqualTo(String value) {
            addCriterion("shortIntro =", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroNotEqualTo(String value) {
            addCriterion("shortIntro <>", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroGreaterThan(String value) {
            addCriterion("shortIntro >", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroGreaterThanOrEqualTo(String value) {
            addCriterion("shortIntro >=", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroLessThan(String value) {
            addCriterion("shortIntro <", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroLessThanOrEqualTo(String value) {
            addCriterion("shortIntro <=", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroLike(String value) {
            addCriterion("shortIntro like", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroNotLike(String value) {
            addCriterion("shortIntro not like", value, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroIn(List<String> values) {
            addCriterion("shortIntro in", values, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroNotIn(List<String> values) {
            addCriterion("shortIntro not in", values, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroBetween(String value1, String value2) {
            addCriterion("shortIntro between", value1, value2, "shortintro");
            return (Criteria) this;
        }

        public Criteria andShortintroNotBetween(String value1, String value2) {
            addCriterion("shortIntro not between", value1, value2, "shortintro");
            return (Criteria) this;
        }

        public Criteria andPricejsonIsNull() {
            addCriterion("priceJson is null");
            return (Criteria) this;
        }

        public Criteria andPricejsonIsNotNull() {
            addCriterion("priceJson is not null");
            return (Criteria) this;
        }

        public Criteria andPricejsonEqualTo(String value) {
            addCriterion("priceJson =", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonNotEqualTo(String value) {
            addCriterion("priceJson <>", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonGreaterThan(String value) {
            addCriterion("priceJson >", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonGreaterThanOrEqualTo(String value) {
            addCriterion("priceJson >=", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonLessThan(String value) {
            addCriterion("priceJson <", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonLessThanOrEqualTo(String value) {
            addCriterion("priceJson <=", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonLike(String value) {
            addCriterion("priceJson like", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonNotLike(String value) {
            addCriterion("priceJson not like", value, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonIn(List<String> values) {
            addCriterion("priceJson in", values, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonNotIn(List<String> values) {
            addCriterion("priceJson not in", values, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonBetween(String value1, String value2) {
            addCriterion("priceJson between", value1, value2, "pricejson");
            return (Criteria) this;
        }

        public Criteria andPricejsonNotBetween(String value1, String value2) {
            addCriterion("priceJson not between", value1, value2, "pricejson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonIsNull() {
            addCriterion("specJson is null");
            return (Criteria) this;
        }

        public Criteria andSpecjsonIsNotNull() {
            addCriterion("specJson is not null");
            return (Criteria) this;
        }

        public Criteria andSpecjsonEqualTo(String value) {
            addCriterion("specJson =", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonNotEqualTo(String value) {
            addCriterion("specJson <>", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonGreaterThan(String value) {
            addCriterion("specJson >", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonGreaterThanOrEqualTo(String value) {
            addCriterion("specJson >=", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonLessThan(String value) {
            addCriterion("specJson <", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonLessThanOrEqualTo(String value) {
            addCriterion("specJson <=", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonLike(String value) {
            addCriterion("specJson like", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonNotLike(String value) {
            addCriterion("specJson not like", value, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonIn(List<String> values) {
            addCriterion("specJson in", values, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonNotIn(List<String> values) {
            addCriterion("specJson not in", values, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonBetween(String value1, String value2) {
            addCriterion("specJson between", value1, value2, "specjson");
            return (Criteria) this;
        }

        public Criteria andSpecjsonNotBetween(String value1, String value2) {
            addCriterion("specJson not between", value1, value2, "specjson");
            return (Criteria) this;
        }

        public Criteria andIsrecommentIsNull() {
            addCriterion("isRecomment is null");
            return (Criteria) this;
        }

        public Criteria andIsrecommentIsNotNull() {
            addCriterion("isRecomment is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecommentEqualTo(String value) {
            addCriterion("isRecomment =", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentNotEqualTo(String value) {
            addCriterion("isRecomment <>", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentGreaterThan(String value) {
            addCriterion("isRecomment >", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentGreaterThanOrEqualTo(String value) {
            addCriterion("isRecomment >=", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentLessThan(String value) {
            addCriterion("isRecomment <", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentLessThanOrEqualTo(String value) {
            addCriterion("isRecomment <=", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentLike(String value) {
            addCriterion("isRecomment like", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentNotLike(String value) {
            addCriterion("isRecomment not like", value, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentIn(List<String> values) {
            addCriterion("isRecomment in", values, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentNotIn(List<String> values) {
            addCriterion("isRecomment not in", values, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentBetween(String value1, String value2) {
            addCriterion("isRecomment between", value1, value2, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andIsrecommentNotBetween(String value1, String value2) {
            addCriterion("isRecomment not between", value1, value2, "isrecomment");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStocktypeIsNull() {
            addCriterion("stockType is null");
            return (Criteria) this;
        }

        public Criteria andStocktypeIsNotNull() {
            addCriterion("stockType is not null");
            return (Criteria) this;
        }

        public Criteria andStocktypeEqualTo(String value) {
            addCriterion("stockType =", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotEqualTo(String value) {
            addCriterion("stockType <>", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeGreaterThan(String value) {
            addCriterion("stockType >", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeGreaterThanOrEqualTo(String value) {
            addCriterion("stockType >=", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeLessThan(String value) {
            addCriterion("stockType <", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeLessThanOrEqualTo(String value) {
            addCriterion("stockType <=", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeLike(String value) {
            addCriterion("stockType like", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotLike(String value) {
            addCriterion("stockType not like", value, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeIn(List<String> values) {
            addCriterion("stockType in", values, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotIn(List<String> values) {
            addCriterion("stockType not in", values, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeBetween(String value1, String value2) {
            addCriterion("stockType between", value1, value2, "stocktype");
            return (Criteria) this;
        }

        public Criteria andStocktypeNotBetween(String value1, String value2) {
            addCriterion("stockType not between", value1, value2, "stocktype");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonIsNull() {
            addCriterion("Goods_Season is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonIsNotNull() {
            addCriterion("Goods_Season is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonEqualTo(String value) {
            addCriterion("Goods_Season =", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonNotEqualTo(String value) {
            addCriterion("Goods_Season <>", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonGreaterThan(String value) {
            addCriterion("Goods_Season >", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Season >=", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonLessThan(String value) {
            addCriterion("Goods_Season <", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonLessThanOrEqualTo(String value) {
            addCriterion("Goods_Season <=", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonLike(String value) {
            addCriterion("Goods_Season like", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonNotLike(String value) {
            addCriterion("Goods_Season not like", value, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonIn(List<String> values) {
            addCriterion("Goods_Season in", values, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonNotIn(List<String> values) {
            addCriterion("Goods_Season not in", values, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonBetween(String value1, String value2) {
            addCriterion("Goods_Season between", value1, value2, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andGoodsSeasonNotBetween(String value1, String value2) {
            addCriterion("Goods_Season not between", value1, value2, "goodsSeason");
            return (Criteria) this;
        }

        public Criteria andBrowsecntIsNull() {
            addCriterion("browseCnt is null");
            return (Criteria) this;
        }

        public Criteria andBrowsecntIsNotNull() {
            addCriterion("browseCnt is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsecntEqualTo(Integer value) {
            addCriterion("browseCnt =", value, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntNotEqualTo(Integer value) {
            addCriterion("browseCnt <>", value, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntGreaterThan(Integer value) {
            addCriterion("browseCnt >", value, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("browseCnt >=", value, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntLessThan(Integer value) {
            addCriterion("browseCnt <", value, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntLessThanOrEqualTo(Integer value) {
            addCriterion("browseCnt <=", value, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntIn(List<Integer> values) {
            addCriterion("browseCnt in", values, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntNotIn(List<Integer> values) {
            addCriterion("browseCnt not in", values, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntBetween(Integer value1, Integer value2) {
            addCriterion("browseCnt between", value1, value2, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andBrowsecntNotBetween(Integer value1, Integer value2) {
            addCriterion("browseCnt not between", value1, value2, "browsecnt");
            return (Criteria) this;
        }

        public Criteria andGoodsyearIsNull() {
            addCriterion("goodsYear is null");
            return (Criteria) this;
        }

        public Criteria andGoodsyearIsNotNull() {
            addCriterion("goodsYear is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsyearEqualTo(String value) {
            addCriterion("goodsYear =", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearNotEqualTo(String value) {
            addCriterion("goodsYear <>", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearGreaterThan(String value) {
            addCriterion("goodsYear >", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearGreaterThanOrEqualTo(String value) {
            addCriterion("goodsYear >=", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearLessThan(String value) {
            addCriterion("goodsYear <", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearLessThanOrEqualTo(String value) {
            addCriterion("goodsYear <=", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearLike(String value) {
            addCriterion("goodsYear like", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearNotLike(String value) {
            addCriterion("goodsYear not like", value, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearIn(List<String> values) {
            addCriterion("goodsYear in", values, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearNotIn(List<String> values) {
            addCriterion("goodsYear not in", values, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearBetween(String value1, String value2) {
            addCriterion("goodsYear between", value1, value2, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andGoodsyearNotBetween(String value1, String value2) {
            addCriterion("goodsYear not between", value1, value2, "goodsyear");
            return (Criteria) this;
        }

        public Criteria andStyletypeidIsNull() {
            addCriterion("styleTypeid is null");
            return (Criteria) this;
        }

        public Criteria andStyletypeidIsNotNull() {
            addCriterion("styleTypeid is not null");
            return (Criteria) this;
        }

        public Criteria andStyletypeidEqualTo(Long value) {
            addCriterion("styleTypeid =", value, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidNotEqualTo(Long value) {
            addCriterion("styleTypeid <>", value, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidGreaterThan(Long value) {
            addCriterion("styleTypeid >", value, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("styleTypeid >=", value, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidLessThan(Long value) {
            addCriterion("styleTypeid <", value, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidLessThanOrEqualTo(Long value) {
            addCriterion("styleTypeid <=", value, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidIn(List<Long> values) {
            addCriterion("styleTypeid in", values, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidNotIn(List<Long> values) {
            addCriterion("styleTypeid not in", values, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidBetween(Long value1, Long value2) {
            addCriterion("styleTypeid between", value1, value2, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andStyletypeidNotBetween(Long value1, Long value2) {
            addCriterion("styleTypeid not between", value1, value2, "styletypeid");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNull() {
            addCriterion("isDiscount is null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNotNull() {
            addCriterion("isDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountEqualTo(String value) {
            addCriterion("isDiscount =", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotEqualTo(String value) {
            addCriterion("isDiscount <>", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThan(String value) {
            addCriterion("isDiscount >", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThanOrEqualTo(String value) {
            addCriterion("isDiscount >=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThan(String value) {
            addCriterion("isDiscount <", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThanOrEqualTo(String value) {
            addCriterion("isDiscount <=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLike(String value) {
            addCriterion("isDiscount like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotLike(String value) {
            addCriterion("isDiscount not like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIn(List<String> values) {
            addCriterion("isDiscount in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotIn(List<String> values) {
            addCriterion("isDiscount not in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountBetween(String value1, String value2) {
            addCriterion("isDiscount between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotBetween(String value1, String value2) {
            addCriterion("isDiscount not between", value1, value2, "isdiscount");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andSoldcntIsNull() {
            addCriterion("soldCnt is null");
            return (Criteria) this;
        }

        public Criteria andSoldcntIsNotNull() {
            addCriterion("soldCnt is not null");
            return (Criteria) this;
        }

        public Criteria andSoldcntEqualTo(Integer value) {
            addCriterion("soldCnt =", value, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntNotEqualTo(Integer value) {
            addCriterion("soldCnt <>", value, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntGreaterThan(Integer value) {
            addCriterion("soldCnt >", value, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("soldCnt >=", value, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntLessThan(Integer value) {
            addCriterion("soldCnt <", value, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntLessThanOrEqualTo(Integer value) {
            addCriterion("soldCnt <=", value, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntIn(List<Integer> values) {
            addCriterion("soldCnt in", values, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntNotIn(List<Integer> values) {
            addCriterion("soldCnt not in", values, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntBetween(Integer value1, Integer value2) {
            addCriterion("soldCnt between", value1, value2, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andSoldcntNotBetween(Integer value1, Integer value2) {
            addCriterion("soldCnt not between", value1, value2, "soldcnt");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNull() {
            addCriterion("minPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNotNull() {
            addCriterion("minPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinpriceEqualTo(Double value) {
            addCriterion("minPrice =", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotEqualTo(Double value) {
            addCriterion("minPrice <>", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThan(Double value) {
            addCriterion("minPrice >", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("minPrice >=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThan(Double value) {
            addCriterion("minPrice <", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThanOrEqualTo(Double value) {
            addCriterion("minPrice <=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIn(List<Double> values) {
            addCriterion("minPrice in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotIn(List<Double> values) {
            addCriterion("minPrice not in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceBetween(Double value1, Double value2) {
            addCriterion("minPrice between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotBetween(Double value1, Double value2) {
            addCriterion("minPrice not between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("isnew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("isnew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(String value) {
            addCriterion("isnew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(String value) {
            addCriterion("isnew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(String value) {
            addCriterion("isnew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(String value) {
            addCriterion("isnew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(String value) {
            addCriterion("isnew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(String value) {
            addCriterion("isnew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLike(String value) {
            addCriterion("isnew like", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotLike(String value) {
            addCriterion("isnew not like", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<String> values) {
            addCriterion("isnew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<String> values) {
            addCriterion("isnew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(String value1, String value2) {
            addCriterion("isnew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(String value1, String value2) {
            addCriterion("isnew not between", value1, value2, "isnew");
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

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return this;
        }

        public Criteria andSeasonLikeInsensitive(String value) {
            addCriterion("upper(season) like", value.toUpperCase(), "season");
            return this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return this;
        }

        public Criteria andImgLikeInsensitive(String value) {
            addCriterion("upper(img) like", value.toUpperCase(), "img");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
        }

        public Criteria andProductaddressLikeInsensitive(String value) {
            addCriterion("upper(productAddress) like", value.toUpperCase(), "productaddress");
            return this;
        }

        public Criteria andMaterialLikeInsensitive(String value) {
            addCriterion("upper(material) like", value.toUpperCase(), "material");
            return this;
        }

        public Criteria andWashwayLikeInsensitive(String value) {
            addCriterion("upper(washWay) like", value.toUpperCase(), "washway");
            return this;
        }

        public Criteria andShortintroLikeInsensitive(String value) {
            addCriterion("upper(shortIntro) like", value.toUpperCase(), "shortintro");
            return this;
        }

        public Criteria andPricejsonLikeInsensitive(String value) {
            addCriterion("upper(priceJson) like", value.toUpperCase(), "pricejson");
            return this;
        }

        public Criteria andSpecjsonLikeInsensitive(String value) {
            addCriterion("upper(specJson) like", value.toUpperCase(), "specjson");
            return this;
        }

        public Criteria andIsrecommentLikeInsensitive(String value) {
            addCriterion("upper(isRecomment) like", value.toUpperCase(), "isrecomment");
            return this;
        }

        public Criteria andUnitLikeInsensitive(String value) {
            addCriterion("upper(unit) like", value.toUpperCase(), "unit");
            return this;
        }

        public Criteria andStandardLikeInsensitive(String value) {
            addCriterion("upper(standard) like", value.toUpperCase(), "standard");
            return this;
        }

        public Criteria andStocktypeLikeInsensitive(String value) {
            addCriterion("upper(stockType) like", value.toUpperCase(), "stocktype");
            return this;
        }

        public Criteria andGoodsSeasonLikeInsensitive(String value) {
            addCriterion("upper(Goods_Season) like", value.toUpperCase(), "goodsSeason");
            return this;
        }

        public Criteria andGoodsyearLikeInsensitive(String value) {
            addCriterion("upper(goodsYear) like", value.toUpperCase(), "goodsyear");
            return this;
        }

        public Criteria andIsdiscountLikeInsensitive(String value) {
            addCriterion("upper(isDiscount) like", value.toUpperCase(), "isdiscount");
            return this;
        }

        public Criteria andIsnewLikeInsensitive(String value) {
            addCriterion("upper(isnew) like", value.toUpperCase(), "isnew");
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