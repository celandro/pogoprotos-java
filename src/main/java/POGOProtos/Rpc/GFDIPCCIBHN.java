// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GFDIPCCIBHN}
 */
public  final class GFDIPCCIBHN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GFDIPCCIBHN)
    GFDIPCCIBHNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GFDIPCCIBHN.newBuilder() to construct.
  private GFDIPCCIBHN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GFDIPCCIBHN() {
    dccakmkgfkb_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GFDIPCCIBHN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GFDIPCCIBHN(
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

            mbnlpnllfkm_ = input.readInt32();
            break;
          }
          case 16: {

            lcfhaadjmdo_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            dccakmkgfkb_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GFDIPCCIBHN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GFDIPCCIBHN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GFDIPCCIBHN.class, POGOProtos.Rpc.GFDIPCCIBHN.Builder.class);
  }

  public static final int MBNLPNLLFKM_FIELD_NUMBER = 1;
  private int mbnlpnllfkm_;
  /**
   * <code>int32 mbnlpnllfkm = 1;</code>
   * @return The mbnlpnllfkm.
   */
  public int getMbnlpnllfkm() {
    return mbnlpnllfkm_;
  }

  public static final int LCFHAADJMDO_FIELD_NUMBER = 2;
  private int lcfhaadjmdo_;
  /**
   * <code>int32 lcfhaadjmdo = 2;</code>
   * @return The lcfhaadjmdo.
   */
  public int getLcfhaadjmdo() {
    return lcfhaadjmdo_;
  }

  public static final int DCCAKMKGFKB_FIELD_NUMBER = 3;
  private volatile java.lang.Object dccakmkgfkb_;
  /**
   * <code>string dccakmkgfkb = 3;</code>
   * @return The dccakmkgfkb.
   */
  public java.lang.String getDccakmkgfkb() {
    java.lang.Object ref = dccakmkgfkb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dccakmkgfkb_ = s;
      return s;
    }
  }
  /**
   * <code>string dccakmkgfkb = 3;</code>
   * @return The bytes for dccakmkgfkb.
   */
  public com.google.protobuf.ByteString
      getDccakmkgfkbBytes() {
    java.lang.Object ref = dccakmkgfkb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dccakmkgfkb_ = b;
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
    if (mbnlpnllfkm_ != 0) {
      output.writeInt32(1, mbnlpnllfkm_);
    }
    if (lcfhaadjmdo_ != 0) {
      output.writeInt32(2, lcfhaadjmdo_);
    }
    if (!getDccakmkgfkbBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dccakmkgfkb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mbnlpnllfkm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, mbnlpnllfkm_);
    }
    if (lcfhaadjmdo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, lcfhaadjmdo_);
    }
    if (!getDccakmkgfkbBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dccakmkgfkb_);
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
    if (!(obj instanceof POGOProtos.Rpc.GFDIPCCIBHN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GFDIPCCIBHN other = (POGOProtos.Rpc.GFDIPCCIBHN) obj;

    if (getMbnlpnllfkm()
        != other.getMbnlpnllfkm()) return false;
    if (getLcfhaadjmdo()
        != other.getLcfhaadjmdo()) return false;
    if (!getDccakmkgfkb()
        .equals(other.getDccakmkgfkb())) return false;
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
    hash = (37 * hash) + MBNLPNLLFKM_FIELD_NUMBER;
    hash = (53 * hash) + getMbnlpnllfkm();
    hash = (37 * hash) + LCFHAADJMDO_FIELD_NUMBER;
    hash = (53 * hash) + getLcfhaadjmdo();
    hash = (37 * hash) + DCCAKMKGFKB_FIELD_NUMBER;
    hash = (53 * hash) + getDccakmkgfkb().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GFDIPCCIBHN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GFDIPCCIBHN prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GFDIPCCIBHN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GFDIPCCIBHN)
      POGOProtos.Rpc.GFDIPCCIBHNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GFDIPCCIBHN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GFDIPCCIBHN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GFDIPCCIBHN.class, POGOProtos.Rpc.GFDIPCCIBHN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GFDIPCCIBHN.newBuilder()
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
      mbnlpnllfkm_ = 0;

      lcfhaadjmdo_ = 0;

      dccakmkgfkb_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GFDIPCCIBHN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFDIPCCIBHN getDefaultInstanceForType() {
      return POGOProtos.Rpc.GFDIPCCIBHN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFDIPCCIBHN build() {
      POGOProtos.Rpc.GFDIPCCIBHN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GFDIPCCIBHN buildPartial() {
      POGOProtos.Rpc.GFDIPCCIBHN result = new POGOProtos.Rpc.GFDIPCCIBHN(this);
      result.mbnlpnllfkm_ = mbnlpnllfkm_;
      result.lcfhaadjmdo_ = lcfhaadjmdo_;
      result.dccakmkgfkb_ = dccakmkgfkb_;
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
      if (other instanceof POGOProtos.Rpc.GFDIPCCIBHN) {
        return mergeFrom((POGOProtos.Rpc.GFDIPCCIBHN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GFDIPCCIBHN other) {
      if (other == POGOProtos.Rpc.GFDIPCCIBHN.getDefaultInstance()) return this;
      if (other.getMbnlpnllfkm() != 0) {
        setMbnlpnllfkm(other.getMbnlpnllfkm());
      }
      if (other.getLcfhaadjmdo() != 0) {
        setLcfhaadjmdo(other.getLcfhaadjmdo());
      }
      if (!other.getDccakmkgfkb().isEmpty()) {
        dccakmkgfkb_ = other.dccakmkgfkb_;
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
      POGOProtos.Rpc.GFDIPCCIBHN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GFDIPCCIBHN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mbnlpnllfkm_ ;
    /**
     * <code>int32 mbnlpnllfkm = 1;</code>
     * @return The mbnlpnllfkm.
     */
    public int getMbnlpnllfkm() {
      return mbnlpnllfkm_;
    }
    /**
     * <code>int32 mbnlpnllfkm = 1;</code>
     * @param value The mbnlpnllfkm to set.
     * @return This builder for chaining.
     */
    public Builder setMbnlpnllfkm(int value) {
      
      mbnlpnllfkm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mbnlpnllfkm = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMbnlpnllfkm() {
      
      mbnlpnllfkm_ = 0;
      onChanged();
      return this;
    }

    private int lcfhaadjmdo_ ;
    /**
     * <code>int32 lcfhaadjmdo = 2;</code>
     * @return The lcfhaadjmdo.
     */
    public int getLcfhaadjmdo() {
      return lcfhaadjmdo_;
    }
    /**
     * <code>int32 lcfhaadjmdo = 2;</code>
     * @param value The lcfhaadjmdo to set.
     * @return This builder for chaining.
     */
    public Builder setLcfhaadjmdo(int value) {
      
      lcfhaadjmdo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lcfhaadjmdo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLcfhaadjmdo() {
      
      lcfhaadjmdo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dccakmkgfkb_ = "";
    /**
     * <code>string dccakmkgfkb = 3;</code>
     * @return The dccakmkgfkb.
     */
    public java.lang.String getDccakmkgfkb() {
      java.lang.Object ref = dccakmkgfkb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dccakmkgfkb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dccakmkgfkb = 3;</code>
     * @return The bytes for dccakmkgfkb.
     */
    public com.google.protobuf.ByteString
        getDccakmkgfkbBytes() {
      java.lang.Object ref = dccakmkgfkb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dccakmkgfkb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dccakmkgfkb = 3;</code>
     * @param value The dccakmkgfkb to set.
     * @return This builder for chaining.
     */
    public Builder setDccakmkgfkb(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dccakmkgfkb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dccakmkgfkb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDccakmkgfkb() {
      
      dccakmkgfkb_ = getDefaultInstance().getDccakmkgfkb();
      onChanged();
      return this;
    }
    /**
     * <code>string dccakmkgfkb = 3;</code>
     * @param value The bytes for dccakmkgfkb to set.
     * @return This builder for chaining.
     */
    public Builder setDccakmkgfkbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dccakmkgfkb_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GFDIPCCIBHN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GFDIPCCIBHN)
  private static final POGOProtos.Rpc.GFDIPCCIBHN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GFDIPCCIBHN();
  }

  public static POGOProtos.Rpc.GFDIPCCIBHN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GFDIPCCIBHN>
      PARSER = new com.google.protobuf.AbstractParser<GFDIPCCIBHN>() {
    @java.lang.Override
    public GFDIPCCIBHN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GFDIPCCIBHN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GFDIPCCIBHN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GFDIPCCIBHN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GFDIPCCIBHN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

