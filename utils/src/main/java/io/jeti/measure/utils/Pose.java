// automatically generated by the FlatBuffers compiler, do not modify

package io.jeti.measure.utils;

import java.nio.*;
import java.lang.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Pose extends Table {
  public static Pose getRootAsPose(ByteBuffer _bb) { return getRootAsPose(_bb, new Pose()); }
  public static Pose getRootAsPose(ByteBuffer _bb, Pose obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Pose __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public double r(int j) { int o = __offset(4); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int rLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer rAsByteBuffer() { return __vector_as_bytebuffer(4, 8); }
  public double q(int j) { int o = __offset(6); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int qLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer qAsByteBuffer() { return __vector_as_bytebuffer(6, 8); }

  public static int createPose(FlatBufferBuilder builder,
      int rOffset,
      int qOffset) {
    builder.startObject(2);
    Pose.addQ(builder, qOffset);
    Pose.addR(builder, rOffset);
    return Pose.endPose(builder);
  }

  public static void startPose(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addR(FlatBufferBuilder builder, int rOffset) { builder.addOffset(0, rOffset, 0); }
  public static int createRVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startRVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addQ(FlatBufferBuilder builder, int qOffset) { builder.addOffset(1, qOffset, 0); }
  public static int createQVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startQVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static int endPose(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // r
    builder.required(o, 6);  // q
    return o;
  }
}

