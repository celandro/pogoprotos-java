// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Pokemon/StatsAttributes.proto

package POGOProtos.Settings.Master.Pokemon;

public final class StatsAttributesOuterClass {
  private StatsAttributesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_Pokemon_StatsAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_Pokemon_StatsAttributes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8POGOProtos/Settings/Master/Pokemon/Sta" +
      "tsAttributes.proto\022\"POGOProtos.Settings." +
      "Master.Pokemon\"n\n\017StatsAttributes\022\024\n\014bas" +
      "e_stamina\030\001 \001(\005\022\023\n\013base_attack\030\002 \001(\005\022\024\n\014" +
      "base_defense\030\003 \001(\005\022\032\n\022dodge_energy_delta" +
      "\030\010 \001(\005B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_Pokemon_StatsAttributes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_Pokemon_StatsAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_Pokemon_StatsAttributes_descriptor,
        new java.lang.String[] { "BaseStamina", "BaseAttack", "BaseDefense", "DodgeEnergyDelta", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}