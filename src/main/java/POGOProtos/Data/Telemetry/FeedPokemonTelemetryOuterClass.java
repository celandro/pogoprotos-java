// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/FeedPokemonTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class FeedPokemonTelemetryOuterClass {
  private FeedPokemonTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_FeedPokemonTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_FeedPokemonTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4POGOProtos/Data/Telemetry/FeedPokemonT" +
      "elemetry.proto\022\031POGOProtos.Data.Telemetr" +
      "y\0320POGOProtos/Data/Telemetry/PokemonTele" +
      "metry.proto\"\276\001\n\024FeedPokemonTelemetry\022\016\n\006" +
      "status\030\001 \001(\005\022<\n\007pokemon\030\002 \001(\0132+.POGOProt" +
      "os.Data.Telemetry.PokemonTelemetry\022\016\n\006gy" +
      "m_id\030\003 \001(\t\022\014\n\004team\030\004 \001(\005\022\026\n\016defender_cou" +
      "nt\030\005 \001(\005\022\022\n\nmotivation\030\006 \001(\005\022\016\n\006cp_now\030\007" +
      " \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Telemetry.PokemonTelemetryOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_FeedPokemonTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_FeedPokemonTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_FeedPokemonTelemetry_descriptor,
        new java.lang.String[] { "Status", "Pokemon", "GymId", "Team", "DefenderCount", "Motivation", "CpNow", });
    POGOProtos.Data.Telemetry.PokemonTelemetryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
