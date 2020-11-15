// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.IncenseEncounterProto}
 */
public final class IncenseEncounterProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.IncenseEncounterProto)
    IncenseEncounterProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IncenseEncounterProto.newBuilder() to construct.
  private IncenseEncounterProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IncenseEncounterProto() {
    encounterLocation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IncenseEncounterProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IncenseEncounterProto(
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

            encounterId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            encounterLocation_ = s;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IncenseEncounterProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IncenseEncounterProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.IncenseEncounterProto.class, POGOProtos.Rpc.IncenseEncounterProto.Builder.class);
  }

  public static final int ENCOUNTER_ID_FIELD_NUMBER = 1;
  private long encounterId_;
  /**
   * <code>int64 encounter_id = 1;</code>
   * @return The encounterId.
   */
  @java.lang.Override
  public long getEncounterId() {
    return encounterId_;
  }

  public static final int ENCOUNTER_LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object encounterLocation_;
  /**
   * <code>string encounter_location = 2;</code>
   * @return The encounterLocation.
   */
  @java.lang.Override
  public java.lang.String getEncounterLocation() {
    java.lang.Object ref = encounterLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encounterLocation_ = s;
      return s;
    }
  }
  /**
   * <code>string encounter_location = 2;</code>
   * @return The bytes for encounterLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEncounterLocationBytes() {
    java.lang.Object ref = encounterLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      encounterLocation_ = b;
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
    if (encounterId_ != 0L) {
      output.writeInt64(1, encounterId_);
    }
    if (!getEncounterLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, encounterLocation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encounterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, encounterId_);
    }
    if (!getEncounterLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, encounterLocation_);
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
    if (!(obj instanceof POGOProtos.Rpc.IncenseEncounterProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.IncenseEncounterProto other = (POGOProtos.Rpc.IncenseEncounterProto) obj;

    if (getEncounterId()
        != other.getEncounterId()) return false;
    if (!getEncounterLocation()
        .equals(other.getEncounterLocation())) return false;
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
    hash = (37 * hash) + ENCOUNTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEncounterId());
    hash = (37 * hash) + ENCOUNTER_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getEncounterLocation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.IncenseEncounterProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.IncenseEncounterProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.IncenseEncounterProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.IncenseEncounterProto)
      POGOProtos.Rpc.IncenseEncounterProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IncenseEncounterProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IncenseEncounterProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.IncenseEncounterProto.class, POGOProtos.Rpc.IncenseEncounterProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.IncenseEncounterProto.newBuilder()
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
      encounterId_ = 0L;

      encounterLocation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_IncenseEncounterProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IncenseEncounterProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.IncenseEncounterProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.IncenseEncounterProto build() {
      POGOProtos.Rpc.IncenseEncounterProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.IncenseEncounterProto buildPartial() {
      POGOProtos.Rpc.IncenseEncounterProto result = new POGOProtos.Rpc.IncenseEncounterProto(this);
      result.encounterId_ = encounterId_;
      result.encounterLocation_ = encounterLocation_;
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
      if (other instanceof POGOProtos.Rpc.IncenseEncounterProto) {
        return mergeFrom((POGOProtos.Rpc.IncenseEncounterProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.IncenseEncounterProto other) {
      if (other == POGOProtos.Rpc.IncenseEncounterProto.getDefaultInstance()) return this;
      if (other.getEncounterId() != 0L) {
        setEncounterId(other.getEncounterId());
      }
      if (!other.getEncounterLocation().isEmpty()) {
        encounterLocation_ = other.encounterLocation_;
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
      POGOProtos.Rpc.IncenseEncounterProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.IncenseEncounterProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long encounterId_ ;
    /**
     * <code>int64 encounter_id = 1;</code>
     * @return The encounterId.
     */
    @java.lang.Override
    public long getEncounterId() {
      return encounterId_;
    }
    /**
     * <code>int64 encounter_id = 1;</code>
     * @param value The encounterId to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterId(long value) {
      
      encounterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 encounter_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterId() {
      
      encounterId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object encounterLocation_ = "";
    /**
     * <code>string encounter_location = 2;</code>
     * @return The encounterLocation.
     */
    public java.lang.String getEncounterLocation() {
      java.lang.Object ref = encounterLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encounterLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string encounter_location = 2;</code>
     * @return The bytes for encounterLocation.
     */
    public com.google.protobuf.ByteString
        getEncounterLocationBytes() {
      java.lang.Object ref = encounterLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        encounterLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string encounter_location = 2;</code>
     * @param value The encounterLocation to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      encounterLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string encounter_location = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEncounterLocation() {
      
      encounterLocation_ = getDefaultInstance().getEncounterLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string encounter_location = 2;</code>
     * @param value The bytes for encounterLocation to set.
     * @return This builder for chaining.
     */
    public Builder setEncounterLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      encounterLocation_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.IncenseEncounterProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.IncenseEncounterProto)
  private static final POGOProtos.Rpc.IncenseEncounterProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.IncenseEncounterProto();
  }

  public static POGOProtos.Rpc.IncenseEncounterProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncenseEncounterProto>
      PARSER = new com.google.protobuf.AbstractParser<IncenseEncounterProto>() {
    @java.lang.Override
    public IncenseEncounterProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IncenseEncounterProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IncenseEncounterProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncenseEncounterProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.IncenseEncounterProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

