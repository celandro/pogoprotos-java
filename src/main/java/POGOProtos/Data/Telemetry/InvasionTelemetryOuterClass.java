// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/InvasionTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class InvasionTelemetryOuterClass {
  private InvasionTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_InvasionTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_InvasionTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1POGOProtos/Data/Telemetry/InvasionTele" +
      "metry.proto\022\031POGOProtos.Data.Telemetry\032\"" +
      "POGOProtos/Enums/EnumWrapper.proto\032#POGO" +
      "Protos/Enums/TelemetryIds.proto\"\251\003\n\021Inva" +
      "sionTelemetry\022E\n\025invasion_telemetry_id\030\001" +
      " \001(\0162&.POGOProtos.Enums.InvasionTelemetr" +
      "yIds\022?\n\006npc_id\030\002 \001(\0162/.POGOProtos.Enums." +
      "EnumWrapper.InvasionCharacter\022\026\n\016battle_" +
      "success\030\003 \001(\010\022&\n\036post_battle_friendly_re" +
      "maining\030\004 \001(\005\022#\n\033post_battle_enemy_remai" +
      "ning\030\005 \001(\005\022\031\n\021encounter_pokemon\030\006 \001(\005\022\031\n" +
      "\021encounter_success\030\007 \001(\010\022\023\n\013invasion_id\030" +
      "\010 \001(\t\022\031\n\021player_tapped_npc\030\t \001(\010\022\r\n\005rada" +
      "r\030\n \001(\t\022\016\n\006curfew\030\013 \001(\010\022\020\n\010duration\030\014 \001(" +
      "\002\022\020\n\010distance\030\r \001(\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.EnumWrapperOuterClass.getDescriptor(),
          POGOProtos.Enums.TelemetryIds.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_InvasionTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_InvasionTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_InvasionTelemetry_descriptor,
        new java.lang.String[] { "InvasionTelemetryId", "NpcId", "BattleSuccess", "PostBattleFriendlyRemaining", "PostBattleEnemyRemaining", "EncounterPokemon", "EncounterSuccess", "InvasionId", "PlayerTappedNpc", "Radar", "Curfew", "Duration", "Distance", });
    POGOProtos.Enums.EnumWrapperOuterClass.getDescriptor();
    POGOProtos.Enums.TelemetryIds.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
