// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/EventBadgeSettings.proto

package POGOProtos.Settings.Master;

public final class EventBadgeSettingsOuterClass {
  private EventBadgeSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_Master_EventBadgeSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_Master_EventBadgeSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3POGOProtos/Settings/Master/EventBadgeS" +
      "ettings.proto\022\032POGOProtos.Settings.Maste" +
      "r\032 POGOProtos/Enums/BadgeType.proto\"\243\001\n\022" +
      "EventBadgeSettings\022\025\n\rvalid_from_ms\030\001 \001(" +
      "\003\022\023\n\013valid_to_ms\030\002 \001(\003\022>\n\031mutually_exclu" +
      "sive_badges\030\003 \003(\0162\033.POGOProtos.Enums.Bad" +
      "geType\022!\n\031automatically_award_badge\030\004 \001(" +
      "\010B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.BadgeTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_Master_EventBadgeSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_Master_EventBadgeSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_Master_EventBadgeSettings_descriptor,
        new java.lang.String[] { "ValidFromMs", "ValidToMs", "MutuallyExclusiveBadges", "AutomaticallyAwardBadge", });
    POGOProtos.Enums.BadgeTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
