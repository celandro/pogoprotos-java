// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GamePoi/Requests/SubmitPoiTakedownRequestMessage.proto

package POGOProtos.Networking.Requests.Game.GamePoi.Requests;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage}
 */
public final class SubmitPoiTakedownRequestMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage)
    SubmitPoiTakedownRequestMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitPoiTakedownRequestMessage.newBuilder() to construct.
  private SubmitPoiTakedownRequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitPoiTakedownRequestMessage() {
    poiId_ = "";
    invalidReason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitPoiTakedownRequestMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubmitPoiTakedownRequestMessage(
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

            poiId_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            invalidReason_ = rawValue;
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
    return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitPoiTakedownRequestMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitPoiTakedownRequestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.class, POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason}
   */
  public enum PoiInvalidReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_REASON_UNSPECIFIED = 0;</code>
     */
    INVALID_REASON_UNSPECIFIED(0),
    /**
     * <code>NO_PEDESTRIAN_ACCESS = 1;</code>
     */
    NO_PEDESTRIAN_ACCESS(1),
    /**
     * <code>OBSTRUCTS_EMERGENCY_SERVICES = 2;</code>
     */
    OBSTRUCTS_EMERGENCY_SERVICES(2),
    /**
     * <code>PRIVATE_RESIDENTIAL_PROPERTY = 3;</code>
     */
    PRIVATE_RESIDENTIAL_PROPERTY(3),
    /**
     * <code>SCHOOL = 4;</code>
     */
    SCHOOL(4),
    /**
     * <code>PERMANENTLY_REMOVED = 5;</code>
     */
    PERMANENTLY_REMOVED(5),
    /**
     * <code>DUPLICATE = 6;</code>
     */
    DUPLICATE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVALID_REASON_UNSPECIFIED = 0;</code>
     */
    public static final int INVALID_REASON_UNSPECIFIED_VALUE = 0;
    /**
     * <code>NO_PEDESTRIAN_ACCESS = 1;</code>
     */
    public static final int NO_PEDESTRIAN_ACCESS_VALUE = 1;
    /**
     * <code>OBSTRUCTS_EMERGENCY_SERVICES = 2;</code>
     */
    public static final int OBSTRUCTS_EMERGENCY_SERVICES_VALUE = 2;
    /**
     * <code>PRIVATE_RESIDENTIAL_PROPERTY = 3;</code>
     */
    public static final int PRIVATE_RESIDENTIAL_PROPERTY_VALUE = 3;
    /**
     * <code>SCHOOL = 4;</code>
     */
    public static final int SCHOOL_VALUE = 4;
    /**
     * <code>PERMANENTLY_REMOVED = 5;</code>
     */
    public static final int PERMANENTLY_REMOVED_VALUE = 5;
    /**
     * <code>DUPLICATE = 6;</code>
     */
    public static final int DUPLICATE_VALUE = 6;


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
    public static PoiInvalidReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PoiInvalidReason forNumber(int value) {
      switch (value) {
        case 0: return INVALID_REASON_UNSPECIFIED;
        case 1: return NO_PEDESTRIAN_ACCESS;
        case 2: return OBSTRUCTS_EMERGENCY_SERVICES;
        case 3: return PRIVATE_RESIDENTIAL_PROPERTY;
        case 4: return SCHOOL;
        case 5: return PERMANENTLY_REMOVED;
        case 6: return DUPLICATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PoiInvalidReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PoiInvalidReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PoiInvalidReason>() {
            public PoiInvalidReason findValueByNumber(int number) {
              return PoiInvalidReason.forNumber(number);
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
      return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final PoiInvalidReason[] VALUES = values();

    public static PoiInvalidReason valueOf(
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

    private PoiInvalidReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason)
  }

  public static final int POI_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object poiId_;
  /**
   * <code>string poi_id = 1;</code>
   * @return The poiId.
   */
  @java.lang.Override
  public java.lang.String getPoiId() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      poiId_ = s;
      return s;
    }
  }
  /**
   * <code>string poi_id = 1;</code>
   * @return The bytes for poiId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoiIdBytes() {
    java.lang.Object ref = poiId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      poiId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVALID_REASON_FIELD_NUMBER = 2;
  private int invalidReason_;
  /**
   * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
   * @return The enum numeric value on the wire for invalidReason.
   */
  @java.lang.Override public int getInvalidReasonValue() {
    return invalidReason_;
  }
  /**
   * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
   * @return The invalidReason.
   */
  @java.lang.Override public POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason getInvalidReason() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason result = POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason.valueOf(invalidReason_);
    return result == null ? POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason.UNRECOGNIZED : result;
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
    if (!getPoiIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, poiId_);
    }
    if (invalidReason_ != POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason.INVALID_REASON_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, invalidReason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPoiIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, poiId_);
    }
    if (invalidReason_ != POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason.INVALID_REASON_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, invalidReason_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage other = (POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage) obj;

    if (!getPoiId()
        .equals(other.getPoiId())) return false;
    if (invalidReason_ != other.invalidReason_) return false;
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
    hash = (37 * hash) + POI_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPoiId().hashCode();
    hash = (37 * hash) + INVALID_REASON_FIELD_NUMBER;
    hash = (53 * hash) + invalidReason_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage)
      POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitPoiTakedownRequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitPoiTakedownRequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.class, POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.newBuilder()
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
      poiId_ = "";

      invalidReason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Game_GamePoi_Requests_SubmitPoiTakedownRequestMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage build() {
      POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage buildPartial() {
      POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage result = new POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage(this);
      result.poiId_ = poiId_;
      result.invalidReason_ = invalidReason_;
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
      if (other instanceof POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage other) {
      if (other == POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.getDefaultInstance()) return this;
      if (!other.getPoiId().isEmpty()) {
        poiId_ = other.poiId_;
        onChanged();
      }
      if (other.invalidReason_ != 0) {
        setInvalidReasonValue(other.getInvalidReasonValue());
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
      POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object poiId_ = "";
    /**
     * <code>string poi_id = 1;</code>
     * @return The poiId.
     */
    public java.lang.String getPoiId() {
      java.lang.Object ref = poiId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        poiId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return The bytes for poiId.
     */
    public com.google.protobuf.ByteString
        getPoiIdBytes() {
      java.lang.Object ref = poiId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        poiId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      poiId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPoiId() {
      
      poiId_ = getDefaultInstance().getPoiId();
      onChanged();
      return this;
    }
    /**
     * <code>string poi_id = 1;</code>
     * @param value The bytes for poiId to set.
     * @return This builder for chaining.
     */
    public Builder setPoiIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      poiId_ = value;
      onChanged();
      return this;
    }

    private int invalidReason_ = 0;
    /**
     * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
     * @return The enum numeric value on the wire for invalidReason.
     */
    @java.lang.Override public int getInvalidReasonValue() {
      return invalidReason_;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
     * @param value The enum numeric value on the wire for invalidReason to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidReasonValue(int value) {
      
      invalidReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
     * @return The invalidReason.
     */
    @java.lang.Override
    public POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason getInvalidReason() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason result = POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason.valueOf(invalidReason_);
      return result == null ? POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
     * @param value The invalidReason to set.
     * @return This builder for chaining.
     */
    public Builder setInvalidReason(POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      invalidReason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage.PoiInvalidReason invalid_reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInvalidReason() {
      
      invalidReason_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage)
  private static final POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage();
  }

  public static POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitPoiTakedownRequestMessage>
      PARSER = new com.google.protobuf.AbstractParser<SubmitPoiTakedownRequestMessage>() {
    @java.lang.Override
    public SubmitPoiTakedownRequestMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubmitPoiTakedownRequestMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubmitPoiTakedownRequestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitPoiTakedownRequestMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Game.GamePoi.Requests.SubmitPoiTakedownRequestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

