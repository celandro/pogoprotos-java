// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/UnClassed/GetClientFeatureFlagsResponse.proto

package POGOProtos.Data.UnClassed;

public final class GetClientFeatureFlagsResponseOuterClass {
  private GetClientFeatureFlagsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_CrossGameSocialClientSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_CrossGameSocialClientSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=POGOProtos/Data/UnClassed/GetClientFea" +
      "tureFlagsResponse.proto\022\031POGOProtos.Data" +
      ".UnClassed\0324POGOProtos/Settings/SocialCl" +
      "ientGlobalSettings.proto\"\316\006\n\035GetClientFe" +
      "atureFlagsResponse\022d\n\rfeature_flags\030\001 \001(" +
      "\0132M.POGOProtos.Data.UnClassed.GetClientF" +
      "eatureFlagsResponse.SocialClientFeatures" +
      "\022H\n\017global_settings\030\002 \001(\0132/.POGOProtos.S" +
      "ettings.SocialClientGlobalSettings\032\374\004\n\024S" +
      "ocialClientFeatures\022\217\001\n\032cross_game_socia" +
      "l_settings\030\001 \001(\0132k.POGOProtos.Data.UnCla" +
      "ssed.GetClientFeatureFlagsResponse.Socia" +
      "lClientFeatures.CrossGameSocialClientSet" +
      "tings\032\321\003\n\035CrossGameSocialClientSettings\022" +
      "\222\001\n\021disabled_features\030\001 \003(\0162w.POGOProtos" +
      ".Data.UnClassed.GetClientFeatureFlagsRes" +
      "ponse.SocialClientFeatures.CrossGameSoci" +
      "alClientSettings.FeatureType\022\211\001\n\010app_lin" +
      "k\030\002 \001(\0162w.POGOProtos.Data.UnClassed.GetC" +
      "lientFeatureFlagsResponse.SocialClientFe" +
      "atures.CrossGameSocialClientSettings.App" +
      "LinkType\"<\n\013AppLinkType\022\013\n\007NO_LINK\020\000\022\014\n\010" +
      "WEB_LINK\020\001\022\022\n\016APP_STORE_LINK\020\002\"Q\n\013Featur" +
      "eType\022\t\n\005UNSET\020\000\022\023\n\017NIANTIC_PROFILE\020\001\022\021\n" +
      "\rONLINE_STATUS\020\002\022\017\n\013FRIEND_LIST\020\003B\002P\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.SocialClientGlobalSettingsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_descriptor,
        new java.lang.String[] { "FeatureFlags", "GlobalSettings", });
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_descriptor =
      internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_descriptor,
        new java.lang.String[] { "CrossGameSocialSettings", });
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_CrossGameSocialClientSettings_descriptor =
      internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_CrossGameSocialClientSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_UnClassed_GetClientFeatureFlagsResponse_SocialClientFeatures_CrossGameSocialClientSettings_descriptor,
        new java.lang.String[] { "DisabledFeatures", "AppLink", });
    POGOProtos.Settings.SocialClientGlobalSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
