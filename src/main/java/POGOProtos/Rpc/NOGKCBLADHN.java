// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NOGKCBLADHN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NOGKCBLADHN}
 */
public final class NOGKCBLADHN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NOGKCBLADHN)
    NOGKCBLADHNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NOGKCBLADHN.newBuilder() to construct.
  private NOGKCBLADHN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NOGKCBLADHN() {
    gnkgaimjkch_ = 0;
    alflaepafnn_ = "";
    combatLeagueTemplateId_ = "";
    ibmcmgndmha_ = "";
    jnojmednlil_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NOGKCBLADHN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NOGKCBLADHN(
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
            int rawValue = input.readEnum();

            gnkgaimjkch_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            alflaepafnn_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            combatLeagueTemplateId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            ibmcmgndmha_ = s;
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jnojmednlil_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            jnojmednlil_.addLong(input.readUInt64());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              jnojmednlil_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              jnojmednlil_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
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
        jnojmednlil_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOGKCBLADHN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOGKCBLADHN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NOGKCBLADHN.class, POGOProtos.Rpc.NOGKCBLADHN.Builder.class);
  }

  public static final int GNKGAIMJKCH_FIELD_NUMBER = 1;
  private int gnkgaimjkch_;
  /**
   * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
   * @return The enum numeric value on the wire for gnkgaimjkch.
   */
  @java.lang.Override public int getGnkgaimjkchValue() {
    return gnkgaimjkch_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
   * @return The gnkgaimjkch.
   */
  @java.lang.Override public POGOProtos.Rpc.CombatType getGnkgaimjkch() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CombatType result = POGOProtos.Rpc.CombatType.valueOf(gnkgaimjkch_);
    return result == null ? POGOProtos.Rpc.CombatType.UNRECOGNIZED : result;
  }

  public static final int ALFLAEPAFNN_FIELD_NUMBER = 2;
  private volatile java.lang.Object alflaepafnn_;
  /**
   * <code>string alflaepafnn = 2;</code>
   * @return The alflaepafnn.
   */
  @java.lang.Override
  public java.lang.String getAlflaepafnn() {
    java.lang.Object ref = alflaepafnn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alflaepafnn_ = s;
      return s;
    }
  }
  /**
   * <code>string alflaepafnn = 2;</code>
   * @return The bytes for alflaepafnn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlflaepafnnBytes() {
    java.lang.Object ref = alflaepafnn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alflaepafnn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMBAT_LEAGUE_TEMPLATE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object combatLeagueTemplateId_;
  /**
   * <code>string combat_league_template_id = 3;</code>
   * @return The combatLeagueTemplateId.
   */
  @java.lang.Override
  public java.lang.String getCombatLeagueTemplateId() {
    java.lang.Object ref = combatLeagueTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      combatLeagueTemplateId_ = s;
      return s;
    }
  }
  /**
   * <code>string combat_league_template_id = 3;</code>
   * @return The bytes for combatLeagueTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCombatLeagueTemplateIdBytes() {
    java.lang.Object ref = combatLeagueTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      combatLeagueTemplateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IBMCMGNDMHA_FIELD_NUMBER = 4;
  private volatile java.lang.Object ibmcmgndmha_;
  /**
   * <code>string ibmcmgndmha = 4;</code>
   * @return The ibmcmgndmha.
   */
  @java.lang.Override
  public java.lang.String getIbmcmgndmha() {
    java.lang.Object ref = ibmcmgndmha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ibmcmgndmha_ = s;
      return s;
    }
  }
  /**
   * <code>string ibmcmgndmha = 4;</code>
   * @return The bytes for ibmcmgndmha.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIbmcmgndmhaBytes() {
    java.lang.Object ref = ibmcmgndmha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ibmcmgndmha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JNOJMEDNLIL_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.LongList jnojmednlil_;
  /**
   * <code>repeated uint64 jnojmednlil = 5;</code>
   * @return A list containing the jnojmednlil.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getJnojmednlilList() {
    return jnojmednlil_;
  }
  /**
   * <code>repeated uint64 jnojmednlil = 5;</code>
   * @return The count of jnojmednlil.
   */
  public int getJnojmednlilCount() {
    return jnojmednlil_.size();
  }
  /**
   * <code>repeated uint64 jnojmednlil = 5;</code>
   * @param index The index of the element to return.
   * @return The jnojmednlil at the given index.
   */
  public long getJnojmednlil(int index) {
    return jnojmednlil_.getLong(index);
  }
  private int jnojmednlilMemoizedSerializedSize = -1;

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
    if (gnkgaimjkch_ != POGOProtos.Rpc.CombatType.COMBAT_TYPE_COMBAT_TYPE_UNSET.getNumber()) {
      output.writeEnum(1, gnkgaimjkch_);
    }
    if (!getAlflaepafnnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, alflaepafnn_);
    }
    if (!getCombatLeagueTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, combatLeagueTemplateId_);
    }
    if (!getIbmcmgndmhaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ibmcmgndmha_);
    }
    if (getJnojmednlilList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(jnojmednlilMemoizedSerializedSize);
    }
    for (int i = 0; i < jnojmednlil_.size(); i++) {
      output.writeUInt64NoTag(jnojmednlil_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gnkgaimjkch_ != POGOProtos.Rpc.CombatType.COMBAT_TYPE_COMBAT_TYPE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, gnkgaimjkch_);
    }
    if (!getAlflaepafnnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, alflaepafnn_);
    }
    if (!getCombatLeagueTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, combatLeagueTemplateId_);
    }
    if (!getIbmcmgndmhaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ibmcmgndmha_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < jnojmednlil_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(jnojmednlil_.getLong(i));
      }
      size += dataSize;
      if (!getJnojmednlilList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      jnojmednlilMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof POGOProtos.Rpc.NOGKCBLADHN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NOGKCBLADHN other = (POGOProtos.Rpc.NOGKCBLADHN) obj;

    if (gnkgaimjkch_ != other.gnkgaimjkch_) return false;
    if (!getAlflaepafnn()
        .equals(other.getAlflaepafnn())) return false;
    if (!getCombatLeagueTemplateId()
        .equals(other.getCombatLeagueTemplateId())) return false;
    if (!getIbmcmgndmha()
        .equals(other.getIbmcmgndmha())) return false;
    if (!getJnojmednlilList()
        .equals(other.getJnojmednlilList())) return false;
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
    hash = (37 * hash) + GNKGAIMJKCH_FIELD_NUMBER;
    hash = (53 * hash) + gnkgaimjkch_;
    hash = (37 * hash) + ALFLAEPAFNN_FIELD_NUMBER;
    hash = (53 * hash) + getAlflaepafnn().hashCode();
    hash = (37 * hash) + COMBAT_LEAGUE_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCombatLeagueTemplateId().hashCode();
    hash = (37 * hash) + IBMCMGNDMHA_FIELD_NUMBER;
    hash = (53 * hash) + getIbmcmgndmha().hashCode();
    if (getJnojmednlilCount() > 0) {
      hash = (37 * hash) + JNOJMEDNLIL_FIELD_NUMBER;
      hash = (53 * hash) + getJnojmednlilList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NOGKCBLADHN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NOGKCBLADHN prototype) {
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
   * ref: NOGKCBLADHN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NOGKCBLADHN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NOGKCBLADHN)
      POGOProtos.Rpc.NOGKCBLADHNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOGKCBLADHN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOGKCBLADHN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NOGKCBLADHN.class, POGOProtos.Rpc.NOGKCBLADHN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NOGKCBLADHN.newBuilder()
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
      gnkgaimjkch_ = 0;

      alflaepafnn_ = "";

      combatLeagueTemplateId_ = "";

      ibmcmgndmha_ = "";

      jnojmednlil_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NOGKCBLADHN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOGKCBLADHN getDefaultInstanceForType() {
      return POGOProtos.Rpc.NOGKCBLADHN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOGKCBLADHN build() {
      POGOProtos.Rpc.NOGKCBLADHN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NOGKCBLADHN buildPartial() {
      POGOProtos.Rpc.NOGKCBLADHN result = new POGOProtos.Rpc.NOGKCBLADHN(this);
      int from_bitField0_ = bitField0_;
      result.gnkgaimjkch_ = gnkgaimjkch_;
      result.alflaepafnn_ = alflaepafnn_;
      result.combatLeagueTemplateId_ = combatLeagueTemplateId_;
      result.ibmcmgndmha_ = ibmcmgndmha_;
      if (((bitField0_ & 0x00000001) != 0)) {
        jnojmednlil_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.jnojmednlil_ = jnojmednlil_;
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
      if (other instanceof POGOProtos.Rpc.NOGKCBLADHN) {
        return mergeFrom((POGOProtos.Rpc.NOGKCBLADHN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NOGKCBLADHN other) {
      if (other == POGOProtos.Rpc.NOGKCBLADHN.getDefaultInstance()) return this;
      if (other.gnkgaimjkch_ != 0) {
        setGnkgaimjkchValue(other.getGnkgaimjkchValue());
      }
      if (!other.getAlflaepafnn().isEmpty()) {
        alflaepafnn_ = other.alflaepafnn_;
        onChanged();
      }
      if (!other.getCombatLeagueTemplateId().isEmpty()) {
        combatLeagueTemplateId_ = other.combatLeagueTemplateId_;
        onChanged();
      }
      if (!other.getIbmcmgndmha().isEmpty()) {
        ibmcmgndmha_ = other.ibmcmgndmha_;
        onChanged();
      }
      if (!other.jnojmednlil_.isEmpty()) {
        if (jnojmednlil_.isEmpty()) {
          jnojmednlil_ = other.jnojmednlil_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureJnojmednlilIsMutable();
          jnojmednlil_.addAll(other.jnojmednlil_);
        }
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
      POGOProtos.Rpc.NOGKCBLADHN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NOGKCBLADHN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int gnkgaimjkch_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
     * @return The enum numeric value on the wire for gnkgaimjkch.
     */
    @java.lang.Override public int getGnkgaimjkchValue() {
      return gnkgaimjkch_;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
     * @param value The enum numeric value on the wire for gnkgaimjkch to set.
     * @return This builder for chaining.
     */
    public Builder setGnkgaimjkchValue(int value) {
      
      gnkgaimjkch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
     * @return The gnkgaimjkch.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CombatType getGnkgaimjkch() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CombatType result = POGOProtos.Rpc.CombatType.valueOf(gnkgaimjkch_);
      return result == null ? POGOProtos.Rpc.CombatType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
     * @param value The gnkgaimjkch to set.
     * @return This builder for chaining.
     */
    public Builder setGnkgaimjkch(POGOProtos.Rpc.CombatType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gnkgaimjkch_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatType gnkgaimjkch = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGnkgaimjkch() {
      
      gnkgaimjkch_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object alflaepafnn_ = "";
    /**
     * <code>string alflaepafnn = 2;</code>
     * @return The alflaepafnn.
     */
    public java.lang.String getAlflaepafnn() {
      java.lang.Object ref = alflaepafnn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alflaepafnn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alflaepafnn = 2;</code>
     * @return The bytes for alflaepafnn.
     */
    public com.google.protobuf.ByteString
        getAlflaepafnnBytes() {
      java.lang.Object ref = alflaepafnn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alflaepafnn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alflaepafnn = 2;</code>
     * @param value The alflaepafnn to set.
     * @return This builder for chaining.
     */
    public Builder setAlflaepafnn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alflaepafnn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alflaepafnn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlflaepafnn() {
      
      alflaepafnn_ = getDefaultInstance().getAlflaepafnn();
      onChanged();
      return this;
    }
    /**
     * <code>string alflaepafnn = 2;</code>
     * @param value The bytes for alflaepafnn to set.
     * @return This builder for chaining.
     */
    public Builder setAlflaepafnnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alflaepafnn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object combatLeagueTemplateId_ = "";
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @return The combatLeagueTemplateId.
     */
    public java.lang.String getCombatLeagueTemplateId() {
      java.lang.Object ref = combatLeagueTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        combatLeagueTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @return The bytes for combatLeagueTemplateId.
     */
    public com.google.protobuf.ByteString
        getCombatLeagueTemplateIdBytes() {
      java.lang.Object ref = combatLeagueTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        combatLeagueTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @param value The combatLeagueTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatLeagueTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      combatLeagueTemplateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatLeagueTemplateId() {
      
      combatLeagueTemplateId_ = getDefaultInstance().getCombatLeagueTemplateId();
      onChanged();
      return this;
    }
    /**
     * <code>string combat_league_template_id = 3;</code>
     * @param value The bytes for combatLeagueTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatLeagueTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      combatLeagueTemplateId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ibmcmgndmha_ = "";
    /**
     * <code>string ibmcmgndmha = 4;</code>
     * @return The ibmcmgndmha.
     */
    public java.lang.String getIbmcmgndmha() {
      java.lang.Object ref = ibmcmgndmha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ibmcmgndmha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ibmcmgndmha = 4;</code>
     * @return The bytes for ibmcmgndmha.
     */
    public com.google.protobuf.ByteString
        getIbmcmgndmhaBytes() {
      java.lang.Object ref = ibmcmgndmha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ibmcmgndmha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ibmcmgndmha = 4;</code>
     * @param value The ibmcmgndmha to set.
     * @return This builder for chaining.
     */
    public Builder setIbmcmgndmha(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ibmcmgndmha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ibmcmgndmha = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIbmcmgndmha() {
      
      ibmcmgndmha_ = getDefaultInstance().getIbmcmgndmha();
      onChanged();
      return this;
    }
    /**
     * <code>string ibmcmgndmha = 4;</code>
     * @param value The bytes for ibmcmgndmha to set.
     * @return This builder for chaining.
     */
    public Builder setIbmcmgndmhaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ibmcmgndmha_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList jnojmednlil_ = emptyLongList();
    private void ensureJnojmednlilIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jnojmednlil_ = mutableCopy(jnojmednlil_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @return A list containing the jnojmednlil.
     */
    public java.util.List<java.lang.Long>
        getJnojmednlilList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(jnojmednlil_) : jnojmednlil_;
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @return The count of jnojmednlil.
     */
    public int getJnojmednlilCount() {
      return jnojmednlil_.size();
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @param index The index of the element to return.
     * @return The jnojmednlil at the given index.
     */
    public long getJnojmednlil(int index) {
      return jnojmednlil_.getLong(index);
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @param index The index to set the value at.
     * @param value The jnojmednlil to set.
     * @return This builder for chaining.
     */
    public Builder setJnojmednlil(
        int index, long value) {
      ensureJnojmednlilIsMutable();
      jnojmednlil_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @param value The jnojmednlil to add.
     * @return This builder for chaining.
     */
    public Builder addJnojmednlil(long value) {
      ensureJnojmednlilIsMutable();
      jnojmednlil_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @param values The jnojmednlil to add.
     * @return This builder for chaining.
     */
    public Builder addAllJnojmednlil(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureJnojmednlilIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jnojmednlil_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 jnojmednlil = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJnojmednlil() {
      jnojmednlil_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NOGKCBLADHN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NOGKCBLADHN)
  private static final POGOProtos.Rpc.NOGKCBLADHN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NOGKCBLADHN();
  }

  public static POGOProtos.Rpc.NOGKCBLADHN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NOGKCBLADHN>
      PARSER = new com.google.protobuf.AbstractParser<NOGKCBLADHN>() {
    @java.lang.Override
    public NOGKCBLADHN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NOGKCBLADHN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NOGKCBLADHN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NOGKCBLADHN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NOGKCBLADHN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

