// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/DeleteGiftMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface DeleteGiftMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.DeleteGiftMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string player_id = 1;</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <code>string player_id = 1;</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <code>uint64 giftbox_id = 2;</code>
   * @return The giftboxId.
   */
  long getGiftboxId();
}