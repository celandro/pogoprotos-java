// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestStampCard.proto

package POGOProtos.Data.Quests;

public final class QuestStampCardOuterClass {
  private QuestStampCardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Quests_QuestStampCard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Quests_QuestStampCard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+POGOProtos/Data/Quests/QuestStampCard." +
      "proto\022\026POGOProtos.Data.Quests\032\'POGOProto" +
      "s/Data/Quests/QuestStamp.proto\"\221\001\n\016Quest" +
      "StampCard\0221\n\005stamp\030\001 \003(\0132\".POGOProtos.Da" +
      "ta.Quests.QuestStamp\022\016\n\006target\030\002 \001(\005\022\036\n\026" +
      "remaining_daily_stamps\030\003 \001(\005\022\n\n\002id\030\004 \001(\t" +
      "\022\020\n\010icon_url\030\005 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Quests.QuestStampOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Quests_QuestStampCard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Quests_QuestStampCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Quests_QuestStampCard_descriptor,
        new java.lang.String[] { "Stamp", "Target", "RemainingDailyStamps", "Id", "IconUrl", });
    POGOProtos.Data.Quests.QuestStampOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
