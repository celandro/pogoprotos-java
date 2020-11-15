// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.AssetDigestOutProto}
 */
public final class AssetDigestOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AssetDigestOutProto)
    AssetDigestOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetDigestOutProto.newBuilder() to construct.
  private AssetDigestOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetDigestOutProto() {
    digest_ = java.util.Collections.emptyList();
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetDigestOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AssetDigestOutProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              digest_ = new java.util.ArrayList<POGOProtos.Rpc.AssetDigestEntryProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            digest_.add(
                input.readMessage(POGOProtos.Rpc.AssetDigestEntryProto.parser(), extensionRegistry));
            break;
          }
          case 16: {

            timestamp_ = input.readUInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            result_ = rawValue;
            break;
          }
          case 32: {

            pageOffset_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        digest_ = java.util.Collections.unmodifiableList(digest_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AssetDigestOutProto.class, POGOProtos.Rpc.AssetDigestOutProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.AssetDigestOutProto.Result}
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
     * <code>PAGE = 2;</code>
     */
    PAGE(2),
    /**
     * <code>RETRY = 3;</code>
     */
    RETRY(3),
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
     * <code>PAGE = 2;</code>
     */
    public static final int PAGE_VALUE = 2;
    /**
     * <code>RETRY = 3;</code>
     */
    public static final int RETRY_VALUE = 3;


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
        case 2: return PAGE;
        case 3: return RETRY;
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
      return POGOProtos.Rpc.AssetDigestOutProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.AssetDigestOutProto.Result)
  }

  public static final int DIGEST_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.AssetDigestEntryProto> digest_;
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.AssetDigestEntryProto> getDigestList() {
    return digest_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder> 
      getDigestOrBuilderList() {
    return digest_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
   */
  @java.lang.Override
  public int getDigestCount() {
    return digest_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AssetDigestEntryProto getDigest(int index) {
    return digest_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder getDigestOrBuilder(
      int index) {
    return digest_.get(index);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <code>uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.AssetDigestOutProto.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.AssetDigestOutProto.Result result = POGOProtos.Rpc.AssetDigestOutProto.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.AssetDigestOutProto.Result.UNRECOGNIZED : result;
  }

  public static final int PAGE_OFFSET_FIELD_NUMBER = 4;
  private int pageOffset_;
  /**
   * <code>int32 page_offset = 4;</code>
   * @return The pageOffset.
   */
  @java.lang.Override
  public int getPageOffset() {
    return pageOffset_;
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
    for (int i = 0; i < digest_.size(); i++) {
      output.writeMessage(1, digest_.get(i));
    }
    if (timestamp_ != 0L) {
      output.writeUInt64(2, timestamp_);
    }
    if (result_ != POGOProtos.Rpc.AssetDigestOutProto.Result.UNSET.getNumber()) {
      output.writeEnum(3, result_);
    }
    if (pageOffset_ != 0) {
      output.writeInt32(4, pageOffset_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < digest_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, digest_.get(i));
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
    }
    if (result_ != POGOProtos.Rpc.AssetDigestOutProto.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, result_);
    }
    if (pageOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pageOffset_);
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
    if (!(obj instanceof POGOProtos.Rpc.AssetDigestOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AssetDigestOutProto other = (POGOProtos.Rpc.AssetDigestOutProto) obj;

    if (!getDigestList()
        .equals(other.getDigestList())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (result_ != other.result_) return false;
    if (getPageOffset()
        != other.getPageOffset()) return false;
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
    if (getDigestCount() > 0) {
      hash = (37 * hash) + DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getDigestList().hashCode();
    }
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    hash = (37 * hash) + PAGE_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getPageOffset();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AssetDigestOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AssetDigestOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.AssetDigestOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AssetDigestOutProto)
      POGOProtos.Rpc.AssetDigestOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AssetDigestOutProto.class, POGOProtos.Rpc.AssetDigestOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AssetDigestOutProto.newBuilder()
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
        getDigestFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (digestBuilder_ == null) {
        digest_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        digestBuilder_.clear();
      }
      timestamp_ = 0L;

      result_ = 0;

      pageOffset_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_AssetDigestOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AssetDigestOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestOutProto build() {
      POGOProtos.Rpc.AssetDigestOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestOutProto buildPartial() {
      POGOProtos.Rpc.AssetDigestOutProto result = new POGOProtos.Rpc.AssetDigestOutProto(this);
      int from_bitField0_ = bitField0_;
      if (digestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          digest_ = java.util.Collections.unmodifiableList(digest_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.digest_ = digest_;
      } else {
        result.digest_ = digestBuilder_.build();
      }
      result.timestamp_ = timestamp_;
      result.result_ = result_;
      result.pageOffset_ = pageOffset_;
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
      if (other instanceof POGOProtos.Rpc.AssetDigestOutProto) {
        return mergeFrom((POGOProtos.Rpc.AssetDigestOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AssetDigestOutProto other) {
      if (other == POGOProtos.Rpc.AssetDigestOutProto.getDefaultInstance()) return this;
      if (digestBuilder_ == null) {
        if (!other.digest_.isEmpty()) {
          if (digest_.isEmpty()) {
            digest_ = other.digest_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDigestIsMutable();
            digest_.addAll(other.digest_);
          }
          onChanged();
        }
      } else {
        if (!other.digest_.isEmpty()) {
          if (digestBuilder_.isEmpty()) {
            digestBuilder_.dispose();
            digestBuilder_ = null;
            digest_ = other.digest_;
            bitField0_ = (bitField0_ & ~0x00000001);
            digestBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDigestFieldBuilder() : null;
          } else {
            digestBuilder_.addAllMessages(other.digest_);
          }
        }
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.getPageOffset() != 0) {
        setPageOffset(other.getPageOffset());
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
      POGOProtos.Rpc.AssetDigestOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AssetDigestOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.AssetDigestEntryProto> digest_ =
      java.util.Collections.emptyList();
    private void ensureDigestIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        digest_ = new java.util.ArrayList<POGOProtos.Rpc.AssetDigestEntryProto>(digest_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.AssetDigestEntryProto, POGOProtos.Rpc.AssetDigestEntryProto.Builder, POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder> digestBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.AssetDigestEntryProto> getDigestList() {
      if (digestBuilder_ == null) {
        return java.util.Collections.unmodifiableList(digest_);
      } else {
        return digestBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public int getDigestCount() {
      if (digestBuilder_ == null) {
        return digest_.size();
      } else {
        return digestBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public POGOProtos.Rpc.AssetDigestEntryProto getDigest(int index) {
      if (digestBuilder_ == null) {
        return digest_.get(index);
      } else {
        return digestBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder setDigest(
        int index, POGOProtos.Rpc.AssetDigestEntryProto value) {
      if (digestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDigestIsMutable();
        digest_.set(index, value);
        onChanged();
      } else {
        digestBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder setDigest(
        int index, POGOProtos.Rpc.AssetDigestEntryProto.Builder builderForValue) {
      if (digestBuilder_ == null) {
        ensureDigestIsMutable();
        digest_.set(index, builderForValue.build());
        onChanged();
      } else {
        digestBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder addDigest(POGOProtos.Rpc.AssetDigestEntryProto value) {
      if (digestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDigestIsMutable();
        digest_.add(value);
        onChanged();
      } else {
        digestBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder addDigest(
        int index, POGOProtos.Rpc.AssetDigestEntryProto value) {
      if (digestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDigestIsMutable();
        digest_.add(index, value);
        onChanged();
      } else {
        digestBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder addDigest(
        POGOProtos.Rpc.AssetDigestEntryProto.Builder builderForValue) {
      if (digestBuilder_ == null) {
        ensureDigestIsMutable();
        digest_.add(builderForValue.build());
        onChanged();
      } else {
        digestBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder addDigest(
        int index, POGOProtos.Rpc.AssetDigestEntryProto.Builder builderForValue) {
      if (digestBuilder_ == null) {
        ensureDigestIsMutable();
        digest_.add(index, builderForValue.build());
        onChanged();
      } else {
        digestBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder addAllDigest(
        java.lang.Iterable<? extends POGOProtos.Rpc.AssetDigestEntryProto> values) {
      if (digestBuilder_ == null) {
        ensureDigestIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, digest_);
        onChanged();
      } else {
        digestBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder clearDigest() {
      if (digestBuilder_ == null) {
        digest_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        digestBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public Builder removeDigest(int index) {
      if (digestBuilder_ == null) {
        ensureDigestIsMutable();
        digest_.remove(index);
        onChanged();
      } else {
        digestBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public POGOProtos.Rpc.AssetDigestEntryProto.Builder getDigestBuilder(
        int index) {
      return getDigestFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder getDigestOrBuilder(
        int index) {
      if (digestBuilder_ == null) {
        return digest_.get(index);  } else {
        return digestBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder> 
         getDigestOrBuilderList() {
      if (digestBuilder_ != null) {
        return digestBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(digest_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public POGOProtos.Rpc.AssetDigestEntryProto.Builder addDigestBuilder() {
      return getDigestFieldBuilder().addBuilder(
          POGOProtos.Rpc.AssetDigestEntryProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public POGOProtos.Rpc.AssetDigestEntryProto.Builder addDigestBuilder(
        int index) {
      return getDigestFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.AssetDigestEntryProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AssetDigestEntryProto digest = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.AssetDigestEntryProto.Builder> 
         getDigestBuilderList() {
      return getDigestFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.AssetDigestEntryProto, POGOProtos.Rpc.AssetDigestEntryProto.Builder, POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder> 
        getDigestFieldBuilder() {
      if (digestBuilder_ == null) {
        digestBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.AssetDigestEntryProto, POGOProtos.Rpc.AssetDigestEntryProto.Builder, POGOProtos.Rpc.AssetDigestEntryProtoOrBuilder>(
                digest_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        digest_ = null;
      }
      return digestBuilder_;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.AssetDigestOutProto.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.AssetDigestOutProto.Result result = POGOProtos.Rpc.AssetDigestOutProto.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.AssetDigestOutProto.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.AssetDigestOutProto.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AssetDigestOutProto.Result result = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private int pageOffset_ ;
    /**
     * <code>int32 page_offset = 4;</code>
     * @return The pageOffset.
     */
    @java.lang.Override
    public int getPageOffset() {
      return pageOffset_;
    }
    /**
     * <code>int32 page_offset = 4;</code>
     * @param value The pageOffset to set.
     * @return This builder for chaining.
     */
    public Builder setPageOffset(int value) {
      
      pageOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_offset = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageOffset() {
      
      pageOffset_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AssetDigestOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AssetDigestOutProto)
  private static final POGOProtos.Rpc.AssetDigestOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AssetDigestOutProto();
  }

  public static POGOProtos.Rpc.AssetDigestOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetDigestOutProto>
      PARSER = new com.google.protobuf.AbstractParser<AssetDigestOutProto>() {
    @java.lang.Override
    public AssetDigestOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AssetDigestOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AssetDigestOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetDigestOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AssetDigestOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

