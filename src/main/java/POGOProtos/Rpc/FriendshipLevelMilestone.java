// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.FriendshipLevelMilestone}
 */
public enum FriendshipLevelMilestone
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET = 0;</code>
   */
  FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET(0),
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_0 = 1;</code>
   */
  FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_0(1),
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_1 = 2;</code>
   */
  FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_1(2),
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_2 = 3;</code>
   */
  FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_2(3),
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_3 = 4;</code>
   */
  FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_3(4),
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_4 = 5;</code>
   */
  FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_4(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET = 0;</code>
   */
  public static final int FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET_VALUE = 0;
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_0 = 1;</code>
   */
  public static final int FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_0_VALUE = 1;
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_1 = 2;</code>
   */
  public static final int FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_1_VALUE = 2;
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_2 = 3;</code>
   */
  public static final int FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_2_VALUE = 3;
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_3 = 4;</code>
   */
  public static final int FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_3_VALUE = 4;
  /**
   * <code>FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_4 = 5;</code>
   */
  public static final int FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_4_VALUE = 5;


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
  public static FriendshipLevelMilestone valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FriendshipLevelMilestone forNumber(int value) {
    switch (value) {
      case 0: return FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET;
      case 1: return FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_0;
      case 2: return FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_1;
      case 3: return FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_2;
      case 4: return FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_3;
      case 5: return FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_4;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FriendshipLevelMilestone>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FriendshipLevelMilestone> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FriendshipLevelMilestone>() {
          public FriendshipLevelMilestone findValueByNumber(int number) {
            return FriendshipLevelMilestone.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(75);
  }

  private static final FriendshipLevelMilestone[] VALUES = values();

  public static FriendshipLevelMilestone valueOf(
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

  private FriendshipLevelMilestone(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FriendshipLevelMilestone)
}

