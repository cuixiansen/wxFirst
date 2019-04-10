package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UserandtestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserandtestExample() {
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

        public Criteria andUserTestIdIsNull() {
            addCriterion("user_test_id is null");
            return (Criteria) this;
        }

        public Criteria andUserTestIdIsNotNull() {
            addCriterion("user_test_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserTestIdEqualTo(Integer value) {
            addCriterion("user_test_id =", value, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdNotEqualTo(Integer value) {
            addCriterion("user_test_id <>", value, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdGreaterThan(Integer value) {
            addCriterion("user_test_id >", value, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_test_id >=", value, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdLessThan(Integer value) {
            addCriterion("user_test_id <", value, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_test_id <=", value, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdIn(List<Integer> values) {
            addCriterion("user_test_id in", values, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdNotIn(List<Integer> values) {
            addCriterion("user_test_id not in", values, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdBetween(Integer value1, Integer value2) {
            addCriterion("user_test_id between", value1, value2, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_test_id not between", value1, value2, "userTestId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andIfPayIsNull() {
            addCriterion("if_pay is null");
            return (Criteria) this;
        }

        public Criteria andIfPayIsNotNull() {
            addCriterion("if_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIfPayEqualTo(Integer value) {
            addCriterion("if_pay =", value, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayNotEqualTo(Integer value) {
            addCriterion("if_pay <>", value, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayGreaterThan(Integer value) {
            addCriterion("if_pay >", value, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_pay >=", value, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayLessThan(Integer value) {
            addCriterion("if_pay <", value, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayLessThanOrEqualTo(Integer value) {
            addCriterion("if_pay <=", value, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayIn(List<Integer> values) {
            addCriterion("if_pay in", values, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayNotIn(List<Integer> values) {
            addCriterion("if_pay not in", values, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayBetween(Integer value1, Integer value2) {
            addCriterion("if_pay between", value1, value2, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfPayNotBetween(Integer value1, Integer value2) {
            addCriterion("if_pay not between", value1, value2, "ifPay");
            return (Criteria) this;
        }

        public Criteria andIfCompleteIsNull() {
            addCriterion("if_complete is null");
            return (Criteria) this;
        }

        public Criteria andIfCompleteIsNotNull() {
            addCriterion("if_complete is not null");
            return (Criteria) this;
        }

        public Criteria andIfCompleteEqualTo(Integer value) {
            addCriterion("if_complete =", value, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteNotEqualTo(Integer value) {
            addCriterion("if_complete <>", value, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteGreaterThan(Integer value) {
            addCriterion("if_complete >", value, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_complete >=", value, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteLessThan(Integer value) {
            addCriterion("if_complete <", value, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("if_complete <=", value, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteIn(List<Integer> values) {
            addCriterion("if_complete in", values, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteNotIn(List<Integer> values) {
            addCriterion("if_complete not in", values, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteBetween(Integer value1, Integer value2) {
            addCriterion("if_complete between", value1, value2, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andIfCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("if_complete not between", value1, value2, "ifComplete");
            return (Criteria) this;
        }

        public Criteria andResultPreficIsNull() {
            addCriterion("result_prefic is null");
            return (Criteria) this;
        }

        public Criteria andResultPreficIsNotNull() {
            addCriterion("result_prefic is not null");
            return (Criteria) this;
        }

        public Criteria andResultPreficEqualTo(String value) {
            addCriterion("result_prefic =", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficNotEqualTo(String value) {
            addCriterion("result_prefic <>", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficGreaterThan(String value) {
            addCriterion("result_prefic >", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficGreaterThanOrEqualTo(String value) {
            addCriterion("result_prefic >=", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficLessThan(String value) {
            addCriterion("result_prefic <", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficLessThanOrEqualTo(String value) {
            addCriterion("result_prefic <=", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficLike(String value) {
            addCriterion("result_prefic like", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficNotLike(String value) {
            addCriterion("result_prefic not like", value, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficIn(List<String> values) {
            addCriterion("result_prefic in", values, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficNotIn(List<String> values) {
            addCriterion("result_prefic not in", values, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficBetween(String value1, String value2) {
            addCriterion("result_prefic between", value1, value2, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultPreficNotBetween(String value1, String value2) {
            addCriterion("result_prefic not between", value1, value2, "resultPrefic");
            return (Criteria) this;
        }

        public Criteria andResultTextIsNull() {
            addCriterion("result_text is null");
            return (Criteria) this;
        }

        public Criteria andResultTextIsNotNull() {
            addCriterion("result_text is not null");
            return (Criteria) this;
        }

        public Criteria andResultTextEqualTo(String value) {
            addCriterion("result_text =", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextNotEqualTo(String value) {
            addCriterion("result_text <>", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextGreaterThan(String value) {
            addCriterion("result_text >", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextGreaterThanOrEqualTo(String value) {
            addCriterion("result_text >=", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextLessThan(String value) {
            addCriterion("result_text <", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextLessThanOrEqualTo(String value) {
            addCriterion("result_text <=", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextLike(String value) {
            addCriterion("result_text like", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextNotLike(String value) {
            addCriterion("result_text not like", value, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextIn(List<String> values) {
            addCriterion("result_text in", values, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextNotIn(List<String> values) {
            addCriterion("result_text not in", values, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextBetween(String value1, String value2) {
            addCriterion("result_text between", value1, value2, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultTextNotBetween(String value1, String value2) {
            addCriterion("result_text not between", value1, value2, "resultText");
            return (Criteria) this;
        }

        public Criteria andResultGradeIsNull() {
            addCriterion("result_grade is null");
            return (Criteria) this;
        }

        public Criteria andResultGradeIsNotNull() {
            addCriterion("result_grade is not null");
            return (Criteria) this;
        }

        public Criteria andResultGradeEqualTo(Double value) {
            addCriterion("result_grade =", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeNotEqualTo(Double value) {
            addCriterion("result_grade <>", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeGreaterThan(Double value) {
            addCriterion("result_grade >", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("result_grade >=", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeLessThan(Double value) {
            addCriterion("result_grade <", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeLessThanOrEqualTo(Double value) {
            addCriterion("result_grade <=", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeIn(List<Double> values) {
            addCriterion("result_grade in", values, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeNotIn(List<Double> values) {
            addCriterion("result_grade not in", values, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeBetween(Double value1, Double value2) {
            addCriterion("result_grade between", value1, value2, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeNotBetween(Double value1, Double value2) {
            addCriterion("result_grade not between", value1, value2, "resultGrade");
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