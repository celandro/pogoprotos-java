// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface FortDetailsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FortDetailsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.POGOProtos.Rpc.Team team = 2;</code>
   * @return The enum numeric value on the wire for team.
   */
  int getTeamValue();
  /**
   * <code>.POGOProtos.Rpc.Team team = 2;</code>
   * @return The team.
   */
  POGOProtos.Rpc.Team getTeam();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.PokemonProto> 
      getPokemonList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon = 3;</code>
   */
  POGOProtos.Rpc.PokemonProto getPokemon(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon = 3;</code>
   */
  int getPokemonCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokemonProtoOrBuilder> 
      getPokemonOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonProto pokemon = 3;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder(
      int index);

  /**
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string image_url = 5;</code>
   * @return A list containing the imageUrl.
   */
  java.util.List<java.lang.String>
      getImageUrlList();
  /**
   * <code>repeated string image_url = 5;</code>
   * @return The count of imageUrl.
   */
  int getImageUrlCount();
  /**
   * <code>repeated string image_url = 5;</code>
   * @param index The index of the element to return.
   * @return The imageUrl at the given index.
   */
  java.lang.String getImageUrl(int index);
  /**
   * <code>repeated string image_url = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageUrl at the given index.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes(int index);

  /**
   * <code>int32 fp = 6;</code>
   * @return The fp.
   */
  int getFp();

  /**
   * <code>int32 stamina = 7;</code>
   * @return The stamina.
   */
  int getStamina();

  /**
   * <code>int32 max_stamina = 8;</code>
   * @return The maxStamina.
   */
  int getMaxStamina();

  /**
   * <code>.POGOProtos.Rpc.FortType fort_type = 9;</code>
   * @return The enum numeric value on the wire for fortType.
   */
  int getFortTypeValue();
  /**
   * <code>.POGOProtos.Rpc.FortType fort_type = 9;</code>
   * @return The fortType.
   */
  POGOProtos.Rpc.FortType getFortType();

  /**
   * <code>double latitude = 10;</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <code>double longitude = 11;</code>
   * @return The longitude.
   */
  double getLongitude();

  /**
   * <code>string description = 12;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 12;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated .POGOProtos.Rpc.ClientFortModifierProto modifier = 13;</code>
   */
  java.util.List<POGOProtos.Rpc.ClientFortModifierProto> 
      getModifierList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientFortModifierProto modifier = 13;</code>
   */
  POGOProtos.Rpc.ClientFortModifierProto getModifier(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ClientFortModifierProto modifier = 13;</code>
   */
  int getModifierCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientFortModifierProto modifier = 13;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.ClientFortModifierProtoOrBuilder> 
      getModifierOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.ClientFortModifierProto modifier = 13;</code>
   */
  POGOProtos.Rpc.ClientFortModifierProtoOrBuilder getModifierOrBuilder(
      int index);

  /**
   * <code>bool close_soon = 14;</code>
   * @return The closeSoon.
   */
  boolean getCloseSoon();

  /**
   * <code>string checkin_image_url = 15;</code>
   * @return The checkinImageUrl.
   */
  java.lang.String getCheckinImageUrl();
  /**
   * <code>string checkin_image_url = 15;</code>
   * @return The bytes for checkinImageUrl.
   */
  com.google.protobuf.ByteString
      getCheckinImageUrlBytes();

  /**
   * <code>.POGOProtos.Rpc.EventInfoProto event_info = 16;</code>
   * @return Whether the eventInfo field is set.
   */
  boolean hasEventInfo();
  /**
   * <code>.POGOProtos.Rpc.EventInfoProto event_info = 16;</code>
   * @return The eventInfo.
   */
  POGOProtos.Rpc.EventInfoProto getEventInfo();
  /**
   * <code>.POGOProtos.Rpc.EventInfoProto event_info = 16;</code>
   */
  POGOProtos.Rpc.EventInfoProtoOrBuilder getEventInfoOrBuilder();

  /**
   * <code>repeated string promo_description = 17;</code>
   * @return A list containing the promoDescription.
   */
  java.util.List<java.lang.String>
      getPromoDescriptionList();
  /**
   * <code>repeated string promo_description = 17;</code>
   * @return The count of promoDescription.
   */
  int getPromoDescriptionCount();
  /**
   * <code>repeated string promo_description = 17;</code>
   * @param index The index of the element to return.
   * @return The promoDescription at the given index.
   */
  java.lang.String getPromoDescription(int index);
  /**
   * <code>repeated string promo_description = 17;</code>
   * @param index The index of the value to return.
   * @return The bytes of the promoDescription at the given index.
   */
  com.google.protobuf.ByteString
      getPromoDescriptionBytes(int index);

  /**
   * <code>string call_to_action_link = 18;</code>
   * @return The callToActionLink.
   */
  java.lang.String getCallToActionLink();
  /**
   * <code>string call_to_action_link = 18;</code>
   * @return The bytes for callToActionLink.
   */
  com.google.protobuf.ByteString
      getCallToActionLinkBytes();

  /**
   * <code>.POGOProtos.Rpc.SponsoredDetailsProto sponsored_details = 19;</code>
   * @return Whether the sponsoredDetails field is set.
   */
  boolean hasSponsoredDetails();
  /**
   * <code>.POGOProtos.Rpc.SponsoredDetailsProto sponsored_details = 19;</code>
   * @return The sponsoredDetails.
   */
  POGOProtos.Rpc.SponsoredDetailsProto getSponsoredDetails();
  /**
   * <code>.POGOProtos.Rpc.SponsoredDetailsProto sponsored_details = 19;</code>
   */
  POGOProtos.Rpc.SponsoredDetailsProtoOrBuilder getSponsoredDetailsOrBuilder();

  /**
   * <code>string geostore_tombstone_message_key = 20;</code>
   * @return The geostoreTombstoneMessageKey.
   */
  java.lang.String getGeostoreTombstoneMessageKey();
  /**
   * <code>string geostore_tombstone_message_key = 20;</code>
   * @return The bytes for geostoreTombstoneMessageKey.
   */
  com.google.protobuf.ByteString
      getGeostoreTombstoneMessageKeyBytes();

  /**
   * <code>string geostore_suspension_message_key = 21;</code>
   * @return The geostoreSuspensionMessageKey.
   */
  java.lang.String getGeostoreSuspensionMessageKey();
  /**
   * <code>string geostore_suspension_message_key = 21;</code>
   * @return The bytes for geostoreSuspensionMessageKey.
   */
  com.google.protobuf.ByteString
      getGeostoreSuspensionMessageKeyBytes();

  /**
   * <code>int32 poi_images_count = 22;</code>
   * @return The poiImagesCount.
   */
  int getPoiImagesCount();
}
