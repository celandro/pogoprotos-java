// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ProgressQuestProto}
 */
public final class ProgressQuestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ProgressQuestProto)
    ProgressQuestProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProgressQuestProto.newBuilder() to construct.
  private ProgressQuestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProgressQuestProto() {
    questId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProgressQuestProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProgressQuestProto(
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

            questId_ = s;
            break;
          }
          case 16: {

            currentProgress_ = input.readInt32();
            break;
          }
          case 26: {
            POGOProtos.Rpc.GeotargetedQuestValidation.Builder subBuilder = null;
            if (targetCase_ == 3) {
              subBuilder = ((POGOProtos.Rpc.GeotargetedQuestValidation) target_).toBuilder();
            }
            target_ =
                input.readMessage(POGOProtos.Rpc.GeotargetedQuestValidation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((POGOProtos.Rpc.GeotargetedQuestValidation) target_);
              target_ = subBuilder.buildPartial();
            }
            targetCase_ = 3;
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ProgressQuestProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ProgressQuestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ProgressQuestProto.class, POGOProtos.Rpc.ProgressQuestProto.Builder.class);
  }

  private int targetCase_ = 0;
  private java.lang.Object target_;
  public enum TargetCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GEOTARGETED_QUEST_VALIDATION(3),
    TARGET_NOT_SET(0);
    private final int value;
    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 3: return GEOTARGETED_QUEST_VALIDATION;
        case 0: return TARGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase
  getTargetCase() {
    return TargetCase.forNumber(
        targetCase_);
  }

  public static final int GEOTARGETED_QUEST_VALIDATION_FIELD_NUMBER = 3;
  /**
   * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
   * @return Whether the geotargetedQuestValidation field is set.
   */
  @java.lang.Override
  public boolean hasGeotargetedQuestValidation() {
    return targetCase_ == 3;
  }
  /**
   * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
   * @return The geotargetedQuestValidation.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GeotargetedQuestValidation getGeotargetedQuestValidation() {
    if (targetCase_ == 3) {
       return (POGOProtos.Rpc.GeotargetedQuestValidation) target_;
    }
    return POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance();
  }
  /**
   * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GeotargetedQuestValidationOrBuilder getGeotargetedQuestValidationOrBuilder() {
    if (targetCase_ == 3) {
       return (POGOProtos.Rpc.GeotargetedQuestValidation) target_;
    }
    return POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance();
  }

  public static final int QUEST_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object questId_;
  /**
   * <code>string quest_id = 1;</code>
   * @return The questId.
   */
  @java.lang.Override
  public java.lang.String getQuestId() {
    java.lang.Object ref = questId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      questId_ = s;
      return s;
    }
  }
  /**
   * <code>string quest_id = 1;</code>
   * @return The bytes for questId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuestIdBytes() {
    java.lang.Object ref = questId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      questId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENT_PROGRESS_FIELD_NUMBER = 2;
  private int currentProgress_;
  /**
   * <code>int32 current_progress = 2;</code>
   * @return The currentProgress.
   */
  @java.lang.Override
  public int getCurrentProgress() {
    return currentProgress_;
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
    if (!getQuestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, questId_);
    }
    if (currentProgress_ != 0) {
      output.writeInt32(2, currentProgress_);
    }
    if (targetCase_ == 3) {
      output.writeMessage(3, (POGOProtos.Rpc.GeotargetedQuestValidation) target_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getQuestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, questId_);
    }
    if (currentProgress_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, currentProgress_);
    }
    if (targetCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (POGOProtos.Rpc.GeotargetedQuestValidation) target_);
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
    if (!(obj instanceof POGOProtos.Rpc.ProgressQuestProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ProgressQuestProto other = (POGOProtos.Rpc.ProgressQuestProto) obj;

    if (!getQuestId()
        .equals(other.getQuestId())) return false;
    if (getCurrentProgress()
        != other.getCurrentProgress()) return false;
    if (!getTargetCase().equals(other.getTargetCase())) return false;
    switch (targetCase_) {
      case 3:
        if (!getGeotargetedQuestValidation()
            .equals(other.getGeotargetedQuestValidation())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQuestId().hashCode();
    hash = (37 * hash) + CURRENT_PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentProgress();
    switch (targetCase_) {
      case 3:
        hash = (37 * hash) + GEOTARGETED_QUEST_VALIDATION_FIELD_NUMBER;
        hash = (53 * hash) + getGeotargetedQuestValidation().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ProgressQuestProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ProgressQuestProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ProgressQuestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ProgressQuestProto)
      POGOProtos.Rpc.ProgressQuestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ProgressQuestProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ProgressQuestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ProgressQuestProto.class, POGOProtos.Rpc.ProgressQuestProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ProgressQuestProto.newBuilder()
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
      questId_ = "";

      currentProgress_ = 0;

      targetCase_ = 0;
      target_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ProgressQuestProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ProgressQuestProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ProgressQuestProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ProgressQuestProto build() {
      POGOProtos.Rpc.ProgressQuestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ProgressQuestProto buildPartial() {
      POGOProtos.Rpc.ProgressQuestProto result = new POGOProtos.Rpc.ProgressQuestProto(this);
      if (targetCase_ == 3) {
        if (geotargetedQuestValidationBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = geotargetedQuestValidationBuilder_.build();
        }
      }
      result.questId_ = questId_;
      result.currentProgress_ = currentProgress_;
      result.targetCase_ = targetCase_;
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
      if (other instanceof POGOProtos.Rpc.ProgressQuestProto) {
        return mergeFrom((POGOProtos.Rpc.ProgressQuestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ProgressQuestProto other) {
      if (other == POGOProtos.Rpc.ProgressQuestProto.getDefaultInstance()) return this;
      if (!other.getQuestId().isEmpty()) {
        questId_ = other.questId_;
        onChanged();
      }
      if (other.getCurrentProgress() != 0) {
        setCurrentProgress(other.getCurrentProgress());
      }
      switch (other.getTargetCase()) {
        case GEOTARGETED_QUEST_VALIDATION: {
          mergeGeotargetedQuestValidation(other.getGeotargetedQuestValidation());
          break;
        }
        case TARGET_NOT_SET: {
          break;
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
      POGOProtos.Rpc.ProgressQuestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ProgressQuestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int targetCase_ = 0;
    private java.lang.Object target_;
    public TargetCase
        getTargetCase() {
      return TargetCase.forNumber(
          targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GeotargetedQuestValidation, POGOProtos.Rpc.GeotargetedQuestValidation.Builder, POGOProtos.Rpc.GeotargetedQuestValidationOrBuilder> geotargetedQuestValidationBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     * @return Whether the geotargetedQuestValidation field is set.
     */
    @java.lang.Override
    public boolean hasGeotargetedQuestValidation() {
      return targetCase_ == 3;
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     * @return The geotargetedQuestValidation.
     */
    @java.lang.Override
    public POGOProtos.Rpc.GeotargetedQuestValidation getGeotargetedQuestValidation() {
      if (geotargetedQuestValidationBuilder_ == null) {
        if (targetCase_ == 3) {
          return (POGOProtos.Rpc.GeotargetedQuestValidation) target_;
        }
        return POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance();
      } else {
        if (targetCase_ == 3) {
          return geotargetedQuestValidationBuilder_.getMessage();
        }
        return POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    public Builder setGeotargetedQuestValidation(POGOProtos.Rpc.GeotargetedQuestValidation value) {
      if (geotargetedQuestValidationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        geotargetedQuestValidationBuilder_.setMessage(value);
      }
      targetCase_ = 3;
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    public Builder setGeotargetedQuestValidation(
        POGOProtos.Rpc.GeotargetedQuestValidation.Builder builderForValue) {
      if (geotargetedQuestValidationBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        geotargetedQuestValidationBuilder_.setMessage(builderForValue.build());
      }
      targetCase_ = 3;
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    public Builder mergeGeotargetedQuestValidation(POGOProtos.Rpc.GeotargetedQuestValidation value) {
      if (geotargetedQuestValidationBuilder_ == null) {
        if (targetCase_ == 3 &&
            target_ != POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance()) {
          target_ = POGOProtos.Rpc.GeotargetedQuestValidation.newBuilder((POGOProtos.Rpc.GeotargetedQuestValidation) target_)
              .mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        if (targetCase_ == 3) {
          geotargetedQuestValidationBuilder_.mergeFrom(value);
        }
        geotargetedQuestValidationBuilder_.setMessage(value);
      }
      targetCase_ = 3;
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    public Builder clearGeotargetedQuestValidation() {
      if (geotargetedQuestValidationBuilder_ == null) {
        if (targetCase_ == 3) {
          targetCase_ = 0;
          target_ = null;
          onChanged();
        }
      } else {
        if (targetCase_ == 3) {
          targetCase_ = 0;
          target_ = null;
        }
        geotargetedQuestValidationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    public POGOProtos.Rpc.GeotargetedQuestValidation.Builder getGeotargetedQuestValidationBuilder() {
      return getGeotargetedQuestValidationFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    @java.lang.Override
    public POGOProtos.Rpc.GeotargetedQuestValidationOrBuilder getGeotargetedQuestValidationOrBuilder() {
      if ((targetCase_ == 3) && (geotargetedQuestValidationBuilder_ != null)) {
        return geotargetedQuestValidationBuilder_.getMessageOrBuilder();
      } else {
        if (targetCase_ == 3) {
          return (POGOProtos.Rpc.GeotargetedQuestValidation) target_;
        }
        return POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GeotargetedQuestValidation, POGOProtos.Rpc.GeotargetedQuestValidation.Builder, POGOProtos.Rpc.GeotargetedQuestValidationOrBuilder> 
        getGeotargetedQuestValidationFieldBuilder() {
      if (geotargetedQuestValidationBuilder_ == null) {
        if (!(targetCase_ == 3)) {
          target_ = POGOProtos.Rpc.GeotargetedQuestValidation.getDefaultInstance();
        }
        geotargetedQuestValidationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GeotargetedQuestValidation, POGOProtos.Rpc.GeotargetedQuestValidation.Builder, POGOProtos.Rpc.GeotargetedQuestValidationOrBuilder>(
                (POGOProtos.Rpc.GeotargetedQuestValidation) target_,
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      targetCase_ = 3;
      onChanged();;
      return geotargetedQuestValidationBuilder_;
    }

    private java.lang.Object questId_ = "";
    /**
     * <code>string quest_id = 1;</code>
     * @return The questId.
     */
    public java.lang.String getQuestId() {
      java.lang.Object ref = questId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        questId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string quest_id = 1;</code>
     * @return The bytes for questId.
     */
    public com.google.protobuf.ByteString
        getQuestIdBytes() {
      java.lang.Object ref = questId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        questId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string quest_id = 1;</code>
     * @param value The questId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      questId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string quest_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestId() {
      
      questId_ = getDefaultInstance().getQuestId();
      onChanged();
      return this;
    }
    /**
     * <code>string quest_id = 1;</code>
     * @param value The bytes for questId to set.
     * @return This builder for chaining.
     */
    public Builder setQuestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      questId_ = value;
      onChanged();
      return this;
    }

    private int currentProgress_ ;
    /**
     * <code>int32 current_progress = 2;</code>
     * @return The currentProgress.
     */
    @java.lang.Override
    public int getCurrentProgress() {
      return currentProgress_;
    }
    /**
     * <code>int32 current_progress = 2;</code>
     * @param value The currentProgress to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentProgress(int value) {
      
      currentProgress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_progress = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentProgress() {
      
      currentProgress_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ProgressQuestProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ProgressQuestProto)
  private static final POGOProtos.Rpc.ProgressQuestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ProgressQuestProto();
  }

  public static POGOProtos.Rpc.ProgressQuestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProgressQuestProto>
      PARSER = new com.google.protobuf.AbstractParser<ProgressQuestProto>() {
    @java.lang.Override
    public ProgressQuestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProgressQuestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProgressQuestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProgressQuestProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ProgressQuestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

