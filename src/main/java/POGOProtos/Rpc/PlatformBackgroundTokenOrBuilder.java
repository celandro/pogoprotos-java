// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformBackgroundTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformBackgroundToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes token = 1;</code>
   * @return The token.
   */
  com.google.protobuf.ByteString getToken();

  /**
   * <code>int64 expiration_time = 2;</code>
   * @return The expirationTime.
   */
  long getExpirationTime();

  /**
   * <code>bytes iv = 3;</code>
   * @return The iv.
   */
  com.google.protobuf.ByteString getIv();
}
