// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IEEFIJFDPLB}
 */
public  final class IEEFIJFDPLB extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IEEFIJFDPLB)
    IEEFIJFDPLBOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IEEFIJFDPLB.newBuilder() to construct.
  private IEEFIJFDPLB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IEEFIJFDPLB() {
    ffllmigjoal_ = 0;
    lmapfgfglan_ = 0;
    najmnoflmfj_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IEEFIJFDPLB();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IEEFIJFDPLB(
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

            ffllmigjoal_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            lmapfgfglan_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            najmnoflmfj_ = rawValue;
            break;
          }
          case 32: {

            kbpiagcjhid_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IEEFIJFDPLB_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IEEFIJFDPLB_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IEEFIJFDPLB.class, POGOProtos.Rpc.IEEFIJFDPLB.Builder.class);
  }

  public static final int FFLLMIGJOAL_FIELD_NUMBER = 1;
  private int ffllmigjoal_;
  /**
   * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
   * @return The enum numeric value on the wire for ffllmigjoal.
   */
  public int getFfllmigjoalValue() {
    return ffllmigjoal_;
  }
  /**
   * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
   * @return The ffllmigjoal.
   */
  public POGOProtos.Rpc.CNABIMEEGID getFfllmigjoal() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CNABIMEEGID result = POGOProtos.Rpc.CNABIMEEGID.valueOf(ffllmigjoal_);
    return result == null ? POGOProtos.Rpc.CNABIMEEGID.UNRECOGNIZED : result;
  }

  public static final int LMAPFGFGLAN_FIELD_NUMBER = 2;
  private int lmapfgfglan_;
  /**
   * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
   * @return The enum numeric value on the wire for lmapfgfglan.
   */
  public int getLmapfgfglanValue() {
    return lmapfgfglan_;
  }
  /**
   * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
   * @return The lmapfgfglan.
   */
  public POGOProtos.Rpc.NLBGNFGGEKI getLmapfgfglan() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NLBGNFGGEKI result = POGOProtos.Rpc.NLBGNFGGEKI.valueOf(lmapfgfglan_);
    return result == null ? POGOProtos.Rpc.NLBGNFGGEKI.UNRECOGNIZED : result;
  }

  public static final int NAJMNOFLMFJ_FIELD_NUMBER = 3;
  private int najmnoflmfj_;
  /**
   * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
   * @return The enum numeric value on the wire for najmnoflmfj.
   */
  public int getNajmnoflmfjValue() {
    return najmnoflmfj_;
  }
  /**
   * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
   * @return The najmnoflmfj.
   */
  public POGOProtos.Rpc.EEJDPFDHGOF getNajmnoflmfj() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EEJDPFDHGOF result = POGOProtos.Rpc.EEJDPFDHGOF.valueOf(najmnoflmfj_);
    return result == null ? POGOProtos.Rpc.EEJDPFDHGOF.UNRECOGNIZED : result;
  }

  public static final int KBPIAGCJHID_FIELD_NUMBER = 4;
  private boolean kbpiagcjhid_;
  /**
   * <code>bool kbpiagcjhid = 4;</code>
   * @return The kbpiagcjhid.
   */
  public boolean getKbpiagcjhid() {
    return kbpiagcjhid_;
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
    if (ffllmigjoal_ != POGOProtos.Rpc.CNABIMEEGID.CNABIMEEGID_UNDEFINED_PERMISSION_CONTEXT.getNumber()) {
      output.writeEnum(1, ffllmigjoal_);
    }
    if (lmapfgfglan_ != POGOProtos.Rpc.NLBGNFGGEKI.NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE.getNumber()) {
      output.writeEnum(2, lmapfgfglan_);
    }
    if (najmnoflmfj_ != POGOProtos.Rpc.EEJDPFDHGOF.EEJDPFDHGOF_UNDEFINED_PERMISSION_FLOW_STEP.getNumber()) {
      output.writeEnum(3, najmnoflmfj_);
    }
    if (kbpiagcjhid_ != false) {
      output.writeBool(4, kbpiagcjhid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ffllmigjoal_ != POGOProtos.Rpc.CNABIMEEGID.CNABIMEEGID_UNDEFINED_PERMISSION_CONTEXT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ffllmigjoal_);
    }
    if (lmapfgfglan_ != POGOProtos.Rpc.NLBGNFGGEKI.NLBGNFGGEKI_UNDEFINED_DEVICE_SERVICE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, lmapfgfglan_);
    }
    if (najmnoflmfj_ != POGOProtos.Rpc.EEJDPFDHGOF.EEJDPFDHGOF_UNDEFINED_PERMISSION_FLOW_STEP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, najmnoflmfj_);
    }
    if (kbpiagcjhid_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, kbpiagcjhid_);
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
    if (!(obj instanceof POGOProtos.Rpc.IEEFIJFDPLB)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IEEFIJFDPLB other = (POGOProtos.Rpc.IEEFIJFDPLB) obj;

    if (ffllmigjoal_ != other.ffllmigjoal_) return false;
    if (lmapfgfglan_ != other.lmapfgfglan_) return false;
    if (najmnoflmfj_ != other.najmnoflmfj_) return false;
    if (getKbpiagcjhid()
        != other.getKbpiagcjhid()) return false;
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
    hash = (37 * hash) + FFLLMIGJOAL_FIELD_NUMBER;
    hash = (53 * hash) + ffllmigjoal_;
    hash = (37 * hash) + LMAPFGFGLAN_FIELD_NUMBER;
    hash = (53 * hash) + lmapfgfglan_;
    hash = (37 * hash) + NAJMNOFLMFJ_FIELD_NUMBER;
    hash = (53 * hash) + najmnoflmfj_;
    hash = (37 * hash) + KBPIAGCJHID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKbpiagcjhid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IEEFIJFDPLB parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IEEFIJFDPLB prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IEEFIJFDPLB}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IEEFIJFDPLB)
      POGOProtos.Rpc.IEEFIJFDPLBOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IEEFIJFDPLB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IEEFIJFDPLB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IEEFIJFDPLB.class, POGOProtos.Rpc.IEEFIJFDPLB.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IEEFIJFDPLB.newBuilder()
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
      ffllmigjoal_ = 0;

      lmapfgfglan_ = 0;

      najmnoflmfj_ = 0;

      kbpiagcjhid_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IEEFIJFDPLB_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IEEFIJFDPLB getDefaultInstanceForType() {
      return POGOProtos.Rpc.IEEFIJFDPLB.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IEEFIJFDPLB build() {
      POGOProtos.Rpc.IEEFIJFDPLB result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IEEFIJFDPLB buildPartial() {
      POGOProtos.Rpc.IEEFIJFDPLB result = new POGOProtos.Rpc.IEEFIJFDPLB(this);
      result.ffllmigjoal_ = ffllmigjoal_;
      result.lmapfgfglan_ = lmapfgfglan_;
      result.najmnoflmfj_ = najmnoflmfj_;
      result.kbpiagcjhid_ = kbpiagcjhid_;
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
      if (other instanceof POGOProtos.Rpc.IEEFIJFDPLB) {
        return mergeFrom((POGOProtos.Rpc.IEEFIJFDPLB)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IEEFIJFDPLB other) {
      if (other == POGOProtos.Rpc.IEEFIJFDPLB.getDefaultInstance()) return this;
      if (other.ffllmigjoal_ != 0) {
        setFfllmigjoalValue(other.getFfllmigjoalValue());
      }
      if (other.lmapfgfglan_ != 0) {
        setLmapfgfglanValue(other.getLmapfgfglanValue());
      }
      if (other.najmnoflmfj_ != 0) {
        setNajmnoflmfjValue(other.getNajmnoflmfjValue());
      }
      if (other.getKbpiagcjhid() != false) {
        setKbpiagcjhid(other.getKbpiagcjhid());
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
      POGOProtos.Rpc.IEEFIJFDPLB parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IEEFIJFDPLB) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ffllmigjoal_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
     * @return The enum numeric value on the wire for ffllmigjoal.
     */
    public int getFfllmigjoalValue() {
      return ffllmigjoal_;
    }
    /**
     * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
     * @param value The enum numeric value on the wire for ffllmigjoal to set.
     * @return This builder for chaining.
     */
    public Builder setFfllmigjoalValue(int value) {
      ffllmigjoal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
     * @return The ffllmigjoal.
     */
    public POGOProtos.Rpc.CNABIMEEGID getFfllmigjoal() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CNABIMEEGID result = POGOProtos.Rpc.CNABIMEEGID.valueOf(ffllmigjoal_);
      return result == null ? POGOProtos.Rpc.CNABIMEEGID.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
     * @param value The ffllmigjoal to set.
     * @return This builder for chaining.
     */
    public Builder setFfllmigjoal(POGOProtos.Rpc.CNABIMEEGID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ffllmigjoal_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CNABIMEEGID ffllmigjoal = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfllmigjoal() {
      
      ffllmigjoal_ = 0;
      onChanged();
      return this;
    }

    private int lmapfgfglan_ = 0;
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
     * @return The enum numeric value on the wire for lmapfgfglan.
     */
    public int getLmapfgfglanValue() {
      return lmapfgfglan_;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
     * @param value The enum numeric value on the wire for lmapfgfglan to set.
     * @return This builder for chaining.
     */
    public Builder setLmapfgfglanValue(int value) {
      lmapfgfglan_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
     * @return The lmapfgfglan.
     */
    public POGOProtos.Rpc.NLBGNFGGEKI getLmapfgfglan() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NLBGNFGGEKI result = POGOProtos.Rpc.NLBGNFGGEKI.valueOf(lmapfgfglan_);
      return result == null ? POGOProtos.Rpc.NLBGNFGGEKI.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
     * @param value The lmapfgfglan to set.
     * @return This builder for chaining.
     */
    public Builder setLmapfgfglan(POGOProtos.Rpc.NLBGNFGGEKI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lmapfgfglan_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NLBGNFGGEKI lmapfgfglan = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLmapfgfglan() {
      
      lmapfgfglan_ = 0;
      onChanged();
      return this;
    }

    private int najmnoflmfj_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
     * @return The enum numeric value on the wire for najmnoflmfj.
     */
    public int getNajmnoflmfjValue() {
      return najmnoflmfj_;
    }
    /**
     * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
     * @param value The enum numeric value on the wire for najmnoflmfj to set.
     * @return This builder for chaining.
     */
    public Builder setNajmnoflmfjValue(int value) {
      najmnoflmfj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
     * @return The najmnoflmfj.
     */
    public POGOProtos.Rpc.EEJDPFDHGOF getNajmnoflmfj() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EEJDPFDHGOF result = POGOProtos.Rpc.EEJDPFDHGOF.valueOf(najmnoflmfj_);
      return result == null ? POGOProtos.Rpc.EEJDPFDHGOF.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
     * @param value The najmnoflmfj to set.
     * @return This builder for chaining.
     */
    public Builder setNajmnoflmfj(POGOProtos.Rpc.EEJDPFDHGOF value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      najmnoflmfj_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EEJDPFDHGOF najmnoflmfj = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNajmnoflmfj() {
      
      najmnoflmfj_ = 0;
      onChanged();
      return this;
    }

    private boolean kbpiagcjhid_ ;
    /**
     * <code>bool kbpiagcjhid = 4;</code>
     * @return The kbpiagcjhid.
     */
    public boolean getKbpiagcjhid() {
      return kbpiagcjhid_;
    }
    /**
     * <code>bool kbpiagcjhid = 4;</code>
     * @param value The kbpiagcjhid to set.
     * @return This builder for chaining.
     */
    public Builder setKbpiagcjhid(boolean value) {
      
      kbpiagcjhid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool kbpiagcjhid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKbpiagcjhid() {
      
      kbpiagcjhid_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IEEFIJFDPLB)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IEEFIJFDPLB)
  private static final POGOProtos.Rpc.IEEFIJFDPLB DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IEEFIJFDPLB();
  }

  public static POGOProtos.Rpc.IEEFIJFDPLB getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IEEFIJFDPLB>
      PARSER = new com.google.protobuf.AbstractParser<IEEFIJFDPLB>() {
    @java.lang.Override
    public IEEFIJFDPLB parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IEEFIJFDPLB(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IEEFIJFDPLB> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IEEFIJFDPLB> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IEEFIJFDPLB getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

