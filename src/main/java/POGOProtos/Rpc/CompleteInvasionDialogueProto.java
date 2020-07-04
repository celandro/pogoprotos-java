// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.CompleteInvasionDialogueProto}
 */
public  final class CompleteInvasionDialogueProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.CompleteInvasionDialogueProto)
    CompleteInvasionDialogueProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteInvasionDialogueProto.newBuilder() to construct.
  private CompleteInvasionDialogueProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteInvasionDialogueProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteInvasionDialogueProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompleteInvasionDialogueProto(
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
          case 16: {

            step_ = input.readInt32();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteInvasionDialogueProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteInvasionDialogueProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.CompleteInvasionDialogueProto.class, POGOProtos.Rpc.CompleteInvasionDialogueProto.Builder.class);
  }

  public static final int INCIDENT_LOOKUP_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.IncidentLookupProto incidentLookup_;
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   * @return Whether the incidentLookup field is set.
   */
  public boolean hasIncidentLookup() {
    return incidentLookup_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   * @return The incidentLookup.
   */
  public POGOProtos.Rpc.IncidentLookupProto getIncidentLookup() {
    return incidentLookup_ == null ? POGOProtos.Rpc.IncidentLookupProto.getDefaultInstance() : incidentLookup_;
  }
  /**
   * <code>.POGOProtos.Rpc.IncidentLookupProto incident_lookup = 1;</code>
   */
  public POGOProtos.Rpc.IncidentLookupProtoOrBuilder getIncidentLookupOrBuilder() {
    return getIncidentLookup();
  }

  public static final int STEP_FIELD_NUMBER = 2;
  private int step_;
  /**
   * <code>int32 step = 2;</code>
   * @return The step.
   */
  public int getStep() {
    return step_;
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
    if (step_ != 0) {
      output.writeInt32(2, step_);
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
    if (step_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, step_);
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
    if (!(obj instanceof POGOProtos.Rpc.CompleteInvasionDialogueProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.CompleteInvasionDialogueProto other = (POGOProtos.Rpc.CompleteInvasionDialogueProto) obj;

    if (hasIncidentLookup() != other.hasIncidentLookup()) return false;
    if (hasIncidentLookup()) {
      if (!getIncidentLookup()
          .equals(other.getIncidentLookup())) return false;
    }
    if (getStep()
        != other.getStep()) return false;
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
    hash = (37 * hash) + STEP_FIELD_NUMBER;
    hash = (53 * hash) + getStep();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.CompleteInvasionDialogueProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.CompleteInvasionDialogueProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.CompleteInvasionDialogueProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.CompleteInvasionDialogueProto)
      POGOProtos.Rpc.CompleteInvasionDialogueProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteInvasionDialogueProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteInvasionDialogueProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.CompleteInvasionDialogueProto.class, POGOProtos.Rpc.CompleteInvasionDialogueProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.CompleteInvasionDialogueProto.newBuilder()
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
      step_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_CompleteInvasionDialogueProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CompleteInvasionDialogueProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.CompleteInvasionDialogueProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.CompleteInvasionDialogueProto build() {
      POGOProtos.Rpc.CompleteInvasionDialogueProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.CompleteInvasionDialogueProto buildPartial() {
      POGOProtos.Rpc.CompleteInvasionDialogueProto result = new POGOProtos.Rpc.CompleteInvasionDialogueProto(this);
      if (incidentLookupBuilder_ == null) {
        result.incidentLookup_ = incidentLookup_;
      } else {
        result.incidentLookup_ = incidentLookupBuilder_.build();
      }
      result.step_ = step_;
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
      if (other instanceof POGOProtos.Rpc.CompleteInvasionDialogueProto) {
        return mergeFrom((POGOProtos.Rpc.CompleteInvasionDialogueProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.CompleteInvasionDialogueProto other) {
      if (other == POGOProtos.Rpc.CompleteInvasionDialogueProto.getDefaultInstance()) return this;
      if (other.hasIncidentLookup()) {
        mergeIncidentLookup(other.getIncidentLookup());
      }
      if (other.getStep() != 0) {
        setStep(other.getStep());
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
      POGOProtos.Rpc.CompleteInvasionDialogueProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.CompleteInvasionDialogueProto) e.getUnfinishedMessage();
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

    private int step_ ;
    /**
     * <code>int32 step = 2;</code>
     * @return The step.
     */
    public int getStep() {
      return step_;
    }
    /**
     * <code>int32 step = 2;</code>
     * @param value The step to set.
     * @return This builder for chaining.
     */
    public Builder setStep(int value) {
      
      step_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 step = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStep() {
      
      step_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.CompleteInvasionDialogueProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.CompleteInvasionDialogueProto)
  private static final POGOProtos.Rpc.CompleteInvasionDialogueProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.CompleteInvasionDialogueProto();
  }

  public static POGOProtos.Rpc.CompleteInvasionDialogueProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteInvasionDialogueProto>
      PARSER = new com.google.protobuf.AbstractParser<CompleteInvasionDialogueProto>() {
    @java.lang.Override
    public CompleteInvasionDialogueProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompleteInvasionDialogueProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompleteInvasionDialogueProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteInvasionDialogueProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.CompleteInvasionDialogueProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

