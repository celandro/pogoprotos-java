// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/FavoritePokemonTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface FavoritePokemonTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.FavoritePokemonTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  POGOProtos.Data.Telemetry.PokemonTelemetry getPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   */
  POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder getPokemonOrBuilder();

  /**
   * <code>bool favored = 2;</code>
   * @return The favored.
   */
  boolean getFavored();
}
