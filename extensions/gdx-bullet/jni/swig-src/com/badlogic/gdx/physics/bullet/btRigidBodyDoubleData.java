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

public class btRigidBodyDoubleData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btRigidBodyDoubleData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btRigidBodyDoubleData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btRigidBodyDoubleData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_collisionObjectData(btCollisionObjectDoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_collisionObjectData_set(swigCPtr, this, btCollisionObjectDoubleData.getCPtr(value), value);
  }

  public btCollisionObjectDoubleData getM_collisionObjectData() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_collisionObjectData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectDoubleData(cPtr, false);
  }

  public void setM_invInertiaTensorWorld(SWIGTYPE_p_btMatrix3x3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_invInertiaTensorWorld_set(swigCPtr, this, SWIGTYPE_p_btMatrix3x3DoubleData.getCPtr(value));
  }

  public SWIGTYPE_p_btMatrix3x3DoubleData getM_invInertiaTensorWorld() {
    return new SWIGTYPE_p_btMatrix3x3DoubleData(gdxBulletJNI.btRigidBodyDoubleData_m_invInertiaTensorWorld_get(swigCPtr, this), true);
  }

  public void setM_linearVelocity(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_linearVelocity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_linearVelocity() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_linearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_angularVelocity(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_angularVelocity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_angularVelocity() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_angularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_angularFactor(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_angularFactor_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_angularFactor() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_linearFactor(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_linearFactor_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_linearFactor() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_linearFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_gravity(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_gravity_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_gravity() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_gravity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_gravity_acceleration(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_gravity_acceleration_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_gravity_acceleration() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_gravity_acceleration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_invInertiaLocal(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_invInertiaLocal_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_invInertiaLocal() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_invInertiaLocal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_totalForce(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_totalForce_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_totalForce() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_totalForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_totalTorque(btVector3DoubleData value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_totalTorque_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getM_totalTorque() {
    long cPtr = gdxBulletJNI.btRigidBodyDoubleData_m_totalTorque_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setM_inverseMass(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_inverseMass_set(swigCPtr, this, value);
  }

  public double getM_inverseMass() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_inverseMass_get(swigCPtr, this);
  }

  public void setM_linearDamping(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_linearDamping_set(swigCPtr, this, value);
  }

  public double getM_linearDamping() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_linearDamping_get(swigCPtr, this);
  }

  public void setM_angularDamping(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_angularDamping_set(swigCPtr, this, value);
  }

  public double getM_angularDamping() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_angularDamping_get(swigCPtr, this);
  }

  public void setM_additionalDampingFactor(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_additionalDampingFactor_set(swigCPtr, this, value);
  }

  public double getM_additionalDampingFactor() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_additionalDampingFactor_get(swigCPtr, this);
  }

  public void setM_additionalLinearDampingThresholdSqr(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_additionalLinearDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public double getM_additionalLinearDampingThresholdSqr() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_additionalLinearDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setM_additionalAngularDampingThresholdSqr(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_additionalAngularDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public double getM_additionalAngularDampingThresholdSqr() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_additionalAngularDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setM_additionalAngularDampingFactor(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_additionalAngularDampingFactor_set(swigCPtr, this, value);
  }

  public double getM_additionalAngularDampingFactor() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_additionalAngularDampingFactor_get(swigCPtr, this);
  }

  public void setM_linearSleepingThreshold(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_linearSleepingThreshold_set(swigCPtr, this, value);
  }

  public double getM_linearSleepingThreshold() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_linearSleepingThreshold_get(swigCPtr, this);
  }

  public void setM_angularSleepingThreshold(double value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_angularSleepingThreshold_set(swigCPtr, this, value);
  }

  public double getM_angularSleepingThreshold() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_angularSleepingThreshold_get(swigCPtr, this);
  }

  public void setM_additionalDamping(int value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_additionalDamping_set(swigCPtr, this, value);
  }

  public int getM_additionalDamping() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_additionalDamping_get(swigCPtr, this);
  }

  public void setM_padding(String value) {
    gdxBulletJNI.btRigidBodyDoubleData_m_padding_set(swigCPtr, this, value);
  }

  public String getM_padding() {
    return gdxBulletJNI.btRigidBodyDoubleData_m_padding_get(swigCPtr, this);
  }

  public btRigidBodyDoubleData() {
    this(gdxBulletJNI.new_btRigidBodyDoubleData(), true);
  }

}
