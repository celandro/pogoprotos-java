// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/NotificationSettings.proto

package POGOProtos.Settings;

public final class NotificationSettingsOuterClass {
  private NotificationSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_NotificationSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_NotificationSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.POGOProtos/Settings/NotificationSettin" +
      "gs.proto\022\023POGOProtos.Settings\"N\n\024Notific" +
      "ationSettings\022\032\n\022pull_notifications\030\001 \001(" +
      "\010\022\032\n\022show_notifications\030\002 \001(\010B\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_NotificationSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_NotificationSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_NotificationSettings_descriptor,
        new java.lang.String[] { "PullNotifications", "ShowNotifications", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}