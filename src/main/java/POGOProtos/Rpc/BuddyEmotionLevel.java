// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BuddyEmotionLevel}
 */
public enum BuddyEmotionLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BUDDY_EMOTION_LEVEL_UNSET = 0;</code>
   */
  BUDDY_EMOTION_LEVEL_UNSET(0),
  /**
   * <code>BUDDY_EMOTION_LEVEL_0 = 1;</code>
   */
  BUDDY_EMOTION_LEVEL_0(1),
  /**
   * <code>BUDDY_EMOTION_LEVEL_1 = 2;</code>
   */
  BUDDY_EMOTION_LEVEL_1(2),
  /**
   * <code>BUDDY_EMOTION_LEVEL_2 = 3;</code>
   */
  BUDDY_EMOTION_LEVEL_2(3),
  /**
   * <code>BUDDY_EMOTION_LEVEL_3 = 4;</code>
   */
  BUDDY_EMOTION_LEVEL_3(4),
  /**
   * <code>BUDDY_EMOTION_LEVEL_4 = 5;</code>
   */
  BUDDY_EMOTION_LEVEL_4(5),
  /**
   * <code>BUDDY_EMOTION_LEVEL_5 = 6;</code>
   */
  BUDDY_EMOTION_LEVEL_5(6),
  /**
   * <code>BUDDY_EMOTION_LEVEL_6 = 7;</code>
   */
  BUDDY_EMOTION_LEVEL_6(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BUDDY_EMOTION_LEVEL_UNSET = 0;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_UNSET_VALUE = 0;
  /**
   * <code>BUDDY_EMOTION_LEVEL_0 = 1;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_0_VALUE = 1;
  /**
   * <code>BUDDY_EMOTION_LEVEL_1 = 2;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_1_VALUE = 2;
  /**
   * <code>BUDDY_EMOTION_LEVEL_2 = 3;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_2_VALUE = 3;
  /**
   * <code>BUDDY_EMOTION_LEVEL_3 = 4;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_3_VALUE = 4;
  /**
   * <code>BUDDY_EMOTION_LEVEL_4 = 5;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_4_VALUE = 5;
  /**
   * <code>BUDDY_EMOTION_LEVEL_5 = 6;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_5_VALUE = 6;
  /**
   * <code>BUDDY_EMOTION_LEVEL_6 = 7;</code>
   */
  public static final int BUDDY_EMOTION_LEVEL_6_VALUE = 7;


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
  public static BuddyEmotionLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BuddyEmotionLevel forNumber(int value) {
    switch (value) {
      case 0: return BUDDY_EMOTION_LEVEL_UNSET;
      case 1: return BUDDY_EMOTION_LEVEL_0;
      case 2: return BUDDY_EMOTION_LEVEL_1;
      case 3: return BUDDY_EMOTION_LEVEL_2;
      case 4: return BUDDY_EMOTION_LEVEL_3;
      case 5: return BUDDY_EMOTION_LEVEL_4;
      case 6: return BUDDY_EMOTION_LEVEL_5;
      case 7: return BUDDY_EMOTION_LEVEL_6;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BuddyEmotionLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BuddyEmotionLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BuddyEmotionLevel>() {
          public BuddyEmotionLevel findValueByNumber(int number) {
            return BuddyEmotionLevel.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(22);
  }

  private static final BuddyEmotionLevel[] VALUES = values();

  public static BuddyEmotionLevel valueOf(
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

  private BuddyEmotionLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BuddyEmotionLevel)
}

