// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GymBattleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GymBattleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string battle_id = 1;</code>
   * @return The battleId.
   */
  java.lang.String getBattleId();
  /**
   * <code>string battle_id = 1;</code>
   * @return The bytes for battleId.
   */
  com.google.protobuf.ByteString
      getBattleIdBytes();

  /**
   * <code>int64 completed_ms = 2;</code>
   * @return The completedMs.
   */
  long getCompletedMs();

  /**
   * <code>bool incremented_gym_battle_friends = 3;</code>
   * @return The incrementedGymBattleFriends.
   */
  boolean getIncrementedGymBattleFriends();
}