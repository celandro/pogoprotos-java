// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ClaimCodenameRequestProto}
 */
public final class ClaimCodenameRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClaimCodenameRequestProto)
    ClaimCodenameRequestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClaimCodenameRequestProto.newBuilder() to construct.
  private ClaimCodenameRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClaimCodenameRequestProto() {
    codename_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClaimCodenameRequestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClaimCodenameRequestProto(
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

            codename_ = s;
            break;
          }
          case 16: {

            force_ = input.readBool();
            break;
          }
          case 24: {

            generateSuggestedCodenames_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClaimCodenameRequestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClaimCodenameRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClaimCodenameRequestProto.class, POGOProtos.Rpc.ClaimCodenameRequestProto.Builder.class);
  }

  public static final int CODENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object codename_;
  /**
   * <code>string codename = 1;</code>
   * @return The codename.
   */
  @java.lang.Override
  public java.lang.String getCodename() {
    java.lang.Object ref = codename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codename_ = s;
      return s;
    }
  }
  /**
   * <code>string codename = 1;</code>
   * @return The bytes for codename.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodenameBytes() {
    java.lang.Object ref = codename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORCE_FIELD_NUMBER = 2;
  private boolean force_;
  /**
   * <code>bool force = 2;</code>
   * @return The force.
   */
  @java.lang.Override
  public boolean getForce() {
    return force_;
  }

  public static final int GENERATE_SUGGESTED_CODENAMES_FIELD_NUMBER = 3;
  private boolean generateSuggestedCodenames_;
  /**
   * <code>bool generate_suggested_codenames = 3;</code>
   * @return The generateSuggestedCodenames.
   */
  @java.lang.Override
  public boolean getGenerateSuggestedCodenames() {
    return generateSuggestedCodenames_;
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
    if (!getCodenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, codename_);
    }
    if (force_ != false) {
      output.writeBool(2, force_);
    }
    if (generateSuggestedCodenames_ != false) {
      output.writeBool(3, generateSuggestedCodenames_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCodenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, codename_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, force_);
    }
    if (generateSuggestedCodenames_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, generateSuggestedCodenames_);
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
    if (!(obj instanceof POGOProtos.Rpc.ClaimCodenameRequestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClaimCodenameRequestProto other = (POGOProtos.Rpc.ClaimCodenameRequestProto) obj;

    if (!getCodename()
        .equals(other.getCodename())) return false;
    if (getForce()
        != other.getForce()) return false;
    if (getGenerateSuggestedCodenames()
        != other.getGenerateSuggestedCodenames()) return false;
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
    hash = (37 * hash) + CODENAME_FIELD_NUMBER;
    hash = (53 * hash) + getCodename().hashCode();
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForce());
    hash = (37 * hash) + GENERATE_SUGGESTED_CODENAMES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGenerateSuggestedCodenames());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClaimCodenameRequestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClaimCodenameRequestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ClaimCodenameRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClaimCodenameRequestProto)
      POGOProtos.Rpc.ClaimCodenameRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClaimCodenameRequestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClaimCodenameRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClaimCodenameRequestProto.class, POGOProtos.Rpc.ClaimCodenameRequestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClaimCodenameRequestProto.newBuilder()
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
      codename_ = "";

      force_ = false;

      generateSuggestedCodenames_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClaimCodenameRequestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClaimCodenameRequestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClaimCodenameRequestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClaimCodenameRequestProto build() {
      POGOProtos.Rpc.ClaimCodenameRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClaimCodenameRequestProto buildPartial() {
      POGOProtos.Rpc.ClaimCodenameRequestProto result = new POGOProtos.Rpc.ClaimCodenameRequestProto(this);
      result.codename_ = codename_;
      result.force_ = force_;
      result.generateSuggestedCodenames_ = generateSuggestedCodenames_;
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
      if (other instanceof POGOProtos.Rpc.ClaimCodenameRequestProto) {
        return mergeFrom((POGOProtos.Rpc.ClaimCodenameRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClaimCodenameRequestProto other) {
      if (other == POGOProtos.Rpc.ClaimCodenameRequestProto.getDefaultInstance()) return this;
      if (!other.getCodename().isEmpty()) {
        codename_ = other.codename_;
        onChanged();
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
      }
      if (other.getGenerateSuggestedCodenames() != false) {
        setGenerateSuggestedCodenames(other.getGenerateSuggestedCodenames());
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
      POGOProtos.Rpc.ClaimCodenameRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClaimCodenameRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object codename_ = "";
    /**
     * <code>string codename = 1;</code>
     * @return The codename.
     */
    public java.lang.String getCodename() {
      java.lang.Object ref = codename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string codename = 1;</code>
     * @return The bytes for codename.
     */
    public com.google.protobuf.ByteString
        getCodenameBytes() {
      java.lang.Object ref = codename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string codename = 1;</code>
     * @param value The codename to set.
     * @return This builder for chaining.
     */
    public Builder setCodename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string codename = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodename() {
      
      codename_ = getDefaultInstance().getCodename();
      onChanged();
      return this;
    }
    /**
     * <code>string codename = 1;</code>
     * @param value The bytes for codename to set.
     * @return This builder for chaining.
     */
    public Builder setCodenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codename_ = value;
      onChanged();
      return this;
    }

    private boolean force_ ;
    /**
     * <code>bool force = 2;</code>
     * @return The force.
     */
    @java.lang.Override
    public boolean getForce() {
      return force_;
    }
    /**
     * <code>bool force = 2;</code>
     * @param value The force to set.
     * @return This builder for chaining.
     */
    public Builder setForce(boolean value) {
      
      force_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool force = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearForce() {
      
      force_ = false;
      onChanged();
      return this;
    }

    private boolean generateSuggestedCodenames_ ;
    /**
     * <code>bool generate_suggested_codenames = 3;</code>
     * @return The generateSuggestedCodenames.
     */
    @java.lang.Override
    public boolean getGenerateSuggestedCodenames() {
      return generateSuggestedCodenames_;
    }
    /**
     * <code>bool generate_suggested_codenames = 3;</code>
     * @param value The generateSuggestedCodenames to set.
     * @return This builder for chaining.
     */
    public Builder setGenerateSuggestedCodenames(boolean value) {
      
      generateSuggestedCodenames_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool generate_suggested_codenames = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenerateSuggestedCodenames() {
      
      generateSuggestedCodenames_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClaimCodenameRequestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClaimCodenameRequestProto)
  private static final POGOProtos.Rpc.ClaimCodenameRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClaimCodenameRequestProto();
  }

  public static POGOProtos.Rpc.ClaimCodenameRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClaimCodenameRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<ClaimCodenameRequestProto>() {
    @java.lang.Override
    public ClaimCodenameRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClaimCodenameRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClaimCodenameRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClaimCodenameRequestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClaimCodenameRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

