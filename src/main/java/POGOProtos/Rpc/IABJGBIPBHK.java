// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IABJGBIPBHK}
 */
public  final class IABJGBIPBHK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IABJGBIPBHK)
    IABJGBIPBHKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IABJGBIPBHK.newBuilder() to construct.
  private IABJGBIPBHK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IABJGBIPBHK() {
    didlgoinmlh_ = 0;
    fppifhflodn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IABJGBIPBHK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IABJGBIPBHK(
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
            int rawValue = input.readEnum();

            didlgoinmlh_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fppifhflodn_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IABJGBIPBHK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IABJGBIPBHK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IABJGBIPBHK.class, POGOProtos.Rpc.IABJGBIPBHK.Builder.class);
  }

  public static final int DIDLGOINMLH_FIELD_NUMBER = 1;
  private int didlgoinmlh_;
  /**
   * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
   * @return The enum numeric value on the wire for didlgoinmlh.
   */
  public int getDidlgoinmlhValue() {
    return didlgoinmlh_;
  }
  /**
   * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
   * @return The didlgoinmlh.
   */
  public POGOProtos.Rpc.OHHCAACGEBB getDidlgoinmlh() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.OHHCAACGEBB result = POGOProtos.Rpc.OHHCAACGEBB.valueOf(didlgoinmlh_);
    return result == null ? POGOProtos.Rpc.OHHCAACGEBB.UNRECOGNIZED : result;
  }

  public static final int FPPIFHFLODN_FIELD_NUMBER = 2;
  private volatile java.lang.Object fppifhflodn_;
  /**
   * <code>string fppifhflodn = 2;</code>
   * @return The fppifhflodn.
   */
  public java.lang.String getFppifhflodn() {
    java.lang.Object ref = fppifhflodn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fppifhflodn_ = s;
      return s;
    }
  }
  /**
   * <code>string fppifhflodn = 2;</code>
   * @return The bytes for fppifhflodn.
   */
  public com.google.protobuf.ByteString
      getFppifhflodnBytes() {
    java.lang.Object ref = fppifhflodn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fppifhflodn_ = b;
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
    if (didlgoinmlh_ != POGOProtos.Rpc.OHHCAACGEBB.OHHCAACGEBB_UNDEFINED_POKEMON_INVENTORY_EVENT.getNumber()) {
      output.writeEnum(1, didlgoinmlh_);
    }
    if (!getFppifhflodnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fppifhflodn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (didlgoinmlh_ != POGOProtos.Rpc.OHHCAACGEBB.OHHCAACGEBB_UNDEFINED_POKEMON_INVENTORY_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, didlgoinmlh_);
    }
    if (!getFppifhflodnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fppifhflodn_);
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
    if (!(obj instanceof POGOProtos.Rpc.IABJGBIPBHK)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IABJGBIPBHK other = (POGOProtos.Rpc.IABJGBIPBHK) obj;

    if (didlgoinmlh_ != other.didlgoinmlh_) return false;
    if (!getFppifhflodn()
        .equals(other.getFppifhflodn())) return false;
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
    hash = (37 * hash) + DIDLGOINMLH_FIELD_NUMBER;
    hash = (53 * hash) + didlgoinmlh_;
    hash = (37 * hash) + FPPIFHFLODN_FIELD_NUMBER;
    hash = (53 * hash) + getFppifhflodn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IABJGBIPBHK parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IABJGBIPBHK prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IABJGBIPBHK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IABJGBIPBHK)
      POGOProtos.Rpc.IABJGBIPBHKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IABJGBIPBHK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IABJGBIPBHK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IABJGBIPBHK.class, POGOProtos.Rpc.IABJGBIPBHK.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IABJGBIPBHK.newBuilder()
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
      didlgoinmlh_ = 0;

      fppifhflodn_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IABJGBIPBHK_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IABJGBIPBHK getDefaultInstanceForType() {
      return POGOProtos.Rpc.IABJGBIPBHK.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IABJGBIPBHK build() {
      POGOProtos.Rpc.IABJGBIPBHK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IABJGBIPBHK buildPartial() {
      POGOProtos.Rpc.IABJGBIPBHK result = new POGOProtos.Rpc.IABJGBIPBHK(this);
      result.didlgoinmlh_ = didlgoinmlh_;
      result.fppifhflodn_ = fppifhflodn_;
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
      if (other instanceof POGOProtos.Rpc.IABJGBIPBHK) {
        return mergeFrom((POGOProtos.Rpc.IABJGBIPBHK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IABJGBIPBHK other) {
      if (other == POGOProtos.Rpc.IABJGBIPBHK.getDefaultInstance()) return this;
      if (other.didlgoinmlh_ != 0) {
        setDidlgoinmlhValue(other.getDidlgoinmlhValue());
      }
      if (!other.getFppifhflodn().isEmpty()) {
        fppifhflodn_ = other.fppifhflodn_;
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
      POGOProtos.Rpc.IABJGBIPBHK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IABJGBIPBHK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int didlgoinmlh_ = 0;
    /**
     * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
     * @return The enum numeric value on the wire for didlgoinmlh.
     */
    public int getDidlgoinmlhValue() {
      return didlgoinmlh_;
    }
    /**
     * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
     * @param value The enum numeric value on the wire for didlgoinmlh to set.
     * @return This builder for chaining.
     */
    public Builder setDidlgoinmlhValue(int value) {
      didlgoinmlh_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
     * @return The didlgoinmlh.
     */
    public POGOProtos.Rpc.OHHCAACGEBB getDidlgoinmlh() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.OHHCAACGEBB result = POGOProtos.Rpc.OHHCAACGEBB.valueOf(didlgoinmlh_);
      return result == null ? POGOProtos.Rpc.OHHCAACGEBB.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
     * @param value The didlgoinmlh to set.
     * @return This builder for chaining.
     */
    public Builder setDidlgoinmlh(POGOProtos.Rpc.OHHCAACGEBB value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      didlgoinmlh_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.OHHCAACGEBB didlgoinmlh = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDidlgoinmlh() {
      
      didlgoinmlh_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fppifhflodn_ = "";
    /**
     * <code>string fppifhflodn = 2;</code>
     * @return The fppifhflodn.
     */
    public java.lang.String getFppifhflodn() {
      java.lang.Object ref = fppifhflodn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fppifhflodn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fppifhflodn = 2;</code>
     * @return The bytes for fppifhflodn.
     */
    public com.google.protobuf.ByteString
        getFppifhflodnBytes() {
      java.lang.Object ref = fppifhflodn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fppifhflodn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fppifhflodn = 2;</code>
     * @param value The fppifhflodn to set.
     * @return This builder for chaining.
     */
    public Builder setFppifhflodn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fppifhflodn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fppifhflodn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFppifhflodn() {
      
      fppifhflodn_ = getDefaultInstance().getFppifhflodn();
      onChanged();
      return this;
    }
    /**
     * <code>string fppifhflodn = 2;</code>
     * @param value The bytes for fppifhflodn to set.
     * @return This builder for chaining.
     */
    public Builder setFppifhflodnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fppifhflodn_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IABJGBIPBHK)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IABJGBIPBHK)
  private static final POGOProtos.Rpc.IABJGBIPBHK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IABJGBIPBHK();
  }

  public static POGOProtos.Rpc.IABJGBIPBHK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IABJGBIPBHK>
      PARSER = new com.google.protobuf.AbstractParser<IABJGBIPBHK>() {
    @java.lang.Override
    public IABJGBIPBHK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IABJGBIPBHK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IABJGBIPBHK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IABJGBIPBHK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IABJGBIPBHK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

