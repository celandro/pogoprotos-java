// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetPhotobombOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetPhotobombOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetPhotobombOutProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Rpc.GetPhotobombOutProto.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Rpc.GetPhotobombOutProto.Status getStatus();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  int getPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getPokemonId();

  /**
   * <code>double lat = 3;</code>
   * @return The lat.
   */
  double getLat();

  /**
   * <code>double lng = 4;</code>
   * @return The lng.
   */
  double getLng();

  /**
   * <code>string encounter_location = 5;</code>
   * @return The encounterLocation.
   */
  java.lang.String getEncounterLocation();
  /**
   * <code>string encounter_location = 5;</code>
   * @return The bytes for encounterLocation.
   */
  com.google.protobuf.ByteString
      getEncounterLocationBytes();

  /**
   * <code>fixed64 encounter_id = 6;</code>
   * @return The encounterId.
   */
  long getEncounterId();

  /**
   * <code>int64 disappear_time_ms = 7;</code>
   * @return The disappearTimeMs.
   */
  long getDisappearTimeMs();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 8;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 8;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 8;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder();
}
