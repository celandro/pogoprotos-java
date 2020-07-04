// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GpsSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GpsSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float driving_warning_speed_meters_per_second = 1;</code>
   * @return The drivingWarningSpeedMetersPerSecond.
   */
  float getDrivingWarningSpeedMetersPerSecond();

  /**
   * <code>float driving_warning_cooldown_minutes = 2;</code>
   * @return The drivingWarningCooldownMinutes.
   */
  float getDrivingWarningCooldownMinutes();

  /**
   * <code>float driving_speed_sample_interval_seconds = 3;</code>
   * @return The drivingSpeedSampleIntervalSeconds.
   */
  float getDrivingSpeedSampleIntervalSeconds();

  /**
   * <code>int32 driving_speed_sample_count = 4;</code>
   * @return The drivingSpeedSampleCount.
   */
  int getDrivingSpeedSampleCount();

  /**
   * <code>float idle_threshold_speed_meters_per_second = 5;</code>
   * @return The idleThresholdSpeedMetersPerSecond.
   */
  float getIdleThresholdSpeedMetersPerSecond();

  /**
   * <code>int32 idle_threshold_duration_seconds = 6;</code>
   * @return The idleThresholdDurationSeconds.
   */
  int getIdleThresholdDurationSeconds();

  /**
   * <code>float idle_sample_interval_seconds = 7;</code>
   * @return The idleSampleIntervalSeconds.
   */
  float getIdleSampleIntervalSeconds();

  /**
   * <code>int32 idle_speed_sample_count = 8;</code>
   * @return The idleSpeedSampleCount.
   */
  int getIdleSpeedSampleCount();
}
