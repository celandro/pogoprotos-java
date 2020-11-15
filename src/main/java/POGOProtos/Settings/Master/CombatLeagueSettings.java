// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/CombatLeagueSettings.proto

package POGOProtos.Settings.Master;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.CombatLeagueSettings}
 */
public final class CombatLeagueSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.CombatLeagueSettings)
    CombatLeagueSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatLeagueSettings.newBuilder() to construct.
  private CombatLeagueSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatLeagueSettings() {
    combatLeagueTemplateId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatLeagueSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatLeagueSettings(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              combatLeagueTemplateId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            combatLeagueTemplateId_.add(s);
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
        combatLeagueTemplateId_ = combatLeagueTemplateId_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatLeagueSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatLeagueSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.CombatLeagueSettings.class, POGOProtos.Settings.Master.CombatLeagueSettings.Builder.class);
  }

  public static final int COMBAT_LEAGUE_TEMPLATE_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList combatLeagueTemplateId_;
  /**
   * <code>repeated string combat_league_template_id = 1;</code>
   * @return A list containing the combatLeagueTemplateId.
   */
  public com.google.protobuf.ProtocolStringList
      getCombatLeagueTemplateIdList() {
    return combatLeagueTemplateId_;
  }
  /**
   * <code>repeated string combat_league_template_id = 1;</code>
   * @return The count of combatLeagueTemplateId.
   */
  public int getCombatLeagueTemplateIdCount() {
    return combatLeagueTemplateId_.size();
  }
  /**
   * <code>repeated string combat_league_template_id = 1;</code>
   * @param index The index of the element to return.
   * @return The combatLeagueTemplateId at the given index.
   */
  public java.lang.String getCombatLeagueTemplateId(int index) {
    return combatLeagueTemplateId_.get(index);
  }
  /**
   * <code>repeated string combat_league_template_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the combatLeagueTemplateId at the given index.
   */
  public com.google.protobuf.ByteString
      getCombatLeagueTemplateIdBytes(int index) {
    return combatLeagueTemplateId_.getByteString(index);
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
    for (int i = 0; i < combatLeagueTemplateId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, combatLeagueTemplateId_.getRaw(i));
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
      for (int i = 0; i < combatLeagueTemplateId_.size(); i++) {
        dataSize += computeStringSizeNoTag(combatLeagueTemplateId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCombatLeagueTemplateIdList().size();
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
    if (!(obj instanceof POGOProtos.Settings.Master.CombatLeagueSettings)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.CombatLeagueSettings other = (POGOProtos.Settings.Master.CombatLeagueSettings) obj;

    if (!getCombatLeagueTemplateIdList()
        .equals(other.getCombatLeagueTemplateIdList())) return false;
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
    if (getCombatLeagueTemplateIdCount() > 0) {
      hash = (37 * hash) + COMBAT_LEAGUE_TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCombatLeagueTemplateIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.CombatLeagueSettings parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.CombatLeagueSettings prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.CombatLeagueSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.CombatLeagueSettings)
      POGOProtos.Settings.Master.CombatLeagueSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatLeagueSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatLeagueSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.CombatLeagueSettings.class, POGOProtos.Settings.Master.CombatLeagueSettings.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.CombatLeagueSettings.newBuilder()
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
      combatLeagueTemplateId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.CombatLeagueSettingsOuterClass.internal_static_POGOProtos_Settings_Master_CombatLeagueSettings_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.CombatLeagueSettings getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.CombatLeagueSettings.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.CombatLeagueSettings build() {
      POGOProtos.Settings.Master.CombatLeagueSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.CombatLeagueSettings buildPartial() {
      POGOProtos.Settings.Master.CombatLeagueSettings result = new POGOProtos.Settings.Master.CombatLeagueSettings(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        combatLeagueTemplateId_ = combatLeagueTemplateId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.combatLeagueTemplateId_ = combatLeagueTemplateId_;
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
      if (other instanceof POGOProtos.Settings.Master.CombatLeagueSettings) {
        return mergeFrom((POGOProtos.Settings.Master.CombatLeagueSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.CombatLeagueSettings other) {
      if (other == POGOProtos.Settings.Master.CombatLeagueSettings.getDefaultInstance()) return this;
      if (!other.combatLeagueTemplateId_.isEmpty()) {
        if (combatLeagueTemplateId_.isEmpty()) {
          combatLeagueTemplateId_ = other.combatLeagueTemplateId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCombatLeagueTemplateIdIsMutable();
          combatLeagueTemplateId_.addAll(other.combatLeagueTemplateId_);
        }
        onChanged();
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
      POGOProtos.Settings.Master.CombatLeagueSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.CombatLeagueSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList combatLeagueTemplateId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCombatLeagueTemplateIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        combatLeagueTemplateId_ = new com.google.protobuf.LazyStringArrayList(combatLeagueTemplateId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @return A list containing the combatLeagueTemplateId.
     */
    public com.google.protobuf.ProtocolStringList
        getCombatLeagueTemplateIdList() {
      return combatLeagueTemplateId_.getUnmodifiableView();
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @return The count of combatLeagueTemplateId.
     */
    public int getCombatLeagueTemplateIdCount() {
      return combatLeagueTemplateId_.size();
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @param index The index of the element to return.
     * @return The combatLeagueTemplateId at the given index.
     */
    public java.lang.String getCombatLeagueTemplateId(int index) {
      return combatLeagueTemplateId_.get(index);
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the combatLeagueTemplateId at the given index.
     */
    public com.google.protobuf.ByteString
        getCombatLeagueTemplateIdBytes(int index) {
      return combatLeagueTemplateId_.getByteString(index);
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The combatLeagueTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setCombatLeagueTemplateId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCombatLeagueTemplateIdIsMutable();
      combatLeagueTemplateId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @param value The combatLeagueTemplateId to add.
     * @return This builder for chaining.
     */
    public Builder addCombatLeagueTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCombatLeagueTemplateIdIsMutable();
      combatLeagueTemplateId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @param values The combatLeagueTemplateId to add.
     * @return This builder for chaining.
     */
    public Builder addAllCombatLeagueTemplateId(
        java.lang.Iterable<java.lang.String> values) {
      ensureCombatLeagueTemplateIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, combatLeagueTemplateId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatLeagueTemplateId() {
      combatLeagueTemplateId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string combat_league_template_id = 1;</code>
     * @param value The bytes of the combatLeagueTemplateId to add.
     * @return This builder for chaining.
     */
    public Builder addCombatLeagueTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCombatLeagueTemplateIdIsMutable();
      combatLeagueTemplateId_.add(value);
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.CombatLeagueSettings)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.CombatLeagueSettings)
  private static final POGOProtos.Settings.Master.CombatLeagueSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.CombatLeagueSettings();
  }

  public static POGOProtos.Settings.Master.CombatLeagueSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatLeagueSettings>
      PARSER = new com.google.protobuf.AbstractParser<CombatLeagueSettings>() {
    @java.lang.Override
    public CombatLeagueSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatLeagueSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatLeagueSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatLeagueSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.CombatLeagueSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

