// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Raid/RaidEncounter.proto

package POGOProtos.Data.Raid;

public interface RaidEncounterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Raid.RaidEncounter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Data.PokemonData getPokemon();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon = 1;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getPokemonOrBuilder();

  /**
   * <code>int64 encounter_id = 2;</code>
   * @return The encounterId.
   */
  long getEncounterId();

  /**
   * <code>string spawnpoint_id = 3;</code>
   * @return The spawnpointId.
   */
  java.lang.String getSpawnpointId();
  /**
   * <code>string spawnpoint_id = 3;</code>
   * @return The bytes for spawnpointId.
   */
  com.google.protobuf.ByteString
      getSpawnpointIdBytes();

  /**
   * <code>.POGOProtos.Data.Capture.CaptureProbability capture_probabilities = 4;</code>
   * @return Whether the captureProbabilities field is set.
   */
  boolean hasCaptureProbabilities();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureProbability capture_probabilities = 4;</code>
   * @return The captureProbabilities.
   */
  POGOProtos.Data.Capture.CaptureProbability getCaptureProbabilities();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureProbability capture_probabilities = 4;</code>
   */
  POGOProtos.Data.Capture.CaptureProbabilityOrBuilder getCaptureProbabilitiesOrBuilder();

  /**
   * <code>int32 throws_remaining = 5;</code>
   * @return The throwsRemaining.
   */
  int getThrowsRemaining();

  /**
   * <code>.POGOProtos.Enums.RaidLevel raid_level = 6;</code>
   * @return The enum numeric value on the wire for raidLevel.
   */
  int getRaidLevelValue();
  /**
   * <code>.POGOProtos.Enums.RaidLevel raid_level = 6;</code>
   * @return The raidLevel.
   */
  POGOProtos.Enums.RaidLevel getRaidLevel();

  /**
   * <code>string fort_id = 7;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 7;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();
}
