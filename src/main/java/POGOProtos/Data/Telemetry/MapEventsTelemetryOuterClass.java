// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/MapEventsTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class MapEventsTelemetryOuterClass {
  private MapEventsTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_MapEventsTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_MapEventsTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2POGOProtos/Data/Telemetry/MapEventsTel" +
      "emetry.proto\022\031POGOProtos.Data.Telemetry\032" +
      "#POGOProtos/Enums/TelemetryIds.proto\"\261\001\n" +
      "\022MapEventsTelemetry\022C\n\022map_event_click_i" +
      "d\030\001 \001(\0162\'.POGOProtos.Enums.MapEventsTele" +
      "metryIds\022\017\n\007fort_id\030\002 \001(\t\022\033\n\023guard_pokem" +
      "on_level\030\003 \003(\005\022\014\n\004team\030\004 \001(\005\022\032\n\022is_playe" +
      "r_in_range\030\005 \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.TelemetryIds.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_MapEventsTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_MapEventsTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_MapEventsTelemetry_descriptor,
        new java.lang.String[] { "MapEventClickId", "FortId", "GuardPokemonLevel", "Team", "IsPlayerInRange", });
    POGOProtos.Enums.TelemetryIds.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
