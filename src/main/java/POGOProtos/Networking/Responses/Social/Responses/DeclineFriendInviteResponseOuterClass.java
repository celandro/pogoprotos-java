// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/DeclineFriendInviteResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public final class DeclineFriendInviteResponseOuterClass {
  private DeclineFriendInviteResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Social_Responses_DeclineFriendInviteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Social_Responses_DeclineFriendInviteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nRPOGOProtos/Networking/Responses/Social" +
      "/Responses/DeclineFriendInviteResponse.p" +
      "roto\0220POGOProtos.Networking.Responses.So" +
      "cial.Responses\"\374\001\n\033DeclineFriendInviteRe" +
      "sponse\022d\n\006result\030\001 \001(\0162T.POGOProtos.Netw" +
      "orking.Responses.Social.Responses.Declin" +
      "eFriendInviteResponse.Result\"w\n\006Result\022\t" +
      "\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\021\n\rERROR_UNKNOWN\020" +
      "\002\022\037\n\033ERROR_INVITE_DOES_NOT_EXIST\020\003\022!\n\035ER" +
      "ROR_INVITE_ALREADY_DECLINED\020\004B\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_Social_Responses_DeclineFriendInviteResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Social_Responses_DeclineFriendInviteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Social_Responses_DeclineFriendInviteResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
