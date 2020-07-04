// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.GlobalEventTicketAttributesProto}
 */
public  final class GlobalEventTicketAttributesProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.GlobalEventTicketAttributesProto)
    GlobalEventTicketAttributesProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GlobalEventTicketAttributesProto.newBuilder() to construct.
  private GlobalEventTicketAttributesProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GlobalEventTicketAttributesProto() {
    eventBadge_ = 0;
    eventStartTime_ = "";
    eventEndTime_ = "";
    itemBagDescriptionKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GlobalEventTicketAttributesProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GlobalEventTicketAttributesProto(
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

            eventBadge_ = rawValue;
            break;
          }
          case 16: {

            grantBadgeBeforeEventStartMs_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            eventStartTime_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            eventEndTime_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            itemBagDescriptionKey_ = s;
            break;
          }
          case 800: {

            clientEventStartTimeUtcMs_ = input.readInt64();
            break;
          }
          case 808: {

            clientEventEndTimeUtcMs_ = input.readInt64();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GlobalEventTicketAttributesProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GlobalEventTicketAttributesProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.GlobalEventTicketAttributesProto.class, POGOProtos.Rpc.GlobalEventTicketAttributesProto.Builder.class);
  }

  public static final int EVENT_BADGE_FIELD_NUMBER = 1;
  private int eventBadge_;
  /**
   * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
   * @return The enum numeric value on the wire for eventBadge.
   */
  public int getEventBadgeValue() {
    return eventBadge_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
   * @return The eventBadge.
   */
  public POGOProtos.Rpc.HoloBadgeType getEventBadge() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloBadgeType result = POGOProtos.Rpc.HoloBadgeType.valueOf(eventBadge_);
    return result == null ? POGOProtos.Rpc.HoloBadgeType.UNRECOGNIZED : result;
  }

  public static final int GRANT_BADGE_BEFORE_EVENT_START_MS_FIELD_NUMBER = 2;
  private long grantBadgeBeforeEventStartMs_;
  /**
   * <code>int64 grant_badge_before_event_start_ms = 2;</code>
   * @return The grantBadgeBeforeEventStartMs.
   */
  public long getGrantBadgeBeforeEventStartMs() {
    return grantBadgeBeforeEventStartMs_;
  }

  public static final int EVENT_START_TIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object eventStartTime_;
  /**
   * <code>string event_start_time = 3;</code>
   * @return The eventStartTime.
   */
  public java.lang.String getEventStartTime() {
    java.lang.Object ref = eventStartTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventStartTime_ = s;
      return s;
    }
  }
  /**
   * <code>string event_start_time = 3;</code>
   * @return The bytes for eventStartTime.
   */
  public com.google.protobuf.ByteString
      getEventStartTimeBytes() {
    java.lang.Object ref = eventStartTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventStartTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_END_TIME_FIELD_NUMBER = 4;
  private volatile java.lang.Object eventEndTime_;
  /**
   * <code>string event_end_time = 4;</code>
   * @return The eventEndTime.
   */
  public java.lang.String getEventEndTime() {
    java.lang.Object ref = eventEndTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventEndTime_ = s;
      return s;
    }
  }
  /**
   * <code>string event_end_time = 4;</code>
   * @return The bytes for eventEndTime.
   */
  public com.google.protobuf.ByteString
      getEventEndTimeBytes() {
    java.lang.Object ref = eventEndTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventEndTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEM_BAG_DESCRIPTION_KEY_FIELD_NUMBER = 6;
  private volatile java.lang.Object itemBagDescriptionKey_;
  /**
   * <code>string item_bag_description_key = 6;</code>
   * @return The itemBagDescriptionKey.
   */
  public java.lang.String getItemBagDescriptionKey() {
    java.lang.Object ref = itemBagDescriptionKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemBagDescriptionKey_ = s;
      return s;
    }
  }
  /**
   * <code>string item_bag_description_key = 6;</code>
   * @return The bytes for itemBagDescriptionKey.
   */
  public com.google.protobuf.ByteString
      getItemBagDescriptionKeyBytes() {
    java.lang.Object ref = itemBagDescriptionKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemBagDescriptionKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_EVENT_START_TIME_UTC_MS_FIELD_NUMBER = 100;
  private long clientEventStartTimeUtcMs_;
  /**
   * <code>int64 client_event_start_time_utc_ms = 100;</code>
   * @return The clientEventStartTimeUtcMs.
   */
  public long getClientEventStartTimeUtcMs() {
    return clientEventStartTimeUtcMs_;
  }

  public static final int CLIENT_EVENT_END_TIME_UTC_MS_FIELD_NUMBER = 101;
  private long clientEventEndTimeUtcMs_;
  /**
   * <code>int64 client_event_end_time_utc_ms = 101;</code>
   * @return The clientEventEndTimeUtcMs.
   */
  public long getClientEventEndTimeUtcMs() {
    return clientEventEndTimeUtcMs_;
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
    if (eventBadge_ != POGOProtos.Rpc.HoloBadgeType.HOLO_BADGE_TYPE_BADGE_UNSET.getNumber()) {
      output.writeEnum(1, eventBadge_);
    }
    if (grantBadgeBeforeEventStartMs_ != 0L) {
      output.writeInt64(2, grantBadgeBeforeEventStartMs_);
    }
    if (!getEventStartTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, eventStartTime_);
    }
    if (!getEventEndTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, eventEndTime_);
    }
    if (!getItemBagDescriptionKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, itemBagDescriptionKey_);
    }
    if (clientEventStartTimeUtcMs_ != 0L) {
      output.writeInt64(100, clientEventStartTimeUtcMs_);
    }
    if (clientEventEndTimeUtcMs_ != 0L) {
      output.writeInt64(101, clientEventEndTimeUtcMs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventBadge_ != POGOProtos.Rpc.HoloBadgeType.HOLO_BADGE_TYPE_BADGE_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, eventBadge_);
    }
    if (grantBadgeBeforeEventStartMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, grantBadgeBeforeEventStartMs_);
    }
    if (!getEventStartTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, eventStartTime_);
    }
    if (!getEventEndTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, eventEndTime_);
    }
    if (!getItemBagDescriptionKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, itemBagDescriptionKey_);
    }
    if (clientEventStartTimeUtcMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(100, clientEventStartTimeUtcMs_);
    }
    if (clientEventEndTimeUtcMs_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(101, clientEventEndTimeUtcMs_);
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
    if (!(obj instanceof POGOProtos.Rpc.GlobalEventTicketAttributesProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.GlobalEventTicketAttributesProto other = (POGOProtos.Rpc.GlobalEventTicketAttributesProto) obj;

    if (eventBadge_ != other.eventBadge_) return false;
    if (getGrantBadgeBeforeEventStartMs()
        != other.getGrantBadgeBeforeEventStartMs()) return false;
    if (!getEventStartTime()
        .equals(other.getEventStartTime())) return false;
    if (!getEventEndTime()
        .equals(other.getEventEndTime())) return false;
    if (!getItemBagDescriptionKey()
        .equals(other.getItemBagDescriptionKey())) return false;
    if (getClientEventStartTimeUtcMs()
        != other.getClientEventStartTimeUtcMs()) return false;
    if (getClientEventEndTimeUtcMs()
        != other.getClientEventEndTimeUtcMs()) return false;
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
    hash = (37 * hash) + EVENT_BADGE_FIELD_NUMBER;
    hash = (53 * hash) + eventBadge_;
    hash = (37 * hash) + GRANT_BADGE_BEFORE_EVENT_START_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGrantBadgeBeforeEventStartMs());
    hash = (37 * hash) + EVENT_START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getEventStartTime().hashCode();
    hash = (37 * hash) + EVENT_END_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getEventEndTime().hashCode();
    hash = (37 * hash) + ITEM_BAG_DESCRIPTION_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getItemBagDescriptionKey().hashCode();
    hash = (37 * hash) + CLIENT_EVENT_START_TIME_UTC_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientEventStartTimeUtcMs());
    hash = (37 * hash) + CLIENT_EVENT_END_TIME_UTC_MS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientEventEndTimeUtcMs());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.GlobalEventTicketAttributesProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.GlobalEventTicketAttributesProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.GlobalEventTicketAttributesProto)
      POGOProtos.Rpc.GlobalEventTicketAttributesProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GlobalEventTicketAttributesProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GlobalEventTicketAttributesProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.GlobalEventTicketAttributesProto.class, POGOProtos.Rpc.GlobalEventTicketAttributesProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.GlobalEventTicketAttributesProto.newBuilder()
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
      eventBadge_ = 0;

      grantBadgeBeforeEventStartMs_ = 0L;

      eventStartTime_ = "";

      eventEndTime_ = "";

      itemBagDescriptionKey_ = "";

      clientEventStartTimeUtcMs_ = 0L;

      clientEventEndTimeUtcMs_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_GlobalEventTicketAttributesProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GlobalEventTicketAttributesProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.GlobalEventTicketAttributesProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.GlobalEventTicketAttributesProto build() {
      POGOProtos.Rpc.GlobalEventTicketAttributesProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.GlobalEventTicketAttributesProto buildPartial() {
      POGOProtos.Rpc.GlobalEventTicketAttributesProto result = new POGOProtos.Rpc.GlobalEventTicketAttributesProto(this);
      result.eventBadge_ = eventBadge_;
      result.grantBadgeBeforeEventStartMs_ = grantBadgeBeforeEventStartMs_;
      result.eventStartTime_ = eventStartTime_;
      result.eventEndTime_ = eventEndTime_;
      result.itemBagDescriptionKey_ = itemBagDescriptionKey_;
      result.clientEventStartTimeUtcMs_ = clientEventStartTimeUtcMs_;
      result.clientEventEndTimeUtcMs_ = clientEventEndTimeUtcMs_;
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
      if (other instanceof POGOProtos.Rpc.GlobalEventTicketAttributesProto) {
        return mergeFrom((POGOProtos.Rpc.GlobalEventTicketAttributesProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.GlobalEventTicketAttributesProto other) {
      if (other == POGOProtos.Rpc.GlobalEventTicketAttributesProto.getDefaultInstance()) return this;
      if (other.eventBadge_ != 0) {
        setEventBadgeValue(other.getEventBadgeValue());
      }
      if (other.getGrantBadgeBeforeEventStartMs() != 0L) {
        setGrantBadgeBeforeEventStartMs(other.getGrantBadgeBeforeEventStartMs());
      }
      if (!other.getEventStartTime().isEmpty()) {
        eventStartTime_ = other.eventStartTime_;
        onChanged();
      }
      if (!other.getEventEndTime().isEmpty()) {
        eventEndTime_ = other.eventEndTime_;
        onChanged();
      }
      if (!other.getItemBagDescriptionKey().isEmpty()) {
        itemBagDescriptionKey_ = other.itemBagDescriptionKey_;
        onChanged();
      }
      if (other.getClientEventStartTimeUtcMs() != 0L) {
        setClientEventStartTimeUtcMs(other.getClientEventStartTimeUtcMs());
      }
      if (other.getClientEventEndTimeUtcMs() != 0L) {
        setClientEventEndTimeUtcMs(other.getClientEventEndTimeUtcMs());
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
      POGOProtos.Rpc.GlobalEventTicketAttributesProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.GlobalEventTicketAttributesProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int eventBadge_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
     * @return The enum numeric value on the wire for eventBadge.
     */
    public int getEventBadgeValue() {
      return eventBadge_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
     * @param value The enum numeric value on the wire for eventBadge to set.
     * @return This builder for chaining.
     */
    public Builder setEventBadgeValue(int value) {
      eventBadge_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
     * @return The eventBadge.
     */
    public POGOProtos.Rpc.HoloBadgeType getEventBadge() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloBadgeType result = POGOProtos.Rpc.HoloBadgeType.valueOf(eventBadge_);
      return result == null ? POGOProtos.Rpc.HoloBadgeType.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
     * @param value The eventBadge to set.
     * @return This builder for chaining.
     */
    public Builder setEventBadge(POGOProtos.Rpc.HoloBadgeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      eventBadge_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloBadgeType event_badge = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventBadge() {
      
      eventBadge_ = 0;
      onChanged();
      return this;
    }

    private long grantBadgeBeforeEventStartMs_ ;
    /**
     * <code>int64 grant_badge_before_event_start_ms = 2;</code>
     * @return The grantBadgeBeforeEventStartMs.
     */
    public long getGrantBadgeBeforeEventStartMs() {
      return grantBadgeBeforeEventStartMs_;
    }
    /**
     * <code>int64 grant_badge_before_event_start_ms = 2;</code>
     * @param value The grantBadgeBeforeEventStartMs to set.
     * @return This builder for chaining.
     */
    public Builder setGrantBadgeBeforeEventStartMs(long value) {
      
      grantBadgeBeforeEventStartMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 grant_badge_before_event_start_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrantBadgeBeforeEventStartMs() {
      
      grantBadgeBeforeEventStartMs_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object eventStartTime_ = "";
    /**
     * <code>string event_start_time = 3;</code>
     * @return The eventStartTime.
     */
    public java.lang.String getEventStartTime() {
      java.lang.Object ref = eventStartTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventStartTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_start_time = 3;</code>
     * @return The bytes for eventStartTime.
     */
    public com.google.protobuf.ByteString
        getEventStartTimeBytes() {
      java.lang.Object ref = eventStartTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventStartTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_start_time = 3;</code>
     * @param value The eventStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setEventStartTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventStartTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event_start_time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventStartTime() {
      
      eventStartTime_ = getDefaultInstance().getEventStartTime();
      onChanged();
      return this;
    }
    /**
     * <code>string event_start_time = 3;</code>
     * @param value The bytes for eventStartTime to set.
     * @return This builder for chaining.
     */
    public Builder setEventStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventStartTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object eventEndTime_ = "";
    /**
     * <code>string event_end_time = 4;</code>
     * @return The eventEndTime.
     */
    public java.lang.String getEventEndTime() {
      java.lang.Object ref = eventEndTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventEndTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string event_end_time = 4;</code>
     * @return The bytes for eventEndTime.
     */
    public com.google.protobuf.ByteString
        getEventEndTimeBytes() {
      java.lang.Object ref = eventEndTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventEndTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string event_end_time = 4;</code>
     * @param value The eventEndTime to set.
     * @return This builder for chaining.
     */
    public Builder setEventEndTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventEndTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string event_end_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventEndTime() {
      
      eventEndTime_ = getDefaultInstance().getEventEndTime();
      onChanged();
      return this;
    }
    /**
     * <code>string event_end_time = 4;</code>
     * @param value The bytes for eventEndTime to set.
     * @return This builder for chaining.
     */
    public Builder setEventEndTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventEndTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object itemBagDescriptionKey_ = "";
    /**
     * <code>string item_bag_description_key = 6;</code>
     * @return The itemBagDescriptionKey.
     */
    public java.lang.String getItemBagDescriptionKey() {
      java.lang.Object ref = itemBagDescriptionKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemBagDescriptionKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string item_bag_description_key = 6;</code>
     * @return The bytes for itemBagDescriptionKey.
     */
    public com.google.protobuf.ByteString
        getItemBagDescriptionKeyBytes() {
      java.lang.Object ref = itemBagDescriptionKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemBagDescriptionKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string item_bag_description_key = 6;</code>
     * @param value The itemBagDescriptionKey to set.
     * @return This builder for chaining.
     */
    public Builder setItemBagDescriptionKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemBagDescriptionKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string item_bag_description_key = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemBagDescriptionKey() {
      
      itemBagDescriptionKey_ = getDefaultInstance().getItemBagDescriptionKey();
      onChanged();
      return this;
    }
    /**
     * <code>string item_bag_description_key = 6;</code>
     * @param value The bytes for itemBagDescriptionKey to set.
     * @return This builder for chaining.
     */
    public Builder setItemBagDescriptionKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemBagDescriptionKey_ = value;
      onChanged();
      return this;
    }

    private long clientEventStartTimeUtcMs_ ;
    /**
     * <code>int64 client_event_start_time_utc_ms = 100;</code>
     * @return The clientEventStartTimeUtcMs.
     */
    public long getClientEventStartTimeUtcMs() {
      return clientEventStartTimeUtcMs_;
    }
    /**
     * <code>int64 client_event_start_time_utc_ms = 100;</code>
     * @param value The clientEventStartTimeUtcMs to set.
     * @return This builder for chaining.
     */
    public Builder setClientEventStartTimeUtcMs(long value) {
      
      clientEventStartTimeUtcMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_event_start_time_utc_ms = 100;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientEventStartTimeUtcMs() {
      
      clientEventStartTimeUtcMs_ = 0L;
      onChanged();
      return this;
    }

    private long clientEventEndTimeUtcMs_ ;
    /**
     * <code>int64 client_event_end_time_utc_ms = 101;</code>
     * @return The clientEventEndTimeUtcMs.
     */
    public long getClientEventEndTimeUtcMs() {
      return clientEventEndTimeUtcMs_;
    }
    /**
     * <code>int64 client_event_end_time_utc_ms = 101;</code>
     * @param value The clientEventEndTimeUtcMs to set.
     * @return This builder for chaining.
     */
    public Builder setClientEventEndTimeUtcMs(long value) {
      
      clientEventEndTimeUtcMs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_event_end_time_utc_ms = 101;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientEventEndTimeUtcMs() {
      
      clientEventEndTimeUtcMs_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.GlobalEventTicketAttributesProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.GlobalEventTicketAttributesProto)
  private static final POGOProtos.Rpc.GlobalEventTicketAttributesProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.GlobalEventTicketAttributesProto();
  }

  public static POGOProtos.Rpc.GlobalEventTicketAttributesProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GlobalEventTicketAttributesProto>
      PARSER = new com.google.protobuf.AbstractParser<GlobalEventTicketAttributesProto>() {
    @java.lang.Override
    public GlobalEventTicketAttributesProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GlobalEventTicketAttributesProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GlobalEventTicketAttributesProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GlobalEventTicketAttributesProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.GlobalEventTicketAttributesProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

