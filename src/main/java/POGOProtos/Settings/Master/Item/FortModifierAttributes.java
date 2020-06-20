// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Item/FortModifierAttributes.proto

package POGOProtos.Settings.Master.Item;

/**
 * Protobuf type {@code POGOProtos.Settings.Master.Item.FortModifierAttributes}
 */
public  final class FortModifierAttributes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Settings.Master.Item.FortModifierAttributes)
    FortModifierAttributesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FortModifierAttributes.newBuilder() to construct.
  private FortModifierAttributes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FortModifierAttributes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FortModifierAttributes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FortModifierAttributes(
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

            modifierLifetimeSeconds_ = input.readInt32();
            break;
          }
          case 16: {

            troyDiskNumPokemonSpawned_ = input.readInt32();
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
    return POGOProtos.Settings.Master.Item.FortModifierAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_FortModifierAttributes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Settings.Master.Item.FortModifierAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_FortModifierAttributes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Settings.Master.Item.FortModifierAttributes.class, POGOProtos.Settings.Master.Item.FortModifierAttributes.Builder.class);
  }

  public static final int MODIFIER_LIFETIME_SECONDS_FIELD_NUMBER = 1;
  private int modifierLifetimeSeconds_;
  /**
   * <code>int32 modifier_lifetime_seconds = 1;</code>
   * @return The modifierLifetimeSeconds.
   */
  public int getModifierLifetimeSeconds() {
    return modifierLifetimeSeconds_;
  }

  public static final int TROY_DISK_NUM_POKEMON_SPAWNED_FIELD_NUMBER = 2;
  private int troyDiskNumPokemonSpawned_;
  /**
   * <code>int32 troy_disk_num_pokemon_spawned = 2;</code>
   * @return The troyDiskNumPokemonSpawned.
   */
  public int getTroyDiskNumPokemonSpawned() {
    return troyDiskNumPokemonSpawned_;
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
    if (modifierLifetimeSeconds_ != 0) {
      output.writeInt32(1, modifierLifetimeSeconds_);
    }
    if (troyDiskNumPokemonSpawned_ != 0) {
      output.writeInt32(2, troyDiskNumPokemonSpawned_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modifierLifetimeSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, modifierLifetimeSeconds_);
    }
    if (troyDiskNumPokemonSpawned_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, troyDiskNumPokemonSpawned_);
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
    if (!(obj instanceof POGOProtos.Settings.Master.Item.FortModifierAttributes)) {
      return super.equals(obj);
    }
    POGOProtos.Settings.Master.Item.FortModifierAttributes other = (POGOProtos.Settings.Master.Item.FortModifierAttributes) obj;

    if (getModifierLifetimeSeconds()
        != other.getModifierLifetimeSeconds()) return false;
    if (getTroyDiskNumPokemonSpawned()
        != other.getTroyDiskNumPokemonSpawned()) return false;
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
    hash = (37 * hash) + MODIFIER_LIFETIME_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getModifierLifetimeSeconds();
    hash = (37 * hash) + TROY_DISK_NUM_POKEMON_SPAWNED_FIELD_NUMBER;
    hash = (53 * hash) + getTroyDiskNumPokemonSpawned();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Settings.Master.Item.FortModifierAttributes parseFrom(
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
  public static Builder newBuilder(POGOProtos.Settings.Master.Item.FortModifierAttributes prototype) {
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
   * Protobuf type {@code POGOProtos.Settings.Master.Item.FortModifierAttributes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Settings.Master.Item.FortModifierAttributes)
      POGOProtos.Settings.Master.Item.FortModifierAttributesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Settings.Master.Item.FortModifierAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_FortModifierAttributes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Settings.Master.Item.FortModifierAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_FortModifierAttributes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Settings.Master.Item.FortModifierAttributes.class, POGOProtos.Settings.Master.Item.FortModifierAttributes.Builder.class);
    }

    // Construct using POGOProtos.Settings.Master.Item.FortModifierAttributes.newBuilder()
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
      modifierLifetimeSeconds_ = 0;

      troyDiskNumPokemonSpawned_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Settings.Master.Item.FortModifierAttributesOuterClass.internal_static_POGOProtos_Settings_Master_Item_FortModifierAttributes_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.FortModifierAttributes getDefaultInstanceForType() {
      return POGOProtos.Settings.Master.Item.FortModifierAttributes.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.FortModifierAttributes build() {
      POGOProtos.Settings.Master.Item.FortModifierAttributes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Settings.Master.Item.FortModifierAttributes buildPartial() {
      POGOProtos.Settings.Master.Item.FortModifierAttributes result = new POGOProtos.Settings.Master.Item.FortModifierAttributes(this);
      result.modifierLifetimeSeconds_ = modifierLifetimeSeconds_;
      result.troyDiskNumPokemonSpawned_ = troyDiskNumPokemonSpawned_;
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
      if (other instanceof POGOProtos.Settings.Master.Item.FortModifierAttributes) {
        return mergeFrom((POGOProtos.Settings.Master.Item.FortModifierAttributes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Settings.Master.Item.FortModifierAttributes other) {
      if (other == POGOProtos.Settings.Master.Item.FortModifierAttributes.getDefaultInstance()) return this;
      if (other.getModifierLifetimeSeconds() != 0) {
        setModifierLifetimeSeconds(other.getModifierLifetimeSeconds());
      }
      if (other.getTroyDiskNumPokemonSpawned() != 0) {
        setTroyDiskNumPokemonSpawned(other.getTroyDiskNumPokemonSpawned());
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
      POGOProtos.Settings.Master.Item.FortModifierAttributes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Settings.Master.Item.FortModifierAttributes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int modifierLifetimeSeconds_ ;
    /**
     * <code>int32 modifier_lifetime_seconds = 1;</code>
     * @return The modifierLifetimeSeconds.
     */
    public int getModifierLifetimeSeconds() {
      return modifierLifetimeSeconds_;
    }
    /**
     * <code>int32 modifier_lifetime_seconds = 1;</code>
     * @param value The modifierLifetimeSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setModifierLifetimeSeconds(int value) {
      
      modifierLifetimeSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 modifier_lifetime_seconds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModifierLifetimeSeconds() {
      
      modifierLifetimeSeconds_ = 0;
      onChanged();
      return this;
    }

    private int troyDiskNumPokemonSpawned_ ;
    /**
     * <code>int32 troy_disk_num_pokemon_spawned = 2;</code>
     * @return The troyDiskNumPokemonSpawned.
     */
    public int getTroyDiskNumPokemonSpawned() {
      return troyDiskNumPokemonSpawned_;
    }
    /**
     * <code>int32 troy_disk_num_pokemon_spawned = 2;</code>
     * @param value The troyDiskNumPokemonSpawned to set.
     * @return This builder for chaining.
     */
    public Builder setTroyDiskNumPokemonSpawned(int value) {
      
      troyDiskNumPokemonSpawned_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 troy_disk_num_pokemon_spawned = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTroyDiskNumPokemonSpawned() {
      
      troyDiskNumPokemonSpawned_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Settings.Master.Item.FortModifierAttributes)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Settings.Master.Item.FortModifierAttributes)
  private static final POGOProtos.Settings.Master.Item.FortModifierAttributes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Settings.Master.Item.FortModifierAttributes();
  }

  public static POGOProtos.Settings.Master.Item.FortModifierAttributes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FortModifierAttributes>
      PARSER = new com.google.protobuf.AbstractParser<FortModifierAttributes>() {
    @java.lang.Override
    public FortModifierAttributes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FortModifierAttributes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FortModifierAttributes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FortModifierAttributes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Settings.Master.Item.FortModifierAttributes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

