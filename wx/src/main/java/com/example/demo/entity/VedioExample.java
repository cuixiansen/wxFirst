package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VedioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VedioExample() {
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

        public Criteria andVedioIdIsNull() {
            addCriterion("vedio_id is null");
            return (Criteria) this;
        }

        public Criteria andVedioIdIsNotNull() {
            addCriterion("vedio_id is not null");
            return (Criteria) this;
        }

        public Criteria andVedioIdEqualTo(Integer value) {
            addCriterion("vedio_id =", value, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdNotEqualTo(Integer value) {
            addCriterion("vedio_id <>", value, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdGreaterThan(Integer value) {
            addCriterion("vedio_id >", value, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_id >=", value, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdLessThan(Integer value) {
            addCriterion("vedio_id <", value, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_id <=", value, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdIn(List<Integer> values) {
            addCriterion("vedio_id in", values, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdNotIn(List<Integer> values) {
            addCriterion("vedio_id not in", values, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdBetween(Integer value1, Integer value2) {
            addCriterion("vedio_id between", value1, value2, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_id not between", value1, value2, "vedioId");
            return (Criteria) this;
        }

        public Criteria andVedioTitleIsNull() {
            addCriterion("vedio_title is null");
            return (Criteria) this;
        }

        public Criteria andVedioTitleIsNotNull() {
            addCriterion("vedio_title is not null");
            return (Criteria) this;
        }

        public Criteria andVedioTitleEqualTo(String value) {
            addCriterion("vedio_title =", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleNotEqualTo(String value) {
            addCriterion("vedio_title <>", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleGreaterThan(String value) {
            addCriterion("vedio_title >", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleGreaterThanOrEqualTo(String value) {
            addCriterion("vedio_title >=", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleLessThan(String value) {
            addCriterion("vedio_title <", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleLessThanOrEqualTo(String value) {
            addCriterion("vedio_title <=", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleLike(String value) {
            addCriterion("vedio_title like", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleNotLike(String value) {
            addCriterion("vedio_title not like", value, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleIn(List<String> values) {
            addCriterion("vedio_title in", values, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleNotIn(List<String> values) {
            addCriterion("vedio_title not in", values, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleBetween(String value1, String value2) {
            addCriterion("vedio_title between", value1, value2, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioTitleNotBetween(String value1, String value2) {
            addCriterion("vedio_title not between", value1, value2, "vedioTitle");
            return (Criteria) this;
        }

        public Criteria andVedioPriceIsNull() {
            addCriterion("vedio_price is null");
            return (Criteria) this;
        }

        public Criteria andVedioPriceIsNotNull() {
            addCriterion("vedio_price is not null");
            return (Criteria) this;
        }

        public Criteria andVedioPriceEqualTo(Double value) {
            addCriterion("vedio_price =", value, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceNotEqualTo(Double value) {
            addCriterion("vedio_price <>", value, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceGreaterThan(Double value) {
            addCriterion("vedio_price >", value, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("vedio_price >=", value, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceLessThan(Double value) {
            addCriterion("vedio_price <", value, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceLessThanOrEqualTo(Double value) {
            addCriterion("vedio_price <=", value, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceIn(List<Double> values) {
            addCriterion("vedio_price in", values, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceNotIn(List<Double> values) {
            addCriterion("vedio_price not in", values, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceBetween(Double value1, Double value2) {
            addCriterion("vedio_price between", value1, value2, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioPriceNotBetween(Double value1, Double value2) {
            addCriterion("vedio_price not between", value1, value2, "vedioPrice");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcIsNull() {
            addCriterion("vedio_img_src is null");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcIsNotNull() {
            addCriterion("vedio_img_src is not null");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcEqualTo(String value) {
            addCriterion("vedio_img_src =", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcNotEqualTo(String value) {
            addCriterion("vedio_img_src <>", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcGreaterThan(String value) {
            addCriterion("vedio_img_src >", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("vedio_img_src >=", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcLessThan(String value) {
            addCriterion("vedio_img_src <", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcLessThanOrEqualTo(String value) {
            addCriterion("vedio_img_src <=", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcLike(String value) {
            addCriterion("vedio_img_src like", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcNotLike(String value) {
            addCriterion("vedio_img_src not like", value, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcIn(List<String> values) {
            addCriterion("vedio_img_src in", values, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcNotIn(List<String> values) {
            addCriterion("vedio_img_src not in", values, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcBetween(String value1, String value2) {
            addCriterion("vedio_img_src between", value1, value2, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioImgSrcNotBetween(String value1, String value2) {
            addCriterion("vedio_img_src not between", value1, value2, "vedioImgSrc");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorIsNull() {
            addCriterion("vedio_author is null");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorIsNotNull() {
            addCriterion("vedio_author is not null");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorEqualTo(String value) {
            addCriterion("vedio_author =", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorNotEqualTo(String value) {
            addCriterion("vedio_author <>", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorGreaterThan(String value) {
            addCriterion("vedio_author >", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("vedio_author >=", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorLessThan(String value) {
            addCriterion("vedio_author <", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorLessThanOrEqualTo(String value) {
            addCriterion("vedio_author <=", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorLike(String value) {
            addCriterion("vedio_author like", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorNotLike(String value) {
            addCriterion("vedio_author not like", value, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorIn(List<String> values) {
            addCriterion("vedio_author in", values, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorNotIn(List<String> values) {
            addCriterion("vedio_author not in", values, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorBetween(String value1, String value2) {
            addCriterion("vedio_author between", value1, value2, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioAuthorNotBetween(String value1, String value2) {
            addCriterion("vedio_author not between", value1, value2, "vedioAuthor");
            return (Criteria) this;
        }

        public Criteria andVedioSrcIsNull() {
            addCriterion("vedio_src is null");
            return (Criteria) this;
        }

        public Criteria andVedioSrcIsNotNull() {
            addCriterion("vedio_src is not null");
            return (Criteria) this;
        }

        public Criteria andVedioSrcEqualTo(String value) {
            addCriterion("vedio_src =", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcNotEqualTo(String value) {
            addCriterion("vedio_src <>", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcGreaterThan(String value) {
            addCriterion("vedio_src >", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcGreaterThanOrEqualTo(String value) {
            addCriterion("vedio_src >=", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcLessThan(String value) {
            addCriterion("vedio_src <", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcLessThanOrEqualTo(String value) {
            addCriterion("vedio_src <=", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcLike(String value) {
            addCriterion("vedio_src like", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcNotLike(String value) {
            addCriterion("vedio_src not like", value, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcIn(List<String> values) {
            addCriterion("vedio_src in", values, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcNotIn(List<String> values) {
            addCriterion("vedio_src not in", values, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcBetween(String value1, String value2) {
            addCriterion("vedio_src between", value1, value2, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioSrcNotBetween(String value1, String value2) {
            addCriterion("vedio_src not between", value1, value2, "vedioSrc");
            return (Criteria) this;
        }

        public Criteria andVedioNominateIsNull() {
            addCriterion("vedio_nominate is null");
            return (Criteria) this;
        }

        public Criteria andVedioNominateIsNotNull() {
            addCriterion("vedio_nominate is not null");
            return (Criteria) this;
        }

        public Criteria andVedioNominateEqualTo(Integer value) {
            addCriterion("vedio_nominate =", value, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateNotEqualTo(Integer value) {
            addCriterion("vedio_nominate <>", value, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateGreaterThan(Integer value) {
            addCriterion("vedio_nominate >", value, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_nominate >=", value, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateLessThan(Integer value) {
            addCriterion("vedio_nominate <", value, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_nominate <=", value, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateIn(List<Integer> values) {
            addCriterion("vedio_nominate in", values, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateNotIn(List<Integer> values) {
            addCriterion("vedio_nominate not in", values, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateBetween(Integer value1, Integer value2) {
            addCriterion("vedio_nominate between", value1, value2, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioNominateNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_nominate not between", value1, value2, "vedioNominate");
            return (Criteria) this;
        }

        public Criteria andVedioDateIsNull() {
            addCriterion("vedio_date is null");
            return (Criteria) this;
        }

        public Criteria andVedioDateIsNotNull() {
            addCriterion("vedio_date is not null");
            return (Criteria) this;
        }

        public Criteria andVedioDateEqualTo(Date value) {
            addCriterion("vedio_date =", value, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateNotEqualTo(Date value) {
            addCriterion("vedio_date <>", value, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateGreaterThan(Date value) {
            addCriterion("vedio_date >", value, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateGreaterThanOrEqualTo(Date value) {
            addCriterion("vedio_date >=", value, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateLessThan(Date value) {
            addCriterion("vedio_date <", value, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateLessThanOrEqualTo(Date value) {
            addCriterion("vedio_date <=", value, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateIn(List<Date> values) {
            addCriterion("vedio_date in", values, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateNotIn(List<Date> values) {
            addCriterion("vedio_date not in", values, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateBetween(Date value1, Date value2) {
            addCriterion("vedio_date between", value1, value2, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioDateNotBetween(Date value1, Date value2) {
            addCriterion("vedio_date not between", value1, value2, "vedioDate");
            return (Criteria) this;
        }

        public Criteria andVedioTextIsNull() {
            addCriterion("vedio_text is null");
            return (Criteria) this;
        }

        public Criteria andVedioTextIsNotNull() {
            addCriterion("vedio_text is not null");
            return (Criteria) this;
        }

        public Criteria andVedioTextEqualTo(String value) {
            addCriterion("vedio_text =", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextNotEqualTo(String value) {
            addCriterion("vedio_text <>", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextGreaterThan(String value) {
            addCriterion("vedio_text >", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextGreaterThanOrEqualTo(String value) {
            addCriterion("vedio_text >=", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextLessThan(String value) {
            addCriterion("vedio_text <", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextLessThanOrEqualTo(String value) {
            addCriterion("vedio_text <=", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextLike(String value) {
            addCriterion("vedio_text like", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextNotLike(String value) {
            addCriterion("vedio_text not like", value, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextIn(List<String> values) {
            addCriterion("vedio_text in", values, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextNotIn(List<String> values) {
            addCriterion("vedio_text not in", values, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextBetween(String value1, String value2) {
            addCriterion("vedio_text between", value1, value2, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioTextNotBetween(String value1, String value2) {
            addCriterion("vedio_text not between", value1, value2, "vedioText");
            return (Criteria) this;
        }

        public Criteria andVedioDescIsNull() {
            addCriterion("vedio_desc is null");
            return (Criteria) this;
        }

        public Criteria andVedioDescIsNotNull() {
            addCriterion("vedio_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVedioDescEqualTo(String value) {
            addCriterion("vedio_desc =", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescNotEqualTo(String value) {
            addCriterion("vedio_desc <>", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescGreaterThan(String value) {
            addCriterion("vedio_desc >", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescGreaterThanOrEqualTo(String value) {
            addCriterion("vedio_desc >=", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescLessThan(String value) {
            addCriterion("vedio_desc <", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescLessThanOrEqualTo(String value) {
            addCriterion("vedio_desc <=", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescLike(String value) {
            addCriterion("vedio_desc like", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescNotLike(String value) {
            addCriterion("vedio_desc not like", value, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescIn(List<String> values) {
            addCriterion("vedio_desc in", values, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescNotIn(List<String> values) {
            addCriterion("vedio_desc not in", values, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescBetween(String value1, String value2) {
            addCriterion("vedio_desc between", value1, value2, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioDescNotBetween(String value1, String value2) {
            addCriterion("vedio_desc not between", value1, value2, "vedioDesc");
            return (Criteria) this;
        }

        public Criteria andVedioNumIsNull() {
            addCriterion("vedio_num is null");
            return (Criteria) this;
        }

        public Criteria andVedioNumIsNotNull() {
            addCriterion("vedio_num is not null");
            return (Criteria) this;
        }

        public Criteria andVedioNumEqualTo(Integer value) {
            addCriterion("vedio_num =", value, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumNotEqualTo(Integer value) {
            addCriterion("vedio_num <>", value, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumGreaterThan(Integer value) {
            addCriterion("vedio_num >", value, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("vedio_num >=", value, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumLessThan(Integer value) {
            addCriterion("vedio_num <", value, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumLessThanOrEqualTo(Integer value) {
            addCriterion("vedio_num <=", value, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumIn(List<Integer> values) {
            addCriterion("vedio_num in", values, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumNotIn(List<Integer> values) {
            addCriterion("vedio_num not in", values, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumBetween(Integer value1, Integer value2) {
            addCriterion("vedio_num between", value1, value2, "vedioNum");
            return (Criteria) this;
        }

        public Criteria andVedioNumNotBetween(Integer value1, Integer value2) {
            addCriterion("vedio_num not between", value1, value2, "vedioNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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