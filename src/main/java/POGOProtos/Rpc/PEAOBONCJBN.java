// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PEAOBONCJBN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PEAOBONCJBN}
 */
public final class PEAOBONCJBN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PEAOBONCJBN)
    PEAOBONCJBNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PEAOBONCJBN.newBuilder() to construct.
  private PEAOBONCJBN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PEAOBONCJBN() {
    hncojddbiio_ = 0;
    kbfoamgjigc_ = 0;
    nobaoihmgln_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PEAOBONCJBN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PEAOBONCJBN(
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

            hncojddbiio_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            kbfoamgjigc_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nobaoihmgln_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEAOBONCJBN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEAOBONCJBN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PEAOBONCJBN.class, POGOProtos.Rpc.PEAOBONCJBN.Builder.class);
  }

  /**
   * <pre>
   * ref: PEAOBONCJBN/MFFDELJMABO/FCMLGPGMGNJ
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ}
   */
  public enum FCMLGPGMGNJ
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>POI_PHOTO_UPLOAD_ERROR = 1;</code>
     */
    POI_PHOTO_UPLOAD_ERROR(1),
    /**
     * <code>POI_PHOTO_UPLOAD_TIMEOUT = 2;</code>
     */
    POI_PHOTO_UPLOAD_TIMEOUT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>POI_PHOTO_UPLOAD_ERROR = 1;</code>
     */
    public static final int POI_PHOTO_UPLOAD_ERROR_VALUE = 1;
    /**
     * <code>POI_PHOTO_UPLOAD_TIMEOUT = 2;</code>
     */
    public static final int POI_PHOTO_UPLOAD_TIMEOUT_VALUE = 2;


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
    public static FCMLGPGMGNJ valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FCMLGPGMGNJ forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return POI_PHOTO_UPLOAD_ERROR;
        case 2: return POI_PHOTO_UPLOAD_TIMEOUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FCMLGPGMGNJ>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FCMLGPGMGNJ> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FCMLGPGMGNJ>() {
            public FCMLGPGMGNJ findValueByNumber(int number) {
              return FCMLGPGMGNJ.forNumber(number);
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
      return POGOProtos.Rpc.PEAOBONCJBN.getDescriptor().getEnumTypes().get(0);
    }

    private static final FCMLGPGMGNJ[] VALUES = values();

    public static FCMLGPGMGNJ valueOf(
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

    private FCMLGPGMGNJ(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ)
  }

  public static final int HNCOJDDBIIO_FIELD_NUMBER = 1;
  private int hncojddbiio_;
  /**
   * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
   * @return The enum numeric value on the wire for hncojddbiio.
   */
  @java.lang.Override public int getHncojddbiioValue() {
    return hncojddbiio_;
  }
  /**
   * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
   * @return The hncojddbiio.
   */
  @java.lang.Override public POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ getHncojddbiio() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ result = POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ.valueOf(hncojddbiio_);
    return result == null ? POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ.UNRECOGNIZED : result;
  }

  public static final int KBFOAMGJIGC_FIELD_NUMBER = 2;
  private int kbfoamgjigc_;
  /**
   * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
   * @return The enum numeric value on the wire for kbfoamgjigc.
   */
  @java.lang.Override public int getKbfoamgjigcValue() {
    return kbfoamgjigc_;
  }
  /**
   * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
   * @return The kbfoamgjigc.
   */
  @java.lang.Override public POGOProtos.Rpc.PoiImageType getKbfoamgjigc() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PoiImageType result = POGOProtos.Rpc.PoiImageType.valueOf(kbfoamgjigc_);
    return result == null ? POGOProtos.Rpc.PoiImageType.UNRECOGNIZED : result;
  }

  public static final int NOBAOIHMGLN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nobaoihmgln_;
  /**
   * <code>string nobaoihmgln = 3;</code>
   * @return The nobaoihmgln.
   */
  @java.lang.Override
  public java.lang.String getNobaoihmgln() {
    java.lang.Object ref = nobaoihmgln_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nobaoihmgln_ = s;
      return s;
    }
  }
  /**
   * <code>string nobaoihmgln = 3;</code>
   * @return The bytes for nobaoihmgln.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNobaoihmglnBytes() {
    java.lang.Object ref = nobaoihmgln_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nobaoihmgln_ = b;
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
    if (hncojddbiio_ != POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ.UNSET.getNumber()) {
      output.writeEnum(1, hncojddbiio_);
    }
    if (kbfoamgjigc_ != POGOProtos.Rpc.PoiImageType.POI_IMAGE_TYPE_UNSET.getNumber()) {
      output.writeEnum(2, kbfoamgjigc_);
    }
    if (!getNobaoihmglnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nobaoihmgln_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hncojddbiio_ != POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hncojddbiio_);
    }
    if (kbfoamgjigc_ != POGOProtos.Rpc.PoiImageType.POI_IMAGE_TYPE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, kbfoamgjigc_);
    }
    if (!getNobaoihmglnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nobaoihmgln_);
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
    if (!(obj instanceof POGOProtos.Rpc.PEAOBONCJBN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PEAOBONCJBN other = (POGOProtos.Rpc.PEAOBONCJBN) obj;

    if (hncojddbiio_ != other.hncojddbiio_) return false;
    if (kbfoamgjigc_ != other.kbfoamgjigc_) return false;
    if (!getNobaoihmgln()
        .equals(other.getNobaoihmgln())) return false;
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
    hash = (37 * hash) + HNCOJDDBIIO_FIELD_NUMBER;
    hash = (53 * hash) + hncojddbiio_;
    hash = (37 * hash) + KBFOAMGJIGC_FIELD_NUMBER;
    hash = (53 * hash) + kbfoamgjigc_;
    hash = (37 * hash) + NOBAOIHMGLN_FIELD_NUMBER;
    hash = (53 * hash) + getNobaoihmgln().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEAOBONCJBN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PEAOBONCJBN prototype) {
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
   * ref: PEAOBONCJBN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PEAOBONCJBN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PEAOBONCJBN)
      POGOProtos.Rpc.PEAOBONCJBNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEAOBONCJBN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEAOBONCJBN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PEAOBONCJBN.class, POGOProtos.Rpc.PEAOBONCJBN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PEAOBONCJBN.newBuilder()
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
      hncojddbiio_ = 0;

      kbfoamgjigc_ = 0;

      nobaoihmgln_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PEAOBONCJBN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEAOBONCJBN getDefaultInstanceForType() {
      return POGOProtos.Rpc.PEAOBONCJBN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEAOBONCJBN build() {
      POGOProtos.Rpc.PEAOBONCJBN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEAOBONCJBN buildPartial() {
      POGOProtos.Rpc.PEAOBONCJBN result = new POGOProtos.Rpc.PEAOBONCJBN(this);
      result.hncojddbiio_ = hncojddbiio_;
      result.kbfoamgjigc_ = kbfoamgjigc_;
      result.nobaoihmgln_ = nobaoihmgln_;
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
      if (other instanceof POGOProtos.Rpc.PEAOBONCJBN) {
        return mergeFrom((POGOProtos.Rpc.PEAOBONCJBN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PEAOBONCJBN other) {
      if (other == POGOProtos.Rpc.PEAOBONCJBN.getDefaultInstance()) return this;
      if (other.hncojddbiio_ != 0) {
        setHncojddbiioValue(other.getHncojddbiioValue());
      }
      if (other.kbfoamgjigc_ != 0) {
        setKbfoamgjigcValue(other.getKbfoamgjigcValue());
      }
      if (!other.getNobaoihmgln().isEmpty()) {
        nobaoihmgln_ = other.nobaoihmgln_;
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
      POGOProtos.Rpc.PEAOBONCJBN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PEAOBONCJBN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hncojddbiio_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
     * @return The enum numeric value on the wire for hncojddbiio.
     */
    @java.lang.Override public int getHncojddbiioValue() {
      return hncojddbiio_;
    }
    /**
     * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
     * @param value The enum numeric value on the wire for hncojddbiio to set.
     * @return This builder for chaining.
     */
    public Builder setHncojddbiioValue(int value) {
      
      hncojddbiio_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
     * @return The hncojddbiio.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ getHncojddbiio() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ result = POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ.valueOf(hncojddbiio_);
      return result == null ? POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
     * @param value The hncojddbiio to set.
     * @return This builder for chaining.
     */
    public Builder setHncojddbiio(POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hncojddbiio_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PEAOBONCJBN.FCMLGPGMGNJ hncojddbiio = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHncojddbiio() {
      
      hncojddbiio_ = 0;
      onChanged();
      return this;
    }

    private int kbfoamgjigc_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
     * @return The enum numeric value on the wire for kbfoamgjigc.
     */
    @java.lang.Override public int getKbfoamgjigcValue() {
      return kbfoamgjigc_;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
     * @param value The enum numeric value on the wire for kbfoamgjigc to set.
     * @return This builder for chaining.
     */
    public Builder setKbfoamgjigcValue(int value) {
      
      kbfoamgjigc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
     * @return The kbfoamgjigc.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PoiImageType getKbfoamgjigc() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PoiImageType result = POGOProtos.Rpc.PoiImageType.valueOf(kbfoamgjigc_);
      return result == null ? POGOProtos.Rpc.PoiImageType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
     * @param value The kbfoamgjigc to set.
     * @return This builder for chaining.
     */
    public Builder setKbfoamgjigc(POGOProtos.Rpc.PoiImageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kbfoamgjigc_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PoiImageType kbfoamgjigc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKbfoamgjigc() {
      
      kbfoamgjigc_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nobaoihmgln_ = "";
    /**
     * <code>string nobaoihmgln = 3;</code>
     * @return The nobaoihmgln.
     */
    public java.lang.String getNobaoihmgln() {
      java.lang.Object ref = nobaoihmgln_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nobaoihmgln_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nobaoihmgln = 3;</code>
     * @return The bytes for nobaoihmgln.
     */
    public com.google.protobuf.ByteString
        getNobaoihmglnBytes() {
      java.lang.Object ref = nobaoihmgln_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nobaoihmgln_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nobaoihmgln = 3;</code>
     * @param value The nobaoihmgln to set.
     * @return This builder for chaining.
     */
    public Builder setNobaoihmgln(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nobaoihmgln_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nobaoihmgln = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNobaoihmgln() {
      
      nobaoihmgln_ = getDefaultInstance().getNobaoihmgln();
      onChanged();
      return this;
    }
    /**
     * <code>string nobaoihmgln = 3;</code>
     * @param value The bytes for nobaoihmgln to set.
     * @return This builder for chaining.
     */
    public Builder setNobaoihmglnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nobaoihmgln_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PEAOBONCJBN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PEAOBONCJBN)
  private static final POGOProtos.Rpc.PEAOBONCJBN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PEAOBONCJBN();
  }

  public static POGOProtos.Rpc.PEAOBONCJBN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PEAOBONCJBN>
      PARSER = new com.google.protobuf.AbstractParser<PEAOBONCJBN>() {
    @java.lang.Override
    public PEAOBONCJBN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PEAOBONCJBN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PEAOBONCJBN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PEAOBONCJBN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PEAOBONCJBN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
