// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NEODGFMEIIK
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NEODGFMEIIK}
 */
public final class NEODGFMEIIK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NEODGFMEIIK)
    NEODGFMEIIKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NEODGFMEIIK.newBuilder() to construct.
  private NEODGFMEIIK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NEODGFMEIIK() {
    fgonpfibkai_ = "";
    jkpcajihcao_ = emptyIntList();
    jkgpgghegjl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NEODGFMEIIK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NEODGFMEIIK(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fgonpfibkai_ = s;
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jkpcajihcao_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            jkpcajihcao_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              jkpcajihcao_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              jkpcajihcao_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 33: {

            nlblgfioeic_ = input.readDouble();
            break;
          }
          case 41: {

            ojnmcebeede_ = input.readDouble();
            break;
          }
          case 49: {

            olfnggmefal_ = input.readDouble();
            break;
          }
          case 57: {

            aocfljninfi_ = input.readDouble();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            jkgpgghegjl_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        jkpcajihcao_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NEODGFMEIIK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NEODGFMEIIK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NEODGFMEIIK.class, POGOProtos.Rpc.NEODGFMEIIK.Builder.class);
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

  public static final int FGONPFIBKAI_FIELD_NUMBER = 2;
  private volatile java.lang.Object fgonpfibkai_;
  /**
   * <code>string fgonpfibkai = 2;</code>
   * @return The fgonpfibkai.
   */
  @java.lang.Override
  public java.lang.String getFgonpfibkai() {
    java.lang.Object ref = fgonpfibkai_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fgonpfibkai_ = s;
      return s;
    }
  }
  /**
   * <code>string fgonpfibkai = 2;</code>
   * @return The bytes for fgonpfibkai.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFgonpfibkaiBytes() {
    java.lang.Object ref = fgonpfibkai_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fgonpfibkai_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JKPCAJIHCAO_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList jkpcajihcao_;
  /**
   * <code>repeated int32 jkpcajihcao = 3;</code>
   * @return A list containing the jkpcajihcao.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getJkpcajihcaoList() {
    return jkpcajihcao_;
  }
  /**
   * <code>repeated int32 jkpcajihcao = 3;</code>
   * @return The count of jkpcajihcao.
   */
  public int getJkpcajihcaoCount() {
    return jkpcajihcao_.size();
  }
  /**
   * <code>repeated int32 jkpcajihcao = 3;</code>
   * @param index The index of the element to return.
   * @return The jkpcajihcao at the given index.
   */
  public int getJkpcajihcao(int index) {
    return jkpcajihcao_.getInt(index);
  }
  private int jkpcajihcaoMemoizedSerializedSize = -1;

  public static final int NLBLGFIOEIC_FIELD_NUMBER = 4;
  private double nlblgfioeic_;
  /**
   * <code>double nlblgfioeic = 4;</code>
   * @return The nlblgfioeic.
   */
  @java.lang.Override
  public double getNlblgfioeic() {
    return nlblgfioeic_;
  }

  public static final int OJNMCEBEEDE_FIELD_NUMBER = 5;
  private double ojnmcebeede_;
  /**
   * <code>double ojnmcebeede = 5;</code>
   * @return The ojnmcebeede.
   */
  @java.lang.Override
  public double getOjnmcebeede() {
    return ojnmcebeede_;
  }

  public static final int OLFNGGMEFAL_FIELD_NUMBER = 6;
  private double olfnggmefal_;
  /**
   * <code>double olfnggmefal = 6;</code>
   * @return The olfnggmefal.
   */
  @java.lang.Override
  public double getOlfnggmefal() {
    return olfnggmefal_;
  }

  public static final int AOCFLJNINFI_FIELD_NUMBER = 7;
  private double aocfljninfi_;
  /**
   * <code>double aocfljninfi = 7;</code>
   * @return The aocfljninfi.
   */
  @java.lang.Override
  public double getAocfljninfi() {
    return aocfljninfi_;
  }

  public static final int JKGPGGHEGJL_FIELD_NUMBER = 8;
  private volatile java.lang.Object jkgpgghegjl_;
  /**
   * <code>string jkgpgghegjl = 8;</code>
   * @return The jkgpgghegjl.
   */
  @java.lang.Override
  public java.lang.String getJkgpgghegjl() {
    java.lang.Object ref = jkgpgghegjl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jkgpgghegjl_ = s;
      return s;
    }
  }
  /**
   * <code>string jkgpgghegjl = 8;</code>
   * @return The bytes for jkgpgghegjl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJkgpgghegjlBytes() {
    java.lang.Object ref = jkgpgghegjl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jkgpgghegjl_ = b;
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
    getSerializedSize();
    if (pdaldoafaaj_ != 0L) {
      output.writeInt64(1, pdaldoafaaj_);
    }
    if (!getFgonpfibkaiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fgonpfibkai_);
    }
    if (getJkpcajihcaoList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(jkpcajihcaoMemoizedSerializedSize);
    }
    for (int i = 0; i < jkpcajihcao_.size(); i++) {
      output.writeInt32NoTag(jkpcajihcao_.getInt(i));
    }
    if (nlblgfioeic_ != 0D) {
      output.writeDouble(4, nlblgfioeic_);
    }
    if (ojnmcebeede_ != 0D) {
      output.writeDouble(5, ojnmcebeede_);
    }
    if (olfnggmefal_ != 0D) {
      output.writeDouble(6, olfnggmefal_);
    }
    if (aocfljninfi_ != 0D) {
      output.writeDouble(7, aocfljninfi_);
    }
    if (!getJkgpgghegjlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, jkgpgghegjl_);
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
    if (!getFgonpfibkaiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fgonpfibkai_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < jkpcajihcao_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(jkpcajihcao_.getInt(i));
      }
      size += dataSize;
      if (!getJkpcajihcaoList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      jkpcajihcaoMemoizedSerializedSize = dataSize;
    }
    if (nlblgfioeic_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, nlblgfioeic_);
    }
    if (ojnmcebeede_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, ojnmcebeede_);
    }
    if (olfnggmefal_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, olfnggmefal_);
    }
    if (aocfljninfi_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, aocfljninfi_);
    }
    if (!getJkgpgghegjlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, jkgpgghegjl_);
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
    if (!(obj instanceof POGOProtos.Rpc.NEODGFMEIIK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NEODGFMEIIK other = (POGOProtos.Rpc.NEODGFMEIIK) obj;

    if (getPdaldoafaaj()
        != other.getPdaldoafaaj()) return false;
    if (!getFgonpfibkai()
        .equals(other.getFgonpfibkai())) return false;
    if (!getJkpcajihcaoList()
        .equals(other.getJkpcajihcaoList())) return false;
    if (java.lang.Double.doubleToLongBits(getNlblgfioeic())
        != java.lang.Double.doubleToLongBits(
            other.getNlblgfioeic())) return false;
    if (java.lang.Double.doubleToLongBits(getOjnmcebeede())
        != java.lang.Double.doubleToLongBits(
            other.getOjnmcebeede())) return false;
    if (java.lang.Double.doubleToLongBits(getOlfnggmefal())
        != java.lang.Double.doubleToLongBits(
            other.getOlfnggmefal())) return false;
    if (java.lang.Double.doubleToLongBits(getAocfljninfi())
        != java.lang.Double.doubleToLongBits(
            other.getAocfljninfi())) return false;
    if (!getJkgpgghegjl()
        .equals(other.getJkgpgghegjl())) return false;
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
    hash = (37 * hash) + FGONPFIBKAI_FIELD_NUMBER;
    hash = (53 * hash) + getFgonpfibkai().hashCode();
    if (getJkpcajihcaoCount() > 0) {
      hash = (37 * hash) + JKPCAJIHCAO_FIELD_NUMBER;
      hash = (53 * hash) + getJkpcajihcaoList().hashCode();
    }
    hash = (37 * hash) + NLBLGFIOEIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNlblgfioeic()));
    hash = (37 * hash) + OJNMCEBEEDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOjnmcebeede()));
    hash = (37 * hash) + OLFNGGMEFAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOlfnggmefal()));
    hash = (37 * hash) + AOCFLJNINFI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAocfljninfi()));
    hash = (37 * hash) + JKGPGGHEGJL_FIELD_NUMBER;
    hash = (53 * hash) + getJkgpgghegjl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NEODGFMEIIK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NEODGFMEIIK prototype) {
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
   * ref: NEODGFMEIIK
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NEODGFMEIIK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NEODGFMEIIK)
      POGOProtos.Rpc.NEODGFMEIIKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NEODGFMEIIK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NEODGFMEIIK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NEODGFMEIIK.class, POGOProtos.Rpc.NEODGFMEIIK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NEODGFMEIIK.newBuilder()
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

      fgonpfibkai_ = "";

      jkpcajihcao_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      nlblgfioeic_ = 0D;

      ojnmcebeede_ = 0D;

      olfnggmefal_ = 0D;

      aocfljninfi_ = 0D;

      jkgpgghegjl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NEODGFMEIIK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NEODGFMEIIK getDefaultInstanceForType() {
      return POGOProtos.Rpc.NEODGFMEIIK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NEODGFMEIIK build() {
      POGOProtos.Rpc.NEODGFMEIIK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NEODGFMEIIK buildPartial() {
      POGOProtos.Rpc.NEODGFMEIIK result = new POGOProtos.Rpc.NEODGFMEIIK(this);
      int from_bitField0_ = bitField0_;
      result.pdaldoafaaj_ = pdaldoafaaj_;
      result.fgonpfibkai_ = fgonpfibkai_;
      if (((bitField0_ & 0x00000001) != 0)) {
        jkpcajihcao_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.jkpcajihcao_ = jkpcajihcao_;
      result.nlblgfioeic_ = nlblgfioeic_;
      result.ojnmcebeede_ = ojnmcebeede_;
      result.olfnggmefal_ = olfnggmefal_;
      result.aocfljninfi_ = aocfljninfi_;
      result.jkgpgghegjl_ = jkgpgghegjl_;
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
      if (other instanceof POGOProtos.Rpc.NEODGFMEIIK) {
        return mergeFrom((POGOProtos.Rpc.NEODGFMEIIK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NEODGFMEIIK other) {
      if (other == POGOProtos.Rpc.NEODGFMEIIK.getDefaultInstance()) return this;
      if (other.getPdaldoafaaj() != 0L) {
        setPdaldoafaaj(other.getPdaldoafaaj());
      }
      if (!other.getFgonpfibkai().isEmpty()) {
        fgonpfibkai_ = other.fgonpfibkai_;
        onChanged();
      }
      if (!other.jkpcajihcao_.isEmpty()) {
        if (jkpcajihcao_.isEmpty()) {
          jkpcajihcao_ = other.jkpcajihcao_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureJkpcajihcaoIsMutable();
          jkpcajihcao_.addAll(other.jkpcajihcao_);
        }
        onChanged();
      }
      if (other.getNlblgfioeic() != 0D) {
        setNlblgfioeic(other.getNlblgfioeic());
      }
      if (other.getOjnmcebeede() != 0D) {
        setOjnmcebeede(other.getOjnmcebeede());
      }
      if (other.getOlfnggmefal() != 0D) {
        setOlfnggmefal(other.getOlfnggmefal());
      }
      if (other.getAocfljninfi() != 0D) {
        setAocfljninfi(other.getAocfljninfi());
      }
      if (!other.getJkgpgghegjl().isEmpty()) {
        jkgpgghegjl_ = other.jkgpgghegjl_;
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
      POGOProtos.Rpc.NEODGFMEIIK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NEODGFMEIIK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.lang.Object fgonpfibkai_ = "";
    /**
     * <code>string fgonpfibkai = 2;</code>
     * @return The fgonpfibkai.
     */
    public java.lang.String getFgonpfibkai() {
      java.lang.Object ref = fgonpfibkai_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fgonpfibkai_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fgonpfibkai = 2;</code>
     * @return The bytes for fgonpfibkai.
     */
    public com.google.protobuf.ByteString
        getFgonpfibkaiBytes() {
      java.lang.Object ref = fgonpfibkai_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fgonpfibkai_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fgonpfibkai = 2;</code>
     * @param value The fgonpfibkai to set.
     * @return This builder for chaining.
     */
    public Builder setFgonpfibkai(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fgonpfibkai_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fgonpfibkai = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFgonpfibkai() {
      
      fgonpfibkai_ = getDefaultInstance().getFgonpfibkai();
      onChanged();
      return this;
    }
    /**
     * <code>string fgonpfibkai = 2;</code>
     * @param value The bytes for fgonpfibkai to set.
     * @return This builder for chaining.
     */
    public Builder setFgonpfibkaiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fgonpfibkai_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList jkpcajihcao_ = emptyIntList();
    private void ensureJkpcajihcaoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jkpcajihcao_ = mutableCopy(jkpcajihcao_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @return A list containing the jkpcajihcao.
     */
    public java.util.List<java.lang.Integer>
        getJkpcajihcaoList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(jkpcajihcao_) : jkpcajihcao_;
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @return The count of jkpcajihcao.
     */
    public int getJkpcajihcaoCount() {
      return jkpcajihcao_.size();
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @param index The index of the element to return.
     * @return The jkpcajihcao at the given index.
     */
    public int getJkpcajihcao(int index) {
      return jkpcajihcao_.getInt(index);
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @param index The index to set the value at.
     * @param value The jkpcajihcao to set.
     * @return This builder for chaining.
     */
    public Builder setJkpcajihcao(
        int index, int value) {
      ensureJkpcajihcaoIsMutable();
      jkpcajihcao_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @param value The jkpcajihcao to add.
     * @return This builder for chaining.
     */
    public Builder addJkpcajihcao(int value) {
      ensureJkpcajihcaoIsMutable();
      jkpcajihcao_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @param values The jkpcajihcao to add.
     * @return This builder for chaining.
     */
    public Builder addAllJkpcajihcao(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureJkpcajihcaoIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jkpcajihcao_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 jkpcajihcao = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJkpcajihcao() {
      jkpcajihcao_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private double nlblgfioeic_ ;
    /**
     * <code>double nlblgfioeic = 4;</code>
     * @return The nlblgfioeic.
     */
    @java.lang.Override
    public double getNlblgfioeic() {
      return nlblgfioeic_;
    }
    /**
     * <code>double nlblgfioeic = 4;</code>
     * @param value The nlblgfioeic to set.
     * @return This builder for chaining.
     */
    public Builder setNlblgfioeic(double value) {
      
      nlblgfioeic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double nlblgfioeic = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNlblgfioeic() {
      
      nlblgfioeic_ = 0D;
      onChanged();
      return this;
    }

    private double ojnmcebeede_ ;
    /**
     * <code>double ojnmcebeede = 5;</code>
     * @return The ojnmcebeede.
     */
    @java.lang.Override
    public double getOjnmcebeede() {
      return ojnmcebeede_;
    }
    /**
     * <code>double ojnmcebeede = 5;</code>
     * @param value The ojnmcebeede to set.
     * @return This builder for chaining.
     */
    public Builder setOjnmcebeede(double value) {
      
      ojnmcebeede_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ojnmcebeede = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOjnmcebeede() {
      
      ojnmcebeede_ = 0D;
      onChanged();
      return this;
    }

    private double olfnggmefal_ ;
    /**
     * <code>double olfnggmefal = 6;</code>
     * @return The olfnggmefal.
     */
    @java.lang.Override
    public double getOlfnggmefal() {
      return olfnggmefal_;
    }
    /**
     * <code>double olfnggmefal = 6;</code>
     * @param value The olfnggmefal to set.
     * @return This builder for chaining.
     */
    public Builder setOlfnggmefal(double value) {
      
      olfnggmefal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double olfnggmefal = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearOlfnggmefal() {
      
      olfnggmefal_ = 0D;
      onChanged();
      return this;
    }

    private double aocfljninfi_ ;
    /**
     * <code>double aocfljninfi = 7;</code>
     * @return The aocfljninfi.
     */
    @java.lang.Override
    public double getAocfljninfi() {
      return aocfljninfi_;
    }
    /**
     * <code>double aocfljninfi = 7;</code>
     * @param value The aocfljninfi to set.
     * @return This builder for chaining.
     */
    public Builder setAocfljninfi(double value) {
      
      aocfljninfi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double aocfljninfi = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearAocfljninfi() {
      
      aocfljninfi_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object jkgpgghegjl_ = "";
    /**
     * <code>string jkgpgghegjl = 8;</code>
     * @return The jkgpgghegjl.
     */
    public java.lang.String getJkgpgghegjl() {
      java.lang.Object ref = jkgpgghegjl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jkgpgghegjl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jkgpgghegjl = 8;</code>
     * @return The bytes for jkgpgghegjl.
     */
    public com.google.protobuf.ByteString
        getJkgpgghegjlBytes() {
      java.lang.Object ref = jkgpgghegjl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jkgpgghegjl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jkgpgghegjl = 8;</code>
     * @param value The jkgpgghegjl to set.
     * @return This builder for chaining.
     */
    public Builder setJkgpgghegjl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jkgpgghegjl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jkgpgghegjl = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearJkgpgghegjl() {
      
      jkgpgghegjl_ = getDefaultInstance().getJkgpgghegjl();
      onChanged();
      return this;
    }
    /**
     * <code>string jkgpgghegjl = 8;</code>
     * @param value The bytes for jkgpgghegjl to set.
     * @return This builder for chaining.
     */
    public Builder setJkgpgghegjlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jkgpgghegjl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NEODGFMEIIK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NEODGFMEIIK)
  private static final POGOProtos.Rpc.NEODGFMEIIK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NEODGFMEIIK();
  }

  public static POGOProtos.Rpc.NEODGFMEIIK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NEODGFMEIIK>
      PARSER = new com.google.protobuf.AbstractParser<NEODGFMEIIK>() {
    @java.lang.Override
    public NEODGFMEIIK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NEODGFMEIIK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NEODGFMEIIK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NEODGFMEIIK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NEODGFMEIIK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

