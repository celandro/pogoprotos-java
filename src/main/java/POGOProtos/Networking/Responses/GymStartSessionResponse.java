// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GymStartSessionResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.GymStartSessionResponse}
 */
public  final class GymStartSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.GymStartSessionResponse)
    GymStartSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GymStartSessionResponse.newBuilder() to construct.
  private GymStartSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GymStartSessionResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GymStartSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GymStartSessionResponse(
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
            POGOProtos.Data.Battle.Battle.Builder subBuilder = null;
            if (battle_ != null) {
              subBuilder = battle_.toBuilder();
            }
            battle_ = input.readMessage(POGOProtos.Data.Battle.Battle.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(battle_);
              battle_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.GymStartSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.GymStartSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.GymStartSessionResponse.class, POGOProtos.Networking.Responses.GymStartSessionResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.GymStartSessionResponse.Result}
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
     * <code>ERROR_GYM_NOT_FOUND = 2;</code>
     */
    ERROR_GYM_NOT_FOUND(2),
    /**
     * <code>ERROR_GYM_NEUTRAL = 3;</code>
     */
    ERROR_GYM_NEUTRAL(3),
    /**
     * <code>ERROR_GYM_WRONG_TEAM = 4;</code>
     */
    ERROR_GYM_WRONG_TEAM(4),
    /**
     * <code>ERROR_GYM_EMPTY = 5;</code>
     */
    ERROR_GYM_EMPTY(5),
    /**
     * <code>ERROR_INVALID_DEFENDER = 6;</code>
     */
    ERROR_INVALID_DEFENDER(6),
    /**
     * <code>ERROR_TRAINING_INVALID_ATTACKER_COUNT = 7;</code>
     */
    ERROR_TRAINING_INVALID_ATTACKER_COUNT(7),
    /**
     * <code>ERROR_ALL_POKEMON_FAINTED = 8;</code>
     */
    ERROR_ALL_POKEMON_FAINTED(8),
    /**
     * <code>ERROR_TOO_MANY_BATTLES = 9;</code>
     */
    ERROR_TOO_MANY_BATTLES(9),
    /**
     * <code>ERROR_TOO_MANY_PLAYERS = 10;</code>
     */
    ERROR_TOO_MANY_PLAYERS(10),
    /**
     * <code>ERROR_GYM_BATTLE_LOCKOUT = 11;</code>
     */
    ERROR_GYM_BATTLE_LOCKOUT(11),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 12;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(12),
    /**
     * <code>ERROR_NOT_IN_RANGE = 13;</code>
     */
    ERROR_NOT_IN_RANGE(13),
    /**
     * <code>ERROR_POI_INACCESSIBLE = 14;</code>
     */
    ERROR_POI_INACCESSIBLE(14),
    /**
     * <code>ERROR_RAID_ACTIVE = 15;</code>
     */
    ERROR_RAID_ACTIVE(15),
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
     * <code>ERROR_GYM_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_GYM_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_GYM_NEUTRAL = 3;</code>
     */
    public static final int ERROR_GYM_NEUTRAL_VALUE = 3;
    /**
     * <code>ERROR_GYM_WRONG_TEAM = 4;</code>
     */
    public static final int ERROR_GYM_WRONG_TEAM_VALUE = 4;
    /**
     * <code>ERROR_GYM_EMPTY = 5;</code>
     */
    public static final int ERROR_GYM_EMPTY_VALUE = 5;
    /**
     * <code>ERROR_INVALID_DEFENDER = 6;</code>
     */
    public static final int ERROR_INVALID_DEFENDER_VALUE = 6;
    /**
     * <code>ERROR_TRAINING_INVALID_ATTACKER_COUNT = 7;</code>
     */
    public static final int ERROR_TRAINING_INVALID_ATTACKER_COUNT_VALUE = 7;
    /**
     * <code>ERROR_ALL_POKEMON_FAINTED = 8;</code>
     */
    public static final int ERROR_ALL_POKEMON_FAINTED_VALUE = 8;
    /**
     * <code>ERROR_TOO_MANY_BATTLES = 9;</code>
     */
    public static final int ERROR_TOO_MANY_BATTLES_VALUE = 9;
    /**
     * <code>ERROR_TOO_MANY_PLAYERS = 10;</code>
     */
    public static final int ERROR_TOO_MANY_PLAYERS_VALUE = 10;
    /**
     * <code>ERROR_GYM_BATTLE_LOCKOUT = 11;</code>
     */
    public static final int ERROR_GYM_BATTLE_LOCKOUT_VALUE = 11;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 12;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 12;
    /**
     * <code>ERROR_NOT_IN_RANGE = 13;</code>
     */
    public static final int ERROR_NOT_IN_RANGE_VALUE = 13;
    /**
     * <code>ERROR_POI_INACCESSIBLE = 14;</code>
     */
    public static final int ERROR_POI_INACCESSIBLE_VALUE = 14;
    /**
     * <code>ERROR_RAID_ACTIVE = 15;</code>
     */
    public static final int ERROR_RAID_ACTIVE_VALUE = 15;


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
        case 2: return ERROR_GYM_NOT_FOUND;
        case 3: return ERROR_GYM_NEUTRAL;
        case 4: return ERROR_GYM_WRONG_TEAM;
        case 5: return ERROR_GYM_EMPTY;
        case 6: return ERROR_INVALID_DEFENDER;
        case 7: return ERROR_TRAINING_INVALID_ATTACKER_COUNT;
        case 8: return ERROR_ALL_POKEMON_FAINTED;
        case 9: return ERROR_TOO_MANY_BATTLES;
        case 10: return ERROR_TOO_MANY_PLAYERS;
        case 11: return ERROR_GYM_BATTLE_LOCKOUT;
        case 12: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 13: return ERROR_NOT_IN_RANGE;
        case 14: return ERROR_POI_INACCESSIBLE;
        case 15: return ERROR_RAID_ACTIVE;
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
      return POGOProtos.Networking.Responses.GymStartSessionResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.GymStartSessionResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Networking.Responses.GymStartSessionResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = POGOProtos.Networking.Responses.GymStartSessionResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.GymStartSessionResponse.Result.UNRECOGNIZED : result;
  }

  public static final int BATTLE_FIELD_NUMBER = 2;
  private POGOProtos.Data.Battle.Battle battle_;
  /**
   * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
   * @return Whether the battle field is set.
   */
  public boolean hasBattle() {
    return battle_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
   * @return The battle.
   */
  public POGOProtos.Data.Battle.Battle getBattle() {
    return battle_ == null ? POGOProtos.Data.Battle.Battle.getDefaultInstance() : battle_;
  }
  /**
   * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
   */
  public POGOProtos.Data.Battle.BattleOrBuilder getBattleOrBuilder() {
    return getBattle();
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
    if (result_ != POGOProtos.Networking.Responses.GymStartSessionResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (battle_ != null) {
      output.writeMessage(2, getBattle());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.GymStartSessionResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (battle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBattle());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.GymStartSessionResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.GymStartSessionResponse other = (POGOProtos.Networking.Responses.GymStartSessionResponse) obj;

    if (result_ != other.result_) return false;
    if (hasBattle() != other.hasBattle()) return false;
    if (hasBattle()) {
      if (!getBattle()
          .equals(other.getBattle())) return false;
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
    if (hasBattle()) {
      hash = (37 * hash) + BATTLE_FIELD_NUMBER;
      hash = (53 * hash) + getBattle().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GymStartSessionResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.GymStartSessionResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.GymStartSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.GymStartSessionResponse)
      POGOProtos.Networking.Responses.GymStartSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.GymStartSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.GymStartSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.GymStartSessionResponse.class, POGOProtos.Networking.Responses.GymStartSessionResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.GymStartSessionResponse.newBuilder()
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

      if (battleBuilder_ == null) {
        battle_ = null;
      } else {
        battle_ = null;
        battleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.GymStartSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GymStartSessionResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GymStartSessionResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.GymStartSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GymStartSessionResponse build() {
      POGOProtos.Networking.Responses.GymStartSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GymStartSessionResponse buildPartial() {
      POGOProtos.Networking.Responses.GymStartSessionResponse result = new POGOProtos.Networking.Responses.GymStartSessionResponse(this);
      result.result_ = result_;
      if (battleBuilder_ == null) {
        result.battle_ = battle_;
      } else {
        result.battle_ = battleBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.GymStartSessionResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.GymStartSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.GymStartSessionResponse other) {
      if (other == POGOProtos.Networking.Responses.GymStartSessionResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasBattle()) {
        mergeBattle(other.getBattle());
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
      POGOProtos.Networking.Responses.GymStartSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.GymStartSessionResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Networking.Responses.GymStartSessionResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = POGOProtos.Networking.Responses.GymStartSessionResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.GymStartSessionResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.GymStartSessionResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GymStartSessionResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Battle.Battle battle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Battle.Battle, POGOProtos.Data.Battle.Battle.Builder, POGOProtos.Data.Battle.BattleOrBuilder> battleBuilder_;
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     * @return Whether the battle field is set.
     */
    public boolean hasBattle() {
      return battleBuilder_ != null || battle_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     * @return The battle.
     */
    public POGOProtos.Data.Battle.Battle getBattle() {
      if (battleBuilder_ == null) {
        return battle_ == null ? POGOProtos.Data.Battle.Battle.getDefaultInstance() : battle_;
      } else {
        return battleBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    public Builder setBattle(POGOProtos.Data.Battle.Battle value) {
      if (battleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        battle_ = value;
        onChanged();
      } else {
        battleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    public Builder setBattle(
        POGOProtos.Data.Battle.Battle.Builder builderForValue) {
      if (battleBuilder_ == null) {
        battle_ = builderForValue.build();
        onChanged();
      } else {
        battleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    public Builder mergeBattle(POGOProtos.Data.Battle.Battle value) {
      if (battleBuilder_ == null) {
        if (battle_ != null) {
          battle_ =
            POGOProtos.Data.Battle.Battle.newBuilder(battle_).mergeFrom(value).buildPartial();
        } else {
          battle_ = value;
        }
        onChanged();
      } else {
        battleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    public Builder clearBattle() {
      if (battleBuilder_ == null) {
        battle_ = null;
        onChanged();
      } else {
        battle_ = null;
        battleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    public POGOProtos.Data.Battle.Battle.Builder getBattleBuilder() {
      
      onChanged();
      return getBattleFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    public POGOProtos.Data.Battle.BattleOrBuilder getBattleOrBuilder() {
      if (battleBuilder_ != null) {
        return battleBuilder_.getMessageOrBuilder();
      } else {
        return battle_ == null ?
            POGOProtos.Data.Battle.Battle.getDefaultInstance() : battle_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Battle.Battle battle = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Battle.Battle, POGOProtos.Data.Battle.Battle.Builder, POGOProtos.Data.Battle.BattleOrBuilder> 
        getBattleFieldBuilder() {
      if (battleBuilder_ == null) {
        battleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Battle.Battle, POGOProtos.Data.Battle.Battle.Builder, POGOProtos.Data.Battle.BattleOrBuilder>(
                getBattle(),
                getParentForChildren(),
                isClean());
        battle_ = null;
      }
      return battleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.GymStartSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.GymStartSessionResponse)
  private static final POGOProtos.Networking.Responses.GymStartSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.GymStartSessionResponse();
  }

  public static POGOProtos.Networking.Responses.GymStartSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GymStartSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<GymStartSessionResponse>() {
    @java.lang.Override
    public GymStartSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GymStartSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GymStartSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GymStartSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.GymStartSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

