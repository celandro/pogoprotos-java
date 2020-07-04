// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.MarkTutorialCompleteProto}
 */
public  final class MarkTutorialCompleteProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.MarkTutorialCompleteProto)
    MarkTutorialCompleteProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarkTutorialCompleteProto.newBuilder() to construct.
  private MarkTutorialCompleteProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarkTutorialCompleteProto() {
    tutorialComplete_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarkTutorialCompleteProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MarkTutorialCompleteProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tutorialComplete_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            tutorialComplete_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                tutorialComplete_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              tutorialComplete_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 16: {

            sendMarketingEmails_ = input.readBool();
            break;
          }
          case 24: {

            sendPushNotifications_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tutorialComplete_ = java.util.Collections.unmodifiableList(tutorialComplete_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkTutorialCompleteProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkTutorialCompleteProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.MarkTutorialCompleteProto.class, POGOProtos.Rpc.MarkTutorialCompleteProto.Builder.class);
  }

  public static final int TUTORIAL_COMPLETE_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> tutorialComplete_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, POGOProtos.Rpc.TutorialCompletion> tutorialComplete_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, POGOProtos.Rpc.TutorialCompletion>() {
            public POGOProtos.Rpc.TutorialCompletion convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              POGOProtos.Rpc.TutorialCompletion result = POGOProtos.Rpc.TutorialCompletion.valueOf(from);
              return result == null ? POGOProtos.Rpc.TutorialCompletion.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
   * @return A list containing the tutorialComplete.
   */
  public java.util.List<POGOProtos.Rpc.TutorialCompletion> getTutorialCompleteList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, POGOProtos.Rpc.TutorialCompletion>(tutorialComplete_, tutorialComplete_converter_);
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
   * @return The count of tutorialComplete.
   */
  public int getTutorialCompleteCount() {
    return tutorialComplete_.size();
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
   * @param index The index of the element to return.
   * @return The tutorialComplete at the given index.
   */
  public POGOProtos.Rpc.TutorialCompletion getTutorialComplete(int index) {
    return tutorialComplete_converter_.convert(tutorialComplete_.get(index));
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
   * @return A list containing the enum numeric values on the wire for tutorialComplete.
   */
  public java.util.List<java.lang.Integer>
  getTutorialCompleteValueList() {
    return tutorialComplete_;
  }
  /**
   * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of tutorialComplete at the given index.
   */
  public int getTutorialCompleteValue(int index) {
    return tutorialComplete_.get(index);
  }
  private int tutorialCompleteMemoizedSerializedSize;

  public static final int SEND_MARKETING_EMAILS_FIELD_NUMBER = 2;
  private boolean sendMarketingEmails_;
  /**
   * <code>bool send_marketing_emails = 2;</code>
   * @return The sendMarketingEmails.
   */
  public boolean getSendMarketingEmails() {
    return sendMarketingEmails_;
  }

  public static final int SEND_PUSH_NOTIFICATIONS_FIELD_NUMBER = 3;
  private boolean sendPushNotifications_;
  /**
   * <code>bool send_push_notifications = 3;</code>
   * @return The sendPushNotifications.
   */
  public boolean getSendPushNotifications() {
    return sendPushNotifications_;
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
    getSerializedSize();
    if (getTutorialCompleteList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(tutorialCompleteMemoizedSerializedSize);
    }
    for (int i = 0; i < tutorialComplete_.size(); i++) {
      output.writeEnumNoTag(tutorialComplete_.get(i));
    }
    if (sendMarketingEmails_ != false) {
      output.writeBool(2, sendMarketingEmails_);
    }
    if (sendPushNotifications_ != false) {
      output.writeBool(3, sendPushNotifications_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < tutorialComplete_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(tutorialComplete_.get(i));
      }
      size += dataSize;
      if (!getTutorialCompleteList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }tutorialCompleteMemoizedSerializedSize = dataSize;
    }
    if (sendMarketingEmails_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, sendMarketingEmails_);
    }
    if (sendPushNotifications_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, sendPushNotifications_);
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
    if (!(obj instanceof POGOProtos.Rpc.MarkTutorialCompleteProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.MarkTutorialCompleteProto other = (POGOProtos.Rpc.MarkTutorialCompleteProto) obj;

    if (!tutorialComplete_.equals(other.tutorialComplete_)) return false;
    if (getSendMarketingEmails()
        != other.getSendMarketingEmails()) return false;
    if (getSendPushNotifications()
        != other.getSendPushNotifications()) return false;
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
    if (getTutorialCompleteCount() > 0) {
      hash = (37 * hash) + TUTORIAL_COMPLETE_FIELD_NUMBER;
      hash = (53 * hash) + tutorialComplete_.hashCode();
    }
    hash = (37 * hash) + SEND_MARKETING_EMAILS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSendMarketingEmails());
    hash = (37 * hash) + SEND_PUSH_NOTIFICATIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSendPushNotifications());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.MarkTutorialCompleteProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.MarkTutorialCompleteProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.MarkTutorialCompleteProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.MarkTutorialCompleteProto)
      POGOProtos.Rpc.MarkTutorialCompleteProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkTutorialCompleteProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkTutorialCompleteProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.MarkTutorialCompleteProto.class, POGOProtos.Rpc.MarkTutorialCompleteProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.MarkTutorialCompleteProto.newBuilder()
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
      tutorialComplete_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      sendMarketingEmails_ = false;

      sendPushNotifications_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_MarkTutorialCompleteProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MarkTutorialCompleteProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.MarkTutorialCompleteProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.MarkTutorialCompleteProto build() {
      POGOProtos.Rpc.MarkTutorialCompleteProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.MarkTutorialCompleteProto buildPartial() {
      POGOProtos.Rpc.MarkTutorialCompleteProto result = new POGOProtos.Rpc.MarkTutorialCompleteProto(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        tutorialComplete_ = java.util.Collections.unmodifiableList(tutorialComplete_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tutorialComplete_ = tutorialComplete_;
      result.sendMarketingEmails_ = sendMarketingEmails_;
      result.sendPushNotifications_ = sendPushNotifications_;
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
      if (other instanceof POGOProtos.Rpc.MarkTutorialCompleteProto) {
        return mergeFrom((POGOProtos.Rpc.MarkTutorialCompleteProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.MarkTutorialCompleteProto other) {
      if (other == POGOProtos.Rpc.MarkTutorialCompleteProto.getDefaultInstance()) return this;
      if (!other.tutorialComplete_.isEmpty()) {
        if (tutorialComplete_.isEmpty()) {
          tutorialComplete_ = other.tutorialComplete_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTutorialCompleteIsMutable();
          tutorialComplete_.addAll(other.tutorialComplete_);
        }
        onChanged();
      }
      if (other.getSendMarketingEmails() != false) {
        setSendMarketingEmails(other.getSendMarketingEmails());
      }
      if (other.getSendPushNotifications() != false) {
        setSendPushNotifications(other.getSendPushNotifications());
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
      POGOProtos.Rpc.MarkTutorialCompleteProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.MarkTutorialCompleteProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> tutorialComplete_ =
      java.util.Collections.emptyList();
    private void ensureTutorialCompleteIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tutorialComplete_ = new java.util.ArrayList<java.lang.Integer>(tutorialComplete_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @return A list containing the tutorialComplete.
     */
    public java.util.List<POGOProtos.Rpc.TutorialCompletion> getTutorialCompleteList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, POGOProtos.Rpc.TutorialCompletion>(tutorialComplete_, tutorialComplete_converter_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @return The count of tutorialComplete.
     */
    public int getTutorialCompleteCount() {
      return tutorialComplete_.size();
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param index The index of the element to return.
     * @return The tutorialComplete at the given index.
     */
    public POGOProtos.Rpc.TutorialCompletion getTutorialComplete(int index) {
      return tutorialComplete_converter_.convert(tutorialComplete_.get(index));
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param index The index to set the value at.
     * @param value The tutorialComplete to set.
     * @return This builder for chaining.
     */
    public Builder setTutorialComplete(
        int index, POGOProtos.Rpc.TutorialCompletion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTutorialCompleteIsMutable();
      tutorialComplete_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param value The tutorialComplete to add.
     * @return This builder for chaining.
     */
    public Builder addTutorialComplete(POGOProtos.Rpc.TutorialCompletion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTutorialCompleteIsMutable();
      tutorialComplete_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param values The tutorialComplete to add.
     * @return This builder for chaining.
     */
    public Builder addAllTutorialComplete(
        java.lang.Iterable<? extends POGOProtos.Rpc.TutorialCompletion> values) {
      ensureTutorialCompleteIsMutable();
      for (POGOProtos.Rpc.TutorialCompletion value : values) {
        tutorialComplete_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTutorialComplete() {
      tutorialComplete_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @return A list containing the enum numeric values on the wire for tutorialComplete.
     */
    public java.util.List<java.lang.Integer>
    getTutorialCompleteValueList() {
      return java.util.Collections.unmodifiableList(tutorialComplete_);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tutorialComplete at the given index.
     */
    public int getTutorialCompleteValue(int index) {
      return tutorialComplete_.get(index);
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tutorialComplete at the given index.
     * @return This builder for chaining.
     */
    public Builder setTutorialCompleteValue(
        int index, int value) {
      ensureTutorialCompleteIsMutable();
      tutorialComplete_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param value The enum numeric value on the wire for tutorialComplete to add.
     * @return This builder for chaining.
     */
    public Builder addTutorialCompleteValue(int value) {
      ensureTutorialCompleteIsMutable();
      tutorialComplete_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Rpc.TutorialCompletion tutorial_complete = 1;</code>
     * @param values The enum numeric values on the wire for tutorialComplete to add.
     * @return This builder for chaining.
     */
    public Builder addAllTutorialCompleteValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureTutorialCompleteIsMutable();
      for (int value : values) {
        tutorialComplete_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean sendMarketingEmails_ ;
    /**
     * <code>bool send_marketing_emails = 2;</code>
     * @return The sendMarketingEmails.
     */
    public boolean getSendMarketingEmails() {
      return sendMarketingEmails_;
    }
    /**
     * <code>bool send_marketing_emails = 2;</code>
     * @param value The sendMarketingEmails to set.
     * @return This builder for chaining.
     */
    public Builder setSendMarketingEmails(boolean value) {
      
      sendMarketingEmails_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool send_marketing_emails = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendMarketingEmails() {
      
      sendMarketingEmails_ = false;
      onChanged();
      return this;
    }

    private boolean sendPushNotifications_ ;
    /**
     * <code>bool send_push_notifications = 3;</code>
     * @return The sendPushNotifications.
     */
    public boolean getSendPushNotifications() {
      return sendPushNotifications_;
    }
    /**
     * <code>bool send_push_notifications = 3;</code>
     * @param value The sendPushNotifications to set.
     * @return This builder for chaining.
     */
    public Builder setSendPushNotifications(boolean value) {
      
      sendPushNotifications_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool send_push_notifications = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSendPushNotifications() {
      
      sendPushNotifications_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.MarkTutorialCompleteProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.MarkTutorialCompleteProto)
  private static final POGOProtos.Rpc.MarkTutorialCompleteProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.MarkTutorialCompleteProto();
  }

  public static POGOProtos.Rpc.MarkTutorialCompleteProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarkTutorialCompleteProto>
      PARSER = new com.google.protobuf.AbstractParser<MarkTutorialCompleteProto>() {
    @java.lang.Override
    public MarkTutorialCompleteProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MarkTutorialCompleteProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MarkTutorialCompleteProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarkTutorialCompleteProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.MarkTutorialCompleteProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

