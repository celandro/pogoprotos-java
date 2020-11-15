// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/InvasionBattleUpdateMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface InvasionBattleUpdateMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Map.Fort.IncidentLookup incident_lookup = 1;</code>
   * @return Whether the incidentLookup field is set.
   */
  boolean hasIncidentLookup();
  /**
   * <code>.POGOProtos.Map.Fort.IncidentLookup incident_lookup = 1;</code>
   * @return The incidentLookup.
   */
  POGOProtos.Map.Fort.IncidentLookup getIncidentLookup();
  /**
   * <code>.POGOProtos.Map.Fort.IncidentLookup incident_lookup = 1;</code>
   */
  POGOProtos.Map.Fort.IncidentLookupOrBuilder getIncidentLookupOrBuilder();

  /**
   * <code>int32 step = 2;</code>
   * @return The step.
   */
  int getStep();

  /**
   * <code>repeated .POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate health_update = 3;</code>
   */
  java.util.List<POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate> 
      getHealthUpdateList();
  /**
   * <code>repeated .POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate health_update = 3;</code>
   */
  POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate getHealthUpdate(int index);
  /**
   * <code>repeated .POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate health_update = 3;</code>
   */
  int getHealthUpdateCount();
  /**
   * <code>repeated .POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate health_update = 3;</code>
   */
  java.util.List<? extends POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdateOrBuilder> 
      getHealthUpdateOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdate health_update = 3;</code>
   */
  POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.PokemonStaminaUpdateOrBuilder getHealthUpdateOrBuilder(
      int index);

  /**
   * <code>bool complete_battle = 4;</code>
   * @return The completeBattle.
   */
  boolean getCompleteBattle();

  /**
   * <code>.POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.UpdateType update_type = 5;</code>
   * @return The enum numeric value on the wire for updateType.
   */
  int getUpdateTypeValue();
  /**
   * <code>.POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.UpdateType update_type = 5;</code>
   * @return The updateType.
   */
  POGOProtos.Networking.Requests.Messages.InvasionBattleUpdateMessage.UpdateType getUpdateType();

  /**
   * <code>int64 lobby_join_time_ms = 6;</code>
   * @return The lobbyJoinTimeMs.
   */
  long getLobbyJoinTimeMs();

  /**
   * <code>.POGOProtos.Data.Combat.CombatQuestUpdate combat_quest_update = 7;</code>
   * @return Whether the combatQuestUpdate field is set.
   */
  boolean hasCombatQuestUpdate();
  /**
   * <code>.POGOProtos.Data.Combat.CombatQuestUpdate combat_quest_update = 7;</code>
   * @return The combatQuestUpdate.
   */
  POGOProtos.Data.Combat.CombatQuestUpdate getCombatQuestUpdate();
  /**
   * <code>.POGOProtos.Data.Combat.CombatQuestUpdate combat_quest_update = 7;</code>
   */
  POGOProtos.Data.Combat.CombatQuestUpdateOrBuilder getCombatQuestUpdateOrBuilder();
}
