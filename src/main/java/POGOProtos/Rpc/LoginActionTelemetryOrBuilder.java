// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface LoginActionTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.LoginActionTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.LoginActionTelemetryIds login_action_id = 1;</code>
   * @return The enum numeric value on the wire for loginActionId.
   */
  int getLoginActionIdValue();
  /**
   * <code>.POGOProtos.Rpc.LoginActionTelemetryIds login_action_id = 1;</code>
   * @return The loginActionId.
   */
  POGOProtos.Rpc.LoginActionTelemetryIds getLoginActionId();

  /**
   * <code>bool first_time = 2;</code>
   * @return The firstTime.
   */
  boolean getFirstTime();

  /**
   * <code>bool success = 3;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>bool intent_existing = 4;</code>
   * @return The intentExisting.
   */
  boolean getIntentExisting();

  /**
   * <code>string error = 5;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 5;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>string auth_status = 6;</code>
   * @return The authStatus.
   */
  java.lang.String getAuthStatus();
  /**
   * <code>string auth_status = 6;</code>
   * @return The bytes for authStatus.
   */
  com.google.protobuf.ByteString
      getAuthStatusBytes();
}
