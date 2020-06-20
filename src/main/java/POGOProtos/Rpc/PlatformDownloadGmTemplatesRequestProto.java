// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto}
 */
public  final class PlatformDownloadGmTemplatesRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto)
    PlatformDownloadGmTemplatesRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformDownloadGmTemplatesRequestProto.newBuilder() to construct.
  private PlatformDownloadGmTemplatesRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformDownloadGmTemplatesRequestProto() {
    basisExperimentId_ = emptyIntList();
    experimentId_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformDownloadGmTemplatesRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformDownloadGmTemplatesRequestProto(
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

            basisBatchId_ = input.readInt64();
            break;
          }
          case 16: {

            batchId_ = input.readInt64();
            break;
          }
          case 24: {

            pageOffset_ = input.readInt32();
            break;
          }
          case 32: {

            applyExperiments_ = input.readBool();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              basisExperimentId_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            basisExperimentId_.addInt(input.readInt32());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              basisExperimentId_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              basisExperimentId_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 48: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              experimentId_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            experimentId_.addInt(input.readInt32());
            break;
          }
          case 50: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              experimentId_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              experimentId_.addInt(input.readInt32());
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
        basisExperimentId_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        experimentId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDownloadGmTemplatesRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDownloadGmTemplatesRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.class, POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.Builder.class);
  }

  public static final int BASIS_BATCH_ID_FIELD_NUMBER = 1;
  private long basisBatchId_;
  /**
   * <code>int64 basis_batch_id = 1;</code>
   * @return The basisBatchId.
   */
  public long getBasisBatchId() {
    return basisBatchId_;
  }

  public static final int BATCH_ID_FIELD_NUMBER = 2;
  private long batchId_;
  /**
   * <code>int64 batch_id = 2;</code>
   * @return The batchId.
   */
  public long getBatchId() {
    return batchId_;
  }

  public static final int PAGE_OFFSET_FIELD_NUMBER = 3;
  private int pageOffset_;
  /**
   * <code>int32 page_offset = 3;</code>
   * @return The pageOffset.
   */
  public int getPageOffset() {
    return pageOffset_;
  }

  public static final int APPLY_EXPERIMENTS_FIELD_NUMBER = 4;
  private boolean applyExperiments_;
  /**
   * <code>bool apply_experiments = 4;</code>
   * @return The applyExperiments.
   */
  public boolean getApplyExperiments() {
    return applyExperiments_;
  }

  public static final int BASIS_EXPERIMENT_ID_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.IntList basisExperimentId_;
  /**
   * <code>repeated int32 basis_experiment_id = 5;</code>
   * @return A list containing the basisExperimentId.
   */
  public java.util.List<java.lang.Integer>
      getBasisExperimentIdList() {
    return basisExperimentId_;
  }
  /**
   * <code>repeated int32 basis_experiment_id = 5;</code>
   * @return The count of basisExperimentId.
   */
  public int getBasisExperimentIdCount() {
    return basisExperimentId_.size();
  }
  /**
   * <code>repeated int32 basis_experiment_id = 5;</code>
   * @param index The index of the element to return.
   * @return The basisExperimentId at the given index.
   */
  public int getBasisExperimentId(int index) {
    return basisExperimentId_.getInt(index);
  }
  private int basisExperimentIdMemoizedSerializedSize = -1;

  public static final int EXPERIMENT_ID_FIELD_NUMBER = 6;
  private com.google.protobuf.Internal.IntList experimentId_;
  /**
   * <code>repeated int32 experiment_id = 6;</code>
   * @return A list containing the experimentId.
   */
  public java.util.List<java.lang.Integer>
      getExperimentIdList() {
    return experimentId_;
  }
  /**
   * <code>repeated int32 experiment_id = 6;</code>
   * @return The count of experimentId.
   */
  public int getExperimentIdCount() {
    return experimentId_.size();
  }
  /**
   * <code>repeated int32 experiment_id = 6;</code>
   * @param index The index of the element to return.
   * @return The experimentId at the given index.
   */
  public int getExperimentId(int index) {
    return experimentId_.getInt(index);
  }
  private int experimentIdMemoizedSerializedSize = -1;

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
    if (basisBatchId_ != 0L) {
      output.writeInt64(1, basisBatchId_);
    }
    if (batchId_ != 0L) {
      output.writeInt64(2, batchId_);
    }
    if (pageOffset_ != 0) {
      output.writeInt32(3, pageOffset_);
    }
    if (applyExperiments_ != false) {
      output.writeBool(4, applyExperiments_);
    }
    if (getBasisExperimentIdList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(basisExperimentIdMemoizedSerializedSize);
    }
    for (int i = 0; i < basisExperimentId_.size(); i++) {
      output.writeInt32NoTag(basisExperimentId_.getInt(i));
    }
    if (getExperimentIdList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(experimentIdMemoizedSerializedSize);
    }
    for (int i = 0; i < experimentId_.size(); i++) {
      output.writeInt32NoTag(experimentId_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (basisBatchId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, basisBatchId_);
    }
    if (batchId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, batchId_);
    }
    if (pageOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageOffset_);
    }
    if (applyExperiments_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, applyExperiments_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < basisExperimentId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(basisExperimentId_.getInt(i));
      }
      size += dataSize;
      if (!getBasisExperimentIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      basisExperimentIdMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < experimentId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(experimentId_.getInt(i));
      }
      size += dataSize;
      if (!getExperimentIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      experimentIdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto other = (POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto) obj;

    if (getBasisBatchId()
        != other.getBasisBatchId()) return false;
    if (getBatchId()
        != other.getBatchId()) return false;
    if (getPageOffset()
        != other.getPageOffset()) return false;
    if (getApplyExperiments()
        != other.getApplyExperiments()) return false;
    if (!getBasisExperimentIdList()
        .equals(other.getBasisExperimentIdList())) return false;
    if (!getExperimentIdList()
        .equals(other.getExperimentIdList())) return false;
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
    hash = (37 * hash) + BASIS_BATCH_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBasisBatchId());
    hash = (37 * hash) + BATCH_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBatchId());
    hash = (37 * hash) + PAGE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getPageOffset();
    hash = (37 * hash) + APPLY_EXPERIMENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getApplyExperiments());
    if (getBasisExperimentIdCount() > 0) {
      hash = (37 * hash) + BASIS_EXPERIMENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBasisExperimentIdList().hashCode();
    }
    if (getExperimentIdCount() > 0) {
      hash = (37 * hash) + EXPERIMENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getExperimentIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto)
      POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDownloadGmTemplatesRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDownloadGmTemplatesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.class, POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.newBuilder()
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
      basisBatchId_ = 0L;

      batchId_ = 0L;

      pageOffset_ = 0;

      applyExperiments_ = false;

      basisExperimentId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      experimentId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformDownloadGmTemplatesRequestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto build() {
      POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto buildPartial() {
      POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto result = new POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto(this);
      int from_bitField0_ = bitField0_;
      result.basisBatchId_ = basisBatchId_;
      result.batchId_ = batchId_;
      result.pageOffset_ = pageOffset_;
      result.applyExperiments_ = applyExperiments_;
      if (((bitField0_ & 0x00000001) != 0)) {
        basisExperimentId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.basisExperimentId_ = basisExperimentId_;
      if (((bitField0_ & 0x00000002) != 0)) {
        experimentId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.experimentId_ = experimentId_;
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
      if (other instanceof POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto) {
        return mergeFrom((POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto other) {
      if (other == POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto.getDefaultInstance()) return this;
      if (other.getBasisBatchId() != 0L) {
        setBasisBatchId(other.getBasisBatchId());
      }
      if (other.getBatchId() != 0L) {
        setBatchId(other.getBatchId());
      }
      if (other.getPageOffset() != 0) {
        setPageOffset(other.getPageOffset());
      }
      if (other.getApplyExperiments() != false) {
        setApplyExperiments(other.getApplyExperiments());
      }
      if (!other.basisExperimentId_.isEmpty()) {
        if (basisExperimentId_.isEmpty()) {
          basisExperimentId_ = other.basisExperimentId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBasisExperimentIdIsMutable();
          basisExperimentId_.addAll(other.basisExperimentId_);
        }
        onChanged();
      }
      if (!other.experimentId_.isEmpty()) {
        if (experimentId_.isEmpty()) {
          experimentId_ = other.experimentId_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureExperimentIdIsMutable();
          experimentId_.addAll(other.experimentId_);
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
      POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long basisBatchId_ ;
    /**
     * <code>int64 basis_batch_id = 1;</code>
     * @return The basisBatchId.
     */
    public long getBasisBatchId() {
      return basisBatchId_;
    }
    /**
     * <code>int64 basis_batch_id = 1;</code>
     * @param value The basisBatchId to set.
     * @return This builder for chaining.
     */
    public Builder setBasisBatchId(long value) {
      
      basisBatchId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 basis_batch_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBasisBatchId() {
      
      basisBatchId_ = 0L;
      onChanged();
      return this;
    }

    private long batchId_ ;
    /**
     * <code>int64 batch_id = 2;</code>
     * @return The batchId.
     */
    public long getBatchId() {
      return batchId_;
    }
    /**
     * <code>int64 batch_id = 2;</code>
     * @param value The batchId to set.
     * @return This builder for chaining.
     */
    public Builder setBatchId(long value) {
      
      batchId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 batch_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBatchId() {
      
      batchId_ = 0L;
      onChanged();
      return this;
    }

    private int pageOffset_ ;
    /**
     * <code>int32 page_offset = 3;</code>
     * @return The pageOffset.
     */
    public int getPageOffset() {
      return pageOffset_;
    }
    /**
     * <code>int32 page_offset = 3;</code>
     * @param value The pageOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPageOffset(int value) {
      
      pageOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageOffset() {
      
      pageOffset_ = 0;
      onChanged();
      return this;
    }

    private boolean applyExperiments_ ;
    /**
     * <code>bool apply_experiments = 4;</code>
     * @return The applyExperiments.
     */
    public boolean getApplyExperiments() {
      return applyExperiments_;
    }
    /**
     * <code>bool apply_experiments = 4;</code>
     * @param value The applyExperiments to set.
     * @return This builder for chaining.
     */
    public Builder setApplyExperiments(boolean value) {
      
      applyExperiments_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool apply_experiments = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplyExperiments() {
      
      applyExperiments_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList basisExperimentId_ = emptyIntList();
    private void ensureBasisExperimentIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        basisExperimentId_ = mutableCopy(basisExperimentId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @return A list containing the basisExperimentId.
     */
    public java.util.List<java.lang.Integer>
        getBasisExperimentIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(basisExperimentId_) : basisExperimentId_;
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @return The count of basisExperimentId.
     */
    public int getBasisExperimentIdCount() {
      return basisExperimentId_.size();
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @param index The index of the element to return.
     * @return The basisExperimentId at the given index.
     */
    public int getBasisExperimentId(int index) {
      return basisExperimentId_.getInt(index);
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @param index The index to set the value at.
     * @param value The basisExperimentId to set.
     * @return This builder for chaining.
     */
    public Builder setBasisExperimentId(
        int index, int value) {
      ensureBasisExperimentIdIsMutable();
      basisExperimentId_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @param value The basisExperimentId to add.
     * @return This builder for chaining.
     */
    public Builder addBasisExperimentId(int value) {
      ensureBasisExperimentIdIsMutable();
      basisExperimentId_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @param values The basisExperimentId to add.
     * @return This builder for chaining.
     */
    public Builder addAllBasisExperimentId(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureBasisExperimentIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, basisExperimentId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 basis_experiment_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBasisExperimentId() {
      basisExperimentId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList experimentId_ = emptyIntList();
    private void ensureExperimentIdIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        experimentId_ = mutableCopy(experimentId_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @return A list containing the experimentId.
     */
    public java.util.List<java.lang.Integer>
        getExperimentIdList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(experimentId_) : experimentId_;
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @return The count of experimentId.
     */
    public int getExperimentIdCount() {
      return experimentId_.size();
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @param index The index of the element to return.
     * @return The experimentId at the given index.
     */
    public int getExperimentId(int index) {
      return experimentId_.getInt(index);
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @param index The index to set the value at.
     * @param value The experimentId to set.
     * @return This builder for chaining.
     */
    public Builder setExperimentId(
        int index, int value) {
      ensureExperimentIdIsMutable();
      experimentId_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @param value The experimentId to add.
     * @return This builder for chaining.
     */
    public Builder addExperimentId(int value) {
      ensureExperimentIdIsMutable();
      experimentId_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @param values The experimentId to add.
     * @return This builder for chaining.
     */
    public Builder addAllExperimentId(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureExperimentIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, experimentId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 experiment_id = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearExperimentId() {
      experimentId_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto)
  private static final POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto();
  }

  public static POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformDownloadGmTemplatesRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformDownloadGmTemplatesRequestProto>() {
    @java.lang.Override
    public PlatformDownloadGmTemplatesRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformDownloadGmTemplatesRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformDownloadGmTemplatesRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformDownloadGmTemplatesRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformDownloadGmTemplatesRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

