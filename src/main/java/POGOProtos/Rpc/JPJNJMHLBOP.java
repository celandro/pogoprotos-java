// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JPJNJMHLBOP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JPJNJMHLBOP}
 */
public final class JPJNJMHLBOP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JPJNJMHLBOP)
    JPJNJMHLBOPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JPJNJMHLBOP.newBuilder() to construct.
  private JPJNJMHLBOP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JPJNJMHLBOP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JPJNJMHLBOP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JPJNJMHLBOP(
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
            POGOProtos.Rpc.QuestProto.Builder subBuilder = null;
            if (iblilgjehdh_ != null) {
              subBuilder = iblilgjehdh_.toBuilder();
            }
            iblilgjehdh_ = input.readMessage(POGOProtos.Rpc.QuestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(iblilgjehdh_);
              iblilgjehdh_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.POCJJMBIJKE.Builder subBuilder = null;
            if (pbiankchnhp_ != null) {
              subBuilder = pbiankchnhp_.toBuilder();
            }
            pbiankchnhp_ = input.readMessage(POGOProtos.Rpc.POCJJMBIJKE.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pbiankchnhp_);
              pbiankchnhp_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPJNJMHLBOP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPJNJMHLBOP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JPJNJMHLBOP.class, POGOProtos.Rpc.JPJNJMHLBOP.Builder.class);
  }

  public static final int IBLILGJEHDH_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.QuestProto iblilgjehdh_;
  /**
   * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
   * @return Whether the iblilgjehdh field is set.
   */
  @java.lang.Override
  public boolean hasIblilgjehdh() {
    return iblilgjehdh_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
   * @return The iblilgjehdh.
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestProto getIblilgjehdh() {
    return iblilgjehdh_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : iblilgjehdh_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestProtoOrBuilder getIblilgjehdhOrBuilder() {
    return getIblilgjehdh();
  }

  public static final int PBIANKCHNHP_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp_;
  /**
   * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
   * @return Whether the pbiankchnhp field is set.
   */
  @java.lang.Override
  public boolean hasPbiankchnhp() {
    return pbiankchnhp_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
   * @return The pbiankchnhp.
   */
  @java.lang.Override
  public POGOProtos.Rpc.POCJJMBIJKE getPbiankchnhp() {
    return pbiankchnhp_ == null ? POGOProtos.Rpc.POCJJMBIJKE.getDefaultInstance() : pbiankchnhp_;
  }
  /**
   * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.POCJJMBIJKEOrBuilder getPbiankchnhpOrBuilder() {
    return getPbiankchnhp();
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
    if (iblilgjehdh_ != null) {
      output.writeMessage(1, getIblilgjehdh());
    }
    if (pbiankchnhp_ != null) {
      output.writeMessage(2, getPbiankchnhp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iblilgjehdh_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIblilgjehdh());
    }
    if (pbiankchnhp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPbiankchnhp());
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
    if (!(obj instanceof POGOProtos.Rpc.JPJNJMHLBOP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JPJNJMHLBOP other = (POGOProtos.Rpc.JPJNJMHLBOP) obj;

    if (hasIblilgjehdh() != other.hasIblilgjehdh()) return false;
    if (hasIblilgjehdh()) {
      if (!getIblilgjehdh()
          .equals(other.getIblilgjehdh())) return false;
    }
    if (hasPbiankchnhp() != other.hasPbiankchnhp()) return false;
    if (hasPbiankchnhp()) {
      if (!getPbiankchnhp()
          .equals(other.getPbiankchnhp())) return false;
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
    if (hasIblilgjehdh()) {
      hash = (37 * hash) + IBLILGJEHDH_FIELD_NUMBER;
      hash = (53 * hash) + getIblilgjehdh().hashCode();
    }
    if (hasPbiankchnhp()) {
      hash = (37 * hash) + PBIANKCHNHP_FIELD_NUMBER;
      hash = (53 * hash) + getPbiankchnhp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPJNJMHLBOP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JPJNJMHLBOP prototype) {
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
   * ref: JPJNJMHLBOP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JPJNJMHLBOP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JPJNJMHLBOP)
      POGOProtos.Rpc.JPJNJMHLBOPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPJNJMHLBOP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPJNJMHLBOP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JPJNJMHLBOP.class, POGOProtos.Rpc.JPJNJMHLBOP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JPJNJMHLBOP.newBuilder()
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
      if (iblilgjehdhBuilder_ == null) {
        iblilgjehdh_ = null;
      } else {
        iblilgjehdh_ = null;
        iblilgjehdhBuilder_ = null;
      }
      if (pbiankchnhpBuilder_ == null) {
        pbiankchnhp_ = null;
      } else {
        pbiankchnhp_ = null;
        pbiankchnhpBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JPJNJMHLBOP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPJNJMHLBOP getDefaultInstanceForType() {
      return POGOProtos.Rpc.JPJNJMHLBOP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPJNJMHLBOP build() {
      POGOProtos.Rpc.JPJNJMHLBOP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPJNJMHLBOP buildPartial() {
      POGOProtos.Rpc.JPJNJMHLBOP result = new POGOProtos.Rpc.JPJNJMHLBOP(this);
      if (iblilgjehdhBuilder_ == null) {
        result.iblilgjehdh_ = iblilgjehdh_;
      } else {
        result.iblilgjehdh_ = iblilgjehdhBuilder_.build();
      }
      if (pbiankchnhpBuilder_ == null) {
        result.pbiankchnhp_ = pbiankchnhp_;
      } else {
        result.pbiankchnhp_ = pbiankchnhpBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.JPJNJMHLBOP) {
        return mergeFrom((POGOProtos.Rpc.JPJNJMHLBOP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JPJNJMHLBOP other) {
      if (other == POGOProtos.Rpc.JPJNJMHLBOP.getDefaultInstance()) return this;
      if (other.hasIblilgjehdh()) {
        mergeIblilgjehdh(other.getIblilgjehdh());
      }
      if (other.hasPbiankchnhp()) {
        mergePbiankchnhp(other.getPbiankchnhp());
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
      POGOProtos.Rpc.JPJNJMHLBOP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JPJNJMHLBOP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.QuestProto iblilgjehdh_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder> iblilgjehdhBuilder_;
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     * @return Whether the iblilgjehdh field is set.
     */
    public boolean hasIblilgjehdh() {
      return iblilgjehdhBuilder_ != null || iblilgjehdh_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     * @return The iblilgjehdh.
     */
    public POGOProtos.Rpc.QuestProto getIblilgjehdh() {
      if (iblilgjehdhBuilder_ == null) {
        return iblilgjehdh_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : iblilgjehdh_;
      } else {
        return iblilgjehdhBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    public Builder setIblilgjehdh(POGOProtos.Rpc.QuestProto value) {
      if (iblilgjehdhBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        iblilgjehdh_ = value;
        onChanged();
      } else {
        iblilgjehdhBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    public Builder setIblilgjehdh(
        POGOProtos.Rpc.QuestProto.Builder builderForValue) {
      if (iblilgjehdhBuilder_ == null) {
        iblilgjehdh_ = builderForValue.build();
        onChanged();
      } else {
        iblilgjehdhBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    public Builder mergeIblilgjehdh(POGOProtos.Rpc.QuestProto value) {
      if (iblilgjehdhBuilder_ == null) {
        if (iblilgjehdh_ != null) {
          iblilgjehdh_ =
            POGOProtos.Rpc.QuestProto.newBuilder(iblilgjehdh_).mergeFrom(value).buildPartial();
        } else {
          iblilgjehdh_ = value;
        }
        onChanged();
      } else {
        iblilgjehdhBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    public Builder clearIblilgjehdh() {
      if (iblilgjehdhBuilder_ == null) {
        iblilgjehdh_ = null;
        onChanged();
      } else {
        iblilgjehdh_ = null;
        iblilgjehdhBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    public POGOProtos.Rpc.QuestProto.Builder getIblilgjehdhBuilder() {
      
      onChanged();
      return getIblilgjehdhFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    public POGOProtos.Rpc.QuestProtoOrBuilder getIblilgjehdhOrBuilder() {
      if (iblilgjehdhBuilder_ != null) {
        return iblilgjehdhBuilder_.getMessageOrBuilder();
      } else {
        return iblilgjehdh_ == null ?
            POGOProtos.Rpc.QuestProto.getDefaultInstance() : iblilgjehdh_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto iblilgjehdh = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder> 
        getIblilgjehdhFieldBuilder() {
      if (iblilgjehdhBuilder_ == null) {
        iblilgjehdhBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder>(
                getIblilgjehdh(),
                getParentForChildren(),
                isClean());
        iblilgjehdh_ = null;
      }
      return iblilgjehdhBuilder_;
    }

    private POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.POCJJMBIJKE, POGOProtos.Rpc.POCJJMBIJKE.Builder, POGOProtos.Rpc.POCJJMBIJKEOrBuilder> pbiankchnhpBuilder_;
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     * @return Whether the pbiankchnhp field is set.
     */
    public boolean hasPbiankchnhp() {
      return pbiankchnhpBuilder_ != null || pbiankchnhp_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     * @return The pbiankchnhp.
     */
    public POGOProtos.Rpc.POCJJMBIJKE getPbiankchnhp() {
      if (pbiankchnhpBuilder_ == null) {
        return pbiankchnhp_ == null ? POGOProtos.Rpc.POCJJMBIJKE.getDefaultInstance() : pbiankchnhp_;
      } else {
        return pbiankchnhpBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    public Builder setPbiankchnhp(POGOProtos.Rpc.POCJJMBIJKE value) {
      if (pbiankchnhpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pbiankchnhp_ = value;
        onChanged();
      } else {
        pbiankchnhpBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    public Builder setPbiankchnhp(
        POGOProtos.Rpc.POCJJMBIJKE.Builder builderForValue) {
      if (pbiankchnhpBuilder_ == null) {
        pbiankchnhp_ = builderForValue.build();
        onChanged();
      } else {
        pbiankchnhpBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    public Builder mergePbiankchnhp(POGOProtos.Rpc.POCJJMBIJKE value) {
      if (pbiankchnhpBuilder_ == null) {
        if (pbiankchnhp_ != null) {
          pbiankchnhp_ =
            POGOProtos.Rpc.POCJJMBIJKE.newBuilder(pbiankchnhp_).mergeFrom(value).buildPartial();
        } else {
          pbiankchnhp_ = value;
        }
        onChanged();
      } else {
        pbiankchnhpBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    public Builder clearPbiankchnhp() {
      if (pbiankchnhpBuilder_ == null) {
        pbiankchnhp_ = null;
        onChanged();
      } else {
        pbiankchnhp_ = null;
        pbiankchnhpBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    public POGOProtos.Rpc.POCJJMBIJKE.Builder getPbiankchnhpBuilder() {
      
      onChanged();
      return getPbiankchnhpFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    public POGOProtos.Rpc.POCJJMBIJKEOrBuilder getPbiankchnhpOrBuilder() {
      if (pbiankchnhpBuilder_ != null) {
        return pbiankchnhpBuilder_.getMessageOrBuilder();
      } else {
        return pbiankchnhp_ == null ?
            POGOProtos.Rpc.POCJJMBIJKE.getDefaultInstance() : pbiankchnhp_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.POCJJMBIJKE pbiankchnhp = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.POCJJMBIJKE, POGOProtos.Rpc.POCJJMBIJKE.Builder, POGOProtos.Rpc.POCJJMBIJKEOrBuilder> 
        getPbiankchnhpFieldBuilder() {
      if (pbiankchnhpBuilder_ == null) {
        pbiankchnhpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.POCJJMBIJKE, POGOProtos.Rpc.POCJJMBIJKE.Builder, POGOProtos.Rpc.POCJJMBIJKEOrBuilder>(
                getPbiankchnhp(),
                getParentForChildren(),
                isClean());
        pbiankchnhp_ = null;
      }
      return pbiankchnhpBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JPJNJMHLBOP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JPJNJMHLBOP)
  private static final POGOProtos.Rpc.JPJNJMHLBOP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JPJNJMHLBOP();
  }

  public static POGOProtos.Rpc.JPJNJMHLBOP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JPJNJMHLBOP>
      PARSER = new com.google.protobuf.AbstractParser<JPJNJMHLBOP>() {
    @java.lang.Override
    public JPJNJMHLBOP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JPJNJMHLBOP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JPJNJMHLBOP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JPJNJMHLBOP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JPJNJMHLBOP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

