// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/FitnessRewardsLogEntry.proto

package POGOProtos.Data.Logs;

public interface FitnessRewardsLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Logs.FitnessRewardsLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Logs.FitnessRewardsLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.Logs.FitnessRewardsLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.Logs.FitnessRewardsLogEntry.Result getResult();

  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 2;</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 2;</code>
   * @return The rewards.
   */
  POGOProtos.Inventory.Loot getRewards();
  /**
   * <code>.POGOProtos.Inventory.Loot rewards = 2;</code>
   */
  POGOProtos.Inventory.LootOrBuilder getRewardsOrBuilder();

  /**
   * <code>double distance_walked_km = 3;</code>
   * @return The distanceWalkedKm.
   */
  double getDistanceWalkedKm();
}