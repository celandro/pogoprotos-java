// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.AdFeedbackLikeReason}
 */
public enum AdFeedbackLikeReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_INVALID = 0;</code>
   */
  AD_FEEDBACK_LIKE_REASON_INVALID(0),
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_CATEGORY = 1;</code>
   */
  AD_FEEDBACK_LIKE_REASON_CATEGORY(1),
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_SEE_MORE = 2;</code>
   */
  AD_FEEDBACK_LIKE_REASON_SEE_MORE(2),
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_MORE_SPONSORED_GIFTS = 3;</code>
   */
  AD_FEEDBACK_LIKE_REASON_MORE_SPONSORED_GIFTS(3),
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_OTHER = 4;</code>
   */
  AD_FEEDBACK_LIKE_REASON_OTHER(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AD_FEEDBACK_LIKE_REASON_INVALID = 0;</code>
   */
  public static final int AD_FEEDBACK_LIKE_REASON_INVALID_VALUE = 0;
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_CATEGORY = 1;</code>
   */
  public static final int AD_FEEDBACK_LIKE_REASON_CATEGORY_VALUE = 1;
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_SEE_MORE = 2;</code>
   */
  public static final int AD_FEEDBACK_LIKE_REASON_SEE_MORE_VALUE = 2;
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_MORE_SPONSORED_GIFTS = 3;</code>
   */
  public static final int AD_FEEDBACK_LIKE_REASON_MORE_SPONSORED_GIFTS_VALUE = 3;
  /**
   * <code>AD_FEEDBACK_LIKE_REASON_OTHER = 4;</code>
   */
  public static final int AD_FEEDBACK_LIKE_REASON_OTHER_VALUE = 4;


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
  public static AdFeedbackLikeReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdFeedbackLikeReason forNumber(int value) {
    switch (value) {
      case 0: return AD_FEEDBACK_LIKE_REASON_INVALID;
      case 1: return AD_FEEDBACK_LIKE_REASON_CATEGORY;
      case 2: return AD_FEEDBACK_LIKE_REASON_SEE_MORE;
      case 3: return AD_FEEDBACK_LIKE_REASON_MORE_SPONSORED_GIFTS;
      case 4: return AD_FEEDBACK_LIKE_REASON_OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdFeedbackLikeReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdFeedbackLikeReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdFeedbackLikeReason>() {
          public AdFeedbackLikeReason findValueByNumber(int number) {
            return AdFeedbackLikeReason.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(2);
  }

  private static final AdFeedbackLikeReason[] VALUES = values();

  public static AdFeedbackLikeReason valueOf(
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

  private AdFeedbackLikeReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AdFeedbackLikeReason)
}

