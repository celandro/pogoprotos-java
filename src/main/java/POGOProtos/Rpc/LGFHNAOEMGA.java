// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: LGFHNAOEMGA
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.LGFHNAOEMGA}
 */
public final class LGFHNAOEMGA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LGFHNAOEMGA)
    LGFHNAOEMGAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LGFHNAOEMGA.newBuilder() to construct.
  private LGFHNAOEMGA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LGFHNAOEMGA() {
    mjlofidknme_ = "";
    gkbagaidnki_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LGFHNAOEMGA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LGFHNAOEMGA(
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

            mjlofidknme_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            gkbagaidnki_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LGFHNAOEMGA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LGFHNAOEMGA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LGFHNAOEMGA.class, POGOProtos.Rpc.LGFHNAOEMGA.Builder.class);
  }

  public static final int MJLOFIDKNME_FIELD_NUMBER = 1;
  private volatile java.lang.Object mjlofidknme_;
  /**
   * <code>string mjlofidknme = 1;</code>
   * @return The mjlofidknme.
   */
  @java.lang.Override
  public java.lang.String getMjlofidknme() {
    java.lang.Object ref = mjlofidknme_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mjlofidknme_ = s;
      return s;
    }
  }
  /**
   * <code>string mjlofidknme = 1;</code>
   * @return The bytes for mjlofidknme.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMjlofidknmeBytes() {
    java.lang.Object ref = mjlofidknme_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mjlofidknme_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GKBAGAIDNKI_FIELD_NUMBER = 2;
  private volatile java.lang.Object gkbagaidnki_;
  /**
   * <code>string gkbagaidnki = 2;</code>
   * @return The gkbagaidnki.
   */
  @java.lang.Override
  public java.lang.String getGkbagaidnki() {
    java.lang.Object ref = gkbagaidnki_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gkbagaidnki_ = s;
      return s;
    }
  }
  /**
   * <code>string gkbagaidnki = 2;</code>
   * @return The bytes for gkbagaidnki.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGkbagaidnkiBytes() {
    java.lang.Object ref = gkbagaidnki_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gkbagaidnki_ = b;
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
    if (!getMjlofidknmeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mjlofidknme_);
    }
    if (!getGkbagaidnkiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gkbagaidnki_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMjlofidknmeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mjlofidknme_);
    }
    if (!getGkbagaidnkiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gkbagaidnki_);
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
    if (!(obj instanceof POGOProtos.Rpc.LGFHNAOEMGA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LGFHNAOEMGA other = (POGOProtos.Rpc.LGFHNAOEMGA) obj;

    if (!getMjlofidknme()
        .equals(other.getMjlofidknme())) return false;
    if (!getGkbagaidnki()
        .equals(other.getGkbagaidnki())) return false;
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
    hash = (37 * hash) + MJLOFIDKNME_FIELD_NUMBER;
    hash = (53 * hash) + getMjlofidknme().hashCode();
    hash = (37 * hash) + GKBAGAIDNKI_FIELD_NUMBER;
    hash = (53 * hash) + getGkbagaidnki().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LGFHNAOEMGA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LGFHNAOEMGA prototype) {
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
   * ref: LGFHNAOEMGA
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.LGFHNAOEMGA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LGFHNAOEMGA)
      POGOProtos.Rpc.LGFHNAOEMGAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LGFHNAOEMGA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LGFHNAOEMGA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LGFHNAOEMGA.class, POGOProtos.Rpc.LGFHNAOEMGA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LGFHNAOEMGA.newBuilder()
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
      mjlofidknme_ = "";

      gkbagaidnki_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_LGFHNAOEMGA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LGFHNAOEMGA getDefaultInstanceForType() {
      return POGOProtos.Rpc.LGFHNAOEMGA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LGFHNAOEMGA build() {
      POGOProtos.Rpc.LGFHNAOEMGA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LGFHNAOEMGA buildPartial() {
      POGOProtos.Rpc.LGFHNAOEMGA result = new POGOProtos.Rpc.LGFHNAOEMGA(this);
      result.mjlofidknme_ = mjlofidknme_;
      result.gkbagaidnki_ = gkbagaidnki_;
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
      if (other instanceof POGOProtos.Rpc.LGFHNAOEMGA) {
        return mergeFrom((POGOProtos.Rpc.LGFHNAOEMGA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LGFHNAOEMGA other) {
      if (other == POGOProtos.Rpc.LGFHNAOEMGA.getDefaultInstance()) return this;
      if (!other.getMjlofidknme().isEmpty()) {
        mjlofidknme_ = other.mjlofidknme_;
        onChanged();
      }
      if (!other.getGkbagaidnki().isEmpty()) {
        gkbagaidnki_ = other.gkbagaidnki_;
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
      POGOProtos.Rpc.LGFHNAOEMGA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LGFHNAOEMGA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mjlofidknme_ = "";
    /**
     * <code>string mjlofidknme = 1;</code>
     * @return The mjlofidknme.
     */
    public java.lang.String getMjlofidknme() {
      java.lang.Object ref = mjlofidknme_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mjlofidknme_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mjlofidknme = 1;</code>
     * @return The bytes for mjlofidknme.
     */
    public com.google.protobuf.ByteString
        getMjlofidknmeBytes() {
      java.lang.Object ref = mjlofidknme_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mjlofidknme_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mjlofidknme = 1;</code>
     * @param value The mjlofidknme to set.
     * @return This builder for chaining.
     */
    public Builder setMjlofidknme(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mjlofidknme_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mjlofidknme = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMjlofidknme() {
      
      mjlofidknme_ = getDefaultInstance().getMjlofidknme();
      onChanged();
      return this;
    }
    /**
     * <code>string mjlofidknme = 1;</code>
     * @param value The bytes for mjlofidknme to set.
     * @return This builder for chaining.
     */
    public Builder setMjlofidknmeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mjlofidknme_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gkbagaidnki_ = "";
    /**
     * <code>string gkbagaidnki = 2;</code>
     * @return The gkbagaidnki.
     */
    public java.lang.String getGkbagaidnki() {
      java.lang.Object ref = gkbagaidnki_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gkbagaidnki_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gkbagaidnki = 2;</code>
     * @return The bytes for gkbagaidnki.
     */
    public com.google.protobuf.ByteString
        getGkbagaidnkiBytes() {
      java.lang.Object ref = gkbagaidnki_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gkbagaidnki_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gkbagaidnki = 2;</code>
     * @param value The gkbagaidnki to set.
     * @return This builder for chaining.
     */
    public Builder setGkbagaidnki(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gkbagaidnki_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gkbagaidnki = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGkbagaidnki() {
      
      gkbagaidnki_ = getDefaultInstance().getGkbagaidnki();
      onChanged();
      return this;
    }
    /**
     * <code>string gkbagaidnki = 2;</code>
     * @param value The bytes for gkbagaidnki to set.
     * @return This builder for chaining.
     */
    public Builder setGkbagaidnkiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gkbagaidnki_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LGFHNAOEMGA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LGFHNAOEMGA)
  private static final POGOProtos.Rpc.LGFHNAOEMGA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LGFHNAOEMGA();
  }

  public static POGOProtos.Rpc.LGFHNAOEMGA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LGFHNAOEMGA>
      PARSER = new com.google.protobuf.AbstractParser<LGFHNAOEMGA>() {
    @java.lang.Override
    public LGFHNAOEMGA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LGFHNAOEMGA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LGFHNAOEMGA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LGFHNAOEMGA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LGFHNAOEMGA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
