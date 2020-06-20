// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/InvasionNpcDisplaySettings.proto

package POGOProtos.Settings.Master;

public interface InvasionNpcDisplaySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.InvasionNpcDisplaySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string trainer_name = 1;</code>
   * @return The trainerName.
   */
  java.lang.String getTrainerName();
  /**
   * <code>string trainer_name = 1;</code>
   * @return The bytes for trainerName.
   */
  com.google.protobuf.ByteString
      getTrainerNameBytes();

  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatar avatar = 2;</code>
   * @return Whether the avatar field is set.
   */
  boolean hasAvatar();
  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatar avatar = 2;</code>
   * @return The avatar.
   */
  POGOProtos.Data.Player.PlayerAvatar getAvatar();
  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatar avatar = 2;</code>
   */
  POGOProtos.Data.Player.PlayerAvatarOrBuilder getAvatarOrBuilder();

  /**
   * <code>string trainer_title = 3;</code>
   * @return The trainerTitle.
   */
  java.lang.String getTrainerTitle();
  /**
   * <code>string trainer_title = 3;</code>
   * @return The bytes for trainerTitle.
   */
  com.google.protobuf.ByteString
      getTrainerTitleBytes();

  /**
   * <code>string trainer_quote = 4;</code>
   * @return The trainerQuote.
   */
  java.lang.String getTrainerQuote();
  /**
   * <code>string trainer_quote = 4;</code>
   * @return The bytes for trainerQuote.
   */
  com.google.protobuf.ByteString
      getTrainerQuoteBytes();

  /**
   * <code>string icon_url = 5;</code>
   * @return The iconUrl.
   */
  java.lang.String getIconUrl();
  /**
   * <code>string icon_url = 5;</code>
   * @return The bytes for iconUrl.
   */
  com.google.protobuf.ByteString
      getIconUrlBytes();

  /**
   * <code>string backdrop_image_bundle = 6;</code>
   * @return The backdropImageBundle.
   */
  java.lang.String getBackdropImageBundle();
  /**
   * <code>string backdrop_image_bundle = 6;</code>
   * @return The bytes for backdropImageBundle.
   */
  com.google.protobuf.ByteString
      getBackdropImageBundleBytes();

  /**
   * <code>string model_name = 7;</code>
   * @return The modelName.
   */
  java.lang.String getModelName();
  /**
   * <code>string model_name = 7;</code>
   * @return The bytes for modelName.
   */
  com.google.protobuf.ByteString
      getModelNameBytes();

  /**
   * <code>string tutorial_on_loss_string = 8;</code>
   * @return The tutorialOnLossString.
   */
  java.lang.String getTutorialOnLossString();
  /**
   * <code>string tutorial_on_loss_string = 8;</code>
   * @return The bytes for tutorialOnLossString.
   */
  com.google.protobuf.ByteString
      getTutorialOnLossStringBytes();

  /**
   * <code>bool is_male = 9;</code>
   * @return The isMale.
   */
  boolean getIsMale();
}
