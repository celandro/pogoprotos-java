// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface DismissOutgoingGameInvitesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.DismissOutgoingGameInvitesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string friend_id = 1;</code>
   * @return The friendId.
   */
  java.lang.String getFriendId();
  /**
   * <code>string friend_id = 1;</code>
   * @return The bytes for friendId.
   */
  com.google.protobuf.ByteString
      getFriendIdBytes();

  /**
   * <code>repeated string app_key = 2;</code>
   * @return A list containing the appKey.
   */
  java.util.List<java.lang.String>
      getAppKeyList();
  /**
   * <code>repeated string app_key = 2;</code>
   * @return The count of appKey.
   */
  int getAppKeyCount();
  /**
   * <code>repeated string app_key = 2;</code>
   * @param index The index of the element to return.
   * @return The appKey at the given index.
   */
  java.lang.String getAppKey(int index);
  /**
   * <code>repeated string app_key = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the appKey at the given index.
   */
  com.google.protobuf.ByteString
      getAppKeyBytes(int index);
}