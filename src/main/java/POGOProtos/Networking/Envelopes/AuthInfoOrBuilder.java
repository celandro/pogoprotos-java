// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Envelopes/AuthInfo.proto

package POGOProtos.Networking.Envelopes;

public interface AuthInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Envelopes.AuthInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string provider = 1;</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <code>string provider = 1;</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <code>.POGOProtos.Networking.Envelopes.AuthInfo.JWT token = 2;</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <code>.POGOProtos.Networking.Envelopes.AuthInfo.JWT token = 2;</code>
   * @return The token.
   */
  POGOProtos.Networking.Envelopes.AuthInfo.JWT getToken();
  /**
   * <code>.POGOProtos.Networking.Envelopes.AuthInfo.JWT token = 2;</code>
   */
  POGOProtos.Networking.Envelopes.AuthInfo.JWTOrBuilder getTokenOrBuilder();

  /**
   * <code>.POGOProtos.Networking.Envelopes.AuthInfo.AuthOptions options = 3;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>.POGOProtos.Networking.Envelopes.AuthInfo.AuthOptions options = 3;</code>
   * @return The options.
   */
  POGOProtos.Networking.Envelopes.AuthInfo.AuthOptions getOptions();
  /**
   * <code>.POGOProtos.Networking.Envelopes.AuthInfo.AuthOptions options = 3;</code>
   */
  POGOProtos.Networking.Envelopes.AuthInfo.AuthOptionsOrBuilder getOptionsOrBuilder();
}