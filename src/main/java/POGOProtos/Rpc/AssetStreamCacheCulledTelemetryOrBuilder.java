// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface AssetStreamCacheCulledTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AssetStreamCacheCulledTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The enum numeric value on the wire for assetEventId.
   */
  int getAssetEventIdValue();
  /**
   * <code>.POGOProtos.Rpc.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The assetEventId.
   */
  POGOProtos.Rpc.AssetTelemetryIds getAssetEventId();

  /**
   * <code>uint32 space_released = 2;</code>
   * @return The spaceReleased.
   */
  int getSpaceReleased();
}