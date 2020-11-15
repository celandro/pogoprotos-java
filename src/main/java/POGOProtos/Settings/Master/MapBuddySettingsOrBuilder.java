// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/MapBuddySettings.proto

package POGOProtos.Settings.Master;

public interface MapBuddySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.MapBuddySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 for_buddy_group_number = 1;</code>
   * @return The forBuddyGroupNumber.
   */
  int getForBuddyGroupNumber();

  /**
   * <code>float target_offset_min = 2;</code>
   * @return The targetOffsetMin.
   */
  float getTargetOffsetMin();

  /**
   * <code>float target_offset_max = 3;</code>
   * @return The targetOffsetMax.
   */
  float getTargetOffsetMax();

  /**
   * <code>float leash_distance = 4;</code>
   * @return The leashDistance.
   */
  float getLeashDistance();

  /**
   * <code>float max_seconds_to_idle = 5;</code>
   * @return The maxSecondsToIdle.
   */
  float getMaxSecondsToIdle();

  /**
   * <code>float max_rotation_speed = 6;</code>
   * @return The maxRotationSpeed.
   */
  float getMaxRotationSpeed();

  /**
   * <code>float walk_threshold = 7;</code>
   * @return The walkThreshold.
   */
  float getWalkThreshold();

  /**
   * <code>float run_threshold = 8;</code>
   * @return The runThreshold.
   */
  float getRunThreshold();

  /**
   * <code>bool should_glide = 9;</code>
   * @return The shouldGlide.
   */
  boolean getShouldGlide();

  /**
   * <code>float glide_smooth_time = 10;</code>
   * @return The glideSmoothTime.
   */
  float getGlideSmoothTime();

  /**
   * <code>float glide_max_speed = 11;</code>
   * @return The glideMaxSpeed.
   */
  float getGlideMaxSpeed();
}
