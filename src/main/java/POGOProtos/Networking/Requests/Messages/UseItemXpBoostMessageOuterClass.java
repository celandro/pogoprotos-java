// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/UseItemXpBoostMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class UseItemXpBoostMessageOuterClass {
  private UseItemXpBoostMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_UseItemXpBoostMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_UseItemXpBoostMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCPOGOProtos/Networking/Requests/Message" +
      "s/UseItemXpBoostMessage.proto\022\'POGOProto" +
      "s.Networking.Requests.Messages\032&POGOProt" +
      "os/Inventory/Item/ItemId.proto\"K\n\025UseIte" +
      "mXpBoostMessage\0222\n\007item_id\030\001 \001(\0162!.POGOP" +
      "rotos.Inventory.Item.ItemIdB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_UseItemXpBoostMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_UseItemXpBoostMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_UseItemXpBoostMessage_descriptor,
        new java.lang.String[] { "ItemId", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
