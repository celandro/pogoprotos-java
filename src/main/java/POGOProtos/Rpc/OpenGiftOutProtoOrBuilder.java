// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface OpenGiftOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.OpenGiftOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.OpenGiftOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.OpenGiftOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.OpenGiftOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.LootProto items = 2;</code>
   * @return Whether the items field is set.
   */
  boolean hasItems();
  /**
   * <code>.POGOProtos.Rpc.LootProto items = 2;</code>
   * @return The items.
   */
  POGOProtos.Rpc.LootProto getItems();
  /**
   * <code>.POGOProtos.Rpc.LootProto items = 2;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getItemsOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto egg_pokemon = 3;</code>
   * @return Whether the eggPokemon field is set.
   */
  boolean hasEggPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto egg_pokemon = 3;</code>
   * @return The eggPokemon.
   */
  POGOProtos.Rpc.PokemonProto getEggPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto egg_pokemon = 3;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getEggPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelDataProto updated_friendship_data = 4;</code>
   * @return Whether the updatedFriendshipData field is set.
   */
  boolean hasUpdatedFriendshipData();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelDataProto updated_friendship_data = 4;</code>
   * @return The updatedFriendshipData.
   */
  POGOProtos.Rpc.FriendshipLevelDataProto getUpdatedFriendshipData();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelDataProto updated_friendship_data = 4;</code>
   */
  POGOProtos.Rpc.FriendshipLevelDataProtoOrBuilder getUpdatedFriendshipDataOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto friend_profile = 5;</code>
   * @return Whether the friendProfile field is set.
   */
  boolean hasFriendProfile();
  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto friend_profile = 5;</code>
   * @return The friendProfile.
   */
  POGOProtos.Rpc.PlayerPublicProfileProto getFriendProfile();
  /**
   * <code>.POGOProtos.Rpc.PlayerPublicProfileProto friend_profile = 5;</code>
   */
  POGOProtos.Rpc.PlayerPublicProfileProtoOrBuilder getFriendProfileOrBuilder();
}