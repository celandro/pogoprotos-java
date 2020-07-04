// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.WithRaidLevelProto}
 */
public  final class WithRaidLevelProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WithRaidLevelProto)
    WithRaidLevelProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithRaidLevelProto.newBuilder() to construct.
  private WithRaidLevelProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithRaidLevelProto() {
    raidLevel_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithRaidLevelProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithRaidLevelProto(
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
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              raidLevel_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            raidLevel_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                raidLevel_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              raidLevel_.add(rawValue);
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
        raidLevel_ = java.util.Collections.unmodifiableList(raidLevel_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithRaidLevelProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithRaidLevelProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WithRaidLevelProto.class, POGOProtos.Rpc.WithRaidLevelProto.Builder.class);
  }

  public static final int RAID_LEVEL_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> raidLevel_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.RaidLevel> raidLevel_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.RaidLevel>() {
            public POGOProtos.Rpc.RaidLevel convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.RaidLevel result = POGOProtos.Rpc.RaidLevel.valueOf(from);
              return result == null ? POGOProtos.Rpc.RaidLevel.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
   * @return A list containing the raidLevel.
   */
  public java.util.List<POGOProtos.Rpc.RaidLevel> getRaidLevelList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.RaidLevel>(raidLevel_, raidLevel_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
   * @return The count of raidLevel.
   */
  public int getRaidLevelCount() {
    return raidLevel_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
   * @param index The index of the element to return.
   * @return The raidLevel at the given index.
   */
  public POGOProtos.Rpc.RaidLevel getRaidLevel(int index) {
    return raidLevel_converter_.convert(raidLevel_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
   * @return A list containing the enum numeric values on the wire for raidLevel.
   */
  public java.util.List<java.lang.Integer>
  getRaidLevelValueList() {
    return raidLevel_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of raidLevel at the given index.
   */
  public int getRaidLevelValue(int index) {
    return raidLevel_.get(index);
  }
  private int raidLevelMemoizedSerializedSize;

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
    if (getRaidLevelList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(raidLevelMemoizedSerializedSize);
    }
    for (int i = 0; i < raidLevel_.size(); i++) {
      output.writeEnumNoTag(raidLevel_.get(i));
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
      for (int i = 0; i < raidLevel_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(raidLevel_.get(i));
      }
      size += dataSize;
      if (!getRaidLevelList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }raidLevelMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.WithRaidLevelProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WithRaidLevelProto other = (POGOProtos.Rpc.WithRaidLevelProto) obj;

    if (!raidLevel_.equals(other.raidLevel_)) return false;
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
    if (getRaidLevelCount() > 0) {
      hash = (37 * hash) + RAID_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + raidLevel_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithRaidLevelProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WithRaidLevelProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.WithRaidLevelProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WithRaidLevelProto)
      POGOProtos.Rpc.WithRaidLevelProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithRaidLevelProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithRaidLevelProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WithRaidLevelProto.class, POGOProtos.Rpc.WithRaidLevelProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WithRaidLevelProto.newBuilder()
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
      raidLevel_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_WithRaidLevelProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithRaidLevelProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WithRaidLevelProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithRaidLevelProto build() {
      POGOProtos.Rpc.WithRaidLevelProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithRaidLevelProto buildPartial() {
      POGOProtos.Rpc.WithRaidLevelProto result = new POGOProtos.Rpc.WithRaidLevelProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        raidLevel_ = java.util.Collections.unmodifiableList(raidLevel_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.raidLevel_ = raidLevel_;
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
      if (other instanceof POGOProtos.Rpc.WithRaidLevelProto) {
        return mergeFrom((POGOProtos.Rpc.WithRaidLevelProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WithRaidLevelProto other) {
      if (other == POGOProtos.Rpc.WithRaidLevelProto.getDefaultInstance()) return this;
      if (!other.raidLevel_.isEmpty()) {
        if (raidLevel_.isEmpty()) {
          raidLevel_ = other.raidLevel_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRaidLevelIsMutable();
          raidLevel_.addAll(other.raidLevel_);
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
      POGOProtos.Rpc.WithRaidLevelProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WithRaidLevelProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> raidLevel_ =
      java.util.Collections.emptyList();
    private void ensureRaidLevelIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        raidLevel_ = new java.util.ArrayList<java.lang.Integer>(raidLevel_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @return A list containing the raidLevel.
     */
    public java.util.List<POGOProtos.Rpc.RaidLevel> getRaidLevelList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.RaidLevel>(raidLevel_, raidLevel_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @return The count of raidLevel.
     */
    public int getRaidLevelCount() {
      return raidLevel_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param index The index of the element to return.
     * @return The raidLevel at the given index.
     */
    public POGOProtos.Rpc.RaidLevel getRaidLevel(int index) {
      return raidLevel_converter_.convert(raidLevel_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param index The index to set the value at.
     * @param value The raidLevel to set.
     * @return This builder for chaining.
     */
    public Builder setRaidLevel(
        int index, POGOProtos.Rpc.RaidLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRaidLevelIsMutable();
      raidLevel_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param value The raidLevel to add.
     * @return This builder for chaining.
     */
    public Builder addRaidLevel(POGOProtos.Rpc.RaidLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRaidLevelIsMutable();
      raidLevel_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param values The raidLevel to add.
     * @return This builder for chaining.
     */
    public Builder addAllRaidLevel(
        java.lang.Iterable<? extends POGOProtos.Rpc.RaidLevel> values) {
      ensureRaidLevelIsMutable();
      for (POGOProtos.Rpc.RaidLevel value : values) {
        raidLevel_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRaidLevel() {
      raidLevel_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @return A list containing the enum numeric values on the wire for raidLevel.
     */
    public java.util.List<java.lang.Integer>
    getRaidLevelValueList() {
      return java.util.Collections.unmodifiableList(raidLevel_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of raidLevel at the given index.
     */
    public int getRaidLevelValue(int index) {
      return raidLevel_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of raidLevel at the given index.
     * @return This builder for chaining.
     */
    public Builder setRaidLevelValue(
        int index, int value) {
      ensureRaidLevelIsMutable();
      raidLevel_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param value The enum numeric value on the wire for raidLevel to add.
     * @return This builder for chaining.
     */
    public Builder addRaidLevelValue(int value) {
      ensureRaidLevelIsMutable();
      raidLevel_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.RaidLevel raid_level = 1;</code>
     * @param values The enum numeric values on the wire for raidLevel to add.
     * @return This builder for chaining.
     */
    public Builder addAllRaidLevelValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureRaidLevelIsMutable();
      for (int value : values) {
        raidLevel_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WithRaidLevelProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WithRaidLevelProto)
  private static final POGOProtos.Rpc.WithRaidLevelProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WithRaidLevelProto();
  }

  public static POGOProtos.Rpc.WithRaidLevelProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithRaidLevelProto>
      PARSER = new com.google.protobuf.AbstractParser<WithRaidLevelProto>() {
    @java.lang.Override
    public WithRaidLevelProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithRaidLevelProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithRaidLevelProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithRaidLevelProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WithRaidLevelProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

