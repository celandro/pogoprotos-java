// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/ArdkConfigSettings.proto

package POGOProtos.Settings;

public final class ArdkConfigSettingsOuterClass {
  private ArdkConfigSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_ArdkConfigSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_ArdkConfigSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,POGOProtos/Settings/ArdkConfigSettings" +
      ".proto\022\023POGOProtos.Settings\"\342\002\n\022ArdkConf" +
      "igSettings\022\025\n\rorb_vocab_url\030\001 \001(\t\022\033\n\023mon" +
      "odpeth_model_url\030\002 \001(\t\022\031\n\021monodepth_devi" +
      "ces\030\003 \003(\t\022M\n\022monodepth_contexts\030\004 \003(\01621." +
      "POGOProtos.Settings.ArdkConfigSettings.A" +
      "rContext\022\037\n\027ios_monodepth_model_url\030\005 \001(" +
      "\t\022#\n\033android_monodepth_model_url\030\006 \001(\t\"h" +
      "\n\tArContext\022\t\n\005UNSET\020\000\022\020\n\014AR_ENCOUNTER\020\001" +
      "\022\017\n\013AR_SNAPSHOT\020\002\022\026\n\022SINGLEPLAYER_BUDDY\020" +
      "\003\022\025\n\021MULTIPLAYER_BUDDY\020\004B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Settings_ArdkConfigSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_ArdkConfigSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_ArdkConfigSettings_descriptor,
        new java.lang.String[] { "OrbVocabUrl", "MonodpethModelUrl", "MonodepthDevices", "MonodepthContexts", "IosMonodepthModelUrl", "AndroidMonodepthModelUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
