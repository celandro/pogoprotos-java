// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto}
 */
public  final class TitanGetGrapeshotUploadUrlProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto)
    TitanGetGrapeshotUploadUrlProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TitanGetGrapeshotUploadUrlProto.newBuilder() to construct.
  private TitanGetGrapeshotUploadUrlProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TitanGetGrapeshotUploadUrlProto() {
    submissionType_ = 0;
    submissionId_ = "";
    fileUploadContext_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TitanGetGrapeshotUploadUrlProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TitanGetGrapeshotUploadUrlProto(
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

            submissionType_ = rawValue;
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
              fileUploadContext_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            fileUploadContext_.add(s);
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
        fileUploadContext_ = fileUploadContext_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.class, POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.Builder.class);
  }

  public static final int SUBMISSION_TYPE_FIELD_NUMBER = 1;
  private int submissionType_;
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
   * @return The enum numeric value on the wire for submissionType.
   */
  public int getSubmissionTypeValue() {
    return submissionType_;
  }
  /**
   * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
   * @return The submissionType.
   */
  public POGOProtos.Rpc.PlayerSubmissionTypeProto getSubmissionType() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PlayerSubmissionTypeProto result = POGOProtos.Rpc.PlayerSubmissionTypeProto.valueOf(submissionType_);
    return result == null ? POGOProtos.Rpc.PlayerSubmissionTypeProto.UNRECOGNIZED : result;
  }

  public static final int SUBMISSION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object submissionId_;
  /**
   * <code>string submission_id = 2;</code>
   * @return The submissionId.
   */
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

  public static final int FILE_UPLOAD_CONTEXT_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList fileUploadContext_;
  /**
   * <code>repeated string file_upload_context = 3;</code>
   * @return A list containing the fileUploadContext.
   */
  public com.google.protobuf.ProtocolStringList
      getFileUploadContextList() {
    return fileUploadContext_;
  }
  /**
   * <code>repeated string file_upload_context = 3;</code>
   * @return The count of fileUploadContext.
   */
  public int getFileUploadContextCount() {
    return fileUploadContext_.size();
  }
  /**
   * <code>repeated string file_upload_context = 3;</code>
   * @param index The index of the element to return.
   * @return The fileUploadContext at the given index.
   */
  public java.lang.String getFileUploadContext(int index) {
    return fileUploadContext_.get(index);
  }
  /**
   * <code>repeated string file_upload_context = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fileUploadContext at the given index.
   */
  public com.google.protobuf.ByteString
      getFileUploadContextBytes(int index) {
    return fileUploadContext_.getByteString(index);
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
    if (submissionType_ != POGOProtos.Rpc.PlayerSubmissionTypeProto.PLATFORM_PLAYERSUBMISSIONTYPEPROTO_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, submissionType_);
    }
    if (!getSubmissionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, submissionId_);
    }
    for (int i = 0; i < fileUploadContext_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileUploadContext_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (submissionType_ != POGOProtos.Rpc.PlayerSubmissionTypeProto.PLATFORM_PLAYERSUBMISSIONTYPEPROTO_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, submissionType_);
    }
    if (!getSubmissionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, submissionId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fileUploadContext_.size(); i++) {
        dataSize += computeStringSizeNoTag(fileUploadContext_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFileUploadContextList().size();
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
    if (!(obj instanceof POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto other = (POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto) obj;

    if (submissionType_ != other.submissionType_) return false;
    if (!getSubmissionId()
        .equals(other.getSubmissionId())) return false;
    if (!getFileUploadContextList()
        .equals(other.getFileUploadContextList())) return false;
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
    hash = (37 * hash) + SUBMISSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + submissionType_;
    hash = (37 * hash) + SUBMISSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubmissionId().hashCode();
    if (getFileUploadContextCount() > 0) {
      hash = (37 * hash) + FILE_UPLOAD_CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getFileUploadContextList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto)
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.class, POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.newBuilder()
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
      submissionType_ = 0;

      submissionId_ = "";

      fileUploadContext_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TitanGetGrapeshotUploadUrlProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto build() {
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto buildPartial() {
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto result = new POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto(this);
      int from_bitField0_ = bitField0_;
      result.submissionType_ = submissionType_;
      result.submissionId_ = submissionId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fileUploadContext_ = fileUploadContext_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fileUploadContext_ = fileUploadContext_;
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
      if (other instanceof POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto) {
        return mergeFrom((POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto other) {
      if (other == POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto.getDefaultInstance()) return this;
      if (other.submissionType_ != 0) {
        setSubmissionTypeValue(other.getSubmissionTypeValue());
      }
      if (!other.getSubmissionId().isEmpty()) {
        submissionId_ = other.submissionId_;
        onChanged();
      }
      if (!other.fileUploadContext_.isEmpty()) {
        if (fileUploadContext_.isEmpty()) {
          fileUploadContext_ = other.fileUploadContext_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFileUploadContextIsMutable();
          fileUploadContext_.addAll(other.fileUploadContext_);
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
      POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int submissionType_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
     * @return The enum numeric value on the wire for submissionType.
     */
    public int getSubmissionTypeValue() {
      return submissionType_;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
     * @param value The enum numeric value on the wire for submissionType to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypeValue(int value) {
      submissionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
     * @return The submissionType.
     */
    public POGOProtos.Rpc.PlayerSubmissionTypeProto getSubmissionType() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PlayerSubmissionTypeProto result = POGOProtos.Rpc.PlayerSubmissionTypeProto.valueOf(submissionType_);
      return result == null ? POGOProtos.Rpc.PlayerSubmissionTypeProto.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
     * @param value The submissionType to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionType(POGOProtos.Rpc.PlayerSubmissionTypeProto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      submissionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PlayerSubmissionTypeProto submission_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionType() {
      
      submissionType_ = 0;
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

    private com.google.protobuf.LazyStringList fileUploadContext_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureFileUploadContextIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fileUploadContext_ = new com.google.protobuf.LazyStringArrayList(fileUploadContext_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @return A list containing the fileUploadContext.
     */
    public com.google.protobuf.ProtocolStringList
        getFileUploadContextList() {
      return fileUploadContext_.getUnmodifiableView();
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @return The count of fileUploadContext.
     */
    public int getFileUploadContextCount() {
      return fileUploadContext_.size();
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @param index The index of the element to return.
     * @return The fileUploadContext at the given index.
     */
    public java.lang.String getFileUploadContext(int index) {
      return fileUploadContext_.get(index);
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the fileUploadContext at the given index.
     */
    public com.google.protobuf.ByteString
        getFileUploadContextBytes(int index) {
      return fileUploadContext_.getByteString(index);
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @param index The index to set the value at.
     * @param value The fileUploadContext to set.
     * @return This builder for chaining.
     */
    public Builder setFileUploadContext(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFileUploadContextIsMutable();
      fileUploadContext_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @param value The fileUploadContext to add.
     * @return This builder for chaining.
     */
    public Builder addFileUploadContext(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureFileUploadContextIsMutable();
      fileUploadContext_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @param values The fileUploadContext to add.
     * @return This builder for chaining.
     */
    public Builder addAllFileUploadContext(
        java.lang.Iterable<java.lang.String> values) {
      ensureFileUploadContextIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fileUploadContext_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileUploadContext() {
      fileUploadContext_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string file_upload_context = 3;</code>
     * @param value The bytes of the fileUploadContext to add.
     * @return This builder for chaining.
     */
    public Builder addFileUploadContextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureFileUploadContextIsMutable();
      fileUploadContext_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto)
  private static final POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto();
  }

  public static POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TitanGetGrapeshotUploadUrlProto>
      PARSER = new com.google.protobuf.AbstractParser<TitanGetGrapeshotUploadUrlProto>() {
    @java.lang.Override
    public TitanGetGrapeshotUploadUrlProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TitanGetGrapeshotUploadUrlProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TitanGetGrapeshotUploadUrlProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TitanGetGrapeshotUploadUrlProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TitanGetGrapeshotUploadUrlProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

