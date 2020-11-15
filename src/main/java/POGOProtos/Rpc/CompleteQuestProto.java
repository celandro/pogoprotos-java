// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CompleteQuestProto}
 */
public final class CompleteQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CompleteQuestProto)
    CompleteQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteQuestProto.newBuilder() to construct.
  private CompleteQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteQuestProto() {
    questId_ = "";
    subQuestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteQuestProto(
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

            questId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            subQuestId_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CompleteQuestProto.class, POGOProtos.Rpc.CompleteQuestProto.Builder.class);
  }

  public static final int QUEST_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object questId_;
  /**
   * <code>string quest_id = 1;</code>
   * @return The questId.
   */
  @java.lang.Override
  public java.lang.String getQuestId() {
    java.lang.Object ref = questId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      questId_ = s;
      return s;
    }
  }
  /**
   * <code>string quest_id = 1;</code>
   * @return The bytes for questId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuestIdBytes() {
    java.lang.Object ref = questId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      questId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUB_QUEST_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object subQuestId_;
  /**
   * <code>string sub_quest_id = 2;</code>
   * @return The subQuestId.
   */
  @java.lang.Override
  public java.lang.String getSubQuestId() {
    java.lang.Object ref = subQuestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subQuestId_ = s;
      return s;
    }
  }
  /**
   * <code>string sub_quest_id = 2;</code>
   * @return The bytes for subQuestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubQuestIdBytes() {
    java.lang.Object ref = subQuestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subQuestId_ = b;
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
    if (!getQuestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, questId_);
    }
    if (!getSubQuestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subQuestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQuestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, questId_);
    }
    if (!getSubQuestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subQuestId_);
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
    if (!(obj instanceof POGOProtos.Rpc.CompleteQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CompleteQuestProto other = (POGOProtos.Rpc.CompleteQuestProto) obj;

    if (!getQuestId()
        .equals(other.getQuestId())) return false;
    if (!getSubQuestId()
        .equals(other.getSubQuestId())) return false;
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
    hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQuestId().hashCode();
    hash = (37 * hash) + SUB_QUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSubQuestId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CompleteQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CompleteQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CompleteQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CompleteQuestProto)
      POGOProtos.Rpc.CompleteQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CompleteQuestProto.class, POGOProtos.Rpc.CompleteQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CompleteQuestProto.newBuilder()
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
      questId_ = "";

      subQuestId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CompleteQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CompleteQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CompleteQuestProto build() {
      POGOProtos.Rpc.CompleteQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CompleteQuestProto buildPartial() {
      POGOProtos.Rpc.CompleteQuestProto result = new POGOProtos.Rpc.CompleteQuestProto(this);
      result.questId_ = questId_;
      result.subQuestId_ = subQuestId_;
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
      if (other instanceof POGOProtos.Rpc.CompleteQuestProto) {
        return mergeFrom((POGOProtos.Rpc.CompleteQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CompleteQuestProto other) {
      if (other == POGOProtos.Rpc.CompleteQuestProto.getDefaultInstance()) return this;
      if (!other.getQuestId().isEmpty()) {
        questId_ = other.questId_;
        onChanged();
      }
      if (!other.getSubQuestId().isEmpty()) {
        subQuestId_ = other.subQuestId_;
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
      POGOProtos.Rpc.CompleteQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CompleteQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object questId_ = "";
    /**
     * <code>string quest_id = 1;</code>
     * @return The questId.
     */
    public java.lang.String getQuestId() {
      java.lang.Object ref = questId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        questId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string quest_id = 1;</code>
     * @return The bytes for questId.
     */
    public com.google.protobuf.ByteString
        getQuestIdBytes() {
      java.lang.Object ref = questId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        questId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string quest_id = 1;</code>
     * @param value The questId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      questId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string quest_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestId() {
      
      questId_ = getDefaultInstance().getQuestId();
      onChanged();
      return this;
    }
    /**
     * <code>string quest_id = 1;</code>
     * @param value The bytes for questId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      questId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subQuestId_ = "";
    /**
     * <code>string sub_quest_id = 2;</code>
     * @return The subQuestId.
     */
    public java.lang.String getSubQuestId() {
      java.lang.Object ref = subQuestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subQuestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sub_quest_id = 2;</code>
     * @return The bytes for subQuestId.
     */
    public com.google.protobuf.ByteString
        getSubQuestIdBytes() {
      java.lang.Object ref = subQuestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subQuestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sub_quest_id = 2;</code>
     * @param value The subQuestId to set.
     * @return This builder for chaining.
     */
    public Builder setSubQuestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subQuestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sub_quest_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubQuestId() {
      
      subQuestId_ = getDefaultInstance().getSubQuestId();
      onChanged();
      return this;
    }
    /**
     * <code>string sub_quest_id = 2;</code>
     * @param value The bytes for subQuestId to set.
     * @return This builder for chaining.
     */
    public Builder setSubQuestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subQuestId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CompleteQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CompleteQuestProto)
  private static final POGOProtos.Rpc.CompleteQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CompleteQuestProto();
  }

  public static POGOProtos.Rpc.CompleteQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<CompleteQuestProto>() {
    @java.lang.Override
    public CompleteQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CompleteQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

