// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformApnTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformApnToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string registration_id = 1;</code>
   * @return The registrationId.
   */
  java.lang.String getRegistrationId();
  /**
   * <code>string registration_id = 1;</code>
   * @return The bytes for registrationId.
   */
  com.google.protobuf.ByteString
      getRegistrationIdBytes();

  /**
   * <code>string bundle_identifier = 2;</code>
   * @return The bundleIdentifier.
   */
  java.lang.String getBundleIdentifier();
  /**
   * <code>string bundle_identifier = 2;</code>
   * @return The bytes for bundleIdentifier.
   */
  com.google.protobuf.ByteString
      getBundleIdentifierBytes();

  /**
   * <code>int32 payload_byte_size = 3;</code>
   * @return The payloadByteSize.
   */
  int getPayloadByteSize();
}
