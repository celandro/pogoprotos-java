// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface FriendshipMilestoneRewardProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FriendshipMilestoneRewardProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string friend_id = 1;</code>
   * @return The friendId.
   */
  java.lang.String getFriendId();
  /**
   * <code>string friend_id = 1;</code>
   * @return The bytes for friendId.
   */
  com.google.protobuf.ByteString
      getFriendIdBytes();

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone friendship_milestone = 2;</code>
   * @return The enum numeric value on the wire for friendshipMilestone.
   */
  int getFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone friendship_milestone = 2;</code>
   * @return The friendshipMilestone.
   */
  POGOProtos.Rpc.FriendshipLevelMilestone getFriendshipMilestone();
}
