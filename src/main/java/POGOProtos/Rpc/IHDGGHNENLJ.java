// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IHDGGHNENLJ}
 */
public  final class IHDGGHNENLJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IHDGGHNENLJ)
    IHDGGHNENLJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IHDGGHNENLJ.newBuilder() to construct.
  private IHDGGHNENLJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IHDGGHNENLJ() {
    dlmoledbgfo_ = "";
    ehghcefmcgl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IHDGGHNENLJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IHDGGHNENLJ(
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

            dlmoledbgfo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ehghcefmcgl_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IHDGGHNENLJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IHDGGHNENLJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IHDGGHNENLJ.class, POGOProtos.Rpc.IHDGGHNENLJ.Builder.class);
  }

  public static final int DLMOLEDBGFO_FIELD_NUMBER = 1;
  private volatile java.lang.Object dlmoledbgfo_;
  /**
   * <code>string dlmoledbgfo = 1;</code>
   * @return The dlmoledbgfo.
   */
  public java.lang.String getDlmoledbgfo() {
    java.lang.Object ref = dlmoledbgfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dlmoledbgfo_ = s;
      return s;
    }
  }
  /**
   * <code>string dlmoledbgfo = 1;</code>
   * @return The bytes for dlmoledbgfo.
   */
  public com.google.protobuf.ByteString
      getDlmoledbgfoBytes() {
    java.lang.Object ref = dlmoledbgfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dlmoledbgfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EHGHCEFMCGL_FIELD_NUMBER = 2;
  private volatile java.lang.Object ehghcefmcgl_;
  /**
   * <code>string ehghcefmcgl = 2;</code>
   * @return The ehghcefmcgl.
   */
  public java.lang.String getEhghcefmcgl() {
    java.lang.Object ref = ehghcefmcgl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ehghcefmcgl_ = s;
      return s;
    }
  }
  /**
   * <code>string ehghcefmcgl = 2;</code>
   * @return The bytes for ehghcefmcgl.
   */
  public com.google.protobuf.ByteString
      getEhghcefmcglBytes() {
    java.lang.Object ref = ehghcefmcgl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ehghcefmcgl_ = b;
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
    if (!getDlmoledbgfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dlmoledbgfo_);
    }
    if (!getEhghcefmcglBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ehghcefmcgl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDlmoledbgfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dlmoledbgfo_);
    }
    if (!getEhghcefmcglBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ehghcefmcgl_);
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
    if (!(obj instanceof POGOProtos.Rpc.IHDGGHNENLJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IHDGGHNENLJ other = (POGOProtos.Rpc.IHDGGHNENLJ) obj;

    if (!getDlmoledbgfo()
        .equals(other.getDlmoledbgfo())) return false;
    if (!getEhghcefmcgl()
        .equals(other.getEhghcefmcgl())) return false;
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
    hash = (37 * hash) + DLMOLEDBGFO_FIELD_NUMBER;
    hash = (53 * hash) + getDlmoledbgfo().hashCode();
    hash = (37 * hash) + EHGHCEFMCGL_FIELD_NUMBER;
    hash = (53 * hash) + getEhghcefmcgl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IHDGGHNENLJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IHDGGHNENLJ prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IHDGGHNENLJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IHDGGHNENLJ)
      POGOProtos.Rpc.IHDGGHNENLJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IHDGGHNENLJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IHDGGHNENLJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IHDGGHNENLJ.class, POGOProtos.Rpc.IHDGGHNENLJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IHDGGHNENLJ.newBuilder()
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
      dlmoledbgfo_ = "";

      ehghcefmcgl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IHDGGHNENLJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IHDGGHNENLJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.IHDGGHNENLJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IHDGGHNENLJ build() {
      POGOProtos.Rpc.IHDGGHNENLJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IHDGGHNENLJ buildPartial() {
      POGOProtos.Rpc.IHDGGHNENLJ result = new POGOProtos.Rpc.IHDGGHNENLJ(this);
      result.dlmoledbgfo_ = dlmoledbgfo_;
      result.ehghcefmcgl_ = ehghcefmcgl_;
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
      if (other instanceof POGOProtos.Rpc.IHDGGHNENLJ) {
        return mergeFrom((POGOProtos.Rpc.IHDGGHNENLJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IHDGGHNENLJ other) {
      if (other == POGOProtos.Rpc.IHDGGHNENLJ.getDefaultInstance()) return this;
      if (!other.getDlmoledbgfo().isEmpty()) {
        dlmoledbgfo_ = other.dlmoledbgfo_;
        onChanged();
      }
      if (!other.getEhghcefmcgl().isEmpty()) {
        ehghcefmcgl_ = other.ehghcefmcgl_;
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
      POGOProtos.Rpc.IHDGGHNENLJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IHDGGHNENLJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dlmoledbgfo_ = "";
    /**
     * <code>string dlmoledbgfo = 1;</code>
     * @return The dlmoledbgfo.
     */
    public java.lang.String getDlmoledbgfo() {
      java.lang.Object ref = dlmoledbgfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dlmoledbgfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dlmoledbgfo = 1;</code>
     * @return The bytes for dlmoledbgfo.
     */
    public com.google.protobuf.ByteString
        getDlmoledbgfoBytes() {
      java.lang.Object ref = dlmoledbgfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dlmoledbgfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dlmoledbgfo = 1;</code>
     * @param value The dlmoledbgfo to set.
     * @return This builder for chaining.
     */
    public Builder setDlmoledbgfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dlmoledbgfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dlmoledbgfo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDlmoledbgfo() {
      
      dlmoledbgfo_ = getDefaultInstance().getDlmoledbgfo();
      onChanged();
      return this;
    }
    /**
     * <code>string dlmoledbgfo = 1;</code>
     * @param value The bytes for dlmoledbgfo to set.
     * @return This builder for chaining.
     */
    public Builder setDlmoledbgfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dlmoledbgfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ehghcefmcgl_ = "";
    /**
     * <code>string ehghcefmcgl = 2;</code>
     * @return The ehghcefmcgl.
     */
    public java.lang.String getEhghcefmcgl() {
      java.lang.Object ref = ehghcefmcgl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ehghcefmcgl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ehghcefmcgl = 2;</code>
     * @return The bytes for ehghcefmcgl.
     */
    public com.google.protobuf.ByteString
        getEhghcefmcglBytes() {
      java.lang.Object ref = ehghcefmcgl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ehghcefmcgl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ehghcefmcgl = 2;</code>
     * @param value The ehghcefmcgl to set.
     * @return This builder for chaining.
     */
    public Builder setEhghcefmcgl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ehghcefmcgl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ehghcefmcgl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEhghcefmcgl() {
      
      ehghcefmcgl_ = getDefaultInstance().getEhghcefmcgl();
      onChanged();
      return this;
    }
    /**
     * <code>string ehghcefmcgl = 2;</code>
     * @param value The bytes for ehghcefmcgl to set.
     * @return This builder for chaining.
     */
    public Builder setEhghcefmcglBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ehghcefmcgl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IHDGGHNENLJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IHDGGHNENLJ)
  private static final POGOProtos.Rpc.IHDGGHNENLJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IHDGGHNENLJ();
  }

  public static POGOProtos.Rpc.IHDGGHNENLJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IHDGGHNENLJ>
      PARSER = new com.google.protobuf.AbstractParser<IHDGGHNENLJ>() {
    @java.lang.Override
    public IHDGGHNENLJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IHDGGHNENLJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IHDGGHNENLJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IHDGGHNENLJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IHDGGHNENLJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

