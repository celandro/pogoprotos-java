// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface OnboardingSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.OnboardingSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool skip_avatar_customization = 1;</code>
   * @return The skipAvatarCustomization.
   */
  boolean getSkipAvatarCustomization();

  /**
   * <code>bool disable_initial_ar_prompt = 2;</code>
   * @return The disableInitialArPrompt.
   */
  boolean getDisableInitialArPrompt();

  /**
   * <code>uint32 ar_prompt_player_level = 3;</code>
   * @return The arPromptPlayerLevel.
   */
  int getArPromptPlayerLevel();
}
