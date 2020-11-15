// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/ReleasePokemonTelemetry.proto

package POGOProtos.Data.Telemetry;

/**
 * Protobuf type {@code POGOProtos.Data.Telemetry.ReleasePokemonTelemetry}
 */
public final class ReleasePokemonTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Telemetry.ReleasePokemonTelemetry)
    ReleasePokemonTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReleasePokemonTelemetry.newBuilder() to construct.
  private ReleasePokemonTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReleasePokemonTelemetry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReleasePokemonTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReleasePokemonTelemetry(
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
            POGOProtos.Data.Telemetry.PokemonTelemetry.Builder subBuilder = null;
            if (pokemon_ != null) {
              subBuilder = pokemon_.toBuilder();
            }
            pokemon_ = input.readMessage(POGOProtos.Data.Telemetry.PokemonTelemetry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemon_);
              pokemon_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Data.Telemetry.ReleasePokemonTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_ReleasePokemonTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Telemetry.ReleasePokemonTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_ReleasePokemonTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.class, POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private POGOProtos.Data.Telemetry.PokemonTelemetry pokemon_;
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   * @return Whether the pokemon field is set.
   */
  @java.lang.Override
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   * @return The pokemon.
   */
  @java.lang.Override
  public POGOProtos.Data.Telemetry.PokemonTelemetry getPokemon() {
    return pokemon_ == null ? POGOProtos.Data.Telemetry.PokemonTelemetry.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
    return getPokemon();
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof POGOProtos.Data.Telemetry.ReleasePokemonTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Telemetry.ReleasePokemonTelemetry other = (POGOProtos.Data.Telemetry.ReleasePokemonTelemetry) obj;

    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Telemetry.ReleasePokemonTelemetry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Telemetry.ReleasePokemonTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Telemetry.ReleasePokemonTelemetry)
      POGOProtos.Data.Telemetry.ReleasePokemonTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Telemetry.ReleasePokemonTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_ReleasePokemonTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Telemetry.ReleasePokemonTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_ReleasePokemonTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.class, POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Telemetry.ReleasePokemonTelemetryOuterClass.internal_static_POGOProtos_Data_Telemetry_ReleasePokemonTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.ReleasePokemonTelemetry getDefaultInstanceForType() {
      return POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.ReleasePokemonTelemetry build() {
      POGOProtos.Data.Telemetry.ReleasePokemonTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Telemetry.ReleasePokemonTelemetry buildPartial() {
      POGOProtos.Data.Telemetry.ReleasePokemonTelemetry result = new POGOProtos.Data.Telemetry.ReleasePokemonTelemetry(this);
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
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
      if (other instanceof POGOProtos.Data.Telemetry.ReleasePokemonTelemetry) {
        return mergeFrom((POGOProtos.Data.Telemetry.ReleasePokemonTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Telemetry.ReleasePokemonTelemetry other) {
      if (other == POGOProtos.Data.Telemetry.ReleasePokemonTelemetry.getDefaultInstance()) return this;
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
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
      POGOProtos.Data.Telemetry.ReleasePokemonTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Telemetry.ReleasePokemonTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Data.Telemetry.PokemonTelemetry pokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Telemetry.PokemonTelemetry, POGOProtos.Data.Telemetry.PokemonTelemetry.Builder, POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder> pokemonBuilder_;
    /**
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     * @return Whether the pokemon field is set.
     */
    public boolean hasPokemon() {
      return pokemonBuilder_ != null || pokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     * @return The pokemon.
     */
    public POGOProtos.Data.Telemetry.PokemonTelemetry getPokemon() {
      if (pokemonBuilder_ == null) {
        return pokemon_ == null ? POGOProtos.Data.Telemetry.PokemonTelemetry.getDefaultInstance() : pokemon_;
      } else {
        return pokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder setPokemon(POGOProtos.Data.Telemetry.PokemonTelemetry value) {
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
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder setPokemon(
        POGOProtos.Data.Telemetry.PokemonTelemetry.Builder builderForValue) {
      if (pokemonBuilder_ == null) {
        pokemon_ = builderForValue.build();
        onChanged();
      } else {
        pokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     */
    public Builder mergePokemon(POGOProtos.Data.Telemetry.PokemonTelemetry value) {
      if (pokemonBuilder_ == null) {
        if (pokemon_ != null) {
          pokemon_ =
            POGOProtos.Data.Telemetry.PokemonTelemetry.newBuilder(pokemon_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
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
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     */
    public POGOProtos.Data.Telemetry.PokemonTelemetry.Builder getPokemonBuilder() {
      
      onChanged();
      return getPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     */
    public POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder getPokemonOrBuilder() {
      if (pokemonBuilder_ != null) {
        return pokemonBuilder_.getMessageOrBuilder();
      } else {
        return pokemon_ == null ?
            POGOProtos.Data.Telemetry.PokemonTelemetry.getDefaultInstance() : pokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Telemetry.PokemonTelemetry pokemon = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Telemetry.PokemonTelemetry, POGOProtos.Data.Telemetry.PokemonTelemetry.Builder, POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder> 
        getPokemonFieldBuilder() {
      if (pokemonBuilder_ == null) {
        pokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Telemetry.PokemonTelemetry, POGOProtos.Data.Telemetry.PokemonTelemetry.Builder, POGOProtos.Data.Telemetry.PokemonTelemetryOrBuilder>(
                getPokemon(),
                getParentForChildren(),
                isClean());
        pokemon_ = null;
      }
      return pokemonBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Telemetry.ReleasePokemonTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Telemetry.ReleasePokemonTelemetry)
  private static final POGOProtos.Data.Telemetry.ReleasePokemonTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Telemetry.ReleasePokemonTelemetry();
  }

  public static POGOProtos.Data.Telemetry.ReleasePokemonTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReleasePokemonTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<ReleasePokemonTelemetry>() {
    @java.lang.Override
    public ReleasePokemonTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReleasePokemonTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReleasePokemonTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReleasePokemonTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Telemetry.ReleasePokemonTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

