// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/SetContactSettingsMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage}
 */
public  final class SetContactSettingsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage)
    SetContactSettingsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetContactSettingsMessage.newBuilder() to construct.
  private SetContactSettingsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetContactSettingsMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetContactSettingsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetContactSettingsMessage(
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
            POGOProtos.Settings.ContactSettings.Builder subBuilder = null;
            if (contactSettings_ != null) {
              subBuilder = contactSettings_.toBuilder();
            }
            contactSettings_ = input.readMessage(POGOProtos.Settings.ContactSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(contactSettings_);
              contactSettings_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Requests.Messages.SetContactSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetContactSettingsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.SetContactSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetContactSettingsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.class, POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.Builder.class);
  }

  public static final int CONTACT_SETTINGS_FIELD_NUMBER = 1;
  private POGOProtos.Settings.ContactSettings contactSettings_;
  /**
   * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
   * @return Whether the contactSettings field is set.
   */
  public boolean hasContactSettings() {
    return contactSettings_ != null;
  }
  /**
   * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
   * @return The contactSettings.
   */
  public POGOProtos.Settings.ContactSettings getContactSettings() {
    return contactSettings_ == null ? POGOProtos.Settings.ContactSettings.getDefaultInstance() : contactSettings_;
  }
  /**
   * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
   */
  public POGOProtos.Settings.ContactSettingsOrBuilder getContactSettingsOrBuilder() {
    return getContactSettings();
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
    if (contactSettings_ != null) {
      output.writeMessage(1, getContactSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contactSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContactSettings());
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage other = (POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage) obj;

    if (hasContactSettings() != other.hasContactSettings()) return false;
    if (hasContactSettings()) {
      if (!getContactSettings()
          .equals(other.getContactSettings())) return false;
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
    if (hasContactSettings()) {
      hash = (37 * hash) + CONTACT_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getContactSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage)
      POGOProtos.Networking.Requests.Messages.SetContactSettingsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.SetContactSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetContactSettingsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.SetContactSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetContactSettingsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.class, POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.newBuilder()
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
      if (contactSettingsBuilder_ == null) {
        contactSettings_ = null;
      } else {
        contactSettings_ = null;
        contactSettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.SetContactSettingsMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_SetContactSettingsMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage build() {
      POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage result = new POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage(this);
      if (contactSettingsBuilder_ == null) {
        result.contactSettings_ = contactSettings_;
      } else {
        result.contactSettings_ = contactSettingsBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage.getDefaultInstance()) return this;
      if (other.hasContactSettings()) {
        mergeContactSettings(other.getContactSettings());
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
      POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Settings.ContactSettings contactSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.ContactSettings, POGOProtos.Settings.ContactSettings.Builder, POGOProtos.Settings.ContactSettingsOrBuilder> contactSettingsBuilder_;
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     * @return Whether the contactSettings field is set.
     */
    public boolean hasContactSettings() {
      return contactSettingsBuilder_ != null || contactSettings_ != null;
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     * @return The contactSettings.
     */
    public POGOProtos.Settings.ContactSettings getContactSettings() {
      if (contactSettingsBuilder_ == null) {
        return contactSettings_ == null ? POGOProtos.Settings.ContactSettings.getDefaultInstance() : contactSettings_;
      } else {
        return contactSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    public Builder setContactSettings(POGOProtos.Settings.ContactSettings value) {
      if (contactSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contactSettings_ = value;
        onChanged();
      } else {
        contactSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    public Builder setContactSettings(
        POGOProtos.Settings.ContactSettings.Builder builderForValue) {
      if (contactSettingsBuilder_ == null) {
        contactSettings_ = builderForValue.build();
        onChanged();
      } else {
        contactSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    public Builder mergeContactSettings(POGOProtos.Settings.ContactSettings value) {
      if (contactSettingsBuilder_ == null) {
        if (contactSettings_ != null) {
          contactSettings_ =
            POGOProtos.Settings.ContactSettings.newBuilder(contactSettings_).mergeFrom(value).buildPartial();
        } else {
          contactSettings_ = value;
        }
        onChanged();
      } else {
        contactSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    public Builder clearContactSettings() {
      if (contactSettingsBuilder_ == null) {
        contactSettings_ = null;
        onChanged();
      } else {
        contactSettings_ = null;
        contactSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    public POGOProtos.Settings.ContactSettings.Builder getContactSettingsBuilder() {
      
      onChanged();
      return getContactSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    public POGOProtos.Settings.ContactSettingsOrBuilder getContactSettingsOrBuilder() {
      if (contactSettingsBuilder_ != null) {
        return contactSettingsBuilder_.getMessageOrBuilder();
      } else {
        return contactSettings_ == null ?
            POGOProtos.Settings.ContactSettings.getDefaultInstance() : contactSettings_;
      }
    }
    /**
     * <code>.POGOProtos.Settings.ContactSettings contact_settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Settings.ContactSettings, POGOProtos.Settings.ContactSettings.Builder, POGOProtos.Settings.ContactSettingsOrBuilder> 
        getContactSettingsFieldBuilder() {
      if (contactSettingsBuilder_ == null) {
        contactSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Settings.ContactSettings, POGOProtos.Settings.ContactSettings.Builder, POGOProtos.Settings.ContactSettingsOrBuilder>(
                getContactSettings(),
                getParentForChildren(),
                isClean());
        contactSettings_ = null;
      }
      return contactSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage)
  private static final POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetContactSettingsMessage>
      PARSER = new com.google.protobuf.AbstractParser<SetContactSettingsMessage>() {
    @java.lang.Override
    public SetContactSettingsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetContactSettingsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetContactSettingsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetContactSettingsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.SetContactSettingsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

