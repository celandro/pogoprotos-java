// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: ELIABNNIFGJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IapSettingsProto}
 */
public final class IapSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IapSettingsProto)
    IapSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IapSettingsProto.newBuilder() to construct.
  private IapSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IapSettingsProto() {
    dailyDefenderBonusPerPokemon_ = emptyIntList();
    dailyDefenderBonusCurrency_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IapSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IapSettingsProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            dailyBonusCoins_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dailyDefenderBonusPerPokemon_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            dailyDefenderBonusPerPokemon_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              dailyDefenderBonusPerPokemon_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              dailyDefenderBonusPerPokemon_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {

            dailyDefenderBonusMaxDefenders_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              dailyDefenderBonusCurrency_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            dailyDefenderBonusCurrency_.add(s);
            break;
          }
          case 40: {

            minTimeBetweenClaimsMs_ = input.readInt64();
            break;
          }
          case 48: {

            dailyBonusEnabled_ = input.readBool();
            break;
          }
          case 56: {

            dailyDefenderBonusEnabled_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        dailyDefenderBonusPerPokemon_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        dailyDefenderBonusCurrency_ = dailyDefenderBonusCurrency_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IapSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IapSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IapSettingsProto.class, POGOProtos.Rpc.IapSettingsProto.Builder.class);
  }

  public static final int DAILY_BONUS_COINS_FIELD_NUMBER = 1;
  private int dailyBonusCoins_;
  /**
   * <code>int32 daily_bonus_coins = 1;</code>
   * @return The dailyBonusCoins.
   */
  @java.lang.Override
  public int getDailyBonusCoins() {
    return dailyBonusCoins_;
  }

  public static final int DAILY_DEFENDER_BONUS_PER_POKEMON_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList dailyDefenderBonusPerPokemon_;
  /**
   * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
   * @return A list containing the dailyDefenderBonusPerPokemon.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getDailyDefenderBonusPerPokemonList() {
    return dailyDefenderBonusPerPokemon_;
  }
  /**
   * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
   * @return The count of dailyDefenderBonusPerPokemon.
   */
  public int getDailyDefenderBonusPerPokemonCount() {
    return dailyDefenderBonusPerPokemon_.size();
  }
  /**
   * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
   * @param index The index of the element to return.
   * @return The dailyDefenderBonusPerPokemon at the given index.
   */
  public int getDailyDefenderBonusPerPokemon(int index) {
    return dailyDefenderBonusPerPokemon_.getInt(index);
  }
  private int dailyDefenderBonusPerPokemonMemoizedSerializedSize = -1;

  public static final int DAILY_DEFENDER_BONUS_MAX_DEFENDERS_FIELD_NUMBER = 3;
  private int dailyDefenderBonusMaxDefenders_;
  /**
   * <code>int32 daily_defender_bonus_max_defenders = 3;</code>
   * @return The dailyDefenderBonusMaxDefenders.
   */
  @java.lang.Override
  public int getDailyDefenderBonusMaxDefenders() {
    return dailyDefenderBonusMaxDefenders_;
  }

  public static final int DAILY_DEFENDER_BONUS_CURRENCY_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList dailyDefenderBonusCurrency_;
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @return A list containing the dailyDefenderBonusCurrency.
   */
  public com.google.protobuf.ProtocolStringList
      getDailyDefenderBonusCurrencyList() {
    return dailyDefenderBonusCurrency_;
  }
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @return The count of dailyDefenderBonusCurrency.
   */
  public int getDailyDefenderBonusCurrencyCount() {
    return dailyDefenderBonusCurrency_.size();
  }
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @param index The index of the element to return.
   * @return The dailyDefenderBonusCurrency at the given index.
   */
  public java.lang.String getDailyDefenderBonusCurrency(int index) {
    return dailyDefenderBonusCurrency_.get(index);
  }
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dailyDefenderBonusCurrency at the given index.
   */
  public com.google.protobuf.ByteString
      getDailyDefenderBonusCurrencyBytes(int index) {
    return dailyDefenderBonusCurrency_.getByteString(index);
  }

  public static final int MIN_TIME_BETWEEN_CLAIMS_MS_FIELD_NUMBER = 5;
  private long minTimeBetweenClaimsMs_;
  /**
   * <code>int64 min_time_between_claims_ms = 5;</code>
   * @return The minTimeBetweenClaimsMs.
   */
  @java.lang.Override
  public long getMinTimeBetweenClaimsMs() {
    return minTimeBetweenClaimsMs_;
  }

  public static final int DAILY_BONUS_ENABLED_FIELD_NUMBER = 6;
  private boolean dailyBonusEnabled_;
  /**
   * <code>bool daily_bonus_enabled = 6;</code>
   * @return The dailyBonusEnabled.
   */
  @java.lang.Override
  public boolean getDailyBonusEnabled() {
    return dailyBonusEnabled_;
  }

  public static final int DAILY_DEFENDER_BONUS_ENABLED_FIELD_NUMBER = 7;
  private boolean dailyDefenderBonusEnabled_;
  /**
   * <code>bool daily_defender_bonus_enabled = 7;</code>
   * @return The dailyDefenderBonusEnabled.
   */
  @java.lang.Override
  public boolean getDailyDefenderBonusEnabled() {
    return dailyDefenderBonusEnabled_;
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
    getSerializedSize();
    if (dailyBonusCoins_ != 0) {
      output.writeInt32(1, dailyBonusCoins_);
    }
    if (getDailyDefenderBonusPerPokemonList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(dailyDefenderBonusPerPokemonMemoizedSerializedSize);
    }
    for (int i = 0; i < dailyDefenderBonusPerPokemon_.size(); i++) {
      output.writeInt32NoTag(dailyDefenderBonusPerPokemon_.getInt(i));
    }
    if (dailyDefenderBonusMaxDefenders_ != 0) {
      output.writeInt32(3, dailyDefenderBonusMaxDefenders_);
    }
    for (int i = 0; i < dailyDefenderBonusCurrency_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dailyDefenderBonusCurrency_.getRaw(i));
    }
    if (minTimeBetweenClaimsMs_ != 0L) {
      output.writeInt64(5, minTimeBetweenClaimsMs_);
    }
    if (dailyBonusEnabled_ != false) {
      output.writeBool(6, dailyBonusEnabled_);
    }
    if (dailyDefenderBonusEnabled_ != false) {
      output.writeBool(7, dailyDefenderBonusEnabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dailyBonusCoins_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, dailyBonusCoins_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dailyDefenderBonusPerPokemon_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(dailyDefenderBonusPerPokemon_.getInt(i));
      }
      size += dataSize;
      if (!getDailyDefenderBonusPerPokemonList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      dailyDefenderBonusPerPokemonMemoizedSerializedSize = dataSize;
    }
    if (dailyDefenderBonusMaxDefenders_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, dailyDefenderBonusMaxDefenders_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dailyDefenderBonusCurrency_.size(); i++) {
        dataSize += computeStringSizeNoTag(dailyDefenderBonusCurrency_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDailyDefenderBonusCurrencyList().size();
    }
    if (minTimeBetweenClaimsMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, minTimeBetweenClaimsMs_);
    }
    if (dailyBonusEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, dailyBonusEnabled_);
    }
    if (dailyDefenderBonusEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, dailyDefenderBonusEnabled_);
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
    if (!(obj instanceof POGOProtos.Rpc.IapSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IapSettingsProto other = (POGOProtos.Rpc.IapSettingsProto) obj;

    if (getDailyBonusCoins()
        != other.getDailyBonusCoins()) return false;
    if (!getDailyDefenderBonusPerPokemonList()
        .equals(other.getDailyDefenderBonusPerPokemonList())) return false;
    if (getDailyDefenderBonusMaxDefenders()
        != other.getDailyDefenderBonusMaxDefenders()) return false;
    if (!getDailyDefenderBonusCurrencyList()
        .equals(other.getDailyDefenderBonusCurrencyList())) return false;
    if (getMinTimeBetweenClaimsMs()
        != other.getMinTimeBetweenClaimsMs()) return false;
    if (getDailyBonusEnabled()
        != other.getDailyBonusEnabled()) return false;
    if (getDailyDefenderBonusEnabled()
        != other.getDailyDefenderBonusEnabled()) return false;
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
    hash = (37 * hash) + DAILY_BONUS_COINS_FIELD_NUMBER;
    hash = (53 * hash) + getDailyBonusCoins();
    if (getDailyDefenderBonusPerPokemonCount() > 0) {
      hash = (37 * hash) + DAILY_DEFENDER_BONUS_PER_POKEMON_FIELD_NUMBER;
      hash = (53 * hash) + getDailyDefenderBonusPerPokemonList().hashCode();
    }
    hash = (37 * hash) + DAILY_DEFENDER_BONUS_MAX_DEFENDERS_FIELD_NUMBER;
    hash = (53 * hash) + getDailyDefenderBonusMaxDefenders();
    if (getDailyDefenderBonusCurrencyCount() > 0) {
      hash = (37 * hash) + DAILY_DEFENDER_BONUS_CURRENCY_FIELD_NUMBER;
      hash = (53 * hash) + getDailyDefenderBonusCurrencyList().hashCode();
    }
    hash = (37 * hash) + MIN_TIME_BETWEEN_CLAIMS_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMinTimeBetweenClaimsMs());
    hash = (37 * hash) + DAILY_BONUS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDailyBonusEnabled());
    hash = (37 * hash) + DAILY_DEFENDER_BONUS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDailyDefenderBonusEnabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IapSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IapSettingsProto prototype) {
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
   * ref: ELIABNNIFGJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IapSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IapSettingsProto)
      POGOProtos.Rpc.IapSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IapSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IapSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IapSettingsProto.class, POGOProtos.Rpc.IapSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IapSettingsProto.newBuilder()
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
      dailyBonusCoins_ = 0;

      dailyDefenderBonusPerPokemon_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      dailyDefenderBonusMaxDefenders_ = 0;

      dailyDefenderBonusCurrency_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      minTimeBetweenClaimsMs_ = 0L;

      dailyBonusEnabled_ = false;

      dailyDefenderBonusEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IapSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IapSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.IapSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IapSettingsProto build() {
      POGOProtos.Rpc.IapSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IapSettingsProto buildPartial() {
      POGOProtos.Rpc.IapSettingsProto result = new POGOProtos.Rpc.IapSettingsProto(this);
      int from_bitField0_ = bitField0_;
      result.dailyBonusCoins_ = dailyBonusCoins_;
      if (((bitField0_ & 0x00000001) != 0)) {
        dailyDefenderBonusPerPokemon_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dailyDefenderBonusPerPokemon_ = dailyDefenderBonusPerPokemon_;
      result.dailyDefenderBonusMaxDefenders_ = dailyDefenderBonusMaxDefenders_;
      if (((bitField0_ & 0x00000002) != 0)) {
        dailyDefenderBonusCurrency_ = dailyDefenderBonusCurrency_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.dailyDefenderBonusCurrency_ = dailyDefenderBonusCurrency_;
      result.minTimeBetweenClaimsMs_ = minTimeBetweenClaimsMs_;
      result.dailyBonusEnabled_ = dailyBonusEnabled_;
      result.dailyDefenderBonusEnabled_ = dailyDefenderBonusEnabled_;
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
      if (other instanceof POGOProtos.Rpc.IapSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.IapSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IapSettingsProto other) {
      if (other == POGOProtos.Rpc.IapSettingsProto.getDefaultInstance()) return this;
      if (other.getDailyBonusCoins() != 0) {
        setDailyBonusCoins(other.getDailyBonusCoins());
      }
      if (!other.dailyDefenderBonusPerPokemon_.isEmpty()) {
        if (dailyDefenderBonusPerPokemon_.isEmpty()) {
          dailyDefenderBonusPerPokemon_ = other.dailyDefenderBonusPerPokemon_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDailyDefenderBonusPerPokemonIsMutable();
          dailyDefenderBonusPerPokemon_.addAll(other.dailyDefenderBonusPerPokemon_);
        }
        onChanged();
      }
      if (other.getDailyDefenderBonusMaxDefenders() != 0) {
        setDailyDefenderBonusMaxDefenders(other.getDailyDefenderBonusMaxDefenders());
      }
      if (!other.dailyDefenderBonusCurrency_.isEmpty()) {
        if (dailyDefenderBonusCurrency_.isEmpty()) {
          dailyDefenderBonusCurrency_ = other.dailyDefenderBonusCurrency_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDailyDefenderBonusCurrencyIsMutable();
          dailyDefenderBonusCurrency_.addAll(other.dailyDefenderBonusCurrency_);
        }
        onChanged();
      }
      if (other.getMinTimeBetweenClaimsMs() != 0L) {
        setMinTimeBetweenClaimsMs(other.getMinTimeBetweenClaimsMs());
      }
      if (other.getDailyBonusEnabled() != false) {
        setDailyBonusEnabled(other.getDailyBonusEnabled());
      }
      if (other.getDailyDefenderBonusEnabled() != false) {
        setDailyDefenderBonusEnabled(other.getDailyDefenderBonusEnabled());
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
      POGOProtos.Rpc.IapSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IapSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int dailyBonusCoins_ ;
    /**
     * <code>int32 daily_bonus_coins = 1;</code>
     * @return The dailyBonusCoins.
     */
    @java.lang.Override
    public int getDailyBonusCoins() {
      return dailyBonusCoins_;
    }
    /**
     * <code>int32 daily_bonus_coins = 1;</code>
     * @param value The dailyBonusCoins to set.
     * @return This builder for chaining.
     */
    public Builder setDailyBonusCoins(int value) {
      
      dailyBonusCoins_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 daily_bonus_coins = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyBonusCoins() {
      
      dailyBonusCoins_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList dailyDefenderBonusPerPokemon_ = emptyIntList();
    private void ensureDailyDefenderBonusPerPokemonIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dailyDefenderBonusPerPokemon_ = mutableCopy(dailyDefenderBonusPerPokemon_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @return A list containing the dailyDefenderBonusPerPokemon.
     */
    public java.util.List<java.lang.Integer>
        getDailyDefenderBonusPerPokemonList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(dailyDefenderBonusPerPokemon_) : dailyDefenderBonusPerPokemon_;
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @return The count of dailyDefenderBonusPerPokemon.
     */
    public int getDailyDefenderBonusPerPokemonCount() {
      return dailyDefenderBonusPerPokemon_.size();
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @param index The index of the element to return.
     * @return The dailyDefenderBonusPerPokemon at the given index.
     */
    public int getDailyDefenderBonusPerPokemon(int index) {
      return dailyDefenderBonusPerPokemon_.getInt(index);
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @param index The index to set the value at.
     * @param value The dailyDefenderBonusPerPokemon to set.
     * @return This builder for chaining.
     */
    public Builder setDailyDefenderBonusPerPokemon(
        int index, int value) {
      ensureDailyDefenderBonusPerPokemonIsMutable();
      dailyDefenderBonusPerPokemon_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @param value The dailyDefenderBonusPerPokemon to add.
     * @return This builder for chaining.
     */
    public Builder addDailyDefenderBonusPerPokemon(int value) {
      ensureDailyDefenderBonusPerPokemonIsMutable();
      dailyDefenderBonusPerPokemon_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @param values The dailyDefenderBonusPerPokemon to add.
     * @return This builder for chaining.
     */
    public Builder addAllDailyDefenderBonusPerPokemon(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureDailyDefenderBonusPerPokemonIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dailyDefenderBonusPerPokemon_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyDefenderBonusPerPokemon() {
      dailyDefenderBonusPerPokemon_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int dailyDefenderBonusMaxDefenders_ ;
    /**
     * <code>int32 daily_defender_bonus_max_defenders = 3;</code>
     * @return The dailyDefenderBonusMaxDefenders.
     */
    @java.lang.Override
    public int getDailyDefenderBonusMaxDefenders() {
      return dailyDefenderBonusMaxDefenders_;
    }
    /**
     * <code>int32 daily_defender_bonus_max_defenders = 3;</code>
     * @param value The dailyDefenderBonusMaxDefenders to set.
     * @return This builder for chaining.
     */
    public Builder setDailyDefenderBonusMaxDefenders(int value) {
      
      dailyDefenderBonusMaxDefenders_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 daily_defender_bonus_max_defenders = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyDefenderBonusMaxDefenders() {
      
      dailyDefenderBonusMaxDefenders_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList dailyDefenderBonusCurrency_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDailyDefenderBonusCurrencyIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dailyDefenderBonusCurrency_ = new com.google.protobuf.LazyStringArrayList(dailyDefenderBonusCurrency_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @return A list containing the dailyDefenderBonusCurrency.
     */
    public com.google.protobuf.ProtocolStringList
        getDailyDefenderBonusCurrencyList() {
      return dailyDefenderBonusCurrency_.getUnmodifiableView();
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @return The count of dailyDefenderBonusCurrency.
     */
    public int getDailyDefenderBonusCurrencyCount() {
      return dailyDefenderBonusCurrency_.size();
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @param index The index of the element to return.
     * @return The dailyDefenderBonusCurrency at the given index.
     */
    public java.lang.String getDailyDefenderBonusCurrency(int index) {
      return dailyDefenderBonusCurrency_.get(index);
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dailyDefenderBonusCurrency at the given index.
     */
    public com.google.protobuf.ByteString
        getDailyDefenderBonusCurrencyBytes(int index) {
      return dailyDefenderBonusCurrency_.getByteString(index);
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @param index The index to set the value at.
     * @param value The dailyDefenderBonusCurrency to set.
     * @return This builder for chaining.
     */
    public Builder setDailyDefenderBonusCurrency(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDailyDefenderBonusCurrencyIsMutable();
      dailyDefenderBonusCurrency_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @param value The dailyDefenderBonusCurrency to add.
     * @return This builder for chaining.
     */
    public Builder addDailyDefenderBonusCurrency(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDailyDefenderBonusCurrencyIsMutable();
      dailyDefenderBonusCurrency_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @param values The dailyDefenderBonusCurrency to add.
     * @return This builder for chaining.
     */
    public Builder addAllDailyDefenderBonusCurrency(
        java.lang.Iterable<java.lang.String> values) {
      ensureDailyDefenderBonusCurrencyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dailyDefenderBonusCurrency_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyDefenderBonusCurrency() {
      dailyDefenderBonusCurrency_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string daily_defender_bonus_currency = 4;</code>
     * @param value The bytes of the dailyDefenderBonusCurrency to add.
     * @return This builder for chaining.
     */
    public Builder addDailyDefenderBonusCurrencyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDailyDefenderBonusCurrencyIsMutable();
      dailyDefenderBonusCurrency_.add(value);
      onChanged();
      return this;
    }

    private long minTimeBetweenClaimsMs_ ;
    /**
     * <code>int64 min_time_between_claims_ms = 5;</code>
     * @return The minTimeBetweenClaimsMs.
     */
    @java.lang.Override
    public long getMinTimeBetweenClaimsMs() {
      return minTimeBetweenClaimsMs_;
    }
    /**
     * <code>int64 min_time_between_claims_ms = 5;</code>
     * @param value The minTimeBetweenClaimsMs to set.
     * @return This builder for chaining.
     */
    public Builder setMinTimeBetweenClaimsMs(long value) {
      
      minTimeBetweenClaimsMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 min_time_between_claims_ms = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinTimeBetweenClaimsMs() {
      
      minTimeBetweenClaimsMs_ = 0L;
      onChanged();
      return this;
    }

    private boolean dailyBonusEnabled_ ;
    /**
     * <code>bool daily_bonus_enabled = 6;</code>
     * @return The dailyBonusEnabled.
     */
    @java.lang.Override
    public boolean getDailyBonusEnabled() {
      return dailyBonusEnabled_;
    }
    /**
     * <code>bool daily_bonus_enabled = 6;</code>
     * @param value The dailyBonusEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setDailyBonusEnabled(boolean value) {
      
      dailyBonusEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool daily_bonus_enabled = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyBonusEnabled() {
      
      dailyBonusEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean dailyDefenderBonusEnabled_ ;
    /**
     * <code>bool daily_defender_bonus_enabled = 7;</code>
     * @return The dailyDefenderBonusEnabled.
     */
    @java.lang.Override
    public boolean getDailyDefenderBonusEnabled() {
      return dailyDefenderBonusEnabled_;
    }
    /**
     * <code>bool daily_defender_bonus_enabled = 7;</code>
     * @param value The dailyDefenderBonusEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setDailyDefenderBonusEnabled(boolean value) {
      
      dailyDefenderBonusEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool daily_defender_bonus_enabled = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDailyDefenderBonusEnabled() {
      
      dailyDefenderBonusEnabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IapSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IapSettingsProto)
  private static final POGOProtos.Rpc.IapSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IapSettingsProto();
  }

  public static POGOProtos.Rpc.IapSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IapSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<IapSettingsProto>() {
    @java.lang.Override
    public IapSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IapSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IapSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IapSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IapSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

