// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BNLLCCIDBHC
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BNLLCCIDBHC}
 */
public final class BNLLCCIDBHC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BNLLCCIDBHC)
    BNLLCCIDBHCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BNLLCCIDBHC.newBuilder() to construct.
  private BNLLCCIDBHC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BNLLCCIDBHC() {
    mfkgkhdmbpb_ = emptyLongList();
    emodglnocmb_ = "";
    npfkomnambb_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BNLLCCIDBHC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BNLLCCIDBHC(
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
              mfkgkhdmbpb_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            mfkgkhdmbpb_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              mfkgkhdmbpb_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              mfkgkhdmbpb_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            emodglnocmb_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            npfkomnambb_ = s;
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
        mfkgkhdmbpb_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLLCCIDBHC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLLCCIDBHC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BNLLCCIDBHC.class, POGOProtos.Rpc.BNLLCCIDBHC.Builder.class);
  }

  public static final int MFKGKHDMBPB_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList mfkgkhdmbpb_;
  /**
   * <code>repeated int64 mfkgkhdmbpb = 1;</code>
   * @return A list containing the mfkgkhdmbpb.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getMfkgkhdmbpbList() {
    return mfkgkhdmbpb_;
  }
  /**
   * <code>repeated int64 mfkgkhdmbpb = 1;</code>
   * @return The count of mfkgkhdmbpb.
   */
  public int getMfkgkhdmbpbCount() {
    return mfkgkhdmbpb_.size();
  }
  /**
   * <code>repeated int64 mfkgkhdmbpb = 1;</code>
   * @param index The index of the element to return.
   * @return The mfkgkhdmbpb at the given index.
   */
  public long getMfkgkhdmbpb(int index) {
    return mfkgkhdmbpb_.getLong(index);
  }
  private int mfkgkhdmbpbMemoizedSerializedSize = -1;

  public static final int EMODGLNOCMB_FIELD_NUMBER = 2;
  private volatile java.lang.Object emodglnocmb_;
  /**
   * <code>string emodglnocmb = 2;</code>
   * @return The emodglnocmb.
   */
  @java.lang.Override
  public java.lang.String getEmodglnocmb() {
    java.lang.Object ref = emodglnocmb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emodglnocmb_ = s;
      return s;
    }
  }
  /**
   * <code>string emodglnocmb = 2;</code>
   * @return The bytes for emodglnocmb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmodglnocmbBytes() {
    java.lang.Object ref = emodglnocmb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emodglnocmb_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NPFKOMNAMBB_FIELD_NUMBER = 3;
  private volatile java.lang.Object npfkomnambb_;
  /**
   * <code>string npfkomnambb = 3;</code>
   * @return The npfkomnambb.
   */
  @java.lang.Override
  public java.lang.String getNpfkomnambb() {
    java.lang.Object ref = npfkomnambb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      npfkomnambb_ = s;
      return s;
    }
  }
  /**
   * <code>string npfkomnambb = 3;</code>
   * @return The bytes for npfkomnambb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNpfkomnambbBytes() {
    java.lang.Object ref = npfkomnambb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      npfkomnambb_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    getSerializedSize();
    if (getMfkgkhdmbpbList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(mfkgkhdmbpbMemoizedSerializedSize);
    }
    for (int i = 0; i < mfkgkhdmbpb_.size(); i++) {
      output.writeInt64NoTag(mfkgkhdmbpb_.getLong(i));
    }
    if (!getEmodglnocmbBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, emodglnocmb_);
    }
    if (!getNpfkomnambbBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, npfkomnambb_);
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
      for (int i = 0; i < mfkgkhdmbpb_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(mfkgkhdmbpb_.getLong(i));
      }
      size += dataSize;
      if (!getMfkgkhdmbpbList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      mfkgkhdmbpbMemoizedSerializedSize = dataSize;
    }
    if (!getEmodglnocmbBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, emodglnocmb_);
    }
    if (!getNpfkomnambbBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, npfkomnambb_);
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
    if (!(obj instanceof POGOProtos.Rpc.BNLLCCIDBHC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BNLLCCIDBHC other = (POGOProtos.Rpc.BNLLCCIDBHC) obj;

    if (!getMfkgkhdmbpbList()
        .equals(other.getMfkgkhdmbpbList())) return false;
    if (!getEmodglnocmb()
        .equals(other.getEmodglnocmb())) return false;
    if (!getNpfkomnambb()
        .equals(other.getNpfkomnambb())) return false;
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
    if (getMfkgkhdmbpbCount() > 0) {
      hash = (37 * hash) + MFKGKHDMBPB_FIELD_NUMBER;
      hash = (53 * hash) + getMfkgkhdmbpbList().hashCode();
    }
    hash = (37 * hash) + EMODGLNOCMB_FIELD_NUMBER;
    hash = (53 * hash) + getEmodglnocmb().hashCode();
    hash = (37 * hash) + NPFKOMNAMBB_FIELD_NUMBER;
    hash = (53 * hash) + getNpfkomnambb().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BNLLCCIDBHC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BNLLCCIDBHC prototype) {
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
   * ref: BNLLCCIDBHC
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BNLLCCIDBHC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BNLLCCIDBHC)
      POGOProtos.Rpc.BNLLCCIDBHCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLLCCIDBHC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLLCCIDBHC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BNLLCCIDBHC.class, POGOProtos.Rpc.BNLLCCIDBHC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BNLLCCIDBHC.newBuilder()
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
      mfkgkhdmbpb_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      emodglnocmb_ = "";

      npfkomnambb_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BNLLCCIDBHC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BNLLCCIDBHC getDefaultInstanceForType() {
      return POGOProtos.Rpc.BNLLCCIDBHC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BNLLCCIDBHC build() {
      POGOProtos.Rpc.BNLLCCIDBHC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BNLLCCIDBHC buildPartial() {
      POGOProtos.Rpc.BNLLCCIDBHC result = new POGOProtos.Rpc.BNLLCCIDBHC(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mfkgkhdmbpb_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mfkgkhdmbpb_ = mfkgkhdmbpb_;
      result.emodglnocmb_ = emodglnocmb_;
      result.npfkomnambb_ = npfkomnambb_;
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
      if (other instanceof POGOProtos.Rpc.BNLLCCIDBHC) {
        return mergeFrom((POGOProtos.Rpc.BNLLCCIDBHC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BNLLCCIDBHC other) {
      if (other == POGOProtos.Rpc.BNLLCCIDBHC.getDefaultInstance()) return this;
      if (!other.mfkgkhdmbpb_.isEmpty()) {
        if (mfkgkhdmbpb_.isEmpty()) {
          mfkgkhdmbpb_ = other.mfkgkhdmbpb_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMfkgkhdmbpbIsMutable();
          mfkgkhdmbpb_.addAll(other.mfkgkhdmbpb_);
        }
        onChanged();
      }
      if (!other.getEmodglnocmb().isEmpty()) {
        emodglnocmb_ = other.emodglnocmb_;
        onChanged();
      }
      if (!other.getNpfkomnambb().isEmpty()) {
        npfkomnambb_ = other.npfkomnambb_;
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
      POGOProtos.Rpc.BNLLCCIDBHC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BNLLCCIDBHC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList mfkgkhdmbpb_ = emptyLongList();
    private void ensureMfkgkhdmbpbIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mfkgkhdmbpb_ = mutableCopy(mfkgkhdmbpb_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @return A list containing the mfkgkhdmbpb.
     */
    public java.util.List<java.lang.Long>
        getMfkgkhdmbpbList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(mfkgkhdmbpb_) : mfkgkhdmbpb_;
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @return The count of mfkgkhdmbpb.
     */
    public int getMfkgkhdmbpbCount() {
      return mfkgkhdmbpb_.size();
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @param index The index of the element to return.
     * @return The mfkgkhdmbpb at the given index.
     */
    public long getMfkgkhdmbpb(int index) {
      return mfkgkhdmbpb_.getLong(index);
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @param index The index to set the value at.
     * @param value The mfkgkhdmbpb to set.
     * @return This builder for chaining.
     */
    public Builder setMfkgkhdmbpb(
        int index, long value) {
      ensureMfkgkhdmbpbIsMutable();
      mfkgkhdmbpb_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @param value The mfkgkhdmbpb to add.
     * @return This builder for chaining.
     */
    public Builder addMfkgkhdmbpb(long value) {
      ensureMfkgkhdmbpbIsMutable();
      mfkgkhdmbpb_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @param values The mfkgkhdmbpb to add.
     * @return This builder for chaining.
     */
    public Builder addAllMfkgkhdmbpb(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureMfkgkhdmbpbIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, mfkgkhdmbpb_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 mfkgkhdmbpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfkgkhdmbpb() {
      mfkgkhdmbpb_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object emodglnocmb_ = "";
    /**
     * <code>string emodglnocmb = 2;</code>
     * @return The emodglnocmb.
     */
    public java.lang.String getEmodglnocmb() {
      java.lang.Object ref = emodglnocmb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emodglnocmb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string emodglnocmb = 2;</code>
     * @return The bytes for emodglnocmb.
     */
    public com.google.protobuf.ByteString
        getEmodglnocmbBytes() {
      java.lang.Object ref = emodglnocmb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emodglnocmb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string emodglnocmb = 2;</code>
     * @param value The emodglnocmb to set.
     * @return This builder for chaining.
     */
    public Builder setEmodglnocmb(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      emodglnocmb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string emodglnocmb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmodglnocmb() {
      
      emodglnocmb_ = getDefaultInstance().getEmodglnocmb();
      onChanged();
      return this;
    }
    /**
     * <code>string emodglnocmb = 2;</code>
     * @param value The bytes for emodglnocmb to set.
     * @return This builder for chaining.
     */
    public Builder setEmodglnocmbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      emodglnocmb_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object npfkomnambb_ = "";
    /**
     * <code>string npfkomnambb = 3;</code>
     * @return The npfkomnambb.
     */
    public java.lang.String getNpfkomnambb() {
      java.lang.Object ref = npfkomnambb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        npfkomnambb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string npfkomnambb = 3;</code>
     * @return The bytes for npfkomnambb.
     */
    public com.google.protobuf.ByteString
        getNpfkomnambbBytes() {
      java.lang.Object ref = npfkomnambb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        npfkomnambb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string npfkomnambb = 3;</code>
     * @param value The npfkomnambb to set.
     * @return This builder for chaining.
     */
    public Builder setNpfkomnambb(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      npfkomnambb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string npfkomnambb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpfkomnambb() {
      
      npfkomnambb_ = getDefaultInstance().getNpfkomnambb();
      onChanged();
      return this;
    }
    /**
     * <code>string npfkomnambb = 3;</code>
     * @param value The bytes for npfkomnambb to set.
     * @return This builder for chaining.
     */
    public Builder setNpfkomnambbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      npfkomnambb_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BNLLCCIDBHC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BNLLCCIDBHC)
  private static final POGOProtos.Rpc.BNLLCCIDBHC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BNLLCCIDBHC();
  }

  public static POGOProtos.Rpc.BNLLCCIDBHC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BNLLCCIDBHC>
      PARSER = new com.google.protobuf.AbstractParser<BNLLCCIDBHC>() {
    @java.lang.Override
    public BNLLCCIDBHC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BNLLCCIDBHC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BNLLCCIDBHC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BNLLCCIDBHC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BNLLCCIDBHC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

