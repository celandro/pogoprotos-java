// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestPrecondition.proto

package POGOProtos.Data.Quests;

public interface QuestPreconditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Quests.QuestPrecondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.QuestPreconditionType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.QuestPreconditionType type = 1;</code>
   * @return The type.
   */
  POGOProtos.Data.Quests.QuestPrecondition.QuestPreconditionType getType();

  /**
   * <code>string quest_template_id = 2;</code>
   * @return The questTemplateId.
   */
  java.lang.String getQuestTemplateId();
  /**
   * <code>string quest_template_id = 2;</code>
   * @return The bytes for questTemplateId.
   */
  com.google.protobuf.ByteString
      getQuestTemplateIdBytes();

  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Level level = 3;</code>
   * @return Whether the level field is set.
   */
  boolean hasLevel();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Level level = 3;</code>
   * @return The level.
   */
  POGOProtos.Data.Quests.QuestPrecondition.Level getLevel();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Level level = 3;</code>
   */
  POGOProtos.Data.Quests.QuestPrecondition.LevelOrBuilder getLevelOrBuilder();

  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Medal medal = 4;</code>
   * @return Whether the medal field is set.
   */
  boolean hasMedal();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Medal medal = 4;</code>
   * @return The medal.
   */
  POGOProtos.Data.Quests.QuestPrecondition.Medal getMedal();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Medal medal = 4;</code>
   */
  POGOProtos.Data.Quests.QuestPrecondition.MedalOrBuilder getMedalOrBuilder();

  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Quests quests = 5;</code>
   * @return Whether the quests field is set.
   */
  boolean hasQuests();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Quests quests = 5;</code>
   * @return The quests.
   */
  POGOProtos.Data.Quests.QuestPrecondition.Quests getQuests();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Quests quests = 5;</code>
   */
  POGOProtos.Data.Quests.QuestPrecondition.QuestsOrBuilder getQuestsOrBuilder();

  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.MonthYearBucket month_year_bucket = 6;</code>
   * @return Whether the monthYearBucket field is set.
   */
  boolean hasMonthYearBucket();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.MonthYearBucket month_year_bucket = 6;</code>
   * @return The monthYearBucket.
   */
  POGOProtos.Data.Quests.QuestPrecondition.MonthYearBucket getMonthYearBucket();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.MonthYearBucket month_year_bucket = 6;</code>
   */
  POGOProtos.Data.Quests.QuestPrecondition.MonthYearBucketOrBuilder getMonthYearBucketOrBuilder();

  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Group group = 7;</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Group group = 7;</code>
   * @return The group.
   */
  POGOProtos.Data.Quests.QuestPrecondition.Group getGroup();
  /**
   * <code>.POGOProtos.Data.Quests.QuestPrecondition.Group group = 7;</code>
   */
  POGOProtos.Data.Quests.QuestPrecondition.GroupOrBuilder getGroupOrBuilder();

  public POGOProtos.Data.Quests.QuestPrecondition.ConditionCase getConditionCase();
}
