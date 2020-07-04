// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CurrentNewsProto}
 */
public  final class CurrentNewsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CurrentNewsProto)
    CurrentNewsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CurrentNewsProto.newBuilder() to construct.
  private CurrentNewsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CurrentNewsProto() {
    newsArticles_ = java.util.Collections.emptyList();
    newsStringsUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CurrentNewsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CurrentNewsProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              newsArticles_ = new java.util.ArrayList<POGOProtos.Rpc.NewsArticleProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            newsArticles_.add(
                input.readMessage(POGOProtos.Rpc.NewsArticleProto.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            newsStringsUrl_ = s;
            break;
          }
          case 24: {

            lastUpdatedTimestamp_ = input.readInt64();
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
        newsArticles_ = java.util.Collections.unmodifiableList(newsArticles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CurrentNewsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CurrentNewsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CurrentNewsProto.class, POGOProtos.Rpc.CurrentNewsProto.Builder.class);
  }

  public static final int NEWS_ARTICLES_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.NewsArticleProto> newsArticles_;
  /**
   * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
   */
  public java.util.List<POGOProtos.Rpc.NewsArticleProto> getNewsArticlesList() {
    return newsArticles_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.NewsArticleProtoOrBuilder> 
      getNewsArticlesOrBuilderList() {
    return newsArticles_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
   */
  public int getNewsArticlesCount() {
    return newsArticles_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
   */
  public POGOProtos.Rpc.NewsArticleProto getNewsArticles(int index) {
    return newsArticles_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
   */
  public POGOProtos.Rpc.NewsArticleProtoOrBuilder getNewsArticlesOrBuilder(
      int index) {
    return newsArticles_.get(index);
  }

  public static final int NEWS_STRINGS_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object newsStringsUrl_;
  /**
   * <code>string news_strings_url = 2;</code>
   * @return The newsStringsUrl.
   */
  public java.lang.String getNewsStringsUrl() {
    java.lang.Object ref = newsStringsUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newsStringsUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string news_strings_url = 2;</code>
   * @return The bytes for newsStringsUrl.
   */
  public com.google.protobuf.ByteString
      getNewsStringsUrlBytes() {
    java.lang.Object ref = newsStringsUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newsStringsUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_UPDATED_TIMESTAMP_FIELD_NUMBER = 3;
  private long lastUpdatedTimestamp_;
  /**
   * <code>int64 last_updated_timestamp = 3;</code>
   * @return The lastUpdatedTimestamp.
   */
  public long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp_;
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
    for (int i = 0; i < newsArticles_.size(); i++) {
      output.writeMessage(1, newsArticles_.get(i));
    }
    if (!getNewsStringsUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newsStringsUrl_);
    }
    if (lastUpdatedTimestamp_ != 0L) {
      output.writeInt64(3, lastUpdatedTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < newsArticles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, newsArticles_.get(i));
    }
    if (!getNewsStringsUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newsStringsUrl_);
    }
    if (lastUpdatedTimestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lastUpdatedTimestamp_);
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
    if (!(obj instanceof POGOProtos.Rpc.CurrentNewsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CurrentNewsProto other = (POGOProtos.Rpc.CurrentNewsProto) obj;

    if (!getNewsArticlesList()
        .equals(other.getNewsArticlesList())) return false;
    if (!getNewsStringsUrl()
        .equals(other.getNewsStringsUrl())) return false;
    if (getLastUpdatedTimestamp()
        != other.getLastUpdatedTimestamp()) return false;
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
    if (getNewsArticlesCount() > 0) {
      hash = (37 * hash) + NEWS_ARTICLES_FIELD_NUMBER;
      hash = (53 * hash) + getNewsArticlesList().hashCode();
    }
    hash = (37 * hash) + NEWS_STRINGS_URL_FIELD_NUMBER;
    hash = (53 * hash) + getNewsStringsUrl().hashCode();
    hash = (37 * hash) + LAST_UPDATED_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastUpdatedTimestamp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CurrentNewsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CurrentNewsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CurrentNewsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CurrentNewsProto)
      POGOProtos.Rpc.CurrentNewsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CurrentNewsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CurrentNewsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CurrentNewsProto.class, POGOProtos.Rpc.CurrentNewsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CurrentNewsProto.newBuilder()
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
        getNewsArticlesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (newsArticlesBuilder_ == null) {
        newsArticles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        newsArticlesBuilder_.clear();
      }
      newsStringsUrl_ = "";

      lastUpdatedTimestamp_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CurrentNewsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CurrentNewsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CurrentNewsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CurrentNewsProto build() {
      POGOProtos.Rpc.CurrentNewsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CurrentNewsProto buildPartial() {
      POGOProtos.Rpc.CurrentNewsProto result = new POGOProtos.Rpc.CurrentNewsProto(this);
      int from_bitField0_ = bitField0_;
      if (newsArticlesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          newsArticles_ = java.util.Collections.unmodifiableList(newsArticles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.newsArticles_ = newsArticles_;
      } else {
        result.newsArticles_ = newsArticlesBuilder_.build();
      }
      result.newsStringsUrl_ = newsStringsUrl_;
      result.lastUpdatedTimestamp_ = lastUpdatedTimestamp_;
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
      if (other instanceof POGOProtos.Rpc.CurrentNewsProto) {
        return mergeFrom((POGOProtos.Rpc.CurrentNewsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CurrentNewsProto other) {
      if (other == POGOProtos.Rpc.CurrentNewsProto.getDefaultInstance()) return this;
      if (newsArticlesBuilder_ == null) {
        if (!other.newsArticles_.isEmpty()) {
          if (newsArticles_.isEmpty()) {
            newsArticles_ = other.newsArticles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNewsArticlesIsMutable();
            newsArticles_.addAll(other.newsArticles_);
          }
          onChanged();
        }
      } else {
        if (!other.newsArticles_.isEmpty()) {
          if (newsArticlesBuilder_.isEmpty()) {
            newsArticlesBuilder_.dispose();
            newsArticlesBuilder_ = null;
            newsArticles_ = other.newsArticles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            newsArticlesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNewsArticlesFieldBuilder() : null;
          } else {
            newsArticlesBuilder_.addAllMessages(other.newsArticles_);
          }
        }
      }
      if (!other.getNewsStringsUrl().isEmpty()) {
        newsStringsUrl_ = other.newsStringsUrl_;
        onChanged();
      }
      if (other.getLastUpdatedTimestamp() != 0L) {
        setLastUpdatedTimestamp(other.getLastUpdatedTimestamp());
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
      POGOProtos.Rpc.CurrentNewsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CurrentNewsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.NewsArticleProto> newsArticles_ =
      java.util.Collections.emptyList();
    private void ensureNewsArticlesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        newsArticles_ = new java.util.ArrayList<POGOProtos.Rpc.NewsArticleProto>(newsArticles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.NewsArticleProto, POGOProtos.Rpc.NewsArticleProto.Builder, POGOProtos.Rpc.NewsArticleProtoOrBuilder> newsArticlesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.NewsArticleProto> getNewsArticlesList() {
      if (newsArticlesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(newsArticles_);
      } else {
        return newsArticlesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public int getNewsArticlesCount() {
      if (newsArticlesBuilder_ == null) {
        return newsArticles_.size();
      } else {
        return newsArticlesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public POGOProtos.Rpc.NewsArticleProto getNewsArticles(int index) {
      if (newsArticlesBuilder_ == null) {
        return newsArticles_.get(index);
      } else {
        return newsArticlesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder setNewsArticles(
        int index, POGOProtos.Rpc.NewsArticleProto value) {
      if (newsArticlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsArticlesIsMutable();
        newsArticles_.set(index, value);
        onChanged();
      } else {
        newsArticlesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder setNewsArticles(
        int index, POGOProtos.Rpc.NewsArticleProto.Builder builderForValue) {
      if (newsArticlesBuilder_ == null) {
        ensureNewsArticlesIsMutable();
        newsArticles_.set(index, builderForValue.build());
        onChanged();
      } else {
        newsArticlesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder addNewsArticles(POGOProtos.Rpc.NewsArticleProto value) {
      if (newsArticlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsArticlesIsMutable();
        newsArticles_.add(value);
        onChanged();
      } else {
        newsArticlesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder addNewsArticles(
        int index, POGOProtos.Rpc.NewsArticleProto value) {
      if (newsArticlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNewsArticlesIsMutable();
        newsArticles_.add(index, value);
        onChanged();
      } else {
        newsArticlesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder addNewsArticles(
        POGOProtos.Rpc.NewsArticleProto.Builder builderForValue) {
      if (newsArticlesBuilder_ == null) {
        ensureNewsArticlesIsMutable();
        newsArticles_.add(builderForValue.build());
        onChanged();
      } else {
        newsArticlesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder addNewsArticles(
        int index, POGOProtos.Rpc.NewsArticleProto.Builder builderForValue) {
      if (newsArticlesBuilder_ == null) {
        ensureNewsArticlesIsMutable();
        newsArticles_.add(index, builderForValue.build());
        onChanged();
      } else {
        newsArticlesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder addAllNewsArticles(
        java.lang.Iterable<? extends POGOProtos.Rpc.NewsArticleProto> values) {
      if (newsArticlesBuilder_ == null) {
        ensureNewsArticlesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, newsArticles_);
        onChanged();
      } else {
        newsArticlesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder clearNewsArticles() {
      if (newsArticlesBuilder_ == null) {
        newsArticles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        newsArticlesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public Builder removeNewsArticles(int index) {
      if (newsArticlesBuilder_ == null) {
        ensureNewsArticlesIsMutable();
        newsArticles_.remove(index);
        onChanged();
      } else {
        newsArticlesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public POGOProtos.Rpc.NewsArticleProto.Builder getNewsArticlesBuilder(
        int index) {
      return getNewsArticlesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public POGOProtos.Rpc.NewsArticleProtoOrBuilder getNewsArticlesOrBuilder(
        int index) {
      if (newsArticlesBuilder_ == null) {
        return newsArticles_.get(index);  } else {
        return newsArticlesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.NewsArticleProtoOrBuilder> 
         getNewsArticlesOrBuilderList() {
      if (newsArticlesBuilder_ != null) {
        return newsArticlesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(newsArticles_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public POGOProtos.Rpc.NewsArticleProto.Builder addNewsArticlesBuilder() {
      return getNewsArticlesFieldBuilder().addBuilder(
          POGOProtos.Rpc.NewsArticleProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public POGOProtos.Rpc.NewsArticleProto.Builder addNewsArticlesBuilder(
        int index) {
      return getNewsArticlesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.NewsArticleProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.NewsArticleProto news_articles = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.NewsArticleProto.Builder> 
         getNewsArticlesBuilderList() {
      return getNewsArticlesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.NewsArticleProto, POGOProtos.Rpc.NewsArticleProto.Builder, POGOProtos.Rpc.NewsArticleProtoOrBuilder> 
        getNewsArticlesFieldBuilder() {
      if (newsArticlesBuilder_ == null) {
        newsArticlesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.NewsArticleProto, POGOProtos.Rpc.NewsArticleProto.Builder, POGOProtos.Rpc.NewsArticleProtoOrBuilder>(
                newsArticles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        newsArticles_ = null;
      }
      return newsArticlesBuilder_;
    }

    private java.lang.Object newsStringsUrl_ = "";
    /**
     * <code>string news_strings_url = 2;</code>
     * @return The newsStringsUrl.
     */
    public java.lang.String getNewsStringsUrl() {
      java.lang.Object ref = newsStringsUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newsStringsUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string news_strings_url = 2;</code>
     * @return The bytes for newsStringsUrl.
     */
    public com.google.protobuf.ByteString
        getNewsStringsUrlBytes() {
      java.lang.Object ref = newsStringsUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newsStringsUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string news_strings_url = 2;</code>
     * @param value The newsStringsUrl to set.
     * @return This builder for chaining.
     */
    public Builder setNewsStringsUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newsStringsUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string news_strings_url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewsStringsUrl() {
      
      newsStringsUrl_ = getDefaultInstance().getNewsStringsUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string news_strings_url = 2;</code>
     * @param value The bytes for newsStringsUrl to set.
     * @return This builder for chaining.
     */
    public Builder setNewsStringsUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newsStringsUrl_ = value;
      onChanged();
      return this;
    }

    private long lastUpdatedTimestamp_ ;
    /**
     * <code>int64 last_updated_timestamp = 3;</code>
     * @return The lastUpdatedTimestamp.
     */
    public long getLastUpdatedTimestamp() {
      return lastUpdatedTimestamp_;
    }
    /**
     * <code>int64 last_updated_timestamp = 3;</code>
     * @param value The lastUpdatedTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setLastUpdatedTimestamp(long value) {
      
      lastUpdatedTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 last_updated_timestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastUpdatedTimestamp() {
      
      lastUpdatedTimestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CurrentNewsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CurrentNewsProto)
  private static final POGOProtos.Rpc.CurrentNewsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CurrentNewsProto();
  }

  public static POGOProtos.Rpc.CurrentNewsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CurrentNewsProto>
      PARSER = new com.google.protobuf.AbstractParser<CurrentNewsProto>() {
    @java.lang.Override
    public CurrentNewsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CurrentNewsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CurrentNewsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CurrentNewsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CurrentNewsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

