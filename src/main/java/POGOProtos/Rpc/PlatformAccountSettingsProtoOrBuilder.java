// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformAccountSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformAccountSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool opt_out_social_graph_import = 1;</code>
   * @return The optOutSocialGraphImport.
   */
  boolean getOptOutSocialGraphImport();

  /**
   * <code>.POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus online_status_consent = 2;</code>
   * @return The enum numeric value on the wire for onlineStatusConsent.
   */
  int getOnlineStatusConsentValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus online_status_consent = 2;</code>
   * @return The onlineStatusConsent.
   */
  POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus getOnlineStatusConsent();

  /**
   * <code>.POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus last_played_date_consent = 3;</code>
   * @return The enum numeric value on the wire for lastPlayedDateConsent.
   */
  int getLastPlayedDateConsentValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus last_played_date_consent = 3;</code>
   * @return The lastPlayedDateConsent.
   */
  POGOProtos.Rpc.PlatformSocialSettings.ConsentStatus getLastPlayedDateConsent();
}