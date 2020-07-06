// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/FeedPokemonTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface FeedPokemonTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.FeedPokemonTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Data.Telemetry.PokemonTelemetry getPokemon();
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 2;</code>
   */
  POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder getPokemonOrBuilder();

  /**
   * <code>string gym_id = 3;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 3;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>int32 team = 4;</code>
   * @return The team.
   */
  int getTeam();

  /**
   * <code>int32 defender_count = 5;</code>
   * @return The defenderCount.
   */
  int getDefenderCount();

  /**
   * <code>int32 motivation = 6;</code>
   * @return The motivation.
   */
  int getMotivation();

  /**
   * <code>int32 cp_now = 7;</code>
   * @return The cpNow.
   */
  int getCpNow();
}
