// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestStamp.proto

package POGOProtos.Data.Quests;

public final class QuestStampOuterClass {
  private QuestStampOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Quests_QuestStamp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Quests_QuestStamp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'POGOProtos/Data/Quests/QuestStamp.prot" +
      "o\022\026POGOProtos.Data.Quests\"\233\001\n\nQuestStamp" +
      "\022;\n\007context\030\001 \001(\0162*.POGOProtos.Data.Ques" +
      "ts.QuestStamp.Context\022\024\n\014timestamp_ms\030\002 " +
      "\001(\004\":\n\007Context\022\t\n\005UNSET\020\000\022\017\n\013STORY_QUEST" +
      "\020\001\022\023\n\017CHALLENGE_QUEST\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Quests_QuestStamp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Quests_QuestStamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Quests_QuestStamp_descriptor,
        new java.lang.String[] { "Context", "TimestampMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
