// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestPokemonEncounter.proto

package POGOProtos.Data.Quests;

public interface QuestPokemonEncounterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Quests.QuestPokemonEncounter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string quest_id = 1;</code>
   * @return The questId.
   */
  java.lang.String getQuestId();
  /**
   * <code>string quest_id = 1;</code>
   * @return The bytes for questId.
   */
  com.google.protobuf.ByteString
      getQuestIdBytes();

  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Data.PokemonData getPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 2;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Enums.EncounterType encounter_type = 3;</code>
   * @return The enum numeric value on the wire for encounterType.
   */
  int getEncounterTypeValue();
  /**
   * <code>.POGOProtos.Enums.EncounterType encounter_type = 3;</code>
   * @return The encounterType.
   */
  POGOProtos.Enums.EncounterType getEncounterType();

  /**
   * <code>bool is_hidden_ditto = 4;</code>
   * @return The isHiddenDitto.
   */
  boolean getIsHiddenDitto();

  /**
   * <code>.POGOProtos.Data.PokemonData ditto = 5;</code>
   * @return Whether the ditto field is set.
   */
  boolean hasDitto();
  /**
   * <code>.POGOProtos.Data.PokemonData ditto = 5;</code>
   * @return The ditto.
   */
  POGOProtos.Data.PokemonData getDitto();
  /**
   * <code>.POGOProtos.Data.PokemonData ditto = 5;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getDittoOrBuilder();
}
