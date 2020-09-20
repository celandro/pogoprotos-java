// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OIAFIOKKDNL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.OIAFIOKKDNL}
 */
public final class OIAFIOKKDNL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OIAFIOKKDNL)
    OIAFIOKKDNLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OIAFIOKKDNL.newBuilder() to construct.
  private OIAFIOKKDNL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OIAFIOKKDNL() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OIAFIOKKDNL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OIAFIOKKDNL(
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

            adapogmohpd_ = input.readBool();
            break;
          }
          case 16: {

            cnpkhiaehpb_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIAFIOKKDNL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIAFIOKKDNL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OIAFIOKKDNL.class, POGOProtos.Rpc.OIAFIOKKDNL.Builder.class);
  }

  public static final int ADAPOGMOHPD_FIELD_NUMBER = 1;
  private boolean adapogmohpd_;
  /**
   * <code>bool adapogmohpd = 1;</code>
   * @return The adapogmohpd.
   */
  @java.lang.Override
  public boolean getAdapogmohpd() {
    return adapogmohpd_;
  }

  public static final int CNPKHIAEHPB_FIELD_NUMBER = 2;
  private boolean cnpkhiaehpb_;
  /**
   * <code>bool cnpkhiaehpb = 2;</code>
   * @return The cnpkhiaehpb.
   */
  @java.lang.Override
  public boolean getCnpkhiaehpb() {
    return cnpkhiaehpb_;
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
    if (adapogmohpd_ != false) {
      output.writeBool(1, adapogmohpd_);
    }
    if (cnpkhiaehpb_ != false) {
      output.writeBool(2, cnpkhiaehpb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adapogmohpd_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, adapogmohpd_);
    }
    if (cnpkhiaehpb_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, cnpkhiaehpb_);
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
    if (!(obj instanceof POGOProtos.Rpc.OIAFIOKKDNL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OIAFIOKKDNL other = (POGOProtos.Rpc.OIAFIOKKDNL) obj;

    if (getAdapogmohpd()
        != other.getAdapogmohpd()) return false;
    if (getCnpkhiaehpb()
        != other.getCnpkhiaehpb()) return false;
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
    hash = (37 * hash) + ADAPOGMOHPD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAdapogmohpd());
    hash = (37 * hash) + CNPKHIAEHPB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCnpkhiaehpb());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OIAFIOKKDNL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OIAFIOKKDNL prototype) {
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
   * ref: OIAFIOKKDNL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.OIAFIOKKDNL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OIAFIOKKDNL)
      POGOProtos.Rpc.OIAFIOKKDNLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIAFIOKKDNL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIAFIOKKDNL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OIAFIOKKDNL.class, POGOProtos.Rpc.OIAFIOKKDNL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OIAFIOKKDNL.newBuilder()
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
      adapogmohpd_ = false;

      cnpkhiaehpb_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_OIAFIOKKDNL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OIAFIOKKDNL getDefaultInstanceForType() {
      return POGOProtos.Rpc.OIAFIOKKDNL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OIAFIOKKDNL build() {
      POGOProtos.Rpc.OIAFIOKKDNL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OIAFIOKKDNL buildPartial() {
      POGOProtos.Rpc.OIAFIOKKDNL result = new POGOProtos.Rpc.OIAFIOKKDNL(this);
      result.adapogmohpd_ = adapogmohpd_;
      result.cnpkhiaehpb_ = cnpkhiaehpb_;
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
      if (other instanceof POGOProtos.Rpc.OIAFIOKKDNL) {
        return mergeFrom((POGOProtos.Rpc.OIAFIOKKDNL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OIAFIOKKDNL other) {
      if (other == POGOProtos.Rpc.OIAFIOKKDNL.getDefaultInstance()) return this;
      if (other.getAdapogmohpd() != false) {
        setAdapogmohpd(other.getAdapogmohpd());
      }
      if (other.getCnpkhiaehpb() != false) {
        setCnpkhiaehpb(other.getCnpkhiaehpb());
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
      POGOProtos.Rpc.OIAFIOKKDNL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OIAFIOKKDNL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean adapogmohpd_ ;
    /**
     * <code>bool adapogmohpd = 1;</code>
     * @return The adapogmohpd.
     */
    @java.lang.Override
    public boolean getAdapogmohpd() {
      return adapogmohpd_;
    }
    /**
     * <code>bool adapogmohpd = 1;</code>
     * @param value The adapogmohpd to set.
     * @return This builder for chaining.
     */
    public Builder setAdapogmohpd(boolean value) {
      
      adapogmohpd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool adapogmohpd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdapogmohpd() {
      
      adapogmohpd_ = false;
      onChanged();
      return this;
    }

    private boolean cnpkhiaehpb_ ;
    /**
     * <code>bool cnpkhiaehpb = 2;</code>
     * @return The cnpkhiaehpb.
     */
    @java.lang.Override
    public boolean getCnpkhiaehpb() {
      return cnpkhiaehpb_;
    }
    /**
     * <code>bool cnpkhiaehpb = 2;</code>
     * @param value The cnpkhiaehpb to set.
     * @return This builder for chaining.
     */
    public Builder setCnpkhiaehpb(boolean value) {
      
      cnpkhiaehpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cnpkhiaehpb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCnpkhiaehpb() {
      
      cnpkhiaehpb_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OIAFIOKKDNL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OIAFIOKKDNL)
  private static final POGOProtos.Rpc.OIAFIOKKDNL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OIAFIOKKDNL();
  }

  public static POGOProtos.Rpc.OIAFIOKKDNL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OIAFIOKKDNL>
      PARSER = new com.google.protobuf.AbstractParser<OIAFIOKKDNL>() {
    @java.lang.Override
    public OIAFIOKKDNL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OIAFIOKKDNL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OIAFIOKKDNL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OIAFIOKKDNL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OIAFIOKKDNL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

