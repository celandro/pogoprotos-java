// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/BuddyPokemonLogEntry.proto

package POGOProtos.Data.Logs;

/**
 * Protobuf type {@code POGOProtos.Data.Logs.BuddyPokemonLogEntry}
 */
public final class BuddyPokemonLogEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Logs.BuddyPokemonLogEntry)
    BuddyPokemonLogEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyPokemonLogEntry.newBuilder() to construct.
  private BuddyPokemonLogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyPokemonLogEntry() {
    result_ = 0;
    pokemonType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyPokemonLogEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyPokemonLogEntry(
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

            pokemonType_ = rawValue;
            break;
          }
          case 24: {

            amount_ = input.readInt32();
            break;
          }
          case 34: {
            POGOProtos.Data.PokemonDisplay.Builder subBuilder = null;
            if (pokemonDisplay_ != null) {
              subBuilder = pokemonDisplay_.toBuilder();
            }
            pokemonDisplay_ = input.readMessage(POGOProtos.Data.PokemonDisplay.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pokemonDisplay_);
              pokemonDisplay_ = subBuilder.buildPartial();
            }

            break;
          }
          case 41: {

            pokemonId_ = input.readFixed64();
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
    return POGOProtos.Data.Logs.BuddyPokemonLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_BuddyPokemonLogEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Logs.BuddyPokemonLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_BuddyPokemonLogEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Logs.BuddyPokemonLogEntry.class, POGOProtos.Data.Logs.BuddyPokemonLogEntry.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>CANDY_FOUND = 1;</code>
     */
    CANDY_FOUND(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>CANDY_FOUND = 1;</code>
     */
    public static final int CANDY_FOUND_VALUE = 1;


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
        case 1: return CANDY_FOUND;
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
      return POGOProtos.Data.Logs.BuddyPokemonLogEntry.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result.valueOf(result_);
    return result == null ? POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result.UNRECOGNIZED : result;
  }

  public static final int POKEMON_TYPE_FIELD_NUMBER = 2;
  private int pokemonType_;
  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
   * @return The enum numeric value on the wire for pokemonType.
   */
  @java.lang.Override public int getPokemonTypeValue() {
    return pokemonType_;
  }
  /**
   * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
   * @return The pokemonType.
   */
  @java.lang.Override public POGOProtos.Enums.PokemonId getPokemonType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.PokemonId result = POGOProtos.Enums.PokemonId.valueOf(pokemonType_);
    return result == null ? POGOProtos.Enums.PokemonId.UNRECOGNIZED : result;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private int amount_;
  /**
   * <code>int32 amount = 3;</code>
   * @return The amount.
   */
  @java.lang.Override
  public int getAmount() {
    return amount_;
  }

  public static final int POKEMON_DISPLAY_FIELD_NUMBER = 4;
  private POGOProtos.Data.PokemonDisplay pokemonDisplay_;
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  @java.lang.Override
  public boolean hasPokemonDisplay() {
    return pokemonDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
   * @return The pokemonDisplay.
   */
  @java.lang.Override
  public POGOProtos.Data.PokemonDisplay getPokemonDisplay() {
    return pokemonDisplay_ == null ? POGOProtos.Data.PokemonDisplay.getDefaultInstance() : pokemonDisplay_;
  }
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.PokemonDisplayOrBuilder getPokemonDisplayOrBuilder() {
    return getPokemonDisplay();
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 5;
  private long pokemonId_;
  /**
   * <code>fixed64 pokemon_id = 5;</code>
   * @return The pokemonId.
   */
  @java.lang.Override
  public long getPokemonId() {
    return pokemonId_;
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
    if (result_ != POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (pokemonType_ != POGOProtos.Enums.PokemonId.MISSINGNO.getNumber()) {
      output.writeEnum(2, pokemonType_);
    }
    if (amount_ != 0) {
      output.writeInt32(3, amount_);
    }
    if (pokemonDisplay_ != null) {
      output.writeMessage(4, getPokemonDisplay());
    }
    if (pokemonId_ != 0L) {
      output.writeFixed64(5, pokemonId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (pokemonType_ != POGOProtos.Enums.PokemonId.MISSINGNO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pokemonType_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, amount_);
    }
    if (pokemonDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPokemonDisplay());
    }
    if (pokemonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeFixed64Size(5, pokemonId_);
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
    if (!(obj instanceof POGOProtos.Data.Logs.BuddyPokemonLogEntry)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Logs.BuddyPokemonLogEntry other = (POGOProtos.Data.Logs.BuddyPokemonLogEntry) obj;

    if (result_ != other.result_) return false;
    if (pokemonType_ != other.pokemonType_) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (hasPokemonDisplay() != other.hasPokemonDisplay()) return false;
    if (hasPokemonDisplay()) {
      if (!getPokemonDisplay()
          .equals(other.getPokemonDisplay())) return false;
    }
    if (getPokemonId()
        != other.getPokemonId()) return false;
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
    hash = (37 * hash) + POKEMON_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + pokemonType_;
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    if (hasPokemonDisplay()) {
      hash = (37 * hash) + POKEMON_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getPokemonDisplay().hashCode();
    }
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPokemonId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Logs.BuddyPokemonLogEntry prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Logs.BuddyPokemonLogEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Logs.BuddyPokemonLogEntry)
      POGOProtos.Data.Logs.BuddyPokemonLogEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Logs.BuddyPokemonLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_BuddyPokemonLogEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Logs.BuddyPokemonLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_BuddyPokemonLogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Logs.BuddyPokemonLogEntry.class, POGOProtos.Data.Logs.BuddyPokemonLogEntry.Builder.class);
    }

    // Construct using POGOProtos.Data.Logs.BuddyPokemonLogEntry.newBuilder()
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

      pokemonType_ = 0;

      amount_ = 0;

      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = null;
      } else {
        pokemonDisplay_ = null;
        pokemonDisplayBuilder_ = null;
      }
      pokemonId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Logs.BuddyPokemonLogEntryOuterClass.internal_static_POGOProtos_Data_Logs_BuddyPokemonLogEntry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.BuddyPokemonLogEntry getDefaultInstanceForType() {
      return POGOProtos.Data.Logs.BuddyPokemonLogEntry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.BuddyPokemonLogEntry build() {
      POGOProtos.Data.Logs.BuddyPokemonLogEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Logs.BuddyPokemonLogEntry buildPartial() {
      POGOProtos.Data.Logs.BuddyPokemonLogEntry result = new POGOProtos.Data.Logs.BuddyPokemonLogEntry(this);
      result.result_ = result_;
      result.pokemonType_ = pokemonType_;
      result.amount_ = amount_;
      if (pokemonDisplayBuilder_ == null) {
        result.pokemonDisplay_ = pokemonDisplay_;
      } else {
        result.pokemonDisplay_ = pokemonDisplayBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Data.Logs.BuddyPokemonLogEntry) {
        return mergeFrom((POGOProtos.Data.Logs.BuddyPokemonLogEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Logs.BuddyPokemonLogEntry other) {
      if (other == POGOProtos.Data.Logs.BuddyPokemonLogEntry.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.pokemonType_ != 0) {
        setPokemonTypeValue(other.getPokemonTypeValue());
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      if (other.hasPokemonDisplay()) {
        mergePokemonDisplay(other.getPokemonDisplay());
      }
      if (other.getPokemonId() != 0L) {
        setPokemonId(other.getPokemonId());
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
      POGOProtos.Data.Logs.BuddyPokemonLogEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Logs.BuddyPokemonLogEntry) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result.valueOf(result_);
      return result == null ? POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Logs.BuddyPokemonLogEntry.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private int pokemonType_ = 0;
    /**
     * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
     * @return The enum numeric value on the wire for pokemonType.
     */
    @java.lang.Override public int getPokemonTypeValue() {
      return pokemonType_;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
     * @param value The enum numeric value on the wire for pokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonTypeValue(int value) {
      
      pokemonType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
     * @return The pokemonType.
     */
    @java.lang.Override
    public POGOProtos.Enums.PokemonId getPokemonType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.PokemonId result = POGOProtos.Enums.PokemonId.valueOf(pokemonType_);
      return result == null ? POGOProtos.Enums.PokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
     * @param value The pokemonType to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonType(POGOProtos.Enums.PokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.PokemonId pokemon_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonType() {
      
      pokemonType_ = 0;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <code>int32 amount = 3;</code>
     * @return The amount.
     */
    @java.lang.Override
    public int getAmount() {
      return amount_;
    }
    /**
     * <code>int32 amount = 3;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 amount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.PokemonDisplay pokemonDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonDisplay, POGOProtos.Data.PokemonDisplay.Builder, POGOProtos.Data.PokemonDisplayOrBuilder> pokemonDisplayBuilder_;
    /**
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     * @return Whether the pokemonDisplay field is set.
     */
    public boolean hasPokemonDisplay() {
      return pokemonDisplayBuilder_ != null || pokemonDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     * @return The pokemonDisplay.
     */
    public POGOProtos.Data.PokemonDisplay getPokemonDisplay() {
      if (pokemonDisplayBuilder_ == null) {
        return pokemonDisplay_ == null ? POGOProtos.Data.PokemonDisplay.getDefaultInstance() : pokemonDisplay_;
      } else {
        return pokemonDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     */
    public Builder setPokemonDisplay(POGOProtos.Data.PokemonDisplay value) {
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
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     */
    public Builder setPokemonDisplay(
        POGOProtos.Data.PokemonDisplay.Builder builderForValue) {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplay_ = builderForValue.build();
        onChanged();
      } else {
        pokemonDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     */
    public Builder mergePokemonDisplay(POGOProtos.Data.PokemonDisplay value) {
      if (pokemonDisplayBuilder_ == null) {
        if (pokemonDisplay_ != null) {
          pokemonDisplay_ =
            POGOProtos.Data.PokemonDisplay.newBuilder(pokemonDisplay_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
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
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     */
    public POGOProtos.Data.PokemonDisplay.Builder getPokemonDisplayBuilder() {
      
      onChanged();
      return getPokemonDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     */
    public POGOProtos.Data.PokemonDisplayOrBuilder getPokemonDisplayOrBuilder() {
      if (pokemonDisplayBuilder_ != null) {
        return pokemonDisplayBuilder_.getMessageOrBuilder();
      } else {
        return pokemonDisplay_ == null ?
            POGOProtos.Data.PokemonDisplay.getDefaultInstance() : pokemonDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PokemonDisplay, POGOProtos.Data.PokemonDisplay.Builder, POGOProtos.Data.PokemonDisplayOrBuilder> 
        getPokemonDisplayFieldBuilder() {
      if (pokemonDisplayBuilder_ == null) {
        pokemonDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.PokemonDisplay, POGOProtos.Data.PokemonDisplay.Builder, POGOProtos.Data.PokemonDisplayOrBuilder>(
                getPokemonDisplay(),
                getParentForChildren(),
                isClean());
        pokemonDisplay_ = null;
      }
      return pokemonDisplayBuilder_;
    }

    private long pokemonId_ ;
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public long getPokemonId() {
      return pokemonId_;
    }
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(long value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>fixed64 pokemon_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Logs.BuddyPokemonLogEntry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Logs.BuddyPokemonLogEntry)
  private static final POGOProtos.Data.Logs.BuddyPokemonLogEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Logs.BuddyPokemonLogEntry();
  }

  public static POGOProtos.Data.Logs.BuddyPokemonLogEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyPokemonLogEntry>
      PARSER = new com.google.protobuf.AbstractParser<BuddyPokemonLogEntry>() {
    @java.lang.Override
    public BuddyPokemonLogEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyPokemonLogEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyPokemonLogEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyPokemonLogEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Logs.BuddyPokemonLogEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

