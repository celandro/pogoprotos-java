// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/PlatformServerData.proto

package POGOProtos.Data.Telemetry;

/**
 * Protobuf type {@code POGOProtos.Data.Telemetry.PlatformServerData}
 */
public  final class PlatformServerData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Telemetry.PlatformServerData)
    PlatformServerDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformServerData.newBuilder() to construct.
  private PlatformServerData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformServerData() {
    userId_ = "";
    telemetryId_ = "";
    sessionId_ = "";
    experimentIds_ = emptyIntList();
    eventRequestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformServerData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformServerData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            userId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            telemetryId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionId_ = s;
            break;
          }
          case 32: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              experimentIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            experimentIds_.addInt(input.readInt32());
            break;
          }
          case 34: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              experimentIds_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              experimentIds_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            eventRequestId_ = s;
            break;
          }
          case 48: {

            serverTimestampMs_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        experimentIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.internal_static_POGOProtos_Data_Telemetry_PlatformServerData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.internal_static_POGOProtos_Data_Telemetry_PlatformServerData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Telemetry.PlatformServerData.class, POGOProtos.Data.Telemetry.PlatformServerData.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TELEMETRY_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object telemetryId_;
  /**
   * <code>string telemetry_id = 2;</code>
   * @return The telemetryId.
   */
  public java.lang.String getTelemetryId() {
    java.lang.Object ref = telemetryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      telemetryId_ = s;
      return s;
    }
  }
  /**
   * <code>string telemetry_id = 2;</code>
   * @return The bytes for telemetryId.
   */
  public com.google.protobuf.ByteString
      getTelemetryIdBytes() {
    java.lang.Object ref = telemetryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      telemetryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>string session_id = 3;</code>
   * @return The sessionId.
   */
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string session_id = 3;</code>
   * @return The bytes for sessionId.
   */
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPERIMENT_IDS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList experimentIds_;
  /**
   * <code>repeated int32 experiment_ids = 4;</code>
   * @return A list containing the experimentIds.
   */
  public java.util.List<java.lang.Integer>
      getExperimentIdsList() {
    return experimentIds_;
  }
  /**
   * <code>repeated int32 experiment_ids = 4;</code>
   * @return The count of experimentIds.
   */
  public int getExperimentIdsCount() {
    return experimentIds_.size();
  }
  /**
   * <code>repeated int32 experiment_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The experimentIds at the given index.
   */
  public int getExperimentIds(int index) {
    return experimentIds_.getInt(index);
  }
  private int experimentIdsMemoizedSerializedSize = -1;

  public static final int EVENT_REQUEST_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object eventRequestId_;
  /**
   * <code>string event_request_id = 5;</code>
   * @return The eventRequestId.
   */
  public java.lang.String getEventRequestId() {
    java.lang.Object ref = eventRequestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventRequestId_ = s;
      return s;
    }
  }
  /**
   * <code>string event_request_id = 5;</code>
   * @return The bytes for eventRequestId.
   */
  public com.google.protobuf.ByteString
      getEventRequestIdBytes() {
    java.lang.Object ref = eventRequestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventRequestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 6;
  private long serverTimestampMs_;
  /**
   * <code>int64 server_timestamp_ms = 6;</code>
   * @return The serverTimestampMs.
   */
  public long getServerTimestampMs() {
    return serverTimestampMs_;
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
    getSerializedSize();
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!getTelemetryIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, telemetryId_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sessionId_);
    }
    if (getExperimentIdsList().size() > 0) {
      output.writeUInt32NoTag(34);
      output.writeUInt32NoTag(experimentIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < experimentIds_.size(); i++) {
      output.writeInt32NoTag(experimentIds_.getInt(i));
    }
    if (!getEventRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, eventRequestId_);
    }
    if (serverTimestampMs_ != 0L) {
      output.writeInt64(6, serverTimestampMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getTelemetryIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, telemetryId_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sessionId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < experimentIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(experimentIds_.getInt(i));
      }
      size += dataSize;
      if (!getExperimentIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      experimentIdsMemoizedSerializedSize = dataSize;
    }
    if (!getEventRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, eventRequestId_);
    }
    if (serverTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, serverTimestampMs_);
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
    if (!(obj instanceof POGOProtos.Data.Telemetry.PlatformServerData)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Telemetry.PlatformServerData other = (POGOProtos.Data.Telemetry.PlatformServerData) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getTelemetryId()
        .equals(other.getTelemetryId())) return false;
    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (!getExperimentIdsList()
        .equals(other.getExperimentIdsList())) return false;
    if (!getEventRequestId()
        .equals(other.getEventRequestId())) return false;
    if (getServerTimestampMs()
        != other.getServerTimestampMs()) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + TELEMETRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTelemetryId().hashCode();
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    if (getExperimentIdsCount() > 0) {
      hash = (37 * hash) + EXPERIMENT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getExperimentIdsList().hashCode();
    }
    hash = (37 * hash) + EVENT_REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEventRequestId().hashCode();
    hash = (37 * hash) + SERVER_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getServerTimestampMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.PlatformServerData parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Telemetry.PlatformServerData prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Telemetry.PlatformServerData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Telemetry.PlatformServerData)
      POGOProtos.Data.Telemetry.PlatformServerDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.internal_static_POGOProtos_Data_Telemetry_PlatformServerData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.internal_static_POGOProtos_Data_Telemetry_PlatformServerData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Telemetry.PlatformServerData.class, POGOProtos.Data.Telemetry.PlatformServerData.Builder.class);
    }

    // Construct using POGOProtos.Data.Telemetry.PlatformServerData.newBuilder()
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
      userId_ = "";

      telemetryId_ = "";

      sessionId_ = "";

      experimentIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      eventRequestId_ = "";

      serverTimestampMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Telemetry.PlatformServerDataOuterClass.internal_static_POGOProtos_Data_Telemetry_PlatformServerData_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.PlatformServerData getDefaultInstanceForType() {
      return POGOProtos.Data.Telemetry.PlatformServerData.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.PlatformServerData build() {
      POGOProtos.Data.Telemetry.PlatformServerData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.PlatformServerData buildPartial() {
      POGOProtos.Data.Telemetry.PlatformServerData result = new POGOProtos.Data.Telemetry.PlatformServerData(this);
      int from_bitField0_ = bitField0_;
      result.userId_ = userId_;
      result.telemetryId_ = telemetryId_;
      result.sessionId_ = sessionId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        experimentIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.experimentIds_ = experimentIds_;
      result.eventRequestId_ = eventRequestId_;
      result.serverTimestampMs_ = serverTimestampMs_;
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
      if (other instanceof POGOProtos.Data.Telemetry.PlatformServerData) {
        return mergeFrom((POGOProtos.Data.Telemetry.PlatformServerData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Telemetry.PlatformServerData other) {
      if (other == POGOProtos.Data.Telemetry.PlatformServerData.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getTelemetryId().isEmpty()) {
        telemetryId_ = other.telemetryId_;
        onChanged();
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      if (!other.experimentIds_.isEmpty()) {
        if (experimentIds_.isEmpty()) {
          experimentIds_ = other.experimentIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureExperimentIdsIsMutable();
          experimentIds_.addAll(other.experimentIds_);
        }
        onChanged();
      }
      if (!other.getEventRequestId().isEmpty()) {
        eventRequestId_ = other.eventRequestId_;
        onChanged();
      }
      if (other.getServerTimestampMs() != 0L) {
        setServerTimestampMs(other.getServerTimestampMs());
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
      POGOProtos.Data.Telemetry.PlatformServerData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Telemetry.PlatformServerData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object telemetryId_ = "";
    /**
     * <code>string telemetry_id = 2;</code>
     * @return The telemetryId.
     */
    public java.lang.String getTelemetryId() {
      java.lang.Object ref = telemetryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        telemetryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string telemetry_id = 2;</code>
     * @return The bytes for telemetryId.
     */
    public com.google.protobuf.ByteString
        getTelemetryIdBytes() {
      java.lang.Object ref = telemetryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        telemetryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string telemetry_id = 2;</code>
     * @param value The telemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setTelemetryId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      telemetryId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string telemetry_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTelemetryId() {
      
      telemetryId_ = getDefaultInstance().getTelemetryId();
      onChanged();
      return this;
    }
    /**
     * <code>string telemetry_id = 2;</code>
     * @param value The bytes for telemetryId to set.
     * @return This builder for chaining.
     */
    public Builder setTelemetryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      telemetryId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string session_id = 3;</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session_id = 3;</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session_id = 3;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 3;</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList experimentIds_ = emptyIntList();
    private void ensureExperimentIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        experimentIds_ = mutableCopy(experimentIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @return A list containing the experimentIds.
     */
    public java.util.List<java.lang.Integer>
        getExperimentIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(experimentIds_) : experimentIds_;
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @return The count of experimentIds.
     */
    public int getExperimentIdsCount() {
      return experimentIds_.size();
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @param index The index of the element to return.
     * @return The experimentIds at the given index.
     */
    public int getExperimentIds(int index) {
      return experimentIds_.getInt(index);
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @param index The index to set the value at.
     * @param value The experimentIds to set.
     * @return This builder for chaining.
     */
    public Builder setExperimentIds(
        int index, int value) {
      ensureExperimentIdsIsMutable();
      experimentIds_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @param value The experimentIds to add.
     * @return This builder for chaining.
     */
    public Builder addExperimentIds(int value) {
      ensureExperimentIdsIsMutable();
      experimentIds_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @param values The experimentIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllExperimentIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureExperimentIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, experimentIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 experiment_ids = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExperimentIds() {
      experimentIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object eventRequestId_ = "";
    /**
     * <code>string event_request_id = 5;</code>
     * @return The eventRequestId.
     */
    public java.lang.String getEventRequestId() {
      java.lang.Object ref = eventRequestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventRequestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_request_id = 5;</code>
     * @return The bytes for eventRequestId.
     */
    public com.google.protobuf.ByteString
        getEventRequestIdBytes() {
      java.lang.Object ref = eventRequestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventRequestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_request_id = 5;</code>
     * @param value The eventRequestId to set.
     * @return This builder for chaining.
     */
    public Builder setEventRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventRequestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event_request_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventRequestId() {
      
      eventRequestId_ = getDefaultInstance().getEventRequestId();
      onChanged();
      return this;
    }
    /**
     * <code>string event_request_id = 5;</code>
     * @param value The bytes for eventRequestId to set.
     * @return This builder for chaining.
     */
    public Builder setEventRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventRequestId_ = value;
      onChanged();
      return this;
    }

    private long serverTimestampMs_ ;
    /**
     * <code>int64 server_timestamp_ms = 6;</code>
     * @return The serverTimestampMs.
     */
    public long getServerTimestampMs() {
      return serverTimestampMs_;
    }
    /**
     * <code>int64 server_timestamp_ms = 6;</code>
     * @param value The serverTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setServerTimestampMs(long value) {
      
      serverTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 server_timestamp_ms = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerTimestampMs() {
      
      serverTimestampMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Telemetry.PlatformServerData)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Telemetry.PlatformServerData)
  private static final POGOProtos.Data.Telemetry.PlatformServerData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Telemetry.PlatformServerData();
  }

  public static POGOProtos.Data.Telemetry.PlatformServerData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformServerData>
      PARSER = new com.google.protobuf.AbstractParser<PlatformServerData>() {
    @java.lang.Override
    public PlatformServerData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformServerData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformServerData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformServerData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Telemetry.PlatformServerData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

