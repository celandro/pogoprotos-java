// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/ClaimCodenameResponse.proto

package POGOProtos.Networking.Responses;

public final class ClaimCodenameResponseOuterClass {
  private ClaimCodenameResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_ClaimCodenameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_ClaimCodenameResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;POGOProtos/Networking/Responses/ClaimC" +
      "odenameResponse.proto\022\037POGOProtos.Networ" +
      "king.Responses\032 POGOProtos/Data/PlayerDa" +
      "ta.proto\"\202\003\n\025ClaimCodenameResponse\022\020\n\010co" +
      "dename\030\001 \001(\t\022\024\n\014user_message\030\002 \001(\t\022\025\n\ris" +
      "_assignable\030\003 \001(\010\022M\n\006status\030\004 \001(\0162=.POGO" +
      "Protos.Networking.Responses.ClaimCodenam" +
      "eResponse.Status\0223\n\016updated_player\030\005 \001(\013" +
      "2\033.POGOProtos.Data.PlayerData\022\033\n\023suggest" +
      "ed_codenames\030\006 \003(\t\"\210\001\n\006Status\022\t\n\005UNSET\020\000" +
      "\022\013\n\007SUCCESS\020\001\022\032\n\026CODENAME_NOT_AVAILABLE\020" +
      "\002\022\026\n\022CODENAME_NOT_VALID\020\003\022\021\n\rCURRENT_OWN" +
      "ER\020\004\022\037\n\033CODENAME_CHANGE_NOT_ALLOWED\020\005B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PlayerDataOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_ClaimCodenameResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_ClaimCodenameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_ClaimCodenameResponse_descriptor,
        new java.lang.String[] { "Codename", "UserMessage", "IsAssignable", "Status", "UpdatedPlayer", "SuggestedCodenames", });
    POGOProtos.Data.PlayerDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
