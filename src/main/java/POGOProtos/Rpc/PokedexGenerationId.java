// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.PokedexGenerationId}
 */
public enum PokedexGenerationId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POKEDEX_GENERATION_ID_GEN1 = 0;</code>
   */
  POKEDEX_GENERATION_ID_GEN1(0),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN2 = 1;</code>
   */
  POKEDEX_GENERATION_ID_GEN2(1),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN3 = 2;</code>
   */
  POKEDEX_GENERATION_ID_GEN3(2),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN4 = 3;</code>
   */
  POKEDEX_GENERATION_ID_GEN4(3),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN5 = 4;</code>
   */
  POKEDEX_GENERATION_ID_GEN5(4),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN6 = 5;</code>
   */
  POKEDEX_GENERATION_ID_GEN6(5),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN7 = 6;</code>
   */
  POKEDEX_GENERATION_ID_GEN7(6),
  /**
   * <code>POKEDEX_GENERATION_ID_GEN8 = 7;</code>
   */
  POKEDEX_GENERATION_ID_GEN8(7),
  /**
   * <code>POKEDEX_GENERATION_ID_MELTAN = 1001;</code>
   */
  POKEDEX_GENERATION_ID_MELTAN(1001),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POKEDEX_GENERATION_ID_GEN1 = 0;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN1_VALUE = 0;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN2 = 1;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN2_VALUE = 1;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN3 = 2;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN3_VALUE = 2;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN4 = 3;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN4_VALUE = 3;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN5 = 4;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN5_VALUE = 4;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN6 = 5;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN6_VALUE = 5;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN7 = 6;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN7_VALUE = 6;
  /**
   * <code>POKEDEX_GENERATION_ID_GEN8 = 7;</code>
   */
  public static final int POKEDEX_GENERATION_ID_GEN8_VALUE = 7;
  /**
   * <code>POKEDEX_GENERATION_ID_MELTAN = 1001;</code>
   */
  public static final int POKEDEX_GENERATION_ID_MELTAN_VALUE = 1001;


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
  public static PokedexGenerationId valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PokedexGenerationId forNumber(int value) {
    switch (value) {
      case 0: return POKEDEX_GENERATION_ID_GEN1;
      case 1: return POKEDEX_GENERATION_ID_GEN2;
      case 2: return POKEDEX_GENERATION_ID_GEN3;
      case 3: return POKEDEX_GENERATION_ID_GEN4;
      case 4: return POKEDEX_GENERATION_ID_GEN5;
      case 5: return POKEDEX_GENERATION_ID_GEN6;
      case 6: return POKEDEX_GENERATION_ID_GEN7;
      case 7: return POKEDEX_GENERATION_ID_GEN8;
      case 1001: return POKEDEX_GENERATION_ID_MELTAN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PokedexGenerationId>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PokedexGenerationId> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PokedexGenerationId>() {
          public PokedexGenerationId findValueByNumber(int number) {
            return PokedexGenerationId.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(18);
  }

  private static final PokedexGenerationId[] VALUES = values();

  public static PokedexGenerationId valueOf(
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

  private PokedexGenerationId(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PokedexGenerationId)
}

