// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Fort/IncidentLookup.proto

package POGOProtos.Map.Fort;

public final class IncidentLookupOuterClass {
  private IncidentLookupOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Map_Fort_IncidentLookup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Map_Fort_IncidentLookup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(POGOProtos/Map/Fort/IncidentLookup.pro" +
      "to\022\023POGOProtos.Map.Fort\032\"POGOProtos/Enum" +
      "s/EnumWrapper.proto\"\232\001\n\016IncidentLookup\022\023" +
      "\n\013incident_id\030\001 \001(\t\022\017\n\007fort_id\030\002 \001(\t\022\020\n\010" +
      "fort_lat\030\003 \001(\001\022\020\n\010fort_lng\030\004 \001(\001\022>\n\007cont" +
      "ext\030\005 \001(\0162-.POGOProtos.Enums.EnumWrapper" +
      ".InvasionContextB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.EnumWrapperOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Map_Fort_IncidentLookup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Map_Fort_IncidentLookup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Map_Fort_IncidentLookup_descriptor,
        new java.lang.String[] { "IncidentId", "FortId", "FortLat", "FortLng", "Context", });
    POGOProtos.Enums.EnumWrapperOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
