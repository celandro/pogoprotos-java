// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PEKBNKCGMJO}
 */
public  final class PEKBNKCGMJO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PEKBNKCGMJO)
    PEKBNKCGMJOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PEKBNKCGMJO.newBuilder() to construct.
  private PEKBNKCGMJO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PEKBNKCGMJO() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PEKBNKCGMJO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PEKBNKCGMJO(
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

            nmdcjjidblo_ = input.readDouble();
            break;
          }
          case 17: {

            hlhhbcchajm_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEKBNKCGMJO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEKBNKCGMJO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PEKBNKCGMJO.class, POGOProtos.Rpc.PEKBNKCGMJO.Builder.class);
  }

  public static final int NMDCJJIDBLO_FIELD_NUMBER = 1;
  private double nmdcjjidblo_;
  /**
   * <code>double nmdcjjidblo = 1;</code>
   * @return The nmdcjjidblo.
   */
  public double getNmdcjjidblo() {
    return nmdcjjidblo_;
  }

  public static final int HLHHBCCHAJM_FIELD_NUMBER = 2;
  private double hlhhbcchajm_;
  /**
   * <code>double hlhhbcchajm = 2;</code>
   * @return The hlhhbcchajm.
   */
  public double getHlhhbcchajm() {
    return hlhhbcchajm_;
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
    if (nmdcjjidblo_ != 0D) {
      output.writeDouble(1, nmdcjjidblo_);
    }
    if (hlhhbcchajm_ != 0D) {
      output.writeDouble(2, hlhhbcchajm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nmdcjjidblo_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, nmdcjjidblo_);
    }
    if (hlhhbcchajm_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, hlhhbcchajm_);
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
    if (!(obj instanceof POGOProtos.Rpc.PEKBNKCGMJO)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PEKBNKCGMJO other = (POGOProtos.Rpc.PEKBNKCGMJO) obj;

    if (java.lang.Double.doubleToLongBits(getNmdcjjidblo())
        != java.lang.Double.doubleToLongBits(
            other.getNmdcjjidblo())) return false;
    if (java.lang.Double.doubleToLongBits(getHlhhbcchajm())
        != java.lang.Double.doubleToLongBits(
            other.getHlhhbcchajm())) return false;
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
    hash = (37 * hash) + NMDCJJIDBLO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNmdcjjidblo()));
    hash = (37 * hash) + HLHHBCCHAJM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHlhhbcchajm()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PEKBNKCGMJO parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PEKBNKCGMJO prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PEKBNKCGMJO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PEKBNKCGMJO)
      POGOProtos.Rpc.PEKBNKCGMJOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEKBNKCGMJO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEKBNKCGMJO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PEKBNKCGMJO.class, POGOProtos.Rpc.PEKBNKCGMJO.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PEKBNKCGMJO.newBuilder()
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
      nmdcjjidblo_ = 0D;

      hlhhbcchajm_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PEKBNKCGMJO_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEKBNKCGMJO getDefaultInstanceForType() {
      return POGOProtos.Rpc.PEKBNKCGMJO.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEKBNKCGMJO build() {
      POGOProtos.Rpc.PEKBNKCGMJO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PEKBNKCGMJO buildPartial() {
      POGOProtos.Rpc.PEKBNKCGMJO result = new POGOProtos.Rpc.PEKBNKCGMJO(this);
      result.nmdcjjidblo_ = nmdcjjidblo_;
      result.hlhhbcchajm_ = hlhhbcchajm_;
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
      if (other instanceof POGOProtos.Rpc.PEKBNKCGMJO) {
        return mergeFrom((POGOProtos.Rpc.PEKBNKCGMJO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PEKBNKCGMJO other) {
      if (other == POGOProtos.Rpc.PEKBNKCGMJO.getDefaultInstance()) return this;
      if (other.getNmdcjjidblo() != 0D) {
        setNmdcjjidblo(other.getNmdcjjidblo());
      }
      if (other.getHlhhbcchajm() != 0D) {
        setHlhhbcchajm(other.getHlhhbcchajm());
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
      POGOProtos.Rpc.PEKBNKCGMJO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PEKBNKCGMJO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double nmdcjjidblo_ ;
    /**
     * <code>double nmdcjjidblo = 1;</code>
     * @return The nmdcjjidblo.
     */
    public double getNmdcjjidblo() {
      return nmdcjjidblo_;
    }
    /**
     * <code>double nmdcjjidblo = 1;</code>
     * @param value The nmdcjjidblo to set.
     * @return This builder for chaining.
     */
    public Builder setNmdcjjidblo(double value) {
      
      nmdcjjidblo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double nmdcjjidblo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNmdcjjidblo() {
      
      nmdcjjidblo_ = 0D;
      onChanged();
      return this;
    }

    private double hlhhbcchajm_ ;
    /**
     * <code>double hlhhbcchajm = 2;</code>
     * @return The hlhhbcchajm.
     */
    public double getHlhhbcchajm() {
      return hlhhbcchajm_;
    }
    /**
     * <code>double hlhhbcchajm = 2;</code>
     * @param value The hlhhbcchajm to set.
     * @return This builder for chaining.
     */
    public Builder setHlhhbcchajm(double value) {
      
      hlhhbcchajm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double hlhhbcchajm = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHlhhbcchajm() {
      
      hlhhbcchajm_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PEKBNKCGMJO)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PEKBNKCGMJO)
  private static final POGOProtos.Rpc.PEKBNKCGMJO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PEKBNKCGMJO();
  }

  public static POGOProtos.Rpc.PEKBNKCGMJO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PEKBNKCGMJO>
      PARSER = new com.google.protobuf.AbstractParser<PEKBNKCGMJO>() {
    @java.lang.Override
    public PEKBNKCGMJO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PEKBNKCGMJO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PEKBNKCGMJO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PEKBNKCGMJO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PEKBNKCGMJO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

