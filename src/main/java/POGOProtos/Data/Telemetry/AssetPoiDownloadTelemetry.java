// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/AssetPoiDownloadTelemetry.proto

package POGOProtos.Data.Telemetry;

/**
 * Protobuf type {@code POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry}
 */
public  final class AssetPoiDownloadTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry)
    AssetPoiDownloadTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetPoiDownloadTelemetry.newBuilder() to construct.
  private AssetPoiDownloadTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetPoiDownloadTelemetry() {
    assetEventId_ = 0;
    fortId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetPoiDownloadTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetPoiDownloadTelemetry(
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

            assetEventId_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fortId_ = s;
            break;
          }
          case 24: {

            size_ = input.readUInt32();
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
    return POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetPoiDownloadTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetPoiDownloadTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.class, POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.Builder.class);
  }

  public static final int ASSET_EVENT_ID_FIELD_NUMBER = 1;
  private int assetEventId_;
  /**
   * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The enum numeric value on the wire for assetEventId.
   */
  public int getAssetEventIdValue() {
    return assetEventId_;
  }
  /**
   * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
   * @return The assetEventId.
   */
  public POGOProtos.Enums.AssetTelemetryIds getAssetEventId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.AssetTelemetryIds result = POGOProtos.Enums.AssetTelemetryIds.valueOf(assetEventId_);
    return result == null ? POGOProtos.Enums.AssetTelemetryIds.UNRECOGNIZED : result;
  }

  public static final int FORT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object fortId_;
  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  public java.lang.String getFortId() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fortId_ = s;
      return s;
    }
  }
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  public com.google.protobuf.ByteString
      getFortIdBytes() {
    java.lang.Object ref = fortId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fortId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_;
  /**
   * <code>uint32 size = 3;</code>
   * @return The size.
   */
  public int getSize() {
    return size_;
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
    if (assetEventId_ != POGOProtos.Enums.AssetTelemetryIds.UNDEFINED_ASSET_EVENT.getNumber()) {
      output.writeEnum(1, assetEventId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fortId_);
    }
    if (size_ != 0) {
      output.writeUInt32(3, size_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetEventId_ != POGOProtos.Enums.AssetTelemetryIds.UNDEFINED_ASSET_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, assetEventId_);
    }
    if (!getFortIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fortId_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, size_);
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
    if (!(obj instanceof POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry other = (POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry) obj;

    if (assetEventId_ != other.assetEventId_) return false;
    if (!getFortId()
        .equals(other.getFortId())) return false;
    if (getSize()
        != other.getSize()) return false;
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
    hash = (37 * hash) + ASSET_EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + assetEventId_;
    hash = (37 * hash) + FORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFortId().hashCode();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry)
      POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetPoiDownloadTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetPoiDownloadTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.class, POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.newBuilder()
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
      assetEventId_ = 0;

      fortId_ = "";

      size_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_AssetPoiDownloadTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry getDefaultInstanceForType() {
      return POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry build() {
      POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry buildPartial() {
      POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry result = new POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry(this);
      result.assetEventId_ = assetEventId_;
      result.fortId_ = fortId_;
      result.size_ = size_;
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
      if (other instanceof POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry) {
        return mergeFrom((POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry other) {
      if (other == POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry.getDefaultInstance()) return this;
      if (other.assetEventId_ != 0) {
        setAssetEventIdValue(other.getAssetEventIdValue());
      }
      if (!other.getFortId().isEmpty()) {
        fortId_ = other.fortId_;
        onChanged();
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
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
      POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int assetEventId_ = 0;
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @return The enum numeric value on the wire for assetEventId.
     */
    public int getAssetEventIdValue() {
      return assetEventId_;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @param value The enum numeric value on the wire for assetEventId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetEventIdValue(int value) {
      assetEventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @return The assetEventId.
     */
    public POGOProtos.Enums.AssetTelemetryIds getAssetEventId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.AssetTelemetryIds result = POGOProtos.Enums.AssetTelemetryIds.valueOf(assetEventId_);
      return result == null ? POGOProtos.Enums.AssetTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @param value The assetEventId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetEventId(POGOProtos.Enums.AssetTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      assetEventId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.AssetTelemetryIds asset_event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetEventId() {
      
      assetEventId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fortId_ = "";
    /**
     * <code>string fort_id = 2;</code>
     * @return The fortId.
     */
    public java.lang.String getFortId() {
      java.lang.Object ref = fortId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fortId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return The bytes for fortId.
     */
    public com.google.protobuf.ByteString
        getFortIdBytes() {
      java.lang.Object ref = fortId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fortId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fortId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFortId() {
      
      fortId_ = getDefaultInstance().getFortId();
      onChanged();
      return this;
    }
    /**
     * <code>string fort_id = 2;</code>
     * @param value The bytes for fortId to set.
     * @return This builder for chaining.
     */
    public Builder setFortIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fortId_ = value;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>uint32 size = 3;</code>
     * @return The size.
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>uint32 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry)
  private static final POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry();
  }

  public static POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetPoiDownloadTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<AssetPoiDownloadTelemetry>() {
    @java.lang.Override
    public AssetPoiDownloadTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetPoiDownloadTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetPoiDownloadTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetPoiDownloadTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Telemetry.AssetPoiDownloadTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
