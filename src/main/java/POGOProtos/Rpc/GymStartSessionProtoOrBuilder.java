// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GymStartSessionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GymStartSessionProto)
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
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return A list containing the attackingPokemonId.
   */
  java.util.List<java.lang.Long> getAttackingPokemonIdList();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @return The count of attackingPokemonId.
   */
  int getAttackingPokemonIdCount();
  /**
   * <code>repeated fixed64 attacking_pokemon_id = 2;</code>
   * @param index The index of the element to return.
   * @return The attackingPokemonId at the given index.
   */
  long getAttackingPokemonId(int index);

  /**
   * <code>fixed64 defending_pokemon_id = 3;</code>
   * @return The defendingPokemonId.
   */
  long getDefendingPokemonId();

  /**
   * <code>double player_lat_degrees = 4;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 5;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();
}
