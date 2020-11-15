// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/OpenNpcCombatSessionResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse}
 */
public final class OpenNpcCombatSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse)
    OpenNpcCombatSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenNpcCombatSessionResponse.newBuilder() to construct.
  private OpenNpcCombatSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenNpcCombatSessionResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenNpcCombatSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenNpcCombatSessionResponse(
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
            POGOProtos.Data.Combat.Combat.Builder subBuilder = null;
            if (combat_ != null) {
              subBuilder = combat_.toBuilder();
            }
            combat_ = input.readMessage(POGOProtos.Data.Combat.Combat.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(combat_);
              combat_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenNpcCombatSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenNpcCombatSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.class, POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result}
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
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 2;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(2),
    /**
     * <code>ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE = 3;</code>
     */
    ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE(3),
    /**
     * <code>ERROR_ACCESS_DENIED = 4;</code>
     */
    ERROR_ACCESS_DENIED(4),
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
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 2;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 2;
    /**
     * <code>ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE = 3;</code>
     */
    public static final int ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE_VALUE = 3;
    /**
     * <code>ERROR_ACCESS_DENIED = 4;</code>
     */
    public static final int ERROR_ACCESS_DENIED_VALUE = 4;


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
        case 2: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 3: return ERROR_POKEMON_LINEUP_INELIGIBLE_FOR_LEAGUE;
        case 4: return ERROR_ACCESS_DENIED;
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
      return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result.UNRECOGNIZED : result;
  }

  public static final int COMBAT_FIELD_NUMBER = 2;
  private POGOProtos.Data.Combat.Combat combat_;
  /**
   * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
   * @return Whether the combat field is set.
   */
  @java.lang.Override
  public boolean hasCombat() {
    return combat_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
   * @return The combat.
   */
  @java.lang.Override
  public POGOProtos.Data.Combat.Combat getCombat() {
    return combat_ == null ? POGOProtos.Data.Combat.Combat.getDefaultInstance() : combat_;
  }
  /**
   * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Combat.CombatOrBuilder getCombatOrBuilder() {
    return getCombat();
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
    if (result_ != POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (combat_ != null) {
      output.writeMessage(2, getCombat());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (combat_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCombat());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse other = (POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse) obj;

    if (result_ != other.result_) return false;
    if (hasCombat() != other.hasCombat()) return false;
    if (hasCombat()) {
      if (!getCombat()
          .equals(other.getCombat())) return false;
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
    if (hasCombat()) {
      hash = (37 * hash) + COMBAT_FIELD_NUMBER;
      hash = (53 * hash) + getCombat().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse)
      POGOProtos.Networking.Responses.OpenNpcCombatSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenNpcCombatSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenNpcCombatSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.class, POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.newBuilder()
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

      if (combatBuilder_ == null) {
        combat_ = null;
      } else {
        combat_ = null;
        combatBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponseOuterClass.internal_static_POGOProtos_Networking_Responses_OpenNpcCombatSessionResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse build() {
      POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse buildPartial() {
      POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse result = new POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse(this);
      result.result_ = result_;
      if (combatBuilder_ == null) {
        result.combat_ = combat_;
      } else {
        result.combat_ = combatBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse other) {
      if (other == POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasCombat()) {
        mergeCombat(other.getCombat());
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
      POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Combat.Combat combat_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Combat.Combat, POGOProtos.Data.Combat.Combat.Builder, POGOProtos.Data.Combat.CombatOrBuilder> combatBuilder_;
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     * @return Whether the combat field is set.
     */
    public boolean hasCombat() {
      return combatBuilder_ != null || combat_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     * @return The combat.
     */
    public POGOProtos.Data.Combat.Combat getCombat() {
      if (combatBuilder_ == null) {
        return combat_ == null ? POGOProtos.Data.Combat.Combat.getDefaultInstance() : combat_;
      } else {
        return combatBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    public Builder setCombat(POGOProtos.Data.Combat.Combat value) {
      if (combatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        combat_ = value;
        onChanged();
      } else {
        combatBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    public Builder setCombat(
        POGOProtos.Data.Combat.Combat.Builder builderForValue) {
      if (combatBuilder_ == null) {
        combat_ = builderForValue.build();
        onChanged();
      } else {
        combatBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    public Builder mergeCombat(POGOProtos.Data.Combat.Combat value) {
      if (combatBuilder_ == null) {
        if (combat_ != null) {
          combat_ =
            POGOProtos.Data.Combat.Combat.newBuilder(combat_).mergeFrom(value).buildPartial();
        } else {
          combat_ = value;
        }
        onChanged();
      } else {
        combatBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    public Builder clearCombat() {
      if (combatBuilder_ == null) {
        combat_ = null;
        onChanged();
      } else {
        combat_ = null;
        combatBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    public POGOProtos.Data.Combat.Combat.Builder getCombatBuilder() {
      
      onChanged();
      return getCombatFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    public POGOProtos.Data.Combat.CombatOrBuilder getCombatOrBuilder() {
      if (combatBuilder_ != null) {
        return combatBuilder_.getMessageOrBuilder();
      } else {
        return combat_ == null ?
            POGOProtos.Data.Combat.Combat.getDefaultInstance() : combat_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Combat.Combat combat = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Combat.Combat, POGOProtos.Data.Combat.Combat.Builder, POGOProtos.Data.Combat.CombatOrBuilder> 
        getCombatFieldBuilder() {
      if (combatBuilder_ == null) {
        combatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Combat.Combat, POGOProtos.Data.Combat.Combat.Builder, POGOProtos.Data.Combat.CombatOrBuilder>(
                getCombat(),
                getParentForChildren(),
                isClean());
        combat_ = null;
      }
      return combatBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse)
  private static final POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse();
  }

  public static POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenNpcCombatSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<OpenNpcCombatSessionResponse>() {
    @java.lang.Override
    public OpenNpcCombatSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenNpcCombatSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenNpcCombatSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenNpcCombatSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.OpenNpcCombatSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

