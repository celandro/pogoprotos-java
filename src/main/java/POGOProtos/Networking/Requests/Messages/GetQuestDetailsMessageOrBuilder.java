// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetQuestDetailsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface GetQuestDetailsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.GetQuestDetailsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string quest_id = 1;</code>
   * @return A list containing the questId.
   */
  java.util.List<java.lang.String>
      getQuestIdList();
  /**
   * <code>repeated string quest_id = 1;</code>
   * @return The count of questId.
   */
  int getQuestIdCount();
  /**
   * <code>repeated string quest_id = 1;</code>
   * @param index The index of the element to return.
   * @return The questId at the given index.
   */
  java.lang.String getQuestId(int index);
  /**
   * <code>repeated string quest_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the questId at the given index.
   */
  com.google.protobuf.ByteString
      getQuestIdBytes(int index);
}
