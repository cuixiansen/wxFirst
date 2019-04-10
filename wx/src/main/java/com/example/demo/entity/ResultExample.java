package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultExample() {
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

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(Integer value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(Integer value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(Integer value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(Integer value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<Integer> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<Integer> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(Integer value1, Integer value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
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

        public Criteria andResultPrefixIsNull() {
            addCriterion("result_prefix is null");
            return (Criteria) this;
        }

        public Criteria andResultPrefixIsNotNull() {
            addCriterion("result_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andResultPrefixEqualTo(String value) {
            addCriterion("result_prefix =", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixNotEqualTo(String value) {
            addCriterion("result_prefix <>", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixGreaterThan(String value) {
            addCriterion("result_prefix >", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("result_prefix >=", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixLessThan(String value) {
            addCriterion("result_prefix <", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixLessThanOrEqualTo(String value) {
            addCriterion("result_prefix <=", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixLike(String value) {
            addCriterion("result_prefix like", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixNotLike(String value) {
            addCriterion("result_prefix not like", value, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixIn(List<String> values) {
            addCriterion("result_prefix in", values, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixNotIn(List<String> values) {
            addCriterion("result_prefix not in", values, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixBetween(String value1, String value2) {
            addCriterion("result_prefix between", value1, value2, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andResultPrefixNotBetween(String value1, String value2) {
            addCriterion("result_prefix not between", value1, value2, "resultPrefix");
            return (Criteria) this;
        }

        public Criteria andMinGradeIsNull() {
            addCriterion("min_grade is null");
            return (Criteria) this;
        }

        public Criteria andMinGradeIsNotNull() {
            addCriterion("min_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMinGradeEqualTo(Double value) {
            addCriterion("min_grade =", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeNotEqualTo(Double value) {
            addCriterion("min_grade <>", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeGreaterThan(Double value) {
            addCriterion("min_grade >", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("min_grade >=", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeLessThan(Double value) {
            addCriterion("min_grade <", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeLessThanOrEqualTo(Double value) {
            addCriterion("min_grade <=", value, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeIn(List<Double> values) {
            addCriterion("min_grade in", values, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeNotIn(List<Double> values) {
            addCriterion("min_grade not in", values, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeBetween(Double value1, Double value2) {
            addCriterion("min_grade between", value1, value2, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMinGradeNotBetween(Double value1, Double value2) {
            addCriterion("min_grade not between", value1, value2, "minGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeIsNull() {
            addCriterion("max_grade is null");
            return (Criteria) this;
        }

        public Criteria andMaxGradeIsNotNull() {
            addCriterion("max_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMaxGradeEqualTo(Double value) {
            addCriterion("max_grade =", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeNotEqualTo(Double value) {
            addCriterion("max_grade <>", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeGreaterThan(Double value) {
            addCriterion("max_grade >", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("max_grade >=", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeLessThan(Double value) {
            addCriterion("max_grade <", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeLessThanOrEqualTo(Double value) {
            addCriterion("max_grade <=", value, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeIn(List<Double> values) {
            addCriterion("max_grade in", values, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeNotIn(List<Double> values) {
            addCriterion("max_grade not in", values, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeBetween(Double value1, Double value2) {
            addCriterion("max_grade between", value1, value2, "maxGrade");
            return (Criteria) this;
        }

        public Criteria andMaxGradeNotBetween(Double value1, Double value2) {
            addCriterion("max_grade not between", value1, value2, "maxGrade");
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