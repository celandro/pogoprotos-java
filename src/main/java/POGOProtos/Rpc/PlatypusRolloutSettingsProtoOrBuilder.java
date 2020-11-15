// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatypusRolloutSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatypusRolloutSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 buddy_v2_min_player_level = 1;</code>
   * @return The buddyV2MinPlayerLevel.
   */
  int getBuddyV2MinPlayerLevel();

  /**
   * <code>int32 buddy_multiplayer_min_player_level = 2;</code>
   * @return The buddyMultiplayerMinPlayerLevel.
   */
  int getBuddyMultiplayerMinPlayerLevel();

  /**
   * <code>bool enable_monodepth = 3;</code>
   * @return The enableMonodepth.
   */
  boolean getEnableMonodepth();

  /**
   * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
   * @return Whether the wallabySettings field is set.
   */
  boolean hasWallabySettings();
  /**
   * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
   * @return The wallabySettings.
   */
  POGOProtos.Rpc.WallabySettingsProto getWallabySettings();
  /**
   * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
   */
  POGOProtos.Rpc.WallabySettingsProtoOrBuilder getWallabySettingsOrBuilder();
}
