// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Beluga/BelugaBleTransfer.proto

package POGOProtos.Data.Beluga;

public final class BelugaBleTransfer {
  private BelugaBleTransfer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Beluga_BelugaBleTransferProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Beluga_BelugaBleTransferProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.POGOProtos/Data/Beluga/BelugaBleTransf" +
      "er.proto\022\026POGOProtos.Data.Beluga\0322POGOPr" +
      "otos/Data/Beluga/BelugaBleTransferPrep.p" +
      "roto\"\247\001\n\026BelugaBleTransferProto\022F\n\017serve" +
      "r_response\030\001 \001(\0132-.POGOProtos.Data.Belug" +
      "a.BelugaBleTransferPrep\022\030\n\020server_signat" +
      "ure\030\002 \001(\014\022\031\n\021localized_origins\030\003 \003(\t\022\020\n\010" +
      "language\030\004 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Beluga.BelugaBleTransferPrepOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Beluga_BelugaBleTransferProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Beluga_BelugaBleTransferProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Beluga_BelugaBleTransferProto_descriptor,
        new java.lang.String[] { "ServerResponse", "ServerSignature", "LocalizedOrigins", "Language", });
    POGOProtos.Data.Beluga.BelugaBleTransferPrepOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
