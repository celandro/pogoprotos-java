// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface ClaimCodenameRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClaimCodenameRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string codename = 1;</code>
   * @return The codename.
   */
  java.lang.String getCodename();
  /**
   * <code>string codename = 1;</code>
   * @return The bytes for codename.
   */
  com.google.protobuf.ByteString
      getCodenameBytes();

  /**
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();

  /**
   * <code>bool generate_suggested_codenames = 3;</code>
   * @return The generateSuggestedCodenames.
   */
  boolean getGenerateSuggestedCodenames();
}
