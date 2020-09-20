// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: PFDANLJNIFO
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.PokemonField1}
 */
public final class PokemonField1 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.PokemonField1)
    PokemonField1OrBuilder {
private static final long serialVersionUID = 0L;
  // Use PokemonField1.newBuilder() to construct.
  private PokemonField1(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PokemonField1() {
    pokemonId_ = 0;
    form_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PokemonField1();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PokemonField1(
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
            POGOProtos.Rpc.PokemonField1Sub.Builder subBuilder = null;
            if (field1_ != null) {
              subBuilder = field1_.toBuilder();
            }
            field1_ = input.readMessage(POGOProtos.Rpc.PokemonField1Sub.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(field1_);
              field1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            pokemonId_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            form_ = rawValue;
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonField1_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonField1_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.PokemonField1.class, POGOProtos.Rpc.PokemonField1.Builder.class);
  }

  public static final int QUEST_FIELD_NUMBER = 1;
  private POGOProtos.Rpc.QuestProto quest_;
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
   * @return Whether the quest field is set.
   */
  @java.lang.Override
  public boolean hasQuest() {
    return quest_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
   * @return The quest.
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestProto getQuest() {
    return quest_ == null ? POGOProtos.Rpc.QuestProto.getDefaultInstance() : quest_;
  }
  /**
   * <code>.POGOProtos.Rpc.QuestProto quest = 1;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.QuestProtoOrBuilder getQuestOrBuilder() {
    return getQuest();
  }

  public static final int FIELD1_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.PokemonField1Sub field1_;
  /**
   * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
   * @return Whether the field1 field is set.
   */
  @java.lang.Override
  public boolean hasField1() {
    return field1_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
   * @return The field1.
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonField1Sub getField1() {
    return field1_ == null ? POGOProtos.Rpc.PokemonField1Sub.getDefaultInstance() : field1_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.PokemonField1SubOrBuilder getField1OrBuilder() {
    return getField1();
  }

  public static final int POKEMON_ID_FIELD_NUMBER = 3;
  private int pokemonId_;
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
   * @return The enum numeric value on the wire for pokemonId.
   */
  @java.lang.Override public int getPokemonIdValue() {
    return pokemonId_;
  }
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
   * @return The pokemonId.
   */
  @java.lang.Override public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
    return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
  }

  public static final int FORM_FIELD_NUMBER = 4;
  private int form_;
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
   * @return The enum numeric value on the wire for form.
   */
  @java.lang.Override public int getFormValue() {
    return form_;
  }
  /**
   * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
   * @return The form.
   */
  @java.lang.Override public POGOProtos.Rpc.PokemonDisplayProto.Form getForm() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(form_);
    return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
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
    if (field1_ != null) {
      output.writeMessage(2, getField1());
    }
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      output.writeEnum(3, pokemonId_);
    }
    if (form_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      output.writeEnum(4, form_);
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
    if (field1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getField1());
    }
    if (pokemonId_ != POGOProtos.Rpc.HoloPokemonId.HOLO_POKEMON_ID_POKEMON_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, pokemonId_);
    }
    if (form_ != POGOProtos.Rpc.PokemonDisplayProto.Form.FORM_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, form_);
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
    if (!(obj instanceof POGOProtos.Rpc.PokemonField1)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.PokemonField1 other = (POGOProtos.Rpc.PokemonField1) obj;

    if (hasQuest() != other.hasQuest()) return false;
    if (hasQuest()) {
      if (!getQuest()
          .equals(other.getQuest())) return false;
    }
    if (hasField1() != other.hasField1()) return false;
    if (hasField1()) {
      if (!getField1()
          .equals(other.getField1())) return false;
    }
    if (pokemonId_ != other.pokemonId_) return false;
    if (form_ != other.form_) return false;
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
    if (hasField1()) {
      hash = (37 * hash) + FIELD1_FIELD_NUMBER;
      hash = (53 * hash) + getField1().hashCode();
    }
    hash = (37 * hash) + POKEMON_ID_FIELD_NUMBER;
    hash = (53 * hash) + pokemonId_;
    hash = (37 * hash) + FORM_FIELD_NUMBER;
    hash = (53 * hash) + form_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonField1 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonField1 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.PokemonField1 parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.PokemonField1 prototype) {
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
   * ref: PFDANLJNIFO
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.PokemonField1}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.PokemonField1)
      POGOProtos.Rpc.PokemonField1OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonField1_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonField1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.PokemonField1.class, POGOProtos.Rpc.PokemonField1.Builder.class);
    }

    // Construct using POGOProtos.Rpc.PokemonField1.newBuilder()
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
      if (field1Builder_ == null) {
        field1_ = null;
      } else {
        field1_ = null;
        field1Builder_ = null;
      }
      pokemonId_ = 0;

      form_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_PokemonField1_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonField1 getDefaultInstanceForType() {
      return POGOProtos.Rpc.PokemonField1.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonField1 build() {
      POGOProtos.Rpc.PokemonField1 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.PokemonField1 buildPartial() {
      POGOProtos.Rpc.PokemonField1 result = new POGOProtos.Rpc.PokemonField1(this);
      if (questBuilder_ == null) {
        result.quest_ = quest_;
      } else {
        result.quest_ = questBuilder_.build();
      }
      if (field1Builder_ == null) {
        result.field1_ = field1_;
      } else {
        result.field1_ = field1Builder_.build();
      }
      result.pokemonId_ = pokemonId_;
      result.form_ = form_;
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
      if (other instanceof POGOProtos.Rpc.PokemonField1) {
        return mergeFrom((POGOProtos.Rpc.PokemonField1)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.PokemonField1 other) {
      if (other == POGOProtos.Rpc.PokemonField1.getDefaultInstance()) return this;
      if (other.hasQuest()) {
        mergeQuest(other.getQuest());
      }
      if (other.hasField1()) {
        mergeField1(other.getField1());
      }
      if (other.pokemonId_ != 0) {
        setPokemonIdValue(other.getPokemonIdValue());
      }
      if (other.form_ != 0) {
        setFormValue(other.getFormValue());
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
      POGOProtos.Rpc.PokemonField1 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.PokemonField1) e.getUnfinishedMessage();
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

    private POGOProtos.Rpc.PokemonField1Sub field1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonField1Sub, POGOProtos.Rpc.PokemonField1Sub.Builder, POGOProtos.Rpc.PokemonField1SubOrBuilder> field1Builder_;
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     * @return Whether the field1 field is set.
     */
    public boolean hasField1() {
      return field1Builder_ != null || field1_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     * @return The field1.
     */
    public POGOProtos.Rpc.PokemonField1Sub getField1() {
      if (field1Builder_ == null) {
        return field1_ == null ? POGOProtos.Rpc.PokemonField1Sub.getDefaultInstance() : field1_;
      } else {
        return field1Builder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    public Builder setField1(POGOProtos.Rpc.PokemonField1Sub value) {
      if (field1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        field1_ = value;
        onChanged();
      } else {
        field1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    public Builder setField1(
        POGOProtos.Rpc.PokemonField1Sub.Builder builderForValue) {
      if (field1Builder_ == null) {
        field1_ = builderForValue.build();
        onChanged();
      } else {
        field1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    public Builder mergeField1(POGOProtos.Rpc.PokemonField1Sub value) {
      if (field1Builder_ == null) {
        if (field1_ != null) {
          field1_ =
            POGOProtos.Rpc.PokemonField1Sub.newBuilder(field1_).mergeFrom(value).buildPartial();
        } else {
          field1_ = value;
        }
        onChanged();
      } else {
        field1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    public Builder clearField1() {
      if (field1Builder_ == null) {
        field1_ = null;
        onChanged();
      } else {
        field1_ = null;
        field1Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    public POGOProtos.Rpc.PokemonField1Sub.Builder getField1Builder() {
      
      onChanged();
      return getField1FieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    public POGOProtos.Rpc.PokemonField1SubOrBuilder getField1OrBuilder() {
      if (field1Builder_ != null) {
        return field1Builder_.getMessageOrBuilder();
      } else {
        return field1_ == null ?
            POGOProtos.Rpc.PokemonField1Sub.getDefaultInstance() : field1_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonField1Sub field1 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.PokemonField1Sub, POGOProtos.Rpc.PokemonField1Sub.Builder, POGOProtos.Rpc.PokemonField1SubOrBuilder> 
        getField1FieldBuilder() {
      if (field1Builder_ == null) {
        field1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.PokemonField1Sub, POGOProtos.Rpc.PokemonField1Sub.Builder, POGOProtos.Rpc.PokemonField1SubOrBuilder>(
                getField1(),
                getParentForChildren(),
                isClean());
        field1_ = null;
      }
      return field1Builder_;
    }

    private int pokemonId_ = 0;
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
     * @return The enum numeric value on the wire for pokemonId.
     */
    @java.lang.Override public int getPokemonIdValue() {
      return pokemonId_;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
     * @param value The enum numeric value on the wire for pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonIdValue(int value) {
      
      pokemonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
     * @return The pokemonId.
     */
    @java.lang.Override
    public POGOProtos.Rpc.HoloPokemonId getPokemonId() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.HoloPokemonId result = POGOProtos.Rpc.HoloPokemonId.valueOf(pokemonId_);
      return result == null ? POGOProtos.Rpc.HoloPokemonId.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
     * @param value The pokemonId to set.
     * @return This builder for chaining.
     */
    public Builder setPokemonId(POGOProtos.Rpc.HoloPokemonId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pokemonId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.HoloPokemonId pokemon_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPokemonId() {
      
      pokemonId_ = 0;
      onChanged();
      return this;
    }

    private int form_ = 0;
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @return The enum numeric value on the wire for form.
     */
    @java.lang.Override public int getFormValue() {
      return form_;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @param value The enum numeric value on the wire for form to set.
     * @return This builder for chaining.
     */
    public Builder setFormValue(int value) {
      
      form_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @return The form.
     */
    @java.lang.Override
    public POGOProtos.Rpc.PokemonDisplayProto.Form getForm() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.PokemonDisplayProto.Form result = POGOProtos.Rpc.PokemonDisplayProto.Form.valueOf(form_);
      return result == null ? POGOProtos.Rpc.PokemonDisplayProto.Form.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @param value The form to set.
     * @return This builder for chaining.
     */
    public Builder setForm(POGOProtos.Rpc.PokemonDisplayProto.Form value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      form_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.PokemonDisplayProto.Form form = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearForm() {
      
      form_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.PokemonField1)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.PokemonField1)
  private static final POGOProtos.Rpc.PokemonField1 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.PokemonField1();
  }

  public static POGOProtos.Rpc.PokemonField1 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PokemonField1>
      PARSER = new com.google.protobuf.AbstractParser<PokemonField1>() {
    @java.lang.Override
    public PokemonField1 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PokemonField1(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PokemonField1> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PokemonField1> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.PokemonField1 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

