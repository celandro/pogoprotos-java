// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PushNotificationTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PushNotificationTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PushNotificationTelemetryIds notification_id = 1;</code>
   * @return The enum numeric value on the wire for notificationId.
   */
  int getNotificationIdValue();
  /**
   * <code>.POGOProtos.Rpc.PushNotificationTelemetryIds notification_id = 1;</code>
   * @return The notificationId.
   */
  POGOProtos.Rpc.PushNotificationTelemetryIds getNotificationId();

  /**
   * <code>string category = 2;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <code>string category = 2;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();
}