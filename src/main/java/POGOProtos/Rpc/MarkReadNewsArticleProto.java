// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MarkReadNewsArticleProto}
 */
public final class MarkReadNewsArticleProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MarkReadNewsArticleProto)
    MarkReadNewsArticleProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarkReadNewsArticleProto.newBuilder() to construct.
  private MarkReadNewsArticleProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarkReadNewsArticleProto() {
    newsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarkReadNewsArticleProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MarkReadNewsArticleProto(
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
              newsIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            newsIds_.add(s);
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
        newsIds_ = newsIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkReadNewsArticleProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkReadNewsArticleProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MarkReadNewsArticleProto.class, POGOProtos.Rpc.MarkReadNewsArticleProto.Builder.class);
  }

  public static final int NEWS_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList newsIds_;
  /**
   * <code>repeated string news_ids = 1;</code>
   * @return A list containing the newsIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNewsIdsList() {
    return newsIds_;
  }
  /**
   * <code>repeated string news_ids = 1;</code>
   * @return The count of newsIds.
   */
  public int getNewsIdsCount() {
    return newsIds_.size();
  }
  /**
   * <code>repeated string news_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The newsIds at the given index.
   */
  public java.lang.String getNewsIds(int index) {
    return newsIds_.get(index);
  }
  /**
   * <code>repeated string news_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the newsIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNewsIdsBytes(int index) {
    return newsIds_.getByteString(index);
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
    for (int i = 0; i < newsIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, newsIds_.getRaw(i));
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
      for (int i = 0; i < newsIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(newsIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNewsIdsList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.MarkReadNewsArticleProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MarkReadNewsArticleProto other = (POGOProtos.Rpc.MarkReadNewsArticleProto) obj;

    if (!getNewsIdsList()
        .equals(other.getNewsIdsList())) return false;
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
    if (getNewsIdsCount() > 0) {
      hash = (37 * hash) + NEWS_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getNewsIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MarkReadNewsArticleProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MarkReadNewsArticleProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MarkReadNewsArticleProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MarkReadNewsArticleProto)
      POGOProtos.Rpc.MarkReadNewsArticleProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkReadNewsArticleProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkReadNewsArticleProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MarkReadNewsArticleProto.class, POGOProtos.Rpc.MarkReadNewsArticleProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MarkReadNewsArticleProto.newBuilder()
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
      newsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkReadNewsArticleProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MarkReadNewsArticleProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MarkReadNewsArticleProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MarkReadNewsArticleProto build() {
      POGOProtos.Rpc.MarkReadNewsArticleProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MarkReadNewsArticleProto buildPartial() {
      POGOProtos.Rpc.MarkReadNewsArticleProto result = new POGOProtos.Rpc.MarkReadNewsArticleProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        newsIds_ = newsIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.newsIds_ = newsIds_;
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
      if (other instanceof POGOProtos.Rpc.MarkReadNewsArticleProto) {
        return mergeFrom((POGOProtos.Rpc.MarkReadNewsArticleProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MarkReadNewsArticleProto other) {
      if (other == POGOProtos.Rpc.MarkReadNewsArticleProto.getDefaultInstance()) return this;
      if (!other.newsIds_.isEmpty()) {
        if (newsIds_.isEmpty()) {
          newsIds_ = other.newsIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNewsIdsIsMutable();
          newsIds_.addAll(other.newsIds_);
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
      POGOProtos.Rpc.MarkReadNewsArticleProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MarkReadNewsArticleProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList newsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNewsIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        newsIds_ = new com.google.protobuf.LazyStringArrayList(newsIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @return A list containing the newsIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNewsIdsList() {
      return newsIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @return The count of newsIds.
     */
    public int getNewsIdsCount() {
      return newsIds_.size();
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The newsIds at the given index.
     */
    public java.lang.String getNewsIds(int index) {
      return newsIds_.get(index);
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the newsIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNewsIdsBytes(int index) {
      return newsIds_.getByteString(index);
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The newsIds to set.
     * @return This builder for chaining.
     */
    public Builder setNewsIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNewsIdsIsMutable();
      newsIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @param value The newsIds to add.
     * @return This builder for chaining.
     */
    public Builder addNewsIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNewsIdsIsMutable();
      newsIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @param values The newsIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNewsIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNewsIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, newsIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewsIds() {
      newsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string news_ids = 1;</code>
     * @param value The bytes of the newsIds to add.
     * @return This builder for chaining.
     */
    public Builder addNewsIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNewsIdsIsMutable();
      newsIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MarkReadNewsArticleProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MarkReadNewsArticleProto)
  private static final POGOProtos.Rpc.MarkReadNewsArticleProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MarkReadNewsArticleProto();
  }

  public static POGOProtos.Rpc.MarkReadNewsArticleProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarkReadNewsArticleProto>
      PARSER = new com.google.protobuf.AbstractParser<MarkReadNewsArticleProto>() {
    @java.lang.Override
    public MarkReadNewsArticleProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MarkReadNewsArticleProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MarkReadNewsArticleProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarkReadNewsArticleProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MarkReadNewsArticleProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

