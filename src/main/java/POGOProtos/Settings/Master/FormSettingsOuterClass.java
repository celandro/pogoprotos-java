// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/FormSettings.proto

package POGOProtos.Settings.Master;

public final class FormSettingsOuterClass {
  private FormSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_FormSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_FormSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_FormSettings_Form_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_FormSettings_Form_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-POGOProtos/Settings/Master/FormSetting" +
      "s.proto\022\032POGOProtos.Settings.Master\032\033POG" +
      "OProtos/Enums/Form.proto\032 POGOProtos/Enu" +
      "ms/PokemonId.proto\"\341\001\n\014FormSettings\022,\n\007p" +
      "okemon\030\001 \001(\0162\033.POGOProtos.Enums.PokemonI" +
      "d\022<\n\005forms\030\002 \003(\0132-.POGOProtos.Settings.M" +
      "aster.FormSettings.Form\032e\n\004Form\022$\n\004form\030" +
      "\001 \001(\0162\026.POGOProtos.Enums.Form\022\032\n\022asset_b" +
      "undle_value\030\002 \001(\005\022\033\n\023asset_bundle_suffix" +
      "\030\003 \001(\tB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.FormOuterClass.getDescriptor(),
          POGOProtos.Enums.PokemonIdOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_FormSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_FormSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_FormSettings_descriptor,
        new java.lang.String[] { "Pokemon", "Forms", });
    internal_static_POGOProtos_Settings_Master_FormSettings_Form_descriptor =
      internal_static_POGOProtos_Settings_Master_FormSettings_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Settings_Master_FormSettings_Form_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_FormSettings_Form_descriptor,
        new java.lang.String[] { "Form", "AssetBundleValue", "AssetBundleSuffix", });
    POGOProtos.Enums.FormOuterClass.getDescriptor();
    POGOProtos.Enums.PokemonIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}