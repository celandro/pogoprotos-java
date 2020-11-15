// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface MonodepthSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.MonodepthSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_occlusions = 1;</code>
   * @return The enableOcclusions.
   */
  boolean getEnableOcclusions();

  /**
   * <code>bool occlusions_default_on = 2;</code>
   * @return The occlusionsDefaultOn.
   */
  boolean getOcclusionsDefaultOn();

  /**
   * <code>bool occlusions_toggle_visible = 3;</code>
   * @return The occlusionsToggleVisible.
   */
  boolean getOcclusionsToggleVisible();

  /**
   * <code>bool enable_ground_suppression = 4;</code>
   * @return The enableGroundSuppression.
   */
  boolean getEnableGroundSuppression();

  /**
   * <code>float min_ground_suppression_thresh = 5;</code>
   * @return The minGroundSuppressionThresh.
   */
  float getMinGroundSuppressionThresh();

  /**
   * <code>uint32 suppression_channel_id = 6;</code>
   * @return The suppressionChannelId.
   */
  int getSuppressionChannelId();
}
