// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetTimedGroupChallengeResponse.proto

package POGOProtos.Networking.Responses;

public final class GetTimedGroupChallengeResponseOuterClass {
  private GetTimedGroupChallengeResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_TimedGroupChallengeDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_TimedGroupChallengeDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeCriteria_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeCriteria_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeDisplay_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeDisplay_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDPOGOProtos/Networking/Responses/GetTim" +
      "edGroupChallengeResponse.proto\022\037POGOProt" +
      "os.Networking.Responses\032 POGOProtos/Enum" +
      "s/QuestType.proto\032&POGOProtos/Data/Quest" +
      "s/QuestGoal.proto\032:POGOProtos/Networking" +
      "/Responses/GetTodayViewResponse.proto\"\305\010" +
      "\n\036GetTimedGroupChallengeResponse\022V\n\006stat" +
      "us\030\001 \001(\0162F.POGOProtos.Networking.Respons" +
      "es.GetTimedGroupChallengeResponse.Status" +
      "\022{\n\024challenge_definition\030\002 \001(\0132].POGOPro" +
      "tos.Networking.Responses.GetTimedGroupCh" +
      "allengeResponse.TimedGroupChallengeDefin" +
      "ition\022\025\n\rcurrent_score\030\003 \001(\005\022\024\n\014player_s" +
      "core\030\004 \001(\005\022\030\n\020active_city_hash\030\005 \001(\t\022,\n$" +
      "active_city_localization_key_changes\030\006 \003" +
      "(\t\032\321\002\n\035TimedGroupChallengeDefinition\022\024\n\014" +
      "challenge_id\030\001 \001(\t\022f\n\007display\030\002 \001(\0132U.PO" +
      "GOProtos.Networking.Responses.GetTimedGr" +
      "oupChallengeResponse.GroupChallengeDispl" +
      "ay\022\037\n\027start_time_ms_inclusive\030\003 \001(\003\022\035\n\025e" +
      "nd_time_ms_exclusive\030\004 \001(\003\022r\n\022challenge_" +
      "criteria\030\005 \001(\0132V.POGOProtos.Networking.R" +
      "esponses.GetTimedGroupChallengeResponse." +
      "GroupChallengeCriteria\032\210\001\n\026GroupChalleng" +
      "eCriteria\0223\n\016challenge_type\030\001 \001(\0162\033.POGO" +
      "Protos.Enums.QuestType\0229\n\016challenge_goal" +
      "\030\002 \001(\0132!.POGOProtos.Data.Quests.QuestGoa" +
      "l\032\245\001\n\025GroupChallengeDisplay\022\r\n\005title\030\001 \001" +
      "(\t\022}\n\rboost_rewards\030\002 \003(\0132f.POGOProtos.N" +
      "etworking.Responses.GetTodayViewResponse" +
      ".TodayView.TodayViewSection.EventSection" +
      ".BonusBox\"R\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCES" +
      "S\020\001\022\021\n\rERROR_UNKNOWN\020\002\022\035\n\031ERROR_CHALLENG" +
      "E_NOT_FOUND\020\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.QuestTypeOuterClass.getDescriptor(),
          POGOProtos.Data.Quests.QuestGoalOuterClass.getDescriptor(),
          POGOProtos.Networking.Responses.GetTodayViewResponseOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_descriptor,
        new java.lang.String[] { "Status", "ChallengeDefinition", "CurrentScore", "PlayerScore", "ActiveCityHash", "ActiveCityLocalizationKeyChanges", });
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_TimedGroupChallengeDefinition_descriptor =
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_TimedGroupChallengeDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_TimedGroupChallengeDefinition_descriptor,
        new java.lang.String[] { "ChallengeId", "Display", "StartTimeMsInclusive", "EndTimeMsExclusive", "ChallengeCriteria", });
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeCriteria_descriptor =
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_descriptor.getNestedTypes().get(1);
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeCriteria_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeCriteria_descriptor,
        new java.lang.String[] { "ChallengeType", "ChallengeGoal", });
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeDisplay_descriptor =
      internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_descriptor.getNestedTypes().get(2);
    internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeDisplay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetTimedGroupChallengeResponse_GroupChallengeDisplay_descriptor,
        new java.lang.String[] { "Title", "BoostRewards", });
    POGOProtos.Enums.QuestTypeOuterClass.getDescriptor();
    POGOProtos.Data.Quests.QuestGoalOuterClass.getDescriptor();
    POGOProtos.Networking.Responses.GetTodayViewResponseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
