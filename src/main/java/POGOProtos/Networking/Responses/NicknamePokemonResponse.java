// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/NicknamePokemonResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.NicknamePokemonResponse}
 */
public  final class NicknamePokemonResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.NicknamePokemonResponse)
    NicknamePokemonResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NicknamePokemonResponse.newBuilder() to construct.
  private NicknamePokemonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NicknamePokemonResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NicknamePokemonResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NicknamePokemonResponse(
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
    return POGOProtos.Networking.Responses.NicknamePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.NicknamePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.NicknamePokemonResponse.class, POGOProtos.Networking.Responses.NicknamePokemonResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.NicknamePokemonResponse.Result}
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
     * <code>ERROR_INVALID_NICKNAME = 2;</code>
     */
    ERROR_INVALID_NICKNAME(2),
    /**
     * <code>ERROR_POKEMON_NOT_FOUND = 3;</code>
     */
    ERROR_POKEMON_NOT_FOUND(3),
    /**
     * <code>ERROR_POKEMON_IS_EGG = 4;</code>
     */
    ERROR_POKEMON_IS_EGG(4),
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
     * <code>ERROR_INVALID_NICKNAME = 2;</code>
     */
    public static final int ERROR_INVALID_NICKNAME_VALUE = 2;
    /**
     * <code>ERROR_POKEMON_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_POKEMON_NOT_FOUND_VALUE = 3;
    /**
     * <code>ERROR_POKEMON_IS_EGG = 4;</code>
     */
    public static final int ERROR_POKEMON_IS_EGG_VALUE = 4;
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
        case 2: return ERROR_INVALID_NICKNAME;
        case 3: return ERROR_POKEMON_NOT_FOUND;
        case 4: return ERROR_POKEMON_IS_EGG;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.NicknamePokemonResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.NicknamePokemonResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Networking.Responses.NicknamePokemonResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = POGOProtos.Networking.Responses.NicknamePokemonResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.NicknamePokemonResponse.Result.UNRECOGNIZED : result;
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
    if (result_ != POGOProtos.Networking.Responses.NicknamePokemonResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.NicknamePokemonResponse.Result.UNSET.getNumber()) {
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
    if (!(obj instanceof POGOProtos.Networking.Responses.NicknamePokemonResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.NicknamePokemonResponse other = (POGOProtos.Networking.Responses.NicknamePokemonResponse) obj;

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

  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.NicknamePokemonResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.NicknamePokemonResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.NicknamePokemonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.NicknamePokemonResponse)
      POGOProtos.Networking.Responses.NicknamePokemonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.NicknamePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.NicknamePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.NicknamePokemonResponse.class, POGOProtos.Networking.Responses.NicknamePokemonResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.NicknamePokemonResponse.newBuilder()
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
      return POGOProtos.Networking.Responses.NicknamePokemonResponseOuterClass.internal_static_POGOProtos_Networking_Responses_NicknamePokemonResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.NicknamePokemonResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.NicknamePokemonResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.NicknamePokemonResponse build() {
      POGOProtos.Networking.Responses.NicknamePokemonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.NicknamePokemonResponse buildPartial() {
      POGOProtos.Networking.Responses.NicknamePokemonResponse result = new POGOProtos.Networking.Responses.NicknamePokemonResponse(this);
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
      if (other instanceof POGOProtos.Networking.Responses.NicknamePokemonResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.NicknamePokemonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.NicknamePokemonResponse other) {
      if (other == POGOProtos.Networking.Responses.NicknamePokemonResponse.getDefaultInstance()) return this;
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
      POGOProtos.Networking.Responses.NicknamePokemonResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.NicknamePokemonResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Networking.Responses.NicknamePokemonResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = POGOProtos.Networking.Responses.NicknamePokemonResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.NicknamePokemonResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.NicknamePokemonResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.NicknamePokemonResponse.Result result = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.NicknamePokemonResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.NicknamePokemonResponse)
  private static final POGOProtos.Networking.Responses.NicknamePokemonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.NicknamePokemonResponse();
  }

  public static POGOProtos.Networking.Responses.NicknamePokemonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NicknamePokemonResponse>
      PARSER = new com.google.protobuf.AbstractParser<NicknamePokemonResponse>() {
    @java.lang.Override
    public NicknamePokemonResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NicknamePokemonResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NicknamePokemonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NicknamePokemonResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.NicknamePokemonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

