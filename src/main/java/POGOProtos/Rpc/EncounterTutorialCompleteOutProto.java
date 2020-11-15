// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EncounterTutorialCompleteOutProto}
 */
public final class EncounterTutorialCompleteOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EncounterTutorialCompleteOutProto)
    EncounterTutorialCompleteOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncounterTutorialCompleteOutProto.newBuilder() to construct.
  private EncounterTutorialCompleteOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncounterTutorialCompleteOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncounterTutorialCompleteOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncounterTutorialCompleteOutProto(
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
          case 18: {
            POGOProtos.Rpc.PokemonProto.Builder subBuilder = null;
            if (pokemon_ != null) {
              subBuilder = pokemon_.toBuilder();
            }
            pokemon_ = input.readMessage(POGOProtos.Rpc.PokemonProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemon_);
              pokemon_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.CaptureScoreProto.Builder subBuilder = null;
            if (scores_ != null) {
              subBuilder = scores_.toBuilder();
            }
            scores_ = input.readMessage(POGOProtos.Rpc.CaptureScoreProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(scores_);
              scores_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterTutorialCompleteOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterTutorialCompleteOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EncounterTutorialCompleteOutProto.class, POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result}
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
     * <code>ERROR_INVALID_POKEMON = 2;</code>
     */
    ERROR_INVALID_POKEMON(2),
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
     * <code>ERROR_INVALID_POKEMON = 2;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 2;


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
        case 2: return ERROR_INVALID_POKEMON;
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
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.EncounterTutorialCompleteOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int POKEMON_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PokemonProto pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  @java.lang.Override
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return The pokemon.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonProto getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int SCORES_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.CaptureScoreProto scores_;
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
   * @return Whether the scores field is set.
   */
  @java.lang.Override
  public boolean hasScores() {
    return scores_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
   * @return The scores.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CaptureScoreProto getScores() {
    return scores_ == null ? POGOProtos.Rpc.CaptureScoreProto.getDefaultInstance() : scores_;
  }
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CaptureScoreProtoOrBuilder getScoresOrBuilder() {
    return getScores();
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
    if (result_ != POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (pokemon_ != null) {
      output.writeMessage(2, getPokemon());
    }
    if (scores_ != null) {
      output.writeMessage(3, getScores());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (pokemon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPokemon());
    }
    if (scores_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getScores());
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
    if (!(obj instanceof POGOProtos.Rpc.EncounterTutorialCompleteOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EncounterTutorialCompleteOutProto other = (POGOProtos.Rpc.EncounterTutorialCompleteOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (hasScores() != other.hasScores()) return false;
    if (hasScores()) {
      if (!getScores()
          .equals(other.getScores())) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasPokemon()) {
      hash = (37 * hash) + POKEMON_FIELD_NUMBER;
      hash = (53 * hash) + getPokemon().hashCode();
    }
    if (hasScores()) {
      hash = (37 * hash) + SCORES_FIELD_NUMBER;
      hash = (53 * hash) + getScores().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EncounterTutorialCompleteOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EncounterTutorialCompleteOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EncounterTutorialCompleteOutProto)
      POGOProtos.Rpc.EncounterTutorialCompleteOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterTutorialCompleteOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterTutorialCompleteOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EncounterTutorialCompleteOutProto.class, POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EncounterTutorialCompleteOutProto.newBuilder()
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

      if (pokemonBuilder_ == null) {
        pokemon_ = null;
      } else {
        pokemon_ = null;
        pokemonBuilder_ = null;
      }
      if (scoresBuilder_ == null) {
        scores_ = null;
      } else {
        scores_ = null;
        scoresBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterTutorialCompleteOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterTutorialCompleteOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.EncounterTutorialCompleteOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterTutorialCompleteOutProto build() {
      POGOProtos.Rpc.EncounterTutorialCompleteOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterTutorialCompleteOutProto buildPartial() {
      POGOProtos.Rpc.EncounterTutorialCompleteOutProto result = new POGOProtos.Rpc.EncounterTutorialCompleteOutProto(this);
      result.result_ = result_;
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      if (scoresBuilder_ == null) {
        result.scores_ = scores_;
      } else {
        result.scores_ = scoresBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.EncounterTutorialCompleteOutProto) {
        return mergeFrom((POGOProtos.Rpc.EncounterTutorialCompleteOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EncounterTutorialCompleteOutProto other) {
      if (other == POGOProtos.Rpc.EncounterTutorialCompleteOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (other.hasScores()) {
        mergeScores(other.getScores());
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
      POGOProtos.Rpc.EncounterTutorialCompleteOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EncounterTutorialCompleteOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonProto pokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder> pokemonBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     * @return Whether the pokemon field is set.
     */
    public boolean hasPokemon() {
      return pokemonBuilder_ != null || pokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     * @return The pokemon.
     */
    public POGOProtos.Rpc.PokemonProto getPokemon() {
      if (pokemonBuilder_ == null) {
        return pokemon_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
      } else {
        return pokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     */
    public Builder setPokemon(POGOProtos.Rpc.PokemonProto value) {
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
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     */
    public Builder setPokemon(
        POGOProtos.Rpc.PokemonProto.Builder builderForValue) {
      if (pokemonBuilder_ == null) {
        pokemon_ = builderForValue.build();
        onChanged();
      } else {
        pokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     */
    public Builder mergePokemon(POGOProtos.Rpc.PokemonProto value) {
      if (pokemonBuilder_ == null) {
        if (pokemon_ != null) {
          pokemon_ =
            POGOProtos.Rpc.PokemonProto.newBuilder(pokemon_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
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
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     */
    public POGOProtos.Rpc.PokemonProto.Builder getPokemonBuilder() {
      
      onChanged();
      return getPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     */
    public POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder() {
      if (pokemonBuilder_ != null) {
        return pokemonBuilder_.getMessageOrBuilder();
      } else {
        return pokemon_ == null ?
            POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder> 
        getPokemonFieldBuilder() {
      if (pokemonBuilder_ == null) {
        pokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder>(
                getPokemon(),
                getParentForChildren(),
                isClean());
        pokemon_ = null;
      }
      return pokemonBuilder_;
    }

    private POGOProtos.Rpc.CaptureScoreProto scores_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CaptureScoreProto, POGOProtos.Rpc.CaptureScoreProto.Builder, POGOProtos.Rpc.CaptureScoreProtoOrBuilder> scoresBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     * @return Whether the scores field is set.
     */
    public boolean hasScores() {
      return scoresBuilder_ != null || scores_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     * @return The scores.
     */
    public POGOProtos.Rpc.CaptureScoreProto getScores() {
      if (scoresBuilder_ == null) {
        return scores_ == null ? POGOProtos.Rpc.CaptureScoreProto.getDefaultInstance() : scores_;
      } else {
        return scoresBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    public Builder setScores(POGOProtos.Rpc.CaptureScoreProto value) {
      if (scoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scores_ = value;
        onChanged();
      } else {
        scoresBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    public Builder setScores(
        POGOProtos.Rpc.CaptureScoreProto.Builder builderForValue) {
      if (scoresBuilder_ == null) {
        scores_ = builderForValue.build();
        onChanged();
      } else {
        scoresBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    public Builder mergeScores(POGOProtos.Rpc.CaptureScoreProto value) {
      if (scoresBuilder_ == null) {
        if (scores_ != null) {
          scores_ =
            POGOProtos.Rpc.CaptureScoreProto.newBuilder(scores_).mergeFrom(value).buildPartial();
        } else {
          scores_ = value;
        }
        onChanged();
      } else {
        scoresBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    public Builder clearScores() {
      if (scoresBuilder_ == null) {
        scores_ = null;
        onChanged();
      } else {
        scores_ = null;
        scoresBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    public POGOProtos.Rpc.CaptureScoreProto.Builder getScoresBuilder() {
      
      onChanged();
      return getScoresFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    public POGOProtos.Rpc.CaptureScoreProtoOrBuilder getScoresOrBuilder() {
      if (scoresBuilder_ != null) {
        return scoresBuilder_.getMessageOrBuilder();
      } else {
        return scores_ == null ?
            POGOProtos.Rpc.CaptureScoreProto.getDefaultInstance() : scores_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CaptureScoreProto, POGOProtos.Rpc.CaptureScoreProto.Builder, POGOProtos.Rpc.CaptureScoreProtoOrBuilder> 
        getScoresFieldBuilder() {
      if (scoresBuilder_ == null) {
        scoresBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CaptureScoreProto, POGOProtos.Rpc.CaptureScoreProto.Builder, POGOProtos.Rpc.CaptureScoreProtoOrBuilder>(
                getScores(),
                getParentForChildren(),
                isClean());
        scores_ = null;
      }
      return scoresBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EncounterTutorialCompleteOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EncounterTutorialCompleteOutProto)
  private static final POGOProtos.Rpc.EncounterTutorialCompleteOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EncounterTutorialCompleteOutProto();
  }

  public static POGOProtos.Rpc.EncounterTutorialCompleteOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncounterTutorialCompleteOutProto>
      PARSER = new com.google.protobuf.AbstractParser<EncounterTutorialCompleteOutProto>() {
    @java.lang.Override
    public EncounterTutorialCompleteOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncounterTutorialCompleteOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncounterTutorialCompleteOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncounterTutorialCompleteOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EncounterTutorialCompleteOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

