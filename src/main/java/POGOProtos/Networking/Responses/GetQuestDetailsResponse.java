// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetQuestDetailsResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.GetQuestDetailsResponse}
 */
public  final class GetQuestDetailsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.GetQuestDetailsResponse)
    GetQuestDetailsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetQuestDetailsResponse.newBuilder() to construct.
  private GetQuestDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetQuestDetailsResponse() {
    status_ = 0;
    quests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetQuestDetailsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetQuestDetailsResponse(
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

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              quests_ = new java.util.ArrayList<POGOProtos.Data.Quests.ClientQuest>();
              mutable_bitField0_ |= 0x00000001;
            }
            quests_.add(
                input.readMessage(POGOProtos.Data.Quests.ClientQuest.parser(), extensionRegistry));
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
        quests_ = java.util.Collections.unmodifiableList(quests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Networking.Responses.GetQuestDetailsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetQuestDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.GetQuestDetailsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetQuestDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.GetQuestDetailsResponse.class, POGOProtos.Networking.Responses.GetQuestDetailsResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status}
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
     * <code>ERROR_QUEST_NOT_FOUND = 2;</code>
     */
    ERROR_QUEST_NOT_FOUND(2),
    /**
     * <code>ERROR_INVALID_DISPLAY = 3;</code>
     */
    ERROR_INVALID_DISPLAY(3),
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
     * <code>ERROR_QUEST_NOT_FOUND = 2;</code>
     */
    public static final int ERROR_QUEST_NOT_FOUND_VALUE = 2;
    /**
     * <code>ERROR_INVALID_DISPLAY = 3;</code>
     */
    public static final int ERROR_INVALID_DISPLAY_VALUE = 3;


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
        case 2: return ERROR_QUEST_NOT_FOUND;
        case 3: return ERROR_INVALID_DISPLAY;
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
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.GetQuestDetailsResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
   * @return The status.
   */
  public POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status result = POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status.UNRECOGNIZED : result;
  }

  public static final int QUESTS_FIELD_NUMBER = 2;
  private java.util.List<POGOProtos.Data.Quests.ClientQuest> quests_;
  /**
   * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
   */
  public java.util.List<POGOProtos.Data.Quests.ClientQuest> getQuestsList() {
    return quests_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
   */
  public java.util.List<? extends POGOProtos.Data.Quests.ClientQuestOrBuilder> 
      getQuestsOrBuilderList() {
    return quests_;
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
   */
  public int getQuestsCount() {
    return quests_.size();
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
   */
  public POGOProtos.Data.Quests.ClientQuest getQuests(int index) {
    return quests_.get(index);
  }
  /**
   * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
   */
  public POGOProtos.Data.Quests.ClientQuestOrBuilder getQuestsOrBuilder(
      int index) {
    return quests_.get(index);
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
    if (status_ != POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < quests_.size(); i++) {
      output.writeMessage(2, quests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < quests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, quests_.get(i));
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
    if (!(obj instanceof POGOProtos.Networking.Responses.GetQuestDetailsResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.GetQuestDetailsResponse other = (POGOProtos.Networking.Responses.GetQuestDetailsResponse) obj;

    if (status_ != other.status_) return false;
    if (!getQuestsList()
        .equals(other.getQuestsList())) return false;
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
    if (getQuestsCount() > 0) {
      hash = (37 * hash) + QUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getQuestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.GetQuestDetailsResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.GetQuestDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.GetQuestDetailsResponse)
      POGOProtos.Networking.Responses.GetQuestDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.GetQuestDetailsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetQuestDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.GetQuestDetailsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetQuestDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.GetQuestDetailsResponse.class, POGOProtos.Networking.Responses.GetQuestDetailsResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.GetQuestDetailsResponse.newBuilder()
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
        getQuestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (questsBuilder_ == null) {
        quests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        questsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.GetQuestDetailsResponseOuterClass.internal_static_POGOProtos_Networking_Responses_GetQuestDetailsResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GetQuestDetailsResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.GetQuestDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GetQuestDetailsResponse build() {
      POGOProtos.Networking.Responses.GetQuestDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.GetQuestDetailsResponse buildPartial() {
      POGOProtos.Networking.Responses.GetQuestDetailsResponse result = new POGOProtos.Networking.Responses.GetQuestDetailsResponse(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      if (questsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          quests_ = java.util.Collections.unmodifiableList(quests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.quests_ = quests_;
      } else {
        result.quests_ = questsBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.GetQuestDetailsResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.GetQuestDetailsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.GetQuestDetailsResponse other) {
      if (other == POGOProtos.Networking.Responses.GetQuestDetailsResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (questsBuilder_ == null) {
        if (!other.quests_.isEmpty()) {
          if (quests_.isEmpty()) {
            quests_ = other.quests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQuestsIsMutable();
            quests_.addAll(other.quests_);
          }
          onChanged();
        }
      } else {
        if (!other.quests_.isEmpty()) {
          if (questsBuilder_.isEmpty()) {
            questsBuilder_.dispose();
            questsBuilder_ = null;
            quests_ = other.quests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            questsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getQuestsFieldBuilder() : null;
          } else {
            questsBuilder_.addAllMessages(other.quests_);
          }
        }
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
      POGOProtos.Networking.Responses.GetQuestDetailsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.GetQuestDetailsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
     * @return The status.
     */
    public POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status result = POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.GetQuestDetailsResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<POGOProtos.Data.Quests.ClientQuest> quests_ =
      java.util.Collections.emptyList();
    private void ensureQuestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        quests_ = new java.util.ArrayList<POGOProtos.Data.Quests.ClientQuest>(quests_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.ClientQuest, POGOProtos.Data.Quests.ClientQuest.Builder, POGOProtos.Data.Quests.ClientQuestOrBuilder> questsBuilder_;

    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.ClientQuest> getQuestsList() {
      if (questsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(quests_);
      } else {
        return questsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public int getQuestsCount() {
      if (questsBuilder_ == null) {
        return quests_.size();
      } else {
        return questsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuest getQuests(int index) {
      if (questsBuilder_ == null) {
        return quests_.get(index);
      } else {
        return questsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder setQuests(
        int index, POGOProtos.Data.Quests.ClientQuest value) {
      if (questsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuestsIsMutable();
        quests_.set(index, value);
        onChanged();
      } else {
        questsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder setQuests(
        int index, POGOProtos.Data.Quests.ClientQuest.Builder builderForValue) {
      if (questsBuilder_ == null) {
        ensureQuestsIsMutable();
        quests_.set(index, builderForValue.build());
        onChanged();
      } else {
        questsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder addQuests(POGOProtos.Data.Quests.ClientQuest value) {
      if (questsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuestsIsMutable();
        quests_.add(value);
        onChanged();
      } else {
        questsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder addQuests(
        int index, POGOProtos.Data.Quests.ClientQuest value) {
      if (questsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuestsIsMutable();
        quests_.add(index, value);
        onChanged();
      } else {
        questsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder addQuests(
        POGOProtos.Data.Quests.ClientQuest.Builder builderForValue) {
      if (questsBuilder_ == null) {
        ensureQuestsIsMutable();
        quests_.add(builderForValue.build());
        onChanged();
      } else {
        questsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder addQuests(
        int index, POGOProtos.Data.Quests.ClientQuest.Builder builderForValue) {
      if (questsBuilder_ == null) {
        ensureQuestsIsMutable();
        quests_.add(index, builderForValue.build());
        onChanged();
      } else {
        questsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder addAllQuests(
        java.lang.Iterable<? extends POGOProtos.Data.Quests.ClientQuest> values) {
      if (questsBuilder_ == null) {
        ensureQuestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, quests_);
        onChanged();
      } else {
        questsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder clearQuests() {
      if (questsBuilder_ == null) {
        quests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        questsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public Builder removeQuests(int index) {
      if (questsBuilder_ == null) {
        ensureQuestsIsMutable();
        quests_.remove(index);
        onChanged();
      } else {
        questsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuest.Builder getQuestsBuilder(
        int index) {
      return getQuestsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuestOrBuilder getQuestsOrBuilder(
        int index) {
      if (questsBuilder_ == null) {
        return quests_.get(index);  } else {
        return questsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public java.util.List<? extends POGOProtos.Data.Quests.ClientQuestOrBuilder> 
         getQuestsOrBuilderList() {
      if (questsBuilder_ != null) {
        return questsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(quests_);
      }
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuest.Builder addQuestsBuilder() {
      return getQuestsFieldBuilder().addBuilder(
          POGOProtos.Data.Quests.ClientQuest.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuest.Builder addQuestsBuilder(
        int index) {
      return getQuestsFieldBuilder().addBuilder(
          index, POGOProtos.Data.Quests.ClientQuest.getDefaultInstance());
    }
    /**
     * <code>repeated .POGOProtos.Data.Quests.ClientQuest quests = 2;</code>
     */
    public java.util.List<POGOProtos.Data.Quests.ClientQuest.Builder> 
         getQuestsBuilderList() {
      return getQuestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        POGOProtos.Data.Quests.ClientQuest, POGOProtos.Data.Quests.ClientQuest.Builder, POGOProtos.Data.Quests.ClientQuestOrBuilder> 
        getQuestsFieldBuilder() {
      if (questsBuilder_ == null) {
        questsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            POGOProtos.Data.Quests.ClientQuest, POGOProtos.Data.Quests.ClientQuest.Builder, POGOProtos.Data.Quests.ClientQuestOrBuilder>(
                quests_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        quests_ = null;
      }
      return questsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.GetQuestDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.GetQuestDetailsResponse)
  private static final POGOProtos.Networking.Responses.GetQuestDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.GetQuestDetailsResponse();
  }

  public static POGOProtos.Networking.Responses.GetQuestDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetQuestDetailsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetQuestDetailsResponse>() {
    @java.lang.Override
    public GetQuestDetailsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetQuestDetailsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetQuestDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetQuestDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.GetQuestDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

