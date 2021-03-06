// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
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
    item_ = java.util.Collections.emptyList();
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
              item_ = new java.util.ArrayList<POGOProtos.Rpc.AppliedItemProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            item_.add(
                input.readMessage(POGOProtos.Rpc.AppliedItemProto.parser(), extensionRegistry));
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
        item_ = java.util.Collections.unmodifiableList(item_);
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

  public static final int ITEM_FIELD_NUMBER = 4;
  private java.util.List<POGOProtos.Rpc.AppliedItemProto> item_;
  /**
   * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
   */
  @java.lang.Override
  public java.util.List<POGOProtos.Rpc.AppliedItemProto> getItemList() {
    return item_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends POGOProtos.Rpc.AppliedItemProtoOrBuilder> 
      getItemOrBuilderList() {
    return item_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
   */
  @java.lang.Override
  public int getItemCount() {
    return item_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AppliedItemProto getItem(int index) {
    return item_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AppliedItemProtoOrBuilder getItemOrBuilder(
      int index) {
    return item_.get(index);
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
    for (int i = 0; i < item_.size(); i++) {
      output.writeMessage(4, item_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < item_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, item_.get(i));
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

    if (!getItemList()
        .equals(other.getItemList())) return false;
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
    if (getItemCount() > 0) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItemList().hashCode();
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
        getItemFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (itemBuilder_ == null) {
        item_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemBuilder_.clear();
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
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          item_ = java.util.Collections.unmodifiableList(item_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
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
      if (itemBuilder_ == null) {
        if (!other.item_.isEmpty()) {
          if (item_.isEmpty()) {
            item_ = other.item_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemIsMutable();
            item_.addAll(other.item_);
          }
          onChanged();
        }
      } else {
        if (!other.item_.isEmpty()) {
          if (itemBuilder_.isEmpty()) {
            itemBuilder_.dispose();
            itemBuilder_ = null;
            item_ = other.item_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemFieldBuilder() : null;
          } else {
            itemBuilder_.addAllMessages(other.item_);
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

    private java.util.List<POGOProtos.Rpc.AppliedItemProto> item_ =
      java.util.Collections.emptyList();
    private void ensureItemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        item_ = new java.util.ArrayList<POGOProtos.Rpc.AppliedItemProto>(item_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.AppliedItemProto, POGOProtos.Rpc.AppliedItemProto.Builder, POGOProtos.Rpc.AppliedItemProtoOrBuilder> itemBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.AppliedItemProto> getItemList() {
      if (itemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(item_);
      } else {
        return itemBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public int getItemCount() {
      if (itemBuilder_ == null) {
        return item_.size();
      } else {
        return itemBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public POGOProtos.Rpc.AppliedItemProto getItem(int index) {
      if (itemBuilder_ == null) {
        return item_.get(index);
      } else {
        return itemBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder setItem(
        int index, POGOProtos.Rpc.AppliedItemProto value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.set(index, value);
        onChanged();
      } else {
        itemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder setItem(
        int index, POGOProtos.Rpc.AppliedItemProto.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder addItem(POGOProtos.Rpc.AppliedItemProto value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.add(value);
        onChanged();
      } else {
        itemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder addItem(
        int index, POGOProtos.Rpc.AppliedItemProto value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemIsMutable();
        item_.add(index, value);
        onChanged();
      } else {
        itemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder addItem(
        POGOProtos.Rpc.AppliedItemProto.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.add(builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder addItem(
        int index, POGOProtos.Rpc.AppliedItemProto.Builder builderForValue) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder addAllItem(
        java.lang.Iterable<? extends POGOProtos.Rpc.AppliedItemProto> values) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, item_);
        onChanged();
      } else {
        itemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public Builder removeItem(int index) {
      if (itemBuilder_ == null) {
        ensureItemIsMutable();
        item_.remove(index);
        onChanged();
      } else {
        itemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public POGOProtos.Rpc.AppliedItemProto.Builder getItemBuilder(
        int index) {
      return getItemFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public POGOProtos.Rpc.AppliedItemProtoOrBuilder getItemOrBuilder(
        int index) {
      if (itemBuilder_ == null) {
        return item_.get(index);  } else {
        return itemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.AppliedItemProtoOrBuilder> 
         getItemOrBuilderList() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(item_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public POGOProtos.Rpc.AppliedItemProto.Builder addItemBuilder() {
      return getItemFieldBuilder().addBuilder(
          POGOProtos.Rpc.AppliedItemProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public POGOProtos.Rpc.AppliedItemProto.Builder addItemBuilder(
        int index) {
      return getItemFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.AppliedItemProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.AppliedItemProto item = 4;</code>
     */
    public java.util.List<POGOProtos.Rpc.AppliedItemProto.Builder> 
         getItemBuilderList() {
      return getItemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.AppliedItemProto, POGOProtos.Rpc.AppliedItemProto.Builder, POGOProtos.Rpc.AppliedItemProtoOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.AppliedItemProto, POGOProtos.Rpc.AppliedItemProto.Builder, POGOProtos.Rpc.AppliedItemProtoOrBuilder>(
                item_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
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

