// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SfidaActionLogResponse.proto

package POGOProtos.Networking.Responses;

public final class SfidaActionLogResponseOuterClass {
  private SfidaActionLogResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_SfidaActionLogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_SfidaActionLogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<POGOProtos/Networking/Responses/SfidaA" +
      "ctionLogResponse.proto\022\037POGOProtos.Netwo" +
      "rking.Responses\032)POGOProtos/Data/Logs/Ac" +
      "tionLogEntry.proto\"\305\001\n\026SfidaActionLogRes" +
      "ponse\022N\n\006result\030\001 \001(\0162>.POGOProtos.Netwo" +
      "rking.Responses.SfidaActionLogResponse.R" +
      "esult\0229\n\013log_entries\030\002 \003(\0132$.POGOProtos." +
      "Data.Logs.ActionLogEntry\" \n\006Result\022\t\n\005UN" +
      "SET\020\000\022\013\n\007SUCCESS\020\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Logs.ActionLogEntryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_SfidaActionLogResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_SfidaActionLogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_SfidaActionLogResponse_descriptor,
        new java.lang.String[] { "Result", "LogEntries", });
    POGOProtos.Data.Logs.ActionLogEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
