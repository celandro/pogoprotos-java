// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/FortDetailsResponse.proto

package POGOProtos.Networking.Responses;

public final class FortDetailsResponseOuterClass {
  private FortDetailsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_FortDetailsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_FortDetailsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9POGOProtos/Networking/Responses/FortDe" +
      "tailsResponse.proto\022\037POGOProtos.Networki" +
      "ng.Responses\032!POGOProtos/Data/PokemonDat" +
      "a.proto\032$POGOProtos/Data/Raid/EventInfo." +
      "proto\032 POGOProtos/Enums/TeamColor.proto\032" +
      "\"POGOProtos/Map/Fort/FortType.proto\032&POG" +
      "OProtos/Map/Fort/FortModifier.proto\032*POG" +
      "OProtos/Map/Fort/SponsoredDetails.proto\"" +
      "\305\005\n\023FortDetailsResponse\022\017\n\007fort_id\030\001 \001(\t" +
      "\022/\n\nteam_color\030\002 \001(\0162\033.POGOProtos.Enums." +
      "TeamColor\0222\n\014pokemon_data\030\003 \001(\0132\034.POGOPr" +
      "otos.Data.PokemonData\022\014\n\004name\030\004 \001(\t\022\022\n\ni" +
      "mage_urls\030\005 \003(\t\022\n\n\002fp\030\006 \001(\005\022\017\n\007stamina\030\007" +
      " \001(\005\022\023\n\013max_stamina\030\010 \001(\005\022+\n\004type\030\t \001(\0162" +
      "\035.POGOProtos.Map.Fort.FortType\022\020\n\010latitu" +
      "de\030\n \001(\001\022\021\n\tlongitude\030\013 \001(\001\022\023\n\013descripti" +
      "on\030\014 \001(\t\0224\n\tmodifiers\030\r \003(\0132!.POGOProtos" +
      ".Map.Fort.FortModifier\022\022\n\nclose_soon\030\016 \001" +
      "(\010\022\031\n\021checkin_image_url\030\017 \001(\t\0223\n\nevent_i" +
      "nfo\030\020 \001(\0132\037.POGOProtos.Data.Raid.EventIn" +
      "fo\022\031\n\021promo_description\030\021 \003(\t\022\033\n\023call_to" +
      "_action_link\030\022 \001(\t\022@\n\021sponsored_details\030" +
      "\023 \001(\0132%.POGOProtos.Map.Fort.SponsoredDet" +
      "ails\022&\n\036geostore_tombstone_message_key\030\024" +
      " \001(\t\022\'\n\037geostore_suspension_message_key\030" +
      "\025 \001(\t\022\030\n\020poi_images_count\030\026 \001(\005B\002P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.PokemonDataOuterClass.getDescriptor(),
          POGOProtos.Data.Raid.EventInfoOuterClass.getDescriptor(),
          POGOProtos.Enums.TeamColorOuterClass.getDescriptor(),
          POGOProtos.Map.Fort.FortTypeOuterClass.getDescriptor(),
          POGOProtos.Map.Fort.FortModifierOuterClass.getDescriptor(),
          POGOProtos.Map.Fort.SponsoredDetailsOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_FortDetailsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_FortDetailsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_FortDetailsResponse_descriptor,
        new java.lang.String[] { "FortId", "TeamColor", "PokemonData", "Name", "ImageUrls", "Fp", "Stamina", "MaxStamina", "Type", "Latitude", "Longitude", "Description", "Modifiers", "CloseSoon", "CheckinImageUrl", "EventInfo", "PromoDescription", "CallToActionLink", "SponsoredDetails", "GeostoreTombstoneMessageKey", "GeostoreSuspensionMessageKey", "PoiImagesCount", });
    POGOProtos.Data.PokemonDataOuterClass.getDescriptor();
    POGOProtos.Data.Raid.EventInfoOuterClass.getDescriptor();
    POGOProtos.Enums.TeamColorOuterClass.getDescriptor();
    POGOProtos.Map.Fort.FortTypeOuterClass.getDescriptor();
    POGOProtos.Map.Fort.FortModifierOuterClass.getDescriptor();
    POGOProtos.Map.Fort.SponsoredDetailsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
