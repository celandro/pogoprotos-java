// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface FriendshipDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FriendshipDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelDataProto friendship_level_data = 1;</code>
   * @return Whether the friendshipLevelData field is set.
   */
  boolean hasFriendshipLevelData();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelDataProto friendship_level_data = 1;</code>
   * @return The friendshipLevelData.
   */
  POGOProtos.Rpc.FriendshipLevelDataProto getFriendshipLevelData();
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelDataProto friendship_level_data = 1;</code>
   */
  POGOProtos.Rpc.FriendshipLevelDataProtoOrBuilder getFriendshipLevelDataOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto giftbox_details = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.GiftBoxDetailsProto> 
      getGiftboxDetailsList();
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto giftbox_details = 2;</code>
   */
  POGOProtos.Rpc.GiftBoxDetailsProto getGiftboxDetails(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto giftbox_details = 2;</code>
   */
  int getGiftboxDetailsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto giftbox_details = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder> 
      getGiftboxDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.GiftBoxDetailsProto giftbox_details = 2;</code>
   */
  POGOProtos.Rpc.GiftBoxDetailsProtoOrBuilder getGiftboxDetailsOrBuilder(
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