// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface PlayerFriendDisplayProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlayerFriendDisplayProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
   * @return Whether the buddy field is set.
   */
  boolean hasBuddy();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
   * @return The buddy.
   */
  POGOProtos.Rpc.PokemonDisplayProto getBuddy();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto buddy = 1;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getBuddyOrBuilder();

  /**
   * <code>int32 buddy_display_pokemon_id = 2;</code>
   * @return The buddyDisplayPokemonId.
   */
  int getBuddyDisplayPokemonId();

  /**
   * <code>string buddy_pokemon_nickname = 3;</code>
   * @return The buddyPokemonNickname.
   */
  java.lang.String getBuddyPokemonNickname();
  /**
   * <code>string buddy_pokemon_nickname = 3;</code>
   * @return The bytes for buddyPokemonNickname.
   */
  com.google.protobuf.ByteString
      getBuddyPokemonNicknameBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
   * @return Whether the lastPokemonCaught field is set.
   */
  boolean hasLastPokemonCaught();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
   * @return The lastPokemonCaught.
   */
  POGOProtos.Rpc.PokemonDisplayProto getLastPokemonCaught();
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto last_pokemon_caught = 4;</code>
   */
  POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getLastPokemonCaughtOrBuilder();

  /**
   * <code>int32 last_pokemon_caught_display_id = 5;</code>
   * @return The lastPokemonCaughtDisplayId.
   */
  int getLastPokemonCaughtDisplayId();

  /**
   * <code>int64 last_pokemon_caught_timestamp = 6;</code>
   * @return The lastPokemonCaughtTimestamp.
   */
  long getLastPokemonCaughtTimestamp();

  /**
   * <code>int32 buddy_candy_awarded = 7;</code>
   * @return The buddyCandyAwarded.
   */
  int getBuddyCandyAwarded();

  /**
   * <code>.POGOProtos.Rpc.MegaEvoInfoProto active_mega_evo_info = 8;</code>
   * @return Whether the activeMegaEvoInfo field is set.
   */
  boolean hasActiveMegaEvoInfo();
  /**
   * <code>.POGOProtos.Rpc.MegaEvoInfoProto active_mega_evo_info = 8;</code>
   * @return The activeMegaEvoInfo.
   */
  POGOProtos.Rpc.MegaEvoInfoProto getActiveMegaEvoInfo();
  /**
   * <code>.POGOProtos.Rpc.MegaEvoInfoProto active_mega_evo_info = 8;</code>
   */
  POGOProtos.Rpc.MegaEvoInfoProtoOrBuilder getActiveMegaEvoInfoOrBuilder();
}
