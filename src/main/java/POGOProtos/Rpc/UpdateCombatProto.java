// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.UpdateCombatProto}
 */
public final class UpdateCombatProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.UpdateCombatProto)
    UpdateCombatProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCombatProto.newBuilder() to construct.
  private UpdateCombatProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCombatProto() {
    combatId_ = "";
    debugLog_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCombatProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateCombatProto(
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
            java.lang.String s = input.readStringRequireUtf8();

            combatId_ = s;
            break;
          }
          case 18: {
            POGOProtos.Rpc.CombatActionProto.Builder subBuilder = null;
            if (action_ != null) {
              subBuilder = action_.toBuilder();
            }
            action_ = input.readMessage(POGOProtos.Rpc.CombatActionProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(action_);
              action_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            debugLog_ = s;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateCombatProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateCombatProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.UpdateCombatProto.class, POGOProtos.Rpc.UpdateCombatProto.Builder.class);
  }

  public static final int COMBAT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object combatId_;
  /**
   * <code>string combat_id = 1;</code>
   * @return The combatId.
   */
  @java.lang.Override
  public java.lang.String getCombatId() {
    java.lang.Object ref = combatId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      combatId_ = s;
      return s;
    }
  }
  /**
   * <code>string combat_id = 1;</code>
   * @return The bytes for combatId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCombatIdBytes() {
    java.lang.Object ref = combatId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      combatId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.CombatActionProto action_;
  /**
   * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override
  public boolean hasAction() {
    return action_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
   * @return The action.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatActionProto getAction() {
    return action_ == null ? POGOProtos.Rpc.CombatActionProto.getDefaultInstance() : action_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatActionProtoOrBuilder getActionOrBuilder() {
    return getAction();
  }

  public static final int DEBUG_LOG_FIELD_NUMBER = 3;
  private volatile java.lang.Object debugLog_;
  /**
   * <code>string debug_log = 3;</code>
   * @return The debugLog.
   */
  @java.lang.Override
  public java.lang.String getDebugLog() {
    java.lang.Object ref = debugLog_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      debugLog_ = s;
      return s;
    }
  }
  /**
   * <code>string debug_log = 3;</code>
   * @return The bytes for debugLog.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDebugLogBytes() {
    java.lang.Object ref = debugLog_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      debugLog_ = b;
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
    if (!getCombatIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, combatId_);
    }
    if (action_ != null) {
      output.writeMessage(2, getAction());
    }
    if (!getDebugLogBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, debugLog_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCombatIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, combatId_);
    }
    if (action_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAction());
    }
    if (!getDebugLogBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, debugLog_);
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
    if (!(obj instanceof POGOProtos.Rpc.UpdateCombatProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.UpdateCombatProto other = (POGOProtos.Rpc.UpdateCombatProto) obj;

    if (!getCombatId()
        .equals(other.getCombatId())) return false;
    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
    }
    if (!getDebugLog()
        .equals(other.getDebugLog())) return false;
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
    hash = (37 * hash) + COMBAT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCombatId().hashCode();
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (37 * hash) + DEBUG_LOG_FIELD_NUMBER;
    hash = (53 * hash) + getDebugLog().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.UpdateCombatProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.UpdateCombatProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.UpdateCombatProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.UpdateCombatProto)
      POGOProtos.Rpc.UpdateCombatProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateCombatProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateCombatProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.UpdateCombatProto.class, POGOProtos.Rpc.UpdateCombatProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.UpdateCombatProto.newBuilder()
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
      combatId_ = "";

      if (actionBuilder_ == null) {
        action_ = null;
      } else {
        action_ = null;
        actionBuilder_ = null;
      }
      debugLog_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_UpdateCombatProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpdateCombatProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.UpdateCombatProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpdateCombatProto build() {
      POGOProtos.Rpc.UpdateCombatProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.UpdateCombatProto buildPartial() {
      POGOProtos.Rpc.UpdateCombatProto result = new POGOProtos.Rpc.UpdateCombatProto(this);
      result.combatId_ = combatId_;
      if (actionBuilder_ == null) {
        result.action_ = action_;
      } else {
        result.action_ = actionBuilder_.build();
      }
      result.debugLog_ = debugLog_;
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
      if (other instanceof POGOProtos.Rpc.UpdateCombatProto) {
        return mergeFrom((POGOProtos.Rpc.UpdateCombatProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.UpdateCombatProto other) {
      if (other == POGOProtos.Rpc.UpdateCombatProto.getDefaultInstance()) return this;
      if (!other.getCombatId().isEmpty()) {
        combatId_ = other.combatId_;
        onChanged();
      }
      if (other.hasAction()) {
        mergeAction(other.getAction());
      }
      if (!other.getDebugLog().isEmpty()) {
        debugLog_ = other.debugLog_;
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
      POGOProtos.Rpc.UpdateCombatProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.UpdateCombatProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object combatId_ = "";
    /**
     * <code>string combat_id = 1;</code>
     * @return The combatId.
     */
    public java.lang.String getCombatId() {
      java.lang.Object ref = combatId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        combatId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string combat_id = 1;</code>
     * @return The bytes for combatId.
     */
    public com.google.protobuf.ByteString
        getCombatIdBytes() {
      java.lang.Object ref = combatId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        combatId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string combat_id = 1;</code>
     * @param value The combatId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      combatId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string combat_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatId() {
      
      combatId_ = getDefaultInstance().getCombatId();
      onChanged();
      return this;
    }
    /**
     * <code>string combat_id = 1;</code>
     * @param value The bytes for combatId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      combatId_ = value;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CombatActionProto action_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatActionProto, POGOProtos.Rpc.CombatActionProto.Builder, POGOProtos.Rpc.CombatActionProtoOrBuilder> actionBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     * @return Whether the action field is set.
     */
    public boolean hasAction() {
      return actionBuilder_ != null || action_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     * @return The action.
     */
    public POGOProtos.Rpc.CombatActionProto getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? POGOProtos.Rpc.CombatActionProto.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    public Builder setAction(POGOProtos.Rpc.CombatActionProto value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        actionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    public Builder setAction(
        POGOProtos.Rpc.CombatActionProto.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    public Builder mergeAction(POGOProtos.Rpc.CombatActionProto value) {
      if (actionBuilder_ == null) {
        if (action_ != null) {
          action_ =
            POGOProtos.Rpc.CombatActionProto.newBuilder(action_).mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        actionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    public Builder clearAction() {
      if (actionBuilder_ == null) {
        action_ = null;
        onChanged();
      } else {
        action_ = null;
        actionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    public POGOProtos.Rpc.CombatActionProto.Builder getActionBuilder() {
      
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    public POGOProtos.Rpc.CombatActionProtoOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            POGOProtos.Rpc.CombatActionProto.getDefaultInstance() : action_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatActionProto action = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatActionProto, POGOProtos.Rpc.CombatActionProto.Builder, POGOProtos.Rpc.CombatActionProtoOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatActionProto, POGOProtos.Rpc.CombatActionProto.Builder, POGOProtos.Rpc.CombatActionProtoOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
    }

    private java.lang.Object debugLog_ = "";
    /**
     * <code>string debug_log = 3;</code>
     * @return The debugLog.
     */
    public java.lang.String getDebugLog() {
      java.lang.Object ref = debugLog_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        debugLog_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string debug_log = 3;</code>
     * @return The bytes for debugLog.
     */
    public com.google.protobuf.ByteString
        getDebugLogBytes() {
      java.lang.Object ref = debugLog_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        debugLog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string debug_log = 3;</code>
     * @param value The debugLog to set.
     * @return This builder for chaining.
     */
    public Builder setDebugLog(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      debugLog_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string debug_log = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDebugLog() {
      
      debugLog_ = getDefaultInstance().getDebugLog();
      onChanged();
      return this;
    }
    /**
     * <code>string debug_log = 3;</code>
     * @param value The bytes for debugLog to set.
     * @return This builder for chaining.
     */
    public Builder setDebugLogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      debugLog_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.UpdateCombatProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.UpdateCombatProto)
  private static final POGOProtos.Rpc.UpdateCombatProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.UpdateCombatProto();
  }

  public static POGOProtos.Rpc.UpdateCombatProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCombatProto>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCombatProto>() {
    @java.lang.Override
    public UpdateCombatProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCombatProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCombatProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCombatProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.UpdateCombatProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

