// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.DownloadUrlOutProto}
 */
public  final class DownloadUrlOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DownloadUrlOutProto)
    DownloadUrlOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DownloadUrlOutProto.newBuilder() to construct.
  private DownloadUrlOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DownloadUrlOutProto() {
    downloadUrls_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DownloadUrlOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DownloadUrlOutProto(
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
              downloadUrls_ = new java.util.ArrayList<POGOProtos.Rpc.DownloadUrlEntryProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            downloadUrls_.add(
                input.readMessage(POGOProtos.Rpc.DownloadUrlEntryProto.parser(), extensionRegistry));
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
        downloadUrls_ = java.util.Collections.unmodifiableList(downloadUrls_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DownloadUrlOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DownloadUrlOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DownloadUrlOutProto.class, POGOProtos.Rpc.DownloadUrlOutProto.Builder.class);
  }

  public static final int DOWNLOAD_URLS_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.DownloadUrlEntryProto> downloadUrls_;
  /**
   * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
   */
  public java.util.List<POGOProtos.Rpc.DownloadUrlEntryProto> getDownloadUrlsList() {
    return downloadUrls_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder> 
      getDownloadUrlsOrBuilderList() {
    return downloadUrls_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
   */
  public int getDownloadUrlsCount() {
    return downloadUrls_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
   */
  public POGOProtos.Rpc.DownloadUrlEntryProto getDownloadUrls(int index) {
    return downloadUrls_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
   */
  public POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder getDownloadUrlsOrBuilder(
      int index) {
    return downloadUrls_.get(index);
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
    for (int i = 0; i < downloadUrls_.size(); i++) {
      output.writeMessage(1, downloadUrls_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < downloadUrls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, downloadUrls_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.DownloadUrlOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DownloadUrlOutProto other = (POGOProtos.Rpc.DownloadUrlOutProto) obj;

    if (!getDownloadUrlsList()
        .equals(other.getDownloadUrlsList())) return false;
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
    if (getDownloadUrlsCount() > 0) {
      hash = (37 * hash) + DOWNLOAD_URLS_FIELD_NUMBER;
      hash = (53 * hash) + getDownloadUrlsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DownloadUrlOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DownloadUrlOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.DownloadUrlOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DownloadUrlOutProto)
      POGOProtos.Rpc.DownloadUrlOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DownloadUrlOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DownloadUrlOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DownloadUrlOutProto.class, POGOProtos.Rpc.DownloadUrlOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DownloadUrlOutProto.newBuilder()
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
        getDownloadUrlsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (downloadUrlsBuilder_ == null) {
        downloadUrls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        downloadUrlsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_DownloadUrlOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DownloadUrlOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.DownloadUrlOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DownloadUrlOutProto build() {
      POGOProtos.Rpc.DownloadUrlOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DownloadUrlOutProto buildPartial() {
      POGOProtos.Rpc.DownloadUrlOutProto result = new POGOProtos.Rpc.DownloadUrlOutProto(this);
      int from_bitField0_ = bitField0_;
      if (downloadUrlsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          downloadUrls_ = java.util.Collections.unmodifiableList(downloadUrls_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.downloadUrls_ = downloadUrls_;
      } else {
        result.downloadUrls_ = downloadUrlsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.DownloadUrlOutProto) {
        return mergeFrom((POGOProtos.Rpc.DownloadUrlOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DownloadUrlOutProto other) {
      if (other == POGOProtos.Rpc.DownloadUrlOutProto.getDefaultInstance()) return this;
      if (downloadUrlsBuilder_ == null) {
        if (!other.downloadUrls_.isEmpty()) {
          if (downloadUrls_.isEmpty()) {
            downloadUrls_ = other.downloadUrls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDownloadUrlsIsMutable();
            downloadUrls_.addAll(other.downloadUrls_);
          }
          onChanged();
        }
      } else {
        if (!other.downloadUrls_.isEmpty()) {
          if (downloadUrlsBuilder_.isEmpty()) {
            downloadUrlsBuilder_.dispose();
            downloadUrlsBuilder_ = null;
            downloadUrls_ = other.downloadUrls_;
            bitField0_ = (bitField0_ & ~0x00000001);
            downloadUrlsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDownloadUrlsFieldBuilder() : null;
          } else {
            downloadUrlsBuilder_.addAllMessages(other.downloadUrls_);
          }
        }
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
      POGOProtos.Rpc.DownloadUrlOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DownloadUrlOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.DownloadUrlEntryProto> downloadUrls_ =
      java.util.Collections.emptyList();
    private void ensureDownloadUrlsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        downloadUrls_ = new java.util.ArrayList<POGOProtos.Rpc.DownloadUrlEntryProto>(downloadUrls_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DownloadUrlEntryProto, POGOProtos.Rpc.DownloadUrlEntryProto.Builder, POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder> downloadUrlsBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.DownloadUrlEntryProto> getDownloadUrlsList() {
      if (downloadUrlsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(downloadUrls_);
      } else {
        return downloadUrlsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public int getDownloadUrlsCount() {
      if (downloadUrlsBuilder_ == null) {
        return downloadUrls_.size();
      } else {
        return downloadUrlsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public POGOProtos.Rpc.DownloadUrlEntryProto getDownloadUrls(int index) {
      if (downloadUrlsBuilder_ == null) {
        return downloadUrls_.get(index);
      } else {
        return downloadUrlsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder setDownloadUrls(
        int index, POGOProtos.Rpc.DownloadUrlEntryProto value) {
      if (downloadUrlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDownloadUrlsIsMutable();
        downloadUrls_.set(index, value);
        onChanged();
      } else {
        downloadUrlsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder setDownloadUrls(
        int index, POGOProtos.Rpc.DownloadUrlEntryProto.Builder builderForValue) {
      if (downloadUrlsBuilder_ == null) {
        ensureDownloadUrlsIsMutable();
        downloadUrls_.set(index, builderForValue.build());
        onChanged();
      } else {
        downloadUrlsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder addDownloadUrls(POGOProtos.Rpc.DownloadUrlEntryProto value) {
      if (downloadUrlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDownloadUrlsIsMutable();
        downloadUrls_.add(value);
        onChanged();
      } else {
        downloadUrlsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder addDownloadUrls(
        int index, POGOProtos.Rpc.DownloadUrlEntryProto value) {
      if (downloadUrlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDownloadUrlsIsMutable();
        downloadUrls_.add(index, value);
        onChanged();
      } else {
        downloadUrlsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder addDownloadUrls(
        POGOProtos.Rpc.DownloadUrlEntryProto.Builder builderForValue) {
      if (downloadUrlsBuilder_ == null) {
        ensureDownloadUrlsIsMutable();
        downloadUrls_.add(builderForValue.build());
        onChanged();
      } else {
        downloadUrlsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder addDownloadUrls(
        int index, POGOProtos.Rpc.DownloadUrlEntryProto.Builder builderForValue) {
      if (downloadUrlsBuilder_ == null) {
        ensureDownloadUrlsIsMutable();
        downloadUrls_.add(index, builderForValue.build());
        onChanged();
      } else {
        downloadUrlsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder addAllDownloadUrls(
        java.lang.Iterable<? extends POGOProtos.Rpc.DownloadUrlEntryProto> values) {
      if (downloadUrlsBuilder_ == null) {
        ensureDownloadUrlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, downloadUrls_);
        onChanged();
      } else {
        downloadUrlsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder clearDownloadUrls() {
      if (downloadUrlsBuilder_ == null) {
        downloadUrls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        downloadUrlsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public Builder removeDownloadUrls(int index) {
      if (downloadUrlsBuilder_ == null) {
        ensureDownloadUrlsIsMutable();
        downloadUrls_.remove(index);
        onChanged();
      } else {
        downloadUrlsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public POGOProtos.Rpc.DownloadUrlEntryProto.Builder getDownloadUrlsBuilder(
        int index) {
      return getDownloadUrlsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder getDownloadUrlsOrBuilder(
        int index) {
      if (downloadUrlsBuilder_ == null) {
        return downloadUrls_.get(index);  } else {
        return downloadUrlsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder> 
         getDownloadUrlsOrBuilderList() {
      if (downloadUrlsBuilder_ != null) {
        return downloadUrlsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(downloadUrls_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public POGOProtos.Rpc.DownloadUrlEntryProto.Builder addDownloadUrlsBuilder() {
      return getDownloadUrlsFieldBuilder().addBuilder(
          POGOProtos.Rpc.DownloadUrlEntryProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public POGOProtos.Rpc.DownloadUrlEntryProto.Builder addDownloadUrlsBuilder(
        int index) {
      return getDownloadUrlsFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.DownloadUrlEntryProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DownloadUrlEntryProto download_urls = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.DownloadUrlEntryProto.Builder> 
         getDownloadUrlsBuilderList() {
      return getDownloadUrlsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DownloadUrlEntryProto, POGOProtos.Rpc.DownloadUrlEntryProto.Builder, POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder> 
        getDownloadUrlsFieldBuilder() {
      if (downloadUrlsBuilder_ == null) {
        downloadUrlsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.DownloadUrlEntryProto, POGOProtos.Rpc.DownloadUrlEntryProto.Builder, POGOProtos.Rpc.DownloadUrlEntryProtoOrBuilder>(
                downloadUrls_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        downloadUrls_ = null;
      }
      return downloadUrlsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DownloadUrlOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DownloadUrlOutProto)
  private static final POGOProtos.Rpc.DownloadUrlOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DownloadUrlOutProto();
  }

  public static POGOProtos.Rpc.DownloadUrlOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DownloadUrlOutProto>
      PARSER = new com.google.protobuf.AbstractParser<DownloadUrlOutProto>() {
    @java.lang.Override
    public DownloadUrlOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DownloadUrlOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DownloadUrlOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DownloadUrlOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DownloadUrlOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

