// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/SocialTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface SocialTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.SocialTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.SocialTelemetryIds social_click_id = 1;</code>
   * @return The enum numeric value on the wire for socialClickId.
   */
  int getSocialClickIdValue();
  /**
   * <code>.POGOProtos.Enums.SocialTelemetryIds social_click_id = 1;</code>
   * @return The socialClickId.
   */
  POGOProtos.Enums.SocialTelemetryIds getSocialClickId();

  /**
   * <code>int32 pages_scrolled_in_friends_list = 2;</code>
   * @return The pagesScrolledInFriendsList.
   */
  int getPagesScrolledInFriendsList();
}
