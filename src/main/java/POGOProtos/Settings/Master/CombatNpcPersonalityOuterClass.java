// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/CombatNpcPersonality.proto

package POGOProtos.Settings.Master;

public final class CombatNpcPersonalityOuterClass {
  private CombatNpcPersonalityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_CombatNpcPersonality_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_CombatNpcPersonality_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5POGOProtos/Settings/Master/CombatNpcPe" +
      "rsonality.proto\022\032POGOProtos.Settings.Mas" +
      "ter\"\354\001\n\024CombatNpcPersonality\022\030\n\020personal" +
      "ity_name\030\001 \001(\t\022\036\n\026super_effective_chance" +
      "\030\002 \001(\002\022\026\n\016special_chance\030\003 \001(\002\022\037\n\027defens" +
      "ive_minimum_score\030\004 \001(\002\022\037\n\027defensive_max" +
      "imum_score\030\005 \001(\002\022\037\n\027offensive_minimum_sc" +
      "ore\030\006 \001(\002\022\037\n\027offensive_maximum_score\030\007 \001" +
      "(\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_CombatNpcPersonality_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_CombatNpcPersonality_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_CombatNpcPersonality_descriptor,
        new java.lang.String[] { "PersonalityName", "SuperEffectiveChance", "SpecialChance", "DefensiveMinimumScore", "DefensiveMaximumScore", "OffensiveMinimumScore", "OffensiveMaximumScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
