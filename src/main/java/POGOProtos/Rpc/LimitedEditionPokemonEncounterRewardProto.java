// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto}
 */
public  final class LimitedEditionPokemonEncounterRewardProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)
    LimitedEditionPokemonEncounterRewardProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LimitedEditionPokemonEncounterRewardProto.newBuilder() to construct.
  private LimitedEditionPokemonEncounterRewardProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LimitedEditionPokemonEncounterRewardProto() {
    identifier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LimitedEditionPokemonEncounterRewardProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LimitedEditionPokemonEncounterRewardProto(
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
            POGOProtos.Rpc.PokemonEncounterRewardProto.Builder subBuilder = null;
            if (pokemon_ != null) {
              subBuilder = pokemon_.toBuilder();
            }
            pokemon_ = input.readMessage(POGOProtos.Rpc.PokemonEncounterRewardProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemon_);
              pokemon_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            identifier_ = s;
            break;
          }
          case 24: {

            lifetimeMaxCount_ = input.readInt32();
            break;
          }
          case 32: {

            perCompetitiveCombatSeasonMaxCount_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LimitedEditionPokemonEncounterRewardProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LimitedEditionPokemonEncounterRewardProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.class, POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PokemonEncounterRewardProto pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
   * @return The pokemon.
   */
  public POGOProtos.Rpc.PokemonEncounterRewardProto getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonEncounterRewardProto.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
   */
  public POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int IDENTIFIER_FIELD_NUMBER = 2;
  private volatile java.lang.Object identifier_;
  /**
   * <code>string identifier = 2;</code>
   * @return The identifier.
   */
  public java.lang.String getIdentifier() {
    java.lang.Object ref = identifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identifier_ = s;
      return s;
    }
  }
  /**
   * <code>string identifier = 2;</code>
   * @return The bytes for identifier.
   */
  public com.google.protobuf.ByteString
      getIdentifierBytes() {
    java.lang.Object ref = identifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIFETIME_MAX_COUNT_FIELD_NUMBER = 3;
  private int lifetimeMaxCount_;
  /**
   * <code>int32 lifetime_max_count = 3;</code>
   * @return The lifetimeMaxCount.
   */
  public int getLifetimeMaxCount() {
    return lifetimeMaxCount_;
  }

  public static final int PER_COMPETITIVE_COMBAT_SEASON_MAX_COUNT_FIELD_NUMBER = 4;
  private int perCompetitiveCombatSeasonMaxCount_;
  /**
   * <code>int32 per_competitive_combat_season_max_count = 4;</code>
   * @return The perCompetitiveCombatSeasonMaxCount.
   */
  public int getPerCompetitiveCombatSeasonMaxCount() {
    return perCompetitiveCombatSeasonMaxCount_;
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
    if (!getIdentifierBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identifier_);
    }
    if (lifetimeMaxCount_ != 0) {
      output.writeInt32(3, lifetimeMaxCount_);
    }
    if (perCompetitiveCombatSeasonMaxCount_ != 0) {
      output.writeInt32(4, perCompetitiveCombatSeasonMaxCount_);
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
    if (!getIdentifierBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identifier_);
    }
    if (lifetimeMaxCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, lifetimeMaxCount_);
    }
    if (perCompetitiveCombatSeasonMaxCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, perCompetitiveCombatSeasonMaxCount_);
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
    if (!(obj instanceof POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto other = (POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto) obj;

    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (!getIdentifier()
        .equals(other.getIdentifier())) return false;
    if (getLifetimeMaxCount()
        != other.getLifetimeMaxCount()) return false;
    if (getPerCompetitiveCombatSeasonMaxCount()
        != other.getPerCompetitiveCombatSeasonMaxCount()) return false;
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
    hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getIdentifier().hashCode();
    hash = (37 * hash) + LIFETIME_MAX_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getLifetimeMaxCount();
    hash = (37 * hash) + PER_COMPETITIVE_COMBAT_SEASON_MAX_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPerCompetitiveCombatSeasonMaxCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)
      POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LimitedEditionPokemonEncounterRewardProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LimitedEditionPokemonEncounterRewardProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.class, POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.newBuilder()
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
      identifier_ = "";

      lifetimeMaxCount_ = 0;

      perCompetitiveCombatSeasonMaxCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LimitedEditionPokemonEncounterRewardProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto build() {
      POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto buildPartial() {
      POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto result = new POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto(this);
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      result.identifier_ = identifier_;
      result.lifetimeMaxCount_ = lifetimeMaxCount_;
      result.perCompetitiveCombatSeasonMaxCount_ = perCompetitiveCombatSeasonMaxCount_;
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
      if (other instanceof POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto) {
        return mergeFrom((POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto other) {
      if (other == POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto.getDefaultInstance()) return this;
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (!other.getIdentifier().isEmpty()) {
        identifier_ = other.identifier_;
        onChanged();
      }
      if (other.getLifetimeMaxCount() != 0) {
        setLifetimeMaxCount(other.getLifetimeMaxCount());
      }
      if (other.getPerCompetitiveCombatSeasonMaxCount() != 0) {
        setPerCompetitiveCombatSeasonMaxCount(other.getPerCompetitiveCombatSeasonMaxCount());
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
      POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PokemonEncounterRewardProto pokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonEncounterRewardProto, POGOProtos.Rpc.PokemonEncounterRewardProto.Builder, POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder> pokemonBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     * @return Whether the pokemon field is set.
     */
    public boolean hasPokemon() {
      return pokemonBuilder_ != null || pokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     * @return The pokemon.
     */
    public POGOProtos.Rpc.PokemonEncounterRewardProto getPokemon() {
      if (pokemonBuilder_ == null) {
        return pokemon_ == null ? POGOProtos.Rpc.PokemonEncounterRewardProto.getDefaultInstance() : pokemon_;
      } else {
        return pokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     */
    public Builder setPokemon(POGOProtos.Rpc.PokemonEncounterRewardProto value) {
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
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     */
    public Builder setPokemon(
        POGOProtos.Rpc.PokemonEncounterRewardProto.Builder builderForValue) {
      if (pokemonBuilder_ == null) {
        pokemon_ = builderForValue.build();
        onChanged();
      } else {
        pokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     */
    public Builder mergePokemon(POGOProtos.Rpc.PokemonEncounterRewardProto value) {
      if (pokemonBuilder_ == null) {
        if (pokemon_ != null) {
          pokemon_ =
            POGOProtos.Rpc.PokemonEncounterRewardProto.newBuilder(pokemon_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
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
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     */
    public POGOProtos.Rpc.PokemonEncounterRewardProto.Builder getPokemonBuilder() {
      
      onChanged();
      return getPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     */
    public POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder getPokemonOrBuilder() {
      if (pokemonBuilder_ != null) {
        return pokemonBuilder_.getMessageOrBuilder();
      } else {
        return pokemon_ == null ?
            POGOProtos.Rpc.PokemonEncounterRewardProto.getDefaultInstance() : pokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonEncounterRewardProto pokemon = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonEncounterRewardProto, POGOProtos.Rpc.PokemonEncounterRewardProto.Builder, POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder> 
        getPokemonFieldBuilder() {
      if (pokemonBuilder_ == null) {
        pokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonEncounterRewardProto, POGOProtos.Rpc.PokemonEncounterRewardProto.Builder, POGOProtos.Rpc.PokemonEncounterRewardProtoOrBuilder>(
                getPokemon(),
                getParentForChildren(),
                isClean());
        pokemon_ = null;
      }
      return pokemonBuilder_;
    }

    private java.lang.Object identifier_ = "";
    /**
     * <code>string identifier = 2;</code>
     * @return The identifier.
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identifier = 2;</code>
     * @return The bytes for identifier.
     */
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identifier = 2;</code>
     * @param value The identifier to set.
     * @return This builder for chaining.
     */
    public Builder setIdentifier(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identifier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentifier() {
      
      identifier_ = getDefaultInstance().getIdentifier();
      onChanged();
      return this;
    }
    /**
     * <code>string identifier = 2;</code>
     * @param value The bytes for identifier to set.
     * @return This builder for chaining.
     */
    public Builder setIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identifier_ = value;
      onChanged();
      return this;
    }

    private int lifetimeMaxCount_ ;
    /**
     * <code>int32 lifetime_max_count = 3;</code>
     * @return The lifetimeMaxCount.
     */
    public int getLifetimeMaxCount() {
      return lifetimeMaxCount_;
    }
    /**
     * <code>int32 lifetime_max_count = 3;</code>
     * @param value The lifetimeMaxCount to set.
     * @return This builder for chaining.
     */
    public Builder setLifetimeMaxCount(int value) {
      
      lifetimeMaxCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lifetime_max_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLifetimeMaxCount() {
      
      lifetimeMaxCount_ = 0;
      onChanged();
      return this;
    }

    private int perCompetitiveCombatSeasonMaxCount_ ;
    /**
     * <code>int32 per_competitive_combat_season_max_count = 4;</code>
     * @return The perCompetitiveCombatSeasonMaxCount.
     */
    public int getPerCompetitiveCombatSeasonMaxCount() {
      return perCompetitiveCombatSeasonMaxCount_;
    }
    /**
     * <code>int32 per_competitive_combat_season_max_count = 4;</code>
     * @param value The perCompetitiveCombatSeasonMaxCount to set.
     * @return This builder for chaining.
     */
    public Builder setPerCompetitiveCombatSeasonMaxCount(int value) {
      
      perCompetitiveCombatSeasonMaxCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 per_competitive_combat_season_max_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPerCompetitiveCombatSeasonMaxCount() {
      
      perCompetitiveCombatSeasonMaxCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto)
  private static final POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto();
  }

  public static POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LimitedEditionPokemonEncounterRewardProto>
      PARSER = new com.google.protobuf.AbstractParser<LimitedEditionPokemonEncounterRewardProto>() {
    @java.lang.Override
    public LimitedEditionPokemonEncounterRewardProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LimitedEditionPokemonEncounterRewardProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LimitedEditionPokemonEncounterRewardProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LimitedEditionPokemonEncounterRewardProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LimitedEditionPokemonEncounterRewardProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
