// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/SocialClientSettings.proto

package POGOProtos.Settings;

/**
 * Protobuf type {@code POGOProtos.Settings.SocialClientSettings}
 */
public  final class SocialClientSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.SocialClientSettings)
    SocialClientSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocialClientSettings.newBuilder() to construct.
  private SocialClientSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocialClientSettings() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SocialClientSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocialClientSettings(
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

            enableSocial_ = input.readBool();
            break;
          }
          case 16: {

            maxFriendDetails_ = input.readInt32();
            break;
          }
          case 24: {

            playerLevelGate_ = input.readInt32();
            break;
          }
          case 32: {

            maxFriendNicknameLength_ = input.readInt32();
            break;
          }
          case 40: {

            enableAddFriendViaQrCode_ = input.readBool();
            break;
          }
          case 48: {

            enableShareExPass_ = input.readBool();
            break;
          }
          case 56: {

            enableFacebookFriends_ = input.readBool();
            break;
          }
          case 64: {

            facebookFriendLimitPerRequest_ = input.readInt32();
            break;
          }
          case 72: {

            disableFacebookFriendsOpeningPrompt_ = input.readBool();
            break;
          }
          case 88: {

            enableGiftabilityV2_ = input.readBool();
            break;
          }
          case 96: {

            enableRemoteGifting_ = input.readBool();
            break;
          }
          case 104: {

            enableSticker_ = input.readBool();
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
    return POGOProtos.Settings.SocialClientSettingsOuterClass.internal_static_POGOProtos_Settings_SocialClientSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.SocialClientSettingsOuterClass.internal_static_POGOProtos_Settings_SocialClientSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.SocialClientSettings.class, POGOProtos.Settings.SocialClientSettings.Builder.class);
  }

  public static final int ENABLE_SOCIAL_FIELD_NUMBER = 1;
  private boolean enableSocial_;
  /**
   * <code>bool enable_social = 1;</code>
   * @return The enableSocial.
   */
  public boolean getEnableSocial() {
    return enableSocial_;
  }

  public static final int MAX_FRIEND_DETAILS_FIELD_NUMBER = 2;
  private int maxFriendDetails_;
  /**
   * <code>int32 max_friend_details = 2;</code>
   * @return The maxFriendDetails.
   */
  public int getMaxFriendDetails() {
    return maxFriendDetails_;
  }

  public static final int PLAYER_LEVEL_GATE_FIELD_NUMBER = 3;
  private int playerLevelGate_;
  /**
   * <code>int32 player_level_gate = 3;</code>
   * @return The playerLevelGate.
   */
  public int getPlayerLevelGate() {
    return playerLevelGate_;
  }

  public static final int MAX_FRIEND_NICKNAME_LENGTH_FIELD_NUMBER = 4;
  private int maxFriendNicknameLength_;
  /**
   * <code>int32 max_friend_nickname_length = 4;</code>
   * @return The maxFriendNicknameLength.
   */
  public int getMaxFriendNicknameLength() {
    return maxFriendNicknameLength_;
  }

  public static final int ENABLE_ADD_FRIEND_VIA_QR_CODE_FIELD_NUMBER = 5;
  private boolean enableAddFriendViaQrCode_;
  /**
   * <code>bool enable_add_friend_via_qr_code = 5;</code>
   * @return The enableAddFriendViaQrCode.
   */
  public boolean getEnableAddFriendViaQrCode() {
    return enableAddFriendViaQrCode_;
  }

  public static final int ENABLE_SHARE_EX_PASS_FIELD_NUMBER = 6;
  private boolean enableShareExPass_;
  /**
   * <code>bool enable_share_ex_pass = 6;</code>
   * @return The enableShareExPass.
   */
  public boolean getEnableShareExPass() {
    return enableShareExPass_;
  }

  public static final int ENABLE_FACEBOOK_FRIENDS_FIELD_NUMBER = 7;
  private boolean enableFacebookFriends_;
  /**
   * <code>bool enable_facebook_friends = 7;</code>
   * @return The enableFacebookFriends.
   */
  public boolean getEnableFacebookFriends() {
    return enableFacebookFriends_;
  }

  public static final int FACEBOOK_FRIEND_LIMIT_PER_REQUEST_FIELD_NUMBER = 8;
  private int facebookFriendLimitPerRequest_;
  /**
   * <code>int32 facebook_friend_limit_per_request = 8;</code>
   * @return The facebookFriendLimitPerRequest.
   */
  public int getFacebookFriendLimitPerRequest() {
    return facebookFriendLimitPerRequest_;
  }

  public static final int DISABLE_FACEBOOK_FRIENDS_OPENING_PROMPT_FIELD_NUMBER = 9;
  private boolean disableFacebookFriendsOpeningPrompt_;
  /**
   * <code>bool disable_facebook_friends_opening_prompt = 9;</code>
   * @return The disableFacebookFriendsOpeningPrompt.
   */
  public boolean getDisableFacebookFriendsOpeningPrompt() {
    return disableFacebookFriendsOpeningPrompt_;
  }

  public static final int ENABLE_GIFTABILITY_V2_FIELD_NUMBER = 11;
  private boolean enableGiftabilityV2_;
  /**
   * <code>bool enable_giftability_v2 = 11;</code>
   * @return The enableGiftabilityV2.
   */
  public boolean getEnableGiftabilityV2() {
    return enableGiftabilityV2_;
  }

  public static final int ENABLE_REMOTE_GIFTING_FIELD_NUMBER = 12;
  private boolean enableRemoteGifting_;
  /**
   * <code>bool enable_remote_gifting = 12;</code>
   * @return The enableRemoteGifting.
   */
  public boolean getEnableRemoteGifting() {
    return enableRemoteGifting_;
  }

  public static final int ENABLE_STICKER_FIELD_NUMBER = 13;
  private boolean enableSticker_;
  /**
   * <code>bool enable_sticker = 13;</code>
   * @return The enableSticker.
   */
  public boolean getEnableSticker() {
    return enableSticker_;
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
    if (enableSocial_ != false) {
      output.writeBool(1, enableSocial_);
    }
    if (maxFriendDetails_ != 0) {
      output.writeInt32(2, maxFriendDetails_);
    }
    if (playerLevelGate_ != 0) {
      output.writeInt32(3, playerLevelGate_);
    }
    if (maxFriendNicknameLength_ != 0) {
      output.writeInt32(4, maxFriendNicknameLength_);
    }
    if (enableAddFriendViaQrCode_ != false) {
      output.writeBool(5, enableAddFriendViaQrCode_);
    }
    if (enableShareExPass_ != false) {
      output.writeBool(6, enableShareExPass_);
    }
    if (enableFacebookFriends_ != false) {
      output.writeBool(7, enableFacebookFriends_);
    }
    if (facebookFriendLimitPerRequest_ != 0) {
      output.writeInt32(8, facebookFriendLimitPerRequest_);
    }
    if (disableFacebookFriendsOpeningPrompt_ != false) {
      output.writeBool(9, disableFacebookFriendsOpeningPrompt_);
    }
    if (enableGiftabilityV2_ != false) {
      output.writeBool(11, enableGiftabilityV2_);
    }
    if (enableRemoteGifting_ != false) {
      output.writeBool(12, enableRemoteGifting_);
    }
    if (enableSticker_ != false) {
      output.writeBool(13, enableSticker_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableSocial_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableSocial_);
    }
    if (maxFriendDetails_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxFriendDetails_);
    }
    if (playerLevelGate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, playerLevelGate_);
    }
    if (maxFriendNicknameLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxFriendNicknameLength_);
    }
    if (enableAddFriendViaQrCode_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, enableAddFriendViaQrCode_);
    }
    if (enableShareExPass_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, enableShareExPass_);
    }
    if (enableFacebookFriends_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, enableFacebookFriends_);
    }
    if (facebookFriendLimitPerRequest_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, facebookFriendLimitPerRequest_);
    }
    if (disableFacebookFriendsOpeningPrompt_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, disableFacebookFriendsOpeningPrompt_);
    }
    if (enableGiftabilityV2_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, enableGiftabilityV2_);
    }
    if (enableRemoteGifting_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, enableRemoteGifting_);
    }
    if (enableSticker_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(13, enableSticker_);
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
    if (!(obj instanceof POGOProtos.Settings.SocialClientSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.SocialClientSettings other = (POGOProtos.Settings.SocialClientSettings) obj;

    if (getEnableSocial()
        != other.getEnableSocial()) return false;
    if (getMaxFriendDetails()
        != other.getMaxFriendDetails()) return false;
    if (getPlayerLevelGate()
        != other.getPlayerLevelGate()) return false;
    if (getMaxFriendNicknameLength()
        != other.getMaxFriendNicknameLength()) return false;
    if (getEnableAddFriendViaQrCode()
        != other.getEnableAddFriendViaQrCode()) return false;
    if (getEnableShareExPass()
        != other.getEnableShareExPass()) return false;
    if (getEnableFacebookFriends()
        != other.getEnableFacebookFriends()) return false;
    if (getFacebookFriendLimitPerRequest()
        != other.getFacebookFriendLimitPerRequest()) return false;
    if (getDisableFacebookFriendsOpeningPrompt()
        != other.getDisableFacebookFriendsOpeningPrompt()) return false;
    if (getEnableGiftabilityV2()
        != other.getEnableGiftabilityV2()) return false;
    if (getEnableRemoteGifting()
        != other.getEnableRemoteGifting()) return false;
    if (getEnableSticker()
        != other.getEnableSticker()) return false;
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
    hash = (37 * hash) + ENABLE_SOCIAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableSocial());
    hash = (37 * hash) + MAX_FRIEND_DETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxFriendDetails();
    hash = (37 * hash) + PLAYER_LEVEL_GATE_FIELD_NUMBER;
    hash = (53 * hash) + getPlayerLevelGate();
    hash = (37 * hash) + MAX_FRIEND_NICKNAME_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxFriendNicknameLength();
    hash = (37 * hash) + ENABLE_ADD_FRIEND_VIA_QR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableAddFriendViaQrCode());
    hash = (37 * hash) + ENABLE_SHARE_EX_PASS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableShareExPass());
    hash = (37 * hash) + ENABLE_FACEBOOK_FRIENDS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableFacebookFriends());
    hash = (37 * hash) + FACEBOOK_FRIEND_LIMIT_PER_REQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getFacebookFriendLimitPerRequest();
    hash = (37 * hash) + DISABLE_FACEBOOK_FRIENDS_OPENING_PROMPT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableFacebookFriendsOpeningPrompt());
    hash = (37 * hash) + ENABLE_GIFTABILITY_V2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableGiftabilityV2());
    hash = (37 * hash) + ENABLE_REMOTE_GIFTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableRemoteGifting());
    hash = (37 * hash) + ENABLE_STICKER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableSticker());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.SocialClientSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.SocialClientSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.SocialClientSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.SocialClientSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.SocialClientSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.SocialClientSettings)
      POGOProtos.Settings.SocialClientSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.SocialClientSettingsOuterClass.internal_static_POGOProtos_Settings_SocialClientSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.SocialClientSettingsOuterClass.internal_static_POGOProtos_Settings_SocialClientSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.SocialClientSettings.class, POGOProtos.Settings.SocialClientSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.SocialClientSettings.newBuilder()
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
      enableSocial_ = false;

      maxFriendDetails_ = 0;

      playerLevelGate_ = 0;

      maxFriendNicknameLength_ = 0;

      enableAddFriendViaQrCode_ = false;

      enableShareExPass_ = false;

      enableFacebookFriends_ = false;

      facebookFriendLimitPerRequest_ = 0;

      disableFacebookFriendsOpeningPrompt_ = false;

      enableGiftabilityV2_ = false;

      enableRemoteGifting_ = false;

      enableSticker_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.SocialClientSettingsOuterClass.internal_static_POGOProtos_Settings_SocialClientSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.SocialClientSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.SocialClientSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.SocialClientSettings build() {
      POGOProtos.Settings.SocialClientSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.SocialClientSettings buildPartial() {
      POGOProtos.Settings.SocialClientSettings result = new POGOProtos.Settings.SocialClientSettings(this);
      result.enableSocial_ = enableSocial_;
      result.maxFriendDetails_ = maxFriendDetails_;
      result.playerLevelGate_ = playerLevelGate_;
      result.maxFriendNicknameLength_ = maxFriendNicknameLength_;
      result.enableAddFriendViaQrCode_ = enableAddFriendViaQrCode_;
      result.enableShareExPass_ = enableShareExPass_;
      result.enableFacebookFriends_ = enableFacebookFriends_;
      result.facebookFriendLimitPerRequest_ = facebookFriendLimitPerRequest_;
      result.disableFacebookFriendsOpeningPrompt_ = disableFacebookFriendsOpeningPrompt_;
      result.enableGiftabilityV2_ = enableGiftabilityV2_;
      result.enableRemoteGifting_ = enableRemoteGifting_;
      result.enableSticker_ = enableSticker_;
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
      if (other instanceof POGOProtos.Settings.SocialClientSettings) {
        return mergeFrom((POGOProtos.Settings.SocialClientSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.SocialClientSettings other) {
      if (other == POGOProtos.Settings.SocialClientSettings.getDefaultInstance()) return this;
      if (other.getEnableSocial() != false) {
        setEnableSocial(other.getEnableSocial());
      }
      if (other.getMaxFriendDetails() != 0) {
        setMaxFriendDetails(other.getMaxFriendDetails());
      }
      if (other.getPlayerLevelGate() != 0) {
        setPlayerLevelGate(other.getPlayerLevelGate());
      }
      if (other.getMaxFriendNicknameLength() != 0) {
        setMaxFriendNicknameLength(other.getMaxFriendNicknameLength());
      }
      if (other.getEnableAddFriendViaQrCode() != false) {
        setEnableAddFriendViaQrCode(other.getEnableAddFriendViaQrCode());
      }
      if (other.getEnableShareExPass() != false) {
        setEnableShareExPass(other.getEnableShareExPass());
      }
      if (other.getEnableFacebookFriends() != false) {
        setEnableFacebookFriends(other.getEnableFacebookFriends());
      }
      if (other.getFacebookFriendLimitPerRequest() != 0) {
        setFacebookFriendLimitPerRequest(other.getFacebookFriendLimitPerRequest());
      }
      if (other.getDisableFacebookFriendsOpeningPrompt() != false) {
        setDisableFacebookFriendsOpeningPrompt(other.getDisableFacebookFriendsOpeningPrompt());
      }
      if (other.getEnableGiftabilityV2() != false) {
        setEnableGiftabilityV2(other.getEnableGiftabilityV2());
      }
      if (other.getEnableRemoteGifting() != false) {
        setEnableRemoteGifting(other.getEnableRemoteGifting());
      }
      if (other.getEnableSticker() != false) {
        setEnableSticker(other.getEnableSticker());
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
      POGOProtos.Settings.SocialClientSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.SocialClientSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableSocial_ ;
    /**
     * <code>bool enable_social = 1;</code>
     * @return The enableSocial.
     */
    public boolean getEnableSocial() {
      return enableSocial_;
    }
    /**
     * <code>bool enable_social = 1;</code>
     * @param value The enableSocial to set.
     * @return This builder for chaining.
     */
    public Builder setEnableSocial(boolean value) {
      
      enableSocial_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_social = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableSocial() {
      
      enableSocial_ = false;
      onChanged();
      return this;
    }

    private int maxFriendDetails_ ;
    /**
     * <code>int32 max_friend_details = 2;</code>
     * @return The maxFriendDetails.
     */
    public int getMaxFriendDetails() {
      return maxFriendDetails_;
    }
    /**
     * <code>int32 max_friend_details = 2;</code>
     * @param value The maxFriendDetails to set.
     * @return This builder for chaining.
     */
    public Builder setMaxFriendDetails(int value) {
      
      maxFriendDetails_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_friend_details = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxFriendDetails() {
      
      maxFriendDetails_ = 0;
      onChanged();
      return this;
    }

    private int playerLevelGate_ ;
    /**
     * <code>int32 player_level_gate = 3;</code>
     * @return The playerLevelGate.
     */
    public int getPlayerLevelGate() {
      return playerLevelGate_;
    }
    /**
     * <code>int32 player_level_gate = 3;</code>
     * @param value The playerLevelGate to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerLevelGate(int value) {
      
      playerLevelGate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 player_level_gate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerLevelGate() {
      
      playerLevelGate_ = 0;
      onChanged();
      return this;
    }

    private int maxFriendNicknameLength_ ;
    /**
     * <code>int32 max_friend_nickname_length = 4;</code>
     * @return The maxFriendNicknameLength.
     */
    public int getMaxFriendNicknameLength() {
      return maxFriendNicknameLength_;
    }
    /**
     * <code>int32 max_friend_nickname_length = 4;</code>
     * @param value The maxFriendNicknameLength to set.
     * @return This builder for chaining.
     */
    public Builder setMaxFriendNicknameLength(int value) {
      
      maxFriendNicknameLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_friend_nickname_length = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxFriendNicknameLength() {
      
      maxFriendNicknameLength_ = 0;
      onChanged();
      return this;
    }

    private boolean enableAddFriendViaQrCode_ ;
    /**
     * <code>bool enable_add_friend_via_qr_code = 5;</code>
     * @return The enableAddFriendViaQrCode.
     */
    public boolean getEnableAddFriendViaQrCode() {
      return enableAddFriendViaQrCode_;
    }
    /**
     * <code>bool enable_add_friend_via_qr_code = 5;</code>
     * @param value The enableAddFriendViaQrCode to set.
     * @return This builder for chaining.
     */
    public Builder setEnableAddFriendViaQrCode(boolean value) {
      
      enableAddFriendViaQrCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_add_friend_via_qr_code = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableAddFriendViaQrCode() {
      
      enableAddFriendViaQrCode_ = false;
      onChanged();
      return this;
    }

    private boolean enableShareExPass_ ;
    /**
     * <code>bool enable_share_ex_pass = 6;</code>
     * @return The enableShareExPass.
     */
    public boolean getEnableShareExPass() {
      return enableShareExPass_;
    }
    /**
     * <code>bool enable_share_ex_pass = 6;</code>
     * @param value The enableShareExPass to set.
     * @return This builder for chaining.
     */
    public Builder setEnableShareExPass(boolean value) {
      
      enableShareExPass_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_share_ex_pass = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableShareExPass() {
      
      enableShareExPass_ = false;
      onChanged();
      return this;
    }

    private boolean enableFacebookFriends_ ;
    /**
     * <code>bool enable_facebook_friends = 7;</code>
     * @return The enableFacebookFriends.
     */
    public boolean getEnableFacebookFriends() {
      return enableFacebookFriends_;
    }
    /**
     * <code>bool enable_facebook_friends = 7;</code>
     * @param value The enableFacebookFriends to set.
     * @return This builder for chaining.
     */
    public Builder setEnableFacebookFriends(boolean value) {
      
      enableFacebookFriends_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_facebook_friends = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableFacebookFriends() {
      
      enableFacebookFriends_ = false;
      onChanged();
      return this;
    }

    private int facebookFriendLimitPerRequest_ ;
    /**
     * <code>int32 facebook_friend_limit_per_request = 8;</code>
     * @return The facebookFriendLimitPerRequest.
     */
    public int getFacebookFriendLimitPerRequest() {
      return facebookFriendLimitPerRequest_;
    }
    /**
     * <code>int32 facebook_friend_limit_per_request = 8;</code>
     * @param value The facebookFriendLimitPerRequest to set.
     * @return This builder for chaining.
     */
    public Builder setFacebookFriendLimitPerRequest(int value) {
      
      facebookFriendLimitPerRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 facebook_friend_limit_per_request = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearFacebookFriendLimitPerRequest() {
      
      facebookFriendLimitPerRequest_ = 0;
      onChanged();
      return this;
    }

    private boolean disableFacebookFriendsOpeningPrompt_ ;
    /**
     * <code>bool disable_facebook_friends_opening_prompt = 9;</code>
     * @return The disableFacebookFriendsOpeningPrompt.
     */
    public boolean getDisableFacebookFriendsOpeningPrompt() {
      return disableFacebookFriendsOpeningPrompt_;
    }
    /**
     * <code>bool disable_facebook_friends_opening_prompt = 9;</code>
     * @param value The disableFacebookFriendsOpeningPrompt to set.
     * @return This builder for chaining.
     */
    public Builder setDisableFacebookFriendsOpeningPrompt(boolean value) {
      
      disableFacebookFriendsOpeningPrompt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool disable_facebook_friends_opening_prompt = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableFacebookFriendsOpeningPrompt() {
      
      disableFacebookFriendsOpeningPrompt_ = false;
      onChanged();
      return this;
    }

    private boolean enableGiftabilityV2_ ;
    /**
     * <code>bool enable_giftability_v2 = 11;</code>
     * @return The enableGiftabilityV2.
     */
    public boolean getEnableGiftabilityV2() {
      return enableGiftabilityV2_;
    }
    /**
     * <code>bool enable_giftability_v2 = 11;</code>
     * @param value The enableGiftabilityV2 to set.
     * @return This builder for chaining.
     */
    public Builder setEnableGiftabilityV2(boolean value) {
      
      enableGiftabilityV2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_giftability_v2 = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableGiftabilityV2() {
      
      enableGiftabilityV2_ = false;
      onChanged();
      return this;
    }

    private boolean enableRemoteGifting_ ;
    /**
     * <code>bool enable_remote_gifting = 12;</code>
     * @return The enableRemoteGifting.
     */
    public boolean getEnableRemoteGifting() {
      return enableRemoteGifting_;
    }
    /**
     * <code>bool enable_remote_gifting = 12;</code>
     * @param value The enableRemoteGifting to set.
     * @return This builder for chaining.
     */
    public Builder setEnableRemoteGifting(boolean value) {
      
      enableRemoteGifting_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_remote_gifting = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableRemoteGifting() {
      
      enableRemoteGifting_ = false;
      onChanged();
      return this;
    }

    private boolean enableSticker_ ;
    /**
     * <code>bool enable_sticker = 13;</code>
     * @return The enableSticker.
     */
    public boolean getEnableSticker() {
      return enableSticker_;
    }
    /**
     * <code>bool enable_sticker = 13;</code>
     * @param value The enableSticker to set.
     * @return This builder for chaining.
     */
    public Builder setEnableSticker(boolean value) {
      
      enableSticker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_sticker = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableSticker() {
      
      enableSticker_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.SocialClientSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.SocialClientSettings)
  private static final POGOProtos.Settings.SocialClientSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.SocialClientSettings();
  }

  public static POGOProtos.Settings.SocialClientSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocialClientSettings>
      PARSER = new com.google.protobuf.AbstractParser<SocialClientSettings>() {
    @java.lang.Override
    public SocialClientSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocialClientSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocialClientSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SocialClientSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.SocialClientSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

