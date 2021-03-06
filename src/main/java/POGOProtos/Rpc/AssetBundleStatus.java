// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf enum {@code POGOProtos.Rpc.AssetBundleStatus}
 */
public enum AssetBundleStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ASSET_BUNDLE_STATUS_UNLOADED = 0;</code>
   */
  ASSET_BUNDLE_STATUS_UNLOADED(0),
  /**
   * <code>ASSET_BUNDLE_STATUS_LOADING = 1;</code>
   */
  ASSET_BUNDLE_STATUS_LOADING(1),
  /**
   * <code>ASSET_BUNDLE_STATUS_LOADED = 2;</code>
   */
  ASSET_BUNDLE_STATUS_LOADED(2),
  /**
   * <code>ASSET_BUNDLE_STATUS_FAILED = 3;</code>
   */
  ASSET_BUNDLE_STATUS_FAILED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ASSET_BUNDLE_STATUS_UNLOADED = 0;</code>
   */
  public static final int ASSET_BUNDLE_STATUS_UNLOADED_VALUE = 0;
  /**
   * <code>ASSET_BUNDLE_STATUS_LOADING = 1;</code>
   */
  public static final int ASSET_BUNDLE_STATUS_LOADING_VALUE = 1;
  /**
   * <code>ASSET_BUNDLE_STATUS_LOADED = 2;</code>
   */
  public static final int ASSET_BUNDLE_STATUS_LOADED_VALUE = 2;
  /**
   * <code>ASSET_BUNDLE_STATUS_FAILED = 3;</code>
   */
  public static final int ASSET_BUNDLE_STATUS_FAILED_VALUE = 3;


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
  public static AssetBundleStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AssetBundleStatus forNumber(int value) {
    switch (value) {
      case 0: return ASSET_BUNDLE_STATUS_UNLOADED;
      case 1: return ASSET_BUNDLE_STATUS_LOADING;
      case 2: return ASSET_BUNDLE_STATUS_LOADED;
      case 3: return ASSET_BUNDLE_STATUS_FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AssetBundleStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AssetBundleStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AssetBundleStatus>() {
          public AssetBundleStatus findValueByNumber(int number) {
            return AssetBundleStatus.forNumber(number);
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
    return POGOProtos.Rpc.POGOProtosRpc.getDescriptor().getEnumTypes().get(9);
  }

  private static final AssetBundleStatus[] VALUES = values();

  public static AssetBundleStatus valueOf(
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

  private AssetBundleStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AssetBundleStatus)
}

