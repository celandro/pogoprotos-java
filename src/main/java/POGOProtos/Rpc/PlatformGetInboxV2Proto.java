// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatformGetInboxV2Proto}
 */
public  final class PlatformGetInboxV2Proto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatformGetInboxV2Proto)
    PlatformGetInboxV2ProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatformGetInboxV2Proto.newBuilder() to construct.
  private PlatformGetInboxV2Proto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatformGetInboxV2Proto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatformGetInboxV2Proto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatformGetInboxV2Proto(
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

            isHistory_ = input.readBool();
            break;
          }
          case 16: {

            isReverse_ = input.readBool();
            break;
          }
          case 24: {

            notBeforeMs_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetInboxV2Proto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetInboxV2Proto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatformGetInboxV2Proto.class, POGOProtos.Rpc.PlatformGetInboxV2Proto.Builder.class);
  }

  public static final int IS_HISTORY_FIELD_NUMBER = 1;
  private boolean isHistory_;
  /**
   * <code>bool is_history = 1;</code>
   * @return The isHistory.
   */
  public boolean getIsHistory() {
    return isHistory_;
  }

  public static final int IS_REVERSE_FIELD_NUMBER = 2;
  private boolean isReverse_;
  /**
   * <code>bool is_reverse = 2;</code>
   * @return The isReverse.
   */
  public boolean getIsReverse() {
    return isReverse_;
  }

  public static final int NOT_BEFORE_MS_FIELD_NUMBER = 3;
  private long notBeforeMs_;
  /**
   * <code>int64 not_before_ms = 3;</code>
   * @return The notBeforeMs.
   */
  public long getNotBeforeMs() {
    return notBeforeMs_;
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
    if (isHistory_ != false) {
      output.writeBool(1, isHistory_);
    }
    if (isReverse_ != false) {
      output.writeBool(2, isReverse_);
    }
    if (notBeforeMs_ != 0L) {
      output.writeInt64(3, notBeforeMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isHistory_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isHistory_);
    }
    if (isReverse_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isReverse_);
    }
    if (notBeforeMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, notBeforeMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.PlatformGetInboxV2Proto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatformGetInboxV2Proto other = (POGOProtos.Rpc.PlatformGetInboxV2Proto) obj;

    if (getIsHistory()
        != other.getIsHistory()) return false;
    if (getIsReverse()
        != other.getIsReverse()) return false;
    if (getNotBeforeMs()
        != other.getNotBeforeMs()) return false;
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
    hash = (37 * hash) + IS_HISTORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsHistory());
    hash = (37 * hash) + IS_REVERSE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReverse());
    hash = (37 * hash) + NOT_BEFORE_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNotBeforeMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatformGetInboxV2Proto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatformGetInboxV2Proto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatformGetInboxV2Proto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatformGetInboxV2Proto)
      POGOProtos.Rpc.PlatformGetInboxV2ProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetInboxV2Proto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetInboxV2Proto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatformGetInboxV2Proto.class, POGOProtos.Rpc.PlatformGetInboxV2Proto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatformGetInboxV2Proto.newBuilder()
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
      isHistory_ = false;

      isReverse_ = false;

      notBeforeMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatformGetInboxV2Proto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetInboxV2Proto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatformGetInboxV2Proto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetInboxV2Proto build() {
      POGOProtos.Rpc.PlatformGetInboxV2Proto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatformGetInboxV2Proto buildPartial() {
      POGOProtos.Rpc.PlatformGetInboxV2Proto result = new POGOProtos.Rpc.PlatformGetInboxV2Proto(this);
      result.isHistory_ = isHistory_;
      result.isReverse_ = isReverse_;
      result.notBeforeMs_ = notBeforeMs_;
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
      if (other instanceof POGOProtos.Rpc.PlatformGetInboxV2Proto) {
        return mergeFrom((POGOProtos.Rpc.PlatformGetInboxV2Proto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatformGetInboxV2Proto other) {
      if (other == POGOProtos.Rpc.PlatformGetInboxV2Proto.getDefaultInstance()) return this;
      if (other.getIsHistory() != false) {
        setIsHistory(other.getIsHistory());
      }
      if (other.getIsReverse() != false) {
        setIsReverse(other.getIsReverse());
      }
      if (other.getNotBeforeMs() != 0L) {
        setNotBeforeMs(other.getNotBeforeMs());
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
      POGOProtos.Rpc.PlatformGetInboxV2Proto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatformGetInboxV2Proto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isHistory_ ;
    /**
     * <code>bool is_history = 1;</code>
     * @return The isHistory.
     */
    public boolean getIsHistory() {
      return isHistory_;
    }
    /**
     * <code>bool is_history = 1;</code>
     * @param value The isHistory to set.
     * @return This builder for chaining.
     */
    public Builder setIsHistory(boolean value) {
      
      isHistory_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_history = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsHistory() {
      
      isHistory_ = false;
      onChanged();
      return this;
    }

    private boolean isReverse_ ;
    /**
     * <code>bool is_reverse = 2;</code>
     * @return The isReverse.
     */
    public boolean getIsReverse() {
      return isReverse_;
    }
    /**
     * <code>bool is_reverse = 2;</code>
     * @param value The isReverse to set.
     * @return This builder for chaining.
     */
    public Builder setIsReverse(boolean value) {
      
      isReverse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_reverse = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsReverse() {
      
      isReverse_ = false;
      onChanged();
      return this;
    }

    private long notBeforeMs_ ;
    /**
     * <code>int64 not_before_ms = 3;</code>
     * @return The notBeforeMs.
     */
    public long getNotBeforeMs() {
      return notBeforeMs_;
    }
    /**
     * <code>int64 not_before_ms = 3;</code>
     * @param value The notBeforeMs to set.
     * @return This builder for chaining.
     */
    public Builder setNotBeforeMs(long value) {
      
      notBeforeMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 not_before_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotBeforeMs() {
      
      notBeforeMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatformGetInboxV2Proto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatformGetInboxV2Proto)
  private static final POGOProtos.Rpc.PlatformGetInboxV2Proto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatformGetInboxV2Proto();
  }

  public static POGOProtos.Rpc.PlatformGetInboxV2Proto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatformGetInboxV2Proto>
      PARSER = new com.google.protobuf.AbstractParser<PlatformGetInboxV2Proto>() {
    @java.lang.Override
    public PlatformGetInboxV2Proto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatformGetInboxV2Proto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatformGetInboxV2Proto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatformGetInboxV2Proto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatformGetInboxV2Proto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

