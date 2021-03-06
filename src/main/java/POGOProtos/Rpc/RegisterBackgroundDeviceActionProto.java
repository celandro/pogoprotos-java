// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.RegisterBackgroundDeviceActionProto}
 */
public final class RegisterBackgroundDeviceActionProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.RegisterBackgroundDeviceActionProto)
    RegisterBackgroundDeviceActionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterBackgroundDeviceActionProto.newBuilder() to construct.
  private RegisterBackgroundDeviceActionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterBackgroundDeviceActionProto() {
    deviceType_ = "";
    deviceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterBackgroundDeviceActionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterBackgroundDeviceActionProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceId_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceActionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceActionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.class, POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.Builder.class);
  }

  public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object deviceType_;
  /**
   * <code>string device_type = 1;</code>
   * @return The deviceType.
   */
  @java.lang.Override
  public java.lang.String getDeviceType() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceType_ = s;
      return s;
    }
  }
  /**
   * <code>string device_type = 1;</code>
   * @return The bytes for deviceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceTypeBytes() {
    java.lang.Object ref = deviceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object deviceId_;
  /**
   * <code>string device_id = 2;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceId_ = s;
      return s;
    }
  }
  /**
   * <code>string device_id = 2;</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getDeviceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceType_);
    }
    if (!getDeviceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeviceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceType_);
    }
    if (!getDeviceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceId_);
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
    if (!(obj instanceof POGOProtos.Rpc.RegisterBackgroundDeviceActionProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.RegisterBackgroundDeviceActionProto other = (POGOProtos.Rpc.RegisterBackgroundDeviceActionProto) obj;

    if (!getDeviceType()
        .equals(other.getDeviceType())) return false;
    if (!getDeviceId()
        .equals(other.getDeviceId())) return false;
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
    hash = (37 * hash) + DEVICE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceType().hashCode();
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.RegisterBackgroundDeviceActionProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.RegisterBackgroundDeviceActionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.RegisterBackgroundDeviceActionProto)
      POGOProtos.Rpc.RegisterBackgroundDeviceActionProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceActionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceActionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.class, POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.newBuilder()
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
      deviceType_ = "";

      deviceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RegisterBackgroundDeviceActionProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceActionProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceActionProto build() {
      POGOProtos.Rpc.RegisterBackgroundDeviceActionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RegisterBackgroundDeviceActionProto buildPartial() {
      POGOProtos.Rpc.RegisterBackgroundDeviceActionProto result = new POGOProtos.Rpc.RegisterBackgroundDeviceActionProto(this);
      result.deviceType_ = deviceType_;
      result.deviceId_ = deviceId_;
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
      if (other instanceof POGOProtos.Rpc.RegisterBackgroundDeviceActionProto) {
        return mergeFrom((POGOProtos.Rpc.RegisterBackgroundDeviceActionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.RegisterBackgroundDeviceActionProto other) {
      if (other == POGOProtos.Rpc.RegisterBackgroundDeviceActionProto.getDefaultInstance()) return this;
      if (!other.getDeviceType().isEmpty()) {
        deviceType_ = other.deviceType_;
        onChanged();
      }
      if (!other.getDeviceId().isEmpty()) {
        deviceId_ = other.deviceId_;
        onChanged();
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
      POGOProtos.Rpc.RegisterBackgroundDeviceActionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.RegisterBackgroundDeviceActionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deviceType_ = "";
    /**
     * <code>string device_type = 1;</code>
     * @return The deviceType.
     */
    public java.lang.String getDeviceType() {
      java.lang.Object ref = deviceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_type = 1;</code>
     * @return The bytes for deviceType.
     */
    public com.google.protobuf.ByteString
        getDeviceTypeBytes() {
      java.lang.Object ref = deviceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_type = 1;</code>
     * @param value The deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceType() {
      
      deviceType_ = getDefaultInstance().getDeviceType();
      onChanged();
      return this;
    }
    /**
     * <code>string device_type = 1;</code>
     * @param value The bytes for deviceType to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deviceId_ = "";
    /**
     * <code>string device_id = 2;</code>
     * @return The deviceId.
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device_id = 2;</code>
     * @return The bytes for deviceId.
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device_id = 2;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      
      deviceId_ = getDefaultInstance().getDeviceId();
      onChanged();
      return this;
    }
    /**
     * <code>string device_id = 2;</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.RegisterBackgroundDeviceActionProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.RegisterBackgroundDeviceActionProto)
  private static final POGOProtos.Rpc.RegisterBackgroundDeviceActionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.RegisterBackgroundDeviceActionProto();
  }

  public static POGOProtos.Rpc.RegisterBackgroundDeviceActionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterBackgroundDeviceActionProto>
      PARSER = new com.google.protobuf.AbstractParser<RegisterBackgroundDeviceActionProto>() {
    @java.lang.Override
    public RegisterBackgroundDeviceActionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterBackgroundDeviceActionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterBackgroundDeviceActionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterBackgroundDeviceActionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.RegisterBackgroundDeviceActionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

