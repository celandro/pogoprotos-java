// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/CombatMinigameTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class CombatMinigameTelemetryOuterClass {
  private CombatMinigameTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_CombatMinigameTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_CombatMinigameTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Data/Telemetry/CombatMiniga" +
      "meTelemetry.proto\022\031POGOProtos.Data.Telem" +
      "etry\032\"POGOProtos/Enums/PokemonType.proto" +
      "\"\351\001\n\027CombatMinigameTelemetry\022Z\n\013combat_t" +
      "ype\030\001 \001(\0162E.POGOProtos.Data.Telemetry.Co" +
      "mbatMinigameTelemetry.MinigameCombatType" +
      "\0220\n\tmove_type\030\002 \001(\0162\035.POGOProtos.Enums.P" +
      "okemonType\022\r\n\005score\030\003 \001(\002\"1\n\022MinigameCom" +
      "batType\022\t\n\005UNSET\020\000\022\007\n\003PVP\020\001\022\007\n\003PVE\020\002B\002P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.PokemonTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_CombatMinigameTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_CombatMinigameTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_CombatMinigameTelemetry_descriptor,
        new java.lang.String[] { "CombatType", "MoveType", "Score", });
    POGOProtos.Enums.PokemonTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
