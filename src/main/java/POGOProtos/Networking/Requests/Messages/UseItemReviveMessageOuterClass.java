// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/UseItemReviveMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class UseItemReviveMessageOuterClass {
  private UseItemReviveMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_UseItemReviveMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_UseItemReviveMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBPOGOProtos/Networking/Requests/Message" +
      "s/UseItemReviveMessage.proto\022\'POGOProtos" +
      ".Networking.Requests.Messages\032&POGOProto" +
      "s/Inventory/Item/ItemId.proto\"^\n\024UseItem" +
      "ReviveMessage\0222\n\007item_id\030\001 \001(\0162!.POGOPro" +
      "tos.Inventory.Item.ItemId\022\022\n\npokemon_id\030" +
      "\002 \001(\006B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_UseItemReviveMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_UseItemReviveMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_UseItemReviveMessage_descriptor,
        new java.lang.String[] { "ItemId", "PokemonId", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
