// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EncounterPokemonTelemetry}
 */
public final class EncounterPokemonTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EncounterPokemonTelemetry)
    EncounterPokemonTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncounterPokemonTelemetry.newBuilder() to construct.
  private EncounterPokemonTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncounterPokemonTelemetry() {
    mapPokemonType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncounterPokemonTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncounterPokemonTelemetry(
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
          case 10: {
            POGOProtos.Rpc.PokemonTelemetry.Builder subBuilder = null;
            if (pokemon_ != null) {
              subBuilder = pokemon_.toBuilder();
            }
            pokemon_ = input.readMessage(POGOProtos.Rpc.PokemonTelemetry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemon_);
              pokemon_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            mapPokemonType_ = s;
            break;
          }
          case 24: {

            arEnabled_ = input.readBool();
            break;
          }
          case 32: {

            arPlusEnabled_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EncounterPokemonTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EncounterPokemonTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EncounterPokemonTelemetry.class, POGOProtos.Rpc.EncounterPokemonTelemetry.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PokemonTelemetry pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  @java.lang.Override
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTelemetry getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int MAP_POKEMON_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object mapPokemonType_;
  /**
   * <code>string map_pokemon_type = 2;</code>
   * @return The mapPokemonType.
   */
  @java.lang.Override
  public java.lang.String getMapPokemonType() {
    java.lang.Object ref = mapPokemonType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mapPokemonType_ = s;
      return s;
    }
  }
  /**
   * <code>string map_pokemon_type = 2;</code>
   * @return The bytes for mapPokemonType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMapPokemonTypeBytes() {
    java.lang.Object ref = mapPokemonType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mapPokemonType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AR_ENABLED_FIELD_NUMBER = 3;
  private boolean arEnabled_;
  /**
   * <code>bool ar_enabled = 3;</code>
   * @return The arEnabled.
   */
  @java.lang.Override
  public boolean getArEnabled() {
    return arEnabled_;
  }

  public static final int AR_PLUS_ENABLED_FIELD_NUMBER = 4;
  private boolean arPlusEnabled_;
  /**
   * <code>bool ar_plus_enabled = 4;</code>
   * @return The arPlusEnabled.
   */
  @java.lang.Override
  public boolean getArPlusEnabled() {
    return arPlusEnabled_;
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
    if (pokemon_ != null) {
      output.writeMessage(1, getPokemon());
    }
    if (!getMapPokemonTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mapPokemonType_);
    }
    if (arEnabled_ != false) {
      output.writeBool(3, arEnabled_);
    }
    if (arPlusEnabled_ != false) {
      output.writeBool(4, arPlusEnabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPokemon());
    }
    if (!getMapPokemonTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mapPokemonType_);
    }
    if (arEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, arEnabled_);
    }
    if (arPlusEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, arPlusEnabled_);
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
    if (!(obj instanceof POGOProtos.Rpc.EncounterPokemonTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EncounterPokemonTelemetry other = (POGOProtos.Rpc.EncounterPokemonTelemetry) obj;

    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (!getMapPokemonType()
        .equals(other.getMapPokemonType())) return false;
    if (getArEnabled()
        != other.getArEnabled()) return false;
    if (getArPlusEnabled()
        != other.getArPlusEnabled()) return false;
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
    if (hasPokemon()) {
      hash = (37 * hash) + POKEMON_FIELD_NUMBER;
      hash = (53 * hash) + getPokemon().hashCode();
    }
    hash = (37 * hash) + MAP_POKEMON_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMapPokemonType().hashCode();
    hash = (37 * hash) + AR_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getArEnabled());
    hash = (37 * hash) + AR_PLUS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getArPlusEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterPokemonTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EncounterPokemonTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EncounterPokemonTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EncounterPokemonTelemetry)
      POGOProtos.Rpc.EncounterPokemonTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EncounterPokemonTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EncounterPokemonTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EncounterPokemonTelemetry.class, POGOProtos.Rpc.EncounterPokemonTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EncounterPokemonTelemetry.newBuilder()
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
      if (pokemonBuilder_ == null) {
        pokemon_ = null;
      } else {
        pokemon_ = null;
        pokemonBuilder_ = null;
      }
      mapPokemonType_ = "";

      arEnabled_ = false;

      arPlusEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EncounterPokemonTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterPokemonTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.EncounterPokemonTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterPokemonTelemetry build() {
      POGOProtos.Rpc.EncounterPokemonTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterPokemonTelemetry buildPartial() {
      POGOProtos.Rpc.EncounterPokemonTelemetry result = new POGOProtos.Rpc.EncounterPokemonTelemetry(this);
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      result.mapPokemonType_ = mapPokemonType_;
      result.arEnabled_ = arEnabled_;
      result.arPlusEnabled_ = arPlusEnabled_;
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
      if (other instanceof POGOProtos.Rpc.EncounterPokemonTelemetry) {
        return mergeFrom((POGOProtos.Rpc.EncounterPokemonTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EncounterPokemonTelemetry other) {
      if (other == POGOProtos.Rpc.EncounterPokemonTelemetry.getDefaultInstance()) return this;
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (!other.getMapPokemonType().isEmpty()) {
        mapPokemonType_ = other.mapPokemonType_;
        onChanged();
      }
      if (other.getArEnabled() != false) {
        setArEnabled(other.getArEnabled());
      }
      if (other.getArPlusEnabled() != false) {
        setArPlusEnabled(other.getArPlusEnabled());
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
      POGOProtos.Rpc.EncounterPokemonTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EncounterPokemonTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PokemonTelemetry pokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonTelemetry, POGOProtos.Rpc.PokemonTelemetry.Builder, POGOProtos.Rpc.PokemonTelemetryOrBuilder> pokemonBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     * @return Whether the pokemon field is set.
     */
    public boolean hasPokemon() {
      return pokemonBuilder_ != null || pokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     * @return The pokemon.
     */
    public POGOProtos.Rpc.PokemonTelemetry getPokemon() {
      if (pokemonBuilder_ == null) {
        return pokemon_ == null ? POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
      } else {
        return pokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder setPokemon(POGOProtos.Rpc.PokemonTelemetry value) {
      if (pokemonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pokemon_ = value;
        onChanged();
      } else {
        pokemonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder setPokemon(
        POGOProtos.Rpc.PokemonTelemetry.Builder builderForValue) {
      if (pokemonBuilder_ == null) {
        pokemon_ = builderForValue.build();
        onChanged();
      } else {
        pokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder mergePokemon(POGOProtos.Rpc.PokemonTelemetry value) {
      if (pokemonBuilder_ == null) {
        if (pokemon_ != null) {
          pokemon_ =
            POGOProtos.Rpc.PokemonTelemetry.newBuilder(pokemon_).mergeFrom(value).buildPartial();
        } else {
          pokemon_ = value;
        }
        onChanged();
      } else {
        pokemonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder clearPokemon() {
      if (pokemonBuilder_ == null) {
        pokemon_ = null;
        onChanged();
      } else {
        pokemon_ = null;
        pokemonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    public POGOProtos.Rpc.PokemonTelemetry.Builder getPokemonBuilder() {
      
      onChanged();
      return getPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    public POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
      if (pokemonBuilder_ != null) {
        return pokemonBuilder_.getMessageOrBuilder();
      } else {
        return pokemon_ == null ?
            POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonTelemetry, POGOProtos.Rpc.PokemonTelemetry.Builder, POGOProtos.Rpc.PokemonTelemetryOrBuilder> 
        getPokemonFieldBuilder() {
      if (pokemonBuilder_ == null) {
        pokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonTelemetry, POGOProtos.Rpc.PokemonTelemetry.Builder, POGOProtos.Rpc.PokemonTelemetryOrBuilder>(
                getPokemon(),
                getParentForChildren(),
                isClean());
        pokemon_ = null;
      }
      return pokemonBuilder_;
    }

    private java.lang.Object mapPokemonType_ = "";
    /**
     * <code>string map_pokemon_type = 2;</code>
     * @return The mapPokemonType.
     */
    public java.lang.String getMapPokemonType() {
      java.lang.Object ref = mapPokemonType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mapPokemonType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string map_pokemon_type = 2;</code>
     * @return The bytes for mapPokemonType.
     */
    public com.google.protobuf.ByteString
        getMapPokemonTypeBytes() {
      java.lang.Object ref = mapPokemonType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mapPokemonType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string map_pokemon_type = 2;</code>
     * @param value The mapPokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setMapPokemonType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mapPokemonType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string map_pokemon_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMapPokemonType() {
      
      mapPokemonType_ = getDefaultInstance().getMapPokemonType();
      onChanged();
      return this;
    }
    /**
     * <code>string map_pokemon_type = 2;</code>
     * @param value The bytes for mapPokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setMapPokemonTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mapPokemonType_ = value;
      onChanged();
      return this;
    }

    private boolean arEnabled_ ;
    /**
     * <code>bool ar_enabled = 3;</code>
     * @return The arEnabled.
     */
    @java.lang.Override
    public boolean getArEnabled() {
      return arEnabled_;
    }
    /**
     * <code>bool ar_enabled = 3;</code>
     * @param value The arEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setArEnabled(boolean value) {
      
      arEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ar_enabled = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArEnabled() {
      
      arEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean arPlusEnabled_ ;
    /**
     * <code>bool ar_plus_enabled = 4;</code>
     * @return The arPlusEnabled.
     */
    @java.lang.Override
    public boolean getArPlusEnabled() {
      return arPlusEnabled_;
    }
    /**
     * <code>bool ar_plus_enabled = 4;</code>
     * @param value The arPlusEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setArPlusEnabled(boolean value) {
      
      arPlusEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ar_plus_enabled = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearArPlusEnabled() {
      
      arPlusEnabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EncounterPokemonTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EncounterPokemonTelemetry)
  private static final POGOProtos.Rpc.EncounterPokemonTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EncounterPokemonTelemetry();
  }

  public static POGOProtos.Rpc.EncounterPokemonTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncounterPokemonTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<EncounterPokemonTelemetry>() {
    @java.lang.Override
    public EncounterPokemonTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncounterPokemonTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncounterPokemonTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncounterPokemonTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EncounterPokemonTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

