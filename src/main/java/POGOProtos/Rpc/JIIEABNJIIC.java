// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.JIIEABNJIIC}
 */
public  final class JIIEABNJIIC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JIIEABNJIIC)
    JIIEABNJIICOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JIIEABNJIIC.newBuilder() to construct.
  private JIIEABNJIIC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JIIEABNJIIC() {
    bioopojkjoh_ = emptyLongList();
    nepfbipphpe_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JIIEABNJIIC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JIIEABNJIIC(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bioopojkjoh_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            bioopojkjoh_.addLong(input.readUInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              bioopojkjoh_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              bioopojkjoh_.addLong(input.readUInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              nepfbipphpe_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            nepfbipphpe_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              nepfbipphpe_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              nepfbipphpe_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 25: {

            kchhfnhinno_ = input.readDouble();
            break;
          }
          case 33: {

            peffjhoggfd_ = input.readDouble();
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
        bioopojkjoh_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        nepfbipphpe_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JIIEABNJIIC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JIIEABNJIIC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JIIEABNJIIC.class, POGOProtos.Rpc.JIIEABNJIIC.Builder.class);
  }

  public static final int BIOOPOJKJOH_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList bioopojkjoh_;
  /**
   * <code>repeated uint64 bioopojkjoh = 1;</code>
   * @return A list containing the bioopojkjoh.
   */
  public java.util.List<java.lang.Long>
      getBioopojkjohList() {
    return bioopojkjoh_;
  }
  /**
   * <code>repeated uint64 bioopojkjoh = 1;</code>
   * @return The count of bioopojkjoh.
   */
  public int getBioopojkjohCount() {
    return bioopojkjoh_.size();
  }
  /**
   * <code>repeated uint64 bioopojkjoh = 1;</code>
   * @param index The index of the element to return.
   * @return The bioopojkjoh at the given index.
   */
  public long getBioopojkjoh(int index) {
    return bioopojkjoh_.getLong(index);
  }
  private int bioopojkjohMemoizedSerializedSize = -1;

  public static final int NEPFBIPPHPE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList nepfbipphpe_;
  /**
   * <code>repeated int64 nepfbipphpe = 2;</code>
   * @return A list containing the nepfbipphpe.
   */
  public java.util.List<java.lang.Long>
      getNepfbipphpeList() {
    return nepfbipphpe_;
  }
  /**
   * <code>repeated int64 nepfbipphpe = 2;</code>
   * @return The count of nepfbipphpe.
   */
  public int getNepfbipphpeCount() {
    return nepfbipphpe_.size();
  }
  /**
   * <code>repeated int64 nepfbipphpe = 2;</code>
   * @param index The index of the element to return.
   * @return The nepfbipphpe at the given index.
   */
  public long getNepfbipphpe(int index) {
    return nepfbipphpe_.getLong(index);
  }
  private int nepfbipphpeMemoizedSerializedSize = -1;

  public static final int KCHHFNHINNO_FIELD_NUMBER = 3;
  private double kchhfnhinno_;
  /**
   * <code>double kchhfnhinno = 3;</code>
   * @return The kchhfnhinno.
   */
  public double getKchhfnhinno() {
    return kchhfnhinno_;
  }

  public static final int PEFFJHOGGFD_FIELD_NUMBER = 4;
  private double peffjhoggfd_;
  /**
   * <code>double peffjhoggfd = 4;</code>
   * @return The peffjhoggfd.
   */
  public double getPeffjhoggfd() {
    return peffjhoggfd_;
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
    if (getBioopojkjohList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(bioopojkjohMemoizedSerializedSize);
    }
    for (int i = 0; i < bioopojkjoh_.size(); i++) {
      output.writeUInt64NoTag(bioopojkjoh_.getLong(i));
    }
    if (getNepfbipphpeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(nepfbipphpeMemoizedSerializedSize);
    }
    for (int i = 0; i < nepfbipphpe_.size(); i++) {
      output.writeInt64NoTag(nepfbipphpe_.getLong(i));
    }
    if (kchhfnhinno_ != 0D) {
      output.writeDouble(3, kchhfnhinno_);
    }
    if (peffjhoggfd_ != 0D) {
      output.writeDouble(4, peffjhoggfd_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < bioopojkjoh_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt64SizeNoTag(bioopojkjoh_.getLong(i));
      }
      size += dataSize;
      if (!getBioopojkjohList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bioopojkjohMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      for (int i = 0; i < nepfbipphpe_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(nepfbipphpe_.getLong(i));
      }
      size += dataSize;
      if (!getNepfbipphpeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      nepfbipphpeMemoizedSerializedSize = dataSize;
    }
    if (kchhfnhinno_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, kchhfnhinno_);
    }
    if (peffjhoggfd_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, peffjhoggfd_);
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
    if (!(obj instanceof POGOProtos.Rpc.JIIEABNJIIC)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JIIEABNJIIC other = (POGOProtos.Rpc.JIIEABNJIIC) obj;

    if (!getBioopojkjohList()
        .equals(other.getBioopojkjohList())) return false;
    if (!getNepfbipphpeList()
        .equals(other.getNepfbipphpeList())) return false;
    if (java.lang.Double.doubleToLongBits(getKchhfnhinno())
        != java.lang.Double.doubleToLongBits(
            other.getKchhfnhinno())) return false;
    if (java.lang.Double.doubleToLongBits(getPeffjhoggfd())
        != java.lang.Double.doubleToLongBits(
            other.getPeffjhoggfd())) return false;
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
    if (getBioopojkjohCount() > 0) {
      hash = (37 * hash) + BIOOPOJKJOH_FIELD_NUMBER;
      hash = (53 * hash) + getBioopojkjohList().hashCode();
    }
    if (getNepfbipphpeCount() > 0) {
      hash = (37 * hash) + NEPFBIPPHPE_FIELD_NUMBER;
      hash = (53 * hash) + getNepfbipphpeList().hashCode();
    }
    hash = (37 * hash) + KCHHFNHINNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getKchhfnhinno()));
    hash = (37 * hash) + PEFFJHOGGFD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPeffjhoggfd()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIIEABNJIIC parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JIIEABNJIIC prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.JIIEABNJIIC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JIIEABNJIIC)
      POGOProtos.Rpc.JIIEABNJIICOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JIIEABNJIIC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JIIEABNJIIC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JIIEABNJIIC.class, POGOProtos.Rpc.JIIEABNJIIC.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JIIEABNJIIC.newBuilder()
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
      bioopojkjoh_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      nepfbipphpe_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      kchhfnhinno_ = 0D;

      peffjhoggfd_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JIIEABNJIIC_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIIEABNJIIC getDefaultInstanceForType() {
      return POGOProtos.Rpc.JIIEABNJIIC.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIIEABNJIIC build() {
      POGOProtos.Rpc.JIIEABNJIIC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIIEABNJIIC buildPartial() {
      POGOProtos.Rpc.JIIEABNJIIC result = new POGOProtos.Rpc.JIIEABNJIIC(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        bioopojkjoh_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.bioopojkjoh_ = bioopojkjoh_;
      if (((bitField0_ & 0x00000002) != 0)) {
        nepfbipphpe_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.nepfbipphpe_ = nepfbipphpe_;
      result.kchhfnhinno_ = kchhfnhinno_;
      result.peffjhoggfd_ = peffjhoggfd_;
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
      if (other instanceof POGOProtos.Rpc.JIIEABNJIIC) {
        return mergeFrom((POGOProtos.Rpc.JIIEABNJIIC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JIIEABNJIIC other) {
      if (other == POGOProtos.Rpc.JIIEABNJIIC.getDefaultInstance()) return this;
      if (!other.bioopojkjoh_.isEmpty()) {
        if (bioopojkjoh_.isEmpty()) {
          bioopojkjoh_ = other.bioopojkjoh_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBioopojkjohIsMutable();
          bioopojkjoh_.addAll(other.bioopojkjoh_);
        }
        onChanged();
      }
      if (!other.nepfbipphpe_.isEmpty()) {
        if (nepfbipphpe_.isEmpty()) {
          nepfbipphpe_ = other.nepfbipphpe_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNepfbipphpeIsMutable();
          nepfbipphpe_.addAll(other.nepfbipphpe_);
        }
        onChanged();
      }
      if (other.getKchhfnhinno() != 0D) {
        setKchhfnhinno(other.getKchhfnhinno());
      }
      if (other.getPeffjhoggfd() != 0D) {
        setPeffjhoggfd(other.getPeffjhoggfd());
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
      POGOProtos.Rpc.JIIEABNJIIC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JIIEABNJIIC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList bioopojkjoh_ = emptyLongList();
    private void ensureBioopojkjohIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bioopojkjoh_ = mutableCopy(bioopojkjoh_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @return A list containing the bioopojkjoh.
     */
    public java.util.List<java.lang.Long>
        getBioopojkjohList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(bioopojkjoh_) : bioopojkjoh_;
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @return The count of bioopojkjoh.
     */
    public int getBioopojkjohCount() {
      return bioopojkjoh_.size();
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @param index The index of the element to return.
     * @return The bioopojkjoh at the given index.
     */
    public long getBioopojkjoh(int index) {
      return bioopojkjoh_.getLong(index);
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @param index The index to set the value at.
     * @param value The bioopojkjoh to set.
     * @return This builder for chaining.
     */
    public Builder setBioopojkjoh(
        int index, long value) {
      ensureBioopojkjohIsMutable();
      bioopojkjoh_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @param value The bioopojkjoh to add.
     * @return This builder for chaining.
     */
    public Builder addBioopojkjoh(long value) {
      ensureBioopojkjohIsMutable();
      bioopojkjoh_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @param values The bioopojkjoh to add.
     * @return This builder for chaining.
     */
    public Builder addAllBioopojkjoh(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureBioopojkjohIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bioopojkjoh_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint64 bioopojkjoh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBioopojkjoh() {
      bioopojkjoh_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList nepfbipphpe_ = emptyLongList();
    private void ensureNepfbipphpeIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        nepfbipphpe_ = mutableCopy(nepfbipphpe_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @return A list containing the nepfbipphpe.
     */
    public java.util.List<java.lang.Long>
        getNepfbipphpeList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(nepfbipphpe_) : nepfbipphpe_;
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @return The count of nepfbipphpe.
     */
    public int getNepfbipphpeCount() {
      return nepfbipphpe_.size();
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @param index The index of the element to return.
     * @return The nepfbipphpe at the given index.
     */
    public long getNepfbipphpe(int index) {
      return nepfbipphpe_.getLong(index);
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @param index The index to set the value at.
     * @param value The nepfbipphpe to set.
     * @return This builder for chaining.
     */
    public Builder setNepfbipphpe(
        int index, long value) {
      ensureNepfbipphpeIsMutable();
      nepfbipphpe_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @param value The nepfbipphpe to add.
     * @return This builder for chaining.
     */
    public Builder addNepfbipphpe(long value) {
      ensureNepfbipphpeIsMutable();
      nepfbipphpe_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @param values The nepfbipphpe to add.
     * @return This builder for chaining.
     */
    public Builder addAllNepfbipphpe(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureNepfbipphpeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nepfbipphpe_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 nepfbipphpe = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNepfbipphpe() {
      nepfbipphpe_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private double kchhfnhinno_ ;
    /**
     * <code>double kchhfnhinno = 3;</code>
     * @return The kchhfnhinno.
     */
    public double getKchhfnhinno() {
      return kchhfnhinno_;
    }
    /**
     * <code>double kchhfnhinno = 3;</code>
     * @param value The kchhfnhinno to set.
     * @return This builder for chaining.
     */
    public Builder setKchhfnhinno(double value) {
      
      kchhfnhinno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double kchhfnhinno = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKchhfnhinno() {
      
      kchhfnhinno_ = 0D;
      onChanged();
      return this;
    }

    private double peffjhoggfd_ ;
    /**
     * <code>double peffjhoggfd = 4;</code>
     * @return The peffjhoggfd.
     */
    public double getPeffjhoggfd() {
      return peffjhoggfd_;
    }
    /**
     * <code>double peffjhoggfd = 4;</code>
     * @param value The peffjhoggfd to set.
     * @return This builder for chaining.
     */
    public Builder setPeffjhoggfd(double value) {
      
      peffjhoggfd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double peffjhoggfd = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPeffjhoggfd() {
      
      peffjhoggfd_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JIIEABNJIIC)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JIIEABNJIIC)
  private static final POGOProtos.Rpc.JIIEABNJIIC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JIIEABNJIIC();
  }

  public static POGOProtos.Rpc.JIIEABNJIIC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JIIEABNJIIC>
      PARSER = new com.google.protobuf.AbstractParser<JIIEABNJIIC>() {
    @java.lang.Override
    public JIIEABNJIIC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JIIEABNJIIC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JIIEABNJIIC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JIIEABNJIIC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JIIEABNJIIC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

