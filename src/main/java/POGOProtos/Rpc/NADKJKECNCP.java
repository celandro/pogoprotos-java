// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NADKJKECNCP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NADKJKECNCP}
 */
public final class NADKJKECNCP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NADKJKECNCP)
    NADKJKECNCPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NADKJKECNCP.newBuilder() to construct.
  private NADKJKECNCP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NADKJKECNCP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NADKJKECNCP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NADKJKECNCP(
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
            POGOProtos.Rpc.CHLLKNMFHLC.Builder subBuilder = null;
            if (oabjdogklgo_ != null) {
              subBuilder = oabjdogklgo_.toBuilder();
            }
            oabjdogklgo_ = input.readMessage(POGOProtos.Rpc.CHLLKNMFHLC.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(oabjdogklgo_);
              oabjdogklgo_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NADKJKECNCP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NADKJKECNCP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NADKJKECNCP.class, POGOProtos.Rpc.NADKJKECNCP.Builder.class);
  }

  public static final int OABJDOGKLGO_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo_;
  /**
   * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
   * @return Whether the oabjdogklgo field is set.
   */
  @java.lang.Override
  public boolean hasOabjdogklgo() {
    return oabjdogklgo_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
   * @return The oabjdogklgo.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CHLLKNMFHLC getOabjdogklgo() {
    return oabjdogklgo_ == null ? POGOProtos.Rpc.CHLLKNMFHLC.getDefaultInstance() : oabjdogklgo_;
  }
  /**
   * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CHLLKNMFHLCOrBuilder getOabjdogklgoOrBuilder() {
    return getOabjdogklgo();
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
    if (oabjdogklgo_ != null) {
      output.writeMessage(1, getOabjdogklgo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oabjdogklgo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOabjdogklgo());
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
    if (!(obj instanceof POGOProtos.Rpc.NADKJKECNCP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NADKJKECNCP other = (POGOProtos.Rpc.NADKJKECNCP) obj;

    if (hasOabjdogklgo() != other.hasOabjdogklgo()) return false;
    if (hasOabjdogklgo()) {
      if (!getOabjdogklgo()
          .equals(other.getOabjdogklgo())) return false;
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
    if (hasOabjdogklgo()) {
      hash = (37 * hash) + OABJDOGKLGO_FIELD_NUMBER;
      hash = (53 * hash) + getOabjdogklgo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NADKJKECNCP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NADKJKECNCP prototype) {
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
   * ref: NADKJKECNCP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NADKJKECNCP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NADKJKECNCP)
      POGOProtos.Rpc.NADKJKECNCPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NADKJKECNCP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NADKJKECNCP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NADKJKECNCP.class, POGOProtos.Rpc.NADKJKECNCP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NADKJKECNCP.newBuilder()
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
      if (oabjdogklgoBuilder_ == null) {
        oabjdogklgo_ = null;
      } else {
        oabjdogklgo_ = null;
        oabjdogklgoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NADKJKECNCP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NADKJKECNCP getDefaultInstanceForType() {
      return POGOProtos.Rpc.NADKJKECNCP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NADKJKECNCP build() {
      POGOProtos.Rpc.NADKJKECNCP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NADKJKECNCP buildPartial() {
      POGOProtos.Rpc.NADKJKECNCP result = new POGOProtos.Rpc.NADKJKECNCP(this);
      if (oabjdogklgoBuilder_ == null) {
        result.oabjdogklgo_ = oabjdogklgo_;
      } else {
        result.oabjdogklgo_ = oabjdogklgoBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NADKJKECNCP) {
        return mergeFrom((POGOProtos.Rpc.NADKJKECNCP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NADKJKECNCP other) {
      if (other == POGOProtos.Rpc.NADKJKECNCP.getDefaultInstance()) return this;
      if (other.hasOabjdogklgo()) {
        mergeOabjdogklgo(other.getOabjdogklgo());
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
      POGOProtos.Rpc.NADKJKECNCP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NADKJKECNCP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CHLLKNMFHLC, POGOProtos.Rpc.CHLLKNMFHLC.Builder, POGOProtos.Rpc.CHLLKNMFHLCOrBuilder> oabjdogklgoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     * @return Whether the oabjdogklgo field is set.
     */
    public boolean hasOabjdogklgo() {
      return oabjdogklgoBuilder_ != null || oabjdogklgo_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     * @return The oabjdogklgo.
     */
    public POGOProtos.Rpc.CHLLKNMFHLC getOabjdogklgo() {
      if (oabjdogklgoBuilder_ == null) {
        return oabjdogklgo_ == null ? POGOProtos.Rpc.CHLLKNMFHLC.getDefaultInstance() : oabjdogklgo_;
      } else {
        return oabjdogklgoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    public Builder setOabjdogklgo(POGOProtos.Rpc.CHLLKNMFHLC value) {
      if (oabjdogklgoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oabjdogklgo_ = value;
        onChanged();
      } else {
        oabjdogklgoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    public Builder setOabjdogklgo(
        POGOProtos.Rpc.CHLLKNMFHLC.Builder builderForValue) {
      if (oabjdogklgoBuilder_ == null) {
        oabjdogklgo_ = builderForValue.build();
        onChanged();
      } else {
        oabjdogklgoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    public Builder mergeOabjdogklgo(POGOProtos.Rpc.CHLLKNMFHLC value) {
      if (oabjdogklgoBuilder_ == null) {
        if (oabjdogklgo_ != null) {
          oabjdogklgo_ =
            POGOProtos.Rpc.CHLLKNMFHLC.newBuilder(oabjdogklgo_).mergeFrom(value).buildPartial();
        } else {
          oabjdogklgo_ = value;
        }
        onChanged();
      } else {
        oabjdogklgoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    public Builder clearOabjdogklgo() {
      if (oabjdogklgoBuilder_ == null) {
        oabjdogklgo_ = null;
        onChanged();
      } else {
        oabjdogklgo_ = null;
        oabjdogklgoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    public POGOProtos.Rpc.CHLLKNMFHLC.Builder getOabjdogklgoBuilder() {
      
      onChanged();
      return getOabjdogklgoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    public POGOProtos.Rpc.CHLLKNMFHLCOrBuilder getOabjdogklgoOrBuilder() {
      if (oabjdogklgoBuilder_ != null) {
        return oabjdogklgoBuilder_.getMessageOrBuilder();
      } else {
        return oabjdogklgo_ == null ?
            POGOProtos.Rpc.CHLLKNMFHLC.getDefaultInstance() : oabjdogklgo_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CHLLKNMFHLC oabjdogklgo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CHLLKNMFHLC, POGOProtos.Rpc.CHLLKNMFHLC.Builder, POGOProtos.Rpc.CHLLKNMFHLCOrBuilder> 
        getOabjdogklgoFieldBuilder() {
      if (oabjdogklgoBuilder_ == null) {
        oabjdogklgoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CHLLKNMFHLC, POGOProtos.Rpc.CHLLKNMFHLC.Builder, POGOProtos.Rpc.CHLLKNMFHLCOrBuilder>(
                getOabjdogklgo(),
                getParentForChildren(),
                isClean());
        oabjdogklgo_ = null;
      }
      return oabjdogklgoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NADKJKECNCP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NADKJKECNCP)
  private static final POGOProtos.Rpc.NADKJKECNCP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NADKJKECNCP();
  }

  public static POGOProtos.Rpc.NADKJKECNCP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NADKJKECNCP>
      PARSER = new com.google.protobuf.AbstractParser<NADKJKECNCP>() {
    @java.lang.Override
    public NADKJKECNCP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NADKJKECNCP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NADKJKECNCP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NADKJKECNCP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NADKJKECNCP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

