// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BMKIJFBLFAN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BMKIJFBLFAN}
 */
public final class BMKIJFBLFAN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BMKIJFBLFAN)
    BMKIJFBLFANOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BMKIJFBLFAN.newBuilder() to construct.
  private BMKIJFBLFAN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BMKIJFBLFAN() {
    jnojmednlil_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BMKIJFBLFAN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BMKIJFBLFAN(
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
          case 10: {
            POGOProtos.Rpc.LAKEAGGMIEH.Builder subBuilder = null;
            if (cnebdbnmgok_ != null) {
              subBuilder = cnebdbnmgok_.toBuilder();
            }
            cnebdbnmgok_ = input.readMessage(POGOProtos.Rpc.LAKEAGGMIEH.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cnebdbnmgok_);
              cnebdbnmgok_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            mnmgifhddom_ = input.readInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jnojmednlil_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            jnojmednlil_.addLong(input.readUInt64());
            break;
          }
          case 26: {
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
          case 32: {

            dmmcbhcceml_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMKIJFBLFAN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMKIJFBLFAN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BMKIJFBLFAN.class, POGOProtos.Rpc.BMKIJFBLFAN.Builder.class);
  }

  public static final int CNEBDBNMGOK_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok_;
  /**
   * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
   * @return Whether the cnebdbnmgok field is set.
   */
  @java.lang.Override
  public boolean hasCnebdbnmgok() {
    return cnebdbnmgok_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
   * @return The cnebdbnmgok.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LAKEAGGMIEH getCnebdbnmgok() {
    return cnebdbnmgok_ == null ? POGOProtos.Rpc.LAKEAGGMIEH.getDefaultInstance() : cnebdbnmgok_;
  }
  /**
   * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LAKEAGGMIEHOrBuilder getCnebdbnmgokOrBuilder() {
    return getCnebdbnmgok();
  }

  public static final int MNMGIFHDDOM_FIELD_NUMBER = 2;
  private int mnmgifhddom_;
  /**
   * <code>int32 mnmgifhddom = 2;</code>
   * @return The mnmgifhddom.
   */
  @java.lang.Override
  public int getMnmgifhddom() {
    return mnmgifhddom_;
  }

  public static final int JNOJMEDNLIL_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList jnojmednlil_;
  /**
   * <code>repeated uint64 jnojmednlil = 3;</code>
   * @return A list containing the jnojmednlil.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getJnojmednlilList() {
    return jnojmednlil_;
  }
  /**
   * <code>repeated uint64 jnojmednlil = 3;</code>
   * @return The count of jnojmednlil.
   */
  public int getJnojmednlilCount() {
    return jnojmednlil_.size();
  }
  /**
   * <code>repeated uint64 jnojmednlil = 3;</code>
   * @param index The index of the element to return.
   * @return The jnojmednlil at the given index.
   */
  public long getJnojmednlil(int index) {
    return jnojmednlil_.getLong(index);
  }
  private int jnojmednlilMemoizedSerializedSize = -1;

  public static final int DMMCBHCCEML_FIELD_NUMBER = 4;
  private long dmmcbhcceml_;
  /**
   * <code>int64 dmmcbhcceml = 4;</code>
   * @return The dmmcbhcceml.
   */
  @java.lang.Override
  public long getDmmcbhcceml() {
    return dmmcbhcceml_;
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
    if (cnebdbnmgok_ != null) {
      output.writeMessage(1, getCnebdbnmgok());
    }
    if (mnmgifhddom_ != 0) {
      output.writeInt32(2, mnmgifhddom_);
    }
    if (getJnojmednlilList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(jnojmednlilMemoizedSerializedSize);
    }
    for (int i = 0; i < jnojmednlil_.size(); i++) {
      output.writeUInt64NoTag(jnojmednlil_.getLong(i));
    }
    if (dmmcbhcceml_ != 0L) {
      output.writeInt64(4, dmmcbhcceml_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cnebdbnmgok_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCnebdbnmgok());
    }
    if (mnmgifhddom_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, mnmgifhddom_);
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
    if (dmmcbhcceml_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, dmmcbhcceml_);
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
    if (!(obj instanceof POGOProtos.Rpc.BMKIJFBLFAN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BMKIJFBLFAN other = (POGOProtos.Rpc.BMKIJFBLFAN) obj;

    if (hasCnebdbnmgok() != other.hasCnebdbnmgok()) return false;
    if (hasCnebdbnmgok()) {
      if (!getCnebdbnmgok()
          .equals(other.getCnebdbnmgok())) return false;
    }
    if (getMnmgifhddom()
        != other.getMnmgifhddom()) return false;
    if (!getJnojmednlilList()
        .equals(other.getJnojmednlilList())) return false;
    if (getDmmcbhcceml()
        != other.getDmmcbhcceml()) return false;
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
    if (hasCnebdbnmgok()) {
      hash = (37 * hash) + CNEBDBNMGOK_FIELD_NUMBER;
      hash = (53 * hash) + getCnebdbnmgok().hashCode();
    }
    hash = (37 * hash) + MNMGIFHDDOM_FIELD_NUMBER;
    hash = (53 * hash) + getMnmgifhddom();
    if (getJnojmednlilCount() > 0) {
      hash = (37 * hash) + JNOJMEDNLIL_FIELD_NUMBER;
      hash = (53 * hash) + getJnojmednlilList().hashCode();
    }
    hash = (37 * hash) + DMMCBHCCEML_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDmmcbhcceml());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BMKIJFBLFAN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BMKIJFBLFAN prototype) {
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
   * ref: BMKIJFBLFAN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BMKIJFBLFAN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BMKIJFBLFAN)
      POGOProtos.Rpc.BMKIJFBLFANOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMKIJFBLFAN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMKIJFBLFAN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BMKIJFBLFAN.class, POGOProtos.Rpc.BMKIJFBLFAN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BMKIJFBLFAN.newBuilder()
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
      if (cnebdbnmgokBuilder_ == null) {
        cnebdbnmgok_ = null;
      } else {
        cnebdbnmgok_ = null;
        cnebdbnmgokBuilder_ = null;
      }
      mnmgifhddom_ = 0;

      jnojmednlil_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      dmmcbhcceml_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BMKIJFBLFAN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BMKIJFBLFAN getDefaultInstanceForType() {
      return POGOProtos.Rpc.BMKIJFBLFAN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BMKIJFBLFAN build() {
      POGOProtos.Rpc.BMKIJFBLFAN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BMKIJFBLFAN buildPartial() {
      POGOProtos.Rpc.BMKIJFBLFAN result = new POGOProtos.Rpc.BMKIJFBLFAN(this);
      int from_bitField0_ = bitField0_;
      if (cnebdbnmgokBuilder_ == null) {
        result.cnebdbnmgok_ = cnebdbnmgok_;
      } else {
        result.cnebdbnmgok_ = cnebdbnmgokBuilder_.build();
      }
      result.mnmgifhddom_ = mnmgifhddom_;
      if (((bitField0_ & 0x00000001) != 0)) {
        jnojmednlil_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.jnojmednlil_ = jnojmednlil_;
      result.dmmcbhcceml_ = dmmcbhcceml_;
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
      if (other instanceof POGOProtos.Rpc.BMKIJFBLFAN) {
        return mergeFrom((POGOProtos.Rpc.BMKIJFBLFAN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BMKIJFBLFAN other) {
      if (other == POGOProtos.Rpc.BMKIJFBLFAN.getDefaultInstance()) return this;
      if (other.hasCnebdbnmgok()) {
        mergeCnebdbnmgok(other.getCnebdbnmgok());
      }
      if (other.getMnmgifhddom() != 0) {
        setMnmgifhddom(other.getMnmgifhddom());
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
      if (other.getDmmcbhcceml() != 0L) {
        setDmmcbhcceml(other.getDmmcbhcceml());
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
      POGOProtos.Rpc.BMKIJFBLFAN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BMKIJFBLFAN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LAKEAGGMIEH, POGOProtos.Rpc.LAKEAGGMIEH.Builder, POGOProtos.Rpc.LAKEAGGMIEHOrBuilder> cnebdbnmgokBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     * @return Whether the cnebdbnmgok field is set.
     */
    public boolean hasCnebdbnmgok() {
      return cnebdbnmgokBuilder_ != null || cnebdbnmgok_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     * @return The cnebdbnmgok.
     */
    public POGOProtos.Rpc.LAKEAGGMIEH getCnebdbnmgok() {
      if (cnebdbnmgokBuilder_ == null) {
        return cnebdbnmgok_ == null ? POGOProtos.Rpc.LAKEAGGMIEH.getDefaultInstance() : cnebdbnmgok_;
      } else {
        return cnebdbnmgokBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    public Builder setCnebdbnmgok(POGOProtos.Rpc.LAKEAGGMIEH value) {
      if (cnebdbnmgokBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cnebdbnmgok_ = value;
        onChanged();
      } else {
        cnebdbnmgokBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    public Builder setCnebdbnmgok(
        POGOProtos.Rpc.LAKEAGGMIEH.Builder builderForValue) {
      if (cnebdbnmgokBuilder_ == null) {
        cnebdbnmgok_ = builderForValue.build();
        onChanged();
      } else {
        cnebdbnmgokBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    public Builder mergeCnebdbnmgok(POGOProtos.Rpc.LAKEAGGMIEH value) {
      if (cnebdbnmgokBuilder_ == null) {
        if (cnebdbnmgok_ != null) {
          cnebdbnmgok_ =
            POGOProtos.Rpc.LAKEAGGMIEH.newBuilder(cnebdbnmgok_).mergeFrom(value).buildPartial();
        } else {
          cnebdbnmgok_ = value;
        }
        onChanged();
      } else {
        cnebdbnmgokBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    public Builder clearCnebdbnmgok() {
      if (cnebdbnmgokBuilder_ == null) {
        cnebdbnmgok_ = null;
        onChanged();
      } else {
        cnebdbnmgok_ = null;
        cnebdbnmgokBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    public POGOProtos.Rpc.LAKEAGGMIEH.Builder getCnebdbnmgokBuilder() {
      
      onChanged();
      return getCnebdbnmgokFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    public POGOProtos.Rpc.LAKEAGGMIEHOrBuilder getCnebdbnmgokOrBuilder() {
      if (cnebdbnmgokBuilder_ != null) {
        return cnebdbnmgokBuilder_.getMessageOrBuilder();
      } else {
        return cnebdbnmgok_ == null ?
            POGOProtos.Rpc.LAKEAGGMIEH.getDefaultInstance() : cnebdbnmgok_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LAKEAGGMIEH cnebdbnmgok = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LAKEAGGMIEH, POGOProtos.Rpc.LAKEAGGMIEH.Builder, POGOProtos.Rpc.LAKEAGGMIEHOrBuilder> 
        getCnebdbnmgokFieldBuilder() {
      if (cnebdbnmgokBuilder_ == null) {
        cnebdbnmgokBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LAKEAGGMIEH, POGOProtos.Rpc.LAKEAGGMIEH.Builder, POGOProtos.Rpc.LAKEAGGMIEHOrBuilder>(
                getCnebdbnmgok(),
                getParentForChildren(),
                isClean());
        cnebdbnmgok_ = null;
      }
      return cnebdbnmgokBuilder_;
    }

    private int mnmgifhddom_ ;
    /**
     * <code>int32 mnmgifhddom = 2;</code>
     * @return The mnmgifhddom.
     */
    @java.lang.Override
    public int getMnmgifhddom() {
      return mnmgifhddom_;
    }
    /**
     * <code>int32 mnmgifhddom = 2;</code>
     * @param value The mnmgifhddom to set.
     * @return This builder for chaining.
     */
    public Builder setMnmgifhddom(int value) {
      
      mnmgifhddom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mnmgifhddom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMnmgifhddom() {
      
      mnmgifhddom_ = 0;
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
     * <code>repeated uint64 jnojmednlil = 3;</code>
     * @return A list containing the jnojmednlil.
     */
    public java.util.List<java.lang.Long>
        getJnojmednlilList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(jnojmednlil_) : jnojmednlil_;
    }
    /**
     * <code>repeated uint64 jnojmednlil = 3;</code>
     * @return The count of jnojmednlil.
     */
    public int getJnojmednlilCount() {
      return jnojmednlil_.size();
    }
    /**
     * <code>repeated uint64 jnojmednlil = 3;</code>
     * @param index The index of the element to return.
     * @return The jnojmednlil at the given index.
     */
    public long getJnojmednlil(int index) {
      return jnojmednlil_.getLong(index);
    }
    /**
     * <code>repeated uint64 jnojmednlil = 3;</code>
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
     * <code>repeated uint64 jnojmednlil = 3;</code>
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
     * <code>repeated uint64 jnojmednlil = 3;</code>
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
     * <code>repeated uint64 jnojmednlil = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJnojmednlil() {
      jnojmednlil_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long dmmcbhcceml_ ;
    /**
     * <code>int64 dmmcbhcceml = 4;</code>
     * @return The dmmcbhcceml.
     */
    @java.lang.Override
    public long getDmmcbhcceml() {
      return dmmcbhcceml_;
    }
    /**
     * <code>int64 dmmcbhcceml = 4;</code>
     * @param value The dmmcbhcceml to set.
     * @return This builder for chaining.
     */
    public Builder setDmmcbhcceml(long value) {
      
      dmmcbhcceml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 dmmcbhcceml = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDmmcbhcceml() {
      
      dmmcbhcceml_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BMKIJFBLFAN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BMKIJFBLFAN)
  private static final POGOProtos.Rpc.BMKIJFBLFAN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BMKIJFBLFAN();
  }

  public static POGOProtos.Rpc.BMKIJFBLFAN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BMKIJFBLFAN>
      PARSER = new com.google.protobuf.AbstractParser<BMKIJFBLFAN>() {
    @java.lang.Override
    public BMKIJFBLFAN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BMKIJFBLFAN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BMKIJFBLFAN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BMKIJFBLFAN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BMKIJFBLFAN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
