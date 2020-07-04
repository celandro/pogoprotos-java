// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AssetDigestRequestProto}
 */
public  final class AssetDigestRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AssetDigestRequestProto)
    AssetDigestRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetDigestRequestProto.newBuilder() to construct.
  private AssetDigestRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetDigestRequestProto() {
    platform_ = 0;
    deviceManufacturer_ = "";
    deviceModel_ = "";
    locale_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetDigestRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetDigestRequestProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            platform_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceManufacturer_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceModel_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            locale_ = s;
            break;
          }
          case 40: {

            appVersion_ = input.readUInt32();
            break;
          }
          case 48: {

            paginate_ = input.readBool();
            break;
          }
          case 56: {

            pageOffset_ = input.readInt32();
            break;
          }
          case 64: {

            pageTimestamp_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AssetDigestRequestProto.class, POGOProtos.Rpc.AssetDigestRequestProto.Builder.class);
  }

  public static final int PLATFORM_FIELD_NUMBER = 1;
  private int platform_;
  /**
   * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
   * @return The enum numeric value on the wire for platform.
   */
  public int getPlatformValue() {
    return platform_;
  }
  /**
   * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
   * @return The platform.
   */
  public POGOProtos.Rpc.Platform getPlatform() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Platform result = POGOProtos.Rpc.Platform.valueOf(platform_);
    return result == null ? POGOProtos.Rpc.Platform.UNRECOGNIZED : result;
  }

  public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 2;
  private volatile java.lang.Object deviceManufacturer_;
  /**
   * <code>string device_manufacturer = 2;</code>
   * @return The deviceManufacturer.
   */
  public java.lang.String getDeviceManufacturer() {
    java.lang.Object ref = deviceManufacturer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceManufacturer_ = s;
      return s;
    }
  }
  /**
   * <code>string device_manufacturer = 2;</code>
   * @return The bytes for deviceManufacturer.
   */
  public com.google.protobuf.ByteString
      getDeviceManufacturerBytes() {
    java.lang.Object ref = deviceManufacturer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceManufacturer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
  private volatile java.lang.Object deviceModel_;
  /**
   * <code>string device_model = 3;</code>
   * @return The deviceModel.
   */
  public java.lang.String getDeviceModel() {
    java.lang.Object ref = deviceModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceModel_ = s;
      return s;
    }
  }
  /**
   * <code>string device_model = 3;</code>
   * @return The bytes for deviceModel.
   */
  public com.google.protobuf.ByteString
      getDeviceModelBytes() {
    java.lang.Object ref = deviceModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceModel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCALE_FIELD_NUMBER = 4;
  private volatile java.lang.Object locale_;
  /**
   * <code>string locale = 4;</code>
   * @return The locale.
   */
  public java.lang.String getLocale() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locale_ = s;
      return s;
    }
  }
  /**
   * <code>string locale = 4;</code>
   * @return The bytes for locale.
   */
  public com.google.protobuf.ByteString
      getLocaleBytes() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_VERSION_FIELD_NUMBER = 5;
  private int appVersion_;
  /**
   * <code>uint32 app_version = 5;</code>
   * @return The appVersion.
   */
  public int getAppVersion() {
    return appVersion_;
  }

  public static final int PAGINATE_FIELD_NUMBER = 6;
  private boolean paginate_;
  /**
   * <code>bool paginate = 6;</code>
   * @return The paginate.
   */
  public boolean getPaginate() {
    return paginate_;
  }

  public static final int PAGE_OFFSET_FIELD_NUMBER = 7;
  private int pageOffset_;
  /**
   * <code>int32 page_offset = 7;</code>
   * @return The pageOffset.
   */
  public int getPageOffset() {
    return pageOffset_;
  }

  public static final int PAGE_TIMESTAMP_FIELD_NUMBER = 8;
  private long pageTimestamp_;
  /**
   * <code>uint64 page_timestamp = 8;</code>
   * @return The pageTimestamp.
   */
  public long getPageTimestamp() {
    return pageTimestamp_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (platform_ != POGOProtos.Rpc.Platform.PLATFORM_PLATFORM_UNSET.getNumber()) {
      output.writeEnum(1, platform_);
    }
    if (!getDeviceManufacturerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceManufacturer_);
    }
    if (!getDeviceModelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceModel_);
    }
    if (!getLocaleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, locale_);
    }
    if (appVersion_ != 0) {
      output.writeUInt32(5, appVersion_);
    }
    if (paginate_ != false) {
      output.writeBool(6, paginate_);
    }
    if (pageOffset_ != 0) {
      output.writeInt32(7, pageOffset_);
    }
    if (pageTimestamp_ != 0L) {
      output.writeUInt64(8, pageTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (platform_ != POGOProtos.Rpc.Platform.PLATFORM_PLATFORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, platform_);
    }
    if (!getDeviceManufacturerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceManufacturer_);
    }
    if (!getDeviceModelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceModel_);
    }
    if (!getLocaleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, locale_);
    }
    if (appVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, appVersion_);
    }
    if (paginate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, paginate_);
    }
    if (pageOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, pageOffset_);
    }
    if (pageTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(8, pageTimestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Rpc.AssetDigestRequestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AssetDigestRequestProto other = (POGOProtos.Rpc.AssetDigestRequestProto) obj;

    if (platform_ != other.platform_) return false;
    if (!getDeviceManufacturer()
        .equals(other.getDeviceManufacturer())) return false;
    if (!getDeviceModel()
        .equals(other.getDeviceModel())) return false;
    if (!getLocale()
        .equals(other.getLocale())) return false;
    if (getAppVersion()
        != other.getAppVersion()) return false;
    if (getPaginate()
        != other.getPaginate()) return false;
    if (getPageOffset()
        != other.getPageOffset()) return false;
    if (getPageTimestamp()
        != other.getPageTimestamp()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + platform_;
    hash = (37 * hash) + DEVICE_MANUFACTURER_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceManufacturer().hashCode();
    hash = (37 * hash) + DEVICE_MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceModel().hashCode();
    hash = (37 * hash) + LOCALE_FIELD_NUMBER;
    hash = (53 * hash) + getLocale().hashCode();
    hash = (37 * hash) + APP_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getAppVersion();
    hash = (37 * hash) + PAGINATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPaginate());
    hash = (37 * hash) + PAGE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getPageOffset();
    hash = (37 * hash) + PAGE_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AssetDigestRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(POGOProtos.Rpc.AssetDigestRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code POGOProtos.Rpc.AssetDigestRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AssetDigestRequestProto)
      POGOProtos.Rpc.AssetDigestRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AssetDigestRequestProto.class, POGOProtos.Rpc.AssetDigestRequestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AssetDigestRequestProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      platform_ = 0;

      deviceManufacturer_ = "";

      deviceModel_ = "";

      locale_ = "";

      appVersion_ = 0;

      paginate_ = false;

      pageOffset_ = 0;

      pageTimestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestRequestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestRequestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AssetDigestRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestRequestProto build() {
      POGOProtos.Rpc.AssetDigestRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestRequestProto buildPartial() {
      POGOProtos.Rpc.AssetDigestRequestProto result = new POGOProtos.Rpc.AssetDigestRequestProto(this);
      result.platform_ = platform_;
      result.deviceManufacturer_ = deviceManufacturer_;
      result.deviceModel_ = deviceModel_;
      result.locale_ = locale_;
      result.appVersion_ = appVersion_;
      result.paginate_ = paginate_;
      result.pageOffset_ = pageOffset_;
      result.pageTimestamp_ = pageTimestamp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof POGOProtos.Rpc.AssetDigestRequestProto) {
        return mergeFrom((POGOProtos.Rpc.AssetDigestRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AssetDigestRequestProto other) {
      if (other == POGOProtos.Rpc.AssetDigestRequestProto.getDefaultInstance()) return this;
      if (other.platform_ != 0) {
        setPlatformValue(other.getPlatformValue());
      }
      if (!other.getDeviceManufacturer().isEmpty()) {
        deviceManufacturer_ = other.deviceManufacturer_;
        onChanged();
      }
      if (!other.getDeviceModel().isEmpty()) {
        deviceModel_ = other.deviceModel_;
        onChanged();
      }
      if (!other.getLocale().isEmpty()) {
        locale_ = other.locale_;
        onChanged();
      }
      if (other.getAppVersion() != 0) {
        setAppVersion(other.getAppVersion());
      }
      if (other.getPaginate() != false) {
        setPaginate(other.getPaginate());
      }
      if (other.getPageOffset() != 0) {
        setPageOffset(other.getPageOffset());
      }
      if (other.getPageTimestamp() != 0L) {
        setPageTimestamp(other.getPageTimestamp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      POGOProtos.Rpc.AssetDigestRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AssetDigestRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int platform_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
     * @return The enum numeric value on the wire for platform.
     */
    public int getPlatformValue() {
      return platform_;
    }
    /**
     * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
     * @param value The enum numeric value on the wire for platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatformValue(int value) {
      platform_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
     * @return The platform.
     */
    public POGOProtos.Rpc.Platform getPlatform() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Platform result = POGOProtos.Rpc.Platform.valueOf(platform_);
      return result == null ? POGOProtos.Rpc.Platform.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
     * @param value The platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatform(POGOProtos.Rpc.Platform value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      platform_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Platform platform = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlatform() {
      
      platform_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object deviceManufacturer_ = "";
    /**
     * <code>string device_manufacturer = 2;</code>
     * @return The deviceManufacturer.
     */
    public java.lang.String getDeviceManufacturer() {
      java.lang.Object ref = deviceManufacturer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceManufacturer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_manufacturer = 2;</code>
     * @return The bytes for deviceManufacturer.
     */
    public com.google.protobuf.ByteString
        getDeviceManufacturerBytes() {
      java.lang.Object ref = deviceManufacturer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceManufacturer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_manufacturer = 2;</code>
     * @param value The deviceManufacturer to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceManufacturer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceManufacturer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_manufacturer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceManufacturer() {
      
      deviceManufacturer_ = getDefaultInstance().getDeviceManufacturer();
      onChanged();
      return this;
    }
    /**
     * <code>string device_manufacturer = 2;</code>
     * @param value The bytes for deviceManufacturer to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceManufacturerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceManufacturer_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deviceModel_ = "";
    /**
     * <code>string device_model = 3;</code>
     * @return The deviceModel.
     */
    public java.lang.String getDeviceModel() {
      java.lang.Object ref = deviceModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_model = 3;</code>
     * @return The bytes for deviceModel.
     */
    public com.google.protobuf.ByteString
        getDeviceModelBytes() {
      java.lang.Object ref = deviceModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_model = 3;</code>
     * @param value The deviceModel to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_model = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceModel() {
      
      deviceModel_ = getDefaultInstance().getDeviceModel();
      onChanged();
      return this;
    }
    /**
     * <code>string device_model = 3;</code>
     * @param value The bytes for deviceModel to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceModel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object locale_ = "";
    /**
     * <code>string locale = 4;</code>
     * @return The locale.
     */
    public java.lang.String getLocale() {
      java.lang.Object ref = locale_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locale_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string locale = 4;</code>
     * @return The bytes for locale.
     */
    public com.google.protobuf.ByteString
        getLocaleBytes() {
      java.lang.Object ref = locale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string locale = 4;</code>
     * @param value The locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocale(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      locale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string locale = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocale() {
      
      locale_ = getDefaultInstance().getLocale();
      onChanged();
      return this;
    }
    /**
     * <code>string locale = 4;</code>
     * @param value The bytes for locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      locale_ = value;
      onChanged();
      return this;
    }

    private int appVersion_ ;
    /**
     * <code>uint32 app_version = 5;</code>
     * @return The appVersion.
     */
    public int getAppVersion() {
      return appVersion_;
    }
    /**
     * <code>uint32 app_version = 5;</code>
     * @param value The appVersion to set.
     * @return This builder for chaining.
     */
    public Builder setAppVersion(int value) {
      
      appVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 app_version = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppVersion() {
      
      appVersion_ = 0;
      onChanged();
      return this;
    }

    private boolean paginate_ ;
    /**
     * <code>bool paginate = 6;</code>
     * @return The paginate.
     */
    public boolean getPaginate() {
      return paginate_;
    }
    /**
     * <code>bool paginate = 6;</code>
     * @param value The paginate to set.
     * @return This builder for chaining.
     */
    public Builder setPaginate(boolean value) {
      
      paginate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool paginate = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPaginate() {
      
      paginate_ = false;
      onChanged();
      return this;
    }

    private int pageOffset_ ;
    /**
     * <code>int32 page_offset = 7;</code>
     * @return The pageOffset.
     */
    public int getPageOffset() {
      return pageOffset_;
    }
    /**
     * <code>int32 page_offset = 7;</code>
     * @param value The pageOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPageOffset(int value) {
      
      pageOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_offset = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageOffset() {
      
      pageOffset_ = 0;
      onChanged();
      return this;
    }

    private long pageTimestamp_ ;
    /**
     * <code>uint64 page_timestamp = 8;</code>
     * @return The pageTimestamp.
     */
    public long getPageTimestamp() {
      return pageTimestamp_;
    }
    /**
     * <code>uint64 page_timestamp = 8;</code>
     * @param value The pageTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setPageTimestamp(long value) {
      
      pageTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 page_timestamp = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageTimestamp() {
      
      pageTimestamp_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AssetDigestRequestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AssetDigestRequestProto)
  private static final POGOProtos.Rpc.AssetDigestRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AssetDigestRequestProto();
  }

  public static POGOProtos.Rpc.AssetDigestRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetDigestRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<AssetDigestRequestProto>() {
    @java.lang.Override
    public AssetDigestRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetDigestRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetDigestRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetDigestRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AssetDigestRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

