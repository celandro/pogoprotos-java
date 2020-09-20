// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EIAFKDKLNOE
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EIAFKDKLNOE}
 */
public final class EIAFKDKLNOE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EIAFKDKLNOE)
    EIAFKDKLNOEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EIAFKDKLNOE.newBuilder() to construct.
  private EIAFKDKLNOE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EIAFKDKLNOE() {
    moapghfdgkk_ = "";
    ckpmacjmpgp_ = "";
    dkpdfgadnpb_ = 0;
    kpipndlhghb_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EIAFKDKLNOE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EIAFKDKLNOE(
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
            java.lang.String s = input.readStringRequireUtf8();

            moapghfdgkk_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ckpmacjmpgp_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            dkpdfgadnpb_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            kpipndlhghb_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAFKDKLNOE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAFKDKLNOE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EIAFKDKLNOE.class, POGOProtos.Rpc.EIAFKDKLNOE.Builder.class);
  }

  /**
   * <pre>
   * ref: EIAFKDKLNOE/PKLPHJALNGG/LLDCMKIILGI
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI}
   */
  public enum LLDCMKIILGI
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PLATFORM_UNKNOWN = 0;</code>
     */
    PLATFORM_UNKNOWN(0),
    /**
     * <code>PLATFORM_ANDROID = 1;</code>
     */
    PLATFORM_ANDROID(1),
    /**
     * <code>PLATFORM_IOS = 2;</code>
     */
    PLATFORM_IOS(2),
    /**
     * <code>PLATFORM_WEB = 3;</code>
     */
    PLATFORM_WEB(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PLATFORM_UNKNOWN = 0;</code>
     */
    public static final int PLATFORM_UNKNOWN_VALUE = 0;
    /**
     * <code>PLATFORM_ANDROID = 1;</code>
     */
    public static final int PLATFORM_ANDROID_VALUE = 1;
    /**
     * <code>PLATFORM_IOS = 2;</code>
     */
    public static final int PLATFORM_IOS_VALUE = 2;
    /**
     * <code>PLATFORM_WEB = 3;</code>
     */
    public static final int PLATFORM_WEB_VALUE = 3;


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
    public static LLDCMKIILGI valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LLDCMKIILGI forNumber(int value) {
      switch (value) {
        case 0: return PLATFORM_UNKNOWN;
        case 1: return PLATFORM_ANDROID;
        case 2: return PLATFORM_IOS;
        case 3: return PLATFORM_WEB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LLDCMKIILGI>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LLDCMKIILGI> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LLDCMKIILGI>() {
            public LLDCMKIILGI findValueByNumber(int number) {
              return LLDCMKIILGI.forNumber(number);
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
      return POGOProtos.Rpc.EIAFKDKLNOE.getDescriptor().getEnumTypes().get(0);
    }

    private static final LLDCMKIILGI[] VALUES = values();

    public static LLDCMKIILGI valueOf(
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

    private LLDCMKIILGI(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI)
  }

  public static final int MOAPGHFDGKK_FIELD_NUMBER = 1;
  private volatile java.lang.Object moapghfdgkk_;
  /**
   * <code>string moapghfdgkk = 1;</code>
   * @return The moapghfdgkk.
   */
  @java.lang.Override
  public java.lang.String getMoapghfdgkk() {
    java.lang.Object ref = moapghfdgkk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moapghfdgkk_ = s;
      return s;
    }
  }
  /**
   * <code>string moapghfdgkk = 1;</code>
   * @return The bytes for moapghfdgkk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMoapghfdgkkBytes() {
    java.lang.Object ref = moapghfdgkk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moapghfdgkk_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CKPMACJMPGP_FIELD_NUMBER = 2;
  private volatile java.lang.Object ckpmacjmpgp_;
  /**
   * <code>string ckpmacjmpgp = 2;</code>
   * @return The ckpmacjmpgp.
   */
  @java.lang.Override
  public java.lang.String getCkpmacjmpgp() {
    java.lang.Object ref = ckpmacjmpgp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ckpmacjmpgp_ = s;
      return s;
    }
  }
  /**
   * <code>string ckpmacjmpgp = 2;</code>
   * @return The bytes for ckpmacjmpgp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCkpmacjmpgpBytes() {
    java.lang.Object ref = ckpmacjmpgp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ckpmacjmpgp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DKPDFGADNPB_FIELD_NUMBER = 3;
  private int dkpdfgadnpb_;
  /**
   * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
   * @return The enum numeric value on the wire for dkpdfgadnpb.
   */
  @java.lang.Override public int getDkpdfgadnpbValue() {
    return dkpdfgadnpb_;
  }
  /**
   * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
   * @return The dkpdfgadnpb.
   */
  @java.lang.Override public POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI getDkpdfgadnpb() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI result = POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI.valueOf(dkpdfgadnpb_);
    return result == null ? POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI.UNRECOGNIZED : result;
  }

  public static final int KPIPNDLHGHB_FIELD_NUMBER = 4;
  private volatile java.lang.Object kpipndlhghb_;
  /**
   * <code>string kpipndlhghb = 4;</code>
   * @return The kpipndlhghb.
   */
  @java.lang.Override
  public java.lang.String getKpipndlhghb() {
    java.lang.Object ref = kpipndlhghb_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kpipndlhghb_ = s;
      return s;
    }
  }
  /**
   * <code>string kpipndlhghb = 4;</code>
   * @return The bytes for kpipndlhghb.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKpipndlhghbBytes() {
    java.lang.Object ref = kpipndlhghb_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kpipndlhghb_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getMoapghfdgkkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moapghfdgkk_);
    }
    if (!getCkpmacjmpgpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ckpmacjmpgp_);
    }
    if (dkpdfgadnpb_ != POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI.PLATFORM_UNKNOWN.getNumber()) {
      output.writeEnum(3, dkpdfgadnpb_);
    }
    if (!getKpipndlhghbBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, kpipndlhghb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMoapghfdgkkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moapghfdgkk_);
    }
    if (!getCkpmacjmpgpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ckpmacjmpgp_);
    }
    if (dkpdfgadnpb_ != POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI.PLATFORM_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, dkpdfgadnpb_);
    }
    if (!getKpipndlhghbBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, kpipndlhghb_);
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
    if (!(obj instanceof POGOProtos.Rpc.EIAFKDKLNOE)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EIAFKDKLNOE other = (POGOProtos.Rpc.EIAFKDKLNOE) obj;

    if (!getMoapghfdgkk()
        .equals(other.getMoapghfdgkk())) return false;
    if (!getCkpmacjmpgp()
        .equals(other.getCkpmacjmpgp())) return false;
    if (dkpdfgadnpb_ != other.dkpdfgadnpb_) return false;
    if (!getKpipndlhghb()
        .equals(other.getKpipndlhghb())) return false;
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
    hash = (37 * hash) + MOAPGHFDGKK_FIELD_NUMBER;
    hash = (53 * hash) + getMoapghfdgkk().hashCode();
    hash = (37 * hash) + CKPMACJMPGP_FIELD_NUMBER;
    hash = (53 * hash) + getCkpmacjmpgp().hashCode();
    hash = (37 * hash) + DKPDFGADNPB_FIELD_NUMBER;
    hash = (53 * hash) + dkpdfgadnpb_;
    hash = (37 * hash) + KPIPNDLHGHB_FIELD_NUMBER;
    hash = (53 * hash) + getKpipndlhghb().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EIAFKDKLNOE parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EIAFKDKLNOE prototype) {
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
   * ref: EIAFKDKLNOE
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EIAFKDKLNOE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EIAFKDKLNOE)
      POGOProtos.Rpc.EIAFKDKLNOEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAFKDKLNOE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAFKDKLNOE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EIAFKDKLNOE.class, POGOProtos.Rpc.EIAFKDKLNOE.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EIAFKDKLNOE.newBuilder()
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
      moapghfdgkk_ = "";

      ckpmacjmpgp_ = "";

      dkpdfgadnpb_ = 0;

      kpipndlhghb_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EIAFKDKLNOE_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIAFKDKLNOE getDefaultInstanceForType() {
      return POGOProtos.Rpc.EIAFKDKLNOE.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIAFKDKLNOE build() {
      POGOProtos.Rpc.EIAFKDKLNOE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EIAFKDKLNOE buildPartial() {
      POGOProtos.Rpc.EIAFKDKLNOE result = new POGOProtos.Rpc.EIAFKDKLNOE(this);
      result.moapghfdgkk_ = moapghfdgkk_;
      result.ckpmacjmpgp_ = ckpmacjmpgp_;
      result.dkpdfgadnpb_ = dkpdfgadnpb_;
      result.kpipndlhghb_ = kpipndlhghb_;
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
      if (other instanceof POGOProtos.Rpc.EIAFKDKLNOE) {
        return mergeFrom((POGOProtos.Rpc.EIAFKDKLNOE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EIAFKDKLNOE other) {
      if (other == POGOProtos.Rpc.EIAFKDKLNOE.getDefaultInstance()) return this;
      if (!other.getMoapghfdgkk().isEmpty()) {
        moapghfdgkk_ = other.moapghfdgkk_;
        onChanged();
      }
      if (!other.getCkpmacjmpgp().isEmpty()) {
        ckpmacjmpgp_ = other.ckpmacjmpgp_;
        onChanged();
      }
      if (other.dkpdfgadnpb_ != 0) {
        setDkpdfgadnpbValue(other.getDkpdfgadnpbValue());
      }
      if (!other.getKpipndlhghb().isEmpty()) {
        kpipndlhghb_ = other.kpipndlhghb_;
        onChanged();
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
      POGOProtos.Rpc.EIAFKDKLNOE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EIAFKDKLNOE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object moapghfdgkk_ = "";
    /**
     * <code>string moapghfdgkk = 1;</code>
     * @return The moapghfdgkk.
     */
    public java.lang.String getMoapghfdgkk() {
      java.lang.Object ref = moapghfdgkk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moapghfdgkk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string moapghfdgkk = 1;</code>
     * @return The bytes for moapghfdgkk.
     */
    public com.google.protobuf.ByteString
        getMoapghfdgkkBytes() {
      java.lang.Object ref = moapghfdgkk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moapghfdgkk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string moapghfdgkk = 1;</code>
     * @param value The moapghfdgkk to set.
     * @return This builder for chaining.
     */
    public Builder setMoapghfdgkk(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moapghfdgkk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string moapghfdgkk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMoapghfdgkk() {
      
      moapghfdgkk_ = getDefaultInstance().getMoapghfdgkk();
      onChanged();
      return this;
    }
    /**
     * <code>string moapghfdgkk = 1;</code>
     * @param value The bytes for moapghfdgkk to set.
     * @return This builder for chaining.
     */
    public Builder setMoapghfdgkkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      moapghfdgkk_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ckpmacjmpgp_ = "";
    /**
     * <code>string ckpmacjmpgp = 2;</code>
     * @return The ckpmacjmpgp.
     */
    public java.lang.String getCkpmacjmpgp() {
      java.lang.Object ref = ckpmacjmpgp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ckpmacjmpgp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ckpmacjmpgp = 2;</code>
     * @return The bytes for ckpmacjmpgp.
     */
    public com.google.protobuf.ByteString
        getCkpmacjmpgpBytes() {
      java.lang.Object ref = ckpmacjmpgp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ckpmacjmpgp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ckpmacjmpgp = 2;</code>
     * @param value The ckpmacjmpgp to set.
     * @return This builder for chaining.
     */
    public Builder setCkpmacjmpgp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ckpmacjmpgp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ckpmacjmpgp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCkpmacjmpgp() {
      
      ckpmacjmpgp_ = getDefaultInstance().getCkpmacjmpgp();
      onChanged();
      return this;
    }
    /**
     * <code>string ckpmacjmpgp = 2;</code>
     * @param value The bytes for ckpmacjmpgp to set.
     * @return This builder for chaining.
     */
    public Builder setCkpmacjmpgpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ckpmacjmpgp_ = value;
      onChanged();
      return this;
    }

    private int dkpdfgadnpb_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
     * @return The enum numeric value on the wire for dkpdfgadnpb.
     */
    @java.lang.Override public int getDkpdfgadnpbValue() {
      return dkpdfgadnpb_;
    }
    /**
     * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
     * @param value The enum numeric value on the wire for dkpdfgadnpb to set.
     * @return This builder for chaining.
     */
    public Builder setDkpdfgadnpbValue(int value) {
      
      dkpdfgadnpb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
     * @return The dkpdfgadnpb.
     */
    @java.lang.Override
    public POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI getDkpdfgadnpb() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI result = POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI.valueOf(dkpdfgadnpb_);
      return result == null ? POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
     * @param value The dkpdfgadnpb to set.
     * @return This builder for chaining.
     */
    public Builder setDkpdfgadnpb(POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      dkpdfgadnpb_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EIAFKDKLNOE.LLDCMKIILGI dkpdfgadnpb = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDkpdfgadnpb() {
      
      dkpdfgadnpb_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object kpipndlhghb_ = "";
    /**
     * <code>string kpipndlhghb = 4;</code>
     * @return The kpipndlhghb.
     */
    public java.lang.String getKpipndlhghb() {
      java.lang.Object ref = kpipndlhghb_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kpipndlhghb_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kpipndlhghb = 4;</code>
     * @return The bytes for kpipndlhghb.
     */
    public com.google.protobuf.ByteString
        getKpipndlhghbBytes() {
      java.lang.Object ref = kpipndlhghb_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kpipndlhghb_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kpipndlhghb = 4;</code>
     * @param value The kpipndlhghb to set.
     * @return This builder for chaining.
     */
    public Builder setKpipndlhghb(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kpipndlhghb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kpipndlhghb = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKpipndlhghb() {
      
      kpipndlhghb_ = getDefaultInstance().getKpipndlhghb();
      onChanged();
      return this;
    }
    /**
     * <code>string kpipndlhghb = 4;</code>
     * @param value The bytes for kpipndlhghb to set.
     * @return This builder for chaining.
     */
    public Builder setKpipndlhghbBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kpipndlhghb_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EIAFKDKLNOE)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EIAFKDKLNOE)
  private static final POGOProtos.Rpc.EIAFKDKLNOE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EIAFKDKLNOE();
  }

  public static POGOProtos.Rpc.EIAFKDKLNOE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EIAFKDKLNOE>
      PARSER = new com.google.protobuf.AbstractParser<EIAFKDKLNOE>() {
    @java.lang.Override
    public EIAFKDKLNOE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EIAFKDKLNOE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EIAFKDKLNOE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EIAFKDKLNOE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EIAFKDKLNOE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

