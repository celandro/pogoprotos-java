// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.UseItemRareCandyOutProto}
 */
public  final class UseItemRareCandyOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UseItemRareCandyOutProto)
    UseItemRareCandyOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseItemRareCandyOutProto.newBuilder() to construct.
  private UseItemRareCandyOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseItemRareCandyOutProto() {
    result_ = 0;
    pokemonId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseItemRareCandyOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseItemRareCandyOutProto(
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

            result_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            pokemonId_ = rawValue;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UseItemRareCandyOutProto.class, POGOProtos.Rpc.UseItemRareCandyOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.UseItemRareCandyOutProto.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>INVALID_POKEMON_ID = 2;</code>
     */
    INVALID_POKEMON_ID(2),
    /**
     * <code>NO_PLAYER = 3;</code>
     */
    NO_PLAYER(3),
    /**
     * <code>WRONG_ITEM_TYPE = 4;</code>
     */
    WRONG_ITEM_TYPE(4),
    /**
     * <code>ITEM_NOT_IN_INVENTORY = 5;</code>
     */
    ITEM_NOT_IN_INVENTORY(5),
    /**
     * <code>NOT_ENOUGH_ITEMS = 6;</code>
     */
    NOT_ENOUGH_ITEMS(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>INVALID_POKEMON_ID = 2;</code>
     */
    public static final int INVALID_POKEMON_ID_VALUE = 2;
    /**
     * <code>NO_PLAYER = 3;</code>
     */
    public static final int NO_PLAYER_VALUE = 3;
    /**
     * <code>WRONG_ITEM_TYPE = 4;</code>
     */
    public static final int WRONG_ITEM_TYPE_VALUE = 4;
    /**
     * <code>ITEM_NOT_IN_INVENTORY = 5;</code>
     */
    public static final int ITEM_NOT_IN_INVENTORY_VALUE = 5;
    /**
     * <code>NOT_ENOUGH_ITEMS = 6;</code>
     */
    public static final int NOT_ENOUGH_ITEMS_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return INVALID_POKEMON_ID;
        case 3: return NO_PLAYER;
        case 4: return WRONG_ITEM_TYPE;
        case 5: return ITEM_NOT_IN_INVENTORY;
        case 6: return NOT_ENOUGH_ITEMS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.UseItemRareCandyOutProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.UseItemRareCandyOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Rpc.UseItemRareCandyOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = POGOProtos.Rpc.UseItemRareCandyOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.UseItemRareCandyOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 2;
  private int pokemonId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  public int getPokemonIdValue() {
    return pokemonId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
   * @return The pokemonId.
   */
  public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
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
    if (result_ != POGOProtos.Rpc.UseItemRareCandyOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(2, pokemonId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.UseItemRareCandyOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pokemonId_);
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
    if (!(obj instanceof POGOProtos.Rpc.UseItemRareCandyOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UseItemRareCandyOutProto other = (POGOProtos.Rpc.UseItemRareCandyOutProto) obj;

    if (result_ != other.result_) return false;
    if (pokemonId_ != other.pokemonId_) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokemonId_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UseItemRareCandyOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UseItemRareCandyOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.UseItemRareCandyOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UseItemRareCandyOutProto)
      POGOProtos.Rpc.UseItemRareCandyOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UseItemRareCandyOutProto.class, POGOProtos.Rpc.UseItemRareCandyOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UseItemRareCandyOutProto.newBuilder()
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
      result_ = 0;

      pokemonId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_UseItemRareCandyOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemRareCandyOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UseItemRareCandyOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemRareCandyOutProto build() {
      POGOProtos.Rpc.UseItemRareCandyOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UseItemRareCandyOutProto buildPartial() {
      POGOProtos.Rpc.UseItemRareCandyOutProto result = new POGOProtos.Rpc.UseItemRareCandyOutProto(this);
      result.result_ = result_;
      result.pokemonId_ = pokemonId_;
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
      if (other instanceof POGOProtos.Rpc.UseItemRareCandyOutProto) {
        return mergeFrom((POGOProtos.Rpc.UseItemRareCandyOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UseItemRareCandyOutProto other) {
      if (other == POGOProtos.Rpc.UseItemRareCandyOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.pokemonId_ != 0) {
        setPokemonIdValue(other.getPokemonIdValue());
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
      POGOProtos.Rpc.UseItemRareCandyOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UseItemRareCandyOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Rpc.UseItemRareCandyOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = POGOProtos.Rpc.UseItemRareCandyOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.UseItemRareCandyOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.UseItemRareCandyOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.UseItemRareCandyOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private int pokemonId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    public int getPokemonIdValue() {
      return pokemonId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @return The pokemonId.
     */
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
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
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UseItemRareCandyOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UseItemRareCandyOutProto)
  private static final POGOProtos.Rpc.UseItemRareCandyOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UseItemRareCandyOutProto();
  }

  public static POGOProtos.Rpc.UseItemRareCandyOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseItemRareCandyOutProto>
      PARSER = new com.google.protobuf.AbstractParser<UseItemRareCandyOutProto>() {
    @java.lang.Override
    public UseItemRareCandyOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseItemRareCandyOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseItemRareCandyOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseItemRareCandyOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UseItemRareCandyOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

