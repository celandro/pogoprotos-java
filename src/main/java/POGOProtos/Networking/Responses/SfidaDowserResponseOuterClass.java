// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SfidaDowserResponse.proto

package POGOProtos.Networking.Responses;

public final class SfidaDowserResponseOuterClass {
  private SfidaDowserResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_SfidaDowserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_SfidaDowserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9POGOProtos/Networking/Responses/SfidaD" +
      "owserResponse.proto\022\037POGOProtos.Networki" +
      "ng.Responses\"\361\001\n\023SfidaDowserResponse\022K\n\006" +
      "result\030\001 \001(\0162;.POGOProtos.Networking.Res" +
      "ponses.SfidaDowserResponse.Result\022\021\n\tpro" +
      "ximity\030\002 \001(\005\022\025\n\rspawnpoint_id\030\003 \001(\t\"c\n\006R" +
      "esult\022\t\n\005UNSET\020\000\022\t\n\005FOUND\020\001\022\n\n\006NEARBY\020\002\022" +
      "\020\n\014OUT_OF_RANGE\020\003\022\022\n\016ALREADY_CAUGHT\020\004\022\021\n" +
      "\rNOT_AVAILABLE\020\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_SfidaDowserResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_SfidaDowserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_SfidaDowserResponse_descriptor,
        new java.lang.String[] { "Result", "Proximity", "SpawnpointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
