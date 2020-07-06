// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CompleteQuestResponse.proto

package POGOProtos.Networking.Responses;

public interface CompleteQuestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.CompleteQuestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.CompleteQuestResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.CompleteQuestResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.CompleteQuestResponse.Status getStatus();

  /**
   * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
   * @return Whether the quest field is set.
   */
  boolean hasQuest();
  /**
   * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
   * @return The quest.
   */
  POGOProtos.Data.Quests.ClientQuest getQuest();
  /**
   * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
   */
  POGOProtos.Data.Quests.ClientQuestOrBuilder getQuestOrBuilder();

  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 3;</code>
   */
  java.util.List<POGOProtos.Data.Quests.QuestStamp> 
      getStampList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 3;</code>
   */
  POGOProtos.Data.Quests.QuestStamp getStamp(int index);
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 3;</code>
   */
  int getStampCount();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 3;</code>
   */
  java.util.List<? extends POGOProtos.Data.Quests.QuestStampOrBuilder> 
      getStampOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestStamp stamp = 3;</code>
   */
  POGOProtos.Data.Quests.QuestStampOrBuilder getStampOrBuilder(
      int index);
}
