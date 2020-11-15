// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface BuddyHungerSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BuddyHungerSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 num_hunger_points_required_for_full = 1;</code>
   * @return The numHungerPointsRequiredForFull.
   */
  int getNumHungerPointsRequiredForFull();

  /**
   * <code>int32 decay_points_per_bucket = 2;</code>
   * @return The decayPointsPerBucket.
   */
  int getDecayPointsPerBucket();

  /**
   * <code>int64 milliseconds_per_bucket = 3;</code>
   * @return The millisecondsPerBucket.
   */
  long getMillisecondsPerBucket();

  /**
   * <code>int64 cooldown_duration_ms = 4;</code>
   * @return The cooldownDurationMs.
   */
  long getCooldownDurationMs();

  /**
   * <code>int64 decay_duration_after_full_ms = 5;</code>
   * @return The decayDurationAfterFullMs.
   */
  long getDecayDurationAfterFullMs();
}
