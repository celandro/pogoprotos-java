// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Raid/PlayerRaidInfo.proto

package POGOProtos.Data.Raid;

public interface PlayerRaidInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Raid.PlayerRaidInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 total_completed_raids = 3;</code>
   * @return The totalCompletedRaids.
   */
  int getTotalCompletedRaids();

  /**
   * <code>int32 total_completed_legendary_raids = 4;</code>
   * @return The totalCompletedLegendaryRaids.
   */
  int getTotalCompletedLegendaryRaids();

  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  java.util.List<POGOProtos.Data.Raid.Raid> 
      getRaidsList();
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  POGOProtos.Data.Raid.Raid getRaids(int index);
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  int getRaidsCount();
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  java.util.List<? extends POGOProtos.Data.Raid.RaidOrBuilder> 
      getRaidsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Raid.Raid raids = 5;</code>
   */
  POGOProtos.Data.Raid.RaidOrBuilder getRaidsOrBuilder(
      int index);
}