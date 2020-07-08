// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/UnlockCondition.proto

package POGOProtos.Data.Combat;

public interface UnlockConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Combat.UnlockCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.ConditionType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.POGOProtos.Enums.ConditionType type = 1;</code>
   * @return The type.
   */
  POGOProtos.Enums.ConditionType getType();

  /**
   * <code>int32 min_pokemon_count = 2;</code>
   * @return The minPokemonCount.
   */
  int getMinPokemonCount();

  /**
   * <code>.POGOProtos.Data.Combat.WithPlayerLevel with_player_level = 3;</code>
   * @return Whether the withPlayerLevel field is set.
   */
  boolean hasWithPlayerLevel();
  /**
   * <code>.POGOProtos.Data.Combat.WithPlayerLevel with_player_level = 3;</code>
   * @return The withPlayerLevel.
   */
  POGOProtos.Data.Combat.WithPlayerLevel getWithPlayerLevel();
  /**
   * <code>.POGOProtos.Data.Combat.WithPlayerLevel with_player_level = 3;</code>
   */
  POGOProtos.Data.Combat.WithPlayerLevelOrBuilder getWithPlayerLevelOrBuilder();

  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonCpLimit with_pokemon_cp_limit = 4;</code>
   * @return Whether the withPokemonCpLimit field is set.
   */
  boolean hasWithPokemonCpLimit();
  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonCpLimit with_pokemon_cp_limit = 4;</code>
   * @return The withPokemonCpLimit.
   */
  POGOProtos.Data.Combat.WithPokemonCpLimit getWithPokemonCpLimit();
  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonCpLimit with_pokemon_cp_limit = 4;</code>
   */
  POGOProtos.Data.Combat.WithPokemonCpLimitOrBuilder getWithPokemonCpLimitOrBuilder();

  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonType with_pokemon_type = 5;</code>
   * @return Whether the withPokemonType field is set.
   */
  boolean hasWithPokemonType();
  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonType with_pokemon_type = 5;</code>
   * @return The withPokemonType.
   */
  POGOProtos.Data.Combat.WithPokemonType getWithPokemonType();
  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonType with_pokemon_type = 5;</code>
   */
  POGOProtos.Data.Combat.WithPokemonTypeOrBuilder getWithPokemonTypeOrBuilder();

  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonCategory with_pokemon_category = 6;</code>
   * @return Whether the withPokemonCategory field is set.
   */
  boolean hasWithPokemonCategory();
  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonCategory with_pokemon_category = 6;</code>
   * @return The withPokemonCategory.
   */
  POGOProtos.Data.Combat.WithPokemonCategory getWithPokemonCategory();
  /**
   * <code>.POGOProtos.Data.Combat.WithPokemonCategory with_pokemon_category = 6;</code>
   */
  POGOProtos.Data.Combat.WithPokemonCategoryOrBuilder getWithPokemonCategoryOrBuilder();
}