// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/SetPlayerTeamResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.SetPlayerTeamResponse}
 */
public  final class SetPlayerTeamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.SetPlayerTeamResponse)
    SetPlayerTeamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetPlayerTeamResponse.newBuilder() to construct.
  private SetPlayerTeamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetPlayerTeamResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetPlayerTeamResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetPlayerTeamResponse(
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
            POGOProtos.Data.PlayerData.Builder subBuilder = null;
            if (playerData_ != null) {
              subBuilder = playerData_.toBuilder();
            }
            playerData_ = input.readMessage(POGOProtos.Data.PlayerData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(playerData_);
              playerData_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.SetPlayerTeamResponseOuterClass.internal_static_POGOProtos_Networking_Responses_SetPlayerTeamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.SetPlayerTeamResponseOuterClass.internal_static_POGOProtos_Networking_Responses_SetPlayerTeamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.SetPlayerTeamResponse.class, POGOProtos.Networking.Responses.SetPlayerTeamResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>TEAM_ALREADY_SET = 2;</code>
     */
    TEAM_ALREADY_SET(2),
    /**
     * <code>FAILURE = 3;</code>
     */
    FAILURE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>TEAM_ALREADY_SET = 2;</code>
     */
    public static final int TEAM_ALREADY_SET_VALUE = 2;
    /**
     * <code>FAILURE = 3;</code>
     */
    public static final int FAILURE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return TEAM_ALREADY_SET;
        case 3: return FAILURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.SetPlayerTeamResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
   * @return The status.
   */
  public POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status result = POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status.UNRECOGNIZED : result;
  }

  public static final int PLAYER_DATA_FIELD_NUMBER = 2;
  private POGOProtos.Data.PlayerData playerData_;
  /**
   * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
   * @return Whether the playerData field is set.
   */
  public boolean hasPlayerData() {
    return playerData_ != null;
  }
  /**
   * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
   * @return The playerData.
   */
  public POGOProtos.Data.PlayerData getPlayerData() {
    return playerData_ == null ? POGOProtos.Data.PlayerData.getDefaultInstance() : playerData_;
  }
  /**
   * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
   */
  public POGOProtos.Data.PlayerDataOrBuilder getPlayerDataOrBuilder() {
    return getPlayerData();
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
    if (status_ != POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (playerData_ != null) {
      output.writeMessage(2, getPlayerData());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (playerData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayerData());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.SetPlayerTeamResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.SetPlayerTeamResponse other = (POGOProtos.Networking.Responses.SetPlayerTeamResponse) obj;

    if (status_ != other.status_) return false;
    if (hasPlayerData() != other.hasPlayerData()) return false;
    if (hasPlayerData()) {
      if (!getPlayerData()
          .equals(other.getPlayerData())) return false;
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
    if (hasPlayerData()) {
      hash = (37 * hash) + PLAYER_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.SetPlayerTeamResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.SetPlayerTeamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.SetPlayerTeamResponse)
      POGOProtos.Networking.Responses.SetPlayerTeamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.SetPlayerTeamResponseOuterClass.internal_static_POGOProtos_Networking_Responses_SetPlayerTeamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.SetPlayerTeamResponseOuterClass.internal_static_POGOProtos_Networking_Responses_SetPlayerTeamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.SetPlayerTeamResponse.class, POGOProtos.Networking.Responses.SetPlayerTeamResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.SetPlayerTeamResponse.newBuilder()
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

      if (playerDataBuilder_ == null) {
        playerData_ = null;
      } else {
        playerData_ = null;
        playerDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.SetPlayerTeamResponseOuterClass.internal_static_POGOProtos_Networking_Responses_SetPlayerTeamResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.SetPlayerTeamResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.SetPlayerTeamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.SetPlayerTeamResponse build() {
      POGOProtos.Networking.Responses.SetPlayerTeamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.SetPlayerTeamResponse buildPartial() {
      POGOProtos.Networking.Responses.SetPlayerTeamResponse result = new POGOProtos.Networking.Responses.SetPlayerTeamResponse(this);
      result.status_ = status_;
      if (playerDataBuilder_ == null) {
        result.playerData_ = playerData_;
      } else {
        result.playerData_ = playerDataBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.SetPlayerTeamResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.SetPlayerTeamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.SetPlayerTeamResponse other) {
      if (other == POGOProtos.Networking.Responses.SetPlayerTeamResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasPlayerData()) {
        mergePlayerData(other.getPlayerData());
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
      POGOProtos.Networking.Responses.SetPlayerTeamResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.SetPlayerTeamResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
     * @return The status.
     */
    public POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status result = POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.SetPlayerTeamResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.PlayerData playerData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PlayerData, POGOProtos.Data.PlayerData.Builder, POGOProtos.Data.PlayerDataOrBuilder> playerDataBuilder_;
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     * @return Whether the playerData field is set.
     */
    public boolean hasPlayerData() {
      return playerDataBuilder_ != null || playerData_ != null;
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     * @return The playerData.
     */
    public POGOProtos.Data.PlayerData getPlayerData() {
      if (playerDataBuilder_ == null) {
        return playerData_ == null ? POGOProtos.Data.PlayerData.getDefaultInstance() : playerData_;
      } else {
        return playerDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    public Builder setPlayerData(POGOProtos.Data.PlayerData value) {
      if (playerDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerData_ = value;
        onChanged();
      } else {
        playerDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    public Builder setPlayerData(
        POGOProtos.Data.PlayerData.Builder builderForValue) {
      if (playerDataBuilder_ == null) {
        playerData_ = builderForValue.build();
        onChanged();
      } else {
        playerDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    public Builder mergePlayerData(POGOProtos.Data.PlayerData value) {
      if (playerDataBuilder_ == null) {
        if (playerData_ != null) {
          playerData_ =
            POGOProtos.Data.PlayerData.newBuilder(playerData_).mergeFrom(value).buildPartial();
        } else {
          playerData_ = value;
        }
        onChanged();
      } else {
        playerDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    public Builder clearPlayerData() {
      if (playerDataBuilder_ == null) {
        playerData_ = null;
        onChanged();
      } else {
        playerData_ = null;
        playerDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    public POGOProtos.Data.PlayerData.Builder getPlayerDataBuilder() {
      
      onChanged();
      return getPlayerDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    public POGOProtos.Data.PlayerDataOrBuilder getPlayerDataOrBuilder() {
      if (playerDataBuilder_ != null) {
        return playerDataBuilder_.getMessageOrBuilder();
      } else {
        return playerData_ == null ?
            POGOProtos.Data.PlayerData.getDefaultInstance() : playerData_;
      }
    }
    /**
     * <code>.POGOProtos.Data.PlayerData player_data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.PlayerData, POGOProtos.Data.PlayerData.Builder, POGOProtos.Data.PlayerDataOrBuilder> 
        getPlayerDataFieldBuilder() {
      if (playerDataBuilder_ == null) {
        playerDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.PlayerData, POGOProtos.Data.PlayerData.Builder, POGOProtos.Data.PlayerDataOrBuilder>(
                getPlayerData(),
                getParentForChildren(),
                isClean());
        playerData_ = null;
      }
      return playerDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.SetPlayerTeamResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.SetPlayerTeamResponse)
  private static final POGOProtos.Networking.Responses.SetPlayerTeamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.SetPlayerTeamResponse();
  }

  public static POGOProtos.Networking.Responses.SetPlayerTeamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetPlayerTeamResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetPlayerTeamResponse>() {
    @java.lang.Override
    public SetPlayerTeamResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetPlayerTeamResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetPlayerTeamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetPlayerTeamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.SetPlayerTeamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
