// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LAJNLGDIOIB}
 */
public  final class LAJNLGDIOIB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LAJNLGDIOIB)
    LAJNLGDIOIBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LAJNLGDIOIB.newBuilder() to construct.
  private LAJNLGDIOIB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LAJNLGDIOIB() {
    nnbebicppgp_ = "";
    mmkcnikfieg_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LAJNLGDIOIB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LAJNLGDIOIB(
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

            nnbebicppgp_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mmkcnikfieg_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            mmkcnikfieg_.addLong(input.readUInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              mmkcnikfieg_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              mmkcnikfieg_.addLong(input.readUInt64());
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
        mmkcnikfieg_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LAJNLGDIOIB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LAJNLGDIOIB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LAJNLGDIOIB.class, POGOProtos.Rpc.LAJNLGDIOIB.Builder.class);
  }

  public static final int NNBEBICPPGP_FIELD_NUMBER = 1;
  private volatile java.lang.Object nnbebicppgp_;
  /**
   * <code>string nnbebicppgp = 1;</code>
   * @return The nnbebicppgp.
   */
  public java.lang.String getNnbebicppgp() {
    java.lang.Object ref = nnbebicppgp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nnbebicppgp_ = s;
      return s;
    }
  }
  /**
   * <code>string nnbebicppgp = 1;</code>
   * @return The bytes for nnbebicppgp.
   */
  public com.google.protobuf.ByteString
      getNnbebicppgpBytes() {
    java.lang.Object ref = nnbebicppgp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nnbebicppgp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MMKCNIKFIEG_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList mmkcnikfieg_;
  /**
   * <code>repeated uint64 mmkcnikfieg = 2;</code>
   * @return A list containing the mmkcnikfieg.
   */
  public java.util.List<java.lang.Long>
      getMmkcnikfiegList() {
    return mmkcnikfieg_;
  }
  /**
   * <code>repeated uint64 mmkcnikfieg = 2;</code>
   * @return The count of mmkcnikfieg.
   */
  public int getMmkcnikfiegCount() {
    return mmkcnikfieg_.size();
  }
  /**
   * <code>repeated uint64 mmkcnikfieg = 2;</code>
   * @param index The index of the element to return.
   * @return The mmkcnikfieg at the given index.
   */
  public long getMmkcnikfieg(int index) {
    return mmkcnikfieg_.getLong(index);
  }
  private int mmkcnikfiegMemoizedSerializedSize = -1;

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
    if (!getNnbebicppgpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nnbebicppgp_);
    }
    if (getMmkcnikfiegList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(mmkcnikfiegMemoizedSerializedSize);
    }
    for (int i = 0; i < mmkcnikfieg_.size(); i++) {
      output.writeUInt64NoTag(mmkcnikfieg_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNnbebicppgpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nnbebicppgp_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < mmkcnikfieg_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(mmkcnikfieg_.getLong(i));
      }
      size += dataSize;
      if (!getMmkcnikfiegList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      mmkcnikfiegMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.LAJNLGDIOIB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LAJNLGDIOIB other = (POGOProtos.Rpc.LAJNLGDIOIB) obj;

    if (!getNnbebicppgp()
        .equals(other.getNnbebicppgp())) return false;
    if (!getMmkcnikfiegList()
        .equals(other.getMmkcnikfiegList())) return false;
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
    hash = (37 * hash) + NNBEBICPPGP_FIELD_NUMBER;
    hash = (53 * hash) + getNnbebicppgp().hashCode();
    if (getMmkcnikfiegCount() > 0) {
      hash = (37 * hash) + MMKCNIKFIEG_FIELD_NUMBER;
      hash = (53 * hash) + getMmkcnikfiegList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LAJNLGDIOIB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LAJNLGDIOIB prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LAJNLGDIOIB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LAJNLGDIOIB)
      POGOProtos.Rpc.LAJNLGDIOIBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LAJNLGDIOIB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LAJNLGDIOIB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LAJNLGDIOIB.class, POGOProtos.Rpc.LAJNLGDIOIB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LAJNLGDIOIB.newBuilder()
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
      nnbebicppgp_ = "";

      mmkcnikfieg_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LAJNLGDIOIB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LAJNLGDIOIB getDefaultInstanceForType() {
      return POGOProtos.Rpc.LAJNLGDIOIB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LAJNLGDIOIB build() {
      POGOProtos.Rpc.LAJNLGDIOIB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LAJNLGDIOIB buildPartial() {
      POGOProtos.Rpc.LAJNLGDIOIB result = new POGOProtos.Rpc.LAJNLGDIOIB(this);
      int from_bitField0_ = bitField0_;
      result.nnbebicppgp_ = nnbebicppgp_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mmkcnikfieg_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mmkcnikfieg_ = mmkcnikfieg_;
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
      if (other instanceof POGOProtos.Rpc.LAJNLGDIOIB) {
        return mergeFrom((POGOProtos.Rpc.LAJNLGDIOIB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LAJNLGDIOIB other) {
      if (other == POGOProtos.Rpc.LAJNLGDIOIB.getDefaultInstance()) return this;
      if (!other.getNnbebicppgp().isEmpty()) {
        nnbebicppgp_ = other.nnbebicppgp_;
        onChanged();
      }
      if (!other.mmkcnikfieg_.isEmpty()) {
        if (mmkcnikfieg_.isEmpty()) {
          mmkcnikfieg_ = other.mmkcnikfieg_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMmkcnikfiegIsMutable();
          mmkcnikfieg_.addAll(other.mmkcnikfieg_);
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
      POGOProtos.Rpc.LAJNLGDIOIB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LAJNLGDIOIB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object nnbebicppgp_ = "";
    /**
     * <code>string nnbebicppgp = 1;</code>
     * @return The nnbebicppgp.
     */
    public java.lang.String getNnbebicppgp() {
      java.lang.Object ref = nnbebicppgp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nnbebicppgp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nnbebicppgp = 1;</code>
     * @return The bytes for nnbebicppgp.
     */
    public com.google.protobuf.ByteString
        getNnbebicppgpBytes() {
      java.lang.Object ref = nnbebicppgp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nnbebicppgp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nnbebicppgp = 1;</code>
     * @param value The nnbebicppgp to set.
     * @return This builder for chaining.
     */
    public Builder setNnbebicppgp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nnbebicppgp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nnbebicppgp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNnbebicppgp() {
      
      nnbebicppgp_ = getDefaultInstance().getNnbebicppgp();
      onChanged();
      return this;
    }
    /**
     * <code>string nnbebicppgp = 1;</code>
     * @param value The bytes for nnbebicppgp to set.
     * @return This builder for chaining.
     */
    public Builder setNnbebicppgpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nnbebicppgp_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList mmkcnikfieg_ = emptyLongList();
    private void ensureMmkcnikfiegIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mmkcnikfieg_ = mutableCopy(mmkcnikfieg_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @return A list containing the mmkcnikfieg.
     */
    public java.util.List<java.lang.Long>
        getMmkcnikfiegList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(mmkcnikfieg_) : mmkcnikfieg_;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @return The count of mmkcnikfieg.
     */
    public int getMmkcnikfiegCount() {
      return mmkcnikfieg_.size();
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param index The index of the element to return.
     * @return The mmkcnikfieg at the given index.
     */
    public long getMmkcnikfieg(int index) {
      return mmkcnikfieg_.getLong(index);
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param index The index to set the value at.
     * @param value The mmkcnikfieg to set.
     * @return This builder for chaining.
     */
    public Builder setMmkcnikfieg(
        int index, long value) {
      ensureMmkcnikfiegIsMutable();
      mmkcnikfieg_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param value The mmkcnikfieg to add.
     * @return This builder for chaining.
     */
    public Builder addMmkcnikfieg(long value) {
      ensureMmkcnikfiegIsMutable();
      mmkcnikfieg_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @param values The mmkcnikfieg to add.
     * @return This builder for chaining.
     */
    public Builder addAllMmkcnikfieg(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureMmkcnikfiegIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, mmkcnikfieg_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 mmkcnikfieg = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmkcnikfieg() {
      mmkcnikfieg_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LAJNLGDIOIB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LAJNLGDIOIB)
  private static final POGOProtos.Rpc.LAJNLGDIOIB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LAJNLGDIOIB();
  }

  public static POGOProtos.Rpc.LAJNLGDIOIB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LAJNLGDIOIB>
      PARSER = new com.google.protobuf.AbstractParser<LAJNLGDIOIB>() {
    @java.lang.Override
    public LAJNLGDIOIB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LAJNLGDIOIB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LAJNLGDIOIB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LAJNLGDIOIB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LAJNLGDIOIB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

