// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SubmitPoiImageProto}
 */
public final class SubmitPoiImageProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SubmitPoiImageProto)
    SubmitPoiImageProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitPoiImageProto.newBuilder() to construct.
  private SubmitPoiImageProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitPoiImageProto() {
    poiId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitPoiImageProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitPoiImageProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            poiId_ = s;
            break;
          }
          case 16: {

            asyncFileUpload_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPoiImageProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPoiImageProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SubmitPoiImageProto.class, POGOProtos.Rpc.SubmitPoiImageProto.Builder.class);
  }

  public static final int POI_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object poiId_;
  /**
   * <code>string poi_id = 1;</code>
   * @return The poiId.
   */
  @java.lang.Override
  public java.lang.String getPoiId() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiId_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_id = 1;</code>
   * @return The bytes for poiId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoiIdBytes() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASYNC_FILE_UPLOAD_FIELD_NUMBER = 2;
  private boolean asyncFileUpload_;
  /**
   * <code>bool async_file_upload = 2;</code>
   * @return The asyncFileUpload.
   */
  @java.lang.Override
  public boolean getAsyncFileUpload() {
    return asyncFileUpload_;
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
    if (!getPoiIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, poiId_);
    }
    if (asyncFileUpload_ != false) {
      output.writeBool(2, asyncFileUpload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPoiIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, poiId_);
    }
    if (asyncFileUpload_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, asyncFileUpload_);
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
    if (!(obj instanceof POGOProtos.Rpc.SubmitPoiImageProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SubmitPoiImageProto other = (POGOProtos.Rpc.SubmitPoiImageProto) obj;

    if (!getPoiId()
        .equals(other.getPoiId())) return false;
    if (getAsyncFileUpload()
        != other.getAsyncFileUpload()) return false;
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
    hash = (37 * hash) + POI_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiId().hashCode();
    hash = (37 * hash) + ASYNC_FILE_UPLOAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAsyncFileUpload());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitPoiImageProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SubmitPoiImageProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SubmitPoiImageProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SubmitPoiImageProto)
      POGOProtos.Rpc.SubmitPoiImageProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPoiImageProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPoiImageProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SubmitPoiImageProto.class, POGOProtos.Rpc.SubmitPoiImageProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SubmitPoiImageProto.newBuilder()
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
      poiId_ = "";

      asyncFileUpload_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitPoiImageProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitPoiImageProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SubmitPoiImageProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitPoiImageProto build() {
      POGOProtos.Rpc.SubmitPoiImageProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitPoiImageProto buildPartial() {
      POGOProtos.Rpc.SubmitPoiImageProto result = new POGOProtos.Rpc.SubmitPoiImageProto(this);
      result.poiId_ = poiId_;
      result.asyncFileUpload_ = asyncFileUpload_;
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
      if (other instanceof POGOProtos.Rpc.SubmitPoiImageProto) {
        return mergeFrom((POGOProtos.Rpc.SubmitPoiImageProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SubmitPoiImageProto other) {
      if (other == POGOProtos.Rpc.SubmitPoiImageProto.getDefaultInstance()) return this;
      if (!other.getPoiId().isEmpty()) {
        poiId_ = other.poiId_;
        onChanged();
      }
      if (other.getAsyncFileUpload() != false) {
        setAsyncFileUpload(other.getAsyncFileUpload());
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
      POGOProtos.Rpc.SubmitPoiImageProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SubmitPoiImageProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object poiId_ = "";
    /**
     * <code>string poi_id = 1;</code>
     * @return The poiId.
     */
    public java.lang.String getPoiId() {
      java.lang.Object ref = poiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return The bytes for poiId.
     */
    public com.google.protobuf.ByteString
        getPoiIdBytes() {
      java.lang.Object ref = poiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiId() {
      
      poiId_ = getDefaultInstance().getPoiId();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The bytes for poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiId_ = value;
      onChanged();
      return this;
    }

    private boolean asyncFileUpload_ ;
    /**
     * <code>bool async_file_upload = 2;</code>
     * @return The asyncFileUpload.
     */
    @java.lang.Override
    public boolean getAsyncFileUpload() {
      return asyncFileUpload_;
    }
    /**
     * <code>bool async_file_upload = 2;</code>
     * @param value The asyncFileUpload to set.
     * @return This builder for chaining.
     */
    public Builder setAsyncFileUpload(boolean value) {
      
      asyncFileUpload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool async_file_upload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAsyncFileUpload() {
      
      asyncFileUpload_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SubmitPoiImageProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SubmitPoiImageProto)
  private static final POGOProtos.Rpc.SubmitPoiImageProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SubmitPoiImageProto();
  }

  public static POGOProtos.Rpc.SubmitPoiImageProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitPoiImageProto>
      PARSER = new com.google.protobuf.AbstractParser<SubmitPoiImageProto>() {
    @java.lang.Override
    public SubmitPoiImageProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitPoiImageProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitPoiImageProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitPoiImageProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SubmitPoiImageProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

