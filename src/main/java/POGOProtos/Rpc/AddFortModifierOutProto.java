// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AddFortModifierOutProto}
 */
public  final class AddFortModifierOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AddFortModifierOutProto)
    AddFortModifierOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddFortModifierOutProto.newBuilder() to construct.
  private AddFortModifierOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddFortModifierOutProto() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddFortModifierOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddFortModifierOutProto(
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
            POGOProtos.Rpc.FortDetailsOutProto.Builder subBuilder = null;
            if (fortDetailsOutProto_ != null) {
              subBuilder = fortDetailsOutProto_.toBuilder();
            }
            fortDetailsOutProto_ = input.readMessage(POGOProtos.Rpc.FortDetailsOutProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fortDetailsOutProto_);
              fortDetailsOutProto_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFortModifierOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFortModifierOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AddFortModifierOutProto.class, POGOProtos.Rpc.AddFortModifierOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.AddFortModifierOutProto.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    NO_RESULT_SET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>FORT_ALREADY_HAS_MODIFIER = 2;</code>
     */
    FORT_ALREADY_HAS_MODIFIER(2),
    /**
     * <code>TOO_FAR_AWAY = 3;</code>
     */
    TOO_FAR_AWAY(3),
    /**
     * <code>NO_ITEM_IN_INVENTORY = 4;</code>
     */
    NO_ITEM_IN_INVENTORY(4),
    /**
     * <code>POI_INACCESSIBLE = 5;</code>
     */
    POI_INACCESSIBLE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    public static final int NO_RESULT_SET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>FORT_ALREADY_HAS_MODIFIER = 2;</code>
     */
    public static final int FORT_ALREADY_HAS_MODIFIER_VALUE = 2;
    /**
     * <code>TOO_FAR_AWAY = 3;</code>
     */
    public static final int TOO_FAR_AWAY_VALUE = 3;
    /**
     * <code>NO_ITEM_IN_INVENTORY = 4;</code>
     */
    public static final int NO_ITEM_IN_INVENTORY_VALUE = 4;
    /**
     * <code>POI_INACCESSIBLE = 5;</code>
     */
    public static final int POI_INACCESSIBLE_VALUE = 5;


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
        case 0: return NO_RESULT_SET;
        case 1: return SUCCESS;
        case 2: return FORT_ALREADY_HAS_MODIFIER;
        case 3: return TOO_FAR_AWAY;
        case 4: return NO_ITEM_IN_INVENTORY;
        case 5: return POI_INACCESSIBLE;
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
      return POGOProtos.Rpc.AddFortModifierOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AddFortModifierOutProto.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
   * @return The result.
   */
  public POGOProtos.Rpc.AddFortModifierOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AddFortModifierOutProto.Result result = POGOProtos.Rpc.AddFortModifierOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.AddFortModifierOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int FORT_DETAILS_OUT_PROTO_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.FortDetailsOutProto fortDetailsOutProto_;
  /**
   * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
   * @return Whether the fortDetailsOutProto field is set.
   */
  public boolean hasFortDetailsOutProto() {
    return fortDetailsOutProto_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
   * @return The fortDetailsOutProto.
   */
  public POGOProtos.Rpc.FortDetailsOutProto getFortDetailsOutProto() {
    return fortDetailsOutProto_ == null ? POGOProtos.Rpc.FortDetailsOutProto.getDefaultInstance() : fortDetailsOutProto_;
  }
  /**
   * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
   */
  public POGOProtos.Rpc.FortDetailsOutProtoOrBuilder getFortDetailsOutProtoOrBuilder() {
    return getFortDetailsOutProto();
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
    if (result_ != POGOProtos.Rpc.AddFortModifierOutProto.Result.NO_RESULT_SET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (fortDetailsOutProto_ != null) {
      output.writeMessage(2, getFortDetailsOutProto());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.AddFortModifierOutProto.Result.NO_RESULT_SET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (fortDetailsOutProto_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFortDetailsOutProto());
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
    if (!(obj instanceof POGOProtos.Rpc.AddFortModifierOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AddFortModifierOutProto other = (POGOProtos.Rpc.AddFortModifierOutProto) obj;

    if (result_ != other.result_) return false;
    if (hasFortDetailsOutProto() != other.hasFortDetailsOutProto()) return false;
    if (hasFortDetailsOutProto()) {
      if (!getFortDetailsOutProto()
          .equals(other.getFortDetailsOutProto())) return false;
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
    if (hasFortDetailsOutProto()) {
      hash = (37 * hash) + FORT_DETAILS_OUT_PROTO_FIELD_NUMBER;
      hash = (53 * hash) + getFortDetailsOutProto().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AddFortModifierOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AddFortModifierOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AddFortModifierOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AddFortModifierOutProto)
      POGOProtos.Rpc.AddFortModifierOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFortModifierOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFortModifierOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AddFortModifierOutProto.class, POGOProtos.Rpc.AddFortModifierOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AddFortModifierOutProto.newBuilder()
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

      if (fortDetailsOutProtoBuilder_ == null) {
        fortDetailsOutProto_ = null;
      } else {
        fortDetailsOutProto_ = null;
        fortDetailsOutProtoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AddFortModifierOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AddFortModifierOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AddFortModifierOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AddFortModifierOutProto build() {
      POGOProtos.Rpc.AddFortModifierOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AddFortModifierOutProto buildPartial() {
      POGOProtos.Rpc.AddFortModifierOutProto result = new POGOProtos.Rpc.AddFortModifierOutProto(this);
      result.result_ = result_;
      if (fortDetailsOutProtoBuilder_ == null) {
        result.fortDetailsOutProto_ = fortDetailsOutProto_;
      } else {
        result.fortDetailsOutProto_ = fortDetailsOutProtoBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.AddFortModifierOutProto) {
        return mergeFrom((POGOProtos.Rpc.AddFortModifierOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AddFortModifierOutProto other) {
      if (other == POGOProtos.Rpc.AddFortModifierOutProto.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasFortDetailsOutProto()) {
        mergeFortDetailsOutProto(other.getFortDetailsOutProto());
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
      POGOProtos.Rpc.AddFortModifierOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AddFortModifierOutProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
     * @return The result.
     */
    public POGOProtos.Rpc.AddFortModifierOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AddFortModifierOutProto.Result result = POGOProtos.Rpc.AddFortModifierOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.AddFortModifierOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.AddFortModifierOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AddFortModifierOutProto.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.FortDetailsOutProto fortDetailsOutProto_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FortDetailsOutProto, POGOProtos.Rpc.FortDetailsOutProto.Builder, POGOProtos.Rpc.FortDetailsOutProtoOrBuilder> fortDetailsOutProtoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     * @return Whether the fortDetailsOutProto field is set.
     */
    public boolean hasFortDetailsOutProto() {
      return fortDetailsOutProtoBuilder_ != null || fortDetailsOutProto_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     * @return The fortDetailsOutProto.
     */
    public POGOProtos.Rpc.FortDetailsOutProto getFortDetailsOutProto() {
      if (fortDetailsOutProtoBuilder_ == null) {
        return fortDetailsOutProto_ == null ? POGOProtos.Rpc.FortDetailsOutProto.getDefaultInstance() : fortDetailsOutProto_;
      } else {
        return fortDetailsOutProtoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    public Builder setFortDetailsOutProto(POGOProtos.Rpc.FortDetailsOutProto value) {
      if (fortDetailsOutProtoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fortDetailsOutProto_ = value;
        onChanged();
      } else {
        fortDetailsOutProtoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    public Builder setFortDetailsOutProto(
        POGOProtos.Rpc.FortDetailsOutProto.Builder builderForValue) {
      if (fortDetailsOutProtoBuilder_ == null) {
        fortDetailsOutProto_ = builderForValue.build();
        onChanged();
      } else {
        fortDetailsOutProtoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    public Builder mergeFortDetailsOutProto(POGOProtos.Rpc.FortDetailsOutProto value) {
      if (fortDetailsOutProtoBuilder_ == null) {
        if (fortDetailsOutProto_ != null) {
          fortDetailsOutProto_ =
            POGOProtos.Rpc.FortDetailsOutProto.newBuilder(fortDetailsOutProto_).mergeFrom(value).buildPartial();
        } else {
          fortDetailsOutProto_ = value;
        }
        onChanged();
      } else {
        fortDetailsOutProtoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    public Builder clearFortDetailsOutProto() {
      if (fortDetailsOutProtoBuilder_ == null) {
        fortDetailsOutProto_ = null;
        onChanged();
      } else {
        fortDetailsOutProto_ = null;
        fortDetailsOutProtoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    public POGOProtos.Rpc.FortDetailsOutProto.Builder getFortDetailsOutProtoBuilder() {
      
      onChanged();
      return getFortDetailsOutProtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    public POGOProtos.Rpc.FortDetailsOutProtoOrBuilder getFortDetailsOutProtoOrBuilder() {
      if (fortDetailsOutProtoBuilder_ != null) {
        return fortDetailsOutProtoBuilder_.getMessageOrBuilder();
      } else {
        return fortDetailsOutProto_ == null ?
            POGOProtos.Rpc.FortDetailsOutProto.getDefaultInstance() : fortDetailsOutProto_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.FortDetailsOutProto fort_details_out_proto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.FortDetailsOutProto, POGOProtos.Rpc.FortDetailsOutProto.Builder, POGOProtos.Rpc.FortDetailsOutProtoOrBuilder> 
        getFortDetailsOutProtoFieldBuilder() {
      if (fortDetailsOutProtoBuilder_ == null) {
        fortDetailsOutProtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.FortDetailsOutProto, POGOProtos.Rpc.FortDetailsOutProto.Builder, POGOProtos.Rpc.FortDetailsOutProtoOrBuilder>(
                getFortDetailsOutProto(),
                getParentForChildren(),
                isClean());
        fortDetailsOutProto_ = null;
      }
      return fortDetailsOutProtoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AddFortModifierOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AddFortModifierOutProto)
  private static final POGOProtos.Rpc.AddFortModifierOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AddFortModifierOutProto();
  }

  public static POGOProtos.Rpc.AddFortModifierOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddFortModifierOutProto>
      PARSER = new com.google.protobuf.AbstractParser<AddFortModifierOutProto>() {
    @java.lang.Override
    public AddFortModifierOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddFortModifierOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddFortModifierOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddFortModifierOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AddFortModifierOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

