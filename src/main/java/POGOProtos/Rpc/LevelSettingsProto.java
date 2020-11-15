// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.LevelSettingsProto}
 */
public final class LevelSettingsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.LevelSettingsProto)
    LevelSettingsProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LevelSettingsProto.newBuilder() to construct.
  private LevelSettingsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LevelSettingsProto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LevelSettingsProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LevelSettingsProto(
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
          case 17: {

            trainerCpModifier_ = input.readDouble();
            break;
          }
          case 25: {

            trainerDifficultyModifier_ = input.readDouble();
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LevelSettingsProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LevelSettingsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.LevelSettingsProto.class, POGOProtos.Rpc.LevelSettingsProto.Builder.class);
  }

  public static final int TRAINER_CP_MODIFIER_FIELD_NUMBER = 2;
  private double trainerCpModifier_;
  /**
   * <code>double trainer_cp_modifier = 2;</code>
   * @return The trainerCpModifier.
   */
  @java.lang.Override
  public double getTrainerCpModifier() {
    return trainerCpModifier_;
  }

  public static final int TRAINER_DIFFICULTY_MODIFIER_FIELD_NUMBER = 3;
  private double trainerDifficultyModifier_;
  /**
   * <code>double trainer_difficulty_modifier = 3;</code>
   * @return The trainerDifficultyModifier.
   */
  @java.lang.Override
  public double getTrainerDifficultyModifier() {
    return trainerDifficultyModifier_;
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
    if (trainerCpModifier_ != 0D) {
      output.writeDouble(2, trainerCpModifier_);
    }
    if (trainerDifficultyModifier_ != 0D) {
      output.writeDouble(3, trainerDifficultyModifier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trainerCpModifier_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, trainerCpModifier_);
    }
    if (trainerDifficultyModifier_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, trainerDifficultyModifier_);
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
    if (!(obj instanceof POGOProtos.Rpc.LevelSettingsProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.LevelSettingsProto other = (POGOProtos.Rpc.LevelSettingsProto) obj;

    if (java.lang.Double.doubleToLongBits(getTrainerCpModifier())
        != java.lang.Double.doubleToLongBits(
            other.getTrainerCpModifier())) return false;
    if (java.lang.Double.doubleToLongBits(getTrainerDifficultyModifier())
        != java.lang.Double.doubleToLongBits(
            other.getTrainerDifficultyModifier())) return false;
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
    hash = (37 * hash) + TRAINER_CP_MODIFIER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTrainerCpModifier()));
    hash = (37 * hash) + TRAINER_DIFFICULTY_MODIFIER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTrainerDifficultyModifier()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.LevelSettingsProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.LevelSettingsProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.LevelSettingsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.LevelSettingsProto)
      POGOProtos.Rpc.LevelSettingsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LevelSettingsProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LevelSettingsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.LevelSettingsProto.class, POGOProtos.Rpc.LevelSettingsProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.LevelSettingsProto.newBuilder()
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
      trainerCpModifier_ = 0D;

      trainerDifficultyModifier_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_LevelSettingsProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LevelSettingsProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.LevelSettingsProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.LevelSettingsProto build() {
      POGOProtos.Rpc.LevelSettingsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.LevelSettingsProto buildPartial() {
      POGOProtos.Rpc.LevelSettingsProto result = new POGOProtos.Rpc.LevelSettingsProto(this);
      result.trainerCpModifier_ = trainerCpModifier_;
      result.trainerDifficultyModifier_ = trainerDifficultyModifier_;
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
      if (other instanceof POGOProtos.Rpc.LevelSettingsProto) {
        return mergeFrom((POGOProtos.Rpc.LevelSettingsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.LevelSettingsProto other) {
      if (other == POGOProtos.Rpc.LevelSettingsProto.getDefaultInstance()) return this;
      if (other.getTrainerCpModifier() != 0D) {
        setTrainerCpModifier(other.getTrainerCpModifier());
      }
      if (other.getTrainerDifficultyModifier() != 0D) {
        setTrainerDifficultyModifier(other.getTrainerDifficultyModifier());
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
      POGOProtos.Rpc.LevelSettingsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.LevelSettingsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double trainerCpModifier_ ;
    /**
     * <code>double trainer_cp_modifier = 2;</code>
     * @return The trainerCpModifier.
     */
    @java.lang.Override
    public double getTrainerCpModifier() {
      return trainerCpModifier_;
    }
    /**
     * <code>double trainer_cp_modifier = 2;</code>
     * @param value The trainerCpModifier to set.
     * @return This builder for chaining.
     */
    public Builder setTrainerCpModifier(double value) {
      
      trainerCpModifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double trainer_cp_modifier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainerCpModifier() {
      
      trainerCpModifier_ = 0D;
      onChanged();
      return this;
    }

    private double trainerDifficultyModifier_ ;
    /**
     * <code>double trainer_difficulty_modifier = 3;</code>
     * @return The trainerDifficultyModifier.
     */
    @java.lang.Override
    public double getTrainerDifficultyModifier() {
      return trainerDifficultyModifier_;
    }
    /**
     * <code>double trainer_difficulty_modifier = 3;</code>
     * @param value The trainerDifficultyModifier to set.
     * @return This builder for chaining.
     */
    public Builder setTrainerDifficultyModifier(double value) {
      
      trainerDifficultyModifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double trainer_difficulty_modifier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrainerDifficultyModifier() {
      
      trainerDifficultyModifier_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.LevelSettingsProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.LevelSettingsProto)
  private static final POGOProtos.Rpc.LevelSettingsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.LevelSettingsProto();
  }

  public static POGOProtos.Rpc.LevelSettingsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LevelSettingsProto>
      PARSER = new com.google.protobuf.AbstractParser<LevelSettingsProto>() {
    @java.lang.Override
    public LevelSettingsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LevelSettingsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LevelSettingsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LevelSettingsProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.LevelSettingsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

