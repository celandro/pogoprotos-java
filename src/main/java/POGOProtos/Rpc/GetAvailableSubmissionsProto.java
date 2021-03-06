// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetAvailableSubmissionsProto}
 */
public final class GetAvailableSubmissionsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetAvailableSubmissionsProto)
    GetAvailableSubmissionsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAvailableSubmissionsProto.newBuilder() to construct.
  private GetAvailableSubmissionsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAvailableSubmissionsProto() {
    submissionTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAvailableSubmissionsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAvailableSubmissionsProto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              submissionTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            submissionTypes_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                submissionTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              submissionTypes_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        submissionTypes_ = java.util.Collections.unmodifiableList(submissionTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetAvailableSubmissionsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetAvailableSubmissionsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetAvailableSubmissionsProto.class, POGOProtos.Rpc.GetAvailableSubmissionsProto.Builder.class);
  }

  public static final int SUBMISSION_TYPES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> submissionTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.PlayerSubmissionTypeProto> submissionTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.PlayerSubmissionTypeProto>() {
            public POGOProtos.Rpc.PlayerSubmissionTypeProto convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.PlayerSubmissionTypeProto result = POGOProtos.Rpc.PlayerSubmissionTypeProto.valueOf(from);
              return result == null ? POGOProtos.Rpc.PlayerSubmissionTypeProto.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
   * @return A list containing the submissionTypes.
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.PlayerSubmissionTypeProto> getSubmissionTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.PlayerSubmissionTypeProto>(submissionTypes_, submissionTypes_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
   * @return The count of submissionTypes.
   */
  @java.lang.Override
  public int getSubmissionTypesCount() {
    return submissionTypes_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
   * @param index The index of the element to return.
   * @return The submissionTypes at the given index.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PlayerSubmissionTypeProto getSubmissionTypes(int index) {
    return submissionTypes_converter_.convert(submissionTypes_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
   * @return A list containing the enum numeric values on the wire for submissionTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getSubmissionTypesValueList() {
    return submissionTypes_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of submissionTypes at the given index.
   */
  @java.lang.Override
  public int getSubmissionTypesValue(int index) {
    return submissionTypes_.get(index);
  }
  private int submissionTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getSubmissionTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(submissionTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < submissionTypes_.size(); i++) {
      output.writeEnumNoTag(submissionTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < submissionTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(submissionTypes_.get(i));
      }
      size += dataSize;
      if (!getSubmissionTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }submissionTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.GetAvailableSubmissionsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetAvailableSubmissionsProto other = (POGOProtos.Rpc.GetAvailableSubmissionsProto) obj;

    if (!submissionTypes_.equals(other.submissionTypes_)) return false;
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
    if (getSubmissionTypesCount() > 0) {
      hash = (37 * hash) + SUBMISSION_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + submissionTypes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetAvailableSubmissionsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetAvailableSubmissionsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetAvailableSubmissionsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetAvailableSubmissionsProto)
      POGOProtos.Rpc.GetAvailableSubmissionsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetAvailableSubmissionsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetAvailableSubmissionsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetAvailableSubmissionsProto.class, POGOProtos.Rpc.GetAvailableSubmissionsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetAvailableSubmissionsProto.newBuilder()
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
      submissionTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_GetAvailableSubmissionsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetAvailableSubmissionsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetAvailableSubmissionsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetAvailableSubmissionsProto build() {
      POGOProtos.Rpc.GetAvailableSubmissionsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetAvailableSubmissionsProto buildPartial() {
      POGOProtos.Rpc.GetAvailableSubmissionsProto result = new POGOProtos.Rpc.GetAvailableSubmissionsProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        submissionTypes_ = java.util.Collections.unmodifiableList(submissionTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.submissionTypes_ = submissionTypes_;
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
      if (other instanceof POGOProtos.Rpc.GetAvailableSubmissionsProto) {
        return mergeFrom((POGOProtos.Rpc.GetAvailableSubmissionsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetAvailableSubmissionsProto other) {
      if (other == POGOProtos.Rpc.GetAvailableSubmissionsProto.getDefaultInstance()) return this;
      if (!other.submissionTypes_.isEmpty()) {
        if (submissionTypes_.isEmpty()) {
          submissionTypes_ = other.submissionTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSubmissionTypesIsMutable();
          submissionTypes_.addAll(other.submissionTypes_);
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
      POGOProtos.Rpc.GetAvailableSubmissionsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetAvailableSubmissionsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> submissionTypes_ =
      java.util.Collections.emptyList();
    private void ensureSubmissionTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        submissionTypes_ = new java.util.ArrayList<java.lang.Integer>(submissionTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @return A list containing the submissionTypes.
     */
    public java.util.List<POGOProtos.Rpc.PlayerSubmissionTypeProto> getSubmissionTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.PlayerSubmissionTypeProto>(submissionTypes_, submissionTypes_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @return The count of submissionTypes.
     */
    public int getSubmissionTypesCount() {
      return submissionTypes_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param index The index of the element to return.
     * @return The submissionTypes at the given index.
     */
    public POGOProtos.Rpc.PlayerSubmissionTypeProto getSubmissionTypes(int index) {
      return submissionTypes_converter_.convert(submissionTypes_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param index The index to set the value at.
     * @param value The submissionTypes to set.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypes(
        int index, POGOProtos.Rpc.PlayerSubmissionTypeProto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSubmissionTypesIsMutable();
      submissionTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param value The submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addSubmissionTypes(POGOProtos.Rpc.PlayerSubmissionTypeProto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSubmissionTypesIsMutable();
      submissionTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param values The submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllSubmissionTypes(
        java.lang.Iterable<? extends POGOProtos.Rpc.PlayerSubmissionTypeProto> values) {
      ensureSubmissionTypesIsMutable();
      for (POGOProtos.Rpc.PlayerSubmissionTypeProto value : values) {
        submissionTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubmissionTypes() {
      submissionTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @return A list containing the enum numeric values on the wire for submissionTypes.
     */
    public java.util.List<java.lang.Integer>
    getSubmissionTypesValueList() {
      return java.util.Collections.unmodifiableList(submissionTypes_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of submissionTypes at the given index.
     */
    public int getSubmissionTypesValue(int index) {
      return submissionTypes_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of submissionTypes at the given index.
     * @return This builder for chaining.
     */
    public Builder setSubmissionTypesValue(
        int index, int value) {
      ensureSubmissionTypesIsMutable();
      submissionTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param value The enum numeric value on the wire for submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addSubmissionTypesValue(int value) {
      ensureSubmissionTypesIsMutable();
      submissionTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.PlayerSubmissionTypeProto submission_types = 1;</code>
     * @param values The enum numeric values on the wire for submissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllSubmissionTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureSubmissionTypesIsMutable();
      for (int value : values) {
        submissionTypes_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetAvailableSubmissionsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetAvailableSubmissionsProto)
  private static final POGOProtos.Rpc.GetAvailableSubmissionsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetAvailableSubmissionsProto();
  }

  public static POGOProtos.Rpc.GetAvailableSubmissionsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAvailableSubmissionsProto>
      PARSER = new com.google.protobuf.AbstractParser<GetAvailableSubmissionsProto>() {
    @java.lang.Override
    public GetAvailableSubmissionsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAvailableSubmissionsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAvailableSubmissionsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAvailableSubmissionsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetAvailableSubmissionsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

