// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetHoloholoInventoryProto}
 */
public  final class GetHoloholoInventoryProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetHoloholoInventoryProto)
    GetHoloholoInventoryProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetHoloholoInventoryProto.newBuilder() to construct.
  private GetHoloholoInventoryProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetHoloholoInventoryProto() {
    itemBeenSeen_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetHoloholoInventoryProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetHoloholoInventoryProto(
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

            timestampMillis_ = input.readInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              itemBeenSeen_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            itemBeenSeen_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemBeenSeen_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemBeenSeen_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        itemBeenSeen_ = java.util.Collections.unmodifiableList(itemBeenSeen_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetHoloholoInventoryProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetHoloholoInventoryProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetHoloholoInventoryProto.class, POGOProtos.Rpc.GetHoloholoInventoryProto.Builder.class);
  }

  public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 1;
  private long timestampMillis_;
  /**
   * <code>int64 timestamp_millis = 1;</code>
   * @return The timestampMillis.
   */
  public long getTimestampMillis() {
    return timestampMillis_;
  }

  public static final int ITEM_BEEN_SEEN_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> itemBeenSeen_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.Item> itemBeenSeen_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.Item>() {
            public POGOProtos.Rpc.Item convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(from);
              return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
   * @return A list containing the itemBeenSeen.
   */
  public java.util.List<POGOProtos.Rpc.Item> getItemBeenSeenList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.Item>(itemBeenSeen_, itemBeenSeen_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
   * @return The count of itemBeenSeen.
   */
  public int getItemBeenSeenCount() {
    return itemBeenSeen_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
   * @param index The index of the element to return.
   * @return The itemBeenSeen at the given index.
   */
  public POGOProtos.Rpc.Item getItemBeenSeen(int index) {
    return itemBeenSeen_converter_.convert(itemBeenSeen_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
   * @return A list containing the enum numeric values on the wire for itemBeenSeen.
   */
  public java.util.List<java.lang.Integer>
  getItemBeenSeenValueList() {
    return itemBeenSeen_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of itemBeenSeen at the given index.
   */
  public int getItemBeenSeenValue(int index) {
    return itemBeenSeen_.get(index);
  }
  private int itemBeenSeenMemoizedSerializedSize;

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
    if (timestampMillis_ != 0L) {
      output.writeInt64(1, timestampMillis_);
    }
    if (getItemBeenSeenList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(itemBeenSeenMemoizedSerializedSize);
    }
    for (int i = 0; i < itemBeenSeen_.size(); i++) {
      output.writeEnumNoTag(itemBeenSeen_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestampMillis_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestampMillis_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < itemBeenSeen_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(itemBeenSeen_.get(i));
      }
      size += dataSize;
      if (!getItemBeenSeenList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }itemBeenSeenMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.GetHoloholoInventoryProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetHoloholoInventoryProto other = (POGOProtos.Rpc.GetHoloholoInventoryProto) obj;

    if (getTimestampMillis()
        != other.getTimestampMillis()) return false;
    if (!itemBeenSeen_.equals(other.itemBeenSeen_)) return false;
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
    hash = (37 * hash) + TIMESTAMP_MILLIS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestampMillis());
    if (getItemBeenSeenCount() > 0) {
      hash = (37 * hash) + ITEM_BEEN_SEEN_FIELD_NUMBER;
      hash = (53 * hash) + itemBeenSeen_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetHoloholoInventoryProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetHoloholoInventoryProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetHoloholoInventoryProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetHoloholoInventoryProto)
      POGOProtos.Rpc.GetHoloholoInventoryProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetHoloholoInventoryProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetHoloholoInventoryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetHoloholoInventoryProto.class, POGOProtos.Rpc.GetHoloholoInventoryProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetHoloholoInventoryProto.newBuilder()
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
      timestampMillis_ = 0L;

      itemBeenSeen_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetHoloholoInventoryProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetHoloholoInventoryProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetHoloholoInventoryProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetHoloholoInventoryProto build() {
      POGOProtos.Rpc.GetHoloholoInventoryProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetHoloholoInventoryProto buildPartial() {
      POGOProtos.Rpc.GetHoloholoInventoryProto result = new POGOProtos.Rpc.GetHoloholoInventoryProto(this);
      int from_bitField0_ = bitField0_;
      result.timestampMillis_ = timestampMillis_;
      if (((bitField0_ & 0x00000001) != 0)) {
        itemBeenSeen_ = java.util.Collections.unmodifiableList(itemBeenSeen_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.itemBeenSeen_ = itemBeenSeen_;
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
      if (other instanceof POGOProtos.Rpc.GetHoloholoInventoryProto) {
        return mergeFrom((POGOProtos.Rpc.GetHoloholoInventoryProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetHoloholoInventoryProto other) {
      if (other == POGOProtos.Rpc.GetHoloholoInventoryProto.getDefaultInstance()) return this;
      if (other.getTimestampMillis() != 0L) {
        setTimestampMillis(other.getTimestampMillis());
      }
      if (!other.itemBeenSeen_.isEmpty()) {
        if (itemBeenSeen_.isEmpty()) {
          itemBeenSeen_ = other.itemBeenSeen_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureItemBeenSeenIsMutable();
          itemBeenSeen_.addAll(other.itemBeenSeen_);
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
      POGOProtos.Rpc.GetHoloholoInventoryProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetHoloholoInventoryProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long timestampMillis_ ;
    /**
     * <code>int64 timestamp_millis = 1;</code>
     * @return The timestampMillis.
     */
    public long getTimestampMillis() {
      return timestampMillis_;
    }
    /**
     * <code>int64 timestamp_millis = 1;</code>
     * @param value The timestampMillis to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampMillis(long value) {
      
      timestampMillis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp_millis = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestampMillis() {
      
      timestampMillis_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> itemBeenSeen_ =
      java.util.Collections.emptyList();
    private void ensureItemBeenSeenIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        itemBeenSeen_ = new java.util.ArrayList<java.lang.Integer>(itemBeenSeen_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @return A list containing the itemBeenSeen.
     */
    public java.util.List<POGOProtos.Rpc.Item> getItemBeenSeenList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.Item>(itemBeenSeen_, itemBeenSeen_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @return The count of itemBeenSeen.
     */
    public int getItemBeenSeenCount() {
      return itemBeenSeen_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param index The index of the element to return.
     * @return The itemBeenSeen at the given index.
     */
    public POGOProtos.Rpc.Item getItemBeenSeen(int index) {
      return itemBeenSeen_converter_.convert(itemBeenSeen_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param index The index to set the value at.
     * @param value The itemBeenSeen to set.
     * @return This builder for chaining.
     */
    public Builder setItemBeenSeen(
        int index, POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureItemBeenSeenIsMutable();
      itemBeenSeen_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param value The itemBeenSeen to add.
     * @return This builder for chaining.
     */
    public Builder addItemBeenSeen(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureItemBeenSeenIsMutable();
      itemBeenSeen_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param values The itemBeenSeen to add.
     * @return This builder for chaining.
     */
    public Builder addAllItemBeenSeen(
        java.lang.Iterable<? extends POGOProtos.Rpc.Item> values) {
      ensureItemBeenSeenIsMutable();
      for (POGOProtos.Rpc.Item value : values) {
        itemBeenSeen_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemBeenSeen() {
      itemBeenSeen_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @return A list containing the enum numeric values on the wire for itemBeenSeen.
     */
    public java.util.List<java.lang.Integer>
    getItemBeenSeenValueList() {
      return java.util.Collections.unmodifiableList(itemBeenSeen_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of itemBeenSeen at the given index.
     */
    public int getItemBeenSeenValue(int index) {
      return itemBeenSeen_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of itemBeenSeen at the given index.
     * @return This builder for chaining.
     */
    public Builder setItemBeenSeenValue(
        int index, int value) {
      ensureItemBeenSeenIsMutable();
      itemBeenSeen_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param value The enum numeric value on the wire for itemBeenSeen to add.
     * @return This builder for chaining.
     */
    public Builder addItemBeenSeenValue(int value) {
      ensureItemBeenSeenIsMutable();
      itemBeenSeen_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.Item item_been_seen = 2;</code>
     * @param values The enum numeric values on the wire for itemBeenSeen to add.
     * @return This builder for chaining.
     */
    public Builder addAllItemBeenSeenValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureItemBeenSeenIsMutable();
      for (int value : values) {
        itemBeenSeen_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetHoloholoInventoryProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetHoloholoInventoryProto)
  private static final POGOProtos.Rpc.GetHoloholoInventoryProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetHoloholoInventoryProto();
  }

  public static POGOProtos.Rpc.GetHoloholoInventoryProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetHoloholoInventoryProto>
      PARSER = new com.google.protobuf.AbstractParser<GetHoloholoInventoryProto>() {
    @java.lang.Override
    public GetHoloholoInventoryProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetHoloholoInventoryProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetHoloholoInventoryProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetHoloholoInventoryProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetHoloholoInventoryProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

