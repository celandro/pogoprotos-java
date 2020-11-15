// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface QuestRewardProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.QuestRewardProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 exp = 2;</code>
   * @return The exp.
   */
  int getExp();

  /**
   * <code>.POGOProtos.Rpc.ItemRewardProto item = 3;</code>
   * @return Whether the item field is set.
   */
  boolean hasItem();
  /**
   * <code>.POGOProtos.Rpc.ItemRewardProto item = 3;</code>
   * @return The item.
   */
  POGOProtos.Rpc.ItemRewardProto getItem();
  /**
   * <code>.POGOProtos.Rpc.ItemRewardProto item = 3;</code>
   */
  POGOProtos.Rpc.ItemRewardProtoOrBuilder getItemOrBuilder();

  /**
   * <code>int32 stardust = 4;</code>
   * @return The stardust.
   */
  int getStardust();

  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto candy = 5;</code>
   * @return Whether the candy field is set.
   */
  boolean hasCandy();
  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto candy = 5;</code>
   * @return The candy.
   */
  POGOProtos.Rpc.PokemonCandyRewardProto getCandy();
  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto candy = 5;</code>
   */
  POGOProtos.Rpc.PokemonCandyRewardProtoOrBuilder getCandyOrBuilder();

  /**
   * <code>string avatar_template_id = 6;</code>
   * @return The avatarTemplateId.
   */
  java.lang.String getAvatarTemplateId();
  /**
   * <code>string avatar_template_id = 6;</code>
   * @return The bytes for avatarTemplateId.
   */
  com.google.protobuf.ByteString
      getAvatarTemplateIdBytes();

  /**
   * <code>string quest_template_id = 7;</code>
   * @return The questTemplateId.
   */
  java.lang.String getQuestTemplateId();
  /**
   * <code>string quest_template_id = 7;</code>
   * @return The bytes for questTemplateId.
   */
  com.google.protobuf.ByteString
      getQuestTemplateIdBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon_encounter = 8;</code>
   * @return Whether the pokemonEncounter field is set.
   */
  boolean hasPokemonEncounter();
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon_encounter = 8;</code>
   * @return The pokemonEncounter.
   */
  POGOProtos.Rpc.PokemonEncounterRewardProto getPokemonEncounter();
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon_encounter = 8;</code>
   */
  POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder getPokemonEncounterOrBuilder();

  /**
   * <code>int32 pokecoin = 9;</code>
   * @return The pokecoin.
   */
  int getPokecoin();

  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto xl_candy = 10;</code>
   * @return Whether the xlCandy field is set.
   */
  boolean hasXlCandy();
  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto xl_candy = 10;</code>
   * @return The xlCandy.
   */
  POGOProtos.Rpc.PokemonCandyRewardProto getXlCandy();
  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto xl_candy = 10;</code>
   */
  POGOProtos.Rpc.PokemonCandyRewardProtoOrBuilder getXlCandyOrBuilder();

  /**
   * <code>int32 level_cap = 11;</code>
   * @return The levelCap.
   */
  int getLevelCap();

  /**
   * <code>.POGOProtos.Rpc.StickerRewardProto sticker = 12;</code>
   * @return Whether the sticker field is set.
   */
  boolean hasSticker();
  /**
   * <code>.POGOProtos.Rpc.StickerRewardProto sticker = 12;</code>
   * @return The sticker.
   */
  POGOProtos.Rpc.StickerRewardProto getSticker();
  /**
   * <code>.POGOProtos.Rpc.StickerRewardProto sticker = 12;</code>
   */
  POGOProtos.Rpc.StickerRewardProtoOrBuilder getStickerOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto mega_resource = 13;</code>
   * @return Whether the megaResource field is set.
   */
  boolean hasMegaResource();
  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto mega_resource = 13;</code>
   * @return The megaResource.
   */
  POGOProtos.Rpc.PokemonCandyRewardProto getMegaResource();
  /**
   * <code>.POGOProtos.Rpc.PokemonCandyRewardProto mega_resource = 13;</code>
   */
  POGOProtos.Rpc.PokemonCandyRewardProtoOrBuilder getMegaResourceOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.QuestRewardProto.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.POGOProtos.Rpc.QuestRewardProto.Type type = 1;</code>
   * @return The type.
   */
  POGOProtos.Rpc.QuestRewardProto.Type getType();

  public POGOProtos.Rpc.QuestRewardProto.RewardCase getRewardCase();
}
