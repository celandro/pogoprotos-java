// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Social/Requests/ListFriendStatusMessage.proto

package POGOProtos.Networking.Requests.Social.Requests;

public interface ListFriendStatusMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Social.Requests.ListFriendStatusMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string player_id = 1;</code>
   * @return A list containing the playerId.
   */
  java.util.List<java.lang.String>
      getPlayerIdList();
  /**
   * <code>repeated string player_id = 1;</code>
   * @return The count of playerId.
   */
  int getPlayerIdCount();
  /**
   * <code>repeated string player_id = 1;</code>
   * @param index The index of the element to return.
   * @return The playerId at the given index.
   */
  java.lang.String getPlayerId(int index);
  /**
   * <code>repeated string player_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the playerId at the given index.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes(int index);
}