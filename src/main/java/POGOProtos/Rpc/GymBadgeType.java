// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.GymBadgeType}
 */
public enum GymBadgeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_UNSET = 0;</code>
   */
  GYM_BADGE_TYPE_GYM_BADGE_UNSET(0),
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_VANILLA = 1;</code>
   */
  GYM_BADGE_TYPE_GYM_BADGE_VANILLA(1),
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_BRONZE = 2;</code>
   */
  GYM_BADGE_TYPE_GYM_BADGE_BRONZE(2),
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_SILVER = 3;</code>
   */
  GYM_BADGE_TYPE_GYM_BADGE_SILVER(3),
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_GOLD = 4;</code>
   */
  GYM_BADGE_TYPE_GYM_BADGE_GOLD(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_UNSET = 0;</code>
   */
  public static final int GYM_BADGE_TYPE_GYM_BADGE_UNSET_VALUE = 0;
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_VANILLA = 1;</code>
   */
  public static final int GYM_BADGE_TYPE_GYM_BADGE_VANILLA_VALUE = 1;
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_BRONZE = 2;</code>
   */
  public static final int GYM_BADGE_TYPE_GYM_BADGE_BRONZE_VALUE = 2;
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_SILVER = 3;</code>
   */
  public static final int GYM_BADGE_TYPE_GYM_BADGE_SILVER_VALUE = 3;
  /**
   * <code>GYM_BADGE_TYPE_GYM_BADGE_GOLD = 4;</code>
   */
  public static final int GYM_BADGE_TYPE_GYM_BADGE_GOLD_VALUE = 4;


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
  public static GymBadgeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GymBadgeType forNumber(int value) {
    switch (value) {
      case 0: return GYM_BADGE_TYPE_GYM_BADGE_UNSET;
      case 1: return GYM_BADGE_TYPE_GYM_BADGE_VANILLA;
      case 2: return GYM_BADGE_TYPE_GYM_BADGE_BRONZE;
      case 3: return GYM_BADGE_TYPE_GYM_BADGE_SILVER;
      case 4: return GYM_BADGE_TYPE_GYM_BADGE_GOLD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GymBadgeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GymBadgeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GymBadgeType>() {
          public GymBadgeType findValueByNumber(int number) {
            return GymBadgeType.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(46);
  }

  private static final GymBadgeType[] VALUES = values();

  public static GymBadgeType valueOf(
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

  private GymBadgeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GymBadgeType)
}

