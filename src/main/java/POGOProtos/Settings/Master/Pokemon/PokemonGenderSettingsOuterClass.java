// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Pokemon/PokemonGenderSettings.proto

package POGOProtos.Settings.Master.Pokemon;

public final class PokemonGenderSettingsOuterClass {
  private PokemonGenderSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_Pokemon_PokemonGenderSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_Pokemon_PokemonGenderSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>POGOProtos/Settings/Master/Pokemon/Pok" +
      "emonGenderSettings.proto\022\"POGOProtos.Set" +
      "tings.Master.Pokemon\"a\n\025PokemonGenderSet" +
      "tings\022\024\n\014male_percent\030\001 \001(\002\022\026\n\016female_pe" +
      "rcent\030\002 \001(\002\022\032\n\022genderless_percent\030\003 \001(\002B" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_Pokemon_PokemonGenderSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_Pokemon_PokemonGenderSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_Pokemon_PokemonGenderSettings_descriptor,
        new java.lang.String[] { "MalePercent", "FemalePercent", "GenderlessPercent", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
