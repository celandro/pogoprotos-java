// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface NpcPokemonProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.NpcPokemonProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
   * @return The enum numeric value on the wire for pokemonType.
   */
  int getPokemonTypeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
   * @return The pokemonType.
   */
  POGOProtos.Rpc.HoloPokemonId getPokemonType();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder();
}
