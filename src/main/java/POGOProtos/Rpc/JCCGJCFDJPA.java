// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.JCCGJCFDJPA}
 */
public  final class JCCGJCFDJPA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JCCGJCFDJPA)
    JCCGJCFDJPAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JCCGJCFDJPA.newBuilder() to construct.
  private JCCGJCFDJPA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JCCGJCFDJPA() {
    mflocbjndnd_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JCCGJCFDJPA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JCCGJCFDJPA(
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

            mbfelfklifn_ = input.readBool();
            break;
          }
          case 16: {

            dghlmgodbgj_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mflocbjndnd_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JCCGJCFDJPA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JCCGJCFDJPA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JCCGJCFDJPA.class, POGOProtos.Rpc.JCCGJCFDJPA.Builder.class);
  }

  public static final int MBFELFKLIFN_FIELD_NUMBER = 1;
  private boolean mbfelfklifn_;
  /**
   * <code>bool mbfelfklifn = 1;</code>
   * @return The mbfelfklifn.
   */
  public boolean getMbfelfklifn() {
    return mbfelfklifn_;
  }

  public static final int DGHLMGODBGJ_FIELD_NUMBER = 2;
  private boolean dghlmgodbgj_;
  /**
   * <code>bool dghlmgodbgj = 2;</code>
   * @return The dghlmgodbgj.
   */
  public boolean getDghlmgodbgj() {
    return dghlmgodbgj_;
  }

  public static final int MFLOCBJNDND_FIELD_NUMBER = 3;
  private volatile java.lang.Object mflocbjndnd_;
  /**
   * <code>string mflocbjndnd = 3;</code>
   * @return The mflocbjndnd.
   */
  public java.lang.String getMflocbjndnd() {
    java.lang.Object ref = mflocbjndnd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mflocbjndnd_ = s;
      return s;
    }
  }
  /**
   * <code>string mflocbjndnd = 3;</code>
   * @return The bytes for mflocbjndnd.
   */
  public com.google.protobuf.ByteString
      getMflocbjndndBytes() {
    java.lang.Object ref = mflocbjndnd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mflocbjndnd_ = b;
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
    if (mbfelfklifn_ != false) {
      output.writeBool(1, mbfelfklifn_);
    }
    if (dghlmgodbgj_ != false) {
      output.writeBool(2, dghlmgodbgj_);
    }
    if (!getMflocbjndndBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mflocbjndnd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mbfelfklifn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, mbfelfklifn_);
    }
    if (dghlmgodbgj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dghlmgodbgj_);
    }
    if (!getMflocbjndndBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mflocbjndnd_);
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
    if (!(obj instanceof POGOProtos.Rpc.JCCGJCFDJPA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JCCGJCFDJPA other = (POGOProtos.Rpc.JCCGJCFDJPA) obj;

    if (getMbfelfklifn()
        != other.getMbfelfklifn()) return false;
    if (getDghlmgodbgj()
        != other.getDghlmgodbgj()) return false;
    if (!getMflocbjndnd()
        .equals(other.getMflocbjndnd())) return false;
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
    hash = (37 * hash) + MBFELFKLIFN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMbfelfklifn());
    hash = (37 * hash) + DGHLMGODBGJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDghlmgodbgj());
    hash = (37 * hash) + MFLOCBJNDND_FIELD_NUMBER;
    hash = (53 * hash) + getMflocbjndnd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JCCGJCFDJPA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JCCGJCFDJPA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.JCCGJCFDJPA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JCCGJCFDJPA)
      POGOProtos.Rpc.JCCGJCFDJPAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JCCGJCFDJPA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JCCGJCFDJPA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JCCGJCFDJPA.class, POGOProtos.Rpc.JCCGJCFDJPA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JCCGJCFDJPA.newBuilder()
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
      mbfelfklifn_ = false;

      dghlmgodbgj_ = false;

      mflocbjndnd_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JCCGJCFDJPA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JCCGJCFDJPA getDefaultInstanceForType() {
      return POGOProtos.Rpc.JCCGJCFDJPA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JCCGJCFDJPA build() {
      POGOProtos.Rpc.JCCGJCFDJPA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JCCGJCFDJPA buildPartial() {
      POGOProtos.Rpc.JCCGJCFDJPA result = new POGOProtos.Rpc.JCCGJCFDJPA(this);
      result.mbfelfklifn_ = mbfelfklifn_;
      result.dghlmgodbgj_ = dghlmgodbgj_;
      result.mflocbjndnd_ = mflocbjndnd_;
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
      if (other instanceof POGOProtos.Rpc.JCCGJCFDJPA) {
        return mergeFrom((POGOProtos.Rpc.JCCGJCFDJPA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JCCGJCFDJPA other) {
      if (other == POGOProtos.Rpc.JCCGJCFDJPA.getDefaultInstance()) return this;
      if (other.getMbfelfklifn() != false) {
        setMbfelfklifn(other.getMbfelfklifn());
      }
      if (other.getDghlmgodbgj() != false) {
        setDghlmgodbgj(other.getDghlmgodbgj());
      }
      if (!other.getMflocbjndnd().isEmpty()) {
        mflocbjndnd_ = other.mflocbjndnd_;
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
      POGOProtos.Rpc.JCCGJCFDJPA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JCCGJCFDJPA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean mbfelfklifn_ ;
    /**
     * <code>bool mbfelfklifn = 1;</code>
     * @return The mbfelfklifn.
     */
    public boolean getMbfelfklifn() {
      return mbfelfklifn_;
    }
    /**
     * <code>bool mbfelfklifn = 1;</code>
     * @param value The mbfelfklifn to set.
     * @return This builder for chaining.
     */
    public Builder setMbfelfklifn(boolean value) {
      
      mbfelfklifn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mbfelfklifn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMbfelfklifn() {
      
      mbfelfklifn_ = false;
      onChanged();
      return this;
    }

    private boolean dghlmgodbgj_ ;
    /**
     * <code>bool dghlmgodbgj = 2;</code>
     * @return The dghlmgodbgj.
     */
    public boolean getDghlmgodbgj() {
      return dghlmgodbgj_;
    }
    /**
     * <code>bool dghlmgodbgj = 2;</code>
     * @param value The dghlmgodbgj to set.
     * @return This builder for chaining.
     */
    public Builder setDghlmgodbgj(boolean value) {
      
      dghlmgodbgj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dghlmgodbgj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDghlmgodbgj() {
      
      dghlmgodbgj_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object mflocbjndnd_ = "";
    /**
     * <code>string mflocbjndnd = 3;</code>
     * @return The mflocbjndnd.
     */
    public java.lang.String getMflocbjndnd() {
      java.lang.Object ref = mflocbjndnd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mflocbjndnd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mflocbjndnd = 3;</code>
     * @return The bytes for mflocbjndnd.
     */
    public com.google.protobuf.ByteString
        getMflocbjndndBytes() {
      java.lang.Object ref = mflocbjndnd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mflocbjndnd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mflocbjndnd = 3;</code>
     * @param value The mflocbjndnd to set.
     * @return This builder for chaining.
     */
    public Builder setMflocbjndnd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mflocbjndnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mflocbjndnd = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMflocbjndnd() {
      
      mflocbjndnd_ = getDefaultInstance().getMflocbjndnd();
      onChanged();
      return this;
    }
    /**
     * <code>string mflocbjndnd = 3;</code>
     * @param value The bytes for mflocbjndnd to set.
     * @return This builder for chaining.
     */
    public Builder setMflocbjndndBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mflocbjndnd_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JCCGJCFDJPA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JCCGJCFDJPA)
  private static final POGOProtos.Rpc.JCCGJCFDJPA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JCCGJCFDJPA();
  }

  public static POGOProtos.Rpc.JCCGJCFDJPA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JCCGJCFDJPA>
      PARSER = new com.google.protobuf.AbstractParser<JCCGJCFDJPA>() {
    @java.lang.Override
    public JCCGJCFDJPA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JCCGJCFDJPA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JCCGJCFDJPA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JCCGJCFDJPA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JCCGJCFDJPA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

