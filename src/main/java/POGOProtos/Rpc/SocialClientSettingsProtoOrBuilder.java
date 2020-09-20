// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SocialClientSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SocialClientSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_social = 1;</code>
   * @return The enableSocial.
   */
  boolean getEnableSocial();

  /**
   * <code>int32 max_friend_details = 2;</code>
   * @return The maxFriendDetails.
   */
  int getMaxFriendDetails();

  /**
   * <code>int32 player_level_gate = 3;</code>
   * @return The playerLevelGate.
   */
  int getPlayerLevelGate();

  /**
   * <code>int32 max_friend_nickname_length = 4;</code>
   * @return The maxFriendNicknameLength.
   */
  int getMaxFriendNicknameLength();

  /**
   * <code>bool enable_add_friend_via_qr_code = 5;</code>
   * @return The enableAddFriendViaQrCode.
   */
  boolean getEnableAddFriendViaQrCode();

  /**
   * <code>bool enable_share_ex_pass = 6;</code>
   * @return The enableShareExPass.
   */
  boolean getEnableShareExPass();

  /**
   * <code>bool enable_facebook_friends = 7;</code>
   * @return The enableFacebookFriends.
   */
  boolean getEnableFacebookFriends();

  /**
   * <code>int32 facebook_friend_limit_per_request = 8;</code>
   * @return The facebookFriendLimitPerRequest.
   */
  int getFacebookFriendLimitPerRequest();

  /**
   * <code>bool disable_facebook_friends_opening_prompt = 9;</code>
   * @return The disableFacebookFriendsOpeningPrompt.
   */
  boolean getDisableFacebookFriendsOpeningPrompt();

  /**
   * <code>bool enable_giftability_v2 = 11;</code>
   * @return The enableGiftabilityV2.
   */
  boolean getEnableGiftabilityV2();

  /**
   * <code>bool enable_remote_gifting = 12;</code>
   * @return The enableRemoteGifting.
   */
  boolean getEnableRemoteGifting();

  /**
   * <code>bool enable_sticker = 13;</code>
   * @return The enableSticker.
   */
  boolean getEnableSticker();

  /**
   * <code>.POGOProtos.Rpc.CrossGameSocialGlobalSettingsProto cross_game_social_settings = 14;</code>
   * @return Whether the crossGameSocialSettings field is set.
   */
  boolean hasCrossGameSocialSettings();
  /**
   * <code>.POGOProtos.Rpc.CrossGameSocialGlobalSettingsProto cross_game_social_settings = 14;</code>
   * @return The crossGameSocialSettings.
   */
  POGOProtos.Rpc.CrossGameSocialGlobalSettingsProto getCrossGameSocialSettings();
  /**
   * <code>.POGOProtos.Rpc.CrossGameSocialGlobalSettingsProto cross_game_social_settings = 14;</code>
   */
  POGOProtos.Rpc.CrossGameSocialGlobalSettingsProtoOrBuilder getCrossGameSocialSettingsOrBuilder();
}
