// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: KJGFFNLHCOB
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.CombatHubEntranceTelemetry}
 */
public final class CombatHubEntranceTelemetry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CombatHubEntranceTelemetry)
    CombatHubEntranceTelemetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatHubEntranceTelemetry.newBuilder() to construct.
  private CombatHubEntranceTelemetry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatHubEntranceTelemetry() {
    iakbebdcjpf_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatHubEntranceTelemetry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatHubEntranceTelemetry(
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

            iakbebdcjpf_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatHubEntranceTelemetry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatHubEntranceTelemetry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CombatHubEntranceTelemetry.class, POGOProtos.Rpc.CombatHubEntranceTelemetry.Builder.class);
  }

  public static final int IAKBEBDCJPF_FIELD_NUMBER = 1;
  private int iakbebdcjpf_;
  /**
   * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
   * @return The enum numeric value on the wire for iakbebdcjpf.
   */
  @java.lang.Override public int getIakbebdcjpfValue() {
    return iakbebdcjpf_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
   * @return The iakbebdcjpf.
   */
  @java.lang.Override public POGOProtos.Rpc.CombatHubEntranceTelemetryIds getIakbebdcjpf() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.CombatHubEntranceTelemetryIds result = POGOProtos.Rpc.CombatHubEntranceTelemetryIds.valueOf(iakbebdcjpf_);
    return result == null ? POGOProtos.Rpc.CombatHubEntranceTelemetryIds.UNRECOGNIZED : result;
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
    if (iakbebdcjpf_ != POGOProtos.Rpc.CombatHubEntranceTelemetryIds.COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT.getNumber()) {
      output.writeEnum(1, iakbebdcjpf_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iakbebdcjpf_ != POGOProtos.Rpc.CombatHubEntranceTelemetryIds.COMBAT_HUB_ENTRANCE_TELEMETRY_IDS_UNDEFINED_EVENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, iakbebdcjpf_);
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
    if (!(obj instanceof POGOProtos.Rpc.CombatHubEntranceTelemetry)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CombatHubEntranceTelemetry other = (POGOProtos.Rpc.CombatHubEntranceTelemetry) obj;

    if (iakbebdcjpf_ != other.iakbebdcjpf_) return false;
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
    hash = (37 * hash) + IAKBEBDCJPF_FIELD_NUMBER;
    hash = (53 * hash) + iakbebdcjpf_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CombatHubEntranceTelemetry parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CombatHubEntranceTelemetry prototype) {
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
   * ref: KJGFFNLHCOB
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.CombatHubEntranceTelemetry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CombatHubEntranceTelemetry)
      POGOProtos.Rpc.CombatHubEntranceTelemetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatHubEntranceTelemetry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatHubEntranceTelemetry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CombatHubEntranceTelemetry.class, POGOProtos.Rpc.CombatHubEntranceTelemetry.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CombatHubEntranceTelemetry.newBuilder()
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
      iakbebdcjpf_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_CombatHubEntranceTelemetry_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatHubEntranceTelemetry getDefaultInstanceForType() {
      return POGOProtos.Rpc.CombatHubEntranceTelemetry.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatHubEntranceTelemetry build() {
      POGOProtos.Rpc.CombatHubEntranceTelemetry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CombatHubEntranceTelemetry buildPartial() {
      POGOProtos.Rpc.CombatHubEntranceTelemetry result = new POGOProtos.Rpc.CombatHubEntranceTelemetry(this);
      result.iakbebdcjpf_ = iakbebdcjpf_;
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
      if (other instanceof POGOProtos.Rpc.CombatHubEntranceTelemetry) {
        return mergeFrom((POGOProtos.Rpc.CombatHubEntranceTelemetry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CombatHubEntranceTelemetry other) {
      if (other == POGOProtos.Rpc.CombatHubEntranceTelemetry.getDefaultInstance()) return this;
      if (other.iakbebdcjpf_ != 0) {
        setIakbebdcjpfValue(other.getIakbebdcjpfValue());
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
      POGOProtos.Rpc.CombatHubEntranceTelemetry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CombatHubEntranceTelemetry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int iakbebdcjpf_ = 0;
    /**
     * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
     * @return The enum numeric value on the wire for iakbebdcjpf.
     */
    @java.lang.Override public int getIakbebdcjpfValue() {
      return iakbebdcjpf_;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
     * @param value The enum numeric value on the wire for iakbebdcjpf to set.
     * @return This builder for chaining.
     */
    public Builder setIakbebdcjpfValue(int value) {
      
      iakbebdcjpf_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
     * @return The iakbebdcjpf.
     */
    @java.lang.Override
    public POGOProtos.Rpc.CombatHubEntranceTelemetryIds getIakbebdcjpf() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.CombatHubEntranceTelemetryIds result = POGOProtos.Rpc.CombatHubEntranceTelemetryIds.valueOf(iakbebdcjpf_);
      return result == null ? POGOProtos.Rpc.CombatHubEntranceTelemetryIds.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
     * @param value The iakbebdcjpf to set.
     * @return This builder for chaining.
     */
    public Builder setIakbebdcjpf(POGOProtos.Rpc.CombatHubEntranceTelemetryIds value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      iakbebdcjpf_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatHubEntranceTelemetryIds iakbebdcjpf = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIakbebdcjpf() {
      
      iakbebdcjpf_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CombatHubEntranceTelemetry)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CombatHubEntranceTelemetry)
  private static final POGOProtos.Rpc.CombatHubEntranceTelemetry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CombatHubEntranceTelemetry();
  }

  public static POGOProtos.Rpc.CombatHubEntranceTelemetry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatHubEntranceTelemetry>
      PARSER = new com.google.protobuf.AbstractParser<CombatHubEntranceTelemetry>() {
    @java.lang.Override
    public CombatHubEntranceTelemetry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatHubEntranceTelemetry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatHubEntranceTelemetry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatHubEntranceTelemetry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CombatHubEntranceTelemetry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

