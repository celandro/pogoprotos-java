// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.VsSeekerBattleResult}
 */
public  final class VsSeekerBattleResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.VsSeekerBattleResult)
    VsSeekerBattleResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VsSeekerBattleResult.newBuilder() to construct.
  private VsSeekerBattleResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VsSeekerBattleResult() {
    battleResult_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VsSeekerBattleResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VsSeekerBattleResult(
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

            battleResult_ = rawValue;
            break;
          }
          case 16: {

            rewardsClaimed_ = input.readBool();
            break;
          }
          case 24: {

            isPendingPokemonReward_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_VsSeekerBattleResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_VsSeekerBattleResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.VsSeekerBattleResult.class, POGOProtos.Rpc.VsSeekerBattleResult.Builder.class);
  }

  public static final int BATTLE_RESULT_FIELD_NUMBER = 1;
  private int battleResult_;
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
   * @return The enum numeric value on the wire for battleResult.
   */
  public int getBattleResultValue() {
    return battleResult_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
   * @return The battleResult.
   */
  public POGOProtos.Rpc.CombatPlayerFinishState getBattleResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CombatPlayerFinishState result = POGOProtos.Rpc.CombatPlayerFinishState.valueOf(battleResult_);
    return result == null ? POGOProtos.Rpc.CombatPlayerFinishState.UNRECOGNIZED : result;
  }

  public static final int REWARDS_CLAIMED_FIELD_NUMBER = 2;
  private boolean rewardsClaimed_;
  /**
   * <code>bool rewards_claimed = 2;</code>
   * @return The rewardsClaimed.
   */
  public boolean getRewardsClaimed() {
    return rewardsClaimed_;
  }

  public static final int IS_PENDING_POKEMON_REWARD_FIELD_NUMBER = 3;
  private boolean isPendingPokemonReward_;
  /**
   * <code>bool is_pending_pokemon_reward = 3;</code>
   * @return The isPendingPokemonReward.
   */
  public boolean getIsPendingPokemonReward() {
    return isPendingPokemonReward_;
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
    if (battleResult_ != POGOProtos.Rpc.CombatPlayerFinishState.COMBAT_PLAYER_FINISH_STATE_WINNER.getNumber()) {
      output.writeEnum(1, battleResult_);
    }
    if (rewardsClaimed_ != false) {
      output.writeBool(2, rewardsClaimed_);
    }
    if (isPendingPokemonReward_ != false) {
      output.writeBool(3, isPendingPokemonReward_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (battleResult_ != POGOProtos.Rpc.CombatPlayerFinishState.COMBAT_PLAYER_FINISH_STATE_WINNER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, battleResult_);
    }
    if (rewardsClaimed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, rewardsClaimed_);
    }
    if (isPendingPokemonReward_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isPendingPokemonReward_);
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
    if (!(obj instanceof POGOProtos.Rpc.VsSeekerBattleResult)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.VsSeekerBattleResult other = (POGOProtos.Rpc.VsSeekerBattleResult) obj;

    if (battleResult_ != other.battleResult_) return false;
    if (getRewardsClaimed()
        != other.getRewardsClaimed()) return false;
    if (getIsPendingPokemonReward()
        != other.getIsPendingPokemonReward()) return false;
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
    hash = (37 * hash) + BATTLE_RESULT_FIELD_NUMBER;
    hash = (53 * hash) + battleResult_;
    hash = (37 * hash) + REWARDS_CLAIMED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRewardsClaimed());
    hash = (37 * hash) + IS_PENDING_POKEMON_REWARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPendingPokemonReward());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerBattleResult parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.VsSeekerBattleResult prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.VsSeekerBattleResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.VsSeekerBattleResult)
      POGOProtos.Rpc.VsSeekerBattleResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_VsSeekerBattleResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_VsSeekerBattleResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.VsSeekerBattleResult.class, POGOProtos.Rpc.VsSeekerBattleResult.Builder.class);
    }

    // Construct using POGOProtos.Rpc.VsSeekerBattleResult.newBuilder()
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
      battleResult_ = 0;

      rewardsClaimed_ = false;

      isPendingPokemonReward_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_VsSeekerBattleResult_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerBattleResult getDefaultInstanceForType() {
      return POGOProtos.Rpc.VsSeekerBattleResult.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerBattleResult build() {
      POGOProtos.Rpc.VsSeekerBattleResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerBattleResult buildPartial() {
      POGOProtos.Rpc.VsSeekerBattleResult result = new POGOProtos.Rpc.VsSeekerBattleResult(this);
      result.battleResult_ = battleResult_;
      result.rewardsClaimed_ = rewardsClaimed_;
      result.isPendingPokemonReward_ = isPendingPokemonReward_;
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
      if (other instanceof POGOProtos.Rpc.VsSeekerBattleResult) {
        return mergeFrom((POGOProtos.Rpc.VsSeekerBattleResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.VsSeekerBattleResult other) {
      if (other == POGOProtos.Rpc.VsSeekerBattleResult.getDefaultInstance()) return this;
      if (other.battleResult_ != 0) {
        setBattleResultValue(other.getBattleResultValue());
      }
      if (other.getRewardsClaimed() != false) {
        setRewardsClaimed(other.getRewardsClaimed());
      }
      if (other.getIsPendingPokemonReward() != false) {
        setIsPendingPokemonReward(other.getIsPendingPokemonReward());
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
      POGOProtos.Rpc.VsSeekerBattleResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.VsSeekerBattleResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int battleResult_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
     * @return The enum numeric value on the wire for battleResult.
     */
    public int getBattleResultValue() {
      return battleResult_;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
     * @param value The enum numeric value on the wire for battleResult to set.
     * @return This builder for chaining.
     */
    public Builder setBattleResultValue(int value) {
      battleResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
     * @return The battleResult.
     */
    public POGOProtos.Rpc.CombatPlayerFinishState getBattleResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CombatPlayerFinishState result = POGOProtos.Rpc.CombatPlayerFinishState.valueOf(battleResult_);
      return result == null ? POGOProtos.Rpc.CombatPlayerFinishState.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
     * @param value The battleResult to set.
     * @return This builder for chaining.
     */
    public Builder setBattleResult(POGOProtos.Rpc.CombatPlayerFinishState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      battleResult_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatPlayerFinishState battle_result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBattleResult() {
      
      battleResult_ = 0;
      onChanged();
      return this;
    }

    private boolean rewardsClaimed_ ;
    /**
     * <code>bool rewards_claimed = 2;</code>
     * @return The rewardsClaimed.
     */
    public boolean getRewardsClaimed() {
      return rewardsClaimed_;
    }
    /**
     * <code>bool rewards_claimed = 2;</code>
     * @param value The rewardsClaimed to set.
     * @return This builder for chaining.
     */
    public Builder setRewardsClaimed(boolean value) {
      
      rewardsClaimed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool rewards_claimed = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRewardsClaimed() {
      
      rewardsClaimed_ = false;
      onChanged();
      return this;
    }

    private boolean isPendingPokemonReward_ ;
    /**
     * <code>bool is_pending_pokemon_reward = 3;</code>
     * @return The isPendingPokemonReward.
     */
    public boolean getIsPendingPokemonReward() {
      return isPendingPokemonReward_;
    }
    /**
     * <code>bool is_pending_pokemon_reward = 3;</code>
     * @param value The isPendingPokemonReward to set.
     * @return This builder for chaining.
     */
    public Builder setIsPendingPokemonReward(boolean value) {
      
      isPendingPokemonReward_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_pending_pokemon_reward = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPendingPokemonReward() {
      
      isPendingPokemonReward_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.VsSeekerBattleResult)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.VsSeekerBattleResult)
  private static final POGOProtos.Rpc.VsSeekerBattleResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.VsSeekerBattleResult();
  }

  public static POGOProtos.Rpc.VsSeekerBattleResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VsSeekerBattleResult>
      PARSER = new com.google.protobuf.AbstractParser<VsSeekerBattleResult>() {
    @java.lang.Override
    public VsSeekerBattleResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VsSeekerBattleResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VsSeekerBattleResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VsSeekerBattleResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.VsSeekerBattleResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

