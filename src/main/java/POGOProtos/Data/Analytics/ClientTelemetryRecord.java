// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Analytics/ClientTelemetryRecord.proto

package POGOProtos.Data.Analytics;

/**
 * Protobuf type {@code POGOProtos.Data.Analytics.ClientTelemetryRecord}
 */
public  final class ClientTelemetryRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Analytics.ClientTelemetryRecord)
    ClientTelemetryRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientTelemetryRecord.newBuilder() to construct.
  private ClientTelemetryRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientTelemetryRecord() {
    recordId_ = "";
    encodedMessage_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientTelemetryRecord();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientTelemetryRecord(
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

            recordId_ = s;
            break;
          }
          case 18: {

            encodedMessage_ = input.readBytes();
            break;
          }
          case 24: {

            clientTimestampMs_ = input.readInt64();
            break;
          }
          case 32: {

            metricId_ = input.readInt64();
            break;
          }
          case 42: {
            POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder subBuilder = null;
            if (commonFilters_ != null) {
              subBuilder = commonFilters_.toBuilder();
            }
            commonFilters_ = input.readMessage(POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commonFilters_);
              commonFilters_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Data.Analytics.ClientTelemetryRecordOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Analytics.ClientTelemetryRecordOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Analytics.ClientTelemetryRecord.class, POGOProtos.Data.Analytics.ClientTelemetryRecord.Builder.class);
  }

  public static final int RECORD_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object recordId_;
  /**
   * <code>string record_id = 1;</code>
   * @return The recordId.
   */
  public java.lang.String getRecordId() {
    java.lang.Object ref = recordId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordId_ = s;
      return s;
    }
  }
  /**
   * <code>string record_id = 1;</code>
   * @return The bytes for recordId.
   */
  public com.google.protobuf.ByteString
      getRecordIdBytes() {
    java.lang.Object ref = recordId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENCODED_MESSAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString encodedMessage_;
  /**
   * <code>bytes encoded_message = 2;</code>
   * @return The encodedMessage.
   */
  public com.google.protobuf.ByteString getEncodedMessage() {
    return encodedMessage_;
  }

  public static final int CLIENT_TIMESTAMP_MS_FIELD_NUMBER = 3;
  private long clientTimestampMs_;
  /**
   * <code>int64 client_timestamp_ms = 3;</code>
   * @return The clientTimestampMs.
   */
  public long getClientTimestampMs() {
    return clientTimestampMs_;
  }

  public static final int METRIC_ID_FIELD_NUMBER = 4;
  private long metricId_;
  /**
   * <code>int64 metric_id = 4;</code>
   * @return The metricId.
   */
  public long getMetricId() {
    return metricId_;
  }

  public static final int COMMON_FILTERS_FIELD_NUMBER = 5;
  private POGOProtos.Data.Analytics.ClientTelemetryCommonFilter commonFilters_;
  /**
   * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
   * @return Whether the commonFilters field is set.
   */
  public boolean hasCommonFilters() {
    return commonFilters_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
   * @return The commonFilters.
   */
  public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter getCommonFilters() {
    return commonFilters_ == null ? POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.getDefaultInstance() : commonFilters_;
  }
  /**
   * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
   */
  public POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOrBuilder getCommonFiltersOrBuilder() {
    return getCommonFilters();
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
    if (!getRecordIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, recordId_);
    }
    if (!encodedMessage_.isEmpty()) {
      output.writeBytes(2, encodedMessage_);
    }
    if (clientTimestampMs_ != 0L) {
      output.writeInt64(3, clientTimestampMs_);
    }
    if (metricId_ != 0L) {
      output.writeInt64(4, metricId_);
    }
    if (commonFilters_ != null) {
      output.writeMessage(5, getCommonFilters());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRecordIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, recordId_);
    }
    if (!encodedMessage_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, encodedMessage_);
    }
    if (clientTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, clientTimestampMs_);
    }
    if (metricId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, metricId_);
    }
    if (commonFilters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCommonFilters());
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
    if (!(obj instanceof POGOProtos.Data.Analytics.ClientTelemetryRecord)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Analytics.ClientTelemetryRecord other = (POGOProtos.Data.Analytics.ClientTelemetryRecord) obj;

    if (!getRecordId()
        .equals(other.getRecordId())) return false;
    if (!getEncodedMessage()
        .equals(other.getEncodedMessage())) return false;
    if (getClientTimestampMs()
        != other.getClientTimestampMs()) return false;
    if (getMetricId()
        != other.getMetricId()) return false;
    if (hasCommonFilters() != other.hasCommonFilters()) return false;
    if (hasCommonFilters()) {
      if (!getCommonFilters()
          .equals(other.getCommonFilters())) return false;
    }
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
    hash = (37 * hash) + RECORD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordId().hashCode();
    hash = (37 * hash) + ENCODED_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getEncodedMessage().hashCode();
    hash = (37 * hash) + CLIENT_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientTimestampMs());
    hash = (37 * hash) + METRIC_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMetricId());
    if (hasCommonFilters()) {
      hash = (37 * hash) + COMMON_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getCommonFilters().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Analytics.ClientTelemetryRecord parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Analytics.ClientTelemetryRecord prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Analytics.ClientTelemetryRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Analytics.ClientTelemetryRecord)
      POGOProtos.Data.Analytics.ClientTelemetryRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Analytics.ClientTelemetryRecordOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Analytics.ClientTelemetryRecordOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Analytics.ClientTelemetryRecord.class, POGOProtos.Data.Analytics.ClientTelemetryRecord.Builder.class);
    }

    // Construct using POGOProtos.Data.Analytics.ClientTelemetryRecord.newBuilder()
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
      recordId_ = "";

      encodedMessage_ = com.google.protobuf.ByteString.EMPTY;

      clientTimestampMs_ = 0L;

      metricId_ = 0L;

      if (commonFiltersBuilder_ == null) {
        commonFilters_ = null;
      } else {
        commonFilters_ = null;
        commonFiltersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Analytics.ClientTelemetryRecordOuterClass.internal_static_POGOProtos_Data_Analytics_ClientTelemetryRecord_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Analytics.ClientTelemetryRecord getDefaultInstanceForType() {
      return POGOProtos.Data.Analytics.ClientTelemetryRecord.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Analytics.ClientTelemetryRecord build() {
      POGOProtos.Data.Analytics.ClientTelemetryRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Analytics.ClientTelemetryRecord buildPartial() {
      POGOProtos.Data.Analytics.ClientTelemetryRecord result = new POGOProtos.Data.Analytics.ClientTelemetryRecord(this);
      result.recordId_ = recordId_;
      result.encodedMessage_ = encodedMessage_;
      result.clientTimestampMs_ = clientTimestampMs_;
      result.metricId_ = metricId_;
      if (commonFiltersBuilder_ == null) {
        result.commonFilters_ = commonFilters_;
      } else {
        result.commonFilters_ = commonFiltersBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Data.Analytics.ClientTelemetryRecord) {
        return mergeFrom((POGOProtos.Data.Analytics.ClientTelemetryRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Analytics.ClientTelemetryRecord other) {
      if (other == POGOProtos.Data.Analytics.ClientTelemetryRecord.getDefaultInstance()) return this;
      if (!other.getRecordId().isEmpty()) {
        recordId_ = other.recordId_;
        onChanged();
      }
      if (other.getEncodedMessage() != com.google.protobuf.ByteString.EMPTY) {
        setEncodedMessage(other.getEncodedMessage());
      }
      if (other.getClientTimestampMs() != 0L) {
        setClientTimestampMs(other.getClientTimestampMs());
      }
      if (other.getMetricId() != 0L) {
        setMetricId(other.getMetricId());
      }
      if (other.hasCommonFilters()) {
        mergeCommonFilters(other.getCommonFilters());
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
      POGOProtos.Data.Analytics.ClientTelemetryRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Analytics.ClientTelemetryRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object recordId_ = "";
    /**
     * <code>string record_id = 1;</code>
     * @return The recordId.
     */
    public java.lang.String getRecordId() {
      java.lang.Object ref = recordId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string record_id = 1;</code>
     * @return The bytes for recordId.
     */
    public com.google.protobuf.ByteString
        getRecordIdBytes() {
      java.lang.Object ref = recordId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string record_id = 1;</code>
     * @param value The recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string record_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecordId() {
      
      recordId_ = getDefaultInstance().getRecordId();
      onChanged();
      return this;
    }
    /**
     * <code>string record_id = 1;</code>
     * @param value The bytes for recordId to set.
     * @return This builder for chaining.
     */
    public Builder setRecordIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString encodedMessage_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes encoded_message = 2;</code>
     * @return The encodedMessage.
     */
    public com.google.protobuf.ByteString getEncodedMessage() {
      return encodedMessage_;
    }
    /**
     * <code>bytes encoded_message = 2;</code>
     * @param value The encodedMessage to set.
     * @return This builder for chaining.
     */
    public Builder setEncodedMessage(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encodedMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes encoded_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncodedMessage() {
      
      encodedMessage_ = getDefaultInstance().getEncodedMessage();
      onChanged();
      return this;
    }

    private long clientTimestampMs_ ;
    /**
     * <code>int64 client_timestamp_ms = 3;</code>
     * @return The clientTimestampMs.
     */
    public long getClientTimestampMs() {
      return clientTimestampMs_;
    }
    /**
     * <code>int64 client_timestamp_ms = 3;</code>
     * @param value The clientTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setClientTimestampMs(long value) {
      
      clientTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_timestamp_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientTimestampMs() {
      
      clientTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private long metricId_ ;
    /**
     * <code>int64 metric_id = 4;</code>
     * @return The metricId.
     */
    public long getMetricId() {
      return metricId_;
    }
    /**
     * <code>int64 metric_id = 4;</code>
     * @param value The metricId to set.
     * @return This builder for chaining.
     */
    public Builder setMetricId(long value) {
      
      metricId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 metric_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetricId() {
      
      metricId_ = 0L;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Analytics.ClientTelemetryCommonFilter commonFilters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Analytics.ClientTelemetryCommonFilter, POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder, POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOrBuilder> commonFiltersBuilder_;
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     * @return Whether the commonFilters field is set.
     */
    public boolean hasCommonFilters() {
      return commonFiltersBuilder_ != null || commonFilters_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     * @return The commonFilters.
     */
    public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter getCommonFilters() {
      if (commonFiltersBuilder_ == null) {
        return commonFilters_ == null ? POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.getDefaultInstance() : commonFilters_;
      } else {
        return commonFiltersBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    public Builder setCommonFilters(POGOProtos.Data.Analytics.ClientTelemetryCommonFilter value) {
      if (commonFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonFilters_ = value;
        onChanged();
      } else {
        commonFiltersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    public Builder setCommonFilters(
        POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder builderForValue) {
      if (commonFiltersBuilder_ == null) {
        commonFilters_ = builderForValue.build();
        onChanged();
      } else {
        commonFiltersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    public Builder mergeCommonFilters(POGOProtos.Data.Analytics.ClientTelemetryCommonFilter value) {
      if (commonFiltersBuilder_ == null) {
        if (commonFilters_ != null) {
          commonFilters_ =
            POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.newBuilder(commonFilters_).mergeFrom(value).buildPartial();
        } else {
          commonFilters_ = value;
        }
        onChanged();
      } else {
        commonFiltersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    public Builder clearCommonFilters() {
      if (commonFiltersBuilder_ == null) {
        commonFilters_ = null;
        onChanged();
      } else {
        commonFilters_ = null;
        commonFiltersBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    public POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder getCommonFiltersBuilder() {
      
      onChanged();
      return getCommonFiltersFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    public POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOrBuilder getCommonFiltersOrBuilder() {
      if (commonFiltersBuilder_ != null) {
        return commonFiltersBuilder_.getMessageOrBuilder();
      } else {
        return commonFilters_ == null ?
            POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.getDefaultInstance() : commonFilters_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Analytics.ClientTelemetryCommonFilter common_filters = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Analytics.ClientTelemetryCommonFilter, POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder, POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOrBuilder> 
        getCommonFiltersFieldBuilder() {
      if (commonFiltersBuilder_ == null) {
        commonFiltersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Analytics.ClientTelemetryCommonFilter, POGOProtos.Data.Analytics.ClientTelemetryCommonFilter.Builder, POGOProtos.Data.Analytics.ClientTelemetryCommonFilterOrBuilder>(
                getCommonFilters(),
                getParentForChildren(),
                isClean());
        commonFilters_ = null;
      }
      return commonFiltersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Analytics.ClientTelemetryRecord)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Analytics.ClientTelemetryRecord)
  private static final POGOProtos.Data.Analytics.ClientTelemetryRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Analytics.ClientTelemetryRecord();
  }

  public static POGOProtos.Data.Analytics.ClientTelemetryRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientTelemetryRecord>
      PARSER = new com.google.protobuf.AbstractParser<ClientTelemetryRecord>() {
    @java.lang.Override
    public ClientTelemetryRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientTelemetryRecord(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientTelemetryRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientTelemetryRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Analytics.ClientTelemetryRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

