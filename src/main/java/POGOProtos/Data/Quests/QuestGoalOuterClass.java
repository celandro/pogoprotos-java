// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestGoal.proto

package POGOProtos.Data.Quests;

public final class QuestGoalOuterClass {
  private QuestGoalOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Quests_QuestGoal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Quests_QuestGoal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&POGOProtos/Data/Quests/QuestGoal.proto" +
      "\022\026POGOProtos.Data.Quests\032+POGOProtos/Dat" +
      "a/Quests/QuestCondition.proto\"V\n\tQuestGo" +
      "al\0229\n\tcondition\030\001 \003(\0132&.POGOProtos.Data." +
      "Quests.QuestCondition\022\016\n\006target\030\002 \001(\005B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Quests.QuestConditionOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Quests_QuestGoal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Quests_QuestGoal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Quests_QuestGoal_descriptor,
        new java.lang.String[] { "Condition", "Target", });
    POGOProtos.Data.Quests.QuestConditionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
