// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/OpenCombatChallengeResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.OpenCombatChallengeResponse}
 */
public  final class OpenCombatChallengeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.OpenCombatChallengeResponse)
    OpenCombatChallengeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenCombatChallengeResponse.newBuilder() to construct.
  private OpenCombatChallengeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenCombatChallengeResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenCombatChallengeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenCombatChallengeResponse(
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
            POGOProtos.Data.Combat.CombatChallenge.Builder subBuilder = null;
            if (challenge_ != null) {
              subBuilder = challenge_.toBuilder();
            }
            challenge_ = input.readMessage(POGOProtos.Data.Combat.CombatChallenge.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(challenge_);
              challenge_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.OpenCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenCombatChallengeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.OpenCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenCombatChallengeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.OpenCombatChallengeResponse.class, POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result}
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
     * <code>ERROR_INVALID_CHALLENGE_STATE = 2;</code>
     */
    ERROR_INVALID_CHALLENGE_STATE(2),
    /**
     * <code>ERROR_CHALLENGE_NOT_FOUND = 3;</code>
     */
    ERROR_CHALLENGE_NOT_FOUND(3),
    /**
     * <code>ERROR_POKEMON_NOT_IN_INVENTORY = 4;</code>
     */
    ERROR_POKEMON_NOT_IN_INVENTORY(4),
    /**
     * <code>ERROR_NOT_ELIGIBLE_LEAGUE = 5;</code>
     */
    ERROR_NOT_ELIGIBLE_LEAGUE(5),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 6;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(6),
    /**
     * <code>ERROR_ALREADY_TIMEDOUT = 8;</code>
     */
    ERROR_ALREADY_TIMEDOUT(8),
    /**
     * <code>ERROR_ALREADY_CANCELLED = 9;</code>
     */
    ERROR_ALREADY_CANCELLED(9),
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 10;</code>
     */
    ERROR_FRIEND_NOT_FOUND(10),
    /**
     * <code>ERROR_FAILED_TO_SEND_NOTIFICATION = 11;</code>
     */
    ERROR_FAILED_TO_SEND_NOTIFICATION(11),
    /**
     * <code>ERROR_ACCESS_DENIED = 12;</code>
     */
    ERROR_ACCESS_DENIED(12),
    /**
     * <code>ERROR_INELIGIBLE_OPPONENT = 13;</code>
     */
    ERROR_INELIGIBLE_OPPONENT(13),
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
     * <code>ERROR_INVALID_CHALLENGE_STATE = 2;</code>
     */
    public static final int ERROR_INVALID_CHALLENGE_STATE_VALUE = 2;
    /**
     * <code>ERROR_CHALLENGE_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_CHALLENGE_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_POKEMON_NOT_IN_INVENTORY = 4;</code>
     */
    public static final int ERROR_POKEMON_NOT_IN_INVENTORY_VALUE = 4;
    /**
     * <code>ERROR_NOT_ELIGIBLE_LEAGUE = 5;</code>
     */
    public static final int ERROR_NOT_ELIGIBLE_LEAGUE_VALUE = 5;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 6;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 6;
    /**
     * <code>ERROR_ALREADY_TIMEDOUT = 8;</code>
     */
    public static final int ERROR_ALREADY_TIMEDOUT_VALUE = 8;
    /**
     * <code>ERROR_ALREADY_CANCELLED = 9;</code>
     */
    public static final int ERROR_ALREADY_CANCELLED_VALUE = 9;
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 10;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 10;
    /**
     * <code>ERROR_FAILED_TO_SEND_NOTIFICATION = 11;</code>
     */
    public static final int ERROR_FAILED_TO_SEND_NOTIFICATION_VALUE = 11;
    /**
     * <code>ERROR_ACCESS_DENIED = 12;</code>
     */
    public static final int ERROR_ACCESS_DENIED_VALUE = 12;
    /**
     * <code>ERROR_INELIGIBLE_OPPONENT = 13;</code>
     */
    public static final int ERROR_INELIGIBLE_OPPONENT_VALUE = 13;


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
        case 2: return ERROR_INVALID_CHALLENGE_STATE;
        case 3: return ERROR_CHALLENGE_NOT_FOUND;
        case 4: return ERROR_POKEMON_NOT_IN_INVENTORY;
        case 5: return ERROR_NOT_ELIGIBLE_LEAGUE;
        case 6: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 8: return ERROR_ALREADY_TIMEDOUT;
        case 9: return ERROR_ALREADY_CANCELLED;
        case 10: return ERROR_FRIEND_NOT_FOUND;
        case 11: return ERROR_FAILED_TO_SEND_NOTIFICATION;
        case 12: return ERROR_ACCESS_DENIED;
        case 13: return ERROR_INELIGIBLE_OPPONENT;
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
      return POGOProtos.Networking.Responses.OpenCombatChallengeResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result.UNRECOGNIZED : result;
  }

  public static final int CHALLENGE_FIELD_NUMBER = 2;
  private POGOProtos.Data.Combat.CombatChallenge challenge_;
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   * @return Whether the challenge field is set.
   */
  public boolean hasChallenge() {
    return challenge_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   * @return The challenge.
   */
  public POGOProtos.Data.Combat.CombatChallenge getChallenge() {
    return challenge_ == null ? POGOProtos.Data.Combat.CombatChallenge.getDefaultInstance() : challenge_;
  }
  /**
   * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
   */
  public POGOProtos.Data.Combat.CombatChallengeOrBuilder getChallengeOrBuilder() {
    return getChallenge();
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
    if (result_ != POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (challenge_ != null) {
      output.writeMessage(2, getChallenge());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (challenge_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChallenge());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.OpenCombatChallengeResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.OpenCombatChallengeResponse other = (POGOProtos.Networking.Responses.OpenCombatChallengeResponse) obj;

    if (result_ != other.result_) return false;
    if (hasChallenge() != other.hasChallenge()) return false;
    if (hasChallenge()) {
      if (!getChallenge()
          .equals(other.getChallenge())) return false;
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
    if (hasChallenge()) {
      hash = (37 * hash) + CHALLENGE_FIELD_NUMBER;
      hash = (53 * hash) + getChallenge().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.OpenCombatChallengeResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.OpenCombatChallengeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.OpenCombatChallengeResponse)
      POGOProtos.Networking.Responses.OpenCombatChallengeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.OpenCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenCombatChallengeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.OpenCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenCombatChallengeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.OpenCombatChallengeResponse.class, POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.OpenCombatChallengeResponse.newBuilder()
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

      if (challengeBuilder_ == null) {
        challenge_ = null;
      } else {
        challenge_ = null;
        challengeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.OpenCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenCombatChallengeResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenCombatChallengeResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.OpenCombatChallengeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenCombatChallengeResponse build() {
      POGOProtos.Networking.Responses.OpenCombatChallengeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenCombatChallengeResponse buildPartial() {
      POGOProtos.Networking.Responses.OpenCombatChallengeResponse result = new POGOProtos.Networking.Responses.OpenCombatChallengeResponse(this);
      result.result_ = result_;
      if (challengeBuilder_ == null) {
        result.challenge_ = challenge_;
      } else {
        result.challenge_ = challengeBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.OpenCombatChallengeResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.OpenCombatChallengeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.OpenCombatChallengeResponse other) {
      if (other == POGOProtos.Networking.Responses.OpenCombatChallengeResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasChallenge()) {
        mergeChallenge(other.getChallenge());
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
      POGOProtos.Networking.Responses.OpenCombatChallengeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.OpenCombatChallengeResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenCombatChallengeResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Combat.CombatChallenge challenge_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Combat.CombatChallenge, POGOProtos.Data.Combat.CombatChallenge.Builder, POGOProtos.Data.Combat.CombatChallengeOrBuilder> challengeBuilder_;
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     * @return Whether the challenge field is set.
     */
    public boolean hasChallenge() {
      return challengeBuilder_ != null || challenge_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     * @return The challenge.
     */
    public POGOProtos.Data.Combat.CombatChallenge getChallenge() {
      if (challengeBuilder_ == null) {
        return challenge_ == null ? POGOProtos.Data.Combat.CombatChallenge.getDefaultInstance() : challenge_;
      } else {
        return challengeBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    public Builder setChallenge(POGOProtos.Data.Combat.CombatChallenge value) {
      if (challengeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        challenge_ = value;
        onChanged();
      } else {
        challengeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    public Builder setChallenge(
        POGOProtos.Data.Combat.CombatChallenge.Builder builderForValue) {
      if (challengeBuilder_ == null) {
        challenge_ = builderForValue.build();
        onChanged();
      } else {
        challengeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    public Builder mergeChallenge(POGOProtos.Data.Combat.CombatChallenge value) {
      if (challengeBuilder_ == null) {
        if (challenge_ != null) {
          challenge_ =
            POGOProtos.Data.Combat.CombatChallenge.newBuilder(challenge_).mergeFrom(value).buildPartial();
        } else {
          challenge_ = value;
        }
        onChanged();
      } else {
        challengeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    public Builder clearChallenge() {
      if (challengeBuilder_ == null) {
        challenge_ = null;
        onChanged();
      } else {
        challenge_ = null;
        challengeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    public POGOProtos.Data.Combat.CombatChallenge.Builder getChallengeBuilder() {
      
      onChanged();
      return getChallengeFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    public POGOProtos.Data.Combat.CombatChallengeOrBuilder getChallengeOrBuilder() {
      if (challengeBuilder_ != null) {
        return challengeBuilder_.getMessageOrBuilder();
      } else {
        return challenge_ == null ?
            POGOProtos.Data.Combat.CombatChallenge.getDefaultInstance() : challenge_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Combat.CombatChallenge challenge = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Combat.CombatChallenge, POGOProtos.Data.Combat.CombatChallenge.Builder, POGOProtos.Data.Combat.CombatChallengeOrBuilder> 
        getChallengeFieldBuilder() {
      if (challengeBuilder_ == null) {
        challengeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Combat.CombatChallenge, POGOProtos.Data.Combat.CombatChallenge.Builder, POGOProtos.Data.Combat.CombatChallengeOrBuilder>(
                getChallenge(),
                getParentForChildren(),
                isClean());
        challenge_ = null;
      }
      return challengeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.OpenCombatChallengeResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.OpenCombatChallengeResponse)
  private static final POGOProtos.Networking.Responses.OpenCombatChallengeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.OpenCombatChallengeResponse();
  }

  public static POGOProtos.Networking.Responses.OpenCombatChallengeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenCombatChallengeResponse>
      PARSER = new com.google.protobuf.AbstractParser<OpenCombatChallengeResponse>() {
    @java.lang.Override
    public OpenCombatChallengeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenCombatChallengeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenCombatChallengeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenCombatChallengeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.OpenCombatChallengeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

