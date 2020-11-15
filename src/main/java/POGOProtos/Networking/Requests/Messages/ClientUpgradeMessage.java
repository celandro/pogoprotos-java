// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ClientUpgradeMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage}
 */
public final class ClientUpgradeMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)
    ClientUpgradeMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientUpgradeMessage.newBuilder() to construct.
  private ClientUpgradeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientUpgradeMessage() {
    version_ = "";
    operatingSystem_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientUpgradeMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientUpgradeMessage(
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

            version_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            operatingSystem_ = rawValue;
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
    return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ClientUpgradeMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ClientUpgradeMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.class, POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem}
   */
  public enum ClientOperatingSystem
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OS_UNKNOWN = 0;</code>
     */
    OS_UNKNOWN(0),
    /**
     * <code>OS_ANDROID = 1;</code>
     */
    OS_ANDROID(1),
    /**
     * <code>OS_IOS = 2;</code>
     */
    OS_IOS(2),
    /**
     * <code>OS_DESKTOP = 3;</code>
     */
    OS_DESKTOP(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OS_UNKNOWN = 0;</code>
     */
    public static final int OS_UNKNOWN_VALUE = 0;
    /**
     * <code>OS_ANDROID = 1;</code>
     */
    public static final int OS_ANDROID_VALUE = 1;
    /**
     * <code>OS_IOS = 2;</code>
     */
    public static final int OS_IOS_VALUE = 2;
    /**
     * <code>OS_DESKTOP = 3;</code>
     */
    public static final int OS_DESKTOP_VALUE = 3;


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
    public static ClientOperatingSystem valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClientOperatingSystem forNumber(int value) {
      switch (value) {
        case 0: return OS_UNKNOWN;
        case 1: return OS_ANDROID;
        case 2: return OS_IOS;
        case 3: return OS_DESKTOP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClientOperatingSystem>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ClientOperatingSystem> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ClientOperatingSystem>() {
            public ClientOperatingSystem findValueByNumber(int number) {
              return ClientOperatingSystem.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClientOperatingSystem[] VALUES = values();

    public static ClientOperatingSystem valueOf(
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

    private ClientOperatingSystem(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem)
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATING_SYSTEM_FIELD_NUMBER = 2;
  private int operatingSystem_;
  /**
   * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
   * @return The enum numeric value on the wire for operatingSystem.
   */
  @java.lang.Override public int getOperatingSystemValue() {
    return operatingSystem_;
  }
  /**
   * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
   * @return The operatingSystem.
   */
  @java.lang.Override public POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem getOperatingSystem() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem result = POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem.valueOf(operatingSystem_);
    return result == null ? POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem.UNRECOGNIZED : result;
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
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (operatingSystem_ != POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem.OS_UNKNOWN.getNumber()) {
      output.writeEnum(2, operatingSystem_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (operatingSystem_ != POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem.OS_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, operatingSystem_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage other = (POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage) obj;

    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (operatingSystem_ != other.operatingSystem_) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + OPERATING_SYSTEM_FIELD_NUMBER;
    hash = (53 * hash) + operatingSystem_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)
      POGOProtos.Networking.Requests.Messages.ClientUpgradeMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ClientUpgradeMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ClientUpgradeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.class, POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.newBuilder()
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
      version_ = "";

      operatingSystem_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_ClientUpgradeMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage build() {
      POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage result = new POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage(this);
      result.version_ = version_;
      result.operatingSystem_ = operatingSystem_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.operatingSystem_ != 0) {
        setOperatingSystemValue(other.getOperatingSystemValue());
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
      POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 1;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 1;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 1;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private int operatingSystem_ = 0;
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
     * @return The enum numeric value on the wire for operatingSystem.
     */
    @java.lang.Override public int getOperatingSystemValue() {
      return operatingSystem_;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
     * @param value The enum numeric value on the wire for operatingSystem to set.
     * @return This builder for chaining.
     */
    public Builder setOperatingSystemValue(int value) {
      
      operatingSystem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
     * @return The operatingSystem.
     */
    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem getOperatingSystem() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem result = POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem.valueOf(operatingSystem_);
      return result == null ? POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
     * @param value The operatingSystem to set.
     * @return This builder for chaining.
     */
    public Builder setOperatingSystem(POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operatingSystem_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperatingSystem() {
      
      operatingSystem_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)
  private static final POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientUpgradeMessage>
      PARSER = new com.google.protobuf.AbstractParser<ClientUpgradeMessage>() {
    @java.lang.Override
    public ClientUpgradeMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientUpgradeMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientUpgradeMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientUpgradeMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

