// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface ReportAdInteractionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ReportAdInteractionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.ViewImpressionInteraction view_impression = 5;</code>
   * @return Whether the viewImpression field is set.
   */
  boolean hasViewImpression();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.ViewImpressionInteraction view_impression = 5;</code>
   * @return The viewImpression.
   */
  POGOProtos.Rpc.ReportAdInteractionProto.ViewImpressionInteraction getViewImpression();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.ViewImpressionInteraction view_impression = 5;</code>
   */
  POGOProtos.Rpc.ReportAdInteractionProto.ViewImpressionInteractionOrBuilder getViewImpressionOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.ViewFullscreenInteraction view_fullscreen = 6;</code>
   * @return Whether the viewFullscreen field is set.
   */
  boolean hasViewFullscreen();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.ViewFullscreenInteraction view_fullscreen = 6;</code>
   * @return The viewFullscreen.
   */
  POGOProtos.Rpc.ReportAdInteractionProto.ViewFullscreenInteraction getViewFullscreen();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.ViewFullscreenInteraction view_fullscreen = 6;</code>
   */
  POGOProtos.Rpc.ReportAdInteractionProto.ViewFullscreenInteractionOrBuilder getViewFullscreenOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.FullScreenInteraction fullscreen_interaction = 7;</code>
   * @return Whether the fullscreenInteraction field is set.
   */
  boolean hasFullscreenInteraction();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.FullScreenInteraction fullscreen_interaction = 7;</code>
   * @return The fullscreenInteraction.
   */
  POGOProtos.Rpc.ReportAdInteractionProto.FullScreenInteraction getFullscreenInteraction();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.FullScreenInteraction fullscreen_interaction = 7;</code>
   */
  POGOProtos.Rpc.ReportAdInteractionProto.FullScreenInteractionOrBuilder getFullscreenInteractionOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.CTAClickInteraction cta_clicked = 8;</code>
   * @return Whether the ctaClicked field is set.
   */
  boolean hasCtaClicked();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.CTAClickInteraction cta_clicked = 8;</code>
   * @return The ctaClicked.
   */
  POGOProtos.Rpc.ReportAdInteractionProto.CTAClickInteraction getCtaClicked();
  /**
   * <code>.POGOProtos.Rpc.ReportAdInteractionProto.CTAClickInteraction cta_clicked = 8;</code>
   */
  POGOProtos.Rpc.ReportAdInteractionProto.CTAClickInteractionOrBuilder getCtaClickedOrBuilder();

  /**
   * <code>string game_id = 1;</code>
   * @return The gameId.
   */
  java.lang.String getGameId();
  /**
   * <code>string game_id = 1;</code>
   * @return The bytes for gameId.
   */
  com.google.protobuf.ByteString
      getGameIdBytes();

  /**
   * <code>string user_id = 2;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string guid = 3;</code>
   * @return The guid.
   */
  java.lang.String getGuid();
  /**
   * <code>string guid = 3;</code>
   * @return The bytes for guid.
   */
  com.google.protobuf.ByteString
      getGuidBytes();

  /**
   * <code>bytes encrypted_ad_token = 4;</code>
   * @return The encryptedAdToken.
   */
  com.google.protobuf.ByteString getEncryptedAdToken();

  public POGOProtos.Rpc.ReportAdInteractionProto.InteractionTypeCase getInteractionTypeCase();
}
