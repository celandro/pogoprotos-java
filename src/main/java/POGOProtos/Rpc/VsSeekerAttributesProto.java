// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KBCMKHAHPFN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.VsSeekerAttributesProto}
 */
public final class VsSeekerAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.VsSeekerAttributesProto)
    VsSeekerAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VsSeekerAttributesProto.newBuilder() to construct.
  private VsSeekerAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VsSeekerAttributesProto() {
    leoaenadmbf_ = 0;
    bdbhlmmbfec_ = 0;
    ffebneniecl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VsSeekerAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VsSeekerAttributesProto(
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
            int rawValue = input.readEnum();

            leoaenadmbf_ = rawValue;
            break;
          }
          case 17: {

            gcnhojkbghp_ = input.readDouble();
            break;
          }
          case 25: {

            fbeiepakjdp_ = input.readDouble();
            break;
          }
          case 32: {

            jafmahenpif_ = input.readInt32();
            break;
          }
          case 48: {

            hnajlghmafk_ = input.readInt32();
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            bdbhlmmbfec_ = rawValue;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            ffebneniecl_ = s;
            break;
          }
          case 72: {

            mmcbgidleaf_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.VsSeekerAttributesProto.class, POGOProtos.Rpc.VsSeekerAttributesProto.Builder.class);
  }

  /**
   * <pre>
   * ref: KBCMKHAHPFN/MGHLJAJLCOJ/PKFAGEBOEID
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID}
   */
  public enum PKFAGEBOEID
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>STARTED_CHARGING = 1;</code>
     */
    STARTED_CHARGING(1),
    /**
     * <code>FULLY_CHARGED = 2;</code>
     */
    FULLY_CHARGED(2),
    /**
     * <code>ACTIVATED = 3;</code>
     */
    ACTIVATED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>STARTED_CHARGING = 1;</code>
     */
    public static final int STARTED_CHARGING_VALUE = 1;
    /**
     * <code>FULLY_CHARGED = 2;</code>
     */
    public static final int FULLY_CHARGED_VALUE = 2;
    /**
     * <code>ACTIVATED = 3;</code>
     */
    public static final int ACTIVATED_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PKFAGEBOEID valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PKFAGEBOEID forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return STARTED_CHARGING;
        case 2: return FULLY_CHARGED;
        case 3: return ACTIVATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PKFAGEBOEID>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PKFAGEBOEID> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PKFAGEBOEID>() {
            public PKFAGEBOEID findValueByNumber(int number) {
              return PKFAGEBOEID.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Rpc.VsSeekerAttributesProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final PKFAGEBOEID[] VALUES = values();

    public static PKFAGEBOEID valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PKFAGEBOEID(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID)
  }

  public static final int LEOAENADMBF_FIELD_NUMBER = 1;
  private int leoaenadmbf_;
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
   * @return The enum numeric value on the wire for leoaenadmbf.
   */
  @java.lang.Override public int getLeoaenadmbfValue() {
    return leoaenadmbf_;
  }
  /**
   * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
   * @return The leoaenadmbf.
   */
  @java.lang.Override public POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID getLeoaenadmbf() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID result = POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID.valueOf(leoaenadmbf_);
    return result == null ? POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID.UNRECOGNIZED : result;
  }

  public static final int GCNHOJKBGHP_FIELD_NUMBER = 2;
  private double gcnhojkbghp_;
  /**
   * <code>double gcnhojkbghp = 2;</code>
   * @return The gcnhojkbghp.
   */
  @java.lang.Override
  public double getGcnhojkbghp() {
    return gcnhojkbghp_;
  }

  public static final int FBEIEPAKJDP_FIELD_NUMBER = 3;
  private double fbeiepakjdp_;
  /**
   * <code>double fbeiepakjdp = 3;</code>
   * @return The fbeiepakjdp.
   */
  @java.lang.Override
  public double getFbeiepakjdp() {
    return fbeiepakjdp_;
  }

  public static final int JAFMAHENPIF_FIELD_NUMBER = 4;
  private int jafmahenpif_;
  /**
   * <code>int32 jafmahenpif = 4;</code>
   * @return The jafmahenpif.
   */
  @java.lang.Override
  public int getJafmahenpif() {
    return jafmahenpif_;
  }

  public static final int HNAJLGHMAFK_FIELD_NUMBER = 6;
  private int hnajlghmafk_;
  /**
   * <code>int32 hnajlghmafk = 6;</code>
   * @return The hnajlghmafk.
   */
  @java.lang.Override
  public int getHnajlghmafk() {
    return hnajlghmafk_;
  }

  public static final int BDBHLMMBFEC_FIELD_NUMBER = 7;
  private int bdbhlmmbfec_;
  /**
   * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
   * @return The enum numeric value on the wire for bdbhlmmbfec.
   */
  @java.lang.Override public int getBdbhlmmbfecValue() {
    return bdbhlmmbfec_;
  }
  /**
   * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
   * @return The bdbhlmmbfec.
   */
  @java.lang.Override public POGOProtos.Rpc.VsSeekerRewardTrack getBdbhlmmbfec() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.VsSeekerRewardTrack result = POGOProtos.Rpc.VsSeekerRewardTrack.valueOf(bdbhlmmbfec_);
    return result == null ? POGOProtos.Rpc.VsSeekerRewardTrack.UNRECOGNIZED : result;
  }

  public static final int FFEBNENIECL_FIELD_NUMBER = 8;
  private volatile java.lang.Object ffebneniecl_;
  /**
   * <code>string ffebneniecl = 8;</code>
   * @return The ffebneniecl.
   */
  @java.lang.Override
  public java.lang.String getFfebneniecl() {
    java.lang.Object ref = ffebneniecl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ffebneniecl_ = s;
      return s;
    }
  }
  /**
   * <code>string ffebneniecl = 8;</code>
   * @return The bytes for ffebneniecl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFfebnenieclBytes() {
    java.lang.Object ref = ffebneniecl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ffebneniecl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MMCBGIDLEAF_FIELD_NUMBER = 9;
  private boolean mmcbgidleaf_;
  /**
   * <code>bool mmcbgidleaf = 9;</code>
   * @return The mmcbgidleaf.
   */
  @java.lang.Override
  public boolean getMmcbgidleaf() {
    return mmcbgidleaf_;
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
    if (leoaenadmbf_ != POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID.UNSET.getNumber()) {
      output.writeEnum(1, leoaenadmbf_);
    }
    if (gcnhojkbghp_ != 0D) {
      output.writeDouble(2, gcnhojkbghp_);
    }
    if (fbeiepakjdp_ != 0D) {
      output.writeDouble(3, fbeiepakjdp_);
    }
    if (jafmahenpif_ != 0) {
      output.writeInt32(4, jafmahenpif_);
    }
    if (hnajlghmafk_ != 0) {
      output.writeInt32(6, hnajlghmafk_);
    }
    if (bdbhlmmbfec_ != POGOProtos.Rpc.VsSeekerRewardTrack.VS_SEEKER_REWARD_TRACK_FREE.getNumber()) {
      output.writeEnum(7, bdbhlmmbfec_);
    }
    if (!getFfebnenieclBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, ffebneniecl_);
    }
    if (mmcbgidleaf_ != false) {
      output.writeBool(9, mmcbgidleaf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (leoaenadmbf_ != POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, leoaenadmbf_);
    }
    if (gcnhojkbghp_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, gcnhojkbghp_);
    }
    if (fbeiepakjdp_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, fbeiepakjdp_);
    }
    if (jafmahenpif_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, jafmahenpif_);
    }
    if (hnajlghmafk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, hnajlghmafk_);
    }
    if (bdbhlmmbfec_ != POGOProtos.Rpc.VsSeekerRewardTrack.VS_SEEKER_REWARD_TRACK_FREE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, bdbhlmmbfec_);
    }
    if (!getFfebnenieclBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, ffebneniecl_);
    }
    if (mmcbgidleaf_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, mmcbgidleaf_);
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
    if (!(obj instanceof POGOProtos.Rpc.VsSeekerAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.VsSeekerAttributesProto other = (POGOProtos.Rpc.VsSeekerAttributesProto) obj;

    if (leoaenadmbf_ != other.leoaenadmbf_) return false;
    if (java.lang.Double.doubleToLongBits(getGcnhojkbghp())
        != java.lang.Double.doubleToLongBits(
            other.getGcnhojkbghp())) return false;
    if (java.lang.Double.doubleToLongBits(getFbeiepakjdp())
        != java.lang.Double.doubleToLongBits(
            other.getFbeiepakjdp())) return false;
    if (getJafmahenpif()
        != other.getJafmahenpif()) return false;
    if (getHnajlghmafk()
        != other.getHnajlghmafk()) return false;
    if (bdbhlmmbfec_ != other.bdbhlmmbfec_) return false;
    if (!getFfebneniecl()
        .equals(other.getFfebneniecl())) return false;
    if (getMmcbgidleaf()
        != other.getMmcbgidleaf()) return false;
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
    hash = (37 * hash) + LEOAENADMBF_FIELD_NUMBER;
    hash = (53 * hash) + leoaenadmbf_;
    hash = (37 * hash) + GCNHOJKBGHP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getGcnhojkbghp()));
    hash = (37 * hash) + FBEIEPAKJDP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFbeiepakjdp()));
    hash = (37 * hash) + JAFMAHENPIF_FIELD_NUMBER;
    hash = (53 * hash) + getJafmahenpif();
    hash = (37 * hash) + HNAJLGHMAFK_FIELD_NUMBER;
    hash = (53 * hash) + getHnajlghmafk();
    hash = (37 * hash) + BDBHLMMBFEC_FIELD_NUMBER;
    hash = (53 * hash) + bdbhlmmbfec_;
    hash = (37 * hash) + FFEBNENIECL_FIELD_NUMBER;
    hash = (53 * hash) + getFfebneniecl().hashCode();
    hash = (37 * hash) + MMCBGIDLEAF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMmcbgidleaf());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.VsSeekerAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.VsSeekerAttributesProto prototype) {
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
   * ref: KBCMKHAHPFN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.VsSeekerAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.VsSeekerAttributesProto)
      POGOProtos.Rpc.VsSeekerAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.VsSeekerAttributesProto.class, POGOProtos.Rpc.VsSeekerAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.VsSeekerAttributesProto.newBuilder()
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
      leoaenadmbf_ = 0;

      gcnhojkbghp_ = 0D;

      fbeiepakjdp_ = 0D;

      jafmahenpif_ = 0;

      hnajlghmafk_ = 0;

      bdbhlmmbfec_ = 0;

      ffebneniecl_ = "";

      mmcbgidleaf_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_VsSeekerAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto build() {
      POGOProtos.Rpc.VsSeekerAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto buildPartial() {
      POGOProtos.Rpc.VsSeekerAttributesProto result = new POGOProtos.Rpc.VsSeekerAttributesProto(this);
      result.leoaenadmbf_ = leoaenadmbf_;
      result.gcnhojkbghp_ = gcnhojkbghp_;
      result.fbeiepakjdp_ = fbeiepakjdp_;
      result.jafmahenpif_ = jafmahenpif_;
      result.hnajlghmafk_ = hnajlghmafk_;
      result.bdbhlmmbfec_ = bdbhlmmbfec_;
      result.ffebneniecl_ = ffebneniecl_;
      result.mmcbgidleaf_ = mmcbgidleaf_;
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
      if (other instanceof POGOProtos.Rpc.VsSeekerAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.VsSeekerAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.VsSeekerAttributesProto other) {
      if (other == POGOProtos.Rpc.VsSeekerAttributesProto.getDefaultInstance()) return this;
      if (other.leoaenadmbf_ != 0) {
        setLeoaenadmbfValue(other.getLeoaenadmbfValue());
      }
      if (other.getGcnhojkbghp() != 0D) {
        setGcnhojkbghp(other.getGcnhojkbghp());
      }
      if (other.getFbeiepakjdp() != 0D) {
        setFbeiepakjdp(other.getFbeiepakjdp());
      }
      if (other.getJafmahenpif() != 0) {
        setJafmahenpif(other.getJafmahenpif());
      }
      if (other.getHnajlghmafk() != 0) {
        setHnajlghmafk(other.getHnajlghmafk());
      }
      if (other.bdbhlmmbfec_ != 0) {
        setBdbhlmmbfecValue(other.getBdbhlmmbfecValue());
      }
      if (!other.getFfebneniecl().isEmpty()) {
        ffebneniecl_ = other.ffebneniecl_;
        onChanged();
      }
      if (other.getMmcbgidleaf() != false) {
        setMmcbgidleaf(other.getMmcbgidleaf());
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
      POGOProtos.Rpc.VsSeekerAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.VsSeekerAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int leoaenadmbf_ = 0;
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
     * @return The enum numeric value on the wire for leoaenadmbf.
     */
    @java.lang.Override public int getLeoaenadmbfValue() {
      return leoaenadmbf_;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
     * @param value The enum numeric value on the wire for leoaenadmbf to set.
     * @return This builder for chaining.
     */
    public Builder setLeoaenadmbfValue(int value) {
      
      leoaenadmbf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
     * @return The leoaenadmbf.
     */
    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID getLeoaenadmbf() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID result = POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID.valueOf(leoaenadmbf_);
      return result == null ? POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
     * @param value The leoaenadmbf to set.
     * @return This builder for chaining.
     */
    public Builder setLeoaenadmbf(POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      leoaenadmbf_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerAttributesProto.PKFAGEBOEID leoaenadmbf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeoaenadmbf() {
      
      leoaenadmbf_ = 0;
      onChanged();
      return this;
    }

    private double gcnhojkbghp_ ;
    /**
     * <code>double gcnhojkbghp = 2;</code>
     * @return The gcnhojkbghp.
     */
    @java.lang.Override
    public double getGcnhojkbghp() {
      return gcnhojkbghp_;
    }
    /**
     * <code>double gcnhojkbghp = 2;</code>
     * @param value The gcnhojkbghp to set.
     * @return This builder for chaining.
     */
    public Builder setGcnhojkbghp(double value) {
      
      gcnhojkbghp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double gcnhojkbghp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGcnhojkbghp() {
      
      gcnhojkbghp_ = 0D;
      onChanged();
      return this;
    }

    private double fbeiepakjdp_ ;
    /**
     * <code>double fbeiepakjdp = 3;</code>
     * @return The fbeiepakjdp.
     */
    @java.lang.Override
    public double getFbeiepakjdp() {
      return fbeiepakjdp_;
    }
    /**
     * <code>double fbeiepakjdp = 3;</code>
     * @param value The fbeiepakjdp to set.
     * @return This builder for chaining.
     */
    public Builder setFbeiepakjdp(double value) {
      
      fbeiepakjdp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double fbeiepakjdp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFbeiepakjdp() {
      
      fbeiepakjdp_ = 0D;
      onChanged();
      return this;
    }

    private int jafmahenpif_ ;
    /**
     * <code>int32 jafmahenpif = 4;</code>
     * @return The jafmahenpif.
     */
    @java.lang.Override
    public int getJafmahenpif() {
      return jafmahenpif_;
    }
    /**
     * <code>int32 jafmahenpif = 4;</code>
     * @param value The jafmahenpif to set.
     * @return This builder for chaining.
     */
    public Builder setJafmahenpif(int value) {
      
      jafmahenpif_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jafmahenpif = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJafmahenpif() {
      
      jafmahenpif_ = 0;
      onChanged();
      return this;
    }

    private int hnajlghmafk_ ;
    /**
     * <code>int32 hnajlghmafk = 6;</code>
     * @return The hnajlghmafk.
     */
    @java.lang.Override
    public int getHnajlghmafk() {
      return hnajlghmafk_;
    }
    /**
     * <code>int32 hnajlghmafk = 6;</code>
     * @param value The hnajlghmafk to set.
     * @return This builder for chaining.
     */
    public Builder setHnajlghmafk(int value) {
      
      hnajlghmafk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hnajlghmafk = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearHnajlghmafk() {
      
      hnajlghmafk_ = 0;
      onChanged();
      return this;
    }

    private int bdbhlmmbfec_ = 0;
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
     * @return The enum numeric value on the wire for bdbhlmmbfec.
     */
    @java.lang.Override public int getBdbhlmmbfecValue() {
      return bdbhlmmbfec_;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
     * @param value The enum numeric value on the wire for bdbhlmmbfec to set.
     * @return This builder for chaining.
     */
    public Builder setBdbhlmmbfecValue(int value) {
      
      bdbhlmmbfec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
     * @return The bdbhlmmbfec.
     */
    @java.lang.Override
    public POGOProtos.Rpc.VsSeekerRewardTrack getBdbhlmmbfec() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.VsSeekerRewardTrack result = POGOProtos.Rpc.VsSeekerRewardTrack.valueOf(bdbhlmmbfec_);
      return result == null ? POGOProtos.Rpc.VsSeekerRewardTrack.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
     * @param value The bdbhlmmbfec to set.
     * @return This builder for chaining.
     */
    public Builder setBdbhlmmbfec(POGOProtos.Rpc.VsSeekerRewardTrack value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      bdbhlmmbfec_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.VsSeekerRewardTrack bdbhlmmbfec = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBdbhlmmbfec() {
      
      bdbhlmmbfec_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ffebneniecl_ = "";
    /**
     * <code>string ffebneniecl = 8;</code>
     * @return The ffebneniecl.
     */
    public java.lang.String getFfebneniecl() {
      java.lang.Object ref = ffebneniecl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ffebneniecl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ffebneniecl = 8;</code>
     * @return The bytes for ffebneniecl.
     */
    public com.google.protobuf.ByteString
        getFfebnenieclBytes() {
      java.lang.Object ref = ffebneniecl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ffebneniecl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ffebneniecl = 8;</code>
     * @param value The ffebneniecl to set.
     * @return This builder for chaining.
     */
    public Builder setFfebneniecl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ffebneniecl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ffebneniecl = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfebneniecl() {
      
      ffebneniecl_ = getDefaultInstance().getFfebneniecl();
      onChanged();
      return this;
    }
    /**
     * <code>string ffebneniecl = 8;</code>
     * @param value The bytes for ffebneniecl to set.
     * @return This builder for chaining.
     */
    public Builder setFfebnenieclBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ffebneniecl_ = value;
      onChanged();
      return this;
    }

    private boolean mmcbgidleaf_ ;
    /**
     * <code>bool mmcbgidleaf = 9;</code>
     * @return The mmcbgidleaf.
     */
    @java.lang.Override
    public boolean getMmcbgidleaf() {
      return mmcbgidleaf_;
    }
    /**
     * <code>bool mmcbgidleaf = 9;</code>
     * @param value The mmcbgidleaf to set.
     * @return This builder for chaining.
     */
    public Builder setMmcbgidleaf(boolean value) {
      
      mmcbgidleaf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mmcbgidleaf = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearMmcbgidleaf() {
      
      mmcbgidleaf_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.VsSeekerAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.VsSeekerAttributesProto)
  private static final POGOProtos.Rpc.VsSeekerAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.VsSeekerAttributesProto();
  }

  public static POGOProtos.Rpc.VsSeekerAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VsSeekerAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<VsSeekerAttributesProto>() {
    @java.lang.Override
    public VsSeekerAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VsSeekerAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VsSeekerAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VsSeekerAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.VsSeekerAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

