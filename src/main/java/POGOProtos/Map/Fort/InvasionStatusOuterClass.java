// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Fort/InvasionStatus.proto

package POGOProtos.Map.Fort;

public final class InvasionStatusOuterClass {
  private InvasionStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Map_Fort_InvasionStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Map_Fort_InvasionStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(POGOProtos/Map/Fort/InvasionStatus.pro" +
      "to\022\023POGOProtos.Map.Fort\"\247\003\n\016InvasionStat" +
      "us\"\224\003\n\006Status\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\t\n" +
      "\005ERROR\020\002\022\030\n\024ERROR_FORT_NOT_FOUND\020\003\022\034\n\030ER" +
      "ROR_INCIDENT_NOT_FOUND\020\004\022 \n\034ERROR_STEP_A" +
      "LREADY_COMPLETED\020\005\022\024\n\020ERROR_WRONG_STEP\020\006" +
      "\022 \n\034ERROR_PLAYER_BELOW_MIN_LEVEL\020\007\022\032\n\026ER" +
      "ROR_INCIDENT_EXPIRED\020\010\022!\n\035ERROR_MISSING_" +
      "INCIDENT_TICKET\020\t\022*\n&ERROR_ENCOUNTER_POK" +
      "EMON_INVENTORY_FULL\020\n\022#\n\037ERROR_PLAYER_BE" +
      "LOW_V2_MIN_LEVEL\020\013\022 \n\034ERROR_INVALID_HEAL" +
      "TH_UPDATES\020\024\022#\n\037ERROR_ATTACKING_POKEMON_" +
      "INVALID\020\036B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Map_Fort_InvasionStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Map_Fort_InvasionStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Map_Fort_InvasionStatus_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}