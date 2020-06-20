// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.CEIFMHJLDGE}
 */
public enum CEIFMHJLDGE
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CEIFMHJLDGE_DEFAULT = 0;</code>
   */
  CEIFMHJLDGE_DEFAULT(0),
  /**
   * <code>CEIFMHJLDGE_SHOULDER = 1;</code>
   */
  CEIFMHJLDGE_SHOULDER(1),
  /**
   * <code>CEIFMHJLDGE_ENEMY_POKEMON_FOCUS = 2;</code>
   */
  CEIFMHJLDGE_ENEMY_POKEMON_FOCUS(2),
  /**
   * <code>CEIFMHJLDGE_MY_POKEMON_FOCUS = 3;</code>
   */
  CEIFMHJLDGE_MY_POKEMON_FOCUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CEIFMHJLDGE_DEFAULT = 0;</code>
   */
  public static final int CEIFMHJLDGE_DEFAULT_VALUE = 0;
  /**
   * <code>CEIFMHJLDGE_SHOULDER = 1;</code>
   */
  public static final int CEIFMHJLDGE_SHOULDER_VALUE = 1;
  /**
   * <code>CEIFMHJLDGE_ENEMY_POKEMON_FOCUS = 2;</code>
   */
  public static final int CEIFMHJLDGE_ENEMY_POKEMON_FOCUS_VALUE = 2;
  /**
   * <code>CEIFMHJLDGE_MY_POKEMON_FOCUS = 3;</code>
   */
  public static final int CEIFMHJLDGE_MY_POKEMON_FOCUS_VALUE = 3;


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
  public static CEIFMHJLDGE valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CEIFMHJLDGE forNumber(int value) {
    switch (value) {
      case 0: return CEIFMHJLDGE_DEFAULT;
      case 1: return CEIFMHJLDGE_SHOULDER;
      case 2: return CEIFMHJLDGE_ENEMY_POKEMON_FOCUS;
      case 3: return CEIFMHJLDGE_MY_POKEMON_FOCUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CEIFMHJLDGE>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CEIFMHJLDGE> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CEIFMHJLDGE>() {
          public CEIFMHJLDGE findValueByNumber(int number) {
            return CEIFMHJLDGE.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(10);
  }

  private static final CEIFMHJLDGE[] VALUES = values();

  public static CEIFMHJLDGE valueOf(
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

  private CEIFMHJLDGE(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.CEIFMHJLDGE)
}

