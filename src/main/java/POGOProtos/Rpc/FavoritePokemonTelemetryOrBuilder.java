// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface FavoritePokemonTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FavoritePokemonTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonTelemetry getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   */
  POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder();

  /**
   * <code>bool favored = 2;</code>
   * @return The favored.
   */
  boolean getFavored();
}