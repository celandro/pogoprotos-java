// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IJBCOPOOIKG}
 */
public  final class IJBCOPOOIKG extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IJBCOPOOIKG)
    IJBCOPOOIKGOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IJBCOPOOIKG.newBuilder() to construct.
  private IJBCOPOOIKG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IJBCOPOOIKG() {
    hfkjafhmjof_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IJBCOPOOIKG();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IJBCOPOOIKG(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              hfkjafhmjof_ = new java.util.ArrayList<POGOProtos.Rpc.DPMKNPBKICK>();
              mutable_bitField0_ |= 0x00000001;
            }
            hfkjafhmjof_.add(
                input.readMessage(POGOProtos.Rpc.DPMKNPBKICK.parser(), extensionRegistry));
            break;
          }
          case 16: {

            hfngjjocbdc_ = input.readInt64();
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
        hfkjafhmjof_ = java.util.Collections.unmodifiableList(hfkjafhmjof_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IJBCOPOOIKG_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IJBCOPOOIKG_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IJBCOPOOIKG.class, POGOProtos.Rpc.IJBCOPOOIKG.Builder.class);
  }

  public static final int HFKJAFHMJOF_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.DPMKNPBKICK> hfkjafhmjof_;
  /**
   * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
   */
  public java.util.List<POGOProtos.Rpc.DPMKNPBKICK> getHfkjafhmjofList() {
    return hfkjafhmjof_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.DPMKNPBKICKOrBuilder> 
      getHfkjafhmjofOrBuilderList() {
    return hfkjafhmjof_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
   */
  public int getHfkjafhmjofCount() {
    return hfkjafhmjof_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
   */
  public POGOProtos.Rpc.DPMKNPBKICK getHfkjafhmjof(int index) {
    return hfkjafhmjof_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
   */
  public POGOProtos.Rpc.DPMKNPBKICKOrBuilder getHfkjafhmjofOrBuilder(
      int index) {
    return hfkjafhmjof_.get(index);
  }

  public static final int HFNGJJOCBDC_FIELD_NUMBER = 2;
  private long hfngjjocbdc_;
  /**
   * <code>int64 hfngjjocbdc = 2;</code>
   * @return The hfngjjocbdc.
   */
  public long getHfngjjocbdc() {
    return hfngjjocbdc_;
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
    for (int i = 0; i < hfkjafhmjof_.size(); i++) {
      output.writeMessage(1, hfkjafhmjof_.get(i));
    }
    if (hfngjjocbdc_ != 0L) {
      output.writeInt64(2, hfngjjocbdc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hfkjafhmjof_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hfkjafhmjof_.get(i));
    }
    if (hfngjjocbdc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, hfngjjocbdc_);
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
    if (!(obj instanceof POGOProtos.Rpc.IJBCOPOOIKG)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IJBCOPOOIKG other = (POGOProtos.Rpc.IJBCOPOOIKG) obj;

    if (!getHfkjafhmjofList()
        .equals(other.getHfkjafhmjofList())) return false;
    if (getHfngjjocbdc()
        != other.getHfngjjocbdc()) return false;
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
    if (getHfkjafhmjofCount() > 0) {
      hash = (37 * hash) + HFKJAFHMJOF_FIELD_NUMBER;
      hash = (53 * hash) + getHfkjafhmjofList().hashCode();
    }
    hash = (37 * hash) + HFNGJJOCBDC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHfngjjocbdc());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IJBCOPOOIKG parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IJBCOPOOIKG prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IJBCOPOOIKG}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IJBCOPOOIKG)
      POGOProtos.Rpc.IJBCOPOOIKGOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IJBCOPOOIKG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IJBCOPOOIKG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IJBCOPOOIKG.class, POGOProtos.Rpc.IJBCOPOOIKG.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IJBCOPOOIKG.newBuilder()
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
        getHfkjafhmjofFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hfkjafhmjofBuilder_ == null) {
        hfkjafhmjof_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        hfkjafhmjofBuilder_.clear();
      }
      hfngjjocbdc_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IJBCOPOOIKG_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJBCOPOOIKG getDefaultInstanceForType() {
      return POGOProtos.Rpc.IJBCOPOOIKG.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJBCOPOOIKG build() {
      POGOProtos.Rpc.IJBCOPOOIKG result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IJBCOPOOIKG buildPartial() {
      POGOProtos.Rpc.IJBCOPOOIKG result = new POGOProtos.Rpc.IJBCOPOOIKG(this);
      int from_bitField0_ = bitField0_;
      if (hfkjafhmjofBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hfkjafhmjof_ = java.util.Collections.unmodifiableList(hfkjafhmjof_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hfkjafhmjof_ = hfkjafhmjof_;
      } else {
        result.hfkjafhmjof_ = hfkjafhmjofBuilder_.build();
      }
      result.hfngjjocbdc_ = hfngjjocbdc_;
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
      if (other instanceof POGOProtos.Rpc.IJBCOPOOIKG) {
        return mergeFrom((POGOProtos.Rpc.IJBCOPOOIKG)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IJBCOPOOIKG other) {
      if (other == POGOProtos.Rpc.IJBCOPOOIKG.getDefaultInstance()) return this;
      if (hfkjafhmjofBuilder_ == null) {
        if (!other.hfkjafhmjof_.isEmpty()) {
          if (hfkjafhmjof_.isEmpty()) {
            hfkjafhmjof_ = other.hfkjafhmjof_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHfkjafhmjofIsMutable();
            hfkjafhmjof_.addAll(other.hfkjafhmjof_);
          }
          onChanged();
        }
      } else {
        if (!other.hfkjafhmjof_.isEmpty()) {
          if (hfkjafhmjofBuilder_.isEmpty()) {
            hfkjafhmjofBuilder_.dispose();
            hfkjafhmjofBuilder_ = null;
            hfkjafhmjof_ = other.hfkjafhmjof_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hfkjafhmjofBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHfkjafhmjofFieldBuilder() : null;
          } else {
            hfkjafhmjofBuilder_.addAllMessages(other.hfkjafhmjof_);
          }
        }
      }
      if (other.getHfngjjocbdc() != 0L) {
        setHfngjjocbdc(other.getHfngjjocbdc());
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
      POGOProtos.Rpc.IJBCOPOOIKG parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IJBCOPOOIKG) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.DPMKNPBKICK> hfkjafhmjof_ =
      java.util.Collections.emptyList();
    private void ensureHfkjafhmjofIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hfkjafhmjof_ = new java.util.ArrayList<POGOProtos.Rpc.DPMKNPBKICK>(hfkjafhmjof_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DPMKNPBKICK, POGOProtos.Rpc.DPMKNPBKICK.Builder, POGOProtos.Rpc.DPMKNPBKICKOrBuilder> hfkjafhmjofBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.DPMKNPBKICK> getHfkjafhmjofList() {
      if (hfkjafhmjofBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hfkjafhmjof_);
      } else {
        return hfkjafhmjofBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public int getHfkjafhmjofCount() {
      if (hfkjafhmjofBuilder_ == null) {
        return hfkjafhmjof_.size();
      } else {
        return hfkjafhmjofBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public POGOProtos.Rpc.DPMKNPBKICK getHfkjafhmjof(int index) {
      if (hfkjafhmjofBuilder_ == null) {
        return hfkjafhmjof_.get(index);
      } else {
        return hfkjafhmjofBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder setHfkjafhmjof(
        int index, POGOProtos.Rpc.DPMKNPBKICK value) {
      if (hfkjafhmjofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.set(index, value);
        onChanged();
      } else {
        hfkjafhmjofBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder setHfkjafhmjof(
        int index, POGOProtos.Rpc.DPMKNPBKICK.Builder builderForValue) {
      if (hfkjafhmjofBuilder_ == null) {
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.set(index, builderForValue.build());
        onChanged();
      } else {
        hfkjafhmjofBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder addHfkjafhmjof(POGOProtos.Rpc.DPMKNPBKICK value) {
      if (hfkjafhmjofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.add(value);
        onChanged();
      } else {
        hfkjafhmjofBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder addHfkjafhmjof(
        int index, POGOProtos.Rpc.DPMKNPBKICK value) {
      if (hfkjafhmjofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.add(index, value);
        onChanged();
      } else {
        hfkjafhmjofBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder addHfkjafhmjof(
        POGOProtos.Rpc.DPMKNPBKICK.Builder builderForValue) {
      if (hfkjafhmjofBuilder_ == null) {
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.add(builderForValue.build());
        onChanged();
      } else {
        hfkjafhmjofBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder addHfkjafhmjof(
        int index, POGOProtos.Rpc.DPMKNPBKICK.Builder builderForValue) {
      if (hfkjafhmjofBuilder_ == null) {
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.add(index, builderForValue.build());
        onChanged();
      } else {
        hfkjafhmjofBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder addAllHfkjafhmjof(
        java.lang.Iterable<? extends POGOProtos.Rpc.DPMKNPBKICK> values) {
      if (hfkjafhmjofBuilder_ == null) {
        ensureHfkjafhmjofIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hfkjafhmjof_);
        onChanged();
      } else {
        hfkjafhmjofBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder clearHfkjafhmjof() {
      if (hfkjafhmjofBuilder_ == null) {
        hfkjafhmjof_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hfkjafhmjofBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public Builder removeHfkjafhmjof(int index) {
      if (hfkjafhmjofBuilder_ == null) {
        ensureHfkjafhmjofIsMutable();
        hfkjafhmjof_.remove(index);
        onChanged();
      } else {
        hfkjafhmjofBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public POGOProtos.Rpc.DPMKNPBKICK.Builder getHfkjafhmjofBuilder(
        int index) {
      return getHfkjafhmjofFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public POGOProtos.Rpc.DPMKNPBKICKOrBuilder getHfkjafhmjofOrBuilder(
        int index) {
      if (hfkjafhmjofBuilder_ == null) {
        return hfkjafhmjof_.get(index);  } else {
        return hfkjafhmjofBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.DPMKNPBKICKOrBuilder> 
         getHfkjafhmjofOrBuilderList() {
      if (hfkjafhmjofBuilder_ != null) {
        return hfkjafhmjofBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hfkjafhmjof_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public POGOProtos.Rpc.DPMKNPBKICK.Builder addHfkjafhmjofBuilder() {
      return getHfkjafhmjofFieldBuilder().addBuilder(
          POGOProtos.Rpc.DPMKNPBKICK.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public POGOProtos.Rpc.DPMKNPBKICK.Builder addHfkjafhmjofBuilder(
        int index) {
      return getHfkjafhmjofFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.DPMKNPBKICK.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.DPMKNPBKICK hfkjafhmjof = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.DPMKNPBKICK.Builder> 
         getHfkjafhmjofBuilderList() {
      return getHfkjafhmjofFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.DPMKNPBKICK, POGOProtos.Rpc.DPMKNPBKICK.Builder, POGOProtos.Rpc.DPMKNPBKICKOrBuilder> 
        getHfkjafhmjofFieldBuilder() {
      if (hfkjafhmjofBuilder_ == null) {
        hfkjafhmjofBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.DPMKNPBKICK, POGOProtos.Rpc.DPMKNPBKICK.Builder, POGOProtos.Rpc.DPMKNPBKICKOrBuilder>(
                hfkjafhmjof_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hfkjafhmjof_ = null;
      }
      return hfkjafhmjofBuilder_;
    }

    private long hfngjjocbdc_ ;
    /**
     * <code>int64 hfngjjocbdc = 2;</code>
     * @return The hfngjjocbdc.
     */
    public long getHfngjjocbdc() {
      return hfngjjocbdc_;
    }
    /**
     * <code>int64 hfngjjocbdc = 2;</code>
     * @param value The hfngjjocbdc to set.
     * @return This builder for chaining.
     */
    public Builder setHfngjjocbdc(long value) {
      
      hfngjjocbdc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hfngjjocbdc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHfngjjocbdc() {
      
      hfngjjocbdc_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IJBCOPOOIKG)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IJBCOPOOIKG)
  private static final POGOProtos.Rpc.IJBCOPOOIKG DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IJBCOPOOIKG();
  }

  public static POGOProtos.Rpc.IJBCOPOOIKG getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IJBCOPOOIKG>
      PARSER = new com.google.protobuf.AbstractParser<IJBCOPOOIKG>() {
    @java.lang.Override
    public IJBCOPOOIKG parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IJBCOPOOIKG(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IJBCOPOOIKG> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IJBCOPOOIKG> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IJBCOPOOIKG getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

