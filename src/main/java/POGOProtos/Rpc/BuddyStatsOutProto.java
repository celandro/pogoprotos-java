// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BuddyStatsOutProto}
 */
public  final class BuddyStatsOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BuddyStatsOutProto)
    BuddyStatsOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuddyStatsOutProto.newBuilder() to construct.
  private BuddyStatsOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuddyStatsOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuddyStatsOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuddyStatsOutProto(
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
            POGOProtos.Rpc.BuddyObservedData.Builder subBuilder = null;
            if (observedData_ != null) {
              subBuilder = observedData_.toBuilder();
            }
            observedData_ = input.readMessage(POGOProtos.Rpc.BuddyObservedData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(observedData_);
              observedData_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyStatsOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyStatsOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BuddyStatsOutProto.class, POGOProtos.Rpc.BuddyStatsOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.BuddyStatsOutProto.Result}
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
     * <code>ERROR_BUDDY_NOT_VALID = 2;</code>
     */
    ERROR_BUDDY_NOT_VALID(2),
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
     * <code>ERROR_BUDDY_NOT_VALID = 2;</code>
     */
    public static final int ERROR_BUDDY_NOT_VALID_VALUE = 2;


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
        case 2: return ERROR_BUDDY_NOT_VALID;
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
      return POGOProtos.Rpc.BuddyStatsOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.BuddyStatsOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Rpc.BuddyStatsOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BuddyStatsOutProto.Result result = POGOProtos.Rpc.BuddyStatsOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.BuddyStatsOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int OBSERVED_DATA_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.BuddyObservedData observedData_;
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
   * @return Whether the observedData field is set.
   */
  public boolean hasObservedData() {
    return observedData_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
   * @return The observedData.
   */
  public POGOProtos.Rpc.BuddyObservedData getObservedData() {
    return observedData_ == null ? POGOProtos.Rpc.BuddyObservedData.getDefaultInstance() : observedData_;
  }
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
   */
  public POGOProtos.Rpc.BuddyObservedDataOrBuilder getObservedDataOrBuilder() {
    return getObservedData();
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
    if (result_ != POGOProtos.Rpc.BuddyStatsOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (observedData_ != null) {
      output.writeMessage(2, getObservedData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.BuddyStatsOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (observedData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getObservedData());
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
    if (!(obj instanceof POGOProtos.Rpc.BuddyStatsOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BuddyStatsOutProto other = (POGOProtos.Rpc.BuddyStatsOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasObservedData() != other.hasObservedData()) return false;
    if (hasObservedData()) {
      if (!getObservedData()
          .equals(other.getObservedData())) return false;
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
    if (hasObservedData()) {
      hash = (37 * hash) + OBSERVED_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getObservedData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BuddyStatsOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BuddyStatsOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BuddyStatsOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BuddyStatsOutProto)
      POGOProtos.Rpc.BuddyStatsOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyStatsOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyStatsOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BuddyStatsOutProto.class, POGOProtos.Rpc.BuddyStatsOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BuddyStatsOutProto.newBuilder()
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

      if (observedDataBuilder_ == null) {
        observedData_ = null;
      } else {
        observedData_ = null;
        observedDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BuddyStatsOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyStatsOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BuddyStatsOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyStatsOutProto build() {
      POGOProtos.Rpc.BuddyStatsOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BuddyStatsOutProto buildPartial() {
      POGOProtos.Rpc.BuddyStatsOutProto result = new POGOProtos.Rpc.BuddyStatsOutProto(this);
      result.result_ = result_;
      if (observedDataBuilder_ == null) {
        result.observedData_ = observedData_;
      } else {
        result.observedData_ = observedDataBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.BuddyStatsOutProto) {
        return mergeFrom((POGOProtos.Rpc.BuddyStatsOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BuddyStatsOutProto other) {
      if (other == POGOProtos.Rpc.BuddyStatsOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasObservedData()) {
        mergeObservedData(other.getObservedData());
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
      POGOProtos.Rpc.BuddyStatsOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BuddyStatsOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Rpc.BuddyStatsOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BuddyStatsOutProto.Result result = POGOProtos.Rpc.BuddyStatsOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.BuddyStatsOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.BuddyStatsOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyStatsOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.BuddyObservedData observedData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BuddyObservedData, POGOProtos.Rpc.BuddyObservedData.Builder, POGOProtos.Rpc.BuddyObservedDataOrBuilder> observedDataBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     * @return Whether the observedData field is set.
     */
    public boolean hasObservedData() {
      return observedDataBuilder_ != null || observedData_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     * @return The observedData.
     */
    public POGOProtos.Rpc.BuddyObservedData getObservedData() {
      if (observedDataBuilder_ == null) {
        return observedData_ == null ? POGOProtos.Rpc.BuddyObservedData.getDefaultInstance() : observedData_;
      } else {
        return observedDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    public Builder setObservedData(POGOProtos.Rpc.BuddyObservedData value) {
      if (observedDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        observedData_ = value;
        onChanged();
      } else {
        observedDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    public Builder setObservedData(
        POGOProtos.Rpc.BuddyObservedData.Builder builderForValue) {
      if (observedDataBuilder_ == null) {
        observedData_ = builderForValue.build();
        onChanged();
      } else {
        observedDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    public Builder mergeObservedData(POGOProtos.Rpc.BuddyObservedData value) {
      if (observedDataBuilder_ == null) {
        if (observedData_ != null) {
          observedData_ =
            POGOProtos.Rpc.BuddyObservedData.newBuilder(observedData_).mergeFrom(value).buildPartial();
        } else {
          observedData_ = value;
        }
        onChanged();
      } else {
        observedDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    public Builder clearObservedData() {
      if (observedDataBuilder_ == null) {
        observedData_ = null;
        onChanged();
      } else {
        observedData_ = null;
        observedDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    public POGOProtos.Rpc.BuddyObservedData.Builder getObservedDataBuilder() {
      
      onChanged();
      return getObservedDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    public POGOProtos.Rpc.BuddyObservedDataOrBuilder getObservedDataOrBuilder() {
      if (observedDataBuilder_ != null) {
        return observedDataBuilder_.getMessageOrBuilder();
      } else {
        return observedData_ == null ?
            POGOProtos.Rpc.BuddyObservedData.getDefaultInstance() : observedData_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BuddyObservedData, POGOProtos.Rpc.BuddyObservedData.Builder, POGOProtos.Rpc.BuddyObservedDataOrBuilder> 
        getObservedDataFieldBuilder() {
      if (observedDataBuilder_ == null) {
        observedDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BuddyObservedData, POGOProtos.Rpc.BuddyObservedData.Builder, POGOProtos.Rpc.BuddyObservedDataOrBuilder>(
                getObservedData(),
                getParentForChildren(),
                isClean());
        observedData_ = null;
      }
      return observedDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BuddyStatsOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BuddyStatsOutProto)
  private static final POGOProtos.Rpc.BuddyStatsOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BuddyStatsOutProto();
  }

  public static POGOProtos.Rpc.BuddyStatsOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuddyStatsOutProto>
      PARSER = new com.google.protobuf.AbstractParser<BuddyStatsOutProto>() {
    @java.lang.Override
    public BuddyStatsOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuddyStatsOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuddyStatsOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuddyStatsOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BuddyStatsOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

