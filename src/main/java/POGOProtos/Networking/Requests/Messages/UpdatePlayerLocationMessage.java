// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/UpdatePlayerLocationMessage.proto

package POGOProtos.Networking.Requests.Messages;

/**
 * Protobuf type {@code POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage}
 */
public final class UpdatePlayerLocationMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage)
    UpdatePlayerLocationMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePlayerLocationMessage.newBuilder() to construct.
  private UpdatePlayerLocationMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePlayerLocationMessage() {
    geofenceIdentifier_ = "";
    reason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePlayerLocationMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdatePlayerLocationMessage(
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

            geofenceIdentifier_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            reason_ = rawValue;
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
    return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_UpdatePlayerLocationMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_UpdatePlayerLocationMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.class, POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason}
   */
  public enum PingReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNSET = 0;</code>
     */
    UNSET(0),
    /**
     * <code>ENTRANCE_EVENT = 1;</code>
     */
    ENTRANCE_EVENT(1),
    /**
     * <code>EXIT_EVENT = 2;</code>
     */
    EXIT_EVENT(2),
    /**
     * <code>DWELL_EVENT = 3;</code>
     */
    DWELL_EVENT(3),
    /**
     * <code>VISIT_EVENT = 4;</code>
     */
    VISIT_EVENT(4),
    /**
     * <code>FITNESS_WAKEUP = 5;</code>
     */
    FITNESS_WAKEUP(5),
    /**
     * <code>OTHER_WAKEUP = 6;</code>
     */
    OTHER_WAKEUP(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNSET = 0;</code>
     */
    public static final int UNSET_VALUE = 0;
    /**
     * <code>ENTRANCE_EVENT = 1;</code>
     */
    public static final int ENTRANCE_EVENT_VALUE = 1;
    /**
     * <code>EXIT_EVENT = 2;</code>
     */
    public static final int EXIT_EVENT_VALUE = 2;
    /**
     * <code>DWELL_EVENT = 3;</code>
     */
    public static final int DWELL_EVENT_VALUE = 3;
    /**
     * <code>VISIT_EVENT = 4;</code>
     */
    public static final int VISIT_EVENT_VALUE = 4;
    /**
     * <code>FITNESS_WAKEUP = 5;</code>
     */
    public static final int FITNESS_WAKEUP_VALUE = 5;
    /**
     * <code>OTHER_WAKEUP = 6;</code>
     */
    public static final int OTHER_WAKEUP_VALUE = 6;


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
    public static PingReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PingReason forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return ENTRANCE_EVENT;
        case 2: return EXIT_EVENT;
        case 3: return DWELL_EVENT;
        case 4: return VISIT_EVENT;
        case 5: return FITNESS_WAKEUP;
        case 6: return OTHER_WAKEUP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PingReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PingReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PingReason>() {
            public PingReason findValueByNumber(int number) {
              return PingReason.forNumber(number);
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
      return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final PingReason[] VALUES = values();

    public static PingReason valueOf(
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

    private PingReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason)
  }

  public static final int GEOFENCE_IDENTIFIER_FIELD_NUMBER = 1;
  private volatile java.lang.Object geofenceIdentifier_;
  /**
   * <code>string geofence_identifier = 1;</code>
   * @return The geofenceIdentifier.
   */
  @java.lang.Override
  public java.lang.String getGeofenceIdentifier() {
    java.lang.Object ref = geofenceIdentifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      geofenceIdentifier_ = s;
      return s;
    }
  }
  /**
   * <code>string geofence_identifier = 1;</code>
   * @return The bytes for geofenceIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGeofenceIdentifierBytes() {
    java.lang.Object ref = geofenceIdentifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      geofenceIdentifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REASON_FIELD_NUMBER = 2;
  private int reason_;
  /**
   * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
   * @return The enum numeric value on the wire for reason.
   */
  @java.lang.Override public int getReasonValue() {
    return reason_;
  }
  /**
   * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
   * @return The reason.
   */
  @java.lang.Override public POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason getReason() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason result = POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason.valueOf(reason_);
    return result == null ? POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason.UNRECOGNIZED : result;
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
    if (!getGeofenceIdentifierBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, geofenceIdentifier_);
    }
    if (reason_ != POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason.UNSET.getNumber()) {
      output.writeEnum(2, reason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGeofenceIdentifierBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, geofenceIdentifier_);
    }
    if (reason_ != POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, reason_);
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
    if (!(obj instanceof POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage other = (POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage) obj;

    if (!getGeofenceIdentifier()
        .equals(other.getGeofenceIdentifier())) return false;
    if (reason_ != other.reason_) return false;
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
    hash = (37 * hash) + GEOFENCE_IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getGeofenceIdentifier().hashCode();
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + reason_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage)
      POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_UpdatePlayerLocationMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_UpdatePlayerLocationMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.class, POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.Builder.class);
    }

    // Construct using POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.newBuilder()
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
      geofenceIdentifier_ = "";

      reason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessageOuterClass.internal_static_POGOProtos_Networking_Requests_Messages_UpdatePlayerLocationMessage_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage getDefaultInstanceForType() {
      return POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage build() {
      POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage buildPartial() {
      POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage result = new POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage(this);
      result.geofenceIdentifier_ = geofenceIdentifier_;
      result.reason_ = reason_;
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
      if (other instanceof POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage) {
        return mergeFrom((POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage other) {
      if (other == POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.getDefaultInstance()) return this;
      if (!other.getGeofenceIdentifier().isEmpty()) {
        geofenceIdentifier_ = other.geofenceIdentifier_;
        onChanged();
      }
      if (other.reason_ != 0) {
        setReasonValue(other.getReasonValue());
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
      POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object geofenceIdentifier_ = "";
    /**
     * <code>string geofence_identifier = 1;</code>
     * @return The geofenceIdentifier.
     */
    public java.lang.String getGeofenceIdentifier() {
      java.lang.Object ref = geofenceIdentifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        geofenceIdentifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string geofence_identifier = 1;</code>
     * @return The bytes for geofenceIdentifier.
     */
    public com.google.protobuf.ByteString
        getGeofenceIdentifierBytes() {
      java.lang.Object ref = geofenceIdentifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        geofenceIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string geofence_identifier = 1;</code>
     * @param value The geofenceIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setGeofenceIdentifier(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      geofenceIdentifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string geofence_identifier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGeofenceIdentifier() {
      
      geofenceIdentifier_ = getDefaultInstance().getGeofenceIdentifier();
      onChanged();
      return this;
    }
    /**
     * <code>string geofence_identifier = 1;</code>
     * @param value The bytes for geofenceIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setGeofenceIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      geofenceIdentifier_ = value;
      onChanged();
      return this;
    }

    private int reason_ = 0;
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
     * @param value The enum numeric value on the wire for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonValue(int value) {
      
      reason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override
    public POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason getReason() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason result = POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason.valueOf(reason_);
      return result == null ? POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      reason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage.PingReason reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      
      reason_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage)
  private static final POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage();
  }

  public static POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePlayerLocationMessage>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerLocationMessage>() {
    @java.lang.Override
    public UpdatePlayerLocationMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdatePlayerLocationMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdatePlayerLocationMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePlayerLocationMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Requests.Messages.UpdatePlayerLocationMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

