// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BattleParticipantProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BattleParticipantProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_pokemon = 1;</code>
   * @return Whether the activePokemon field is set.
   */
  boolean hasActivePokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_pokemon = 1;</code>
   * @return The activePokemon.
   */
  POGOProtos.Rpc.PokemonInfo getActivePokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_pokemon = 1;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getActivePokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto trainer_public_profile = 2;</code>
   * @return Whether the trainerPublicProfile field is set.
   */
  boolean hasTrainerPublicProfile();
  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto trainer_public_profile = 2;</code>
   * @return The trainerPublicProfile.
   */
  POGOProtos.Rpc.PlayerPublicProfileProto getTrainerPublicProfile();
  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto trainer_public_profile = 2;</code>
   */
  POGOProtos.Rpc.PlayerPublicProfileProtoOrBuilder getTrainerPublicProfileOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo reserve_pokemon = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.PokemonInfo> 
      getReservePokemonList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo reserve_pokemon = 3;</code>
   */
  POGOProtos.Rpc.PokemonInfo getReservePokemon(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo reserve_pokemon = 3;</code>
   */
  int getReservePokemonCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo reserve_pokemon = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokemonInfoOrBuilder> 
      getReservePokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo reserve_pokemon = 3;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getReservePokemonOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo defeated_pokemon = 4;</code>
   */
  java.util.List<POGOProtos.Rpc.PokemonInfo> 
      getDefeatedPokemonList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo defeated_pokemon = 4;</code>
   */
  POGOProtos.Rpc.PokemonInfo getDefeatedPokemon(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo defeated_pokemon = 4;</code>
   */
  int getDefeatedPokemonCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo defeated_pokemon = 4;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokemonInfoOrBuilder> 
      getDefeatedPokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonInfo defeated_pokemon = 4;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getDefeatedPokemonOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.LobbyPokemonProto lobby_pokemon = 5;</code>
   */
  java.util.List<POGOProtos.Rpc.LobbyPokemonProto> 
      getLobbyPokemonList();
  /**
   * <code>repeated .POGOProtos.Rpc.LobbyPokemonProto lobby_pokemon = 5;</code>
   */
  POGOProtos.Rpc.LobbyPokemonProto getLobbyPokemon(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.LobbyPokemonProto lobby_pokemon = 5;</code>
   */
  int getLobbyPokemonCount();
  /**
   * <code>repeated .POGOProtos.Rpc.LobbyPokemonProto lobby_pokemon = 5;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.LobbyPokemonProtoOrBuilder> 
      getLobbyPokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.LobbyPokemonProto lobby_pokemon = 5;</code>
   */
  POGOProtos.Rpc.LobbyPokemonProtoOrBuilder getLobbyPokemonOrBuilder(
      int index);

  /**
   * <code>int32 damage_dealt = 6;</code>
   * @return The damageDealt.
   */
  int getDamageDealt();

  /**
   * <code>bool super_effective_charge_move = 7;</code>
   * @return The superEffectiveChargeMove.
   */
  boolean getSuperEffectiveChargeMove();

  /**
   * <code>bool weather_boosted = 8;</code>
   * @return The weatherBoosted.
   */
  boolean getWeatherBoosted();

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
   * @return The enum numeric value on the wire for highestFriendshipMilestone.
   */
  int getHighestFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
   * @return The highestFriendshipMilestone.
   */
  POGOProtos.Rpc.FriendshipLevelMilestone getHighestFriendshipMilestone();

  /**
   * <code>repeated string friend_codename = 10;</code>
   * @return A list containing the friendCodename.
   */
  java.util.List<java.lang.String>
      getFriendCodenameList();
  /**
   * <code>repeated string friend_codename = 10;</code>
   * @return The count of friendCodename.
   */
  int getFriendCodenameCount();
  /**
   * <code>repeated string friend_codename = 10;</code>
   * @param index The index of the element to return.
   * @return The friendCodename at the given index.
   */
  java.lang.String getFriendCodename(int index);
  /**
   * <code>repeated string friend_codename = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the friendCodename at the given index.
   */
  com.google.protobuf.ByteString
      getFriendCodenameBytes(int index);

  /**
   * <code>bool is_remote = 11;</code>
   * @return The isRemote.
   */
  boolean getIsRemote();

  /**
   * <code>bool is_social_invite = 12;</code>
   * @return The isSocialInvite.
   */
  boolean getIsSocialInvite();

  /**
   * <code>bool field1 = 13;</code>
   * @return The field1.
   */
  boolean getField1();

  /**
   * <code>int64 field2 = 14;</code>
   * @return The field2.
   */
  long getField2();

  /**
   * <code>int32 field3 = 15;</code>
   * @return The field3.
   */
  int getField3();
}
