// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface AssetDigestRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AssetDigestRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
   * @return The enum numeric value on the wire for platform.
   */
  int getPlatformValue();
  /**
   * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
   * @return The platform.
   */
  POGOProtos.Rpc.Platform getPlatform();

  /**
   * <code>string device_manufacturer = 2;</code>
   * @return The deviceManufacturer.
   */
  java.lang.String getDeviceManufacturer();
  /**
   * <code>string device_manufacturer = 2;</code>
   * @return The bytes for deviceManufacturer.
   */
  com.google.protobuf.ByteString
      getDeviceManufacturerBytes();

  /**
   * <code>string device_model = 3;</code>
   * @return The deviceModel.
   */
  java.lang.String getDeviceModel();
  /**
   * <code>string device_model = 3;</code>
   * @return The bytes for deviceModel.
   */
  com.google.protobuf.ByteString
      getDeviceModelBytes();

  /**
   * <code>string locale = 4;</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <code>string locale = 4;</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <code>uint32 app_version = 5;</code>
   * @return The appVersion.
   */
  int getAppVersion();

  /**
   * <code>bool paginate = 6;</code>
   * @return The paginate.
   */
  boolean getPaginate();

  /**
   * <code>int32 page_offset = 7;</code>
   * @return The pageOffset.
   */
  int getPageOffset();

  /**
   * <code>uint64 page_timestamp = 8;</code>
   * @return The pageTimestamp.
   */
  long getPageTimestamp();
}
