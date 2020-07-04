// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NicknamePokemonTelemetry}
 */
public  final class NicknamePokemonTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NicknamePokemonTelemetry)
    NicknamePokemonTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NicknamePokemonTelemetry.newBuilder() to construct.
  private NicknamePokemonTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NicknamePokemonTelemetry() {
    nickname_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NicknamePokemonTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NicknamePokemonTelemetry(
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

            nickname_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NicknamePokemonTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NicknamePokemonTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NicknamePokemonTelemetry.class, POGOProtos.Rpc.NicknamePokemonTelemetry.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PokemonTelemetry pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  public POGOProtos.Rpc.PokemonTelemetry getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonTelemetry.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonTelemetry pokemon = 1;</code>
   */
  public POGOProtos.Rpc.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int NICKNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object nickname_;
  /**
   * <code>string nickname = 2;</code>
   * @return The nickname.
   */
  public java.lang.String getNickname() {
    java.lang.Object ref = nickname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nickname_ = s;
      return s;
    }
  }
  /**
   * <code>string nickname = 2;</code>
   * @return The bytes for nickname.
   */
  public com.google.protobuf.ByteString
      getNicknameBytes() {
    java.lang.Object ref = nickname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nickname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNicknameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nickname_);
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
    if (!getNicknameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nickname_);
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
    if (!(obj instanceof POGOProtos.Rpc.NicknamePokemonTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NicknamePokemonTelemetry other = (POGOProtos.Rpc.NicknamePokemonTelemetry) obj;

    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (!getNickname()
        .equals(other.getNickname())) return false;
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
    hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getNickname().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NicknamePokemonTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NicknamePokemonTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NicknamePokemonTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NicknamePokemonTelemetry)
      POGOProtos.Rpc.NicknamePokemonTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NicknamePokemonTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NicknamePokemonTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NicknamePokemonTelemetry.class, POGOProtos.Rpc.NicknamePokemonTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NicknamePokemonTelemetry.newBuilder()
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
      nickname_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NicknamePokemonTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NicknamePokemonTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.NicknamePokemonTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NicknamePokemonTelemetry build() {
      POGOProtos.Rpc.NicknamePokemonTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NicknamePokemonTelemetry buildPartial() {
      POGOProtos.Rpc.NicknamePokemonTelemetry result = new POGOProtos.Rpc.NicknamePokemonTelemetry(this);
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      result.nickname_ = nickname_;
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
      if (other instanceof POGOProtos.Rpc.NicknamePokemonTelemetry) {
        return mergeFrom((POGOProtos.Rpc.NicknamePokemonTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NicknamePokemonTelemetry other) {
      if (other == POGOProtos.Rpc.NicknamePokemonTelemetry.getDefaultInstance()) return this;
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (!other.getNickname().isEmpty()) {
        nickname_ = other.nickname_;
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
      POGOProtos.Rpc.NicknamePokemonTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NicknamePokemonTelemetry) e.getUnfinishedMessage();
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

    private java.lang.Object nickname_ = "";
    /**
     * <code>string nickname = 2;</code>
     * @return The nickname.
     */
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nickname = 2;</code>
     * @return The bytes for nickname.
     */
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nickname = 2;</code>
     * @param value The nickname to set.
     * @return This builder for chaining.
     */
    public Builder setNickname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nickname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nickname = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNickname() {
      
      nickname_ = getDefaultInstance().getNickname();
      onChanged();
      return this;
    }
    /**
     * <code>string nickname = 2;</code>
     * @param value The bytes for nickname to set.
     * @return This builder for chaining.
     */
    public Builder setNicknameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nickname_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NicknamePokemonTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NicknamePokemonTelemetry)
  private static final POGOProtos.Rpc.NicknamePokemonTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NicknamePokemonTelemetry();
  }

  public static POGOProtos.Rpc.NicknamePokemonTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NicknamePokemonTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<NicknamePokemonTelemetry>() {
    @java.lang.Override
    public NicknamePokemonTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NicknamePokemonTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NicknamePokemonTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NicknamePokemonTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NicknamePokemonTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

