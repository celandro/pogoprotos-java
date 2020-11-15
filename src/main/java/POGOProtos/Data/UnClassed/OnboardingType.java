// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/UnClassed/OnboardingType.proto

package POGOProtos.Data.UnClassed;

/**
 * Protobuf enum {@code POGOProtos.Data.UnClassed.OnboardingType}
 */
public enum OnboardingType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ONBOARDING_TYPE_UNSET = 0;</code>
   */
  ONBOARDING_TYPE_UNSET(0),
  /**
   * <code>ONBOARDING_TYPE_PROFILE = 1;</code>
   */
  ONBOARDING_TYPE_PROFILE(1),
  /**
   * <code>ONBOARDING_TYPE_FRIEND_LIST_V2 = 2;</code>
   */
  ONBOARDING_TYPE_FRIEND_LIST_V2(2),
  /**
   * <code>ONBOARDING_TYPE_ONLINE_STATUS_OVERVIEW = 3;</code>
   */
  ONBOARDING_TYPE_ONLINE_STATUS_OVERVIEW(3),
  /**
   * <code>ONBOARDING_TYPE_ONLINE_STATUS_TOGGLE = 4;</code>
   */
  ONBOARDING_TYPE_ONLINE_STATUS_TOGGLE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ONBOARDING_TYPE_UNSET = 0;</code>
   */
  public static final int ONBOARDING_TYPE_UNSET_VALUE = 0;
  /**
   * <code>ONBOARDING_TYPE_PROFILE = 1;</code>
   */
  public static final int ONBOARDING_TYPE_PROFILE_VALUE = 1;
  /**
   * <code>ONBOARDING_TYPE_FRIEND_LIST_V2 = 2;</code>
   */
  public static final int ONBOARDING_TYPE_FRIEND_LIST_V2_VALUE = 2;
  /**
   * <code>ONBOARDING_TYPE_ONLINE_STATUS_OVERVIEW = 3;</code>
   */
  public static final int ONBOARDING_TYPE_ONLINE_STATUS_OVERVIEW_VALUE = 3;
  /**
   * <code>ONBOARDING_TYPE_ONLINE_STATUS_TOGGLE = 4;</code>
   */
  public static final int ONBOARDING_TYPE_ONLINE_STATUS_TOGGLE_VALUE = 4;


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
  public static OnboardingType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OnboardingType forNumber(int value) {
    switch (value) {
      case 0: return ONBOARDING_TYPE_UNSET;
      case 1: return ONBOARDING_TYPE_PROFILE;
      case 2: return ONBOARDING_TYPE_FRIEND_LIST_V2;
      case 3: return ONBOARDING_TYPE_ONLINE_STATUS_OVERVIEW;
      case 4: return ONBOARDING_TYPE_ONLINE_STATUS_TOGGLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OnboardingType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OnboardingType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OnboardingType>() {
          public OnboardingType findValueByNumber(int number) {
            return OnboardingType.forNumber(number);
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
    return POGOProtos.Data.UnClassed.OnboardingTypeOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final OnboardingType[] VALUES = values();

  public static OnboardingType valueOf(
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

  private OnboardingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Data.UnClassed.OnboardingType)
}

