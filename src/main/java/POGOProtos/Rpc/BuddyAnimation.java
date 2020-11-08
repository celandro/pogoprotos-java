// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BuddyAnimation}
 */
public enum BuddyAnimation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BUDDY_ANIMATION_BUDDY_ANIMATION_UNSET = 0;</code>
   */
  BUDDY_ANIMATION_BUDDY_ANIMATION_UNSET(0),
  /**
   * <code>BUDDY_ANIMATION_BUDDY_ANIMATION_HAPPY = 1;</code>
   */
  BUDDY_ANIMATION_BUDDY_ANIMATION_HAPPY(1),
  /**
   * <code>BUDDY_ANIMATION_BUDDY_ANIMATION_HATE = 2;</code>
   */
  BUDDY_ANIMATION_BUDDY_ANIMATION_HATE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BUDDY_ANIMATION_BUDDY_ANIMATION_UNSET = 0;</code>
   */
  public static final int BUDDY_ANIMATION_BUDDY_ANIMATION_UNSET_VALUE = 0;
  /**
   * <code>BUDDY_ANIMATION_BUDDY_ANIMATION_HAPPY = 1;</code>
   */
  public static final int BUDDY_ANIMATION_BUDDY_ANIMATION_HAPPY_VALUE = 1;
  /**
   * <code>BUDDY_ANIMATION_BUDDY_ANIMATION_HATE = 2;</code>
   */
  public static final int BUDDY_ANIMATION_BUDDY_ANIMATION_HATE_VALUE = 2;


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
  public static BuddyAnimation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BuddyAnimation forNumber(int value) {
    switch (value) {
      case 0: return BUDDY_ANIMATION_BUDDY_ANIMATION_UNSET;
      case 1: return BUDDY_ANIMATION_BUDDY_ANIMATION_HAPPY;
      case 2: return BUDDY_ANIMATION_BUDDY_ANIMATION_HATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BuddyAnimation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BuddyAnimation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BuddyAnimation>() {
          public BuddyAnimation findValueByNumber(int number) {
            return BuddyAnimation.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(20);
  }

  private static final BuddyAnimation[] VALUES = values();

  public static BuddyAnimation valueOf(
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

  private BuddyAnimation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BuddyAnimation)
}

