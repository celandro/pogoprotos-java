// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface CollectAdIdRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CollectAdIdRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string ad_id = 2;</code>
   * @return The adId.
   */
  java.lang.String getAdId();
  /**
   * <code>string ad_id = 2;</code>
   * @return The bytes for adId.
   */
  com.google.protobuf.ByteString
      getAdIdBytes();

  /**
   * <code>.POGOProtos.Rpc.CollectAdIdRequestProto.DevicePlatform device_platform = 3;</code>
   * @return The enum numeric value on the wire for devicePlatform.
   */
  int getDevicePlatformValue();
  /**
   * <code>.POGOProtos.Rpc.CollectAdIdRequestProto.DevicePlatform device_platform = 3;</code>
   * @return The devicePlatform.
   */
  POGOProtos.Rpc.CollectAdIdRequestProto.DevicePlatform getDevicePlatform();

  /**
   * <code>.POGOProtos.Rpc.CollectAdIdRequestProto.CollectionFailedReason failed_reason = 4;</code>
   * @return The enum numeric value on the wire for failedReason.
   */
  int getFailedReasonValue();
  /**
   * <code>.POGOProtos.Rpc.CollectAdIdRequestProto.CollectionFailedReason failed_reason = 4;</code>
   * @return The failedReason.
   */
  POGOProtos.Rpc.CollectAdIdRequestProto.CollectionFailedReason getFailedReason();

  /**
   * <code>uint64 timestamp_ms = 5;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();
}