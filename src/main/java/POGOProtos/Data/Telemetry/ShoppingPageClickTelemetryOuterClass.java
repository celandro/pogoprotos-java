// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ShoppingPageClickTelemetry.proto

package POGOProtos.Data.Telemetry;

public final class ShoppingPageClickTelemetryOuterClass {
  private ShoppingPageClickTelemetryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Telemetry_ShoppingPageClickTelemetry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Telemetry_ShoppingPageClickTelemetry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:POGOProtos/Data/Telemetry/ShoppingPage" +
      "ClickTelemetry.proto\022\031POGOProtos.Data.Te" +
      "lemetry\032#POGOProtos/Enums/TelemetryIds.p" +
      "roto\"\205\007\n\032ShoppingPageClickTelemetry\022J\n\026s" +
      "hopping_page_click_id\030\001 \001(\0162*.POGOProtos" +
      ".Enums.ShoppingPageTelemetryIds\022u\n\032shopp" +
      "ing_page_click_source\030\002 \001(\0162Q.POGOProtos" +
      ".Data.Telemetry.ShoppingPageClickTelemet" +
      "ry.ShoppingPageTelemetrySource\022\020\n\010item_s" +
      "ku\030\003 \001(\t\022\020\n\010has_item\030\004 \001(\010\"\377\004\n\033ShoppingP" +
      "ageTelemetrySource\022\"\n\036UNDEFINED_SHOPPING" +
      "_PAGE_SOURCE\020\000\022\024\n\020SOURCE_MAIN_MENU\020\001\022\033\n\027" +
      "SOURCE_POKEMON_BAG_FULL\020\002\022\035\n\031SOURCE_INCU" +
      "BATOR_SELECTOR\020\003\022$\n SOURCE_POKESTOP_DISK" +
      "_INTERACTION\020\004\022\035\n\031SOURCE_OPEN_GIFT_BAG_F" +
      "ULL\020\005\022(\n$SOURCE_QUICK_SHOP_BAG_FULL_ENCO" +
      "UNTER\020\006\022#\n\037SOURCE_QUICK_SHOP_BAG_FULL_RA" +
      "ID\020\007\022\032\n\026SOURCE_QUICK_SHOP_MORE\020\010\022\026\n\022SOUR" +
      "CE_AVATAR_ITEM\020\t\022\034\n\030SOURCE_POKEMON_ENCOU" +
      "NTER\020\n\022\036\n\032SOURCE_PLAYER_PROFILE_PAGE\020\013\022\026" +
      "\n\022SOURCE_STORE_FRONT\020\014\022%\n!SOURCE_AVATAR_" +
      "CUSTOMIZATION_AWARD\020\r\022\037\n\033SOURCE_FIRST_TI" +
      "ME_USER_FLOW\020\016\022%\n!SOURCE_BADGE_DETAIL_AV" +
      "ATAR_REWARD\020\017\022.\n*SOURCE_QUICK_SHOP_BUDDY" +
      "_INTERACTION_POFFIN\020d\022-\n)SOURCE_QUICK_SH" +
      "OP_BUDDY_QUICK_FEED_POFFIN\020eB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Enums.TelemetryIds.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Telemetry_ShoppingPageClickTelemetry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Telemetry_ShoppingPageClickTelemetry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Telemetry_ShoppingPageClickTelemetry_descriptor,
        new java.lang.String[] { "ShoppingPageClickId", "ShoppingPageClickSource", "ItemSku", "HasItem", });
    POGOProtos.Enums.TelemetryIds.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}