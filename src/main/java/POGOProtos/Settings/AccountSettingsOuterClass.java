// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/AccountSettings.proto

package POGOProtos.Settings;

public final class AccountSettingsOuterClass {
  private AccountSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_AccountSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_AccountSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)POGOProtos/Settings/AccountSettings.pr" +
      "oto\022\023POGOProtos.Settings\032(POGOProtos/Set" +
      "tings/SocialSettings.proto\"\252\002\n\017AccountSe" +
      "ttings\022#\n\033opt_out_social_graph_import\030\001 " +
      "\001(\010\022P\n\025online_status_consent\030\002 \001(\01621.POG" +
      "OProtos.Settings.SocialSettings.ConsentS" +
      "tatus\022S\n\030last_played_date_consent\030\003 \001(\0162" +
      "1.POGOProtos.Settings.SocialSettings.Con" +
      "sentStatus\022K\n\020codename_consent\030\004 \001(\01621.P" +
      "OGOProtos.Settings.SocialSettings.Consen" +
      "tStatusB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.SocialSettingsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_AccountSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_AccountSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_AccountSettings_descriptor,
        new java.lang.String[] { "OptOutSocialGraphImport", "OnlineStatusConsent", "LastPlayedDateConsent", "CodenameConsent", });
    POGOProtos.Settings.SocialSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
