// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HBPEACAIODI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HBPEACAIODI}
 */
public final class HBPEACAIODI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HBPEACAIODI)
    HBPEACAIODIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HBPEACAIODI.newBuilder() to construct.
  private HBPEACAIODI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HBPEACAIODI() {
    mdnhcfkhmpj_ = com.google.protobuf.ByteString.EMPTY;
    bhmdmkobdgn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HBPEACAIODI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HBPEACAIODI(
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

            mdnhcfkhmpj_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bhmdmkobdgn_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBPEACAIODI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBPEACAIODI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HBPEACAIODI.class, POGOProtos.Rpc.HBPEACAIODI.Builder.class);
  }

  public static final int MDNHCFKHMPJ_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString mdnhcfkhmpj_;
  /**
   * <code>bytes mdnhcfkhmpj = 1;</code>
   * @return The mdnhcfkhmpj.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMdnhcfkhmpj() {
    return mdnhcfkhmpj_;
  }

  public static final int BHMDMKOBDGN_FIELD_NUMBER = 2;
  private volatile java.lang.Object bhmdmkobdgn_;
  /**
   * <code>string bhmdmkobdgn = 2;</code>
   * @return The bhmdmkobdgn.
   */
  @java.lang.Override
  public java.lang.String getBhmdmkobdgn() {
    java.lang.Object ref = bhmdmkobdgn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bhmdmkobdgn_ = s;
      return s;
    }
  }
  /**
   * <code>string bhmdmkobdgn = 2;</code>
   * @return The bytes for bhmdmkobdgn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBhmdmkobdgnBytes() {
    java.lang.Object ref = bhmdmkobdgn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bhmdmkobdgn_ = b;
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
    if (!mdnhcfkhmpj_.isEmpty()) {
      output.writeBytes(1, mdnhcfkhmpj_);
    }
    if (!getBhmdmkobdgnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bhmdmkobdgn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!mdnhcfkhmpj_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, mdnhcfkhmpj_);
    }
    if (!getBhmdmkobdgnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bhmdmkobdgn_);
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
    if (!(obj instanceof POGOProtos.Rpc.HBPEACAIODI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HBPEACAIODI other = (POGOProtos.Rpc.HBPEACAIODI) obj;

    if (!getMdnhcfkhmpj()
        .equals(other.getMdnhcfkhmpj())) return false;
    if (!getBhmdmkobdgn()
        .equals(other.getBhmdmkobdgn())) return false;
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
    hash = (37 * hash) + MDNHCFKHMPJ_FIELD_NUMBER;
    hash = (53 * hash) + getMdnhcfkhmpj().hashCode();
    hash = (37 * hash) + BHMDMKOBDGN_FIELD_NUMBER;
    hash = (53 * hash) + getBhmdmkobdgn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HBPEACAIODI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HBPEACAIODI prototype) {
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
   * ref: HBPEACAIODI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HBPEACAIODI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HBPEACAIODI)
      POGOProtos.Rpc.HBPEACAIODIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBPEACAIODI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBPEACAIODI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HBPEACAIODI.class, POGOProtos.Rpc.HBPEACAIODI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HBPEACAIODI.newBuilder()
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
      mdnhcfkhmpj_ = com.google.protobuf.ByteString.EMPTY;

      bhmdmkobdgn_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HBPEACAIODI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HBPEACAIODI getDefaultInstanceForType() {
      return POGOProtos.Rpc.HBPEACAIODI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HBPEACAIODI build() {
      POGOProtos.Rpc.HBPEACAIODI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HBPEACAIODI buildPartial() {
      POGOProtos.Rpc.HBPEACAIODI result = new POGOProtos.Rpc.HBPEACAIODI(this);
      result.mdnhcfkhmpj_ = mdnhcfkhmpj_;
      result.bhmdmkobdgn_ = bhmdmkobdgn_;
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
      if (other instanceof POGOProtos.Rpc.HBPEACAIODI) {
        return mergeFrom((POGOProtos.Rpc.HBPEACAIODI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HBPEACAIODI other) {
      if (other == POGOProtos.Rpc.HBPEACAIODI.getDefaultInstance()) return this;
      if (other.getMdnhcfkhmpj() != com.google.protobuf.ByteString.EMPTY) {
        setMdnhcfkhmpj(other.getMdnhcfkhmpj());
      }
      if (!other.getBhmdmkobdgn().isEmpty()) {
        bhmdmkobdgn_ = other.bhmdmkobdgn_;
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
      POGOProtos.Rpc.HBPEACAIODI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HBPEACAIODI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString mdnhcfkhmpj_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes mdnhcfkhmpj = 1;</code>
     * @return The mdnhcfkhmpj.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMdnhcfkhmpj() {
      return mdnhcfkhmpj_;
    }
    /**
     * <code>bytes mdnhcfkhmpj = 1;</code>
     * @param value The mdnhcfkhmpj to set.
     * @return This builder for chaining.
     */
    public Builder setMdnhcfkhmpj(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mdnhcfkhmpj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes mdnhcfkhmpj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMdnhcfkhmpj() {
      
      mdnhcfkhmpj_ = getDefaultInstance().getMdnhcfkhmpj();
      onChanged();
      return this;
    }

    private java.lang.Object bhmdmkobdgn_ = "";
    /**
     * <code>string bhmdmkobdgn = 2;</code>
     * @return The bhmdmkobdgn.
     */
    public java.lang.String getBhmdmkobdgn() {
      java.lang.Object ref = bhmdmkobdgn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bhmdmkobdgn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bhmdmkobdgn = 2;</code>
     * @return The bytes for bhmdmkobdgn.
     */
    public com.google.protobuf.ByteString
        getBhmdmkobdgnBytes() {
      java.lang.Object ref = bhmdmkobdgn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bhmdmkobdgn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bhmdmkobdgn = 2;</code>
     * @param value The bhmdmkobdgn to set.
     * @return This builder for chaining.
     */
    public Builder setBhmdmkobdgn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bhmdmkobdgn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bhmdmkobdgn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBhmdmkobdgn() {
      
      bhmdmkobdgn_ = getDefaultInstance().getBhmdmkobdgn();
      onChanged();
      return this;
    }
    /**
     * <code>string bhmdmkobdgn = 2;</code>
     * @param value The bytes for bhmdmkobdgn to set.
     * @return This builder for chaining.
     */
    public Builder setBhmdmkobdgnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bhmdmkobdgn_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HBPEACAIODI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HBPEACAIODI)
  private static final POGOProtos.Rpc.HBPEACAIODI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HBPEACAIODI();
  }

  public static POGOProtos.Rpc.HBPEACAIODI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HBPEACAIODI>
      PARSER = new com.google.protobuf.AbstractParser<HBPEACAIODI>() {
    @java.lang.Override
    public HBPEACAIODI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HBPEACAIODI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HBPEACAIODI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HBPEACAIODI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HBPEACAIODI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
