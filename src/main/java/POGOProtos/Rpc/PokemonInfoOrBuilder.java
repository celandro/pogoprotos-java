// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PokemonInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokemonInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonProto getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 1;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder();

  /**
   * <code>int32 current_health = 2;</code>
   * @return The currentHealth.
   */
  int getCurrentHealth();

  /**
   * <code>int32 current_energy = 3;</code>
   * @return The currentEnergy.
   */
  int getCurrentEnergy();
}
