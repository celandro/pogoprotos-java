// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KDAOIKKFKMH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KDAOIKKFKMH}
 */
public final class KDAOIKKFKMH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KDAOIKKFKMH)
    KDAOIKKFKMHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KDAOIKKFKMH.newBuilder() to construct.
  private KDAOIKKFKMH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KDAOIKKFKMH() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KDAOIKKFKMH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KDAOIKKFKMH(
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
          case 24: {

            nakgeefmied_ = input.readInt32();
            break;
          }
          case 32: {

            nljfjdgfejj_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KDAOIKKFKMH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KDAOIKKFKMH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KDAOIKKFKMH.class, POGOProtos.Rpc.KDAOIKKFKMH.Builder.class);
  }

  /**
   * <pre>
   * ref: KDAOIKKFKMH/CHFLJCPJJMM/NIOONLIPMAO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.KDAOIKKFKMH.Result}
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
      return POGOProtos.Rpc.KDAOIKKFKMH.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.KDAOIKKFKMH.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.KDAOIKKFKMH.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.KDAOIKKFKMH.Result result = POGOProtos.Rpc.KDAOIKKFKMH.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.KDAOIKKFKMH.Result.UNRECOGNIZED : result;
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

  public static final int NAKGEEFMIED_FIELD_NUMBER = 3;
  private int nakgeefmied_;
  /**
   * <code>int32 nakgeefmied = 3;</code>
   * @return The nakgeefmied.
   */
  @java.lang.Override
  public int getNakgeefmied() {
    return nakgeefmied_;
  }

  public static final int NLJFJDGFEJJ_FIELD_NUMBER = 4;
  private int nljfjdgfejj_;
  /**
   * <code>int32 nljfjdgfejj = 4;</code>
   * @return The nljfjdgfejj.
   */
  @java.lang.Override
  public int getNljfjdgfejj() {
    return nljfjdgfejj_;
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
    if (result_ != POGOProtos.Rpc.KDAOIKKFKMH.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (nldndpcfdmh_ != null) {
      output.writeMessage(2, getNldndpcfdmh());
    }
    if (nakgeefmied_ != 0) {
      output.writeInt32(3, nakgeefmied_);
    }
    if (nljfjdgfejj_ != 0) {
      output.writeInt32(4, nljfjdgfejj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.KDAOIKKFKMH.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (nldndpcfdmh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNldndpcfdmh());
    }
    if (nakgeefmied_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nakgeefmied_);
    }
    if (nljfjdgfejj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, nljfjdgfejj_);
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
    if (!(obj instanceof POGOProtos.Rpc.KDAOIKKFKMH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KDAOIKKFKMH other = (POGOProtos.Rpc.KDAOIKKFKMH) obj;

    if (result_ != other.result_) return false;
    if (hasNldndpcfdmh() != other.hasNldndpcfdmh()) return false;
    if (hasNldndpcfdmh()) {
      if (!getNldndpcfdmh()
          .equals(other.getNldndpcfdmh())) return false;
    }
    if (getNakgeefmied()
        != other.getNakgeefmied()) return false;
    if (getNljfjdgfejj()
        != other.getNljfjdgfejj()) return false;
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
    hash = (37 * hash) + NAKGEEFMIED_FIELD_NUMBER;
    hash = (53 * hash) + getNakgeefmied();
    hash = (37 * hash) + NLJFJDGFEJJ_FIELD_NUMBER;
    hash = (53 * hash) + getNljfjdgfejj();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KDAOIKKFKMH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KDAOIKKFKMH prototype) {
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
   * ref: KDAOIKKFKMH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KDAOIKKFKMH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KDAOIKKFKMH)
      POGOProtos.Rpc.KDAOIKKFKMHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KDAOIKKFKMH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KDAOIKKFKMH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KDAOIKKFKMH.class, POGOProtos.Rpc.KDAOIKKFKMH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KDAOIKKFKMH.newBuilder()
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
      nakgeefmied_ = 0;

      nljfjdgfejj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KDAOIKKFKMH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KDAOIKKFKMH getDefaultInstanceForType() {
      return POGOProtos.Rpc.KDAOIKKFKMH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KDAOIKKFKMH build() {
      POGOProtos.Rpc.KDAOIKKFKMH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KDAOIKKFKMH buildPartial() {
      POGOProtos.Rpc.KDAOIKKFKMH result = new POGOProtos.Rpc.KDAOIKKFKMH(this);
      result.result_ = result_;
      if (nldndpcfdmhBuilder_ == null) {
        result.nldndpcfdmh_ = nldndpcfdmh_;
      } else {
        result.nldndpcfdmh_ = nldndpcfdmhBuilder_.build();
      }
      result.nakgeefmied_ = nakgeefmied_;
      result.nljfjdgfejj_ = nljfjdgfejj_;
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
      if (other instanceof POGOProtos.Rpc.KDAOIKKFKMH) {
        return mergeFrom((POGOProtos.Rpc.KDAOIKKFKMH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KDAOIKKFKMH other) {
      if (other == POGOProtos.Rpc.KDAOIKKFKMH.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasNldndpcfdmh()) {
        mergeNldndpcfdmh(other.getNldndpcfdmh());
      }
      if (other.getNakgeefmied() != 0) {
        setNakgeefmied(other.getNakgeefmied());
      }
      if (other.getNljfjdgfejj() != 0) {
        setNljfjdgfejj(other.getNljfjdgfejj());
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
      POGOProtos.Rpc.KDAOIKKFKMH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KDAOIKKFKMH) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.KDAOIKKFKMH.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.KDAOIKKFKMH.Result result = POGOProtos.Rpc.KDAOIKKFKMH.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.KDAOIKKFKMH.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.KDAOIKKFKMH.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.KDAOIKKFKMH.Result result = 1;</code>
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

    private int nakgeefmied_ ;
    /**
     * <code>int32 nakgeefmied = 3;</code>
     * @return The nakgeefmied.
     */
    @java.lang.Override
    public int getNakgeefmied() {
      return nakgeefmied_;
    }
    /**
     * <code>int32 nakgeefmied = 3;</code>
     * @param value The nakgeefmied to set.
     * @return This builder for chaining.
     */
    public Builder setNakgeefmied(int value) {
      
      nakgeefmied_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nakgeefmied = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNakgeefmied() {
      
      nakgeefmied_ = 0;
      onChanged();
      return this;
    }

    private int nljfjdgfejj_ ;
    /**
     * <code>int32 nljfjdgfejj = 4;</code>
     * @return The nljfjdgfejj.
     */
    @java.lang.Override
    public int getNljfjdgfejj() {
      return nljfjdgfejj_;
    }
    /**
     * <code>int32 nljfjdgfejj = 4;</code>
     * @param value The nljfjdgfejj to set.
     * @return This builder for chaining.
     */
    public Builder setNljfjdgfejj(int value) {
      
      nljfjdgfejj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nljfjdgfejj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNljfjdgfejj() {
      
      nljfjdgfejj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KDAOIKKFKMH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KDAOIKKFKMH)
  private static final POGOProtos.Rpc.KDAOIKKFKMH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KDAOIKKFKMH();
  }

  public static POGOProtos.Rpc.KDAOIKKFKMH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KDAOIKKFKMH>
      PARSER = new com.google.protobuf.AbstractParser<KDAOIKKFKMH>() {
    @java.lang.Override
    public KDAOIKKFKMH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KDAOIKKFKMH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KDAOIKKFKMH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KDAOIKKFKMH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KDAOIKKFKMH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

