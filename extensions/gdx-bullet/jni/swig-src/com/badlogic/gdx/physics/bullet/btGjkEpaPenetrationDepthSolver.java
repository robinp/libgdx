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

public class btGjkEpaPenetrationDepthSolver extends btConvexPenetrationDepthSolver {
  private long swigCPtr;

  protected btGjkEpaPenetrationDepthSolver(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btGjkEpaPenetrationDepthSolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btGjkEpaPenetrationDepthSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btGjkEpaPenetrationDepthSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btGjkEpaPenetrationDepthSolver() {
    this(gdxBulletJNI.new_btGjkEpaPenetrationDepthSolver(), true);
  }

}
