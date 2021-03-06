// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlayerSubmissionResponseProto}
 */
public final class PlayerSubmissionResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlayerSubmissionResponseProto)
    PlayerSubmissionResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayerSubmissionResponseProto.newBuilder() to construct.
  private PlayerSubmissionResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayerSubmissionResponseProto() {
    status_ = 0;
    submissionId_ = "";
    messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayerSubmissionResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlayerSubmissionResponseProto(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            submissionId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              messages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            messages_.add(s);
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
        messages_ = messages_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSubmissionResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSubmissionResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlayerSubmissionResponseProto.class, POGOProtos.Rpc.PlayerSubmissionResponseProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.PlayerSubmissionResponseProto.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>INTERNAL_ERROR = 2;</code>
     */
    INTERNAL_ERROR(2),
    /**
     * <code>TOO_MANY_RECENT_SUBMISSIONS = 3;</code>
     */
    TOO_MANY_RECENT_SUBMISSIONS(3),
    /**
     * <code>MINOR = 4;</code>
     */
    MINOR(4),
    /**
     * <code>NOT_AVAILABLE = 5;</code>
     */
    NOT_AVAILABLE(5),
    /**
     * <code>INVALID_INPUT = 6;</code>
     */
    INVALID_INPUT(6),
    /**
     * <code>MISSING_IMAGE = 7;</code>
     */
    MISSING_IMAGE(7),
    /**
     * <code>DISTANCE_VALIDATION_FAILED = 8;</code>
     */
    DISTANCE_VALIDATION_FAILED(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>INTERNAL_ERROR = 2;</code>
     */
    public static final int INTERNAL_ERROR_VALUE = 2;
    /**
     * <code>TOO_MANY_RECENT_SUBMISSIONS = 3;</code>
     */
    public static final int TOO_MANY_RECENT_SUBMISSIONS_VALUE = 3;
    /**
     * <code>MINOR = 4;</code>
     */
    public static final int MINOR_VALUE = 4;
    /**
     * <code>NOT_AVAILABLE = 5;</code>
     */
    public static final int NOT_AVAILABLE_VALUE = 5;
    /**
     * <code>INVALID_INPUT = 6;</code>
     */
    public static final int INVALID_INPUT_VALUE = 6;
    /**
     * <code>MISSING_IMAGE = 7;</code>
     */
    public static final int MISSING_IMAGE_VALUE = 7;
    /**
     * <code>DISTANCE_VALIDATION_FAILED = 8;</code>
     */
    public static final int DISTANCE_VALIDATION_FAILED_VALUE = 8;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSPECIFIED;
        case 1: return SUCCESS;
        case 2: return INTERNAL_ERROR;
        case 3: return TOO_MANY_RECENT_SUBMISSIONS;
        case 4: return MINOR;
        case 5: return NOT_AVAILABLE;
        case 6: return INVALID_INPUT;
        case 7: return MISSING_IMAGE;
        case 8: return DISTANCE_VALIDATION_FAILED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return POGOProtos.Rpc.PlayerSubmissionResponseProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PlayerSubmissionResponseProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.PlayerSubmissionResponseProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PlayerSubmissionResponseProto.Status result = POGOProtos.Rpc.PlayerSubmissionResponseProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.PlayerSubmissionResponseProto.Status.UNRECOGNIZED : result;
  }

  public static final int SUBMISSION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object submissionId_;
  /**
   * <code>string submission_id = 2;</code>
   * @return The submissionId.
   */
  @java.lang.Override
  public java.lang.String getSubmissionId() {
    java.lang.Object ref = submissionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      submissionId_ = s;
      return s;
    }
  }
  /**
   * <code>string submission_id = 2;</code>
   * @return The bytes for submissionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubmissionIdBytes() {
    java.lang.Object ref = submissionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      submissionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList messages_;
  /**
   * <code>repeated string messages = 3;</code>
   * @return A list containing the messages.
   */
  public com.google.protobuf.ProtocolStringList
      getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated string messages = 3;</code>
   * @return The count of messages.
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated string messages = 3;</code>
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  public java.lang.String getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated string messages = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  public com.google.protobuf.ByteString
      getMessagesBytes(int index) {
    return messages_.getByteString(index);
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
    if (status_ != POGOProtos.Rpc.PlayerSubmissionResponseProto.Status.STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!getSubmissionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, submissionId_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messages_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.PlayerSubmissionResponseProto.Status.STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!getSubmissionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, submissionId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < messages_.size(); i++) {
        dataSize += computeStringSizeNoTag(messages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessagesList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.PlayerSubmissionResponseProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlayerSubmissionResponseProto other = (POGOProtos.Rpc.PlayerSubmissionResponseProto) obj;

    if (status_ != other.status_) return false;
    if (!getSubmissionId()
        .equals(other.getSubmissionId())) return false;
    if (!getMessagesList()
        .equals(other.getMessagesList())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + SUBMISSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubmissionId().hashCode();
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlayerSubmissionResponseProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlayerSubmissionResponseProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlayerSubmissionResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlayerSubmissionResponseProto)
      POGOProtos.Rpc.PlayerSubmissionResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSubmissionResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSubmissionResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlayerSubmissionResponseProto.class, POGOProtos.Rpc.PlayerSubmissionResponseProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlayerSubmissionResponseProto.newBuilder()
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
      status_ = 0;

      submissionId_ = "";

      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PlayerSubmissionResponseProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSubmissionResponseProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlayerSubmissionResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSubmissionResponseProto build() {
      POGOProtos.Rpc.PlayerSubmissionResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlayerSubmissionResponseProto buildPartial() {
      POGOProtos.Rpc.PlayerSubmissionResponseProto result = new POGOProtos.Rpc.PlayerSubmissionResponseProto(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      result.submissionId_ = submissionId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        messages_ = messages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messages_ = messages_;
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
      if (other instanceof POGOProtos.Rpc.PlayerSubmissionResponseProto) {
        return mergeFrom((POGOProtos.Rpc.PlayerSubmissionResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlayerSubmissionResponseProto other) {
      if (other == POGOProtos.Rpc.PlayerSubmissionResponseProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getSubmissionId().isEmpty()) {
        submissionId_ = other.submissionId_;
        onChanged();
      }
      if (!other.messages_.isEmpty()) {
        if (messages_.isEmpty()) {
          messages_ = other.messages_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessagesIsMutable();
          messages_.addAll(other.messages_);
        }
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
      POGOProtos.Rpc.PlayerSubmissionResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlayerSubmissionResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PlayerSubmissionResponseProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PlayerSubmissionResponseProto.Status result = POGOProtos.Rpc.PlayerSubmissionResponseProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.PlayerSubmissionResponseProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.PlayerSubmissionResponseProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionResponseProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object submissionId_ = "";
    /**
     * <code>string submission_id = 2;</code>
     * @return The submissionId.
     */
    public java.lang.String getSubmissionId() {
      java.lang.Object ref = submissionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        submissionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string submission_id = 2;</code>
     * @return The bytes for submissionId.
     */
    public com.google.protobuf.ByteString
        getSubmissionIdBytes() {
      java.lang.Object ref = submissionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        submissionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string submission_id = 2;</code>
     * @param value The submissionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      submissionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string submission_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionId() {
      
      submissionId_ = getDefaultInstance().getSubmissionId();
      onChanged();
      return this;
    }
    /**
     * <code>string submission_id = 2;</code>
     * @param value The bytes for submissionId to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      submissionId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @return A list containing the messages.
     */
    public com.google.protobuf.ProtocolStringList
        getMessagesList() {
      return messages_.getUnmodifiableView();
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @return The count of messages.
     */
    public int getMessagesCount() {
      return messages_.size();
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @param index The index of the element to return.
     * @return The messages at the given index.
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the messages at the given index.
     */
    public com.google.protobuf.ByteString
        getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @param index The index to set the value at.
     * @param value The messages to set.
     * @return This builder for chaining.
     */
    public Builder setMessages(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @param value The messages to add.
     * @return This builder for chaining.
     */
    public Builder addMessages(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @param values The messages to add.
     * @return This builder for chaining.
     */
    public Builder addAllMessages(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, messages_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessages() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string messages = 3;</code>
     * @param value The bytes of the messages to add.
     * @return This builder for chaining.
     */
    public Builder addMessagesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMessagesIsMutable();
      messages_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlayerSubmissionResponseProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlayerSubmissionResponseProto)
  private static final POGOProtos.Rpc.PlayerSubmissionResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlayerSubmissionResponseProto();
  }

  public static POGOProtos.Rpc.PlayerSubmissionResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayerSubmissionResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<PlayerSubmissionResponseProto>() {
    @java.lang.Override
    public PlayerSubmissionResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlayerSubmissionResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayerSubmissionResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayerSubmissionResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlayerSubmissionResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

