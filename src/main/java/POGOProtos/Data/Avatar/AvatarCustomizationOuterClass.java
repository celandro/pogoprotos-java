// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Avatar/AvatarCustomization.proto

package POGOProtos.Data.Avatar;

public final class AvatarCustomizationOuterClass {
  private AvatarCustomizationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Avatar_AvatarCustomization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Avatar_AvatarCustomization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0POGOProtos/Data/Avatar/AvatarCustomiza" +
      "tion.proto\022\026POGOProtos.Data.Avatar\032-POGO" +
      "Protos/Data/Player/PlayerAvatarType.prot" +
      "o\032 POGOProtos/Enums/BadgeType.proto\"\267\010\n\023" +
      "AvatarCustomization\022\017\n\007enabled\030\001 \001(\010\022=\n\013" +
      "avatar_type\030\002 \001(\0162(.POGOProtos.Data.Play" +
      "er.PlayerAvatarType\022>\n\004slot\030\003 \003(\01620.POGO" +
      "Protos.Data.Avatar.AvatarCustomization.S" +
      "lot\022\023\n\013bundle_name\030\004 \001(\t\022\022\n\nasset_name\030\005" +
      " \001(\t\022\022\n\ngroup_name\030\006 \001(\t\022\022\n\nsort_order\030\007" +
      " \001(\005\022^\n\013unlock_type\030\010 \001(\0162I.POGOProtos.D" +
      "ata.Avatar.AvatarCustomization.AvatarCus" +
      "tomizationUnlockType\022\\\n\npromo_type\030\t \003(\016" +
      "2H.POGOProtos.Data.Avatar.AvatarCustomiz" +
      "ation.AvatarCustomizationPromoType\0226\n\021un" +
      "lock_badge_type\030\n \001(\0162\033.POGOProtos.Enums" +
      ".BadgeType\022\017\n\007iap_sku\030\013 \001(\t\022\032\n\022unlock_ba" +
      "dge_level\030\014 \001(\005\022\021\n\ticon_name\030\r \001(\t\022\033\n\023un" +
      "lock_player_level\030\016 \001(\005\022\020\n\010set_name\030\017 \001(" +
      "\t\022\026\n\016set_prime_item\030\020 \001(\010\022!\n\031incompatibl" +
      "e_bundle_names\030\021 \003(\t\"L\n\034AvatarCustomizat" +
      "ionPromoType\022\024\n\020UNSET_PROMO_TYPE\020\000\022\010\n\004SA" +
      "LE\020\001\022\014\n\010FEATURED\020\002\"\221\001\n\035AvatarCustomizati" +
      "onUnlockType\022\025\n\021UNSET_UNLOCK_TYPE\020\000\022\013\n\007D" +
      "EFAULT\020\001\022\020\n\014MEDAL_REWARD\020\002\022\020\n\014IAP_CLOTHI" +
      "NG\020\003\022\020\n\014LEVEL_REWARD\020\004\022\026\n\022COMBAT_RANK_RE" +
      "WARD\020\005\"\274\001\n\004Slot\022\016\n\nUNSET_SLOT\020\000\022\010\n\004HAIR\020" +
      "\001\022\t\n\005SHIRT\020\002\022\t\n\005PANTS\020\003\022\007\n\003HAT\020\004\022\t\n\005SHOE" +
      "S\020\005\022\010\n\004EYES\020\006\022\014\n\010BACKPACK\020\007\022\n\n\006GLOVES\020\010\022" +
      "\t\n\005SOCKS\020\t\022\010\n\004BELT\020\n\022\013\n\007GLASSES\020\013\022\014\n\010NEC" +
      "KLACE\020\014\022\010\n\004SKIN\020\r\022\010\n\004POSE\020\016\022\010\n\004FACE\020\017B\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Player.PlayerAvatarTypeOuterClass.getDescriptor(),
          POGOProtos.Enums.BadgeTypeOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Avatar_AvatarCustomization_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Avatar_AvatarCustomization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Avatar_AvatarCustomization_descriptor,
        new java.lang.String[] { "Enabled", "AvatarType", "Slot", "BundleName", "AssetName", "GroupName", "SortOrder", "UnlockType", "PromoType", "UnlockBadgeType", "IapSku", "UnlockBadgeLevel", "IconName", "UnlockPlayerLevel", "SetName", "SetPrimeItem", "IncompatibleBundleNames", });
    POGOProtos.Data.Player.PlayerAvatarTypeOuterClass.getDescriptor();
    POGOProtos.Enums.BadgeTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
