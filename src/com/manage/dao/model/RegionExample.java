package com.manage.dao.model;

import com.manage.util.Pager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Pager pager;

    public RegionExample() {
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

        public Criteria andAddsidIsNull() {
            addCriterion("ADDSID is null");
            return (Criteria) this;
        }

        public Criteria andAddsidIsNotNull() {
            addCriterion("ADDSID is not null");
            return (Criteria) this;
        }

        public Criteria andAddsidEqualTo(Integer value) {
            addCriterion("ADDSID =", value, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidNotEqualTo(Integer value) {
            addCriterion("ADDSID <>", value, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidGreaterThan(Integer value) {
            addCriterion("ADDSID >", value, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADDSID >=", value, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidLessThan(Integer value) {
            addCriterion("ADDSID <", value, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidLessThanOrEqualTo(Integer value) {
            addCriterion("ADDSID <=", value, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidIn(List<Integer> values) {
            addCriterion("ADDSID in", values, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidNotIn(List<Integer> values) {
            addCriterion("ADDSID not in", values, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidBetween(Integer value1, Integer value2) {
            addCriterion("ADDSID between", value1, value2, "addsid");
            return (Criteria) this;
        }

        public Criteria andAddsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ADDSID not between", value1, value2, "addsid");
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

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeIsNull() {
            addCriterion("SuperiorCode is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeIsNotNull() {
            addCriterion("SuperiorCode is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeEqualTo(Integer value) {
            addCriterion("SuperiorCode =", value, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeNotEqualTo(Integer value) {
            addCriterion("SuperiorCode <>", value, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeGreaterThan(Integer value) {
            addCriterion("SuperiorCode >", value, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuperiorCode >=", value, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeLessThan(Integer value) {
            addCriterion("SuperiorCode <", value, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeLessThanOrEqualTo(Integer value) {
            addCriterion("SuperiorCode <=", value, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeIn(List<Integer> values) {
            addCriterion("SuperiorCode in", values, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeNotIn(List<Integer> values) {
            addCriterion("SuperiorCode not in", values, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeBetween(Integer value1, Integer value2) {
            addCriterion("SuperiorCode between", value1, value2, "superiorcode");
            return (Criteria) this;
        }

        public Criteria andSuperiorcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("SuperiorCode not between", value1, value2, "superiorcode");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Short value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Short value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Short value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Short value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Short value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Short> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Short> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Short value1, Short value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Short value1, Short value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIsprovinceIsNull() {
            addCriterion("isProvince is null");
            return (Criteria) this;
        }

        public Criteria andIsprovinceIsNotNull() {
            addCriterion("isProvince is not null");
            return (Criteria) this;
        }

        public Criteria andIsprovinceEqualTo(Short value) {
            addCriterion("isProvince =", value, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceNotEqualTo(Short value) {
            addCriterion("isProvince <>", value, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceGreaterThan(Short value) {
            addCriterion("isProvince >", value, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceGreaterThanOrEqualTo(Short value) {
            addCriterion("isProvince >=", value, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceLessThan(Short value) {
            addCriterion("isProvince <", value, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceLessThanOrEqualTo(Short value) {
            addCriterion("isProvince <=", value, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceIn(List<Short> values) {
            addCriterion("isProvince in", values, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceNotIn(List<Short> values) {
            addCriterion("isProvince not in", values, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceBetween(Short value1, Short value2) {
            addCriterion("isProvince between", value1, value2, "isprovince");
            return (Criteria) this;
        }

        public Criteria andIsprovinceNotBetween(Short value1, Short value2) {
            addCriterion("isProvince not between", value1, value2, "isprovince");
            return (Criteria) this;
        }

        public Criteria andCityclassifyIsNull() {
            addCriterion("CityClassify is null");
            return (Criteria) this;
        }

        public Criteria andCityclassifyIsNotNull() {
            addCriterion("CityClassify is not null");
            return (Criteria) this;
        }

        public Criteria andCityclassifyEqualTo(Short value) {
            addCriterion("CityClassify =", value, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyNotEqualTo(Short value) {
            addCriterion("CityClassify <>", value, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyGreaterThan(Short value) {
            addCriterion("CityClassify >", value, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyGreaterThanOrEqualTo(Short value) {
            addCriterion("CityClassify >=", value, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyLessThan(Short value) {
            addCriterion("CityClassify <", value, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyLessThanOrEqualTo(Short value) {
            addCriterion("CityClassify <=", value, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyIn(List<Short> values) {
            addCriterion("CityClassify in", values, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyNotIn(List<Short> values) {
            addCriterion("CityClassify not in", values, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyBetween(Short value1, Short value2) {
            addCriterion("CityClassify between", value1, value2, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andCityclassifyNotBetween(Short value1, Short value2) {
            addCriterion("CityClassify not between", value1, value2, "cityclassify");
            return (Criteria) this;
        }

        public Criteria andAbbIsNull() {
            addCriterion("Abb is null");
            return (Criteria) this;
        }

        public Criteria andAbbIsNotNull() {
            addCriterion("Abb is not null");
            return (Criteria) this;
        }

        public Criteria andAbbEqualTo(String value) {
            addCriterion("Abb =", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbNotEqualTo(String value) {
            addCriterion("Abb <>", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbGreaterThan(String value) {
            addCriterion("Abb >", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbGreaterThanOrEqualTo(String value) {
            addCriterion("Abb >=", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbLessThan(String value) {
            addCriterion("Abb <", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbLessThanOrEqualTo(String value) {
            addCriterion("Abb <=", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbLike(String value) {
            addCriterion("Abb like", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbNotLike(String value) {
            addCriterion("Abb not like", value, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbIn(List<String> values) {
            addCriterion("Abb in", values, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbNotIn(List<String> values) {
            addCriterion("Abb not in", values, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbBetween(String value1, String value2) {
            addCriterion("Abb between", value1, value2, "abb");
            return (Criteria) this;
        }

        public Criteria andAbbNotBetween(String value1, String value2) {
            addCriterion("Abb not between", value1, value2, "abb");
            return (Criteria) this;
        }

        public Criteria andSspIsNull() {
            addCriterion("SSP is null");
            return (Criteria) this;
        }

        public Criteria andSspIsNotNull() {
            addCriterion("SSP is not null");
            return (Criteria) this;
        }

        public Criteria andSspEqualTo(String value) {
            addCriterion("SSP =", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspNotEqualTo(String value) {
            addCriterion("SSP <>", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspGreaterThan(String value) {
            addCriterion("SSP >", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspGreaterThanOrEqualTo(String value) {
            addCriterion("SSP >=", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspLessThan(String value) {
            addCriterion("SSP <", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspLessThanOrEqualTo(String value) {
            addCriterion("SSP <=", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspLike(String value) {
            addCriterion("SSP like", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspNotLike(String value) {
            addCriterion("SSP not like", value, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspIn(List<String> values) {
            addCriterion("SSP in", values, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspNotIn(List<String> values) {
            addCriterion("SSP not in", values, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspBetween(String value1, String value2) {
            addCriterion("SSP between", value1, value2, "ssp");
            return (Criteria) this;
        }

        public Criteria andSspNotBetween(String value1, String value2) {
            addCriterion("SSP not between", value1, value2, "ssp");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinyin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinyin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinyin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinyin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinyin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinyin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinyin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinyin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinyin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinyin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinyin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinyin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNull() {
            addCriterion("ProvinceCode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNotNull() {
            addCriterion("ProvinceCode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeEqualTo(Integer value) {
            addCriterion("ProvinceCode =", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotEqualTo(Integer value) {
            addCriterion("ProvinceCode <>", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThan(Integer value) {
            addCriterion("ProvinceCode >", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProvinceCode >=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThan(Integer value) {
            addCriterion("ProvinceCode <", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThanOrEqualTo(Integer value) {
            addCriterion("ProvinceCode <=", value, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIn(List<Integer> values) {
            addCriterion("ProvinceCode in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotIn(List<Integer> values) {
            addCriterion("ProvinceCode not in", values, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeBetween(Integer value1, Integer value2) {
            addCriterion("ProvinceCode between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ProvinceCode not between", value1, value2, "provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNull() {
            addCriterion("ProvinceName is null");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNotNull() {
            addCriterion("ProvinceName is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenameEqualTo(String value) {
            addCriterion("ProvinceName =", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotEqualTo(String value) {
            addCriterion("ProvinceName <>", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThan(String value) {
            addCriterion("ProvinceName >", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThanOrEqualTo(String value) {
            addCriterion("ProvinceName >=", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThan(String value) {
            addCriterion("ProvinceName <", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThanOrEqualTo(String value) {
            addCriterion("ProvinceName <=", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLike(String value) {
            addCriterion("ProvinceName like", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotLike(String value) {
            addCriterion("ProvinceName not like", value, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameIn(List<String> values) {
            addCriterion("ProvinceName in", values, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotIn(List<String> values) {
            addCriterion("ProvinceName not in", values, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameBetween(String value1, String value2) {
            addCriterion("ProvinceName between", value1, value2, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotBetween(String value1, String value2) {
            addCriterion("ProvinceName not between", value1, value2, "provincename");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinIsNull() {
            addCriterion("ProvincePinYin is null");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinIsNotNull() {
            addCriterion("ProvincePinYin is not null");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinEqualTo(String value) {
            addCriterion("ProvincePinYin =", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinNotEqualTo(String value) {
            addCriterion("ProvincePinYin <>", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinGreaterThan(String value) {
            addCriterion("ProvincePinYin >", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinGreaterThanOrEqualTo(String value) {
            addCriterion("ProvincePinYin >=", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinLessThan(String value) {
            addCriterion("ProvincePinYin <", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinLessThanOrEqualTo(String value) {
            addCriterion("ProvincePinYin <=", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinLike(String value) {
            addCriterion("ProvincePinYin like", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinNotLike(String value) {
            addCriterion("ProvincePinYin not like", value, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinIn(List<String> values) {
            addCriterion("ProvincePinYin in", values, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinNotIn(List<String> values) {
            addCriterion("ProvincePinYin not in", values, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinBetween(String value1, String value2) {
            addCriterion("ProvincePinYin between", value1, value2, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andProvincepinyinNotBetween(String value1, String value2) {
            addCriterion("ProvincePinYin not between", value1, value2, "provincepinyin");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(Integer value) {
            addCriterion("CityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(Integer value) {
            addCriterion("CityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(Integer value) {
            addCriterion("CityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(Integer value) {
            addCriterion("CityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(Integer value) {
            addCriterion("CityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<Integer> values) {
            addCriterion("CityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<Integer> values) {
            addCriterion("CityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(Integer value1, Integer value2) {
            addCriterion("CityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CityCode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitypinyinIsNull() {
            addCriterion("CityPinYin is null");
            return (Criteria) this;
        }

        public Criteria andCitypinyinIsNotNull() {
            addCriterion("CityPinYin is not null");
            return (Criteria) this;
        }

        public Criteria andCitypinyinEqualTo(String value) {
            addCriterion("CityPinYin =", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinNotEqualTo(String value) {
            addCriterion("CityPinYin <>", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinGreaterThan(String value) {
            addCriterion("CityPinYin >", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinGreaterThanOrEqualTo(String value) {
            addCriterion("CityPinYin >=", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinLessThan(String value) {
            addCriterion("CityPinYin <", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinLessThanOrEqualTo(String value) {
            addCriterion("CityPinYin <=", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinLike(String value) {
            addCriterion("CityPinYin like", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinNotLike(String value) {
            addCriterion("CityPinYin not like", value, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinIn(List<String> values) {
            addCriterion("CityPinYin in", values, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinNotIn(List<String> values) {
            addCriterion("CityPinYin not in", values, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinBetween(String value1, String value2) {
            addCriterion("CityPinYin between", value1, value2, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andCitypinyinNotBetween(String value1, String value2) {
            addCriterion("CityPinYin not between", value1, value2, "citypinyin");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("AreaCode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("AreaCode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(Integer value) {
            addCriterion("AreaCode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(Integer value) {
            addCriterion("AreaCode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(Integer value) {
            addCriterion("AreaCode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaCode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(Integer value) {
            addCriterion("AreaCode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(Integer value) {
            addCriterion("AreaCode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<Integer> values) {
            addCriterion("AreaCode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<Integer> values) {
            addCriterion("AreaCode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(Integer value1, Integer value2) {
            addCriterion("AreaCode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaCode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AreaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AreaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AreaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AreaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AreaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AreaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AreaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AreaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AreaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AreaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AreaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AreaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AreaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AreaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreapinyinIsNull() {
            addCriterion("AreaPinYin is null");
            return (Criteria) this;
        }

        public Criteria andAreapinyinIsNotNull() {
            addCriterion("AreaPinYin is not null");
            return (Criteria) this;
        }

        public Criteria andAreapinyinEqualTo(String value) {
            addCriterion("AreaPinYin =", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinNotEqualTo(String value) {
            addCriterion("AreaPinYin <>", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinGreaterThan(String value) {
            addCriterion("AreaPinYin >", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinGreaterThanOrEqualTo(String value) {
            addCriterion("AreaPinYin >=", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinLessThan(String value) {
            addCriterion("AreaPinYin <", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinLessThanOrEqualTo(String value) {
            addCriterion("AreaPinYin <=", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinLike(String value) {
            addCriterion("AreaPinYin like", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinNotLike(String value) {
            addCriterion("AreaPinYin not like", value, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinIn(List<String> values) {
            addCriterion("AreaPinYin in", values, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinNotIn(List<String> values) {
            addCriterion("AreaPinYin not in", values, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinBetween(String value1, String value2) {
            addCriterion("AreaPinYin between", value1, value2, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andAreapinyinNotBetween(String value1, String value2) {
            addCriterion("AreaPinYin not between", value1, value2, "areapinyin");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatestaffIsNull() {
            addCriterion("CreateStaff is null");
            return (Criteria) this;
        }

        public Criteria andCreatestaffIsNotNull() {
            addCriterion("CreateStaff is not null");
            return (Criteria) this;
        }

        public Criteria andCreatestaffEqualTo(Integer value) {
            addCriterion("CreateStaff =", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotEqualTo(Integer value) {
            addCriterion("CreateStaff <>", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffGreaterThan(Integer value) {
            addCriterion("CreateStaff >", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreateStaff >=", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffLessThan(Integer value) {
            addCriterion("CreateStaff <", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffLessThanOrEqualTo(Integer value) {
            addCriterion("CreateStaff <=", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffIn(List<Integer> values) {
            addCriterion("CreateStaff in", values, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotIn(List<Integer> values) {
            addCriterion("CreateStaff not in", values, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffBetween(Integer value1, Integer value2) {
            addCriterion("CreateStaff between", value1, value2, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotBetween(Integer value1, Integer value2) {
            addCriterion("CreateStaff not between", value1, value2, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffIsNull() {
            addCriterion("UpdateStaff is null");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffIsNotNull() {
            addCriterion("UpdateStaff is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffEqualTo(Integer value) {
            addCriterion("UpdateStaff =", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotEqualTo(Integer value) {
            addCriterion("UpdateStaff <>", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffGreaterThan(Integer value) {
            addCriterion("UpdateStaff >", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpdateStaff >=", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffLessThan(Integer value) {
            addCriterion("UpdateStaff <", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffLessThanOrEqualTo(Integer value) {
            addCriterion("UpdateStaff <=", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffIn(List<Integer> values) {
            addCriterion("UpdateStaff in", values, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotIn(List<Integer> values) {
            addCriterion("UpdateStaff not in", values, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffBetween(Integer value1, Integer value2) {
            addCriterion("UpdateStaff between", value1, value2, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotBetween(Integer value1, Integer value2) {
            addCriterion("UpdateStaff not between", value1, value2, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("IsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("IsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Short value) {
            addCriterion("IsDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Short value) {
            addCriterion("IsDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Short value) {
            addCriterion("IsDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("IsDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Short value) {
            addCriterion("IsDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Short value) {
            addCriterion("IsDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Short> values) {
            addCriterion("IsDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Short> values) {
            addCriterion("IsDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Short value1, Short value2) {
            addCriterion("IsDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Short value1, Short value2) {
            addCriterion("IsDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("DES is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("DES is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("DES =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("DES <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("DES >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("DES >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("DES <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("DES <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("DES like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("DES not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("DES in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("DES not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("DES between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("DES not between", value1, value2, "des");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return this;
        }

        public Criteria andAbbLikeInsensitive(String value) {
            addCriterion("upper(Abb) like", value.toUpperCase(), "abb");
            return this;
        }

        public Criteria andSspLikeInsensitive(String value) {
            addCriterion("upper(SSP) like", value.toUpperCase(), "ssp");
            return this;
        }

        public Criteria andPinyinLikeInsensitive(String value) {
            addCriterion("upper(pinyin) like", value.toUpperCase(), "pinyin");
            return this;
        }

        public Criteria andProvincenameLikeInsensitive(String value) {
            addCriterion("upper(ProvinceName) like", value.toUpperCase(), "provincename");
            return this;
        }

        public Criteria andProvincepinyinLikeInsensitive(String value) {
            addCriterion("upper(ProvincePinYin) like", value.toUpperCase(), "provincepinyin");
            return this;
        }

        public Criteria andCitynameLikeInsensitive(String value) {
            addCriterion("upper(CityName) like", value.toUpperCase(), "cityname");
            return this;
        }

        public Criteria andCitypinyinLikeInsensitive(String value) {
            addCriterion("upper(CityPinYin) like", value.toUpperCase(), "citypinyin");
            return this;
        }

        public Criteria andAreanameLikeInsensitive(String value) {
            addCriterion("upper(AreaName) like", value.toUpperCase(), "areaname");
            return this;
        }

        public Criteria andAreapinyinLikeInsensitive(String value) {
            addCriterion("upper(AreaPinYin) like", value.toUpperCase(), "areapinyin");
            return this;
        }

        public Criteria andDesLikeInsensitive(String value) {
            addCriterion("upper(DES) like", value.toUpperCase(), "des");
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