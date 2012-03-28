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

public class btMultimaterialTriangleMeshShape extends btBvhTriangleMeshShape {
  private long swigCPtr;

  protected btMultimaterialTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btMultimaterialTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btMultimaterialTriangleMeshShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btMultimaterialTriangleMeshShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
    this(gdxBulletJNI.new_btMultimaterialTriangleMeshShape__SWIG_0(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, buildBvh), true);
  }

  public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
    this(gdxBulletJNI.new_btMultimaterialTriangleMeshShape__SWIG_1(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression), true);
  }

  public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
    this(gdxBulletJNI.new_btMultimaterialTriangleMeshShape__SWIG_2(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh), true);
  }

  public btMultimaterialTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
    this(gdxBulletJNI.new_btMultimaterialTriangleMeshShape__SWIG_3(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax), true);
  }

  public btMaterial getMaterialProperties(int partID, int triIndex) {
    long cPtr = gdxBulletJNI.btMultimaterialTriangleMeshShape_getMaterialProperties(swigCPtr, this, partID, triIndex);
    return (cPtr == 0) ? null : new btMaterial(cPtr, false);
  }

}
