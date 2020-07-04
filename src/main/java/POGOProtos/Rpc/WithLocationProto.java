// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WithLocationProto}
 */
public  final class WithLocationProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WithLocationProto)
    WithLocationProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithLocationProto.newBuilder() to construct.
  private WithLocationProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithLocationProto() {
    s2CellId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithLocationProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithLocationProto(
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
              s2CellId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            s2CellId_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              s2CellId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              s2CellId_.addLong(input.readInt64());
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
        s2CellId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithLocationProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithLocationProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WithLocationProto.class, POGOProtos.Rpc.WithLocationProto.Builder.class);
  }

  public static final int S2_CELL_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList s2CellId_;
  /**
   * <code>repeated int64 s2_cell_id = 1;</code>
   * @return A list containing the s2CellId.
   */
  public java.util.List<java.lang.Long>
      getS2CellIdList() {
    return s2CellId_;
  }
  /**
   * <code>repeated int64 s2_cell_id = 1;</code>
   * @return The count of s2CellId.
   */
  public int getS2CellIdCount() {
    return s2CellId_.size();
  }
  /**
   * <code>repeated int64 s2_cell_id = 1;</code>
   * @param index The index of the element to return.
   * @return The s2CellId at the given index.
   */
  public long getS2CellId(int index) {
    return s2CellId_.getLong(index);
  }
  private int s2CellIdMemoizedSerializedSize = -1;

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
    if (getS2CellIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(s2CellIdMemoizedSerializedSize);
    }
    for (int i = 0; i < s2CellId_.size(); i++) {
      output.writeInt64NoTag(s2CellId_.getLong(i));
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
      for (int i = 0; i < s2CellId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(s2CellId_.getLong(i));
      }
      size += dataSize;
      if (!getS2CellIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      s2CellIdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.WithLocationProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WithLocationProto other = (POGOProtos.Rpc.WithLocationProto) obj;

    if (!getS2CellIdList()
        .equals(other.getS2CellIdList())) return false;
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
    if (getS2CellIdCount() > 0) {
      hash = (37 * hash) + S2_CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getS2CellIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithLocationProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithLocationProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithLocationProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WithLocationProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WithLocationProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WithLocationProto)
      POGOProtos.Rpc.WithLocationProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithLocationProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithLocationProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WithLocationProto.class, POGOProtos.Rpc.WithLocationProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WithLocationProto.newBuilder()
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
      s2CellId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithLocationProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithLocationProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WithLocationProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithLocationProto build() {
      POGOProtos.Rpc.WithLocationProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithLocationProto buildPartial() {
      POGOProtos.Rpc.WithLocationProto result = new POGOProtos.Rpc.WithLocationProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        s2CellId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.s2CellId_ = s2CellId_;
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
      if (other instanceof POGOProtos.Rpc.WithLocationProto) {
        return mergeFrom((POGOProtos.Rpc.WithLocationProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WithLocationProto other) {
      if (other == POGOProtos.Rpc.WithLocationProto.getDefaultInstance()) return this;
      if (!other.s2CellId_.isEmpty()) {
        if (s2CellId_.isEmpty()) {
          s2CellId_ = other.s2CellId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureS2CellIdIsMutable();
          s2CellId_.addAll(other.s2CellId_);
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
      POGOProtos.Rpc.WithLocationProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WithLocationProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList s2CellId_ = emptyLongList();
    private void ensureS2CellIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        s2CellId_ = mutableCopy(s2CellId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @return A list containing the s2CellId.
     */
    public java.util.List<java.lang.Long>
        getS2CellIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(s2CellId_) : s2CellId_;
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @return The count of s2CellId.
     */
    public int getS2CellIdCount() {
      return s2CellId_.size();
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @param index The index of the element to return.
     * @return The s2CellId at the given index.
     */
    public long getS2CellId(int index) {
      return s2CellId_.getLong(index);
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The s2CellId to set.
     * @return This builder for chaining.
     */
    public Builder setS2CellId(
        int index, long value) {
      ensureS2CellIdIsMutable();
      s2CellId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @param value The s2CellId to add.
     * @return This builder for chaining.
     */
    public Builder addS2CellId(long value) {
      ensureS2CellIdIsMutable();
      s2CellId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @param values The s2CellId to add.
     * @return This builder for chaining.
     */
    public Builder addAllS2CellId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureS2CellIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, s2CellId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 s2_cell_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearS2CellId() {
      s2CellId_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WithLocationProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WithLocationProto)
  private static final POGOProtos.Rpc.WithLocationProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WithLocationProto();
  }

  public static POGOProtos.Rpc.WithLocationProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithLocationProto>
      PARSER = new com.google.protobuf.AbstractParser<WithLocationProto>() {
    @java.lang.Override
    public WithLocationProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithLocationProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithLocationProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithLocationProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WithLocationProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

