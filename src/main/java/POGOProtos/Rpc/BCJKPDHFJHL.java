// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BCJKPDHFJHL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BCJKPDHFJHL}
 */
public final class BCJKPDHFJHL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BCJKPDHFJHL)
    BCJKPDHFJHLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BCJKPDHFJHL.newBuilder() to construct.
  private BCJKPDHFJHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BCJKPDHFJHL() {
    lejmefblkcd_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BCJKPDHFJHL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BCJKPDHFJHL(
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
              lejmefblkcd_ = new java.util.ArrayList<POGOProtos.Rpc.KACEADFJNEB>();
              mutable_bitField0_ |= 0x00000001;
            }
            lejmefblkcd_.add(
                input.readMessage(POGOProtos.Rpc.KACEADFJNEB.parser(), extensionRegistry));
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
        lejmefblkcd_ = java.util.Collections.unmodifiableList(lejmefblkcd_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCJKPDHFJHL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCJKPDHFJHL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BCJKPDHFJHL.class, POGOProtos.Rpc.BCJKPDHFJHL.Builder.class);
  }

  public static final int LEJMEFBLKCD_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.KACEADFJNEB> lejmefblkcd_;
  /**
   * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.KACEADFJNEB> getLejmefblkcdList() {
    return lejmefblkcd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.KACEADFJNEBOrBuilder> 
      getLejmefblkcdOrBuilderList() {
    return lejmefblkcd_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
   */
  @java.lang.Override
  public int getLejmefblkcdCount() {
    return lejmefblkcd_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.KACEADFJNEB getLejmefblkcd(int index) {
    return lejmefblkcd_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.KACEADFJNEBOrBuilder getLejmefblkcdOrBuilder(
      int index) {
    return lejmefblkcd_.get(index);
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
    for (int i = 0; i < lejmefblkcd_.size(); i++) {
      output.writeMessage(1, lejmefblkcd_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lejmefblkcd_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lejmefblkcd_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.BCJKPDHFJHL)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BCJKPDHFJHL other = (POGOProtos.Rpc.BCJKPDHFJHL) obj;

    if (!getLejmefblkcdList()
        .equals(other.getLejmefblkcdList())) return false;
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
    if (getLejmefblkcdCount() > 0) {
      hash = (37 * hash) + LEJMEFBLKCD_FIELD_NUMBER;
      hash = (53 * hash) + getLejmefblkcdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCJKPDHFJHL parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BCJKPDHFJHL prototype) {
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
   * ref: BCJKPDHFJHL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BCJKPDHFJHL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BCJKPDHFJHL)
      POGOProtos.Rpc.BCJKPDHFJHLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCJKPDHFJHL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCJKPDHFJHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BCJKPDHFJHL.class, POGOProtos.Rpc.BCJKPDHFJHL.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BCJKPDHFJHL.newBuilder()
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
        getLejmefblkcdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lejmefblkcdBuilder_ == null) {
        lejmefblkcd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lejmefblkcdBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCJKPDHFJHL_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCJKPDHFJHL getDefaultInstanceForType() {
      return POGOProtos.Rpc.BCJKPDHFJHL.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCJKPDHFJHL build() {
      POGOProtos.Rpc.BCJKPDHFJHL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCJKPDHFJHL buildPartial() {
      POGOProtos.Rpc.BCJKPDHFJHL result = new POGOProtos.Rpc.BCJKPDHFJHL(this);
      int from_bitField0_ = bitField0_;
      if (lejmefblkcdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lejmefblkcd_ = java.util.Collections.unmodifiableList(lejmefblkcd_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lejmefblkcd_ = lejmefblkcd_;
      } else {
        result.lejmefblkcd_ = lejmefblkcdBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.BCJKPDHFJHL) {
        return mergeFrom((POGOProtos.Rpc.BCJKPDHFJHL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BCJKPDHFJHL other) {
      if (other == POGOProtos.Rpc.BCJKPDHFJHL.getDefaultInstance()) return this;
      if (lejmefblkcdBuilder_ == null) {
        if (!other.lejmefblkcd_.isEmpty()) {
          if (lejmefblkcd_.isEmpty()) {
            lejmefblkcd_ = other.lejmefblkcd_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLejmefblkcdIsMutable();
            lejmefblkcd_.addAll(other.lejmefblkcd_);
          }
          onChanged();
        }
      } else {
        if (!other.lejmefblkcd_.isEmpty()) {
          if (lejmefblkcdBuilder_.isEmpty()) {
            lejmefblkcdBuilder_.dispose();
            lejmefblkcdBuilder_ = null;
            lejmefblkcd_ = other.lejmefblkcd_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lejmefblkcdBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLejmefblkcdFieldBuilder() : null;
          } else {
            lejmefblkcdBuilder_.addAllMessages(other.lejmefblkcd_);
          }
        }
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
      POGOProtos.Rpc.BCJKPDHFJHL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BCJKPDHFJHL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.KACEADFJNEB> lejmefblkcd_ =
      java.util.Collections.emptyList();
    private void ensureLejmefblkcdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lejmefblkcd_ = new java.util.ArrayList<POGOProtos.Rpc.KACEADFJNEB>(lejmefblkcd_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.KACEADFJNEB, POGOProtos.Rpc.KACEADFJNEB.Builder, POGOProtos.Rpc.KACEADFJNEBOrBuilder> lejmefblkcdBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.KACEADFJNEB> getLejmefblkcdList() {
      if (lejmefblkcdBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lejmefblkcd_);
      } else {
        return lejmefblkcdBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public int getLejmefblkcdCount() {
      if (lejmefblkcdBuilder_ == null) {
        return lejmefblkcd_.size();
      } else {
        return lejmefblkcdBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public POGOProtos.Rpc.KACEADFJNEB getLejmefblkcd(int index) {
      if (lejmefblkcdBuilder_ == null) {
        return lejmefblkcd_.get(index);
      } else {
        return lejmefblkcdBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder setLejmefblkcd(
        int index, POGOProtos.Rpc.KACEADFJNEB value) {
      if (lejmefblkcdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.set(index, value);
        onChanged();
      } else {
        lejmefblkcdBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder setLejmefblkcd(
        int index, POGOProtos.Rpc.KACEADFJNEB.Builder builderForValue) {
      if (lejmefblkcdBuilder_ == null) {
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.set(index, builderForValue.build());
        onChanged();
      } else {
        lejmefblkcdBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder addLejmefblkcd(POGOProtos.Rpc.KACEADFJNEB value) {
      if (lejmefblkcdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.add(value);
        onChanged();
      } else {
        lejmefblkcdBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder addLejmefblkcd(
        int index, POGOProtos.Rpc.KACEADFJNEB value) {
      if (lejmefblkcdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.add(index, value);
        onChanged();
      } else {
        lejmefblkcdBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder addLejmefblkcd(
        POGOProtos.Rpc.KACEADFJNEB.Builder builderForValue) {
      if (lejmefblkcdBuilder_ == null) {
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.add(builderForValue.build());
        onChanged();
      } else {
        lejmefblkcdBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder addLejmefblkcd(
        int index, POGOProtos.Rpc.KACEADFJNEB.Builder builderForValue) {
      if (lejmefblkcdBuilder_ == null) {
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.add(index, builderForValue.build());
        onChanged();
      } else {
        lejmefblkcdBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder addAllLejmefblkcd(
        java.lang.Iterable<? extends POGOProtos.Rpc.KACEADFJNEB> values) {
      if (lejmefblkcdBuilder_ == null) {
        ensureLejmefblkcdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lejmefblkcd_);
        onChanged();
      } else {
        lejmefblkcdBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder clearLejmefblkcd() {
      if (lejmefblkcdBuilder_ == null) {
        lejmefblkcd_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lejmefblkcdBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public Builder removeLejmefblkcd(int index) {
      if (lejmefblkcdBuilder_ == null) {
        ensureLejmefblkcdIsMutable();
        lejmefblkcd_.remove(index);
        onChanged();
      } else {
        lejmefblkcdBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public POGOProtos.Rpc.KACEADFJNEB.Builder getLejmefblkcdBuilder(
        int index) {
      return getLejmefblkcdFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public POGOProtos.Rpc.KACEADFJNEBOrBuilder getLejmefblkcdOrBuilder(
        int index) {
      if (lejmefblkcdBuilder_ == null) {
        return lejmefblkcd_.get(index);  } else {
        return lejmefblkcdBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.KACEADFJNEBOrBuilder> 
         getLejmefblkcdOrBuilderList() {
      if (lejmefblkcdBuilder_ != null) {
        return lejmefblkcdBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lejmefblkcd_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public POGOProtos.Rpc.KACEADFJNEB.Builder addLejmefblkcdBuilder() {
      return getLejmefblkcdFieldBuilder().addBuilder(
          POGOProtos.Rpc.KACEADFJNEB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public POGOProtos.Rpc.KACEADFJNEB.Builder addLejmefblkcdBuilder(
        int index) {
      return getLejmefblkcdFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.KACEADFJNEB.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.KACEADFJNEB lejmefblkcd = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.KACEADFJNEB.Builder> 
         getLejmefblkcdBuilderList() {
      return getLejmefblkcdFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.KACEADFJNEB, POGOProtos.Rpc.KACEADFJNEB.Builder, POGOProtos.Rpc.KACEADFJNEBOrBuilder> 
        getLejmefblkcdFieldBuilder() {
      if (lejmefblkcdBuilder_ == null) {
        lejmefblkcdBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.KACEADFJNEB, POGOProtos.Rpc.KACEADFJNEB.Builder, POGOProtos.Rpc.KACEADFJNEBOrBuilder>(
                lejmefblkcd_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lejmefblkcd_ = null;
      }
      return lejmefblkcdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BCJKPDHFJHL)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BCJKPDHFJHL)
  private static final POGOProtos.Rpc.BCJKPDHFJHL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BCJKPDHFJHL();
  }

  public static POGOProtos.Rpc.BCJKPDHFJHL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BCJKPDHFJHL>
      PARSER = new com.google.protobuf.AbstractParser<BCJKPDHFJHL>() {
    @java.lang.Override
    public BCJKPDHFJHL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BCJKPDHFJHL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BCJKPDHFJHL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BCJKPDHFJHL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BCJKPDHFJHL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

