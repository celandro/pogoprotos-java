// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetLocalTimeProto}
 */
public final class GetLocalTimeProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetLocalTimeProto)
    GetLocalTimeProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetLocalTimeProto.newBuilder() to construct.
  private GetLocalTimeProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetLocalTimeProto() {
    timestampMs_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetLocalTimeProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetLocalTimeProto(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              timestampMs_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            timestampMs_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              timestampMs_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              timestampMs_.addLong(input.readInt64());
            }
            input.popLimit(limit);
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
        timestampMs_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetLocalTimeProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetLocalTimeProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetLocalTimeProto.class, POGOProtos.Rpc.GetLocalTimeProto.Builder.class);
  }

  public static final int TIMESTAMP_MS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList timestampMs_;
  /**
   * <code>repeated int64 timestamp_ms = 1;</code>
   * @return A list containing the timestampMs.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getTimestampMsList() {
    return timestampMs_;
  }
  /**
   * <code>repeated int64 timestamp_ms = 1;</code>
   * @return The count of timestampMs.
   */
  public int getTimestampMsCount() {
    return timestampMs_.size();
  }
  /**
   * <code>repeated int64 timestamp_ms = 1;</code>
   * @param index The index of the element to return.
   * @return The timestampMs at the given index.
   */
  public long getTimestampMs(int index) {
    return timestampMs_.getLong(index);
  }
  private int timestampMsMemoizedSerializedSize = -1;

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
    if (getTimestampMsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(timestampMsMemoizedSerializedSize);
    }
    for (int i = 0; i < timestampMs_.size(); i++) {
      output.writeInt64NoTag(timestampMs_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < timestampMs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(timestampMs_.getLong(i));
      }
      size += dataSize;
      if (!getTimestampMsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      timestampMsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.GetLocalTimeProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetLocalTimeProto other = (POGOProtos.Rpc.GetLocalTimeProto) obj;

    if (!getTimestampMsList()
        .equals(other.getTimestampMsList())) return false;
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
    if (getTimestampMsCount() > 0) {
      hash = (37 * hash) + TIMESTAMP_MS_FIELD_NUMBER;
      hash = (53 * hash) + getTimestampMsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetLocalTimeProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetLocalTimeProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetLocalTimeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetLocalTimeProto)
      POGOProtos.Rpc.GetLocalTimeProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetLocalTimeProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetLocalTimeProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetLocalTimeProto.class, POGOProtos.Rpc.GetLocalTimeProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetLocalTimeProto.newBuilder()
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
      timestampMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetLocalTimeProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetLocalTimeProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetLocalTimeProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetLocalTimeProto build() {
      POGOProtos.Rpc.GetLocalTimeProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetLocalTimeProto buildPartial() {
      POGOProtos.Rpc.GetLocalTimeProto result = new POGOProtos.Rpc.GetLocalTimeProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        timestampMs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.timestampMs_ = timestampMs_;
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
      if (other instanceof POGOProtos.Rpc.GetLocalTimeProto) {
        return mergeFrom((POGOProtos.Rpc.GetLocalTimeProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetLocalTimeProto other) {
      if (other == POGOProtos.Rpc.GetLocalTimeProto.getDefaultInstance()) return this;
      if (!other.timestampMs_.isEmpty()) {
        if (timestampMs_.isEmpty()) {
          timestampMs_ = other.timestampMs_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTimestampMsIsMutable();
          timestampMs_.addAll(other.timestampMs_);
        }
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
      POGOProtos.Rpc.GetLocalTimeProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetLocalTimeProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList timestampMs_ = emptyLongList();
    private void ensureTimestampMsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        timestampMs_ = mutableCopy(timestampMs_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @return A list containing the timestampMs.
     */
    public java.util.List<java.lang.Long>
        getTimestampMsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(timestampMs_) : timestampMs_;
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @return The count of timestampMs.
     */
    public int getTimestampMsCount() {
      return timestampMs_.size();
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @param index The index of the element to return.
     * @return The timestampMs at the given index.
     */
    public long getTimestampMs(int index) {
      return timestampMs_.getLong(index);
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @param index The index to set the value at.
     * @param value The timestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampMs(
        int index, long value) {
      ensureTimestampMsIsMutable();
      timestampMs_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @param value The timestampMs to add.
     * @return This builder for chaining.
     */
    public Builder addTimestampMs(long value) {
      ensureTimestampMsIsMutable();
      timestampMs_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @param values The timestampMs to add.
     * @return This builder for chaining.
     */
    public Builder addAllTimestampMs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTimestampMsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, timestampMs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 timestamp_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestampMs() {
      timestampMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetLocalTimeProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetLocalTimeProto)
  private static final POGOProtos.Rpc.GetLocalTimeProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetLocalTimeProto();
  }

  public static POGOProtos.Rpc.GetLocalTimeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetLocalTimeProto>
      PARSER = new com.google.protobuf.AbstractParser<GetLocalTimeProto>() {
    @java.lang.Override
    public GetLocalTimeProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetLocalTimeProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetLocalTimeProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetLocalTimeProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetLocalTimeProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

