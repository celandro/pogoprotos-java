// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LabelGeometry}
 */
public final class LabelGeometry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LabelGeometry)
    LabelGeometryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabelGeometry.newBuilder() to construct.
  private LabelGeometry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabelGeometry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabelGeometry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LabelGeometry(
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
          case 10: {
            POGOProtos.Rpc.PixelPointProto.Builder subBuilder = null;
            if (point_ != null) {
              subBuilder = point_.toBuilder();
            }
            point_ = input.readMessage(POGOProtos.Rpc.PixelPointProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(point_);
              point_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            minZoom_ = input.readInt32();
            break;
          }
          case 24: {

            maxZoom_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LabelGeometry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LabelGeometry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LabelGeometry.class, POGOProtos.Rpc.LabelGeometry.Builder.class);
  }

  public static final int POINT_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PixelPointProto point_;
  /**
   * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
   * @return Whether the point field is set.
   */
  @java.lang.Override
  public boolean hasPoint() {
    return point_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
   * @return The point.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PixelPointProto getPoint() {
    return point_ == null ? POGOProtos.Rpc.PixelPointProto.getDefaultInstance() : point_;
  }
  /**
   * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PixelPointProtoOrBuilder getPointOrBuilder() {
    return getPoint();
  }

  public static final int MIN_ZOOM_FIELD_NUMBER = 2;
  private int minZoom_;
  /**
   * <code>int32 min_zoom = 2;</code>
   * @return The minZoom.
   */
  @java.lang.Override
  public int getMinZoom() {
    return minZoom_;
  }

  public static final int MAX_ZOOM_FIELD_NUMBER = 3;
  private int maxZoom_;
  /**
   * <code>int32 max_zoom = 3;</code>
   * @return The maxZoom.
   */
  @java.lang.Override
  public int getMaxZoom() {
    return maxZoom_;
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
    if (point_ != null) {
      output.writeMessage(1, getPoint());
    }
    if (minZoom_ != 0) {
      output.writeInt32(2, minZoom_);
    }
    if (maxZoom_ != 0) {
      output.writeInt32(3, maxZoom_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (point_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPoint());
    }
    if (minZoom_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minZoom_);
    }
    if (maxZoom_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxZoom_);
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
    if (!(obj instanceof POGOProtos.Rpc.LabelGeometry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LabelGeometry other = (POGOProtos.Rpc.LabelGeometry) obj;

    if (hasPoint() != other.hasPoint()) return false;
    if (hasPoint()) {
      if (!getPoint()
          .equals(other.getPoint())) return false;
    }
    if (getMinZoom()
        != other.getMinZoom()) return false;
    if (getMaxZoom()
        != other.getMaxZoom()) return false;
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
    if (hasPoint()) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPoint().hashCode();
    }
    hash = (37 * hash) + MIN_ZOOM_FIELD_NUMBER;
    hash = (53 * hash) + getMinZoom();
    hash = (37 * hash) + MAX_ZOOM_FIELD_NUMBER;
    hash = (53 * hash) + getMaxZoom();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LabelGeometry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LabelGeometry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LabelGeometry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LabelGeometry prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LabelGeometry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LabelGeometry)
      POGOProtos.Rpc.LabelGeometryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LabelGeometry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LabelGeometry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LabelGeometry.class, POGOProtos.Rpc.LabelGeometry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LabelGeometry.newBuilder()
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
      if (pointBuilder_ == null) {
        point_ = null;
      } else {
        point_ = null;
        pointBuilder_ = null;
      }
      minZoom_ = 0;

      maxZoom_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LabelGeometry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LabelGeometry getDefaultInstanceForType() {
      return POGOProtos.Rpc.LabelGeometry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LabelGeometry build() {
      POGOProtos.Rpc.LabelGeometry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LabelGeometry buildPartial() {
      POGOProtos.Rpc.LabelGeometry result = new POGOProtos.Rpc.LabelGeometry(this);
      if (pointBuilder_ == null) {
        result.point_ = point_;
      } else {
        result.point_ = pointBuilder_.build();
      }
      result.minZoom_ = minZoom_;
      result.maxZoom_ = maxZoom_;
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
      if (other instanceof POGOProtos.Rpc.LabelGeometry) {
        return mergeFrom((POGOProtos.Rpc.LabelGeometry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LabelGeometry other) {
      if (other == POGOProtos.Rpc.LabelGeometry.getDefaultInstance()) return this;
      if (other.hasPoint()) {
        mergePoint(other.getPoint());
      }
      if (other.getMinZoom() != 0) {
        setMinZoom(other.getMinZoom());
      }
      if (other.getMaxZoom() != 0) {
        setMaxZoom(other.getMaxZoom());
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
      POGOProtos.Rpc.LabelGeometry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LabelGeometry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PixelPointProto point_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PixelPointProto, POGOProtos.Rpc.PixelPointProto.Builder, POGOProtos.Rpc.PixelPointProtoOrBuilder> pointBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     * @return Whether the point field is set.
     */
    public boolean hasPoint() {
      return pointBuilder_ != null || point_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     * @return The point.
     */
    public POGOProtos.Rpc.PixelPointProto getPoint() {
      if (pointBuilder_ == null) {
        return point_ == null ? POGOProtos.Rpc.PixelPointProto.getDefaultInstance() : point_;
      } else {
        return pointBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    public Builder setPoint(POGOProtos.Rpc.PixelPointProto value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
        onChanged();
      } else {
        pointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    public Builder setPoint(
        POGOProtos.Rpc.PixelPointProto.Builder builderForValue) {
      if (pointBuilder_ == null) {
        point_ = builderForValue.build();
        onChanged();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    public Builder mergePoint(POGOProtos.Rpc.PixelPointProto value) {
      if (pointBuilder_ == null) {
        if (point_ != null) {
          point_ =
            POGOProtos.Rpc.PixelPointProto.newBuilder(point_).mergeFrom(value).buildPartial();
        } else {
          point_ = value;
        }
        onChanged();
      } else {
        pointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    public Builder clearPoint() {
      if (pointBuilder_ == null) {
        point_ = null;
        onChanged();
      } else {
        point_ = null;
        pointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    public POGOProtos.Rpc.PixelPointProto.Builder getPointBuilder() {
      
      onChanged();
      return getPointFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    public POGOProtos.Rpc.PixelPointProtoOrBuilder getPointOrBuilder() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        return point_ == null ?
            POGOProtos.Rpc.PixelPointProto.getDefaultInstance() : point_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PixelPointProto point = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PixelPointProto, POGOProtos.Rpc.PixelPointProto.Builder, POGOProtos.Rpc.PixelPointProtoOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PixelPointProto, POGOProtos.Rpc.PixelPointProto.Builder, POGOProtos.Rpc.PixelPointProtoOrBuilder>(
                getPoint(),
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }

    private int minZoom_ ;
    /**
     * <code>int32 min_zoom = 2;</code>
     * @return The minZoom.
     */
    @java.lang.Override
    public int getMinZoom() {
      return minZoom_;
    }
    /**
     * <code>int32 min_zoom = 2;</code>
     * @param value The minZoom to set.
     * @return This builder for chaining.
     */
    public Builder setMinZoom(int value) {
      
      minZoom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min_zoom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinZoom() {
      
      minZoom_ = 0;
      onChanged();
      return this;
    }

    private int maxZoom_ ;
    /**
     * <code>int32 max_zoom = 3;</code>
     * @return The maxZoom.
     */
    @java.lang.Override
    public int getMaxZoom() {
      return maxZoom_;
    }
    /**
     * <code>int32 max_zoom = 3;</code>
     * @param value The maxZoom to set.
     * @return This builder for chaining.
     */
    public Builder setMaxZoom(int value) {
      
      maxZoom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_zoom = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxZoom() {
      
      maxZoom_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LabelGeometry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LabelGeometry)
  private static final POGOProtos.Rpc.LabelGeometry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LabelGeometry();
  }

  public static POGOProtos.Rpc.LabelGeometry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelGeometry>
      PARSER = new com.google.protobuf.AbstractParser<LabelGeometry>() {
    @java.lang.Override
    public LabelGeometry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LabelGeometry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LabelGeometry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelGeometry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LabelGeometry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

