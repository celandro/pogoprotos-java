// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Analytics/ClientTelemetryRecord.proto

package POGOProtos.Data.Analytics;

public final class ClientTelemetryRecordOuterClass {
  private ClientTelemetryRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5POGOProtos/Data/Analytics/ClientTeleme" +
      "tryRecord.proto\022\031POGOProtos.Data.Analyti" +
      "cs\032;POGOProtos/Data/Analytics/ClientTele" +
      "metryCommonFilter.proto\"\303\001\n\025ClientTeleme" +
      "tryRecord\022\021\n\trecord_id\030\001 \001(\t\022\027\n\017encoded_" +
      "message\030\002 \001(\014\022\033\n\023client_timestamp_ms\030\003 \001" +
      "(\003\022\021\n\tmetric_id\030\004 \001(\003\022N\n\016common_filters\030" +
      "\005 \001(\01326.POGOProtos.Data.Analytics.Client" +
      "TelemetryCommonFilterB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_descriptor,
        new java.lang.String[] { "RecordId", "EncodedMessage", "ClientTimestampMs", "MetricId", "CommonFilters", });
    POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
