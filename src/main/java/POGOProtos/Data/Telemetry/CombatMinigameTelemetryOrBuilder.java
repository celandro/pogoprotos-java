// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/CombatMinigameTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface CombatMinigameTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.CombatMinigameTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Telemetry.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
   * @return The enum numeric value on the wire for combatType.
   */
  int getCombatTypeValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.CombatMinigameTelemetry.MinigameCombatType combat_type = 1;</code>
   * @return The combatType.
   */
  POGOProtos.Data.Telemetry.CombatMinigameTelemetry.MinigameCombatType getCombatType();

  /**
   * <code>.POGOProtos.Enums.PokemonType move_type = 2;</code>
   * @return The enum numeric value on the wire for moveType.
   */
  int getMoveTypeValue();
  /**
   * <code>.POGOProtos.Enums.PokemonType move_type = 2;</code>
   * @return The moveType.
   */
  POGOProtos.Enums.PokemonType getMoveType();

  /**
   * <code>float score = 3;</code>
   * @return The score.
   */
  float getScore();
}
