// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BuddyMapEmotionCheckTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BuddyMapEmotionCheckTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  int getPokemonIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  POGOProtos.Rpc.HoloPokemonId getPokemonId();

  /**
   * <code>int32 current_emotion_points = 2;</code>
   * @return The currentEmotionPoints.
   */
  int getCurrentEmotionPoints();

  /**
   * <code>int32 current_affection_points = 3;</code>
   * @return The currentAffectionPoints.
   */
  int getCurrentAffectionPoints();
}
