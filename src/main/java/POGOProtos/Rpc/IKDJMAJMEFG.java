// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IKDJMAJMEFG
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.IKDJMAJMEFG}
 */
public final class IKDJMAJMEFG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IKDJMAJMEFG)
    IKDJMAJMEFGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IKDJMAJMEFG.newBuilder() to construct.
  private IKDJMAJMEFG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IKDJMAJMEFG() {
    obajnkbnpmk_ = "";
    ianjodgkcmn_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IKDJMAJMEFG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IKDJMAJMEFG(
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

            mfkgkhdmbpb_ = input.readInt32();
            break;
          }
          case 16: {

            fgeliggeohb_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            obajnkbnpmk_ = s;
            break;
          }
          case 32: {

            fcidbdjkdih_ = input.readBool();
            break;
          }
          case 40: {

            ffihlfcfcng_ = input.readBool();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            ianjodgkcmn_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IKDJMAJMEFG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IKDJMAJMEFG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IKDJMAJMEFG.class, POGOProtos.Rpc.IKDJMAJMEFG.Builder.class);
  }

  public static final int MFKGKHDMBPB_FIELD_NUMBER = 1;
  private int mfkgkhdmbpb_;
  /**
   * <code>int32 mfkgkhdmbpb = 1;</code>
   * @return The mfkgkhdmbpb.
   */
  @java.lang.Override
  public int getMfkgkhdmbpb() {
    return mfkgkhdmbpb_;
  }

  public static final int FGELIGGEOHB_FIELD_NUMBER = 2;
  private int fgeliggeohb_;
  /**
   * <code>int32 fgeliggeohb = 2;</code>
   * @return The fgeliggeohb.
   */
  @java.lang.Override
  public int getFgeliggeohb() {
    return fgeliggeohb_;
  }

  public static final int OBAJNKBNPMK_FIELD_NUMBER = 3;
  private volatile java.lang.Object obajnkbnpmk_;
  /**
   * <code>string obajnkbnpmk = 3;</code>
   * @return The obajnkbnpmk.
   */
  @java.lang.Override
  public java.lang.String getObajnkbnpmk() {
    java.lang.Object ref = obajnkbnpmk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      obajnkbnpmk_ = s;
      return s;
    }
  }
  /**
   * <code>string obajnkbnpmk = 3;</code>
   * @return The bytes for obajnkbnpmk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObajnkbnpmkBytes() {
    java.lang.Object ref = obajnkbnpmk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      obajnkbnpmk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FCIDBDJKDIH_FIELD_NUMBER = 4;
  private boolean fcidbdjkdih_;
  /**
   * <code>bool fcidbdjkdih = 4;</code>
   * @return The fcidbdjkdih.
   */
  @java.lang.Override
  public boolean getFcidbdjkdih() {
    return fcidbdjkdih_;
  }

  public static final int FFIHLFCFCNG_FIELD_NUMBER = 5;
  private boolean ffihlfcfcng_;
  /**
   * <code>bool ffihlfcfcng = 5;</code>
   * @return The ffihlfcfcng.
   */
  @java.lang.Override
  public boolean getFfihlfcfcng() {
    return ffihlfcfcng_;
  }

  public static final int IANJODGKCMN_FIELD_NUMBER = 6;
  private int ianjodgkcmn_;
  /**
   * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
   * @return The enum numeric value on the wire for ianjodgkcmn.
   */
  @java.lang.Override public int getIanjodgkcmnValue() {
    return ianjodgkcmn_;
  }
  /**
   * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
   * @return The ianjodgkcmn.
   */
  @java.lang.Override public POGOProtos.Rpc.EncounterType getIanjodgkcmn() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EncounterType result = POGOProtos.Rpc.EncounterType.valueOf(ianjodgkcmn_);
    return result == null ? POGOProtos.Rpc.EncounterType.UNRECOGNIZED : result;
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
    if (mfkgkhdmbpb_ != 0) {
      output.writeInt32(1, mfkgkhdmbpb_);
    }
    if (fgeliggeohb_ != 0) {
      output.writeInt32(2, fgeliggeohb_);
    }
    if (!getObajnkbnpmkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, obajnkbnpmk_);
    }
    if (fcidbdjkdih_ != false) {
      output.writeBool(4, fcidbdjkdih_);
    }
    if (ffihlfcfcng_ != false) {
      output.writeBool(5, ffihlfcfcng_);
    }
    if (ianjodgkcmn_ != POGOProtos.Rpc.EncounterType.ENCOUNTER_TYPE_SPAWN_POINT.getNumber()) {
      output.writeEnum(6, ianjodgkcmn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mfkgkhdmbpb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, mfkgkhdmbpb_);
    }
    if (fgeliggeohb_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, fgeliggeohb_);
    }
    if (!getObajnkbnpmkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, obajnkbnpmk_);
    }
    if (fcidbdjkdih_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, fcidbdjkdih_);
    }
    if (ffihlfcfcng_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, ffihlfcfcng_);
    }
    if (ianjodgkcmn_ != POGOProtos.Rpc.EncounterType.ENCOUNTER_TYPE_SPAWN_POINT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, ianjodgkcmn_);
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
    if (!(obj instanceof POGOProtos.Rpc.IKDJMAJMEFG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IKDJMAJMEFG other = (POGOProtos.Rpc.IKDJMAJMEFG) obj;

    if (getMfkgkhdmbpb()
        != other.getMfkgkhdmbpb()) return false;
    if (getFgeliggeohb()
        != other.getFgeliggeohb()) return false;
    if (!getObajnkbnpmk()
        .equals(other.getObajnkbnpmk())) return false;
    if (getFcidbdjkdih()
        != other.getFcidbdjkdih()) return false;
    if (getFfihlfcfcng()
        != other.getFfihlfcfcng()) return false;
    if (ianjodgkcmn_ != other.ianjodgkcmn_) return false;
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
    hash = (37 * hash) + MFKGKHDMBPB_FIELD_NUMBER;
    hash = (53 * hash) + getMfkgkhdmbpb();
    hash = (37 * hash) + FGELIGGEOHB_FIELD_NUMBER;
    hash = (53 * hash) + getFgeliggeohb();
    hash = (37 * hash) + OBAJNKBNPMK_FIELD_NUMBER;
    hash = (53 * hash) + getObajnkbnpmk().hashCode();
    hash = (37 * hash) + FCIDBDJKDIH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFcidbdjkdih());
    hash = (37 * hash) + FFIHLFCFCNG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFfihlfcfcng());
    hash = (37 * hash) + IANJODGKCMN_FIELD_NUMBER;
    hash = (53 * hash) + ianjodgkcmn_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IKDJMAJMEFG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IKDJMAJMEFG prototype) {
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
   * ref: IKDJMAJMEFG
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.IKDJMAJMEFG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IKDJMAJMEFG)
      POGOProtos.Rpc.IKDJMAJMEFGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IKDJMAJMEFG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IKDJMAJMEFG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IKDJMAJMEFG.class, POGOProtos.Rpc.IKDJMAJMEFG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IKDJMAJMEFG.newBuilder()
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
      mfkgkhdmbpb_ = 0;

      fgeliggeohb_ = 0;

      obajnkbnpmk_ = "";

      fcidbdjkdih_ = false;

      ffihlfcfcng_ = false;

      ianjodgkcmn_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_IKDJMAJMEFG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IKDJMAJMEFG getDefaultInstanceForType() {
      return POGOProtos.Rpc.IKDJMAJMEFG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IKDJMAJMEFG build() {
      POGOProtos.Rpc.IKDJMAJMEFG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IKDJMAJMEFG buildPartial() {
      POGOProtos.Rpc.IKDJMAJMEFG result = new POGOProtos.Rpc.IKDJMAJMEFG(this);
      result.mfkgkhdmbpb_ = mfkgkhdmbpb_;
      result.fgeliggeohb_ = fgeliggeohb_;
      result.obajnkbnpmk_ = obajnkbnpmk_;
      result.fcidbdjkdih_ = fcidbdjkdih_;
      result.ffihlfcfcng_ = ffihlfcfcng_;
      result.ianjodgkcmn_ = ianjodgkcmn_;
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
      if (other instanceof POGOProtos.Rpc.IKDJMAJMEFG) {
        return mergeFrom((POGOProtos.Rpc.IKDJMAJMEFG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IKDJMAJMEFG other) {
      if (other == POGOProtos.Rpc.IKDJMAJMEFG.getDefaultInstance()) return this;
      if (other.getMfkgkhdmbpb() != 0) {
        setMfkgkhdmbpb(other.getMfkgkhdmbpb());
      }
      if (other.getFgeliggeohb() != 0) {
        setFgeliggeohb(other.getFgeliggeohb());
      }
      if (!other.getObajnkbnpmk().isEmpty()) {
        obajnkbnpmk_ = other.obajnkbnpmk_;
        onChanged();
      }
      if (other.getFcidbdjkdih() != false) {
        setFcidbdjkdih(other.getFcidbdjkdih());
      }
      if (other.getFfihlfcfcng() != false) {
        setFfihlfcfcng(other.getFfihlfcfcng());
      }
      if (other.ianjodgkcmn_ != 0) {
        setIanjodgkcmnValue(other.getIanjodgkcmnValue());
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
      POGOProtos.Rpc.IKDJMAJMEFG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IKDJMAJMEFG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mfkgkhdmbpb_ ;
    /**
     * <code>int32 mfkgkhdmbpb = 1;</code>
     * @return The mfkgkhdmbpb.
     */
    @java.lang.Override
    public int getMfkgkhdmbpb() {
      return mfkgkhdmbpb_;
    }
    /**
     * <code>int32 mfkgkhdmbpb = 1;</code>
     * @param value The mfkgkhdmbpb to set.
     * @return This builder for chaining.
     */
    public Builder setMfkgkhdmbpb(int value) {
      
      mfkgkhdmbpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mfkgkhdmbpb = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfkgkhdmbpb() {
      
      mfkgkhdmbpb_ = 0;
      onChanged();
      return this;
    }

    private int fgeliggeohb_ ;
    /**
     * <code>int32 fgeliggeohb = 2;</code>
     * @return The fgeliggeohb.
     */
    @java.lang.Override
    public int getFgeliggeohb() {
      return fgeliggeohb_;
    }
    /**
     * <code>int32 fgeliggeohb = 2;</code>
     * @param value The fgeliggeohb to set.
     * @return This builder for chaining.
     */
    public Builder setFgeliggeohb(int value) {
      
      fgeliggeohb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 fgeliggeohb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFgeliggeohb() {
      
      fgeliggeohb_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object obajnkbnpmk_ = "";
    /**
     * <code>string obajnkbnpmk = 3;</code>
     * @return The obajnkbnpmk.
     */
    public java.lang.String getObajnkbnpmk() {
      java.lang.Object ref = obajnkbnpmk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        obajnkbnpmk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string obajnkbnpmk = 3;</code>
     * @return The bytes for obajnkbnpmk.
     */
    public com.google.protobuf.ByteString
        getObajnkbnpmkBytes() {
      java.lang.Object ref = obajnkbnpmk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        obajnkbnpmk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string obajnkbnpmk = 3;</code>
     * @param value The obajnkbnpmk to set.
     * @return This builder for chaining.
     */
    public Builder setObajnkbnpmk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      obajnkbnpmk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string obajnkbnpmk = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearObajnkbnpmk() {
      
      obajnkbnpmk_ = getDefaultInstance().getObajnkbnpmk();
      onChanged();
      return this;
    }
    /**
     * <code>string obajnkbnpmk = 3;</code>
     * @param value The bytes for obajnkbnpmk to set.
     * @return This builder for chaining.
     */
    public Builder setObajnkbnpmkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      obajnkbnpmk_ = value;
      onChanged();
      return this;
    }

    private boolean fcidbdjkdih_ ;
    /**
     * <code>bool fcidbdjkdih = 4;</code>
     * @return The fcidbdjkdih.
     */
    @java.lang.Override
    public boolean getFcidbdjkdih() {
      return fcidbdjkdih_;
    }
    /**
     * <code>bool fcidbdjkdih = 4;</code>
     * @param value The fcidbdjkdih to set.
     * @return This builder for chaining.
     */
    public Builder setFcidbdjkdih(boolean value) {
      
      fcidbdjkdih_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fcidbdjkdih = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFcidbdjkdih() {
      
      fcidbdjkdih_ = false;
      onChanged();
      return this;
    }

    private boolean ffihlfcfcng_ ;
    /**
     * <code>bool ffihlfcfcng = 5;</code>
     * @return The ffihlfcfcng.
     */
    @java.lang.Override
    public boolean getFfihlfcfcng() {
      return ffihlfcfcng_;
    }
    /**
     * <code>bool ffihlfcfcng = 5;</code>
     * @param value The ffihlfcfcng to set.
     * @return This builder for chaining.
     */
    public Builder setFfihlfcfcng(boolean value) {
      
      ffihlfcfcng_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ffihlfcfcng = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfihlfcfcng() {
      
      ffihlfcfcng_ = false;
      onChanged();
      return this;
    }

    private int ianjodgkcmn_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
     * @return The enum numeric value on the wire for ianjodgkcmn.
     */
    @java.lang.Override public int getIanjodgkcmnValue() {
      return ianjodgkcmn_;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
     * @param value The enum numeric value on the wire for ianjodgkcmn to set.
     * @return This builder for chaining.
     */
    public Builder setIanjodgkcmnValue(int value) {
      
      ianjodgkcmn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
     * @return The ianjodgkcmn.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EncounterType getIanjodgkcmn() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EncounterType result = POGOProtos.Rpc.EncounterType.valueOf(ianjodgkcmn_);
      return result == null ? POGOProtos.Rpc.EncounterType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
     * @param value The ianjodgkcmn to set.
     * @return This builder for chaining.
     */
    public Builder setIanjodgkcmn(POGOProtos.Rpc.EncounterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ianjodgkcmn_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EncounterType ianjodgkcmn = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIanjodgkcmn() {
      
      ianjodgkcmn_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IKDJMAJMEFG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IKDJMAJMEFG)
  private static final POGOProtos.Rpc.IKDJMAJMEFG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IKDJMAJMEFG();
  }

  public static POGOProtos.Rpc.IKDJMAJMEFG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IKDJMAJMEFG>
      PARSER = new com.google.protobuf.AbstractParser<IKDJMAJMEFG>() {
    @java.lang.Override
    public IKDJMAJMEFG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IKDJMAJMEFG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IKDJMAJMEFG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IKDJMAJMEFG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IKDJMAJMEFG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

