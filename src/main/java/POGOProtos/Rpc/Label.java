// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.Label}
 */
public final class Label extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.Label)
    LabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Label.newBuilder() to construct.
  private Label(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Label() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Label();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Label(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            priority_ = input.readInt32();
            break;
          }
          case 18: {
            POGOProtos.Rpc.LabelGeometry.Builder subBuilder = null;
            if (geometry_ != null) {
              subBuilder = geometry_.toBuilder();
            }
            geometry_ = input.readMessage(POGOProtos.Rpc.LabelGeometry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(geometry_);
              geometry_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.LabelContent.Builder subBuilder = null;
            if (content_ != null) {
              subBuilder = content_.toBuilder();
            }
            content_ = input.readMessage(POGOProtos.Rpc.LabelContent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(content_);
              content_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_Label_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_Label_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.Label.class, POGOProtos.Rpc.Label.Builder.class);
  }

  public static final int PRIORITY_FIELD_NUMBER = 1;
  private int priority_;
  /**
   * <code>int32 priority = 1;</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
  }

  public static final int GEOMETRY_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LabelGeometry geometry_;
  /**
   * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
   * @return Whether the geometry field is set.
   */
  @java.lang.Override
  public boolean hasGeometry() {
    return geometry_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
   * @return The geometry.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LabelGeometry getGeometry() {
    return geometry_ == null ? POGOProtos.Rpc.LabelGeometry.getDefaultInstance() : geometry_;
  }
  /**
   * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LabelGeometryOrBuilder getGeometryOrBuilder() {
    return getGeometry();
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.LabelContent content_;
  /**
   * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return content_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
   * @return The content.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LabelContent getContent() {
    return content_ == null ? POGOProtos.Rpc.LabelContent.getDefaultInstance() : content_;
  }
  /**
   * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LabelContentOrBuilder getContentOrBuilder() {
    return getContent();
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
    if (priority_ != 0) {
      output.writeInt32(1, priority_);
    }
    if (geometry_ != null) {
      output.writeMessage(2, getGeometry());
    }
    if (content_ != null) {
      output.writeMessage(3, getContent());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, priority_);
    }
    if (geometry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGeometry());
    }
    if (content_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getContent());
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
    if (!(obj instanceof POGOProtos.Rpc.Label)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.Label other = (POGOProtos.Rpc.Label) obj;

    if (getPriority()
        != other.getPriority()) return false;
    if (hasGeometry() != other.hasGeometry()) return false;
    if (hasGeometry()) {
      if (!getGeometry()
          .equals(other.getGeometry())) return false;
    }
    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent()
          .equals(other.getContent())) return false;
    }
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
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    if (hasGeometry()) {
      hash = (37 * hash) + GEOMETRY_FIELD_NUMBER;
      hash = (53 * hash) + getGeometry().hashCode();
    }
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.Label parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.Label parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.Label parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.Label parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.Label parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.Label parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.Label parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.Label parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.Label parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.Label parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.Label parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.Label parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.Label prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.Label}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.Label)
      POGOProtos.Rpc.LabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_Label_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_Label_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.Label.class, POGOProtos.Rpc.Label.Builder.class);
    }

    // Construct using POGOProtos.Rpc.Label.newBuilder()
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
      priority_ = 0;

      if (geometryBuilder_ == null) {
        geometry_ = null;
      } else {
        geometry_ = null;
        geometryBuilder_ = null;
      }
      if (contentBuilder_ == null) {
        content_ = null;
      } else {
        content_ = null;
        contentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_Label_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.Label getDefaultInstanceForType() {
      return POGOProtos.Rpc.Label.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.Label build() {
      POGOProtos.Rpc.Label result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.Label buildPartial() {
      POGOProtos.Rpc.Label result = new POGOProtos.Rpc.Label(this);
      result.priority_ = priority_;
      if (geometryBuilder_ == null) {
        result.geometry_ = geometry_;
      } else {
        result.geometry_ = geometryBuilder_.build();
      }
      if (contentBuilder_ == null) {
        result.content_ = content_;
      } else {
        result.content_ = contentBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.Label) {
        return mergeFrom((POGOProtos.Rpc.Label)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.Label other) {
      if (other == POGOProtos.Rpc.Label.getDefaultInstance()) return this;
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (other.hasGeometry()) {
        mergeGeometry(other.getGeometry());
      }
      if (other.hasContent()) {
        mergeContent(other.getContent());
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
      POGOProtos.Rpc.Label parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.Label) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int priority_ ;
    /**
     * <code>int32 priority = 1;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <code>int32 priority = 1;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 priority = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LabelGeometry geometry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LabelGeometry, POGOProtos.Rpc.LabelGeometry.Builder, POGOProtos.Rpc.LabelGeometryOrBuilder> geometryBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     * @return Whether the geometry field is set.
     */
    public boolean hasGeometry() {
      return geometryBuilder_ != null || geometry_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     * @return The geometry.
     */
    public POGOProtos.Rpc.LabelGeometry getGeometry() {
      if (geometryBuilder_ == null) {
        return geometry_ == null ? POGOProtos.Rpc.LabelGeometry.getDefaultInstance() : geometry_;
      } else {
        return geometryBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    public Builder setGeometry(POGOProtos.Rpc.LabelGeometry value) {
      if (geometryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        geometry_ = value;
        onChanged();
      } else {
        geometryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    public Builder setGeometry(
        POGOProtos.Rpc.LabelGeometry.Builder builderForValue) {
      if (geometryBuilder_ == null) {
        geometry_ = builderForValue.build();
        onChanged();
      } else {
        geometryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    public Builder mergeGeometry(POGOProtos.Rpc.LabelGeometry value) {
      if (geometryBuilder_ == null) {
        if (geometry_ != null) {
          geometry_ =
            POGOProtos.Rpc.LabelGeometry.newBuilder(geometry_).mergeFrom(value).buildPartial();
        } else {
          geometry_ = value;
        }
        onChanged();
      } else {
        geometryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    public Builder clearGeometry() {
      if (geometryBuilder_ == null) {
        geometry_ = null;
        onChanged();
      } else {
        geometry_ = null;
        geometryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    public POGOProtos.Rpc.LabelGeometry.Builder getGeometryBuilder() {
      
      onChanged();
      return getGeometryFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    public POGOProtos.Rpc.LabelGeometryOrBuilder getGeometryOrBuilder() {
      if (geometryBuilder_ != null) {
        return geometryBuilder_.getMessageOrBuilder();
      } else {
        return geometry_ == null ?
            POGOProtos.Rpc.LabelGeometry.getDefaultInstance() : geometry_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LabelGeometry geometry = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LabelGeometry, POGOProtos.Rpc.LabelGeometry.Builder, POGOProtos.Rpc.LabelGeometryOrBuilder> 
        getGeometryFieldBuilder() {
      if (geometryBuilder_ == null) {
        geometryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LabelGeometry, POGOProtos.Rpc.LabelGeometry.Builder, POGOProtos.Rpc.LabelGeometryOrBuilder>(
                getGeometry(),
                getParentForChildren(),
                isClean());
        geometry_ = null;
      }
      return geometryBuilder_;
    }

    private POGOProtos.Rpc.LabelContent content_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LabelContent, POGOProtos.Rpc.LabelContent.Builder, POGOProtos.Rpc.LabelContentOrBuilder> contentBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return contentBuilder_ != null || content_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     * @return The content.
     */
    public POGOProtos.Rpc.LabelContent getContent() {
      if (contentBuilder_ == null) {
        return content_ == null ? POGOProtos.Rpc.LabelContent.getDefaultInstance() : content_;
      } else {
        return contentBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    public Builder setContent(POGOProtos.Rpc.LabelContent value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        contentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    public Builder setContent(
        POGOProtos.Rpc.LabelContent.Builder builderForValue) {
      if (contentBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        contentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    public Builder mergeContent(POGOProtos.Rpc.LabelContent value) {
      if (contentBuilder_ == null) {
        if (content_ != null) {
          content_ =
            POGOProtos.Rpc.LabelContent.newBuilder(content_).mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        contentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    public Builder clearContent() {
      if (contentBuilder_ == null) {
        content_ = null;
        onChanged();
      } else {
        content_ = null;
        contentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    public POGOProtos.Rpc.LabelContent.Builder getContentBuilder() {
      
      onChanged();
      return getContentFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    public POGOProtos.Rpc.LabelContentOrBuilder getContentOrBuilder() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilder();
      } else {
        return content_ == null ?
            POGOProtos.Rpc.LabelContent.getDefaultInstance() : content_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LabelContent content = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LabelContent, POGOProtos.Rpc.LabelContent.Builder, POGOProtos.Rpc.LabelContentOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LabelContent, POGOProtos.Rpc.LabelContent.Builder, POGOProtos.Rpc.LabelContentOrBuilder>(
                getContent(),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.Label)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.Label)
  private static final POGOProtos.Rpc.Label DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.Label();
  }

  public static POGOProtos.Rpc.Label getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Label>
      PARSER = new com.google.protobuf.AbstractParser<Label>() {
    @java.lang.Override
    public Label parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Label(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Label> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Label> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.Label getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

