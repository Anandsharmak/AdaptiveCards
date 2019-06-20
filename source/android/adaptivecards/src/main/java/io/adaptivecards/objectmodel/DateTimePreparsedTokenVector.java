/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class DateTimePreparsedTokenVector extends java.util.AbstractList<DateTimePreparsedToken> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DateTimePreparsedTokenVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DateTimePreparsedTokenVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_DateTimePreparsedTokenVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DateTimePreparsedTokenVector(DateTimePreparsedToken[] initialElements) {
    this();
    for (DateTimePreparsedToken element : initialElements) {
      add(element);
    }
  }

  public DateTimePreparsedTokenVector(Iterable<DateTimePreparsedToken> initialElements) {
    this();
    for (DateTimePreparsedToken element : initialElements) {
      add(element);
    }
  }

  public DateTimePreparsedToken get(int index) {
    return doGet(index);
  }

  public DateTimePreparsedToken set(int index, DateTimePreparsedToken e) {
    return doSet(index, e);
  }

  public boolean add(DateTimePreparsedToken e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, DateTimePreparsedToken e) {
    modCount++;
    doAdd(index, e);
  }

  public DateTimePreparsedToken remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public DateTimePreparsedTokenVector() {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparsedTokenVector__SWIG_0(), true);
  }

  public DateTimePreparsedTokenVector(DateTimePreparsedTokenVector other) {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparsedTokenVector__SWIG_1(DateTimePreparsedTokenVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_clear(swigCPtr, this);
  }

  public DateTimePreparsedTokenVector(int count) {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparsedTokenVector__SWIG_2(count), true);
  }

  public DateTimePreparsedTokenVector(int count, DateTimePreparsedToken value) {
    this(AdaptiveCardObjectModelJNI.new_DateTimePreparsedTokenVector__SWIG_3(count, DateTimePreparsedToken.getCPtr(value), value), true);
  }

  private int doSize() {
    return AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doSize(swigCPtr, this);
  }

  private void doAdd(DateTimePreparsedToken value) {
    AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doAdd__SWIG_0(swigCPtr, this, DateTimePreparsedToken.getCPtr(value), value);
  }

  private void doAdd(int index, DateTimePreparsedToken value) {
    AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doAdd__SWIG_1(swigCPtr, this, index, DateTimePreparsedToken.getCPtr(value), value);
  }

  private DateTimePreparsedToken doRemove(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new DateTimePreparsedToken(cPtr, true);
  }

  private DateTimePreparsedToken doGet(int index) {
    long cPtr = AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new DateTimePreparsedToken(cPtr, true);
  }

  private DateTimePreparsedToken doSet(int index, DateTimePreparsedToken value) {
    long cPtr = AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doSet(swigCPtr, this, index, DateTimePreparsedToken.getCPtr(value), value);
    return (cPtr == 0) ? null : new DateTimePreparsedToken(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    AdaptiveCardObjectModelJNI.DateTimePreparsedTokenVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
