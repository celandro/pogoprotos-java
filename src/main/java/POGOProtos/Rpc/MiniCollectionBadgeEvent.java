// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MiniCollectionBadgeEvent}
 */
public final class MiniCollectionBadgeEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MiniCollectionBadgeEvent)
    MiniCollectionBadgeEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MiniCollectionBadgeEvent.newBuilder() to construct.
  private MiniCollectionBadgeEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MiniCollectionBadgeEvent() {
    eventId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MiniCollectionBadgeEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MiniCollectionBadgeEvent(
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

            eventId_ = s;
            break;
          }
          case 16: {

            completedTimestamp_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MiniCollectionBadgeEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MiniCollectionBadgeEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MiniCollectionBadgeEvent.class, POGOProtos.Rpc.MiniCollectionBadgeEvent.Builder.class);
  }

  public static final int EVENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object eventId_;
  /**
   * <code>string event_id = 1;</code>
   * @return The eventId.
   */
  @java.lang.Override
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
   * <code>string event_id = 1;</code>
   * @return The bytes for eventId.
   */
  @java.lang.Override
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

  public static final int COMPLETED_TIMESTAMP_FIELD_NUMBER = 2;
  private long completedTimestamp_;
  /**
   * <code>int64 completed_timestamp = 2;</code>
   * @return The completedTimestamp.
   */
  @java.lang.Override
  public long getCompletedTimestamp() {
    return completedTimestamp_;
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
    if (!getEventIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventId_);
    }
    if (completedTimestamp_ != 0L) {
      output.writeInt64(2, completedTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEventIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventId_);
    }
    if (completedTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, completedTimestamp_);
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
    if (!(obj instanceof POGOProtos.Rpc.MiniCollectionBadgeEvent)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MiniCollectionBadgeEvent other = (POGOProtos.Rpc.MiniCollectionBadgeEvent) obj;

    if (!getEventId()
        .equals(other.getEventId())) return false;
    if (getCompletedTimestamp()
        != other.getCompletedTimestamp()) return false;
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
    hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEventId().hashCode();
    hash = (37 * hash) + COMPLETED_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCompletedTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MiniCollectionBadgeEvent parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MiniCollectionBadgeEvent prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MiniCollectionBadgeEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MiniCollectionBadgeEvent)
      POGOProtos.Rpc.MiniCollectionBadgeEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MiniCollectionBadgeEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MiniCollectionBadgeEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MiniCollectionBadgeEvent.class, POGOProtos.Rpc.MiniCollectionBadgeEvent.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MiniCollectionBadgeEvent.newBuilder()
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
      eventId_ = "";

      completedTimestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MiniCollectionBadgeEvent_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MiniCollectionBadgeEvent getDefaultInstanceForType() {
      return POGOProtos.Rpc.MiniCollectionBadgeEvent.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MiniCollectionBadgeEvent build() {
      POGOProtos.Rpc.MiniCollectionBadgeEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MiniCollectionBadgeEvent buildPartial() {
      POGOProtos.Rpc.MiniCollectionBadgeEvent result = new POGOProtos.Rpc.MiniCollectionBadgeEvent(this);
      result.eventId_ = eventId_;
      result.completedTimestamp_ = completedTimestamp_;
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
      if (other instanceof POGOProtos.Rpc.MiniCollectionBadgeEvent) {
        return mergeFrom((POGOProtos.Rpc.MiniCollectionBadgeEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MiniCollectionBadgeEvent other) {
      if (other == POGOProtos.Rpc.MiniCollectionBadgeEvent.getDefaultInstance()) return this;
      if (!other.getEventId().isEmpty()) {
        eventId_ = other.eventId_;
        onChanged();
      }
      if (other.getCompletedTimestamp() != 0L) {
        setCompletedTimestamp(other.getCompletedTimestamp());
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
      POGOProtos.Rpc.MiniCollectionBadgeEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MiniCollectionBadgeEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object eventId_ = "";
    /**
     * <code>string event_id = 1;</code>
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
     * <code>string event_id = 1;</code>
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
     * <code>string event_id = 1;</code>
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
     * <code>string event_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventId() {
      
      eventId_ = getDefaultInstance().getEventId();
      onChanged();
      return this;
    }
    /**
     * <code>string event_id = 1;</code>
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

    private long completedTimestamp_ ;
    /**
     * <code>int64 completed_timestamp = 2;</code>
     * @return The completedTimestamp.
     */
    @java.lang.Override
    public long getCompletedTimestamp() {
      return completedTimestamp_;
    }
    /**
     * <code>int64 completed_timestamp = 2;</code>
     * @param value The completedTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setCompletedTimestamp(long value) {
      
      completedTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 completed_timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompletedTimestamp() {
      
      completedTimestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MiniCollectionBadgeEvent)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MiniCollectionBadgeEvent)
  private static final POGOProtos.Rpc.MiniCollectionBadgeEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MiniCollectionBadgeEvent();
  }

  public static POGOProtos.Rpc.MiniCollectionBadgeEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MiniCollectionBadgeEvent>
      PARSER = new com.google.protobuf.AbstractParser<MiniCollectionBadgeEvent>() {
    @java.lang.Override
    public MiniCollectionBadgeEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MiniCollectionBadgeEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MiniCollectionBadgeEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MiniCollectionBadgeEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MiniCollectionBadgeEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
