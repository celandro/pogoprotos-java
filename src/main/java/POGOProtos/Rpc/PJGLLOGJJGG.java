// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PJGLLOGJJGG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PJGLLOGJJGG}
 */
public final class PJGLLOGJJGG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PJGLLOGJJGG)
    PJGLLOGJJGGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PJGLLOGJJGG.newBuilder() to construct.
  private PJGLLOGJJGG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PJGLLOGJJGG() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PJGLLOGJJGG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PJGLLOGJJGG(
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
            POGOProtos.Rpc.GNJGCPJMODK.Builder subBuilder = null;
            if (gdadpcnldha_ != null) {
              subBuilder = gdadpcnldha_.toBuilder();
            }
            gdadpcnldha_ = input.readMessage(POGOProtos.Rpc.GNJGCPJMODK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gdadpcnldha_);
              gdadpcnldha_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJGLLOGJJGG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJGLLOGJJGG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PJGLLOGJJGG.class, POGOProtos.Rpc.PJGLLOGJJGG.Builder.class);
  }

  public static final int GDADPCNLDHA_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha_;
  /**
   * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
   * @return Whether the gdadpcnldha field is set.
   */
  @java.lang.Override
  public boolean hasGdadpcnldha() {
    return gdadpcnldha_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
   * @return The gdadpcnldha.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GNJGCPJMODK getGdadpcnldha() {
    return gdadpcnldha_ == null ? POGOProtos.Rpc.GNJGCPJMODK.getDefaultInstance() : gdadpcnldha_;
  }
  /**
   * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GNJGCPJMODKOrBuilder getGdadpcnldhaOrBuilder() {
    return getGdadpcnldha();
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
    if (gdadpcnldha_ != null) {
      output.writeMessage(1, getGdadpcnldha());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gdadpcnldha_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGdadpcnldha());
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
    if (!(obj instanceof POGOProtos.Rpc.PJGLLOGJJGG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PJGLLOGJJGG other = (POGOProtos.Rpc.PJGLLOGJJGG) obj;

    if (hasGdadpcnldha() != other.hasGdadpcnldha()) return false;
    if (hasGdadpcnldha()) {
      if (!getGdadpcnldha()
          .equals(other.getGdadpcnldha())) return false;
    }
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
    if (hasGdadpcnldha()) {
      hash = (37 * hash) + GDADPCNLDHA_FIELD_NUMBER;
      hash = (53 * hash) + getGdadpcnldha().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PJGLLOGJJGG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PJGLLOGJJGG prototype) {
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
   * ref: PJGLLOGJJGG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PJGLLOGJJGG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PJGLLOGJJGG)
      POGOProtos.Rpc.PJGLLOGJJGGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJGLLOGJJGG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJGLLOGJJGG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PJGLLOGJJGG.class, POGOProtos.Rpc.PJGLLOGJJGG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PJGLLOGJJGG.newBuilder()
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
      if (gdadpcnldhaBuilder_ == null) {
        gdadpcnldha_ = null;
      } else {
        gdadpcnldha_ = null;
        gdadpcnldhaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PJGLLOGJJGG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PJGLLOGJJGG getDefaultInstanceForType() {
      return POGOProtos.Rpc.PJGLLOGJJGG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PJGLLOGJJGG build() {
      POGOProtos.Rpc.PJGLLOGJJGG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PJGLLOGJJGG buildPartial() {
      POGOProtos.Rpc.PJGLLOGJJGG result = new POGOProtos.Rpc.PJGLLOGJJGG(this);
      if (gdadpcnldhaBuilder_ == null) {
        result.gdadpcnldha_ = gdadpcnldha_;
      } else {
        result.gdadpcnldha_ = gdadpcnldhaBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.PJGLLOGJJGG) {
        return mergeFrom((POGOProtos.Rpc.PJGLLOGJJGG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PJGLLOGJJGG other) {
      if (other == POGOProtos.Rpc.PJGLLOGJJGG.getDefaultInstance()) return this;
      if (other.hasGdadpcnldha()) {
        mergeGdadpcnldha(other.getGdadpcnldha());
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
      POGOProtos.Rpc.PJGLLOGJJGG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PJGLLOGJJGG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GNJGCPJMODK, POGOProtos.Rpc.GNJGCPJMODK.Builder, POGOProtos.Rpc.GNJGCPJMODKOrBuilder> gdadpcnldhaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     * @return Whether the gdadpcnldha field is set.
     */
    public boolean hasGdadpcnldha() {
      return gdadpcnldhaBuilder_ != null || gdadpcnldha_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     * @return The gdadpcnldha.
     */
    public POGOProtos.Rpc.GNJGCPJMODK getGdadpcnldha() {
      if (gdadpcnldhaBuilder_ == null) {
        return gdadpcnldha_ == null ? POGOProtos.Rpc.GNJGCPJMODK.getDefaultInstance() : gdadpcnldha_;
      } else {
        return gdadpcnldhaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    public Builder setGdadpcnldha(POGOProtos.Rpc.GNJGCPJMODK value) {
      if (gdadpcnldhaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gdadpcnldha_ = value;
        onChanged();
      } else {
        gdadpcnldhaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    public Builder setGdadpcnldha(
        POGOProtos.Rpc.GNJGCPJMODK.Builder builderForValue) {
      if (gdadpcnldhaBuilder_ == null) {
        gdadpcnldha_ = builderForValue.build();
        onChanged();
      } else {
        gdadpcnldhaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    public Builder mergeGdadpcnldha(POGOProtos.Rpc.GNJGCPJMODK value) {
      if (gdadpcnldhaBuilder_ == null) {
        if (gdadpcnldha_ != null) {
          gdadpcnldha_ =
            POGOProtos.Rpc.GNJGCPJMODK.newBuilder(gdadpcnldha_).mergeFrom(value).buildPartial();
        } else {
          gdadpcnldha_ = value;
        }
        onChanged();
      } else {
        gdadpcnldhaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    public Builder clearGdadpcnldha() {
      if (gdadpcnldhaBuilder_ == null) {
        gdadpcnldha_ = null;
        onChanged();
      } else {
        gdadpcnldha_ = null;
        gdadpcnldhaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    public POGOProtos.Rpc.GNJGCPJMODK.Builder getGdadpcnldhaBuilder() {
      
      onChanged();
      return getGdadpcnldhaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    public POGOProtos.Rpc.GNJGCPJMODKOrBuilder getGdadpcnldhaOrBuilder() {
      if (gdadpcnldhaBuilder_ != null) {
        return gdadpcnldhaBuilder_.getMessageOrBuilder();
      } else {
        return gdadpcnldha_ == null ?
            POGOProtos.Rpc.GNJGCPJMODK.getDefaultInstance() : gdadpcnldha_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GNJGCPJMODK gdadpcnldha = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GNJGCPJMODK, POGOProtos.Rpc.GNJGCPJMODK.Builder, POGOProtos.Rpc.GNJGCPJMODKOrBuilder> 
        getGdadpcnldhaFieldBuilder() {
      if (gdadpcnldhaBuilder_ == null) {
        gdadpcnldhaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GNJGCPJMODK, POGOProtos.Rpc.GNJGCPJMODK.Builder, POGOProtos.Rpc.GNJGCPJMODKOrBuilder>(
                getGdadpcnldha(),
                getParentForChildren(),
                isClean());
        gdadpcnldha_ = null;
      }
      return gdadpcnldhaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PJGLLOGJJGG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PJGLLOGJJGG)
  private static final POGOProtos.Rpc.PJGLLOGJJGG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PJGLLOGJJGG();
  }

  public static POGOProtos.Rpc.PJGLLOGJJGG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PJGLLOGJJGG>
      PARSER = new com.google.protobuf.AbstractParser<PJGLLOGJJGG>() {
    @java.lang.Override
    public PJGLLOGJJGG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PJGLLOGJJGG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PJGLLOGJJGG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PJGLLOGJJGG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PJGLLOGJJGG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

