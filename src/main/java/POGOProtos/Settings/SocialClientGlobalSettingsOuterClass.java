// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/SocialClientGlobalSettings.proto

package POGOProtos.Settings;

public final class SocialClientGlobalSettingsOuterClass {
  private SocialClientGlobalSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_SocialClientGlobalSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_SocialClientGlobalSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_SocialClientGlobalSettings_CrossGameSocialSettingsProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_SocialClientGlobalSettings_CrossGameSocialSettingsProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4POGOProtos/Settings/SocialClientGlobal" +
      "Settings.proto\022\023POGOProtos.Settings\"\340\001\n\032" +
      "SocialClientGlobalSettings\022p\n\032cross_game" +
      "_social_settings\030\001 \001(\0132L.POGOProtos.Sett" +
      "ings.SocialClientGlobalSettings.CrossGam" +
      "eSocialSettingsProto\032P\n\034CrossGameSocialS" +
      "ettingsProto\0220\n(niantic_profile_codename" +
      "_opt_out_enabled\030\001 \001(\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_SocialClientGlobalSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_SocialClientGlobalSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_SocialClientGlobalSettings_descriptor,
        new java.lang.String[] { "CrossGameSocialSettings", });
    internal_static_POGOProtos_Settings_SocialClientGlobalSettings_CrossGameSocialSettingsProto_descriptor =
      internal_static_POGOProtos_Settings_SocialClientGlobalSettings_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Settings_SocialClientGlobalSettings_CrossGameSocialSettingsProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_SocialClientGlobalSettings_CrossGameSocialSettingsProto_descriptor,
        new java.lang.String[] { "NianticProfileCodenameOptOutEnabled", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
