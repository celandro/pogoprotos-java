// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/ReplaceLoginActionMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage}
 */
public  final class ReplaceLoginActionMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage)
    ReplaceLoginActionMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplaceLoginActionMessage.newBuilder() to construct.
  private ReplaceLoginActionMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplaceLoginActionMessage() {
    existingIdentityProvider_ = 0;
    authProviderId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplaceLoginActionMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReplaceLoginActionMessage(
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

            existingIdentityProvider_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.Builder subBuilder = null;
            if (newLogin_ != null) {
              subBuilder = newLogin_.toBuilder();
            }
            newLogin_ = input.readMessage(POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(newLogin_);
              newLogin_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            authProviderId_ = s;
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
    return POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_ReplaceLoginActionMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_ReplaceLoginActionMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.class, POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.Builder.class);
  }

  public static final int EXISTING_IDENTITY_PROVIDER_FIELD_NUMBER = 1;
  private int existingIdentityProvider_;
  /**
   * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
   * @return The enum numeric value on the wire for existingIdentityProvider.
   */
  public int getExistingIdentityProviderValue() {
    return existingIdentityProvider_;
  }
  /**
   * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
   * @return The existingIdentityProvider.
   */
  public POGOProtos.Enums.IdentityProvider getExistingIdentityProvider() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.IdentityProvider result = POGOProtos.Enums.IdentityProvider.valueOf(existingIdentityProvider_);
    return result == null ? POGOProtos.Enums.IdentityProvider.UNRECOGNIZED : result;
  }

  public static final int NEW_LOGIN_FIELD_NUMBER = 2;
  private POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage newLogin_;
  /**
   * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
   * @return Whether the newLogin field is set.
   */
  public boolean hasNewLogin() {
    return newLogin_ != null;
  }
  /**
   * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
   * @return The newLogin.
   */
  public POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage getNewLogin() {
    return newLogin_ == null ? POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.getDefaultInstance() : newLogin_;
  }
  /**
   * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
   */
  public POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessageOrBuilder getNewLoginOrBuilder() {
    return getNewLogin();
  }

  public static final int AUTH_PROVIDER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object authProviderId_;
  /**
   * <code>string auth_provider_id = 3;</code>
   * @return The authProviderId.
   */
  public java.lang.String getAuthProviderId() {
    java.lang.Object ref = authProviderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authProviderId_ = s;
      return s;
    }
  }
  /**
   * <code>string auth_provider_id = 3;</code>
   * @return The bytes for authProviderId.
   */
  public com.google.protobuf.ByteString
      getAuthProviderIdBytes() {
    java.lang.Object ref = authProviderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authProviderId_ = b;
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
    if (existingIdentityProvider_ != POGOProtos.Enums.IdentityProvider.UNSET_IDENTITY_PROVIDER.getNumber()) {
      output.writeEnum(1, existingIdentityProvider_);
    }
    if (newLogin_ != null) {
      output.writeMessage(2, getNewLogin());
    }
    if (!getAuthProviderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, authProviderId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (existingIdentityProvider_ != POGOProtos.Enums.IdentityProvider.UNSET_IDENTITY_PROVIDER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, existingIdentityProvider_);
    }
    if (newLogin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNewLogin());
    }
    if (!getAuthProviderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, authProviderId_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage other = (POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage) obj;

    if (existingIdentityProvider_ != other.existingIdentityProvider_) return false;
    if (hasNewLogin() != other.hasNewLogin()) return false;
    if (hasNewLogin()) {
      if (!getNewLogin()
          .equals(other.getNewLogin())) return false;
    }
    if (!getAuthProviderId()
        .equals(other.getAuthProviderId())) return false;
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
    hash = (37 * hash) + EXISTING_IDENTITY_PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + existingIdentityProvider_;
    if (hasNewLogin()) {
      hash = (37 * hash) + NEW_LOGIN_FIELD_NUMBER;
      hash = (53 * hash) + getNewLogin().hashCode();
    }
    hash = (37 * hash) + AUTH_PROVIDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAuthProviderId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage)
      POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_ReplaceLoginActionMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_ReplaceLoginActionMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.class, POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.newBuilder()
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
      existingIdentityProvider_ = 0;

      if (newLoginBuilder_ == null) {
        newLogin_ = null;
      } else {
        newLogin_ = null;
        newLoginBuilder_ = null;
      }
      authProviderId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Platform_Requests_ReplaceLoginActionMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage build() {
      POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage buildPartial() {
      POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage result = new POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage(this);
      result.existingIdentityProvider_ = existingIdentityProvider_;
      if (newLoginBuilder_ == null) {
        result.newLogin_ = newLogin_;
      } else {
        result.newLogin_ = newLoginBuilder_.build();
      }
      result.authProviderId_ = authProviderId_;
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
      if (other instanceof POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage other) {
      if (other == POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage.getDefaultInstance()) return this;
      if (other.existingIdentityProvider_ != 0) {
        setExistingIdentityProviderValue(other.getExistingIdentityProviderValue());
      }
      if (other.hasNewLogin()) {
        mergeNewLogin(other.getNewLogin());
      }
      if (!other.getAuthProviderId().isEmpty()) {
        authProviderId_ = other.authProviderId_;
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
      POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int existingIdentityProvider_ = 0;
    /**
     * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
     * @return The enum numeric value on the wire for existingIdentityProvider.
     */
    public int getExistingIdentityProviderValue() {
      return existingIdentityProvider_;
    }
    /**
     * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
     * @param value The enum numeric value on the wire for existingIdentityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setExistingIdentityProviderValue(int value) {
      existingIdentityProvider_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
     * @return The existingIdentityProvider.
     */
    public POGOProtos.Enums.IdentityProvider getExistingIdentityProvider() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.IdentityProvider result = POGOProtos.Enums.IdentityProvider.valueOf(existingIdentityProvider_);
      return result == null ? POGOProtos.Enums.IdentityProvider.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
     * @param value The existingIdentityProvider to set.
     * @return This builder for chaining.
     */
    public Builder setExistingIdentityProvider(POGOProtos.Enums.IdentityProvider value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      existingIdentityProvider_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExistingIdentityProvider() {
      
      existingIdentityProvider_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage newLogin_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage, POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.Builder, POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessageOrBuilder> newLoginBuilder_;
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     * @return Whether the newLogin field is set.
     */
    public boolean hasNewLogin() {
      return newLoginBuilder_ != null || newLogin_ != null;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     * @return The newLogin.
     */
    public POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage getNewLogin() {
      if (newLoginBuilder_ == null) {
        return newLogin_ == null ? POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.getDefaultInstance() : newLogin_;
      } else {
        return newLoginBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    public Builder setNewLogin(POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage value) {
      if (newLoginBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newLogin_ = value;
        onChanged();
      } else {
        newLoginBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    public Builder setNewLogin(
        POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.Builder builderForValue) {
      if (newLoginBuilder_ == null) {
        newLogin_ = builderForValue.build();
        onChanged();
      } else {
        newLoginBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    public Builder mergeNewLogin(POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage value) {
      if (newLoginBuilder_ == null) {
        if (newLogin_ != null) {
          newLogin_ =
            POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.newBuilder(newLogin_).mergeFrom(value).buildPartial();
        } else {
          newLogin_ = value;
        }
        onChanged();
      } else {
        newLoginBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    public Builder clearNewLogin() {
      if (newLoginBuilder_ == null) {
        newLogin_ = null;
        onChanged();
      } else {
        newLogin_ = null;
        newLoginBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    public POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.Builder getNewLoginBuilder() {
      
      onChanged();
      return getNewLoginFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    public POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessageOrBuilder getNewLoginOrBuilder() {
      if (newLoginBuilder_ != null) {
        return newLoginBuilder_.getMessageOrBuilder();
      } else {
        return newLogin_ == null ?
            POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.getDefaultInstance() : newLogin_;
      }
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage, POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.Builder, POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessageOrBuilder> 
        getNewLoginFieldBuilder() {
      if (newLoginBuilder_ == null) {
        newLoginBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage, POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage.Builder, POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessageOrBuilder>(
                getNewLogin(),
                getParentForChildren(),
                isClean());
        newLogin_ = null;
      }
      return newLoginBuilder_;
    }

    private java.lang.Object authProviderId_ = "";
    /**
     * <code>string auth_provider_id = 3;</code>
     * @return The authProviderId.
     */
    public java.lang.String getAuthProviderId() {
      java.lang.Object ref = authProviderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authProviderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string auth_provider_id = 3;</code>
     * @return The bytes for authProviderId.
     */
    public com.google.protobuf.ByteString
        getAuthProviderIdBytes() {
      java.lang.Object ref = authProviderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authProviderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string auth_provider_id = 3;</code>
     * @param value The authProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthProviderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authProviderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string auth_provider_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthProviderId() {
      
      authProviderId_ = getDefaultInstance().getAuthProviderId();
      onChanged();
      return this;
    }
    /**
     * <code>string auth_provider_id = 3;</code>
     * @param value The bytes for authProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthProviderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authProviderId_ = value;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage)
  private static final POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage();
  }

  public static POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplaceLoginActionMessage>
      PARSER = new com.google.protobuf.AbstractParser<ReplaceLoginActionMessage>() {
    @java.lang.Override
    public ReplaceLoginActionMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReplaceLoginActionMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReplaceLoginActionMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplaceLoginActionMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Platform.Requests.ReplaceLoginActionMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

