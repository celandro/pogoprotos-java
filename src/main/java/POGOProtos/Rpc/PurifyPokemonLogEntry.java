// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PurifyPokemonLogEntry}
 */
public final class PurifyPokemonLogEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PurifyPokemonLogEntry)
    PurifyPokemonLogEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PurifyPokemonLogEntry.newBuilder() to construct.
  private PurifyPokemonLogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PurifyPokemonLogEntry() {
    pokemonId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PurifyPokemonLogEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PurifyPokemonLogEntry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            pokemonId_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (pokemonDisplay_ != null) {
              subBuilder = pokemonDisplay_.toBuilder();
            }
            pokemonDisplay_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemonDisplay_);
              pokemonDisplay_ = subBuilder.buildPartial();
            }

            break;
          }
          case 25: {

            purifiedPokemonUuid_ = input.readFixed64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PurifyPokemonLogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PurifyPokemonLogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PurifyPokemonLogEntry.class, POGOProtos.Rpc.PurifyPokemonLogEntry.Builder.class);
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  private int pokemonId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  @java.lang.Override public int getPokemonIdValue() {
    return pokemonId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int POKEMON_DISPLAY_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  @java.lang.Override
  public boolean hasPokemonDisplay() {
    return pokemonDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
   * @return The pokemonDisplay.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
    return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
    return getPokemonDisplay();
  }

  public static final int PURIFIED_POKEMON_UUID_FIELD_NUMBER = 3;
  private long purifiedPokemonUuid_;
  /**
   * <code>fixed64 purified_pokemon_uuid = 3;</code>
   * @return The purifiedPokemonUuid.
   */
  @java.lang.Override
  public long getPurifiedPokemonUuid() {
    return purifiedPokemonUuid_;
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
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(1, pokemonId_);
    }
    if (pokemonDisplay_ != null) {
      output.writeMessage(2, getPokemonDisplay());
    }
    if (purifiedPokemonUuid_ != 0L) {
      output.writeFixed64(3, purifiedPokemonUuid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemonId_);
    }
    if (pokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPokemonDisplay());
    }
    if (purifiedPokemonUuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(3, purifiedPokemonUuid_);
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
    if (!(obj instanceof POGOProtos.Rpc.PurifyPokemonLogEntry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PurifyPokemonLogEntry other = (POGOProtos.Rpc.PurifyPokemonLogEntry) obj;

    if (pokemonId_ != other.pokemonId_) return false;
    if (hasPokemonDisplay() != other.hasPokemonDisplay()) return false;
    if (hasPokemonDisplay()) {
      if (!getPokemonDisplay()
          .equals(other.getPokemonDisplay())) return false;
    }
    if (getPurifiedPokemonUuid()
        != other.getPurifiedPokemonUuid()) return false;
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
    hash = (53 * hash) + pokemonId_;
    if (hasPokemonDisplay()) {
      hash = (37 * hash) + POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonDisplay().hashCode();
    }
    hash = (37 * hash) + PURIFIED_POKEMON_UUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPurifiedPokemonUuid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PurifyPokemonLogEntry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PurifyPokemonLogEntry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PurifyPokemonLogEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PurifyPokemonLogEntry)
      POGOProtos.Rpc.PurifyPokemonLogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PurifyPokemonLogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PurifyPokemonLogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PurifyPokemonLogEntry.class, POGOProtos.Rpc.PurifyPokemonLogEntry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PurifyPokemonLogEntry.newBuilder()
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
      pokemonId_ = 0;

      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }
      purifiedPokemonUuid_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PurifyPokemonLogEntry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PurifyPokemonLogEntry getDefaultInstanceForType() {
      return POGOProtos.Rpc.PurifyPokemonLogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PurifyPokemonLogEntry build() {
      POGOProtos.Rpc.PurifyPokemonLogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PurifyPokemonLogEntry buildPartial() {
      POGOProtos.Rpc.PurifyPokemonLogEntry result = new POGOProtos.Rpc.PurifyPokemonLogEntry(this);
      result.pokemonId_ = pokemonId_;
      if (pokemonDisplayBuilder_ == null) {
        result.pokemonDisplay_ = pokemonDisplay_;
      } else {
        result.pokemonDisplay_ = pokemonDisplayBuilder_.build();
      }
      result.purifiedPokemonUuid_ = purifiedPokemonUuid_;
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
      if (other instanceof POGOProtos.Rpc.PurifyPokemonLogEntry) {
        return mergeFrom((POGOProtos.Rpc.PurifyPokemonLogEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PurifyPokemonLogEntry other) {
      if (other == POGOProtos.Rpc.PurifyPokemonLogEntry.getDefaultInstance()) return this;
      if (other.pokemonId_ != 0) {
        setPokemonIdValue(other.getPokemonIdValue());
      }
      if (other.hasPokemonDisplay()) {
        mergePokemonDisplay(other.getPokemonDisplay());
      }
      if (other.getPurifiedPokemonUuid() != 0L) {
        setPurifiedPokemonUuid(other.getPurifiedPokemonUuid());
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
      POGOProtos.Rpc.PurifyPokemonLogEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PurifyPokemonLogEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokemonId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    @java.lang.Override public int getPokemonIdValue() {
      return pokemonId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto pokemonDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> pokemonDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     * @return Whether the pokemonDisplay field is set.
     */
    public boolean hasPokemonDisplay() {
      return pokemonDisplayBuilder_ != null || pokemonDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     * @return The pokemonDisplay.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        return pokemonDisplay_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
      } else {
        return pokemonDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    public Builder setPokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (pokemonDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemonDisplay_ = value;
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    public Builder setPokemonDisplay(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = builderForValue.build();
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    public Builder mergePokemonDisplay(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (pokemonDisplayBuilder_ == null) {
        if (pokemonDisplay_ != null) {
          pokemonDisplay_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(pokemonDisplay_).mergeFrom(value).buildPartial();
        } else {
          pokemonDisplay_ = value;
        }
        onChanged();
      } else {
        pokemonDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    public Builder clearPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
        onChanged();
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getPokemonDisplayBuilder() {
      
      onChanged();
      return getPokemonDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPokemonDisplayOrBuilder() {
      if (pokemonDisplayBuilder_ != null) {
        return pokemonDisplayBuilder_.getMessageOrBuilder();
      } else {
        return pokemonDisplay_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : pokemonDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto pokemon_display = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getPokemonDisplayFieldBuilder() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getPokemonDisplay(),
                getParentForChildren(),
                isClean());
        pokemonDisplay_ = null;
      }
      return pokemonDisplayBuilder_;
    }

    private long purifiedPokemonUuid_ ;
    /**
     * <code>fixed64 purified_pokemon_uuid = 3;</code>
     * @return The purifiedPokemonUuid.
     */
    @java.lang.Override
    public long getPurifiedPokemonUuid() {
      return purifiedPokemonUuid_;
    }
    /**
     * <code>fixed64 purified_pokemon_uuid = 3;</code>
     * @param value The purifiedPokemonUuid to set.
     * @return This builder for chaining.
     */
    public Builder setPurifiedPokemonUuid(long value) {
      
      purifiedPokemonUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 purified_pokemon_uuid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPurifiedPokemonUuid() {
      
      purifiedPokemonUuid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PurifyPokemonLogEntry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PurifyPokemonLogEntry)
  private static final POGOProtos.Rpc.PurifyPokemonLogEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PurifyPokemonLogEntry();
  }

  public static POGOProtos.Rpc.PurifyPokemonLogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurifyPokemonLogEntry>
      PARSER = new com.google.protobuf.AbstractParser<PurifyPokemonLogEntry>() {
    @java.lang.Override
    public PurifyPokemonLogEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PurifyPokemonLogEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PurifyPokemonLogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurifyPokemonLogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PurifyPokemonLogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

