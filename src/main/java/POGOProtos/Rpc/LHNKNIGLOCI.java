// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LHNKNIGLOCI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LHNKNIGLOCI}
 */
public final class LHNKNIGLOCI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LHNKNIGLOCI)
    LHNKNIGLOCIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LHNKNIGLOCI.newBuilder() to construct.
  private LHNKNIGLOCI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LHNKNIGLOCI() {
    bmcfcoflnde_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LHNKNIGLOCI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LHNKNIGLOCI(
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
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (dofkbmpelpo_ != null) {
              subBuilder = dofkbmpelpo_.toBuilder();
            }
            dofkbmpelpo_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dofkbmpelpo_);
              dofkbmpelpo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            iljdfpdkmno_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            bmcfcoflnde_ = s;
            break;
          }
          case 34: {
            POGOProtos.Rpc.PokemonDisplayProto.Builder subBuilder = null;
            if (poifncejdne_ != null) {
              subBuilder = poifncejdne_.toBuilder();
            }
            poifncejdne_ = input.readMessage(POGOProtos.Rpc.PokemonDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(poifncejdne_);
              poifncejdne_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            ajhinlegbod_ = input.readInt32();
            break;
          }
          case 48: {

            nckpcdcmpac_ = input.readInt64();
            break;
          }
          case 56: {

            kdiofnapfbg_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LHNKNIGLOCI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LHNKNIGLOCI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LHNKNIGLOCI.class, POGOProtos.Rpc.LHNKNIGLOCI.Builder.class);
  }

  public static final int DOFKBMPELPO_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
   * @return Whether the dofkbmpelpo field is set.
   */
  @java.lang.Override
  public boolean hasDofkbmpelpo() {
    return dofkbmpelpo_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
   * @return The dofkbmpelpo.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto getDofkbmpelpo() {
    return dofkbmpelpo_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : dofkbmpelpo_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getDofkbmpelpoOrBuilder() {
    return getDofkbmpelpo();
  }

  public static final int ILJDFPDKMNO_FIELD_NUMBER = 2;
  private int iljdfpdkmno_;
  /**
   * <code>int32 iljdfpdkmno = 2;</code>
   * @return The iljdfpdkmno.
   */
  @java.lang.Override
  public int getIljdfpdkmno() {
    return iljdfpdkmno_;
  }

  public static final int BMCFCOFLNDE_FIELD_NUMBER = 3;
  private volatile java.lang.Object bmcfcoflnde_;
  /**
   * <code>string bmcfcoflnde = 3;</code>
   * @return The bmcfcoflnde.
   */
  @java.lang.Override
  public java.lang.String getBmcfcoflnde() {
    java.lang.Object ref = bmcfcoflnde_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bmcfcoflnde_ = s;
      return s;
    }
  }
  /**
   * <code>string bmcfcoflnde = 3;</code>
   * @return The bytes for bmcfcoflnde.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBmcfcoflndeBytes() {
    java.lang.Object ref = bmcfcoflnde_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bmcfcoflnde_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POIFNCEJDNE_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.PokemonDisplayProto poifncejdne_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
   * @return Whether the poifncejdne field is set.
   */
  @java.lang.Override
  public boolean hasPoifncejdne() {
    return poifncejdne_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
   * @return The poifncejdne.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProto getPoifncejdne() {
    return poifncejdne_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : poifncejdne_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPoifncejdneOrBuilder() {
    return getPoifncejdne();
  }

  public static final int AJHINLEGBOD_FIELD_NUMBER = 5;
  private int ajhinlegbod_;
  /**
   * <code>int32 ajhinlegbod = 5;</code>
   * @return The ajhinlegbod.
   */
  @java.lang.Override
  public int getAjhinlegbod() {
    return ajhinlegbod_;
  }

  public static final int NCKPCDCMPAC_FIELD_NUMBER = 6;
  private long nckpcdcmpac_;
  /**
   * <code>int64 nckpcdcmpac = 6;</code>
   * @return The nckpcdcmpac.
   */
  @java.lang.Override
  public long getNckpcdcmpac() {
    return nckpcdcmpac_;
  }

  public static final int KDIOFNAPFBG_FIELD_NUMBER = 7;
  private int kdiofnapfbg_;
  /**
   * <code>int32 kdiofnapfbg = 7;</code>
   * @return The kdiofnapfbg.
   */
  @java.lang.Override
  public int getKdiofnapfbg() {
    return kdiofnapfbg_;
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
    if (dofkbmpelpo_ != null) {
      output.writeMessage(1, getDofkbmpelpo());
    }
    if (iljdfpdkmno_ != 0) {
      output.writeInt32(2, iljdfpdkmno_);
    }
    if (!getBmcfcoflndeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bmcfcoflnde_);
    }
    if (poifncejdne_ != null) {
      output.writeMessage(4, getPoifncejdne());
    }
    if (ajhinlegbod_ != 0) {
      output.writeInt32(5, ajhinlegbod_);
    }
    if (nckpcdcmpac_ != 0L) {
      output.writeInt64(6, nckpcdcmpac_);
    }
    if (kdiofnapfbg_ != 0) {
      output.writeInt32(7, kdiofnapfbg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dofkbmpelpo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDofkbmpelpo());
    }
    if (iljdfpdkmno_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, iljdfpdkmno_);
    }
    if (!getBmcfcoflndeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bmcfcoflnde_);
    }
    if (poifncejdne_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPoifncejdne());
    }
    if (ajhinlegbod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, ajhinlegbod_);
    }
    if (nckpcdcmpac_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, nckpcdcmpac_);
    }
    if (kdiofnapfbg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, kdiofnapfbg_);
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
    if (!(obj instanceof POGOProtos.Rpc.LHNKNIGLOCI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LHNKNIGLOCI other = (POGOProtos.Rpc.LHNKNIGLOCI) obj;

    if (hasDofkbmpelpo() != other.hasDofkbmpelpo()) return false;
    if (hasDofkbmpelpo()) {
      if (!getDofkbmpelpo()
          .equals(other.getDofkbmpelpo())) return false;
    }
    if (getIljdfpdkmno()
        != other.getIljdfpdkmno()) return false;
    if (!getBmcfcoflnde()
        .equals(other.getBmcfcoflnde())) return false;
    if (hasPoifncejdne() != other.hasPoifncejdne()) return false;
    if (hasPoifncejdne()) {
      if (!getPoifncejdne()
          .equals(other.getPoifncejdne())) return false;
    }
    if (getAjhinlegbod()
        != other.getAjhinlegbod()) return false;
    if (getNckpcdcmpac()
        != other.getNckpcdcmpac()) return false;
    if (getKdiofnapfbg()
        != other.getKdiofnapfbg()) return false;
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
    if (hasDofkbmpelpo()) {
      hash = (37 * hash) + DOFKBMPELPO_FIELD_NUMBER;
      hash = (53 * hash) + getDofkbmpelpo().hashCode();
    }
    hash = (37 * hash) + ILJDFPDKMNO_FIELD_NUMBER;
    hash = (53 * hash) + getIljdfpdkmno();
    hash = (37 * hash) + BMCFCOFLNDE_FIELD_NUMBER;
    hash = (53 * hash) + getBmcfcoflnde().hashCode();
    if (hasPoifncejdne()) {
      hash = (37 * hash) + POIFNCEJDNE_FIELD_NUMBER;
      hash = (53 * hash) + getPoifncejdne().hashCode();
    }
    hash = (37 * hash) + AJHINLEGBOD_FIELD_NUMBER;
    hash = (53 * hash) + getAjhinlegbod();
    hash = (37 * hash) + NCKPCDCMPAC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNckpcdcmpac());
    hash = (37 * hash) + KDIOFNAPFBG_FIELD_NUMBER;
    hash = (53 * hash) + getKdiofnapfbg();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LHNKNIGLOCI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LHNKNIGLOCI prototype) {
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
   * ref: LHNKNIGLOCI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LHNKNIGLOCI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LHNKNIGLOCI)
      POGOProtos.Rpc.LHNKNIGLOCIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LHNKNIGLOCI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LHNKNIGLOCI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LHNKNIGLOCI.class, POGOProtos.Rpc.LHNKNIGLOCI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LHNKNIGLOCI.newBuilder()
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
      if (dofkbmpelpoBuilder_ == null) {
        dofkbmpelpo_ = null;
      } else {
        dofkbmpelpo_ = null;
        dofkbmpelpoBuilder_ = null;
      }
      iljdfpdkmno_ = 0;

      bmcfcoflnde_ = "";

      if (poifncejdneBuilder_ == null) {
        poifncejdne_ = null;
      } else {
        poifncejdne_ = null;
        poifncejdneBuilder_ = null;
      }
      ajhinlegbod_ = 0;

      nckpcdcmpac_ = 0L;

      kdiofnapfbg_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LHNKNIGLOCI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LHNKNIGLOCI getDefaultInstanceForType() {
      return POGOProtos.Rpc.LHNKNIGLOCI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LHNKNIGLOCI build() {
      POGOProtos.Rpc.LHNKNIGLOCI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LHNKNIGLOCI buildPartial() {
      POGOProtos.Rpc.LHNKNIGLOCI result = new POGOProtos.Rpc.LHNKNIGLOCI(this);
      if (dofkbmpelpoBuilder_ == null) {
        result.dofkbmpelpo_ = dofkbmpelpo_;
      } else {
        result.dofkbmpelpo_ = dofkbmpelpoBuilder_.build();
      }
      result.iljdfpdkmno_ = iljdfpdkmno_;
      result.bmcfcoflnde_ = bmcfcoflnde_;
      if (poifncejdneBuilder_ == null) {
        result.poifncejdne_ = poifncejdne_;
      } else {
        result.poifncejdne_ = poifncejdneBuilder_.build();
      }
      result.ajhinlegbod_ = ajhinlegbod_;
      result.nckpcdcmpac_ = nckpcdcmpac_;
      result.kdiofnapfbg_ = kdiofnapfbg_;
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
      if (other instanceof POGOProtos.Rpc.LHNKNIGLOCI) {
        return mergeFrom((POGOProtos.Rpc.LHNKNIGLOCI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LHNKNIGLOCI other) {
      if (other == POGOProtos.Rpc.LHNKNIGLOCI.getDefaultInstance()) return this;
      if (other.hasDofkbmpelpo()) {
        mergeDofkbmpelpo(other.getDofkbmpelpo());
      }
      if (other.getIljdfpdkmno() != 0) {
        setIljdfpdkmno(other.getIljdfpdkmno());
      }
      if (!other.getBmcfcoflnde().isEmpty()) {
        bmcfcoflnde_ = other.bmcfcoflnde_;
        onChanged();
      }
      if (other.hasPoifncejdne()) {
        mergePoifncejdne(other.getPoifncejdne());
      }
      if (other.getAjhinlegbod() != 0) {
        setAjhinlegbod(other.getAjhinlegbod());
      }
      if (other.getNckpcdcmpac() != 0L) {
        setNckpcdcmpac(other.getNckpcdcmpac());
      }
      if (other.getKdiofnapfbg() != 0) {
        setKdiofnapfbg(other.getKdiofnapfbg());
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
      POGOProtos.Rpc.LHNKNIGLOCI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LHNKNIGLOCI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> dofkbmpelpoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     * @return Whether the dofkbmpelpo field is set.
     */
    public boolean hasDofkbmpelpo() {
      return dofkbmpelpoBuilder_ != null || dofkbmpelpo_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     * @return The dofkbmpelpo.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getDofkbmpelpo() {
      if (dofkbmpelpoBuilder_ == null) {
        return dofkbmpelpo_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : dofkbmpelpo_;
      } else {
        return dofkbmpelpoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    public Builder setDofkbmpelpo(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (dofkbmpelpoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dofkbmpelpo_ = value;
        onChanged();
      } else {
        dofkbmpelpoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    public Builder setDofkbmpelpo(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (dofkbmpelpoBuilder_ == null) {
        dofkbmpelpo_ = builderForValue.build();
        onChanged();
      } else {
        dofkbmpelpoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    public Builder mergeDofkbmpelpo(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (dofkbmpelpoBuilder_ == null) {
        if (dofkbmpelpo_ != null) {
          dofkbmpelpo_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(dofkbmpelpo_).mergeFrom(value).buildPartial();
        } else {
          dofkbmpelpo_ = value;
        }
        onChanged();
      } else {
        dofkbmpelpoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    public Builder clearDofkbmpelpo() {
      if (dofkbmpelpoBuilder_ == null) {
        dofkbmpelpo_ = null;
        onChanged();
      } else {
        dofkbmpelpo_ = null;
        dofkbmpelpoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getDofkbmpelpoBuilder() {
      
      onChanged();
      return getDofkbmpelpoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getDofkbmpelpoOrBuilder() {
      if (dofkbmpelpoBuilder_ != null) {
        return dofkbmpelpoBuilder_.getMessageOrBuilder();
      } else {
        return dofkbmpelpo_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : dofkbmpelpo_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto dofkbmpelpo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getDofkbmpelpoFieldBuilder() {
      if (dofkbmpelpoBuilder_ == null) {
        dofkbmpelpoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getDofkbmpelpo(),
                getParentForChildren(),
                isClean());
        dofkbmpelpo_ = null;
      }
      return dofkbmpelpoBuilder_;
    }

    private int iljdfpdkmno_ ;
    /**
     * <code>int32 iljdfpdkmno = 2;</code>
     * @return The iljdfpdkmno.
     */
    @java.lang.Override
    public int getIljdfpdkmno() {
      return iljdfpdkmno_;
    }
    /**
     * <code>int32 iljdfpdkmno = 2;</code>
     * @param value The iljdfpdkmno to set.
     * @return This builder for chaining.
     */
    public Builder setIljdfpdkmno(int value) {
      
      iljdfpdkmno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 iljdfpdkmno = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIljdfpdkmno() {
      
      iljdfpdkmno_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bmcfcoflnde_ = "";
    /**
     * <code>string bmcfcoflnde = 3;</code>
     * @return The bmcfcoflnde.
     */
    public java.lang.String getBmcfcoflnde() {
      java.lang.Object ref = bmcfcoflnde_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bmcfcoflnde_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bmcfcoflnde = 3;</code>
     * @return The bytes for bmcfcoflnde.
     */
    public com.google.protobuf.ByteString
        getBmcfcoflndeBytes() {
      java.lang.Object ref = bmcfcoflnde_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bmcfcoflnde_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bmcfcoflnde = 3;</code>
     * @param value The bmcfcoflnde to set.
     * @return This builder for chaining.
     */
    public Builder setBmcfcoflnde(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bmcfcoflnde_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string bmcfcoflnde = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBmcfcoflnde() {
      
      bmcfcoflnde_ = getDefaultInstance().getBmcfcoflnde();
      onChanged();
      return this;
    }
    /**
     * <code>string bmcfcoflnde = 3;</code>
     * @param value The bytes for bmcfcoflnde to set.
     * @return This builder for chaining.
     */
    public Builder setBmcfcoflndeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bmcfcoflnde_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.PokemonDisplayProto poifncejdne_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> poifncejdneBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     * @return Whether the poifncejdne field is set.
     */
    public boolean hasPoifncejdne() {
      return poifncejdneBuilder_ != null || poifncejdne_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     * @return The poifncejdne.
     */
    public POGOProtos.Rpc.PokemonDisplayProto getPoifncejdne() {
      if (poifncejdneBuilder_ == null) {
        return poifncejdne_ == null ? POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : poifncejdne_;
      } else {
        return poifncejdneBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    public Builder setPoifncejdne(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (poifncejdneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        poifncejdne_ = value;
        onChanged();
      } else {
        poifncejdneBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    public Builder setPoifncejdne(
        POGOProtos.Rpc.PokemonDisplayProto.Builder builderForValue) {
      if (poifncejdneBuilder_ == null) {
        poifncejdne_ = builderForValue.build();
        onChanged();
      } else {
        poifncejdneBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    public Builder mergePoifncejdne(POGOProtos.Rpc.PokemonDisplayProto value) {
      if (poifncejdneBuilder_ == null) {
        if (poifncejdne_ != null) {
          poifncejdne_ =
            POGOProtos.Rpc.PokemonDisplayProto.newBuilder(poifncejdne_).mergeFrom(value).buildPartial();
        } else {
          poifncejdne_ = value;
        }
        onChanged();
      } else {
        poifncejdneBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    public Builder clearPoifncejdne() {
      if (poifncejdneBuilder_ == null) {
        poifncejdne_ = null;
        onChanged();
      } else {
        poifncejdne_ = null;
        poifncejdneBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProto.Builder getPoifncejdneBuilder() {
      
      onChanged();
      return getPoifncejdneFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    public POGOProtos.Rpc.PokemonDisplayProtoOrBuilder getPoifncejdneOrBuilder() {
      if (poifncejdneBuilder_ != null) {
        return poifncejdneBuilder_.getMessageOrBuilder();
      } else {
        return poifncejdne_ == null ?
            POGOProtos.Rpc.PokemonDisplayProto.getDefaultInstance() : poifncejdne_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto poifncejdne = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder> 
        getPoifncejdneFieldBuilder() {
      if (poifncejdneBuilder_ == null) {
        poifncejdneBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonDisplayProto, POGOProtos.Rpc.PokemonDisplayProto.Builder, POGOProtos.Rpc.PokemonDisplayProtoOrBuilder>(
                getPoifncejdne(),
                getParentForChildren(),
                isClean());
        poifncejdne_ = null;
      }
      return poifncejdneBuilder_;
    }

    private int ajhinlegbod_ ;
    /**
     * <code>int32 ajhinlegbod = 5;</code>
     * @return The ajhinlegbod.
     */
    @java.lang.Override
    public int getAjhinlegbod() {
      return ajhinlegbod_;
    }
    /**
     * <code>int32 ajhinlegbod = 5;</code>
     * @param value The ajhinlegbod to set.
     * @return This builder for chaining.
     */
    public Builder setAjhinlegbod(int value) {
      
      ajhinlegbod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ajhinlegbod = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAjhinlegbod() {
      
      ajhinlegbod_ = 0;
      onChanged();
      return this;
    }

    private long nckpcdcmpac_ ;
    /**
     * <code>int64 nckpcdcmpac = 6;</code>
     * @return The nckpcdcmpac.
     */
    @java.lang.Override
    public long getNckpcdcmpac() {
      return nckpcdcmpac_;
    }
    /**
     * <code>int64 nckpcdcmpac = 6;</code>
     * @param value The nckpcdcmpac to set.
     * @return This builder for chaining.
     */
    public Builder setNckpcdcmpac(long value) {
      
      nckpcdcmpac_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 nckpcdcmpac = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearNckpcdcmpac() {
      
      nckpcdcmpac_ = 0L;
      onChanged();
      return this;
    }

    private int kdiofnapfbg_ ;
    /**
     * <code>int32 kdiofnapfbg = 7;</code>
     * @return The kdiofnapfbg.
     */
    @java.lang.Override
    public int getKdiofnapfbg() {
      return kdiofnapfbg_;
    }
    /**
     * <code>int32 kdiofnapfbg = 7;</code>
     * @param value The kdiofnapfbg to set.
     * @return This builder for chaining.
     */
    public Builder setKdiofnapfbg(int value) {
      
      kdiofnapfbg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kdiofnapfbg = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearKdiofnapfbg() {
      
      kdiofnapfbg_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LHNKNIGLOCI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LHNKNIGLOCI)
  private static final POGOProtos.Rpc.LHNKNIGLOCI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LHNKNIGLOCI();
  }

  public static POGOProtos.Rpc.LHNKNIGLOCI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LHNKNIGLOCI>
      PARSER = new com.google.protobuf.AbstractParser<LHNKNIGLOCI>() {
    @java.lang.Override
    public LHNKNIGLOCI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LHNKNIGLOCI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LHNKNIGLOCI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LHNKNIGLOCI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LHNKNIGLOCI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
