// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/MegaEvolvePokemonResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.MegaEvolvePokemonResponse}
 */
public final class MegaEvolvePokemonResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.MegaEvolvePokemonResponse)
    MegaEvolvePokemonResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MegaEvolvePokemonResponse.newBuilder() to construct.
  private MegaEvolvePokemonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MegaEvolvePokemonResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MegaEvolvePokemonResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MegaEvolvePokemonResponse(
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
            POGOProtos.Data.PokemonData.Builder subBuilder = null;
            if (evolvedPokemon_ != null) {
              subBuilder = evolvedPokemon_.toBuilder();
            }
            evolvedPokemon_ = input.readMessage(POGOProtos.Data.PokemonData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(evolvedPokemon_);
              evolvedPokemon_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            expAwarded_ = input.readInt32();
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
    return POGOProtos.Networking.Responses.MegaEvolvePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.MegaEvolvePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.class, POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result}
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
     * <code>FAILED_POKEMON_MISSING = 2;</code>
     */
    FAILED_POKEMON_MISSING(2),
    /**
     * <code>FAILED_INSUFFICIENT_RESOURCES = 3;</code>
     */
    FAILED_INSUFFICIENT_RESOURCES(3),
    /**
     * <code>FAILED_POKEMON_CANNOT_EVOLVE = 4;</code>
     */
    FAILED_POKEMON_CANNOT_EVOLVE(4),
    /**
     * <code>FAILED_POKEMON_IS_DEPLOYED = 5;</code>
     */
    FAILED_POKEMON_IS_DEPLOYED(5),
    /**
     * <code>FAILED_INVALID_ITEM_REQUIREMENT = 6;</code>
     */
    FAILED_INVALID_ITEM_REQUIREMENT(6),
    /**
     * <code>FAILED_POKEMON_ALREADY_MEGA_EVOLVED = 7;</code>
     */
    FAILED_POKEMON_ALREADY_MEGA_EVOLVED(7),
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
     * <code>FAILED_POKEMON_MISSING = 2;</code>
     */
    public static final int FAILED_POKEMON_MISSING_VALUE = 2;
    /**
     * <code>FAILED_INSUFFICIENT_RESOURCES = 3;</code>
     */
    public static final int FAILED_INSUFFICIENT_RESOURCES_VALUE = 3;
    /**
     * <code>FAILED_POKEMON_CANNOT_EVOLVE = 4;</code>
     */
    public static final int FAILED_POKEMON_CANNOT_EVOLVE_VALUE = 4;
    /**
     * <code>FAILED_POKEMON_IS_DEPLOYED = 5;</code>
     */
    public static final int FAILED_POKEMON_IS_DEPLOYED_VALUE = 5;
    /**
     * <code>FAILED_INVALID_ITEM_REQUIREMENT = 6;</code>
     */
    public static final int FAILED_INVALID_ITEM_REQUIREMENT_VALUE = 6;
    /**
     * <code>FAILED_POKEMON_ALREADY_MEGA_EVOLVED = 7;</code>
     */
    public static final int FAILED_POKEMON_ALREADY_MEGA_EVOLVED_VALUE = 7;


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
        case 2: return FAILED_POKEMON_MISSING;
        case 3: return FAILED_INSUFFICIENT_RESOURCES;
        case 4: return FAILED_POKEMON_CANNOT_EVOLVE;
        case 5: return FAILED_POKEMON_IS_DEPLOYED;
        case 6: return FAILED_INVALID_ITEM_REQUIREMENT;
        case 7: return FAILED_POKEMON_ALREADY_MEGA_EVOLVED;
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
      return POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result.UNRECOGNIZED : result;
  }

  public static final int EVOLVED_POKEMON_FIELD_NUMBER = 2;
  private POGOProtos.Data.PokemonData evolvedPokemon_;
  /**
   * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
   * @return Whether the evolvedPokemon field is set.
   */
  @java.lang.Override
  public boolean hasEvolvedPokemon() {
    return evolvedPokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
   * @return The evolvedPokemon.
   */
  @java.lang.Override
  public POGOProtos.Data.PokemonData getEvolvedPokemon() {
    return evolvedPokemon_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : evolvedPokemon_;
  }
  /**
   * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.PokemonDataOrBuilder getEvolvedPokemonOrBuilder() {
    return getEvolvedPokemon();
  }

  public static final int EXP_AWARDED_FIELD_NUMBER = 3;
  private int expAwarded_;
  /**
   * <code>int32 exp_awarded = 3;</code>
   * @return The expAwarded.
   */
  @java.lang.Override
  public int getExpAwarded() {
    return expAwarded_;
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
    if (result_ != POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (evolvedPokemon_ != null) {
      output.writeMessage(2, getEvolvedPokemon());
    }
    if (expAwarded_ != 0) {
      output.writeInt32(3, expAwarded_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (evolvedPokemon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEvolvedPokemon());
    }
    if (expAwarded_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, expAwarded_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.MegaEvolvePokemonResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.MegaEvolvePokemonResponse other = (POGOProtos.Networking.Responses.MegaEvolvePokemonResponse) obj;

    if (result_ != other.result_) return false;
    if (hasEvolvedPokemon() != other.hasEvolvedPokemon()) return false;
    if (hasEvolvedPokemon()) {
      if (!getEvolvedPokemon()
          .equals(other.getEvolvedPokemon())) return false;
    }
    if (getExpAwarded()
        != other.getExpAwarded()) return false;
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
    if (hasEvolvedPokemon()) {
      hash = (37 * hash) + EVOLVED_POKEMON_FIELD_NUMBER;
      hash = (53 * hash) + getEvolvedPokemon().hashCode();
    }
    hash = (37 * hash) + EXP_AWARDED_FIELD_NUMBER;
    hash = (53 * hash) + getExpAwarded();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.MegaEvolvePokemonResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.MegaEvolvePokemonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.MegaEvolvePokemonResponse)
      POGOProtos.Networking.Responses.MegaEvolvePokemonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.MegaEvolvePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.MegaEvolvePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.class, POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.newBuilder()
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

      if (evolvedPokemonBuilder_ == null) {
        evolvedPokemon_ = null;
      } else {
        evolvedPokemon_ = null;
        evolvedPokemonBuilder_ = null;
      }
      expAwarded_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.MegaEvolvePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_MegaEvolvePokemonResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.MegaEvolvePokemonResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.MegaEvolvePokemonResponse build() {
      POGOProtos.Networking.Responses.MegaEvolvePokemonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.MegaEvolvePokemonResponse buildPartial() {
      POGOProtos.Networking.Responses.MegaEvolvePokemonResponse result = new POGOProtos.Networking.Responses.MegaEvolvePokemonResponse(this);
      result.result_ = result_;
      if (evolvedPokemonBuilder_ == null) {
        result.evolvedPokemon_ = evolvedPokemon_;
      } else {
        result.evolvedPokemon_ = evolvedPokemonBuilder_.build();
      }
      result.expAwarded_ = expAwarded_;
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
      if (other instanceof POGOProtos.Networking.Responses.MegaEvolvePokemonResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.MegaEvolvePokemonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.MegaEvolvePokemonResponse other) {
      if (other == POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasEvolvedPokemon()) {
        mergeEvolvedPokemon(other.getEvolvedPokemon());
      }
      if (other.getExpAwarded() != 0) {
        setExpAwarded(other.getExpAwarded());
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
      POGOProtos.Networking.Responses.MegaEvolvePokemonResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.MegaEvolvePokemonResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.MegaEvolvePokemonResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.PokemonData evolvedPokemon_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> evolvedPokemonBuilder_;
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     * @return Whether the evolvedPokemon field is set.
     */
    public boolean hasEvolvedPokemon() {
      return evolvedPokemonBuilder_ != null || evolvedPokemon_ != null;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     * @return The evolvedPokemon.
     */
    public POGOProtos.Data.PokemonData getEvolvedPokemon() {
      if (evolvedPokemonBuilder_ == null) {
        return evolvedPokemon_ == null ? POGOProtos.Data.PokemonData.getDefaultInstance() : evolvedPokemon_;
      } else {
        return evolvedPokemonBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    public Builder setEvolvedPokemon(POGOProtos.Data.PokemonData value) {
      if (evolvedPokemonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evolvedPokemon_ = value;
        onChanged();
      } else {
        evolvedPokemonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    public Builder setEvolvedPokemon(
        POGOProtos.Data.PokemonData.Builder builderForValue) {
      if (evolvedPokemonBuilder_ == null) {
        evolvedPokemon_ = builderForValue.build();
        onChanged();
      } else {
        evolvedPokemonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    public Builder mergeEvolvedPokemon(POGOProtos.Data.PokemonData value) {
      if (evolvedPokemonBuilder_ == null) {
        if (evolvedPokemon_ != null) {
          evolvedPokemon_ =
            POGOProtos.Data.PokemonData.newBuilder(evolvedPokemon_).mergeFrom(value).buildPartial();
        } else {
          evolvedPokemon_ = value;
        }
        onChanged();
      } else {
        evolvedPokemonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    public Builder clearEvolvedPokemon() {
      if (evolvedPokemonBuilder_ == null) {
        evolvedPokemon_ = null;
        onChanged();
      } else {
        evolvedPokemon_ = null;
        evolvedPokemonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    public POGOProtos.Data.PokemonData.Builder getEvolvedPokemonBuilder() {
      
      onChanged();
      return getEvolvedPokemonFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    public POGOProtos.Data.PokemonDataOrBuilder getEvolvedPokemonOrBuilder() {
      if (evolvedPokemonBuilder_ != null) {
        return evolvedPokemonBuilder_.getMessageOrBuilder();
      } else {
        return evolvedPokemon_ == null ?
            POGOProtos.Data.PokemonData.getDefaultInstance() : evolvedPokemon_;
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonData evolved_pokemon = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder> 
        getEvolvedPokemonFieldBuilder() {
      if (evolvedPokemonBuilder_ == null) {
        evolvedPokemonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.PokemonData, POGOProtos.Data.PokemonData.Builder, POGOProtos.Data.PokemonDataOrBuilder>(
                getEvolvedPokemon(),
                getParentForChildren(),
                isClean());
        evolvedPokemon_ = null;
      }
      return evolvedPokemonBuilder_;
    }

    private int expAwarded_ ;
    /**
     * <code>int32 exp_awarded = 3;</code>
     * @return The expAwarded.
     */
    @java.lang.Override
    public int getExpAwarded() {
      return expAwarded_;
    }
    /**
     * <code>int32 exp_awarded = 3;</code>
     * @param value The expAwarded to set.
     * @return This builder for chaining.
     */
    public Builder setExpAwarded(int value) {
      
      expAwarded_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 exp_awarded = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpAwarded() {
      
      expAwarded_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.MegaEvolvePokemonResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.MegaEvolvePokemonResponse)
  private static final POGOProtos.Networking.Responses.MegaEvolvePokemonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.MegaEvolvePokemonResponse();
  }

  public static POGOProtos.Networking.Responses.MegaEvolvePokemonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MegaEvolvePokemonResponse>
      PARSER = new com.google.protobuf.AbstractParser<MegaEvolvePokemonResponse>() {
    @java.lang.Override
    public MegaEvolvePokemonResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MegaEvolvePokemonResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MegaEvolvePokemonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MegaEvolvePokemonResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.MegaEvolvePokemonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

