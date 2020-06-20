// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.KOMPLOGGLOK}
 */
public enum KOMPLOGGLOK
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>KOMPLOGGLOK_UNKNOWN = 0;</code>
   */
  KOMPLOGGLOK_UNKNOWN(0),
  /**
   * <code>KOMPLOGGLOK_POKECOIN = 1;</code>
   */
  KOMPLOGGLOK_POKECOIN(1),
  /**
   * <code>KOMPLOGGLOK_STARDUST = 2;</code>
   */
  KOMPLOGGLOK_STARDUST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>KOMPLOGGLOK_UNKNOWN = 0;</code>
   */
  public static final int KOMPLOGGLOK_UNKNOWN_VALUE = 0;
  /**
   * <code>KOMPLOGGLOK_POKECOIN = 1;</code>
   */
  public static final int KOMPLOGGLOK_POKECOIN_VALUE = 1;
  /**
   * <code>KOMPLOGGLOK_STARDUST = 2;</code>
   */
  public static final int KOMPLOGGLOK_STARDUST_VALUE = 2;


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
  public static KOMPLOGGLOK valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static KOMPLOGGLOK forNumber(int value) {
    switch (value) {
      case 0: return KOMPLOGGLOK_UNKNOWN;
      case 1: return KOMPLOGGLOK_POKECOIN;
      case 2: return KOMPLOGGLOK_STARDUST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KOMPLOGGLOK>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KOMPLOGGLOK> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KOMPLOGGLOK>() {
          public KOMPLOGGLOK findValueByNumber(int number) {
            return KOMPLOGGLOK.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(78);
  }

  private static final KOMPLOGGLOK[] VALUES = values();

  public static KOMPLOGGLOK valueOf(
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

  private KOMPLOGGLOK(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KOMPLOGGLOK)
}

