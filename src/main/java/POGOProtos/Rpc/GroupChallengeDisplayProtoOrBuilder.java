// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GroupChallengeDisplayProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GroupChallengeDisplayProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto boost_rewards = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.EventSectionProto.BonusBoxProto> 
      getBoostRewardsList();
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto boost_rewards = 2;</code>
   */
  POGOProtos.Rpc.EventSectionProto.BonusBoxProto getBoostRewards(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto boost_rewards = 2;</code>
   */
  int getBoostRewardsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto boost_rewards = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.EventSectionProto.BonusBoxProtoOrBuilder> 
      getBoostRewardsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.EventSectionProto.BonusBoxProto boost_rewards = 2;</code>
   */
  POGOProtos.Rpc.EventSectionProto.BonusBoxProtoOrBuilder getBoostRewardsOrBuilder(
      int index);
}
