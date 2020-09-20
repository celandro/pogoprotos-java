// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EOGFHIGOJDL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PokemonFamilyProto}
 */
public final class PokemonFamilyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonFamilyProto)
    PokemonFamilyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonFamilyProto.newBuilder() to construct.
  private PokemonFamilyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonFamilyProto() {
    familyId_ = 0;
    megaEvolutionResources_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonFamilyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonFamilyProto(
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

            familyId_ = rawValue;
            break;
          }
          case 16: {

            candy_ = input.readInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              megaEvolutionResources_ = new java.util.ArrayList<POGOProtos.Rpc.TemporaryEvolutionResourceProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            megaEvolutionResources_.add(
                input.readMessage(POGOProtos.Rpc.TemporaryEvolutionResourceProto.parser(), extensionRegistry));
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
        megaEvolutionResources_ = java.util.Collections.unmodifiableList(megaEvolutionResources_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonFamilyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonFamilyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonFamilyProto.class, POGOProtos.Rpc.PokemonFamilyProto.Builder.class);
  }

  public static final int FAMILY_ID_FIELD_NUMBER = 1;
  private int familyId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
   * @return The enum numeric value on the wire for familyId.
   */
  @java.lang.Override public int getFamilyIdValue() {
    return familyId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
   * @return The familyId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonFamilyId getFamilyId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonFamilyId result = POGOProtos.Rpc.HoloPokemonFamilyId.valueOf(familyId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonFamilyId.UNRECOGNIZED : result;
  }

  public static final int CANDY_FIELD_NUMBER = 2;
  private int candy_;
  /**
   * <code>int32 candy = 2;</code>
   * @return The candy.
   */
  @java.lang.Override
  public int getCandy() {
    return candy_;
  }

  public static final int MEGA_EVOLUTION_RESOURCES_FIELD_NUMBER = 3;
  private java.util.List<POGOProtos.Rpc.TemporaryEvolutionResourceProto> megaEvolutionResources_;
  /**
   * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.TemporaryEvolutionResourceProto> getMegaEvolutionResourcesList() {
    return megaEvolutionResources_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder> 
      getMegaEvolutionResourcesOrBuilderList() {
    return megaEvolutionResources_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
   */
  @java.lang.Override
  public int getMegaEvolutionResourcesCount() {
    return megaEvolutionResources_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.TemporaryEvolutionResourceProto getMegaEvolutionResources(int index) {
    return megaEvolutionResources_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder getMegaEvolutionResourcesOrBuilder(
      int index) {
    return megaEvolutionResources_.get(index);
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
    if (familyId_ != POGOProtos.Rpc.HoloPokemonFamilyId.HOLO_POKEMON_FAMILY_ID_FAMILY_UNSET.getNumber()) {
      output.writeEnum(1, familyId_);
    }
    if (candy_ != 0) {
      output.writeInt32(2, candy_);
    }
    for (int i = 0; i < megaEvolutionResources_.size(); i++) {
      output.writeMessage(3, megaEvolutionResources_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (familyId_ != POGOProtos.Rpc.HoloPokemonFamilyId.HOLO_POKEMON_FAMILY_ID_FAMILY_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, familyId_);
    }
    if (candy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, candy_);
    }
    for (int i = 0; i < megaEvolutionResources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, megaEvolutionResources_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonFamilyProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonFamilyProto other = (POGOProtos.Rpc.PokemonFamilyProto) obj;

    if (familyId_ != other.familyId_) return false;
    if (getCandy()
        != other.getCandy()) return false;
    if (!getMegaEvolutionResourcesList()
        .equals(other.getMegaEvolutionResourcesList())) return false;
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
    hash = (37 * hash) + FAMILY_ID_FIELD_NUMBER;
    hash = (53 * hash) + familyId_;
    hash = (37 * hash) + CANDY_FIELD_NUMBER;
    hash = (53 * hash) + getCandy();
    if (getMegaEvolutionResourcesCount() > 0) {
      hash = (37 * hash) + MEGA_EVOLUTION_RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getMegaEvolutionResourcesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonFamilyProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonFamilyProto prototype) {
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
   * ref: EOGFHIGOJDL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PokemonFamilyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonFamilyProto)
      POGOProtos.Rpc.PokemonFamilyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonFamilyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonFamilyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonFamilyProto.class, POGOProtos.Rpc.PokemonFamilyProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonFamilyProto.newBuilder()
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
        getMegaEvolutionResourcesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      familyId_ = 0;

      candy_ = 0;

      if (megaEvolutionResourcesBuilder_ == null) {
        megaEvolutionResources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        megaEvolutionResourcesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonFamilyProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonFamilyProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonFamilyProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonFamilyProto build() {
      POGOProtos.Rpc.PokemonFamilyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonFamilyProto buildPartial() {
      POGOProtos.Rpc.PokemonFamilyProto result = new POGOProtos.Rpc.PokemonFamilyProto(this);
      int from_bitField0_ = bitField0_;
      result.familyId_ = familyId_;
      result.candy_ = candy_;
      if (megaEvolutionResourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          megaEvolutionResources_ = java.util.Collections.unmodifiableList(megaEvolutionResources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.megaEvolutionResources_ = megaEvolutionResources_;
      } else {
        result.megaEvolutionResources_ = megaEvolutionResourcesBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.PokemonFamilyProto) {
        return mergeFrom((POGOProtos.Rpc.PokemonFamilyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonFamilyProto other) {
      if (other == POGOProtos.Rpc.PokemonFamilyProto.getDefaultInstance()) return this;
      if (other.familyId_ != 0) {
        setFamilyIdValue(other.getFamilyIdValue());
      }
      if (other.getCandy() != 0) {
        setCandy(other.getCandy());
      }
      if (megaEvolutionResourcesBuilder_ == null) {
        if (!other.megaEvolutionResources_.isEmpty()) {
          if (megaEvolutionResources_.isEmpty()) {
            megaEvolutionResources_ = other.megaEvolutionResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMegaEvolutionResourcesIsMutable();
            megaEvolutionResources_.addAll(other.megaEvolutionResources_);
          }
          onChanged();
        }
      } else {
        if (!other.megaEvolutionResources_.isEmpty()) {
          if (megaEvolutionResourcesBuilder_.isEmpty()) {
            megaEvolutionResourcesBuilder_.dispose();
            megaEvolutionResourcesBuilder_ = null;
            megaEvolutionResources_ = other.megaEvolutionResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            megaEvolutionResourcesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMegaEvolutionResourcesFieldBuilder() : null;
          } else {
            megaEvolutionResourcesBuilder_.addAllMessages(other.megaEvolutionResources_);
          }
        }
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
      POGOProtos.Rpc.PokemonFamilyProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonFamilyProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int familyId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
     * @return The enum numeric value on the wire for familyId.
     */
    @java.lang.Override public int getFamilyIdValue() {
      return familyId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
     * @param value The enum numeric value on the wire for familyId to set.
     * @return This builder for chaining.
     */
    public Builder setFamilyIdValue(int value) {
      
      familyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
     * @return The familyId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonFamilyId getFamilyId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonFamilyId result = POGOProtos.Rpc.HoloPokemonFamilyId.valueOf(familyId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonFamilyId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
     * @param value The familyId to set.
     * @return This builder for chaining.
     */
    public Builder setFamilyId(POGOProtos.Rpc.HoloPokemonFamilyId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      familyId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonFamilyId family_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFamilyId() {
      
      familyId_ = 0;
      onChanged();
      return this;
    }

    private int candy_ ;
    /**
     * <code>int32 candy = 2;</code>
     * @return The candy.
     */
    @java.lang.Override
    public int getCandy() {
      return candy_;
    }
    /**
     * <code>int32 candy = 2;</code>
     * @param value The candy to set.
     * @return This builder for chaining.
     */
    public Builder setCandy(int value) {
      
      candy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 candy = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandy() {
      
      candy_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Rpc.TemporaryEvolutionResourceProto> megaEvolutionResources_ =
      java.util.Collections.emptyList();
    private void ensureMegaEvolutionResourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        megaEvolutionResources_ = new java.util.ArrayList<POGOProtos.Rpc.TemporaryEvolutionResourceProto>(megaEvolutionResources_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.TemporaryEvolutionResourceProto, POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder, POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder> megaEvolutionResourcesBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.TemporaryEvolutionResourceProto> getMegaEvolutionResourcesList() {
      if (megaEvolutionResourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(megaEvolutionResources_);
      } else {
        return megaEvolutionResourcesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public int getMegaEvolutionResourcesCount() {
      if (megaEvolutionResourcesBuilder_ == null) {
        return megaEvolutionResources_.size();
      } else {
        return megaEvolutionResourcesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public POGOProtos.Rpc.TemporaryEvolutionResourceProto getMegaEvolutionResources(int index) {
      if (megaEvolutionResourcesBuilder_ == null) {
        return megaEvolutionResources_.get(index);
      } else {
        return megaEvolutionResourcesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder setMegaEvolutionResources(
        int index, POGOProtos.Rpc.TemporaryEvolutionResourceProto value) {
      if (megaEvolutionResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.set(index, value);
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder setMegaEvolutionResources(
        int index, POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder builderForValue) {
      if (megaEvolutionResourcesBuilder_ == null) {
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.set(index, builderForValue.build());
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder addMegaEvolutionResources(POGOProtos.Rpc.TemporaryEvolutionResourceProto value) {
      if (megaEvolutionResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.add(value);
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder addMegaEvolutionResources(
        int index, POGOProtos.Rpc.TemporaryEvolutionResourceProto value) {
      if (megaEvolutionResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.add(index, value);
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder addMegaEvolutionResources(
        POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder builderForValue) {
      if (megaEvolutionResourcesBuilder_ == null) {
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.add(builderForValue.build());
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder addMegaEvolutionResources(
        int index, POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder builderForValue) {
      if (megaEvolutionResourcesBuilder_ == null) {
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.add(index, builderForValue.build());
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder addAllMegaEvolutionResources(
        java.lang.Iterable<? extends POGOProtos.Rpc.TemporaryEvolutionResourceProto> values) {
      if (megaEvolutionResourcesBuilder_ == null) {
        ensureMegaEvolutionResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, megaEvolutionResources_);
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder clearMegaEvolutionResources() {
      if (megaEvolutionResourcesBuilder_ == null) {
        megaEvolutionResources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public Builder removeMegaEvolutionResources(int index) {
      if (megaEvolutionResourcesBuilder_ == null) {
        ensureMegaEvolutionResourcesIsMutable();
        megaEvolutionResources_.remove(index);
        onChanged();
      } else {
        megaEvolutionResourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder getMegaEvolutionResourcesBuilder(
        int index) {
      return getMegaEvolutionResourcesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder getMegaEvolutionResourcesOrBuilder(
        int index) {
      if (megaEvolutionResourcesBuilder_ == null) {
        return megaEvolutionResources_.get(index);  } else {
        return megaEvolutionResourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder> 
         getMegaEvolutionResourcesOrBuilderList() {
      if (megaEvolutionResourcesBuilder_ != null) {
        return megaEvolutionResourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(megaEvolutionResources_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder addMegaEvolutionResourcesBuilder() {
      return getMegaEvolutionResourcesFieldBuilder().addBuilder(
          POGOProtos.Rpc.TemporaryEvolutionResourceProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder addMegaEvolutionResourcesBuilder(
        int index) {
      return getMegaEvolutionResourcesFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.TemporaryEvolutionResourceProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TemporaryEvolutionResourceProto mega_evolution_resources = 3;</code>
     */
    public java.util.List<POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder> 
         getMegaEvolutionResourcesBuilderList() {
      return getMegaEvolutionResourcesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.TemporaryEvolutionResourceProto, POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder, POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder> 
        getMegaEvolutionResourcesFieldBuilder() {
      if (megaEvolutionResourcesBuilder_ == null) {
        megaEvolutionResourcesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.TemporaryEvolutionResourceProto, POGOProtos.Rpc.TemporaryEvolutionResourceProto.Builder, POGOProtos.Rpc.TemporaryEvolutionResourceProtoOrBuilder>(
                megaEvolutionResources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        megaEvolutionResources_ = null;
      }
      return megaEvolutionResourcesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonFamilyProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonFamilyProto)
  private static final POGOProtos.Rpc.PokemonFamilyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonFamilyProto();
  }

  public static POGOProtos.Rpc.PokemonFamilyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonFamilyProto>
      PARSER = new com.google.protobuf.AbstractParser<PokemonFamilyProto>() {
    @java.lang.Override
    public PokemonFamilyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonFamilyProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonFamilyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonFamilyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonFamilyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

