// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetGymBadgeDetailsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetGymBadgeDetailsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge gym_badge = 1;</code>
   * @return Whether the gymBadge field is set.
   */
  boolean hasGymBadge();
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge gym_badge = 1;</code>
   * @return The gymBadge.
   */
  POGOProtos.Rpc.AwardedGymBadge getGymBadge();
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge gym_badge = 1;</code>
   */
  POGOProtos.Rpc.AwardedGymBadgeOrBuilder getGymBadgeOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.GymDefenderProto gym_defender = 2;</code>
   * @return Whether the gymDefender field is set.
   */
  boolean hasGymDefender();
  /**
   * <code>.POGOProtos.Rpc.GymDefenderProto gym_defender = 2;</code>
   * @return The gymDefender.
   */
  POGOProtos.Rpc.GymDefenderProto getGymDefender();
  /**
   * <code>.POGOProtos.Rpc.GymDefenderProto gym_defender = 2;</code>
   */
  POGOProtos.Rpc.GymDefenderProtoOrBuilder getGymDefenderOrBuilder();

  /**
   * <code>bool success = 3;</code>
   * @return The success.
   */
  boolean getSuccess();
}
