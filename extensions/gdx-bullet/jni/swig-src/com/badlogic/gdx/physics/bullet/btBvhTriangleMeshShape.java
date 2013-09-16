/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.model.NodePart;
import com.badlogic.gdx.utils.Array;

public class btBvhTriangleMeshShape extends btTriangleMeshShape {
	private long swigCPtr;
	
	protected btBvhTriangleMeshShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btBvhTriangleMeshShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btBvhTriangleMeshShape(long cPtr, boolean cMemoryOwn) {
		this("btBvhTriangleMeshShape", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btBvhTriangleMeshShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btBvhTriangleMeshShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	protected final static Array<btBvhTriangleMeshShape> instances = new Array<btBvhTriangleMeshShape>();
	
	protected static <T extends MeshPart> btBvhTriangleMeshShape getInstance(final Array<T> meshParts) {
		for (final btBvhTriangleMeshShape instance : instances) {
			if (instance.meshInterface instanceof btTriangleIndexVertexArray &&
					btTriangleIndexVertexArray.compare((btTriangleIndexVertexArray)(instance.meshInterface), meshParts))
				return instance;
		}
		return null;
	}
	
	/** Obtain an instance of btBvhTriangleMeshShape, made up of the specified {@link MeshPart} instances.
	 * Where possible previously obtained objects are reused. You must call {@link #release()},
	 * when you no longer need the shape. */
	public static <T extends MeshPart> btBvhTriangleMeshShape obtain(final Array<T> meshParts) {
		btBvhTriangleMeshShape result = getInstance(meshParts);
		if (result == null) {
			result = new btBvhTriangleMeshShape(btTriangleIndexVertexArray.obtain(meshParts), true);
			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	private btStridingMeshInterface meshInterface = null;
	
	/** @return The {@link btStridingMeshInterface} this shape encapsulates. */ 
	public btStridingMeshInterface getMeshInterface() {
		return meshInterface;
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts) {
		this(meshParts, true);
	}
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression);
	}
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, buildBvh);
	}
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}
	
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		this(0, meshInterface, useQuantizedAabbCompression);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(0, meshInterface, useQuantizedAabbCompression, buildBvh);
	}
	
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}
	
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}
	
	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		this(true, meshInterface, useQuantizedAabbCompression);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(true, meshInterface, useQuantizedAabbCompression, buildBvh);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}
	
	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}
	
	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}
	
	
	public void dispose() {
		if (meshInterface != null)
			meshInterface.release();
		meshInterface = null;
		super.dispose();
	}

  public boolean getOwnsBvh() {
    return gdxBulletJNI.btBvhTriangleMeshShape_getOwnsBvh(swigCPtr, this);
  }

  public void performRaycast(btTriangleCallback callback, Vector3 raySource, Vector3 rayTarget) {
    gdxBulletJNI.btBvhTriangleMeshShape_performRaycast(swigCPtr, this, btTriangleCallback.getCPtr(callback), callback, raySource, rayTarget);
  }

  public void performConvexcast(btTriangleCallback callback, Vector3 boxSource, Vector3 boxTarget, Vector3 boxMin, Vector3 boxMax) {
    gdxBulletJNI.btBvhTriangleMeshShape_performConvexcast(swigCPtr, this, btTriangleCallback.getCPtr(callback), callback, boxSource, boxTarget, boxMin, boxMax);
  }

  public void refitTree(Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btBvhTriangleMeshShape_refitTree(swigCPtr, this, aabbMin, aabbMax);
  }

  public void partialRefitTree(Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btBvhTriangleMeshShape_partialRefitTree(swigCPtr, this, aabbMin, aabbMax);
  }

  public btOptimizedBvh getOptimizedBvh() {
    long cPtr = gdxBulletJNI.btBvhTriangleMeshShape_getOptimizedBvh(swigCPtr, this);
    return (cPtr == 0) ? null : new btOptimizedBvh(cPtr, false);
  }

  public void setOptimizedBvh(btOptimizedBvh bvh, Vector3 localScaling) {
    gdxBulletJNI.btBvhTriangleMeshShape_setOptimizedBvh__SWIG_0(swigCPtr, this, btOptimizedBvh.getCPtr(bvh), bvh, localScaling);
  }

  public void setOptimizedBvh(btOptimizedBvh bvh) {
    gdxBulletJNI.btBvhTriangleMeshShape_setOptimizedBvh__SWIG_1(swigCPtr, this, btOptimizedBvh.getCPtr(bvh), bvh);
  }

  public void buildOptimizedBvh() {
    gdxBulletJNI.btBvhTriangleMeshShape_buildOptimizedBvh(swigCPtr, this);
  }

  public boolean usesQuantizedAabbCompression() {
    return gdxBulletJNI.btBvhTriangleMeshShape_usesQuantizedAabbCompression(swigCPtr, this);
  }

  public void setTriangleInfoMap(btTriangleInfoMap triangleInfoMap) {
    gdxBulletJNI.btBvhTriangleMeshShape_setTriangleInfoMap(swigCPtr, this, btTriangleInfoMap.getCPtr(triangleInfoMap), triangleInfoMap);
  }

  public btTriangleInfoMap getTriangleInfoMap() {
    long cPtr = gdxBulletJNI.btBvhTriangleMeshShape_getTriangleInfoMap__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btTriangleInfoMap(cPtr, false);
  }

  public void serializeSingleBvh(SWIGTYPE_p_btSerializer serializer) {
    gdxBulletJNI.btBvhTriangleMeshShape_serializeSingleBvh(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void serializeSingleTriangleInfoMap(SWIGTYPE_p_btSerializer serializer) {
    gdxBulletJNI.btBvhTriangleMeshShape_serializeSingleTriangleInfoMap(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_0(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, buildBvh), true);
  }

  private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_1(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression), true);
  }

  private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_2(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh), true);
  }

  private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
    this(gdxBulletJNI.new_btBvhTriangleMeshShape__SWIG_3(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax), true);
  }

}
