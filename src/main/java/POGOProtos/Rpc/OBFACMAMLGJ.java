// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OBFACMAMLGJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OBFACMAMLGJ}
 */
public final class OBFACMAMLGJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OBFACMAMLGJ)
    OBFACMAMLGJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OBFACMAMLGJ.newBuilder() to construct.
  private OBFACMAMLGJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OBFACMAMLGJ() {
    dpnibkogejm_ = "";
    pfckmcdejid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OBFACMAMLGJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OBFACMAMLGJ(
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

            dpnibkogejm_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            pfckmcdejid_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OBFACMAMLGJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OBFACMAMLGJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OBFACMAMLGJ.class, POGOProtos.Rpc.OBFACMAMLGJ.Builder.class);
  }

  public static final int DPNIBKOGEJM_FIELD_NUMBER = 1;
  private volatile java.lang.Object dpnibkogejm_;
  /**
   * <code>string dpnibkogejm = 1;</code>
   * @return The dpnibkogejm.
   */
  @java.lang.Override
  public java.lang.String getDpnibkogejm() {
    java.lang.Object ref = dpnibkogejm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dpnibkogejm_ = s;
      return s;
    }
  }
  /**
   * <code>string dpnibkogejm = 1;</code>
   * @return The bytes for dpnibkogejm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDpnibkogejmBytes() {
    java.lang.Object ref = dpnibkogejm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dpnibkogejm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PFCKMCDEJID_FIELD_NUMBER = 2;
  private volatile java.lang.Object pfckmcdejid_;
  /**
   * <code>string pfckmcdejid = 2;</code>
   * @return The pfckmcdejid.
   */
  @java.lang.Override
  public java.lang.String getPfckmcdejid() {
    java.lang.Object ref = pfckmcdejid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pfckmcdejid_ = s;
      return s;
    }
  }
  /**
   * <code>string pfckmcdejid = 2;</code>
   * @return The bytes for pfckmcdejid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPfckmcdejidBytes() {
    java.lang.Object ref = pfckmcdejid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pfckmcdejid_ = b;
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
    if (!getDpnibkogejmBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dpnibkogejm_);
    }
    if (!getPfckmcdejidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pfckmcdejid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDpnibkogejmBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dpnibkogejm_);
    }
    if (!getPfckmcdejidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pfckmcdejid_);
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
    if (!(obj instanceof POGOProtos.Rpc.OBFACMAMLGJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OBFACMAMLGJ other = (POGOProtos.Rpc.OBFACMAMLGJ) obj;

    if (!getDpnibkogejm()
        .equals(other.getDpnibkogejm())) return false;
    if (!getPfckmcdejid()
        .equals(other.getPfckmcdejid())) return false;
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
    hash = (37 * hash) + DPNIBKOGEJM_FIELD_NUMBER;
    hash = (53 * hash) + getDpnibkogejm().hashCode();
    hash = (37 * hash) + PFCKMCDEJID_FIELD_NUMBER;
    hash = (53 * hash) + getPfckmcdejid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OBFACMAMLGJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OBFACMAMLGJ prototype) {
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
   * ref: OBFACMAMLGJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OBFACMAMLGJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OBFACMAMLGJ)
      POGOProtos.Rpc.OBFACMAMLGJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OBFACMAMLGJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OBFACMAMLGJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OBFACMAMLGJ.class, POGOProtos.Rpc.OBFACMAMLGJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OBFACMAMLGJ.newBuilder()
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
      dpnibkogejm_ = "";

      pfckmcdejid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OBFACMAMLGJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OBFACMAMLGJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.OBFACMAMLGJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OBFACMAMLGJ build() {
      POGOProtos.Rpc.OBFACMAMLGJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OBFACMAMLGJ buildPartial() {
      POGOProtos.Rpc.OBFACMAMLGJ result = new POGOProtos.Rpc.OBFACMAMLGJ(this);
      result.dpnibkogejm_ = dpnibkogejm_;
      result.pfckmcdejid_ = pfckmcdejid_;
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
      if (other instanceof POGOProtos.Rpc.OBFACMAMLGJ) {
        return mergeFrom((POGOProtos.Rpc.OBFACMAMLGJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OBFACMAMLGJ other) {
      if (other == POGOProtos.Rpc.OBFACMAMLGJ.getDefaultInstance()) return this;
      if (!other.getDpnibkogejm().isEmpty()) {
        dpnibkogejm_ = other.dpnibkogejm_;
        onChanged();
      }
      if (!other.getPfckmcdejid().isEmpty()) {
        pfckmcdejid_ = other.pfckmcdejid_;
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
      POGOProtos.Rpc.OBFACMAMLGJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OBFACMAMLGJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dpnibkogejm_ = "";
    /**
     * <code>string dpnibkogejm = 1;</code>
     * @return The dpnibkogejm.
     */
    public java.lang.String getDpnibkogejm() {
      java.lang.Object ref = dpnibkogejm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dpnibkogejm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dpnibkogejm = 1;</code>
     * @return The bytes for dpnibkogejm.
     */
    public com.google.protobuf.ByteString
        getDpnibkogejmBytes() {
      java.lang.Object ref = dpnibkogejm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dpnibkogejm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dpnibkogejm = 1;</code>
     * @param value The dpnibkogejm to set.
     * @return This builder for chaining.
     */
    public Builder setDpnibkogejm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dpnibkogejm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dpnibkogejm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDpnibkogejm() {
      
      dpnibkogejm_ = getDefaultInstance().getDpnibkogejm();
      onChanged();
      return this;
    }
    /**
     * <code>string dpnibkogejm = 1;</code>
     * @param value The bytes for dpnibkogejm to set.
     * @return This builder for chaining.
     */
    public Builder setDpnibkogejmBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dpnibkogejm_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pfckmcdejid_ = "";
    /**
     * <code>string pfckmcdejid = 2;</code>
     * @return The pfckmcdejid.
     */
    public java.lang.String getPfckmcdejid() {
      java.lang.Object ref = pfckmcdejid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pfckmcdejid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pfckmcdejid = 2;</code>
     * @return The bytes for pfckmcdejid.
     */
    public com.google.protobuf.ByteString
        getPfckmcdejidBytes() {
      java.lang.Object ref = pfckmcdejid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pfckmcdejid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pfckmcdejid = 2;</code>
     * @param value The pfckmcdejid to set.
     * @return This builder for chaining.
     */
    public Builder setPfckmcdejid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pfckmcdejid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pfckmcdejid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPfckmcdejid() {
      
      pfckmcdejid_ = getDefaultInstance().getPfckmcdejid();
      onChanged();
      return this;
    }
    /**
     * <code>string pfckmcdejid = 2;</code>
     * @param value The bytes for pfckmcdejid to set.
     * @return This builder for chaining.
     */
    public Builder setPfckmcdejidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pfckmcdejid_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OBFACMAMLGJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OBFACMAMLGJ)
  private static final POGOProtos.Rpc.OBFACMAMLGJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OBFACMAMLGJ();
  }

  public static POGOProtos.Rpc.OBFACMAMLGJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OBFACMAMLGJ>
      PARSER = new com.google.protobuf.AbstractParser<OBFACMAMLGJ>() {
    @java.lang.Override
    public OBFACMAMLGJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OBFACMAMLGJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OBFACMAMLGJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OBFACMAMLGJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OBFACMAMLGJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
