package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AudioExample() {
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

        public Criteria andAudioIdIsNull() {
            addCriterion("audio_id is null");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNotNull() {
            addCriterion("audio_id is not null");
            return (Criteria) this;
        }

        public Criteria andAudioIdEqualTo(Integer value) {
            addCriterion("audio_id =", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotEqualTo(Integer value) {
            addCriterion("audio_id <>", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThan(Integer value) {
            addCriterion("audio_id >", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audio_id >=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThan(Integer value) {
            addCriterion("audio_id <", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThanOrEqualTo(Integer value) {
            addCriterion("audio_id <=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIn(List<Integer> values) {
            addCriterion("audio_id in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotIn(List<Integer> values) {
            addCriterion("audio_id not in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdBetween(Integer value1, Integer value2) {
            addCriterion("audio_id between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audio_id not between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioTitleIsNull() {
            addCriterion("audio_title is null");
            return (Criteria) this;
        }

        public Criteria andAudioTitleIsNotNull() {
            addCriterion("audio_title is not null");
            return (Criteria) this;
        }

        public Criteria andAudioTitleEqualTo(String value) {
            addCriterion("audio_title =", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotEqualTo(String value) {
            addCriterion("audio_title <>", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleGreaterThan(String value) {
            addCriterion("audio_title >", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleGreaterThanOrEqualTo(String value) {
            addCriterion("audio_title >=", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleLessThan(String value) {
            addCriterion("audio_title <", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleLessThanOrEqualTo(String value) {
            addCriterion("audio_title <=", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleLike(String value) {
            addCriterion("audio_title like", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotLike(String value) {
            addCriterion("audio_title not like", value, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleIn(List<String> values) {
            addCriterion("audio_title in", values, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotIn(List<String> values) {
            addCriterion("audio_title not in", values, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleBetween(String value1, String value2) {
            addCriterion("audio_title between", value1, value2, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioTitleNotBetween(String value1, String value2) {
            addCriterion("audio_title not between", value1, value2, "audioTitle");
            return (Criteria) this;
        }

        public Criteria andAudioPriceIsNull() {
            addCriterion("audio_price is null");
            return (Criteria) this;
        }

        public Criteria andAudioPriceIsNotNull() {
            addCriterion("audio_price is not null");
            return (Criteria) this;
        }

        public Criteria andAudioPriceEqualTo(Double value) {
            addCriterion("audio_price =", value, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceNotEqualTo(Double value) {
            addCriterion("audio_price <>", value, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceGreaterThan(Double value) {
            addCriterion("audio_price >", value, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("audio_price >=", value, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceLessThan(Double value) {
            addCriterion("audio_price <", value, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceLessThanOrEqualTo(Double value) {
            addCriterion("audio_price <=", value, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceIn(List<Double> values) {
            addCriterion("audio_price in", values, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceNotIn(List<Double> values) {
            addCriterion("audio_price not in", values, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceBetween(Double value1, Double value2) {
            addCriterion("audio_price between", value1, value2, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioPriceNotBetween(Double value1, Double value2) {
            addCriterion("audio_price not between", value1, value2, "audioPrice");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcIsNull() {
            addCriterion("audio_img_src is null");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcIsNotNull() {
            addCriterion("audio_img_src is not null");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcEqualTo(String value) {
            addCriterion("audio_img_src =", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcNotEqualTo(String value) {
            addCriterion("audio_img_src <>", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcGreaterThan(String value) {
            addCriterion("audio_img_src >", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("audio_img_src >=", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcLessThan(String value) {
            addCriterion("audio_img_src <", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcLessThanOrEqualTo(String value) {
            addCriterion("audio_img_src <=", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcLike(String value) {
            addCriterion("audio_img_src like", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcNotLike(String value) {
            addCriterion("audio_img_src not like", value, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcIn(List<String> values) {
            addCriterion("audio_img_src in", values, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcNotIn(List<String> values) {
            addCriterion("audio_img_src not in", values, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcBetween(String value1, String value2) {
            addCriterion("audio_img_src between", value1, value2, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioImgSrcNotBetween(String value1, String value2) {
            addCriterion("audio_img_src not between", value1, value2, "audioImgSrc");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorIsNull() {
            addCriterion("audio_author is null");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorIsNotNull() {
            addCriterion("audio_author is not null");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorEqualTo(String value) {
            addCriterion("audio_author =", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorNotEqualTo(String value) {
            addCriterion("audio_author <>", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorGreaterThan(String value) {
            addCriterion("audio_author >", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("audio_author >=", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorLessThan(String value) {
            addCriterion("audio_author <", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorLessThanOrEqualTo(String value) {
            addCriterion("audio_author <=", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorLike(String value) {
            addCriterion("audio_author like", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorNotLike(String value) {
            addCriterion("audio_author not like", value, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorIn(List<String> values) {
            addCriterion("audio_author in", values, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorNotIn(List<String> values) {
            addCriterion("audio_author not in", values, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorBetween(String value1, String value2) {
            addCriterion("audio_author between", value1, value2, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioAuthorNotBetween(String value1, String value2) {
            addCriterion("audio_author not between", value1, value2, "audioAuthor");
            return (Criteria) this;
        }

        public Criteria andAudioSrcIsNull() {
            addCriterion("audio_src is null");
            return (Criteria) this;
        }

        public Criteria andAudioSrcIsNotNull() {
            addCriterion("audio_src is not null");
            return (Criteria) this;
        }

        public Criteria andAudioSrcEqualTo(String value) {
            addCriterion("audio_src =", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcNotEqualTo(String value) {
            addCriterion("audio_src <>", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcGreaterThan(String value) {
            addCriterion("audio_src >", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcGreaterThanOrEqualTo(String value) {
            addCriterion("audio_src >=", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcLessThan(String value) {
            addCriterion("audio_src <", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcLessThanOrEqualTo(String value) {
            addCriterion("audio_src <=", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcLike(String value) {
            addCriterion("audio_src like", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcNotLike(String value) {
            addCriterion("audio_src not like", value, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcIn(List<String> values) {
            addCriterion("audio_src in", values, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcNotIn(List<String> values) {
            addCriterion("audio_src not in", values, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcBetween(String value1, String value2) {
            addCriterion("audio_src between", value1, value2, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioSrcNotBetween(String value1, String value2) {
            addCriterion("audio_src not between", value1, value2, "audioSrc");
            return (Criteria) this;
        }

        public Criteria andAudioNominateIsNull() {
            addCriterion("audio_nominate is null");
            return (Criteria) this;
        }

        public Criteria andAudioNominateIsNotNull() {
            addCriterion("audio_nominate is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNominateEqualTo(Integer value) {
            addCriterion("audio_nominate =", value, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateNotEqualTo(Integer value) {
            addCriterion("audio_nominate <>", value, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateGreaterThan(Integer value) {
            addCriterion("audio_nominate >", value, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateGreaterThanOrEqualTo(Integer value) {
            addCriterion("audio_nominate >=", value, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateLessThan(Integer value) {
            addCriterion("audio_nominate <", value, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateLessThanOrEqualTo(Integer value) {
            addCriterion("audio_nominate <=", value, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateIn(List<Integer> values) {
            addCriterion("audio_nominate in", values, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateNotIn(List<Integer> values) {
            addCriterion("audio_nominate not in", values, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateBetween(Integer value1, Integer value2) {
            addCriterion("audio_nominate between", value1, value2, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioNominateNotBetween(Integer value1, Integer value2) {
            addCriterion("audio_nominate not between", value1, value2, "audioNominate");
            return (Criteria) this;
        }

        public Criteria andAudioDateIsNull() {
            addCriterion("audio_date is null");
            return (Criteria) this;
        }

        public Criteria andAudioDateIsNotNull() {
            addCriterion("audio_date is not null");
            return (Criteria) this;
        }

        public Criteria andAudioDateEqualTo(Date value) {
            addCriterion("audio_date =", value, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateNotEqualTo(Date value) {
            addCriterion("audio_date <>", value, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateGreaterThan(Date value) {
            addCriterion("audio_date >", value, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateGreaterThanOrEqualTo(Date value) {
            addCriterion("audio_date >=", value, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateLessThan(Date value) {
            addCriterion("audio_date <", value, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateLessThanOrEqualTo(Date value) {
            addCriterion("audio_date <=", value, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateIn(List<Date> values) {
            addCriterion("audio_date in", values, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateNotIn(List<Date> values) {
            addCriterion("audio_date not in", values, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateBetween(Date value1, Date value2) {
            addCriterion("audio_date between", value1, value2, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioDateNotBetween(Date value1, Date value2) {
            addCriterion("audio_date not between", value1, value2, "audioDate");
            return (Criteria) this;
        }

        public Criteria andAudioTextIsNull() {
            addCriterion("audio_text is null");
            return (Criteria) this;
        }

        public Criteria andAudioTextIsNotNull() {
            addCriterion("audio_text is not null");
            return (Criteria) this;
        }

        public Criteria andAudioTextEqualTo(String value) {
            addCriterion("audio_text =", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextNotEqualTo(String value) {
            addCriterion("audio_text <>", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextGreaterThan(String value) {
            addCriterion("audio_text >", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextGreaterThanOrEqualTo(String value) {
            addCriterion("audio_text >=", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextLessThan(String value) {
            addCriterion("audio_text <", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextLessThanOrEqualTo(String value) {
            addCriterion("audio_text <=", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextLike(String value) {
            addCriterion("audio_text like", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextNotLike(String value) {
            addCriterion("audio_text not like", value, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextIn(List<String> values) {
            addCriterion("audio_text in", values, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextNotIn(List<String> values) {
            addCriterion("audio_text not in", values, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextBetween(String value1, String value2) {
            addCriterion("audio_text between", value1, value2, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioTextNotBetween(String value1, String value2) {
            addCriterion("audio_text not between", value1, value2, "audioText");
            return (Criteria) this;
        }

        public Criteria andAudioDescIsNull() {
            addCriterion("audio_desc is null");
            return (Criteria) this;
        }

        public Criteria andAudioDescIsNotNull() {
            addCriterion("audio_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAudioDescEqualTo(String value) {
            addCriterion("audio_desc =", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescNotEqualTo(String value) {
            addCriterion("audio_desc <>", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescGreaterThan(String value) {
            addCriterion("audio_desc >", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescGreaterThanOrEqualTo(String value) {
            addCriterion("audio_desc >=", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescLessThan(String value) {
            addCriterion("audio_desc <", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescLessThanOrEqualTo(String value) {
            addCriterion("audio_desc <=", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescLike(String value) {
            addCriterion("audio_desc like", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescNotLike(String value) {
            addCriterion("audio_desc not like", value, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescIn(List<String> values) {
            addCriterion("audio_desc in", values, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescNotIn(List<String> values) {
            addCriterion("audio_desc not in", values, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescBetween(String value1, String value2) {
            addCriterion("audio_desc between", value1, value2, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioDescNotBetween(String value1, String value2) {
            addCriterion("audio_desc not between", value1, value2, "audioDesc");
            return (Criteria) this;
        }

        public Criteria andAudioNumIsNull() {
            addCriterion("audio_num is null");
            return (Criteria) this;
        }

        public Criteria andAudioNumIsNotNull() {
            addCriterion("audio_num is not null");
            return (Criteria) this;
        }

        public Criteria andAudioNumEqualTo(Integer value) {
            addCriterion("audio_num =", value, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumNotEqualTo(Integer value) {
            addCriterion("audio_num <>", value, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumGreaterThan(Integer value) {
            addCriterion("audio_num >", value, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("audio_num >=", value, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumLessThan(Integer value) {
            addCriterion("audio_num <", value, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumLessThanOrEqualTo(Integer value) {
            addCriterion("audio_num <=", value, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumIn(List<Integer> values) {
            addCriterion("audio_num in", values, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumNotIn(List<Integer> values) {
            addCriterion("audio_num not in", values, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumBetween(Integer value1, Integer value2) {
            addCriterion("audio_num between", value1, value2, "audioNum");
            return (Criteria) this;
        }

        public Criteria andAudioNumNotBetween(Integer value1, Integer value2) {
            addCriterion("audio_num not between", value1, value2, "audioNum");
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