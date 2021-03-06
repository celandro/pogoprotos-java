// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.SponsorPoiInvalidReason}
 */
public enum SponsorPoiInvalidReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_UNSPECIFIED = 0;</code>
   */
  SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_UNSPECIFIED(0),
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_DOES_NOT_EXIST = 1;</code>
   */
  SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_DOES_NOT_EXIST(1),
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_SAFE = 2;</code>
   */
  SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_SAFE(2),
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_TRUTHFUL = 3;</code>
   */
  SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_TRUTHFUL(3),
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_FAMILY_FRIENDLY = 4;</code>
   */
  SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_FAMILY_FRIENDLY(4),
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_OFFENSIVE_CONTENT = 5;</code>
   */
  SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_OFFENSIVE_CONTENT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_DOES_NOT_EXIST = 1;</code>
   */
  public static final int SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_DOES_NOT_EXIST_VALUE = 1;
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_SAFE = 2;</code>
   */
  public static final int SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_SAFE_VALUE = 2;
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_TRUTHFUL = 3;</code>
   */
  public static final int SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_TRUTHFUL_VALUE = 3;
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_FAMILY_FRIENDLY = 4;</code>
   */
  public static final int SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_FAMILY_FRIENDLY_VALUE = 4;
  /**
   * <code>SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_OFFENSIVE_CONTENT = 5;</code>
   */
  public static final int SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_OFFENSIVE_CONTENT_VALUE = 5;


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
  public static SponsorPoiInvalidReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SponsorPoiInvalidReason forNumber(int value) {
    switch (value) {
      case 0: return SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_UNSPECIFIED;
      case 1: return SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_DOES_NOT_EXIST;
      case 2: return SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_SAFE;
      case 3: return SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_TRUTHFUL;
      case 4: return SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_NOT_FAMILY_FRIENDLY;
      case 5: return SPONSOR_POI_INVALID_REASON_SPONSOR_POI_REASON_OFFENSIVE_CONTENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SponsorPoiInvalidReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SponsorPoiInvalidReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SponsorPoiInvalidReason>() {
          public SponsorPoiInvalidReason findValueByNumber(int number) {
            return SponsorPoiInvalidReason.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(142);
  }

  private static final SponsorPoiInvalidReason[] VALUES = values();

  public static SponsorPoiInvalidReason valueOf(
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

  private SponsorPoiInvalidReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.SponsorPoiInvalidReason)
}

