// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: BCPELIGHMNO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.BCPELIGHMNO}
 */
public final class BCPELIGHMNO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.BCPELIGHMNO)
    BCPELIGHMNOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BCPELIGHMNO.newBuilder() to construct.
  private BCPELIGHMNO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BCPELIGHMNO() {
    pegfachkbdd_ = "";
    dakcmdojgah_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BCPELIGHMNO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BCPELIGHMNO(
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

            pegfachkbdd_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dakcmdojgah_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCPELIGHMNO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCPELIGHMNO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.BCPELIGHMNO.class, POGOProtos.Rpc.BCPELIGHMNO.Builder.class);
  }

  public static final int PEGFACHKBDD_FIELD_NUMBER = 1;
  private volatile java.lang.Object pegfachkbdd_;
  /**
   * <code>string pegfachkbdd = 1;</code>
   * @return The pegfachkbdd.
   */
  @java.lang.Override
  public java.lang.String getPegfachkbdd() {
    java.lang.Object ref = pegfachkbdd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pegfachkbdd_ = s;
      return s;
    }
  }
  /**
   * <code>string pegfachkbdd = 1;</code>
   * @return The bytes for pegfachkbdd.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPegfachkbddBytes() {
    java.lang.Object ref = pegfachkbdd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pegfachkbdd_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DAKCMDOJGAH_FIELD_NUMBER = 2;
  private volatile java.lang.Object dakcmdojgah_;
  /**
   * <code>string dakcmdojgah = 2;</code>
   * @return The dakcmdojgah.
   */
  @java.lang.Override
  public java.lang.String getDakcmdojgah() {
    java.lang.Object ref = dakcmdojgah_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dakcmdojgah_ = s;
      return s;
    }
  }
  /**
   * <code>string dakcmdojgah = 2;</code>
   * @return The bytes for dakcmdojgah.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDakcmdojgahBytes() {
    java.lang.Object ref = dakcmdojgah_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dakcmdojgah_ = b;
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
    if (!getPegfachkbddBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pegfachkbdd_);
    }
    if (!getDakcmdojgahBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dakcmdojgah_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPegfachkbddBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pegfachkbdd_);
    }
    if (!getDakcmdojgahBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dakcmdojgah_);
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
    if (!(obj instanceof POGOProtos.Rpc.BCPELIGHMNO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.BCPELIGHMNO other = (POGOProtos.Rpc.BCPELIGHMNO) obj;

    if (!getPegfachkbdd()
        .equals(other.getPegfachkbdd())) return false;
    if (!getDakcmdojgah()
        .equals(other.getDakcmdojgah())) return false;
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
    hash = (37 * hash) + PEGFACHKBDD_FIELD_NUMBER;
    hash = (53 * hash) + getPegfachkbdd().hashCode();
    hash = (37 * hash) + DAKCMDOJGAH_FIELD_NUMBER;
    hash = (53 * hash) + getDakcmdojgah().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.BCPELIGHMNO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.BCPELIGHMNO prototype) {
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
   * ref: BCPELIGHMNO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.BCPELIGHMNO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.BCPELIGHMNO)
      POGOProtos.Rpc.BCPELIGHMNOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCPELIGHMNO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCPELIGHMNO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.BCPELIGHMNO.class, POGOProtos.Rpc.BCPELIGHMNO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.BCPELIGHMNO.newBuilder()
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
      pegfachkbdd_ = "";

      dakcmdojgah_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_BCPELIGHMNO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCPELIGHMNO getDefaultInstanceForType() {
      return POGOProtos.Rpc.BCPELIGHMNO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCPELIGHMNO build() {
      POGOProtos.Rpc.BCPELIGHMNO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.BCPELIGHMNO buildPartial() {
      POGOProtos.Rpc.BCPELIGHMNO result = new POGOProtos.Rpc.BCPELIGHMNO(this);
      result.pegfachkbdd_ = pegfachkbdd_;
      result.dakcmdojgah_ = dakcmdojgah_;
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
      if (other instanceof POGOProtos.Rpc.BCPELIGHMNO) {
        return mergeFrom((POGOProtos.Rpc.BCPELIGHMNO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.BCPELIGHMNO other) {
      if (other == POGOProtos.Rpc.BCPELIGHMNO.getDefaultInstance()) return this;
      if (!other.getPegfachkbdd().isEmpty()) {
        pegfachkbdd_ = other.pegfachkbdd_;
        onChanged();
      }
      if (!other.getDakcmdojgah().isEmpty()) {
        dakcmdojgah_ = other.dakcmdojgah_;
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
      POGOProtos.Rpc.BCPELIGHMNO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.BCPELIGHMNO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pegfachkbdd_ = "";
    /**
     * <code>string pegfachkbdd = 1;</code>
     * @return The pegfachkbdd.
     */
    public java.lang.String getPegfachkbdd() {
      java.lang.Object ref = pegfachkbdd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pegfachkbdd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pegfachkbdd = 1;</code>
     * @return The bytes for pegfachkbdd.
     */
    public com.google.protobuf.ByteString
        getPegfachkbddBytes() {
      java.lang.Object ref = pegfachkbdd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pegfachkbdd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pegfachkbdd = 1;</code>
     * @param value The pegfachkbdd to set.
     * @return This builder for chaining.
     */
    public Builder setPegfachkbdd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pegfachkbdd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pegfachkbdd = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPegfachkbdd() {
      
      pegfachkbdd_ = getDefaultInstance().getPegfachkbdd();
      onChanged();
      return this;
    }
    /**
     * <code>string pegfachkbdd = 1;</code>
     * @param value The bytes for pegfachkbdd to set.
     * @return This builder for chaining.
     */
    public Builder setPegfachkbddBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pegfachkbdd_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dakcmdojgah_ = "";
    /**
     * <code>string dakcmdojgah = 2;</code>
     * @return The dakcmdojgah.
     */
    public java.lang.String getDakcmdojgah() {
      java.lang.Object ref = dakcmdojgah_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dakcmdojgah_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dakcmdojgah = 2;</code>
     * @return The bytes for dakcmdojgah.
     */
    public com.google.protobuf.ByteString
        getDakcmdojgahBytes() {
      java.lang.Object ref = dakcmdojgah_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dakcmdojgah_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dakcmdojgah = 2;</code>
     * @param value The dakcmdojgah to set.
     * @return This builder for chaining.
     */
    public Builder setDakcmdojgah(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dakcmdojgah_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dakcmdojgah = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDakcmdojgah() {
      
      dakcmdojgah_ = getDefaultInstance().getDakcmdojgah();
      onChanged();
      return this;
    }
    /**
     * <code>string dakcmdojgah = 2;</code>
     * @param value The bytes for dakcmdojgah to set.
     * @return This builder for chaining.
     */
    public Builder setDakcmdojgahBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dakcmdojgah_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.BCPELIGHMNO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.BCPELIGHMNO)
  private static final POGOProtos.Rpc.BCPELIGHMNO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.BCPELIGHMNO();
  }

  public static POGOProtos.Rpc.BCPELIGHMNO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BCPELIGHMNO>
      PARSER = new com.google.protobuf.AbstractParser<BCPELIGHMNO>() {
    @java.lang.Override
    public BCPELIGHMNO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BCPELIGHMNO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BCPELIGHMNO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BCPELIGHMNO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.BCPELIGHMNO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
