package com.wrk.shopsystem.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public PurchaseOrderExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnotesIsNull() {
            addCriterion("pnotes is null");
            return (Criteria) this;
        }

        public Criteria andPnotesIsNotNull() {
            addCriterion("pnotes is not null");
            return (Criteria) this;
        }

        public Criteria andPnotesEqualTo(String value) {
            addCriterion("pnotes =", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesNotEqualTo(String value) {
            addCriterion("pnotes <>", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesGreaterThan(String value) {
            addCriterion("pnotes >", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesGreaterThanOrEqualTo(String value) {
            addCriterion("pnotes >=", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesLessThan(String value) {
            addCriterion("pnotes <", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesLessThanOrEqualTo(String value) {
            addCriterion("pnotes <=", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesLike(String value) {
            addCriterion("pnotes like", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesNotLike(String value) {
            addCriterion("pnotes not like", value, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesIn(List<String> values) {
            addCriterion("pnotes in", values, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesNotIn(List<String> values) {
            addCriterion("pnotes not in", values, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesBetween(String value1, String value2) {
            addCriterion("pnotes between", value1, value2, "pnotes");
            return (Criteria) this;
        }

        public Criteria andPnotesNotBetween(String value1, String value2) {
            addCriterion("pnotes not between", value1, value2, "pnotes");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterionForJDBCDate("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoIsNull() {
            addCriterion("oper_employee_no is null");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoIsNotNull() {
            addCriterion("oper_employee_no is not null");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoEqualTo(Integer value) {
            addCriterion("oper_employee_no =", value, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoNotEqualTo(Integer value) {
            addCriterion("oper_employee_no <>", value, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoGreaterThan(Integer value) {
            addCriterion("oper_employee_no >", value, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("oper_employee_no >=", value, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoLessThan(Integer value) {
            addCriterion("oper_employee_no <", value, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoLessThanOrEqualTo(Integer value) {
            addCriterion("oper_employee_no <=", value, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoIn(List<Integer> values) {
            addCriterion("oper_employee_no in", values, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoNotIn(List<Integer> values) {
            addCriterion("oper_employee_no not in", values, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoBetween(Integer value1, Integer value2) {
            addCriterion("oper_employee_no between", value1, value2, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andOperEmployeeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("oper_employee_no not between", value1, value2, "operEmployeeNo");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("ischeck is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("ischeck is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(Byte value) {
            addCriterion("ischeck =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(Byte value) {
            addCriterion("ischeck <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(Byte value) {
            addCriterion("ischeck >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("ischeck >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(Byte value) {
            addCriterion("ischeck <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(Byte value) {
            addCriterion("ischeck <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<Byte> values) {
            addCriterion("ischeck in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<Byte> values) {
            addCriterion("ischeck not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(Byte value1, Byte value2) {
            addCriterion("ischeck between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(Byte value1, Byte value2) {
            addCriterion("ischeck not between", value1, value2, "ischeck");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_order
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 28 11:02:14 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_order
     *
     * @mbg.generated Wed Apr 28 11:02:14 CST 2021
     */
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