// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/SetLobbyVisibilityMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class SetLobbyVisibilityMessageOuterClass {
  private SetLobbyVisibilityMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_SetLobbyVisibilityMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_SetLobbyVisibilityMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGPOGOProtos/Networking/Requests/Message" +
      "s/SetLobbyVisibilityMessage.proto\022\'POGOP" +
      "rotos.Networking.Requests.Messages\"P\n\031Se" +
      "tLobbyVisibilityMessage\022\021\n\traid_seed\030\001 \001" +
      "(\003\022\016\n\006gym_id\030\002 \001(\t\022\020\n\010lobby_id\030\003 \003(\005B\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_SetLobbyVisibilityMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_SetLobbyVisibilityMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_SetLobbyVisibilityMessage_descriptor,
        new java.lang.String[] { "RaidSeed", "GymId", "LobbyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
