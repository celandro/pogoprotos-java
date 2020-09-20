// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CALGKPKEDBJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AvatarItemProto}
 */
public final class AvatarItemProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AvatarItemProto)
    AvatarItemProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AvatarItemProto.newBuilder() to construct.
  private AvatarItemProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AvatarItemProto() {
    avatarTemplateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AvatarItemProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AvatarItemProto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            avatarTemplateId_ = s;
            break;
          }
          case 16: {

            newTimestampMs_ = input.readInt64();
            break;
          }
          case 24: {

            viewed_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AvatarItemProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AvatarItemProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AvatarItemProto.class, POGOProtos.Rpc.AvatarItemProto.Builder.class);
  }

  public static final int AVATAR_TEMPLATE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object avatarTemplateId_;
  /**
   * <code>string avatar_template_id = 1;</code>
   * @return The avatarTemplateId.
   */
  @java.lang.Override
  public java.lang.String getAvatarTemplateId() {
    java.lang.Object ref = avatarTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      avatarTemplateId_ = s;
      return s;
    }
  }
  /**
   * <code>string avatar_template_id = 1;</code>
   * @return The bytes for avatarTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAvatarTemplateIdBytes() {
    java.lang.Object ref = avatarTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      avatarTemplateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_TIMESTAMP_MS_FIELD_NUMBER = 2;
  private long newTimestampMs_;
  /**
   * <code>int64 new_timestamp_ms = 2;</code>
   * @return The newTimestampMs.
   */
  @java.lang.Override
  public long getNewTimestampMs() {
    return newTimestampMs_;
  }

  public static final int VIEWED_FIELD_NUMBER = 3;
  private boolean viewed_;
  /**
   * <code>bool viewed = 3;</code>
   * @return The viewed.
   */
  @java.lang.Override
  public boolean getViewed() {
    return viewed_;
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
    if (!getAvatarTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, avatarTemplateId_);
    }
    if (newTimestampMs_ != 0L) {
      output.writeInt64(2, newTimestampMs_);
    }
    if (viewed_ != false) {
      output.writeBool(3, viewed_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAvatarTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, avatarTemplateId_);
    }
    if (newTimestampMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, newTimestampMs_);
    }
    if (viewed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, viewed_);
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
    if (!(obj instanceof POGOProtos.Rpc.AvatarItemProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AvatarItemProto other = (POGOProtos.Rpc.AvatarItemProto) obj;

    if (!getAvatarTemplateId()
        .equals(other.getAvatarTemplateId())) return false;
    if (getNewTimestampMs()
        != other.getNewTimestampMs()) return false;
    if (getViewed()
        != other.getViewed()) return false;
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
    hash = (37 * hash) + AVATAR_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAvatarTemplateId().hashCode();
    hash = (37 * hash) + NEW_TIMESTAMP_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNewTimestampMs());
    hash = (37 * hash) + VIEWED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getViewed());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AvatarItemProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AvatarItemProto prototype) {
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
   * ref: CALGKPKEDBJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AvatarItemProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AvatarItemProto)
      POGOProtos.Rpc.AvatarItemProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AvatarItemProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AvatarItemProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AvatarItemProto.class, POGOProtos.Rpc.AvatarItemProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AvatarItemProto.newBuilder()
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
      avatarTemplateId_ = "";

      newTimestampMs_ = 0L;

      viewed_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AvatarItemProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AvatarItemProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AvatarItemProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AvatarItemProto build() {
      POGOProtos.Rpc.AvatarItemProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AvatarItemProto buildPartial() {
      POGOProtos.Rpc.AvatarItemProto result = new POGOProtos.Rpc.AvatarItemProto(this);
      result.avatarTemplateId_ = avatarTemplateId_;
      result.newTimestampMs_ = newTimestampMs_;
      result.viewed_ = viewed_;
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
      if (other instanceof POGOProtos.Rpc.AvatarItemProto) {
        return mergeFrom((POGOProtos.Rpc.AvatarItemProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AvatarItemProto other) {
      if (other == POGOProtos.Rpc.AvatarItemProto.getDefaultInstance()) return this;
      if (!other.getAvatarTemplateId().isEmpty()) {
        avatarTemplateId_ = other.avatarTemplateId_;
        onChanged();
      }
      if (other.getNewTimestampMs() != 0L) {
        setNewTimestampMs(other.getNewTimestampMs());
      }
      if (other.getViewed() != false) {
        setViewed(other.getViewed());
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
      POGOProtos.Rpc.AvatarItemProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AvatarItemProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object avatarTemplateId_ = "";
    /**
     * <code>string avatar_template_id = 1;</code>
     * @return The avatarTemplateId.
     */
    public java.lang.String getAvatarTemplateId() {
      java.lang.Object ref = avatarTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatarTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string avatar_template_id = 1;</code>
     * @return The bytes for avatarTemplateId.
     */
    public com.google.protobuf.ByteString
        getAvatarTemplateIdBytes() {
      java.lang.Object ref = avatarTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatarTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string avatar_template_id = 1;</code>
     * @param value The avatarTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      avatarTemplateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string avatar_template_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvatarTemplateId() {
      
      avatarTemplateId_ = getDefaultInstance().getAvatarTemplateId();
      onChanged();
      return this;
    }
    /**
     * <code>string avatar_template_id = 1;</code>
     * @param value The bytes for avatarTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      avatarTemplateId_ = value;
      onChanged();
      return this;
    }

    private long newTimestampMs_ ;
    /**
     * <code>int64 new_timestamp_ms = 2;</code>
     * @return The newTimestampMs.
     */
    @java.lang.Override
    public long getNewTimestampMs() {
      return newTimestampMs_;
    }
    /**
     * <code>int64 new_timestamp_ms = 2;</code>
     * @param value The newTimestampMs to set.
     * @return This builder for chaining.
     */
    public Builder setNewTimestampMs(long value) {
      
      newTimestampMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 new_timestamp_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewTimestampMs() {
      
      newTimestampMs_ = 0L;
      onChanged();
      return this;
    }

    private boolean viewed_ ;
    /**
     * <code>bool viewed = 3;</code>
     * @return The viewed.
     */
    @java.lang.Override
    public boolean getViewed() {
      return viewed_;
    }
    /**
     * <code>bool viewed = 3;</code>
     * @param value The viewed to set.
     * @return This builder for chaining.
     */
    public Builder setViewed(boolean value) {
      
      viewed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool viewed = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewed() {
      
      viewed_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AvatarItemProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AvatarItemProto)
  private static final POGOProtos.Rpc.AvatarItemProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AvatarItemProto();
  }

  public static POGOProtos.Rpc.AvatarItemProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvatarItemProto>
      PARSER = new com.google.protobuf.AbstractParser<AvatarItemProto>() {
    @java.lang.Override
    public AvatarItemProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AvatarItemProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AvatarItemProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvatarItemProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AvatarItemProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

