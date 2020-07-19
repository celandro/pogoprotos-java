// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.HoloIapItemCategory}
 */
public enum HoloIapItemCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_NONE = 0;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_NONE(0),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_BUNDLE = 1;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_BUNDLE(1),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_ITEMS = 2;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_ITEMS(2),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_UPGRADES = 3;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_UPGRADES(3),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_POKECOINS = 4;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_POKECOINS(4),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR = 5;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR(5),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR_STORE_LINK = 6;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR_STORE_LINK(6),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_TEAM_CHANGE = 7;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_TEAM_CHANGE(7),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_GLOBAL_EVENT_TICKET = 10;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_GLOBAL_EVENT_TICKET(10),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_VS_SEEKER = 11;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_VS_SEEKER(11),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_STICKER = 12;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_STICKER(12),
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_FREE = 13;</code>
   */
  HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_FREE(13),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_NONE = 0;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_NONE_VALUE = 0;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_BUNDLE = 1;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_BUNDLE_VALUE = 1;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_ITEMS = 2;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_ITEMS_VALUE = 2;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_UPGRADES = 3;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_UPGRADES_VALUE = 3;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_POKECOINS = 4;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_POKECOINS_VALUE = 4;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR = 5;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR_VALUE = 5;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR_STORE_LINK = 6;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR_STORE_LINK_VALUE = 6;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_TEAM_CHANGE = 7;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_TEAM_CHANGE_VALUE = 7;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_GLOBAL_EVENT_TICKET = 10;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_GLOBAL_EVENT_TICKET_VALUE = 10;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_VS_SEEKER = 11;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_VS_SEEKER_VALUE = 11;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_STICKER = 12;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_STICKER_VALUE = 12;
  /**
   * <code>HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_FREE = 13;</code>
   */
  public static final int HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_FREE_VALUE = 13;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static HoloIapItemCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HoloIapItemCategory forNumber(int value) {
    switch (value) {
      case 0: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_NONE;
      case 1: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_BUNDLE;
      case 2: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_ITEMS;
      case 3: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_UPGRADES;
      case 4: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_POKECOINS;
      case 5: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR;
      case 6: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_AVATAR_STORE_LINK;
      case 7: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_TEAM_CHANGE;
      case 10: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_GLOBAL_EVENT_TICKET;
      case 11: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_VS_SEEKER;
      case 12: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_STICKER;
      case 13: return HOLO_IAP_ITEM_CATEGORY_IAP_CATEGORY_FREE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HoloIapItemCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HoloIapItemCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HoloIapItemCategory>() {
          public HoloIapItemCategory findValueByNumber(int number) {
            return HoloIapItemCategory.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(81);
  }

  private static final HoloIapItemCategory[] VALUES = values();

  public static HoloIapItemCategory valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HoloIapItemCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.HoloIapItemCategory)
}

