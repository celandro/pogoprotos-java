// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JKNDAPKEEIE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NpcPokemonProto}
 */
public final class NpcPokemonProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NpcPokemonProto)
    NpcPokemonProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NpcPokemonProto.newBuilder() to construct.
  private NpcPokemonProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NpcPokemonProto() {
    pokemonType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NpcPokemonProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NpcPokemonProto(
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

            pokemonType_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NpcPokemonProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NpcPokemonProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NpcPokemonProto.class, POGOProtos.Rpc.NpcPokemonProto.Builder.class);
  }

  public static final int POKEMON_TYPE_FIELD_NUMBER = 1;
  private int pokemonType_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
   * @return The enum numeric value on the wire for pokemonType.
   */
  @java.lang.Override public int getPokemonTypeValue() {
    return pokemonType_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
   * @return The pokemonType.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokemonType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonType_);
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
    if (pokemonType_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, pokemonType_);
    }
    if (pokemonDisplay_ != null) {
      output.writeMessage(2, getPokemonDisplay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonType_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemonType_);
    }
    if (pokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPokemonDisplay());
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
    if (!(obj instanceof POGOProtos.Rpc.NpcPokemonProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NpcPokemonProto other = (POGOProtos.Rpc.NpcPokemonProto) obj;

    if (pokemonType_ != other.pokemonType_) return false;
    if (hasPokemonDisplay() != other.hasPokemonDisplay()) return false;
    if (hasPokemonDisplay()) {
      if (!getPokemonDisplay()
          .equals(other.getPokemonDisplay())) return false;
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
    hash = (37 * hash) + POKEMON_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + pokemonType_;
    if (hasPokemonDisplay()) {
      hash = (37 * hash) + POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonDisplay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NpcPokemonProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NpcPokemonProto prototype) {
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
   * ref: JKNDAPKEEIE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NpcPokemonProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NpcPokemonProto)
      POGOProtos.Rpc.NpcPokemonProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NpcPokemonProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NpcPokemonProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NpcPokemonProto.class, POGOProtos.Rpc.NpcPokemonProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NpcPokemonProto.newBuilder()
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
      pokemonType_ = 0;

      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NpcPokemonProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NpcPokemonProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.NpcPokemonProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NpcPokemonProto build() {
      POGOProtos.Rpc.NpcPokemonProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NpcPokemonProto buildPartial() {
      POGOProtos.Rpc.NpcPokemonProto result = new POGOProtos.Rpc.NpcPokemonProto(this);
      result.pokemonType_ = pokemonType_;
      if (pokemonDisplayBuilder_ == null) {
        result.pokemonDisplay_ = pokemonDisplay_;
      } else {
        result.pokemonDisplay_ = pokemonDisplayBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NpcPokemonProto) {
        return mergeFrom((POGOProtos.Rpc.NpcPokemonProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NpcPokemonProto other) {
      if (other == POGOProtos.Rpc.NpcPokemonProto.getDefaultInstance()) return this;
      if (other.pokemonType_ != 0) {
        setPokemonTypeValue(other.getPokemonTypeValue());
      }
      if (other.hasPokemonDisplay()) {
        mergePokemonDisplay(other.getPokemonDisplay());
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
      POGOProtos.Rpc.NpcPokemonProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NpcPokemonProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokemonType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
     * @return The enum numeric value on the wire for pokemonType.
     */
    @java.lang.Override public int getPokemonTypeValue() {
      return pokemonType_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
     * @param value The enum numeric value on the wire for pokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonTypeValue(int value) {
      
      pokemonType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
     * @return The pokemonType.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemonType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonType_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
     * @param value The pokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonType(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonType() {
      
      pokemonType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NpcPokemonProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NpcPokemonProto)
  private static final POGOProtos.Rpc.NpcPokemonProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NpcPokemonProto();
  }

  public static POGOProtos.Rpc.NpcPokemonProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NpcPokemonProto>
      PARSER = new com.google.protobuf.AbstractParser<NpcPokemonProto>() {
    @java.lang.Override
    public NpcPokemonProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NpcPokemonProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NpcPokemonProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NpcPokemonProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NpcPokemonProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

