// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.SubmitNewPoiProto}
 */
public final class SubmitNewPoiProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.SubmitNewPoiProto)
    SubmitNewPoiProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitNewPoiProto.newBuilder() to construct.
  private SubmitNewPoiProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitNewPoiProto() {
    title_ = "";
    longDescription_ = "";
    supportingStatement_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitNewPoiProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitNewPoiProto(
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

            title_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            longDescription_ = s;
            break;
          }
          case 32: {

            latE6_ = input.readInt32();
            break;
          }
          case 40: {

            lngE6_ = input.readInt32();
            break;
          }
          case 114: {
            java.lang.String s = input.readStringRequireUtf8();

            supportingStatement_ = s;
            break;
          }
          case 144: {

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitNewPoiProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitNewPoiProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.SubmitNewPoiProto.class, POGOProtos.Rpc.SubmitNewPoiProto.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LONG_DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object longDescription_;
  /**
   * <code>string long_description = 2;</code>
   * @return The longDescription.
   */
  @java.lang.Override
  public java.lang.String getLongDescription() {
    java.lang.Object ref = longDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      longDescription_ = s;
      return s;
    }
  }
  /**
   * <code>string long_description = 2;</code>
   * @return The bytes for longDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLongDescriptionBytes() {
    java.lang.Object ref = longDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      longDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAT_E6_FIELD_NUMBER = 4;
  private int latE6_;
  /**
   * <code>int32 lat_e6 = 4;</code>
   * @return The latE6.
   */
  @java.lang.Override
  public int getLatE6() {
    return latE6_;
  }

  public static final int LNG_E6_FIELD_NUMBER = 5;
  private int lngE6_;
  /**
   * <code>int32 lng_e6 = 5;</code>
   * @return The lngE6.
   */
  @java.lang.Override
  public int getLngE6() {
    return lngE6_;
  }

  public static final int SUPPORTING_STATEMENT_FIELD_NUMBER = 14;
  private volatile java.lang.Object supportingStatement_;
  /**
   * <code>string supporting_statement = 14;</code>
   * @return The supportingStatement.
   */
  @java.lang.Override
  public java.lang.String getSupportingStatement() {
    java.lang.Object ref = supportingStatement_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      supportingStatement_ = s;
      return s;
    }
  }
  /**
   * <code>string supporting_statement = 14;</code>
   * @return The bytes for supportingStatement.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSupportingStatementBytes() {
    java.lang.Object ref = supportingStatement_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      supportingStatement_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASYNC_FILE_UPLOAD_FIELD_NUMBER = 18;
  private boolean asyncFileUpload_;
  /**
   * <code>bool async_file_upload = 18;</code>
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
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!getLongDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, longDescription_);
    }
    if (latE6_ != 0) {
      output.writeInt32(4, latE6_);
    }
    if (lngE6_ != 0) {
      output.writeInt32(5, lngE6_);
    }
    if (!getSupportingStatementBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 14, supportingStatement_);
    }
    if (asyncFileUpload_ != false) {
      output.writeBool(18, asyncFileUpload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!getLongDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, longDescription_);
    }
    if (latE6_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, latE6_);
    }
    if (lngE6_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, lngE6_);
    }
    if (!getSupportingStatementBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, supportingStatement_);
    }
    if (asyncFileUpload_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(18, asyncFileUpload_);
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
    if (!(obj instanceof POGOProtos.Rpc.SubmitNewPoiProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.SubmitNewPoiProto other = (POGOProtos.Rpc.SubmitNewPoiProto) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getLongDescription()
        .equals(other.getLongDescription())) return false;
    if (getLatE6()
        != other.getLatE6()) return false;
    if (getLngE6()
        != other.getLngE6()) return false;
    if (!getSupportingStatement()
        .equals(other.getSupportingStatement())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + LONG_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getLongDescription().hashCode();
    hash = (37 * hash) + LAT_E6_FIELD_NUMBER;
    hash = (53 * hash) + getLatE6();
    hash = (37 * hash) + LNG_E6_FIELD_NUMBER;
    hash = (53 * hash) + getLngE6();
    hash = (37 * hash) + SUPPORTING_STATEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getSupportingStatement().hashCode();
    hash = (37 * hash) + ASYNC_FILE_UPLOAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAsyncFileUpload());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.SubmitNewPoiProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.SubmitNewPoiProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.SubmitNewPoiProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.SubmitNewPoiProto)
      POGOProtos.Rpc.SubmitNewPoiProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitNewPoiProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitNewPoiProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.SubmitNewPoiProto.class, POGOProtos.Rpc.SubmitNewPoiProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.SubmitNewPoiProto.newBuilder()
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
      title_ = "";

      longDescription_ = "";

      latE6_ = 0;

      lngE6_ = 0;

      supportingStatement_ = "";

      asyncFileUpload_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_SubmitNewPoiProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitNewPoiProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.SubmitNewPoiProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitNewPoiProto build() {
      POGOProtos.Rpc.SubmitNewPoiProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.SubmitNewPoiProto buildPartial() {
      POGOProtos.Rpc.SubmitNewPoiProto result = new POGOProtos.Rpc.SubmitNewPoiProto(this);
      result.title_ = title_;
      result.longDescription_ = longDescription_;
      result.latE6_ = latE6_;
      result.lngE6_ = lngE6_;
      result.supportingStatement_ = supportingStatement_;
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
      if (other instanceof POGOProtos.Rpc.SubmitNewPoiProto) {
        return mergeFrom((POGOProtos.Rpc.SubmitNewPoiProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.SubmitNewPoiProto other) {
      if (other == POGOProtos.Rpc.SubmitNewPoiProto.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getLongDescription().isEmpty()) {
        longDescription_ = other.longDescription_;
        onChanged();
      }
      if (other.getLatE6() != 0) {
        setLatE6(other.getLatE6());
      }
      if (other.getLngE6() != 0) {
        setLngE6(other.getLngE6());
      }
      if (!other.getSupportingStatement().isEmpty()) {
        supportingStatement_ = other.supportingStatement_;
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
      POGOProtos.Rpc.SubmitNewPoiProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.SubmitNewPoiProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object longDescription_ = "";
    /**
     * <code>string long_description = 2;</code>
     * @return The longDescription.
     */
    public java.lang.String getLongDescription() {
      java.lang.Object ref = longDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        longDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string long_description = 2;</code>
     * @return The bytes for longDescription.
     */
    public com.google.protobuf.ByteString
        getLongDescriptionBytes() {
      java.lang.Object ref = longDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        longDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string long_description = 2;</code>
     * @param value The longDescription to set.
     * @return This builder for chaining.
     */
    public Builder setLongDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      longDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string long_description = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongDescription() {
      
      longDescription_ = getDefaultInstance().getLongDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string long_description = 2;</code>
     * @param value The bytes for longDescription to set.
     * @return This builder for chaining.
     */
    public Builder setLongDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      longDescription_ = value;
      onChanged();
      return this;
    }

    private int latE6_ ;
    /**
     * <code>int32 lat_e6 = 4;</code>
     * @return The latE6.
     */
    @java.lang.Override
    public int getLatE6() {
      return latE6_;
    }
    /**
     * <code>int32 lat_e6 = 4;</code>
     * @param value The latE6 to set.
     * @return This builder for chaining.
     */
    public Builder setLatE6(int value) {
      
      latE6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lat_e6 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatE6() {
      
      latE6_ = 0;
      onChanged();
      return this;
    }

    private int lngE6_ ;
    /**
     * <code>int32 lng_e6 = 5;</code>
     * @return The lngE6.
     */
    @java.lang.Override
    public int getLngE6() {
      return lngE6_;
    }
    /**
     * <code>int32 lng_e6 = 5;</code>
     * @param value The lngE6 to set.
     * @return This builder for chaining.
     */
    public Builder setLngE6(int value) {
      
      lngE6_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 lng_e6 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLngE6() {
      
      lngE6_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object supportingStatement_ = "";
    /**
     * <code>string supporting_statement = 14;</code>
     * @return The supportingStatement.
     */
    public java.lang.String getSupportingStatement() {
      java.lang.Object ref = supportingStatement_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        supportingStatement_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string supporting_statement = 14;</code>
     * @return The bytes for supportingStatement.
     */
    public com.google.protobuf.ByteString
        getSupportingStatementBytes() {
      java.lang.Object ref = supportingStatement_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        supportingStatement_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string supporting_statement = 14;</code>
     * @param value The supportingStatement to set.
     * @return This builder for chaining.
     */
    public Builder setSupportingStatement(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      supportingStatement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string supporting_statement = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearSupportingStatement() {
      
      supportingStatement_ = getDefaultInstance().getSupportingStatement();
      onChanged();
      return this;
    }
    /**
     * <code>string supporting_statement = 14;</code>
     * @param value The bytes for supportingStatement to set.
     * @return This builder for chaining.
     */
    public Builder setSupportingStatementBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      supportingStatement_ = value;
      onChanged();
      return this;
    }

    private boolean asyncFileUpload_ ;
    /**
     * <code>bool async_file_upload = 18;</code>
     * @return The asyncFileUpload.
     */
    @java.lang.Override
    public boolean getAsyncFileUpload() {
      return asyncFileUpload_;
    }
    /**
     * <code>bool async_file_upload = 18;</code>
     * @param value The asyncFileUpload to set.
     * @return This builder for chaining.
     */
    public Builder setAsyncFileUpload(boolean value) {
      
      asyncFileUpload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool async_file_upload = 18;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.SubmitNewPoiProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.SubmitNewPoiProto)
  private static final POGOProtos.Rpc.SubmitNewPoiProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.SubmitNewPoiProto();
  }

  public static POGOProtos.Rpc.SubmitNewPoiProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitNewPoiProto>
      PARSER = new com.google.protobuf.AbstractParser<SubmitNewPoiProto>() {
    @java.lang.Override
    public SubmitNewPoiProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitNewPoiProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitNewPoiProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitNewPoiProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.SubmitNewPoiProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

