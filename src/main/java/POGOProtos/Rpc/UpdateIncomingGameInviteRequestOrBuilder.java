// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface UpdateIncomingGameInviteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UpdateIncomingGameInviteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string app_key = 1;</code>
   * @return The appKey.
   */
  java.lang.String getAppKey();
  /**
   * <code>string app_key = 1;</code>
   * @return The bytes for appKey.
   */
  com.google.protobuf.ByteString
      getAppKeyBytes();

  /**
   * <code>.POGOProtos.Rpc.UpdateIncomingGameInviteRequest.NewStatus new_status = 2;</code>
   * @return The enum numeric value on the wire for newStatus.
   */
  int getNewStatusValue();
  /**
   * <code>.POGOProtos.Rpc.UpdateIncomingGameInviteRequest.NewStatus new_status = 2;</code>
   * @return The newStatus.
   */
  POGOProtos.Rpc.UpdateIncomingGameInviteRequest.NewStatus getNewStatus();
}