// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Fort/FortSummary.proto

package POGOProtos.Map.Fort;

public final class FortSummaryOuterClass {
  private FortSummaryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Map_Fort_FortSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Map_Fort_FortSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%POGOProtos/Map/Fort/FortSummary.proto\022" +
      "\023POGOProtos.Map.Fort\"o\n\013FortSummary\022\027\n\017f" +
      "ort_summary_id\030\001 \001(\t\022\"\n\032last_modified_ti" +
      "mestamp_ms\030\002 \001(\003\022\020\n\010latitude\030\003 \001(\001\022\021\n\tlo" +
      "ngitude\030\004 \001(\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Map_Fort_FortSummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Map_Fort_FortSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Map_Fort_FortSummary_descriptor,
        new java.lang.String[] { "FortSummaryId", "LastModifiedTimestampMs", "Latitude", "Longitude", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}