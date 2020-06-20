// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/FriendshipData.proto

package POGOProtos.Data.Friends;

public interface FriendshipDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Friends.FriendshipData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Friends.FriendshipLevelData friendship_level_data = 1;</code>
   * @return Whether the friendshipLevelData field is set.
   */
  boolean hasFriendshipLevelData();
  /**
   * <code>.POGOProtos.Data.Friends.FriendshipLevelData friendship_level_data = 1;</code>
   * @return The friendshipLevelData.
   */
  POGOProtos.Data.Friends.FriendshipLevelData getFriendshipLevelData();
  /**
   * <code>.POGOProtos.Data.Friends.FriendshipLevelData friendship_level_data = 1;</code>
   */
  POGOProtos.Data.Friends.FriendshipLevelDataOrBuilder getFriendshipLevelDataOrBuilder();

  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 2;</code>
   */
  java.util.List<POGOProtos.Data.Gift.GiftBoxDetails> 
      getGiftboxDetailsList();
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 2;</code>
   */
  POGOProtos.Data.Gift.GiftBoxDetails getGiftboxDetails(int index);
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 2;</code>
   */
  int getGiftboxDetailsCount();
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 2;</code>
   */
  java.util.List<? extends POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder> 
      getGiftboxDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Gift.GiftBoxDetails giftbox_details = 2;</code>
   */
  POGOProtos.Data.Gift.GiftBoxDetailsOrBuilder getGiftboxDetailsOrBuilder(
      int index);

  /**
   * <code>string codename = 3;</code>
   * @return The codename.
   */
  java.lang.String getCodename();
  /**
   * <code>string codename = 3;</code>
   * @return The bytes for codename.
   */
  com.google.protobuf.ByteString
      getCodenameBytes();

  /**
   * <code>string nickname = 4;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 4;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>int64 open_trade_expire_ms = 5;</code>
   * @return The openTradeExpireMs.
   */
  long getOpenTradeExpireMs();

  /**
   * <code>bool is_lucky = 6;</code>
   * @return The isLucky.
   */
  boolean getIsLucky();

  /**
   * <code>int32 lucky_count = 7;</code>
   * @return The luckyCount.
   */
  int getLuckyCount();
}
