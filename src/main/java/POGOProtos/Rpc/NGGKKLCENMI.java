// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NGGKKLCENMI
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NGGKKLCENMI}
 */
public final class NGGKKLCENMI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NGGKKLCENMI)
    NGGKKLCENMIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NGGKKLCENMI.newBuilder() to construct.
  private NGGKKLCENMI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NGGKKLCENMI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NGGKKLCENMI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NGGKKLCENMI(
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

            pkdofmmahaj_ = input.readBool();
            break;
          }
          case 18: {
            POGOProtos.Rpc.InventoryDeltaProto.Builder subBuilder = null;
            if (hmalajofklh_ != null) {
              subBuilder = hmalajofklh_.toBuilder();
            }
            hmalajofklh_ = input.readMessage(POGOProtos.Rpc.InventoryDeltaProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hmalajofklh_);
              hmalajofklh_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGGKKLCENMI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGGKKLCENMI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NGGKKLCENMI.class, POGOProtos.Rpc.NGGKKLCENMI.Builder.class);
  }

  public static final int PKDOFMMAHAJ_FIELD_NUMBER = 1;
  private boolean pkdofmmahaj_;
  /**
   * <code>bool pkdofmmahaj = 1;</code>
   * @return The pkdofmmahaj.
   */
  @java.lang.Override
  public boolean getPkdofmmahaj() {
    return pkdofmmahaj_;
  }

  public static final int HMALAJOFKLH_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.InventoryDeltaProto hmalajofklh_;
  /**
   * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
   * @return Whether the hmalajofklh field is set.
   */
  @java.lang.Override
  public boolean hasHmalajofklh() {
    return hmalajofklh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
   * @return The hmalajofklh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.InventoryDeltaProto getHmalajofklh() {
    return hmalajofklh_ == null ? POGOProtos.Rpc.InventoryDeltaProto.getDefaultInstance() : hmalajofklh_;
  }
  /**
   * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.InventoryDeltaProtoOrBuilder getHmalajofklhOrBuilder() {
    return getHmalajofklh();
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
    if (pkdofmmahaj_ != false) {
      output.writeBool(1, pkdofmmahaj_);
    }
    if (hmalajofklh_ != null) {
      output.writeMessage(2, getHmalajofklh());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pkdofmmahaj_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, pkdofmmahaj_);
    }
    if (hmalajofklh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHmalajofklh());
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
    if (!(obj instanceof POGOProtos.Rpc.NGGKKLCENMI)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NGGKKLCENMI other = (POGOProtos.Rpc.NGGKKLCENMI) obj;

    if (getPkdofmmahaj()
        != other.getPkdofmmahaj()) return false;
    if (hasHmalajofklh() != other.hasHmalajofklh()) return false;
    if (hasHmalajofklh()) {
      if (!getHmalajofklh()
          .equals(other.getHmalajofklh())) return false;
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
    hash = (37 * hash) + PKDOFMMAHAJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPkdofmmahaj());
    if (hasHmalajofklh()) {
      hash = (37 * hash) + HMALAJOFKLH_FIELD_NUMBER;
      hash = (53 * hash) + getHmalajofklh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NGGKKLCENMI parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NGGKKLCENMI prototype) {
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
   * ref: NGGKKLCENMI
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NGGKKLCENMI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NGGKKLCENMI)
      POGOProtos.Rpc.NGGKKLCENMIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGGKKLCENMI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGGKKLCENMI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NGGKKLCENMI.class, POGOProtos.Rpc.NGGKKLCENMI.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NGGKKLCENMI.newBuilder()
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
      pkdofmmahaj_ = false;

      if (hmalajofklhBuilder_ == null) {
        hmalajofklh_ = null;
      } else {
        hmalajofklh_ = null;
        hmalajofklhBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NGGKKLCENMI_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NGGKKLCENMI getDefaultInstanceForType() {
      return POGOProtos.Rpc.NGGKKLCENMI.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NGGKKLCENMI build() {
      POGOProtos.Rpc.NGGKKLCENMI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NGGKKLCENMI buildPartial() {
      POGOProtos.Rpc.NGGKKLCENMI result = new POGOProtos.Rpc.NGGKKLCENMI(this);
      result.pkdofmmahaj_ = pkdofmmahaj_;
      if (hmalajofklhBuilder_ == null) {
        result.hmalajofklh_ = hmalajofklh_;
      } else {
        result.hmalajofklh_ = hmalajofklhBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.NGGKKLCENMI) {
        return mergeFrom((POGOProtos.Rpc.NGGKKLCENMI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NGGKKLCENMI other) {
      if (other == POGOProtos.Rpc.NGGKKLCENMI.getDefaultInstance()) return this;
      if (other.getPkdofmmahaj() != false) {
        setPkdofmmahaj(other.getPkdofmmahaj());
      }
      if (other.hasHmalajofklh()) {
        mergeHmalajofklh(other.getHmalajofklh());
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
      POGOProtos.Rpc.NGGKKLCENMI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NGGKKLCENMI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean pkdofmmahaj_ ;
    /**
     * <code>bool pkdofmmahaj = 1;</code>
     * @return The pkdofmmahaj.
     */
    @java.lang.Override
    public boolean getPkdofmmahaj() {
      return pkdofmmahaj_;
    }
    /**
     * <code>bool pkdofmmahaj = 1;</code>
     * @param value The pkdofmmahaj to set.
     * @return This builder for chaining.
     */
    public Builder setPkdofmmahaj(boolean value) {
      
      pkdofmmahaj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pkdofmmahaj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPkdofmmahaj() {
      
      pkdofmmahaj_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.InventoryDeltaProto hmalajofklh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.InventoryDeltaProto, POGOProtos.Rpc.InventoryDeltaProto.Builder, POGOProtos.Rpc.InventoryDeltaProtoOrBuilder> hmalajofklhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     * @return Whether the hmalajofklh field is set.
     */
    public boolean hasHmalajofklh() {
      return hmalajofklhBuilder_ != null || hmalajofklh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     * @return The hmalajofklh.
     */
    public POGOProtos.Rpc.InventoryDeltaProto getHmalajofklh() {
      if (hmalajofklhBuilder_ == null) {
        return hmalajofklh_ == null ? POGOProtos.Rpc.InventoryDeltaProto.getDefaultInstance() : hmalajofklh_;
      } else {
        return hmalajofklhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    public Builder setHmalajofklh(POGOProtos.Rpc.InventoryDeltaProto value) {
      if (hmalajofklhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hmalajofklh_ = value;
        onChanged();
      } else {
        hmalajofklhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    public Builder setHmalajofklh(
        POGOProtos.Rpc.InventoryDeltaProto.Builder builderForValue) {
      if (hmalajofklhBuilder_ == null) {
        hmalajofklh_ = builderForValue.build();
        onChanged();
      } else {
        hmalajofklhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    public Builder mergeHmalajofklh(POGOProtos.Rpc.InventoryDeltaProto value) {
      if (hmalajofklhBuilder_ == null) {
        if (hmalajofklh_ != null) {
          hmalajofklh_ =
            POGOProtos.Rpc.InventoryDeltaProto.newBuilder(hmalajofklh_).mergeFrom(value).buildPartial();
        } else {
          hmalajofklh_ = value;
        }
        onChanged();
      } else {
        hmalajofklhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    public Builder clearHmalajofklh() {
      if (hmalajofklhBuilder_ == null) {
        hmalajofklh_ = null;
        onChanged();
      } else {
        hmalajofklh_ = null;
        hmalajofklhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    public POGOProtos.Rpc.InventoryDeltaProto.Builder getHmalajofklhBuilder() {
      
      onChanged();
      return getHmalajofklhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    public POGOProtos.Rpc.InventoryDeltaProtoOrBuilder getHmalajofklhOrBuilder() {
      if (hmalajofklhBuilder_ != null) {
        return hmalajofklhBuilder_.getMessageOrBuilder();
      } else {
        return hmalajofklh_ == null ?
            POGOProtos.Rpc.InventoryDeltaProto.getDefaultInstance() : hmalajofklh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.InventoryDeltaProto hmalajofklh = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.InventoryDeltaProto, POGOProtos.Rpc.InventoryDeltaProto.Builder, POGOProtos.Rpc.InventoryDeltaProtoOrBuilder> 
        getHmalajofklhFieldBuilder() {
      if (hmalajofklhBuilder_ == null) {
        hmalajofklhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.InventoryDeltaProto, POGOProtos.Rpc.InventoryDeltaProto.Builder, POGOProtos.Rpc.InventoryDeltaProtoOrBuilder>(
                getHmalajofklh(),
                getParentForChildren(),
                isClean());
        hmalajofklh_ = null;
      }
      return hmalajofklhBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NGGKKLCENMI)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NGGKKLCENMI)
  private static final POGOProtos.Rpc.NGGKKLCENMI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NGGKKLCENMI();
  }

  public static POGOProtos.Rpc.NGGKKLCENMI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NGGKKLCENMI>
      PARSER = new com.google.protobuf.AbstractParser<NGGKKLCENMI>() {
    @java.lang.Override
    public NGGKKLCENMI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NGGKKLCENMI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NGGKKLCENMI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NGGKKLCENMI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NGGKKLCENMI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

