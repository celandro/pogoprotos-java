// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/PlatformRequest.proto

package POGOProtos.Networking.Requests.Platform;

public interface PlatformRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Platform.PlatformRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Requests.Platform.PlatformRequestType platform_request_type = 1;</code>
   * @return The enum numeric value on the wire for platformRequestType.
   */
  int getPlatformRequestTypeValue();
  /**
   * <code>.POGOProtos.Networking.Requests.Platform.PlatformRequestType platform_request_type = 1;</code>
   * @return The platformRequestType.
   */
  POGOProtos.Networking.Requests.Platform.PlatformRequestType getPlatformRequestType();

  /**
   * <code>bytes request_message = 2;</code>
   * @return The requestMessage.
   */
  com.google.protobuf.ByteString getRequestMessage();
}