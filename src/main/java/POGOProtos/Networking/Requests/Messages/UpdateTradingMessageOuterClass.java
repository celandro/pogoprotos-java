// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/UpdateTradingMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class UpdateTradingMessageOuterClass {
  private UpdateTradingMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_UpdateTradingMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_UpdateTradingMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBPOGOProtos/Networking/Requests/Message" +
      "s/UpdateTradingMessage.proto\022\'POGOProtos" +
      ".Networking.Requests.Messages\"=\n\024UpdateT" +
      "radingMessage\022\021\n\tplayer_id\030\001 \001(\t\022\022\n\npoke" +
      "mon_id\030\002 \001(\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_UpdateTradingMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_UpdateTradingMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_UpdateTradingMessage_descriptor,
        new java.lang.String[] { "PlayerId", "PokemonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
