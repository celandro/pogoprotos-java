// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ClientGenderSettingsProto}
 */
public  final class ClientGenderSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClientGenderSettingsProto)
    ClientGenderSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientGenderSettingsProto.newBuilder() to construct.
  private ClientGenderSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientGenderSettingsProto() {
    pokemon_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientGenderSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientGenderSettingsProto(
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

            pokemon_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.ClientGenderProto.Builder subBuilder = null;
            if (gender_ != null) {
              subBuilder = gender_.toBuilder();
            }
            gender_ = input.readMessage(POGOProtos.Rpc.ClientGenderProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gender_);
              gender_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClientGenderSettingsProto.class, POGOProtos.Rpc.ClientGenderSettingsProto.Builder.class);
  }

  public static final int POKEMON_FIELD_NUMBER = 1;
  private int pokemon_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
   * @return The enum numeric value on the wire for pokemon.
   */
  public int getPokemonValue() {
    return pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
   * @return The pokemon.
   */
  public POGOProtos.Rpc.HoloPokemonId getPokemon() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemon_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int GENDER_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.ClientGenderProto gender_;
  /**
   * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
   * @return Whether the gender field is set.
   */
  public boolean hasGender() {
    return gender_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
   * @return The gender.
   */
  public POGOProtos.Rpc.ClientGenderProto getGender() {
    return gender_ == null ? POGOProtos.Rpc.ClientGenderProto.getDefaultInstance() : gender_;
  }
  /**
   * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
   */
  public POGOProtos.Rpc.ClientGenderProtoOrBuilder getGenderOrBuilder() {
    return getGender();
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
    if (pokemon_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(1, pokemon_);
    }
    if (gender_ != null) {
      output.writeMessage(2, getGender());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemon_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, pokemon_);
    }
    if (gender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGender());
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
    if (!(obj instanceof POGOProtos.Rpc.ClientGenderSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClientGenderSettingsProto other = (POGOProtos.Rpc.ClientGenderSettingsProto) obj;

    if (pokemon_ != other.pokemon_) return false;
    if (hasGender() != other.hasGender()) return false;
    if (hasGender()) {
      if (!getGender()
          .equals(other.getGender())) return false;
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
    hash = (37 * hash) + POKEMON_FIELD_NUMBER;
    hash = (53 * hash) + pokemon_;
    if (hasGender()) {
      hash = (37 * hash) + GENDER_FIELD_NUMBER;
      hash = (53 * hash) + getGender().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientGenderSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClientGenderSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ClientGenderSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClientGenderSettingsProto)
      POGOProtos.Rpc.ClientGenderSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClientGenderSettingsProto.class, POGOProtos.Rpc.ClientGenderSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClientGenderSettingsProto.newBuilder()
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
      pokemon_ = 0;

      if (genderBuilder_ == null) {
        gender_ = null;
      } else {
        gender_ = null;
        genderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientGenderSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClientGenderSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientGenderSettingsProto build() {
      POGOProtos.Rpc.ClientGenderSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientGenderSettingsProto buildPartial() {
      POGOProtos.Rpc.ClientGenderSettingsProto result = new POGOProtos.Rpc.ClientGenderSettingsProto(this);
      result.pokemon_ = pokemon_;
      if (genderBuilder_ == null) {
        result.gender_ = gender_;
      } else {
        result.gender_ = genderBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ClientGenderSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.ClientGenderSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClientGenderSettingsProto other) {
      if (other == POGOProtos.Rpc.ClientGenderSettingsProto.getDefaultInstance()) return this;
      if (other.pokemon_ != 0) {
        setPokemonValue(other.getPokemonValue());
      }
      if (other.hasGender()) {
        mergeGender(other.getGender());
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
      POGOProtos.Rpc.ClientGenderSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClientGenderSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pokemon_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @return The enum numeric value on the wire for pokemon.
     */
    public int getPokemonValue() {
      return pokemon_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @param value The enum numeric value on the wire for pokemon to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonValue(int value) {
      pokemon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @return The pokemon.
     */
    public POGOProtos.Rpc.HoloPokemonId getPokemon() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemon_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @param value The pokemon to set.
     * @return This builder for chaining.
     */
    public Builder setPokemon(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemon_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemon() {
      
      pokemon_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.ClientGenderProto gender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ClientGenderProto, POGOProtos.Rpc.ClientGenderProto.Builder, POGOProtos.Rpc.ClientGenderProtoOrBuilder> genderBuilder_;
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     * @return Whether the gender field is set.
     */
    public boolean hasGender() {
      return genderBuilder_ != null || gender_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     * @return The gender.
     */
    public POGOProtos.Rpc.ClientGenderProto getGender() {
      if (genderBuilder_ == null) {
        return gender_ == null ? POGOProtos.Rpc.ClientGenderProto.getDefaultInstance() : gender_;
      } else {
        return genderBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    public Builder setGender(POGOProtos.Rpc.ClientGenderProto value) {
      if (genderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gender_ = value;
        onChanged();
      } else {
        genderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    public Builder setGender(
        POGOProtos.Rpc.ClientGenderProto.Builder builderForValue) {
      if (genderBuilder_ == null) {
        gender_ = builderForValue.build();
        onChanged();
      } else {
        genderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    public Builder mergeGender(POGOProtos.Rpc.ClientGenderProto value) {
      if (genderBuilder_ == null) {
        if (gender_ != null) {
          gender_ =
            POGOProtos.Rpc.ClientGenderProto.newBuilder(gender_).mergeFrom(value).buildPartial();
        } else {
          gender_ = value;
        }
        onChanged();
      } else {
        genderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    public Builder clearGender() {
      if (genderBuilder_ == null) {
        gender_ = null;
        onChanged();
      } else {
        gender_ = null;
        genderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    public POGOProtos.Rpc.ClientGenderProto.Builder getGenderBuilder() {
      
      onChanged();
      return getGenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    public POGOProtos.Rpc.ClientGenderProtoOrBuilder getGenderOrBuilder() {
      if (genderBuilder_ != null) {
        return genderBuilder_.getMessageOrBuilder();
      } else {
        return gender_ == null ?
            POGOProtos.Rpc.ClientGenderProto.getDefaultInstance() : gender_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.ClientGenderProto gender = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.ClientGenderProto, POGOProtos.Rpc.ClientGenderProto.Builder, POGOProtos.Rpc.ClientGenderProtoOrBuilder> 
        getGenderFieldBuilder() {
      if (genderBuilder_ == null) {
        genderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.ClientGenderProto, POGOProtos.Rpc.ClientGenderProto.Builder, POGOProtos.Rpc.ClientGenderProtoOrBuilder>(
                getGender(),
                getParentForChildren(),
                isClean());
        gender_ = null;
      }
      return genderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClientGenderSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClientGenderSettingsProto)
  private static final POGOProtos.Rpc.ClientGenderSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClientGenderSettingsProto();
  }

  public static POGOProtos.Rpc.ClientGenderSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientGenderSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<ClientGenderSettingsProto>() {
    @java.lang.Override
    public ClientGenderSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientGenderSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientGenderSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientGenderSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClientGenderSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
