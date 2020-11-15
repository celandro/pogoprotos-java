// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.BelugaTransactionCompleteProto}
 */
public final class BelugaTransactionCompleteProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BelugaTransactionCompleteProto)
    BelugaTransactionCompleteProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BelugaTransactionCompleteProto.newBuilder() to construct.
  private BelugaTransactionCompleteProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BelugaTransactionCompleteProto() {
    appSignature_ = com.google.protobuf.ByteString.EMPTY;
    firmwareSignature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BelugaTransactionCompleteProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BelugaTransactionCompleteProto(
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
            POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder subBuilder = null;
            if (belugaTransfer_ != null) {
              subBuilder = belugaTransfer_.toBuilder();
            }
            belugaTransfer_ = input.readMessage(POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(belugaTransfer_);
              belugaTransfer_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            appSignature_ = input.readBytes();
            break;
          }
          case 26: {

            firmwareSignature_ = input.readBytes();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaTransactionCompleteProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaTransactionCompleteProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BelugaTransactionCompleteProto.class, POGOProtos.Rpc.BelugaTransactionCompleteProto.Builder.class);
  }

  public static final int BELUGA_TRANSFER_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto belugaTransfer_;
  /**
   * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
   * @return Whether the belugaTransfer field is set.
   */
  @java.lang.Override
  public boolean hasBelugaTransfer() {
    return belugaTransfer_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
   * @return The belugaTransfer.
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto getBelugaTransfer() {
    return belugaTransfer_ == null ? POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.getDefaultInstance() : belugaTransfer_;
  }
  /**
   * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProtoOrBuilder getBelugaTransferOrBuilder() {
    return getBelugaTransfer();
  }

  public static final int APP_SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString appSignature_;
  /**
   * <code>bytes app_signature = 2;</code>
   * @return The appSignature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAppSignature() {
    return appSignature_;
  }

  public static final int FIRMWARE_SIGNATURE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString firmwareSignature_;
  /**
   * <code>bytes firmware_signature = 3;</code>
   * @return The firmwareSignature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFirmwareSignature() {
    return firmwareSignature_;
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
    if (belugaTransfer_ != null) {
      output.writeMessage(1, getBelugaTransfer());
    }
    if (!appSignature_.isEmpty()) {
      output.writeBytes(2, appSignature_);
    }
    if (!firmwareSignature_.isEmpty()) {
      output.writeBytes(3, firmwareSignature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (belugaTransfer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBelugaTransfer());
    }
    if (!appSignature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, appSignature_);
    }
    if (!firmwareSignature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, firmwareSignature_);
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
    if (!(obj instanceof POGOProtos.Rpc.BelugaTransactionCompleteProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BelugaTransactionCompleteProto other = (POGOProtos.Rpc.BelugaTransactionCompleteProto) obj;

    if (hasBelugaTransfer() != other.hasBelugaTransfer()) return false;
    if (hasBelugaTransfer()) {
      if (!getBelugaTransfer()
          .equals(other.getBelugaTransfer())) return false;
    }
    if (!getAppSignature()
        .equals(other.getAppSignature())) return false;
    if (!getFirmwareSignature()
        .equals(other.getFirmwareSignature())) return false;
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
    if (hasBelugaTransfer()) {
      hash = (37 * hash) + BELUGA_TRANSFER_FIELD_NUMBER;
      hash = (53 * hash) + getBelugaTransfer().hashCode();
    }
    hash = (37 * hash) + APP_SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getAppSignature().hashCode();
    hash = (37 * hash) + FIRMWARE_SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getFirmwareSignature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BelugaTransactionCompleteProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BelugaTransactionCompleteProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.BelugaTransactionCompleteProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BelugaTransactionCompleteProto)
      POGOProtos.Rpc.BelugaTransactionCompleteProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaTransactionCompleteProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaTransactionCompleteProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BelugaTransactionCompleteProto.class, POGOProtos.Rpc.BelugaTransactionCompleteProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BelugaTransactionCompleteProto.newBuilder()
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
      if (belugaTransferBuilder_ == null) {
        belugaTransfer_ = null;
      } else {
        belugaTransfer_ = null;
        belugaTransferBuilder_ = null;
      }
      appSignature_ = com.google.protobuf.ByteString.EMPTY;

      firmwareSignature_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_BelugaTransactionCompleteProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaTransactionCompleteProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.BelugaTransactionCompleteProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaTransactionCompleteProto build() {
      POGOProtos.Rpc.BelugaTransactionCompleteProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BelugaTransactionCompleteProto buildPartial() {
      POGOProtos.Rpc.BelugaTransactionCompleteProto result = new POGOProtos.Rpc.BelugaTransactionCompleteProto(this);
      if (belugaTransferBuilder_ == null) {
        result.belugaTransfer_ = belugaTransfer_;
      } else {
        result.belugaTransfer_ = belugaTransferBuilder_.build();
      }
      result.appSignature_ = appSignature_;
      result.firmwareSignature_ = firmwareSignature_;
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
      if (other instanceof POGOProtos.Rpc.BelugaTransactionCompleteProto) {
        return mergeFrom((POGOProtos.Rpc.BelugaTransactionCompleteProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BelugaTransactionCompleteProto other) {
      if (other == POGOProtos.Rpc.BelugaTransactionCompleteProto.getDefaultInstance()) return this;
      if (other.hasBelugaTransfer()) {
        mergeBelugaTransfer(other.getBelugaTransfer());
      }
      if (other.getAppSignature() != com.google.protobuf.ByteString.EMPTY) {
        setAppSignature(other.getAppSignature());
      }
      if (other.getFirmwareSignature() != com.google.protobuf.ByteString.EMPTY) {
        setFirmwareSignature(other.getFirmwareSignature());
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
      POGOProtos.Rpc.BelugaTransactionCompleteProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BelugaTransactionCompleteProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto belugaTransfer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProtoOrBuilder> belugaTransferBuilder_;
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     * @return Whether the belugaTransfer field is set.
     */
    public boolean hasBelugaTransfer() {
      return belugaTransferBuilder_ != null || belugaTransfer_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     * @return The belugaTransfer.
     */
    public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto getBelugaTransfer() {
      if (belugaTransferBuilder_ == null) {
        return belugaTransfer_ == null ? POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.getDefaultInstance() : belugaTransfer_;
      } else {
        return belugaTransferBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    public Builder setBelugaTransfer(POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto value) {
      if (belugaTransferBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        belugaTransfer_ = value;
        onChanged();
      } else {
        belugaTransferBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    public Builder setBelugaTransfer(
        POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder builderForValue) {
      if (belugaTransferBuilder_ == null) {
        belugaTransfer_ = builderForValue.build();
        onChanged();
      } else {
        belugaTransferBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    public Builder mergeBelugaTransfer(POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto value) {
      if (belugaTransferBuilder_ == null) {
        if (belugaTransfer_ != null) {
          belugaTransfer_ =
            POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.newBuilder(belugaTransfer_).mergeFrom(value).buildPartial();
        } else {
          belugaTransfer_ = value;
        }
        onChanged();
      } else {
        belugaTransferBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    public Builder clearBelugaTransfer() {
      if (belugaTransferBuilder_ == null) {
        belugaTransfer_ = null;
        onChanged();
      } else {
        belugaTransfer_ = null;
        belugaTransferBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder getBelugaTransferBuilder() {
      
      onChanged();
      return getBelugaTransferFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    public POGOProtos.Rpc.BelugaBleCompleteTransferRequestProtoOrBuilder getBelugaTransferOrBuilder() {
      if (belugaTransferBuilder_ != null) {
        return belugaTransferBuilder_.getMessageOrBuilder();
      } else {
        return belugaTransfer_ == null ?
            POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.getDefaultInstance() : belugaTransfer_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto beluga_transfer = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProtoOrBuilder> 
        getBelugaTransferFieldBuilder() {
      if (belugaTransferBuilder_ == null) {
        belugaTransferBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProto.Builder, POGOProtos.Rpc.BelugaBleCompleteTransferRequestProtoOrBuilder>(
                getBelugaTransfer(),
                getParentForChildren(),
                isClean());
        belugaTransfer_ = null;
      }
      return belugaTransferBuilder_;
    }

    private com.google.protobuf.ByteString appSignature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes app_signature = 2;</code>
     * @return The appSignature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAppSignature() {
      return appSignature_;
    }
    /**
     * <code>bytes app_signature = 2;</code>
     * @param value The appSignature to set.
     * @return This builder for chaining.
     */
    public Builder setAppSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes app_signature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppSignature() {
      
      appSignature_ = getDefaultInstance().getAppSignature();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString firmwareSignature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes firmware_signature = 3;</code>
     * @return The firmwareSignature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFirmwareSignature() {
      return firmwareSignature_;
    }
    /**
     * <code>bytes firmware_signature = 3;</code>
     * @param value The firmwareSignature to set.
     * @return This builder for chaining.
     */
    public Builder setFirmwareSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firmwareSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes firmware_signature = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirmwareSignature() {
      
      firmwareSignature_ = getDefaultInstance().getFirmwareSignature();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BelugaTransactionCompleteProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BelugaTransactionCompleteProto)
  private static final POGOProtos.Rpc.BelugaTransactionCompleteProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BelugaTransactionCompleteProto();
  }

  public static POGOProtos.Rpc.BelugaTransactionCompleteProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BelugaTransactionCompleteProto>
      PARSER = new com.google.protobuf.AbstractParser<BelugaTransactionCompleteProto>() {
    @java.lang.Override
    public BelugaTransactionCompleteProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BelugaTransactionCompleteProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BelugaTransactionCompleteProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BelugaTransactionCompleteProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BelugaTransactionCompleteProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

