package com.qapp.model.generated;

import java.util.ArrayList;
import java.util.List;

public class AnswerContentExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public AnswerContentExample() {
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

    public Criteria andAnswerIdIsNull() {
      addCriterion("answer_id is null");
      return (Criteria) this;
    }

    public Criteria andAnswerIdIsNotNull() {
      addCriterion("answer_id is not null");
      return (Criteria) this;
    }

    public Criteria andAnswerIdEqualTo(Long value) {
      addCriterion("answer_id =", value, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdNotEqualTo(Long value) {
      addCriterion("answer_id <>", value, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdGreaterThan(Long value) {
      addCriterion("answer_id >", value, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdGreaterThanOrEqualTo(Long value) {
      addCriterion("answer_id >=", value, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdLessThan(Long value) {
      addCriterion("answer_id <", value, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdLessThanOrEqualTo(Long value) {
      addCriterion("answer_id <=", value, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdIn(List<Long> values) {
      addCriterion("answer_id in", values, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdNotIn(List<Long> values) {
      addCriterion("answer_id not in", values, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdBetween(Long value1, Long value2) {
      addCriterion("answer_id between", value1, value2, "answerId");
      return (Criteria) this;
    }

    public Criteria andAnswerIdNotBetween(Long value1, Long value2) {
      addCriterion("answer_id not between", value1, value2, "answerId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdIsNull() {
      addCriterion("content_type_id is null");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdIsNotNull() {
      addCriterion("content_type_id is not null");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdEqualTo(Integer value) {
      addCriterion("content_type_id =", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdNotEqualTo(Integer value) {
      addCriterion("content_type_id <>", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdGreaterThan(Integer value) {
      addCriterion("content_type_id >", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("content_type_id >=", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdLessThan(Integer value) {
      addCriterion("content_type_id <", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdLessThanOrEqualTo(Integer value) {
      addCriterion("content_type_id <=", value, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdIn(List<Integer> values) {
      addCriterion("content_type_id in", values, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdNotIn(List<Integer> values) {
      addCriterion("content_type_id not in", values, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdBetween(Integer value1, Integer value2) {
      addCriterion("content_type_id between", value1, value2, "contentTypeId");
      return (Criteria) this;
    }

    public Criteria andContentTypeIdNotBetween(Integer value1, Integer value2) {
      addCriterion("content_type_id not between", value1, value2, "contentTypeId");
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
