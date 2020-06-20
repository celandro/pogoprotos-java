// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePlayer/Responses/GetInventoryResponse.proto

package POGOProtos.Networking.Responses.Game.GamePlayer.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse}
 */
public  final class GetInventoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse)
    GetInventoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetInventoryResponse.newBuilder() to construct.
  private GetInventoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetInventoryResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetInventoryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetInventoryResponse(
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

            success_ = input.readBool();
            break;
          }
          case 18: {
            POGOProtos.Inventory.InventoryDelta.Builder subBuilder = null;
            if (inventoryDelta_ != null) {
              subBuilder = inventoryDelta_.toBuilder();
            }
            inventoryDelta_ = input.readMessage(POGOProtos.Inventory.InventoryDelta.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(inventoryDelta_);
              inventoryDelta_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePlayer_Responses_GetInventoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePlayer_Responses_GetInventoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.class, POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>bool success = 1;</code>
   * @return The success.
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int INVENTORY_DELTA_FIELD_NUMBER = 2;
  private POGOProtos.Inventory.InventoryDelta inventoryDelta_;
  /**
   * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
   * @return Whether the inventoryDelta field is set.
   */
  public boolean hasInventoryDelta() {
    return inventoryDelta_ != null;
  }
  /**
   * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
   * @return The inventoryDelta.
   */
  public POGOProtos.Inventory.InventoryDelta getInventoryDelta() {
    return inventoryDelta_ == null ? POGOProtos.Inventory.InventoryDelta.getDefaultInstance() : inventoryDelta_;
  }
  /**
   * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
   */
  public POGOProtos.Inventory.InventoryDeltaOrBuilder getInventoryDeltaOrBuilder() {
    return getInventoryDelta();
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (inventoryDelta_ != null) {
      output.writeMessage(2, getInventoryDelta());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (inventoryDelta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInventoryDelta());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse other = (POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse) obj;

    if (getSuccess()
        != other.getSuccess()) return false;
    if (hasInventoryDelta() != other.hasInventoryDelta()) return false;
    if (hasInventoryDelta()) {
      if (!getInventoryDelta()
          .equals(other.getInventoryDelta())) return false;
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (hasInventoryDelta()) {
      hash = (37 * hash) + INVENTORY_DELTA_FIELD_NUMBER;
      hash = (53 * hash) + getInventoryDelta().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse)
      POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePlayer_Responses_GetInventoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePlayer_Responses_GetInventoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.class, POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.newBuilder()
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
      success_ = false;

      if (inventoryDeltaBuilder_ == null) {
        inventoryDelta_ = null;
      } else {
        inventoryDelta_ = null;
        inventoryDeltaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponseOuterClass.internal_static_POGOProtos_Networking_Responses_Game_GamePlayer_Responses_GetInventoryResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse build() {
      POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse buildPartial() {
      POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse result = new POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse(this);
      result.success_ = success_;
      if (inventoryDeltaBuilder_ == null) {
        result.inventoryDelta_ = inventoryDelta_;
      } else {
        result.inventoryDelta_ = inventoryDeltaBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse other) {
      if (other == POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (other.hasInventoryDelta()) {
        mergeInventoryDelta(other.getInventoryDelta());
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
      POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean success_ ;
    /**
     * <code>bool success = 1;</code>
     * @return The success.
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 1;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Inventory.InventoryDelta inventoryDelta_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.InventoryDelta, POGOProtos.Inventory.InventoryDelta.Builder, POGOProtos.Inventory.InventoryDeltaOrBuilder> inventoryDeltaBuilder_;
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     * @return Whether the inventoryDelta field is set.
     */
    public boolean hasInventoryDelta() {
      return inventoryDeltaBuilder_ != null || inventoryDelta_ != null;
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     * @return The inventoryDelta.
     */
    public POGOProtos.Inventory.InventoryDelta getInventoryDelta() {
      if (inventoryDeltaBuilder_ == null) {
        return inventoryDelta_ == null ? POGOProtos.Inventory.InventoryDelta.getDefaultInstance() : inventoryDelta_;
      } else {
        return inventoryDeltaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    public Builder setInventoryDelta(POGOProtos.Inventory.InventoryDelta value) {
      if (inventoryDeltaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inventoryDelta_ = value;
        onChanged();
      } else {
        inventoryDeltaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    public Builder setInventoryDelta(
        POGOProtos.Inventory.InventoryDelta.Builder builderForValue) {
      if (inventoryDeltaBuilder_ == null) {
        inventoryDelta_ = builderForValue.build();
        onChanged();
      } else {
        inventoryDeltaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    public Builder mergeInventoryDelta(POGOProtos.Inventory.InventoryDelta value) {
      if (inventoryDeltaBuilder_ == null) {
        if (inventoryDelta_ != null) {
          inventoryDelta_ =
            POGOProtos.Inventory.InventoryDelta.newBuilder(inventoryDelta_).mergeFrom(value).buildPartial();
        } else {
          inventoryDelta_ = value;
        }
        onChanged();
      } else {
        inventoryDeltaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    public Builder clearInventoryDelta() {
      if (inventoryDeltaBuilder_ == null) {
        inventoryDelta_ = null;
        onChanged();
      } else {
        inventoryDelta_ = null;
        inventoryDeltaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    public POGOProtos.Inventory.InventoryDelta.Builder getInventoryDeltaBuilder() {
      
      onChanged();
      return getInventoryDeltaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    public POGOProtos.Inventory.InventoryDeltaOrBuilder getInventoryDeltaOrBuilder() {
      if (inventoryDeltaBuilder_ != null) {
        return inventoryDeltaBuilder_.getMessageOrBuilder();
      } else {
        return inventoryDelta_ == null ?
            POGOProtos.Inventory.InventoryDelta.getDefaultInstance() : inventoryDelta_;
      }
    }
    /**
     * <code>.POGOProtos.Inventory.InventoryDelta inventory_delta = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Inventory.InventoryDelta, POGOProtos.Inventory.InventoryDelta.Builder, POGOProtos.Inventory.InventoryDeltaOrBuilder> 
        getInventoryDeltaFieldBuilder() {
      if (inventoryDeltaBuilder_ == null) {
        inventoryDeltaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Inventory.InventoryDelta, POGOProtos.Inventory.InventoryDelta.Builder, POGOProtos.Inventory.InventoryDeltaOrBuilder>(
                getInventoryDelta(),
                getParentForChildren(),
                isClean());
        inventoryDelta_ = null;
      }
      return inventoryDeltaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse)
  private static final POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse();
  }

  public static POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetInventoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetInventoryResponse>() {
    @java.lang.Override
    public GetInventoryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetInventoryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetInventoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetInventoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.Game.GamePlayer.Responses.GetInventoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

