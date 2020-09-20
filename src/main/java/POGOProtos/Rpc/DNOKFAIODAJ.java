// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DNOKFAIODAJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.DNOKFAIODAJ}
 */
public final class DNOKFAIODAJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.DNOKFAIODAJ)
    DNOKFAIODAJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DNOKFAIODAJ.newBuilder() to construct.
  private DNOKFAIODAJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DNOKFAIODAJ() {
    result_ = 0;
    aeoedfahjck_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DNOKFAIODAJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DNOKFAIODAJ(
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

            higpjcjkknp_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            aeoedfahjck_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNOKFAIODAJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNOKFAIODAJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.DNOKFAIODAJ.class, POGOProtos.Rpc.DNOKFAIODAJ.Builder.class);
  }

  /**
   * <pre>
   * ref: DNOKFAIODAJ/FJDNCBMGJGO/FPADPNCBLLO
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.DNOKFAIODAJ.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>FOUND = 1;</code>
     */
    FOUND(1),
    /**
     * <code>NEARBY = 2;</code>
     */
    NEARBY(2),
    /**
     * <code>OUT_OF_RANGE = 3;</code>
     */
    OUT_OF_RANGE(3),
    /**
     * <code>ALREADY_CAUGHT = 4;</code>
     */
    ALREADY_CAUGHT(4),
    /**
     * <code>NOT_AVAILABLE = 5;</code>
     */
    NOT_AVAILABLE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>FOUND = 1;</code>
     */
    public static final int FOUND_VALUE = 1;
    /**
     * <code>NEARBY = 2;</code>
     */
    public static final int NEARBY_VALUE = 2;
    /**
     * <code>OUT_OF_RANGE = 3;</code>
     */
    public static final int OUT_OF_RANGE_VALUE = 3;
    /**
     * <code>ALREADY_CAUGHT = 4;</code>
     */
    public static final int ALREADY_CAUGHT_VALUE = 4;
    /**
     * <code>NOT_AVAILABLE = 5;</code>
     */
    public static final int NOT_AVAILABLE_VALUE = 5;


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
        case 1: return FOUND;
        case 2: return NEARBY;
        case 3: return OUT_OF_RANGE;
        case 4: return ALREADY_CAUGHT;
        case 5: return NOT_AVAILABLE;
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
      return POGOProtos.Rpc.DNOKFAIODAJ.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.DNOKFAIODAJ.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.DNOKFAIODAJ.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.DNOKFAIODAJ.Result result = POGOProtos.Rpc.DNOKFAIODAJ.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.DNOKFAIODAJ.Result.UNRECOGNIZED : result;
  }

  public static final int HIGPJCJKKNP_FIELD_NUMBER = 2;
  private int higpjcjkknp_;
  /**
   * <code>int32 higpjcjkknp = 2;</code>
   * @return The higpjcjkknp.
   */
  @java.lang.Override
  public int getHigpjcjkknp() {
    return higpjcjkknp_;
  }

  public static final int AEOEDFAHJCK_FIELD_NUMBER = 3;
  private volatile java.lang.Object aeoedfahjck_;
  /**
   * <code>string aeoedfahjck = 3;</code>
   * @return The aeoedfahjck.
   */
  @java.lang.Override
  public java.lang.String getAeoedfahjck() {
    java.lang.Object ref = aeoedfahjck_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aeoedfahjck_ = s;
      return s;
    }
  }
  /**
   * <code>string aeoedfahjck = 3;</code>
   * @return The bytes for aeoedfahjck.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAeoedfahjckBytes() {
    java.lang.Object ref = aeoedfahjck_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aeoedfahjck_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (result_ != POGOProtos.Rpc.DNOKFAIODAJ.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (higpjcjkknp_ != 0) {
      output.writeInt32(2, higpjcjkknp_);
    }
    if (!getAeoedfahjckBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, aeoedfahjck_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.DNOKFAIODAJ.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (higpjcjkknp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, higpjcjkknp_);
    }
    if (!getAeoedfahjckBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, aeoedfahjck_);
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
    if (!(obj instanceof POGOProtos.Rpc.DNOKFAIODAJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.DNOKFAIODAJ other = (POGOProtos.Rpc.DNOKFAIODAJ) obj;

    if (result_ != other.result_) return false;
    if (getHigpjcjkknp()
        != other.getHigpjcjkknp()) return false;
    if (!getAeoedfahjck()
        .equals(other.getAeoedfahjck())) return false;
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
    hash = (37 * hash) + HIGPJCJKKNP_FIELD_NUMBER;
    hash = (53 * hash) + getHigpjcjkknp();
    hash = (37 * hash) + AEOEDFAHJCK_FIELD_NUMBER;
    hash = (53 * hash) + getAeoedfahjck().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.DNOKFAIODAJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.DNOKFAIODAJ prototype) {
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
   * ref: DNOKFAIODAJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.DNOKFAIODAJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.DNOKFAIODAJ)
      POGOProtos.Rpc.DNOKFAIODAJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNOKFAIODAJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNOKFAIODAJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.DNOKFAIODAJ.class, POGOProtos.Rpc.DNOKFAIODAJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.DNOKFAIODAJ.newBuilder()
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

      higpjcjkknp_ = 0;

      aeoedfahjck_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_DNOKFAIODAJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DNOKFAIODAJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.DNOKFAIODAJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.DNOKFAIODAJ build() {
      POGOProtos.Rpc.DNOKFAIODAJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.DNOKFAIODAJ buildPartial() {
      POGOProtos.Rpc.DNOKFAIODAJ result = new POGOProtos.Rpc.DNOKFAIODAJ(this);
      result.result_ = result_;
      result.higpjcjkknp_ = higpjcjkknp_;
      result.aeoedfahjck_ = aeoedfahjck_;
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
      if (other instanceof POGOProtos.Rpc.DNOKFAIODAJ) {
        return mergeFrom((POGOProtos.Rpc.DNOKFAIODAJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.DNOKFAIODAJ other) {
      if (other == POGOProtos.Rpc.DNOKFAIODAJ.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.getHigpjcjkknp() != 0) {
        setHigpjcjkknp(other.getHigpjcjkknp());
      }
      if (!other.getAeoedfahjck().isEmpty()) {
        aeoedfahjck_ = other.aeoedfahjck_;
        onChanged();
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
      POGOProtos.Rpc.DNOKFAIODAJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.DNOKFAIODAJ) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.DNOKFAIODAJ.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.DNOKFAIODAJ.Result result = POGOProtos.Rpc.DNOKFAIODAJ.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.DNOKFAIODAJ.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.DNOKFAIODAJ.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.DNOKFAIODAJ.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private int higpjcjkknp_ ;
    /**
     * <code>int32 higpjcjkknp = 2;</code>
     * @return The higpjcjkknp.
     */
    @java.lang.Override
    public int getHigpjcjkknp() {
      return higpjcjkknp_;
    }
    /**
     * <code>int32 higpjcjkknp = 2;</code>
     * @param value The higpjcjkknp to set.
     * @return This builder for chaining.
     */
    public Builder setHigpjcjkknp(int value) {
      
      higpjcjkknp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 higpjcjkknp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHigpjcjkknp() {
      
      higpjcjkknp_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object aeoedfahjck_ = "";
    /**
     * <code>string aeoedfahjck = 3;</code>
     * @return The aeoedfahjck.
     */
    public java.lang.String getAeoedfahjck() {
      java.lang.Object ref = aeoedfahjck_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aeoedfahjck_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aeoedfahjck = 3;</code>
     * @return The bytes for aeoedfahjck.
     */
    public com.google.protobuf.ByteString
        getAeoedfahjckBytes() {
      java.lang.Object ref = aeoedfahjck_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aeoedfahjck_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aeoedfahjck = 3;</code>
     * @param value The aeoedfahjck to set.
     * @return This builder for chaining.
     */
    public Builder setAeoedfahjck(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aeoedfahjck_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aeoedfahjck = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAeoedfahjck() {
      
      aeoedfahjck_ = getDefaultInstance().getAeoedfahjck();
      onChanged();
      return this;
    }
    /**
     * <code>string aeoedfahjck = 3;</code>
     * @param value The bytes for aeoedfahjck to set.
     * @return This builder for chaining.
     */
    public Builder setAeoedfahjckBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aeoedfahjck_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.DNOKFAIODAJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.DNOKFAIODAJ)
  private static final POGOProtos.Rpc.DNOKFAIODAJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.DNOKFAIODAJ();
  }

  public static POGOProtos.Rpc.DNOKFAIODAJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DNOKFAIODAJ>
      PARSER = new com.google.protobuf.AbstractParser<DNOKFAIODAJ>() {
    @java.lang.Override
    public DNOKFAIODAJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DNOKFAIODAJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DNOKFAIODAJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNOKFAIODAJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.DNOKFAIODAJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

