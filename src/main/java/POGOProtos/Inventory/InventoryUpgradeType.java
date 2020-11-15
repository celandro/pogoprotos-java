// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/InventoryUpgradeType.proto

package POGOProtos.Inventory;

/**
 * Protobuf enum {@code POGOProtos.Inventory.InventoryUpgradeType}
 */
public enum InventoryUpgradeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UPGRADE_UNSET = 0;</code>
   */
  UPGRADE_UNSET(0),
  /**
   * <code>INCREASE_ITEM_STORAGE = 1;</code>
   */
  INCREASE_ITEM_STORAGE(1),
  /**
   * <code>INCREASE_POKEMON_STORAGE = 2;</code>
   */
  INCREASE_POKEMON_STORAGE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UPGRADE_UNSET = 0;</code>
   */
  public static final int UPGRADE_UNSET_VALUE = 0;
  /**
   * <code>INCREASE_ITEM_STORAGE = 1;</code>
   */
  public static final int INCREASE_ITEM_STORAGE_VALUE = 1;
  /**
   * <code>INCREASE_POKEMON_STORAGE = 2;</code>
   */
  public static final int INCREASE_POKEMON_STORAGE_VALUE = 2;


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
  public static InventoryUpgradeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InventoryUpgradeType forNumber(int value) {
    switch (value) {
      case 0: return UPGRADE_UNSET;
      case 1: return INCREASE_ITEM_STORAGE;
      case 2: return INCREASE_POKEMON_STORAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InventoryUpgradeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InventoryUpgradeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InventoryUpgradeType>() {
          public InventoryUpgradeType findValueByNumber(int number) {
            return InventoryUpgradeType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return POGOProtos.Inventory.InventoryUpgradeTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final InventoryUpgradeType[] VALUES = values();

  public static InventoryUpgradeType valueOf(
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

  private InventoryUpgradeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Inventory.InventoryUpgradeType)
}

