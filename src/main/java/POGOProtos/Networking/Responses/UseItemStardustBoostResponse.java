// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/UseItemStardustBoostResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.UseItemStardustBoostResponse}
 */
public final class UseItemStardustBoostResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.UseItemStardustBoostResponse)
    UseItemStardustBoostResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseItemStardustBoostResponse.newBuilder() to construct.
  private UseItemStardustBoostResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseItemStardustBoostResponse() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseItemStardustBoostResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseItemStardustBoostResponse(
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
            POGOProtos.Inventory.AppliedItems.Builder subBuilder = null;
            if (appliedItems_ != null) {
              subBuilder = appliedItems_.toBuilder();
            }
            appliedItems_ = input.readMessage(POGOProtos.Inventory.AppliedItems.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(appliedItems_);
              appliedItems_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.UseItemStardustBoostResponseOuterClass.internal_static_POGOProtos_Networking_Responses_UseItemStardustBoostResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.UseItemStardustBoostResponseOuterClass.internal_static_POGOProtos_Networking_Responses_UseItemStardustBoostResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.UseItemStardustBoostResponse.class, POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result}
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
     * <code>ERROR_INVALID_ITEM_TYPE = 2;</code>
     */
    ERROR_INVALID_ITEM_TYPE(2),
    /**
     * <code>ERROR_STARDUST_BOOST_ALREADY_ACTIVE = 3;</code>
     */
    ERROR_STARDUST_BOOST_ALREADY_ACTIVE(3),
    /**
     * <code>ERROR_NO_ITEMS_REMAINING = 4;</code>
     */
    ERROR_NO_ITEMS_REMAINING(4),
    /**
     * <code>ERROR_LOCATION_UNSET = 5;</code>
     */
    ERROR_LOCATION_UNSET(5),
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
     * <code>ERROR_INVALID_ITEM_TYPE = 2;</code>
     */
    public static final int ERROR_INVALID_ITEM_TYPE_VALUE = 2;
    /**
     * <code>ERROR_STARDUST_BOOST_ALREADY_ACTIVE = 3;</code>
     */
    public static final int ERROR_STARDUST_BOOST_ALREADY_ACTIVE_VALUE = 3;
    /**
     * <code>ERROR_NO_ITEMS_REMAINING = 4;</code>
     */
    public static final int ERROR_NO_ITEMS_REMAINING_VALUE = 4;
    /**
     * <code>ERROR_LOCATION_UNSET = 5;</code>
     */
    public static final int ERROR_LOCATION_UNSET_VALUE = 5;


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
        case 2: return ERROR_INVALID_ITEM_TYPE;
        case 3: return ERROR_STARDUST_BOOST_ALREADY_ACTIVE;
        case 4: return ERROR_NO_ITEMS_REMAINING;
        case 5: return ERROR_LOCATION_UNSET;
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
      return POGOProtos.Networking.Responses.UseItemStardustBoostResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result.valueOf(result_);
    return result == null ? POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result.UNRECOGNIZED : result;
  }

  public static final int APPLIED_ITEMS_FIELD_NUMBER = 2;
  private POGOProtos.Inventory.AppliedItems appliedItems_;
  /**
   * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
   * @return Whether the appliedItems field is set.
   */
  @java.lang.Override
  public boolean hasAppliedItems() {
    return appliedItems_ != null;
  }
  /**
   * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
   * @return The appliedItems.
   */
  @java.lang.Override
  public POGOProtos.Inventory.AppliedItems getAppliedItems() {
    return appliedItems_ == null ? POGOProtos.Inventory.AppliedItems.getDefaultInstance() : appliedItems_;
  }
  /**
   * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Inventory.AppliedItemsOrBuilder getAppliedItemsOrBuilder() {
    return getAppliedItems();
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
    if (result_ != POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (appliedItems_ != null) {
      output.writeMessage(2, getAppliedItems());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (appliedItems_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppliedItems());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.UseItemStardustBoostResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.UseItemStardustBoostResponse other = (POGOProtos.Networking.Responses.UseItemStardustBoostResponse) obj;

    if (result_ != other.result_) return false;
    if (hasAppliedItems() != other.hasAppliedItems()) return false;
    if (hasAppliedItems()) {
      if (!getAppliedItems()
          .equals(other.getAppliedItems())) return false;
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
    if (hasAppliedItems()) {
      hash = (37 * hash) + APPLIED_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getAppliedItems().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.UseItemStardustBoostResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.UseItemStardustBoostResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.UseItemStardustBoostResponse)
      POGOProtos.Networking.Responses.UseItemStardustBoostResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.UseItemStardustBoostResponseOuterClass.internal_static_POGOProtos_Networking_Responses_UseItemStardustBoostResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.UseItemStardustBoostResponseOuterClass.internal_static_POGOProtos_Networking_Responses_UseItemStardustBoostResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.UseItemStardustBoostResponse.class, POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.UseItemStardustBoostResponse.newBuilder()
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

      if (appliedItemsBuilder_ == null) {
        appliedItems_ = null;
      } else {
        appliedItems_ = null;
        appliedItemsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.UseItemStardustBoostResponseOuterClass.internal_static_POGOProtos_Networking_Responses_UseItemStardustBoostResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.UseItemStardustBoostResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.UseItemStardustBoostResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.UseItemStardustBoostResponse build() {
      POGOProtos.Networking.Responses.UseItemStardustBoostResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.UseItemStardustBoostResponse buildPartial() {
      POGOProtos.Networking.Responses.UseItemStardustBoostResponse result = new POGOProtos.Networking.Responses.UseItemStardustBoostResponse(this);
      result.result_ = result_;
      if (appliedItemsBuilder_ == null) {
        result.appliedItems_ = appliedItems_;
      } else {
        result.appliedItems_ = appliedItemsBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.UseItemStardustBoostResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.UseItemStardustBoostResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.UseItemStardustBoostResponse other) {
      if (other == POGOProtos.Networking.Responses.UseItemStardustBoostResponse.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasAppliedItems()) {
        mergeAppliedItems(other.getAppliedItems());
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
      POGOProtos.Networking.Responses.UseItemStardustBoostResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.UseItemStardustBoostResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result.valueOf(result_);
      return result == null ? POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.UseItemStardustBoostResponse.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Inventory.AppliedItems appliedItems_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.AppliedItems, POGOProtos.Inventory.AppliedItems.Builder, POGOProtos.Inventory.AppliedItemsOrBuilder> appliedItemsBuilder_;
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     * @return Whether the appliedItems field is set.
     */
    public boolean hasAppliedItems() {
      return appliedItemsBuilder_ != null || appliedItems_ != null;
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     * @return The appliedItems.
     */
    public POGOProtos.Inventory.AppliedItems getAppliedItems() {
      if (appliedItemsBuilder_ == null) {
        return appliedItems_ == null ? POGOProtos.Inventory.AppliedItems.getDefaultInstance() : appliedItems_;
      } else {
        return appliedItemsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    public Builder setAppliedItems(POGOProtos.Inventory.AppliedItems value) {
      if (appliedItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appliedItems_ = value;
        onChanged();
      } else {
        appliedItemsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    public Builder setAppliedItems(
        POGOProtos.Inventory.AppliedItems.Builder builderForValue) {
      if (appliedItemsBuilder_ == null) {
        appliedItems_ = builderForValue.build();
        onChanged();
      } else {
        appliedItemsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    public Builder mergeAppliedItems(POGOProtos.Inventory.AppliedItems value) {
      if (appliedItemsBuilder_ == null) {
        if (appliedItems_ != null) {
          appliedItems_ =
            POGOProtos.Inventory.AppliedItems.newBuilder(appliedItems_).mergeFrom(value).buildPartial();
        } else {
          appliedItems_ = value;
        }
        onChanged();
      } else {
        appliedItemsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    public Builder clearAppliedItems() {
      if (appliedItemsBuilder_ == null) {
        appliedItems_ = null;
        onChanged();
      } else {
        appliedItems_ = null;
        appliedItemsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    public POGOProtos.Inventory.AppliedItems.Builder getAppliedItemsBuilder() {
      
      onChanged();
      return getAppliedItemsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    public POGOProtos.Inventory.AppliedItemsOrBuilder getAppliedItemsOrBuilder() {
      if (appliedItemsBuilder_ != null) {
        return appliedItemsBuilder_.getMessageOrBuilder();
      } else {
        return appliedItems_ == null ?
            POGOProtos.Inventory.AppliedItems.getDefaultInstance() : appliedItems_;
      }
    }
    /**
     * <code>.POGOProtos.Inventory.AppliedItems applied_items = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.AppliedItems, POGOProtos.Inventory.AppliedItems.Builder, POGOProtos.Inventory.AppliedItemsOrBuilder> 
        getAppliedItemsFieldBuilder() {
      if (appliedItemsBuilder_ == null) {
        appliedItemsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Inventory.AppliedItems, POGOProtos.Inventory.AppliedItems.Builder, POGOProtos.Inventory.AppliedItemsOrBuilder>(
                getAppliedItems(),
                getParentForChildren(),
                isClean());
        appliedItems_ = null;
      }
      return appliedItemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.UseItemStardustBoostResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.UseItemStardustBoostResponse)
  private static final POGOProtos.Networking.Responses.UseItemStardustBoostResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.UseItemStardustBoostResponse();
  }

  public static POGOProtos.Networking.Responses.UseItemStardustBoostResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseItemStardustBoostResponse>
      PARSER = new com.google.protobuf.AbstractParser<UseItemStardustBoostResponse>() {
    @java.lang.Override
    public UseItemStardustBoostResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseItemStardustBoostResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseItemStardustBoostResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseItemStardustBoostResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.UseItemStardustBoostResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

