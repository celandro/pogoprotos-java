// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.JPLIHBGMAOM}
 */
public  final class JPLIHBGMAOM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JPLIHBGMAOM)
    JPLIHBGMAOMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JPLIHBGMAOM.newBuilder() to construct.
  private JPLIHBGMAOM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JPLIHBGMAOM() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JPLIHBGMAOM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JPLIHBGMAOM(
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

            npolipkkfed_ = input.readBool();
            break;
          }
          case 16: {

            ldfafdmomff_ = input.readBool();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JPLIHBGMAOM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JPLIHBGMAOM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JPLIHBGMAOM.class, POGOProtos.Rpc.JPLIHBGMAOM.Builder.class);
  }

  public static final int NPOLIPKKFED_FIELD_NUMBER = 1;
  private boolean npolipkkfed_;
  /**
   * <code>bool npolipkkfed = 1;</code>
   * @return The npolipkkfed.
   */
  public boolean getNpolipkkfed() {
    return npolipkkfed_;
  }

  public static final int LDFAFDMOMFF_FIELD_NUMBER = 2;
  private boolean ldfafdmomff_;
  /**
   * <code>bool ldfafdmomff = 2;</code>
   * @return The ldfafdmomff.
   */
  public boolean getLdfafdmomff() {
    return ldfafdmomff_;
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
    if (npolipkkfed_ != false) {
      output.writeBool(1, npolipkkfed_);
    }
    if (ldfafdmomff_ != false) {
      output.writeBool(2, ldfafdmomff_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (npolipkkfed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, npolipkkfed_);
    }
    if (ldfafdmomff_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ldfafdmomff_);
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
    if (!(obj instanceof POGOProtos.Rpc.JPLIHBGMAOM)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JPLIHBGMAOM other = (POGOProtos.Rpc.JPLIHBGMAOM) obj;

    if (getNpolipkkfed()
        != other.getNpolipkkfed()) return false;
    if (getLdfafdmomff()
        != other.getLdfafdmomff()) return false;
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
    hash = (37 * hash) + NPOLIPKKFED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNpolipkkfed());
    hash = (37 * hash) + LDFAFDMOMFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLdfafdmomff());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JPLIHBGMAOM parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JPLIHBGMAOM prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.JPLIHBGMAOM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JPLIHBGMAOM)
      POGOProtos.Rpc.JPLIHBGMAOMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JPLIHBGMAOM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JPLIHBGMAOM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JPLIHBGMAOM.class, POGOProtos.Rpc.JPLIHBGMAOM.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JPLIHBGMAOM.newBuilder()
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
      npolipkkfed_ = false;

      ldfafdmomff_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_JPLIHBGMAOM_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPLIHBGMAOM getDefaultInstanceForType() {
      return POGOProtos.Rpc.JPLIHBGMAOM.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPLIHBGMAOM build() {
      POGOProtos.Rpc.JPLIHBGMAOM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JPLIHBGMAOM buildPartial() {
      POGOProtos.Rpc.JPLIHBGMAOM result = new POGOProtos.Rpc.JPLIHBGMAOM(this);
      result.npolipkkfed_ = npolipkkfed_;
      result.ldfafdmomff_ = ldfafdmomff_;
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
      if (other instanceof POGOProtos.Rpc.JPLIHBGMAOM) {
        return mergeFrom((POGOProtos.Rpc.JPLIHBGMAOM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JPLIHBGMAOM other) {
      if (other == POGOProtos.Rpc.JPLIHBGMAOM.getDefaultInstance()) return this;
      if (other.getNpolipkkfed() != false) {
        setNpolipkkfed(other.getNpolipkkfed());
      }
      if (other.getLdfafdmomff() != false) {
        setLdfafdmomff(other.getLdfafdmomff());
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
      POGOProtos.Rpc.JPLIHBGMAOM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JPLIHBGMAOM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean npolipkkfed_ ;
    /**
     * <code>bool npolipkkfed = 1;</code>
     * @return The npolipkkfed.
     */
    public boolean getNpolipkkfed() {
      return npolipkkfed_;
    }
    /**
     * <code>bool npolipkkfed = 1;</code>
     * @param value The npolipkkfed to set.
     * @return This builder for chaining.
     */
    public Builder setNpolipkkfed(boolean value) {
      
      npolipkkfed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool npolipkkfed = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNpolipkkfed() {
      
      npolipkkfed_ = false;
      onChanged();
      return this;
    }

    private boolean ldfafdmomff_ ;
    /**
     * <code>bool ldfafdmomff = 2;</code>
     * @return The ldfafdmomff.
     */
    public boolean getLdfafdmomff() {
      return ldfafdmomff_;
    }
    /**
     * <code>bool ldfafdmomff = 2;</code>
     * @param value The ldfafdmomff to set.
     * @return This builder for chaining.
     */
    public Builder setLdfafdmomff(boolean value) {
      
      ldfafdmomff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ldfafdmomff = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLdfafdmomff() {
      
      ldfafdmomff_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JPLIHBGMAOM)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JPLIHBGMAOM)
  private static final POGOProtos.Rpc.JPLIHBGMAOM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JPLIHBGMAOM();
  }

  public static POGOProtos.Rpc.JPLIHBGMAOM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JPLIHBGMAOM>
      PARSER = new com.google.protobuf.AbstractParser<JPLIHBGMAOM>() {
    @java.lang.Override
    public JPLIHBGMAOM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JPLIHBGMAOM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JPLIHBGMAOM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JPLIHBGMAOM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JPLIHBGMAOM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

