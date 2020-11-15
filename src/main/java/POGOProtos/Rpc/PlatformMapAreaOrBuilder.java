// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformMapAreaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformMapArea)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int32 epoch = 2;</code>
   * @return The epoch.
   */
  int getEpoch();

  /**
   * <code>string map_provider = 3;</code>
   * @return The mapProvider.
   */
  java.lang.String getMapProvider();
  /**
   * <code>string map_provider = 3;</code>
   * @return The bytes for mapProvider.
   */
  com.google.protobuf.ByteString
      getMapProviderBytes();

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformBoundingRect> 
      getBoundingRectList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  POGOProtos.Rpc.PlatformBoundingRect getBoundingRect(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  int getBoundingRectCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformBoundingRectOrBuilder> 
      getBoundingRectOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformBoundingRect bounding_rect = 4;</code>
   */
  POGOProtos.Rpc.PlatformBoundingRectOrBuilder getBoundingRectOrBuilder(
      int index);
}
