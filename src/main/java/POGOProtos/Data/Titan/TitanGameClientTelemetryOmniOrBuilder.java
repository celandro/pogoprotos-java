// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Titan/TitanGameClientTelemetryOmni.proto

package POGOProtos.Data.Titan;

public interface TitanGameClientTelemetryOmniOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Titan.TitanGameClientTelemetryOmni)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionTelemetry poi_submission_telemetry = 1;</code>
   * @return Whether the poiSubmissionTelemetry field is set.
   */
  boolean hasPoiSubmissionTelemetry();
  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionTelemetry poi_submission_telemetry = 1;</code>
   * @return The poiSubmissionTelemetry.
   */
  POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionTelemetry getPoiSubmissionTelemetry();
  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionTelemetry poi_submission_telemetry = 1;</code>
   */
  POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionTelemetryOrBuilder getPoiSubmissionTelemetryOrBuilder();

  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionPhotoUploadErrorTelemetry poi_submission_photo_upload_error_telemetry = 2;</code>
   * @return Whether the poiSubmissionPhotoUploadErrorTelemetry field is set.
   */
  boolean hasPoiSubmissionPhotoUploadErrorTelemetry();
  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionPhotoUploadErrorTelemetry poi_submission_photo_upload_error_telemetry = 2;</code>
   * @return The poiSubmissionPhotoUploadErrorTelemetry.
   */
  POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionPhotoUploadErrorTelemetry getPoiSubmissionPhotoUploadErrorTelemetry();
  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionPhotoUploadErrorTelemetry poi_submission_photo_upload_error_telemetry = 2;</code>
   */
  POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiSubmissionPhotoUploadErrorTelemetryOrBuilder getPoiSubmissionPhotoUploadErrorTelemetryOrBuilder();

  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiPlayerMetadataTelemetry player_metadata_telemetry = 3;</code>
   * @return Whether the playerMetadataTelemetry field is set.
   */
  boolean hasPlayerMetadataTelemetry();
  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiPlayerMetadataTelemetry player_metadata_telemetry = 3;</code>
   * @return The playerMetadataTelemetry.
   */
  POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiPlayerMetadataTelemetry getPlayerMetadataTelemetry();
  /**
   * <code>.POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiPlayerMetadataTelemetry player_metadata_telemetry = 3;</code>
   */
  POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.PoiPlayerMetadataTelemetryOrBuilder getPlayerMetadataTelemetryOrBuilder();

  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformServerData server_data = 1001;</code>
   * @return Whether the serverData field is set.
   */
  boolean hasServerData();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformServerData server_data = 1001;</code>
   * @return The serverData.
   */
  POGOProtos.Data.Telemetry.PlatformServerData getServerData();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformServerData server_data = 1001;</code>
   */
  POGOProtos.Data.Telemetry.PlatformServerDataOrBuilder getServerDataOrBuilder();

  public POGOProtos.Data.Titan.TitanGameClientTelemetryOmni.TelemetryDataCase getTelemetryDataCase();
}
