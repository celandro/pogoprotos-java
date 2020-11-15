// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/StartRaidBattleMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface StartRaidBattleMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.StartRaidBattleMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string gym_id = 1;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 1;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>int64 raid_seed = 2;</code>
   * @return The raidSeed.
   */
  long getRaidSeed();

  /**
   * <code>repeated int32 lobby_id = 4;</code>
   * @return A list containing the lobbyId.
   */
  java.util.List<java.lang.Integer> getLobbyIdList();
  /**
   * <code>repeated int32 lobby_id = 4;</code>
   * @return The count of lobbyId.
   */
  int getLobbyIdCount();
  /**
   * <code>repeated int32 lobby_id = 4;</code>
   * @param index The index of the element to return.
   * @return The lobbyId at the given index.
   */
  int getLobbyId(int index);

  /**
   * <code>repeated fixed64 attacking_pokemon_id = 5;</code>
   * @return A list containing the attackingPokemonId.
   */
  java.util.List<java.lang.Long> getAttackingPokemonIdList();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 5;</code>
   * @return The count of attackingPokemonId.
   */
  int getAttackingPokemonIdCount();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 5;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  long getAttackingPokemonId(int index);

  /**
   * <code>double player_lat_degrees = 6;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 7;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();

  /**
   * <code>double gym_lat_degrees = 8;</code>
   * @return The gymLatDegrees.
   */
  double getGymLatDegrees();

  /**
   * <code>double gym_lng_degrees = 9;</code>
   * @return The gymLngDegrees.
   */
  double getGymLngDegrees();
}
