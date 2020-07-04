// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CatchPokemonQuestProto}
 */
public  final class CatchPokemonQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CatchPokemonQuestProto)
    CatchPokemonQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatchPokemonQuestProto.newBuilder() to construct.
  private CatchPokemonQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatchPokemonQuestProto() {
    uniquePokemonId_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatchPokemonQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatchPokemonQuestProto(
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
              uniquePokemonId_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            uniquePokemonId_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                uniquePokemonId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              uniquePokemonId_.add(rawValue);
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
        uniquePokemonId_ = java.util.Collections.unmodifiableList(uniquePokemonId_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CatchPokemonQuestProto.class, POGOProtos.Rpc.CatchPokemonQuestProto.Builder.class);
  }

  public static final int UNIQUE_POKEMON_ID_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> uniquePokemonId_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.HoloPokemonId> uniquePokemonId_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.HoloPokemonId>() {
            public POGOProtos.Rpc.HoloPokemonId convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(from);
              return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
   * @return A list containing the uniquePokemonId.
   */
  public java.util.List<POGOProtos.Rpc.HoloPokemonId> getUniquePokemonIdList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.HoloPokemonId>(uniquePokemonId_, uniquePokemonId_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
   * @return The count of uniquePokemonId.
   */
  public int getUniquePokemonIdCount() {
    return uniquePokemonId_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
   * @param index The index of the element to return.
   * @return The uniquePokemonId at the given index.
   */
  public POGOProtos.Rpc.HoloPokemonId getUniquePokemonId(int index) {
    return uniquePokemonId_converter_.convert(uniquePokemonId_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
   * @return A list containing the enum numeric values on the wire for uniquePokemonId.
   */
  public java.util.List<java.lang.Integer>
  getUniquePokemonIdValueList() {
    return uniquePokemonId_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of uniquePokemonId at the given index.
   */
  public int getUniquePokemonIdValue(int index) {
    return uniquePokemonId_.get(index);
  }
  private int uniquePokemonIdMemoizedSerializedSize;

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
    if (getUniquePokemonIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(uniquePokemonIdMemoizedSerializedSize);
    }
    for (int i = 0; i < uniquePokemonId_.size(); i++) {
      output.writeEnumNoTag(uniquePokemonId_.get(i));
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
      for (int i = 0; i < uniquePokemonId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(uniquePokemonId_.get(i));
      }
      size += dataSize;
      if (!getUniquePokemonIdList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }uniquePokemonIdMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.CatchPokemonQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CatchPokemonQuestProto other = (POGOProtos.Rpc.CatchPokemonQuestProto) obj;

    if (!uniquePokemonId_.equals(other.uniquePokemonId_)) return false;
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
    if (getUniquePokemonIdCount() > 0) {
      hash = (37 * hash) + UNIQUE_POKEMON_ID_FIELD_NUMBER;
      hash = (53 * hash) + uniquePokemonId_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CatchPokemonQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CatchPokemonQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CatchPokemonQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CatchPokemonQuestProto)
      POGOProtos.Rpc.CatchPokemonQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CatchPokemonQuestProto.class, POGOProtos.Rpc.CatchPokemonQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CatchPokemonQuestProto.newBuilder()
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
      uniquePokemonId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CatchPokemonQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CatchPokemonQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonQuestProto build() {
      POGOProtos.Rpc.CatchPokemonQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CatchPokemonQuestProto buildPartial() {
      POGOProtos.Rpc.CatchPokemonQuestProto result = new POGOProtos.Rpc.CatchPokemonQuestProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        uniquePokemonId_ = java.util.Collections.unmodifiableList(uniquePokemonId_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.uniquePokemonId_ = uniquePokemonId_;
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
      if (other instanceof POGOProtos.Rpc.CatchPokemonQuestProto) {
        return mergeFrom((POGOProtos.Rpc.CatchPokemonQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CatchPokemonQuestProto other) {
      if (other == POGOProtos.Rpc.CatchPokemonQuestProto.getDefaultInstance()) return this;
      if (!other.uniquePokemonId_.isEmpty()) {
        if (uniquePokemonId_.isEmpty()) {
          uniquePokemonId_ = other.uniquePokemonId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUniquePokemonIdIsMutable();
          uniquePokemonId_.addAll(other.uniquePokemonId_);
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
      POGOProtos.Rpc.CatchPokemonQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CatchPokemonQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> uniquePokemonId_ =
      java.util.Collections.emptyList();
    private void ensureUniquePokemonIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        uniquePokemonId_ = new java.util.ArrayList<java.lang.Integer>(uniquePokemonId_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @return A list containing the uniquePokemonId.
     */
    public java.util.List<POGOProtos.Rpc.HoloPokemonId> getUniquePokemonIdList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.HoloPokemonId>(uniquePokemonId_, uniquePokemonId_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @return The count of uniquePokemonId.
     */
    public int getUniquePokemonIdCount() {
      return uniquePokemonId_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param index The index of the element to return.
     * @return The uniquePokemonId at the given index.
     */
    public POGOProtos.Rpc.HoloPokemonId getUniquePokemonId(int index) {
      return uniquePokemonId_converter_.convert(uniquePokemonId_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The uniquePokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setUniquePokemonId(
        int index, POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUniquePokemonIdIsMutable();
      uniquePokemonId_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param value The uniquePokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addUniquePokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUniquePokemonIdIsMutable();
      uniquePokemonId_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param values The uniquePokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addAllUniquePokemonId(
        java.lang.Iterable<? extends POGOProtos.Rpc.HoloPokemonId> values) {
      ensureUniquePokemonIdIsMutable();
      for (POGOProtos.Rpc.HoloPokemonId value : values) {
        uniquePokemonId_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUniquePokemonId() {
      uniquePokemonId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @return A list containing the enum numeric values on the wire for uniquePokemonId.
     */
    public java.util.List<java.lang.Integer>
    getUniquePokemonIdValueList() {
      return java.util.Collections.unmodifiableList(uniquePokemonId_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of uniquePokemonId at the given index.
     */
    public int getUniquePokemonIdValue(int index) {
      return uniquePokemonId_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of uniquePokemonId at the given index.
     * @return This builder for chaining.
     */
    public Builder setUniquePokemonIdValue(
        int index, int value) {
      ensureUniquePokemonIdIsMutable();
      uniquePokemonId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param value The enum numeric value on the wire for uniquePokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addUniquePokemonIdValue(int value) {
      ensureUniquePokemonIdIsMutable();
      uniquePokemonId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.HoloPokemonId unique_pokemon_id = 1;</code>
     * @param values The enum numeric values on the wire for uniquePokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addAllUniquePokemonIdValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureUniquePokemonIdIsMutable();
      for (int value : values) {
        uniquePokemonId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CatchPokemonQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CatchPokemonQuestProto)
  private static final POGOProtos.Rpc.CatchPokemonQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CatchPokemonQuestProto();
  }

  public static POGOProtos.Rpc.CatchPokemonQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatchPokemonQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<CatchPokemonQuestProto>() {
    @java.lang.Override
    public CatchPokemonQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatchPokemonQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatchPokemonQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatchPokemonQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CatchPokemonQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

