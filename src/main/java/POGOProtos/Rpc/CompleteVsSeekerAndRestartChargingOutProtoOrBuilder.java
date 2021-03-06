// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CompleteVsSeekerAndRestartChargingOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CompleteVsSeekerAndRestartChargingOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.CompleteVsSeekerAndRestartChargingOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.CompleteVsSeekerAndRestartChargingOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.CompleteVsSeekerAndRestartChargingOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   * @return Whether the vsSeeker field is set.
   */
  boolean hasVsSeeker();
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   * @return The vsSeeker.
   */
  POGOProtos.Rpc.VsSeekerAttributesProto getVsSeeker();
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto vs_seeker = 2;</code>
   */
  POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder getVsSeekerOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.LootProto loot_proto = 3;</code>
   * @return Whether the lootProto field is set.
   */
  boolean hasLootProto();
  /**
   * <code>.POGOProtos.Rpc.LootProto loot_proto = 3;</code>
   * @return The lootProto.
   */
  POGOProtos.Rpc.LootProto getLootProto();
  /**
   * <code>.POGOProtos.Rpc.LootProto loot_proto = 3;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getLootProtoOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.CombatSeasonResult current_season_result = 4;</code>
   * @return Whether the currentSeasonResult field is set.
   */
  boolean hasCurrentSeasonResult();
  /**
   * <code>.POGOProtos.Rpc.CombatSeasonResult current_season_result = 4;</code>
   * @return The currentSeasonResult.
   */
  POGOProtos.Rpc.CombatSeasonResult getCurrentSeasonResult();
  /**
   * <code>.POGOProtos.Rpc.CombatSeasonResult current_season_result = 4;</code>
   */
  POGOProtos.Rpc.CombatSeasonResultOrBuilder getCurrentSeasonResultOrBuilder();

  /**
   * <code>int32 previous_rank = 5;</code>
   * @return The previousRank.
   */
  int getPreviousRank();

  /**
   * <code>float previous_rating = 6;</code>
   * @return The previousRating.
   */
  float getPreviousRating();

  /**
   * <code>.POGOProtos.Rpc.CombatBaseStatsProto stats_at_rank_start = 7;</code>
   * @return Whether the statsAtRankStart field is set.
   */
  boolean hasStatsAtRankStart();
  /**
   * <code>.POGOProtos.Rpc.CombatBaseStatsProto stats_at_rank_start = 7;</code>
   * @return The statsAtRankStart.
   */
  POGOProtos.Rpc.CombatBaseStatsProto getStatsAtRankStart();
  /**
   * <code>.POGOProtos.Rpc.CombatBaseStatsProto stats_at_rank_start = 7;</code>
   */
  POGOProtos.Rpc.CombatBaseStatsProtoOrBuilder getStatsAtRankStartOrBuilder();

  /**
   * <code>repeated string avatar_template_id_rewarded = 8;</code>
   * @return A list containing the avatarTemplateIdRewarded.
   */
  java.util.List<java.lang.String>
      getAvatarTemplateIdRewardedList();
  /**
   * <code>repeated string avatar_template_id_rewarded = 8;</code>
   * @return The count of avatarTemplateIdRewarded.
   */
  int getAvatarTemplateIdRewardedCount();
  /**
   * <code>repeated string avatar_template_id_rewarded = 8;</code>
   * @param index The index of the element to return.
   * @return The avatarTemplateIdRewarded at the given index.
   */
  java.lang.String getAvatarTemplateIdRewarded(int index);
  /**
   * <code>repeated string avatar_template_id_rewarded = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the avatarTemplateIdRewarded at the given index.
   */
  com.google.protobuf.ByteString
      getAvatarTemplateIdRewardedBytes(int index);
}
