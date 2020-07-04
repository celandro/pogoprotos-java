// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TelemetryCommon}
 */
public  final class TelemetryCommon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TelemetryCommon)
    TelemetryCommonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TelemetryCommon.newBuilder() to construct.
  private TelemetryCommon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TelemetryCommon() {
    correlationVector_ = "";
    eventId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TelemetryCommon();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TelemetryCommon(
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

            timestamp_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            correlationVector_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            eventId_ = s;
            break;
          }
          case 32: {

            clientTimestampMs_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryCommon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryCommon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TelemetryCommon.class, POGOProtos.Rpc.TelemetryCommon.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 1;</code>
   * @return The timestamp.
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int CORRELATION_VECTOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object correlationVector_;
  /**
   * <code>string correlation_vector = 2;</code>
   * @return The correlationVector.
   */
  public java.lang.String getCorrelationVector() {
    java.lang.Object ref = correlationVector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      correlationVector_ = s;
      return s;
    }
  }
  /**
   * <code>string correlation_vector = 2;</code>
   * @return The bytes for correlationVector.
   */
  public com.google.protobuf.ByteString
      getCorrelationVectorBytes() {
    java.lang.Object ref = correlationVector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      correlationVector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object eventId_;
  /**
   * <code>string event_id = 3;</code>
   * @return The eventId.
   */
  public java.lang.String getEventId() {
    java.lang.Object ref = eventId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventId_ = s;
      return s;
    }
  }
  /**
   * <code>string event_id = 3;</code>
   * @return The bytes for eventId.
   */
  public com.google.protobuf.ByteString
      getEventIdBytes() {
    java.lang.Object ref = eventId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_TIMESTAMP_MS_FIELD_NUMBER = 4;
  private long clientTimestampMs_;
  /**
   * <code>int64 client_timestamp_ms = 4;</code>
   * @return The clientTimestampMs.
   */
  public long getClientTimestampMs() {
    return clientTimestampMs_;
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
    if (timestamp_ != 0L) {
      output.writeInt64(1, timestamp_);
    }
    if (!getCorrelationVectorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, correlationVector_);
    }
    if (!getEventIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, eventId_);
    }
    if (clientTimestampMs_ != 0L) {
      output.writeInt64(4, clientTimestampMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestamp_);
    }
    if (!getCorrelationVectorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, correlationVector_);
    }
    if (!getEventIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, eventId_);
    }
    if (clientTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, clientTimestampMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.TelemetryCommon)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TelemetryCommon other = (POGOProtos.Rpc.TelemetryCommon) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getCorrelationVector()
        .equals(other.getCorrelationVector())) return false;
    if (!getEventId()
        .equals(other.getEventId())) return false;
    if (getClientTimestampMs()
        != other.getClientTimestampMs()) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + CORRELATION_VECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getCorrelationVector().hashCode();
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEventId().hashCode();
    hash = (37 * hash) + CLIENT_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientTimestampMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TelemetryCommon parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TelemetryCommon prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TelemetryCommon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TelemetryCommon)
      POGOProtos.Rpc.TelemetryCommonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryCommon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryCommon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TelemetryCommon.class, POGOProtos.Rpc.TelemetryCommon.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TelemetryCommon.newBuilder()
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
      timestamp_ = 0L;

      correlationVector_ = "";

      eventId_ = "";

      clientTimestampMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TelemetryCommon_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TelemetryCommon getDefaultInstanceForType() {
      return POGOProtos.Rpc.TelemetryCommon.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TelemetryCommon build() {
      POGOProtos.Rpc.TelemetryCommon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TelemetryCommon buildPartial() {
      POGOProtos.Rpc.TelemetryCommon result = new POGOProtos.Rpc.TelemetryCommon(this);
      result.timestamp_ = timestamp_;
      result.correlationVector_ = correlationVector_;
      result.eventId_ = eventId_;
      result.clientTimestampMs_ = clientTimestampMs_;
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
      if (other instanceof POGOProtos.Rpc.TelemetryCommon) {
        return mergeFrom((POGOProtos.Rpc.TelemetryCommon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TelemetryCommon other) {
      if (other == POGOProtos.Rpc.TelemetryCommon.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getCorrelationVector().isEmpty()) {
        correlationVector_ = other.correlationVector_;
        onChanged();
      }
      if (!other.getEventId().isEmpty()) {
        eventId_ = other.eventId_;
        onChanged();
      }
      if (other.getClientTimestampMs() != 0L) {
        setClientTimestampMs(other.getClientTimestampMs());
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
      POGOProtos.Rpc.TelemetryCommon parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TelemetryCommon) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object correlationVector_ = "";
    /**
     * <code>string correlation_vector = 2;</code>
     * @return The correlationVector.
     */
    public java.lang.String getCorrelationVector() {
      java.lang.Object ref = correlationVector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        correlationVector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string correlation_vector = 2;</code>
     * @return The bytes for correlationVector.
     */
    public com.google.protobuf.ByteString
        getCorrelationVectorBytes() {
      java.lang.Object ref = correlationVector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        correlationVector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string correlation_vector = 2;</code>
     * @param value The correlationVector to set.
     * @return This builder for chaining.
     */
    public Builder setCorrelationVector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      correlationVector_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string correlation_vector = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCorrelationVector() {
      
      correlationVector_ = getDefaultInstance().getCorrelationVector();
      onChanged();
      return this;
    }
    /**
     * <code>string correlation_vector = 2;</code>
     * @param value The bytes for correlationVector to set.
     * @return This builder for chaining.
     */
    public Builder setCorrelationVectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      correlationVector_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object eventId_ = "";
    /**
     * <code>string event_id = 3;</code>
     * @return The eventId.
     */
    public java.lang.String getEventId() {
      java.lang.Object ref = eventId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_id = 3;</code>
     * @return The bytes for eventId.
     */
    public com.google.protobuf.ByteString
        getEventIdBytes() {
      java.lang.Object ref = eventId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_id = 3;</code>
     * @param value The eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      
      eventId_ = getDefaultInstance().getEventId();
      onChanged();
      return this;
    }
    /**
     * <code>string event_id = 3;</code>
     * @param value The bytes for eventId to set.
     * @return This builder for chaining.
     */
    public Builder setEventIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventId_ = value;
      onChanged();
      return this;
    }

    private long clientTimestampMs_ ;
    /**
     * <code>int64 client_timestamp_ms = 4;</code>
     * @return The clientTimestampMs.
     */
    public long getClientTimestampMs() {
      return clientTimestampMs_;
    }
    /**
     * <code>int64 client_timestamp_ms = 4;</code>
     * @param value The clientTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setClientTimestampMs(long value) {
      
      clientTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_timestamp_ms = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientTimestampMs() {
      
      clientTimestampMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TelemetryCommon)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TelemetryCommon)
  private static final POGOProtos.Rpc.TelemetryCommon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TelemetryCommon();
  }

  public static POGOProtos.Rpc.TelemetryCommon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TelemetryCommon>
      PARSER = new com.google.protobuf.AbstractParser<TelemetryCommon>() {
    @java.lang.Override
    public TelemetryCommon parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TelemetryCommon(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TelemetryCommon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TelemetryCommon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TelemetryCommon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

