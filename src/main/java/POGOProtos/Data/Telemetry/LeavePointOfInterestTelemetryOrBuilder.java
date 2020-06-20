// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/LeavePointOfInterestTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface LeavePointOfInterestTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.LeavePointOfInterestTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  java.lang.String getResult();
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  com.google.protobuf.ByteString
      getResultBytes();

  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>.POGOProtos.Map.Fort.FortType fort_type = 3;</code>
   * @return The enum numeric value on the wire for fortType.
   */
  int getFortTypeValue();
  /**
   * <code>.POGOProtos.Map.Fort.FortType fort_type = 3;</code>
   * @return The fortType.
   */
  POGOProtos.Map.Fort.FortType getFortType();

  /**
   * <code>int64 client_timestamp = 4;</code>
   * @return The clientTimestamp.
   */
  long getClientTimestamp();

  /**
   * <code>string partner_id = 5;</code>
   * @return The partnerId.
   */
  java.lang.String getPartnerId();
  /**
   * <code>string partner_id = 5;</code>
   * @return The bytes for partnerId.
   */
  com.google.protobuf.ByteString
      getPartnerIdBytes();

  /**
   * <code>int64 time_spent = 6;</code>
   * @return The timeSpent.
   */
  long getTimeSpent();

  /**
   * <code>string campaign_id = 7;</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <code>string campaign_id = 7;</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();
}
