// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PixelPointProto}
 */
public final class PixelPointProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PixelPointProto)
    PixelPointProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PixelPointProto.newBuilder() to construct.
  private PixelPointProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PixelPointProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PixelPointProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PixelPointProto(
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

            pixelX_ = input.readInt32();
            break;
          }
          case 16: {

            pixelY_ = input.readInt32();
            break;
          }
          case 24: {

            zoomLevel_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PixelPointProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PixelPointProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PixelPointProto.class, POGOProtos.Rpc.PixelPointProto.Builder.class);
  }

  public static final int PIXEL_X_FIELD_NUMBER = 1;
  private int pixelX_;
  /**
   * <code>int32 pixel_x = 1;</code>
   * @return The pixelX.
   */
  @java.lang.Override
  public int getPixelX() {
    return pixelX_;
  }

  public static final int PIXEL_Y_FIELD_NUMBER = 2;
  private int pixelY_;
  /**
   * <code>int32 pixel_y = 2;</code>
   * @return The pixelY.
   */
  @java.lang.Override
  public int getPixelY() {
    return pixelY_;
  }

  public static final int ZOOM_LEVEL_FIELD_NUMBER = 3;
  private int zoomLevel_;
  /**
   * <code>int32 zoom_level = 3;</code>
   * @return The zoomLevel.
   */
  @java.lang.Override
  public int getZoomLevel() {
    return zoomLevel_;
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
    if (pixelX_ != 0) {
      output.writeInt32(1, pixelX_);
    }
    if (pixelY_ != 0) {
      output.writeInt32(2, pixelY_);
    }
    if (zoomLevel_ != 0) {
      output.writeInt32(3, zoomLevel_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pixelX_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pixelX_);
    }
    if (pixelY_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pixelY_);
    }
    if (zoomLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, zoomLevel_);
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
    if (!(obj instanceof POGOProtos.Rpc.PixelPointProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PixelPointProto other = (POGOProtos.Rpc.PixelPointProto) obj;

    if (getPixelX()
        != other.getPixelX()) return false;
    if (getPixelY()
        != other.getPixelY()) return false;
    if (getZoomLevel()
        != other.getZoomLevel()) return false;
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
    hash = (37 * hash) + PIXEL_X_FIELD_NUMBER;
    hash = (53 * hash) + getPixelX();
    hash = (37 * hash) + PIXEL_Y_FIELD_NUMBER;
    hash = (53 * hash) + getPixelY();
    hash = (37 * hash) + ZOOM_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getZoomLevel();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PixelPointProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PixelPointProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PixelPointProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PixelPointProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PixelPointProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PixelPointProto)
      POGOProtos.Rpc.PixelPointProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PixelPointProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PixelPointProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PixelPointProto.class, POGOProtos.Rpc.PixelPointProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PixelPointProto.newBuilder()
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
      pixelX_ = 0;

      pixelY_ = 0;

      zoomLevel_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PixelPointProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PixelPointProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PixelPointProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PixelPointProto build() {
      POGOProtos.Rpc.PixelPointProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PixelPointProto buildPartial() {
      POGOProtos.Rpc.PixelPointProto result = new POGOProtos.Rpc.PixelPointProto(this);
      result.pixelX_ = pixelX_;
      result.pixelY_ = pixelY_;
      result.zoomLevel_ = zoomLevel_;
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
      if (other instanceof POGOProtos.Rpc.PixelPointProto) {
        return mergeFrom((POGOProtos.Rpc.PixelPointProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PixelPointProto other) {
      if (other == POGOProtos.Rpc.PixelPointProto.getDefaultInstance()) return this;
      if (other.getPixelX() != 0) {
        setPixelX(other.getPixelX());
      }
      if (other.getPixelY() != 0) {
        setPixelY(other.getPixelY());
      }
      if (other.getZoomLevel() != 0) {
        setZoomLevel(other.getZoomLevel());
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
      POGOProtos.Rpc.PixelPointProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PixelPointProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pixelX_ ;
    /**
     * <code>int32 pixel_x = 1;</code>
     * @return The pixelX.
     */
    @java.lang.Override
    public int getPixelX() {
      return pixelX_;
    }
    /**
     * <code>int32 pixel_x = 1;</code>
     * @param value The pixelX to set.
     * @return This builder for chaining.
     */
    public Builder setPixelX(int value) {
      
      pixelX_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pixel_x = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixelX() {
      
      pixelX_ = 0;
      onChanged();
      return this;
    }

    private int pixelY_ ;
    /**
     * <code>int32 pixel_y = 2;</code>
     * @return The pixelY.
     */
    @java.lang.Override
    public int getPixelY() {
      return pixelY_;
    }
    /**
     * <code>int32 pixel_y = 2;</code>
     * @param value The pixelY to set.
     * @return This builder for chaining.
     */
    public Builder setPixelY(int value) {
      
      pixelY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pixel_y = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixelY() {
      
      pixelY_ = 0;
      onChanged();
      return this;
    }

    private int zoomLevel_ ;
    /**
     * <code>int32 zoom_level = 3;</code>
     * @return The zoomLevel.
     */
    @java.lang.Override
    public int getZoomLevel() {
      return zoomLevel_;
    }
    /**
     * <code>int32 zoom_level = 3;</code>
     * @param value The zoomLevel to set.
     * @return This builder for chaining.
     */
    public Builder setZoomLevel(int value) {
      
      zoomLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 zoom_level = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearZoomLevel() {
      
      zoomLevel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PixelPointProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PixelPointProto)
  private static final POGOProtos.Rpc.PixelPointProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PixelPointProto();
  }

  public static POGOProtos.Rpc.PixelPointProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PixelPointProto>
      PARSER = new com.google.protobuf.AbstractParser<PixelPointProto>() {
    @java.lang.Override
    public PixelPointProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PixelPointProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PixelPointProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PixelPointProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PixelPointProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
