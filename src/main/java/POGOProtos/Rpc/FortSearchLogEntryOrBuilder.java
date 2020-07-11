// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface FortSearchLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FortSearchLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.FortSearchLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.FortSearchLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.FortSearchLogEntry.Result getResult();

  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.ItemProto> 
      getItemsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  POGOProtos.Rpc.ItemProto getItems(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ItemProtoOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto items = 3;</code>
   */
  POGOProtos.Rpc.ItemProtoOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <code>int32 eggs = 4;</code>
   * @return The eggs.
   */
  int getEggs();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon_eggs = 5;</code>
   */
  java.util.List<POGOProtos.Rpc.PokemonProto> 
      getPokemonEggsList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon_eggs = 5;</code>
   */
  POGOProtos.Rpc.PokemonProto getPokemonEggs(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon_eggs = 5;</code>
   */
  int getPokemonEggsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon_eggs = 5;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokemonProtoOrBuilder> 
      getPokemonEggsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon_eggs = 5;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonEggsOrBuilder(
      int index);

  /**
   * <code>.POGOProtos.Rpc.FortType fort_type = 6;</code>
   * @return The enum numeric value on the wire for fortType.
   */
  int getFortTypeValue();
  /**
   * <code>.POGOProtos.Rpc.FortType fort_type = 6;</code>
   * @return The fortType.
   */
  POGOProtos.Rpc.FortType getFortType();

  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto awarded_items = 7;</code>
   */
  java.util.List<POGOProtos.Rpc.ItemProto> 
      getAwardedItemsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto awarded_items = 7;</code>
   */
  POGOProtos.Rpc.ItemProto getAwardedItems(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto awarded_items = 7;</code>
   */
  int getAwardedItemsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto awarded_items = 7;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ItemProtoOrBuilder> 
      getAwardedItemsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto awarded_items = 7;</code>
   */
  POGOProtos.Rpc.ItemProtoOrBuilder getAwardedItemsOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto bonus_items = 8;</code>
   */
  java.util.List<POGOProtos.Rpc.ItemProto> 
      getBonusItemsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto bonus_items = 8;</code>
   */
  POGOProtos.Rpc.ItemProto getBonusItems(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto bonus_items = 8;</code>
   */
  int getBonusItemsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto bonus_items = 8;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ItemProtoOrBuilder> 
      getBonusItemsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto bonus_items = 8;</code>
   */
  POGOProtos.Rpc.ItemProtoOrBuilder getBonusItemsOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto team_bonus_items = 9;</code>
   */
  java.util.List<POGOProtos.Rpc.ItemProto> 
      getTeamBonusItemsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto team_bonus_items = 9;</code>
   */
  POGOProtos.Rpc.ItemProto getTeamBonusItems(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto team_bonus_items = 9;</code>
   */
  int getTeamBonusItemsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto team_bonus_items = 9;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ItemProtoOrBuilder> 
      getTeamBonusItemsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ItemProto team_bonus_items = 9;</code>
   */
  POGOProtos.Rpc.ItemProtoOrBuilder getTeamBonusItemsOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxProto gift_boxes = 10;</code>
   */
  java.util.List<POGOProtos.Rpc.GiftBoxProto> 
      getGiftBoxesList();
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxProto gift_boxes = 10;</code>
   */
  POGOProtos.Rpc.GiftBoxProto getGiftBoxes(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxProto gift_boxes = 10;</code>
   */
  int getGiftBoxesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxProto gift_boxes = 10;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.GiftBoxProtoOrBuilder> 
      getGiftBoxesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxProto gift_boxes = 10;</code>
   */
  POGOProtos.Rpc.GiftBoxProtoOrBuilder getGiftBoxesOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.LootItemProto stickers = 11;</code>
   */
  java.util.List<POGOProtos.Rpc.LootItemProto> 
      getStickersList();
  /**
   * <code>repeated .POGOProtos.Rpc.LootItemProto stickers = 11;</code>
   */
  POGOProtos.Rpc.LootItemProto getStickers(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.LootItemProto stickers = 11;</code>
   */
  int getStickersCount();
  /**
   * <code>repeated .POGOProtos.Rpc.LootItemProto stickers = 11;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.LootItemProtoOrBuilder> 
      getStickersOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.LootItemProto stickers = 11;</code>
   */
  POGOProtos.Rpc.LootItemProtoOrBuilder getStickersOrBuilder(
      int index);
}
