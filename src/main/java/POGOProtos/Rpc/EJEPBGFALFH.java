// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EJEPBGFALFH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EJEPBGFALFH}
 */
public final class EJEPBGFALFH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EJEPBGFALFH)
    EJEPBGFALFHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EJEPBGFALFH.newBuilder() to construct.
  private EJEPBGFALFH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EJEPBGFALFH() {
    gkfhcnginkn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EJEPBGFALFH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EJEPBGFALFH(
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

            ckniekbneoe_ = input.readUInt64();
            break;
          }
          case 16: {

            jhnakgfohgd_ = input.readInt64();
            break;
          }
          case 25: {

            phiabghihcc_ = input.readDouble();
            break;
          }
          case 33: {

            icmnhajccaa_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            gkfhcnginkn_ = s;
            break;
          }
          case 58: {
            POGOProtos.Rpc.PokemonProto.Builder subBuilder = null;
            if (baeglbmdifp_ != null) {
              subBuilder = baeglbmdifp_.toBuilder();
            }
            baeglbmdifp_ = input.readMessage(POGOProtos.Rpc.PokemonProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baeglbmdifp_);
              baeglbmdifp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 88: {

            liakfbjpdhe_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EJEPBGFALFH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EJEPBGFALFH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EJEPBGFALFH.class, POGOProtos.Rpc.EJEPBGFALFH.Builder.class);
  }

  public static final int CKNIEKBNEOE_FIELD_NUMBER = 1;
  private long ckniekbneoe_;
  /**
   * <code>uint64 ckniekbneoe = 1;</code>
   * @return The ckniekbneoe.
   */
  @java.lang.Override
  public long getCkniekbneoe() {
    return ckniekbneoe_;
  }

  public static final int JHNAKGFOHGD_FIELD_NUMBER = 2;
  private long jhnakgfohgd_;
  /**
   * <code>int64 jhnakgfohgd = 2;</code>
   * @return The jhnakgfohgd.
   */
  @java.lang.Override
  public long getJhnakgfohgd() {
    return jhnakgfohgd_;
  }

  public static final int PHIABGHIHCC_FIELD_NUMBER = 3;
  private double phiabghihcc_;
  /**
   * <code>double phiabghihcc = 3;</code>
   * @return The phiabghihcc.
   */
  @java.lang.Override
  public double getPhiabghihcc() {
    return phiabghihcc_;
  }

  public static final int ICMNHAJCCAA_FIELD_NUMBER = 4;
  private double icmnhajccaa_;
  /**
   * <code>double icmnhajccaa = 4;</code>
   * @return The icmnhajccaa.
   */
  @java.lang.Override
  public double getIcmnhajccaa() {
    return icmnhajccaa_;
  }

  public static final int GKFHCNGINKN_FIELD_NUMBER = 5;
  private volatile java.lang.Object gkfhcnginkn_;
  /**
   * <code>string gkfhcnginkn = 5;</code>
   * @return The gkfhcnginkn.
   */
  @java.lang.Override
  public java.lang.String getGkfhcnginkn() {
    java.lang.Object ref = gkfhcnginkn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gkfhcnginkn_ = s;
      return s;
    }
  }
  /**
   * <code>string gkfhcnginkn = 5;</code>
   * @return The bytes for gkfhcnginkn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGkfhcnginknBytes() {
    java.lang.Object ref = gkfhcnginkn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gkfhcnginkn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BAEGLBMDIFP_FIELD_NUMBER = 7;
  private POGOProtos.Rpc.PokemonProto baeglbmdifp_;
  /**
   * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
   * @return Whether the baeglbmdifp field is set.
   */
  @java.lang.Override
  public boolean hasBaeglbmdifp() {
    return baeglbmdifp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
   * @return The baeglbmdifp.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonProto getBaeglbmdifp() {
    return baeglbmdifp_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : baeglbmdifp_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonProtoOrBuilder getBaeglbmdifpOrBuilder() {
    return getBaeglbmdifp();
  }

  public static final int LIAKFBJPDHE_FIELD_NUMBER = 11;
  private int liakfbjpdhe_;
  /**
   * <code>int32 liakfbjpdhe = 11;</code>
   * @return The liakfbjpdhe.
   */
  @java.lang.Override
  public int getLiakfbjpdhe() {
    return liakfbjpdhe_;
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
    if (ckniekbneoe_ != 0L) {
      output.writeUInt64(1, ckniekbneoe_);
    }
    if (jhnakgfohgd_ != 0L) {
      output.writeInt64(2, jhnakgfohgd_);
    }
    if (phiabghihcc_ != 0D) {
      output.writeDouble(3, phiabghihcc_);
    }
    if (icmnhajccaa_ != 0D) {
      output.writeDouble(4, icmnhajccaa_);
    }
    if (!getGkfhcnginknBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, gkfhcnginkn_);
    }
    if (baeglbmdifp_ != null) {
      output.writeMessage(7, getBaeglbmdifp());
    }
    if (liakfbjpdhe_ != 0) {
      output.writeInt32(11, liakfbjpdhe_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ckniekbneoe_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ckniekbneoe_);
    }
    if (jhnakgfohgd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, jhnakgfohgd_);
    }
    if (phiabghihcc_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, phiabghihcc_);
    }
    if (icmnhajccaa_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, icmnhajccaa_);
    }
    if (!getGkfhcnginknBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, gkfhcnginkn_);
    }
    if (baeglbmdifp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getBaeglbmdifp());
    }
    if (liakfbjpdhe_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, liakfbjpdhe_);
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
    if (!(obj instanceof POGOProtos.Rpc.EJEPBGFALFH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EJEPBGFALFH other = (POGOProtos.Rpc.EJEPBGFALFH) obj;

    if (getCkniekbneoe()
        != other.getCkniekbneoe()) return false;
    if (getJhnakgfohgd()
        != other.getJhnakgfohgd()) return false;
    if (java.lang.Double.doubleToLongBits(getPhiabghihcc())
        != java.lang.Double.doubleToLongBits(
            other.getPhiabghihcc())) return false;
    if (java.lang.Double.doubleToLongBits(getIcmnhajccaa())
        != java.lang.Double.doubleToLongBits(
            other.getIcmnhajccaa())) return false;
    if (!getGkfhcnginkn()
        .equals(other.getGkfhcnginkn())) return false;
    if (hasBaeglbmdifp() != other.hasBaeglbmdifp()) return false;
    if (hasBaeglbmdifp()) {
      if (!getBaeglbmdifp()
          .equals(other.getBaeglbmdifp())) return false;
    }
    if (getLiakfbjpdhe()
        != other.getLiakfbjpdhe()) return false;
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
    hash = (37 * hash) + CKNIEKBNEOE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCkniekbneoe());
    hash = (37 * hash) + JHNAKGFOHGD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getJhnakgfohgd());
    hash = (37 * hash) + PHIABGHIHCC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPhiabghihcc()));
    hash = (37 * hash) + ICMNHAJCCAA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getIcmnhajccaa()));
    hash = (37 * hash) + GKFHCNGINKN_FIELD_NUMBER;
    hash = (53 * hash) + getGkfhcnginkn().hashCode();
    if (hasBaeglbmdifp()) {
      hash = (37 * hash) + BAEGLBMDIFP_FIELD_NUMBER;
      hash = (53 * hash) + getBaeglbmdifp().hashCode();
    }
    hash = (37 * hash) + LIAKFBJPDHE_FIELD_NUMBER;
    hash = (53 * hash) + getLiakfbjpdhe();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EJEPBGFALFH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EJEPBGFALFH prototype) {
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
   * ref: EJEPBGFALFH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EJEPBGFALFH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EJEPBGFALFH)
      POGOProtos.Rpc.EJEPBGFALFHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EJEPBGFALFH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EJEPBGFALFH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EJEPBGFALFH.class, POGOProtos.Rpc.EJEPBGFALFH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EJEPBGFALFH.newBuilder()
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
      ckniekbneoe_ = 0L;

      jhnakgfohgd_ = 0L;

      phiabghihcc_ = 0D;

      icmnhajccaa_ = 0D;

      gkfhcnginkn_ = "";

      if (baeglbmdifpBuilder_ == null) {
        baeglbmdifp_ = null;
      } else {
        baeglbmdifp_ = null;
        baeglbmdifpBuilder_ = null;
      }
      liakfbjpdhe_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EJEPBGFALFH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EJEPBGFALFH getDefaultInstanceForType() {
      return POGOProtos.Rpc.EJEPBGFALFH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EJEPBGFALFH build() {
      POGOProtos.Rpc.EJEPBGFALFH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EJEPBGFALFH buildPartial() {
      POGOProtos.Rpc.EJEPBGFALFH result = new POGOProtos.Rpc.EJEPBGFALFH(this);
      result.ckniekbneoe_ = ckniekbneoe_;
      result.jhnakgfohgd_ = jhnakgfohgd_;
      result.phiabghihcc_ = phiabghihcc_;
      result.icmnhajccaa_ = icmnhajccaa_;
      result.gkfhcnginkn_ = gkfhcnginkn_;
      if (baeglbmdifpBuilder_ == null) {
        result.baeglbmdifp_ = baeglbmdifp_;
      } else {
        result.baeglbmdifp_ = baeglbmdifpBuilder_.build();
      }
      result.liakfbjpdhe_ = liakfbjpdhe_;
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
      if (other instanceof POGOProtos.Rpc.EJEPBGFALFH) {
        return mergeFrom((POGOProtos.Rpc.EJEPBGFALFH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EJEPBGFALFH other) {
      if (other == POGOProtos.Rpc.EJEPBGFALFH.getDefaultInstance()) return this;
      if (other.getCkniekbneoe() != 0L) {
        setCkniekbneoe(other.getCkniekbneoe());
      }
      if (other.getJhnakgfohgd() != 0L) {
        setJhnakgfohgd(other.getJhnakgfohgd());
      }
      if (other.getPhiabghihcc() != 0D) {
        setPhiabghihcc(other.getPhiabghihcc());
      }
      if (other.getIcmnhajccaa() != 0D) {
        setIcmnhajccaa(other.getIcmnhajccaa());
      }
      if (!other.getGkfhcnginkn().isEmpty()) {
        gkfhcnginkn_ = other.gkfhcnginkn_;
        onChanged();
      }
      if (other.hasBaeglbmdifp()) {
        mergeBaeglbmdifp(other.getBaeglbmdifp());
      }
      if (other.getLiakfbjpdhe() != 0) {
        setLiakfbjpdhe(other.getLiakfbjpdhe());
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
      POGOProtos.Rpc.EJEPBGFALFH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EJEPBGFALFH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long ckniekbneoe_ ;
    /**
     * <code>uint64 ckniekbneoe = 1;</code>
     * @return The ckniekbneoe.
     */
    @java.lang.Override
    public long getCkniekbneoe() {
      return ckniekbneoe_;
    }
    /**
     * <code>uint64 ckniekbneoe = 1;</code>
     * @param value The ckniekbneoe to set.
     * @return This builder for chaining.
     */
    public Builder setCkniekbneoe(long value) {
      
      ckniekbneoe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 ckniekbneoe = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCkniekbneoe() {
      
      ckniekbneoe_ = 0L;
      onChanged();
      return this;
    }

    private long jhnakgfohgd_ ;
    /**
     * <code>int64 jhnakgfohgd = 2;</code>
     * @return The jhnakgfohgd.
     */
    @java.lang.Override
    public long getJhnakgfohgd() {
      return jhnakgfohgd_;
    }
    /**
     * <code>int64 jhnakgfohgd = 2;</code>
     * @param value The jhnakgfohgd to set.
     * @return This builder for chaining.
     */
    public Builder setJhnakgfohgd(long value) {
      
      jhnakgfohgd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 jhnakgfohgd = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJhnakgfohgd() {
      
      jhnakgfohgd_ = 0L;
      onChanged();
      return this;
    }

    private double phiabghihcc_ ;
    /**
     * <code>double phiabghihcc = 3;</code>
     * @return The phiabghihcc.
     */
    @java.lang.Override
    public double getPhiabghihcc() {
      return phiabghihcc_;
    }
    /**
     * <code>double phiabghihcc = 3;</code>
     * @param value The phiabghihcc to set.
     * @return This builder for chaining.
     */
    public Builder setPhiabghihcc(double value) {
      
      phiabghihcc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double phiabghihcc = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhiabghihcc() {
      
      phiabghihcc_ = 0D;
      onChanged();
      return this;
    }

    private double icmnhajccaa_ ;
    /**
     * <code>double icmnhajccaa = 4;</code>
     * @return The icmnhajccaa.
     */
    @java.lang.Override
    public double getIcmnhajccaa() {
      return icmnhajccaa_;
    }
    /**
     * <code>double icmnhajccaa = 4;</code>
     * @param value The icmnhajccaa to set.
     * @return This builder for chaining.
     */
    public Builder setIcmnhajccaa(double value) {
      
      icmnhajccaa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double icmnhajccaa = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcmnhajccaa() {
      
      icmnhajccaa_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object gkfhcnginkn_ = "";
    /**
     * <code>string gkfhcnginkn = 5;</code>
     * @return The gkfhcnginkn.
     */
    public java.lang.String getGkfhcnginkn() {
      java.lang.Object ref = gkfhcnginkn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gkfhcnginkn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gkfhcnginkn = 5;</code>
     * @return The bytes for gkfhcnginkn.
     */
    public com.google.protobuf.ByteString
        getGkfhcnginknBytes() {
      java.lang.Object ref = gkfhcnginkn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gkfhcnginkn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gkfhcnginkn = 5;</code>
     * @param value The gkfhcnginkn to set.
     * @return This builder for chaining.
     */
    public Builder setGkfhcnginkn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gkfhcnginkn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gkfhcnginkn = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGkfhcnginkn() {
      
      gkfhcnginkn_ = getDefaultInstance().getGkfhcnginkn();
      onChanged();
      return this;
    }
    /**
     * <code>string gkfhcnginkn = 5;</code>
     * @param value The bytes for gkfhcnginkn to set.
     * @return This builder for chaining.
     */
    public Builder setGkfhcnginknBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gkfhcnginkn_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonProto baeglbmdifp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder> baeglbmdifpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     * @return Whether the baeglbmdifp field is set.
     */
    public boolean hasBaeglbmdifp() {
      return baeglbmdifpBuilder_ != null || baeglbmdifp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     * @return The baeglbmdifp.
     */
    public POGOProtos.Rpc.PokemonProto getBaeglbmdifp() {
      if (baeglbmdifpBuilder_ == null) {
        return baeglbmdifp_ == null ? POGOProtos.Rpc.PokemonProto.getDefaultInstance() : baeglbmdifp_;
      } else {
        return baeglbmdifpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    public Builder setBaeglbmdifp(POGOProtos.Rpc.PokemonProto value) {
      if (baeglbmdifpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baeglbmdifp_ = value;
        onChanged();
      } else {
        baeglbmdifpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    public Builder setBaeglbmdifp(
        POGOProtos.Rpc.PokemonProto.Builder builderForValue) {
      if (baeglbmdifpBuilder_ == null) {
        baeglbmdifp_ = builderForValue.build();
        onChanged();
      } else {
        baeglbmdifpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    public Builder mergeBaeglbmdifp(POGOProtos.Rpc.PokemonProto value) {
      if (baeglbmdifpBuilder_ == null) {
        if (baeglbmdifp_ != null) {
          baeglbmdifp_ =
            POGOProtos.Rpc.PokemonProto.newBuilder(baeglbmdifp_).mergeFrom(value).buildPartial();
        } else {
          baeglbmdifp_ = value;
        }
        onChanged();
      } else {
        baeglbmdifpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    public Builder clearBaeglbmdifp() {
      if (baeglbmdifpBuilder_ == null) {
        baeglbmdifp_ = null;
        onChanged();
      } else {
        baeglbmdifp_ = null;
        baeglbmdifpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    public POGOProtos.Rpc.PokemonProto.Builder getBaeglbmdifpBuilder() {
      
      onChanged();
      return getBaeglbmdifpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    public POGOProtos.Rpc.PokemonProtoOrBuilder getBaeglbmdifpOrBuilder() {
      if (baeglbmdifpBuilder_ != null) {
        return baeglbmdifpBuilder_.getMessageOrBuilder();
      } else {
        return baeglbmdifp_ == null ?
            POGOProtos.Rpc.PokemonProto.getDefaultInstance() : baeglbmdifp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonProto baeglbmdifp = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder> 
        getBaeglbmdifpFieldBuilder() {
      if (baeglbmdifpBuilder_ == null) {
        baeglbmdifpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonProto, POGOProtos.Rpc.PokemonProto.Builder, POGOProtos.Rpc.PokemonProtoOrBuilder>(
                getBaeglbmdifp(),
                getParentForChildren(),
                isClean());
        baeglbmdifp_ = null;
      }
      return baeglbmdifpBuilder_;
    }

    private int liakfbjpdhe_ ;
    /**
     * <code>int32 liakfbjpdhe = 11;</code>
     * @return The liakfbjpdhe.
     */
    @java.lang.Override
    public int getLiakfbjpdhe() {
      return liakfbjpdhe_;
    }
    /**
     * <code>int32 liakfbjpdhe = 11;</code>
     * @param value The liakfbjpdhe to set.
     * @return This builder for chaining.
     */
    public Builder setLiakfbjpdhe(int value) {
      
      liakfbjpdhe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 liakfbjpdhe = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearLiakfbjpdhe() {
      
      liakfbjpdhe_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EJEPBGFALFH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EJEPBGFALFH)
  private static final POGOProtos.Rpc.EJEPBGFALFH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EJEPBGFALFH();
  }

  public static POGOProtos.Rpc.EJEPBGFALFH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EJEPBGFALFH>
      PARSER = new com.google.protobuf.AbstractParser<EJEPBGFALFH>() {
    @java.lang.Override
    public EJEPBGFALFH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EJEPBGFALFH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EJEPBGFALFH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EJEPBGFALFH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EJEPBGFALFH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
