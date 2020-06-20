// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Trading/ExcludedPokemon.proto

package POGOProtos.Data.Trading;

/**
 * Protobuf type {@code POGOProtos.Data.Trading.ExcludedPokemon}
 */
public  final class ExcludedPokemon extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Trading.ExcludedPokemon)
    ExcludedPokemonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExcludedPokemon.newBuilder() to construct.
  private ExcludedPokemon(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExcludedPokemon() {
    exclusionReason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExcludedPokemon();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExcludedPokemon(
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
          case 9: {

            pokemonId_ = input.readFixed64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            exclusionReason_ = rawValue;
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
    return POGOProtos.Data.Trading.ExcludedPokemonOuterClass.internal_static_POGOProtos_Data_Trading_ExcludedPokemon_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Trading.ExcludedPokemonOuterClass.internal_static_POGOProtos_Data_Trading_ExcludedPokemon_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Trading.ExcludedPokemon.class, POGOProtos.Data.Trading.ExcludedPokemon.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason}
   */
  public enum ExclusionReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>MYTHICAL_POKEMON = 1;</code>
     */
    MYTHICAL_POKEMON(1),
    /**
     * <code>SLASHED = 2;</code>
     */
    SLASHED(2),
    /**
     * <code>GYM_DEPLOYED = 3;</code>
     */
    GYM_DEPLOYED(3),
    /**
     * <code>BUDDY = 4;</code>
     */
    BUDDY(4),
    /**
     * <code>STAMINA_NOT_FULL = 5;</code>
     */
    STAMINA_NOT_FULL(5),
    /**
     * <code>EGG_NOT_HATCHED = 6;</code>
     */
    EGG_NOT_HATCHED(6),
    /**
     * <code>FRIENDSHIP_LEVEL_LOW = 7;</code>
     */
    FRIENDSHIP_LEVEL_LOW(7),
    /**
     * <code>FRIEND_CANNOT_AFFORD = 8;</code>
     */
    FRIEND_CANNOT_AFFORD(8),
    /**
     * <code>FRIEND_REACHED_DAILY_LIMIT = 9;</code>
     */
    FRIEND_REACHED_DAILY_LIMIT(9),
    /**
     * <code>ALREADY_TRADED = 10;</code>
     */
    ALREADY_TRADED(10),
    /**
     * <code>PLAYER_CANNOT_AFFORD = 11;</code>
     */
    PLAYER_CANNOT_AFFORD(11),
    /**
     * <code>PLAYER_REACHED_DAILY_LIMIT = 12;</code>
     */
    PLAYER_REACHED_DAILY_LIMIT(12),
    /**
     * <code>FAVORITE = 13;</code>
     */
    FAVORITE(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>MYTHICAL_POKEMON = 1;</code>
     */
    public static final int MYTHICAL_POKEMON_VALUE = 1;
    /**
     * <code>SLASHED = 2;</code>
     */
    public static final int SLASHED_VALUE = 2;
    /**
     * <code>GYM_DEPLOYED = 3;</code>
     */
    public static final int GYM_DEPLOYED_VALUE = 3;
    /**
     * <code>BUDDY = 4;</code>
     */
    public static final int BUDDY_VALUE = 4;
    /**
     * <code>STAMINA_NOT_FULL = 5;</code>
     */
    public static final int STAMINA_NOT_FULL_VALUE = 5;
    /**
     * <code>EGG_NOT_HATCHED = 6;</code>
     */
    public static final int EGG_NOT_HATCHED_VALUE = 6;
    /**
     * <code>FRIENDSHIP_LEVEL_LOW = 7;</code>
     */
    public static final int FRIENDSHIP_LEVEL_LOW_VALUE = 7;
    /**
     * <code>FRIEND_CANNOT_AFFORD = 8;</code>
     */
    public static final int FRIEND_CANNOT_AFFORD_VALUE = 8;
    /**
     * <code>FRIEND_REACHED_DAILY_LIMIT = 9;</code>
     */
    public static final int FRIEND_REACHED_DAILY_LIMIT_VALUE = 9;
    /**
     * <code>ALREADY_TRADED = 10;</code>
     */
    public static final int ALREADY_TRADED_VALUE = 10;
    /**
     * <code>PLAYER_CANNOT_AFFORD = 11;</code>
     */
    public static final int PLAYER_CANNOT_AFFORD_VALUE = 11;
    /**
     * <code>PLAYER_REACHED_DAILY_LIMIT = 12;</code>
     */
    public static final int PLAYER_REACHED_DAILY_LIMIT_VALUE = 12;
    /**
     * <code>FAVORITE = 13;</code>
     */
    public static final int FAVORITE_VALUE = 13;


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
    public static ExclusionReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExclusionReason forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return MYTHICAL_POKEMON;
        case 2: return SLASHED;
        case 3: return GYM_DEPLOYED;
        case 4: return BUDDY;
        case 5: return STAMINA_NOT_FULL;
        case 6: return EGG_NOT_HATCHED;
        case 7: return FRIENDSHIP_LEVEL_LOW;
        case 8: return FRIEND_CANNOT_AFFORD;
        case 9: return FRIEND_REACHED_DAILY_LIMIT;
        case 10: return ALREADY_TRADED;
        case 11: return PLAYER_CANNOT_AFFORD;
        case 12: return PLAYER_REACHED_DAILY_LIMIT;
        case 13: return FAVORITE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExclusionReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExclusionReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExclusionReason>() {
            public ExclusionReason findValueByNumber(int number) {
              return ExclusionReason.forNumber(number);
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
      return POGOProtos.Data.Trading.ExcludedPokemon.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExclusionReason[] VALUES = values();

    public static ExclusionReason valueOf(
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

    private ExclusionReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason)
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 1;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 1;</code>
   * @return The pokemonId.
   */
  public long getPokemonId() {
    return pokemonId_;
  }

  public static final int EXCLUSION_REASON_FIELD_NUMBER = 2;
  private int exclusionReason_;
  /**
   * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
   * @return The enum numeric value on the wire for exclusionReason.
   */
  public int getExclusionReasonValue() {
    return exclusionReason_;
  }
  /**
   * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
   * @return The exclusionReason.
   */
  public POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason getExclusionReason() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason result = POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason.valueOf(exclusionReason_);
    return result == null ? POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason.UNRECOGNIZED : result;
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
    if (pokemonId_ != 0L) {
      output.writeFixed64(1, pokemonId_);
    }
    if (exclusionReason_ != POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason.UNSET.getNumber()) {
      output.writeEnum(2, exclusionReason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(1, pokemonId_);
    }
    if (exclusionReason_ != POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, exclusionReason_);
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
    if (!(obj instanceof POGOProtos.Data.Trading.ExcludedPokemon)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Trading.ExcludedPokemon other = (POGOProtos.Data.Trading.ExcludedPokemon) obj;

    if (getPokemonId()
        != other.getPokemonId()) return false;
    if (exclusionReason_ != other.exclusionReason_) return false;
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
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (37 * hash) + EXCLUSION_REASON_FIELD_NUMBER;
    hash = (53 * hash) + exclusionReason_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Trading.ExcludedPokemon parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Trading.ExcludedPokemon prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Trading.ExcludedPokemon}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Trading.ExcludedPokemon)
      POGOProtos.Data.Trading.ExcludedPokemonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Trading.ExcludedPokemonOuterClass.internal_static_POGOProtos_Data_Trading_ExcludedPokemon_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Trading.ExcludedPokemonOuterClass.internal_static_POGOProtos_Data_Trading_ExcludedPokemon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Trading.ExcludedPokemon.class, POGOProtos.Data.Trading.ExcludedPokemon.Builder.class);
    }

    // Construct using POGOProtos.Data.Trading.ExcludedPokemon.newBuilder()
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
      pokemonId_ = 0L;

      exclusionReason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Trading.ExcludedPokemonOuterClass.internal_static_POGOProtos_Data_Trading_ExcludedPokemon_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Trading.ExcludedPokemon getDefaultInstanceForType() {
      return POGOProtos.Data.Trading.ExcludedPokemon.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Trading.ExcludedPokemon build() {
      POGOProtos.Data.Trading.ExcludedPokemon result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Trading.ExcludedPokemon buildPartial() {
      POGOProtos.Data.Trading.ExcludedPokemon result = new POGOProtos.Data.Trading.ExcludedPokemon(this);
      result.pokemonId_ = pokemonId_;
      result.exclusionReason_ = exclusionReason_;
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
      if (other instanceof POGOProtos.Data.Trading.ExcludedPokemon) {
        return mergeFrom((POGOProtos.Data.Trading.ExcludedPokemon)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Trading.ExcludedPokemon other) {
      if (other == POGOProtos.Data.Trading.ExcludedPokemon.getDefaultInstance()) return this;
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
      }
      if (other.exclusionReason_ != 0) {
        setExclusionReasonValue(other.getExclusionReasonValue());
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
      POGOProtos.Data.Trading.ExcludedPokemon parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Trading.ExcludedPokemon) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @return The pokemonId.
     */
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
      onChanged();
      return this;
    }

    private int exclusionReason_ = 0;
    /**
     * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
     * @return The enum numeric value on the wire for exclusionReason.
     */
    public int getExclusionReasonValue() {
      return exclusionReason_;
    }
    /**
     * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
     * @param value The enum numeric value on the wire for exclusionReason to set.
     * @return This builder for chaining.
     */
    public Builder setExclusionReasonValue(int value) {
      exclusionReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
     * @return The exclusionReason.
     */
    public POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason getExclusionReason() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason result = POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason.valueOf(exclusionReason_);
      return result == null ? POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
     * @param value The exclusionReason to set.
     * @return This builder for chaining.
     */
    public Builder setExclusionReason(POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      exclusionReason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Trading.ExcludedPokemon.ExclusionReason exclusion_reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExclusionReason() {
      
      exclusionReason_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Trading.ExcludedPokemon)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Trading.ExcludedPokemon)
  private static final POGOProtos.Data.Trading.ExcludedPokemon DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Trading.ExcludedPokemon();
  }

  public static POGOProtos.Data.Trading.ExcludedPokemon getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExcludedPokemon>
      PARSER = new com.google.protobuf.AbstractParser<ExcludedPokemon>() {
    @java.lang.Override
    public ExcludedPokemon parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExcludedPokemon(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExcludedPokemon> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExcludedPokemon> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Trading.ExcludedPokemon getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

