// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/CatchPokemonQuest.proto

package POGOProtos.Data.Quests;

/**
 * Protobuf type {@code POGOProtos.Data.Quests.CatchPokemonQuest}
 */
public final class CatchPokemonQuest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Quests.CatchPokemonQuest)
    CatchPokemonQuestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatchPokemonQuest.newBuilder() to construct.
  private CatchPokemonQuest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatchPokemonQuest() {
    uniquePokemonId_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatchPokemonQuest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatchPokemonQuest(
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
          case 17: {

            activeEncounterId_ = input.readFixed64();
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
    return POGOProtos.Data.Quests.CatchPokemonQuestOuterClass.internal_static_POGOProtos_Data_Quests_CatchPokemonQuest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Quests.CatchPokemonQuestOuterClass.internal_static_POGOProtos_Data_Quests_CatchPokemonQuest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Quests.CatchPokemonQuest.class, POGOProtos.Data.Quests.CatchPokemonQuest.Builder.class);
  }

  public static final int UNIQUE_POKEMON_ID_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> uniquePokemonId_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Enums.PokemonId> uniquePokemonId_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Enums.PokemonId>() {
            public POGOProtos.Enums.PokemonId convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Enums.PokemonId result = POGOProtos.Enums.PokemonId.valueOf(from);
              return result == null ? POGOProtos.Enums.PokemonId.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
   * @return A list containing the uniquePokemonId.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Enums.PokemonId> getUniquePokemonIdList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Enums.PokemonId>(uniquePokemonId_, uniquePokemonId_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
   * @return The count of uniquePokemonId.
   */
  @java.lang.Override
  public int getUniquePokemonIdCount() {
    return uniquePokemonId_.size();
  }
  /**
   * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
   * @param index The index of the element to return.
   * @return The uniquePokemonId at the given index.
   */
  @java.lang.Override
  public POGOProtos.Enums.PokemonId getUniquePokemonId(int index) {
    return uniquePokemonId_converter_.convert(uniquePokemonId_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
   * @return A list containing the enum numeric values on the wire for uniquePokemonId.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getUniquePokemonIdValueList() {
    return uniquePokemonId_;
  }
  /**
   * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of uniquePokemonId at the given index.
   */
  @java.lang.Override
  public int getUniquePokemonIdValue(int index) {
    return uniquePokemonId_.get(index);
  }
  private int uniquePokemonIdMemoizedSerializedSize;

  public static final int ACTIVE_ENCOUNTER_ID_FIELD_NUMBER = 2;
  private long activeEncounterId_;
  /**
   * <code>fixed64 active_encounter_id = 2;</code>
   * @return The activeEncounterId.
   */
  @java.lang.Override
  public long getActiveEncounterId() {
    return activeEncounterId_;
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
    if (getUniquePokemonIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(uniquePokemonIdMemoizedSerializedSize);
    }
    for (int i = 0; i < uniquePokemonId_.size(); i++) {
      output.writeEnumNoTag(uniquePokemonId_.get(i));
    }
    if (activeEncounterId_ != 0L) {
      output.writeFixed64(2, activeEncounterId_);
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
    if (activeEncounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(2, activeEncounterId_);
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
    if (!(obj instanceof POGOProtos.Data.Quests.CatchPokemonQuest)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Quests.CatchPokemonQuest other = (POGOProtos.Data.Quests.CatchPokemonQuest) obj;

    if (!uniquePokemonId_.equals(other.uniquePokemonId_)) return false;
    if (getActiveEncounterId()
        != other.getActiveEncounterId()) return false;
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
    hash = (37 * hash) + ACTIVE_ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getActiveEncounterId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.CatchPokemonQuest parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Quests.CatchPokemonQuest prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Quests.CatchPokemonQuest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Quests.CatchPokemonQuest)
      POGOProtos.Data.Quests.CatchPokemonQuestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Quests.CatchPokemonQuestOuterClass.internal_static_POGOProtos_Data_Quests_CatchPokemonQuest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Quests.CatchPokemonQuestOuterClass.internal_static_POGOProtos_Data_Quests_CatchPokemonQuest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Quests.CatchPokemonQuest.class, POGOProtos.Data.Quests.CatchPokemonQuest.Builder.class);
    }

    // Construct using POGOProtos.Data.Quests.CatchPokemonQuest.newBuilder()
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
      activeEncounterId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Quests.CatchPokemonQuestOuterClass.internal_static_POGOProtos_Data_Quests_CatchPokemonQuest_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.CatchPokemonQuest getDefaultInstanceForType() {
      return POGOProtos.Data.Quests.CatchPokemonQuest.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.CatchPokemonQuest build() {
      POGOProtos.Data.Quests.CatchPokemonQuest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.CatchPokemonQuest buildPartial() {
      POGOProtos.Data.Quests.CatchPokemonQuest result = new POGOProtos.Data.Quests.CatchPokemonQuest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        uniquePokemonId_ = java.util.Collections.unmodifiableList(uniquePokemonId_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.uniquePokemonId_ = uniquePokemonId_;
      result.activeEncounterId_ = activeEncounterId_;
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
      if (other instanceof POGOProtos.Data.Quests.CatchPokemonQuest) {
        return mergeFrom((POGOProtos.Data.Quests.CatchPokemonQuest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Quests.CatchPokemonQuest other) {
      if (other == POGOProtos.Data.Quests.CatchPokemonQuest.getDefaultInstance()) return this;
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
      if (other.getActiveEncounterId() != 0L) {
        setActiveEncounterId(other.getActiveEncounterId());
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
      POGOProtos.Data.Quests.CatchPokemonQuest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Quests.CatchPokemonQuest) e.getUnfinishedMessage();
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
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @return A list containing the uniquePokemonId.
     */
    public java.util.List<POGOProtos.Enums.PokemonId> getUniquePokemonIdList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Enums.PokemonId>(uniquePokemonId_, uniquePokemonId_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @return The count of uniquePokemonId.
     */
    public int getUniquePokemonIdCount() {
      return uniquePokemonId_.size();
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @param index The index of the element to return.
     * @return The uniquePokemonId at the given index.
     */
    public POGOProtos.Enums.PokemonId getUniquePokemonId(int index) {
      return uniquePokemonId_converter_.convert(uniquePokemonId_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The uniquePokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setUniquePokemonId(
        int index, POGOProtos.Enums.PokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUniquePokemonIdIsMutable();
      uniquePokemonId_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @param value The uniquePokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addUniquePokemonId(POGOProtos.Enums.PokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureUniquePokemonIdIsMutable();
      uniquePokemonId_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @param values The uniquePokemonId to add.
     * @return This builder for chaining.
     */
    public Builder addAllUniquePokemonId(
        java.lang.Iterable<? extends POGOProtos.Enums.PokemonId> values) {
      ensureUniquePokemonIdIsMutable();
      for (POGOProtos.Enums.PokemonId value : values) {
        uniquePokemonId_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUniquePokemonId() {
      uniquePokemonId_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @return A list containing the enum numeric values on the wire for uniquePokemonId.
     */
    public java.util.List<java.lang.Integer>
    getUniquePokemonIdValueList() {
      return java.util.Collections.unmodifiableList(uniquePokemonId_);
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of uniquePokemonId at the given index.
     */
    public int getUniquePokemonIdValue(int index) {
      return uniquePokemonId_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
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
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
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
     * <code>repeated .POGOProtos.Enums.PokemonId unique_pokemon_id = 1;</code>
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

    private long activeEncounterId_ ;
    /**
     * <code>fixed64 active_encounter_id = 2;</code>
     * @return The activeEncounterId.
     */
    @java.lang.Override
    public long getActiveEncounterId() {
      return activeEncounterId_;
    }
    /**
     * <code>fixed64 active_encounter_id = 2;</code>
     * @param value The activeEncounterId to set.
     * @return This builder for chaining.
     */
    public Builder setActiveEncounterId(long value) {
      
      activeEncounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 active_encounter_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveEncounterId() {
      
      activeEncounterId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Quests.CatchPokemonQuest)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Quests.CatchPokemonQuest)
  private static final POGOProtos.Data.Quests.CatchPokemonQuest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Quests.CatchPokemonQuest();
  }

  public static POGOProtos.Data.Quests.CatchPokemonQuest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatchPokemonQuest>
      PARSER = new com.google.protobuf.AbstractParser<CatchPokemonQuest>() {
    @java.lang.Override
    public CatchPokemonQuest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatchPokemonQuest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatchPokemonQuest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatchPokemonQuest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Quests.CatchPokemonQuest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

