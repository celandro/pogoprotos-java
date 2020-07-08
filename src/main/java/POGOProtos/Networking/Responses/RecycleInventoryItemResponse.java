// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/RecycleInventoryItemResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.RecycleInventoryItemResponse}
 */
public  final class RecycleInventoryItemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.RecycleInventoryItemResponse)
    RecycleInventoryItemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecycleInventoryItemResponse.newBuilder() to construct.
  private RecycleInventoryItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecycleInventoryItemResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecycleInventoryItemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecycleInventoryItemResponse(
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
          case 16: {

            newCount_ = input.readInt32();
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
    return POGOProtos.Networking.Responses.RecycleInventoryItemResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RecycleInventoryItemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.RecycleInventoryItemResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RecycleInventoryItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.RecycleInventoryItemResponse.class, POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result}
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
     * <code>ERROR_NOT_ENOUGH_COPIES = 2;</code>
     */
    ERROR_NOT_ENOUGH_COPIES(2),
    /**
     * <code>ERROR_CANNOT_RECYCLE_INCUBATORS = 3;</code>
     */
    ERROR_CANNOT_RECYCLE_INCUBATORS(3),
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
     * <code>ERROR_NOT_ENOUGH_COPIES = 2;</code>
     */
    public static final int ERROR_NOT_ENOUGH_COPIES_VALUE = 2;
    /**
     * <code>ERROR_CANNOT_RECYCLE_INCUBATORS = 3;</code>
     */
    public static final int ERROR_CANNOT_RECYCLE_INCUBATORS_VALUE = 3;


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
        case 2: return ERROR_NOT_ENOUGH_COPIES;
        case 3: return ERROR_CANNOT_RECYCLE_INCUBATORS;
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
      return POGOProtos.Networking.Responses.RecycleInventoryItemResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result.UNRECOGNIZED : result;
  }

  public static final int NEW_COUNT_FIELD_NUMBER = 2;
  private int newCount_;
  /**
   * <code>int32 new_count = 2;</code>
   * @return The newCount.
   */
  public int getNewCount() {
    return newCount_;
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
    if (result_ != POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (newCount_ != 0) {
      output.writeInt32(2, newCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (newCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, newCount_);
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
    if (!(obj instanceof POGOProtos.Networking.Responses.RecycleInventoryItemResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.RecycleInventoryItemResponse other = (POGOProtos.Networking.Responses.RecycleInventoryItemResponse) obj;

    if (result_ != other.result_) return false;
    if (getNewCount()
        != other.getNewCount()) return false;
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
    hash = (37 * hash) + NEW_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getNewCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.RecycleInventoryItemResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.RecycleInventoryItemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.RecycleInventoryItemResponse)
      POGOProtos.Networking.Responses.RecycleInventoryItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.RecycleInventoryItemResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RecycleInventoryItemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.RecycleInventoryItemResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RecycleInventoryItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.RecycleInventoryItemResponse.class, POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.RecycleInventoryItemResponse.newBuilder()
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

      newCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.RecycleInventoryItemResponseOuterClass.internal_static_POGOProtos_Networking_Responses_RecycleInventoryItemResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.RecycleInventoryItemResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.RecycleInventoryItemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.RecycleInventoryItemResponse build() {
      POGOProtos.Networking.Responses.RecycleInventoryItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.RecycleInventoryItemResponse buildPartial() {
      POGOProtos.Networking.Responses.RecycleInventoryItemResponse result = new POGOProtos.Networking.Responses.RecycleInventoryItemResponse(this);
      result.result_ = result_;
      result.newCount_ = newCount_;
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
      if (other instanceof POGOProtos.Networking.Responses.RecycleInventoryItemResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.RecycleInventoryItemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.RecycleInventoryItemResponse other) {
      if (other == POGOProtos.Networking.Responses.RecycleInventoryItemResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.getNewCount() != 0) {
        setNewCount(other.getNewCount());
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
      POGOProtos.Networking.Responses.RecycleInventoryItemResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.RecycleInventoryItemResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.RecycleInventoryItemResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private int newCount_ ;
    /**
     * <code>int32 new_count = 2;</code>
     * @return The newCount.
     */
    public int getNewCount() {
      return newCount_;
    }
    /**
     * <code>int32 new_count = 2;</code>
     * @param value The newCount to set.
     * @return This builder for chaining.
     */
    public Builder setNewCount(int value) {
      
      newCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 new_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewCount() {
      
      newCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.RecycleInventoryItemResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.RecycleInventoryItemResponse)
  private static final POGOProtos.Networking.Responses.RecycleInventoryItemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.RecycleInventoryItemResponse();
  }

  public static POGOProtos.Networking.Responses.RecycleInventoryItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecycleInventoryItemResponse>
      PARSER = new com.google.protobuf.AbstractParser<RecycleInventoryItemResponse>() {
    @java.lang.Override
    public RecycleInventoryItemResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecycleInventoryItemResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecycleInventoryItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecycleInventoryItemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.RecycleInventoryItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
