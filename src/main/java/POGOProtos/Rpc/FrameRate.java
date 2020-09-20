// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: OKHPJOOMIHJ
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.FrameRate}
 */
public final class FrameRate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.FrameRate)
    FrameRateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FrameRate.newBuilder() to construct.
  private FrameRate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FrameRate() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FrameRate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FrameRate(
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
            POGOProtos.Rpc.HJJBCLOAFKI.Builder subBuilder = null;
            if (keanhoahmim_ != null) {
              subBuilder = keanhoahmim_.toBuilder();
            }
            keanhoahmim_ = input.readMessage(POGOProtos.Rpc.HJJBCLOAFKI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keanhoahmim_);
              keanhoahmim_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FrameRate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FrameRate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.FrameRate.class, POGOProtos.Rpc.FrameRate.Builder.class);
  }

  public static final int KEANHOAHMIM_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim_;
  /**
   * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
   * @return Whether the keanhoahmim field is set.
   */
  @java.lang.Override
  public boolean hasKeanhoahmim() {
    return keanhoahmim_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
   * @return The keanhoahmim.
   */
  @java.lang.Override
  public POGOProtos.Rpc.HJJBCLOAFKI getKeanhoahmim() {
    return keanhoahmim_ == null ? POGOProtos.Rpc.HJJBCLOAFKI.getDefaultInstance() : keanhoahmim_;
  }
  /**
   * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.HJJBCLOAFKIOrBuilder getKeanhoahmimOrBuilder() {
    return getKeanhoahmim();
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
    if (keanhoahmim_ != null) {
      output.writeMessage(1, getKeanhoahmim());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keanhoahmim_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKeanhoahmim());
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
    if (!(obj instanceof POGOProtos.Rpc.FrameRate)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.FrameRate other = (POGOProtos.Rpc.FrameRate) obj;

    if (hasKeanhoahmim() != other.hasKeanhoahmim()) return false;
    if (hasKeanhoahmim()) {
      if (!getKeanhoahmim()
          .equals(other.getKeanhoahmim())) return false;
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
    if (hasKeanhoahmim()) {
      hash = (37 * hash) + KEANHOAHMIM_FIELD_NUMBER;
      hash = (53 * hash) + getKeanhoahmim().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.FrameRate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FrameRate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FrameRate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.FrameRate parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.FrameRate prototype) {
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
   * ref: OKHPJOOMIHJ
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.FrameRate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.FrameRate)
      POGOProtos.Rpc.FrameRateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FrameRate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FrameRate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.FrameRate.class, POGOProtos.Rpc.FrameRate.Builder.class);
    }

    // Construct using POGOProtos.Rpc.FrameRate.newBuilder()
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
      if (keanhoahmimBuilder_ == null) {
        keanhoahmim_ = null;
      } else {
        keanhoahmim_ = null;
        keanhoahmimBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_FrameRate_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FrameRate getDefaultInstanceForType() {
      return POGOProtos.Rpc.FrameRate.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.FrameRate build() {
      POGOProtos.Rpc.FrameRate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.FrameRate buildPartial() {
      POGOProtos.Rpc.FrameRate result = new POGOProtos.Rpc.FrameRate(this);
      if (keanhoahmimBuilder_ == null) {
        result.keanhoahmim_ = keanhoahmim_;
      } else {
        result.keanhoahmim_ = keanhoahmimBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.FrameRate) {
        return mergeFrom((POGOProtos.Rpc.FrameRate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.FrameRate other) {
      if (other == POGOProtos.Rpc.FrameRate.getDefaultInstance()) return this;
      if (other.hasKeanhoahmim()) {
        mergeKeanhoahmim(other.getKeanhoahmim());
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
      POGOProtos.Rpc.FrameRate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.FrameRate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HJJBCLOAFKI, POGOProtos.Rpc.HJJBCLOAFKI.Builder, POGOProtos.Rpc.HJJBCLOAFKIOrBuilder> keanhoahmimBuilder_;
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     * @return Whether the keanhoahmim field is set.
     */
    public boolean hasKeanhoahmim() {
      return keanhoahmimBuilder_ != null || keanhoahmim_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     * @return The keanhoahmim.
     */
    public POGOProtos.Rpc.HJJBCLOAFKI getKeanhoahmim() {
      if (keanhoahmimBuilder_ == null) {
        return keanhoahmim_ == null ? POGOProtos.Rpc.HJJBCLOAFKI.getDefaultInstance() : keanhoahmim_;
      } else {
        return keanhoahmimBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    public Builder setKeanhoahmim(POGOProtos.Rpc.HJJBCLOAFKI value) {
      if (keanhoahmimBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keanhoahmim_ = value;
        onChanged();
      } else {
        keanhoahmimBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    public Builder setKeanhoahmim(
        POGOProtos.Rpc.HJJBCLOAFKI.Builder builderForValue) {
      if (keanhoahmimBuilder_ == null) {
        keanhoahmim_ = builderForValue.build();
        onChanged();
      } else {
        keanhoahmimBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    public Builder mergeKeanhoahmim(POGOProtos.Rpc.HJJBCLOAFKI value) {
      if (keanhoahmimBuilder_ == null) {
        if (keanhoahmim_ != null) {
          keanhoahmim_ =
            POGOProtos.Rpc.HJJBCLOAFKI.newBuilder(keanhoahmim_).mergeFrom(value).buildPartial();
        } else {
          keanhoahmim_ = value;
        }
        onChanged();
      } else {
        keanhoahmimBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    public Builder clearKeanhoahmim() {
      if (keanhoahmimBuilder_ == null) {
        keanhoahmim_ = null;
        onChanged();
      } else {
        keanhoahmim_ = null;
        keanhoahmimBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    public POGOProtos.Rpc.HJJBCLOAFKI.Builder getKeanhoahmimBuilder() {
      
      onChanged();
      return getKeanhoahmimFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    public POGOProtos.Rpc.HJJBCLOAFKIOrBuilder getKeanhoahmimOrBuilder() {
      if (keanhoahmimBuilder_ != null) {
        return keanhoahmimBuilder_.getMessageOrBuilder();
      } else {
        return keanhoahmim_ == null ?
            POGOProtos.Rpc.HJJBCLOAFKI.getDefaultInstance() : keanhoahmim_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.HJJBCLOAFKI keanhoahmim = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.HJJBCLOAFKI, POGOProtos.Rpc.HJJBCLOAFKI.Builder, POGOProtos.Rpc.HJJBCLOAFKIOrBuilder> 
        getKeanhoahmimFieldBuilder() {
      if (keanhoahmimBuilder_ == null) {
        keanhoahmimBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.HJJBCLOAFKI, POGOProtos.Rpc.HJJBCLOAFKI.Builder, POGOProtos.Rpc.HJJBCLOAFKIOrBuilder>(
                getKeanhoahmim(),
                getParentForChildren(),
                isClean());
        keanhoahmim_ = null;
      }
      return keanhoahmimBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.FrameRate)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.FrameRate)
  private static final POGOProtos.Rpc.FrameRate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.FrameRate();
  }

  public static POGOProtos.Rpc.FrameRate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrameRate>
      PARSER = new com.google.protobuf.AbstractParser<FrameRate>() {
    @java.lang.Override
    public FrameRate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FrameRate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FrameRate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrameRate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.FrameRate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

