// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CHAIGIODFCF}
 */
public  final class CHAIGIODFCF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CHAIGIODFCF)
    CHAIGIODFCFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CHAIGIODFCF.newBuilder() to construct.
  private CHAIGIODFCF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CHAIGIODFCF() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CHAIGIODFCF();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CHAIGIODFCF(
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

            bkmenogppdp_ = input.readInt32();
            break;
          }
          case 16: {

            bgkndpfglmn_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CHAIGIODFCF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CHAIGIODFCF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CHAIGIODFCF.class, POGOProtos.Rpc.CHAIGIODFCF.Builder.class);
  }

  public static final int BKMENOGPPDP_FIELD_NUMBER = 1;
  private int bkmenogppdp_;
  /**
   * <code>int32 bkmenogppdp = 1;</code>
   * @return The bkmenogppdp.
   */
  public int getBkmenogppdp() {
    return bkmenogppdp_;
  }

  public static final int BGKNDPFGLMN_FIELD_NUMBER = 2;
  private long bgkndpfglmn_;
  /**
   * <code>int64 bgkndpfglmn = 2;</code>
   * @return The bgkndpfglmn.
   */
  public long getBgkndpfglmn() {
    return bgkndpfglmn_;
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
    if (bkmenogppdp_ != 0) {
      output.writeInt32(1, bkmenogppdp_);
    }
    if (bgkndpfglmn_ != 0L) {
      output.writeInt64(2, bgkndpfglmn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bkmenogppdp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bkmenogppdp_);
    }
    if (bgkndpfglmn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bgkndpfglmn_);
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
    if (!(obj instanceof POGOProtos.Rpc.CHAIGIODFCF)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CHAIGIODFCF other = (POGOProtos.Rpc.CHAIGIODFCF) obj;

    if (getBkmenogppdp()
        != other.getBkmenogppdp()) return false;
    if (getBgkndpfglmn()
        != other.getBgkndpfglmn()) return false;
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
    hash = (37 * hash) + BKMENOGPPDP_FIELD_NUMBER;
    hash = (53 * hash) + getBkmenogppdp();
    hash = (37 * hash) + BGKNDPFGLMN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBgkndpfglmn());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CHAIGIODFCF parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CHAIGIODFCF prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CHAIGIODFCF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CHAIGIODFCF)
      POGOProtos.Rpc.CHAIGIODFCFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CHAIGIODFCF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CHAIGIODFCF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CHAIGIODFCF.class, POGOProtos.Rpc.CHAIGIODFCF.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CHAIGIODFCF.newBuilder()
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
      bkmenogppdp_ = 0;

      bgkndpfglmn_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CHAIGIODFCF_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHAIGIODFCF getDefaultInstanceForType() {
      return POGOProtos.Rpc.CHAIGIODFCF.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHAIGIODFCF build() {
      POGOProtos.Rpc.CHAIGIODFCF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CHAIGIODFCF buildPartial() {
      POGOProtos.Rpc.CHAIGIODFCF result = new POGOProtos.Rpc.CHAIGIODFCF(this);
      result.bkmenogppdp_ = bkmenogppdp_;
      result.bgkndpfglmn_ = bgkndpfglmn_;
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
      if (other instanceof POGOProtos.Rpc.CHAIGIODFCF) {
        return mergeFrom((POGOProtos.Rpc.CHAIGIODFCF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CHAIGIODFCF other) {
      if (other == POGOProtos.Rpc.CHAIGIODFCF.getDefaultInstance()) return this;
      if (other.getBkmenogppdp() != 0) {
        setBkmenogppdp(other.getBkmenogppdp());
      }
      if (other.getBgkndpfglmn() != 0L) {
        setBgkndpfglmn(other.getBgkndpfglmn());
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
      POGOProtos.Rpc.CHAIGIODFCF parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CHAIGIODFCF) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bkmenogppdp_ ;
    /**
     * <code>int32 bkmenogppdp = 1;</code>
     * @return The bkmenogppdp.
     */
    public int getBkmenogppdp() {
      return bkmenogppdp_;
    }
    /**
     * <code>int32 bkmenogppdp = 1;</code>
     * @param value The bkmenogppdp to set.
     * @return This builder for chaining.
     */
    public Builder setBkmenogppdp(int value) {
      
      bkmenogppdp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bkmenogppdp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBkmenogppdp() {
      
      bkmenogppdp_ = 0;
      onChanged();
      return this;
    }

    private long bgkndpfglmn_ ;
    /**
     * <code>int64 bgkndpfglmn = 2;</code>
     * @return The bgkndpfglmn.
     */
    public long getBgkndpfglmn() {
      return bgkndpfglmn_;
    }
    /**
     * <code>int64 bgkndpfglmn = 2;</code>
     * @param value The bgkndpfglmn to set.
     * @return This builder for chaining.
     */
    public Builder setBgkndpfglmn(long value) {
      
      bgkndpfglmn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bgkndpfglmn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBgkndpfglmn() {
      
      bgkndpfglmn_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CHAIGIODFCF)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CHAIGIODFCF)
  private static final POGOProtos.Rpc.CHAIGIODFCF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CHAIGIODFCF();
  }

  public static POGOProtos.Rpc.CHAIGIODFCF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CHAIGIODFCF>
      PARSER = new com.google.protobuf.AbstractParser<CHAIGIODFCF>() {
    @java.lang.Override
    public CHAIGIODFCF parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CHAIGIODFCF(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CHAIGIODFCF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CHAIGIODFCF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CHAIGIODFCF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

