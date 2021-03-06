// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface SponsoredDetailsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.SponsoredDetailsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string promo_image_url = 1;</code>
   * @return A list containing the promoImageUrl.
   */
  java.util.List<java.lang.String>
      getPromoImageUrlList();
  /**
   * <code>repeated string promo_image_url = 1;</code>
   * @return The count of promoImageUrl.
   */
  int getPromoImageUrlCount();
  /**
   * <code>repeated string promo_image_url = 1;</code>
   * @param index The index of the element to return.
   * @return The promoImageUrl at the given index.
   */
  java.lang.String getPromoImageUrl(int index);
  /**
   * <code>repeated string promo_image_url = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the promoImageUrl at the given index.
   */
  com.google.protobuf.ByteString
      getPromoImageUrlBytes(int index);

  /**
   * <code>repeated string promo_description = 2;</code>
   * @return A list containing the promoDescription.
   */
  java.util.List<java.lang.String>
      getPromoDescriptionList();
  /**
   * <code>repeated string promo_description = 2;</code>
   * @return The count of promoDescription.
   */
  int getPromoDescriptionCount();
  /**
   * <code>repeated string promo_description = 2;</code>
   * @param index The index of the element to return.
   * @return The promoDescription at the given index.
   */
  java.lang.String getPromoDescription(int index);
  /**
   * <code>repeated string promo_description = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the promoDescription at the given index.
   */
  com.google.protobuf.ByteString
      getPromoDescriptionBytes(int index);

  /**
   * <code>string call_to_action_link = 3;</code>
   * @return The callToActionLink.
   */
  java.lang.String getCallToActionLink();
  /**
   * <code>string call_to_action_link = 3;</code>
   * @return The bytes for callToActionLink.
   */
  com.google.protobuf.ByteString
      getCallToActionLinkBytes();

  /**
   * <code>.POGOProtos.Rpc.SponsoredDetailsProto.PromoButtonMessageType promo_button_message_type = 4;</code>
   * @return The enum numeric value on the wire for promoButtonMessageType.
   */
  int getPromoButtonMessageTypeValue();
  /**
   * <code>.POGOProtos.Rpc.SponsoredDetailsProto.PromoButtonMessageType promo_button_message_type = 4;</code>
   * @return The promoButtonMessageType.
   */
  POGOProtos.Rpc.SponsoredDetailsProto.PromoButtonMessageType getPromoButtonMessageType();

  /**
   * <code>string campaign_id = 5;</code>
   * @return The campaignId.
   */
  java.lang.String getCampaignId();
  /**
   * <code>string campaign_id = 5;</code>
   * @return The bytes for campaignId.
   */
  com.google.protobuf.ByteString
      getCampaignIdBytes();

  /**
   * <code>.POGOProtos.Rpc.ImageTextCreativeProto promo_image_creative = 6;</code>
   * @return Whether the promoImageCreative field is set.
   */
  boolean hasPromoImageCreative();
  /**
   * <code>.POGOProtos.Rpc.ImageTextCreativeProto promo_image_creative = 6;</code>
   * @return The promoImageCreative.
   */
  POGOProtos.Rpc.ImageTextCreativeProto getPromoImageCreative();
  /**
   * <code>.POGOProtos.Rpc.ImageTextCreativeProto promo_image_creative = 6;</code>
   */
  POGOProtos.Rpc.ImageTextCreativeProtoOrBuilder getPromoImageCreativeOrBuilder();
}
