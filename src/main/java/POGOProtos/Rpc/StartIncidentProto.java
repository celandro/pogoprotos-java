// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.StartIncidentProto}
 */
public final class StartIncidentProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.StartIncidentProto)
    StartIncidentProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartIncidentProto.newBuilder() to construct.
  private StartIncidentProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartIncidentProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartIncidentProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StartIncidentProto(
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
            POGOProtos.Rpc.IncidentLookupProto.Builder subBuilder = null;
            if (incidentLookup_ != null) {
              subBuilder = incidentLookup_.toBuilder();
            }
            incidentLookup_ = input.readMessage(POGOProtos.Rpc.IncidentLookupProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(incidentLookup_);
              incidentLookup_ = subBuilder.buildPartial();
            }

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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StartIncidentProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StartIncidentProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.StartIncidentProto.class, POGOProtos.Rpc.StartIncidentProto.Builder.class);
  }

  public static final int INCIDENT_LOOKUP_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.IncidentLookupProto incidentLookup_;
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   * @return Whether the incidentLookup field is set.
   */
  @java.lang.Override
  public boolean hasIncidentLookup() {
    return incidentLookup_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   * @return The incidentLookup.
   */
  @java.lang.Override
  public POGOProtos.Rpc.IncidentLookupProto getIncidentLookup() {
    return incidentLookup_ == null ? POGOProtos.Rpc.IncidentLookupProto.getDefaultInstance() : incidentLookup_;
  }
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.IncidentLookupProtoOrBuilder getIncidentLookupOrBuilder() {
    return getIncidentLookup();
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
    if (incidentLookup_ != null) {
      output.writeMessage(1, getIncidentLookup());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (incidentLookup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIncidentLookup());
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
    if (!(obj instanceof POGOProtos.Rpc.StartIncidentProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.StartIncidentProto other = (POGOProtos.Rpc.StartIncidentProto) obj;

    if (hasIncidentLookup() != other.hasIncidentLookup()) return false;
    if (hasIncidentLookup()) {
      if (!getIncidentLookup()
          .equals(other.getIncidentLookup())) return false;
    }
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
    if (hasIncidentLookup()) {
      hash = (37 * hash) + INCIDENT_LOOKUP_FIELD_NUMBER;
      hash = (53 * hash) + getIncidentLookup().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.StartIncidentProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.StartIncidentProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.StartIncidentProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.StartIncidentProto)
      POGOProtos.Rpc.StartIncidentProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StartIncidentProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StartIncidentProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.StartIncidentProto.class, POGOProtos.Rpc.StartIncidentProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.StartIncidentProto.newBuilder()
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
      if (incidentLookupBuilder_ == null) {
        incidentLookup_ = null;
      } else {
        incidentLookup_ = null;
        incidentLookupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_StartIncidentProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.StartIncidentProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.StartIncidentProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.StartIncidentProto build() {
      POGOProtos.Rpc.StartIncidentProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.StartIncidentProto buildPartial() {
      POGOProtos.Rpc.StartIncidentProto result = new POGOProtos.Rpc.StartIncidentProto(this);
      if (incidentLookupBuilder_ == null) {
        result.incidentLookup_ = incidentLookup_;
      } else {
        result.incidentLookup_ = incidentLookupBuilder_.build();
      }
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
      if (other instanceof POGOProtos.Rpc.StartIncidentProto) {
        return mergeFrom((POGOProtos.Rpc.StartIncidentProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.StartIncidentProto other) {
      if (other == POGOProtos.Rpc.StartIncidentProto.getDefaultInstance()) return this;
      if (other.hasIncidentLookup()) {
        mergeIncidentLookup(other.getIncidentLookup());
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
      POGOProtos.Rpc.StartIncidentProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.StartIncidentProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.IncidentLookupProto incidentLookup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IncidentLookupProto, POGOProtos.Rpc.IncidentLookupProto.Builder, POGOProtos.Rpc.IncidentLookupProtoOrBuilder> incidentLookupBuilder_;
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     * @return Whether the incidentLookup field is set.
     */
    public boolean hasIncidentLookup() {
      return incidentLookupBuilder_ != null || incidentLookup_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     * @return The incidentLookup.
     */
    public POGOProtos.Rpc.IncidentLookupProto getIncidentLookup() {
      if (incidentLookupBuilder_ == null) {
        return incidentLookup_ == null ? POGOProtos.Rpc.IncidentLookupProto.getDefaultInstance() : incidentLookup_;
      } else {
        return incidentLookupBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    public Builder setIncidentLookup(POGOProtos.Rpc.IncidentLookupProto value) {
      if (incidentLookupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        incidentLookup_ = value;
        onChanged();
      } else {
        incidentLookupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    public Builder setIncidentLookup(
        POGOProtos.Rpc.IncidentLookupProto.Builder builderForValue) {
      if (incidentLookupBuilder_ == null) {
        incidentLookup_ = builderForValue.build();
        onChanged();
      } else {
        incidentLookupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    public Builder mergeIncidentLookup(POGOProtos.Rpc.IncidentLookupProto value) {
      if (incidentLookupBuilder_ == null) {
        if (incidentLookup_ != null) {
          incidentLookup_ =
            POGOProtos.Rpc.IncidentLookupProto.newBuilder(incidentLookup_).mergeFrom(value).buildPartial();
        } else {
          incidentLookup_ = value;
        }
        onChanged();
      } else {
        incidentLookupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    public Builder clearIncidentLookup() {
      if (incidentLookupBuilder_ == null) {
        incidentLookup_ = null;
        onChanged();
      } else {
        incidentLookup_ = null;
        incidentLookupBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    public POGOProtos.Rpc.IncidentLookupProto.Builder getIncidentLookupBuilder() {
      
      onChanged();
      return getIncidentLookupFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    public POGOProtos.Rpc.IncidentLookupProtoOrBuilder getIncidentLookupOrBuilder() {
      if (incidentLookupBuilder_ != null) {
        return incidentLookupBuilder_.getMessageOrBuilder();
      } else {
        return incidentLookup_ == null ?
            POGOProtos.Rpc.IncidentLookupProto.getDefaultInstance() : incidentLookup_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.IncidentLookupProto, POGOProtos.Rpc.IncidentLookupProto.Builder, POGOProtos.Rpc.IncidentLookupProtoOrBuilder> 
        getIncidentLookupFieldBuilder() {
      if (incidentLookupBuilder_ == null) {
        incidentLookupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.IncidentLookupProto, POGOProtos.Rpc.IncidentLookupProto.Builder, POGOProtos.Rpc.IncidentLookupProtoOrBuilder>(
                getIncidentLookup(),
                getParentForChildren(),
                isClean());
        incidentLookup_ = null;
      }
      return incidentLookupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.StartIncidentProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.StartIncidentProto)
  private static final POGOProtos.Rpc.StartIncidentProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.StartIncidentProto();
  }

  public static POGOProtos.Rpc.StartIncidentProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartIncidentProto>
      PARSER = new com.google.protobuf.AbstractParser<StartIncidentProto>() {
    @java.lang.Override
    public StartIncidentProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StartIncidentProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StartIncidentProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartIncidentProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.StartIncidentProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
