// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Quest/DailyQuestSettings.proto

package POGOProtos.Settings.Master.Quest;

public final class DailyQuestSettingsOuterClass {
  private DailyQuestSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_Quest_DailyQuestSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_Quest_DailyQuestSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9POGOProtos/Settings/Master/Quest/Daily" +
      "QuestSettings.proto\022 POGOProtos.Settings" +
      ".Master.Quest\"\220\001\n\022DailyQuestSettings\022\027\n\017" +
      "buckets_per_day\030\001 \001(\005\022\025\n\rstreak_length\030\002" +
      " \001(\005\022\030\n\020bonus_multiplier\030\003 \001(\002\022\037\n\027streak" +
      "_bonus_multiplier\030\004 \001(\002\022\017\n\007disable\030\005 \001(\010" +
      "B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_Quest_DailyQuestSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_Quest_DailyQuestSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_Quest_DailyQuestSettings_descriptor,
        new java.lang.String[] { "BucketsPerDay", "StreakLength", "BonusMultiplier", "StreakBonusMultiplier", "Disable", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
