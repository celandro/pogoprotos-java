// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ChangeTeamMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class ChangeTeamMessageOuterClass {
  private ChangeTeamMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_ChangeTeamMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_ChangeTeamMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?POGOProtos/Networking/Requests/Message" +
      "s/ChangeTeamMessage.proto\022\'POGOProtos.Ne" +
      "tworking.Requests.Messages\032 POGOProtos/E" +
      "nums/TeamColor.proto\032&POGOProtos/Invento" +
      "ry/Item/ItemId.proto\"o\n\021ChangeTeamMessag" +
      "e\022/\n\004item\030\001 \001(\0162!.POGOProtos.Inventory.I" +
      "tem.ItemId\022)\n\004team\030\002 \001(\0162\033.POGOProtos.En" +
      "ums.TeamColorB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.TeamColorOuterClass.getDescriptor(),
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Requests_Messages_ChangeTeamMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_ChangeTeamMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_ChangeTeamMessage_descriptor,
        new java.lang.String[] { "Item", "Team", });
    POGOProtos.Enums.TeamColorOuterClass.getDescriptor();
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
