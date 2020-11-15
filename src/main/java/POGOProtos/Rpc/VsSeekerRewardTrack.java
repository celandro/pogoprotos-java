// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.VsSeekerRewardTrack}
 */
public enum VsSeekerRewardTrack
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VS_SEEKER_REWARD_TRACK_FREE = 0;</code>
   */
  VS_SEEKER_REWARD_TRACK_FREE(0),
  /**
   * <code>VS_SEEKER_REWARD_TRACK_PREMIUM = 1;</code>
   */
  VS_SEEKER_REWARD_TRACK_PREMIUM(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VS_SEEKER_REWARD_TRACK_FREE = 0;</code>
   */
  public static final int VS_SEEKER_REWARD_TRACK_FREE_VALUE = 0;
  /**
   * <code>VS_SEEKER_REWARD_TRACK_PREMIUM = 1;</code>
   */
  public static final int VS_SEEKER_REWARD_TRACK_PREMIUM_VALUE = 1;


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
  public static VsSeekerRewardTrack valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VsSeekerRewardTrack forNumber(int value) {
    switch (value) {
      case 0: return VS_SEEKER_REWARD_TRACK_FREE;
      case 1: return VS_SEEKER_REWARD_TRACK_PREMIUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VsSeekerRewardTrack>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VsSeekerRewardTrack> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VsSeekerRewardTrack>() {
          public VsSeekerRewardTrack findValueByNumber(int number) {
            return VsSeekerRewardTrack.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(148);
  }

  private static final VsSeekerRewardTrack[] VALUES = values();

  public static VsSeekerRewardTrack valueOf(
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

  private VsSeekerRewardTrack(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.VsSeekerRewardTrack)
}

