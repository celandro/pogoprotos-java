// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/FeedBuddyResponse.proto

package POGOProtos.Networking.Responses;

public final class FeedBuddyResponseOuterClass {
  private FeedBuddyResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_FeedBuddyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_FeedBuddyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Networking/Responses/FeedBu" +
      "ddyResponse.proto\022\037POGOProtos.Networking" +
      ".Responses\032-POGOProtos/Data/Buddy/BuddyO" +
      "bservedData.proto\0321POGOProtos/Data/Buddy" +
      "/BuddyStatsShownHearts.proto\"\246\003\n\021FeedBud" +
      "dyResponse\022I\n\006result\030\001 \001(\01629.POGOProtos." +
      "Networking.Responses.FeedBuddyResponse.R" +
      "esult\022?\n\robserved_data\030\003 \001(\0132(.POGOProto" +
      "s.Data.Buddy.BuddyObservedData\022V\n\014shown_" +
      "hearts\030\004 \001(\0162@.POGOProtos.Data.Buddy.Bud" +
      "dyStatsShownHearts.BuddyShownHeartType\"\254" +
      "\001\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\031\n\025ERR" +
      "OR_BUDDY_NOT_VALID\020\002\022!\n\035FAILED_INSUFFICI" +
      "ENT_RESOURCES\020\003\022#\n\037FAILED_INVALID_ITEM_R" +
      "EQUIREMENT\020\004\022\'\n#FAILED_BUDDY_STILL_FULL_" +
      "FROM_POFFIN\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Buddy.BuddyObservedDataOuterClass.getDescriptor(),
          POGOProtos.Data.Buddy.BuddyStatsShownHeartsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_FeedBuddyResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_FeedBuddyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_FeedBuddyResponse_descriptor,
        new java.lang.String[] { "Result", "ObservedData", "ShownHearts", });
    POGOProtos.Data.Buddy.BuddyObservedDataOuterClass.getDescriptor();
    POGOProtos.Data.Buddy.BuddyStatsShownHeartsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
