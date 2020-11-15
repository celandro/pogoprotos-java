// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CancelCombatChallengeResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.CancelCombatChallengeResponse}
 */
public final class CancelCombatChallengeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.CancelCombatChallengeResponse)
    CancelCombatChallengeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CancelCombatChallengeResponse.newBuilder() to construct.
  private CancelCombatChallengeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CancelCombatChallengeResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CancelCombatChallengeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CancelCombatChallengeResponse(
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
    return POGOProtos.Networking.Responses.CancelCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CancelCombatChallengeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.CancelCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CancelCombatChallengeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.CancelCombatChallengeResponse.class, POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result}
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
     * <code>ERROR_ALREADY_ACCEPTED = 4;</code>
     */
    ERROR_ALREADY_ACCEPTED(4),
    /**
     * <code>ERROR_ALREADY_DECLINED = 5;</code>
     */
    ERROR_ALREADY_DECLINED(5),
    /**
     * <code>ERROR_ALREADY_TIMEDOUT = 6;</code>
     */
    ERROR_ALREADY_TIMEDOUT(6),
    /**
     * <code>ERROR_ACCESS_DENIED = 7;</code>
     */
    ERROR_ACCESS_DENIED(7),
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
     * <code>ERROR_ALREADY_ACCEPTED = 4;</code>
     */
    public static final int ERROR_ALREADY_ACCEPTED_VALUE = 4;
    /**
     * <code>ERROR_ALREADY_DECLINED = 5;</code>
     */
    public static final int ERROR_ALREADY_DECLINED_VALUE = 5;
    /**
     * <code>ERROR_ALREADY_TIMEDOUT = 6;</code>
     */
    public static final int ERROR_ALREADY_TIMEDOUT_VALUE = 6;
    /**
     * <code>ERROR_ACCESS_DENIED = 7;</code>
     */
    public static final int ERROR_ACCESS_DENIED_VALUE = 7;


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
        case 4: return ERROR_ALREADY_ACCEPTED;
        case 5: return ERROR_ALREADY_DECLINED;
        case 6: return ERROR_ALREADY_TIMEDOUT;
        case 7: return ERROR_ACCESS_DENIED;
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
      return POGOProtos.Networking.Responses.CancelCombatChallengeResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result.UNRECOGNIZED : result;
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
    if (result_ != POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.CancelCombatChallengeResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.CancelCombatChallengeResponse other = (POGOProtos.Networking.Responses.CancelCombatChallengeResponse) obj;

    if (result_ != other.result_) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.CancelCombatChallengeResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.CancelCombatChallengeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.CancelCombatChallengeResponse)
      POGOProtos.Networking.Responses.CancelCombatChallengeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.CancelCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CancelCombatChallengeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.CancelCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CancelCombatChallengeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.CancelCombatChallengeResponse.class, POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.CancelCombatChallengeResponse.newBuilder()
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

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.CancelCombatChallengeResponseOuterClass.internal_static_POGOProtos_Networking_Responses_CancelCombatChallengeResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.CancelCombatChallengeResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.CancelCombatChallengeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.CancelCombatChallengeResponse build() {
      POGOProtos.Networking.Responses.CancelCombatChallengeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.CancelCombatChallengeResponse buildPartial() {
      POGOProtos.Networking.Responses.CancelCombatChallengeResponse result = new POGOProtos.Networking.Responses.CancelCombatChallengeResponse(this);
      result.result_ = result_;
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
      if (other instanceof POGOProtos.Networking.Responses.CancelCombatChallengeResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.CancelCombatChallengeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.CancelCombatChallengeResponse other) {
      if (other == POGOProtos.Networking.Responses.CancelCombatChallengeResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
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
      POGOProtos.Networking.Responses.CancelCombatChallengeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.CancelCombatChallengeResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.CancelCombatChallengeResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.CancelCombatChallengeResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.CancelCombatChallengeResponse)
  private static final POGOProtos.Networking.Responses.CancelCombatChallengeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.CancelCombatChallengeResponse();
  }

  public static POGOProtos.Networking.Responses.CancelCombatChallengeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CancelCombatChallengeResponse>
      PARSER = new com.google.protobuf.AbstractParser<CancelCombatChallengeResponse>() {
    @java.lang.Override
    public CancelCombatChallengeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CancelCombatChallengeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CancelCombatChallengeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CancelCombatChallengeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.CancelCombatChallengeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

