// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PGCPOAOCFGI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PGCPOAOCFGI}
 */
public final class PGCPOAOCFGI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PGCPOAOCFGI)
    PGCPOAOCFGIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PGCPOAOCFGI.newBuilder() to construct.
  private PGCPOAOCFGI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PGCPOAOCFGI() {
    jemhdponkih_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PGCPOAOCFGI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PGCPOAOCFGI(
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

            eajohpjbknk_ = input.readInt32();
            break;
          }
          case 25: {

            opbdacclchl_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            jemhdponkih_ = s;
            break;
          }
          case 40: {

            anoooaccgio_ = input.readBool();
            break;
          }
          case 49: {

            dmekfancobg_ = input.readDouble();
            break;
          }
          case 57: {

            npdoaggpibo_ = input.readDouble();
            break;
          }
          case 66: {
            POGOProtos.Rpc.NNHPOEPICBH.Builder subBuilder = null;
            if (blpglfkkjeo_ != null) {
              subBuilder = blpglfkkjeo_.toBuilder();
            }
            blpglfkkjeo_ = input.readMessage(POGOProtos.Rpc.NNHPOEPICBH.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blpglfkkjeo_);
              blpglfkkjeo_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGCPOAOCFGI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGCPOAOCFGI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PGCPOAOCFGI.class, POGOProtos.Rpc.PGCPOAOCFGI.Builder.class);
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

  public static final int EAJOHPJBKNK_FIELD_NUMBER = 2;
  private int eajohpjbknk_;
  /**
   * <code>int32 eajohpjbknk = 2;</code>
   * @return The eajohpjbknk.
   */
  @java.lang.Override
  public int getEajohpjbknk() {
    return eajohpjbknk_;
  }

  public static final int OPBDACCLCHL_FIELD_NUMBER = 3;
  private double opbdacclchl_;
  /**
   * <code>double opbdacclchl = 3;</code>
   * @return The opbdacclchl.
   */
  @java.lang.Override
  public double getOpbdacclchl() {
    return opbdacclchl_;
  }

  public static final int JEMHDPONKIH_FIELD_NUMBER = 4;
  private volatile java.lang.Object jemhdponkih_;
  /**
   * <code>string jemhdponkih = 4;</code>
   * @return The jemhdponkih.
   */
  @java.lang.Override
  public java.lang.String getJemhdponkih() {
    java.lang.Object ref = jemhdponkih_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jemhdponkih_ = s;
      return s;
    }
  }
  /**
   * <code>string jemhdponkih = 4;</code>
   * @return The bytes for jemhdponkih.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJemhdponkihBytes() {
    java.lang.Object ref = jemhdponkih_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jemhdponkih_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANOOOACCGIO_FIELD_NUMBER = 5;
  private boolean anoooaccgio_;
  /**
   * <code>bool anoooaccgio = 5;</code>
   * @return The anoooaccgio.
   */
  @java.lang.Override
  public boolean getAnoooaccgio() {
    return anoooaccgio_;
  }

  public static final int DMEKFANCOBG_FIELD_NUMBER = 6;
  private double dmekfancobg_;
  /**
   * <code>double dmekfancobg = 6;</code>
   * @return The dmekfancobg.
   */
  @java.lang.Override
  public double getDmekfancobg() {
    return dmekfancobg_;
  }

  public static final int NPDOAGGPIBO_FIELD_NUMBER = 7;
  private double npdoaggpibo_;
  /**
   * <code>double npdoaggpibo = 7;</code>
   * @return The npdoaggpibo.
   */
  @java.lang.Override
  public double getNpdoaggpibo() {
    return npdoaggpibo_;
  }

  public static final int BLPGLFKKJEO_FIELD_NUMBER = 8;
  private POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo_;
  /**
   * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
   * @return Whether the blpglfkkjeo field is set.
   */
  @java.lang.Override
  public boolean hasBlpglfkkjeo() {
    return blpglfkkjeo_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
   * @return The blpglfkkjeo.
   */
  @java.lang.Override
  public POGOProtos.Rpc.NNHPOEPICBH getBlpglfkkjeo() {
    return blpglfkkjeo_ == null ? POGOProtos.Rpc.NNHPOEPICBH.getDefaultInstance() : blpglfkkjeo_;
  }
  /**
   * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.NNHPOEPICBHOrBuilder getBlpglfkkjeoOrBuilder() {
    return getBlpglfkkjeo();
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
    if (eajohpjbknk_ != 0) {
      output.writeInt32(2, eajohpjbknk_);
    }
    if (opbdacclchl_ != 0D) {
      output.writeDouble(3, opbdacclchl_);
    }
    if (!getJemhdponkihBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, jemhdponkih_);
    }
    if (anoooaccgio_ != false) {
      output.writeBool(5, anoooaccgio_);
    }
    if (dmekfancobg_ != 0D) {
      output.writeDouble(6, dmekfancobg_);
    }
    if (npdoaggpibo_ != 0D) {
      output.writeDouble(7, npdoaggpibo_);
    }
    if (blpglfkkjeo_ != null) {
      output.writeMessage(8, getBlpglfkkjeo());
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
    if (eajohpjbknk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, eajohpjbknk_);
    }
    if (opbdacclchl_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, opbdacclchl_);
    }
    if (!getJemhdponkihBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, jemhdponkih_);
    }
    if (anoooaccgio_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, anoooaccgio_);
    }
    if (dmekfancobg_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, dmekfancobg_);
    }
    if (npdoaggpibo_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, npdoaggpibo_);
    }
    if (blpglfkkjeo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getBlpglfkkjeo());
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
    if (!(obj instanceof POGOProtos.Rpc.PGCPOAOCFGI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PGCPOAOCFGI other = (POGOProtos.Rpc.PGCPOAOCFGI) obj;

    if (getCkniekbneoe()
        != other.getCkniekbneoe()) return false;
    if (getEajohpjbknk()
        != other.getEajohpjbknk()) return false;
    if (java.lang.Double.doubleToLongBits(getOpbdacclchl())
        != java.lang.Double.doubleToLongBits(
            other.getOpbdacclchl())) return false;
    if (!getJemhdponkih()
        .equals(other.getJemhdponkih())) return false;
    if (getAnoooaccgio()
        != other.getAnoooaccgio()) return false;
    if (java.lang.Double.doubleToLongBits(getDmekfancobg())
        != java.lang.Double.doubleToLongBits(
            other.getDmekfancobg())) return false;
    if (java.lang.Double.doubleToLongBits(getNpdoaggpibo())
        != java.lang.Double.doubleToLongBits(
            other.getNpdoaggpibo())) return false;
    if (hasBlpglfkkjeo() != other.hasBlpglfkkjeo()) return false;
    if (hasBlpglfkkjeo()) {
      if (!getBlpglfkkjeo()
          .equals(other.getBlpglfkkjeo())) return false;
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
    hash = (37 * hash) + CKNIEKBNEOE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCkniekbneoe());
    hash = (37 * hash) + EAJOHPJBKNK_FIELD_NUMBER;
    hash = (53 * hash) + getEajohpjbknk();
    hash = (37 * hash) + OPBDACCLCHL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOpbdacclchl()));
    hash = (37 * hash) + JEMHDPONKIH_FIELD_NUMBER;
    hash = (53 * hash) + getJemhdponkih().hashCode();
    hash = (37 * hash) + ANOOOACCGIO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAnoooaccgio());
    hash = (37 * hash) + DMEKFANCOBG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDmekfancobg()));
    hash = (37 * hash) + NPDOAGGPIBO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNpdoaggpibo()));
    if (hasBlpglfkkjeo()) {
      hash = (37 * hash) + BLPGLFKKJEO_FIELD_NUMBER;
      hash = (53 * hash) + getBlpglfkkjeo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PGCPOAOCFGI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PGCPOAOCFGI prototype) {
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
   * ref: PGCPOAOCFGI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PGCPOAOCFGI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PGCPOAOCFGI)
      POGOProtos.Rpc.PGCPOAOCFGIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGCPOAOCFGI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGCPOAOCFGI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PGCPOAOCFGI.class, POGOProtos.Rpc.PGCPOAOCFGI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PGCPOAOCFGI.newBuilder()
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

      eajohpjbknk_ = 0;

      opbdacclchl_ = 0D;

      jemhdponkih_ = "";

      anoooaccgio_ = false;

      dmekfancobg_ = 0D;

      npdoaggpibo_ = 0D;

      if (blpglfkkjeoBuilder_ == null) {
        blpglfkkjeo_ = null;
      } else {
        blpglfkkjeo_ = null;
        blpglfkkjeoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PGCPOAOCFGI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PGCPOAOCFGI getDefaultInstanceForType() {
      return POGOProtos.Rpc.PGCPOAOCFGI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PGCPOAOCFGI build() {
      POGOProtos.Rpc.PGCPOAOCFGI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PGCPOAOCFGI buildPartial() {
      POGOProtos.Rpc.PGCPOAOCFGI result = new POGOProtos.Rpc.PGCPOAOCFGI(this);
      result.ckniekbneoe_ = ckniekbneoe_;
      result.eajohpjbknk_ = eajohpjbknk_;
      result.opbdacclchl_ = opbdacclchl_;
      result.jemhdponkih_ = jemhdponkih_;
      result.anoooaccgio_ = anoooaccgio_;
      result.dmekfancobg_ = dmekfancobg_;
      result.npdoaggpibo_ = npdoaggpibo_;
      if (blpglfkkjeoBuilder_ == null) {
        result.blpglfkkjeo_ = blpglfkkjeo_;
      } else {
        result.blpglfkkjeo_ = blpglfkkjeoBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PGCPOAOCFGI) {
        return mergeFrom((POGOProtos.Rpc.PGCPOAOCFGI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PGCPOAOCFGI other) {
      if (other == POGOProtos.Rpc.PGCPOAOCFGI.getDefaultInstance()) return this;
      if (other.getCkniekbneoe() != 0L) {
        setCkniekbneoe(other.getCkniekbneoe());
      }
      if (other.getEajohpjbknk() != 0) {
        setEajohpjbknk(other.getEajohpjbknk());
      }
      if (other.getOpbdacclchl() != 0D) {
        setOpbdacclchl(other.getOpbdacclchl());
      }
      if (!other.getJemhdponkih().isEmpty()) {
        jemhdponkih_ = other.jemhdponkih_;
        onChanged();
      }
      if (other.getAnoooaccgio() != false) {
        setAnoooaccgio(other.getAnoooaccgio());
      }
      if (other.getDmekfancobg() != 0D) {
        setDmekfancobg(other.getDmekfancobg());
      }
      if (other.getNpdoaggpibo() != 0D) {
        setNpdoaggpibo(other.getNpdoaggpibo());
      }
      if (other.hasBlpglfkkjeo()) {
        mergeBlpglfkkjeo(other.getBlpglfkkjeo());
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
      POGOProtos.Rpc.PGCPOAOCFGI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PGCPOAOCFGI) e.getUnfinishedMessage();
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

    private int eajohpjbknk_ ;
    /**
     * <code>int32 eajohpjbknk = 2;</code>
     * @return The eajohpjbknk.
     */
    @java.lang.Override
    public int getEajohpjbknk() {
      return eajohpjbknk_;
    }
    /**
     * <code>int32 eajohpjbknk = 2;</code>
     * @param value The eajohpjbknk to set.
     * @return This builder for chaining.
     */
    public Builder setEajohpjbknk(int value) {
      
      eajohpjbknk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 eajohpjbknk = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEajohpjbknk() {
      
      eajohpjbknk_ = 0;
      onChanged();
      return this;
    }

    private double opbdacclchl_ ;
    /**
     * <code>double opbdacclchl = 3;</code>
     * @return The opbdacclchl.
     */
    @java.lang.Override
    public double getOpbdacclchl() {
      return opbdacclchl_;
    }
    /**
     * <code>double opbdacclchl = 3;</code>
     * @param value The opbdacclchl to set.
     * @return This builder for chaining.
     */
    public Builder setOpbdacclchl(double value) {
      
      opbdacclchl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double opbdacclchl = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpbdacclchl() {
      
      opbdacclchl_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object jemhdponkih_ = "";
    /**
     * <code>string jemhdponkih = 4;</code>
     * @return The jemhdponkih.
     */
    public java.lang.String getJemhdponkih() {
      java.lang.Object ref = jemhdponkih_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jemhdponkih_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jemhdponkih = 4;</code>
     * @return The bytes for jemhdponkih.
     */
    public com.google.protobuf.ByteString
        getJemhdponkihBytes() {
      java.lang.Object ref = jemhdponkih_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jemhdponkih_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jemhdponkih = 4;</code>
     * @param value The jemhdponkih to set.
     * @return This builder for chaining.
     */
    public Builder setJemhdponkih(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jemhdponkih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jemhdponkih = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJemhdponkih() {
      
      jemhdponkih_ = getDefaultInstance().getJemhdponkih();
      onChanged();
      return this;
    }
    /**
     * <code>string jemhdponkih = 4;</code>
     * @param value The bytes for jemhdponkih to set.
     * @return This builder for chaining.
     */
    public Builder setJemhdponkihBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jemhdponkih_ = value;
      onChanged();
      return this;
    }

    private boolean anoooaccgio_ ;
    /**
     * <code>bool anoooaccgio = 5;</code>
     * @return The anoooaccgio.
     */
    @java.lang.Override
    public boolean getAnoooaccgio() {
      return anoooaccgio_;
    }
    /**
     * <code>bool anoooaccgio = 5;</code>
     * @param value The anoooaccgio to set.
     * @return This builder for chaining.
     */
    public Builder setAnoooaccgio(boolean value) {
      
      anoooaccgio_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool anoooaccgio = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnoooaccgio() {
      
      anoooaccgio_ = false;
      onChanged();
      return this;
    }

    private double dmekfancobg_ ;
    /**
     * <code>double dmekfancobg = 6;</code>
     * @return The dmekfancobg.
     */
    @java.lang.Override
    public double getDmekfancobg() {
      return dmekfancobg_;
    }
    /**
     * <code>double dmekfancobg = 6;</code>
     * @param value The dmekfancobg to set.
     * @return This builder for chaining.
     */
    public Builder setDmekfancobg(double value) {
      
      dmekfancobg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double dmekfancobg = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmekfancobg() {
      
      dmekfancobg_ = 0D;
      onChanged();
      return this;
    }

    private double npdoaggpibo_ ;
    /**
     * <code>double npdoaggpibo = 7;</code>
     * @return The npdoaggpibo.
     */
    @java.lang.Override
    public double getNpdoaggpibo() {
      return npdoaggpibo_;
    }
    /**
     * <code>double npdoaggpibo = 7;</code>
     * @param value The npdoaggpibo to set.
     * @return This builder for chaining.
     */
    public Builder setNpdoaggpibo(double value) {
      
      npdoaggpibo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double npdoaggpibo = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpdoaggpibo() {
      
      npdoaggpibo_ = 0D;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NNHPOEPICBH, POGOProtos.Rpc.NNHPOEPICBH.Builder, POGOProtos.Rpc.NNHPOEPICBHOrBuilder> blpglfkkjeoBuilder_;
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     * @return Whether the blpglfkkjeo field is set.
     */
    public boolean hasBlpglfkkjeo() {
      return blpglfkkjeoBuilder_ != null || blpglfkkjeo_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     * @return The blpglfkkjeo.
     */
    public POGOProtos.Rpc.NNHPOEPICBH getBlpglfkkjeo() {
      if (blpglfkkjeoBuilder_ == null) {
        return blpglfkkjeo_ == null ? POGOProtos.Rpc.NNHPOEPICBH.getDefaultInstance() : blpglfkkjeo_;
      } else {
        return blpglfkkjeoBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    public Builder setBlpglfkkjeo(POGOProtos.Rpc.NNHPOEPICBH value) {
      if (blpglfkkjeoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blpglfkkjeo_ = value;
        onChanged();
      } else {
        blpglfkkjeoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    public Builder setBlpglfkkjeo(
        POGOProtos.Rpc.NNHPOEPICBH.Builder builderForValue) {
      if (blpglfkkjeoBuilder_ == null) {
        blpglfkkjeo_ = builderForValue.build();
        onChanged();
      } else {
        blpglfkkjeoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    public Builder mergeBlpglfkkjeo(POGOProtos.Rpc.NNHPOEPICBH value) {
      if (blpglfkkjeoBuilder_ == null) {
        if (blpglfkkjeo_ != null) {
          blpglfkkjeo_ =
            POGOProtos.Rpc.NNHPOEPICBH.newBuilder(blpglfkkjeo_).mergeFrom(value).buildPartial();
        } else {
          blpglfkkjeo_ = value;
        }
        onChanged();
      } else {
        blpglfkkjeoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    public Builder clearBlpglfkkjeo() {
      if (blpglfkkjeoBuilder_ == null) {
        blpglfkkjeo_ = null;
        onChanged();
      } else {
        blpglfkkjeo_ = null;
        blpglfkkjeoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    public POGOProtos.Rpc.NNHPOEPICBH.Builder getBlpglfkkjeoBuilder() {
      
      onChanged();
      return getBlpglfkkjeoFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    public POGOProtos.Rpc.NNHPOEPICBHOrBuilder getBlpglfkkjeoOrBuilder() {
      if (blpglfkkjeoBuilder_ != null) {
        return blpglfkkjeoBuilder_.getMessageOrBuilder();
      } else {
        return blpglfkkjeo_ == null ?
            POGOProtos.Rpc.NNHPOEPICBH.getDefaultInstance() : blpglfkkjeo_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.NNHPOEPICBH blpglfkkjeo = 8;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.NNHPOEPICBH, POGOProtos.Rpc.NNHPOEPICBH.Builder, POGOProtos.Rpc.NNHPOEPICBHOrBuilder> 
        getBlpglfkkjeoFieldBuilder() {
      if (blpglfkkjeoBuilder_ == null) {
        blpglfkkjeoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.NNHPOEPICBH, POGOProtos.Rpc.NNHPOEPICBH.Builder, POGOProtos.Rpc.NNHPOEPICBHOrBuilder>(
                getBlpglfkkjeo(),
                getParentForChildren(),
                isClean());
        blpglfkkjeo_ = null;
      }
      return blpglfkkjeoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PGCPOAOCFGI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PGCPOAOCFGI)
  private static final POGOProtos.Rpc.PGCPOAOCFGI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PGCPOAOCFGI();
  }

  public static POGOProtos.Rpc.PGCPOAOCFGI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PGCPOAOCFGI>
      PARSER = new com.google.protobuf.AbstractParser<PGCPOAOCFGI>() {
    @java.lang.Override
    public PGCPOAOCFGI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PGCPOAOCFGI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PGCPOAOCFGI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PGCPOAOCFGI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PGCPOAOCFGI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
