// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: DLNMELMAGAO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.InvasionAvailabilitySettingsProto}
 */
public final class InvasionAvailabilitySettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.InvasionAvailabilitySettingsProto)
    InvasionAvailabilitySettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvasionAvailabilitySettingsProto.newBuilder() to construct.
  private InvasionAvailabilitySettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvasionAvailabilitySettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvasionAvailabilitySettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InvasionAvailabilitySettingsProto(
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

            availabilityStartMinute_ = input.readInt64();
            break;
          }
          case 16: {

            availabilityEndMinute_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionAvailabilitySettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionAvailabilitySettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.InvasionAvailabilitySettingsProto.class, POGOProtos.Rpc.InvasionAvailabilitySettingsProto.Builder.class);
  }

  /**
   * <pre>
   * ref: DLNMELMAGAO/IEBJIGFDNBG/DFDFAMELDGA
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.InvasionAvailabilitySettingsProto.InvasionAvailabilitySettingsId}
   */
  public enum InvasionAvailabilitySettingsId
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_UNSET = 0;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_UNSET(0),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_MONDAY = 1;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_MONDAY(1),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_TUESDAY = 2;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_TUESDAY(2),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_WEDNESDAY = 3;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_WEDNESDAY(3),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_THURSDAY = 4;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_THURSDAY(4),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_FRIDAY = 5;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_FRIDAY(5),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_SATURDAY = 6;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_SATURDAY(6),
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_SUNDAY = 7;</code>
     */
    INVASION_AVAILABILITY_SETTINGS_SUNDAY(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_UNSET = 0;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_UNSET_VALUE = 0;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_MONDAY = 1;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_MONDAY_VALUE = 1;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_TUESDAY = 2;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_TUESDAY_VALUE = 2;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_WEDNESDAY = 3;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_WEDNESDAY_VALUE = 3;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_THURSDAY = 4;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_THURSDAY_VALUE = 4;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_FRIDAY = 5;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_FRIDAY_VALUE = 5;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_SATURDAY = 6;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_SATURDAY_VALUE = 6;
    /**
     * <code>INVASION_AVAILABILITY_SETTINGS_SUNDAY = 7;</code>
     */
    public static final int INVASION_AVAILABILITY_SETTINGS_SUNDAY_VALUE = 7;


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
    public static InvasionAvailabilitySettingsId valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InvasionAvailabilitySettingsId forNumber(int value) {
      switch (value) {
        case 0: return INVASION_AVAILABILITY_SETTINGS_UNSET;
        case 1: return INVASION_AVAILABILITY_SETTINGS_MONDAY;
        case 2: return INVASION_AVAILABILITY_SETTINGS_TUESDAY;
        case 3: return INVASION_AVAILABILITY_SETTINGS_WEDNESDAY;
        case 4: return INVASION_AVAILABILITY_SETTINGS_THURSDAY;
        case 5: return INVASION_AVAILABILITY_SETTINGS_FRIDAY;
        case 6: return INVASION_AVAILABILITY_SETTINGS_SATURDAY;
        case 7: return INVASION_AVAILABILITY_SETTINGS_SUNDAY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InvasionAvailabilitySettingsId>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InvasionAvailabilitySettingsId> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InvasionAvailabilitySettingsId>() {
            public InvasionAvailabilitySettingsId findValueByNumber(int number) {
              return InvasionAvailabilitySettingsId.forNumber(number);
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
      return POGOProtos.Rpc.InvasionAvailabilitySettingsProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final InvasionAvailabilitySettingsId[] VALUES = values();

    public static InvasionAvailabilitySettingsId valueOf(
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

    private InvasionAvailabilitySettingsId(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.InvasionAvailabilitySettingsProto.InvasionAvailabilitySettingsId)
  }

  public static final int AVAILABILITY_START_MINUTE_FIELD_NUMBER = 1;
  private long availabilityStartMinute_;
  /**
   * <code>int64 availability_start_minute = 1;</code>
   * @return The availabilityStartMinute.
   */
  @java.lang.Override
  public long getAvailabilityStartMinute() {
    return availabilityStartMinute_;
  }

  public static final int AVAILABILITY_END_MINUTE_FIELD_NUMBER = 2;
  private long availabilityEndMinute_;
  /**
   * <code>int64 availability_end_minute = 2;</code>
   * @return The availabilityEndMinute.
   */
  @java.lang.Override
  public long getAvailabilityEndMinute() {
    return availabilityEndMinute_;
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
    if (availabilityStartMinute_ != 0L) {
      output.writeInt64(1, availabilityStartMinute_);
    }
    if (availabilityEndMinute_ != 0L) {
      output.writeInt64(2, availabilityEndMinute_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (availabilityStartMinute_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, availabilityStartMinute_);
    }
    if (availabilityEndMinute_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, availabilityEndMinute_);
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
    if (!(obj instanceof POGOProtos.Rpc.InvasionAvailabilitySettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.InvasionAvailabilitySettingsProto other = (POGOProtos.Rpc.InvasionAvailabilitySettingsProto) obj;

    if (getAvailabilityStartMinute()
        != other.getAvailabilityStartMinute()) return false;
    if (getAvailabilityEndMinute()
        != other.getAvailabilityEndMinute()) return false;
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
    hash = (37 * hash) + AVAILABILITY_START_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAvailabilityStartMinute());
    hash = (37 * hash) + AVAILABILITY_END_MINUTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAvailabilityEndMinute());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.InvasionAvailabilitySettingsProto prototype) {
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
   * <pre>
   * ref: DLNMELMAGAO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.InvasionAvailabilitySettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.InvasionAvailabilitySettingsProto)
      POGOProtos.Rpc.InvasionAvailabilitySettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionAvailabilitySettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionAvailabilitySettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.InvasionAvailabilitySettingsProto.class, POGOProtos.Rpc.InvasionAvailabilitySettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.InvasionAvailabilitySettingsProto.newBuilder()
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
      availabilityStartMinute_ = 0L;

      availabilityEndMinute_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_InvasionAvailabilitySettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InvasionAvailabilitySettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.InvasionAvailabilitySettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.InvasionAvailabilitySettingsProto build() {
      POGOProtos.Rpc.InvasionAvailabilitySettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.InvasionAvailabilitySettingsProto buildPartial() {
      POGOProtos.Rpc.InvasionAvailabilitySettingsProto result = new POGOProtos.Rpc.InvasionAvailabilitySettingsProto(this);
      result.availabilityStartMinute_ = availabilityStartMinute_;
      result.availabilityEndMinute_ = availabilityEndMinute_;
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
      if (other instanceof POGOProtos.Rpc.InvasionAvailabilitySettingsProto) {
        return mergeFrom((POGOProtos.Rpc.InvasionAvailabilitySettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.InvasionAvailabilitySettingsProto other) {
      if (other == POGOProtos.Rpc.InvasionAvailabilitySettingsProto.getDefaultInstance()) return this;
      if (other.getAvailabilityStartMinute() != 0L) {
        setAvailabilityStartMinute(other.getAvailabilityStartMinute());
      }
      if (other.getAvailabilityEndMinute() != 0L) {
        setAvailabilityEndMinute(other.getAvailabilityEndMinute());
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
      POGOProtos.Rpc.InvasionAvailabilitySettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.InvasionAvailabilitySettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long availabilityStartMinute_ ;
    /**
     * <code>int64 availability_start_minute = 1;</code>
     * @return The availabilityStartMinute.
     */
    @java.lang.Override
    public long getAvailabilityStartMinute() {
      return availabilityStartMinute_;
    }
    /**
     * <code>int64 availability_start_minute = 1;</code>
     * @param value The availabilityStartMinute to set.
     * @return This builder for chaining.
     */
    public Builder setAvailabilityStartMinute(long value) {
      
      availabilityStartMinute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 availability_start_minute = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailabilityStartMinute() {
      
      availabilityStartMinute_ = 0L;
      onChanged();
      return this;
    }

    private long availabilityEndMinute_ ;
    /**
     * <code>int64 availability_end_minute = 2;</code>
     * @return The availabilityEndMinute.
     */
    @java.lang.Override
    public long getAvailabilityEndMinute() {
      return availabilityEndMinute_;
    }
    /**
     * <code>int64 availability_end_minute = 2;</code>
     * @param value The availabilityEndMinute to set.
     * @return This builder for chaining.
     */
    public Builder setAvailabilityEndMinute(long value) {
      
      availabilityEndMinute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 availability_end_minute = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailabilityEndMinute() {
      
      availabilityEndMinute_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.InvasionAvailabilitySettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.InvasionAvailabilitySettingsProto)
  private static final POGOProtos.Rpc.InvasionAvailabilitySettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.InvasionAvailabilitySettingsProto();
  }

  public static POGOProtos.Rpc.InvasionAvailabilitySettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvasionAvailabilitySettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<InvasionAvailabilitySettingsProto>() {
    @java.lang.Override
    public InvasionAvailabilitySettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InvasionAvailabilitySettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvasionAvailabilitySettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvasionAvailabilitySettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.InvasionAvailabilitySettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

