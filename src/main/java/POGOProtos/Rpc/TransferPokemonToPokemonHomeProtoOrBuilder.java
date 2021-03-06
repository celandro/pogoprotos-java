// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface TransferPokemonToPokemonHomeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TransferPokemonToPokemonHomeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 total_energy_cost = 1;</code>
   * @return The totalEnergyCost.
   */
  int getTotalEnergyCost();

  /**
   * <code>repeated uint64 pokemon_uuid = 2;</code>
   * @return A list containing the pokemonUuid.
   */
  java.util.List<java.lang.Long> getPokemonUuidList();
  /**
   * <code>repeated uint64 pokemon_uuid = 2;</code>
   * @return The count of pokemonUuid.
   */
  int getPokemonUuidCount();
  /**
   * <code>repeated uint64 pokemon_uuid = 2;</code>
   * @param index The index of the element to return.
   * @return The pokemonUuid at the given index.
   */
  long getPokemonUuid(int index);
}
