// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PLDCGGOKGJO}
 */
public  final class PLDCGGOKGJO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PLDCGGOKGJO)
    PLDCGGOKGJOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PLDCGGOKGJO.newBuilder() to construct.
  private PLDCGGOKGJO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PLDCGGOKGJO() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PLDCGGOKGJO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PLDCGGOKGJO(
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
            POGOProtos.Rpc.POGMDMODLNM.Builder subBuilder = null;
            if (clfonajnbgn_ != null) {
              subBuilder = clfonajnbgn_.toBuilder();
            }
            clfonajnbgn_ = input.readMessage(POGOProtos.Rpc.POGMDMODLNM.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clfonajnbgn_);
              clfonajnbgn_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PLDCGGOKGJO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PLDCGGOKGJO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PLDCGGOKGJO.class, POGOProtos.Rpc.PLDCGGOKGJO.Builder.class);
  }

  public static final int CLFONAJNBGN_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.POGMDMODLNM clfonajnbgn_;
  /**
   * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
   * @return Whether the clfonajnbgn field is set.
   */
  public boolean hasClfonajnbgn() {
    return clfonajnbgn_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
   * @return The clfonajnbgn.
   */
  public POGOProtos.Rpc.POGMDMODLNM getClfonajnbgn() {
    return clfonajnbgn_ == null ? POGOProtos.Rpc.POGMDMODLNM.getDefaultInstance() : clfonajnbgn_;
  }
  /**
   * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
   */
  public POGOProtos.Rpc.POGMDMODLNMOrBuilder getClfonajnbgnOrBuilder() {
    return getClfonajnbgn();
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
    if (clfonajnbgn_ != null) {
      output.writeMessage(1, getClfonajnbgn());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clfonajnbgn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClfonajnbgn());
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
    if (!(obj instanceof POGOProtos.Rpc.PLDCGGOKGJO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PLDCGGOKGJO other = (POGOProtos.Rpc.PLDCGGOKGJO) obj;

    if (hasClfonajnbgn() != other.hasClfonajnbgn()) return false;
    if (hasClfonajnbgn()) {
      if (!getClfonajnbgn()
          .equals(other.getClfonajnbgn())) return false;
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
    if (hasClfonajnbgn()) {
      hash = (37 * hash) + CLFONAJNBGN_FIELD_NUMBER;
      hash = (53 * hash) + getClfonajnbgn().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PLDCGGOKGJO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PLDCGGOKGJO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PLDCGGOKGJO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PLDCGGOKGJO)
      POGOProtos.Rpc.PLDCGGOKGJOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PLDCGGOKGJO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PLDCGGOKGJO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PLDCGGOKGJO.class, POGOProtos.Rpc.PLDCGGOKGJO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PLDCGGOKGJO.newBuilder()
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
      if (clfonajnbgnBuilder_ == null) {
        clfonajnbgn_ = null;
      } else {
        clfonajnbgn_ = null;
        clfonajnbgnBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PLDCGGOKGJO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLDCGGOKGJO getDefaultInstanceForType() {
      return POGOProtos.Rpc.PLDCGGOKGJO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLDCGGOKGJO build() {
      POGOProtos.Rpc.PLDCGGOKGJO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PLDCGGOKGJO buildPartial() {
      POGOProtos.Rpc.PLDCGGOKGJO result = new POGOProtos.Rpc.PLDCGGOKGJO(this);
      if (clfonajnbgnBuilder_ == null) {
        result.clfonajnbgn_ = clfonajnbgn_;
      } else {
        result.clfonajnbgn_ = clfonajnbgnBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PLDCGGOKGJO) {
        return mergeFrom((POGOProtos.Rpc.PLDCGGOKGJO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PLDCGGOKGJO other) {
      if (other == POGOProtos.Rpc.PLDCGGOKGJO.getDefaultInstance()) return this;
      if (other.hasClfonajnbgn()) {
        mergeClfonajnbgn(other.getClfonajnbgn());
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
      POGOProtos.Rpc.PLDCGGOKGJO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PLDCGGOKGJO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.POGMDMODLNM clfonajnbgn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.POGMDMODLNM, POGOProtos.Rpc.POGMDMODLNM.Builder, POGOProtos.Rpc.POGMDMODLNMOrBuilder> clfonajnbgnBuilder_;
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     * @return Whether the clfonajnbgn field is set.
     */
    public boolean hasClfonajnbgn() {
      return clfonajnbgnBuilder_ != null || clfonajnbgn_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     * @return The clfonajnbgn.
     */
    public POGOProtos.Rpc.POGMDMODLNM getClfonajnbgn() {
      if (clfonajnbgnBuilder_ == null) {
        return clfonajnbgn_ == null ? POGOProtos.Rpc.POGMDMODLNM.getDefaultInstance() : clfonajnbgn_;
      } else {
        return clfonajnbgnBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    public Builder setClfonajnbgn(POGOProtos.Rpc.POGMDMODLNM value) {
      if (clfonajnbgnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clfonajnbgn_ = value;
        onChanged();
      } else {
        clfonajnbgnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    public Builder setClfonajnbgn(
        POGOProtos.Rpc.POGMDMODLNM.Builder builderForValue) {
      if (clfonajnbgnBuilder_ == null) {
        clfonajnbgn_ = builderForValue.build();
        onChanged();
      } else {
        clfonajnbgnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    public Builder mergeClfonajnbgn(POGOProtos.Rpc.POGMDMODLNM value) {
      if (clfonajnbgnBuilder_ == null) {
        if (clfonajnbgn_ != null) {
          clfonajnbgn_ =
            POGOProtos.Rpc.POGMDMODLNM.newBuilder(clfonajnbgn_).mergeFrom(value).buildPartial();
        } else {
          clfonajnbgn_ = value;
        }
        onChanged();
      } else {
        clfonajnbgnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    public Builder clearClfonajnbgn() {
      if (clfonajnbgnBuilder_ == null) {
        clfonajnbgn_ = null;
        onChanged();
      } else {
        clfonajnbgn_ = null;
        clfonajnbgnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    public POGOProtos.Rpc.POGMDMODLNM.Builder getClfonajnbgnBuilder() {
      
      onChanged();
      return getClfonajnbgnFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    public POGOProtos.Rpc.POGMDMODLNMOrBuilder getClfonajnbgnOrBuilder() {
      if (clfonajnbgnBuilder_ != null) {
        return clfonajnbgnBuilder_.getMessageOrBuilder();
      } else {
        return clfonajnbgn_ == null ?
            POGOProtos.Rpc.POGMDMODLNM.getDefaultInstance() : clfonajnbgn_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.POGMDMODLNM clfonajnbgn = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.POGMDMODLNM, POGOProtos.Rpc.POGMDMODLNM.Builder, POGOProtos.Rpc.POGMDMODLNMOrBuilder> 
        getClfonajnbgnFieldBuilder() {
      if (clfonajnbgnBuilder_ == null) {
        clfonajnbgnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.POGMDMODLNM, POGOProtos.Rpc.POGMDMODLNM.Builder, POGOProtos.Rpc.POGMDMODLNMOrBuilder>(
                getClfonajnbgn(),
                getParentForChildren(),
                isClean());
        clfonajnbgn_ = null;
      }
      return clfonajnbgnBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PLDCGGOKGJO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PLDCGGOKGJO)
  private static final POGOProtos.Rpc.PLDCGGOKGJO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PLDCGGOKGJO();
  }

  public static POGOProtos.Rpc.PLDCGGOKGJO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PLDCGGOKGJO>
      PARSER = new com.google.protobuf.AbstractParser<PLDCGGOKGJO>() {
    @java.lang.Override
    public PLDCGGOKGJO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PLDCGGOKGJO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PLDCGGOKGJO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PLDCGGOKGJO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PLDCGGOKGJO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

