// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/SocialClientSettings.proto

package POGOProtos.Settings;

public final class SocialClientSettingsOuterClass {
  private SocialClientSettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_SocialClientSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_SocialClientSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Settings_SocialGiftCountTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Settings_SocialGiftCountTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.POGOProtos/Settings/SocialClientSettin" +
      "gs.proto\022\023POGOProtos.Settings\0327POGOProto" +
      "s/Settings/CrossGameSocialGlobalSettings" +
      ".proto\"\370\003\n\024SocialClientSettings\022\025\n\renabl" +
      "e_social\030\001 \001(\010\022\032\n\022max_friend_details\030\002 \001" +
      "(\005\022\031\n\021player_level_gate\030\003 \001(\005\022\"\n\032max_fri" +
      "end_nickname_length\030\004 \001(\005\022%\n\035enable_add_" +
      "friend_via_qr_code\030\005 \001(\010\022\034\n\024enable_share" +
      "_ex_pass\030\006 \001(\010\022\037\n\027enable_facebook_friend" +
      "s\030\007 \001(\010\022)\n!facebook_friend_limit_per_req" +
      "uest\030\010 \001(\005\022/\n\'disable_facebook_friends_o" +
      "pening_prompt\030\t \001(\010\022\035\n\025enable_giftabilit" +
      "y_v2\030\013 \001(\010\022\035\n\025enable_remote_gifting\030\014 \001(" +
      "\010\022\026\n\016enable_sticker\030\r \001(\010\022V\n\032cross_game_" +
      "social_settings\030\016 \001(\01322.POGOProtos.Setti" +
      "ngs.CrossGameSocialGlobalSettings\"R\n\030Soc" +
      "ialGiftCountTelemetry\022\033\n\023unopened_gift_c" +
      "ount\030\001 \001(\005\022\031\n\021unsent_gift_count\030\002 \001(\005B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Settings.CrossGameSocialGlobalSettingsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Settings_SocialClientSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Settings_SocialClientSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_SocialClientSettings_descriptor,
        new java.lang.String[] { "EnableSocial", "MaxFriendDetails", "PlayerLevelGate", "MaxFriendNicknameLength", "EnableAddFriendViaQrCode", "EnableShareExPass", "EnableFacebookFriends", "FacebookFriendLimitPerRequest", "DisableFacebookFriendsOpeningPrompt", "EnableGiftabilityV2", "EnableRemoteGifting", "EnableSticker", "CrossGameSocialSettings", });
    internal_static_POGOProtos_Settings_SocialGiftCountTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_POGOProtos_Settings_SocialGiftCountTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Settings_SocialGiftCountTelemetry_descriptor,
        new java.lang.String[] { "UnopenedGiftCount", "UnsentGiftCount", });
    POGOProtos.Settings.CrossGameSocialGlobalSettingsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}