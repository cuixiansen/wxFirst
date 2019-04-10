package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class TestdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestdetailExample() {
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

        public Criteria andTestDIdIsNull() {
            addCriterion("test_d_id is null");
            return (Criteria) this;
        }

        public Criteria andTestDIdIsNotNull() {
            addCriterion("test_d_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestDIdEqualTo(Integer value) {
            addCriterion("test_d_id =", value, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdNotEqualTo(Integer value) {
            addCriterion("test_d_id <>", value, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdGreaterThan(Integer value) {
            addCriterion("test_d_id >", value, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_d_id >=", value, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdLessThan(Integer value) {
            addCriterion("test_d_id <", value, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_d_id <=", value, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdIn(List<Integer> values) {
            addCriterion("test_d_id in", values, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdNotIn(List<Integer> values) {
            addCriterion("test_d_id not in", values, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdBetween(Integer value1, Integer value2) {
            addCriterion("test_d_id between", value1, value2, "testDId");
            return (Criteria) this;
        }

        public Criteria andTestDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_d_id not between", value1, value2, "testDId");
            return (Criteria) this;
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

        public Criteria andTestProblemIdIsNull() {
            addCriterion("test_problem_id is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdIsNotNull() {
            addCriterion("test_problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdEqualTo(Integer value) {
            addCriterion("test_problem_id =", value, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdNotEqualTo(Integer value) {
            addCriterion("test_problem_id <>", value, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdGreaterThan(Integer value) {
            addCriterion("test_problem_id >", value, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_problem_id >=", value, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdLessThan(Integer value) {
            addCriterion("test_problem_id <", value, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_problem_id <=", value, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdIn(List<Integer> values) {
            addCriterion("test_problem_id in", values, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdNotIn(List<Integer> values) {
            addCriterion("test_problem_id not in", values, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("test_problem_id between", value1, value2, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_problem_id not between", value1, value2, "testProblemId");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextIsNull() {
            addCriterion("test_problem_text is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextIsNotNull() {
            addCriterion("test_problem_text is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextEqualTo(String value) {
            addCriterion("test_problem_text =", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextNotEqualTo(String value) {
            addCriterion("test_problem_text <>", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextGreaterThan(String value) {
            addCriterion("test_problem_text >", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextGreaterThanOrEqualTo(String value) {
            addCriterion("test_problem_text >=", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextLessThan(String value) {
            addCriterion("test_problem_text <", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextLessThanOrEqualTo(String value) {
            addCriterion("test_problem_text <=", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextLike(String value) {
            addCriterion("test_problem_text like", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextNotLike(String value) {
            addCriterion("test_problem_text not like", value, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextIn(List<String> values) {
            addCriterion("test_problem_text in", values, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextNotIn(List<String> values) {
            addCriterion("test_problem_text not in", values, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextBetween(String value1, String value2) {
            addCriterion("test_problem_text between", value1, value2, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemTextNotBetween(String value1, String value2) {
            addCriterion("test_problem_text not between", value1, value2, "testProblemText");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidIsNull() {
            addCriterion("test_problem_pid is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidIsNotNull() {
            addCriterion("test_problem_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidEqualTo(Integer value) {
            addCriterion("test_problem_pid =", value, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidNotEqualTo(Integer value) {
            addCriterion("test_problem_pid <>", value, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidGreaterThan(Integer value) {
            addCriterion("test_problem_pid >", value, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_problem_pid >=", value, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidLessThan(Integer value) {
            addCriterion("test_problem_pid <", value, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidLessThanOrEqualTo(Integer value) {
            addCriterion("test_problem_pid <=", value, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidIn(List<Integer> values) {
            addCriterion("test_problem_pid in", values, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidNotIn(List<Integer> values) {
            addCriterion("test_problem_pid not in", values, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidBetween(Integer value1, Integer value2) {
            addCriterion("test_problem_pid between", value1, value2, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPidNotBetween(Integer value1, Integer value2) {
            addCriterion("test_problem_pid not between", value1, value2, "testProblemPid");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixIsNull() {
            addCriterion("test_problem_p_prefix is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixIsNotNull() {
            addCriterion("test_problem_p_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixEqualTo(String value) {
            addCriterion("test_problem_p_prefix =", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixNotEqualTo(String value) {
            addCriterion("test_problem_p_prefix <>", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixGreaterThan(String value) {
            addCriterion("test_problem_p_prefix >", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("test_problem_p_prefix >=", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixLessThan(String value) {
            addCriterion("test_problem_p_prefix <", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixLessThanOrEqualTo(String value) {
            addCriterion("test_problem_p_prefix <=", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixLike(String value) {
            addCriterion("test_problem_p_prefix like", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixNotLike(String value) {
            addCriterion("test_problem_p_prefix not like", value, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixIn(List<String> values) {
            addCriterion("test_problem_p_prefix in", values, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixNotIn(List<String> values) {
            addCriterion("test_problem_p_prefix not in", values, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixBetween(String value1, String value2) {
            addCriterion("test_problem_p_prefix between", value1, value2, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPPrefixNotBetween(String value1, String value2) {
            addCriterion("test_problem_p_prefix not between", value1, value2, "testProblemPPrefix");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextIsNull() {
            addCriterion("test_problem_ptext is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextIsNotNull() {
            addCriterion("test_problem_ptext is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextEqualTo(String value) {
            addCriterion("test_problem_ptext =", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextNotEqualTo(String value) {
            addCriterion("test_problem_ptext <>", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextGreaterThan(String value) {
            addCriterion("test_problem_ptext >", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextGreaterThanOrEqualTo(String value) {
            addCriterion("test_problem_ptext >=", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextLessThan(String value) {
            addCriterion("test_problem_ptext <", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextLessThanOrEqualTo(String value) {
            addCriterion("test_problem_ptext <=", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextLike(String value) {
            addCriterion("test_problem_ptext like", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextNotLike(String value) {
            addCriterion("test_problem_ptext not like", value, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextIn(List<String> values) {
            addCriterion("test_problem_ptext in", values, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextNotIn(List<String> values) {
            addCriterion("test_problem_ptext not in", values, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextBetween(String value1, String value2) {
            addCriterion("test_problem_ptext between", value1, value2, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestProblemPtextNotBetween(String value1, String value2) {
            addCriterion("test_problem_ptext not between", value1, value2, "testProblemPtext");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixIsNull() {
            addCriterion("test_option_prefix is null");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixIsNotNull() {
            addCriterion("test_option_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixEqualTo(String value) {
            addCriterion("test_option_prefix =", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixNotEqualTo(String value) {
            addCriterion("test_option_prefix <>", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixGreaterThan(String value) {
            addCriterion("test_option_prefix >", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("test_option_prefix >=", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixLessThan(String value) {
            addCriterion("test_option_prefix <", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixLessThanOrEqualTo(String value) {
            addCriterion("test_option_prefix <=", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixLike(String value) {
            addCriterion("test_option_prefix like", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixNotLike(String value) {
            addCriterion("test_option_prefix not like", value, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixIn(List<String> values) {
            addCriterion("test_option_prefix in", values, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixNotIn(List<String> values) {
            addCriterion("test_option_prefix not in", values, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixBetween(String value1, String value2) {
            addCriterion("test_option_prefix between", value1, value2, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionPrefixNotBetween(String value1, String value2) {
            addCriterion("test_option_prefix not between", value1, value2, "testOptionPrefix");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextIsNull() {
            addCriterion("test_option_text is null");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextIsNotNull() {
            addCriterion("test_option_text is not null");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextEqualTo(String value) {
            addCriterion("test_option_text =", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextNotEqualTo(String value) {
            addCriterion("test_option_text <>", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextGreaterThan(String value) {
            addCriterion("test_option_text >", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextGreaterThanOrEqualTo(String value) {
            addCriterion("test_option_text >=", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextLessThan(String value) {
            addCriterion("test_option_text <", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextLessThanOrEqualTo(String value) {
            addCriterion("test_option_text <=", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextLike(String value) {
            addCriterion("test_option_text like", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextNotLike(String value) {
            addCriterion("test_option_text not like", value, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextIn(List<String> values) {
            addCriterion("test_option_text in", values, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextNotIn(List<String> values) {
            addCriterion("test_option_text not in", values, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextBetween(String value1, String value2) {
            addCriterion("test_option_text between", value1, value2, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionTextNotBetween(String value1, String value2) {
            addCriterion("test_option_text not between", value1, value2, "testOptionText");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueIsNull() {
            addCriterion("test_option_value is null");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueIsNotNull() {
            addCriterion("test_option_value is not null");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueEqualTo(Double value) {
            addCriterion("test_option_value =", value, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueNotEqualTo(Double value) {
            addCriterion("test_option_value <>", value, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueGreaterThan(Double value) {
            addCriterion("test_option_value >", value, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueGreaterThanOrEqualTo(Double value) {
            addCriterion("test_option_value >=", value, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueLessThan(Double value) {
            addCriterion("test_option_value <", value, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueLessThanOrEqualTo(Double value) {
            addCriterion("test_option_value <=", value, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueIn(List<Double> values) {
            addCriterion("test_option_value in", values, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueNotIn(List<Double> values) {
            addCriterion("test_option_value not in", values, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueBetween(Double value1, Double value2) {
            addCriterion("test_option_value between", value1, value2, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestOptionValueNotBetween(Double value1, Double value2) {
            addCriterion("test_option_value not between", value1, value2, "testOptionValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueIsNull() {
            addCriterion("test_skip_value is null");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueIsNotNull() {
            addCriterion("test_skip_value is not null");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueEqualTo(String value) {
            addCriterion("test_skip_value =", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueNotEqualTo(String value) {
            addCriterion("test_skip_value <>", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueGreaterThan(String value) {
            addCriterion("test_skip_value >", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueGreaterThanOrEqualTo(String value) {
            addCriterion("test_skip_value >=", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueLessThan(String value) {
            addCriterion("test_skip_value <", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueLessThanOrEqualTo(String value) {
            addCriterion("test_skip_value <=", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueLike(String value) {
            addCriterion("test_skip_value like", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueNotLike(String value) {
            addCriterion("test_skip_value not like", value, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueIn(List<String> values) {
            addCriterion("test_skip_value in", values, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueNotIn(List<String> values) {
            addCriterion("test_skip_value not in", values, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueBetween(String value1, String value2) {
            addCriterion("test_skip_value between", value1, value2, "testSkipValue");
            return (Criteria) this;
        }

        public Criteria andTestSkipValueNotBetween(String value1, String value2) {
            addCriterion("test_skip_value not between", value1, value2, "testSkipValue");
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