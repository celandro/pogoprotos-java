// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/ProgressQuestResponse.proto

package POGOProtos.Networking.Responses;

/**
 * Protobuf type {@code POGOProtos.Networking.Responses.ProgressQuestResponse}
 */
public final class ProgressQuestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Networking.Responses.ProgressQuestResponse)
    ProgressQuestResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProgressQuestResponse.newBuilder() to construct.
  private ProgressQuestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProgressQuestResponse() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProgressQuestResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProgressQuestResponse(
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
            POGOProtos.Data.Quests.ClientQuest.Builder subBuilder = null;
            if (quest_ != null) {
              subBuilder = quest_.toBuilder();
            }
            quest_ = input.readMessage(POGOProtos.Data.Quests.ClientQuest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(quest_);
              quest_ = subBuilder.buildPartial();
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
    return POGOProtos.Networking.Responses.ProgressQuestResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ProgressQuestResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Networking.Responses.ProgressQuestResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ProgressQuestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Networking.Responses.ProgressQuestResponse.class, POGOProtos.Networking.Responses.ProgressQuestResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Networking.Responses.ProgressQuestResponse.Status}
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
     * <code>ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT = 3;</code>
     */
    ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT(3),
    /**
     * <code>ERROR_VALIDATION_FAILED = 4;</code>
     */
    ERROR_VALIDATION_FAILED(4),
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
     * <code>ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT = 3;</code>
     */
    public static final int ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT_VALUE = 3;
    /**
     * <code>ERROR_VALIDATION_FAILED = 4;</code>
     */
    public static final int ERROR_VALIDATION_FAILED_VALUE = 4;


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
        case 3: return ERROR_EXCEEDED_GEOTARGETED_SUBMISSION_LIMIT;
        case 4: return ERROR_VALIDATION_FAILED;
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
      return POGOProtos.Networking.Responses.ProgressQuestResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Networking.Responses.ProgressQuestResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public POGOProtos.Networking.Responses.ProgressQuestResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    POGOProtos.Networking.Responses.ProgressQuestResponse.Status result = POGOProtos.Networking.Responses.ProgressQuestResponse.Status.valueOf(status_);
    return result == null ? POGOProtos.Networking.Responses.ProgressQuestResponse.Status.UNRECOGNIZED : result;
  }

  public static final int QUEST_FIELD_NUMBER = 2;
  private POGOProtos.Data.Quests.ClientQuest quest_;
  /**
   * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
   * @return Whether the quest field is set.
   */
  @java.lang.Override
  public boolean hasQuest() {
    return quest_ != null;
  }
  /**
   * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
   * @return The quest.
   */
  @java.lang.Override
  public POGOProtos.Data.Quests.ClientQuest getQuest() {
    return quest_ == null ? POGOProtos.Data.Quests.ClientQuest.getDefaultInstance() : quest_;
  }
  /**
   * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Data.Quests.ClientQuestOrBuilder getQuestOrBuilder() {
    return getQuest();
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
    if (status_ != POGOProtos.Networking.Responses.ProgressQuestResponse.Status.UNSET.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (quest_ != null) {
      output.writeMessage(2, getQuest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != POGOProtos.Networking.Responses.ProgressQuestResponse.Status.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (quest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuest());
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
    if (!(obj instanceof POGOProtos.Networking.Responses.ProgressQuestResponse)) {
      return super.equals(obj);
    }
    POGOProtos.Networking.Responses.ProgressQuestResponse other = (POGOProtos.Networking.Responses.ProgressQuestResponse) obj;

    if (status_ != other.status_) return false;
    if (hasQuest() != other.hasQuest()) return false;
    if (hasQuest()) {
      if (!getQuest()
          .equals(other.getQuest())) return false;
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
    if (hasQuest()) {
      hash = (37 * hash) + QUEST_FIELD_NUMBER;
      hash = (53 * hash) + getQuest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Networking.Responses.ProgressQuestResponse parseFrom(
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
  public static Builder newBuilder(POGOProtos.Networking.Responses.ProgressQuestResponse prototype) {
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
   * Protobuf type {@code POGOProtos.Networking.Responses.ProgressQuestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Networking.Responses.ProgressQuestResponse)
      POGOProtos.Networking.Responses.ProgressQuestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Networking.Responses.ProgressQuestResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ProgressQuestResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Networking.Responses.ProgressQuestResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ProgressQuestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Networking.Responses.ProgressQuestResponse.class, POGOProtos.Networking.Responses.ProgressQuestResponse.Builder.class);
    }

    // Construct using POGOProtos.Networking.Responses.ProgressQuestResponse.newBuilder()
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

      if (questBuilder_ == null) {
        quest_ = null;
      } else {
        quest_ = null;
        questBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Networking.Responses.ProgressQuestResponseOuterClass.internal_static_POGOProtos_Networking_Responses_ProgressQuestResponse_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.ProgressQuestResponse getDefaultInstanceForType() {
      return POGOProtos.Networking.Responses.ProgressQuestResponse.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.ProgressQuestResponse build() {
      POGOProtos.Networking.Responses.ProgressQuestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Networking.Responses.ProgressQuestResponse buildPartial() {
      POGOProtos.Networking.Responses.ProgressQuestResponse result = new POGOProtos.Networking.Responses.ProgressQuestResponse(this);
      result.status_ = status_;
      if (questBuilder_ == null) {
        result.quest_ = quest_;
      } else {
        result.quest_ = questBuilder_.build();
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
      if (other instanceof POGOProtos.Networking.Responses.ProgressQuestResponse) {
        return mergeFrom((POGOProtos.Networking.Responses.ProgressQuestResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Networking.Responses.ProgressQuestResponse other) {
      if (other == POGOProtos.Networking.Responses.ProgressQuestResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasQuest()) {
        mergeQuest(other.getQuest());
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
      POGOProtos.Networking.Responses.ProgressQuestResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Networking.Responses.ProgressQuestResponse) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public POGOProtos.Networking.Responses.ProgressQuestResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      POGOProtos.Networking.Responses.ProgressQuestResponse.Status result = POGOProtos.Networking.Responses.ProgressQuestResponse.Status.valueOf(status_);
      return result == null ? POGOProtos.Networking.Responses.ProgressQuestResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(POGOProtos.Networking.Responses.ProgressQuestResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Networking.Responses.ProgressQuestResponse.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Data.Quests.ClientQuest quest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Quests.ClientQuest, POGOProtos.Data.Quests.ClientQuest.Builder, POGOProtos.Data.Quests.ClientQuestOrBuilder> questBuilder_;
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     * @return Whether the quest field is set.
     */
    public boolean hasQuest() {
      return questBuilder_ != null || quest_ != null;
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     * @return The quest.
     */
    public POGOProtos.Data.Quests.ClientQuest getQuest() {
      if (questBuilder_ == null) {
        return quest_ == null ? POGOProtos.Data.Quests.ClientQuest.getDefaultInstance() : quest_;
      } else {
        return questBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    public Builder setQuest(POGOProtos.Data.Quests.ClientQuest value) {
      if (questBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quest_ = value;
        onChanged();
      } else {
        questBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    public Builder setQuest(
        POGOProtos.Data.Quests.ClientQuest.Builder builderForValue) {
      if (questBuilder_ == null) {
        quest_ = builderForValue.build();
        onChanged();
      } else {
        questBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    public Builder mergeQuest(POGOProtos.Data.Quests.ClientQuest value) {
      if (questBuilder_ == null) {
        if (quest_ != null) {
          quest_ =
            POGOProtos.Data.Quests.ClientQuest.newBuilder(quest_).mergeFrom(value).buildPartial();
        } else {
          quest_ = value;
        }
        onChanged();
      } else {
        questBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    public Builder clearQuest() {
      if (questBuilder_ == null) {
        quest_ = null;
        onChanged();
      } else {
        quest_ = null;
        questBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuest.Builder getQuestBuilder() {
      
      onChanged();
      return getQuestFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    public POGOProtos.Data.Quests.ClientQuestOrBuilder getQuestOrBuilder() {
      if (questBuilder_ != null) {
        return questBuilder_.getMessageOrBuilder();
      } else {
        return quest_ == null ?
            POGOProtos.Data.Quests.ClientQuest.getDefaultInstance() : quest_;
      }
    }
    /**
     * <code>.POGOProtos.Data.Quests.ClientQuest quest = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Data.Quests.ClientQuest, POGOProtos.Data.Quests.ClientQuest.Builder, POGOProtos.Data.Quests.ClientQuestOrBuilder> 
        getQuestFieldBuilder() {
      if (questBuilder_ == null) {
        questBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Data.Quests.ClientQuest, POGOProtos.Data.Quests.ClientQuest.Builder, POGOProtos.Data.Quests.ClientQuestOrBuilder>(
                getQuest(),
                getParentForChildren(),
                isClean());
        quest_ = null;
      }
      return questBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Networking.Responses.ProgressQuestResponse)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Networking.Responses.ProgressQuestResponse)
  private static final POGOProtos.Networking.Responses.ProgressQuestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Networking.Responses.ProgressQuestResponse();
  }

  public static POGOProtos.Networking.Responses.ProgressQuestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProgressQuestResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProgressQuestResponse>() {
    @java.lang.Override
    public ProgressQuestResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProgressQuestResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProgressQuestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProgressQuestResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Networking.Responses.ProgressQuestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

