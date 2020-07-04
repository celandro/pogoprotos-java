// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetMapObjectsProto}
 */
public  final class GetMapObjectsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetMapObjectsProto)
    GetMapObjectsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMapObjectsProto.newBuilder() to construct.
  private GetMapObjectsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMapObjectsProto() {
    cellId_ = emptyLongList();
    sinceTimeMs_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetMapObjectsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetMapObjectsProto(
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
              cellId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            cellId_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              cellId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              cellId_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              sinceTimeMs_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            sinceTimeMs_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              sinceTimeMs_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              sinceTimeMs_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 25: {

            playerLat_ = input.readDouble();
            break;
          }
          case 33: {

            playerLng_ = input.readDouble();
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
        cellId_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        sinceTimeMs_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetMapObjectsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetMapObjectsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetMapObjectsProto.class, POGOProtos.Rpc.GetMapObjectsProto.Builder.class);
  }

  public static final int CELL_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList cellId_;
  /**
   * <code>repeated uint64 cell_id = 1;</code>
   * @return A list containing the cellId.
   */
  public java.util.List<java.lang.Long>
      getCellIdList() {
    return cellId_;
  }
  /**
   * <code>repeated uint64 cell_id = 1;</code>
   * @return The count of cellId.
   */
  public int getCellIdCount() {
    return cellId_.size();
  }
  /**
   * <code>repeated uint64 cell_id = 1;</code>
   * @param index The index of the element to return.
   * @return The cellId at the given index.
   */
  public long getCellId(int index) {
    return cellId_.getLong(index);
  }
  private int cellIdMemoizedSerializedSize = -1;

  public static final int SINCE_TIME_MS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList sinceTimeMs_;
  /**
   * <code>repeated int64 since_time_ms = 2;</code>
   * @return A list containing the sinceTimeMs.
   */
  public java.util.List<java.lang.Long>
      getSinceTimeMsList() {
    return sinceTimeMs_;
  }
  /**
   * <code>repeated int64 since_time_ms = 2;</code>
   * @return The count of sinceTimeMs.
   */
  public int getSinceTimeMsCount() {
    return sinceTimeMs_.size();
  }
  /**
   * <code>repeated int64 since_time_ms = 2;</code>
   * @param index The index of the element to return.
   * @return The sinceTimeMs at the given index.
   */
  public long getSinceTimeMs(int index) {
    return sinceTimeMs_.getLong(index);
  }
  private int sinceTimeMsMemoizedSerializedSize = -1;

  public static final int PLAYER_LAT_FIELD_NUMBER = 3;
  private double playerLat_;
  /**
   * <code>double player_lat = 3;</code>
   * @return The playerLat.
   */
  public double getPlayerLat() {
    return playerLat_;
  }

  public static final int PLAYER_LNG_FIELD_NUMBER = 4;
  private double playerLng_;
  /**
   * <code>double player_lng = 4;</code>
   * @return The playerLng.
   */
  public double getPlayerLng() {
    return playerLng_;
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
    if (getCellIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(cellIdMemoizedSerializedSize);
    }
    for (int i = 0; i < cellId_.size(); i++) {
      output.writeUInt64NoTag(cellId_.getLong(i));
    }
    if (getSinceTimeMsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(sinceTimeMsMemoizedSerializedSize);
    }
    for (int i = 0; i < sinceTimeMs_.size(); i++) {
      output.writeInt64NoTag(sinceTimeMs_.getLong(i));
    }
    if (playerLat_ != 0D) {
      output.writeDouble(3, playerLat_);
    }
    if (playerLng_ != 0D) {
      output.writeDouble(4, playerLng_);
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
      for (int i = 0; i < cellId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(cellId_.getLong(i));
      }
      size += dataSize;
      if (!getCellIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      cellIdMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < sinceTimeMs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(sinceTimeMs_.getLong(i));
      }
      size += dataSize;
      if (!getSinceTimeMsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      sinceTimeMsMemoizedSerializedSize = dataSize;
    }
    if (playerLat_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, playerLat_);
    }
    if (playerLng_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, playerLng_);
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
    if (!(obj instanceof POGOProtos.Rpc.GetMapObjectsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetMapObjectsProto other = (POGOProtos.Rpc.GetMapObjectsProto) obj;

    if (!getCellIdList()
        .equals(other.getCellIdList())) return false;
    if (!getSinceTimeMsList()
        .equals(other.getSinceTimeMsList())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLat())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLat())) return false;
    if (java.lang.Double.doubleToLongBits(getPlayerLng())
        != java.lang.Double.doubleToLongBits(
            other.getPlayerLng())) return false;
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
    if (getCellIdCount() > 0) {
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellIdList().hashCode();
    }
    if (getSinceTimeMsCount() > 0) {
      hash = (37 * hash) + SINCE_TIME_MS_FIELD_NUMBER;
      hash = (53 * hash) + getSinceTimeMsList().hashCode();
    }
    hash = (37 * hash) + PLAYER_LAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLat()));
    hash = (37 * hash) + PLAYER_LNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPlayerLng()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetMapObjectsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetMapObjectsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetMapObjectsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetMapObjectsProto)
      POGOProtos.Rpc.GetMapObjectsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetMapObjectsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetMapObjectsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetMapObjectsProto.class, POGOProtos.Rpc.GetMapObjectsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetMapObjectsProto.newBuilder()
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
      cellId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      sinceTimeMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      playerLat_ = 0D;

      playerLng_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetMapObjectsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetMapObjectsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetMapObjectsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetMapObjectsProto build() {
      POGOProtos.Rpc.GetMapObjectsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetMapObjectsProto buildPartial() {
      POGOProtos.Rpc.GetMapObjectsProto result = new POGOProtos.Rpc.GetMapObjectsProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        cellId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cellId_ = cellId_;
      if (((bitField0_ & 0x00000002) != 0)) {
        sinceTimeMs_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.sinceTimeMs_ = sinceTimeMs_;
      result.playerLat_ = playerLat_;
      result.playerLng_ = playerLng_;
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
      if (other instanceof POGOProtos.Rpc.GetMapObjectsProto) {
        return mergeFrom((POGOProtos.Rpc.GetMapObjectsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetMapObjectsProto other) {
      if (other == POGOProtos.Rpc.GetMapObjectsProto.getDefaultInstance()) return this;
      if (!other.cellId_.isEmpty()) {
        if (cellId_.isEmpty()) {
          cellId_ = other.cellId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCellIdIsMutable();
          cellId_.addAll(other.cellId_);
        }
        onChanged();
      }
      if (!other.sinceTimeMs_.isEmpty()) {
        if (sinceTimeMs_.isEmpty()) {
          sinceTimeMs_ = other.sinceTimeMs_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureSinceTimeMsIsMutable();
          sinceTimeMs_.addAll(other.sinceTimeMs_);
        }
        onChanged();
      }
      if (other.getPlayerLat() != 0D) {
        setPlayerLat(other.getPlayerLat());
      }
      if (other.getPlayerLng() != 0D) {
        setPlayerLng(other.getPlayerLng());
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
      POGOProtos.Rpc.GetMapObjectsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetMapObjectsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList cellId_ = emptyLongList();
    private void ensureCellIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cellId_ = mutableCopy(cellId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @return A list containing the cellId.
     */
    public java.util.List<java.lang.Long>
        getCellIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(cellId_) : cellId_;
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @return The count of cellId.
     */
    public int getCellIdCount() {
      return cellId_.size();
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @param index The index of the element to return.
     * @return The cellId at the given index.
     */
    public long getCellId(int index) {
      return cellId_.getLong(index);
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The cellId to set.
     * @return This builder for chaining.
     */
    public Builder setCellId(
        int index, long value) {
      ensureCellIdIsMutable();
      cellId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @param value The cellId to add.
     * @return This builder for chaining.
     */
    public Builder addCellId(long value) {
      ensureCellIdIsMutable();
      cellId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @param values The cellId to add.
     * @return This builder for chaining.
     */
    public Builder addAllCellId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureCellIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cellId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 cell_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCellId() {
      cellId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList sinceTimeMs_ = emptyLongList();
    private void ensureSinceTimeMsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        sinceTimeMs_ = mutableCopy(sinceTimeMs_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @return A list containing the sinceTimeMs.
     */
    public java.util.List<java.lang.Long>
        getSinceTimeMsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(sinceTimeMs_) : sinceTimeMs_;
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @return The count of sinceTimeMs.
     */
    public int getSinceTimeMsCount() {
      return sinceTimeMs_.size();
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @param index The index of the element to return.
     * @return The sinceTimeMs at the given index.
     */
    public long getSinceTimeMs(int index) {
      return sinceTimeMs_.getLong(index);
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @param index The index to set the value at.
     * @param value The sinceTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setSinceTimeMs(
        int index, long value) {
      ensureSinceTimeMsIsMutable();
      sinceTimeMs_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @param value The sinceTimeMs to add.
     * @return This builder for chaining.
     */
    public Builder addSinceTimeMs(long value) {
      ensureSinceTimeMsIsMutable();
      sinceTimeMs_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @param values The sinceTimeMs to add.
     * @return This builder for chaining.
     */
    public Builder addAllSinceTimeMs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSinceTimeMsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sinceTimeMs_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 since_time_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSinceTimeMs() {
      sinceTimeMs_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private double playerLat_ ;
    /**
     * <code>double player_lat = 3;</code>
     * @return The playerLat.
     */
    public double getPlayerLat() {
      return playerLat_;
    }
    /**
     * <code>double player_lat = 3;</code>
     * @param value The playerLat to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLat(double value) {
      
      playerLat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lat = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLat() {
      
      playerLat_ = 0D;
      onChanged();
      return this;
    }

    private double playerLng_ ;
    /**
     * <code>double player_lng = 4;</code>
     * @return The playerLng.
     */
    public double getPlayerLng() {
      return playerLng_;
    }
    /**
     * <code>double player_lng = 4;</code>
     * @param value The playerLng to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLng(double value) {
      
      playerLng_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double player_lng = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLng() {
      
      playerLng_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetMapObjectsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetMapObjectsProto)
  private static final POGOProtos.Rpc.GetMapObjectsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetMapObjectsProto();
  }

  public static POGOProtos.Rpc.GetMapObjectsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMapObjectsProto>
      PARSER = new com.google.protobuf.AbstractParser<GetMapObjectsProto>() {
    @java.lang.Override
    public GetMapObjectsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetMapObjectsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetMapObjectsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMapObjectsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetMapObjectsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

