// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface MegaEvolvePokemonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.MegaEvolvePokemonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>fixed64 pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
   * @return The enum numeric value on the wire for tempEvoId.
   */
  int getTempEvoIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloTemporaryEvolutionId temp_evo_id = 2;</code>
   * @return The tempEvoId.
   */
  POGOProtos.Rpc.HoloTemporaryEvolutionId getTempEvoId();
}