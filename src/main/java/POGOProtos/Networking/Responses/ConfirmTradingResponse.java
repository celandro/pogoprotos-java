// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/ConfirmTradingResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.ConfirmTradingResponse}
 */
public final class ConfirmTradingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.ConfirmTradingResponse)
    ConfirmTradingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfirmTradingResponse.newBuilder() to construct.
  private ConfirmTradingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfirmTradingResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConfirmTradingResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConfirmTradingResponse(
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
            POGOProtos.Data.Trading.Trading.Builder subBuilder = null;
            if (trading_ != null) {
              subBuilder = trading_.toBuilder();
            }
            trading_ = input.readMessage(POGOProtos.Data.Trading.Trading.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(trading_);
              trading_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.ConfirmTradingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ConfirmTradingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.ConfirmTradingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ConfirmTradingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.ConfirmTradingResponse.class, POGOProtos.Networking.Responses.ConfirmTradingResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.ConfirmTradingResponse.Result}
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 3;</code>
     */
    ERROR_FRIEND_NOT_FOUND(3),
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    ERROR_INVALID_PLAYER_ID(4),
    /**
     * <code>ERROR_INVALID_STATE = 5;</code>
     */
    ERROR_INVALID_STATE(5),
    /**
     * <code>ERROR_STATE_HANDLER = 6;</code>
     */
    ERROR_STATE_HANDLER(6),
    /**
     * <code>ERROR_INVALID_POKEMON = 7;</code>
     */
    ERROR_INVALID_POKEMON(7),
    /**
     * <code>ERROR_INSUFFICIENT_PAYMENT = 8;</code>
     */
    ERROR_INSUFFICIENT_PAYMENT(8),
    /**
     * <code>ERROR_NO_PLAYER_POKEMON = 9;</code>
     */
    ERROR_NO_PLAYER_POKEMON(9),
    /**
     * <code>ERROR_NO_FRIEND_POKEMON = 10;</code>
     */
    ERROR_NO_FRIEND_POKEMON(10),
    /**
     * <code>ERROR_PLAYER_ALREADY_CONFIRMED = 11;</code>
     */
    ERROR_PLAYER_ALREADY_CONFIRMED(11),
    /**
     * <code>ERROR_TRANSACTION_LOG_NOT_MATCH = 12;</code>
     */
    ERROR_TRANSACTION_LOG_NOT_MATCH(12),
    /**
     * <code>ERROR_TRADING_EXPIRED = 13;</code>
     */
    ERROR_TRADING_EXPIRED(13),
    /**
     * <code>ERROR_TRANSACTION = 14;</code>
     */
    ERROR_TRANSACTION(14),
    /**
     * <code>ERROR_DAILY_LIMIT_REACHED = 15;</code>
     */
    ERROR_DAILY_LIMIT_REACHED(15),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_INVALID_PLAYER_ID = 4;</code>
     */
    public static final int ERROR_INVALID_PLAYER_ID_VALUE = 4;
    /**
     * <code>ERROR_INVALID_STATE = 5;</code>
     */
    public static final int ERROR_INVALID_STATE_VALUE = 5;
    /**
     * <code>ERROR_STATE_HANDLER = 6;</code>
     */
    public static final int ERROR_STATE_HANDLER_VALUE = 6;
    /**
     * <code>ERROR_INVALID_POKEMON = 7;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 7;
    /**
     * <code>ERROR_INSUFFICIENT_PAYMENT = 8;</code>
     */
    public static final int ERROR_INSUFFICIENT_PAYMENT_VALUE = 8;
    /**
     * <code>ERROR_NO_PLAYER_POKEMON = 9;</code>
     */
    public static final int ERROR_NO_PLAYER_POKEMON_VALUE = 9;
    /**
     * <code>ERROR_NO_FRIEND_POKEMON = 10;</code>
     */
    public static final int ERROR_NO_FRIEND_POKEMON_VALUE = 10;
    /**
     * <code>ERROR_PLAYER_ALREADY_CONFIRMED = 11;</code>
     */
    public static final int ERROR_PLAYER_ALREADY_CONFIRMED_VALUE = 11;
    /**
     * <code>ERROR_TRANSACTION_LOG_NOT_MATCH = 12;</code>
     */
    public static final int ERROR_TRANSACTION_LOG_NOT_MATCH_VALUE = 12;
    /**
     * <code>ERROR_TRADING_EXPIRED = 13;</code>
     */
    public static final int ERROR_TRADING_EXPIRED_VALUE = 13;
    /**
     * <code>ERROR_TRANSACTION = 14;</code>
     */
    public static final int ERROR_TRANSACTION_VALUE = 14;
    /**
     * <code>ERROR_DAILY_LIMIT_REACHED = 15;</code>
     */
    public static final int ERROR_DAILY_LIMIT_REACHED_VALUE = 15;


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
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_FRIEND_NOT_FOUND;
        case 4: return ERROR_INVALID_PLAYER_ID;
        case 5: return ERROR_INVALID_STATE;
        case 6: return ERROR_STATE_HANDLER;
        case 7: return ERROR_INVALID_POKEMON;
        case 8: return ERROR_INSUFFICIENT_PAYMENT;
        case 9: return ERROR_NO_PLAYER_POKEMON;
        case 10: return ERROR_NO_FRIEND_POKEMON;
        case 11: return ERROR_PLAYER_ALREADY_CONFIRMED;
        case 12: return ERROR_TRANSACTION_LOG_NOT_MATCH;
        case 13: return ERROR_TRADING_EXPIRED;
        case 14: return ERROR_TRANSACTION;
        case 15: return ERROR_DAILY_LIMIT_REACHED;
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
      return POGOProtos.Networking.Responses.ConfirmTradingResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.ConfirmTradingResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.ConfirmTradingResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = POGOProtos.Networking.Responses.ConfirmTradingResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.ConfirmTradingResponse.Result.UNRECOGNIZED : result;
  }

  public static final int TRADING_FIELD_NUMBER = 2;
  private POGOProtos.Data.Trading.Trading trading_;
  /**
   * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
   * @return Whether the trading field is set.
   */
  @java.lang.Override
  public boolean hasTrading() {
    return trading_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
   * @return The trading.
   */
  @java.lang.Override
  public POGOProtos.Data.Trading.Trading getTrading() {
    return trading_ == null ? POGOProtos.Data.Trading.Trading.getDefaultInstance() : trading_;
  }
  /**
   * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Trading.TradingOrBuilder getTradingOrBuilder() {
    return getTrading();
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
    if (result_ != POGOProtos.Networking.Responses.ConfirmTradingResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (trading_ != null) {
      output.writeMessage(2, getTrading());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.ConfirmTradingResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (trading_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTrading());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.ConfirmTradingResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.ConfirmTradingResponse other = (POGOProtos.Networking.Responses.ConfirmTradingResponse) obj;

    if (result_ != other.result_) return false;
    if (hasTrading() != other.hasTrading()) return false;
    if (hasTrading()) {
      if (!getTrading()
          .equals(other.getTrading())) return false;
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
    if (hasTrading()) {
      hash = (37 * hash) + TRADING_FIELD_NUMBER;
      hash = (53 * hash) + getTrading().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.ConfirmTradingResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.ConfirmTradingResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.ConfirmTradingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.ConfirmTradingResponse)
      POGOProtos.Networking.Responses.ConfirmTradingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.ConfirmTradingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ConfirmTradingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.ConfirmTradingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ConfirmTradingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.ConfirmTradingResponse.class, POGOProtos.Networking.Responses.ConfirmTradingResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.ConfirmTradingResponse.newBuilder()
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

      if (tradingBuilder_ == null) {
        trading_ = null;
      } else {
        trading_ = null;
        tradingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.ConfirmTradingResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ConfirmTradingResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.ConfirmTradingResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.ConfirmTradingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.ConfirmTradingResponse build() {
      POGOProtos.Networking.Responses.ConfirmTradingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.ConfirmTradingResponse buildPartial() {
      POGOProtos.Networking.Responses.ConfirmTradingResponse result = new POGOProtos.Networking.Responses.ConfirmTradingResponse(this);
      result.result_ = result_;
      if (tradingBuilder_ == null) {
        result.trading_ = trading_;
      } else {
        result.trading_ = tradingBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.ConfirmTradingResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.ConfirmTradingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.ConfirmTradingResponse other) {
      if (other == POGOProtos.Networking.Responses.ConfirmTradingResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasTrading()) {
        mergeTrading(other.getTrading());
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
      POGOProtos.Networking.Responses.ConfirmTradingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.ConfirmTradingResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.ConfirmTradingResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = POGOProtos.Networking.Responses.ConfirmTradingResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.ConfirmTradingResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.ConfirmTradingResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ConfirmTradingResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Trading.Trading trading_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Trading.Trading, POGOProtos.Data.Trading.Trading.Builder, POGOProtos.Data.Trading.TradingOrBuilder> tradingBuilder_;
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     * @return Whether the trading field is set.
     */
    public boolean hasTrading() {
      return tradingBuilder_ != null || trading_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     * @return The trading.
     */
    public POGOProtos.Data.Trading.Trading getTrading() {
      if (tradingBuilder_ == null) {
        return trading_ == null ? POGOProtos.Data.Trading.Trading.getDefaultInstance() : trading_;
      } else {
        return tradingBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    public Builder setTrading(POGOProtos.Data.Trading.Trading value) {
      if (tradingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trading_ = value;
        onChanged();
      } else {
        tradingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    public Builder setTrading(
        POGOProtos.Data.Trading.Trading.Builder builderForValue) {
      if (tradingBuilder_ == null) {
        trading_ = builderForValue.build();
        onChanged();
      } else {
        tradingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    public Builder mergeTrading(POGOProtos.Data.Trading.Trading value) {
      if (tradingBuilder_ == null) {
        if (trading_ != null) {
          trading_ =
            POGOProtos.Data.Trading.Trading.newBuilder(trading_).mergeFrom(value).buildPartial();
        } else {
          trading_ = value;
        }
        onChanged();
      } else {
        tradingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    public Builder clearTrading() {
      if (tradingBuilder_ == null) {
        trading_ = null;
        onChanged();
      } else {
        trading_ = null;
        tradingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    public POGOProtos.Data.Trading.Trading.Builder getTradingBuilder() {
      
      onChanged();
      return getTradingFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    public POGOProtos.Data.Trading.TradingOrBuilder getTradingOrBuilder() {
      if (tradingBuilder_ != null) {
        return tradingBuilder_.getMessageOrBuilder();
      } else {
        return trading_ == null ?
            POGOProtos.Data.Trading.Trading.getDefaultInstance() : trading_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Trading.Trading trading = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Trading.Trading, POGOProtos.Data.Trading.Trading.Builder, POGOProtos.Data.Trading.TradingOrBuilder> 
        getTradingFieldBuilder() {
      if (tradingBuilder_ == null) {
        tradingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Trading.Trading, POGOProtos.Data.Trading.Trading.Builder, POGOProtos.Data.Trading.TradingOrBuilder>(
                getTrading(),
                getParentForChildren(),
                isClean());
        trading_ = null;
      }
      return tradingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.ConfirmTradingResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.ConfirmTradingResponse)
  private static final POGOProtos.Networking.Responses.ConfirmTradingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.ConfirmTradingResponse();
  }

  public static POGOProtos.Networking.Responses.ConfirmTradingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfirmTradingResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConfirmTradingResponse>() {
    @java.lang.Override
    public ConfirmTradingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConfirmTradingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConfirmTradingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfirmTradingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.ConfirmTradingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

