// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface LimitedEditionPokemonEncounterRewardProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 lifetime_max_count = 3;</code>
   * @return The lifetimeMaxCount.
   */
  int getLifetimeMaxCount();

  /**
   * <code>int32 per_competitive_combat_season_max_count = 4;</code>
   * @return The perCompetitiveCombatSeasonMaxCount.
   */
  int getPerCompetitiveCombatSeasonMaxCount();

  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonEncounterRewardProto getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
   */
  POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder getPokemonOrBuilder();

  /**
   * <code>string identifier = 2;</code>
   * @return The identifier.
   */
  java.lang.String getIdentifier();
  /**
   * <code>string identifier = 2;</code>
   * @return The bytes for identifier.
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  public POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.LimitCase getLimitCase();
}
