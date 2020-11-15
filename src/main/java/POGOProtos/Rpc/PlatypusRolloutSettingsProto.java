// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.PlatypusRolloutSettingsProto}
 */
public final class PlatypusRolloutSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PlatypusRolloutSettingsProto)
    PlatypusRolloutSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlatypusRolloutSettingsProto.newBuilder() to construct.
  private PlatypusRolloutSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlatypusRolloutSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlatypusRolloutSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PlatypusRolloutSettingsProto(
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

            buddyV2MinPlayerLevel_ = input.readInt32();
            break;
          }
          case 16: {

            buddyMultiplayerMinPlayerLevel_ = input.readInt32();
            break;
          }
          case 24: {

            enableMonodepth_ = input.readBool();
            break;
          }
          case 34: {
            POGOProtos.Rpc.WallabySettingsProto.Builder subBuilder = null;
            if (wallabySettings_ != null) {
              subBuilder = wallabySettings_.toBuilder();
            }
            wallabySettings_ = input.readMessage(POGOProtos.Rpc.WallabySettingsProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(wallabySettings_);
              wallabySettings_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatypusRolloutSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatypusRolloutSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PlatypusRolloutSettingsProto.class, POGOProtos.Rpc.PlatypusRolloutSettingsProto.Builder.class);
  }

  public static final int BUDDY_V2_MIN_PLAYER_LEVEL_FIELD_NUMBER = 1;
  private int buddyV2MinPlayerLevel_;
  /**
   * <code>int32 buddy_v2_min_player_level = 1;</code>
   * @return The buddyV2MinPlayerLevel.
   */
  @java.lang.Override
  public int getBuddyV2MinPlayerLevel() {
    return buddyV2MinPlayerLevel_;
  }

  public static final int BUDDY_MULTIPLAYER_MIN_PLAYER_LEVEL_FIELD_NUMBER = 2;
  private int buddyMultiplayerMinPlayerLevel_;
  /**
   * <code>int32 buddy_multiplayer_min_player_level = 2;</code>
   * @return The buddyMultiplayerMinPlayerLevel.
   */
  @java.lang.Override
  public int getBuddyMultiplayerMinPlayerLevel() {
    return buddyMultiplayerMinPlayerLevel_;
  }

  public static final int ENABLE_MONODEPTH_FIELD_NUMBER = 3;
  private boolean enableMonodepth_;
  /**
   * <code>bool enable_monodepth = 3;</code>
   * @return The enableMonodepth.
   */
  @java.lang.Override
  public boolean getEnableMonodepth() {
    return enableMonodepth_;
  }

  public static final int WALLABY_SETTINGS_FIELD_NUMBER = 4;
  private POGOProtos.Rpc.WallabySettingsProto wallabySettings_;
  /**
   * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
   * @return Whether the wallabySettings field is set.
   */
  @java.lang.Override
  public boolean hasWallabySettings() {
    return wallabySettings_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
   * @return The wallabySettings.
   */
  @java.lang.Override
  public POGOProtos.Rpc.WallabySettingsProto getWallabySettings() {
    return wallabySettings_ == null ? POGOProtos.Rpc.WallabySettingsProto.getDefaultInstance() : wallabySettings_;
  }
  /**
   * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.WallabySettingsProtoOrBuilder getWallabySettingsOrBuilder() {
    return getWallabySettings();
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
    if (buddyV2MinPlayerLevel_ != 0) {
      output.writeInt32(1, buddyV2MinPlayerLevel_);
    }
    if (buddyMultiplayerMinPlayerLevel_ != 0) {
      output.writeInt32(2, buddyMultiplayerMinPlayerLevel_);
    }
    if (enableMonodepth_ != false) {
      output.writeBool(3, enableMonodepth_);
    }
    if (wallabySettings_ != null) {
      output.writeMessage(4, getWallabySettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (buddyV2MinPlayerLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, buddyV2MinPlayerLevel_);
    }
    if (buddyMultiplayerMinPlayerLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, buddyMultiplayerMinPlayerLevel_);
    }
    if (enableMonodepth_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enableMonodepth_);
    }
    if (wallabySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getWallabySettings());
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
    if (!(obj instanceof POGOProtos.Rpc.PlatypusRolloutSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PlatypusRolloutSettingsProto other = (POGOProtos.Rpc.PlatypusRolloutSettingsProto) obj;

    if (getBuddyV2MinPlayerLevel()
        != other.getBuddyV2MinPlayerLevel()) return false;
    if (getBuddyMultiplayerMinPlayerLevel()
        != other.getBuddyMultiplayerMinPlayerLevel()) return false;
    if (getEnableMonodepth()
        != other.getEnableMonodepth()) return false;
    if (hasWallabySettings() != other.hasWallabySettings()) return false;
    if (hasWallabySettings()) {
      if (!getWallabySettings()
          .equals(other.getWallabySettings())) return false;
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
    hash = (37 * hash) + BUDDY_V2_MIN_PLAYER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getBuddyV2MinPlayerLevel();
    hash = (37 * hash) + BUDDY_MULTIPLAYER_MIN_PLAYER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getBuddyMultiplayerMinPlayerLevel();
    hash = (37 * hash) + ENABLE_MONODEPTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableMonodepth());
    if (hasWallabySettings()) {
      hash = (37 * hash) + WALLABY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getWallabySettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PlatypusRolloutSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.PlatypusRolloutSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PlatypusRolloutSettingsProto)
      POGOProtos.Rpc.PlatypusRolloutSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatypusRolloutSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatypusRolloutSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PlatypusRolloutSettingsProto.class, POGOProtos.Rpc.PlatypusRolloutSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PlatypusRolloutSettingsProto.newBuilder()
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
      buddyV2MinPlayerLevel_ = 0;

      buddyMultiplayerMinPlayerLevel_ = 0;

      enableMonodepth_ = false;

      if (wallabySettingsBuilder_ == null) {
        wallabySettings_ = null;
      } else {
        wallabySettings_ = null;
        wallabySettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_PlatypusRolloutSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatypusRolloutSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.PlatypusRolloutSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatypusRolloutSettingsProto build() {
      POGOProtos.Rpc.PlatypusRolloutSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PlatypusRolloutSettingsProto buildPartial() {
      POGOProtos.Rpc.PlatypusRolloutSettingsProto result = new POGOProtos.Rpc.PlatypusRolloutSettingsProto(this);
      result.buddyV2MinPlayerLevel_ = buddyV2MinPlayerLevel_;
      result.buddyMultiplayerMinPlayerLevel_ = buddyMultiplayerMinPlayerLevel_;
      result.enableMonodepth_ = enableMonodepth_;
      if (wallabySettingsBuilder_ == null) {
        result.wallabySettings_ = wallabySettings_;
      } else {
        result.wallabySettings_ = wallabySettingsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.PlatypusRolloutSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.PlatypusRolloutSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PlatypusRolloutSettingsProto other) {
      if (other == POGOProtos.Rpc.PlatypusRolloutSettingsProto.getDefaultInstance()) return this;
      if (other.getBuddyV2MinPlayerLevel() != 0) {
        setBuddyV2MinPlayerLevel(other.getBuddyV2MinPlayerLevel());
      }
      if (other.getBuddyMultiplayerMinPlayerLevel() != 0) {
        setBuddyMultiplayerMinPlayerLevel(other.getBuddyMultiplayerMinPlayerLevel());
      }
      if (other.getEnableMonodepth() != false) {
        setEnableMonodepth(other.getEnableMonodepth());
      }
      if (other.hasWallabySettings()) {
        mergeWallabySettings(other.getWallabySettings());
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
      POGOProtos.Rpc.PlatypusRolloutSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PlatypusRolloutSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int buddyV2MinPlayerLevel_ ;
    /**
     * <code>int32 buddy_v2_min_player_level = 1;</code>
     * @return The buddyV2MinPlayerLevel.
     */
    @java.lang.Override
    public int getBuddyV2MinPlayerLevel() {
      return buddyV2MinPlayerLevel_;
    }
    /**
     * <code>int32 buddy_v2_min_player_level = 1;</code>
     * @param value The buddyV2MinPlayerLevel to set.
     * @return This builder for chaining.
     */
    public Builder setBuddyV2MinPlayerLevel(int value) {
      
      buddyV2MinPlayerLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 buddy_v2_min_player_level = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuddyV2MinPlayerLevel() {
      
      buddyV2MinPlayerLevel_ = 0;
      onChanged();
      return this;
    }

    private int buddyMultiplayerMinPlayerLevel_ ;
    /**
     * <code>int32 buddy_multiplayer_min_player_level = 2;</code>
     * @return The buddyMultiplayerMinPlayerLevel.
     */
    @java.lang.Override
    public int getBuddyMultiplayerMinPlayerLevel() {
      return buddyMultiplayerMinPlayerLevel_;
    }
    /**
     * <code>int32 buddy_multiplayer_min_player_level = 2;</code>
     * @param value The buddyMultiplayerMinPlayerLevel to set.
     * @return This builder for chaining.
     */
    public Builder setBuddyMultiplayerMinPlayerLevel(int value) {
      
      buddyMultiplayerMinPlayerLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 buddy_multiplayer_min_player_level = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuddyMultiplayerMinPlayerLevel() {
      
      buddyMultiplayerMinPlayerLevel_ = 0;
      onChanged();
      return this;
    }

    private boolean enableMonodepth_ ;
    /**
     * <code>bool enable_monodepth = 3;</code>
     * @return The enableMonodepth.
     */
    @java.lang.Override
    public boolean getEnableMonodepth() {
      return enableMonodepth_;
    }
    /**
     * <code>bool enable_monodepth = 3;</code>
     * @param value The enableMonodepth to set.
     * @return This builder for chaining.
     */
    public Builder setEnableMonodepth(boolean value) {
      
      enableMonodepth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_monodepth = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableMonodepth() {
      
      enableMonodepth_ = false;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.WallabySettingsProto wallabySettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.WallabySettingsProto, POGOProtos.Rpc.WallabySettingsProto.Builder, POGOProtos.Rpc.WallabySettingsProtoOrBuilder> wallabySettingsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     * @return Whether the wallabySettings field is set.
     */
    public boolean hasWallabySettings() {
      return wallabySettingsBuilder_ != null || wallabySettings_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     * @return The wallabySettings.
     */
    public POGOProtos.Rpc.WallabySettingsProto getWallabySettings() {
      if (wallabySettingsBuilder_ == null) {
        return wallabySettings_ == null ? POGOProtos.Rpc.WallabySettingsProto.getDefaultInstance() : wallabySettings_;
      } else {
        return wallabySettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    public Builder setWallabySettings(POGOProtos.Rpc.WallabySettingsProto value) {
      if (wallabySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wallabySettings_ = value;
        onChanged();
      } else {
        wallabySettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    public Builder setWallabySettings(
        POGOProtos.Rpc.WallabySettingsProto.Builder builderForValue) {
      if (wallabySettingsBuilder_ == null) {
        wallabySettings_ = builderForValue.build();
        onChanged();
      } else {
        wallabySettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    public Builder mergeWallabySettings(POGOProtos.Rpc.WallabySettingsProto value) {
      if (wallabySettingsBuilder_ == null) {
        if (wallabySettings_ != null) {
          wallabySettings_ =
            POGOProtos.Rpc.WallabySettingsProto.newBuilder(wallabySettings_).mergeFrom(value).buildPartial();
        } else {
          wallabySettings_ = value;
        }
        onChanged();
      } else {
        wallabySettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    public Builder clearWallabySettings() {
      if (wallabySettingsBuilder_ == null) {
        wallabySettings_ = null;
        onChanged();
      } else {
        wallabySettings_ = null;
        wallabySettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    public POGOProtos.Rpc.WallabySettingsProto.Builder getWallabySettingsBuilder() {
      
      onChanged();
      return getWallabySettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    public POGOProtos.Rpc.WallabySettingsProtoOrBuilder getWallabySettingsOrBuilder() {
      if (wallabySettingsBuilder_ != null) {
        return wallabySettingsBuilder_.getMessageOrBuilder();
      } else {
        return wallabySettings_ == null ?
            POGOProtos.Rpc.WallabySettingsProto.getDefaultInstance() : wallabySettings_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.WallabySettingsProto wallaby_settings = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.WallabySettingsProto, POGOProtos.Rpc.WallabySettingsProto.Builder, POGOProtos.Rpc.WallabySettingsProtoOrBuilder> 
        getWallabySettingsFieldBuilder() {
      if (wallabySettingsBuilder_ == null) {
        wallabySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.WallabySettingsProto, POGOProtos.Rpc.WallabySettingsProto.Builder, POGOProtos.Rpc.WallabySettingsProtoOrBuilder>(
                getWallabySettings(),
                getParentForChildren(),
                isClean());
        wallabySettings_ = null;
      }
      return wallabySettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PlatypusRolloutSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PlatypusRolloutSettingsProto)
  private static final POGOProtos.Rpc.PlatypusRolloutSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PlatypusRolloutSettingsProto();
  }

  public static POGOProtos.Rpc.PlatypusRolloutSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlatypusRolloutSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<PlatypusRolloutSettingsProto>() {
    @java.lang.Override
    public PlatypusRolloutSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PlatypusRolloutSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlatypusRolloutSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlatypusRolloutSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PlatypusRolloutSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

