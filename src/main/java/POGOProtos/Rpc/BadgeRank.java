// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.BadgeRank}
 */
public enum BadgeRank
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BADGE_RANK_NONE = 0;</code>
   */
  BADGE_RANK_NONE(0),
  /**
   * <code>BADGE_RANK_BRONZE = 1;</code>
   */
  BADGE_RANK_BRONZE(1),
  /**
   * <code>BADGE_RANK_SILVER = 2;</code>
   */
  BADGE_RANK_SILVER(2),
  /**
   * <code>BADGE_RANK_GOLD = 3;</code>
   */
  BADGE_RANK_GOLD(3),
  /**
   * <code>BADGE_RANK_PLATINUM = 4;</code>
   */
  BADGE_RANK_PLATINUM(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BADGE_RANK_NONE = 0;</code>
   */
  public static final int BADGE_RANK_NONE_VALUE = 0;
  /**
   * <code>BADGE_RANK_BRONZE = 1;</code>
   */
  public static final int BADGE_RANK_BRONZE_VALUE = 1;
  /**
   * <code>BADGE_RANK_SILVER = 2;</code>
   */
  public static final int BADGE_RANK_SILVER_VALUE = 2;
  /**
   * <code>BADGE_RANK_GOLD = 3;</code>
   */
  public static final int BADGE_RANK_GOLD_VALUE = 3;
  /**
   * <code>BADGE_RANK_PLATINUM = 4;</code>
   */
  public static final int BADGE_RANK_PLATINUM_VALUE = 4;


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
  public static BadgeRank valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BadgeRank forNumber(int value) {
    switch (value) {
      case 0: return BADGE_RANK_NONE;
      case 1: return BADGE_RANK_BRONZE;
      case 2: return BADGE_RANK_SILVER;
      case 3: return BADGE_RANK_GOLD;
      case 4: return BADGE_RANK_PLATINUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BadgeRank>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BadgeRank> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BadgeRank>() {
          public BadgeRank findValueByNumber(int number) {
            return BadgeRank.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(13);
  }

  private static final BadgeRank[] VALUES = values();

  public static BadgeRank valueOf(
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

  private BadgeRank(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BadgeRank)
}

