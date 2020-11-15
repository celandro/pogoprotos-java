// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AddFriendQuestProto}
 */
public final class AddFriendQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AddFriendQuestProto)
    AddFriendQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddFriendQuestProto.newBuilder() to construct.
  private AddFriendQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddFriendQuestProto() {
    addedFriendIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddFriendQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddFriendQuestProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              addedFriendIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            addedFriendIds_.add(s);
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
        addedFriendIds_ = addedFriendIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFriendQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFriendQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AddFriendQuestProto.class, POGOProtos.Rpc.AddFriendQuestProto.Builder.class);
  }

  public static final int ADDED_FRIEND_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList addedFriendIds_;
  /**
   * <code>repeated string added_friend_ids = 1;</code>
   * @return A list containing the addedFriendIds.
   */
  public com.google.protobuf.ProtocolStringList
      getAddedFriendIdsList() {
    return addedFriendIds_;
  }
  /**
   * <code>repeated string added_friend_ids = 1;</code>
   * @return The count of addedFriendIds.
   */
  public int getAddedFriendIdsCount() {
    return addedFriendIds_.size();
  }
  /**
   * <code>repeated string added_friend_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The addedFriendIds at the given index.
   */
  public java.lang.String getAddedFriendIds(int index) {
    return addedFriendIds_.get(index);
  }
  /**
   * <code>repeated string added_friend_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the addedFriendIds at the given index.
   */
  public com.google.protobuf.ByteString
      getAddedFriendIdsBytes(int index) {
    return addedFriendIds_.getByteString(index);
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
    for (int i = 0; i < addedFriendIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addedFriendIds_.getRaw(i));
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
      for (int i = 0; i < addedFriendIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(addedFriendIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddedFriendIdsList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.AddFriendQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AddFriendQuestProto other = (POGOProtos.Rpc.AddFriendQuestProto) obj;

    if (!getAddedFriendIdsList()
        .equals(other.getAddedFriendIdsList())) return false;
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
    if (getAddedFriendIdsCount() > 0) {
      hash = (37 * hash) + ADDED_FRIEND_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAddedFriendIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AddFriendQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AddFriendQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AddFriendQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AddFriendQuestProto)
      POGOProtos.Rpc.AddFriendQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFriendQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFriendQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AddFriendQuestProto.class, POGOProtos.Rpc.AddFriendQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AddFriendQuestProto.newBuilder()
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
      addedFriendIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFriendQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AddFriendQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AddFriendQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AddFriendQuestProto build() {
      POGOProtos.Rpc.AddFriendQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AddFriendQuestProto buildPartial() {
      POGOProtos.Rpc.AddFriendQuestProto result = new POGOProtos.Rpc.AddFriendQuestProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        addedFriendIds_ = addedFriendIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addedFriendIds_ = addedFriendIds_;
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
      if (other instanceof POGOProtos.Rpc.AddFriendQuestProto) {
        return mergeFrom((POGOProtos.Rpc.AddFriendQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AddFriendQuestProto other) {
      if (other == POGOProtos.Rpc.AddFriendQuestProto.getDefaultInstance()) return this;
      if (!other.addedFriendIds_.isEmpty()) {
        if (addedFriendIds_.isEmpty()) {
          addedFriendIds_ = other.addedFriendIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAddedFriendIdsIsMutable();
          addedFriendIds_.addAll(other.addedFriendIds_);
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
      POGOProtos.Rpc.AddFriendQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AddFriendQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList addedFriendIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddedFriendIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        addedFriendIds_ = new com.google.protobuf.LazyStringArrayList(addedFriendIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @return A list containing the addedFriendIds.
     */
    public com.google.protobuf.ProtocolStringList
        getAddedFriendIdsList() {
      return addedFriendIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @return The count of addedFriendIds.
     */
    public int getAddedFriendIdsCount() {
      return addedFriendIds_.size();
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The addedFriendIds at the given index.
     */
    public java.lang.String getAddedFriendIds(int index) {
      return addedFriendIds_.get(index);
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the addedFriendIds at the given index.
     */
    public com.google.protobuf.ByteString
        getAddedFriendIdsBytes(int index) {
      return addedFriendIds_.getByteString(index);
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The addedFriendIds to set.
     * @return This builder for chaining.
     */
    public Builder setAddedFriendIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddedFriendIdsIsMutable();
      addedFriendIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @param value The addedFriendIds to add.
     * @return This builder for chaining.
     */
    public Builder addAddedFriendIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddedFriendIdsIsMutable();
      addedFriendIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @param values The addedFriendIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAddedFriendIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAddedFriendIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addedFriendIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddedFriendIds() {
      addedFriendIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string added_friend_ids = 1;</code>
     * @param value The bytes of the addedFriendIds to add.
     * @return This builder for chaining.
     */
    public Builder addAddedFriendIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAddedFriendIdsIsMutable();
      addedFriendIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AddFriendQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AddFriendQuestProto)
  private static final POGOProtos.Rpc.AddFriendQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AddFriendQuestProto();
  }

  public static POGOProtos.Rpc.AddFriendQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddFriendQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<AddFriendQuestProto>() {
    @java.lang.Override
    public AddFriendQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddFriendQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddFriendQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddFriendQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AddFriendQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

