// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/PokemonUpgradeSettings.proto

package POGOProtos.Settings.Master;

public final class PokemonUpgradeSettingsOuterClass {
  private PokemonUpgradeSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_PokemonUpgradeSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_PokemonUpgradeSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7POGOProtos/Settings/Master/PokemonUpgr" +
      "adeSettings.proto\022\032POGOProtos.Settings.M" +
      "aster\"\337\002\n\026PokemonUpgradeSettings\022\032\n\022upgr" +
      "ades_per_level\030\001 \001(\005\022#\n\033allowed_levels_a" +
      "bove_player\030\002 \001(\005\022\022\n\ncandy_cost\030\003 \003(\005\022\025\n" +
      "\rstardust_cost\030\004 \003(\005\022\"\n\032shadow_stardust_" +
      "multiplier\030\005 \001(\002\022\037\n\027shadow_candy_multipl" +
      "ier\030\006 \001(\002\022$\n\034purified_stardust_multiplie" +
      "r\030\007 \001(\002\022!\n\031purified_candy_multiplier\030\010 \001" +
      "(\002\022 \n\030max_normal_upgrade_level\030\t \001(\005\022)\n!" +
      "default_cp_boost_additional_level\030\n \001(\005B" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_PokemonUpgradeSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_PokemonUpgradeSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_PokemonUpgradeSettings_descriptor,
        new java.lang.String[] { "UpgradesPerLevel", "AllowedLevelsAbovePlayer", "CandyCost", "StardustCost", "ShadowStardustMultiplier", "ShadowCandyMultiplier", "PurifiedStardustMultiplier", "PurifiedCandyMultiplier", "MaxNormalUpgradeLevel", "DefaultCpBoostAdditionalLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
