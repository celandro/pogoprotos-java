// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.APFFDOBEJLA}
 */
public  final class APFFDOBEJLA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.APFFDOBEJLA)
    APFFDOBEJLAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use APFFDOBEJLA.newBuilder() to construct.
  private APFFDOBEJLA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private APFFDOBEJLA() {
    ohgokefopnk_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new APFFDOBEJLA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private APFFDOBEJLA(
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

            ohgokefopnk_ = rawValue;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_APFFDOBEJLA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_APFFDOBEJLA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.APFFDOBEJLA.class, POGOProtos.Rpc.APFFDOBEJLA.Builder.class);
  }

  public static final int OHGOKEFOPNK_FIELD_NUMBER = 1;
  private int ohgokefopnk_;
  /**
   * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
   * @return The enum numeric value on the wire for ohgokefopnk.
   */
  public int getOhgokefopnkValue() {
    return ohgokefopnk_;
  }
  /**
   * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
   * @return The ohgokefopnk.
   */
  public POGOProtos.Rpc.FANCKOEPIMD getOhgokefopnk() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.FANCKOEPIMD result = POGOProtos.Rpc.FANCKOEPIMD.valueOf(ohgokefopnk_);
    return result == null ? POGOProtos.Rpc.FANCKOEPIMD.UNRECOGNIZED : result;
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
    if (ohgokefopnk_ != POGOProtos.Rpc.FANCKOEPIMD.FANCKOEPIMD_UNDEFINED_PROFILE_PAGE.getNumber()) {
      output.writeEnum(1, ohgokefopnk_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ohgokefopnk_ != POGOProtos.Rpc.FANCKOEPIMD.FANCKOEPIMD_UNDEFINED_PROFILE_PAGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ohgokefopnk_);
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
    if (!(obj instanceof POGOProtos.Rpc.APFFDOBEJLA)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.APFFDOBEJLA other = (POGOProtos.Rpc.APFFDOBEJLA) obj;

    if (ohgokefopnk_ != other.ohgokefopnk_) return false;
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
    hash = (37 * hash) + OHGOKEFOPNK_FIELD_NUMBER;
    hash = (53 * hash) + ohgokefopnk_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.APFFDOBEJLA parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.APFFDOBEJLA prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.APFFDOBEJLA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.APFFDOBEJLA)
      POGOProtos.Rpc.APFFDOBEJLAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_APFFDOBEJLA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_APFFDOBEJLA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.APFFDOBEJLA.class, POGOProtos.Rpc.APFFDOBEJLA.Builder.class);
    }

    // Construct using POGOProtos.Rpc.APFFDOBEJLA.newBuilder()
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
      ohgokefopnk_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_APFFDOBEJLA_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.APFFDOBEJLA getDefaultInstanceForType() {
      return POGOProtos.Rpc.APFFDOBEJLA.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.APFFDOBEJLA build() {
      POGOProtos.Rpc.APFFDOBEJLA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.APFFDOBEJLA buildPartial() {
      POGOProtos.Rpc.APFFDOBEJLA result = new POGOProtos.Rpc.APFFDOBEJLA(this);
      result.ohgokefopnk_ = ohgokefopnk_;
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
      if (other instanceof POGOProtos.Rpc.APFFDOBEJLA) {
        return mergeFrom((POGOProtos.Rpc.APFFDOBEJLA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.APFFDOBEJLA other) {
      if (other == POGOProtos.Rpc.APFFDOBEJLA.getDefaultInstance()) return this;
      if (other.ohgokefopnk_ != 0) {
        setOhgokefopnkValue(other.getOhgokefopnkValue());
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
      POGOProtos.Rpc.APFFDOBEJLA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.APFFDOBEJLA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ohgokefopnk_ = 0;
    /**
     * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
     * @return The enum numeric value on the wire for ohgokefopnk.
     */
    public int getOhgokefopnkValue() {
      return ohgokefopnk_;
    }
    /**
     * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
     * @param value The enum numeric value on the wire for ohgokefopnk to set.
     * @return This builder for chaining.
     */
    public Builder setOhgokefopnkValue(int value) {
      ohgokefopnk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
     * @return The ohgokefopnk.
     */
    public POGOProtos.Rpc.FANCKOEPIMD getOhgokefopnk() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.FANCKOEPIMD result = POGOProtos.Rpc.FANCKOEPIMD.valueOf(ohgokefopnk_);
      return result == null ? POGOProtos.Rpc.FANCKOEPIMD.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
     * @param value The ohgokefopnk to set.
     * @return This builder for chaining.
     */
    public Builder setOhgokefopnk(POGOProtos.Rpc.FANCKOEPIMD value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ohgokefopnk_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.FANCKOEPIMD ohgokefopnk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOhgokefopnk() {
      
      ohgokefopnk_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.APFFDOBEJLA)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.APFFDOBEJLA)
  private static final POGOProtos.Rpc.APFFDOBEJLA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.APFFDOBEJLA();
  }

  public static POGOProtos.Rpc.APFFDOBEJLA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<APFFDOBEJLA>
      PARSER = new com.google.protobuf.AbstractParser<APFFDOBEJLA>() {
    @java.lang.Override
    public APFFDOBEJLA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new APFFDOBEJLA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<APFFDOBEJLA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<APFFDOBEJLA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.APFFDOBEJLA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

