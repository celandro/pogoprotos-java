// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/CheckShareExRaidPassMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface CheckShareExRaidPassMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.CheckShareExRaidPassMessage)
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
   * <code>int64 raid_seed = 3;</code>
   * @return The raidSeed.
   */
  long getRaidSeed();
}
