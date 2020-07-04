// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ClientQuestProto}
 */
public  final class ClientQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClientQuestProto)
    ClientQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientQuestProto.newBuilder() to construct.
  private ClientQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientQuestProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientQuestProto(
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
            POGOProtos.Rpc.QuestProto.Builder subBuilder = null;
            if (quest_ != null) {
              subBuilder = quest_.toBuilder();
            }
            quest_ = input.readMessage(POGOProtos.Rpc.QuestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(quest_);
              quest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            POGOProtos.Rpc.QuestDisplayProto.Builder subBuilder = null;
            if (questDisplay_ != null) {
              subBuilder = questDisplay_.toBuilder();
            }
            questDisplay_ = input.readMessage(POGOProtos.Rpc.QuestDisplayProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(questDisplay_);
              questDisplay_ = subBuilder.buildPartial();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClientQuestProto.class, POGOProtos.Rpc.ClientQuestProto.Builder.class);
  }

  public static final int QUEST_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.QuestProto quest_;
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
   * @return Whether the quest field is set.
   */
  public boolean hasQuest() {
    return quest_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
   * @return The quest.
   */
  public POGOProtos.Rpc.QuestProto getQuest() {
    return quest_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : quest_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  public POGOProtos.Rpc.QuestProtoOrBuilder getQuestOrBuilder() {
    return getQuest();
  }

  public static final int QUEST_DISPLAY_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.QuestDisplayProto questDisplay_;
  /**
   * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
   * @return Whether the questDisplay field is set.
   */
  public boolean hasQuestDisplay() {
    return questDisplay_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
   * @return The questDisplay.
   */
  public POGOProtos.Rpc.QuestDisplayProto getQuestDisplay() {
    return questDisplay_ == null ? POGOProtos.Rpc.QuestDisplayProto.getDefaultInstance() : questDisplay_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
   */
  public POGOProtos.Rpc.QuestDisplayProtoOrBuilder getQuestDisplayOrBuilder() {
    return getQuestDisplay();
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
    if (quest_ != null) {
      output.writeMessage(1, getQuest());
    }
    if (questDisplay_ != null) {
      output.writeMessage(2, getQuestDisplay());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (quest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQuest());
    }
    if (questDisplay_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQuestDisplay());
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
    if (!(obj instanceof POGOProtos.Rpc.ClientQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClientQuestProto other = (POGOProtos.Rpc.ClientQuestProto) obj;

    if (hasQuest() != other.hasQuest()) return false;
    if (hasQuest()) {
      if (!getQuest()
          .equals(other.getQuest())) return false;
    }
    if (hasQuestDisplay() != other.hasQuestDisplay()) return false;
    if (hasQuestDisplay()) {
      if (!getQuestDisplay()
          .equals(other.getQuestDisplay())) return false;
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
    if (hasQuest()) {
      hash = (37 * hash) + QUEST_FIELD_NUMBER;
      hash = (53 * hash) + getQuest().hashCode();
    }
    if (hasQuestDisplay()) {
      hash = (37 * hash) + QUEST_DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getQuestDisplay().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClientQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ClientQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClientQuestProto)
      POGOProtos.Rpc.ClientQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClientQuestProto.class, POGOProtos.Rpc.ClientQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClientQuestProto.newBuilder()
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
      if (questBuilder_ == null) {
        quest_ = null;
      } else {
        quest_ = null;
        questBuilder_ = null;
      }
      if (questDisplayBuilder_ == null) {
        questDisplay_ = null;
      } else {
        questDisplay_ = null;
        questDisplayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClientQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientQuestProto build() {
      POGOProtos.Rpc.ClientQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientQuestProto buildPartial() {
      POGOProtos.Rpc.ClientQuestProto result = new POGOProtos.Rpc.ClientQuestProto(this);
      if (questBuilder_ == null) {
        result.quest_ = quest_;
      } else {
        result.quest_ = questBuilder_.build();
      }
      if (questDisplayBuilder_ == null) {
        result.questDisplay_ = questDisplay_;
      } else {
        result.questDisplay_ = questDisplayBuilder_.build();
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
      if (other instanceof POGOProtos.Rpc.ClientQuestProto) {
        return mergeFrom((POGOProtos.Rpc.ClientQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClientQuestProto other) {
      if (other == POGOProtos.Rpc.ClientQuestProto.getDefaultInstance()) return this;
      if (other.hasQuest()) {
        mergeQuest(other.getQuest());
      }
      if (other.hasQuestDisplay()) {
        mergeQuestDisplay(other.getQuestDisplay());
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
      POGOProtos.Rpc.ClientQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClientQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private POGOProtos.Rpc.QuestProto quest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder> questBuilder_;
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     * @return Whether the quest field is set.
     */
    public boolean hasQuest() {
      return questBuilder_ != null || quest_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     * @return The quest.
     */
    public POGOProtos.Rpc.QuestProto getQuest() {
      if (questBuilder_ == null) {
        return quest_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : quest_;
      } else {
        return questBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     */
    public Builder setQuest(POGOProtos.Rpc.QuestProto value) {
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
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     */
    public Builder setQuest(
        POGOProtos.Rpc.QuestProto.Builder builderForValue) {
      if (questBuilder_ == null) {
        quest_ = builderForValue.build();
        onChanged();
      } else {
        questBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     */
    public Builder mergeQuest(POGOProtos.Rpc.QuestProto value) {
      if (questBuilder_ == null) {
        if (quest_ != null) {
          quest_ =
            POGOProtos.Rpc.QuestProto.newBuilder(quest_).mergeFrom(value).buildPartial();
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
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
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
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     */
    public POGOProtos.Rpc.QuestProto.Builder getQuestBuilder() {
      
      onChanged();
      return getQuestFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     */
    public POGOProtos.Rpc.QuestProtoOrBuilder getQuestOrBuilder() {
      if (questBuilder_ != null) {
        return questBuilder_.getMessageOrBuilder();
      } else {
        return quest_ == null ?
            POGOProtos.Rpc.QuestProto.getDefaultInstance() : quest_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder> 
        getQuestFieldBuilder() {
      if (questBuilder_ == null) {
        questBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.QuestProto, POGOProtos.Rpc.QuestProto.Builder, POGOProtos.Rpc.QuestProtoOrBuilder>(
                getQuest(),
                getParentForChildren(),
                isClean());
        quest_ = null;
      }
      return questBuilder_;
    }

    private POGOProtos.Rpc.QuestDisplayProto questDisplay_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestDisplayProto, POGOProtos.Rpc.QuestDisplayProto.Builder, POGOProtos.Rpc.QuestDisplayProtoOrBuilder> questDisplayBuilder_;
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     * @return Whether the questDisplay field is set.
     */
    public boolean hasQuestDisplay() {
      return questDisplayBuilder_ != null || questDisplay_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     * @return The questDisplay.
     */
    public POGOProtos.Rpc.QuestDisplayProto getQuestDisplay() {
      if (questDisplayBuilder_ == null) {
        return questDisplay_ == null ? POGOProtos.Rpc.QuestDisplayProto.getDefaultInstance() : questDisplay_;
      } else {
        return questDisplayBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    public Builder setQuestDisplay(POGOProtos.Rpc.QuestDisplayProto value) {
      if (questDisplayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        questDisplay_ = value;
        onChanged();
      } else {
        questDisplayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    public Builder setQuestDisplay(
        POGOProtos.Rpc.QuestDisplayProto.Builder builderForValue) {
      if (questDisplayBuilder_ == null) {
        questDisplay_ = builderForValue.build();
        onChanged();
      } else {
        questDisplayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    public Builder mergeQuestDisplay(POGOProtos.Rpc.QuestDisplayProto value) {
      if (questDisplayBuilder_ == null) {
        if (questDisplay_ != null) {
          questDisplay_ =
            POGOProtos.Rpc.QuestDisplayProto.newBuilder(questDisplay_).mergeFrom(value).buildPartial();
        } else {
          questDisplay_ = value;
        }
        onChanged();
      } else {
        questDisplayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    public Builder clearQuestDisplay() {
      if (questDisplayBuilder_ == null) {
        questDisplay_ = null;
        onChanged();
      } else {
        questDisplay_ = null;
        questDisplayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    public POGOProtos.Rpc.QuestDisplayProto.Builder getQuestDisplayBuilder() {
      
      onChanged();
      return getQuestDisplayFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    public POGOProtos.Rpc.QuestDisplayProtoOrBuilder getQuestDisplayOrBuilder() {
      if (questDisplayBuilder_ != null) {
        return questDisplayBuilder_.getMessageOrBuilder();
      } else {
        return questDisplay_ == null ?
            POGOProtos.Rpc.QuestDisplayProto.getDefaultInstance() : questDisplay_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.QuestDisplayProto quest_display = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.QuestDisplayProto, POGOProtos.Rpc.QuestDisplayProto.Builder, POGOProtos.Rpc.QuestDisplayProtoOrBuilder> 
        getQuestDisplayFieldBuilder() {
      if (questDisplayBuilder_ == null) {
        questDisplayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.QuestDisplayProto, POGOProtos.Rpc.QuestDisplayProto.Builder, POGOProtos.Rpc.QuestDisplayProtoOrBuilder>(
                getQuestDisplay(),
                getParentForChildren(),
                isClean());
        questDisplay_ = null;
      }
      return questDisplayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClientQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClientQuestProto)
  private static final POGOProtos.Rpc.ClientQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClientQuestProto();
  }

  public static POGOProtos.Rpc.ClientQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<ClientQuestProto>() {
    @java.lang.Override
    public ClientQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClientQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
