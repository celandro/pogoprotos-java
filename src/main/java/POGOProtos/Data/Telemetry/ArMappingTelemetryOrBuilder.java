// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ArMappingTelemetry.proto

package POGOProtos.Data.Telemetry;

public interface ArMappingTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.ArMappingTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Telemetry.ArMappingTelemetry.ArMappingEventId ar_mapping_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for arMappingTelemetryId.
   */
  int getArMappingTelemetryIdValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.ArMappingTelemetry.ArMappingEventId ar_mapping_telemetry_id = 1;</code>
   * @return The arMappingTelemetryId.
   */
  POGOProtos.Data.Telemetry.ArMappingTelemetry.ArMappingEventId getArMappingTelemetryId();

  /**
   * <code>.POGOProtos.Data.Telemetry.ArMappingTelemetry.ArMappingEntryPoint source = 2;</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.ArMappingTelemetry.ArMappingEntryPoint source = 2;</code>
   * @return The source.
   */
  POGOProtos.Data.Telemetry.ArMappingTelemetry.ArMappingEntryPoint getSource();

  /**
   * <code>float recording_length_seconds = 3;</code>
   * @return The recordingLengthSeconds.
   */
  float getRecordingLengthSeconds();

  /**
   * <code>float time_elapsed_seconds = 4;</code>
   * @return The timeElapsedSeconds.
   */
  float getTimeElapsedSeconds();

  /**
   * <code>float percent_encoded = 5;</code>
   * @return The percentEncoded.
   */
  float getPercentEncoded();

  /**
   * <code>int64 data_size_bytes = 6;</code>
   * @return The dataSizeBytes.
   */
  long getDataSizeBytes();
}
