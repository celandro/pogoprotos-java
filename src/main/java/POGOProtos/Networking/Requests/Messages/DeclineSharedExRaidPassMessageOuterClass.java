// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/DeclineSharedExRaidPassMessage.proto

package POGOProtos.Networking.Requests.Messages;

public final class DeclineSharedExRaidPassMessageOuterClass {
  private DeclineSharedExRaidPassMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Requests_Messages_DeclineSharedExRaidPassMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Requests_Messages_DeclineSharedExRaidPassMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLPOGOProtos/Networking/Requests/Message" +
      "s/DeclineSharedExRaidPassMessage.proto\022\'" +
      "POGOProtos.Networking.Requests.Messages\"" +
      "D\n\036DeclineSharedExRaidPassMessage\022\017\n\007for" +
      "t_id\030\001 \001(\t\022\021\n\traid_seed\030\002 \001(\003B\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Requests_Messages_DeclineSharedExRaidPassMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Requests_Messages_DeclineSharedExRaidPassMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Requests_Messages_DeclineSharedExRaidPassMessage_descriptor,
        new java.lang.String[] { "FortId", "RaidSeed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
