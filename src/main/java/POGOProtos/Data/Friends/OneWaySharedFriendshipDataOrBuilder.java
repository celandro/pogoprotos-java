// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/OneWaySharedFriendshipData.proto

package POGOProtos.Data.Friends;

public interface OneWaySharedFriendshipDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Friends.OneWaySharedFriendshipData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  java.util.List<POGOProtos.Data.Gift.GiftBoxDetails> 
      getGiftboxDetailsList();
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  POGOProtos.Data.Gift.GiftBoxDetails getGiftboxDetails(int index);
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  int getGiftboxDetailsCount();
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  java.util.List<? extends POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder> 
      getGiftboxDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 1;</code>
   */
  POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder getGiftboxDetailsOrBuilder(
      int index);

  /**
   * <code>int64 open_trade_expire_ms = 2;</code>
   * @return The openTradeExpireMs.
   */
  long getOpenTradeExpireMs();
}
