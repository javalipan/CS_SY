package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public MemberExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("Unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("Unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("Unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("Unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("Unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("Unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("Unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("Unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("Unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("Unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("Unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("Unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("Unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("Unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andMembercodeIsNull() {
            addCriterion("memberCode is null");
            return (Criteria) this;
        }

        public Criteria andMembercodeIsNotNull() {
            addCriterion("memberCode is not null");
            return (Criteria) this;
        }

        public Criteria andMembercodeEqualTo(String value) {
            addCriterion("memberCode =", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotEqualTo(String value) {
            addCriterion("memberCode <>", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeGreaterThan(String value) {
            addCriterion("memberCode >", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeGreaterThanOrEqualTo(String value) {
            addCriterion("memberCode >=", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLessThan(String value) {
            addCriterion("memberCode <", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLessThanOrEqualTo(String value) {
            addCriterion("memberCode <=", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeLike(String value) {
            addCriterion("memberCode like", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotLike(String value) {
            addCriterion("memberCode not like", value, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeIn(List<String> values) {
            addCriterion("memberCode in", values, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotIn(List<String> values) {
            addCriterion("memberCode not in", values, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeBetween(String value1, String value2) {
            addCriterion("memberCode between", value1, value2, "membercode");
            return (Criteria) this;
        }

        public Criteria andMembercodeNotBetween(String value1, String value2) {
            addCriterion("memberCode not between", value1, value2, "membercode");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andHeadurlIsNull() {
            addCriterion("headUrl is null");
            return (Criteria) this;
        }

        public Criteria andHeadurlIsNotNull() {
            addCriterion("headUrl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadurlEqualTo(String value) {
            addCriterion("headUrl =", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotEqualTo(String value) {
            addCriterion("headUrl <>", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlGreaterThan(String value) {
            addCriterion("headUrl >", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlGreaterThanOrEqualTo(String value) {
            addCriterion("headUrl >=", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLessThan(String value) {
            addCriterion("headUrl <", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLessThanOrEqualTo(String value) {
            addCriterion("headUrl <=", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlLike(String value) {
            addCriterion("headUrl like", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotLike(String value) {
            addCriterion("headUrl not like", value, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlIn(List<String> values) {
            addCriterion("headUrl in", values, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotIn(List<String> values) {
            addCriterion("headUrl not in", values, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlBetween(String value1, String value2) {
            addCriterion("headUrl between", value1, value2, "headurl");
            return (Criteria) this;
        }

        public Criteria andHeadurlNotBetween(String value1, String value2) {
            addCriterion("headUrl not between", value1, value2, "headurl");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
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

        public Criteria andAddressidIsNull() {
            addCriterion("addressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("addressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("addressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("addressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("addressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("addressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<Integer> values) {
            addCriterion("addressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<Integer> values) {
            addCriterion("addressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("addressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("addressId not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIsNull() {
            addCriterion("detailAddress is null");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIsNotNull() {
            addCriterion("detailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDetailaddressEqualTo(String value) {
            addCriterion("detailAddress =", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotEqualTo(String value) {
            addCriterion("detailAddress <>", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressGreaterThan(String value) {
            addCriterion("detailAddress >", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailAddress >=", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLessThan(String value) {
            addCriterion("detailAddress <", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLessThanOrEqualTo(String value) {
            addCriterion("detailAddress <=", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLike(String value) {
            addCriterion("detailAddress like", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotLike(String value) {
            addCriterion("detailAddress not like", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIn(List<String> values) {
            addCriterion("detailAddress in", values, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotIn(List<String> values) {
            addCriterion("detailAddress not in", values, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressBetween(String value1, String value2) {
            addCriterion("detailAddress between", value1, value2, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotBetween(String value1, String value2) {
            addCriterion("detailAddress not between", value1, value2, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNull() {
            addCriterion("isfinish is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNotNull() {
            addCriterion("isfinish is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishEqualTo(String value) {
            addCriterion("isfinish =", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotEqualTo(String value) {
            addCriterion("isfinish <>", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThan(String value) {
            addCriterion("isfinish >", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThanOrEqualTo(String value) {
            addCriterion("isfinish >=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThan(String value) {
            addCriterion("isfinish <", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThanOrEqualTo(String value) {
            addCriterion("isfinish <=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLike(String value) {
            addCriterion("isfinish like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotLike(String value) {
            addCriterion("isfinish not like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishIn(List<String> values) {
            addCriterion("isfinish in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotIn(List<String> values) {
            addCriterion("isfinish not in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishBetween(String value1, String value2) {
            addCriterion("isfinish between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotBetween(String value1, String value2) {
            addCriterion("isfinish not between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Double value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Double value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Double value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Double value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Double> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Double> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andMemberpointIsNull() {
            addCriterion("memberPoint is null");
            return (Criteria) this;
        }

        public Criteria andMemberpointIsNotNull() {
            addCriterion("memberPoint is not null");
            return (Criteria) this;
        }

        public Criteria andMemberpointEqualTo(Integer value) {
            addCriterion("memberPoint =", value, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointNotEqualTo(Integer value) {
            addCriterion("memberPoint <>", value, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointGreaterThan(Integer value) {
            addCriterion("memberPoint >", value, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberPoint >=", value, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointLessThan(Integer value) {
            addCriterion("memberPoint <", value, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointLessThanOrEqualTo(Integer value) {
            addCriterion("memberPoint <=", value, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointIn(List<Integer> values) {
            addCriterion("memberPoint in", values, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointNotIn(List<Integer> values) {
            addCriterion("memberPoint not in", values, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointBetween(Integer value1, Integer value2) {
            addCriterion("memberPoint between", value1, value2, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberpointNotBetween(Integer value1, Integer value2) {
            addCriterion("memberPoint not between", value1, value2, "memberpoint");
            return (Criteria) this;
        }

        public Criteria andMemberlevelIsNull() {
            addCriterion("memberLevel is null");
            return (Criteria) this;
        }

        public Criteria andMemberlevelIsNotNull() {
            addCriterion("memberLevel is not null");
            return (Criteria) this;
        }

        public Criteria andMemberlevelEqualTo(Integer value) {
            addCriterion("memberLevel =", value, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelNotEqualTo(Integer value) {
            addCriterion("memberLevel <>", value, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelGreaterThan(Integer value) {
            addCriterion("memberLevel >", value, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberLevel >=", value, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelLessThan(Integer value) {
            addCriterion("memberLevel <", value, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelLessThanOrEqualTo(Integer value) {
            addCriterion("memberLevel <=", value, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelIn(List<Integer> values) {
            addCriterion("memberLevel in", values, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelNotIn(List<Integer> values) {
            addCriterion("memberLevel not in", values, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelBetween(Integer value1, Integer value2) {
            addCriterion("memberLevel between", value1, value2, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andMemberlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("memberLevel not between", value1, value2, "memberlevel");
            return (Criteria) this;
        }

        public Criteria andIsrecwxIsNull() {
            addCriterion("isRecWx is null");
            return (Criteria) this;
        }

        public Criteria andIsrecwxIsNotNull() {
            addCriterion("isRecWx is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecwxEqualTo(String value) {
            addCriterion("isRecWx =", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxNotEqualTo(String value) {
            addCriterion("isRecWx <>", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxGreaterThan(String value) {
            addCriterion("isRecWx >", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxGreaterThanOrEqualTo(String value) {
            addCriterion("isRecWx >=", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxLessThan(String value) {
            addCriterion("isRecWx <", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxLessThanOrEqualTo(String value) {
            addCriterion("isRecWx <=", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxLike(String value) {
            addCriterion("isRecWx like", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxNotLike(String value) {
            addCriterion("isRecWx not like", value, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxIn(List<String> values) {
            addCriterion("isRecWx in", values, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxNotIn(List<String> values) {
            addCriterion("isRecWx not in", values, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxBetween(String value1, String value2) {
            addCriterion("isRecWx between", value1, value2, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecwxNotBetween(String value1, String value2) {
            addCriterion("isRecWx not between", value1, value2, "isrecwx");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgIsNull() {
            addCriterion("isRecMsg is null");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgIsNotNull() {
            addCriterion("isRecMsg is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgEqualTo(String value) {
            addCriterion("isRecMsg =", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgNotEqualTo(String value) {
            addCriterion("isRecMsg <>", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgGreaterThan(String value) {
            addCriterion("isRecMsg >", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgGreaterThanOrEqualTo(String value) {
            addCriterion("isRecMsg >=", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgLessThan(String value) {
            addCriterion("isRecMsg <", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgLessThanOrEqualTo(String value) {
            addCriterion("isRecMsg <=", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgLike(String value) {
            addCriterion("isRecMsg like", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgNotLike(String value) {
            addCriterion("isRecMsg not like", value, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgIn(List<String> values) {
            addCriterion("isRecMsg in", values, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgNotIn(List<String> values) {
            addCriterion("isRecMsg not in", values, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgBetween(String value1, String value2) {
            addCriterion("isRecMsg between", value1, value2, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andIsrecmsgNotBetween(String value1, String value2) {
            addCriterion("isRecMsg not between", value1, value2, "isrecmsg");
            return (Criteria) this;
        }

        public Criteria andFromuserIsNull() {
            addCriterion("fromUser is null");
            return (Criteria) this;
        }

        public Criteria andFromuserIsNotNull() {
            addCriterion("fromUser is not null");
            return (Criteria) this;
        }

        public Criteria andFromuserEqualTo(Long value) {
            addCriterion("fromUser =", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserNotEqualTo(Long value) {
            addCriterion("fromUser <>", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserGreaterThan(Long value) {
            addCriterion("fromUser >", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserGreaterThanOrEqualTo(Long value) {
            addCriterion("fromUser >=", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserLessThan(Long value) {
            addCriterion("fromUser <", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserLessThanOrEqualTo(Long value) {
            addCriterion("fromUser <=", value, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserIn(List<Long> values) {
            addCriterion("fromUser in", values, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserNotIn(List<Long> values) {
            addCriterion("fromUser not in", values, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserBetween(Long value1, Long value2) {
            addCriterion("fromUser between", value1, value2, "fromuser");
            return (Criteria) this;
        }

        public Criteria andFromuserNotBetween(Long value1, Long value2) {
            addCriterion("fromUser not between", value1, value2, "fromuser");
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

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNull() {
            addCriterion("cancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNotNull() {
            addCriterion("cancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeEqualTo(Date value) {
            addCriterion("cancelTime =", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotEqualTo(Date value) {
            addCriterion("cancelTime <>", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThan(Date value) {
            addCriterion("cancelTime >", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancelTime >=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThan(Date value) {
            addCriterion("cancelTime <", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("cancelTime <=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIn(List<Date> values) {
            addCriterion("cancelTime in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotIn(List<Date> values) {
            addCriterion("cancelTime not in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeBetween(Date value1, Date value2) {
            addCriterion("cancelTime between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("cancelTime not between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
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

        public Criteria andOldornewIsNull() {
            addCriterion("oldornew is null");
            return (Criteria) this;
        }

        public Criteria andOldornewIsNotNull() {
            addCriterion("oldornew is not null");
            return (Criteria) this;
        }

        public Criteria andOldornewEqualTo(String value) {
            addCriterion("oldornew =", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewNotEqualTo(String value) {
            addCriterion("oldornew <>", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewGreaterThan(String value) {
            addCriterion("oldornew >", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewGreaterThanOrEqualTo(String value) {
            addCriterion("oldornew >=", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewLessThan(String value) {
            addCriterion("oldornew <", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewLessThanOrEqualTo(String value) {
            addCriterion("oldornew <=", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewLike(String value) {
            addCriterion("oldornew like", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewNotLike(String value) {
            addCriterion("oldornew not like", value, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewIn(List<String> values) {
            addCriterion("oldornew in", values, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewNotIn(List<String> values) {
            addCriterion("oldornew not in", values, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewBetween(String value1, String value2) {
            addCriterion("oldornew between", value1, value2, "oldornew");
            return (Criteria) this;
        }

        public Criteria andOldornewNotBetween(String value1, String value2) {
            addCriterion("oldornew not between", value1, value2, "oldornew");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeIsNull() {
            addCriterion("lastBuyTime is null");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeIsNotNull() {
            addCriterion("lastBuyTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeEqualTo(Date value) {
            addCriterion("lastBuyTime =", value, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeNotEqualTo(Date value) {
            addCriterion("lastBuyTime <>", value, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeGreaterThan(Date value) {
            addCriterion("lastBuyTime >", value, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastBuyTime >=", value, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeLessThan(Date value) {
            addCriterion("lastBuyTime <", value, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeLessThanOrEqualTo(Date value) {
            addCriterion("lastBuyTime <=", value, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeIn(List<Date> values) {
            addCriterion("lastBuyTime in", values, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeNotIn(List<Date> values) {
            addCriterion("lastBuyTime not in", values, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeBetween(Date value1, Date value2) {
            addCriterion("lastBuyTime between", value1, value2, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLastbuytimeNotBetween(Date value1, Date value2) {
            addCriterion("lastBuyTime not between", value1, value2, "lastbuytime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeIsNull() {
            addCriterion("levelChangeTime is null");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeIsNotNull() {
            addCriterion("levelChangeTime is not null");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeEqualTo(Date value) {
            addCriterion("levelChangeTime =", value, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeNotEqualTo(Date value) {
            addCriterion("levelChangeTime <>", value, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeGreaterThan(Date value) {
            addCriterion("levelChangeTime >", value, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("levelChangeTime >=", value, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeLessThan(Date value) {
            addCriterion("levelChangeTime <", value, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeLessThanOrEqualTo(Date value) {
            addCriterion("levelChangeTime <=", value, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeIn(List<Date> values) {
            addCriterion("levelChangeTime in", values, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeNotIn(List<Date> values) {
            addCriterion("levelChangeTime not in", values, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeBetween(Date value1, Date value2) {
            addCriterion("levelChangeTime between", value1, value2, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andLevelchangetimeNotBetween(Date value1, Date value2) {
            addCriterion("levelChangeTime not between", value1, value2, "levelchangetime");
            return (Criteria) this;
        }

        public Criteria andMembertypeIsNull() {
            addCriterion("memberType is null");
            return (Criteria) this;
        }

        public Criteria andMembertypeIsNotNull() {
            addCriterion("memberType is not null");
            return (Criteria) this;
        }

        public Criteria andMembertypeEqualTo(String value) {
            addCriterion("memberType =", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotEqualTo(String value) {
            addCriterion("memberType <>", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeGreaterThan(String value) {
            addCriterion("memberType >", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeGreaterThanOrEqualTo(String value) {
            addCriterion("memberType >=", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeLessThan(String value) {
            addCriterion("memberType <", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeLessThanOrEqualTo(String value) {
            addCriterion("memberType <=", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeLike(String value) {
            addCriterion("memberType like", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotLike(String value) {
            addCriterion("memberType not like", value, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeIn(List<String> values) {
            addCriterion("memberType in", values, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotIn(List<String> values) {
            addCriterion("memberType not in", values, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeBetween(String value1, String value2) {
            addCriterion("memberType between", value1, value2, "membertype");
            return (Criteria) this;
        }

        public Criteria andMembertypeNotBetween(String value1, String value2) {
            addCriterion("memberType not between", value1, value2, "membertype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(openid) like", value.toUpperCase(), "openid");
            return this;
        }

        public Criteria andUnionidLikeInsensitive(String value) {
            addCriterion("upper(Unionid) like", value.toUpperCase(), "unionid");
            return this;
        }

        public Criteria andMembercodeLikeInsensitive(String value) {
            addCriterion("upper(memberCode) like", value.toUpperCase(), "membercode");
            return this;
        }

        public Criteria andNicknameLikeInsensitive(String value) {
            addCriterion("upper(nickname) like", value.toUpperCase(), "nickname");
            return this;
        }

        public Criteria andHeadurlLikeInsensitive(String value) {
            addCriterion("upper(headUrl) like", value.toUpperCase(), "headurl");
            return this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return this;
        }

        public Criteria andDetailaddressLikeInsensitive(String value) {
            addCriterion("upper(detailAddress) like", value.toUpperCase(), "detailaddress");
            return this;
        }

        public Criteria andIsfinishLikeInsensitive(String value) {
            addCriterion("upper(isfinish) like", value.toUpperCase(), "isfinish");
            return this;
        }

        public Criteria andIsrecwxLikeInsensitive(String value) {
            addCriterion("upper(isRecWx) like", value.toUpperCase(), "isrecwx");
            return this;
        }

        public Criteria andIsrecmsgLikeInsensitive(String value) {
            addCriterion("upper(isRecMsg) like", value.toUpperCase(), "isrecmsg");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
        }

        public Criteria andOldornewLikeInsensitive(String value) {
            addCriterion("upper(oldornew) like", value.toUpperCase(), "oldornew");
            return this;
        }

        public Criteria andMembertypeLikeInsensitive(String value) {
            addCriterion("upper(memberType) like", value.toUpperCase(), "membertype");
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