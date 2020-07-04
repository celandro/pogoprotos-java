// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface RaidInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RaidInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 raid_seed = 1;</code>
   * @return The raidSeed.
   */
  long getRaidSeed();

  /**
   * <code>int64 raid_spawn_ms = 2;</code>
   * @return The raidSpawnMs.
   */
  long getRaidSpawnMs();

  /**
   * <code>int64 raid_battle_ms = 3;</code>
   * @return The raidBattleMs.
   */
  long getRaidBattleMs();

  /**
   * <code>int64 raid_end_ms = 4;</code>
   * @return The raidEndMs.
   */
  long getRaidEndMs();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto raid_pokemon = 5;</code>
   * @return Whether the raidPokemon field is set.
   */
  boolean hasRaidPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto raid_pokemon = 5;</code>
   * @return The raidPokemon.
   */
  POGOProtos.Rpc.PokemonProto getRaidPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto raid_pokemon = 5;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getRaidPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.RaidLevel raid_level = 6;</code>
   * @return The enum numeric value on the wire for raidLevel.
   */
  int getRaidLevelValue();
  /**
   * <code>.POGOProtos.Rpc.RaidLevel raid_level = 6;</code>
   * @return The raidLevel.
   */
  POGOProtos.Rpc.RaidLevel getRaidLevel();

  /**
   * <code>bool complete = 7;</code>
   * @return The complete.
   */
  boolean getComplete();

  /**
   * <code>bool is_exclusive = 8;</code>
   * @return The isExclusive.
   */
  boolean getIsExclusive();

  /**
   * <code>bool is_raid_hidden = 9;</code>
   * @return The isRaidHidden.
   */
  boolean getIsRaidHidden();

  /**
   * <code>bool is_scheduled_raid = 10;</code>
   * @return The isScheduledRaid.
   */
  boolean getIsScheduledRaid();

  /**
   * <code>bool is_free = 11;</code>
   * @return The isFree.
   */
  boolean getIsFree();

  /**
   * <code>string campaign_id = 12;</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <code>string campaign_id = 12;</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();
}
