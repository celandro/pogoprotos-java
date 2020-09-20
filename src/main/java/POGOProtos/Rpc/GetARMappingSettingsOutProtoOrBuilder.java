// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetARMappingSettingsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetARMappingSettingsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool is_client_scan_validation_enabled = 1;</code>
   * @return The isClientScanValidationEnabled.
   */
  boolean getIsClientScanValidationEnabled();

  /**
   * <code>repeated string client_scan_validation_blocked_os = 2;</code>
   * @return A list containing the clientScanValidationBlockedOs.
   */
  java.util.List<java.lang.String>
      getClientScanValidationBlockedOsList();
  /**
   * <code>repeated string client_scan_validation_blocked_os = 2;</code>
   * @return The count of clientScanValidationBlockedOs.
   */
  int getClientScanValidationBlockedOsCount();
  /**
   * <code>repeated string client_scan_validation_blocked_os = 2;</code>
   * @param index The index of the element to return.
   * @return The clientScanValidationBlockedOs at the given index.
   */
  java.lang.String getClientScanValidationBlockedOs(int index);
  /**
   * <code>repeated string client_scan_validation_blocked_os = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the clientScanValidationBlockedOs at the given index.
   */
  com.google.protobuf.ByteString
      getClientScanValidationBlockedOsBytes(int index);

  /**
   * <code>repeated string client_scan_validation_blocked_device_id = 3;</code>
   * @return A list containing the clientScanValidationBlockedDeviceId.
   */
  java.util.List<java.lang.String>
      getClientScanValidationBlockedDeviceIdList();
  /**
   * <code>repeated string client_scan_validation_blocked_device_id = 3;</code>
   * @return The count of clientScanValidationBlockedDeviceId.
   */
  int getClientScanValidationBlockedDeviceIdCount();
  /**
   * <code>repeated string client_scan_validation_blocked_device_id = 3;</code>
   * @param index The index of the element to return.
   * @return The clientScanValidationBlockedDeviceId at the given index.
   */
  java.lang.String getClientScanValidationBlockedDeviceId(int index);
  /**
   * <code>repeated string client_scan_validation_blocked_device_id = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the clientScanValidationBlockedDeviceId at the given index.
   */
  com.google.protobuf.ByteString
      getClientScanValidationBlockedDeviceIdBytes(int index);
}
