// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ArPhotoSession.proto

package POGOProtos.Data.Telemetry;

public interface ArPhotoSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.ArPhotoSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Telemetry.ArPhotoSession.ArType ar_type = 1;</code>
   * @return The enum numeric value on the wire for arType.
   */
  int getArTypeValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.ArPhotoSession.ArType ar_type = 1;</code>
   * @return The arType.
   */
  POGOProtos.Data.Telemetry.ArPhotoSession.ArType getArType();

  /**
   * <code>.POGOProtos.Data.Telemetry.ArPhotoSession.Step furthest_step_completed = 2;</code>
   * @return The enum numeric value on the wire for furthestStepCompleted.
   */
  int getFurthestStepCompletedValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.ArPhotoSession.Step furthest_step_completed = 2;</code>
   * @return The furthestStepCompleted.
   */
  POGOProtos.Data.Telemetry.ArPhotoSession.Step getFurthestStepCompleted();

  /**
   * <code>int32 num_photos_taken = 3;</code>
   * @return The numPhotosTaken.
   */
  int getNumPhotosTaken();

  /**
   * <code>int32 num_photos_shared = 4;</code>
   * @return The numPhotosShared.
   */
  int getNumPhotosShared();

  /**
   * <code>int32 num_photos_taken_occlusions = 5;</code>
   * @return The numPhotosTakenOcclusions.
   */
  int getNumPhotosTakenOcclusions();

  /**
   * <code>int32 num_occlusions_enabled = 6;</code>
   * @return The numOcclusionsEnabled.
   */
  int getNumOcclusionsEnabled();

  /**
   * <code>int32 num_occlusions_disabled = 7;</code>
   * @return The numOcclusionsDisabled.
   */
  int getNumOcclusionsDisabled();

  /**
   * <code>.POGOProtos.Data.Telemetry.ArPhotoSession.ArContext ar_context = 8;</code>
   * @return The enum numeric value on the wire for arContext.
   */
  int getArContextValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.ArPhotoSession.ArContext ar_context = 8;</code>
   * @return The arContext.
   */
  POGOProtos.Data.Telemetry.ArPhotoSession.ArContext getArContext();

  /**
   * <code>int64 session_length = 9;</code>
   * @return The sessionLength.
   */
  long getSessionLength();

  /**
   * <code>int64 session_length_occlusions = 10;</code>
   * @return The sessionLengthOcclusions.
   */
  long getSessionLengthOcclusions();

  /**
   * <code>int32 num_photos_shared_occlusions = 11;</code>
   * @return The numPhotosSharedOcclusions.
   */
  int getNumPhotosSharedOcclusions();

  /**
   * <code>string model_url = 12;</code>
   * @return The modelUrl.
   */
  java.lang.String getModelUrl();
  /**
   * <code>string model_url = 12;</code>
   * @return The bytes for modelUrl.
   */
  com.google.protobuf.ByteString
      getModelUrlBytes();
}
