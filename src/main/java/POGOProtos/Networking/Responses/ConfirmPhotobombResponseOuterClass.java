// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/ConfirmPhotobombResponse.proto

package POGOProtos.Networking.Responses;

public final class ConfirmPhotobombResponseOuterClass {
  private ConfirmPhotobombResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_ConfirmPhotobombResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_ConfirmPhotobombResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>POGOProtos/Networking/Responses/Confir" +
      "mPhotobombResponse.proto\022\037POGOProtos.Net" +
      "working.Responses\"\347\001\n\030ConfirmPhotobombRe" +
      "sponse\022P\n\006status\030\001 \001(\0162@.POGOProtos.Netw" +
      "orking.Responses.ConfirmPhotobombRespons" +
      "e.Status\"y\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS" +
      "\020\001\022\035\n\031ERROR_PHOTOBOMB_NOT_FOUND\020\002\022%\n!ERR" +
      "OR_PHOTOBOMB_ALREADY_CONFIRMED\020\003\022\021\n\rERRO" +
      "R_UNKNOWN\020\004B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_ConfirmPhotobombResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_ConfirmPhotobombResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_ConfirmPhotobombResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}