// automatically generated by the FlatBuffers compiler, do not modify

package io.jeti.measure.utils;

import java.nio.*;
import java.lang.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class AndroidImage extends Table {
  public static AndroidImage getRootAsAndroidImage(ByteBuffer _bb) { return getRootAsAndroidImage(_bb, new AndroidImage()); }
  public static AndroidImage getRootAsAndroidImage(ByteBuffer _bb, AndroidImage obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public AndroidImage __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int height() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int width() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int format() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int data(int j) { int o = __offset(10); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int dataLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer dataAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }

  public static int createAndroidImage(FlatBufferBuilder builder,
      int height,
      int width,
      int format,
      int dataOffset) {
    builder.startObject(4);
    AndroidImage.addData(builder, dataOffset);
    AndroidImage.addFormat(builder, format);
    AndroidImage.addWidth(builder, width);
    AndroidImage.addHeight(builder, height);
    return AndroidImage.endAndroidImage(builder);
  }

  public static void startAndroidImage(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addHeight(FlatBufferBuilder builder, int height) { builder.addInt(0, height, 0); }
  public static void addWidth(FlatBufferBuilder builder, int width) { builder.addInt(1, width, 0); }
  public static void addFormat(FlatBufferBuilder builder, int format) { builder.addInt(2, format, 0); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(3, dataOffset, 0); }
  public static int createDataVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endAndroidImage(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 10);  // data
    return o;
  }
}
