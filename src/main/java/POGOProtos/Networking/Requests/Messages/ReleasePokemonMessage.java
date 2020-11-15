// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ReleasePokemonMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage}
 */
public final class ReleasePokemonMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage)
    ReleasePokemonMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReleasePokemonMessage.newBuilder() to construct.
  private ReleasePokemonMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReleasePokemonMessage() {
    pokemonIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReleasePokemonMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReleasePokemonMessage(
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
          case 9: {

            pokemonId_ = input.readFixed64();
            break;
          }
          case 17: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              pokemonIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            pokemonIds_.addLong(input.readFixed64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              pokemonIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              pokemonIds_.addLong(input.readFixed64());
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
        pokemonIds_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Requests.Messages.ReleasePokemonMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ReleasePokemonMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.ReleasePokemonMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ReleasePokemonMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.class, POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.Builder.class);
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  @java.lang.Override
  public long getPokemonId() {
    return pokemonId_;
  }

  public static final int POKEMON_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList pokemonIds_;
  /**
   * <code>repeated fixed64 pokemon_ids = 2;</code>
   * @return A list containing the pokemonIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getPokemonIdsList() {
    return pokemonIds_;
  }
  /**
   * <code>repeated fixed64 pokemon_ids = 2;</code>
   * @return The count of pokemonIds.
   */
  public int getPokemonIdsCount() {
    return pokemonIds_.size();
  }
  /**
   * <code>repeated fixed64 pokemon_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The pokemonIds at the given index.
   */
  public long getPokemonIds(int index) {
    return pokemonIds_.getLong(index);
  }
  private int pokemonIdsMemoizedSerializedSize = -1;

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
    if (pokemonId_ != 0L) {
      output.writeFixed64(1, pokemonId_);
    }
    if (getPokemonIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(pokemonIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < pokemonIds_.size(); i++) {
      output.writeFixed64NoTag(pokemonIds_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(1, pokemonId_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getPokemonIdsList().size();
      size += dataSize;
      if (!getPokemonIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      pokemonIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage other = (POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage) obj;

    if (getPokemonId()
        != other.getPokemonId()) return false;
    if (!getPokemonIdsList()
        .equals(other.getPokemonIdsList())) return false;
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
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    if (getPokemonIdsCount() > 0) {
      hash = (37 * hash) + POKEMON_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage)
      POGOProtos.Networking.Requests.Messages.ReleasePokemonMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.ReleasePokemonMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ReleasePokemonMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.ReleasePokemonMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ReleasePokemonMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.class, POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.newBuilder()
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
      pokemonId_ = 0L;

      pokemonIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.ReleasePokemonMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ReleasePokemonMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage build() {
      POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage result = new POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage(this);
      int from_bitField0_ = bitField0_;
      result.pokemonId_ = pokemonId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        pokemonIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pokemonIds_ = pokemonIds_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage.getDefaultInstance()) return this;
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
      }
      if (!other.pokemonIds_.isEmpty()) {
        if (pokemonIds_.isEmpty()) {
          pokemonIds_ = other.pokemonIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePokemonIdsIsMutable();
          pokemonIds_.addAll(other.pokemonIds_);
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
      POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList pokemonIds_ = emptyLongList();
    private void ensurePokemonIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pokemonIds_ = mutableCopy(pokemonIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @return A list containing the pokemonIds.
     */
    public java.util.List<java.lang.Long>
        getPokemonIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(pokemonIds_) : pokemonIds_;
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @return The count of pokemonIds.
     */
    public int getPokemonIdsCount() {
      return pokemonIds_.size();
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The pokemonIds at the given index.
     */
    public long getPokemonIds(int index) {
      return pokemonIds_.getLong(index);
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The pokemonIds to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIds(
        int index, long value) {
      ensurePokemonIdsIsMutable();
      pokemonIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @param value The pokemonIds to add.
     * @return This builder for chaining.
     */
    public Builder addPokemonIds(long value) {
      ensurePokemonIdsIsMutable();
      pokemonIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @param values The pokemonIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPokemonIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensurePokemonIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, pokemonIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated fixed64 pokemon_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonIds() {
      pokemonIds_ = emptyLongList();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage)
  private static final POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReleasePokemonMessage>
      PARSER = new com.google.protobuf.AbstractParser<ReleasePokemonMessage>() {
    @java.lang.Override
    public ReleasePokemonMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReleasePokemonMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReleasePokemonMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReleasePokemonMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.ReleasePokemonMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

