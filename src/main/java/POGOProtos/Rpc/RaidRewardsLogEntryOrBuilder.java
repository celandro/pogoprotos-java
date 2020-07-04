// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface RaidRewardsLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RaidRewardsLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.RaidRewardsLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.RaidRewardsLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.RaidRewardsLogEntry.Result getResult();

  /**
   * <code>bool is_exclusive = 2;</code>
   * @return The isExclusive.
   */
  boolean getIsExclusive();

  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.ItemProto> 
      getItemsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  POGOProtos.Rpc.ItemProto getItems(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ItemProtoOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  POGOProtos.Rpc.ItemProtoOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto default_rewards = 4;</code>
   */
  java.util.List<POGOProtos.Rpc.ItemProto> 
      getDefaultRewardsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto default_rewards = 4;</code>
   */
  POGOProtos.Rpc.ItemProto getDefaultRewards(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto default_rewards = 4;</code>
   */
  int getDefaultRewardsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto default_rewards = 4;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ItemProtoOrBuilder> 
      getDefaultRewardsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto default_rewards = 4;</code>
   */
  POGOProtos.Rpc.ItemProtoOrBuilder getDefaultRewardsOrBuilder(
      int index);

  /**
   * <code>int32 stardust = 5;</code>
   * @return The stardust.
   */
  int getStardust();
}
