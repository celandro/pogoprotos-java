// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.TodayViewProto}
 */
public  final class TodayViewProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.TodayViewProto)
    TodayViewProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TodayViewProto.newBuilder() to construct.
  private TodayViewProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TodayViewProto() {
    sections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TodayViewProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TodayViewProto(
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
              sections_ = new java.util.ArrayList<POGOProtos.Rpc.TodayViewSectionProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            sections_.add(
                input.readMessage(POGOProtos.Rpc.TodayViewSectionProto.parser(), extensionRegistry));
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
        sections_ = java.util.Collections.unmodifiableList(sections_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TodayViewProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TodayViewProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.TodayViewProto.class, POGOProtos.Rpc.TodayViewProto.Builder.class);
  }

  public static final int SECTIONS_FIELD_NUMBER = 1;
  private java.util.List<POGOProtos.Rpc.TodayViewSectionProto> sections_;
  /**
   * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
   */
  public java.util.List<POGOProtos.Rpc.TodayViewSectionProto> getSectionsList() {
    return sections_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
   */
  public java.util.List<? extends POGOProtos.Rpc.TodayViewSectionProtoOrBuilder> 
      getSectionsOrBuilderList() {
    return sections_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
   */
  public int getSectionsCount() {
    return sections_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
   */
  public POGOProtos.Rpc.TodayViewSectionProto getSections(int index) {
    return sections_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
   */
  public POGOProtos.Rpc.TodayViewSectionProtoOrBuilder getSectionsOrBuilder(
      int index) {
    return sections_.get(index);
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
    for (int i = 0; i < sections_.size(); i++) {
      output.writeMessage(1, sections_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sections_.get(i));
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
    if (!(obj instanceof POGOProtos.Rpc.TodayViewProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.TodayViewProto other = (POGOProtos.Rpc.TodayViewProto) obj;

    if (!getSectionsList()
        .equals(other.getSectionsList())) return false;
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
    if (getSectionsCount() > 0) {
      hash = (37 * hash) + SECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSectionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TodayViewProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TodayViewProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.TodayViewProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.TodayViewProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.TodayViewProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.TodayViewProto)
      POGOProtos.Rpc.TodayViewProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TodayViewProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TodayViewProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.TodayViewProto.class, POGOProtos.Rpc.TodayViewProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.TodayViewProto.newBuilder()
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
        getSectionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sectionsBuilder_ == null) {
        sections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sectionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_TodayViewProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TodayViewProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.TodayViewProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.TodayViewProto build() {
      POGOProtos.Rpc.TodayViewProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.TodayViewProto buildPartial() {
      POGOProtos.Rpc.TodayViewProto result = new POGOProtos.Rpc.TodayViewProto(this);
      int from_bitField0_ = bitField0_;
      if (sectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sections_ = java.util.Collections.unmodifiableList(sections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sections_ = sections_;
      } else {
        result.sections_ = sectionsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.TodayViewProto) {
        return mergeFrom((POGOProtos.Rpc.TodayViewProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.TodayViewProto other) {
      if (other == POGOProtos.Rpc.TodayViewProto.getDefaultInstance()) return this;
      if (sectionsBuilder_ == null) {
        if (!other.sections_.isEmpty()) {
          if (sections_.isEmpty()) {
            sections_ = other.sections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSectionsIsMutable();
            sections_.addAll(other.sections_);
          }
          onChanged();
        }
      } else {
        if (!other.sections_.isEmpty()) {
          if (sectionsBuilder_.isEmpty()) {
            sectionsBuilder_.dispose();
            sectionsBuilder_ = null;
            sections_ = other.sections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSectionsFieldBuilder() : null;
          } else {
            sectionsBuilder_.addAllMessages(other.sections_);
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
      POGOProtos.Rpc.TodayViewProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.TodayViewProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<POGOProtos.Rpc.TodayViewSectionProto> sections_ =
      java.util.Collections.emptyList();
    private void ensureSectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sections_ = new java.util.ArrayList<POGOProtos.Rpc.TodayViewSectionProto>(sections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.TodayViewSectionProto, POGOProtos.Rpc.TodayViewSectionProto.Builder, POGOProtos.Rpc.TodayViewSectionProtoOrBuilder> sectionsBuilder_;

    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.TodayViewSectionProto> getSectionsList() {
      if (sectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sections_);
      } else {
        return sectionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public int getSectionsCount() {
      if (sectionsBuilder_ == null) {
        return sections_.size();
      } else {
        return sectionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public POGOProtos.Rpc.TodayViewSectionProto getSections(int index) {
      if (sectionsBuilder_ == null) {
        return sections_.get(index);
      } else {
        return sectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder setSections(
        int index, POGOProtos.Rpc.TodayViewSectionProto value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.set(index, value);
        onChanged();
      } else {
        sectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder setSections(
        int index, POGOProtos.Rpc.TodayViewSectionProto.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.set(index, builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder addSections(POGOProtos.Rpc.TodayViewSectionProto value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.add(value);
        onChanged();
      } else {
        sectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder addSections(
        int index, POGOProtos.Rpc.TodayViewSectionProto value) {
      if (sectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSectionsIsMutable();
        sections_.add(index, value);
        onChanged();
      } else {
        sectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder addSections(
        POGOProtos.Rpc.TodayViewSectionProto.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.add(builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder addSections(
        int index, POGOProtos.Rpc.TodayViewSectionProto.Builder builderForValue) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.add(index, builderForValue.build());
        onChanged();
      } else {
        sectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder addAllSections(
        java.lang.Iterable<? extends POGOProtos.Rpc.TodayViewSectionProto> values) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sections_);
        onChanged();
      } else {
        sectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder clearSections() {
      if (sectionsBuilder_ == null) {
        sections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public Builder removeSections(int index) {
      if (sectionsBuilder_ == null) {
        ensureSectionsIsMutable();
        sections_.remove(index);
        onChanged();
      } else {
        sectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public POGOProtos.Rpc.TodayViewSectionProto.Builder getSectionsBuilder(
        int index) {
      return getSectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public POGOProtos.Rpc.TodayViewSectionProtoOrBuilder getSectionsOrBuilder(
        int index) {
      if (sectionsBuilder_ == null) {
        return sections_.get(index);  } else {
        return sectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public java.util.List<? extends POGOProtos.Rpc.TodayViewSectionProtoOrBuilder> 
         getSectionsOrBuilderList() {
      if (sectionsBuilder_ != null) {
        return sectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sections_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public POGOProtos.Rpc.TodayViewSectionProto.Builder addSectionsBuilder() {
      return getSectionsFieldBuilder().addBuilder(
          POGOProtos.Rpc.TodayViewSectionProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public POGOProtos.Rpc.TodayViewSectionProto.Builder addSectionsBuilder(
        int index) {
      return getSectionsFieldBuilder().addBuilder(
          index, POGOProtos.Rpc.TodayViewSectionProto.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TodayViewSectionProto sections = 1;</code>
     */
    public java.util.List<POGOProtos.Rpc.TodayViewSectionProto.Builder> 
         getSectionsBuilderList() {
      return getSectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Rpc.TodayViewSectionProto, POGOProtos.Rpc.TodayViewSectionProto.Builder, POGOProtos.Rpc.TodayViewSectionProtoOrBuilder> 
        getSectionsFieldBuilder() {
      if (sectionsBuilder_ == null) {
        sectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Rpc.TodayViewSectionProto, POGOProtos.Rpc.TodayViewSectionProto.Builder, POGOProtos.Rpc.TodayViewSectionProtoOrBuilder>(
                sections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sections_ = null;
      }
      return sectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.TodayViewProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.TodayViewProto)
  private static final POGOProtos.Rpc.TodayViewProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.TodayViewProto();
  }

  public static POGOProtos.Rpc.TodayViewProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TodayViewProto>
      PARSER = new com.google.protobuf.AbstractParser<TodayViewProto>() {
    @java.lang.Override
    public TodayViewProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TodayViewProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TodayViewProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TodayViewProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.TodayViewProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

