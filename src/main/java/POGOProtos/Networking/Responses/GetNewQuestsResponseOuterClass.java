// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetNewQuestsResponse.proto

package POGOProtos.Networking.Responses;

public final class GetNewQuestsResponseOuterClass {
  private GetNewQuestsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetNewQuestsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetNewQuestsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:POGOProtos/Networking/Responses/GetNew" +
      "QuestsResponse.proto\022\037POGOProtos.Network" +
      "ing.Responses\032(POGOProtos/Data/Quests/Cl" +
      "ientQuest.proto\"\233\002\n\024GetNewQuestsResponse" +
      "\022L\n\006status\030\001 \001(\0162<.POGOProtos.Networking" +
      ".Responses.GetNewQuestsResponse.Status\0223" +
      "\n\006quests\030\002 \003(\0132#.POGOProtos.Data.Quests." +
      "ClientQuest\022C\n\026version_changed_quests\030\003 " +
      "\003(\0132#.POGOProtos.Data.Quests.ClientQuest" +
      "\";\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\031\n\025ER" +
      "ROR_INVALID_DISPLAY\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Quests.ClientQuestOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetNewQuestsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetNewQuestsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetNewQuestsResponse_descriptor,
        new java.lang.String[] { "Status", "Quests", "VersionChangedQuests", });
    POGOProtos.Data.Quests.ClientQuestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
