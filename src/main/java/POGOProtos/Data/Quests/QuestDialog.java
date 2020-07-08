// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/QuestDialog.proto

package POGOProtos.Data.Quests;

/**
 * Protobuf type {@code POGOProtos.Data.Quests.QuestDialog}
 */
public  final class QuestDialog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Quests.QuestDialog)
    QuestDialogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuestDialog.newBuilder() to construct.
  private QuestDialog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuestDialog() {
    text_ = "";
    expression_ = 0;
    imageUri_ = "";
    character_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuestDialog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuestDialog(
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

            text_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            expression_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            imageUri_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            character_ = rawValue;
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
    return POGOProtos.Data.Quests.QuestDialogOuterClass.internal_static_POGOProtos_Data_Quests_QuestDialog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Quests.QuestDialogOuterClass.internal_static_POGOProtos_Data_Quests_QuestDialog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Quests.QuestDialog.class, POGOProtos.Data.Quests.QuestDialog.Builder.class);
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Quests.QuestDialog.CharacterExpression}
   */
  public enum CharacterExpression
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EXPRESSION_UNSET = 0;</code>
     */
    EXPRESSION_UNSET(0),
    /**
     * <code>HAPPY = 1;</code>
     */
    HAPPY(1),
    /**
     * <code>SYMPATHETIC = 2;</code>
     */
    SYMPATHETIC(2),
    /**
     * <code>ENERGETIC = 3;</code>
     */
    ENERGETIC(3),
    /**
     * <code>PUSHY = 4;</code>
     */
    PUSHY(4),
    /**
     * <code>IMPATIENT = 5;</code>
     */
    IMPATIENT(5),
    /**
     * <code>ADMIRATION = 6;</code>
     */
    ADMIRATION(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EXPRESSION_UNSET = 0;</code>
     */
    public static final int EXPRESSION_UNSET_VALUE = 0;
    /**
     * <code>HAPPY = 1;</code>
     */
    public static final int HAPPY_VALUE = 1;
    /**
     * <code>SYMPATHETIC = 2;</code>
     */
    public static final int SYMPATHETIC_VALUE = 2;
    /**
     * <code>ENERGETIC = 3;</code>
     */
    public static final int ENERGETIC_VALUE = 3;
    /**
     * <code>PUSHY = 4;</code>
     */
    public static final int PUSHY_VALUE = 4;
    /**
     * <code>IMPATIENT = 5;</code>
     */
    public static final int IMPATIENT_VALUE = 5;
    /**
     * <code>ADMIRATION = 6;</code>
     */
    public static final int ADMIRATION_VALUE = 6;


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
    public static CharacterExpression valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CharacterExpression forNumber(int value) {
      switch (value) {
        case 0: return EXPRESSION_UNSET;
        case 1: return HAPPY;
        case 2: return SYMPATHETIC;
        case 3: return ENERGETIC;
        case 4: return PUSHY;
        case 5: return IMPATIENT;
        case 6: return ADMIRATION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CharacterExpression>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CharacterExpression> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CharacterExpression>() {
            public CharacterExpression findValueByNumber(int number) {
              return CharacterExpression.forNumber(number);
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
      return POGOProtos.Data.Quests.QuestDialog.getDescriptor().getEnumTypes().get(0);
    }

    private static final CharacterExpression[] VALUES = values();

    public static CharacterExpression valueOf(
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

    private CharacterExpression(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Quests.QuestDialog.CharacterExpression)
  }

  /**
   * Protobuf enum {@code POGOProtos.Data.Quests.QuestDialog.Character}
   */
  public enum Character
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHARACTER_UNSET = 0;</code>
     */
    CHARACTER_UNSET(0),
    /**
     * <code>PROFESSOR_WILLOW = 1;</code>
     */
    PROFESSOR_WILLOW(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHARACTER_UNSET = 0;</code>
     */
    public static final int CHARACTER_UNSET_VALUE = 0;
    /**
     * <code>PROFESSOR_WILLOW = 1;</code>
     */
    public static final int PROFESSOR_WILLOW_VALUE = 1;


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
    public static Character valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Character forNumber(int value) {
      switch (value) {
        case 0: return CHARACTER_UNSET;
        case 1: return PROFESSOR_WILLOW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Character>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Character> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Character>() {
            public Character findValueByNumber(int number) {
              return Character.forNumber(number);
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
      return POGOProtos.Data.Quests.QuestDialog.getDescriptor().getEnumTypes().get(1);
    }

    private static final Character[] VALUES = values();

    public static Character valueOf(
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

    private Character(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Data.Quests.QuestDialog.Character)
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  private volatile java.lang.Object text_;
  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPRESSION_FIELD_NUMBER = 2;
  private int expression_;
  /**
   * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
   * @return The enum numeric value on the wire for expression.
   */
  public int getExpressionValue() {
    return expression_;
  }
  /**
   * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
   * @return The expression.
   */
  public POGOProtos.Data.Quests.QuestDialog.CharacterExpression getExpression() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Quests.QuestDialog.CharacterExpression result = POGOProtos.Data.Quests.QuestDialog.CharacterExpression.valueOf(expression_);
    return result == null ? POGOProtos.Data.Quests.QuestDialog.CharacterExpression.UNRECOGNIZED : result;
  }

  public static final int IMAGE_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object imageUri_;
  /**
   * <code>string image_uri = 3;</code>
   * @return The imageUri.
   */
  public java.lang.String getImageUri() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUri_ = s;
      return s;
    }
  }
  /**
   * <code>string image_uri = 3;</code>
   * @return The bytes for imageUri.
   */
  public com.google.protobuf.ByteString
      getImageUriBytes() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHARACTER_FIELD_NUMBER = 4;
  private int character_;
  /**
   * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
   * @return The enum numeric value on the wire for character.
   */
  public int getCharacterValue() {
    return character_;
  }
  /**
   * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
   * @return The character.
   */
  public POGOProtos.Data.Quests.QuestDialog.Character getCharacter() {
    @SuppressWarnings("deprecation")
    POGOProtos.Data.Quests.QuestDialog.Character result = POGOProtos.Data.Quests.QuestDialog.Character.valueOf(character_);
    return result == null ? POGOProtos.Data.Quests.QuestDialog.Character.UNRECOGNIZED : result;
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
    if (!getTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    if (expression_ != POGOProtos.Data.Quests.QuestDialog.CharacterExpression.EXPRESSION_UNSET.getNumber()) {
      output.writeEnum(2, expression_);
    }
    if (!getImageUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, imageUri_);
    }
    if (character_ != POGOProtos.Data.Quests.QuestDialog.Character.CHARACTER_UNSET.getNumber()) {
      output.writeEnum(4, character_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    if (expression_ != POGOProtos.Data.Quests.QuestDialog.CharacterExpression.EXPRESSION_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, expression_);
    }
    if (!getImageUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, imageUri_);
    }
    if (character_ != POGOProtos.Data.Quests.QuestDialog.Character.CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, character_);
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
    if (!(obj instanceof POGOProtos.Data.Quests.QuestDialog)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Quests.QuestDialog other = (POGOProtos.Data.Quests.QuestDialog) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (expression_ != other.expression_) return false;
    if (!getImageUri()
        .equals(other.getImageUri())) return false;
    if (character_ != other.character_) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + expression_;
    hash = (37 * hash) + IMAGE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getImageUri().hashCode();
    hash = (37 * hash) + CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + character_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Quests.QuestDialog parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Quests.QuestDialog prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Quests.QuestDialog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Quests.QuestDialog)
      POGOProtos.Data.Quests.QuestDialogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Quests.QuestDialogOuterClass.internal_static_POGOProtos_Data_Quests_QuestDialog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Quests.QuestDialogOuterClass.internal_static_POGOProtos_Data_Quests_QuestDialog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Quests.QuestDialog.class, POGOProtos.Data.Quests.QuestDialog.Builder.class);
    }

    // Construct using POGOProtos.Data.Quests.QuestDialog.newBuilder()
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
      text_ = "";

      expression_ = 0;

      imageUri_ = "";

      character_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Quests.QuestDialogOuterClass.internal_static_POGOProtos_Data_Quests_QuestDialog_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestDialog getDefaultInstanceForType() {
      return POGOProtos.Data.Quests.QuestDialog.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestDialog build() {
      POGOProtos.Data.Quests.QuestDialog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Quests.QuestDialog buildPartial() {
      POGOProtos.Data.Quests.QuestDialog result = new POGOProtos.Data.Quests.QuestDialog(this);
      result.text_ = text_;
      result.expression_ = expression_;
      result.imageUri_ = imageUri_;
      result.character_ = character_;
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
      if (other instanceof POGOProtos.Data.Quests.QuestDialog) {
        return mergeFrom((POGOProtos.Data.Quests.QuestDialog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Quests.QuestDialog other) {
      if (other == POGOProtos.Data.Quests.QuestDialog.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        onChanged();
      }
      if (other.expression_ != 0) {
        setExpressionValue(other.getExpressionValue());
      }
      if (!other.getImageUri().isEmpty()) {
        imageUri_ = other.imageUri_;
        onChanged();
      }
      if (other.character_ != 0) {
        setCharacterValue(other.getCharacterValue());
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
      POGOProtos.Data.Quests.QuestDialog parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Quests.QuestDialog) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <code>string text = 1;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text_ = value;
      onChanged();
      return this;
    }

    private int expression_ = 0;
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
     * @return The enum numeric value on the wire for expression.
     */
    public int getExpressionValue() {
      return expression_;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
     * @param value The enum numeric value on the wire for expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpressionValue(int value) {
      expression_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
     * @return The expression.
     */
    public POGOProtos.Data.Quests.QuestDialog.CharacterExpression getExpression() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Quests.QuestDialog.CharacterExpression result = POGOProtos.Data.Quests.QuestDialog.CharacterExpression.valueOf(expression_);
      return result == null ? POGOProtos.Data.Quests.QuestDialog.CharacterExpression.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(POGOProtos.Data.Quests.QuestDialog.CharacterExpression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      expression_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.CharacterExpression expression = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpression() {
      
      expression_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object imageUri_ = "";
    /**
     * <code>string image_uri = 3;</code>
     * @return The imageUri.
     */
    public java.lang.String getImageUri() {
      java.lang.Object ref = imageUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image_uri = 3;</code>
     * @return The bytes for imageUri.
     */
    public com.google.protobuf.ByteString
        getImageUriBytes() {
      java.lang.Object ref = imageUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image_uri = 3;</code>
     * @param value The imageUri to set.
     * @return This builder for chaining.
     */
    public Builder setImageUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image_uri = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageUri() {
      
      imageUri_ = getDefaultInstance().getImageUri();
      onChanged();
      return this;
    }
    /**
     * <code>string image_uri = 3;</code>
     * @param value The bytes for imageUri to set.
     * @return This builder for chaining.
     */
    public Builder setImageUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageUri_ = value;
      onChanged();
      return this;
    }

    private int character_ = 0;
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
     * @return The enum numeric value on the wire for character.
     */
    public int getCharacterValue() {
      return character_;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
     * @param value The enum numeric value on the wire for character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacterValue(int value) {
      character_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
     * @return The character.
     */
    public POGOProtos.Data.Quests.QuestDialog.Character getCharacter() {
      @SuppressWarnings("deprecation")
      POGOProtos.Data.Quests.QuestDialog.Character result = POGOProtos.Data.Quests.QuestDialog.Character.valueOf(character_);
      return result == null ? POGOProtos.Data.Quests.QuestDialog.Character.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
     * @param value The character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacter(POGOProtos.Data.Quests.QuestDialog.Character value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      character_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Data.Quests.QuestDialog.Character character = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCharacter() {
      
      character_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Quests.QuestDialog)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Quests.QuestDialog)
  private static final POGOProtos.Data.Quests.QuestDialog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Quests.QuestDialog();
  }

  public static POGOProtos.Data.Quests.QuestDialog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuestDialog>
      PARSER = new com.google.protobuf.AbstractParser<QuestDialog>() {
    @java.lang.Override
    public QuestDialog parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuestDialog(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuestDialog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuestDialog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Quests.QuestDialog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
