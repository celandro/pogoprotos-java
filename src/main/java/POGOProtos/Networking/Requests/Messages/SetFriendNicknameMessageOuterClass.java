// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/SetFriendNicknameMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class SetFriendNicknameMessageOuterClass {
  private SetFriendNicknameMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_SetFriendNicknameMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_SetFriendNicknameMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFPOGOProtos/Networking/Requests/Message" +
      "s/SetFriendNicknameMessage.proto\022\'POGOPr" +
      "otos.Networking.Requests.Messages\"F\n\030Set" +
      "FriendNicknameMessage\022\021\n\tfriend_id\030\001 \001(\t" +
      "\022\027\n\017friend_nickname\030\002 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_SetFriendNicknameMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_SetFriendNicknameMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_SetFriendNicknameMessage_descriptor,
        new java.lang.String[] { "FriendId", "FriendNickname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
