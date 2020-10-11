// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

/**
 * <pre>
 * ref: NIEDDLOEAAN
 * </pre>
 *
 * Protobuf type {@code POGOProtos.Rpc.NIEDDLOEAAN}
 */
public final class NIEDDLOEAAN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Rpc.NIEDDLOEAAN)
    NIEDDLOEAANOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NIEDDLOEAAN.newBuilder() to construct.
  private NIEDDLOEAAN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NIEDDLOEAAN() {
    result_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NIEDDLOEAAN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NIEDDLOEAAN(
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
            POGOProtos.Rpc.GymStatusAndDefendersProto.Builder subBuilder = null;
            if (oknapplbpbk_ != null) {
              subBuilder = oknapplbpbk_.toBuilder();
            }
            oknapplbpbk_ = input.readMessage(POGOProtos.Rpc.GymStatusAndDefendersProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(oknapplbpbk_);
              oknapplbpbk_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            POGOProtos.Rpc.AwardedGymBadge.Builder subBuilder = null;
            if (eoilecekhdn_ != null) {
              subBuilder = eoilecekhdn_.toBuilder();
            }
            eoilecekhdn_ = input.readMessage(POGOProtos.Rpc.AwardedGymBadge.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(eoilecekhdn_);
              eoilecekhdn_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            nimjbiippjj_ = input.readInt64();
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
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NIEDDLOEAAN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NIEDDLOEAAN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Rpc.NIEDDLOEAAN.class, POGOProtos.Rpc.NIEDDLOEAAN.Builder.class);
  }

  /**
   * <pre>
   * ref: NIEDDLOEAAN/MOJMJGLPCAA/ALNHGAJEPHG
   * </pre>
   *
   * Protobuf enum {@code POGOProtos.Rpc.NIEDDLOEAAN.Result}
   */
  public enum Result
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    NO_RESULT_SET(0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1),
    /**
     * <code>ERROR_ALREADY_HAS_POKEMON_ON_FORT = 2;</code>
     */
    ERROR_ALREADY_HAS_POKEMON_ON_FORT(2),
    /**
     * <code>ERROR_OPPOSING_TEAM_OWNS_FORT = 3;</code>
     */
    ERROR_OPPOSING_TEAM_OWNS_FORT(3),
    /**
     * <code>ERROR_FORT_IS_FULL = 4;</code>
     */
    ERROR_FORT_IS_FULL(4),
    /**
     * <code>ERROR_NOT_IN_RANGE = 5;</code>
     */
    ERROR_NOT_IN_RANGE(5),
    /**
     * <code>ERROR_PLAYER_HAS_NO_TEAM = 6;</code>
     */
    ERROR_PLAYER_HAS_NO_TEAM(6),
    /**
     * <code>ERROR_POKEMON_NOT_FULL_HP = 7;</code>
     */
    ERROR_POKEMON_NOT_FULL_HP(7),
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 8;</code>
     */
    ERROR_PLAYER_BELOW_MINIMUM_LEVEL(8),
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 9;</code>
     */
    ERROR_POKEMON_IS_BUDDY(9),
    /**
     * <code>ERROR_FORT_DEPLOY_LOCKOUT = 10;</code>
     */
    ERROR_FORT_DEPLOY_LOCKOUT(10),
    /**
     * <code>ERROR_PLAYER_HAS_NO_NICKNAME = 11;</code>
     */
    ERROR_PLAYER_HAS_NO_NICKNAME(11),
    /**
     * <code>ERROR_POI_INACCESSIBLE = 12;</code>
     */
    ERROR_POI_INACCESSIBLE(12),
    /**
     * <code>ERROR_NOT_A_POKEMON = 13;</code>
     */
    ERROR_NOT_A_POKEMON(13),
    /**
     * <code>ERROR_TOO_MANY_OF_SAME_KIND = 14;</code>
     */
    ERROR_TOO_MANY_OF_SAME_KIND(14),
    /**
     * <code>ERROR_TOO_MANY_DEPLOYED = 15;</code>
     */
    ERROR_TOO_MANY_DEPLOYED(15),
    /**
     * <code>ERROR_TEAM_DEPLOY_LOCKOUT = 16;</code>
     */
    ERROR_TEAM_DEPLOY_LOCKOUT(16),
    /**
     * <code>ERROR_LEGENDARY_POKEMON = 17;</code>
     */
    ERROR_LEGENDARY_POKEMON(17),
    /**
     * <code>ERROR_INVALID_POKEMON = 18;</code>
     */
    ERROR_INVALID_POKEMON(18),
    /**
     * <code>ERROR_RAID_ACTIVE = 19;</code>
     */
    ERROR_RAID_ACTIVE(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NO_RESULT_SET = 0;</code>
     */
    public static final int NO_RESULT_SET_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>ERROR_ALREADY_HAS_POKEMON_ON_FORT = 2;</code>
     */
    public static final int ERROR_ALREADY_HAS_POKEMON_ON_FORT_VALUE = 2;
    /**
     * <code>ERROR_OPPOSING_TEAM_OWNS_FORT = 3;</code>
     */
    public static final int ERROR_OPPOSING_TEAM_OWNS_FORT_VALUE = 3;
    /**
     * <code>ERROR_FORT_IS_FULL = 4;</code>
     */
    public static final int ERROR_FORT_IS_FULL_VALUE = 4;
    /**
     * <code>ERROR_NOT_IN_RANGE = 5;</code>
     */
    public static final int ERROR_NOT_IN_RANGE_VALUE = 5;
    /**
     * <code>ERROR_PLAYER_HAS_NO_TEAM = 6;</code>
     */
    public static final int ERROR_PLAYER_HAS_NO_TEAM_VALUE = 6;
    /**
     * <code>ERROR_POKEMON_NOT_FULL_HP = 7;</code>
     */
    public static final int ERROR_POKEMON_NOT_FULL_HP_VALUE = 7;
    /**
     * <code>ERROR_PLAYER_BELOW_MINIMUM_LEVEL = 8;</code>
     */
    public static final int ERROR_PLAYER_BELOW_MINIMUM_LEVEL_VALUE = 8;
    /**
     * <code>ERROR_POKEMON_IS_BUDDY = 9;</code>
     */
    public static final int ERROR_POKEMON_IS_BUDDY_VALUE = 9;
    /**
     * <code>ERROR_FORT_DEPLOY_LOCKOUT = 10;</code>
     */
    public static final int ERROR_FORT_DEPLOY_LOCKOUT_VALUE = 10;
    /**
     * <code>ERROR_PLAYER_HAS_NO_NICKNAME = 11;</code>
     */
    public static final int ERROR_PLAYER_HAS_NO_NICKNAME_VALUE = 11;
    /**
     * <code>ERROR_POI_INACCESSIBLE = 12;</code>
     */
    public static final int ERROR_POI_INACCESSIBLE_VALUE = 12;
    /**
     * <code>ERROR_NOT_A_POKEMON = 13;</code>
     */
    public static final int ERROR_NOT_A_POKEMON_VALUE = 13;
    /**
     * <code>ERROR_TOO_MANY_OF_SAME_KIND = 14;</code>
     */
    public static final int ERROR_TOO_MANY_OF_SAME_KIND_VALUE = 14;
    /**
     * <code>ERROR_TOO_MANY_DEPLOYED = 15;</code>
     */
    public static final int ERROR_TOO_MANY_DEPLOYED_VALUE = 15;
    /**
     * <code>ERROR_TEAM_DEPLOY_LOCKOUT = 16;</code>
     */
    public static final int ERROR_TEAM_DEPLOY_LOCKOUT_VALUE = 16;
    /**
     * <code>ERROR_LEGENDARY_POKEMON = 17;</code>
     */
    public static final int ERROR_LEGENDARY_POKEMON_VALUE = 17;
    /**
     * <code>ERROR_INVALID_POKEMON = 18;</code>
     */
    public static final int ERROR_INVALID_POKEMON_VALUE = 18;
    /**
     * <code>ERROR_RAID_ACTIVE = 19;</code>
     */
    public static final int ERROR_RAID_ACTIVE_VALUE = 19;


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
        case 0: return NO_RESULT_SET;
        case 1: return SUCCESS;
        case 2: return ERROR_ALREADY_HAS_POKEMON_ON_FORT;
        case 3: return ERROR_OPPOSING_TEAM_OWNS_FORT;
        case 4: return ERROR_FORT_IS_FULL;
        case 5: return ERROR_NOT_IN_RANGE;
        case 6: return ERROR_PLAYER_HAS_NO_TEAM;
        case 7: return ERROR_POKEMON_NOT_FULL_HP;
        case 8: return ERROR_PLAYER_BELOW_MINIMUM_LEVEL;
        case 9: return ERROR_POKEMON_IS_BUDDY;
        case 10: return ERROR_FORT_DEPLOY_LOCKOUT;
        case 11: return ERROR_PLAYER_HAS_NO_NICKNAME;
        case 12: return ERROR_POI_INACCESSIBLE;
        case 13: return ERROR_NOT_A_POKEMON;
        case 14: return ERROR_TOO_MANY_OF_SAME_KIND;
        case 15: return ERROR_TOO_MANY_DEPLOYED;
        case 16: return ERROR_TEAM_DEPLOY_LOCKOUT;
        case 17: return ERROR_LEGENDARY_POKEMON;
        case 18: return ERROR_INVALID_POKEMON;
        case 19: return ERROR_RAID_ACTIVE;
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
      return POGOProtos.Rpc.NIEDDLOEAAN.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:POGOProtos.Rpc.NIEDDLOEAAN.Result)
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private int result_;
  /**
   * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  @java.lang.Override public int getResultValue() {
    return result_;
  }
  /**
   * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override public POGOProtos.Rpc.NIEDDLOEAAN.Result getResult() {
    @SuppressWarnings("deprecation")
    POGOProtos.Rpc.NIEDDLOEAAN.Result result = POGOProtos.Rpc.NIEDDLOEAAN.Result.valueOf(result_);
    return result == null ? POGOProtos.Rpc.NIEDDLOEAAN.Result.UNRECOGNIZED : result;
  }

  public static final int OKNAPPLBPBK_FIELD_NUMBER = 2;
  private POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk_;
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
   * @return Whether the oknapplbpbk field is set.
   */
  @java.lang.Override
  public boolean hasOknapplbpbk() {
    return oknapplbpbk_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
   * @return The oknapplbpbk.
   */
  @java.lang.Override
  public POGOProtos.Rpc.GymStatusAndDefendersProto getOknapplbpbk() {
    return oknapplbpbk_ == null ? POGOProtos.Rpc.GymStatusAndDefendersProto.getDefaultInstance() : oknapplbpbk_;
  }
  /**
   * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder getOknapplbpbkOrBuilder() {
    return getOknapplbpbk();
  }

  public static final int EOILECEKHDN_FIELD_NUMBER = 3;
  private POGOProtos.Rpc.AwardedGymBadge eoilecekhdn_;
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
   * @return Whether the eoilecekhdn field is set.
   */
  @java.lang.Override
  public boolean hasEoilecekhdn() {
    return eoilecekhdn_ != null;
  }
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
   * @return The eoilecekhdn.
   */
  @java.lang.Override
  public POGOProtos.Rpc.AwardedGymBadge getEoilecekhdn() {
    return eoilecekhdn_ == null ? POGOProtos.Rpc.AwardedGymBadge.getDefaultInstance() : eoilecekhdn_;
  }
  /**
   * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
   */
  @java.lang.Override
  public POGOProtos.Rpc.AwardedGymBadgeOrBuilder getEoilecekhdnOrBuilder() {
    return getEoilecekhdn();
  }

  public static final int NIMJBIIPPJJ_FIELD_NUMBER = 4;
  private long nimjbiippjj_;
  /**
   * <code>int64 nimjbiippjj = 4;</code>
   * @return The nimjbiippjj.
   */
  @java.lang.Override
  public long getNimjbiippjj() {
    return nimjbiippjj_;
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
    if (result_ != POGOProtos.Rpc.NIEDDLOEAAN.Result.NO_RESULT_SET.getNumber()) {
      output.writeEnum(1, result_);
    }
    if (oknapplbpbk_ != null) {
      output.writeMessage(2, getOknapplbpbk());
    }
    if (eoilecekhdn_ != null) {
      output.writeMessage(3, getEoilecekhdn());
    }
    if (nimjbiippjj_ != 0L) {
      output.writeInt64(4, nimjbiippjj_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != POGOProtos.Rpc.NIEDDLOEAAN.Result.NO_RESULT_SET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, result_);
    }
    if (oknapplbpbk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOknapplbpbk());
    }
    if (eoilecekhdn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEoilecekhdn());
    }
    if (nimjbiippjj_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, nimjbiippjj_);
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
    if (!(obj instanceof POGOProtos.Rpc.NIEDDLOEAAN)) {
      return super.equals(obj);
    }
    POGOProtos.Rpc.NIEDDLOEAAN other = (POGOProtos.Rpc.NIEDDLOEAAN) obj;

    if (result_ != other.result_) return false;
    if (hasOknapplbpbk() != other.hasOknapplbpbk()) return false;
    if (hasOknapplbpbk()) {
      if (!getOknapplbpbk()
          .equals(other.getOknapplbpbk())) return false;
    }
    if (hasEoilecekhdn() != other.hasEoilecekhdn()) return false;
    if (hasEoilecekhdn()) {
      if (!getEoilecekhdn()
          .equals(other.getEoilecekhdn())) return false;
    }
    if (getNimjbiippjj()
        != other.getNimjbiippjj()) return false;
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
    if (hasOknapplbpbk()) {
      hash = (37 * hash) + OKNAPPLBPBK_FIELD_NUMBER;
      hash = (53 * hash) + getOknapplbpbk().hashCode();
    }
    if (hasEoilecekhdn()) {
      hash = (37 * hash) + EOILECEKHDN_FIELD_NUMBER;
      hash = (53 * hash) + getEoilecekhdn().hashCode();
    }
    hash = (37 * hash) + NIMJBIIPPJJ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNimjbiippjj());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Rpc.NIEDDLOEAAN parseFrom(
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
  public static Builder newBuilder(POGOProtos.Rpc.NIEDDLOEAAN prototype) {
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
   * ref: NIEDDLOEAAN
   * </pre>
   *
   * Protobuf type {@code POGOProtos.Rpc.NIEDDLOEAAN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Rpc.NIEDDLOEAAN)
      POGOProtos.Rpc.NIEDDLOEAANOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NIEDDLOEAAN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NIEDDLOEAAN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Rpc.NIEDDLOEAAN.class, POGOProtos.Rpc.NIEDDLOEAAN.Builder.class);
    }

    // Construct using POGOProtos.Rpc.NIEDDLOEAAN.newBuilder()
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

      if (oknapplbpbkBuilder_ == null) {
        oknapplbpbk_ = null;
      } else {
        oknapplbpbk_ = null;
        oknapplbpbkBuilder_ = null;
      }
      if (eoilecekhdnBuilder_ == null) {
        eoilecekhdn_ = null;
      } else {
        eoilecekhdn_ = null;
        eoilecekhdnBuilder_ = null;
      }
      nimjbiippjj_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Rpc.POGOProtosRpc.internal_static_POGOProtos_Rpc_NIEDDLOEAAN_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NIEDDLOEAAN getDefaultInstanceForType() {
      return POGOProtos.Rpc.NIEDDLOEAAN.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Rpc.NIEDDLOEAAN build() {
      POGOProtos.Rpc.NIEDDLOEAAN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Rpc.NIEDDLOEAAN buildPartial() {
      POGOProtos.Rpc.NIEDDLOEAAN result = new POGOProtos.Rpc.NIEDDLOEAAN(this);
      result.result_ = result_;
      if (oknapplbpbkBuilder_ == null) {
        result.oknapplbpbk_ = oknapplbpbk_;
      } else {
        result.oknapplbpbk_ = oknapplbpbkBuilder_.build();
      }
      if (eoilecekhdnBuilder_ == null) {
        result.eoilecekhdn_ = eoilecekhdn_;
      } else {
        result.eoilecekhdn_ = eoilecekhdnBuilder_.build();
      }
      result.nimjbiippjj_ = nimjbiippjj_;
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
      if (other instanceof POGOProtos.Rpc.NIEDDLOEAAN) {
        return mergeFrom((POGOProtos.Rpc.NIEDDLOEAAN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Rpc.NIEDDLOEAAN other) {
      if (other == POGOProtos.Rpc.NIEDDLOEAAN.getDefaultInstance()) return this;
      if (other.result_ != 0) {
        setResultValue(other.getResultValue());
      }
      if (other.hasOknapplbpbk()) {
        mergeOknapplbpbk(other.getOknapplbpbk());
      }
      if (other.hasEoilecekhdn()) {
        mergeEoilecekhdn(other.getEoilecekhdn());
      }
      if (other.getNimjbiippjj() != 0L) {
        setNimjbiippjj(other.getNimjbiippjj());
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
      POGOProtos.Rpc.NIEDDLOEAAN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Rpc.NIEDDLOEAAN) e.getUnfinishedMessage();
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
     * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
     * @return The enum numeric value on the wire for result.
     */
    @java.lang.Override public int getResultValue() {
      return result_;
    }
    /**
     * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
     * @param value The enum numeric value on the wire for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultValue(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
     * @return The result.
     */
    @java.lang.Override
    public POGOProtos.Rpc.NIEDDLOEAAN.Result getResult() {
      @SuppressWarnings("deprecation")
      POGOProtos.Rpc.NIEDDLOEAAN.Result result = POGOProtos.Rpc.NIEDDLOEAAN.Result.valueOf(result_);
      return result == null ? POGOProtos.Rpc.NIEDDLOEAAN.Result.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(POGOProtos.Rpc.NIEDDLOEAAN.Result value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      result_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.NIEDDLOEAAN.Result result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
    }

    private POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GymStatusAndDefendersProto, POGOProtos.Rpc.GymStatusAndDefendersProto.Builder, POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder> oknapplbpbkBuilder_;
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     * @return Whether the oknapplbpbk field is set.
     */
    public boolean hasOknapplbpbk() {
      return oknapplbpbkBuilder_ != null || oknapplbpbk_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     * @return The oknapplbpbk.
     */
    public POGOProtos.Rpc.GymStatusAndDefendersProto getOknapplbpbk() {
      if (oknapplbpbkBuilder_ == null) {
        return oknapplbpbk_ == null ? POGOProtos.Rpc.GymStatusAndDefendersProto.getDefaultInstance() : oknapplbpbk_;
      } else {
        return oknapplbpbkBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    public Builder setOknapplbpbk(POGOProtos.Rpc.GymStatusAndDefendersProto value) {
      if (oknapplbpbkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oknapplbpbk_ = value;
        onChanged();
      } else {
        oknapplbpbkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    public Builder setOknapplbpbk(
        POGOProtos.Rpc.GymStatusAndDefendersProto.Builder builderForValue) {
      if (oknapplbpbkBuilder_ == null) {
        oknapplbpbk_ = builderForValue.build();
        onChanged();
      } else {
        oknapplbpbkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    public Builder mergeOknapplbpbk(POGOProtos.Rpc.GymStatusAndDefendersProto value) {
      if (oknapplbpbkBuilder_ == null) {
        if (oknapplbpbk_ != null) {
          oknapplbpbk_ =
            POGOProtos.Rpc.GymStatusAndDefendersProto.newBuilder(oknapplbpbk_).mergeFrom(value).buildPartial();
        } else {
          oknapplbpbk_ = value;
        }
        onChanged();
      } else {
        oknapplbpbkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    public Builder clearOknapplbpbk() {
      if (oknapplbpbkBuilder_ == null) {
        oknapplbpbk_ = null;
        onChanged();
      } else {
        oknapplbpbk_ = null;
        oknapplbpbkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    public POGOProtos.Rpc.GymStatusAndDefendersProto.Builder getOknapplbpbkBuilder() {
      
      onChanged();
      return getOknapplbpbkFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    public POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder getOknapplbpbkOrBuilder() {
      if (oknapplbpbkBuilder_ != null) {
        return oknapplbpbkBuilder_.getMessageOrBuilder();
      } else {
        return oknapplbpbk_ == null ?
            POGOProtos.Rpc.GymStatusAndDefendersProto.getDefaultInstance() : oknapplbpbk_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.GymStatusAndDefendersProto oknapplbpbk = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.GymStatusAndDefendersProto, POGOProtos.Rpc.GymStatusAndDefendersProto.Builder, POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder> 
        getOknapplbpbkFieldBuilder() {
      if (oknapplbpbkBuilder_ == null) {
        oknapplbpbkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.GymStatusAndDefendersProto, POGOProtos.Rpc.GymStatusAndDefendersProto.Builder, POGOProtos.Rpc.GymStatusAndDefendersProtoOrBuilder>(
                getOknapplbpbk(),
                getParentForChildren(),
                isClean());
        oknapplbpbk_ = null;
      }
      return oknapplbpbkBuilder_;
    }

    private POGOProtos.Rpc.AwardedGymBadge eoilecekhdn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AwardedGymBadge, POGOProtos.Rpc.AwardedGymBadge.Builder, POGOProtos.Rpc.AwardedGymBadgeOrBuilder> eoilecekhdnBuilder_;
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     * @return Whether the eoilecekhdn field is set.
     */
    public boolean hasEoilecekhdn() {
      return eoilecekhdnBuilder_ != null || eoilecekhdn_ != null;
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     * @return The eoilecekhdn.
     */
    public POGOProtos.Rpc.AwardedGymBadge getEoilecekhdn() {
      if (eoilecekhdnBuilder_ == null) {
        return eoilecekhdn_ == null ? POGOProtos.Rpc.AwardedGymBadge.getDefaultInstance() : eoilecekhdn_;
      } else {
        return eoilecekhdnBuilder_.getMessage();
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    public Builder setEoilecekhdn(POGOProtos.Rpc.AwardedGymBadge value) {
      if (eoilecekhdnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eoilecekhdn_ = value;
        onChanged();
      } else {
        eoilecekhdnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    public Builder setEoilecekhdn(
        POGOProtos.Rpc.AwardedGymBadge.Builder builderForValue) {
      if (eoilecekhdnBuilder_ == null) {
        eoilecekhdn_ = builderForValue.build();
        onChanged();
      } else {
        eoilecekhdnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    public Builder mergeEoilecekhdn(POGOProtos.Rpc.AwardedGymBadge value) {
      if (eoilecekhdnBuilder_ == null) {
        if (eoilecekhdn_ != null) {
          eoilecekhdn_ =
            POGOProtos.Rpc.AwardedGymBadge.newBuilder(eoilecekhdn_).mergeFrom(value).buildPartial();
        } else {
          eoilecekhdn_ = value;
        }
        onChanged();
      } else {
        eoilecekhdnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    public Builder clearEoilecekhdn() {
      if (eoilecekhdnBuilder_ == null) {
        eoilecekhdn_ = null;
        onChanged();
      } else {
        eoilecekhdn_ = null;
        eoilecekhdnBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    public POGOProtos.Rpc.AwardedGymBadge.Builder getEoilecekhdnBuilder() {
      
      onChanged();
      return getEoilecekhdnFieldBuilder().getBuilder();
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    public POGOProtos.Rpc.AwardedGymBadgeOrBuilder getEoilecekhdnOrBuilder() {
      if (eoilecekhdnBuilder_ != null) {
        return eoilecekhdnBuilder_.getMessageOrBuilder();
      } else {
        return eoilecekhdn_ == null ?
            POGOProtos.Rpc.AwardedGymBadge.getDefaultInstance() : eoilecekhdn_;
      }
    }
    /**
     * <code>.POGOProtos.Rpc.AwardedGymBadge eoilecekhdn = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        POGOProtos.Rpc.AwardedGymBadge, POGOProtos.Rpc.AwardedGymBadge.Builder, POGOProtos.Rpc.AwardedGymBadgeOrBuilder> 
        getEoilecekhdnFieldBuilder() {
      if (eoilecekhdnBuilder_ == null) {
        eoilecekhdnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            POGOProtos.Rpc.AwardedGymBadge, POGOProtos.Rpc.AwardedGymBadge.Builder, POGOProtos.Rpc.AwardedGymBadgeOrBuilder>(
                getEoilecekhdn(),
                getParentForChildren(),
                isClean());
        eoilecekhdn_ = null;
      }
      return eoilecekhdnBuilder_;
    }

    private long nimjbiippjj_ ;
    /**
     * <code>int64 nimjbiippjj = 4;</code>
     * @return The nimjbiippjj.
     */
    @java.lang.Override
    public long getNimjbiippjj() {
      return nimjbiippjj_;
    }
    /**
     * <code>int64 nimjbiippjj = 4;</code>
     * @param value The nimjbiippjj to set.
     * @return This builder for chaining.
     */
    public Builder setNimjbiippjj(long value) {
      
      nimjbiippjj_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 nimjbiippjj = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNimjbiippjj() {
      
      nimjbiippjj_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Rpc.NIEDDLOEAAN)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Rpc.NIEDDLOEAAN)
  private static final POGOProtos.Rpc.NIEDDLOEAAN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Rpc.NIEDDLOEAAN();
  }

  public static POGOProtos.Rpc.NIEDDLOEAAN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NIEDDLOEAAN>
      PARSER = new com.google.protobuf.AbstractParser<NIEDDLOEAAN>() {
    @java.lang.Override
    public NIEDDLOEAAN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NIEDDLOEAAN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NIEDDLOEAAN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NIEDDLOEAAN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Rpc.NIEDDLOEAAN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
