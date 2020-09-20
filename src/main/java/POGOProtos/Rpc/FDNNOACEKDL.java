// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: FDNNOACEKDL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FDNNOACEKDL}
 */
public final class FDNNOACEKDL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FDNNOACEKDL)
    FDNNOACEKDLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FDNNOACEKDL.newBuilder() to construct.
  private FDNNOACEKDL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FDNNOACEKDL() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FDNNOACEKDL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FDNNOACEKDL(
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
            POGOProtos.Rpc.LootProto.Builder subBuilder = null;
            if (nldndpcfdmh_ != null) {
              subBuilder = nldndpcfdmh_.toBuilder();
            }
            nldndpcfdmh_ = input.readMessage(POGOProtos.Rpc.LootProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nldndpcfdmh_);
              nldndpcfdmh_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDNNOACEKDL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDNNOACEKDL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FDNNOACEKDL.class, POGOProtos.Rpc.FDNNOACEKDL.Builder.class);
  }

  /**
   * <pre>
   * ref: FDNNOACEKDL/LAHAALANLPG/GHGFKBKFCNJ
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.FDNNOACEKDL.Result}
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
     * <code>ERROR_PLAYER_BAG_FULL = 3;</code>
     */
    ERROR_PLAYER_BAG_FULL(3),
    /**
     * <code>ERROR_GIFT_REDEEMED = 4;</code>
     */
    ERROR_GIFT_REDEEMED(4),
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
     * <code>ERROR_PLAYER_BAG_FULL = 3;</code>
     */
    public static final int ERROR_PLAYER_BAG_FULL_VALUE = 3;
    /**
     * <code>ERROR_GIFT_REDEEMED = 4;</code>
     */
    public static final int ERROR_GIFT_REDEEMED_VALUE = 4;


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
        case 3: return ERROR_PLAYER_BAG_FULL;
        case 4: return ERROR_GIFT_REDEEMED;
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
      return POGOProtos.Rpc.FDNNOACEKDL.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.FDNNOACEKDL.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.FDNNOACEKDL.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FDNNOACEKDL.Result result = POGOProtos.Rpc.FDNNOACEKDL.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.FDNNOACEKDL.Result.UNRECOGNIZED : result;
  }

  public static final int NLDNDPCFDMH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LootProto nldndpcfdmh_;
  /**
   * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
   * @return Whether the nldndpcfdmh field is set.
   */
  @java.lang.Override
  public boolean hasNldndpcfdmh() {
    return nldndpcfdmh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
   * @return The nldndpcfdmh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProto getNldndpcfdmh() {
    return nldndpcfdmh_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : nldndpcfdmh_;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProtoOrBuilder getNldndpcfdmhOrBuilder() {
    return getNldndpcfdmh();
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
    if (result_ != POGOProtos.Rpc.FDNNOACEKDL.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (nldndpcfdmh_ != null) {
      output.writeMessage(2, getNldndpcfdmh());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.FDNNOACEKDL.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (nldndpcfdmh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNldndpcfdmh());
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
    if (!(obj instanceof POGOProtos.Rpc.FDNNOACEKDL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FDNNOACEKDL other = (POGOProtos.Rpc.FDNNOACEKDL) obj;

    if (result_ != other.result_) return false;
    if (hasNldndpcfdmh() != other.hasNldndpcfdmh()) return false;
    if (hasNldndpcfdmh()) {
      if (!getNldndpcfdmh()
          .equals(other.getNldndpcfdmh())) return false;
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
    if (hasNldndpcfdmh()) {
      hash = (37 * hash) + NLDNDPCFDMH_FIELD_NUMBER;
      hash = (53 * hash) + getNldndpcfdmh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FDNNOACEKDL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FDNNOACEKDL prototype) {
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
   * <pre>
   * ref: FDNNOACEKDL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FDNNOACEKDL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FDNNOACEKDL)
      POGOProtos.Rpc.FDNNOACEKDLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDNNOACEKDL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDNNOACEKDL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FDNNOACEKDL.class, POGOProtos.Rpc.FDNNOACEKDL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FDNNOACEKDL.newBuilder()
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

      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmh_ = null;
      } else {
        nldndpcfdmh_ = null;
        nldndpcfdmhBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FDNNOACEKDL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FDNNOACEKDL getDefaultInstanceForType() {
      return POGOProtos.Rpc.FDNNOACEKDL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FDNNOACEKDL build() {
      POGOProtos.Rpc.FDNNOACEKDL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FDNNOACEKDL buildPartial() {
      POGOProtos.Rpc.FDNNOACEKDL result = new POGOProtos.Rpc.FDNNOACEKDL(this);
      result.result_ = result_;
      if (nldndpcfdmhBuilder_ == null) {
        result.nldndpcfdmh_ = nldndpcfdmh_;
      } else {
        result.nldndpcfdmh_ = nldndpcfdmhBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FDNNOACEKDL) {
        return mergeFrom((POGOProtos.Rpc.FDNNOACEKDL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FDNNOACEKDL other) {
      if (other == POGOProtos.Rpc.FDNNOACEKDL.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasNldndpcfdmh()) {
        mergeNldndpcfdmh(other.getNldndpcfdmh());
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
      POGOProtos.Rpc.FDNNOACEKDL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FDNNOACEKDL) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FDNNOACEKDL.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FDNNOACEKDL.Result result = POGOProtos.Rpc.FDNNOACEKDL.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.FDNNOACEKDL.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.FDNNOACEKDL.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FDNNOACEKDL.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LootProto nldndpcfdmh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> nldndpcfdmhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     * @return Whether the nldndpcfdmh field is set.
     */
    public boolean hasNldndpcfdmh() {
      return nldndpcfdmhBuilder_ != null || nldndpcfdmh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     * @return The nldndpcfdmh.
     */
    public POGOProtos.Rpc.LootProto getNldndpcfdmh() {
      if (nldndpcfdmhBuilder_ == null) {
        return nldndpcfdmh_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : nldndpcfdmh_;
      } else {
        return nldndpcfdmhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder setNldndpcfdmh(POGOProtos.Rpc.LootProto value) {
      if (nldndpcfdmhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nldndpcfdmh_ = value;
        onChanged();
      } else {
        nldndpcfdmhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder setNldndpcfdmh(
        POGOProtos.Rpc.LootProto.Builder builderForValue) {
      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmh_ = builderForValue.build();
        onChanged();
      } else {
        nldndpcfdmhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder mergeNldndpcfdmh(POGOProtos.Rpc.LootProto value) {
      if (nldndpcfdmhBuilder_ == null) {
        if (nldndpcfdmh_ != null) {
          nldndpcfdmh_ =
            POGOProtos.Rpc.LootProto.newBuilder(nldndpcfdmh_).mergeFrom(value).buildPartial();
        } else {
          nldndpcfdmh_ = value;
        }
        onChanged();
      } else {
        nldndpcfdmhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public Builder clearNldndpcfdmh() {
      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmh_ = null;
        onChanged();
      } else {
        nldndpcfdmh_ = null;
        nldndpcfdmhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public POGOProtos.Rpc.LootProto.Builder getNldndpcfdmhBuilder() {
      
      onChanged();
      return getNldndpcfdmhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    public POGOProtos.Rpc.LootProtoOrBuilder getNldndpcfdmhOrBuilder() {
      if (nldndpcfdmhBuilder_ != null) {
        return nldndpcfdmhBuilder_.getMessageOrBuilder();
      } else {
        return nldndpcfdmh_ == null ?
            POGOProtos.Rpc.LootProto.getDefaultInstance() : nldndpcfdmh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto nldndpcfdmh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> 
        getNldndpcfdmhFieldBuilder() {
      if (nldndpcfdmhBuilder_ == null) {
        nldndpcfdmhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder>(
                getNldndpcfdmh(),
                getParentForChildren(),
                isClean());
        nldndpcfdmh_ = null;
      }
      return nldndpcfdmhBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FDNNOACEKDL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FDNNOACEKDL)
  private static final POGOProtos.Rpc.FDNNOACEKDL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FDNNOACEKDL();
  }

  public static POGOProtos.Rpc.FDNNOACEKDL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FDNNOACEKDL>
      PARSER = new com.google.protobuf.AbstractParser<FDNNOACEKDL>() {
    @java.lang.Override
    public FDNNOACEKDL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FDNNOACEKDL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FDNNOACEKDL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FDNNOACEKDL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FDNNOACEKDL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

