// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/CombatBaseStats.proto

package POGOProtos.Data.Combat;

public final class CombatBaseStatsOuterClass {
  private CombatBaseStatsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_CombatBaseStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_CombatBaseStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,POGOProtos/Data/Combat/CombatBaseStats" +
      ".proto\022\026POGOProtos.Data.Combat\"F\n\017Combat" +
      "BaseStats\022\025\n\rtotal_battles\030\001 \001(\005\022\014\n\004wins" +
      "\030\002 \001(\005\022\016\n\006rating\030\003 \001(\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Combat_CombatBaseStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Combat_CombatBaseStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_CombatBaseStats_descriptor,
        new java.lang.String[] { "TotalBattles", "Wins", "Rating", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
