// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: IJEILLOPBAB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.AppliedItemsProto}
 */
public final class AppliedItemsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.AppliedItemsProto)
    AppliedItemsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppliedItemsProto.newBuilder() to construct.
  private AppliedItemsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppliedItemsProto() {
    ekpohjfklal_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppliedItemsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppliedItemsProto(
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
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ekpohjfklal_ = new java.util.ArrayList<POGOProtos.Rpc.LHJCJEKBKMK>();
              mutable_bitField0_ |= 0x00000001;
            }
            ekpohjfklal_.add(
                input.readMessage(POGOProtos.Rpc.LHJCJEKBKMK.parser(), extensionRegistry));
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
        ekpohjfklal_ = java.util.Collections.unmodifiableList(ekpohjfklal_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AppliedItemsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AppliedItemsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.AppliedItemsProto.class, POGOProtos.Rpc.AppliedItemsProto.Builder.class);
  }

  public static final int EKPOHJFKLAL_FIELD_NUMBER = 4;
  private java.util.List<POGOProtos.Rpc.LHJCJEKBKMK> ekpohjfklal_;
  /**
   * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.LHJCJEKBKMK> getEkpohjfklalList() {
    return ekpohjfklal_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.LHJCJEKBKMKOrBuilder> 
      getEkpohjfklalOrBuilderList() {
    return ekpohjfklal_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
   */
  @java.lang.Override
  public int getEkpohjfklalCount() {
    return ekpohjfklal_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LHJCJEKBKMK getEkpohjfklal(int index) {
    return ekpohjfklal_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LHJCJEKBKMKOrBuilder getEkpohjfklalOrBuilder(
      int index) {
    return ekpohjfklal_.get(index);
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
    for (int i = 0; i < ekpohjfklal_.size(); i++) {
      output.writeMessage(4, ekpohjfklal_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ekpohjfklal_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, ekpohjfklal_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.AppliedItemsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.AppliedItemsProto other = (POGOProtos.Rpc.AppliedItemsProto) obj;

    if (!getEkpohjfklalList()
        .equals(other.getEkpohjfklalList())) return false;
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
    if (getEkpohjfklalCount() > 0) {
      hash = (37 * hash) + EKPOHJFKLAL_FIELD_NUMBER;
      hash = (53 * hash) + getEkpohjfklalList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.AppliedItemsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.AppliedItemsProto prototype) {
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
   * ref: IJEILLOPBAB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.AppliedItemsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.AppliedItemsProto)
      POGOProtos.Rpc.AppliedItemsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AppliedItemsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AppliedItemsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.AppliedItemsProto.class, POGOProtos.Rpc.AppliedItemsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.AppliedItemsProto.newBuilder()
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
        getEkpohjfklalFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ekpohjfklalBuilder_ == null) {
        ekpohjfklal_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ekpohjfklalBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_AppliedItemsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AppliedItemsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.AppliedItemsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.AppliedItemsProto build() {
      POGOProtos.Rpc.AppliedItemsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.AppliedItemsProto buildPartial() {
      POGOProtos.Rpc.AppliedItemsProto result = new POGOProtos.Rpc.AppliedItemsProto(this);
      int from_bitField0_ = bitField0_;
      if (ekpohjfklalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ekpohjfklal_ = java.util.Collections.unmodifiableList(ekpohjfklal_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ekpohjfklal_ = ekpohjfklal_;
      } else {
        result.ekpohjfklal_ = ekpohjfklalBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.AppliedItemsProto) {
        return mergeFrom((POGOProtos.Rpc.AppliedItemsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.AppliedItemsProto other) {
      if (other == POGOProtos.Rpc.AppliedItemsProto.getDefaultInstance()) return this;
      if (ekpohjfklalBuilder_ == null) {
        if (!other.ekpohjfklal_.isEmpty()) {
          if (ekpohjfklal_.isEmpty()) {
            ekpohjfklal_ = other.ekpohjfklal_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEkpohjfklalIsMutable();
            ekpohjfklal_.addAll(other.ekpohjfklal_);
          }
          onChanged();
        }
      } else {
        if (!other.ekpohjfklal_.isEmpty()) {
          if (ekpohjfklalBuilder_.isEmpty()) {
            ekpohjfklalBuilder_.dispose();
            ekpohjfklalBuilder_ = null;
            ekpohjfklal_ = other.ekpohjfklal_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ekpohjfklalBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEkpohjfklalFieldBuilder() : null;
          } else {
            ekpohjfklalBuilder_.addAllMessages(other.ekpohjfklal_);
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
      POGOProtos.Rpc.AppliedItemsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.AppliedItemsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.LHJCJEKBKMK> ekpohjfklal_ =
      java.util.Collections.emptyList();
    private void ensureEkpohjfklalIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ekpohjfklal_ = new java.util.ArrayList<POGOProtos.Rpc.LHJCJEKBKMK>(ekpohjfklal_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.LHJCJEKBKMK, POGOProtos.Rpc.LHJCJEKBKMK.Builder, POGOProtos.Rpc.LHJCJEKBKMKOrBuilder> ekpohjfklalBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.LHJCJEKBKMK> getEkpohjfklalList() {
      if (ekpohjfklalBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ekpohjfklal_);
      } else {
        return ekpohjfklalBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public int getEkpohjfklalCount() {
      if (ekpohjfklalBuilder_ == null) {
        return ekpohjfklal_.size();
      } else {
        return ekpohjfklalBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public POGOProtos.Rpc.LHJCJEKBKMK getEkpohjfklal(int index) {
      if (ekpohjfklalBuilder_ == null) {
        return ekpohjfklal_.get(index);
      } else {
        return ekpohjfklalBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder setEkpohjfklal(
        int index, POGOProtos.Rpc.LHJCJEKBKMK value) {
      if (ekpohjfklalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.set(index, value);
        onChanged();
      } else {
        ekpohjfklalBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder setEkpohjfklal(
        int index, POGOProtos.Rpc.LHJCJEKBKMK.Builder builderForValue) {
      if (ekpohjfklalBuilder_ == null) {
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.set(index, builderForValue.build());
        onChanged();
      } else {
        ekpohjfklalBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder addEkpohjfklal(POGOProtos.Rpc.LHJCJEKBKMK value) {
      if (ekpohjfklalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.add(value);
        onChanged();
      } else {
        ekpohjfklalBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder addEkpohjfklal(
        int index, POGOProtos.Rpc.LHJCJEKBKMK value) {
      if (ekpohjfklalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.add(index, value);
        onChanged();
      } else {
        ekpohjfklalBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder addEkpohjfklal(
        POGOProtos.Rpc.LHJCJEKBKMK.Builder builderForValue) {
      if (ekpohjfklalBuilder_ == null) {
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.add(builderForValue.build());
        onChanged();
      } else {
        ekpohjfklalBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder addEkpohjfklal(
        int index, POGOProtos.Rpc.LHJCJEKBKMK.Builder builderForValue) {
      if (ekpohjfklalBuilder_ == null) {
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.add(index, builderForValue.build());
        onChanged();
      } else {
        ekpohjfklalBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder addAllEkpohjfklal(
        java.lang.Iterable<? extends POGOProtos.Rpc.LHJCJEKBKMK> values) {
      if (ekpohjfklalBuilder_ == null) {
        ensureEkpohjfklalIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ekpohjfklal_);
        onChanged();
      } else {
        ekpohjfklalBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder clearEkpohjfklal() {
      if (ekpohjfklalBuilder_ == null) {
        ekpohjfklal_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ekpohjfklalBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public Builder removeEkpohjfklal(int index) {
      if (ekpohjfklalBuilder_ == null) {
        ensureEkpohjfklalIsMutable();
        ekpohjfklal_.remove(index);
        onChanged();
      } else {
        ekpohjfklalBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public POGOProtos.Rpc.LHJCJEKBKMK.Builder getEkpohjfklalBuilder(
        int index) {
      return getEkpohjfklalFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public POGOProtos.Rpc.LHJCJEKBKMKOrBuilder getEkpohjfklalOrBuilder(
        int index) {
      if (ekpohjfklalBuilder_ == null) {
        return ekpohjfklal_.get(index);  } else {
        return ekpohjfklalBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.LHJCJEKBKMKOrBuilder> 
         getEkpohjfklalOrBuilderList() {
      if (ekpohjfklalBuilder_ != null) {
        return ekpohjfklalBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ekpohjfklal_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public POGOProtos.Rpc.LHJCJEKBKMK.Builder addEkpohjfklalBuilder() {
      return getEkpohjfklalFieldBuilder().addBuilder(
          POGOProtos.Rpc.LHJCJEKBKMK.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public POGOProtos.Rpc.LHJCJEKBKMK.Builder addEkpohjfklalBuilder(
        int index) {
      return getEkpohjfklalFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.LHJCJEKBKMK.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.LHJCJEKBKMK ekpohjfklal = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.LHJCJEKBKMK.Builder> 
         getEkpohjfklalBuilderList() {
      return getEkpohjfklalFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.LHJCJEKBKMK, POGOProtos.Rpc.LHJCJEKBKMK.Builder, POGOProtos.Rpc.LHJCJEKBKMKOrBuilder> 
        getEkpohjfklalFieldBuilder() {
      if (ekpohjfklalBuilder_ == null) {
        ekpohjfklalBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.LHJCJEKBKMK, POGOProtos.Rpc.LHJCJEKBKMK.Builder, POGOProtos.Rpc.LHJCJEKBKMKOrBuilder>(
                ekpohjfklal_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ekpohjfklal_ = null;
      }
      return ekpohjfklalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.AppliedItemsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.AppliedItemsProto)
  private static final POGOProtos.Rpc.AppliedItemsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.AppliedItemsProto();
  }

  public static POGOProtos.Rpc.AppliedItemsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppliedItemsProto>
      PARSER = new com.google.protobuf.AbstractParser<AppliedItemsProto>() {
    @java.lang.Override
    public AppliedItemsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppliedItemsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppliedItemsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppliedItemsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.AppliedItemsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

