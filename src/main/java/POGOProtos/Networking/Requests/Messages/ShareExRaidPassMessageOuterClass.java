// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ShareExRaidPassMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class ShareExRaidPassMessageOuterClass {
  private ShareExRaidPassMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_ShareExRaidPassMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_ShareExRaidPassMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDPOGOProtos/Networking/Requests/Message" +
      "s/ShareExRaidPassMessage.proto\022\'POGOProt" +
      "os.Networking.Requests.Messages\"O\n\026Share" +
      "ExRaidPassMessage\022\021\n\tfriend_id\030\001 \001(\t\022\017\n\007" +
      "fort_id\030\002 \001(\t\022\021\n\traid_seed\030\003 \001(\003B\002P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_ShareExRaidPassMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_ShareExRaidPassMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_ShareExRaidPassMessage_descriptor,
        new java.lang.String[] { "FriendId", "FortId", "RaidSeed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}