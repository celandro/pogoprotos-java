// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: MOFNDEGLFNI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.MOFNDEGLFNI}
 */
public final class MOFNDEGLFNI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MOFNDEGLFNI)
    MOFNDEGLFNIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MOFNDEGLFNI.newBuilder() to construct.
  private MOFNDEGLFNI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MOFNDEGLFNI() {
    gmfmholhdcg_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MOFNDEGLFNI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MOFNDEGLFNI(
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

            pmbpnlogogp_ = input.readInt32();
            break;
          }
          case 16: {

            ckikbiaoekn_ = input.readInt32();
            break;
          }
          case 24: {

            mncohkoobgg_ = input.readInt32();
            break;
          }
          case 32: {

            ibifpgchdnb_ = input.readInt32();
            break;
          }
          case 41: {

            nokiepcepjj_ = input.readDouble();
            break;
          }
          case 49: {

            chdlifcfhnf_ = input.readDouble();
            break;
          }
          case 57: {

            gbaeccojknk_ = input.readDouble();
            break;
          }
          case 69: {

            lebpeihlioa_ = input.readFloat();
            break;
          }
          case 72: {
            int rawValue = input.readEnum();

            gmfmholhdcg_ = rawValue;
            break;
          }
          case 80: {

            bfmbhagnmlk_ = input.readInt32();
            break;
          }
          case 88: {

            dacpijoliaa_ = input.readInt32();
            break;
          }
          case 96: {

            kginnakkjem_ = input.readInt32();
            break;
          }
          case 104: {

            logngdbhagp_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MOFNDEGLFNI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MOFNDEGLFNI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MOFNDEGLFNI.class, POGOProtos.Rpc.MOFNDEGLFNI.Builder.class);
  }

  public static final int PMBPNLOGOGP_FIELD_NUMBER = 1;
  private int pmbpnlogogp_;
  /**
   * <code>int32 pmbpnlogogp = 1;</code>
   * @return The pmbpnlogogp.
   */
  @java.lang.Override
  public int getPmbpnlogogp() {
    return pmbpnlogogp_;
  }

  public static final int CKIKBIAOEKN_FIELD_NUMBER = 2;
  private int ckikbiaoekn_;
  /**
   * <code>int32 ckikbiaoekn = 2;</code>
   * @return The ckikbiaoekn.
   */
  @java.lang.Override
  public int getCkikbiaoekn() {
    return ckikbiaoekn_;
  }

  public static final int MNCOHKOOBGG_FIELD_NUMBER = 3;
  private int mncohkoobgg_;
  /**
   * <code>int32 mncohkoobgg = 3;</code>
   * @return The mncohkoobgg.
   */
  @java.lang.Override
  public int getMncohkoobgg() {
    return mncohkoobgg_;
  }

  public static final int IBIFPGCHDNB_FIELD_NUMBER = 4;
  private int ibifpgchdnb_;
  /**
   * <code>int32 ibifpgchdnb = 4;</code>
   * @return The ibifpgchdnb.
   */
  @java.lang.Override
  public int getIbifpgchdnb() {
    return ibifpgchdnb_;
  }

  public static final int NOKIEPCEPJJ_FIELD_NUMBER = 5;
  private double nokiepcepjj_;
  /**
   * <code>double nokiepcepjj = 5;</code>
   * @return The nokiepcepjj.
   */
  @java.lang.Override
  public double getNokiepcepjj() {
    return nokiepcepjj_;
  }

  public static final int CHDLIFCFHNF_FIELD_NUMBER = 6;
  private double chdlifcfhnf_;
  /**
   * <code>double chdlifcfhnf = 6;</code>
   * @return The chdlifcfhnf.
   */
  @java.lang.Override
  public double getChdlifcfhnf() {
    return chdlifcfhnf_;
  }

  public static final int GBAECCOJKNK_FIELD_NUMBER = 7;
  private double gbaeccojknk_;
  /**
   * <code>double gbaeccojknk = 7;</code>
   * @return The gbaeccojknk.
   */
  @java.lang.Override
  public double getGbaeccojknk() {
    return gbaeccojknk_;
  }

  public static final int LEBPEIHLIOA_FIELD_NUMBER = 8;
  private float lebpeihlioa_;
  /**
   * <code>float lebpeihlioa = 8;</code>
   * @return The lebpeihlioa.
   */
  @java.lang.Override
  public float getLebpeihlioa() {
    return lebpeihlioa_;
  }

  public static final int GMFMHOLHDCG_FIELD_NUMBER = 9;
  private int gmfmholhdcg_;
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
   * @return The enum numeric value on the wire for gmfmholhdcg.
   */
  @java.lang.Override public int getGmfmholhdcgValue() {
    return gmfmholhdcg_;
  }
  /**
   * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
   * @return The gmfmholhdcg.
   */
  @java.lang.Override public POGOProtos.Rpc.FriendshipLevelMilestone getGmfmholhdcg() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FriendshipLevelMilestone result = POGOProtos.Rpc.FriendshipLevelMilestone.valueOf(gmfmholhdcg_);
    return result == null ? POGOProtos.Rpc.FriendshipLevelMilestone.UNRECOGNIZED : result;
  }

  public static final int BFMBHAGNMLK_FIELD_NUMBER = 10;
  private int bfmbhagnmlk_;
  /**
   * <code>int32 bfmbhagnmlk = 10;</code>
   * @return The bfmbhagnmlk.
   */
  @java.lang.Override
  public int getBfmbhagnmlk() {
    return bfmbhagnmlk_;
  }

  public static final int DACPIJOLIAA_FIELD_NUMBER = 11;
  private int dacpijoliaa_;
  /**
   * <code>int32 dacpijoliaa = 11;</code>
   * @return The dacpijoliaa.
   */
  @java.lang.Override
  public int getDacpijoliaa() {
    return dacpijoliaa_;
  }

  public static final int KGINNAKKJEM_FIELD_NUMBER = 12;
  private int kginnakkjem_;
  /**
   * <code>int32 kginnakkjem = 12;</code>
   * @return The kginnakkjem.
   */
  @java.lang.Override
  public int getKginnakkjem() {
    return kginnakkjem_;
  }

  public static final int LOGNGDBHAGP_FIELD_NUMBER = 13;
  private boolean logngdbhagp_;
  /**
   * <code>bool logngdbhagp = 13;</code>
   * @return The logngdbhagp.
   */
  @java.lang.Override
  public boolean getLogngdbhagp() {
    return logngdbhagp_;
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
    if (pmbpnlogogp_ != 0) {
      output.writeInt32(1, pmbpnlogogp_);
    }
    if (ckikbiaoekn_ != 0) {
      output.writeInt32(2, ckikbiaoekn_);
    }
    if (mncohkoobgg_ != 0) {
      output.writeInt32(3, mncohkoobgg_);
    }
    if (ibifpgchdnb_ != 0) {
      output.writeInt32(4, ibifpgchdnb_);
    }
    if (nokiepcepjj_ != 0D) {
      output.writeDouble(5, nokiepcepjj_);
    }
    if (chdlifcfhnf_ != 0D) {
      output.writeDouble(6, chdlifcfhnf_);
    }
    if (gbaeccojknk_ != 0D) {
      output.writeDouble(7, gbaeccojknk_);
    }
    if (lebpeihlioa_ != 0F) {
      output.writeFloat(8, lebpeihlioa_);
    }
    if (gmfmholhdcg_ != POGOProtos.Rpc.FriendshipLevelMilestone.FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET.getNumber()) {
      output.writeEnum(9, gmfmholhdcg_);
    }
    if (bfmbhagnmlk_ != 0) {
      output.writeInt32(10, bfmbhagnmlk_);
    }
    if (dacpijoliaa_ != 0) {
      output.writeInt32(11, dacpijoliaa_);
    }
    if (kginnakkjem_ != 0) {
      output.writeInt32(12, kginnakkjem_);
    }
    if (logngdbhagp_ != false) {
      output.writeBool(13, logngdbhagp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pmbpnlogogp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pmbpnlogogp_);
    }
    if (ckikbiaoekn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ckikbiaoekn_);
    }
    if (mncohkoobgg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, mncohkoobgg_);
    }
    if (ibifpgchdnb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, ibifpgchdnb_);
    }
    if (nokiepcepjj_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, nokiepcepjj_);
    }
    if (chdlifcfhnf_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, chdlifcfhnf_);
    }
    if (gbaeccojknk_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, gbaeccojknk_);
    }
    if (lebpeihlioa_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(8, lebpeihlioa_);
    }
    if (gmfmholhdcg_ != POGOProtos.Rpc.FriendshipLevelMilestone.FRIENDSHIP_LEVEL_MILESTONE_FRIENDSHIP_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(9, gmfmholhdcg_);
    }
    if (bfmbhagnmlk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, bfmbhagnmlk_);
    }
    if (dacpijoliaa_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, dacpijoliaa_);
    }
    if (kginnakkjem_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(12, kginnakkjem_);
    }
    if (logngdbhagp_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(13, logngdbhagp_);
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
    if (!(obj instanceof POGOProtos.Rpc.MOFNDEGLFNI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MOFNDEGLFNI other = (POGOProtos.Rpc.MOFNDEGLFNI) obj;

    if (getPmbpnlogogp()
        != other.getPmbpnlogogp()) return false;
    if (getCkikbiaoekn()
        != other.getCkikbiaoekn()) return false;
    if (getMncohkoobgg()
        != other.getMncohkoobgg()) return false;
    if (getIbifpgchdnb()
        != other.getIbifpgchdnb()) return false;
    if (java.lang.Double.doubleToLongBits(getNokiepcepjj())
        != java.lang.Double.doubleToLongBits(
            other.getNokiepcepjj())) return false;
    if (java.lang.Double.doubleToLongBits(getChdlifcfhnf())
        != java.lang.Double.doubleToLongBits(
            other.getChdlifcfhnf())) return false;
    if (java.lang.Double.doubleToLongBits(getGbaeccojknk())
        != java.lang.Double.doubleToLongBits(
            other.getGbaeccojknk())) return false;
    if (java.lang.Float.floatToIntBits(getLebpeihlioa())
        != java.lang.Float.floatToIntBits(
            other.getLebpeihlioa())) return false;
    if (gmfmholhdcg_ != other.gmfmholhdcg_) return false;
    if (getBfmbhagnmlk()
        != other.getBfmbhagnmlk()) return false;
    if (getDacpijoliaa()
        != other.getDacpijoliaa()) return false;
    if (getKginnakkjem()
        != other.getKginnakkjem()) return false;
    if (getLogngdbhagp()
        != other.getLogngdbhagp()) return false;
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
    hash = (37 * hash) + PMBPNLOGOGP_FIELD_NUMBER;
    hash = (53 * hash) + getPmbpnlogogp();
    hash = (37 * hash) + CKIKBIAOEKN_FIELD_NUMBER;
    hash = (53 * hash) + getCkikbiaoekn();
    hash = (37 * hash) + MNCOHKOOBGG_FIELD_NUMBER;
    hash = (53 * hash) + getMncohkoobgg();
    hash = (37 * hash) + IBIFPGCHDNB_FIELD_NUMBER;
    hash = (53 * hash) + getIbifpgchdnb();
    hash = (37 * hash) + NOKIEPCEPJJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNokiepcepjj()));
    hash = (37 * hash) + CHDLIFCFHNF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getChdlifcfhnf()));
    hash = (37 * hash) + GBAECCOJKNK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGbaeccojknk()));
    hash = (37 * hash) + LEBPEIHLIOA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getLebpeihlioa());
    hash = (37 * hash) + GMFMHOLHDCG_FIELD_NUMBER;
    hash = (53 * hash) + gmfmholhdcg_;
    hash = (37 * hash) + BFMBHAGNMLK_FIELD_NUMBER;
    hash = (53 * hash) + getBfmbhagnmlk();
    hash = (37 * hash) + DACPIJOLIAA_FIELD_NUMBER;
    hash = (53 * hash) + getDacpijoliaa();
    hash = (37 * hash) + KGINNAKKJEM_FIELD_NUMBER;
    hash = (53 * hash) + getKginnakkjem();
    hash = (37 * hash) + LOGNGDBHAGP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLogngdbhagp());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MOFNDEGLFNI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MOFNDEGLFNI prototype) {
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
   * ref: MOFNDEGLFNI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.MOFNDEGLFNI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MOFNDEGLFNI)
      POGOProtos.Rpc.MOFNDEGLFNIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MOFNDEGLFNI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MOFNDEGLFNI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MOFNDEGLFNI.class, POGOProtos.Rpc.MOFNDEGLFNI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MOFNDEGLFNI.newBuilder()
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
      pmbpnlogogp_ = 0;

      ckikbiaoekn_ = 0;

      mncohkoobgg_ = 0;

      ibifpgchdnb_ = 0;

      nokiepcepjj_ = 0D;

      chdlifcfhnf_ = 0D;

      gbaeccojknk_ = 0D;

      lebpeihlioa_ = 0F;

      gmfmholhdcg_ = 0;

      bfmbhagnmlk_ = 0;

      dacpijoliaa_ = 0;

      kginnakkjem_ = 0;

      logngdbhagp_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_MOFNDEGLFNI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MOFNDEGLFNI getDefaultInstanceForType() {
      return POGOProtos.Rpc.MOFNDEGLFNI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MOFNDEGLFNI build() {
      POGOProtos.Rpc.MOFNDEGLFNI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MOFNDEGLFNI buildPartial() {
      POGOProtos.Rpc.MOFNDEGLFNI result = new POGOProtos.Rpc.MOFNDEGLFNI(this);
      result.pmbpnlogogp_ = pmbpnlogogp_;
      result.ckikbiaoekn_ = ckikbiaoekn_;
      result.mncohkoobgg_ = mncohkoobgg_;
      result.ibifpgchdnb_ = ibifpgchdnb_;
      result.nokiepcepjj_ = nokiepcepjj_;
      result.chdlifcfhnf_ = chdlifcfhnf_;
      result.gbaeccojknk_ = gbaeccojknk_;
      result.lebpeihlioa_ = lebpeihlioa_;
      result.gmfmholhdcg_ = gmfmholhdcg_;
      result.bfmbhagnmlk_ = bfmbhagnmlk_;
      result.dacpijoliaa_ = dacpijoliaa_;
      result.kginnakkjem_ = kginnakkjem_;
      result.logngdbhagp_ = logngdbhagp_;
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
      if (other instanceof POGOProtos.Rpc.MOFNDEGLFNI) {
        return mergeFrom((POGOProtos.Rpc.MOFNDEGLFNI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MOFNDEGLFNI other) {
      if (other == POGOProtos.Rpc.MOFNDEGLFNI.getDefaultInstance()) return this;
      if (other.getPmbpnlogogp() != 0) {
        setPmbpnlogogp(other.getPmbpnlogogp());
      }
      if (other.getCkikbiaoekn() != 0) {
        setCkikbiaoekn(other.getCkikbiaoekn());
      }
      if (other.getMncohkoobgg() != 0) {
        setMncohkoobgg(other.getMncohkoobgg());
      }
      if (other.getIbifpgchdnb() != 0) {
        setIbifpgchdnb(other.getIbifpgchdnb());
      }
      if (other.getNokiepcepjj() != 0D) {
        setNokiepcepjj(other.getNokiepcepjj());
      }
      if (other.getChdlifcfhnf() != 0D) {
        setChdlifcfhnf(other.getChdlifcfhnf());
      }
      if (other.getGbaeccojknk() != 0D) {
        setGbaeccojknk(other.getGbaeccojknk());
      }
      if (other.getLebpeihlioa() != 0F) {
        setLebpeihlioa(other.getLebpeihlioa());
      }
      if (other.gmfmholhdcg_ != 0) {
        setGmfmholhdcgValue(other.getGmfmholhdcgValue());
      }
      if (other.getBfmbhagnmlk() != 0) {
        setBfmbhagnmlk(other.getBfmbhagnmlk());
      }
      if (other.getDacpijoliaa() != 0) {
        setDacpijoliaa(other.getDacpijoliaa());
      }
      if (other.getKginnakkjem() != 0) {
        setKginnakkjem(other.getKginnakkjem());
      }
      if (other.getLogngdbhagp() != false) {
        setLogngdbhagp(other.getLogngdbhagp());
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
      POGOProtos.Rpc.MOFNDEGLFNI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MOFNDEGLFNI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pmbpnlogogp_ ;
    /**
     * <code>int32 pmbpnlogogp = 1;</code>
     * @return The pmbpnlogogp.
     */
    @java.lang.Override
    public int getPmbpnlogogp() {
      return pmbpnlogogp_;
    }
    /**
     * <code>int32 pmbpnlogogp = 1;</code>
     * @param value The pmbpnlogogp to set.
     * @return This builder for chaining.
     */
    public Builder setPmbpnlogogp(int value) {
      
      pmbpnlogogp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pmbpnlogogp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPmbpnlogogp() {
      
      pmbpnlogogp_ = 0;
      onChanged();
      return this;
    }

    private int ckikbiaoekn_ ;
    /**
     * <code>int32 ckikbiaoekn = 2;</code>
     * @return The ckikbiaoekn.
     */
    @java.lang.Override
    public int getCkikbiaoekn() {
      return ckikbiaoekn_;
    }
    /**
     * <code>int32 ckikbiaoekn = 2;</code>
     * @param value The ckikbiaoekn to set.
     * @return This builder for chaining.
     */
    public Builder setCkikbiaoekn(int value) {
      
      ckikbiaoekn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ckikbiaoekn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCkikbiaoekn() {
      
      ckikbiaoekn_ = 0;
      onChanged();
      return this;
    }

    private int mncohkoobgg_ ;
    /**
     * <code>int32 mncohkoobgg = 3;</code>
     * @return The mncohkoobgg.
     */
    @java.lang.Override
    public int getMncohkoobgg() {
      return mncohkoobgg_;
    }
    /**
     * <code>int32 mncohkoobgg = 3;</code>
     * @param value The mncohkoobgg to set.
     * @return This builder for chaining.
     */
    public Builder setMncohkoobgg(int value) {
      
      mncohkoobgg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mncohkoobgg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMncohkoobgg() {
      
      mncohkoobgg_ = 0;
      onChanged();
      return this;
    }

    private int ibifpgchdnb_ ;
    /**
     * <code>int32 ibifpgchdnb = 4;</code>
     * @return The ibifpgchdnb.
     */
    @java.lang.Override
    public int getIbifpgchdnb() {
      return ibifpgchdnb_;
    }
    /**
     * <code>int32 ibifpgchdnb = 4;</code>
     * @param value The ibifpgchdnb to set.
     * @return This builder for chaining.
     */
    public Builder setIbifpgchdnb(int value) {
      
      ibifpgchdnb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ibifpgchdnb = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIbifpgchdnb() {
      
      ibifpgchdnb_ = 0;
      onChanged();
      return this;
    }

    private double nokiepcepjj_ ;
    /**
     * <code>double nokiepcepjj = 5;</code>
     * @return The nokiepcepjj.
     */
    @java.lang.Override
    public double getNokiepcepjj() {
      return nokiepcepjj_;
    }
    /**
     * <code>double nokiepcepjj = 5;</code>
     * @param value The nokiepcepjj to set.
     * @return This builder for chaining.
     */
    public Builder setNokiepcepjj(double value) {
      
      nokiepcepjj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double nokiepcepjj = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNokiepcepjj() {
      
      nokiepcepjj_ = 0D;
      onChanged();
      return this;
    }

    private double chdlifcfhnf_ ;
    /**
     * <code>double chdlifcfhnf = 6;</code>
     * @return The chdlifcfhnf.
     */
    @java.lang.Override
    public double getChdlifcfhnf() {
      return chdlifcfhnf_;
    }
    /**
     * <code>double chdlifcfhnf = 6;</code>
     * @param value The chdlifcfhnf to set.
     * @return This builder for chaining.
     */
    public Builder setChdlifcfhnf(double value) {
      
      chdlifcfhnf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double chdlifcfhnf = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearChdlifcfhnf() {
      
      chdlifcfhnf_ = 0D;
      onChanged();
      return this;
    }

    private double gbaeccojknk_ ;
    /**
     * <code>double gbaeccojknk = 7;</code>
     * @return The gbaeccojknk.
     */
    @java.lang.Override
    public double getGbaeccojknk() {
      return gbaeccojknk_;
    }
    /**
     * <code>double gbaeccojknk = 7;</code>
     * @param value The gbaeccojknk to set.
     * @return This builder for chaining.
     */
    public Builder setGbaeccojknk(double value) {
      
      gbaeccojknk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gbaeccojknk = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGbaeccojknk() {
      
      gbaeccojknk_ = 0D;
      onChanged();
      return this;
    }

    private float lebpeihlioa_ ;
    /**
     * <code>float lebpeihlioa = 8;</code>
     * @return The lebpeihlioa.
     */
    @java.lang.Override
    public float getLebpeihlioa() {
      return lebpeihlioa_;
    }
    /**
     * <code>float lebpeihlioa = 8;</code>
     * @param value The lebpeihlioa to set.
     * @return This builder for chaining.
     */
    public Builder setLebpeihlioa(float value) {
      
      lebpeihlioa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float lebpeihlioa = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearLebpeihlioa() {
      
      lebpeihlioa_ = 0F;
      onChanged();
      return this;
    }

    private int gmfmholhdcg_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
     * @return The enum numeric value on the wire for gmfmholhdcg.
     */
    @java.lang.Override public int getGmfmholhdcgValue() {
      return gmfmholhdcg_;
    }
    /**
     * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
     * @param value The enum numeric value on the wire for gmfmholhdcg to set.
     * @return This builder for chaining.
     */
    public Builder setGmfmholhdcgValue(int value) {
      
      gmfmholhdcg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
     * @return The gmfmholhdcg.
     */
    @java.lang.Override
    public POGOProtos.Rpc.FriendshipLevelMilestone getGmfmholhdcg() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FriendshipLevelMilestone result = POGOProtos.Rpc.FriendshipLevelMilestone.valueOf(gmfmholhdcg_);
      return result == null ? POGOProtos.Rpc.FriendshipLevelMilestone.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
     * @param value The gmfmholhdcg to set.
     * @return This builder for chaining.
     */
    public Builder setGmfmholhdcg(POGOProtos.Rpc.FriendshipLevelMilestone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gmfmholhdcg_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FriendshipLevelMilestone gmfmholhdcg = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearGmfmholhdcg() {
      
      gmfmholhdcg_ = 0;
      onChanged();
      return this;
    }

    private int bfmbhagnmlk_ ;
    /**
     * <code>int32 bfmbhagnmlk = 10;</code>
     * @return The bfmbhagnmlk.
     */
    @java.lang.Override
    public int getBfmbhagnmlk() {
      return bfmbhagnmlk_;
    }
    /**
     * <code>int32 bfmbhagnmlk = 10;</code>
     * @param value The bfmbhagnmlk to set.
     * @return This builder for chaining.
     */
    public Builder setBfmbhagnmlk(int value) {
      
      bfmbhagnmlk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bfmbhagnmlk = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearBfmbhagnmlk() {
      
      bfmbhagnmlk_ = 0;
      onChanged();
      return this;
    }

    private int dacpijoliaa_ ;
    /**
     * <code>int32 dacpijoliaa = 11;</code>
     * @return The dacpijoliaa.
     */
    @java.lang.Override
    public int getDacpijoliaa() {
      return dacpijoliaa_;
    }
    /**
     * <code>int32 dacpijoliaa = 11;</code>
     * @param value The dacpijoliaa to set.
     * @return This builder for chaining.
     */
    public Builder setDacpijoliaa(int value) {
      
      dacpijoliaa_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 dacpijoliaa = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearDacpijoliaa() {
      
      dacpijoliaa_ = 0;
      onChanged();
      return this;
    }

    private int kginnakkjem_ ;
    /**
     * <code>int32 kginnakkjem = 12;</code>
     * @return The kginnakkjem.
     */
    @java.lang.Override
    public int getKginnakkjem() {
      return kginnakkjem_;
    }
    /**
     * <code>int32 kginnakkjem = 12;</code>
     * @param value The kginnakkjem to set.
     * @return This builder for chaining.
     */
    public Builder setKginnakkjem(int value) {
      
      kginnakkjem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kginnakkjem = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearKginnakkjem() {
      
      kginnakkjem_ = 0;
      onChanged();
      return this;
    }

    private boolean logngdbhagp_ ;
    /**
     * <code>bool logngdbhagp = 13;</code>
     * @return The logngdbhagp.
     */
    @java.lang.Override
    public boolean getLogngdbhagp() {
      return logngdbhagp_;
    }
    /**
     * <code>bool logngdbhagp = 13;</code>
     * @param value The logngdbhagp to set.
     * @return This builder for chaining.
     */
    public Builder setLogngdbhagp(boolean value) {
      
      logngdbhagp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool logngdbhagp = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogngdbhagp() {
      
      logngdbhagp_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MOFNDEGLFNI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MOFNDEGLFNI)
  private static final POGOProtos.Rpc.MOFNDEGLFNI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MOFNDEGLFNI();
  }

  public static POGOProtos.Rpc.MOFNDEGLFNI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MOFNDEGLFNI>
      PARSER = new com.google.protobuf.AbstractParser<MOFNDEGLFNI>() {
    @java.lang.Override
    public MOFNDEGLFNI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MOFNDEGLFNI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MOFNDEGLFNI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MOFNDEGLFNI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MOFNDEGLFNI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

