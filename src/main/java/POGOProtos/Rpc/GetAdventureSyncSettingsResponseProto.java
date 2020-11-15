// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto}
 */
public final class GetAdventureSyncSettingsResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto)
    GetAdventureSyncSettingsResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAdventureSyncSettingsResponseProto.newBuilder() to construct.
  private GetAdventureSyncSettingsResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAdventureSyncSettingsResponseProto() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAdventureSyncSettingsResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAdventureSyncSettingsResponseProto(
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
            POGOProtos.Rpc.AdventureSyncSettingsProto.Builder subBuilder = null;
            if (adventureSyncSettings_ != null) {
              subBuilder = adventureSyncSettings_.toBuilder();
            }
            adventureSyncSettings_ = input.readMessage(POGOProtos.Rpc.AdventureSyncSettingsProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adventureSyncSettings_);
              adventureSyncSettings_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetAdventureSyncSettingsResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetAdventureSyncSettingsResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.class, POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status}
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    ERROR_UNKNOWN(2),
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    ERROR_PLAYER_NOT_FOUND(3),
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
     * <code>ERROR_UNKNOWN = 2;</code>
     */
    public static final int ERROR_UNKNOWN_VALUE = 2;
    /**
     * <code>ERROR_PLAYER_NOT_FOUND = 3;</code>
     */
    public static final int ERROR_PLAYER_NOT_FOUND_VALUE = 3;


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
        case 2: return ERROR_UNKNOWN;
        case 3: return ERROR_PLAYER_NOT_FOUND;
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
      return POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status result = POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status.valueOf(status_);
    return result == null ? POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status.UNRECOGNIZED : result;
  }

  public static final int ADVENTURE_SYNC_SETTINGS_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.AdventureSyncSettingsProto adventureSyncSettings_;
  /**
   * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
   * @return Whether the adventureSyncSettings field is set.
   */
  @java.lang.Override
  public boolean hasAdventureSyncSettings() {
    return adventureSyncSettings_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
   * @return The adventureSyncSettings.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AdventureSyncSettingsProto getAdventureSyncSettings() {
    return adventureSyncSettings_ == null ? POGOProtos.Rpc.AdventureSyncSettingsProto.getDefaultInstance() : adventureSyncSettings_;
  }
  /**
   * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AdventureSyncSettingsProtoOrBuilder getAdventureSyncSettingsOrBuilder() {
    return getAdventureSyncSettings();
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
    if (status_ != POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (adventureSyncSettings_ != null) {
      output.writeMessage(2, getAdventureSyncSettings());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (adventureSyncSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdventureSyncSettings());
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
    if (!(obj instanceof POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto other = (POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto) obj;

    if (status_ != other.status_) return false;
    if (hasAdventureSyncSettings() != other.hasAdventureSyncSettings()) return false;
    if (hasAdventureSyncSettings()) {
      if (!getAdventureSyncSettings()
          .equals(other.getAdventureSyncSettings())) return false;
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
    if (hasAdventureSyncSettings()) {
      hash = (37 * hash) + ADVENTURE_SYNC_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getAdventureSyncSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto)
      POGOProtos.Rpc.GetAdventureSyncSettingsResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetAdventureSyncSettingsResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetAdventureSyncSettingsResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.class, POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.newBuilder()
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

      if (adventureSyncSettingsBuilder_ == null) {
        adventureSyncSettings_ = null;
      } else {
        adventureSyncSettings_ = null;
        adventureSyncSettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GetAdventureSyncSettingsResponseProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto build() {
      POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto buildPartial() {
      POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto result = new POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto(this);
      result.status_ = status_;
      if (adventureSyncSettingsBuilder_ == null) {
        result.adventureSyncSettings_ = adventureSyncSettings_;
      } else {
        result.adventureSyncSettings_ = adventureSyncSettingsBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto) {
        return mergeFrom((POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto other) {
      if (other == POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasAdventureSyncSettings()) {
        mergeAdventureSyncSettings(other.getAdventureSyncSettings());
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
      POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status result = POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status.valueOf(status_);
      return result == null ? POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.AdventureSyncSettingsProto adventureSyncSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AdventureSyncSettingsProto, POGOProtos.Rpc.AdventureSyncSettingsProto.Builder, POGOProtos.Rpc.AdventureSyncSettingsProtoOrBuilder> adventureSyncSettingsBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     * @return Whether the adventureSyncSettings field is set.
     */
    public boolean hasAdventureSyncSettings() {
      return adventureSyncSettingsBuilder_ != null || adventureSyncSettings_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     * @return The adventureSyncSettings.
     */
    public POGOProtos.Rpc.AdventureSyncSettingsProto getAdventureSyncSettings() {
      if (adventureSyncSettingsBuilder_ == null) {
        return adventureSyncSettings_ == null ? POGOProtos.Rpc.AdventureSyncSettingsProto.getDefaultInstance() : adventureSyncSettings_;
      } else {
        return adventureSyncSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    public Builder setAdventureSyncSettings(POGOProtos.Rpc.AdventureSyncSettingsProto value) {
      if (adventureSyncSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adventureSyncSettings_ = value;
        onChanged();
      } else {
        adventureSyncSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    public Builder setAdventureSyncSettings(
        POGOProtos.Rpc.AdventureSyncSettingsProto.Builder builderForValue) {
      if (adventureSyncSettingsBuilder_ == null) {
        adventureSyncSettings_ = builderForValue.build();
        onChanged();
      } else {
        adventureSyncSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    public Builder mergeAdventureSyncSettings(POGOProtos.Rpc.AdventureSyncSettingsProto value) {
      if (adventureSyncSettingsBuilder_ == null) {
        if (adventureSyncSettings_ != null) {
          adventureSyncSettings_ =
            POGOProtos.Rpc.AdventureSyncSettingsProto.newBuilder(adventureSyncSettings_).mergeFrom(value).buildPartial();
        } else {
          adventureSyncSettings_ = value;
        }
        onChanged();
      } else {
        adventureSyncSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    public Builder clearAdventureSyncSettings() {
      if (adventureSyncSettingsBuilder_ == null) {
        adventureSyncSettings_ = null;
        onChanged();
      } else {
        adventureSyncSettings_ = null;
        adventureSyncSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    public POGOProtos.Rpc.AdventureSyncSettingsProto.Builder getAdventureSyncSettingsBuilder() {
      
      onChanged();
      return getAdventureSyncSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    public POGOProtos.Rpc.AdventureSyncSettingsProtoOrBuilder getAdventureSyncSettingsOrBuilder() {
      if (adventureSyncSettingsBuilder_ != null) {
        return adventureSyncSettingsBuilder_.getMessageOrBuilder();
      } else {
        return adventureSyncSettings_ == null ?
            POGOProtos.Rpc.AdventureSyncSettingsProto.getDefaultInstance() : adventureSyncSettings_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AdventureSyncSettingsProto adventure_sync_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AdventureSyncSettingsProto, POGOProtos.Rpc.AdventureSyncSettingsProto.Builder, POGOProtos.Rpc.AdventureSyncSettingsProtoOrBuilder> 
        getAdventureSyncSettingsFieldBuilder() {
      if (adventureSyncSettingsBuilder_ == null) {
        adventureSyncSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AdventureSyncSettingsProto, POGOProtos.Rpc.AdventureSyncSettingsProto.Builder, POGOProtos.Rpc.AdventureSyncSettingsProtoOrBuilder>(
                getAdventureSyncSettings(),
                getParentForChildren(),
                isClean());
        adventureSyncSettings_ = null;
      }
      return adventureSyncSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto)
  private static final POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto();
  }

  public static POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAdventureSyncSettingsResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<GetAdventureSyncSettingsResponseProto>() {
    @java.lang.Override
    public GetAdventureSyncSettingsResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAdventureSyncSettingsResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAdventureSyncSettingsResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAdventureSyncSettingsResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GetAdventureSyncSettingsResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

