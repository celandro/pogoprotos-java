// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HMAKIBNPDNJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HMAKIBNPDNJ}
 */
public final class HMAKIBNPDNJ extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HMAKIBNPDNJ)
    HMAKIBNPDNJOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HMAKIBNPDNJ.newBuilder() to construct.
  private HMAKIBNPDNJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HMAKIBNPDNJ() {
    fmllmielckn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HMAKIBNPDNJ();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HMAKIBNPDNJ(
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

            kjembaejifh_ = input.readInt32();
            break;
          }
          case 16: {

            pfmfgpabmfc_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fmllmielckn_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAKIBNPDNJ_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAKIBNPDNJ_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HMAKIBNPDNJ.class, POGOProtos.Rpc.HMAKIBNPDNJ.Builder.class);
  }

  public static final int KJEMBAEJIFH_FIELD_NUMBER = 1;
  private int kjembaejifh_;
  /**
   * <code>int32 kjembaejifh = 1;</code>
   * @return The kjembaejifh.
   */
  @java.lang.Override
  public int getKjembaejifh() {
    return kjembaejifh_;
  }

  public static final int PFMFGPABMFC_FIELD_NUMBER = 2;
  private int pfmfgpabmfc_;
  /**
   * <code>int32 pfmfgpabmfc = 2;</code>
   * @return The pfmfgpabmfc.
   */
  @java.lang.Override
  public int getPfmfgpabmfc() {
    return pfmfgpabmfc_;
  }

  public static final int FMLLMIELCKN_FIELD_NUMBER = 3;
  private volatile java.lang.Object fmllmielckn_;
  /**
   * <code>string fmllmielckn = 3;</code>
   * @return The fmllmielckn.
   */
  @java.lang.Override
  public java.lang.String getFmllmielckn() {
    java.lang.Object ref = fmllmielckn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fmllmielckn_ = s;
      return s;
    }
  }
  /**
   * <code>string fmllmielckn = 3;</code>
   * @return The bytes for fmllmielckn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFmllmielcknBytes() {
    java.lang.Object ref = fmllmielckn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fmllmielckn_ = b;
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
    if (kjembaejifh_ != 0) {
      output.writeInt32(1, kjembaejifh_);
    }
    if (pfmfgpabmfc_ != 0) {
      output.writeInt32(2, pfmfgpabmfc_);
    }
    if (!getFmllmielcknBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fmllmielckn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kjembaejifh_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, kjembaejifh_);
    }
    if (pfmfgpabmfc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pfmfgpabmfc_);
    }
    if (!getFmllmielcknBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fmllmielckn_);
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
    if (!(obj instanceof POGOProtos.Rpc.HMAKIBNPDNJ)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HMAKIBNPDNJ other = (POGOProtos.Rpc.HMAKIBNPDNJ) obj;

    if (getKjembaejifh()
        != other.getKjembaejifh()) return false;
    if (getPfmfgpabmfc()
        != other.getPfmfgpabmfc()) return false;
    if (!getFmllmielckn()
        .equals(other.getFmllmielckn())) return false;
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
    hash = (37 * hash) + KJEMBAEJIFH_FIELD_NUMBER;
    hash = (53 * hash) + getKjembaejifh();
    hash = (37 * hash) + PFMFGPABMFC_FIELD_NUMBER;
    hash = (53 * hash) + getPfmfgpabmfc();
    hash = (37 * hash) + FMLLMIELCKN_FIELD_NUMBER;
    hash = (53 * hash) + getFmllmielckn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HMAKIBNPDNJ parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HMAKIBNPDNJ prototype) {
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
   * ref: HMAKIBNPDNJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HMAKIBNPDNJ}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HMAKIBNPDNJ)
      POGOProtos.Rpc.HMAKIBNPDNJOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAKIBNPDNJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAKIBNPDNJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HMAKIBNPDNJ.class, POGOProtos.Rpc.HMAKIBNPDNJ.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HMAKIBNPDNJ.newBuilder()
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
      kjembaejifh_ = 0;

      pfmfgpabmfc_ = 0;

      fmllmielckn_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HMAKIBNPDNJ_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMAKIBNPDNJ getDefaultInstanceForType() {
      return POGOProtos.Rpc.HMAKIBNPDNJ.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMAKIBNPDNJ build() {
      POGOProtos.Rpc.HMAKIBNPDNJ result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HMAKIBNPDNJ buildPartial() {
      POGOProtos.Rpc.HMAKIBNPDNJ result = new POGOProtos.Rpc.HMAKIBNPDNJ(this);
      result.kjembaejifh_ = kjembaejifh_;
      result.pfmfgpabmfc_ = pfmfgpabmfc_;
      result.fmllmielckn_ = fmllmielckn_;
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
      if (other instanceof POGOProtos.Rpc.HMAKIBNPDNJ) {
        return mergeFrom((POGOProtos.Rpc.HMAKIBNPDNJ)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HMAKIBNPDNJ other) {
      if (other == POGOProtos.Rpc.HMAKIBNPDNJ.getDefaultInstance()) return this;
      if (other.getKjembaejifh() != 0) {
        setKjembaejifh(other.getKjembaejifh());
      }
      if (other.getPfmfgpabmfc() != 0) {
        setPfmfgpabmfc(other.getPfmfgpabmfc());
      }
      if (!other.getFmllmielckn().isEmpty()) {
        fmllmielckn_ = other.fmllmielckn_;
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
      POGOProtos.Rpc.HMAKIBNPDNJ parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HMAKIBNPDNJ) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int kjembaejifh_ ;
    /**
     * <code>int32 kjembaejifh = 1;</code>
     * @return The kjembaejifh.
     */
    @java.lang.Override
    public int getKjembaejifh() {
      return kjembaejifh_;
    }
    /**
     * <code>int32 kjembaejifh = 1;</code>
     * @param value The kjembaejifh to set.
     * @return This builder for chaining.
     */
    public Builder setKjembaejifh(int value) {
      
      kjembaejifh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kjembaejifh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKjembaejifh() {
      
      kjembaejifh_ = 0;
      onChanged();
      return this;
    }

    private int pfmfgpabmfc_ ;
    /**
     * <code>int32 pfmfgpabmfc = 2;</code>
     * @return The pfmfgpabmfc.
     */
    @java.lang.Override
    public int getPfmfgpabmfc() {
      return pfmfgpabmfc_;
    }
    /**
     * <code>int32 pfmfgpabmfc = 2;</code>
     * @param value The pfmfgpabmfc to set.
     * @return This builder for chaining.
     */
    public Builder setPfmfgpabmfc(int value) {
      
      pfmfgpabmfc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pfmfgpabmfc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPfmfgpabmfc() {
      
      pfmfgpabmfc_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fmllmielckn_ = "";
    /**
     * <code>string fmllmielckn = 3;</code>
     * @return The fmllmielckn.
     */
    public java.lang.String getFmllmielckn() {
      java.lang.Object ref = fmllmielckn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fmllmielckn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fmllmielckn = 3;</code>
     * @return The bytes for fmllmielckn.
     */
    public com.google.protobuf.ByteString
        getFmllmielcknBytes() {
      java.lang.Object ref = fmllmielckn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fmllmielckn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fmllmielckn = 3;</code>
     * @param value The fmllmielckn to set.
     * @return This builder for chaining.
     */
    public Builder setFmllmielckn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fmllmielckn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fmllmielckn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFmllmielckn() {
      
      fmllmielckn_ = getDefaultInstance().getFmllmielckn();
      onChanged();
      return this;
    }
    /**
     * <code>string fmllmielckn = 3;</code>
     * @param value The bytes for fmllmielckn to set.
     * @return This builder for chaining.
     */
    public Builder setFmllmielcknBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fmllmielckn_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HMAKIBNPDNJ)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HMAKIBNPDNJ)
  private static final POGOProtos.Rpc.HMAKIBNPDNJ DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HMAKIBNPDNJ();
  }

  public static POGOProtos.Rpc.HMAKIBNPDNJ getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HMAKIBNPDNJ>
      PARSER = new com.google.protobuf.AbstractParser<HMAKIBNPDNJ>() {
    @java.lang.Override
    public HMAKIBNPDNJ parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HMAKIBNPDNJ(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HMAKIBNPDNJ> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HMAKIBNPDNJ> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HMAKIBNPDNJ getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

