// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CurrencyType}
 */
public enum CurrencyType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CURRENCY_TYPE_UNKNOWN = 0;</code>
   */
  CURRENCY_TYPE_UNKNOWN(0),
  /**
   * <code>CURRENCY_TYPE_POKECOIN = 1;</code>
   */
  CURRENCY_TYPE_POKECOIN(1),
  /**
   * <code>CURRENCY_TYPE_STARDUST = 2;</code>
   */
  CURRENCY_TYPE_STARDUST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CURRENCY_TYPE_UNKNOWN = 0;</code>
   */
  public static final int CURRENCY_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>CURRENCY_TYPE_POKECOIN = 1;</code>
   */
  public static final int CURRENCY_TYPE_POKECOIN_VALUE = 1;
  /**
   * <code>CURRENCY_TYPE_STARDUST = 2;</code>
   */
  public static final int CURRENCY_TYPE_STARDUST_VALUE = 2;


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
  public static CurrencyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CurrencyType forNumber(int value) {
    switch (value) {
      case 0: return CURRENCY_TYPE_UNKNOWN;
      case 1: return CURRENCY_TYPE_POKECOIN;
      case 2: return CURRENCY_TYPE_STARDUST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CurrencyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CurrencyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CurrencyType>() {
          public CurrencyType findValueByNumber(int number) {
            return CurrencyType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(34);
  }

  private static final CurrencyType[] VALUES = values();

  public static CurrencyType valueOf(
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

  private CurrencyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CurrencyType)
}

