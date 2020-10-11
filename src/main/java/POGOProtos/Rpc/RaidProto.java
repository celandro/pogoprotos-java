// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IOKGECIIAMP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.RaidProto}
 */
public final class RaidProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.RaidProto)
    RaidProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RaidProto.newBuilder() to construct.
  private RaidProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RaidProto() {
    ogfianmlncn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RaidProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RaidProto(
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

            pdaldoafaaj_ = input.readInt64();
            break;
          }
          case 16: {

            camohlklade_ = input.readInt64();
            break;
          }
          case 24: {

            kjoachgdnof_ = input.readInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            ogfianmlncn_ = rawValue;
            break;
          }
          case 40: {

            jnfhhbdpipe_ = input.readBool();
            break;
          }
          case 48: {

            pnelibmipoh_ = input.readBool();
            break;
          }
          case 56: {

            cjnajlbpfhg_ = input.readBool();
            break;
          }
          case 64: {

            bcolpogiebk_ = input.readBool();
            break;
          }
          case 72: {

            pmgpdmiocfn_ = input.readBool();
            break;
          }
          case 80: {

            idonjaaknol_ = input.readInt64();
            break;
          }
          case 96: {

            hljihbpnoli_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.RaidProto.class, POGOProtos.Rpc.RaidProto.Builder.class);
  }

  public static final int PDALDOAFAAJ_FIELD_NUMBER = 1;
  private long pdaldoafaaj_;
  /**
   * <code>int64 pdaldoafaaj = 1;</code>
   * @return The pdaldoafaaj.
   */
  @java.lang.Override
  public long getPdaldoafaaj() {
    return pdaldoafaaj_;
  }

  public static final int CAMOHLKLADE_FIELD_NUMBER = 2;
  private long camohlklade_;
  /**
   * <code>int64 camohlklade = 2;</code>
   * @return The camohlklade.
   */
  @java.lang.Override
  public long getCamohlklade() {
    return camohlklade_;
  }

  public static final int KJOACHGDNOF_FIELD_NUMBER = 3;
  private long kjoachgdnof_;
  /**
   * <code>int64 kjoachgdnof = 3;</code>
   * @return The kjoachgdnof.
   */
  @java.lang.Override
  public long getKjoachgdnof() {
    return kjoachgdnof_;
  }

  public static final int OGFIANMLNCN_FIELD_NUMBER = 4;
  private int ogfianmlncn_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
   * @return The enum numeric value on the wire for ogfianmlncn.
   */
  @java.lang.Override public int getOgfianmlncnValue() {
    return ogfianmlncn_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
   * @return The ogfianmlncn.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getOgfianmlncn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(ogfianmlncn_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int JNFHHBDPIPE_FIELD_NUMBER = 5;
  private boolean jnfhhbdpipe_;
  /**
   * <code>bool jnfhhbdpipe = 5;</code>
   * @return The jnfhhbdpipe.
   */
  @java.lang.Override
  public boolean getJnfhhbdpipe() {
    return jnfhhbdpipe_;
  }

  public static final int PNELIBMIPOH_FIELD_NUMBER = 6;
  private boolean pnelibmipoh_;
  /**
   * <code>bool pnelibmipoh = 6;</code>
   * @return The pnelibmipoh.
   */
  @java.lang.Override
  public boolean getPnelibmipoh() {
    return pnelibmipoh_;
  }

  public static final int CJNAJLBPFHG_FIELD_NUMBER = 7;
  private boolean cjnajlbpfhg_;
  /**
   * <code>bool cjnajlbpfhg = 7;</code>
   * @return The cjnajlbpfhg.
   */
  @java.lang.Override
  public boolean getCjnajlbpfhg() {
    return cjnajlbpfhg_;
  }

  public static final int BCOLPOGIEBK_FIELD_NUMBER = 8;
  private boolean bcolpogiebk_;
  /**
   * <code>bool bcolpogiebk = 8;</code>
   * @return The bcolpogiebk.
   */
  @java.lang.Override
  public boolean getBcolpogiebk() {
    return bcolpogiebk_;
  }

  public static final int PMGPDMIOCFN_FIELD_NUMBER = 9;
  private boolean pmgpdmiocfn_;
  /**
   * <code>bool pmgpdmiocfn = 9;</code>
   * @return The pmgpdmiocfn.
   */
  @java.lang.Override
  public boolean getPmgpdmiocfn() {
    return pmgpdmiocfn_;
  }

  public static final int IDONJAAKNOL_FIELD_NUMBER = 10;
  private long idonjaaknol_;
  /**
   * <code>int64 idonjaaknol = 10;</code>
   * @return The idonjaaknol.
   */
  @java.lang.Override
  public long getIdonjaaknol() {
    return idonjaaknol_;
  }

  public static final int HLJIHBPNOLI_FIELD_NUMBER = 12;
  private boolean hljihbpnoli_;
  /**
   * <code>bool hljihbpnoli = 12;</code>
   * @return The hljihbpnoli.
   */
  @java.lang.Override
  public boolean getHljihbpnoli() {
    return hljihbpnoli_;
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
    if (pdaldoafaaj_ != 0L) {
      output.writeInt64(1, pdaldoafaaj_);
    }
    if (camohlklade_ != 0L) {
      output.writeInt64(2, camohlklade_);
    }
    if (kjoachgdnof_ != 0L) {
      output.writeInt64(3, kjoachgdnof_);
    }
    if (ogfianmlncn_ != POGOProtos.Rpc.HoloPokemonId.POKEMON_UNSET.getNumber()) {
      output.writeEnum(4, ogfianmlncn_);
    }
    if (jnfhhbdpipe_ != false) {
      output.writeBool(5, jnfhhbdpipe_);
    }
    if (pnelibmipoh_ != false) {
      output.writeBool(6, pnelibmipoh_);
    }
    if (cjnajlbpfhg_ != false) {
      output.writeBool(7, cjnajlbpfhg_);
    }
    if (bcolpogiebk_ != false) {
      output.writeBool(8, bcolpogiebk_);
    }
    if (pmgpdmiocfn_ != false) {
      output.writeBool(9, pmgpdmiocfn_);
    }
    if (idonjaaknol_ != 0L) {
      output.writeInt64(10, idonjaaknol_);
    }
    if (hljihbpnoli_ != false) {
      output.writeBool(12, hljihbpnoli_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pdaldoafaaj_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pdaldoafaaj_);
    }
    if (camohlklade_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, camohlklade_);
    }
    if (kjoachgdnof_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, kjoachgdnof_);
    }
    if (ogfianmlncn_ != POGOProtos.Rpc.HoloPokemonId.POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, ogfianmlncn_);
    }
    if (jnfhhbdpipe_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, jnfhhbdpipe_);
    }
    if (pnelibmipoh_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, pnelibmipoh_);
    }
    if (cjnajlbpfhg_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, cjnajlbpfhg_);
    }
    if (bcolpogiebk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, bcolpogiebk_);
    }
    if (pmgpdmiocfn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, pmgpdmiocfn_);
    }
    if (idonjaaknol_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(10, idonjaaknol_);
    }
    if (hljihbpnoli_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, hljihbpnoli_);
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
    if (!(obj instanceof POGOProtos.Rpc.RaidProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.RaidProto other = (POGOProtos.Rpc.RaidProto) obj;

    if (getPdaldoafaaj()
        != other.getPdaldoafaaj()) return false;
    if (getCamohlklade()
        != other.getCamohlklade()) return false;
    if (getKjoachgdnof()
        != other.getKjoachgdnof()) return false;
    if (ogfianmlncn_ != other.ogfianmlncn_) return false;
    if (getJnfhhbdpipe()
        != other.getJnfhhbdpipe()) return false;
    if (getPnelibmipoh()
        != other.getPnelibmipoh()) return false;
    if (getCjnajlbpfhg()
        != other.getCjnajlbpfhg()) return false;
    if (getBcolpogiebk()
        != other.getBcolpogiebk()) return false;
    if (getPmgpdmiocfn()
        != other.getPmgpdmiocfn()) return false;
    if (getIdonjaaknol()
        != other.getIdonjaaknol()) return false;
    if (getHljihbpnoli()
        != other.getHljihbpnoli()) return false;
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
    hash = (37 * hash) + PDALDOAFAAJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPdaldoafaaj());
    hash = (37 * hash) + CAMOHLKLADE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCamohlklade());
    hash = (37 * hash) + KJOACHGDNOF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKjoachgdnof());
    hash = (37 * hash) + OGFIANMLNCN_FIELD_NUMBER;
    hash = (53 * hash) + ogfianmlncn_;
    hash = (37 * hash) + JNFHHBDPIPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getJnfhhbdpipe());
    hash = (37 * hash) + PNELIBMIPOH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPnelibmipoh());
    hash = (37 * hash) + CJNAJLBPFHG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCjnajlbpfhg());
    hash = (37 * hash) + BCOLPOGIEBK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBcolpogiebk());
    hash = (37 * hash) + PMGPDMIOCFN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPmgpdmiocfn());
    hash = (37 * hash) + IDONJAAKNOL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIdonjaaknol());
    hash = (37 * hash) + HLJIHBPNOLI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHljihbpnoli());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.RaidProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RaidProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.RaidProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.RaidProto prototype) {
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
   * ref: IOKGECIIAMP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.RaidProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.RaidProto)
      POGOProtos.Rpc.RaidProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.RaidProto.class, POGOProtos.Rpc.RaidProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.RaidProto.newBuilder()
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
      pdaldoafaaj_ = 0L;

      camohlklade_ = 0L;

      kjoachgdnof_ = 0L;

      ogfianmlncn_ = 0;

      jnfhhbdpipe_ = false;

      pnelibmipoh_ = false;

      cjnajlbpfhg_ = false;

      bcolpogiebk_ = false;

      pmgpdmiocfn_ = false;

      idonjaaknol_ = 0L;

      hljihbpnoli_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_RaidProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RaidProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.RaidProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.RaidProto build() {
      POGOProtos.Rpc.RaidProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.RaidProto buildPartial() {
      POGOProtos.Rpc.RaidProto result = new POGOProtos.Rpc.RaidProto(this);
      result.pdaldoafaaj_ = pdaldoafaaj_;
      result.camohlklade_ = camohlklade_;
      result.kjoachgdnof_ = kjoachgdnof_;
      result.ogfianmlncn_ = ogfianmlncn_;
      result.jnfhhbdpipe_ = jnfhhbdpipe_;
      result.pnelibmipoh_ = pnelibmipoh_;
      result.cjnajlbpfhg_ = cjnajlbpfhg_;
      result.bcolpogiebk_ = bcolpogiebk_;
      result.pmgpdmiocfn_ = pmgpdmiocfn_;
      result.idonjaaknol_ = idonjaaknol_;
      result.hljihbpnoli_ = hljihbpnoli_;
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
      if (other instanceof POGOProtos.Rpc.RaidProto) {
        return mergeFrom((POGOProtos.Rpc.RaidProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.RaidProto other) {
      if (other == POGOProtos.Rpc.RaidProto.getDefaultInstance()) return this;
      if (other.getPdaldoafaaj() != 0L) {
        setPdaldoafaaj(other.getPdaldoafaaj());
      }
      if (other.getCamohlklade() != 0L) {
        setCamohlklade(other.getCamohlklade());
      }
      if (other.getKjoachgdnof() != 0L) {
        setKjoachgdnof(other.getKjoachgdnof());
      }
      if (other.ogfianmlncn_ != 0) {
        setOgfianmlncnValue(other.getOgfianmlncnValue());
      }
      if (other.getJnfhhbdpipe() != false) {
        setJnfhhbdpipe(other.getJnfhhbdpipe());
      }
      if (other.getPnelibmipoh() != false) {
        setPnelibmipoh(other.getPnelibmipoh());
      }
      if (other.getCjnajlbpfhg() != false) {
        setCjnajlbpfhg(other.getCjnajlbpfhg());
      }
      if (other.getBcolpogiebk() != false) {
        setBcolpogiebk(other.getBcolpogiebk());
      }
      if (other.getPmgpdmiocfn() != false) {
        setPmgpdmiocfn(other.getPmgpdmiocfn());
      }
      if (other.getIdonjaaknol() != 0L) {
        setIdonjaaknol(other.getIdonjaaknol());
      }
      if (other.getHljihbpnoli() != false) {
        setHljihbpnoli(other.getHljihbpnoli());
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
      POGOProtos.Rpc.RaidProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.RaidProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pdaldoafaaj_ ;
    /**
     * <code>int64 pdaldoafaaj = 1;</code>
     * @return The pdaldoafaaj.
     */
    @java.lang.Override
    public long getPdaldoafaaj() {
      return pdaldoafaaj_;
    }
    /**
     * <code>int64 pdaldoafaaj = 1;</code>
     * @param value The pdaldoafaaj to set.
     * @return This builder for chaining.
     */
    public Builder setPdaldoafaaj(long value) {
      
      pdaldoafaaj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pdaldoafaaj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPdaldoafaaj() {
      
      pdaldoafaaj_ = 0L;
      onChanged();
      return this;
    }

    private long camohlklade_ ;
    /**
     * <code>int64 camohlklade = 2;</code>
     * @return The camohlklade.
     */
    @java.lang.Override
    public long getCamohlklade() {
      return camohlklade_;
    }
    /**
     * <code>int64 camohlklade = 2;</code>
     * @param value The camohlklade to set.
     * @return This builder for chaining.
     */
    public Builder setCamohlklade(long value) {
      
      camohlklade_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 camohlklade = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCamohlklade() {
      
      camohlklade_ = 0L;
      onChanged();
      return this;
    }

    private long kjoachgdnof_ ;
    /**
     * <code>int64 kjoachgdnof = 3;</code>
     * @return The kjoachgdnof.
     */
    @java.lang.Override
    public long getKjoachgdnof() {
      return kjoachgdnof_;
    }
    /**
     * <code>int64 kjoachgdnof = 3;</code>
     * @param value The kjoachgdnof to set.
     * @return This builder for chaining.
     */
    public Builder setKjoachgdnof(long value) {
      
      kjoachgdnof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kjoachgdnof = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKjoachgdnof() {
      
      kjoachgdnof_ = 0L;
      onChanged();
      return this;
    }

    private int ogfianmlncn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
     * @return The enum numeric value on the wire for ogfianmlncn.
     */
    @java.lang.Override public int getOgfianmlncnValue() {
      return ogfianmlncn_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
     * @param value The enum numeric value on the wire for ogfianmlncn to set.
     * @return This builder for chaining.
     */
    public Builder setOgfianmlncnValue(int value) {
      
      ogfianmlncn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
     * @return The ogfianmlncn.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getOgfianmlncn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(ogfianmlncn_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
     * @param value The ogfianmlncn to set.
     * @return This builder for chaining.
     */
    public Builder setOgfianmlncn(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ogfianmlncn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId ogfianmlncn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearOgfianmlncn() {
      
      ogfianmlncn_ = 0;
      onChanged();
      return this;
    }

    private boolean jnfhhbdpipe_ ;
    /**
     * <code>bool jnfhhbdpipe = 5;</code>
     * @return The jnfhhbdpipe.
     */
    @java.lang.Override
    public boolean getJnfhhbdpipe() {
      return jnfhhbdpipe_;
    }
    /**
     * <code>bool jnfhhbdpipe = 5;</code>
     * @param value The jnfhhbdpipe to set.
     * @return This builder for chaining.
     */
    public Builder setJnfhhbdpipe(boolean value) {
      
      jnfhhbdpipe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool jnfhhbdpipe = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJnfhhbdpipe() {
      
      jnfhhbdpipe_ = false;
      onChanged();
      return this;
    }

    private boolean pnelibmipoh_ ;
    /**
     * <code>bool pnelibmipoh = 6;</code>
     * @return The pnelibmipoh.
     */
    @java.lang.Override
    public boolean getPnelibmipoh() {
      return pnelibmipoh_;
    }
    /**
     * <code>bool pnelibmipoh = 6;</code>
     * @param value The pnelibmipoh to set.
     * @return This builder for chaining.
     */
    public Builder setPnelibmipoh(boolean value) {
      
      pnelibmipoh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pnelibmipoh = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPnelibmipoh() {
      
      pnelibmipoh_ = false;
      onChanged();
      return this;
    }

    private boolean cjnajlbpfhg_ ;
    /**
     * <code>bool cjnajlbpfhg = 7;</code>
     * @return The cjnajlbpfhg.
     */
    @java.lang.Override
    public boolean getCjnajlbpfhg() {
      return cjnajlbpfhg_;
    }
    /**
     * <code>bool cjnajlbpfhg = 7;</code>
     * @param value The cjnajlbpfhg to set.
     * @return This builder for chaining.
     */
    public Builder setCjnajlbpfhg(boolean value) {
      
      cjnajlbpfhg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cjnajlbpfhg = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearCjnajlbpfhg() {
      
      cjnajlbpfhg_ = false;
      onChanged();
      return this;
    }

    private boolean bcolpogiebk_ ;
    /**
     * <code>bool bcolpogiebk = 8;</code>
     * @return The bcolpogiebk.
     */
    @java.lang.Override
    public boolean getBcolpogiebk() {
      return bcolpogiebk_;
    }
    /**
     * <code>bool bcolpogiebk = 8;</code>
     * @param value The bcolpogiebk to set.
     * @return This builder for chaining.
     */
    public Builder setBcolpogiebk(boolean value) {
      
      bcolpogiebk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool bcolpogiebk = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearBcolpogiebk() {
      
      bcolpogiebk_ = false;
      onChanged();
      return this;
    }

    private boolean pmgpdmiocfn_ ;
    /**
     * <code>bool pmgpdmiocfn = 9;</code>
     * @return The pmgpdmiocfn.
     */
    @java.lang.Override
    public boolean getPmgpdmiocfn() {
      return pmgpdmiocfn_;
    }
    /**
     * <code>bool pmgpdmiocfn = 9;</code>
     * @param value The pmgpdmiocfn to set.
     * @return This builder for chaining.
     */
    public Builder setPmgpdmiocfn(boolean value) {
      
      pmgpdmiocfn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pmgpdmiocfn = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearPmgpdmiocfn() {
      
      pmgpdmiocfn_ = false;
      onChanged();
      return this;
    }

    private long idonjaaknol_ ;
    /**
     * <code>int64 idonjaaknol = 10;</code>
     * @return The idonjaaknol.
     */
    @java.lang.Override
    public long getIdonjaaknol() {
      return idonjaaknol_;
    }
    /**
     * <code>int64 idonjaaknol = 10;</code>
     * @param value The idonjaaknol to set.
     * @return This builder for chaining.
     */
    public Builder setIdonjaaknol(long value) {
      
      idonjaaknol_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 idonjaaknol = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdonjaaknol() {
      
      idonjaaknol_ = 0L;
      onChanged();
      return this;
    }

    private boolean hljihbpnoli_ ;
    /**
     * <code>bool hljihbpnoli = 12;</code>
     * @return The hljihbpnoli.
     */
    @java.lang.Override
    public boolean getHljihbpnoli() {
      return hljihbpnoli_;
    }
    /**
     * <code>bool hljihbpnoli = 12;</code>
     * @param value The hljihbpnoli to set.
     * @return This builder for chaining.
     */
    public Builder setHljihbpnoli(boolean value) {
      
      hljihbpnoli_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hljihbpnoli = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearHljihbpnoli() {
      
      hljihbpnoli_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.RaidProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.RaidProto)
  private static final POGOProtos.Rpc.RaidProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.RaidProto();
  }

  public static POGOProtos.Rpc.RaidProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RaidProto>
      PARSER = new com.google.protobuf.AbstractParser<RaidProto>() {
    @java.lang.Override
    public RaidProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RaidProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RaidProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RaidProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.RaidProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

