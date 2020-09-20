// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: CKAIOEMCIIO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CKAIOEMCIIO}
 */
public final class CKAIOEMCIIO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CKAIOEMCIIO)
    CKAIOEMCIIOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CKAIOEMCIIO.newBuilder() to construct.
  private CKAIOEMCIIO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CKAIOEMCIIO() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CKAIOEMCIIO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CKAIOEMCIIO(
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
          case 9: {

            nlblgfioeic_ = input.readDouble();
            break;
          }
          case 17: {

            ojnmcebeede_ = input.readDouble();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKAIOEMCIIO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKAIOEMCIIO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CKAIOEMCIIO.class, POGOProtos.Rpc.CKAIOEMCIIO.Builder.class);
  }

  public static final int NLBLGFIOEIC_FIELD_NUMBER = 1;
  private double nlblgfioeic_;
  /**
   * <code>double nlblgfioeic = 1;</code>
   * @return The nlblgfioeic.
   */
  @java.lang.Override
  public double getNlblgfioeic() {
    return nlblgfioeic_;
  }

  public static final int OJNMCEBEEDE_FIELD_NUMBER = 2;
  private double ojnmcebeede_;
  /**
   * <code>double ojnmcebeede = 2;</code>
   * @return The ojnmcebeede.
   */
  @java.lang.Override
  public double getOjnmcebeede() {
    return ojnmcebeede_;
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
    if (nlblgfioeic_ != 0D) {
      output.writeDouble(1, nlblgfioeic_);
    }
    if (ojnmcebeede_ != 0D) {
      output.writeDouble(2, ojnmcebeede_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nlblgfioeic_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, nlblgfioeic_);
    }
    if (ojnmcebeede_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, ojnmcebeede_);
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
    if (!(obj instanceof POGOProtos.Rpc.CKAIOEMCIIO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CKAIOEMCIIO other = (POGOProtos.Rpc.CKAIOEMCIIO) obj;

    if (java.lang.Double.doubleToLongBits(getNlblgfioeic())
        != java.lang.Double.doubleToLongBits(
            other.getNlblgfioeic())) return false;
    if (java.lang.Double.doubleToLongBits(getOjnmcebeede())
        != java.lang.Double.doubleToLongBits(
            other.getOjnmcebeede())) return false;
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
    hash = (37 * hash) + NLBLGFIOEIC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNlblgfioeic()));
    hash = (37 * hash) + OJNMCEBEEDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOjnmcebeede()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CKAIOEMCIIO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CKAIOEMCIIO prototype) {
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
   * ref: CKAIOEMCIIO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CKAIOEMCIIO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CKAIOEMCIIO)
      POGOProtos.Rpc.CKAIOEMCIIOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKAIOEMCIIO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKAIOEMCIIO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CKAIOEMCIIO.class, POGOProtos.Rpc.CKAIOEMCIIO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CKAIOEMCIIO.newBuilder()
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
      nlblgfioeic_ = 0D;

      ojnmcebeede_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CKAIOEMCIIO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKAIOEMCIIO getDefaultInstanceForType() {
      return POGOProtos.Rpc.CKAIOEMCIIO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKAIOEMCIIO build() {
      POGOProtos.Rpc.CKAIOEMCIIO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CKAIOEMCIIO buildPartial() {
      POGOProtos.Rpc.CKAIOEMCIIO result = new POGOProtos.Rpc.CKAIOEMCIIO(this);
      result.nlblgfioeic_ = nlblgfioeic_;
      result.ojnmcebeede_ = ojnmcebeede_;
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
      if (other instanceof POGOProtos.Rpc.CKAIOEMCIIO) {
        return mergeFrom((POGOProtos.Rpc.CKAIOEMCIIO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CKAIOEMCIIO other) {
      if (other == POGOProtos.Rpc.CKAIOEMCIIO.getDefaultInstance()) return this;
      if (other.getNlblgfioeic() != 0D) {
        setNlblgfioeic(other.getNlblgfioeic());
      }
      if (other.getOjnmcebeede() != 0D) {
        setOjnmcebeede(other.getOjnmcebeede());
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
      POGOProtos.Rpc.CKAIOEMCIIO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CKAIOEMCIIO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double nlblgfioeic_ ;
    /**
     * <code>double nlblgfioeic = 1;</code>
     * @return The nlblgfioeic.
     */
    @java.lang.Override
    public double getNlblgfioeic() {
      return nlblgfioeic_;
    }
    /**
     * <code>double nlblgfioeic = 1;</code>
     * @param value The nlblgfioeic to set.
     * @return This builder for chaining.
     */
    public Builder setNlblgfioeic(double value) {
      
      nlblgfioeic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double nlblgfioeic = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNlblgfioeic() {
      
      nlblgfioeic_ = 0D;
      onChanged();
      return this;
    }

    private double ojnmcebeede_ ;
    /**
     * <code>double ojnmcebeede = 2;</code>
     * @return The ojnmcebeede.
     */
    @java.lang.Override
    public double getOjnmcebeede() {
      return ojnmcebeede_;
    }
    /**
     * <code>double ojnmcebeede = 2;</code>
     * @param value The ojnmcebeede to set.
     * @return This builder for chaining.
     */
    public Builder setOjnmcebeede(double value) {
      
      ojnmcebeede_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double ojnmcebeede = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOjnmcebeede() {
      
      ojnmcebeede_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CKAIOEMCIIO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CKAIOEMCIIO)
  private static final POGOProtos.Rpc.CKAIOEMCIIO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CKAIOEMCIIO();
  }

  public static POGOProtos.Rpc.CKAIOEMCIIO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CKAIOEMCIIO>
      PARSER = new com.google.protobuf.AbstractParser<CKAIOEMCIIO>() {
    @java.lang.Override
    public CKAIOEMCIIO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CKAIOEMCIIO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CKAIOEMCIIO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CKAIOEMCIIO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CKAIOEMCIIO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

