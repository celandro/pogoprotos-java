// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: EBNLAIFABEP
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.EBNLAIFABEP}
 */
public final class EBNLAIFABEP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.EBNLAIFABEP)
    EBNLAIFABEPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EBNLAIFABEP.newBuilder() to construct.
  private EBNLAIFABEP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EBNLAIFABEP() {
    dopmejpngoj_ = "";
    fjnpgpdoihl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EBNLAIFABEP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EBNLAIFABEP(
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

            dopmejpngoj_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fjnpgpdoihl_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EBNLAIFABEP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EBNLAIFABEP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.EBNLAIFABEP.class, POGOProtos.Rpc.EBNLAIFABEP.Builder.class);
  }

  public static final int DOPMEJPNGOJ_FIELD_NUMBER = 1;
  private volatile java.lang.Object dopmejpngoj_;
  /**
   * <code>string dopmejpngoj = 1;</code>
   * @return The dopmejpngoj.
   */
  @java.lang.Override
  public java.lang.String getDopmejpngoj() {
    java.lang.Object ref = dopmejpngoj_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dopmejpngoj_ = s;
      return s;
    }
  }
  /**
   * <code>string dopmejpngoj = 1;</code>
   * @return The bytes for dopmejpngoj.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDopmejpngojBytes() {
    java.lang.Object ref = dopmejpngoj_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dopmejpngoj_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FJNPGPDOIHL_FIELD_NUMBER = 2;
  private volatile java.lang.Object fjnpgpdoihl_;
  /**
   * <code>string fjnpgpdoihl = 2;</code>
   * @return The fjnpgpdoihl.
   */
  @java.lang.Override
  public java.lang.String getFjnpgpdoihl() {
    java.lang.Object ref = fjnpgpdoihl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fjnpgpdoihl_ = s;
      return s;
    }
  }
  /**
   * <code>string fjnpgpdoihl = 2;</code>
   * @return The bytes for fjnpgpdoihl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFjnpgpdoihlBytes() {
    java.lang.Object ref = fjnpgpdoihl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fjnpgpdoihl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getDopmejpngojBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dopmejpngoj_);
    }
    if (!getFjnpgpdoihlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fjnpgpdoihl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDopmejpngojBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dopmejpngoj_);
    }
    if (!getFjnpgpdoihlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fjnpgpdoihl_);
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
    if (!(obj instanceof POGOProtos.Rpc.EBNLAIFABEP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.EBNLAIFABEP other = (POGOProtos.Rpc.EBNLAIFABEP) obj;

    if (!getDopmejpngoj()
        .equals(other.getDopmejpngoj())) return false;
    if (!getFjnpgpdoihl()
        .equals(other.getFjnpgpdoihl())) return false;
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
    hash = (37 * hash) + DOPMEJPNGOJ_FIELD_NUMBER;
    hash = (53 * hash) + getDopmejpngoj().hashCode();
    hash = (37 * hash) + FJNPGPDOIHL_FIELD_NUMBER;
    hash = (53 * hash) + getFjnpgpdoihl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.EBNLAIFABEP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.EBNLAIFABEP prototype) {
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
   * ref: EBNLAIFABEP
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.EBNLAIFABEP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.EBNLAIFABEP)
      POGOProtos.Rpc.EBNLAIFABEPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EBNLAIFABEP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EBNLAIFABEP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.EBNLAIFABEP.class, POGOProtos.Rpc.EBNLAIFABEP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.EBNLAIFABEP.newBuilder()
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
      dopmejpngoj_ = "";

      fjnpgpdoihl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_EBNLAIFABEP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EBNLAIFABEP getDefaultInstanceForType() {
      return POGOProtos.Rpc.EBNLAIFABEP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.EBNLAIFABEP build() {
      POGOProtos.Rpc.EBNLAIFABEP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.EBNLAIFABEP buildPartial() {
      POGOProtos.Rpc.EBNLAIFABEP result = new POGOProtos.Rpc.EBNLAIFABEP(this);
      result.dopmejpngoj_ = dopmejpngoj_;
      result.fjnpgpdoihl_ = fjnpgpdoihl_;
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
      if (other instanceof POGOProtos.Rpc.EBNLAIFABEP) {
        return mergeFrom((POGOProtos.Rpc.EBNLAIFABEP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.EBNLAIFABEP other) {
      if (other == POGOProtos.Rpc.EBNLAIFABEP.getDefaultInstance()) return this;
      if (!other.getDopmejpngoj().isEmpty()) {
        dopmejpngoj_ = other.dopmejpngoj_;
        onChanged();
      }
      if (!other.getFjnpgpdoihl().isEmpty()) {
        fjnpgpdoihl_ = other.fjnpgpdoihl_;
        onChanged();
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
      POGOProtos.Rpc.EBNLAIFABEP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.EBNLAIFABEP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dopmejpngoj_ = "";
    /**
     * <code>string dopmejpngoj = 1;</code>
     * @return The dopmejpngoj.
     */
    public java.lang.String getDopmejpngoj() {
      java.lang.Object ref = dopmejpngoj_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dopmejpngoj_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dopmejpngoj = 1;</code>
     * @return The bytes for dopmejpngoj.
     */
    public com.google.protobuf.ByteString
        getDopmejpngojBytes() {
      java.lang.Object ref = dopmejpngoj_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dopmejpngoj_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dopmejpngoj = 1;</code>
     * @param value The dopmejpngoj to set.
     * @return This builder for chaining.
     */
    public Builder setDopmejpngoj(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dopmejpngoj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dopmejpngoj = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDopmejpngoj() {
      
      dopmejpngoj_ = getDefaultInstance().getDopmejpngoj();
      onChanged();
      return this;
    }
    /**
     * <code>string dopmejpngoj = 1;</code>
     * @param value The bytes for dopmejpngoj to set.
     * @return This builder for chaining.
     */
    public Builder setDopmejpngojBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dopmejpngoj_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fjnpgpdoihl_ = "";
    /**
     * <code>string fjnpgpdoihl = 2;</code>
     * @return The fjnpgpdoihl.
     */
    public java.lang.String getFjnpgpdoihl() {
      java.lang.Object ref = fjnpgpdoihl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fjnpgpdoihl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fjnpgpdoihl = 2;</code>
     * @return The bytes for fjnpgpdoihl.
     */
    public com.google.protobuf.ByteString
        getFjnpgpdoihlBytes() {
      java.lang.Object ref = fjnpgpdoihl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fjnpgpdoihl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fjnpgpdoihl = 2;</code>
     * @param value The fjnpgpdoihl to set.
     * @return This builder for chaining.
     */
    public Builder setFjnpgpdoihl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fjnpgpdoihl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fjnpgpdoihl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFjnpgpdoihl() {
      
      fjnpgpdoihl_ = getDefaultInstance().getFjnpgpdoihl();
      onChanged();
      return this;
    }
    /**
     * <code>string fjnpgpdoihl = 2;</code>
     * @param value The bytes for fjnpgpdoihl to set.
     * @return This builder for chaining.
     */
    public Builder setFjnpgpdoihlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fjnpgpdoihl_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.EBNLAIFABEP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.EBNLAIFABEP)
  private static final POGOProtos.Rpc.EBNLAIFABEP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.EBNLAIFABEP();
  }

  public static POGOProtos.Rpc.EBNLAIFABEP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EBNLAIFABEP>
      PARSER = new com.google.protobuf.AbstractParser<EBNLAIFABEP>() {
    @java.lang.Override
    public EBNLAIFABEP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EBNLAIFABEP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EBNLAIFABEP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EBNLAIFABEP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.EBNLAIFABEP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
