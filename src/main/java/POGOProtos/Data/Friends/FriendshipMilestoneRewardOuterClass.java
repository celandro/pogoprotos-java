// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Friends/FriendshipMilestoneReward.proto

package POGOProtos.Data.Friends;

public final class FriendshipMilestoneRewardOuterClass {
  private FriendshipMilestoneRewardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Friends_FriendshipMilestoneReward_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Friends_FriendshipMilestoneReward_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Data/Friends/FriendshipMile" +
      "stoneReward.proto\022\027POGOProtos.Data.Frien" +
      "ds\032/POGOProtos/Enums/FriendshipLevelMile" +
      "stone.proto\"x\n\031FriendshipMilestoneReward" +
      "\022\021\n\tfriend_id\030\001 \001(\t\022H\n\024friendship_milest" +
      "one\030\002 \001(\0162*.POGOProtos.Enums.FriendshipL" +
      "evelMilestoneB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.FriendshipLevelMilestoneOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Friends_FriendshipMilestoneReward_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Friends_FriendshipMilestoneReward_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Friends_FriendshipMilestoneReward_descriptor,
        new java.lang.String[] { "FriendId", "FriendshipMilestone", });
    POGOProtos.Enums.FriendshipLevelMilestoneOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
