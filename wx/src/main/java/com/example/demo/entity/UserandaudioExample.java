package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UserandaudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserandaudioExample() {
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

        public Criteria andUserAudioIdIsNull() {
            addCriterion("user_audio_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdIsNotNull() {
            addCriterion("user_audio_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdEqualTo(Integer value) {
            addCriterion("user_audio_id =", value, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdNotEqualTo(Integer value) {
            addCriterion("user_audio_id <>", value, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdGreaterThan(Integer value) {
            addCriterion("user_audio_id >", value, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_audio_id >=", value, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdLessThan(Integer value) {
            addCriterion("user_audio_id <", value, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_audio_id <=", value, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdIn(List<Integer> values) {
            addCriterion("user_audio_id in", values, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdNotIn(List<Integer> values) {
            addCriterion("user_audio_id not in", values, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdBetween(Integer value1, Integer value2) {
            addCriterion("user_audio_id between", value1, value2, "userAudioId");
            return (Criteria) this;
        }

        public Criteria andUserAudioIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_audio_id not between", value1, value2, "userAudioId");
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