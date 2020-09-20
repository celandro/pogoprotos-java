// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KMFDPCNCONL
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.WithBuddyProto}
 */
public final class WithBuddyProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.WithBuddyProto)
    WithBuddyProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithBuddyProto.newBuilder() to construct.
  private WithBuddyProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithBuddyProto() {
    mnliiedpjon_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithBuddyProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithBuddyProto(
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

            mnliiedpjon_ = rawValue;
            break;
          }
          case 16: {

            feajmfjclje_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBuddyProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBuddyProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.WithBuddyProto.class, POGOProtos.Rpc.WithBuddyProto.Builder.class);
  }

  public static final int MNLIIEDPJON_FIELD_NUMBER = 1;
  private int mnliiedpjon_;
  /**
   * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
   * @return The enum numeric value on the wire for mnliiedpjon.
   */
  @java.lang.Override public int getMnliiedpjonValue() {
    return mnliiedpjon_;
  }
  /**
   * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
   * @return The mnliiedpjon.
   */
  @java.lang.Override public POGOProtos.Rpc.BuddyLevel getMnliiedpjon() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.BuddyLevel result = POGOProtos.Rpc.BuddyLevel.valueOf(mnliiedpjon_);
    return result == null ? POGOProtos.Rpc.BuddyLevel.UNRECOGNIZED : result;
  }

  public static final int FEAJMFJCLJE_FIELD_NUMBER = 2;
  private boolean feajmfjclje_;
  /**
   * <code>bool feajmfjclje = 2;</code>
   * @return The feajmfjclje.
   */
  @java.lang.Override
  public boolean getFeajmfjclje() {
    return feajmfjclje_;
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
    if (mnliiedpjon_ != POGOProtos.Rpc.BuddyLevel.BUDDY_LEVEL_BUDDY_LEVEL_UNSET.getNumber()) {
      output.writeEnum(1, mnliiedpjon_);
    }
    if (feajmfjclje_ != false) {
      output.writeBool(2, feajmfjclje_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mnliiedpjon_ != POGOProtos.Rpc.BuddyLevel.BUDDY_LEVEL_BUDDY_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mnliiedpjon_);
    }
    if (feajmfjclje_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, feajmfjclje_);
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
    if (!(obj instanceof POGOProtos.Rpc.WithBuddyProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.WithBuddyProto other = (POGOProtos.Rpc.WithBuddyProto) obj;

    if (mnliiedpjon_ != other.mnliiedpjon_) return false;
    if (getFeajmfjclje()
        != other.getFeajmfjclje()) return false;
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
    hash = (37 * hash) + MNLIIEDPJON_FIELD_NUMBER;
    hash = (53 * hash) + mnliiedpjon_;
    hash = (37 * hash) + FEAJMFJCLJE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFeajmfjclje());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.WithBuddyProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.WithBuddyProto prototype) {
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
   * ref: KMFDPCNCONL
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.WithBuddyProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.WithBuddyProto)
      POGOProtos.Rpc.WithBuddyProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBuddyProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBuddyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.WithBuddyProto.class, POGOProtos.Rpc.WithBuddyProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.WithBuddyProto.newBuilder()
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
      mnliiedpjon_ = 0;

      feajmfjclje_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_WithBuddyProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithBuddyProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.WithBuddyProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithBuddyProto build() {
      POGOProtos.Rpc.WithBuddyProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.WithBuddyProto buildPartial() {
      POGOProtos.Rpc.WithBuddyProto result = new POGOProtos.Rpc.WithBuddyProto(this);
      result.mnliiedpjon_ = mnliiedpjon_;
      result.feajmfjclje_ = feajmfjclje_;
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
      if (other instanceof POGOProtos.Rpc.WithBuddyProto) {
        return mergeFrom((POGOProtos.Rpc.WithBuddyProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.WithBuddyProto other) {
      if (other == POGOProtos.Rpc.WithBuddyProto.getDefaultInstance()) return this;
      if (other.mnliiedpjon_ != 0) {
        setMnliiedpjonValue(other.getMnliiedpjonValue());
      }
      if (other.getFeajmfjclje() != false) {
        setFeajmfjclje(other.getFeajmfjclje());
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
      POGOProtos.Rpc.WithBuddyProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.WithBuddyProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int mnliiedpjon_ = 0;
    /**
     * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
     * @return The enum numeric value on the wire for mnliiedpjon.
     */
    @java.lang.Override public int getMnliiedpjonValue() {
      return mnliiedpjon_;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
     * @param value The enum numeric value on the wire for mnliiedpjon to set.
     * @return This builder for chaining.
     */
    public Builder setMnliiedpjonValue(int value) {
      
      mnliiedpjon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
     * @return The mnliiedpjon.
     */
    @java.lang.Override
    public POGOProtos.Rpc.BuddyLevel getMnliiedpjon() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.BuddyLevel result = POGOProtos.Rpc.BuddyLevel.valueOf(mnliiedpjon_);
      return result == null ? POGOProtos.Rpc.BuddyLevel.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
     * @param value The mnliiedpjon to set.
     * @return This builder for chaining.
     */
    public Builder setMnliiedpjon(POGOProtos.Rpc.BuddyLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mnliiedpjon_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.BuddyLevel mnliiedpjon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMnliiedpjon() {
      
      mnliiedpjon_ = 0;
      onChanged();
      return this;
    }

    private boolean feajmfjclje_ ;
    /**
     * <code>bool feajmfjclje = 2;</code>
     * @return The feajmfjclje.
     */
    @java.lang.Override
    public boolean getFeajmfjclje() {
      return feajmfjclje_;
    }
    /**
     * <code>bool feajmfjclje = 2;</code>
     * @param value The feajmfjclje to set.
     * @return This builder for chaining.
     */
    public Builder setFeajmfjclje(boolean value) {
      
      feajmfjclje_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool feajmfjclje = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeajmfjclje() {
      
      feajmfjclje_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.WithBuddyProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.WithBuddyProto)
  private static final POGOProtos.Rpc.WithBuddyProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.WithBuddyProto();
  }

  public static POGOProtos.Rpc.WithBuddyProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithBuddyProto>
      PARSER = new com.google.protobuf.AbstractParser<WithBuddyProto>() {
    @java.lang.Override
    public WithBuddyProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithBuddyProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithBuddyProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithBuddyProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.WithBuddyProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

