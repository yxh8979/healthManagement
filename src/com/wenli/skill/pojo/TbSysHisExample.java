package com.wenli.skill.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbSysHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSysHisExample() {
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

        public Criteria andHisidIsNull() {
            addCriterion("hisid is null");
            return (Criteria) this;
        }

        public Criteria andHisidIsNotNull() {
            addCriterion("hisid is not null");
            return (Criteria) this;
        }

        public Criteria andHisidEqualTo(Integer value) {
            addCriterion("hisid =", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidNotEqualTo(Integer value) {
            addCriterion("hisid <>", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidGreaterThan(Integer value) {
            addCriterion("hisid >", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hisid >=", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidLessThan(Integer value) {
            addCriterion("hisid <", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidLessThanOrEqualTo(Integer value) {
            addCriterion("hisid <=", value, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidIn(List<Integer> values) {
            addCriterion("hisid in", values, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidNotIn(List<Integer> values) {
            addCriterion("hisid not in", values, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidBetween(Integer value1, Integer value2) {
            addCriterion("hisid between", value1, value2, "hisid");
            return (Criteria) this;
        }

        public Criteria andHisidNotBetween(Integer value1, Integer value2) {
            addCriterion("hisid not between", value1, value2, "hisid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("starttime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("starttime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endtime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endtime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andIllnessIsNull() {
            addCriterion("illness is null");
            return (Criteria) this;
        }

        public Criteria andIllnessIsNotNull() {
            addCriterion("illness is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessEqualTo(String value) {
            addCriterion("illness =", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessNotEqualTo(String value) {
            addCriterion("illness <>", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessGreaterThan(String value) {
            addCriterion("illness >", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessGreaterThanOrEqualTo(String value) {
            addCriterion("illness >=", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessLessThan(String value) {
            addCriterion("illness <", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessLessThanOrEqualTo(String value) {
            addCriterion("illness <=", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessLike(String value) {
            addCriterion("illness like", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessNotLike(String value) {
            addCriterion("illness not like", value, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessIn(List<String> values) {
            addCriterion("illness in", values, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessNotIn(List<String> values) {
            addCriterion("illness not in", values, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessBetween(String value1, String value2) {
            addCriterion("illness between", value1, value2, "illness");
            return (Criteria) this;
        }

        public Criteria andIllnessNotBetween(String value1, String value2) {
            addCriterion("illness not between", value1, value2, "illness");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDaycountIsNull() {
            addCriterion("daycount is null");
            return (Criteria) this;
        }

        public Criteria andDaycountIsNotNull() {
            addCriterion("daycount is not null");
            return (Criteria) this;
        }

        public Criteria andDaycountEqualTo(String value) {
            addCriterion("daycount =", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountNotEqualTo(String value) {
            addCriterion("daycount <>", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountGreaterThan(String value) {
            addCriterion("daycount >", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountGreaterThanOrEqualTo(String value) {
            addCriterion("daycount >=", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountLessThan(String value) {
            addCriterion("daycount <", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountLessThanOrEqualTo(String value) {
            addCriterion("daycount <=", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountLike(String value) {
            addCriterion("daycount like", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountNotLike(String value) {
            addCriterion("daycount not like", value, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountIn(List<String> values) {
            addCriterion("daycount in", values, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountNotIn(List<String> values) {
            addCriterion("daycount not in", values, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountBetween(String value1, String value2) {
            addCriterion("daycount between", value1, value2, "daycount");
            return (Criteria) this;
        }

        public Criteria andDaycountNotBetween(String value1, String value2) {
            addCriterion("daycount not between", value1, value2, "daycount");
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