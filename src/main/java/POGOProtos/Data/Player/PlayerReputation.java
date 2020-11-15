// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/PlayerReputation.proto

package POGOProtos.Data.Player;

/**
 * Protobuf type {@code POGOProtos.Data.Player.PlayerReputation}
 */
public final class PlayerReputation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Player.PlayerReputation)
    PlayerReputationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerReputation.newBuilder() to construct.
  private PlayerReputation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerReputation() {
    cheatReputation_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerReputation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerReputation(
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

            accountAgeMs_ = input.readInt64();
            break;
          }
          case 16: {

            playerLevel_ = input.readInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cheatReputation_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            cheatReputation_.add(rawValue);
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cheatReputation_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              cheatReputation_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 32: {

            isMinor_ = input.readBool();
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
        cheatReputation_ = java.util.Collections.unmodifiableList(cheatReputation_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Data.Player.PlayerReputationOuterClass.internal_static_POGOProtos_Data_Player_PlayerReputation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Player.PlayerReputationOuterClass.internal_static_POGOProtos_Data_Player_PlayerReputation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Player.PlayerReputation.class, POGOProtos.Data.Player.PlayerReputation.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Player.PlayerReputation.CheatReputation}
   */
  public enum CheatReputation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>BOT = 1;</code>
     */
    BOT(1),
    /**
     * <code>SPOOFER = 2;</code>
     */
    SPOOFER(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>BOT = 1;</code>
     */
    public static final int BOT_VALUE = 1;
    /**
     * <code>SPOOFER = 2;</code>
     */
    public static final int SPOOFER_VALUE = 2;


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
    public static CheatReputation valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CheatReputation forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return BOT;
        case 2: return SPOOFER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CheatReputation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CheatReputation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CheatReputation>() {
            public CheatReputation findValueByNumber(int number) {
              return CheatReputation.forNumber(number);
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
      return POGOProtos.Data.Player.PlayerReputation.getDescriptor().getEnumTypes().get(0);
    }

    private static final CheatReputation[] VALUES = values();

    public static CheatReputation valueOf(
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

    private CheatReputation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Player.PlayerReputation.CheatReputation)
  }

  public static final int ACCOUNT_AGE_MS_FIELD_NUMBER = 1;
  private long accountAgeMs_;
  /**
   * <code>int64 account_age_ms = 1;</code>
   * @return The accountAgeMs.
   */
  @java.lang.Override
  public long getAccountAgeMs() {
    return accountAgeMs_;
  }

  public static final int PLAYER_LEVEL_FIELD_NUMBER = 2;
  private long playerLevel_;
  /**
   * <code>int64 player_level = 2;</code>
   * @return The playerLevel.
   */
  @java.lang.Override
  public long getPlayerLevel() {
    return playerLevel_;
  }

  public static final int CHEAT_REPUTATION_FIELD_NUMBER = 3;
  private java.util.List<java.lang.Integer> cheatReputation_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Data.Player.PlayerReputation.CheatReputation> cheatReputation_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Data.Player.PlayerReputation.CheatReputation>() {
            public POGOProtos.Data.Player.PlayerReputation.CheatReputation convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Data.Player.PlayerReputation.CheatReputation result = POGOProtos.Data.Player.PlayerReputation.CheatReputation.valueOf(from);
              return result == null ? POGOProtos.Data.Player.PlayerReputation.CheatReputation.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
   * @return A list containing the cheatReputation.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Data.Player.PlayerReputation.CheatReputation> getCheatReputationList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Data.Player.PlayerReputation.CheatReputation>(cheatReputation_, cheatReputation_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
   * @return The count of cheatReputation.
   */
  @java.lang.Override
  public int getCheatReputationCount() {
    return cheatReputation_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
   * @param index The index of the element to return.
   * @return The cheatReputation at the given index.
   */
  @java.lang.Override
  public POGOProtos.Data.Player.PlayerReputation.CheatReputation getCheatReputation(int index) {
    return cheatReputation_converter_.convert(cheatReputation_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
   * @return A list containing the enum numeric values on the wire for cheatReputation.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getCheatReputationValueList() {
    return cheatReputation_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of cheatReputation at the given index.
   */
  @java.lang.Override
  public int getCheatReputationValue(int index) {
    return cheatReputation_.get(index);
  }
  private int cheatReputationMemoizedSerializedSize;

  public static final int IS_MINOR_FIELD_NUMBER = 4;
  private boolean isMinor_;
  /**
   * <code>bool is_minor = 4;</code>
   * @return The isMinor.
   */
  @java.lang.Override
  public boolean getIsMinor() {
    return isMinor_;
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
    if (accountAgeMs_ != 0L) {
      output.writeInt64(1, accountAgeMs_);
    }
    if (playerLevel_ != 0L) {
      output.writeInt64(2, playerLevel_);
    }
    if (getCheatReputationList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(cheatReputationMemoizedSerializedSize);
    }
    for (int i = 0; i < cheatReputation_.size(); i++) {
      output.writeEnumNoTag(cheatReputation_.get(i));
    }
    if (isMinor_ != false) {
      output.writeBool(4, isMinor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountAgeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, accountAgeMs_);
    }
    if (playerLevel_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, playerLevel_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < cheatReputation_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(cheatReputation_.get(i));
      }
      size += dataSize;
      if (!getCheatReputationList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }cheatReputationMemoizedSerializedSize = dataSize;
    }
    if (isMinor_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isMinor_);
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
    if (!(obj instanceof POGOProtos.Data.Player.PlayerReputation)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Player.PlayerReputation other = (POGOProtos.Data.Player.PlayerReputation) obj;

    if (getAccountAgeMs()
        != other.getAccountAgeMs()) return false;
    if (getPlayerLevel()
        != other.getPlayerLevel()) return false;
    if (!cheatReputation_.equals(other.cheatReputation_)) return false;
    if (getIsMinor()
        != other.getIsMinor()) return false;
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
    hash = (37 * hash) + ACCOUNT_AGE_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAccountAgeMs());
    hash = (37 * hash) + PLAYER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlayerLevel());
    if (getCheatReputationCount() > 0) {
      hash = (37 * hash) + CHEAT_REPUTATION_FIELD_NUMBER;
      hash = (53 * hash) + cheatReputation_.hashCode();
    }
    hash = (37 * hash) + IS_MINOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsMinor());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Player.PlayerReputation parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Player.PlayerReputation prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Player.PlayerReputation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Player.PlayerReputation)
      POGOProtos.Data.Player.PlayerReputationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Player.PlayerReputationOuterClass.internal_static_POGOProtos_Data_Player_PlayerReputation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Player.PlayerReputationOuterClass.internal_static_POGOProtos_Data_Player_PlayerReputation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Player.PlayerReputation.class, POGOProtos.Data.Player.PlayerReputation.Builder.class);
    }

    // Construct using POGOProtos.Data.Player.PlayerReputation.newBuilder()
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
      accountAgeMs_ = 0L;

      playerLevel_ = 0L;

      cheatReputation_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      isMinor_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Player.PlayerReputationOuterClass.internal_static_POGOProtos_Data_Player_PlayerReputation_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Player.PlayerReputation getDefaultInstanceForType() {
      return POGOProtos.Data.Player.PlayerReputation.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Player.PlayerReputation build() {
      POGOProtos.Data.Player.PlayerReputation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Player.PlayerReputation buildPartial() {
      POGOProtos.Data.Player.PlayerReputation result = new POGOProtos.Data.Player.PlayerReputation(this);
      int from_bitField0_ = bitField0_;
      result.accountAgeMs_ = accountAgeMs_;
      result.playerLevel_ = playerLevel_;
      if (((bitField0_ & 0x00000001) != 0)) {
        cheatReputation_ = java.util.Collections.unmodifiableList(cheatReputation_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cheatReputation_ = cheatReputation_;
      result.isMinor_ = isMinor_;
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
      if (other instanceof POGOProtos.Data.Player.PlayerReputation) {
        return mergeFrom((POGOProtos.Data.Player.PlayerReputation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Player.PlayerReputation other) {
      if (other == POGOProtos.Data.Player.PlayerReputation.getDefaultInstance()) return this;
      if (other.getAccountAgeMs() != 0L) {
        setAccountAgeMs(other.getAccountAgeMs());
      }
      if (other.getPlayerLevel() != 0L) {
        setPlayerLevel(other.getPlayerLevel());
      }
      if (!other.cheatReputation_.isEmpty()) {
        if (cheatReputation_.isEmpty()) {
          cheatReputation_ = other.cheatReputation_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCheatReputationIsMutable();
          cheatReputation_.addAll(other.cheatReputation_);
        }
        onChanged();
      }
      if (other.getIsMinor() != false) {
        setIsMinor(other.getIsMinor());
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
      POGOProtos.Data.Player.PlayerReputation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Player.PlayerReputation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long accountAgeMs_ ;
    /**
     * <code>int64 account_age_ms = 1;</code>
     * @return The accountAgeMs.
     */
    @java.lang.Override
    public long getAccountAgeMs() {
      return accountAgeMs_;
    }
    /**
     * <code>int64 account_age_ms = 1;</code>
     * @param value The accountAgeMs to set.
     * @return This builder for chaining.
     */
    public Builder setAccountAgeMs(long value) {
      
      accountAgeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 account_age_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountAgeMs() {
      
      accountAgeMs_ = 0L;
      onChanged();
      return this;
    }

    private long playerLevel_ ;
    /**
     * <code>int64 player_level = 2;</code>
     * @return The playerLevel.
     */
    @java.lang.Override
    public long getPlayerLevel() {
      return playerLevel_;
    }
    /**
     * <code>int64 player_level = 2;</code>
     * @param value The playerLevel to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLevel(long value) {
      
      playerLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 player_level = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLevel() {
      
      playerLevel_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> cheatReputation_ =
      java.util.Collections.emptyList();
    private void ensureCheatReputationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cheatReputation_ = new java.util.ArrayList<java.lang.Integer>(cheatReputation_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @return A list containing the cheatReputation.
     */
    public java.util.List<POGOProtos.Data.Player.PlayerReputation.CheatReputation> getCheatReputationList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Data.Player.PlayerReputation.CheatReputation>(cheatReputation_, cheatReputation_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @return The count of cheatReputation.
     */
    public int getCheatReputationCount() {
      return cheatReputation_.size();
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param index The index of the element to return.
     * @return The cheatReputation at the given index.
     */
    public POGOProtos.Data.Player.PlayerReputation.CheatReputation getCheatReputation(int index) {
      return cheatReputation_converter_.convert(cheatReputation_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param index The index to set the value at.
     * @param value The cheatReputation to set.
     * @return This builder for chaining.
     */
    public Builder setCheatReputation(
        int index, POGOProtos.Data.Player.PlayerReputation.CheatReputation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCheatReputationIsMutable();
      cheatReputation_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param value The cheatReputation to add.
     * @return This builder for chaining.
     */
    public Builder addCheatReputation(POGOProtos.Data.Player.PlayerReputation.CheatReputation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCheatReputationIsMutable();
      cheatReputation_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param values The cheatReputation to add.
     * @return This builder for chaining.
     */
    public Builder addAllCheatReputation(
        java.lang.Iterable<? extends POGOProtos.Data.Player.PlayerReputation.CheatReputation> values) {
      ensureCheatReputationIsMutable();
      for (POGOProtos.Data.Player.PlayerReputation.CheatReputation value : values) {
        cheatReputation_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCheatReputation() {
      cheatReputation_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @return A list containing the enum numeric values on the wire for cheatReputation.
     */
    public java.util.List<java.lang.Integer>
    getCheatReputationValueList() {
      return java.util.Collections.unmodifiableList(cheatReputation_);
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of cheatReputation at the given index.
     */
    public int getCheatReputationValue(int index) {
      return cheatReputation_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of cheatReputation at the given index.
     * @return This builder for chaining.
     */
    public Builder setCheatReputationValue(
        int index, int value) {
      ensureCheatReputationIsMutable();
      cheatReputation_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param value The enum numeric value on the wire for cheatReputation to add.
     * @return This builder for chaining.
     */
    public Builder addCheatReputationValue(int value) {
      ensureCheatReputationIsMutable();
      cheatReputation_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Player.PlayerReputation.CheatReputation cheat_reputation = 3;</code>
     * @param values The enum numeric values on the wire for cheatReputation to add.
     * @return This builder for chaining.
     */
    public Builder addAllCheatReputationValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCheatReputationIsMutable();
      for (int value : values) {
        cheatReputation_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean isMinor_ ;
    /**
     * <code>bool is_minor = 4;</code>
     * @return The isMinor.
     */
    @java.lang.Override
    public boolean getIsMinor() {
      return isMinor_;
    }
    /**
     * <code>bool is_minor = 4;</code>
     * @param value The isMinor to set.
     * @return This builder for chaining.
     */
    public Builder setIsMinor(boolean value) {
      
      isMinor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_minor = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsMinor() {
      
      isMinor_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Player.PlayerReputation)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Player.PlayerReputation)
  private static final POGOProtos.Data.Player.PlayerReputation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Player.PlayerReputation();
  }

  public static POGOProtos.Data.Player.PlayerReputation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerReputation>
      PARSER = new com.google.protobuf.AbstractParser<PlayerReputation>() {
    @java.lang.Override
    public PlayerReputation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerReputation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerReputation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerReputation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Player.PlayerReputation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

