// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CommonTelemetryBootTime}
 */
public final class CommonTelemetryBootTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CommonTelemetryBootTime)
    CommonTelemetryBootTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommonTelemetryBootTime.newBuilder() to construct.
  private CommonTelemetryBootTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommonTelemetryBootTime() {
    bootPhase_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommonTelemetryBootTime();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommonTelemetryBootTime(
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

            bootPhase_ = s;
            break;
          }
          case 16: {

            durationMs_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CommonTelemetryBootTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CommonTelemetryBootTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CommonTelemetryBootTime.class, POGOProtos.Rpc.CommonTelemetryBootTime.Builder.class);
  }

  public static final int BOOT_PHASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object bootPhase_;
  /**
   * <code>string boot_phase = 1;</code>
   * @return The bootPhase.
   */
  @java.lang.Override
  public java.lang.String getBootPhase() {
    java.lang.Object ref = bootPhase_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bootPhase_ = s;
      return s;
    }
  }
  /**
   * <code>string boot_phase = 1;</code>
   * @return The bytes for bootPhase.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBootPhaseBytes() {
    java.lang.Object ref = bootPhase_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bootPhase_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_MS_FIELD_NUMBER = 2;
  private long durationMs_;
  /**
   * <code>int64 duration_ms = 2;</code>
   * @return The durationMs.
   */
  @java.lang.Override
  public long getDurationMs() {
    return durationMs_;
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
    if (!getBootPhaseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bootPhase_);
    }
    if (durationMs_ != 0L) {
      output.writeInt64(2, durationMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBootPhaseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bootPhase_);
    }
    if (durationMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, durationMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.CommonTelemetryBootTime)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CommonTelemetryBootTime other = (POGOProtos.Rpc.CommonTelemetryBootTime) obj;

    if (!getBootPhase()
        .equals(other.getBootPhase())) return false;
    if (getDurationMs()
        != other.getDurationMs()) return false;
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
    hash = (37 * hash) + BOOT_PHASE_FIELD_NUMBER;
    hash = (53 * hash) + getBootPhase().hashCode();
    hash = (37 * hash) + DURATION_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDurationMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CommonTelemetryBootTime parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CommonTelemetryBootTime prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CommonTelemetryBootTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CommonTelemetryBootTime)
      POGOProtos.Rpc.CommonTelemetryBootTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CommonTelemetryBootTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CommonTelemetryBootTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CommonTelemetryBootTime.class, POGOProtos.Rpc.CommonTelemetryBootTime.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CommonTelemetryBootTime.newBuilder()
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
      bootPhase_ = "";

      durationMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CommonTelemetryBootTime_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CommonTelemetryBootTime getDefaultInstanceForType() {
      return POGOProtos.Rpc.CommonTelemetryBootTime.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CommonTelemetryBootTime build() {
      POGOProtos.Rpc.CommonTelemetryBootTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CommonTelemetryBootTime buildPartial() {
      POGOProtos.Rpc.CommonTelemetryBootTime result = new POGOProtos.Rpc.CommonTelemetryBootTime(this);
      result.bootPhase_ = bootPhase_;
      result.durationMs_ = durationMs_;
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
      if (other instanceof POGOProtos.Rpc.CommonTelemetryBootTime) {
        return mergeFrom((POGOProtos.Rpc.CommonTelemetryBootTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CommonTelemetryBootTime other) {
      if (other == POGOProtos.Rpc.CommonTelemetryBootTime.getDefaultInstance()) return this;
      if (!other.getBootPhase().isEmpty()) {
        bootPhase_ = other.bootPhase_;
        onChanged();
      }
      if (other.getDurationMs() != 0L) {
        setDurationMs(other.getDurationMs());
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
      POGOProtos.Rpc.CommonTelemetryBootTime parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CommonTelemetryBootTime) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bootPhase_ = "";
    /**
     * <code>string boot_phase = 1;</code>
     * @return The bootPhase.
     */
    public java.lang.String getBootPhase() {
      java.lang.Object ref = bootPhase_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bootPhase_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string boot_phase = 1;</code>
     * @return The bytes for bootPhase.
     */
    public com.google.protobuf.ByteString
        getBootPhaseBytes() {
      java.lang.Object ref = bootPhase_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bootPhase_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string boot_phase = 1;</code>
     * @param value The bootPhase to set.
     * @return This builder for chaining.
     */
    public Builder setBootPhase(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bootPhase_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string boot_phase = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBootPhase() {
      
      bootPhase_ = getDefaultInstance().getBootPhase();
      onChanged();
      return this;
    }
    /**
     * <code>string boot_phase = 1;</code>
     * @param value The bytes for bootPhase to set.
     * @return This builder for chaining.
     */
    public Builder setBootPhaseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bootPhase_ = value;
      onChanged();
      return this;
    }

    private long durationMs_ ;
    /**
     * <code>int64 duration_ms = 2;</code>
     * @return The durationMs.
     */
    @java.lang.Override
    public long getDurationMs() {
      return durationMs_;
    }
    /**
     * <code>int64 duration_ms = 2;</code>
     * @param value The durationMs to set.
     * @return This builder for chaining.
     */
    public Builder setDurationMs(long value) {
      
      durationMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 duration_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationMs() {
      
      durationMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CommonTelemetryBootTime)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CommonTelemetryBootTime)
  private static final POGOProtos.Rpc.CommonTelemetryBootTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CommonTelemetryBootTime();
  }

  public static POGOProtos.Rpc.CommonTelemetryBootTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommonTelemetryBootTime>
      PARSER = new com.google.protobuf.AbstractParser<CommonTelemetryBootTime>() {
    @java.lang.Override
    public CommonTelemetryBootTime parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommonTelemetryBootTime(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommonTelemetryBootTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommonTelemetryBootTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CommonTelemetryBootTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
