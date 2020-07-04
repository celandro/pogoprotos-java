// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.EncounterPhotobombOutProto}
 */
public  final class EncounterPhotobombOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EncounterPhotobombOutProto)
    EncounterPhotobombOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncounterPhotobombOutProto.newBuilder() to construct.
  private EncounterPhotobombOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncounterPhotobombOutProto() {
    result_ = 0;
    activeItem_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncounterPhotobombOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncounterPhotobombOutProto(
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
            POGOProtos.Rpc.CaptureProbabilityProto.Builder subBuilder = null;
            if (captureProbability_ != null) {
              subBuilder = captureProbability_.toBuilder();
            }
            captureProbability_ = input.readMessage(POGOProtos.Rpc.CaptureProbabilityProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(captureProbability_);
              captureProbability_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            activeItem_ = rawValue;
            break;
          }
          case 40: {

            arplusAttemptsUntilFlee_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterPhotobombOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterPhotobombOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EncounterPhotobombOutProto.class, POGOProtos.Rpc.EncounterPhotobombOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.EncounterPhotobombOutProto.Result}
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
     * <code>NO_ENCOUNTER_AVAILABLE = 2;</code>
     */
    NO_ENCOUNTER_AVAILABLE(2),
    /**
     * <code>POKEMON_INVENTORY_FULL = 3;</code>
     */
    POKEMON_INVENTORY_FULL(3),
    /**
     * <code>ERROR_UNKNOWN = 4;</code>
     */
    ERROR_UNKNOWN(4),
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
     * <code>NO_ENCOUNTER_AVAILABLE = 2;</code>
     */
    public static final int NO_ENCOUNTER_AVAILABLE_VALUE = 2;
    /**
     * <code>POKEMON_INVENTORY_FULL = 3;</code>
     */
    public static final int POKEMON_INVENTORY_FULL_VALUE = 3;
    /**
     * <code>ERROR_UNKNOWN = 4;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 4;


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
        case 2: return NO_ENCOUNTER_AVAILABLE;
        case 3: return POKEMON_INVENTORY_FULL;
        case 4: return ERROR_UNKNOWN;
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
      return POGOProtos.Rpc.EncounterPhotobombOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EncounterPhotobombOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Rpc.EncounterPhotobombOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = POGOProtos.Rpc.EncounterPhotobombOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.EncounterPhotobombOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int POKEMON_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PokemonProto pokemon_;
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  public boolean hasPokemon() {
    return pokemon_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return The pokemon.
   */
  public POGOProtos.Rpc.PokemonProto getPokemon() {
    return pokemon_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : pokemon_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   */
  public POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder() {
    return getPokemon();
  }

  public static final int CAPTURE_PROBABILITY_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.CaptureProbabilityProto captureProbability_;
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
   * @return Whether the captureProbability field is set.
   */
  public boolean hasCaptureProbability() {
    return captureProbability_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
   * @return The captureProbability.
   */
  public POGOProtos.Rpc.CaptureProbabilityProto getCaptureProbability() {
    return captureProbability_ == null ? POGOProtos.Rpc.CaptureProbabilityProto.getDefaultInstance() : captureProbability_;
  }
  /**
   * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
   */
  public POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder getCaptureProbabilityOrBuilder() {
    return getCaptureProbability();
  }

  public static final int ACTIVE_ITEM_FIELD_NUMBER = 4;
  private int activeItem_;
  /**
   * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
   * @return The enum numeric value on the wire for activeItem.
   */
  public int getActiveItemValue() {
    return activeItem_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
   * @return The activeItem.
   */
  public POGOProtos.Rpc.Item getActiveItem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(activeItem_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int ARPLUS_ATTEMPTS_UNTIL_FLEE_FIELD_NUMBER = 5;
  private int arplusAttemptsUntilFlee_;
  /**
   * <code>int32 arplus_attempts_until_flee = 5;</code>
   * @return The arplusAttemptsUntilFlee.
   */
  public int getArplusAttemptsUntilFlee() {
    return arplusAttemptsUntilFlee_;
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
    if (result_ != POGOProtos.Rpc.EncounterPhotobombOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (pokemon_ != null) {
      output.writeMessage(2, getPokemon());
    }
    if (captureProbability_ != null) {
      output.writeMessage(3, getCaptureProbability());
    }
    if (activeItem_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      output.writeEnum(4, activeItem_);
    }
    if (arplusAttemptsUntilFlee_ != 0) {
      output.writeInt32(5, arplusAttemptsUntilFlee_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.EncounterPhotobombOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (pokemon_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPokemon());
    }
    if (captureProbability_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCaptureProbability());
    }
    if (activeItem_ != POGOProtos.Rpc.Item.ITEM_ITEM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, activeItem_);
    }
    if (arplusAttemptsUntilFlee_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, arplusAttemptsUntilFlee_);
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
    if (!(obj instanceof POGOProtos.Rpc.EncounterPhotobombOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EncounterPhotobombOutProto other = (POGOProtos.Rpc.EncounterPhotobombOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasPokemon() != other.hasPokemon()) return false;
    if (hasPokemon()) {
      if (!getPokemon()
          .equals(other.getPokemon())) return false;
    }
    if (hasCaptureProbability() != other.hasCaptureProbability()) return false;
    if (hasCaptureProbability()) {
      if (!getCaptureProbability()
          .equals(other.getCaptureProbability())) return false;
    }
    if (activeItem_ != other.activeItem_) return false;
    if (getArplusAttemptsUntilFlee()
        != other.getArplusAttemptsUntilFlee()) return false;
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
    if (hasCaptureProbability()) {
      hash = (37 * hash) + CAPTURE_PROBABILITY_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureProbability().hashCode();
    }
    hash = (37 * hash) + ACTIVE_ITEM_FIELD_NUMBER;
    hash = (53 * hash) + activeItem_;
    hash = (37 * hash) + ARPLUS_ATTEMPTS_UNTIL_FLEE_FIELD_NUMBER;
    hash = (53 * hash) + getArplusAttemptsUntilFlee();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EncounterPhotobombOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EncounterPhotobombOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.EncounterPhotobombOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EncounterPhotobombOutProto)
      POGOProtos.Rpc.EncounterPhotobombOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterPhotobombOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterPhotobombOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EncounterPhotobombOutProto.class, POGOProtos.Rpc.EncounterPhotobombOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EncounterPhotobombOutProto.newBuilder()
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
      if (captureProbabilityBuilder_ == null) {
        captureProbability_ = null;
      } else {
        captureProbability_ = null;
        captureProbabilityBuilder_ = null;
      }
      activeItem_ = 0;

      arplusAttemptsUntilFlee_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_EncounterPhotobombOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterPhotobombOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.EncounterPhotobombOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterPhotobombOutProto build() {
      POGOProtos.Rpc.EncounterPhotobombOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EncounterPhotobombOutProto buildPartial() {
      POGOProtos.Rpc.EncounterPhotobombOutProto result = new POGOProtos.Rpc.EncounterPhotobombOutProto(this);
      result.result_ = result_;
      if (pokemonBuilder_ == null) {
        result.pokemon_ = pokemon_;
      } else {
        result.pokemon_ = pokemonBuilder_.build();
      }
      if (captureProbabilityBuilder_ == null) {
        result.captureProbability_ = captureProbability_;
      } else {
        result.captureProbability_ = captureProbabilityBuilder_.build();
      }
      result.activeItem_ = activeItem_;
      result.arplusAttemptsUntilFlee_ = arplusAttemptsUntilFlee_;
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
      if (other instanceof POGOProtos.Rpc.EncounterPhotobombOutProto) {
        return mergeFrom((POGOProtos.Rpc.EncounterPhotobombOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EncounterPhotobombOutProto other) {
      if (other == POGOProtos.Rpc.EncounterPhotobombOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasPokemon()) {
        mergePokemon(other.getPokemon());
      }
      if (other.hasCaptureProbability()) {
        mergeCaptureProbability(other.getCaptureProbability());
      }
      if (other.activeItem_ != 0) {
        setActiveItemValue(other.getActiveItemValue());
      }
      if (other.getArplusAttemptsUntilFlee() != 0) {
        setArplusAttemptsUntilFlee(other.getArplusAttemptsUntilFlee());
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
      POGOProtos.Rpc.EncounterPhotobombOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EncounterPhotobombOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Rpc.EncounterPhotobombOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = POGOProtos.Rpc.EncounterPhotobombOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.EncounterPhotobombOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.EncounterPhotobombOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterPhotobombOutProto.Result result = 1;</code>
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

    private POGOProtos.Rpc.CaptureProbabilityProto captureProbability_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CaptureProbabilityProto, POGOProtos.Rpc.CaptureProbabilityProto.Builder, POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder> captureProbabilityBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     * @return Whether the captureProbability field is set.
     */
    public boolean hasCaptureProbability() {
      return captureProbabilityBuilder_ != null || captureProbability_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     * @return The captureProbability.
     */
    public POGOProtos.Rpc.CaptureProbabilityProto getCaptureProbability() {
      if (captureProbabilityBuilder_ == null) {
        return captureProbability_ == null ? POGOProtos.Rpc.CaptureProbabilityProto.getDefaultInstance() : captureProbability_;
      } else {
        return captureProbabilityBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    public Builder setCaptureProbability(POGOProtos.Rpc.CaptureProbabilityProto value) {
      if (captureProbabilityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        captureProbability_ = value;
        onChanged();
      } else {
        captureProbabilityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    public Builder setCaptureProbability(
        POGOProtos.Rpc.CaptureProbabilityProto.Builder builderForValue) {
      if (captureProbabilityBuilder_ == null) {
        captureProbability_ = builderForValue.build();
        onChanged();
      } else {
        captureProbabilityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    public Builder mergeCaptureProbability(POGOProtos.Rpc.CaptureProbabilityProto value) {
      if (captureProbabilityBuilder_ == null) {
        if (captureProbability_ != null) {
          captureProbability_ =
            POGOProtos.Rpc.CaptureProbabilityProto.newBuilder(captureProbability_).mergeFrom(value).buildPartial();
        } else {
          captureProbability_ = value;
        }
        onChanged();
      } else {
        captureProbabilityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    public Builder clearCaptureProbability() {
      if (captureProbabilityBuilder_ == null) {
        captureProbability_ = null;
        onChanged();
      } else {
        captureProbability_ = null;
        captureProbabilityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    public POGOProtos.Rpc.CaptureProbabilityProto.Builder getCaptureProbabilityBuilder() {
      
      onChanged();
      return getCaptureProbabilityFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    public POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder getCaptureProbabilityOrBuilder() {
      if (captureProbabilityBuilder_ != null) {
        return captureProbabilityBuilder_.getMessageOrBuilder();
      } else {
        return captureProbability_ == null ?
            POGOProtos.Rpc.CaptureProbabilityProto.getDefaultInstance() : captureProbability_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CaptureProbabilityProto capture_probability = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CaptureProbabilityProto, POGOProtos.Rpc.CaptureProbabilityProto.Builder, POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder> 
        getCaptureProbabilityFieldBuilder() {
      if (captureProbabilityBuilder_ == null) {
        captureProbabilityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CaptureProbabilityProto, POGOProtos.Rpc.CaptureProbabilityProto.Builder, POGOProtos.Rpc.CaptureProbabilityProtoOrBuilder>(
                getCaptureProbability(),
                getParentForChildren(),
                isClean());
        captureProbability_ = null;
      }
      return captureProbabilityBuilder_;
    }

    private int activeItem_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
     * @return The enum numeric value on the wire for activeItem.
     */
    public int getActiveItemValue() {
      return activeItem_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
     * @param value The enum numeric value on the wire for activeItem to set.
     * @return This builder for chaining.
     */
    public Builder setActiveItemValue(int value) {
      activeItem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
     * @return The activeItem.
     */
    public POGOProtos.Rpc.Item getActiveItem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(activeItem_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
     * @param value The activeItem to set.
     * @return This builder for chaining.
     */
    public Builder setActiveItem(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      activeItem_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item active_item = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveItem() {
      
      activeItem_ = 0;
      onChanged();
      return this;
    }

    private int arplusAttemptsUntilFlee_ ;
    /**
     * <code>int32 arplus_attempts_until_flee = 5;</code>
     * @return The arplusAttemptsUntilFlee.
     */
    public int getArplusAttemptsUntilFlee() {
      return arplusAttemptsUntilFlee_;
    }
    /**
     * <code>int32 arplus_attempts_until_flee = 5;</code>
     * @param value The arplusAttemptsUntilFlee to set.
     * @return This builder for chaining.
     */
    public Builder setArplusAttemptsUntilFlee(int value) {
      
      arplusAttemptsUntilFlee_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 arplus_attempts_until_flee = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearArplusAttemptsUntilFlee() {
      
      arplusAttemptsUntilFlee_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EncounterPhotobombOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EncounterPhotobombOutProto)
  private static final POGOProtos.Rpc.EncounterPhotobombOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EncounterPhotobombOutProto();
  }

  public static POGOProtos.Rpc.EncounterPhotobombOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncounterPhotobombOutProto>
      PARSER = new com.google.protobuf.AbstractParser<EncounterPhotobombOutProto>() {
    @java.lang.Override
    public EncounterPhotobombOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncounterPhotobombOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncounterPhotobombOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncounterPhotobombOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EncounterPhotobombOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

