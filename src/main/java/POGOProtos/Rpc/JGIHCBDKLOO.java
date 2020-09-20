// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JGIHCBDKLOO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JGIHCBDKLOO}
 */
public final class JGIHCBDKLOO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JGIHCBDKLOO)
    JGIHCBDKLOOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JGIHCBDKLOO.newBuilder() to construct.
  private JGIHCBDKLOO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JGIHCBDKLOO() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JGIHCBDKLOO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JGIHCBDKLOO(
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
            POGOProtos.Rpc.CombatChallengeProto.Builder subBuilder = null;
            if (oafocnchncd_ != null) {
              subBuilder = oafocnchncd_.toBuilder();
            }
            oafocnchncd_ = input.readMessage(POGOProtos.Rpc.CombatChallengeProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(oafocnchncd_);
              oafocnchncd_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGIHCBDKLOO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGIHCBDKLOO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JGIHCBDKLOO.class, POGOProtos.Rpc.JGIHCBDKLOO.Builder.class);
  }

  /**
   * <pre>
   * ref: JGIHCBDKLOO/LGIHFGLAIMJ/OIDIJLJGECK
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.JGIHCBDKLOO.Result}
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
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 3;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(3),
    /**
     * <code>ERROR_ACCESS_DENIED = 4;</code>
     */
    ERROR_ACCESS_DENIED(4),
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
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 3;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 3;
    /**
     * <code>ERROR_ACCESS_DENIED = 4;</code>
     */
    public static final int ERROR_ACCESS_DENIED_VALUE = 4;


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
        case 3: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 4: return ERROR_ACCESS_DENIED;
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
      return POGOProtos.Rpc.JGIHCBDKLOO.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.JGIHCBDKLOO.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.JGIHCBDKLOO.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JGIHCBDKLOO.Result result = POGOProtos.Rpc.JGIHCBDKLOO.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.JGIHCBDKLOO.Result.UNRECOGNIZED : result;
  }

  public static final int OAFOCNCHNCD_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CombatChallengeProto oafocnchncd_;
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
   * @return Whether the oafocnchncd field is set.
   */
  @java.lang.Override
  public boolean hasOafocnchncd() {
    return oafocnchncd_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
   * @return The oafocnchncd.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatChallengeProto getOafocnchncd() {
    return oafocnchncd_ == null ? POGOProtos.Rpc.CombatChallengeProto.getDefaultInstance() : oafocnchncd_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatChallengeProtoOrBuilder getOafocnchncdOrBuilder() {
    return getOafocnchncd();
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
    if (result_ != POGOProtos.Rpc.JGIHCBDKLOO.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (oafocnchncd_ != null) {
      output.writeMessage(2, getOafocnchncd());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.JGIHCBDKLOO.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (oafocnchncd_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOafocnchncd());
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
    if (!(obj instanceof POGOProtos.Rpc.JGIHCBDKLOO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JGIHCBDKLOO other = (POGOProtos.Rpc.JGIHCBDKLOO) obj;

    if (result_ != other.result_) return false;
    if (hasOafocnchncd() != other.hasOafocnchncd()) return false;
    if (hasOafocnchncd()) {
      if (!getOafocnchncd()
          .equals(other.getOafocnchncd())) return false;
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
    if (hasOafocnchncd()) {
      hash = (37 * hash) + OAFOCNCHNCD_FIELD_NUMBER;
      hash = (53 * hash) + getOafocnchncd().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JGIHCBDKLOO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JGIHCBDKLOO prototype) {
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
   * ref: JGIHCBDKLOO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JGIHCBDKLOO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JGIHCBDKLOO)
      POGOProtos.Rpc.JGIHCBDKLOOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGIHCBDKLOO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGIHCBDKLOO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JGIHCBDKLOO.class, POGOProtos.Rpc.JGIHCBDKLOO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JGIHCBDKLOO.newBuilder()
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

      if (oafocnchncdBuilder_ == null) {
        oafocnchncd_ = null;
      } else {
        oafocnchncd_ = null;
        oafocnchncdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JGIHCBDKLOO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGIHCBDKLOO getDefaultInstanceForType() {
      return POGOProtos.Rpc.JGIHCBDKLOO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGIHCBDKLOO build() {
      POGOProtos.Rpc.JGIHCBDKLOO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JGIHCBDKLOO buildPartial() {
      POGOProtos.Rpc.JGIHCBDKLOO result = new POGOProtos.Rpc.JGIHCBDKLOO(this);
      result.result_ = result_;
      if (oafocnchncdBuilder_ == null) {
        result.oafocnchncd_ = oafocnchncd_;
      } else {
        result.oafocnchncd_ = oafocnchncdBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.JGIHCBDKLOO) {
        return mergeFrom((POGOProtos.Rpc.JGIHCBDKLOO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JGIHCBDKLOO other) {
      if (other == POGOProtos.Rpc.JGIHCBDKLOO.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasOafocnchncd()) {
        mergeOafocnchncd(other.getOafocnchncd());
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
      POGOProtos.Rpc.JGIHCBDKLOO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JGIHCBDKLOO) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.JGIHCBDKLOO.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JGIHCBDKLOO.Result result = POGOProtos.Rpc.JGIHCBDKLOO.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.JGIHCBDKLOO.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.JGIHCBDKLOO.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JGIHCBDKLOO.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CombatChallengeProto oafocnchncd_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatChallengeProto, POGOProtos.Rpc.CombatChallengeProto.Builder, POGOProtos.Rpc.CombatChallengeProtoOrBuilder> oafocnchncdBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     * @return Whether the oafocnchncd field is set.
     */
    public boolean hasOafocnchncd() {
      return oafocnchncdBuilder_ != null || oafocnchncd_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     * @return The oafocnchncd.
     */
    public POGOProtos.Rpc.CombatChallengeProto getOafocnchncd() {
      if (oafocnchncdBuilder_ == null) {
        return oafocnchncd_ == null ? POGOProtos.Rpc.CombatChallengeProto.getDefaultInstance() : oafocnchncd_;
      } else {
        return oafocnchncdBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    public Builder setOafocnchncd(POGOProtos.Rpc.CombatChallengeProto value) {
      if (oafocnchncdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oafocnchncd_ = value;
        onChanged();
      } else {
        oafocnchncdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    public Builder setOafocnchncd(
        POGOProtos.Rpc.CombatChallengeProto.Builder builderForValue) {
      if (oafocnchncdBuilder_ == null) {
        oafocnchncd_ = builderForValue.build();
        onChanged();
      } else {
        oafocnchncdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    public Builder mergeOafocnchncd(POGOProtos.Rpc.CombatChallengeProto value) {
      if (oafocnchncdBuilder_ == null) {
        if (oafocnchncd_ != null) {
          oafocnchncd_ =
            POGOProtos.Rpc.CombatChallengeProto.newBuilder(oafocnchncd_).mergeFrom(value).buildPartial();
        } else {
          oafocnchncd_ = value;
        }
        onChanged();
      } else {
        oafocnchncdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    public Builder clearOafocnchncd() {
      if (oafocnchncdBuilder_ == null) {
        oafocnchncd_ = null;
        onChanged();
      } else {
        oafocnchncd_ = null;
        oafocnchncdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    public POGOProtos.Rpc.CombatChallengeProto.Builder getOafocnchncdBuilder() {
      
      onChanged();
      return getOafocnchncdFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    public POGOProtos.Rpc.CombatChallengeProtoOrBuilder getOafocnchncdOrBuilder() {
      if (oafocnchncdBuilder_ != null) {
        return oafocnchncdBuilder_.getMessageOrBuilder();
      } else {
        return oafocnchncd_ == null ?
            POGOProtos.Rpc.CombatChallengeProto.getDefaultInstance() : oafocnchncd_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatChallengeProto oafocnchncd = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatChallengeProto, POGOProtos.Rpc.CombatChallengeProto.Builder, POGOProtos.Rpc.CombatChallengeProtoOrBuilder> 
        getOafocnchncdFieldBuilder() {
      if (oafocnchncdBuilder_ == null) {
        oafocnchncdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatChallengeProto, POGOProtos.Rpc.CombatChallengeProto.Builder, POGOProtos.Rpc.CombatChallengeProtoOrBuilder>(
                getOafocnchncd(),
                getParentForChildren(),
                isClean());
        oafocnchncd_ = null;
      }
      return oafocnchncdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JGIHCBDKLOO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JGIHCBDKLOO)
  private static final POGOProtos.Rpc.JGIHCBDKLOO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JGIHCBDKLOO();
  }

  public static POGOProtos.Rpc.JGIHCBDKLOO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JGIHCBDKLOO>
      PARSER = new com.google.protobuf.AbstractParser<JGIHCBDKLOO>() {
    @java.lang.Override
    public JGIHCBDKLOO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JGIHCBDKLOO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JGIHCBDKLOO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JGIHCBDKLOO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JGIHCBDKLOO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

