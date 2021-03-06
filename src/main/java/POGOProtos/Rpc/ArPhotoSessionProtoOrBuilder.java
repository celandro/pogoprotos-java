// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ArPhotoSessionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ArPhotoSessionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ArPhotoSessionProto.ArType ar_type = 1;</code>
   * @return The enum numeric value on the wire for arType.
   */
  int getArTypeValue();
  /**
   * <code>.POGOProtos.Rpc.ArPhotoSessionProto.ArType ar_type = 1;</code>
   * @return The arType.
   */
  POGOProtos.Rpc.ArPhotoSessionProto.ArType getArType();

  /**
   * <code>.POGOProtos.Rpc.ArPhotoSessionProto.Step furthest_step_completed = 2;</code>
   * @return The enum numeric value on the wire for furthestStepCompleted.
   */
  int getFurthestStepCompletedValue();
  /**
   * <code>.POGOProtos.Rpc.ArPhotoSessionProto.Step furthest_step_completed = 2;</code>
   * @return The furthestStepCompleted.
   */
  POGOProtos.Rpc.ArPhotoSessionProto.Step getFurthestStepCompleted();

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
   * <code>.POGOProtos.Rpc.ArPhotoSessionProto.ArContext ar_context = 8;</code>
   * @return The enum numeric value on the wire for arContext.
   */
  int getArContextValue();
  /**
   * <code>.POGOProtos.Rpc.ArPhotoSessionProto.ArContext ar_context = 8;</code>
   * @return The arContext.
   */
  POGOProtos.Rpc.ArPhotoSessionProto.ArContext getArContext();

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

  /**
   * <code>string ardk_version = 13;</code>
   * @return The ardkVersion.
   */
  java.lang.String getArdkVersion();
  /**
   * <code>string ardk_version = 13;</code>
   * @return The bytes for ardkVersion.
   */
  com.google.protobuf.ByteString
      getArdkVersionBytes();

  /**
   * <code>int32 average_framerate = 14;</code>
   * @return The averageFramerate.
   */
  int getAverageFramerate();

  /**
   * <code>float average_battery_per_min = 15;</code>
   * @return The averageBatteryPerMin.
   */
  float getAverageBatteryPerMin();

  /**
   * <code>float average_cpu_usage = 16;</code>
   * @return The averageCpuUsage.
   */
  float getAverageCpuUsage();

  /**
   * <code>float average_gpu_usage = 17;</code>
   * @return The averageGpuUsage.
   */
  float getAverageGpuUsage();

  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample framerate_samples = 18;</code>
   */
  java.util.List<POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample> 
      getFramerateSamplesList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample framerate_samples = 18;</code>
   */
  POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample getFramerateSamples(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample framerate_samples = 18;</code>
   */
  int getFramerateSamplesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample framerate_samples = 18;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ArPhotoSessionProto.FramerateSampleOrBuilder> 
      getFramerateSamplesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.FramerateSample framerate_samples = 18;</code>
   */
  POGOProtos.Rpc.ArPhotoSessionProto.FramerateSampleOrBuilder getFramerateSamplesOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.BatterySample battery_samples = 19;</code>
   */
  java.util.List<POGOProtos.Rpc.ArPhotoSessionProto.BatterySample> 
      getBatterySamplesList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.BatterySample battery_samples = 19;</code>
   */
  POGOProtos.Rpc.ArPhotoSessionProto.BatterySample getBatterySamples(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.BatterySample battery_samples = 19;</code>
   */
  int getBatterySamplesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.BatterySample battery_samples = 19;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ArPhotoSessionProto.BatterySampleOrBuilder> 
      getBatterySamplesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.BatterySample battery_samples = 19;</code>
   */
  POGOProtos.Rpc.ArPhotoSessionProto.BatterySampleOrBuilder getBatterySamplesOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample processor_samples = 20;</code>
   */
  java.util.List<POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample> 
      getProcessorSamplesList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample processor_samples = 20;</code>
   */
  POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample getProcessorSamples(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample processor_samples = 20;</code>
   */
  int getProcessorSamplesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample processor_samples = 20;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSampleOrBuilder> 
      getProcessorSamplesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSample processor_samples = 20;</code>
   */
  POGOProtos.Rpc.ArPhotoSessionProto.ProcessorSampleOrBuilder getProcessorSamplesOrBuilder(
      int index);

  /**
   * <code>int32 session_start_to_plane_detection_ms = 21;</code>
   * @return The sessionStartToPlaneDetectionMs.
   */
  int getSessionStartToPlaneDetectionMs();

  /**
   * <code>int32 plane_detection_to_user_interaction_ms = 22;</code>
   * @return The planeDetectionToUserInteractionMs.
   */
  int getPlaneDetectionToUserInteractionMs();
}
