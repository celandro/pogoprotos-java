// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameNotification/GameNotificationActionRequest.proto

package POGOProtos.Networking.Requests.Game.GameNotification;

public interface GameNotificationActionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Game.GameNotification.GameNotificationActionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Requests.Game.GameNotification.GameNotificationAction request_type = 1;</code>
   * @return The enum numeric value on the wire for requestType.
   */
  int getRequestTypeValue();
  /**
   * <code>.POGOProtos.Networking.Requests.Game.GameNotification.GameNotificationAction request_type = 1;</code>
   * @return The requestType.
   */
  POGOProtos.Networking.Requests.Game.GameNotification.GameNotificationAction getRequestType();

  /**
   * <code>bytes request_message = 2;</code>
   * @return The requestMessage.
   */
  com.google.protobuf.ByteString getRequestMessage();
}