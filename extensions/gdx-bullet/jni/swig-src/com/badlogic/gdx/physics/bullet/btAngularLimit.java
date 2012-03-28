/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btAngularLimit {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btAngularLimit(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btAngularLimit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btAngularLimit(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btAngularLimit() {
    this(gdxBulletJNI.new_btAngularLimit(), true);
  }

  public void set(float low, float high, float _softness, float _biasFactor, float _relaxationFactor) {
    gdxBulletJNI.btAngularLimit_set__SWIG_0(swigCPtr, this, low, high, _softness, _biasFactor, _relaxationFactor);
  }

  public void set(float low, float high, float _softness, float _biasFactor) {
    gdxBulletJNI.btAngularLimit_set__SWIG_1(swigCPtr, this, low, high, _softness, _biasFactor);
  }

  public void set(float low, float high, float _softness) {
    gdxBulletJNI.btAngularLimit_set__SWIG_2(swigCPtr, this, low, high, _softness);
  }

  public void set(float low, float high) {
    gdxBulletJNI.btAngularLimit_set__SWIG_3(swigCPtr, this, low, high);
  }

  public void test(float angle) {
    gdxBulletJNI.btAngularLimit_test(swigCPtr, this, angle);
  }

  public float getSoftness() {
    return gdxBulletJNI.btAngularLimit_getSoftness(swigCPtr, this);
  }

  public float getBiasFactor() {
    return gdxBulletJNI.btAngularLimit_getBiasFactor(swigCPtr, this);
  }

  public float getRelaxationFactor() {
    return gdxBulletJNI.btAngularLimit_getRelaxationFactor(swigCPtr, this);
  }

  public float getCorrection() {
    return gdxBulletJNI.btAngularLimit_getCorrection(swigCPtr, this);
  }

  public float getSign() {
    return gdxBulletJNI.btAngularLimit_getSign(swigCPtr, this);
  }

  public float getHalfRange() {
    return gdxBulletJNI.btAngularLimit_getHalfRange(swigCPtr, this);
  }

  public boolean isLimit() {
    return gdxBulletJNI.btAngularLimit_isLimit(swigCPtr, this);
  }

  public void fit(SWIGTYPE_p_float angle) {
    gdxBulletJNI.btAngularLimit_fit(swigCPtr, this, SWIGTYPE_p_float.getCPtr(angle));
  }

  public float getError() {
    return gdxBulletJNI.btAngularLimit_getError(swigCPtr, this);
  }

  public float getLow() {
    return gdxBulletJNI.btAngularLimit_getLow(swigCPtr, this);
  }

  public float getHigh() {
    return gdxBulletJNI.btAngularLimit_getHigh(swigCPtr, this);
  }

}
