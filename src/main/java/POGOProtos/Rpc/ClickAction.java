// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.ClickAction}
 */
public enum ClickAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLICK_ACTION_NEWS_FEED = 0;</code>
   */
  CLICK_ACTION_NEWS_FEED(0),
  /**
   * <code>CLICK_ACTION_URI = 1;</code>
   */
  CLICK_ACTION_URI(1),
  /**
   * <code>CLICK_ACTION_NONE = 2;</code>
   */
  CLICK_ACTION_NONE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLICK_ACTION_NEWS_FEED = 0;</code>
   */
  public static final int CLICK_ACTION_NEWS_FEED_VALUE = 0;
  /**
   * <code>CLICK_ACTION_URI = 1;</code>
   */
  public static final int CLICK_ACTION_URI_VALUE = 1;
  /**
   * <code>CLICK_ACTION_NONE = 2;</code>
   */
  public static final int CLICK_ACTION_NONE_VALUE = 2;


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
  public static ClickAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClickAction forNumber(int value) {
    switch (value) {
      case 0: return CLICK_ACTION_NEWS_FEED;
      case 1: return CLICK_ACTION_URI;
      case 2: return CLICK_ACTION_NONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClickAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClickAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClickAction>() {
          public ClickAction findValueByNumber(int number) {
            return ClickAction.forNumber(number);
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
    return POGOProtos.Rpc.Rpc.getDescriptor().getEnumTypes().get(30);
  }

  private static final ClickAction[] VALUES = values();

  public static ClickAction valueOf(
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

  private ClickAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.ClickAction)
}

