// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PFPJGDJKEKH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PFPJGDJKEKH}
 */
public final class PFPJGDJKEKH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PFPJGDJKEKH)
    PFPJGDJKEKHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PFPJGDJKEKH.newBuilder() to construct.
  private PFPJGDJKEKH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PFPJGDJKEKH() {
    mlghifehoah_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PFPJGDJKEKH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PFPJGDJKEKH(
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
            POGOProtos.Rpc.PLPBKPABGMK.Builder subBuilder = null;
            if (ndpcmkigeci_ != null) {
              subBuilder = ndpcmkigeci_.toBuilder();
            }
            ndpcmkigeci_ = input.readMessage(POGOProtos.Rpc.PLPBKPABGMK.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ndpcmkigeci_);
              ndpcmkigeci_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            mlghifehoah_ = input.readBytes();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPJGDJKEKH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPJGDJKEKH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PFPJGDJKEKH.class, POGOProtos.Rpc.PFPJGDJKEKH.Builder.class);
  }

  public static final int NDPCMKIGECI_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci_;
  /**
   * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
   * @return Whether the ndpcmkigeci field is set.
   */
  @java.lang.Override
  public boolean hasNdpcmkigeci() {
    return ndpcmkigeci_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
   * @return The ndpcmkigeci.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PLPBKPABGMK getNdpcmkigeci() {
    return ndpcmkigeci_ == null ? POGOProtos.Rpc.PLPBKPABGMK.getDefaultInstance() : ndpcmkigeci_;
  }
  /**
   * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PLPBKPABGMKOrBuilder getNdpcmkigeciOrBuilder() {
    return getNdpcmkigeci();
  }

  public static final int MLGHIFEHOAH_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString mlghifehoah_;
  /**
   * <code>bytes mlghifehoah = 2;</code>
   * @return The mlghifehoah.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMlghifehoah() {
    return mlghifehoah_;
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
    if (ndpcmkigeci_ != null) {
      output.writeMessage(1, getNdpcmkigeci());
    }
    if (!mlghifehoah_.isEmpty()) {
      output.writeBytes(2, mlghifehoah_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ndpcmkigeci_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNdpcmkigeci());
    }
    if (!mlghifehoah_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, mlghifehoah_);
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
    if (!(obj instanceof POGOProtos.Rpc.PFPJGDJKEKH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PFPJGDJKEKH other = (POGOProtos.Rpc.PFPJGDJKEKH) obj;

    if (hasNdpcmkigeci() != other.hasNdpcmkigeci()) return false;
    if (hasNdpcmkigeci()) {
      if (!getNdpcmkigeci()
          .equals(other.getNdpcmkigeci())) return false;
    }
    if (!getMlghifehoah()
        .equals(other.getMlghifehoah())) return false;
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
    if (hasNdpcmkigeci()) {
      hash = (37 * hash) + NDPCMKIGECI_FIELD_NUMBER;
      hash = (53 * hash) + getNdpcmkigeci().hashCode();
    }
    hash = (37 * hash) + MLGHIFEHOAH_FIELD_NUMBER;
    hash = (53 * hash) + getMlghifehoah().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PFPJGDJKEKH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PFPJGDJKEKH prototype) {
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
   * <pre>
   * ref: PFPJGDJKEKH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PFPJGDJKEKH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PFPJGDJKEKH)
      POGOProtos.Rpc.PFPJGDJKEKHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPJGDJKEKH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPJGDJKEKH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PFPJGDJKEKH.class, POGOProtos.Rpc.PFPJGDJKEKH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PFPJGDJKEKH.newBuilder()
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
      if (ndpcmkigeciBuilder_ == null) {
        ndpcmkigeci_ = null;
      } else {
        ndpcmkigeci_ = null;
        ndpcmkigeciBuilder_ = null;
      }
      mlghifehoah_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PFPJGDJKEKH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFPJGDJKEKH getDefaultInstanceForType() {
      return POGOProtos.Rpc.PFPJGDJKEKH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFPJGDJKEKH build() {
      POGOProtos.Rpc.PFPJGDJKEKH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PFPJGDJKEKH buildPartial() {
      POGOProtos.Rpc.PFPJGDJKEKH result = new POGOProtos.Rpc.PFPJGDJKEKH(this);
      if (ndpcmkigeciBuilder_ == null) {
        result.ndpcmkigeci_ = ndpcmkigeci_;
      } else {
        result.ndpcmkigeci_ = ndpcmkigeciBuilder_.build();
      }
      result.mlghifehoah_ = mlghifehoah_;
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
      if (other instanceof POGOProtos.Rpc.PFPJGDJKEKH) {
        return mergeFrom((POGOProtos.Rpc.PFPJGDJKEKH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PFPJGDJKEKH other) {
      if (other == POGOProtos.Rpc.PFPJGDJKEKH.getDefaultInstance()) return this;
      if (other.hasNdpcmkigeci()) {
        mergeNdpcmkigeci(other.getNdpcmkigeci());
      }
      if (other.getMlghifehoah() != com.google.protobuf.ByteString.EMPTY) {
        setMlghifehoah(other.getMlghifehoah());
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
      POGOProtos.Rpc.PFPJGDJKEKH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PFPJGDJKEKH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PLPBKPABGMK, POGOProtos.Rpc.PLPBKPABGMK.Builder, POGOProtos.Rpc.PLPBKPABGMKOrBuilder> ndpcmkigeciBuilder_;
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     * @return Whether the ndpcmkigeci field is set.
     */
    public boolean hasNdpcmkigeci() {
      return ndpcmkigeciBuilder_ != null || ndpcmkigeci_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     * @return The ndpcmkigeci.
     */
    public POGOProtos.Rpc.PLPBKPABGMK getNdpcmkigeci() {
      if (ndpcmkigeciBuilder_ == null) {
        return ndpcmkigeci_ == null ? POGOProtos.Rpc.PLPBKPABGMK.getDefaultInstance() : ndpcmkigeci_;
      } else {
        return ndpcmkigeciBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    public Builder setNdpcmkigeci(POGOProtos.Rpc.PLPBKPABGMK value) {
      if (ndpcmkigeciBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ndpcmkigeci_ = value;
        onChanged();
      } else {
        ndpcmkigeciBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    public Builder setNdpcmkigeci(
        POGOProtos.Rpc.PLPBKPABGMK.Builder builderForValue) {
      if (ndpcmkigeciBuilder_ == null) {
        ndpcmkigeci_ = builderForValue.build();
        onChanged();
      } else {
        ndpcmkigeciBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    public Builder mergeNdpcmkigeci(POGOProtos.Rpc.PLPBKPABGMK value) {
      if (ndpcmkigeciBuilder_ == null) {
        if (ndpcmkigeci_ != null) {
          ndpcmkigeci_ =
            POGOProtos.Rpc.PLPBKPABGMK.newBuilder(ndpcmkigeci_).mergeFrom(value).buildPartial();
        } else {
          ndpcmkigeci_ = value;
        }
        onChanged();
      } else {
        ndpcmkigeciBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    public Builder clearNdpcmkigeci() {
      if (ndpcmkigeciBuilder_ == null) {
        ndpcmkigeci_ = null;
        onChanged();
      } else {
        ndpcmkigeci_ = null;
        ndpcmkigeciBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    public POGOProtos.Rpc.PLPBKPABGMK.Builder getNdpcmkigeciBuilder() {
      
      onChanged();
      return getNdpcmkigeciFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    public POGOProtos.Rpc.PLPBKPABGMKOrBuilder getNdpcmkigeciOrBuilder() {
      if (ndpcmkigeciBuilder_ != null) {
        return ndpcmkigeciBuilder_.getMessageOrBuilder();
      } else {
        return ndpcmkigeci_ == null ?
            POGOProtos.Rpc.PLPBKPABGMK.getDefaultInstance() : ndpcmkigeci_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PLPBKPABGMK ndpcmkigeci = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PLPBKPABGMK, POGOProtos.Rpc.PLPBKPABGMK.Builder, POGOProtos.Rpc.PLPBKPABGMKOrBuilder> 
        getNdpcmkigeciFieldBuilder() {
      if (ndpcmkigeciBuilder_ == null) {
        ndpcmkigeciBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PLPBKPABGMK, POGOProtos.Rpc.PLPBKPABGMK.Builder, POGOProtos.Rpc.PLPBKPABGMKOrBuilder>(
                getNdpcmkigeci(),
                getParentForChildren(),
                isClean());
        ndpcmkigeci_ = null;
      }
      return ndpcmkigeciBuilder_;
    }

    private com.google.protobuf.ByteString mlghifehoah_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes mlghifehoah = 2;</code>
     * @return The mlghifehoah.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMlghifehoah() {
      return mlghifehoah_;
    }
    /**
     * <code>bytes mlghifehoah = 2;</code>
     * @param value The mlghifehoah to set.
     * @return This builder for chaining.
     */
    public Builder setMlghifehoah(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mlghifehoah_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes mlghifehoah = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMlghifehoah() {
      
      mlghifehoah_ = getDefaultInstance().getMlghifehoah();
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PFPJGDJKEKH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PFPJGDJKEKH)
  private static final POGOProtos.Rpc.PFPJGDJKEKH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PFPJGDJKEKH();
  }

  public static POGOProtos.Rpc.PFPJGDJKEKH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PFPJGDJKEKH>
      PARSER = new com.google.protobuf.AbstractParser<PFPJGDJKEKH>() {
    @java.lang.Override
    public PFPJGDJKEKH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PFPJGDJKEKH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PFPJGDJKEKH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PFPJGDJKEKH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PFPJGDJKEKH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
