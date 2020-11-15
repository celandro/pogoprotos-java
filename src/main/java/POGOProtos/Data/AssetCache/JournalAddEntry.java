// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/AssetCache/JournalAddEntry.proto

package POGOProtos.Data.AssetCache;

/**
 * Protobuf type {@code POGOProtos.Data.AssetCache.JournalAddEntry}
 */
public final class JournalAddEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.AssetCache.JournalAddEntry)
    JournalAddEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JournalAddEntry.newBuilder() to construct.
  private JournalAddEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JournalAddEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JournalAddEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JournalAddEntry(
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
            POGOProtos.Data.AssetCache.HashedKey.Builder subBuilder = null;
            if (hashedKey_ != null) {
              subBuilder = hashedKey_.toBuilder();
            }
            hashedKey_ = input.readMessage(POGOProtos.Data.AssetCache.HashedKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hashedKey_);
              hashedKey_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            entrySize_ = input.readInt64();
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
    return POGOProtos.Data.AssetCache.JournalAddEntryOuterClass.internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.AssetCache.JournalAddEntryOuterClass.internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.AssetCache.JournalAddEntry.class, POGOProtos.Data.AssetCache.JournalAddEntry.Builder.class);
  }

  public static final int HASHED_KEY_FIELD_NUMBER = 1;
  private POGOProtos.Data.AssetCache.HashedKey hashedKey_;
  /**
   * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
   * @return Whether the hashedKey field is set.
   */
  @java.lang.Override
  public boolean hasHashedKey() {
    return hashedKey_ != null;
  }
  /**
   * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
   * @return The hashedKey.
   */
  @java.lang.Override
  public POGOProtos.Data.AssetCache.HashedKey getHashedKey() {
    return hashedKey_ == null ? POGOProtos.Data.AssetCache.HashedKey.getDefaultInstance() : hashedKey_;
  }
  /**
   * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.AssetCache.HashedKeyOrBuilder getHashedKeyOrBuilder() {
    return getHashedKey();
  }

  public static final int ENTRY_SIZE_FIELD_NUMBER = 2;
  private long entrySize_;
  /**
   * <code>int64 entry_size = 2;</code>
   * @return The entrySize.
   */
  @java.lang.Override
  public long getEntrySize() {
    return entrySize_;
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
    if (hashedKey_ != null) {
      output.writeMessage(1, getHashedKey());
    }
    if (entrySize_ != 0L) {
      output.writeInt64(2, entrySize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hashedKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHashedKey());
    }
    if (entrySize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, entrySize_);
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
    if (!(obj instanceof POGOProtos.Data.AssetCache.JournalAddEntry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.AssetCache.JournalAddEntry other = (POGOProtos.Data.AssetCache.JournalAddEntry) obj;

    if (hasHashedKey() != other.hasHashedKey()) return false;
    if (hasHashedKey()) {
      if (!getHashedKey()
          .equals(other.getHashedKey())) return false;
    }
    if (getEntrySize()
        != other.getEntrySize()) return false;
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
    if (hasHashedKey()) {
      hash = (37 * hash) + HASHED_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getHashedKey().hashCode();
    }
    hash = (37 * hash) + ENTRY_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEntrySize());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.AssetCache.JournalAddEntry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.AssetCache.JournalAddEntry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.AssetCache.JournalAddEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.AssetCache.JournalAddEntry)
      POGOProtos.Data.AssetCache.JournalAddEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.AssetCache.JournalAddEntryOuterClass.internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.AssetCache.JournalAddEntryOuterClass.internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.AssetCache.JournalAddEntry.class, POGOProtos.Data.AssetCache.JournalAddEntry.Builder.class);
    }

    // Construct using POGOProtos.Data.AssetCache.JournalAddEntry.newBuilder()
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
      if (hashedKeyBuilder_ == null) {
        hashedKey_ = null;
      } else {
        hashedKey_ = null;
        hashedKeyBuilder_ = null;
      }
      entrySize_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.AssetCache.JournalAddEntryOuterClass.internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.AssetCache.JournalAddEntry getDefaultInstanceForType() {
      return POGOProtos.Data.AssetCache.JournalAddEntry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.AssetCache.JournalAddEntry build() {
      POGOProtos.Data.AssetCache.JournalAddEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.AssetCache.JournalAddEntry buildPartial() {
      POGOProtos.Data.AssetCache.JournalAddEntry result = new POGOProtos.Data.AssetCache.JournalAddEntry(this);
      if (hashedKeyBuilder_ == null) {
        result.hashedKey_ = hashedKey_;
      } else {
        result.hashedKey_ = hashedKeyBuilder_.build();
      }
      result.entrySize_ = entrySize_;
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
      if (other instanceof POGOProtos.Data.AssetCache.JournalAddEntry) {
        return mergeFrom((POGOProtos.Data.AssetCache.JournalAddEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.AssetCache.JournalAddEntry other) {
      if (other == POGOProtos.Data.AssetCache.JournalAddEntry.getDefaultInstance()) return this;
      if (other.hasHashedKey()) {
        mergeHashedKey(other.getHashedKey());
      }
      if (other.getEntrySize() != 0L) {
        setEntrySize(other.getEntrySize());
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
      POGOProtos.Data.AssetCache.JournalAddEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.AssetCache.JournalAddEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Data.AssetCache.HashedKey hashedKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.AssetCache.HashedKey, POGOProtos.Data.AssetCache.HashedKey.Builder, POGOProtos.Data.AssetCache.HashedKeyOrBuilder> hashedKeyBuilder_;
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     * @return Whether the hashedKey field is set.
     */
    public boolean hasHashedKey() {
      return hashedKeyBuilder_ != null || hashedKey_ != null;
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     * @return The hashedKey.
     */
    public POGOProtos.Data.AssetCache.HashedKey getHashedKey() {
      if (hashedKeyBuilder_ == null) {
        return hashedKey_ == null ? POGOProtos.Data.AssetCache.HashedKey.getDefaultInstance() : hashedKey_;
      } else {
        return hashedKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    public Builder setHashedKey(POGOProtos.Data.AssetCache.HashedKey value) {
      if (hashedKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hashedKey_ = value;
        onChanged();
      } else {
        hashedKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    public Builder setHashedKey(
        POGOProtos.Data.AssetCache.HashedKey.Builder builderForValue) {
      if (hashedKeyBuilder_ == null) {
        hashedKey_ = builderForValue.build();
        onChanged();
      } else {
        hashedKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    public Builder mergeHashedKey(POGOProtos.Data.AssetCache.HashedKey value) {
      if (hashedKeyBuilder_ == null) {
        if (hashedKey_ != null) {
          hashedKey_ =
            POGOProtos.Data.AssetCache.HashedKey.newBuilder(hashedKey_).mergeFrom(value).buildPartial();
        } else {
          hashedKey_ = value;
        }
        onChanged();
      } else {
        hashedKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    public Builder clearHashedKey() {
      if (hashedKeyBuilder_ == null) {
        hashedKey_ = null;
        onChanged();
      } else {
        hashedKey_ = null;
        hashedKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    public POGOProtos.Data.AssetCache.HashedKey.Builder getHashedKeyBuilder() {
      
      onChanged();
      return getHashedKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    public POGOProtos.Data.AssetCache.HashedKeyOrBuilder getHashedKeyOrBuilder() {
      if (hashedKeyBuilder_ != null) {
        return hashedKeyBuilder_.getMessageOrBuilder();
      } else {
        return hashedKey_ == null ?
            POGOProtos.Data.AssetCache.HashedKey.getDefaultInstance() : hashedKey_;
      }
    }
    /**
     * <code>.POGOProtos.Data.AssetCache.HashedKey hashed_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.AssetCache.HashedKey, POGOProtos.Data.AssetCache.HashedKey.Builder, POGOProtos.Data.AssetCache.HashedKeyOrBuilder> 
        getHashedKeyFieldBuilder() {
      if (hashedKeyBuilder_ == null) {
        hashedKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.AssetCache.HashedKey, POGOProtos.Data.AssetCache.HashedKey.Builder, POGOProtos.Data.AssetCache.HashedKeyOrBuilder>(
                getHashedKey(),
                getParentForChildren(),
                isClean());
        hashedKey_ = null;
      }
      return hashedKeyBuilder_;
    }

    private long entrySize_ ;
    /**
     * <code>int64 entry_size = 2;</code>
     * @return The entrySize.
     */
    @java.lang.Override
    public long getEntrySize() {
      return entrySize_;
    }
    /**
     * <code>int64 entry_size = 2;</code>
     * @param value The entrySize to set.
     * @return This builder for chaining.
     */
    public Builder setEntrySize(long value) {
      
      entrySize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 entry_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntrySize() {
      
      entrySize_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.AssetCache.JournalAddEntry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.AssetCache.JournalAddEntry)
  private static final POGOProtos.Data.AssetCache.JournalAddEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.AssetCache.JournalAddEntry();
  }

  public static POGOProtos.Data.AssetCache.JournalAddEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JournalAddEntry>
      PARSER = new com.google.protobuf.AbstractParser<JournalAddEntry>() {
    @java.lang.Override
    public JournalAddEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JournalAddEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JournalAddEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JournalAddEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.AssetCache.JournalAddEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

