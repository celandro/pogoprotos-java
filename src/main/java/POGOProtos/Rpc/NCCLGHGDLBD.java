// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NCCLGHGDLBD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NCCLGHGDLBD}
 */
public final class NCCLGHGDLBD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NCCLGHGDLBD)
    NCCLGHGDLBDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NCCLGHGDLBD.newBuilder() to construct.
  private NCCLGHGDLBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NCCLGHGDLBD() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NCCLGHGDLBD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NCCLGHGDLBD(
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

            fpodljnbpbo_ = input.readBool();
            break;
          }
          case 16: {

            dhdmbahehko_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NCCLGHGDLBD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NCCLGHGDLBD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NCCLGHGDLBD.class, POGOProtos.Rpc.NCCLGHGDLBD.Builder.class);
  }

  public static final int FPODLJNBPBO_FIELD_NUMBER = 1;
  private boolean fpodljnbpbo_;
  /**
   * <code>bool fpodljnbpbo = 1;</code>
   * @return The fpodljnbpbo.
   */
  @java.lang.Override
  public boolean getFpodljnbpbo() {
    return fpodljnbpbo_;
  }

  public static final int DHDMBAHEHKO_FIELD_NUMBER = 2;
  private boolean dhdmbahehko_;
  /**
   * <code>bool dhdmbahehko = 2;</code>
   * @return The dhdmbahehko.
   */
  @java.lang.Override
  public boolean getDhdmbahehko() {
    return dhdmbahehko_;
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
    if (fpodljnbpbo_ != false) {
      output.writeBool(1, fpodljnbpbo_);
    }
    if (dhdmbahehko_ != false) {
      output.writeBool(2, dhdmbahehko_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fpodljnbpbo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, fpodljnbpbo_);
    }
    if (dhdmbahehko_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, dhdmbahehko_);
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
    if (!(obj instanceof POGOProtos.Rpc.NCCLGHGDLBD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NCCLGHGDLBD other = (POGOProtos.Rpc.NCCLGHGDLBD) obj;

    if (getFpodljnbpbo()
        != other.getFpodljnbpbo()) return false;
    if (getDhdmbahehko()
        != other.getDhdmbahehko()) return false;
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
    hash = (37 * hash) + FPODLJNBPBO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFpodljnbpbo());
    hash = (37 * hash) + DHDMBAHEHKO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDhdmbahehko());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NCCLGHGDLBD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NCCLGHGDLBD prototype) {
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
   * ref: NCCLGHGDLBD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NCCLGHGDLBD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NCCLGHGDLBD)
      POGOProtos.Rpc.NCCLGHGDLBDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NCCLGHGDLBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NCCLGHGDLBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NCCLGHGDLBD.class, POGOProtos.Rpc.NCCLGHGDLBD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NCCLGHGDLBD.newBuilder()
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
      fpodljnbpbo_ = false;

      dhdmbahehko_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NCCLGHGDLBD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NCCLGHGDLBD getDefaultInstanceForType() {
      return POGOProtos.Rpc.NCCLGHGDLBD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NCCLGHGDLBD build() {
      POGOProtos.Rpc.NCCLGHGDLBD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NCCLGHGDLBD buildPartial() {
      POGOProtos.Rpc.NCCLGHGDLBD result = new POGOProtos.Rpc.NCCLGHGDLBD(this);
      result.fpodljnbpbo_ = fpodljnbpbo_;
      result.dhdmbahehko_ = dhdmbahehko_;
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
      if (other instanceof POGOProtos.Rpc.NCCLGHGDLBD) {
        return mergeFrom((POGOProtos.Rpc.NCCLGHGDLBD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NCCLGHGDLBD other) {
      if (other == POGOProtos.Rpc.NCCLGHGDLBD.getDefaultInstance()) return this;
      if (other.getFpodljnbpbo() != false) {
        setFpodljnbpbo(other.getFpodljnbpbo());
      }
      if (other.getDhdmbahehko() != false) {
        setDhdmbahehko(other.getDhdmbahehko());
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
      POGOProtos.Rpc.NCCLGHGDLBD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NCCLGHGDLBD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean fpodljnbpbo_ ;
    /**
     * <code>bool fpodljnbpbo = 1;</code>
     * @return The fpodljnbpbo.
     */
    @java.lang.Override
    public boolean getFpodljnbpbo() {
      return fpodljnbpbo_;
    }
    /**
     * <code>bool fpodljnbpbo = 1;</code>
     * @param value The fpodljnbpbo to set.
     * @return This builder for chaining.
     */
    public Builder setFpodljnbpbo(boolean value) {
      
      fpodljnbpbo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fpodljnbpbo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFpodljnbpbo() {
      
      fpodljnbpbo_ = false;
      onChanged();
      return this;
    }

    private boolean dhdmbahehko_ ;
    /**
     * <code>bool dhdmbahehko = 2;</code>
     * @return The dhdmbahehko.
     */
    @java.lang.Override
    public boolean getDhdmbahehko() {
      return dhdmbahehko_;
    }
    /**
     * <code>bool dhdmbahehko = 2;</code>
     * @param value The dhdmbahehko to set.
     * @return This builder for chaining.
     */
    public Builder setDhdmbahehko(boolean value) {
      
      dhdmbahehko_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool dhdmbahehko = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDhdmbahehko() {
      
      dhdmbahehko_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NCCLGHGDLBD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NCCLGHGDLBD)
  private static final POGOProtos.Rpc.NCCLGHGDLBD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NCCLGHGDLBD();
  }

  public static POGOProtos.Rpc.NCCLGHGDLBD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NCCLGHGDLBD>
      PARSER = new com.google.protobuf.AbstractParser<NCCLGHGDLBD>() {
    @java.lang.Override
    public NCCLGHGDLBD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NCCLGHGDLBD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NCCLGHGDLBD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NCCLGHGDLBD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NCCLGHGDLBD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

