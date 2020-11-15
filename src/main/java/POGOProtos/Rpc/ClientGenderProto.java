// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ClientGenderProto}
 */
public final class ClientGenderProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClientGenderProto)
    ClientGenderProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientGenderProto.newBuilder() to construct.
  private ClientGenderProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientGenderProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientGenderProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientGenderProto(
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
          case 13: {

            malePercent_ = input.readFloat();
            break;
          }
          case 21: {

            femalePercent_ = input.readFloat();
            break;
          }
          case 29: {

            genderlessPercent_ = input.readFloat();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClientGenderProto.class, POGOProtos.Rpc.ClientGenderProto.Builder.class);
  }

  public static final int MALE_PERCENT_FIELD_NUMBER = 1;
  private float malePercent_;
  /**
   * <code>float male_percent = 1;</code>
   * @return The malePercent.
   */
  @java.lang.Override
  public float getMalePercent() {
    return malePercent_;
  }

  public static final int FEMALE_PERCENT_FIELD_NUMBER = 2;
  private float femalePercent_;
  /**
   * <code>float female_percent = 2;</code>
   * @return The femalePercent.
   */
  @java.lang.Override
  public float getFemalePercent() {
    return femalePercent_;
  }

  public static final int GENDERLESS_PERCENT_FIELD_NUMBER = 3;
  private float genderlessPercent_;
  /**
   * <code>float genderless_percent = 3;</code>
   * @return The genderlessPercent.
   */
  @java.lang.Override
  public float getGenderlessPercent() {
    return genderlessPercent_;
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
    if (malePercent_ != 0F) {
      output.writeFloat(1, malePercent_);
    }
    if (femalePercent_ != 0F) {
      output.writeFloat(2, femalePercent_);
    }
    if (genderlessPercent_ != 0F) {
      output.writeFloat(3, genderlessPercent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (malePercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, malePercent_);
    }
    if (femalePercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, femalePercent_);
    }
    if (genderlessPercent_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, genderlessPercent_);
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
    if (!(obj instanceof POGOProtos.Rpc.ClientGenderProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClientGenderProto other = (POGOProtos.Rpc.ClientGenderProto) obj;

    if (java.lang.Float.floatToIntBits(getMalePercent())
        != java.lang.Float.floatToIntBits(
            other.getMalePercent())) return false;
    if (java.lang.Float.floatToIntBits(getFemalePercent())
        != java.lang.Float.floatToIntBits(
            other.getFemalePercent())) return false;
    if (java.lang.Float.floatToIntBits(getGenderlessPercent())
        != java.lang.Float.floatToIntBits(
            other.getGenderlessPercent())) return false;
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
    hash = (37 * hash) + MALE_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMalePercent());
    hash = (37 * hash) + FEMALE_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFemalePercent());
    hash = (37 * hash) + GENDERLESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGenderlessPercent());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientGenderProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClientGenderProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ClientGenderProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClientGenderProto)
      POGOProtos.Rpc.ClientGenderProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClientGenderProto.class, POGOProtos.Rpc.ClientGenderProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClientGenderProto.newBuilder()
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
      malePercent_ = 0F;

      femalePercent_ = 0F;

      genderlessPercent_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientGenderProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientGenderProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClientGenderProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientGenderProto build() {
      POGOProtos.Rpc.ClientGenderProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientGenderProto buildPartial() {
      POGOProtos.Rpc.ClientGenderProto result = new POGOProtos.Rpc.ClientGenderProto(this);
      result.malePercent_ = malePercent_;
      result.femalePercent_ = femalePercent_;
      result.genderlessPercent_ = genderlessPercent_;
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
      if (other instanceof POGOProtos.Rpc.ClientGenderProto) {
        return mergeFrom((POGOProtos.Rpc.ClientGenderProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClientGenderProto other) {
      if (other == POGOProtos.Rpc.ClientGenderProto.getDefaultInstance()) return this;
      if (other.getMalePercent() != 0F) {
        setMalePercent(other.getMalePercent());
      }
      if (other.getFemalePercent() != 0F) {
        setFemalePercent(other.getFemalePercent());
      }
      if (other.getGenderlessPercent() != 0F) {
        setGenderlessPercent(other.getGenderlessPercent());
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
      POGOProtos.Rpc.ClientGenderProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClientGenderProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float malePercent_ ;
    /**
     * <code>float male_percent = 1;</code>
     * @return The malePercent.
     */
    @java.lang.Override
    public float getMalePercent() {
      return malePercent_;
    }
    /**
     * <code>float male_percent = 1;</code>
     * @param value The malePercent to set.
     * @return This builder for chaining.
     */
    public Builder setMalePercent(float value) {
      
      malePercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float male_percent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMalePercent() {
      
      malePercent_ = 0F;
      onChanged();
      return this;
    }

    private float femalePercent_ ;
    /**
     * <code>float female_percent = 2;</code>
     * @return The femalePercent.
     */
    @java.lang.Override
    public float getFemalePercent() {
      return femalePercent_;
    }
    /**
     * <code>float female_percent = 2;</code>
     * @param value The femalePercent to set.
     * @return This builder for chaining.
     */
    public Builder setFemalePercent(float value) {
      
      femalePercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float female_percent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFemalePercent() {
      
      femalePercent_ = 0F;
      onChanged();
      return this;
    }

    private float genderlessPercent_ ;
    /**
     * <code>float genderless_percent = 3;</code>
     * @return The genderlessPercent.
     */
    @java.lang.Override
    public float getGenderlessPercent() {
      return genderlessPercent_;
    }
    /**
     * <code>float genderless_percent = 3;</code>
     * @param value The genderlessPercent to set.
     * @return This builder for chaining.
     */
    public Builder setGenderlessPercent(float value) {
      
      genderlessPercent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float genderless_percent = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenderlessPercent() {
      
      genderlessPercent_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClientGenderProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClientGenderProto)
  private static final POGOProtos.Rpc.ClientGenderProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClientGenderProto();
  }

  public static POGOProtos.Rpc.ClientGenderProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientGenderProto>
      PARSER = new com.google.protobuf.AbstractParser<ClientGenderProto>() {
    @java.lang.Override
    public ClientGenderProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientGenderProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientGenderProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientGenderProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClientGenderProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

