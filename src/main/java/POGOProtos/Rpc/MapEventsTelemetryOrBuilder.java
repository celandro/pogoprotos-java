// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface MapEventsTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.MapEventsTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.MapEventsTelemetryIds map_event_click_id = 1;</code>
   * @return The enum numeric value on the wire for mapEventClickId.
   */
  int getMapEventClickIdValue();
  /**
   * <code>.POGOProtos.Rpc.MapEventsTelemetryIds map_event_click_id = 1;</code>
   * @return The mapEventClickId.
   */
  POGOProtos.Rpc.MapEventsTelemetryIds getMapEventClickId();

  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>repeated int32 guard_pokemon_level = 3;</code>
   * @return A list containing the guardPokemonLevel.
   */
  java.util.List<java.lang.Integer> getGuardPokemonLevelList();
  /**
   * <code>repeated int32 guard_pokemon_level = 3;</code>
   * @return The count of guardPokemonLevel.
   */
  int getGuardPokemonLevelCount();
  /**
   * <code>repeated int32 guard_pokemon_level = 3;</code>
   * @param index The index of the element to return.
   * @return The guardPokemonLevel at the given index.
   */
  int getGuardPokemonLevel(int index);

  /**
   * <code>.POGOProtos.Rpc.Team team = 4;</code>
   * @return The enum numeric value on the wire for team.
   */
  int getTeamValue();
  /**
   * <code>.POGOProtos.Rpc.Team team = 4;</code>
   * @return The team.
   */
  POGOProtos.Rpc.Team getTeam();

  /**
   * <code>bool is_player_in_range = 5;</code>
   * @return The isPlayerInRange.
   */
  boolean getIsPlayerInRange();
}
