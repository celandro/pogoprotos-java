// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetFriendshipMilestoneRewardsResponse.proto

package POGOProtos.Networking.Responses;

public final class GetFriendshipMilestoneRewardsResponseOuterClass {
  private GetFriendshipMilestoneRewardsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_GetFriendshipMilestoneRewardsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_GetFriendshipMilestoneRewardsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nKPOGOProtos/Networking/Responses/GetFri" +
      "endshipMilestoneRewardsResponse.proto\022\037P" +
      "OGOProtos.Networking.Responses\"\272\002\n%GetFr" +
      "iendshipMilestoneRewardsResponse\022]\n\006resu" +
      "lt\030\001 \001(\0162M.POGOProtos.Networking.Respons" +
      "es.GetFriendshipMilestoneRewardsResponse" +
      ".Result\022\021\n\txp_reward\030\002 \001(\003\022\021\n\tfriend_id\030" +
      "\003 \001(\t\"\213\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001" +
      "\022\021\n\rERROR_UNKNOWN\020\002\022\025\n\021ERROR_NOT_FRIENDS" +
      "\020\003\022#\n\037ERROR_MILESTONE_ALREADY_AWARDED\020\004\022" +
      "\032\n\026ERROR_FAILED_TO_UPDATE\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_GetFriendshipMilestoneRewardsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_GetFriendshipMilestoneRewardsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_GetFriendshipMilestoneRewardsResponse_descriptor,
        new java.lang.String[] { "Result", "XpReward", "FriendId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
