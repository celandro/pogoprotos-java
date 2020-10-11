// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: JIBJDNMPLOD
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.JIBJDNMPLOD}
 */
public final class JIBJDNMPLOD extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.JIBJDNMPLOD)
    JIBJDNMPLODOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JIBJDNMPLOD.newBuilder() to construct.
  private JIBJDNMPLOD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JIBJDNMPLOD() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JIBJDNMPLOD();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JIBJDNMPLOD(
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

            result_ = rawValue;
            break;
          }
          case 18: {
            POGOProtos.Rpc.LootProto.Builder subBuilder = null;
            if (jbejbaggpfa_ != null) {
              subBuilder = jbejbaggpfa_.toBuilder();
            }
            jbejbaggpfa_ = input.readMessage(POGOProtos.Rpc.LootProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(jbejbaggpfa_);
              jbejbaggpfa_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            mgfbndphaij_ = input.readInt32();
            break;
          }
          case 37: {

            bcieidchgpi_ = input.readFloat();
            break;
          }
          case 42: {
            POGOProtos.Rpc.CombatSeasonResult.Builder subBuilder = null;
            if (lhhilpcdjmd_ != null) {
              subBuilder = lhhilpcdjmd_.toBuilder();
            }
            lhhilpcdjmd_ = input.readMessage(POGOProtos.Rpc.CombatSeasonResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lhhilpcdjmd_);
              lhhilpcdjmd_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {

            cpjnphdafik_ = input.readBool();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIBJDNMPLOD_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIBJDNMPLOD_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.JIBJDNMPLOD.class, POGOProtos.Rpc.JIBJDNMPLOD.Builder.class);
  }

  /**
   * <pre>
   * ref: JIBJDNMPLOD/PEAEAPNOLOC/CBCHILCOJHP
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.JIBJDNMPLOD.Result}
   */
  public enum Result
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
     * <code>ERROR_PLAYER_HAS_NO_VS_SEEKER = 2;</code>
     */
    ERROR_PLAYER_HAS_NO_VS_SEEKER(2),
    /**
     * <code>ERROR_REWARDS_ALREADY_COLLECTED = 3;</code>
     */
    ERROR_REWARDS_ALREADY_COLLECTED(3),
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
     * <code>ERROR_PLAYER_HAS_NO_VS_SEEKER = 2;</code>
     */
    public static final int ERROR_PLAYER_HAS_NO_VS_SEEKER_VALUE = 2;
    /**
     * <code>ERROR_REWARDS_ALREADY_COLLECTED = 3;</code>
     */
    public static final int ERROR_REWARDS_ALREADY_COLLECTED_VALUE = 3;


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
    public static Result valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Result forNumber(int value) {
      switch (value) {
        case 0: return UNSET;
        case 1: return SUCCESS;
        case 2: return ERROR_PLAYER_HAS_NO_VS_SEEKER;
        case 3: return ERROR_REWARDS_ALREADY_COLLECTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Result>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Result> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Result>() {
            public Result findValueByNumber(int number) {
              return Result.forNumber(number);
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
      return POGOProtos.Rpc.JIBJDNMPLOD.getDescriptor().getEnumTypes().get(0);
    }

    private static final Result[] VALUES = values();

    public static Result valueOf(
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

    private Result(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.JIBJDNMPLOD.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.JIBJDNMPLOD.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.JIBJDNMPLOD.Result result = POGOProtos.Rpc.JIBJDNMPLOD.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.JIBJDNMPLOD.Result.UNRECOGNIZED : result;
  }

  public static final int JBEJBAGGPFA_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.LootProto jbejbaggpfa_;
  /**
   * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
   * @return Whether the jbejbaggpfa field is set.
   */
  @java.lang.Override
  public boolean hasJbejbaggpfa() {
    return jbejbaggpfa_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
   * @return The jbejbaggpfa.
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProto getJbejbaggpfa() {
    return jbejbaggpfa_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : jbejbaggpfa_;
  }
  /**
   * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.LootProtoOrBuilder getJbejbaggpfaOrBuilder() {
    return getJbejbaggpfa();
  }

  public static final int MGFBNDPHAIJ_FIELD_NUMBER = 3;
  private int mgfbndphaij_;
  /**
   * <code>int32 mgfbndphaij = 3;</code>
   * @return The mgfbndphaij.
   */
  @java.lang.Override
  public int getMgfbndphaij() {
    return mgfbndphaij_;
  }

  public static final int BCIEIDCHGPI_FIELD_NUMBER = 4;
  private float bcieidchgpi_;
  /**
   * <code>float bcieidchgpi = 4;</code>
   * @return The bcieidchgpi.
   */
  @java.lang.Override
  public float getBcieidchgpi() {
    return bcieidchgpi_;
  }

  public static final int LHHILPCDJMD_FIELD_NUMBER = 5;
  private POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd_;
  /**
   * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
   * @return Whether the lhhilpcdjmd field is set.
   */
  @java.lang.Override
  public boolean hasLhhilpcdjmd() {
    return lhhilpcdjmd_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
   * @return The lhhilpcdjmd.
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatSeasonResult getLhhilpcdjmd() {
    return lhhilpcdjmd_ == null ? POGOProtos.Rpc.CombatSeasonResult.getDefaultInstance() : lhhilpcdjmd_;
  }
  /**
   * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.CombatSeasonResultOrBuilder getLhhilpcdjmdOrBuilder() {
    return getLhhilpcdjmd();
  }

  public static final int CPJNPHDAFIK_FIELD_NUMBER = 6;
  private boolean cpjnphdafik_;
  /**
   * <code>bool cpjnphdafik = 6;</code>
   * @return The cpjnphdafik.
   */
  @java.lang.Override
  public boolean getCpjnphdafik() {
    return cpjnphdafik_;
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
    if (result_ != POGOProtos.Rpc.JIBJDNMPLOD.Result.UNSET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (jbejbaggpfa_ != null) {
      output.writeMessage(2, getJbejbaggpfa());
    }
    if (mgfbndphaij_ != 0) {
      output.writeInt32(3, mgfbndphaij_);
    }
    if (bcieidchgpi_ != 0F) {
      output.writeFloat(4, bcieidchgpi_);
    }
    if (lhhilpcdjmd_ != null) {
      output.writeMessage(5, getLhhilpcdjmd());
    }
    if (cpjnphdafik_ != false) {
      output.writeBool(6, cpjnphdafik_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.JIBJDNMPLOD.Result.UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (jbejbaggpfa_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getJbejbaggpfa());
    }
    if (mgfbndphaij_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, mgfbndphaij_);
    }
    if (bcieidchgpi_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, bcieidchgpi_);
    }
    if (lhhilpcdjmd_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getLhhilpcdjmd());
    }
    if (cpjnphdafik_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, cpjnphdafik_);
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
    if (!(obj instanceof POGOProtos.Rpc.JIBJDNMPLOD)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.JIBJDNMPLOD other = (POGOProtos.Rpc.JIBJDNMPLOD) obj;

    if (result_ != other.result_) return false;
    if (hasJbejbaggpfa() != other.hasJbejbaggpfa()) return false;
    if (hasJbejbaggpfa()) {
      if (!getJbejbaggpfa()
          .equals(other.getJbejbaggpfa())) return false;
    }
    if (getMgfbndphaij()
        != other.getMgfbndphaij()) return false;
    if (java.lang.Float.floatToIntBits(getBcieidchgpi())
        != java.lang.Float.floatToIntBits(
            other.getBcieidchgpi())) return false;
    if (hasLhhilpcdjmd() != other.hasLhhilpcdjmd()) return false;
    if (hasLhhilpcdjmd()) {
      if (!getLhhilpcdjmd()
          .equals(other.getLhhilpcdjmd())) return false;
    }
    if (getCpjnphdafik()
        != other.getCpjnphdafik()) return false;
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
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + result_;
    if (hasJbejbaggpfa()) {
      hash = (37 * hash) + JBEJBAGGPFA_FIELD_NUMBER;
      hash = (53 * hash) + getJbejbaggpfa().hashCode();
    }
    hash = (37 * hash) + MGFBNDPHAIJ_FIELD_NUMBER;
    hash = (53 * hash) + getMgfbndphaij();
    hash = (37 * hash) + BCIEIDCHGPI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBcieidchgpi());
    if (hasLhhilpcdjmd()) {
      hash = (37 * hash) + LHHILPCDJMD_FIELD_NUMBER;
      hash = (53 * hash) + getLhhilpcdjmd().hashCode();
    }
    hash = (37 * hash) + CPJNPHDAFIK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCpjnphdafik());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.JIBJDNMPLOD parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.JIBJDNMPLOD prototype) {
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
   * ref: JIBJDNMPLOD
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.JIBJDNMPLOD}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.JIBJDNMPLOD)
      POGOProtos.Rpc.JIBJDNMPLODOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIBJDNMPLOD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIBJDNMPLOD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.JIBJDNMPLOD.class, POGOProtos.Rpc.JIBJDNMPLOD.Builder.class);
    }

    // Construct using POGOProtos.Rpc.JIBJDNMPLOD.newBuilder()
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
      result_ = 0;

      if (jbejbaggpfaBuilder_ == null) {
        jbejbaggpfa_ = null;
      } else {
        jbejbaggpfa_ = null;
        jbejbaggpfaBuilder_ = null;
      }
      mgfbndphaij_ = 0;

      bcieidchgpi_ = 0F;

      if (lhhilpcdjmdBuilder_ == null) {
        lhhilpcdjmd_ = null;
      } else {
        lhhilpcdjmd_ = null;
        lhhilpcdjmdBuilder_ = null;
      }
      cpjnphdafik_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_JIBJDNMPLOD_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIBJDNMPLOD getDefaultInstanceForType() {
      return POGOProtos.Rpc.JIBJDNMPLOD.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIBJDNMPLOD build() {
      POGOProtos.Rpc.JIBJDNMPLOD result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.JIBJDNMPLOD buildPartial() {
      POGOProtos.Rpc.JIBJDNMPLOD result = new POGOProtos.Rpc.JIBJDNMPLOD(this);
      result.result_ = result_;
      if (jbejbaggpfaBuilder_ == null) {
        result.jbejbaggpfa_ = jbejbaggpfa_;
      } else {
        result.jbejbaggpfa_ = jbejbaggpfaBuilder_.build();
      }
      result.mgfbndphaij_ = mgfbndphaij_;
      result.bcieidchgpi_ = bcieidchgpi_;
      if (lhhilpcdjmdBuilder_ == null) {
        result.lhhilpcdjmd_ = lhhilpcdjmd_;
      } else {
        result.lhhilpcdjmd_ = lhhilpcdjmdBuilder_.build();
      }
      result.cpjnphdafik_ = cpjnphdafik_;
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
      if (other instanceof POGOProtos.Rpc.JIBJDNMPLOD) {
        return mergeFrom((POGOProtos.Rpc.JIBJDNMPLOD)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.JIBJDNMPLOD other) {
      if (other == POGOProtos.Rpc.JIBJDNMPLOD.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasJbejbaggpfa()) {
        mergeJbejbaggpfa(other.getJbejbaggpfa());
      }
      if (other.getMgfbndphaij() != 0) {
        setMgfbndphaij(other.getMgfbndphaij());
      }
      if (other.getBcieidchgpi() != 0F) {
        setBcieidchgpi(other.getBcieidchgpi());
      }
      if (other.hasLhhilpcdjmd()) {
        mergeLhhilpcdjmd(other.getLhhilpcdjmd());
      }
      if (other.getCpjnphdafik() != false) {
        setCpjnphdafik(other.getCpjnphdafik());
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
      POGOProtos.Rpc.JIBJDNMPLOD parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.JIBJDNMPLOD) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int result_ = 0;
    /**
     * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.JIBJDNMPLOD.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.JIBJDNMPLOD.Result result = POGOProtos.Rpc.JIBJDNMPLOD.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.JIBJDNMPLOD.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.JIBJDNMPLOD.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.JIBJDNMPLOD.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.LootProto jbejbaggpfa_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> jbejbaggpfaBuilder_;
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     * @return Whether the jbejbaggpfa field is set.
     */
    public boolean hasJbejbaggpfa() {
      return jbejbaggpfaBuilder_ != null || jbejbaggpfa_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     * @return The jbejbaggpfa.
     */
    public POGOProtos.Rpc.LootProto getJbejbaggpfa() {
      if (jbejbaggpfaBuilder_ == null) {
        return jbejbaggpfa_ == null ? POGOProtos.Rpc.LootProto.getDefaultInstance() : jbejbaggpfa_;
      } else {
        return jbejbaggpfaBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    public Builder setJbejbaggpfa(POGOProtos.Rpc.LootProto value) {
      if (jbejbaggpfaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        jbejbaggpfa_ = value;
        onChanged();
      } else {
        jbejbaggpfaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    public Builder setJbejbaggpfa(
        POGOProtos.Rpc.LootProto.Builder builderForValue) {
      if (jbejbaggpfaBuilder_ == null) {
        jbejbaggpfa_ = builderForValue.build();
        onChanged();
      } else {
        jbejbaggpfaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    public Builder mergeJbejbaggpfa(POGOProtos.Rpc.LootProto value) {
      if (jbejbaggpfaBuilder_ == null) {
        if (jbejbaggpfa_ != null) {
          jbejbaggpfa_ =
            POGOProtos.Rpc.LootProto.newBuilder(jbejbaggpfa_).mergeFrom(value).buildPartial();
        } else {
          jbejbaggpfa_ = value;
        }
        onChanged();
      } else {
        jbejbaggpfaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    public Builder clearJbejbaggpfa() {
      if (jbejbaggpfaBuilder_ == null) {
        jbejbaggpfa_ = null;
        onChanged();
      } else {
        jbejbaggpfa_ = null;
        jbejbaggpfaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    public POGOProtos.Rpc.LootProto.Builder getJbejbaggpfaBuilder() {
      
      onChanged();
      return getJbejbaggpfaFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    public POGOProtos.Rpc.LootProtoOrBuilder getJbejbaggpfaOrBuilder() {
      if (jbejbaggpfaBuilder_ != null) {
        return jbejbaggpfaBuilder_.getMessageOrBuilder();
      } else {
        return jbejbaggpfa_ == null ?
            POGOProtos.Rpc.LootProto.getDefaultInstance() : jbejbaggpfa_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.LootProto jbejbaggpfa = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder> 
        getJbejbaggpfaFieldBuilder() {
      if (jbejbaggpfaBuilder_ == null) {
        jbejbaggpfaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.LootProto, POGOProtos.Rpc.LootProto.Builder, POGOProtos.Rpc.LootProtoOrBuilder>(
                getJbejbaggpfa(),
                getParentForChildren(),
                isClean());
        jbejbaggpfa_ = null;
      }
      return jbejbaggpfaBuilder_;
    }

    private int mgfbndphaij_ ;
    /**
     * <code>int32 mgfbndphaij = 3;</code>
     * @return The mgfbndphaij.
     */
    @java.lang.Override
    public int getMgfbndphaij() {
      return mgfbndphaij_;
    }
    /**
     * <code>int32 mgfbndphaij = 3;</code>
     * @param value The mgfbndphaij to set.
     * @return This builder for chaining.
     */
    public Builder setMgfbndphaij(int value) {
      
      mgfbndphaij_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 mgfbndphaij = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMgfbndphaij() {
      
      mgfbndphaij_ = 0;
      onChanged();
      return this;
    }

    private float bcieidchgpi_ ;
    /**
     * <code>float bcieidchgpi = 4;</code>
     * @return The bcieidchgpi.
     */
    @java.lang.Override
    public float getBcieidchgpi() {
      return bcieidchgpi_;
    }
    /**
     * <code>float bcieidchgpi = 4;</code>
     * @param value The bcieidchgpi to set.
     * @return This builder for chaining.
     */
    public Builder setBcieidchgpi(float value) {
      
      bcieidchgpi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bcieidchgpi = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBcieidchgpi() {
      
      bcieidchgpi_ = 0F;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatSeasonResult, POGOProtos.Rpc.CombatSeasonResult.Builder, POGOProtos.Rpc.CombatSeasonResultOrBuilder> lhhilpcdjmdBuilder_;
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     * @return Whether the lhhilpcdjmd field is set.
     */
    public boolean hasLhhilpcdjmd() {
      return lhhilpcdjmdBuilder_ != null || lhhilpcdjmd_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     * @return The lhhilpcdjmd.
     */
    public POGOProtos.Rpc.CombatSeasonResult getLhhilpcdjmd() {
      if (lhhilpcdjmdBuilder_ == null) {
        return lhhilpcdjmd_ == null ? POGOProtos.Rpc.CombatSeasonResult.getDefaultInstance() : lhhilpcdjmd_;
      } else {
        return lhhilpcdjmdBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    public Builder setLhhilpcdjmd(POGOProtos.Rpc.CombatSeasonResult value) {
      if (lhhilpcdjmdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lhhilpcdjmd_ = value;
        onChanged();
      } else {
        lhhilpcdjmdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    public Builder setLhhilpcdjmd(
        POGOProtos.Rpc.CombatSeasonResult.Builder builderForValue) {
      if (lhhilpcdjmdBuilder_ == null) {
        lhhilpcdjmd_ = builderForValue.build();
        onChanged();
      } else {
        lhhilpcdjmdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    public Builder mergeLhhilpcdjmd(POGOProtos.Rpc.CombatSeasonResult value) {
      if (lhhilpcdjmdBuilder_ == null) {
        if (lhhilpcdjmd_ != null) {
          lhhilpcdjmd_ =
            POGOProtos.Rpc.CombatSeasonResult.newBuilder(lhhilpcdjmd_).mergeFrom(value).buildPartial();
        } else {
          lhhilpcdjmd_ = value;
        }
        onChanged();
      } else {
        lhhilpcdjmdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    public Builder clearLhhilpcdjmd() {
      if (lhhilpcdjmdBuilder_ == null) {
        lhhilpcdjmd_ = null;
        onChanged();
      } else {
        lhhilpcdjmd_ = null;
        lhhilpcdjmdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    public POGOProtos.Rpc.CombatSeasonResult.Builder getLhhilpcdjmdBuilder() {
      
      onChanged();
      return getLhhilpcdjmdFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    public POGOProtos.Rpc.CombatSeasonResultOrBuilder getLhhilpcdjmdOrBuilder() {
      if (lhhilpcdjmdBuilder_ != null) {
        return lhhilpcdjmdBuilder_.getMessageOrBuilder();
      } else {
        return lhhilpcdjmd_ == null ?
            POGOProtos.Rpc.CombatSeasonResult.getDefaultInstance() : lhhilpcdjmd_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.CombatSeasonResult lhhilpcdjmd = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.CombatSeasonResult, POGOProtos.Rpc.CombatSeasonResult.Builder, POGOProtos.Rpc.CombatSeasonResultOrBuilder> 
        getLhhilpcdjmdFieldBuilder() {
      if (lhhilpcdjmdBuilder_ == null) {
        lhhilpcdjmdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.CombatSeasonResult, POGOProtos.Rpc.CombatSeasonResult.Builder, POGOProtos.Rpc.CombatSeasonResultOrBuilder>(
                getLhhilpcdjmd(),
                getParentForChildren(),
                isClean());
        lhhilpcdjmd_ = null;
      }
      return lhhilpcdjmdBuilder_;
    }

    private boolean cpjnphdafik_ ;
    /**
     * <code>bool cpjnphdafik = 6;</code>
     * @return The cpjnphdafik.
     */
    @java.lang.Override
    public boolean getCpjnphdafik() {
      return cpjnphdafik_;
    }
    /**
     * <code>bool cpjnphdafik = 6;</code>
     * @param value The cpjnphdafik to set.
     * @return This builder for chaining.
     */
    public Builder setCpjnphdafik(boolean value) {
      
      cpjnphdafik_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool cpjnphdafik = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpjnphdafik() {
      
      cpjnphdafik_ = false;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.JIBJDNMPLOD)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.JIBJDNMPLOD)
  private static final POGOProtos.Rpc.JIBJDNMPLOD DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.JIBJDNMPLOD();
  }

  public static POGOProtos.Rpc.JIBJDNMPLOD getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JIBJDNMPLOD>
      PARSER = new com.google.protobuf.AbstractParser<JIBJDNMPLOD>() {
    @java.lang.Override
    public JIBJDNMPLOD parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JIBJDNMPLOD(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JIBJDNMPLOD> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JIBJDNMPLOD> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.JIBJDNMPLOD getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
