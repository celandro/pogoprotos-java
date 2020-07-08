// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Buddy/BuddyEncounterHelpTelemetry.proto

package POGOProtos.Data.Buddy;

public interface BuddyEncounterHelpTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Buddy.BuddyEncounterHelpTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  int getPokemonId();

  /**
   * <code>int32 cp = 2;</code>
   * @return The cp.
   */
  int getCp();

  /**
   * <code>string encounter_type = 3;</code>
   * @return The encounterType.
   */
  java.lang.String getEncounterType();
  /**
   * <code>string encounter_type = 3;</code>
   * @return The bytes for encounterType.
   */
  com.google.protobuf.ByteString
      getEncounterTypeBytes();

  /**
   * <code>bool ar_classic_enabled = 4;</code>
   * @return The arClassicEnabled.
   */
  boolean getArClassicEnabled();

  /**
   * <code>bool ar_plus_enabled = 5;</code>
   * @return The arPlusEnabled.
   */
  boolean getArPlusEnabled();

  /**
   * <code>.POGOProtos.Enums.EncounterType encounter = 6;</code>
   * @return The enum numeric value on the wire for encounter.
   */
  int getEncounterValue();
  /**
   * <code>.POGOProtos.Enums.EncounterType encounter = 6;</code>
   * @return The encounter.
   */
  POGOProtos.Enums.EncounterType getEncounter();
}