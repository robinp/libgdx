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

public class btConvexTriangleCallback extends btTriangleCallback {
  private long swigCPtr;

  protected btConvexTriangleCallback(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btConvexTriangleCallback_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexTriangleCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexTriangleCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_triangleCount(int value) {
    gdxBulletJNI.btConvexTriangleCallback_m_triangleCount_set(swigCPtr, this, value);
  }

  public int getM_triangleCount() {
    return gdxBulletJNI.btConvexTriangleCallback_m_triangleCount_get(swigCPtr, this);
  }

  public void setM_manifoldPtr(btPersistentManifold value) {
    gdxBulletJNI.btConvexTriangleCallback_m_manifoldPtr_set(swigCPtr, this, btPersistentManifold.getCPtr(value), value);
  }

  public btPersistentManifold getM_manifoldPtr() {
    long cPtr = gdxBulletJNI.btConvexTriangleCallback_m_manifoldPtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public btConvexTriangleCallback(btDispatcher dispatcher, btCollisionObject body0, btCollisionObject body1, boolean isSwapped) {
    this(gdxBulletJNI.new_btConvexTriangleCallback(btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionObject.getCPtr(body0), body0, btCollisionObject.getCPtr(body1), body1, isSwapped), true);
  }

  public void setTimeStepAndCounters(float collisionMarginTriangle, btDispatcherInfo dispatchInfo, btManifoldResult resultOut) {
    gdxBulletJNI.btConvexTriangleCallback_setTimeStepAndCounters(swigCPtr, this, collisionMarginTriangle, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo, btManifoldResult.getCPtr(resultOut), resultOut);
  }

  public void clearCache() {
    gdxBulletJNI.btConvexTriangleCallback_clearCache(swigCPtr, this);
  }

  public Vector3 getAabbMin() {
	return gdxBulletJNI.btConvexTriangleCallback_getAabbMin(swigCPtr, this);
}

  public Vector3 getAabbMax() {
	return gdxBulletJNI.btConvexTriangleCallback_getAabbMax(swigCPtr, this);
}

}
