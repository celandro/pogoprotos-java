// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface UpdateInvasionBattleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.UpdateInvasionBattleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   * @return Whether the incidentLookup field is set.
   */
  boolean hasIncidentLookup();
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   * @return The incidentLookup.
   */
  POGOProtos.Rpc.IncidentLookupProto getIncidentLookup();
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   */
  POGOProtos.Rpc.IncidentLookupProtoOrBuilder getIncidentLookupOrBuilder();

  /**
   * <code>int32 step = 2;</code>
   * @return The step.
   */
  int getStep();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonStaminaUpdateProto health_update = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.PokemonStaminaUpdateProto> 
      getHealthUpdateList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonStaminaUpdateProto health_update = 3;</code>
   */
  POGOProtos.Rpc.PokemonStaminaUpdateProto getHealthUpdate(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonStaminaUpdateProto health_update = 3;</code>
   */
  int getHealthUpdateCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonStaminaUpdateProto health_update = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokemonStaminaUpdateProtoOrBuilder> 
      getHealthUpdateOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonStaminaUpdateProto health_update = 3;</code>
   */
  POGOProtos.Rpc.PokemonStaminaUpdateProtoOrBuilder getHealthUpdateOrBuilder(
      int index);

  /**
   * <code>bool complete_battle = 4;</code>
   * @return The completeBattle.
   */
  boolean getCompleteBattle();

  /**
   * <code>.POGOProtos.Rpc.UpdateInvasionBattleProto.UpdateType update_type = 5;</code>
   * @return The enum numeric value on the wire for updateType.
   */
  int getUpdateTypeValue();
  /**
   * <code>.POGOProtos.Rpc.UpdateInvasionBattleProto.UpdateType update_type = 5;</code>
   * @return The updateType.
   */
  POGOProtos.Rpc.UpdateInvasionBattleProto.UpdateType getUpdateType();
}
