// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface DeviceServiceToggleTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.DeviceServiceToggleTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for deviceServiceTelemetryId.
   */
  int getDeviceServiceTelemetryIdValue();
  /**
   * <code>.POGOProtos.Rpc.DeviceServiceTelemetryIds device_service_telemetry_id = 1;</code>
   * @return The deviceServiceTelemetryId.
   */
  POGOProtos.Rpc.DeviceServiceTelemetryIds getDeviceServiceTelemetryId();

  /**
   * <code>bool was_enabled = 2;</code>
   * @return The wasEnabled.
   */
  boolean getWasEnabled();

  /**
   * <code>bool was_subsequent = 3;</code>
   * @return The wasSubsequent.
   */
  boolean getWasSubsequent();
}
