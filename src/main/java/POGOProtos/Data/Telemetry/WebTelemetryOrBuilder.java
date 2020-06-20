// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/WebTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface WebTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.WebTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.WebTelemetryIds web_click_ids = 1;</code>
   * @return The enum numeric value on the wire for webClickIds.
   */
  int getWebClickIdsValue();
  /**
   * <code>.POGOProtos.Enums.WebTelemetryIds web_click_ids = 1;</code>
   * @return The webClickIds.
   */
  POGOProtos.Enums.WebTelemetryIds getWebClickIds();

  /**
   * <code>string url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>string fort_id = 3;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 3;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>string partner_id = 4;</code>
   * @return The partnerId.
   */
  java.lang.String getPartnerId();
  /**
   * <code>string partner_id = 4;</code>
   * @return The bytes for partnerId.
   */
  com.google.protobuf.ByteString
      getPartnerIdBytes();

  /**
   * <code>string campaign_id = 5;</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <code>string campaign_id = 5;</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();
}
