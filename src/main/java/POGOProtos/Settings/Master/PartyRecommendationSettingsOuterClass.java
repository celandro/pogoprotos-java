// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/PartyRecommendationSettings.proto

package POGOProtos.Settings.Master;

public final class PartyRecommendationSettingsOuterClass {
  private PartyRecommendationSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_PartyRecommendationSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_PartyRecommendationSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<POGOProtos/Settings/Master/PartyRecomm" +
      "endationSettings.proto\022\032POGOProtos.Setti" +
      "ngs.Master\"\322\002\n\033PartyRecommendationSettin" +
      "gs\022\\\n\004mode\030\001 \001(\0162N.POGOProtos.Settings.M" +
      "aster.PartyRecommendationSettings.PartyR" +
      "commendationMode\022\020\n\010variance\030\002 \001(\002\022\031\n\021th" +
      "ird_move_weight\030\003 \001(\002\"\247\001\n\026PartyRcommenda" +
      "tionMode\022\t\n\005UNSET\020\000\022\037\n\033PARTY_RECOMMENDAT" +
      "ION_MODE_1\020\001\022\037\n\033PARTY_RECOMMENDATION_MOD" +
      "E_2\020\002\022\037\n\033PARTY_RECOMMENDATION_MODE_3\020\003\022\037" +
      "\n\033PARTY_RECOMMENDATION_MODE_4\020\004B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_Master_PartyRecommendationSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_PartyRecommendationSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_PartyRecommendationSettings_descriptor,
        new java.lang.String[] { "Mode", "Variance", "ThirdMoveWeight", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
