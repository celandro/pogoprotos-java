// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IDGMJDDJODP}
 */
public  final class IDGMJDDJODP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IDGMJDDJODP)
    IDGMJDDJODPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IDGMJDDJODP.newBuilder() to construct.
  private IDGMJDDJODP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IDGMJDDJODP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IDGMJDDJODP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IDGMJDDJODP(
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

            pehcniodkki_ = input.readBool();
            break;
          }
          case 16: {

            dghfmkncfdj_ = input.readUInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IDGMJDDJODP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IDGMJDDJODP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IDGMJDDJODP.class, POGOProtos.Rpc.IDGMJDDJODP.Builder.class);
  }

  public static final int PEHCNIODKKI_FIELD_NUMBER = 1;
  private boolean pehcniodkki_;
  /**
   * <code>bool pehcniodkki = 1;</code>
   * @return The pehcniodkki.
   */
  public boolean getPehcniodkki() {
    return pehcniodkki_;
  }

  public static final int DGHFMKNCFDJ_FIELD_NUMBER = 2;
  private int dghfmkncfdj_;
  /**
   * <code>uint32 dghfmkncfdj = 2;</code>
   * @return The dghfmkncfdj.
   */
  public int getDghfmkncfdj() {
    return dghfmkncfdj_;
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
    if (pehcniodkki_ != false) {
      output.writeBool(1, pehcniodkki_);
    }
    if (dghfmkncfdj_ != 0) {
      output.writeUInt32(2, dghfmkncfdj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pehcniodkki_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, pehcniodkki_);
    }
    if (dghfmkncfdj_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, dghfmkncfdj_);
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
    if (!(obj instanceof POGOProtos.Rpc.IDGMJDDJODP)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IDGMJDDJODP other = (POGOProtos.Rpc.IDGMJDDJODP) obj;

    if (getPehcniodkki()
        != other.getPehcniodkki()) return false;
    if (getDghfmkncfdj()
        != other.getDghfmkncfdj()) return false;
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
    hash = (37 * hash) + PEHCNIODKKI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPehcniodkki());
    hash = (37 * hash) + DGHFMKNCFDJ_FIELD_NUMBER;
    hash = (53 * hash) + getDghfmkncfdj();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IDGMJDDJODP parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IDGMJDDJODP prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IDGMJDDJODP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IDGMJDDJODP)
      POGOProtos.Rpc.IDGMJDDJODPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IDGMJDDJODP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IDGMJDDJODP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IDGMJDDJODP.class, POGOProtos.Rpc.IDGMJDDJODP.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IDGMJDDJODP.newBuilder()
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
      pehcniodkki_ = false;

      dghfmkncfdj_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IDGMJDDJODP_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDGMJDDJODP getDefaultInstanceForType() {
      return POGOProtos.Rpc.IDGMJDDJODP.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDGMJDDJODP build() {
      POGOProtos.Rpc.IDGMJDDJODP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IDGMJDDJODP buildPartial() {
      POGOProtos.Rpc.IDGMJDDJODP result = new POGOProtos.Rpc.IDGMJDDJODP(this);
      result.pehcniodkki_ = pehcniodkki_;
      result.dghfmkncfdj_ = dghfmkncfdj_;
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
      if (other instanceof POGOProtos.Rpc.IDGMJDDJODP) {
        return mergeFrom((POGOProtos.Rpc.IDGMJDDJODP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IDGMJDDJODP other) {
      if (other == POGOProtos.Rpc.IDGMJDDJODP.getDefaultInstance()) return this;
      if (other.getPehcniodkki() != false) {
        setPehcniodkki(other.getPehcniodkki());
      }
      if (other.getDghfmkncfdj() != 0) {
        setDghfmkncfdj(other.getDghfmkncfdj());
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
      POGOProtos.Rpc.IDGMJDDJODP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IDGMJDDJODP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean pehcniodkki_ ;
    /**
     * <code>bool pehcniodkki = 1;</code>
     * @return The pehcniodkki.
     */
    public boolean getPehcniodkki() {
      return pehcniodkki_;
    }
    /**
     * <code>bool pehcniodkki = 1;</code>
     * @param value The pehcniodkki to set.
     * @return This builder for chaining.
     */
    public Builder setPehcniodkki(boolean value) {
      
      pehcniodkki_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pehcniodkki = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPehcniodkki() {
      
      pehcniodkki_ = false;
      onChanged();
      return this;
    }

    private int dghfmkncfdj_ ;
    /**
     * <code>uint32 dghfmkncfdj = 2;</code>
     * @return The dghfmkncfdj.
     */
    public int getDghfmkncfdj() {
      return dghfmkncfdj_;
    }
    /**
     * <code>uint32 dghfmkncfdj = 2;</code>
     * @param value The dghfmkncfdj to set.
     * @return This builder for chaining.
     */
    public Builder setDghfmkncfdj(int value) {
      
      dghfmkncfdj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 dghfmkncfdj = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDghfmkncfdj() {
      
      dghfmkncfdj_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IDGMJDDJODP)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IDGMJDDJODP)
  private static final POGOProtos.Rpc.IDGMJDDJODP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IDGMJDDJODP();
  }

  public static POGOProtos.Rpc.IDGMJDDJODP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IDGMJDDJODP>
      PARSER = new com.google.protobuf.AbstractParser<IDGMJDDJODP>() {
    @java.lang.Override
    public IDGMJDDJODP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IDGMJDDJODP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IDGMJDDJODP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IDGMJDDJODP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IDGMJDDJODP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

