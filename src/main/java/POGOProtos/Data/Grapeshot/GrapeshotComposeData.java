// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Grapeshot/GrapeshotComposeData.proto

package POGOProtos.Data.Grapeshot;

/**
 * Protobuf type {@code POGOProtos.Data.Grapeshot.GrapeshotComposeData}
 */
public  final class GrapeshotComposeData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Grapeshot.GrapeshotComposeData)
    GrapeshotComposeDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GrapeshotComposeData.newBuilder() to construct.
  private GrapeshotComposeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrapeshotComposeData() {
    targetFilePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GrapeshotComposeData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GrapeshotComposeData(
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

            targetFilePath_ = s;
            break;
          }
          case 18: {
            POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.Builder subBuilder = null;
            if (authentication_ != null) {
              subBuilder = authentication_.toBuilder();
            }
            authentication_ = input.readMessage(POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(authentication_);
              authentication_ = subBuilder.buildPartial();
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
    return POGOProtos.Data.Grapeshot.GrapeshotComposeDataOuterClass.internal_static_POGOProtos_Data_Grapeshot_GrapeshotComposeData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Grapeshot.GrapeshotComposeDataOuterClass.internal_static_POGOProtos_Data_Grapeshot_GrapeshotComposeData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Grapeshot.GrapeshotComposeData.class, POGOProtos.Data.Grapeshot.GrapeshotComposeData.Builder.class);
  }

  public static final int TARGET_FILE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object targetFilePath_;
  /**
   * <code>string target_file_path = 1;</code>
   * @return The targetFilePath.
   */
  public java.lang.String getTargetFilePath() {
    java.lang.Object ref = targetFilePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetFilePath_ = s;
      return s;
    }
  }
  /**
   * <code>string target_file_path = 1;</code>
   * @return The bytes for targetFilePath.
   */
  public com.google.protobuf.ByteString
      getTargetFilePathBytes() {
    java.lang.Object ref = targetFilePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetFilePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHENTICATION_FIELD_NUMBER = 2;
  private POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication_;
  /**
   * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
   * @return Whether the authentication field is set.
   */
  public boolean hasAuthentication() {
    return authentication_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
   * @return The authentication.
   */
  public POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData getAuthentication() {
    return authentication_ == null ? POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.getDefaultInstance() : authentication_;
  }
  /**
   * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
   */
  public POGOProtos.Data.Grapeshot.GrapeshotAuthenticationDataOrBuilder getAuthenticationOrBuilder() {
    return getAuthentication();
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
    if (!getTargetFilePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetFilePath_);
    }
    if (authentication_ != null) {
      output.writeMessage(2, getAuthentication());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTargetFilePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetFilePath_);
    }
    if (authentication_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthentication());
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
    if (!(obj instanceof POGOProtos.Data.Grapeshot.GrapeshotComposeData)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Grapeshot.GrapeshotComposeData other = (POGOProtos.Data.Grapeshot.GrapeshotComposeData) obj;

    if (!getTargetFilePath()
        .equals(other.getTargetFilePath())) return false;
    if (hasAuthentication() != other.hasAuthentication()) return false;
    if (hasAuthentication()) {
      if (!getAuthentication()
          .equals(other.getAuthentication())) return false;
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
    hash = (37 * hash) + TARGET_FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getTargetFilePath().hashCode();
    if (hasAuthentication()) {
      hash = (37 * hash) + AUTHENTICATION_FIELD_NUMBER;
      hash = (53 * hash) + getAuthentication().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Grapeshot.GrapeshotComposeData prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Grapeshot.GrapeshotComposeData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Grapeshot.GrapeshotComposeData)
      POGOProtos.Data.Grapeshot.GrapeshotComposeDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Grapeshot.GrapeshotComposeDataOuterClass.internal_static_POGOProtos_Data_Grapeshot_GrapeshotComposeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Grapeshot.GrapeshotComposeDataOuterClass.internal_static_POGOProtos_Data_Grapeshot_GrapeshotComposeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Grapeshot.GrapeshotComposeData.class, POGOProtos.Data.Grapeshot.GrapeshotComposeData.Builder.class);
    }

    // Construct using POGOProtos.Data.Grapeshot.GrapeshotComposeData.newBuilder()
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
      targetFilePath_ = "";

      if (authenticationBuilder_ == null) {
        authentication_ = null;
      } else {
        authentication_ = null;
        authenticationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Grapeshot.GrapeshotComposeDataOuterClass.internal_static_POGOProtos_Data_Grapeshot_GrapeshotComposeData_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Grapeshot.GrapeshotComposeData getDefaultInstanceForType() {
      return POGOProtos.Data.Grapeshot.GrapeshotComposeData.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Grapeshot.GrapeshotComposeData build() {
      POGOProtos.Data.Grapeshot.GrapeshotComposeData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Grapeshot.GrapeshotComposeData buildPartial() {
      POGOProtos.Data.Grapeshot.GrapeshotComposeData result = new POGOProtos.Data.Grapeshot.GrapeshotComposeData(this);
      result.targetFilePath_ = targetFilePath_;
      if (authenticationBuilder_ == null) {
        result.authentication_ = authentication_;
      } else {
        result.authentication_ = authenticationBuilder_.build();
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
      if (other instanceof POGOProtos.Data.Grapeshot.GrapeshotComposeData) {
        return mergeFrom((POGOProtos.Data.Grapeshot.GrapeshotComposeData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Grapeshot.GrapeshotComposeData other) {
      if (other == POGOProtos.Data.Grapeshot.GrapeshotComposeData.getDefaultInstance()) return this;
      if (!other.getTargetFilePath().isEmpty()) {
        targetFilePath_ = other.targetFilePath_;
        onChanged();
      }
      if (other.hasAuthentication()) {
        mergeAuthentication(other.getAuthentication());
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
      POGOProtos.Data.Grapeshot.GrapeshotComposeData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Grapeshot.GrapeshotComposeData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object targetFilePath_ = "";
    /**
     * <code>string target_file_path = 1;</code>
     * @return The targetFilePath.
     */
    public java.lang.String getTargetFilePath() {
      java.lang.Object ref = targetFilePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetFilePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string target_file_path = 1;</code>
     * @return The bytes for targetFilePath.
     */
    public com.google.protobuf.ByteString
        getTargetFilePathBytes() {
      java.lang.Object ref = targetFilePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetFilePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string target_file_path = 1;</code>
     * @param value The targetFilePath to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFilePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      targetFilePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string target_file_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetFilePath() {
      
      targetFilePath_ = getDefaultInstance().getTargetFilePath();
      onChanged();
      return this;
    }
    /**
     * <code>string target_file_path = 1;</code>
     * @param value The bytes for targetFilePath to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFilePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      targetFilePath_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData, POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.Builder, POGOProtos.Data.Grapeshot.GrapeshotAuthenticationDataOrBuilder> authenticationBuilder_;
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     * @return Whether the authentication field is set.
     */
    public boolean hasAuthentication() {
      return authenticationBuilder_ != null || authentication_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     * @return The authentication.
     */
    public POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData getAuthentication() {
      if (authenticationBuilder_ == null) {
        return authentication_ == null ? POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.getDefaultInstance() : authentication_;
      } else {
        return authenticationBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    public Builder setAuthentication(POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData value) {
      if (authenticationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authentication_ = value;
        onChanged();
      } else {
        authenticationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    public Builder setAuthentication(
        POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.Builder builderForValue) {
      if (authenticationBuilder_ == null) {
        authentication_ = builderForValue.build();
        onChanged();
      } else {
        authenticationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    public Builder mergeAuthentication(POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData value) {
      if (authenticationBuilder_ == null) {
        if (authentication_ != null) {
          authentication_ =
            POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.newBuilder(authentication_).mergeFrom(value).buildPartial();
        } else {
          authentication_ = value;
        }
        onChanged();
      } else {
        authenticationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    public Builder clearAuthentication() {
      if (authenticationBuilder_ == null) {
        authentication_ = null;
        onChanged();
      } else {
        authentication_ = null;
        authenticationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    public POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.Builder getAuthenticationBuilder() {
      
      onChanged();
      return getAuthenticationFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    public POGOProtos.Data.Grapeshot.GrapeshotAuthenticationDataOrBuilder getAuthenticationOrBuilder() {
      if (authenticationBuilder_ != null) {
        return authenticationBuilder_.getMessageOrBuilder();
      } else {
        return authentication_ == null ?
            POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.getDefaultInstance() : authentication_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData, POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.Builder, POGOProtos.Data.Grapeshot.GrapeshotAuthenticationDataOrBuilder> 
        getAuthenticationFieldBuilder() {
      if (authenticationBuilder_ == null) {
        authenticationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData, POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData.Builder, POGOProtos.Data.Grapeshot.GrapeshotAuthenticationDataOrBuilder>(
                getAuthentication(),
                getParentForChildren(),
                isClean());
        authentication_ = null;
      }
      return authenticationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Grapeshot.GrapeshotComposeData)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Grapeshot.GrapeshotComposeData)
  private static final POGOProtos.Data.Grapeshot.GrapeshotComposeData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Grapeshot.GrapeshotComposeData();
  }

  public static POGOProtos.Data.Grapeshot.GrapeshotComposeData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrapeshotComposeData>
      PARSER = new com.google.protobuf.AbstractParser<GrapeshotComposeData>() {
    @java.lang.Override
    public GrapeshotComposeData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GrapeshotComposeData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrapeshotComposeData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrapeshotComposeData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Grapeshot.GrapeshotComposeData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

