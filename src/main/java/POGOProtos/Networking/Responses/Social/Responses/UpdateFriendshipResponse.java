// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/UpdateFriendshipResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse}
 */
public final class UpdateFriendshipResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse)
    UpdateFriendshipResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFriendshipResponse.newBuilder() to construct.
  private UpdateFriendshipResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFriendshipResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFriendshipResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateFriendshipResponse(
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
    return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_UpdateFriendshipResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_UpdateFriendshipResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.class, POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result}
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
     * <code>ERROR_NOT_FRIEND = 3;</code>
     */
    ERROR_NOT_FRIEND(3),
    /**
     * <code>ERROR_NICKNAME_WRONG_FORMAT = 4;</code>
     */
    ERROR_NICKNAME_WRONG_FORMAT(4),
    /**
     * <code>ERROR_FILTERED_NICKNAME = 5;</code>
     */
    ERROR_FILTERED_NICKNAME(5),
    /**
     * <code>ERROR_EXCEEDED_CHANGE_LIMIT = 6;</code>
     */
    ERROR_EXCEEDED_CHANGE_LIMIT(6),
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
     * <code>ERROR_NOT_FRIEND = 3;</code>
     */
    public static final int ERROR_NOT_FRIEND_VALUE = 3;
    /**
     * <code>ERROR_NICKNAME_WRONG_FORMAT = 4;</code>
     */
    public static final int ERROR_NICKNAME_WRONG_FORMAT_VALUE = 4;
    /**
     * <code>ERROR_FILTERED_NICKNAME = 5;</code>
     */
    public static final int ERROR_FILTERED_NICKNAME_VALUE = 5;
    /**
     * <code>ERROR_EXCEEDED_CHANGE_LIMIT = 6;</code>
     */
    public static final int ERROR_EXCEEDED_CHANGE_LIMIT_VALUE = 6;


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
        case 3: return ERROR_NOT_FRIEND;
        case 4: return ERROR_NICKNAME_WRONG_FORMAT;
        case 5: return ERROR_FILTERED_NICKNAME;
        case 6: return ERROR_EXCEEDED_CHANGE_LIMIT;
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
      return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result.UNRECOGNIZED : result;
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
    if (result_ != POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result.UNSET.getNumber()) {
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse other = (POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse) obj;

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

  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse)
      POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_UpdateFriendshipResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_UpdateFriendshipResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.class, POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.newBuilder()
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
      return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Social_Responses_UpdateFriendshipResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse build() {
      POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse buildPartial() {
      POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse result = new POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse(this);
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
      if (other instanceof POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse other) {
      if (other == POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.getDefaultInstance()) return this;
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
      POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse.Result result = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse)
  private static final POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse();
  }

  public static POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFriendshipResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFriendshipResponse>() {
    @java.lang.Override
    public UpdateFriendshipResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateFriendshipResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateFriendshipResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFriendshipResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Social.Responses.UpdateFriendshipResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

