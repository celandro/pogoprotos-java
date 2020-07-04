// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.ShoppingPageScrollIds}
 */
public enum ShoppingPageScrollIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SHOPPING_PAGE_SCROLL_IDS_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE = 0;</code>
   */
  SHOPPING_PAGE_SCROLL_IDS_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE(0),
  /**
   * <code>SHOPPING_PAGE_SCROLL_IDS_LAST_SCROLL = 1;</code>
   */
  SHOPPING_PAGE_SCROLL_IDS_LAST_SCROLL(1),
  /**
   * <code>SHOPPING_PAGE_SCROLL_IDS_MAX_SCROLL = 2;</code>
   */
  SHOPPING_PAGE_SCROLL_IDS_MAX_SCROLL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SHOPPING_PAGE_SCROLL_IDS_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE = 0;</code>
   */
  public static final int SHOPPING_PAGE_SCROLL_IDS_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE_VALUE = 0;
  /**
   * <code>SHOPPING_PAGE_SCROLL_IDS_LAST_SCROLL = 1;</code>
   */
  public static final int SHOPPING_PAGE_SCROLL_IDS_LAST_SCROLL_VALUE = 1;
  /**
   * <code>SHOPPING_PAGE_SCROLL_IDS_MAX_SCROLL = 2;</code>
   */
  public static final int SHOPPING_PAGE_SCROLL_IDS_MAX_SCROLL_VALUE = 2;


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
  public static ShoppingPageScrollIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ShoppingPageScrollIds forNumber(int value) {
    switch (value) {
      case 0: return SHOPPING_PAGE_SCROLL_IDS_UNDEFINED_SHOPPING_PAGE_SCROLL_TYPE;
      case 1: return SHOPPING_PAGE_SCROLL_IDS_LAST_SCROLL;
      case 2: return SHOPPING_PAGE_SCROLL_IDS_MAX_SCROLL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ShoppingPageScrollIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ShoppingPageScrollIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ShoppingPageScrollIds>() {
          public ShoppingPageScrollIds findValueByNumber(int number) {
            return ShoppingPageScrollIds.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(98);
  }

  private static final ShoppingPageScrollIds[] VALUES = values();

  public static ShoppingPageScrollIds valueOf(
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

  private ShoppingPageScrollIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ShoppingPageScrollIds)
}
