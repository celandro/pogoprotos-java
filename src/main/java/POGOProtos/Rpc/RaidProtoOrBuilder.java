// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface RaidProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RaidProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 raid_seed = 1;</code>
   * @return The raidSeed.
   */
  long getRaidSeed();

  /**
   * <code>int64 started_ms = 2;</code>
   * @return The startedMs.
   */
  long getStartedMs();

  /**
   * <code>int64 completed_ms = 3;</code>
   * @return The completedMs.
   */
  long getCompletedMs();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId encounter_pokemon_id = 4;</code>
   * @return The enum numeric value on the wire for encounterPokemonId.
   */
  int getEncounterPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId encounter_pokemon_id = 4;</code>
   * @return The encounterPokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getEncounterPokemonId();

  /**
   * <code>bool completed_battle = 5;</code>
   * @return The completedBattle.
   */
  boolean getCompletedBattle();

  /**
   * <code>bool received_rewards = 6;</code>
   * @return The receivedRewards.
   */
  boolean getReceivedRewards();

  /**
   * <code>bool finished_encounter = 7;</code>
   * @return The finishedEncounter.
   */
  boolean getFinishedEncounter();

  /**
   * <code>bool received_default_rewards = 8;</code>
   * @return The receivedDefaultRewards.
   */
  boolean getReceivedDefaultRewards();

  /**
   * <code>bool incremented_raid_friends = 9;</code>
   * @return The incrementedRaidFriends.
   */
  boolean getIncrementedRaidFriends();

  /**
   * <code>int64 completed_battle_ms = 10;</code>
   * @return The completedBattleMs.
   */
  long getCompletedBattleMs();

  /**
   * <code>bool is_remote = 12;</code>
   * @return The isRemote.
   */
  boolean getIsRemote();
}
