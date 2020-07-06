// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Battle/BattleParticipant.proto

package POGOProtos.Data.Battle;

public interface BattleParticipantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Battle.BattleParticipant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Battle.BattlePokemonInfo active_pokemon = 1;</code>
   * @return Whether the activePokemon field is set.
   */
  boolean hasActivePokemon();
  /**
   * <code>.POGOProtos.Data.Battle.BattlePokemonInfo active_pokemon = 1;</code>
   * @return The activePokemon.
   */
  POGOProtos.Data.Battle.BattlePokemonInfo getActivePokemon();
  /**
   * <code>.POGOProtos.Data.Battle.BattlePokemonInfo active_pokemon = 1;</code>
   */
  POGOProtos.Data.Battle.BattlePokemonInfoOrBuilder getActivePokemonOrBuilder();

  /**
   * <code>.POGOProtos.Data.Player.PlayerPublicProfile trainer_public_profile = 2;</code>
   * @return Whether the trainerPublicProfile field is set.
   */
  boolean hasTrainerPublicProfile();
  /**
   * <code>.POGOProtos.Data.Player.PlayerPublicProfile trainer_public_profile = 2;</code>
   * @return The trainerPublicProfile.
   */
  POGOProtos.Data.Player.PlayerPublicProfile getTrainerPublicProfile();
  /**
   * <code>.POGOProtos.Data.Player.PlayerPublicProfile trainer_public_profile = 2;</code>
   */
  POGOProtos.Data.Player.PlayerPublicProfileOrBuilder getTrainerPublicProfileOrBuilder();

  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo reverse_pokemon = 3;</code>
   */
  java.util.List<POGOProtos.Data.Battle.BattlePokemonInfo> 
      getReversePokemonList();
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo reverse_pokemon = 3;</code>
   */
  POGOProtos.Data.Battle.BattlePokemonInfo getReversePokemon(int index);
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo reverse_pokemon = 3;</code>
   */
  int getReversePokemonCount();
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo reverse_pokemon = 3;</code>
   */
  java.util.List<? extends POGOProtos.Data.Battle.BattlePokemonInfoOrBuilder> 
      getReversePokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo reverse_pokemon = 3;</code>
   */
  POGOProtos.Data.Battle.BattlePokemonInfoOrBuilder getReversePokemonOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo defeated_pokemon = 4;</code>
   */
  java.util.List<POGOProtos.Data.Battle.BattlePokemonInfo> 
      getDefeatedPokemonList();
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo defeated_pokemon = 4;</code>
   */
  POGOProtos.Data.Battle.BattlePokemonInfo getDefeatedPokemon(int index);
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo defeated_pokemon = 4;</code>
   */
  int getDefeatedPokemonCount();
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo defeated_pokemon = 4;</code>
   */
  java.util.List<? extends POGOProtos.Data.Battle.BattlePokemonInfoOrBuilder> 
      getDefeatedPokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Battle.BattlePokemonInfo defeated_pokemon = 4;</code>
   */
  POGOProtos.Data.Battle.BattlePokemonInfoOrBuilder getDefeatedPokemonOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Map.Pokemon.LobbyPokemon lobby_pokemon = 5;</code>
   */
  java.util.List<POGOProtos.Map.Pokemon.LobbyPokemon> 
      getLobbyPokemonList();
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.LobbyPokemon lobby_pokemon = 5;</code>
   */
  POGOProtos.Map.Pokemon.LobbyPokemon getLobbyPokemon(int index);
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.LobbyPokemon lobby_pokemon = 5;</code>
   */
  int getLobbyPokemonCount();
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.LobbyPokemon lobby_pokemon = 5;</code>
   */
  java.util.List<? extends POGOProtos.Map.Pokemon.LobbyPokemonOrBuilder> 
      getLobbyPokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Map.Pokemon.LobbyPokemon lobby_pokemon = 5;</code>
   */
  POGOProtos.Map.Pokemon.LobbyPokemonOrBuilder getLobbyPokemonOrBuilder(
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
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
   * @return The enum numeric value on the wire for highestFriendshipMilestone.
   */
  int getHighestFriendshipMilestoneValue();
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
   * @return The highestFriendshipMilestone.
   */
  POGOProtos.Enums.FriendshipLevelMilestone getHighestFriendshipMilestone();

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
}
