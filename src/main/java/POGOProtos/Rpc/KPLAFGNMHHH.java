// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KPLAFGNMHHH
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.KPLAFGNMHHH}
 */
public final class KPLAFGNMHHH extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.KPLAFGNMHHH)
    KPLAFGNMHHHOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KPLAFGNMHHH.newBuilder() to construct.
  private KPLAFGNMHHH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KPLAFGNMHHH() {
    ekpohjfklal_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KPLAFGNMHHH();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KPLAFGNMHHH(
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

            ekpohjfklal_ = rawValue;
            break;
          }
          case 16: {

            mhpodigefok_ = input.readInt32();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLAFGNMHHH_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLAFGNMHHH_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.KPLAFGNMHHH.class, POGOProtos.Rpc.KPLAFGNMHHH.Builder.class);
  }

  public static final int EKPOHJFKLAL_FIELD_NUMBER = 1;
  private int ekpohjfklal_;
  /**
   * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
   * @return The enum numeric value on the wire for ekpohjfklal.
   */
  @java.lang.Override public int getEkpohjfklalValue() {
    return ekpohjfklal_;
  }
  /**
   * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
   * @return The ekpohjfklal.
   */
  @java.lang.Override public POGOProtos.Rpc.Item getEkpohjfklal() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(ekpohjfklal_);
    return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
  }

  public static final int MHPODIGEFOK_FIELD_NUMBER = 2;
  private int mhpodigefok_;
  /**
   * <code>int32 mhpodigefok = 2;</code>
   * @return The mhpodigefok.
   */
  @java.lang.Override
  public int getMhpodigefok() {
    return mhpodigefok_;
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
    if (ekpohjfklal_ != POGOProtos.Rpc.Item.UNKNOWN.getNumber()) {
      output.writeEnum(1, ekpohjfklal_);
    }
    if (mhpodigefok_ != 0) {
      output.writeInt32(2, mhpodigefok_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ekpohjfklal_ != POGOProtos.Rpc.Item.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ekpohjfklal_);
    }
    if (mhpodigefok_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, mhpodigefok_);
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
    if (!(obj instanceof POGOProtos.Rpc.KPLAFGNMHHH)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.KPLAFGNMHHH other = (POGOProtos.Rpc.KPLAFGNMHHH) obj;

    if (ekpohjfklal_ != other.ekpohjfklal_) return false;
    if (getMhpodigefok()
        != other.getMhpodigefok()) return false;
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
    hash = (37 * hash) + EKPOHJFKLAL_FIELD_NUMBER;
    hash = (53 * hash) + ekpohjfklal_;
    hash = (37 * hash) + MHPODIGEFOK_FIELD_NUMBER;
    hash = (53 * hash) + getMhpodigefok();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.KPLAFGNMHHH parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.KPLAFGNMHHH prototype) {
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
   * ref: KPLAFGNMHHH
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.KPLAFGNMHHH}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.KPLAFGNMHHH)
      POGOProtos.Rpc.KPLAFGNMHHHOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLAFGNMHHH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLAFGNMHHH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.KPLAFGNMHHH.class, POGOProtos.Rpc.KPLAFGNMHHH.Builder.class);
    }

    // Construct using POGOProtos.Rpc.KPLAFGNMHHH.newBuilder()
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
      ekpohjfklal_ = 0;

      mhpodigefok_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_KPLAFGNMHHH_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLAFGNMHHH getDefaultInstanceForType() {
      return POGOProtos.Rpc.KPLAFGNMHHH.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLAFGNMHHH build() {
      POGOProtos.Rpc.KPLAFGNMHHH result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.KPLAFGNMHHH buildPartial() {
      POGOProtos.Rpc.KPLAFGNMHHH result = new POGOProtos.Rpc.KPLAFGNMHHH(this);
      result.ekpohjfklal_ = ekpohjfklal_;
      result.mhpodigefok_ = mhpodigefok_;
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
      if (other instanceof POGOProtos.Rpc.KPLAFGNMHHH) {
        return mergeFrom((POGOProtos.Rpc.KPLAFGNMHHH)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.KPLAFGNMHHH other) {
      if (other == POGOProtos.Rpc.KPLAFGNMHHH.getDefaultInstance()) return this;
      if (other.ekpohjfklal_ != 0) {
        setEkpohjfklalValue(other.getEkpohjfklalValue());
      }
      if (other.getMhpodigefok() != 0) {
        setMhpodigefok(other.getMhpodigefok());
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
      POGOProtos.Rpc.KPLAFGNMHHH parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.KPLAFGNMHHH) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ekpohjfklal_ = 0;
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
     * @return The enum numeric value on the wire for ekpohjfklal.
     */
    @java.lang.Override public int getEkpohjfklalValue() {
      return ekpohjfklal_;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
     * @param value The enum numeric value on the wire for ekpohjfklal to set.
     * @return This builder for chaining.
     */
    public Builder setEkpohjfklalValue(int value) {
      
      ekpohjfklal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
     * @return The ekpohjfklal.
     */
    @java.lang.Override
    public POGOProtos.Rpc.Item getEkpohjfklal() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.Item result = POGOProtos.Rpc.Item.valueOf(ekpohjfklal_);
      return result == null ? POGOProtos.Rpc.Item.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
     * @param value The ekpohjfklal to set.
     * @return This builder for chaining.
     */
    public Builder setEkpohjfklal(POGOProtos.Rpc.Item value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ekpohjfklal_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.Item ekpohjfklal = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEkpohjfklal() {
      
      ekpohjfklal_ = 0;
      onChanged();
      return this;
    }

    private int mhpodigefok_ ;
    /**
     * <code>int32 mhpodigefok = 2;</code>
     * @return The mhpodigefok.
     */
    @java.lang.Override
    public int getMhpodigefok() {
      return mhpodigefok_;
    }
    /**
     * <code>int32 mhpodigefok = 2;</code>
     * @param value The mhpodigefok to set.
     * @return This builder for chaining.
     */
    public Builder setMhpodigefok(int value) {
      
      mhpodigefok_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mhpodigefok = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhpodigefok() {
      
      mhpodigefok_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.KPLAFGNMHHH)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.KPLAFGNMHHH)
  private static final POGOProtos.Rpc.KPLAFGNMHHH DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.KPLAFGNMHHH();
  }

  public static POGOProtos.Rpc.KPLAFGNMHHH getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KPLAFGNMHHH>
      PARSER = new com.google.protobuf.AbstractParser<KPLAFGNMHHH>() {
    @java.lang.Override
    public KPLAFGNMHHH parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KPLAFGNMHHH(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KPLAFGNMHHH> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KPLAFGNMHHH> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.KPLAFGNMHHH getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
