// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/QuestSettings.proto

package POGOProtos.Settings.Master;

public interface QuestSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.QuestSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.QuestType quest_type = 1;</code>
   * @return The enum numeric value on the wire for questType.
   */
  int getQuestTypeValue();
  /**
   * <code>.POGOProtos.Enums.QuestType quest_type = 1;</code>
   * @return The questType.
   */
  POGOProtos.Enums.QuestType getQuestType();

  /**
   * <code>.POGOProtos.Settings.Master.Quest.DailyQuestSettings daily_quest = 2;</code>
   * @return Whether the dailyQuest field is set.
   */
  boolean hasDailyQuest();
  /**
   * <code>.POGOProtos.Settings.Master.Quest.DailyQuestSettings daily_quest = 2;</code>
   * @return The dailyQuest.
   */
  POGOProtos.Settings.Master.Quest.DailyQuestSettings getDailyQuest();
  /**
   * <code>.POGOProtos.Settings.Master.Quest.DailyQuestSettings daily_quest = 2;</code>
   */
  POGOProtos.Settings.Master.Quest.DailyQuestSettingsOrBuilder getDailyQuestOrBuilder();
}
