// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Enums/TelemetryIds.proto

package POGOProtos.Enums;

/**
 * Protobuf enum {@code POGOProtos.Enums.AssetTelemetryIds}
 */
public enum AssetTelemetryIds
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDEFINED_ASSET_EVENT = 0;</code>
   */
  UNDEFINED_ASSET_EVENT(0),
  /**
   * <code>DOWNLOAD_START = 1;</code>
   */
  DOWNLOAD_START(1),
  /**
   * <code>DOWNLOAD_FINISHED = 2;</code>
   */
  DOWNLOAD_FINISHED(2),
  /**
   * <code>DOWNLOAD_FAILED = 3;</code>
   */
  DOWNLOAD_FAILED(3),
  /**
   * <code>ASSET_RETRIEVED_FROM_CACHE = 4;</code>
   */
  ASSET_RETRIEVED_FROM_CACHE(4),
  /**
   * <code>CACHE_THRASH = 5;</code>
   */
  CACHE_THRASH(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDEFINED_ASSET_EVENT = 0;</code>
   */
  public static final int UNDEFINED_ASSET_EVENT_VALUE = 0;
  /**
   * <code>DOWNLOAD_START = 1;</code>
   */
  public static final int DOWNLOAD_START_VALUE = 1;
  /**
   * <code>DOWNLOAD_FINISHED = 2;</code>
   */
  public static final int DOWNLOAD_FINISHED_VALUE = 2;
  /**
   * <code>DOWNLOAD_FAILED = 3;</code>
   */
  public static final int DOWNLOAD_FAILED_VALUE = 3;
  /**
   * <code>ASSET_RETRIEVED_FROM_CACHE = 4;</code>
   */
  public static final int ASSET_RETRIEVED_FROM_CACHE_VALUE = 4;
  /**
   * <code>CACHE_THRASH = 5;</code>
   */
  public static final int CACHE_THRASH_VALUE = 5;


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
  public static AssetTelemetryIds valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AssetTelemetryIds forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED_ASSET_EVENT;
      case 1: return DOWNLOAD_START;
      case 2: return DOWNLOAD_FINISHED;
      case 3: return DOWNLOAD_FAILED;
      case 4: return ASSET_RETRIEVED_FROM_CACHE;
      case 5: return CACHE_THRASH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AssetTelemetryIds>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AssetTelemetryIds> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AssetTelemetryIds>() {
          public AssetTelemetryIds findValueByNumber(int number) {
            return AssetTelemetryIds.forNumber(number);
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
    return POGOProtos.Enums.TelemetryIds.getDescriptor().getEnumTypes().get(4);
  }

  private static final AssetTelemetryIds[] VALUES = values();

  public static AssetTelemetryIds valueOf(
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

  private AssetTelemetryIds(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Enums.AssetTelemetryIds)
}

