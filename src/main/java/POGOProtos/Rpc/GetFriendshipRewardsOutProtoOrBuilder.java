// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GetFriendshipRewardsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetFriendshipRewardsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetFriendshipRewardsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetFriendshipRewardsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetFriendshipRewardsOutProto.Result getResult();

  /**
   * <code>int64 xp_reward = 2;</code>
   * @return The xpReward.
   */
  long getXpReward();

  /**
   * <code>string friend_id = 3;</code>
   * @return The friendId.
   */
  java.lang.String getFriendId();
  /**
   * <code>string friend_id = 3;</code>
   * @return The bytes for friendId.
   */
  com.google.protobuf.ByteString
      getFriendIdBytes();
}
