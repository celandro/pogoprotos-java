// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.JMBGODFMOFM}
 */
public  final class JMBGODFMOFM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JMBGODFMOFM)
    JMBGODFMOFMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JMBGODFMOFM.newBuilder() to construct.
  private JMBGODFMOFM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JMBGODFMOFM() {
    adakjmgkfda_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JMBGODFMOFM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JMBGODFMOFM(
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
              adakjmgkfda_ = new java.util.ArrayList<POGOProtos.Rpc.BAJEGNGAGEN>();
              mutable_bitField0_ |= 0x00000001;
            }
            adakjmgkfda_.add(
                input.readMessage(POGOProtos.Rpc.BAJEGNGAGEN.parser(), extensionRegistry));
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
        adakjmgkfda_ = java.util.Collections.unmodifiableList(adakjmgkfda_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JMBGODFMOFM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JMBGODFMOFM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JMBGODFMOFM.class, POGOProtos.Rpc.JMBGODFMOFM.Builder.class);
  }

  public static final int ADAKJMGKFDA_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.BAJEGNGAGEN> adakjmgkfda_;
  /**
   * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
   */
  public java.util.List<POGOProtos.Rpc.BAJEGNGAGEN> getAdakjmgkfdaList() {
    return adakjmgkfda_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.BAJEGNGAGENOrBuilder> 
      getAdakjmgkfdaOrBuilderList() {
    return adakjmgkfda_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
   */
  public int getAdakjmgkfdaCount() {
    return adakjmgkfda_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
   */
  public POGOProtos.Rpc.BAJEGNGAGEN getAdakjmgkfda(int index) {
    return adakjmgkfda_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
   */
  public POGOProtos.Rpc.BAJEGNGAGENOrBuilder getAdakjmgkfdaOrBuilder(
      int index) {
    return adakjmgkfda_.get(index);
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
    for (int i = 0; i < adakjmgkfda_.size(); i++) {
      output.writeMessage(1, adakjmgkfda_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < adakjmgkfda_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, adakjmgkfda_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.JMBGODFMOFM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JMBGODFMOFM other = (POGOProtos.Rpc.JMBGODFMOFM) obj;

    if (!getAdakjmgkfdaList()
        .equals(other.getAdakjmgkfdaList())) return false;
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
    if (getAdakjmgkfdaCount() > 0) {
      hash = (37 * hash) + ADAKJMGKFDA_FIELD_NUMBER;
      hash = (53 * hash) + getAdakjmgkfdaList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JMBGODFMOFM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JMBGODFMOFM prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.JMBGODFMOFM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JMBGODFMOFM)
      POGOProtos.Rpc.JMBGODFMOFMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JMBGODFMOFM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JMBGODFMOFM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JMBGODFMOFM.class, POGOProtos.Rpc.JMBGODFMOFM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JMBGODFMOFM.newBuilder()
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
        getAdakjmgkfdaFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (adakjmgkfdaBuilder_ == null) {
        adakjmgkfda_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        adakjmgkfdaBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JMBGODFMOFM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JMBGODFMOFM getDefaultInstanceForType() {
      return POGOProtos.Rpc.JMBGODFMOFM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JMBGODFMOFM build() {
      POGOProtos.Rpc.JMBGODFMOFM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JMBGODFMOFM buildPartial() {
      POGOProtos.Rpc.JMBGODFMOFM result = new POGOProtos.Rpc.JMBGODFMOFM(this);
      int from_bitField0_ = bitField0_;
      if (adakjmgkfdaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          adakjmgkfda_ = java.util.Collections.unmodifiableList(adakjmgkfda_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.adakjmgkfda_ = adakjmgkfda_;
      } else {
        result.adakjmgkfda_ = adakjmgkfdaBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.JMBGODFMOFM) {
        return mergeFrom((POGOProtos.Rpc.JMBGODFMOFM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JMBGODFMOFM other) {
      if (other == POGOProtos.Rpc.JMBGODFMOFM.getDefaultInstance()) return this;
      if (adakjmgkfdaBuilder_ == null) {
        if (!other.adakjmgkfda_.isEmpty()) {
          if (adakjmgkfda_.isEmpty()) {
            adakjmgkfda_ = other.adakjmgkfda_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdakjmgkfdaIsMutable();
            adakjmgkfda_.addAll(other.adakjmgkfda_);
          }
          onChanged();
        }
      } else {
        if (!other.adakjmgkfda_.isEmpty()) {
          if (adakjmgkfdaBuilder_.isEmpty()) {
            adakjmgkfdaBuilder_.dispose();
            adakjmgkfdaBuilder_ = null;
            adakjmgkfda_ = other.adakjmgkfda_;
            bitField0_ = (bitField0_ & ~0x00000001);
            adakjmgkfdaBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAdakjmgkfdaFieldBuilder() : null;
          } else {
            adakjmgkfdaBuilder_.addAllMessages(other.adakjmgkfda_);
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
      POGOProtos.Rpc.JMBGODFMOFM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JMBGODFMOFM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.BAJEGNGAGEN> adakjmgkfda_ =
      java.util.Collections.emptyList();
    private void ensureAdakjmgkfdaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        adakjmgkfda_ = new java.util.ArrayList<POGOProtos.Rpc.BAJEGNGAGEN>(adakjmgkfda_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BAJEGNGAGEN, POGOProtos.Rpc.BAJEGNGAGEN.Builder, POGOProtos.Rpc.BAJEGNGAGENOrBuilder> adakjmgkfdaBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BAJEGNGAGEN> getAdakjmgkfdaList() {
      if (adakjmgkfdaBuilder_ == null) {
        return java.util.Collections.unmodifiableList(adakjmgkfda_);
      } else {
        return adakjmgkfdaBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public int getAdakjmgkfdaCount() {
      if (adakjmgkfdaBuilder_ == null) {
        return adakjmgkfda_.size();
      } else {
        return adakjmgkfdaBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public POGOProtos.Rpc.BAJEGNGAGEN getAdakjmgkfda(int index) {
      if (adakjmgkfdaBuilder_ == null) {
        return adakjmgkfda_.get(index);
      } else {
        return adakjmgkfdaBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder setAdakjmgkfda(
        int index, POGOProtos.Rpc.BAJEGNGAGEN value) {
      if (adakjmgkfdaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.set(index, value);
        onChanged();
      } else {
        adakjmgkfdaBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder setAdakjmgkfda(
        int index, POGOProtos.Rpc.BAJEGNGAGEN.Builder builderForValue) {
      if (adakjmgkfdaBuilder_ == null) {
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.set(index, builderForValue.build());
        onChanged();
      } else {
        adakjmgkfdaBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder addAdakjmgkfda(POGOProtos.Rpc.BAJEGNGAGEN value) {
      if (adakjmgkfdaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.add(value);
        onChanged();
      } else {
        adakjmgkfdaBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder addAdakjmgkfda(
        int index, POGOProtos.Rpc.BAJEGNGAGEN value) {
      if (adakjmgkfdaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.add(index, value);
        onChanged();
      } else {
        adakjmgkfdaBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder addAdakjmgkfda(
        POGOProtos.Rpc.BAJEGNGAGEN.Builder builderForValue) {
      if (adakjmgkfdaBuilder_ == null) {
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.add(builderForValue.build());
        onChanged();
      } else {
        adakjmgkfdaBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder addAdakjmgkfda(
        int index, POGOProtos.Rpc.BAJEGNGAGEN.Builder builderForValue) {
      if (adakjmgkfdaBuilder_ == null) {
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.add(index, builderForValue.build());
        onChanged();
      } else {
        adakjmgkfdaBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder addAllAdakjmgkfda(
        java.lang.Iterable<? extends POGOProtos.Rpc.BAJEGNGAGEN> values) {
      if (adakjmgkfdaBuilder_ == null) {
        ensureAdakjmgkfdaIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, adakjmgkfda_);
        onChanged();
      } else {
        adakjmgkfdaBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder clearAdakjmgkfda() {
      if (adakjmgkfdaBuilder_ == null) {
        adakjmgkfda_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        adakjmgkfdaBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public Builder removeAdakjmgkfda(int index) {
      if (adakjmgkfdaBuilder_ == null) {
        ensureAdakjmgkfdaIsMutable();
        adakjmgkfda_.remove(index);
        onChanged();
      } else {
        adakjmgkfdaBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public POGOProtos.Rpc.BAJEGNGAGEN.Builder getAdakjmgkfdaBuilder(
        int index) {
      return getAdakjmgkfdaFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public POGOProtos.Rpc.BAJEGNGAGENOrBuilder getAdakjmgkfdaOrBuilder(
        int index) {
      if (adakjmgkfdaBuilder_ == null) {
        return adakjmgkfda_.get(index);  } else {
        return adakjmgkfdaBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.BAJEGNGAGENOrBuilder> 
         getAdakjmgkfdaOrBuilderList() {
      if (adakjmgkfdaBuilder_ != null) {
        return adakjmgkfdaBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(adakjmgkfda_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public POGOProtos.Rpc.BAJEGNGAGEN.Builder addAdakjmgkfdaBuilder() {
      return getAdakjmgkfdaFieldBuilder().addBuilder(
          POGOProtos.Rpc.BAJEGNGAGEN.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public POGOProtos.Rpc.BAJEGNGAGEN.Builder addAdakjmgkfdaBuilder(
        int index) {
      return getAdakjmgkfdaFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.BAJEGNGAGEN.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.BAJEGNGAGEN adakjmgkfda = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.BAJEGNGAGEN.Builder> 
         getAdakjmgkfdaBuilderList() {
      return getAdakjmgkfdaFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.BAJEGNGAGEN, POGOProtos.Rpc.BAJEGNGAGEN.Builder, POGOProtos.Rpc.BAJEGNGAGENOrBuilder> 
        getAdakjmgkfdaFieldBuilder() {
      if (adakjmgkfdaBuilder_ == null) {
        adakjmgkfdaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.BAJEGNGAGEN, POGOProtos.Rpc.BAJEGNGAGEN.Builder, POGOProtos.Rpc.BAJEGNGAGENOrBuilder>(
                adakjmgkfda_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        adakjmgkfda_ = null;
      }
      return adakjmgkfdaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JMBGODFMOFM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JMBGODFMOFM)
  private static final POGOProtos.Rpc.JMBGODFMOFM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JMBGODFMOFM();
  }

  public static POGOProtos.Rpc.JMBGODFMOFM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JMBGODFMOFM>
      PARSER = new com.google.protobuf.AbstractParser<JMBGODFMOFM>() {
    @java.lang.Override
    public JMBGODFMOFM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JMBGODFMOFM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JMBGODFMOFM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JMBGODFMOFM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JMBGODFMOFM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

