// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface LabelGeometryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.LabelGeometry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
   * @return The point.
   */
  POGOProtos.Rpc.PixelPointProto getPoint();
  /**
   * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
   */
  POGOProtos.Rpc.PixelPointProtoOrBuilder getPointOrBuilder();

  /**
   * <code>int32 min_zoom = 2;</code>
   * @return The minZoom.
   */
  int getMinZoom();

  /**
   * <code>int32 max_zoom = 3;</code>
   * @return The maxZoom.
   */
  int getMaxZoom();
}
