// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DCJEGCGFANE
 * </pre>
 *
 * Protobuf enum {@code POGOProtos.Rpc.NewsPageTelemetryIds}
 */
public enum NewsPageTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_UNDEFINED_NEWS_EVENT = 0;</code>
   */
  NEWS_PAGE_TELEMETRY_IDS_UNDEFINED_NEWS_EVENT(0),
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_VIEWED = 1;</code>
   */
  NEWS_PAGE_TELEMETRY_IDS_NEWS_VIEWED(1),
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_DISMISSED = 2;</code>
   */
  NEWS_PAGE_TELEMETRY_IDS_NEWS_DISMISSED(2),
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_LINK_CLICKED = 3;</code>
   */
  NEWS_PAGE_TELEMETRY_IDS_NEWS_LINK_CLICKED(3),
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_UPDATED_APP = 4;</code>
   */
  NEWS_PAGE_TELEMETRY_IDS_NEWS_UPDATED_APP(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_UNDEFINED_NEWS_EVENT = 0;</code>
   */
  public static final int NEWS_PAGE_TELEMETRY_IDS_UNDEFINED_NEWS_EVENT_VALUE = 0;
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_VIEWED = 1;</code>
   */
  public static final int NEWS_PAGE_TELEMETRY_IDS_NEWS_VIEWED_VALUE = 1;
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_DISMISSED = 2;</code>
   */
  public static final int NEWS_PAGE_TELEMETRY_IDS_NEWS_DISMISSED_VALUE = 2;
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_LINK_CLICKED = 3;</code>
   */
  public static final int NEWS_PAGE_TELEMETRY_IDS_NEWS_LINK_CLICKED_VALUE = 3;
  /**
   * <code>NEWS_PAGE_TELEMETRY_IDS_NEWS_UPDATED_APP = 4;</code>
   */
  public static final int NEWS_PAGE_TELEMETRY_IDS_NEWS_UPDATED_APP_VALUE = 4;


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
  public static NewsPageTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NewsPageTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return NEWS_PAGE_TELEMETRY_IDS_UNDEFINED_NEWS_EVENT;
      case 1: return NEWS_PAGE_TELEMETRY_IDS_NEWS_VIEWED;
      case 2: return NEWS_PAGE_TELEMETRY_IDS_NEWS_DISMISSED;
      case 3: return NEWS_PAGE_TELEMETRY_IDS_NEWS_LINK_CLICKED;
      case 4: return NEWS_PAGE_TELEMETRY_IDS_NEWS_UPDATED_APP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NewsPageTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NewsPageTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NewsPageTelemetryIds>() {
          public NewsPageTelemetryIds findValueByNumber(int number) {
            return NewsPageTelemetryIds.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(44);
  }

  private static final NewsPageTelemetryIds[] VALUES = values();

  public static NewsPageTelemetryIds valueOf(
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

  private NewsPageTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NewsPageTelemetryIds)
}

