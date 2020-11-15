// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/SetAvatarMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.SetAvatarMessage}
 */
public final class SetAvatarMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.SetAvatarMessage)
    SetAvatarMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetAvatarMessage.newBuilder() to construct.
  private SetAvatarMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetAvatarMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetAvatarMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetAvatarMessage(
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
          case 18: {
            POGOProtos.Data.Player.PlayerAvatar.Builder subBuilder = null;
            if (playerAvatar_ != null) {
              subBuilder = playerAvatar_.toBuilder();
            }
            playerAvatar_ = input.readMessage(POGOProtos.Data.Player.PlayerAvatar.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(playerAvatar_);
              playerAvatar_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Requests.Messages.SetAvatarMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetAvatarMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.SetAvatarMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetAvatarMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.SetAvatarMessage.class, POGOProtos.Networking.Requests.Messages.SetAvatarMessage.Builder.class);
  }

  public static final int PLAYER_AVATAR_FIELD_NUMBER = 2;
  private POGOProtos.Data.Player.PlayerAvatar playerAvatar_;
  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
   * @return Whether the playerAvatar field is set.
   */
  @java.lang.Override
  public boolean hasPlayerAvatar() {
    return playerAvatar_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
   * @return The playerAvatar.
   */
  @java.lang.Override
  public POGOProtos.Data.Player.PlayerAvatar getPlayerAvatar() {
    return playerAvatar_ == null ? POGOProtos.Data.Player.PlayerAvatar.getDefaultInstance() : playerAvatar_;
  }
  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Player.PlayerAvatarOrBuilder getPlayerAvatarOrBuilder() {
    return getPlayerAvatar();
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
    if (playerAvatar_ != null) {
      output.writeMessage(2, getPlayerAvatar());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (playerAvatar_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayerAvatar());
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.SetAvatarMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.SetAvatarMessage other = (POGOProtos.Networking.Requests.Messages.SetAvatarMessage) obj;

    if (hasPlayerAvatar() != other.hasPlayerAvatar()) return false;
    if (hasPlayerAvatar()) {
      if (!getPlayerAvatar()
          .equals(other.getPlayerAvatar())) return false;
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
    if (hasPlayerAvatar()) {
      hash = (37 * hash) + PLAYER_AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerAvatar().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.SetAvatarMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.SetAvatarMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.SetAvatarMessage)
      POGOProtos.Networking.Requests.Messages.SetAvatarMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.SetAvatarMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetAvatarMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.SetAvatarMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetAvatarMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.SetAvatarMessage.class, POGOProtos.Networking.Requests.Messages.SetAvatarMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.SetAvatarMessage.newBuilder()
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
      if (playerAvatarBuilder_ == null) {
        playerAvatar_ = null;
      } else {
        playerAvatar_ = null;
        playerAvatarBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.SetAvatarMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetAvatarMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.SetAvatarMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.SetAvatarMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.SetAvatarMessage build() {
      POGOProtos.Networking.Requests.Messages.SetAvatarMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.SetAvatarMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.SetAvatarMessage result = new POGOProtos.Networking.Requests.Messages.SetAvatarMessage(this);
      if (playerAvatarBuilder_ == null) {
        result.playerAvatar_ = playerAvatar_;
      } else {
        result.playerAvatar_ = playerAvatarBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.SetAvatarMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.SetAvatarMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.SetAvatarMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.SetAvatarMessage.getDefaultInstance()) return this;
      if (other.hasPlayerAvatar()) {
        mergePlayerAvatar(other.getPlayerAvatar());
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
      POGOProtos.Networking.Requests.Messages.SetAvatarMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.SetAvatarMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Data.Player.PlayerAvatar playerAvatar_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Player.PlayerAvatar, POGOProtos.Data.Player.PlayerAvatar.Builder, POGOProtos.Data.Player.PlayerAvatarOrBuilder> playerAvatarBuilder_;
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     * @return Whether the playerAvatar field is set.
     */
    public boolean hasPlayerAvatar() {
      return playerAvatarBuilder_ != null || playerAvatar_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     * @return The playerAvatar.
     */
    public POGOProtos.Data.Player.PlayerAvatar getPlayerAvatar() {
      if (playerAvatarBuilder_ == null) {
        return playerAvatar_ == null ? POGOProtos.Data.Player.PlayerAvatar.getDefaultInstance() : playerAvatar_;
      } else {
        return playerAvatarBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    public Builder setPlayerAvatar(POGOProtos.Data.Player.PlayerAvatar value) {
      if (playerAvatarBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playerAvatar_ = value;
        onChanged();
      } else {
        playerAvatarBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    public Builder setPlayerAvatar(
        POGOProtos.Data.Player.PlayerAvatar.Builder builderForValue) {
      if (playerAvatarBuilder_ == null) {
        playerAvatar_ = builderForValue.build();
        onChanged();
      } else {
        playerAvatarBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    public Builder mergePlayerAvatar(POGOProtos.Data.Player.PlayerAvatar value) {
      if (playerAvatarBuilder_ == null) {
        if (playerAvatar_ != null) {
          playerAvatar_ =
            POGOProtos.Data.Player.PlayerAvatar.newBuilder(playerAvatar_).mergeFrom(value).buildPartial();
        } else {
          playerAvatar_ = value;
        }
        onChanged();
      } else {
        playerAvatarBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    public Builder clearPlayerAvatar() {
      if (playerAvatarBuilder_ == null) {
        playerAvatar_ = null;
        onChanged();
      } else {
        playerAvatar_ = null;
        playerAvatarBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    public POGOProtos.Data.Player.PlayerAvatar.Builder getPlayerAvatarBuilder() {
      
      onChanged();
      return getPlayerAvatarFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    public POGOProtos.Data.Player.PlayerAvatarOrBuilder getPlayerAvatarOrBuilder() {
      if (playerAvatarBuilder_ != null) {
        return playerAvatarBuilder_.getMessageOrBuilder();
      } else {
        return playerAvatar_ == null ?
            POGOProtos.Data.Player.PlayerAvatar.getDefaultInstance() : playerAvatar_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Player.PlayerAvatar player_avatar = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Player.PlayerAvatar, POGOProtos.Data.Player.PlayerAvatar.Builder, POGOProtos.Data.Player.PlayerAvatarOrBuilder> 
        getPlayerAvatarFieldBuilder() {
      if (playerAvatarBuilder_ == null) {
        playerAvatarBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Player.PlayerAvatar, POGOProtos.Data.Player.PlayerAvatar.Builder, POGOProtos.Data.Player.PlayerAvatarOrBuilder>(
                getPlayerAvatar(),
                getParentForChildren(),
                isClean());
        playerAvatar_ = null;
      }
      return playerAvatarBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.SetAvatarMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.SetAvatarMessage)
  private static final POGOProtos.Networking.Requests.Messages.SetAvatarMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.SetAvatarMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.SetAvatarMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAvatarMessage>
      PARSER = new com.google.protobuf.AbstractParser<SetAvatarMessage>() {
    @java.lang.Override
    public SetAvatarMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetAvatarMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetAvatarMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAvatarMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.SetAvatarMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

