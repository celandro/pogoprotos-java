// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformAcceptFriendInviteOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.PlatformAcceptFriendInviteOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 2;</code>
   * @return Whether the friend field is set.
   */
  boolean hasFriend();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 2;</code>
   * @return The friend.
   */
  POGOProtos.Rpc.PlatformPlayerSummaryProto getFriend();
  /**
   * <code>.POGOProtos.Rpc.PlatformPlayerSummaryProto friend = 2;</code>
   */
  POGOProtos.Rpc.PlatformPlayerSummaryProtoOrBuilder getFriendOrBuilder();
}
