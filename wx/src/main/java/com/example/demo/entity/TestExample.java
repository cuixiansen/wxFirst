package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestTitleIsNull() {
            addCriterion("test_title is null");
            return (Criteria) this;
        }

        public Criteria andTestTitleIsNotNull() {
            addCriterion("test_title is not null");
            return (Criteria) this;
        }

        public Criteria andTestTitleEqualTo(String value) {
            addCriterion("test_title =", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleNotEqualTo(String value) {
            addCriterion("test_title <>", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleGreaterThan(String value) {
            addCriterion("test_title >", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleGreaterThanOrEqualTo(String value) {
            addCriterion("test_title >=", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleLessThan(String value) {
            addCriterion("test_title <", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleLessThanOrEqualTo(String value) {
            addCriterion("test_title <=", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleLike(String value) {
            addCriterion("test_title like", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleNotLike(String value) {
            addCriterion("test_title not like", value, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleIn(List<String> values) {
            addCriterion("test_title in", values, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleNotIn(List<String> values) {
            addCriterion("test_title not in", values, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleBetween(String value1, String value2) {
            addCriterion("test_title between", value1, value2, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestTitleNotBetween(String value1, String value2) {
            addCriterion("test_title not between", value1, value2, "testTitle");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcIsNull() {
            addCriterion("test_img_src is null");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcIsNotNull() {
            addCriterion("test_img_src is not null");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcEqualTo(String value) {
            addCriterion("test_img_src =", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcNotEqualTo(String value) {
            addCriterion("test_img_src <>", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcGreaterThan(String value) {
            addCriterion("test_img_src >", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcGreaterThanOrEqualTo(String value) {
            addCriterion("test_img_src >=", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcLessThan(String value) {
            addCriterion("test_img_src <", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcLessThanOrEqualTo(String value) {
            addCriterion("test_img_src <=", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcLike(String value) {
            addCriterion("test_img_src like", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcNotLike(String value) {
            addCriterion("test_img_src not like", value, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcIn(List<String> values) {
            addCriterion("test_img_src in", values, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcNotIn(List<String> values) {
            addCriterion("test_img_src not in", values, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcBetween(String value1, String value2) {
            addCriterion("test_img_src between", value1, value2, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestImgSrcNotBetween(String value1, String value2) {
            addCriterion("test_img_src not between", value1, value2, "testImgSrc");
            return (Criteria) this;
        }

        public Criteria andTestPriceIsNull() {
            addCriterion("test_price is null");
            return (Criteria) this;
        }

        public Criteria andTestPriceIsNotNull() {
            addCriterion("test_price is not null");
            return (Criteria) this;
        }

        public Criteria andTestPriceEqualTo(Integer value) {
            addCriterion("test_price =", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotEqualTo(Integer value) {
            addCriterion("test_price <>", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceGreaterThan(Integer value) {
            addCriterion("test_price >", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_price >=", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceLessThan(Integer value) {
            addCriterion("test_price <", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceLessThanOrEqualTo(Integer value) {
            addCriterion("test_price <=", value, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceIn(List<Integer> values) {
            addCriterion("test_price in", values, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotIn(List<Integer> values) {
            addCriterion("test_price not in", values, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceBetween(Integer value1, Integer value2) {
            addCriterion("test_price between", value1, value2, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("test_price not between", value1, value2, "testPrice");
            return (Criteria) this;
        }

        public Criteria andTestNumIsNull() {
            addCriterion("test_num is null");
            return (Criteria) this;
        }

        public Criteria andTestNumIsNotNull() {
            addCriterion("test_num is not null");
            return (Criteria) this;
        }

        public Criteria andTestNumEqualTo(Integer value) {
            addCriterion("test_num =", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotEqualTo(Integer value) {
            addCriterion("test_num <>", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumGreaterThan(Integer value) {
            addCriterion("test_num >", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_num >=", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumLessThan(Integer value) {
            addCriterion("test_num <", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumLessThanOrEqualTo(Integer value) {
            addCriterion("test_num <=", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumIn(List<Integer> values) {
            addCriterion("test_num in", values, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotIn(List<Integer> values) {
            addCriterion("test_num not in", values, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumBetween(Integer value1, Integer value2) {
            addCriterion("test_num between", value1, value2, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotBetween(Integer value1, Integer value2) {
            addCriterion("test_num not between", value1, value2, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestDescIsNull() {
            addCriterion("test_desc is null");
            return (Criteria) this;
        }

        public Criteria andTestDescIsNotNull() {
            addCriterion("test_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTestDescEqualTo(String value) {
            addCriterion("test_desc =", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotEqualTo(String value) {
            addCriterion("test_desc <>", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescGreaterThan(String value) {
            addCriterion("test_desc >", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescGreaterThanOrEqualTo(String value) {
            addCriterion("test_desc >=", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLessThan(String value) {
            addCriterion("test_desc <", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLessThanOrEqualTo(String value) {
            addCriterion("test_desc <=", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLike(String value) {
            addCriterion("test_desc like", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotLike(String value) {
            addCriterion("test_desc not like", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescIn(List<String> values) {
            addCriterion("test_desc in", values, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotIn(List<String> values) {
            addCriterion("test_desc not in", values, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescBetween(String value1, String value2) {
            addCriterion("test_desc between", value1, value2, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotBetween(String value1, String value2) {
            addCriterion("test_desc not between", value1, value2, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestTextIsNull() {
            addCriterion("test_text is null");
            return (Criteria) this;
        }

        public Criteria andTestTextIsNotNull() {
            addCriterion("test_text is not null");
            return (Criteria) this;
        }

        public Criteria andTestTextEqualTo(String value) {
            addCriterion("test_text =", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextNotEqualTo(String value) {
            addCriterion("test_text <>", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextGreaterThan(String value) {
            addCriterion("test_text >", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextGreaterThanOrEqualTo(String value) {
            addCriterion("test_text >=", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextLessThan(String value) {
            addCriterion("test_text <", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextLessThanOrEqualTo(String value) {
            addCriterion("test_text <=", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextLike(String value) {
            addCriterion("test_text like", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextNotLike(String value) {
            addCriterion("test_text not like", value, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextIn(List<String> values) {
            addCriterion("test_text in", values, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextNotIn(List<String> values) {
            addCriterion("test_text not in", values, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextBetween(String value1, String value2) {
            addCriterion("test_text between", value1, value2, "testText");
            return (Criteria) this;
        }

        public Criteria andTestTextNotBetween(String value1, String value2) {
            addCriterion("test_text not between", value1, value2, "testText");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelIsNull() {
            addCriterion("if_three_level is null");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelIsNotNull() {
            addCriterion("if_three_level is not null");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelEqualTo(Integer value) {
            addCriterion("if_three_level =", value, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelNotEqualTo(Integer value) {
            addCriterion("if_three_level <>", value, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelGreaterThan(Integer value) {
            addCriterion("if_three_level >", value, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_three_level >=", value, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelLessThan(Integer value) {
            addCriterion("if_three_level <", value, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("if_three_level <=", value, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelIn(List<Integer> values) {
            addCriterion("if_three_level in", values, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelNotIn(List<Integer> values) {
            addCriterion("if_three_level not in", values, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelBetween(Integer value1, Integer value2) {
            addCriterion("if_three_level between", value1, value2, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfThreeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("if_three_level not between", value1, value2, "ifThreeLevel");
            return (Criteria) this;
        }

        public Criteria andIfAdviceIsNull() {
            addCriterion("if_advice is null");
            return (Criteria) this;
        }

        public Criteria andIfAdviceIsNotNull() {
            addCriterion("if_advice is not null");
            return (Criteria) this;
        }

        public Criteria andIfAdviceEqualTo(Integer value) {
            addCriterion("if_advice =", value, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceNotEqualTo(Integer value) {
            addCriterion("if_advice <>", value, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceGreaterThan(Integer value) {
            addCriterion("if_advice >", value, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_advice >=", value, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceLessThan(Integer value) {
            addCriterion("if_advice <", value, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceLessThanOrEqualTo(Integer value) {
            addCriterion("if_advice <=", value, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceIn(List<Integer> values) {
            addCriterion("if_advice in", values, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceNotIn(List<Integer> values) {
            addCriterion("if_advice not in", values, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceBetween(Integer value1, Integer value2) {
            addCriterion("if_advice between", value1, value2, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfAdviceNotBetween(Integer value1, Integer value2) {
            addCriterion("if_advice not between", value1, value2, "ifAdvice");
            return (Criteria) this;
        }

        public Criteria andIfSkipIsNull() {
            addCriterion("if_skip is null");
            return (Criteria) this;
        }

        public Criteria andIfSkipIsNotNull() {
            addCriterion("if_skip is not null");
            return (Criteria) this;
        }

        public Criteria andIfSkipEqualTo(Integer value) {
            addCriterion("if_skip =", value, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipNotEqualTo(Integer value) {
            addCriterion("if_skip <>", value, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipGreaterThan(Integer value) {
            addCriterion("if_skip >", value, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_skip >=", value, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipLessThan(Integer value) {
            addCriterion("if_skip <", value, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipLessThanOrEqualTo(Integer value) {
            addCriterion("if_skip <=", value, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipIn(List<Integer> values) {
            addCriterion("if_skip in", values, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipNotIn(List<Integer> values) {
            addCriterion("if_skip not in", values, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipBetween(Integer value1, Integer value2) {
            addCriterion("if_skip between", value1, value2, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andIfSkipNotBetween(Integer value1, Integer value2) {
            addCriterion("if_skip not between", value1, value2, "ifSkip");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumIsNull() {
            addCriterion("test_problem_num is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumIsNotNull() {
            addCriterion("test_problem_num is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumEqualTo(Integer value) {
            addCriterion("test_problem_num =", value, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumNotEqualTo(Integer value) {
            addCriterion("test_problem_num <>", value, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumGreaterThan(Integer value) {
            addCriterion("test_problem_num >", value, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_problem_num >=", value, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumLessThan(Integer value) {
            addCriterion("test_problem_num <", value, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumLessThanOrEqualTo(Integer value) {
            addCriterion("test_problem_num <=", value, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumIn(List<Integer> values) {
            addCriterion("test_problem_num in", values, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumNotIn(List<Integer> values) {
            addCriterion("test_problem_num not in", values, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumBetween(Integer value1, Integer value2) {
            addCriterion("test_problem_num between", value1, value2, "testProblemNum");
            return (Criteria) this;
        }

        public Criteria andTestProblemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("test_problem_num not between", value1, value2, "testProblemNum");
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