// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/DeleteGiftFromInventoryMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage}
 */
public final class DeleteGiftFromInventoryMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage)
    DeleteGiftFromInventoryMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteGiftFromInventoryMessage.newBuilder() to construct.
  private DeleteGiftFromInventoryMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteGiftFromInventoryMessage() {
    giftboxId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteGiftFromInventoryMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteGiftFromInventoryMessage(
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
              giftboxId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            giftboxId_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              giftboxId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              giftboxId_.addLong(input.readUInt64());
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
        giftboxId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_DeleteGiftFromInventoryMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_DeleteGiftFromInventoryMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.class, POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.Builder.class);
  }

  public static final int GIFTBOX_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList giftboxId_;
  /**
   * <code>repeated uint64 giftbox_id = 1;</code>
   * @return A list containing the giftboxId.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getGiftboxIdList() {
    return giftboxId_;
  }
  /**
   * <code>repeated uint64 giftbox_id = 1;</code>
   * @return The count of giftboxId.
   */
  public int getGiftboxIdCount() {
    return giftboxId_.size();
  }
  /**
   * <code>repeated uint64 giftbox_id = 1;</code>
   * @param index The index of the element to return.
   * @return The giftboxId at the given index.
   */
  public long getGiftboxId(int index) {
    return giftboxId_.getLong(index);
  }
  private int giftboxIdMemoizedSerializedSize = -1;

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
    if (getGiftboxIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(giftboxIdMemoizedSerializedSize);
    }
    for (int i = 0; i < giftboxId_.size(); i++) {
      output.writeUInt64NoTag(giftboxId_.getLong(i));
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
      for (int i = 0; i < giftboxId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(giftboxId_.getLong(i));
      }
      size += dataSize;
      if (!getGiftboxIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      giftboxIdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage other = (POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage) obj;

    if (!getGiftboxIdList()
        .equals(other.getGiftboxIdList())) return false;
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
    if (getGiftboxIdCount() > 0) {
      hash = (37 * hash) + GIFTBOX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGiftboxIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage)
      POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_DeleteGiftFromInventoryMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_DeleteGiftFromInventoryMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.class, POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.newBuilder()
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
      giftboxId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_DeleteGiftFromInventoryMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage build() {
      POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage result = new POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        giftboxId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.giftboxId_ = giftboxId_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage.getDefaultInstance()) return this;
      if (!other.giftboxId_.isEmpty()) {
        if (giftboxId_.isEmpty()) {
          giftboxId_ = other.giftboxId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureGiftboxIdIsMutable();
          giftboxId_.addAll(other.giftboxId_);
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
      POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList giftboxId_ = emptyLongList();
    private void ensureGiftboxIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        giftboxId_ = mutableCopy(giftboxId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @return A list containing the giftboxId.
     */
    public java.util.List<java.lang.Long>
        getGiftboxIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(giftboxId_) : giftboxId_;
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @return The count of giftboxId.
     */
    public int getGiftboxIdCount() {
      return giftboxId_.size();
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @param index The index of the element to return.
     * @return The giftboxId at the given index.
     */
    public long getGiftboxId(int index) {
      return giftboxId_.getLong(index);
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The giftboxId to set.
     * @return This builder for chaining.
     */
    public Builder setGiftboxId(
        int index, long value) {
      ensureGiftboxIdIsMutable();
      giftboxId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @param value The giftboxId to add.
     * @return This builder for chaining.
     */
    public Builder addGiftboxId(long value) {
      ensureGiftboxIdIsMutable();
      giftboxId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @param values The giftboxId to add.
     * @return This builder for chaining.
     */
    public Builder addAllGiftboxId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureGiftboxIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, giftboxId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 giftbox_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGiftboxId() {
      giftboxId_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage)
  private static final POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteGiftFromInventoryMessage>
      PARSER = new com.google.protobuf.AbstractParser<DeleteGiftFromInventoryMessage>() {
    @java.lang.Override
    public DeleteGiftFromInventoryMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteGiftFromInventoryMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteGiftFromInventoryMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteGiftFromInventoryMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.DeleteGiftFromInventoryMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

