// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: HPIFJELPBGP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.HPIFJELPBGP}
 */
public final class HPIFJELPBGP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.HPIFJELPBGP)
    HPIFJELPBGPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HPIFJELPBGP.newBuilder() to construct.
  private HPIFJELPBGP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HPIFJELPBGP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HPIFJELPBGP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HPIFJELPBGP(
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
          case 13: {

            ofofmblglkf_ = input.readFloat();
            break;
          }
          case 16: {

            cpnaojfjeni_ = input.readInt32();
            break;
          }
          case 24: {

            hbifodjbjil_ = input.readInt32();
            break;
          }
          case 32: {

            ibokhlaeioc_ = input.readInt32();
            break;
          }
          case 40: {

            mjfofaedecg_ = input.readInt32();
            break;
          }
          case 48: {

            plnblkcoaen_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HPIFJELPBGP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HPIFJELPBGP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.HPIFJELPBGP.class, POGOProtos.Rpc.HPIFJELPBGP.Builder.class);
  }

  public static final int OFOFMBLGLKF_FIELD_NUMBER = 1;
  private float ofofmblglkf_;
  /**
   * <code>float ofofmblglkf = 1;</code>
   * @return The ofofmblglkf.
   */
  @java.lang.Override
  public float getOfofmblglkf() {
    return ofofmblglkf_;
  }

  public static final int CPNAOJFJENI_FIELD_NUMBER = 2;
  private int cpnaojfjeni_;
  /**
   * <code>int32 cpnaojfjeni = 2;</code>
   * @return The cpnaojfjeni.
   */
  @java.lang.Override
  public int getCpnaojfjeni() {
    return cpnaojfjeni_;
  }

  public static final int HBIFODJBJIL_FIELD_NUMBER = 3;
  private int hbifodjbjil_;
  /**
   * <code>int32 hbifodjbjil = 3;</code>
   * @return The hbifodjbjil.
   */
  @java.lang.Override
  public int getHbifodjbjil() {
    return hbifodjbjil_;
  }

  public static final int IBOKHLAEIOC_FIELD_NUMBER = 4;
  private int ibokhlaeioc_;
  /**
   * <code>int32 ibokhlaeioc = 4;</code>
   * @return The ibokhlaeioc.
   */
  @java.lang.Override
  public int getIbokhlaeioc() {
    return ibokhlaeioc_;
  }

  public static final int MJFOFAEDECG_FIELD_NUMBER = 5;
  private int mjfofaedecg_;
  /**
   * <code>int32 mjfofaedecg = 5;</code>
   * @return The mjfofaedecg.
   */
  @java.lang.Override
  public int getMjfofaedecg() {
    return mjfofaedecg_;
  }

  public static final int PLNBLKCOAEN_FIELD_NUMBER = 6;
  private int plnblkcoaen_;
  /**
   * <code>int32 plnblkcoaen = 6;</code>
   * @return The plnblkcoaen.
   */
  @java.lang.Override
  public int getPlnblkcoaen() {
    return plnblkcoaen_;
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
    if (ofofmblglkf_ != 0F) {
      output.writeFloat(1, ofofmblglkf_);
    }
    if (cpnaojfjeni_ != 0) {
      output.writeInt32(2, cpnaojfjeni_);
    }
    if (hbifodjbjil_ != 0) {
      output.writeInt32(3, hbifodjbjil_);
    }
    if (ibokhlaeioc_ != 0) {
      output.writeInt32(4, ibokhlaeioc_);
    }
    if (mjfofaedecg_ != 0) {
      output.writeInt32(5, mjfofaedecg_);
    }
    if (plnblkcoaen_ != 0) {
      output.writeInt32(6, plnblkcoaen_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ofofmblglkf_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, ofofmblglkf_);
    }
    if (cpnaojfjeni_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, cpnaojfjeni_);
    }
    if (hbifodjbjil_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, hbifodjbjil_);
    }
    if (ibokhlaeioc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, ibokhlaeioc_);
    }
    if (mjfofaedecg_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, mjfofaedecg_);
    }
    if (plnblkcoaen_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, plnblkcoaen_);
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
    if (!(obj instanceof POGOProtos.Rpc.HPIFJELPBGP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.HPIFJELPBGP other = (POGOProtos.Rpc.HPIFJELPBGP) obj;

    if (java.lang.Float.floatToIntBits(getOfofmblglkf())
        != java.lang.Float.floatToIntBits(
            other.getOfofmblglkf())) return false;
    if (getCpnaojfjeni()
        != other.getCpnaojfjeni()) return false;
    if (getHbifodjbjil()
        != other.getHbifodjbjil()) return false;
    if (getIbokhlaeioc()
        != other.getIbokhlaeioc()) return false;
    if (getMjfofaedecg()
        != other.getMjfofaedecg()) return false;
    if (getPlnblkcoaen()
        != other.getPlnblkcoaen()) return false;
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
    hash = (37 * hash) + OFOFMBLGLKF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOfofmblglkf());
    hash = (37 * hash) + CPNAOJFJENI_FIELD_NUMBER;
    hash = (53 * hash) + getCpnaojfjeni();
    hash = (37 * hash) + HBIFODJBJIL_FIELD_NUMBER;
    hash = (53 * hash) + getHbifodjbjil();
    hash = (37 * hash) + IBOKHLAEIOC_FIELD_NUMBER;
    hash = (53 * hash) + getIbokhlaeioc();
    hash = (37 * hash) + MJFOFAEDECG_FIELD_NUMBER;
    hash = (53 * hash) + getMjfofaedecg();
    hash = (37 * hash) + PLNBLKCOAEN_FIELD_NUMBER;
    hash = (53 * hash) + getPlnblkcoaen();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.HPIFJELPBGP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.HPIFJELPBGP prototype) {
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
   * ref: HPIFJELPBGP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.HPIFJELPBGP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.HPIFJELPBGP)
      POGOProtos.Rpc.HPIFJELPBGPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HPIFJELPBGP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HPIFJELPBGP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.HPIFJELPBGP.class, POGOProtos.Rpc.HPIFJELPBGP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.HPIFJELPBGP.newBuilder()
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
      ofofmblglkf_ = 0F;

      cpnaojfjeni_ = 0;

      hbifodjbjil_ = 0;

      ibokhlaeioc_ = 0;

      mjfofaedecg_ = 0;

      plnblkcoaen_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_HPIFJELPBGP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HPIFJELPBGP getDefaultInstanceForType() {
      return POGOProtos.Rpc.HPIFJELPBGP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.HPIFJELPBGP build() {
      POGOProtos.Rpc.HPIFJELPBGP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.HPIFJELPBGP buildPartial() {
      POGOProtos.Rpc.HPIFJELPBGP result = new POGOProtos.Rpc.HPIFJELPBGP(this);
      result.ofofmblglkf_ = ofofmblglkf_;
      result.cpnaojfjeni_ = cpnaojfjeni_;
      result.hbifodjbjil_ = hbifodjbjil_;
      result.ibokhlaeioc_ = ibokhlaeioc_;
      result.mjfofaedecg_ = mjfofaedecg_;
      result.plnblkcoaen_ = plnblkcoaen_;
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
      if (other instanceof POGOProtos.Rpc.HPIFJELPBGP) {
        return mergeFrom((POGOProtos.Rpc.HPIFJELPBGP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.HPIFJELPBGP other) {
      if (other == POGOProtos.Rpc.HPIFJELPBGP.getDefaultInstance()) return this;
      if (other.getOfofmblglkf() != 0F) {
        setOfofmblglkf(other.getOfofmblglkf());
      }
      if (other.getCpnaojfjeni() != 0) {
        setCpnaojfjeni(other.getCpnaojfjeni());
      }
      if (other.getHbifodjbjil() != 0) {
        setHbifodjbjil(other.getHbifodjbjil());
      }
      if (other.getIbokhlaeioc() != 0) {
        setIbokhlaeioc(other.getIbokhlaeioc());
      }
      if (other.getMjfofaedecg() != 0) {
        setMjfofaedecg(other.getMjfofaedecg());
      }
      if (other.getPlnblkcoaen() != 0) {
        setPlnblkcoaen(other.getPlnblkcoaen());
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
      POGOProtos.Rpc.HPIFJELPBGP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.HPIFJELPBGP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float ofofmblglkf_ ;
    /**
     * <code>float ofofmblglkf = 1;</code>
     * @return The ofofmblglkf.
     */
    @java.lang.Override
    public float getOfofmblglkf() {
      return ofofmblglkf_;
    }
    /**
     * <code>float ofofmblglkf = 1;</code>
     * @param value The ofofmblglkf to set.
     * @return This builder for chaining.
     */
    public Builder setOfofmblglkf(float value) {
      
      ofofmblglkf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float ofofmblglkf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfofmblglkf() {
      
      ofofmblglkf_ = 0F;
      onChanged();
      return this;
    }

    private int cpnaojfjeni_ ;
    /**
     * <code>int32 cpnaojfjeni = 2;</code>
     * @return The cpnaojfjeni.
     */
    @java.lang.Override
    public int getCpnaojfjeni() {
      return cpnaojfjeni_;
    }
    /**
     * <code>int32 cpnaojfjeni = 2;</code>
     * @param value The cpnaojfjeni to set.
     * @return This builder for chaining.
     */
    public Builder setCpnaojfjeni(int value) {
      
      cpnaojfjeni_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cpnaojfjeni = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpnaojfjeni() {
      
      cpnaojfjeni_ = 0;
      onChanged();
      return this;
    }

    private int hbifodjbjil_ ;
    /**
     * <code>int32 hbifodjbjil = 3;</code>
     * @return The hbifodjbjil.
     */
    @java.lang.Override
    public int getHbifodjbjil() {
      return hbifodjbjil_;
    }
    /**
     * <code>int32 hbifodjbjil = 3;</code>
     * @param value The hbifodjbjil to set.
     * @return This builder for chaining.
     */
    public Builder setHbifodjbjil(int value) {
      
      hbifodjbjil_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 hbifodjbjil = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHbifodjbjil() {
      
      hbifodjbjil_ = 0;
      onChanged();
      return this;
    }

    private int ibokhlaeioc_ ;
    /**
     * <code>int32 ibokhlaeioc = 4;</code>
     * @return The ibokhlaeioc.
     */
    @java.lang.Override
    public int getIbokhlaeioc() {
      return ibokhlaeioc_;
    }
    /**
     * <code>int32 ibokhlaeioc = 4;</code>
     * @param value The ibokhlaeioc to set.
     * @return This builder for chaining.
     */
    public Builder setIbokhlaeioc(int value) {
      
      ibokhlaeioc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ibokhlaeioc = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIbokhlaeioc() {
      
      ibokhlaeioc_ = 0;
      onChanged();
      return this;
    }

    private int mjfofaedecg_ ;
    /**
     * <code>int32 mjfofaedecg = 5;</code>
     * @return The mjfofaedecg.
     */
    @java.lang.Override
    public int getMjfofaedecg() {
      return mjfofaedecg_;
    }
    /**
     * <code>int32 mjfofaedecg = 5;</code>
     * @param value The mjfofaedecg to set.
     * @return This builder for chaining.
     */
    public Builder setMjfofaedecg(int value) {
      
      mjfofaedecg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mjfofaedecg = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjfofaedecg() {
      
      mjfofaedecg_ = 0;
      onChanged();
      return this;
    }

    private int plnblkcoaen_ ;
    /**
     * <code>int32 plnblkcoaen = 6;</code>
     * @return The plnblkcoaen.
     */
    @java.lang.Override
    public int getPlnblkcoaen() {
      return plnblkcoaen_;
    }
    /**
     * <code>int32 plnblkcoaen = 6;</code>
     * @param value The plnblkcoaen to set.
     * @return This builder for chaining.
     */
    public Builder setPlnblkcoaen(int value) {
      
      plnblkcoaen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 plnblkcoaen = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlnblkcoaen() {
      
      plnblkcoaen_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.HPIFJELPBGP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.HPIFJELPBGP)
  private static final POGOProtos.Rpc.HPIFJELPBGP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.HPIFJELPBGP();
  }

  public static POGOProtos.Rpc.HPIFJELPBGP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HPIFJELPBGP>
      PARSER = new com.google.protobuf.AbstractParser<HPIFJELPBGP>() {
    @java.lang.Override
    public HPIFJELPBGP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HPIFJELPBGP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HPIFJELPBGP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HPIFJELPBGP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.HPIFJELPBGP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

