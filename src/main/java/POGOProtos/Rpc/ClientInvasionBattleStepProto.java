// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

/**
 * Protobuf type {@code POGOProtos.Rpc.ClientInvasionBattleStepProto}
 */
public  final class ClientInvasionBattleStepProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.ClientInvasionBattleStepProto)
    ClientInvasionBattleStepProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientInvasionBattleStepProto.newBuilder() to construct.
  private ClientInvasionBattleStepProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientInvasionBattleStepProto() {
    character_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientInvasionBattleStepProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientInvasionBattleStepProto(
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
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientInvasionBattleStepProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientInvasionBattleStepProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.ClientInvasionBattleStepProto.class, POGOProtos.Rpc.ClientInvasionBattleStepProto.Builder.class);
  }

  public static final int CHARACTER_FIELD_NUMBER = 1;
  private int character_;
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
   * @return The enum numeric value on the wire for character.
   */
  public int getCharacterValue() {
    return character_;
  }
  /**
   * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
   * @return The character.
   */
  public POGOProtos.Rpc.EnumWrapper.InvasionCharacter getCharacter() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.EnumWrapper.InvasionCharacter result = POGOProtos.Rpc.EnumWrapper.InvasionCharacter.valueOf(character_);
    return result == null ? POGOProtos.Rpc.EnumWrapper.InvasionCharacter.UNRECOGNIZED : result;
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
    if (character_ != POGOProtos.Rpc.EnumWrapper.InvasionCharacter.CHARACTER_UNSET.getNumber()) {
      output.writeEnum(1, character_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (character_ != POGOProtos.Rpc.EnumWrapper.InvasionCharacter.CHARACTER_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, character_);
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
    if (!(obj instanceof POGOProtos.Rpc.ClientInvasionBattleStepProto)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.ClientInvasionBattleStepProto other = (POGOProtos.Rpc.ClientInvasionBattleStepProto) obj;

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
    hash = (37 * hash) + CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + character_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.ClientInvasionBattleStepProto parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.ClientInvasionBattleStepProto prototype) {
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
   * Protobuf type {@code POGOProtos.Rpc.ClientInvasionBattleStepProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.ClientInvasionBattleStepProto)
      POGOProtos.Rpc.ClientInvasionBattleStepProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientInvasionBattleStepProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientInvasionBattleStepProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.ClientInvasionBattleStepProto.class, POGOProtos.Rpc.ClientInvasionBattleStepProto.Builder.class);
    }

    // Construct using POGOProtos.Rpc.ClientInvasionBattleStepProto.newBuilder()
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
      character_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.Rpc.internal_static_POGOProtos_Rpc_ClientInvasionBattleStepProto_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientInvasionBattleStepProto getDefaultInstanceForType() {
      return POGOProtos.Rpc.ClientInvasionBattleStepProto.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientInvasionBattleStepProto build() {
      POGOProtos.Rpc.ClientInvasionBattleStepProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.ClientInvasionBattleStepProto buildPartial() {
      POGOProtos.Rpc.ClientInvasionBattleStepProto result = new POGOProtos.Rpc.ClientInvasionBattleStepProto(this);
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
      if (other instanceof POGOProtos.Rpc.ClientInvasionBattleStepProto) {
        return mergeFrom((POGOProtos.Rpc.ClientInvasionBattleStepProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.ClientInvasionBattleStepProto other) {
      if (other == POGOProtos.Rpc.ClientInvasionBattleStepProto.getDefaultInstance()) return this;
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
      POGOProtos.Rpc.ClientInvasionBattleStepProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.ClientInvasionBattleStepProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int character_ = 0;
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
     * @return The enum numeric value on the wire for character.
     */
    public int getCharacterValue() {
      return character_;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
     * @param value The enum numeric value on the wire for character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacterValue(int value) {
      character_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
     * @return The character.
     */
    public POGOProtos.Rpc.EnumWrapper.InvasionCharacter getCharacter() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.EnumWrapper.InvasionCharacter result = POGOProtos.Rpc.EnumWrapper.InvasionCharacter.valueOf(character_);
      return result == null ? POGOProtos.Rpc.EnumWrapper.InvasionCharacter.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
     * @param value The character to set.
     * @return This builder for chaining.
     */
    public Builder setCharacter(POGOProtos.Rpc.EnumWrapper.InvasionCharacter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      character_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.EnumWrapper.InvasionCharacter character = 1;</code>
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.ClientInvasionBattleStepProto)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.ClientInvasionBattleStepProto)
  private static final POGOProtos.Rpc.ClientInvasionBattleStepProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.ClientInvasionBattleStepProto();
  }

  public static POGOProtos.Rpc.ClientInvasionBattleStepProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientInvasionBattleStepProto>
      PARSER = new com.google.protobuf.AbstractParser<ClientInvasionBattleStepProto>() {
    @java.lang.Override
    public ClientInvasionBattleStepProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientInvasionBattleStepProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientInvasionBattleStepProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientInvasionBattleStepProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.ClientInvasionBattleStepProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

