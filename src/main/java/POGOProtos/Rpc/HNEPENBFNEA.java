// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HNEPENBFNEA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HNEPENBFNEA}
 */
public final class HNEPENBFNEA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HNEPENBFNEA)
    HNEPENBFNEAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HNEPENBFNEA.newBuilder() to construct.
  private HNEPENBFNEA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HNEPENBFNEA() {
    lndigkkjfml_ = "";
    gjkkmmfeebl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HNEPENBFNEA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HNEPENBFNEA(
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

            gocjelmnkci_ = input.readInt32();
            break;
          }
          case 21: {

            hbjkcdpdcci_ = input.readFloat();
            break;
          }
          case 24: {

            ckniekbneoe_ = input.readUInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            lndigkkjfml_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            gjkkmmfeebl_ = s;
            break;
          }
          case 50: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (efpknnlchbc_ != null) {
              subBuilder = efpknnlchbc_.toBuilder();
            }
            efpknnlchbc_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(efpknnlchbc_);
              efpknnlchbc_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNEPENBFNEA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNEPENBFNEA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HNEPENBFNEA.class, POGOProtos.Rpc.HNEPENBFNEA.Builder.class);
  }

  public static final int GOCJELMNKCI_FIELD_NUMBER = 1;
  private int gocjelmnkci_;
  /**
   * <code>int32 gocjelmnkci = 1;</code>
   * @return The gocjelmnkci.
   */
  @java.lang.Override
  public int getGocjelmnkci() {
    return gocjelmnkci_;
  }

  public static final int HBJKCDPDCCI_FIELD_NUMBER = 2;
  private float hbjkcdpdcci_;
  /**
   * <code>float hbjkcdpdcci = 2;</code>
   * @return The hbjkcdpdcci.
   */
  @java.lang.Override
  public float getHbjkcdpdcci() {
    return hbjkcdpdcci_;
  }

  public static final int CKNIEKBNEOE_FIELD_NUMBER = 3;
  private long ckniekbneoe_;
  /**
   * <code>uint64 ckniekbneoe = 3;</code>
   * @return The ckniekbneoe.
   */
  @java.lang.Override
  public long getCkniekbneoe() {
    return ckniekbneoe_;
  }

  public static final int LNDIGKKJFML_FIELD_NUMBER = 4;
  private volatile java.lang.Object lndigkkjfml_;
  /**
   * <code>string lndigkkjfml = 4;</code>
   * @return The lndigkkjfml.
   */
  @java.lang.Override
  public java.lang.String getLndigkkjfml() {
    java.lang.Object ref = lndigkkjfml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lndigkkjfml_ = s;
      return s;
    }
  }
  /**
   * <code>string lndigkkjfml = 4;</code>
   * @return The bytes for lndigkkjfml.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLndigkkjfmlBytes() {
    java.lang.Object ref = lndigkkjfml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lndigkkjfml_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GJKKMMFEEBL_FIELD_NUMBER = 5;
  private volatile java.lang.Object gjkkmmfeebl_;
  /**
   * <code>string gjkkmmfeebl = 5;</code>
   * @return The gjkkmmfeebl.
   */
  @java.lang.Override
  public java.lang.String getGjkkmmfeebl() {
    java.lang.Object ref = gjkkmmfeebl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gjkkmmfeebl_ = s;
      return s;
    }
  }
  /**
   * <code>string gjkkmmfeebl = 5;</code>
   * @return The bytes for gjkkmmfeebl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGjkkmmfeeblBytes() {
    java.lang.Object ref = gjkkmmfeebl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gjkkmmfeebl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EFPKNNLCHBC_FIELD_NUMBER = 6;
  private POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
   * @return Whether the efpknnlchbc field is set.
   */
  @java.lang.Override
  public boolean hasEfpknnlchbc() {
    return efpknnlchbc_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
   * @return The efpknnlchbc.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto getEfpknnlchbc() {
    return efpknnlchbc_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : efpknnlchbc_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getEfpknnlchbcOrBuilder() {
    return getEfpknnlchbc();
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
    if (gocjelmnkci_ != 0) {
      output.writeInt32(1, gocjelmnkci_);
    }
    if (hbjkcdpdcci_ != 0F) {
      output.writeFloat(2, hbjkcdpdcci_);
    }
    if (ckniekbneoe_ != 0L) {
      output.writeUInt64(3, ckniekbneoe_);
    }
    if (!getLndigkkjfmlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lndigkkjfml_);
    }
    if (!getGjkkmmfeeblBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gjkkmmfeebl_);
    }
    if (efpknnlchbc_ != null) {
      output.writeMessage(6, getEfpknnlchbc());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gocjelmnkci_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, gocjelmnkci_);
    }
    if (hbjkcdpdcci_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, hbjkcdpdcci_);
    }
    if (ckniekbneoe_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, ckniekbneoe_);
    }
    if (!getLndigkkjfmlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lndigkkjfml_);
    }
    if (!getGjkkmmfeeblBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gjkkmmfeebl_);
    }
    if (efpknnlchbc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getEfpknnlchbc());
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
    if (!(obj instanceof POGOProtos.Rpc.HNEPENBFNEA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HNEPENBFNEA other = (POGOProtos.Rpc.HNEPENBFNEA) obj;

    if (getGocjelmnkci()
        != other.getGocjelmnkci()) return false;
    if (java.lang.Float.floatToIntBits(getHbjkcdpdcci())
        != java.lang.Float.floatToIntBits(
            other.getHbjkcdpdcci())) return false;
    if (getCkniekbneoe()
        != other.getCkniekbneoe()) return false;
    if (!getLndigkkjfml()
        .equals(other.getLndigkkjfml())) return false;
    if (!getGjkkmmfeebl()
        .equals(other.getGjkkmmfeebl())) return false;
    if (hasEfpknnlchbc() != other.hasEfpknnlchbc()) return false;
    if (hasEfpknnlchbc()) {
      if (!getEfpknnlchbc()
          .equals(other.getEfpknnlchbc())) return false;
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
    hash = (37 * hash) + GOCJELMNKCI_FIELD_NUMBER;
    hash = (53 * hash) + getGocjelmnkci();
    hash = (37 * hash) + HBJKCDPDCCI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHbjkcdpdcci());
    hash = (37 * hash) + CKNIEKBNEOE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCkniekbneoe());
    hash = (37 * hash) + LNDIGKKJFML_FIELD_NUMBER;
    hash = (53 * hash) + getLndigkkjfml().hashCode();
    hash = (37 * hash) + GJKKMMFEEBL_FIELD_NUMBER;
    hash = (53 * hash) + getGjkkmmfeebl().hashCode();
    if (hasEfpknnlchbc()) {
      hash = (37 * hash) + EFPKNNLCHBC_FIELD_NUMBER;
      hash = (53 * hash) + getEfpknnlchbc().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HNEPENBFNEA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HNEPENBFNEA prototype) {
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
   * ref: HNEPENBFNEA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HNEPENBFNEA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HNEPENBFNEA)
      POGOProtos.Rpc.HNEPENBFNEAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNEPENBFNEA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNEPENBFNEA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HNEPENBFNEA.class, POGOProtos.Rpc.HNEPENBFNEA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HNEPENBFNEA.newBuilder()
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
      gocjelmnkci_ = 0;

      hbjkcdpdcci_ = 0F;

      ckniekbneoe_ = 0L;

      lndigkkjfml_ = "";

      gjkkmmfeebl_ = "";

      if (efpknnlchbcBuilder_ == null) {
        efpknnlchbc_ = null;
      } else {
        efpknnlchbc_ = null;
        efpknnlchbcBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HNEPENBFNEA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNEPENBFNEA getDefaultInstanceForType() {
      return POGOProtos.Rpc.HNEPENBFNEA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNEPENBFNEA build() {
      POGOProtos.Rpc.HNEPENBFNEA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HNEPENBFNEA buildPartial() {
      POGOProtos.Rpc.HNEPENBFNEA result = new POGOProtos.Rpc.HNEPENBFNEA(this);
      result.gocjelmnkci_ = gocjelmnkci_;
      result.hbjkcdpdcci_ = hbjkcdpdcci_;
      result.ckniekbneoe_ = ckniekbneoe_;
      result.lndigkkjfml_ = lndigkkjfml_;
      result.gjkkmmfeebl_ = gjkkmmfeebl_;
      if (efpknnlchbcBuilder_ == null) {
        result.efpknnlchbc_ = efpknnlchbc_;
      } else {
        result.efpknnlchbc_ = efpknnlchbcBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.HNEPENBFNEA) {
        return mergeFrom((POGOProtos.Rpc.HNEPENBFNEA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HNEPENBFNEA other) {
      if (other == POGOProtos.Rpc.HNEPENBFNEA.getDefaultInstance()) return this;
      if (other.getGocjelmnkci() != 0) {
        setGocjelmnkci(other.getGocjelmnkci());
      }
      if (other.getHbjkcdpdcci() != 0F) {
        setHbjkcdpdcci(other.getHbjkcdpdcci());
      }
      if (other.getCkniekbneoe() != 0L) {
        setCkniekbneoe(other.getCkniekbneoe());
      }
      if (!other.getLndigkkjfml().isEmpty()) {
        lndigkkjfml_ = other.lndigkkjfml_;
        onChanged();
      }
      if (!other.getGjkkmmfeebl().isEmpty()) {
        gjkkmmfeebl_ = other.gjkkmmfeebl_;
        onChanged();
      }
      if (other.hasEfpknnlchbc()) {
        mergeEfpknnlchbc(other.getEfpknnlchbc());
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
      POGOProtos.Rpc.HNEPENBFNEA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HNEPENBFNEA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gocjelmnkci_ ;
    /**
     * <code>int32 gocjelmnkci = 1;</code>
     * @return The gocjelmnkci.
     */
    @java.lang.Override
    public int getGocjelmnkci() {
      return gocjelmnkci_;
    }
    /**
     * <code>int32 gocjelmnkci = 1;</code>
     * @param value The gocjelmnkci to set.
     * @return This builder for chaining.
     */
    public Builder setGocjelmnkci(int value) {
      
      gocjelmnkci_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gocjelmnkci = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGocjelmnkci() {
      
      gocjelmnkci_ = 0;
      onChanged();
      return this;
    }

    private float hbjkcdpdcci_ ;
    /**
     * <code>float hbjkcdpdcci = 2;</code>
     * @return The hbjkcdpdcci.
     */
    @java.lang.Override
    public float getHbjkcdpdcci() {
      return hbjkcdpdcci_;
    }
    /**
     * <code>float hbjkcdpdcci = 2;</code>
     * @param value The hbjkcdpdcci to set.
     * @return This builder for chaining.
     */
    public Builder setHbjkcdpdcci(float value) {
      
      hbjkcdpdcci_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float hbjkcdpdcci = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHbjkcdpdcci() {
      
      hbjkcdpdcci_ = 0F;
      onChanged();
      return this;
    }

    private long ckniekbneoe_ ;
    /**
     * <code>uint64 ckniekbneoe = 3;</code>
     * @return The ckniekbneoe.
     */
    @java.lang.Override
    public long getCkniekbneoe() {
      return ckniekbneoe_;
    }
    /**
     * <code>uint64 ckniekbneoe = 3;</code>
     * @param value The ckniekbneoe to set.
     * @return This builder for chaining.
     */
    public Builder setCkniekbneoe(long value) {
      
      ckniekbneoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ckniekbneoe = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCkniekbneoe() {
      
      ckniekbneoe_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object lndigkkjfml_ = "";
    /**
     * <code>string lndigkkjfml = 4;</code>
     * @return The lndigkkjfml.
     */
    public java.lang.String getLndigkkjfml() {
      java.lang.Object ref = lndigkkjfml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lndigkkjfml_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lndigkkjfml = 4;</code>
     * @return The bytes for lndigkkjfml.
     */
    public com.google.protobuf.ByteString
        getLndigkkjfmlBytes() {
      java.lang.Object ref = lndigkkjfml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lndigkkjfml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lndigkkjfml = 4;</code>
     * @param value The lndigkkjfml to set.
     * @return This builder for chaining.
     */
    public Builder setLndigkkjfml(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lndigkkjfml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lndigkkjfml = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLndigkkjfml() {
      
      lndigkkjfml_ = getDefaultInstance().getLndigkkjfml();
      onChanged();
      return this;
    }
    /**
     * <code>string lndigkkjfml = 4;</code>
     * @param value The bytes for lndigkkjfml to set.
     * @return This builder for chaining.
     */
    public Builder setLndigkkjfmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lndigkkjfml_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gjkkmmfeebl_ = "";
    /**
     * <code>string gjkkmmfeebl = 5;</code>
     * @return The gjkkmmfeebl.
     */
    public java.lang.String getGjkkmmfeebl() {
      java.lang.Object ref = gjkkmmfeebl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gjkkmmfeebl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gjkkmmfeebl = 5;</code>
     * @return The bytes for gjkkmmfeebl.
     */
    public com.google.protobuf.ByteString
        getGjkkmmfeeblBytes() {
      java.lang.Object ref = gjkkmmfeebl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gjkkmmfeebl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gjkkmmfeebl = 5;</code>
     * @param value The gjkkmmfeebl to set.
     * @return This builder for chaining.
     */
    public Builder setGjkkmmfeebl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gjkkmmfeebl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gjkkmmfeebl = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGjkkmmfeebl() {
      
      gjkkmmfeebl_ = getDefaultInstance().getGjkkmmfeebl();
      onChanged();
      return this;
    }
    /**
     * <code>string gjkkmmfeebl = 5;</code>
     * @param value The bytes for gjkkmmfeebl to set.
     * @return This builder for chaining.
     */
    public Builder setGjkkmmfeeblBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gjkkmmfeebl_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> efpknnlchbcBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     * @return Whether the efpknnlchbc field is set.
     */
    public boolean hasEfpknnlchbc() {
      return efpknnlchbcBuilder_ != null || efpknnlchbc_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     * @return The efpknnlchbc.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getEfpknnlchbc() {
      if (efpknnlchbcBuilder_ == null) {
        return efpknnlchbc_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : efpknnlchbc_;
      } else {
        return efpknnlchbcBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    public Builder setEfpknnlchbc(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (efpknnlchbcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        efpknnlchbc_ = value;
        onChanged();
      } else {
        efpknnlchbcBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    public Builder setEfpknnlchbc(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (efpknnlchbcBuilder_ == null) {
        efpknnlchbc_ = builderForValue.build();
        onChanged();
      } else {
        efpknnlchbcBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    public Builder mergeEfpknnlchbc(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (efpknnlchbcBuilder_ == null) {
        if (efpknnlchbc_ != null) {
          efpknnlchbc_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(efpknnlchbc_).mergeFrom(value).buildPartial();
        } else {
          efpknnlchbc_ = value;
        }
        onChanged();
      } else {
        efpknnlchbcBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    public Builder clearEfpknnlchbc() {
      if (efpknnlchbcBuilder_ == null) {
        efpknnlchbc_ = null;
        onChanged();
      } else {
        efpknnlchbc_ = null;
        efpknnlchbcBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getEfpknnlchbcBuilder() {
      
      onChanged();
      return getEfpknnlchbcFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getEfpknnlchbcOrBuilder() {
      if (efpknnlchbcBuilder_ != null) {
        return efpknnlchbcBuilder_.getMessageOrBuilder();
      } else {
        return efpknnlchbc_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : efpknnlchbc_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto efpknnlchbc = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getEfpknnlchbcFieldBuilder() {
      if (efpknnlchbcBuilder_ == null) {
        efpknnlchbcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getEfpknnlchbc(),
                getParentForChildren(),
                isClean());
        efpknnlchbc_ = null;
      }
      return efpknnlchbcBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HNEPENBFNEA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HNEPENBFNEA)
  private static final POGOProtos.Rpc.HNEPENBFNEA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HNEPENBFNEA();
  }

  public static POGOProtos.Rpc.HNEPENBFNEA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HNEPENBFNEA>
      PARSER = new com.google.protobuf.AbstractParser<HNEPENBFNEA>() {
    @java.lang.Override
    public HNEPENBFNEA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HNEPENBFNEA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HNEPENBFNEA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HNEPENBFNEA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HNEPENBFNEA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

