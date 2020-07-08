// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/IncidentLeaderStringTypes.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.IncidentLeaderStringTypes}
 */
public enum IncidentLeaderStringTypes
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ONBOARDING_INTRODUCTION = 0;</code>
   */
  ONBOARDING_INTRODUCTION(0),
  /**
   * <code>ONBOARDING_ENCOUNTER = 1;</code>
   */
  ONBOARDING_ENCOUNTER(1),
  /**
   * <code>ONBOARDING_SHADOW = 2;</code>
   */
  ONBOARDING_SHADOW(2),
  /**
   * <code>ONBOARDING_MAP_FRAGMENT = 3;</code>
   */
  ONBOARDING_MAP_FRAGMENT(3),
  /**
   * <code>ONBOARDING_MAP_1 = 4;</code>
   */
  ONBOARDING_MAP_1(4),
  /**
   * <code>ONBOARDING_MAP_2 = 5;</code>
   */
  ONBOARDING_MAP_2(5),
  /**
   * <code>INSPIRE = 6;</code>
   */
  INSPIRE(6),
  /**
   * <code>MAP_TIME_WARNING = 7;</code>
   */
  MAP_TIME_WARNING(7),
  /**
   * <code>MAP_EMPTY_WARNING = 8;</code>
   */
  MAP_EMPTY_WARNING(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ONBOARDING_INTRODUCTION = 0;</code>
   */
  public static final int ONBOARDING_INTRODUCTION_VALUE = 0;
  /**
   * <code>ONBOARDING_ENCOUNTER = 1;</code>
   */
  public static final int ONBOARDING_ENCOUNTER_VALUE = 1;
  /**
   * <code>ONBOARDING_SHADOW = 2;</code>
   */
  public static final int ONBOARDING_SHADOW_VALUE = 2;
  /**
   * <code>ONBOARDING_MAP_FRAGMENT = 3;</code>
   */
  public static final int ONBOARDING_MAP_FRAGMENT_VALUE = 3;
  /**
   * <code>ONBOARDING_MAP_1 = 4;</code>
   */
  public static final int ONBOARDING_MAP_1_VALUE = 4;
  /**
   * <code>ONBOARDING_MAP_2 = 5;</code>
   */
  public static final int ONBOARDING_MAP_2_VALUE = 5;
  /**
   * <code>INSPIRE = 6;</code>
   */
  public static final int INSPIRE_VALUE = 6;
  /**
   * <code>MAP_TIME_WARNING = 7;</code>
   */
  public static final int MAP_TIME_WARNING_VALUE = 7;
  /**
   * <code>MAP_EMPTY_WARNING = 8;</code>
   */
  public static final int MAP_EMPTY_WARNING_VALUE = 8;


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
  public static IncidentLeaderStringTypes valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IncidentLeaderStringTypes forNumber(int value) {
    switch (value) {
      case 0: return ONBOARDING_INTRODUCTION;
      case 1: return ONBOARDING_ENCOUNTER;
      case 2: return ONBOARDING_SHADOW;
      case 3: return ONBOARDING_MAP_FRAGMENT;
      case 4: return ONBOARDING_MAP_1;
      case 5: return ONBOARDING_MAP_2;
      case 6: return INSPIRE;
      case 7: return MAP_TIME_WARNING;
      case 8: return MAP_EMPTY_WARNING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IncidentLeaderStringTypes>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IncidentLeaderStringTypes> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IncidentLeaderStringTypes>() {
          public IncidentLeaderStringTypes findValueByNumber(int number) {
            return IncidentLeaderStringTypes.forNumber(number);
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
    return POGOProtos.Enums.IncidentLeaderStringTypesOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final IncidentLeaderStringTypes[] VALUES = values();

  public static IncidentLeaderStringTypes valueOf(
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

  private IncidentLeaderStringTypes(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.IncidentLeaderStringTypes)
}
