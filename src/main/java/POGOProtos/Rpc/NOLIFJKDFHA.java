// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.NOLIFJKDFHA}
 */
public  final class NOLIFJKDFHA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NOLIFJKDFHA)
    NOLIFJKDFHAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NOLIFJKDFHA.newBuilder() to construct.
  private NOLIFJKDFHA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NOLIFJKDFHA() {
    piiagcekejb_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NOLIFJKDFHA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NOLIFJKDFHA(
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
            POGOProtos.Rpc.IENCJFPJJLF.Builder subBuilder = null;
            if (gfkclfnnoki_ != null) {
              subBuilder = gfkclfnnoki_.toBuilder();
            }
            gfkclfnnoki_ = input.readMessage(POGOProtos.Rpc.IENCJFPJJLF.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gfkclfnnoki_);
              gfkclfnnoki_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            piiagcekejb_ = input.readBytes();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NOLIFJKDFHA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NOLIFJKDFHA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NOLIFJKDFHA.class, POGOProtos.Rpc.NOLIFJKDFHA.Builder.class);
  }

  public static final int GFKCLFNNOKI_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki_;
  /**
   * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
   * @return Whether the gfkclfnnoki field is set.
   */
  public boolean hasGfkclfnnoki() {
    return gfkclfnnoki_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
   * @return The gfkclfnnoki.
   */
  public POGOProtos.Rpc.IENCJFPJJLF getGfkclfnnoki() {
    return gfkclfnnoki_ == null ? POGOProtos.Rpc.IENCJFPJJLF.getDefaultInstance() : gfkclfnnoki_;
  }
  /**
   * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
   */
  public POGOProtos.Rpc.IENCJFPJJLFOrBuilder getGfkclfnnokiOrBuilder() {
    return getGfkclfnnoki();
  }

  public static final int PIIAGCEKEJB_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString piiagcekejb_;
  /**
   * <code>bytes piiagcekejb = 2;</code>
   * @return The piiagcekejb.
   */
  public com.google.protobuf.ByteString getPiiagcekejb() {
    return piiagcekejb_;
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
    if (gfkclfnnoki_ != null) {
      output.writeMessage(1, getGfkclfnnoki());
    }
    if (!piiagcekejb_.isEmpty()) {
      output.writeBytes(2, piiagcekejb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gfkclfnnoki_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGfkclfnnoki());
    }
    if (!piiagcekejb_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, piiagcekejb_);
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
    if (!(obj instanceof POGOProtos.Rpc.NOLIFJKDFHA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NOLIFJKDFHA other = (POGOProtos.Rpc.NOLIFJKDFHA) obj;

    if (hasGfkclfnnoki() != other.hasGfkclfnnoki()) return false;
    if (hasGfkclfnnoki()) {
      if (!getGfkclfnnoki()
          .equals(other.getGfkclfnnoki())) return false;
    }
    if (!getPiiagcekejb()
        .equals(other.getPiiagcekejb())) return false;
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
    if (hasGfkclfnnoki()) {
      hash = (37 * hash) + GFKCLFNNOKI_FIELD_NUMBER;
      hash = (53 * hash) + getGfkclfnnoki().hashCode();
    }
    hash = (37 * hash) + PIIAGCEKEJB_FIELD_NUMBER;
    hash = (53 * hash) + getPiiagcekejb().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOLIFJKDFHA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NOLIFJKDFHA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.NOLIFJKDFHA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NOLIFJKDFHA)
      POGOProtos.Rpc.NOLIFJKDFHAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NOLIFJKDFHA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NOLIFJKDFHA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NOLIFJKDFHA.class, POGOProtos.Rpc.NOLIFJKDFHA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NOLIFJKDFHA.newBuilder()
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
      if (gfkclfnnokiBuilder_ == null) {
        gfkclfnnoki_ = null;
      } else {
        gfkclfnnoki_ = null;
        gfkclfnnokiBuilder_ = null;
      }
      piiagcekejb_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_NOLIFJKDFHA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOLIFJKDFHA getDefaultInstanceForType() {
      return POGOProtos.Rpc.NOLIFJKDFHA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOLIFJKDFHA build() {
      POGOProtos.Rpc.NOLIFJKDFHA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOLIFJKDFHA buildPartial() {
      POGOProtos.Rpc.NOLIFJKDFHA result = new POGOProtos.Rpc.NOLIFJKDFHA(this);
      if (gfkclfnnokiBuilder_ == null) {
        result.gfkclfnnoki_ = gfkclfnnoki_;
      } else {
        result.gfkclfnnoki_ = gfkclfnnokiBuilder_.build();
      }
      result.piiagcekejb_ = piiagcekejb_;
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
      if (other instanceof POGOProtos.Rpc.NOLIFJKDFHA) {
        return mergeFrom((POGOProtos.Rpc.NOLIFJKDFHA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NOLIFJKDFHA other) {
      if (other == POGOProtos.Rpc.NOLIFJKDFHA.getDefaultInstance()) return this;
      if (other.hasGfkclfnnoki()) {
        mergeGfkclfnnoki(other.getGfkclfnnoki());
      }
      if (other.getPiiagcekejb() != com.google.protobuf.ByteString.EMPTY) {
        setPiiagcekejb(other.getPiiagcekejb());
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
      POGOProtos.Rpc.NOLIFJKDFHA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NOLIFJKDFHA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IENCJFPJJLF, POGOProtos.Rpc.IENCJFPJJLF.Builder, POGOProtos.Rpc.IENCJFPJJLFOrBuilder> gfkclfnnokiBuilder_;
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     * @return Whether the gfkclfnnoki field is set.
     */
    public boolean hasGfkclfnnoki() {
      return gfkclfnnokiBuilder_ != null || gfkclfnnoki_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     * @return The gfkclfnnoki.
     */
    public POGOProtos.Rpc.IENCJFPJJLF getGfkclfnnoki() {
      if (gfkclfnnokiBuilder_ == null) {
        return gfkclfnnoki_ == null ? POGOProtos.Rpc.IENCJFPJJLF.getDefaultInstance() : gfkclfnnoki_;
      } else {
        return gfkclfnnokiBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    public Builder setGfkclfnnoki(POGOProtos.Rpc.IENCJFPJJLF value) {
      if (gfkclfnnokiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gfkclfnnoki_ = value;
        onChanged();
      } else {
        gfkclfnnokiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    public Builder setGfkclfnnoki(
        POGOProtos.Rpc.IENCJFPJJLF.Builder builderForValue) {
      if (gfkclfnnokiBuilder_ == null) {
        gfkclfnnoki_ = builderForValue.build();
        onChanged();
      } else {
        gfkclfnnokiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    public Builder mergeGfkclfnnoki(POGOProtos.Rpc.IENCJFPJJLF value) {
      if (gfkclfnnokiBuilder_ == null) {
        if (gfkclfnnoki_ != null) {
          gfkclfnnoki_ =
            POGOProtos.Rpc.IENCJFPJJLF.newBuilder(gfkclfnnoki_).mergeFrom(value).buildPartial();
        } else {
          gfkclfnnoki_ = value;
        }
        onChanged();
      } else {
        gfkclfnnokiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    public Builder clearGfkclfnnoki() {
      if (gfkclfnnokiBuilder_ == null) {
        gfkclfnnoki_ = null;
        onChanged();
      } else {
        gfkclfnnoki_ = null;
        gfkclfnnokiBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    public POGOProtos.Rpc.IENCJFPJJLF.Builder getGfkclfnnokiBuilder() {
      
      onChanged();
      return getGfkclfnnokiFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    public POGOProtos.Rpc.IENCJFPJJLFOrBuilder getGfkclfnnokiOrBuilder() {
      if (gfkclfnnokiBuilder_ != null) {
        return gfkclfnnokiBuilder_.getMessageOrBuilder();
      } else {
        return gfkclfnnoki_ == null ?
            POGOProtos.Rpc.IENCJFPJJLF.getDefaultInstance() : gfkclfnnoki_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IENCJFPJJLF gfkclfnnoki = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IENCJFPJJLF, POGOProtos.Rpc.IENCJFPJJLF.Builder, POGOProtos.Rpc.IENCJFPJJLFOrBuilder> 
        getGfkclfnnokiFieldBuilder() {
      if (gfkclfnnokiBuilder_ == null) {
        gfkclfnnokiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.IENCJFPJJLF, POGOProtos.Rpc.IENCJFPJJLF.Builder, POGOProtos.Rpc.IENCJFPJJLFOrBuilder>(
                getGfkclfnnoki(),
                getParentForChildren(),
                isClean());
        gfkclfnnoki_ = null;
      }
      return gfkclfnnokiBuilder_;
    }

    private com.google.protobuf.ByteString piiagcekejb_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes piiagcekejb = 2;</code>
     * @return The piiagcekejb.
     */
    public com.google.protobuf.ByteString getPiiagcekejb() {
      return piiagcekejb_;
    }
    /**
     * <code>bytes piiagcekejb = 2;</code>
     * @param value The piiagcekejb to set.
     * @return This builder for chaining.
     */
    public Builder setPiiagcekejb(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      piiagcekejb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes piiagcekejb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPiiagcekejb() {
      
      piiagcekejb_ = getDefaultInstance().getPiiagcekejb();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NOLIFJKDFHA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NOLIFJKDFHA)
  private static final POGOProtos.Rpc.NOLIFJKDFHA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NOLIFJKDFHA();
  }

  public static POGOProtos.Rpc.NOLIFJKDFHA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NOLIFJKDFHA>
      PARSER = new com.google.protobuf.AbstractParser<NOLIFJKDFHA>() {
    @java.lang.Override
    public NOLIFJKDFHA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NOLIFJKDFHA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NOLIFJKDFHA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NOLIFJKDFHA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NOLIFJKDFHA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

