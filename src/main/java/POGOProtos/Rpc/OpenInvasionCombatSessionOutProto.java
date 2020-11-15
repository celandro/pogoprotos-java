// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.OpenInvasionCombatSessionOutProto}
 */
public final class OpenInvasionCombatSessionOutProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.OpenInvasionCombatSessionOutProto)
    OpenInvasionCombatSessionOutProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenInvasionCombatSessionOutProto.newBuilder() to construct.
  private OpenInvasionCombatSessionOutProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenInvasionCombatSessionOutProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenInvasionCombatSessionOutProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenInvasionCombatSessionOutProto(
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

            status_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.CombatProto.Builder subBuilder = null;
            if (combat_ != null) {
              subBuilder = combat_.toBuilder();
            }
            combat_ = input.readMessage(POGOProtos.Rpc.CombatProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(combat_);
              combat_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenInvasionCombatSessionOutProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenInvasionCombatSessionOutProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.class, POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.InvasionStatus.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.InvasionStatus.Status result = POGOProtos.Rpc.InvasionStatus.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.InvasionStatus.Status.UNRECOGNIZED : result;
  }

  public static final int COMBAT_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CombatProto combat_;
  /**
   * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
   * @return Whether the combat field is set.
   */
  @java.lang.Override
  public boolean hasCombat() {
    return combat_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
   * @return The combat.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatProto getCombat() {
    return combat_ == null ? POGOProtos.Rpc.CombatProto.getDefaultInstance() : combat_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatProtoOrBuilder getCombatOrBuilder() {
    return getCombat();
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
    if (status_ != POGOProtos.Rpc.InvasionStatus.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (combat_ != null) {
      output.writeMessage(2, getCombat());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.InvasionStatus.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (combat_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCombat());
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
    if (!(obj instanceof POGOProtos.Rpc.OpenInvasionCombatSessionOutProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.OpenInvasionCombatSessionOutProto other = (POGOProtos.Rpc.OpenInvasionCombatSessionOutProto) obj;

    if (status_ != other.status_) return false;
    if (hasCombat() != other.hasCombat()) return false;
    if (hasCombat()) {
      if (!getCombat()
          .equals(other.getCombat())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasCombat()) {
      hash = (37 * hash) + COMBAT_FIELD_NUMBER;
      hash = (53 * hash) + getCombat().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.OpenInvasionCombatSessionOutProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.OpenInvasionCombatSessionOutProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.OpenInvasionCombatSessionOutProto)
      POGOProtos.Rpc.OpenInvasionCombatSessionOutProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenInvasionCombatSessionOutProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenInvasionCombatSessionOutProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.class, POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.newBuilder()
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
      status_ = 0;

      if (combatBuilder_ == null) {
        combat_ = null;
      } else {
        combat_ = null;
        combatBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_OpenInvasionCombatSessionOutProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenInvasionCombatSessionOutProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenInvasionCombatSessionOutProto build() {
      POGOProtos.Rpc.OpenInvasionCombatSessionOutProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.OpenInvasionCombatSessionOutProto buildPartial() {
      POGOProtos.Rpc.OpenInvasionCombatSessionOutProto result = new POGOProtos.Rpc.OpenInvasionCombatSessionOutProto(this);
      result.status_ = status_;
      if (combatBuilder_ == null) {
        result.combat_ = combat_;
      } else {
        result.combat_ = combatBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.OpenInvasionCombatSessionOutProto) {
        return mergeFrom((POGOProtos.Rpc.OpenInvasionCombatSessionOutProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.OpenInvasionCombatSessionOutProto other) {
      if (other == POGOProtos.Rpc.OpenInvasionCombatSessionOutProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasCombat()) {
        mergeCombat(other.getCombat());
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
      POGOProtos.Rpc.OpenInvasionCombatSessionOutProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.OpenInvasionCombatSessionOutProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.InvasionStatus.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.InvasionStatus.Status result = POGOProtos.Rpc.InvasionStatus.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.InvasionStatus.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.InvasionStatus.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.InvasionStatus.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CombatProto combat_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatProto, POGOProtos.Rpc.CombatProto.Builder, POGOProtos.Rpc.CombatProtoOrBuilder> combatBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     * @return Whether the combat field is set.
     */
    public boolean hasCombat() {
      return combatBuilder_ != null || combat_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     * @return The combat.
     */
    public POGOProtos.Rpc.CombatProto getCombat() {
      if (combatBuilder_ == null) {
        return combat_ == null ? POGOProtos.Rpc.CombatProto.getDefaultInstance() : combat_;
      } else {
        return combatBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    public Builder setCombat(POGOProtos.Rpc.CombatProto value) {
      if (combatBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        combat_ = value;
        onChanged();
      } else {
        combatBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    public Builder setCombat(
        POGOProtos.Rpc.CombatProto.Builder builderForValue) {
      if (combatBuilder_ == null) {
        combat_ = builderForValue.build();
        onChanged();
      } else {
        combatBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    public Builder mergeCombat(POGOProtos.Rpc.CombatProto value) {
      if (combatBuilder_ == null) {
        if (combat_ != null) {
          combat_ =
            POGOProtos.Rpc.CombatProto.newBuilder(combat_).mergeFrom(value).buildPartial();
        } else {
          combat_ = value;
        }
        onChanged();
      } else {
        combatBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    public Builder clearCombat() {
      if (combatBuilder_ == null) {
        combat_ = null;
        onChanged();
      } else {
        combat_ = null;
        combatBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    public POGOProtos.Rpc.CombatProto.Builder getCombatBuilder() {
      
      onChanged();
      return getCombatFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    public POGOProtos.Rpc.CombatProtoOrBuilder getCombatOrBuilder() {
      if (combatBuilder_ != null) {
        return combatBuilder_.getMessageOrBuilder();
      } else {
        return combat_ == null ?
            POGOProtos.Rpc.CombatProto.getDefaultInstance() : combat_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatProto combat = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatProto, POGOProtos.Rpc.CombatProto.Builder, POGOProtos.Rpc.CombatProtoOrBuilder> 
        getCombatFieldBuilder() {
      if (combatBuilder_ == null) {
        combatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatProto, POGOProtos.Rpc.CombatProto.Builder, POGOProtos.Rpc.CombatProtoOrBuilder>(
                getCombat(),
                getParentForChildren(),
                isClean());
        combat_ = null;
      }
      return combatBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.OpenInvasionCombatSessionOutProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.OpenInvasionCombatSessionOutProto)
  private static final POGOProtos.Rpc.OpenInvasionCombatSessionOutProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.OpenInvasionCombatSessionOutProto();
  }

  public static POGOProtos.Rpc.OpenInvasionCombatSessionOutProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenInvasionCombatSessionOutProto>
      PARSER = new com.google.protobuf.AbstractParser<OpenInvasionCombatSessionOutProto>() {
    @java.lang.Override
    public OpenInvasionCombatSessionOutProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenInvasionCombatSessionOutProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenInvasionCombatSessionOutProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenInvasionCombatSessionOutProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.OpenInvasionCombatSessionOutProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

