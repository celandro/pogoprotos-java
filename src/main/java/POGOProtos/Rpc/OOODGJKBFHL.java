// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OOODGJKBFHL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OOODGJKBFHL}
 */
public final class OOODGJKBFHL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OOODGJKBFHL)
    OOODGJKBFHLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OOODGJKBFHL.newBuilder() to construct.
  private OOODGJKBFHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OOODGJKBFHL() {
    hbilofnlfja_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OOODGJKBFHL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OOODGJKBFHL(
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
              hbilofnlfja_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            hbilofnlfja_.add(s);
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
        hbilofnlfja_ = hbilofnlfja_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OOODGJKBFHL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OOODGJKBFHL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OOODGJKBFHL.class, POGOProtos.Rpc.OOODGJKBFHL.Builder.class);
  }

  public static final int HBILOFNLFJA_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList hbilofnlfja_;
  /**
   * <code>repeated string hbilofnlfja = 1;</code>
   * @return A list containing the hbilofnlfja.
   */
  public com.google.protobuf.ProtocolStringList
      getHbilofnlfjaList() {
    return hbilofnlfja_;
  }
  /**
   * <code>repeated string hbilofnlfja = 1;</code>
   * @return The count of hbilofnlfja.
   */
  public int getHbilofnlfjaCount() {
    return hbilofnlfja_.size();
  }
  /**
   * <code>repeated string hbilofnlfja = 1;</code>
   * @param index The index of the element to return.
   * @return The hbilofnlfja at the given index.
   */
  public java.lang.String getHbilofnlfja(int index) {
    return hbilofnlfja_.get(index);
  }
  /**
   * <code>repeated string hbilofnlfja = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the hbilofnlfja at the given index.
   */
  public com.google.protobuf.ByteString
      getHbilofnlfjaBytes(int index) {
    return hbilofnlfja_.getByteString(index);
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
    for (int i = 0; i < hbilofnlfja_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hbilofnlfja_.getRaw(i));
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
      for (int i = 0; i < hbilofnlfja_.size(); i++) {
        dataSize += computeStringSizeNoTag(hbilofnlfja_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHbilofnlfjaList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.OOODGJKBFHL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OOODGJKBFHL other = (POGOProtos.Rpc.OOODGJKBFHL) obj;

    if (!getHbilofnlfjaList()
        .equals(other.getHbilofnlfjaList())) return false;
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
    if (getHbilofnlfjaCount() > 0) {
      hash = (37 * hash) + HBILOFNLFJA_FIELD_NUMBER;
      hash = (53 * hash) + getHbilofnlfjaList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OOODGJKBFHL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OOODGJKBFHL prototype) {
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
   * <pre>
   * ref: OOODGJKBFHL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OOODGJKBFHL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OOODGJKBFHL)
      POGOProtos.Rpc.OOODGJKBFHLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OOODGJKBFHL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OOODGJKBFHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OOODGJKBFHL.class, POGOProtos.Rpc.OOODGJKBFHL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OOODGJKBFHL.newBuilder()
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
      hbilofnlfja_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OOODGJKBFHL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OOODGJKBFHL getDefaultInstanceForType() {
      return POGOProtos.Rpc.OOODGJKBFHL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OOODGJKBFHL build() {
      POGOProtos.Rpc.OOODGJKBFHL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OOODGJKBFHL buildPartial() {
      POGOProtos.Rpc.OOODGJKBFHL result = new POGOProtos.Rpc.OOODGJKBFHL(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        hbilofnlfja_ = hbilofnlfja_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.hbilofnlfja_ = hbilofnlfja_;
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
      if (other instanceof POGOProtos.Rpc.OOODGJKBFHL) {
        return mergeFrom((POGOProtos.Rpc.OOODGJKBFHL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OOODGJKBFHL other) {
      if (other == POGOProtos.Rpc.OOODGJKBFHL.getDefaultInstance()) return this;
      if (!other.hbilofnlfja_.isEmpty()) {
        if (hbilofnlfja_.isEmpty()) {
          hbilofnlfja_ = other.hbilofnlfja_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureHbilofnlfjaIsMutable();
          hbilofnlfja_.addAll(other.hbilofnlfja_);
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
      POGOProtos.Rpc.OOODGJKBFHL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OOODGJKBFHL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList hbilofnlfja_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureHbilofnlfjaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hbilofnlfja_ = new com.google.protobuf.LazyStringArrayList(hbilofnlfja_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @return A list containing the hbilofnlfja.
     */
    public com.google.protobuf.ProtocolStringList
        getHbilofnlfjaList() {
      return hbilofnlfja_.getUnmodifiableView();
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @return The count of hbilofnlfja.
     */
    public int getHbilofnlfjaCount() {
      return hbilofnlfja_.size();
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @param index The index of the element to return.
     * @return The hbilofnlfja at the given index.
     */
    public java.lang.String getHbilofnlfja(int index) {
      return hbilofnlfja_.get(index);
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the hbilofnlfja at the given index.
     */
    public com.google.protobuf.ByteString
        getHbilofnlfjaBytes(int index) {
      return hbilofnlfja_.getByteString(index);
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @param index The index to set the value at.
     * @param value The hbilofnlfja to set.
     * @return This builder for chaining.
     */
    public Builder setHbilofnlfja(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHbilofnlfjaIsMutable();
      hbilofnlfja_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @param value The hbilofnlfja to add.
     * @return This builder for chaining.
     */
    public Builder addHbilofnlfja(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHbilofnlfjaIsMutable();
      hbilofnlfja_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @param values The hbilofnlfja to add.
     * @return This builder for chaining.
     */
    public Builder addAllHbilofnlfja(
        java.lang.Iterable<java.lang.String> values) {
      ensureHbilofnlfjaIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hbilofnlfja_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHbilofnlfja() {
      hbilofnlfja_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string hbilofnlfja = 1;</code>
     * @param value The bytes of the hbilofnlfja to add.
     * @return This builder for chaining.
     */
    public Builder addHbilofnlfjaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureHbilofnlfjaIsMutable();
      hbilofnlfja_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OOODGJKBFHL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OOODGJKBFHL)
  private static final POGOProtos.Rpc.OOODGJKBFHL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OOODGJKBFHL();
  }

  public static POGOProtos.Rpc.OOODGJKBFHL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OOODGJKBFHL>
      PARSER = new com.google.protobuf.AbstractParser<OOODGJKBFHL>() {
    @java.lang.Override
    public OOODGJKBFHL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OOODGJKBFHL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OOODGJKBFHL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OOODGJKBFHL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OOODGJKBFHL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
