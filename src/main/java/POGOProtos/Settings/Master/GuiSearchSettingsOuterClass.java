// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/GuiSearchSettings.proto

package POGOProtos.Settings.Master;

public final class GuiSearchSettingsOuterClass {
  private GuiSearchSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_GuiSearchSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_GuiSearchSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2POGOProtos/Settings/Master/GuiSearchSe" +
      "ttings.proto\022\032POGOProtos.Settings.Master" +
      "\0322POGOProtos/Settings/Master/Recommended" +
      "Search.proto\"\336\001\n\021GuiSearchSettings\022\032\n\022gu" +
      "i_search_enabled\030\001 \001(\010\022I\n\022recommended_se" +
      "arch\030\002 \003(\0132-.POGOProtos.Settings.Master." +
      "RecommendedSearch\022\"\n\032max_number_recent_s" +
      "earches\030\003 \001(\005\022$\n\034max_number_favorite_sea" +
      "rches\030\004 \001(\005\022\030\n\020max_query_length\030\005 \001(\005B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.Master.RecommendedSearchOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_GuiSearchSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_GuiSearchSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_GuiSearchSettings_descriptor,
        new java.lang.String[] { "GuiSearchEnabled", "RecommendedSearch", "MaxNumberRecentSearches", "MaxNumberFavoriteSearches", "MaxQueryLength", });
    POGOProtos.Settings.Master.RecommendedSearchOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
