// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/OpenNpcCombatSessionMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface OpenNpcCombatSessionMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.OpenNpcCombatSessionMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated fixed64 attacking_pokemon_id = 1;</code>
   * @return A list containing the attackingPokemonId.
   */
  java.util.List<java.lang.Long> getAttackingPokemonIdList();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 1;</code>
   * @return The count of attackingPokemonId.
   */
  int getAttackingPokemonIdCount();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 1;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  long getAttackingPokemonId(int index);

  /**
   * <code>string combat_npc_template_id = 2;</code>
   * @return The combatNpcTemplateId.
   */
  java.lang.String getCombatNpcTemplateId();
  /**
   * <code>string combat_npc_template_id = 2;</code>
   * @return The bytes for combatNpcTemplateId.
   */
  com.google.protobuf.ByteString
      getCombatNpcTemplateIdBytes();

  /**
   * <code>int64 lobby_join_time_ms = 3;</code>
   * @return The lobbyJoinTimeMs.
   */
  long getLobbyJoinTimeMs();
}
