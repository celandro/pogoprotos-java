// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface CatchPokemonLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CatchPokemonLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.CatchPokemonLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.CatchPokemonLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.CatchPokemonLogEntry.Result getResult();

  /**
   * <code>int32 pokedex_number = 2;</code>
   * @return The pokedexNumber.
   */
  int getPokedexNumber();

  /**
   * <code>int32 combat_points = 3;</code>
   * @return The combatPoints.
   */
  int getCombatPoints();

  /**
   * <code>fixed64 pokemon_id = 4;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 5;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 5;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 5;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder();
}