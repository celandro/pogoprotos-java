// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Raid/Participation.proto

package POGOProtos.Data.Raid;

/**
 * Protobuf type {@code POGOProtos.Data.Raid.Participation}
 */
public  final class Participation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:POGOProtos.Data.Raid.Participation)
    ParticipationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Participation.newBuilder() to construct.
  private Participation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Participation() {
    highestFriendshipMilestone_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Participation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Participation(
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

            individualDamagePokeballs_ = input.readInt32();
            break;
          }
          case 16: {

            teamDamagePokeballs_ = input.readInt32();
            break;
          }
          case 24: {

            gymOwnershipPokeballs_ = input.readInt32();
            break;
          }
          case 32: {

            basePokeballs_ = input.readInt32();
            break;
          }
          case 41: {

            bluePercentage_ = input.readDouble();
            break;
          }
          case 49: {

            redPercentage_ = input.readDouble();
            break;
          }
          case 57: {

            yellowPercentage_ = input.readDouble();
            break;
          }
          case 69: {

            bonusItemMultiplier_ = input.readFloat();
            break;
          }
          case 72: {
            int rawValue = input.readEnum();

            highestFriendshipMilestone_ = rawValue;
            break;
          }
          case 80: {

            highestFriendshipPokeballs_ = input.readInt32();
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
    return POGOProtos.Data.Raid.ParticipationOuterClass.internal_static_POGOProtos_Data_Raid_Participation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return POGOProtos.Data.Raid.ParticipationOuterClass.internal_static_POGOProtos_Data_Raid_Participation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            POGOProtos.Data.Raid.Participation.class, POGOProtos.Data.Raid.Participation.Builder.class);
  }

  public static final int INDIVIDUAL_DAMAGE_POKEBALLS_FIELD_NUMBER = 1;
  private int individualDamagePokeballs_;
  /**
   * <code>int32 individual_damage_pokeballs = 1;</code>
   * @return The individualDamagePokeballs.
   */
  public int getIndividualDamagePokeballs() {
    return individualDamagePokeballs_;
  }

  public static final int TEAM_DAMAGE_POKEBALLS_FIELD_NUMBER = 2;
  private int teamDamagePokeballs_;
  /**
   * <code>int32 team_damage_pokeballs = 2;</code>
   * @return The teamDamagePokeballs.
   */
  public int getTeamDamagePokeballs() {
    return teamDamagePokeballs_;
  }

  public static final int GYM_OWNERSHIP_POKEBALLS_FIELD_NUMBER = 3;
  private int gymOwnershipPokeballs_;
  /**
   * <code>int32 gym_ownership_pokeballs = 3;</code>
   * @return The gymOwnershipPokeballs.
   */
  public int getGymOwnershipPokeballs() {
    return gymOwnershipPokeballs_;
  }

  public static final int BASE_POKEBALLS_FIELD_NUMBER = 4;
  private int basePokeballs_;
  /**
   * <code>int32 base_pokeballs = 4;</code>
   * @return The basePokeballs.
   */
  public int getBasePokeballs() {
    return basePokeballs_;
  }

  public static final int BLUE_PERCENTAGE_FIELD_NUMBER = 5;
  private double bluePercentage_;
  /**
   * <code>double blue_percentage = 5;</code>
   * @return The bluePercentage.
   */
  public double getBluePercentage() {
    return bluePercentage_;
  }

  public static final int RED_PERCENTAGE_FIELD_NUMBER = 6;
  private double redPercentage_;
  /**
   * <code>double red_percentage = 6;</code>
   * @return The redPercentage.
   */
  public double getRedPercentage() {
    return redPercentage_;
  }

  public static final int YELLOW_PERCENTAGE_FIELD_NUMBER = 7;
  private double yellowPercentage_;
  /**
   * <code>double yellow_percentage = 7;</code>
   * @return The yellowPercentage.
   */
  public double getYellowPercentage() {
    return yellowPercentage_;
  }

  public static final int BONUS_ITEM_MULTIPLIER_FIELD_NUMBER = 8;
  private float bonusItemMultiplier_;
  /**
   * <code>float bonus_item_multiplier = 8;</code>
   * @return The bonusItemMultiplier.
   */
  public float getBonusItemMultiplier() {
    return bonusItemMultiplier_;
  }

  public static final int HIGHEST_FRIENDSHIP_MILESTONE_FIELD_NUMBER = 9;
  private int highestFriendshipMilestone_;
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
   * @return The enum numeric value on the wire for highestFriendshipMilestone.
   */
  public int getHighestFriendshipMilestoneValue() {
    return highestFriendshipMilestone_;
  }
  /**
   * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
   * @return The highestFriendshipMilestone.
   */
  public POGOProtos.Enums.FriendshipLevelMilestone getHighestFriendshipMilestone() {
    @SuppressWarnings("deprecation")
    POGOProtos.Enums.FriendshipLevelMilestone result = POGOProtos.Enums.FriendshipLevelMilestone.valueOf(highestFriendshipMilestone_);
    return result == null ? POGOProtos.Enums.FriendshipLevelMilestone.UNRECOGNIZED : result;
  }

  public static final int HIGHEST_FRIENDSHIP_POKEBALLS_FIELD_NUMBER = 10;
  private int highestFriendshipPokeballs_;
  /**
   * <code>int32 highest_friendship_pokeballs = 10;</code>
   * @return The highestFriendshipPokeballs.
   */
  public int getHighestFriendshipPokeballs() {
    return highestFriendshipPokeballs_;
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
    if (individualDamagePokeballs_ != 0) {
      output.writeInt32(1, individualDamagePokeballs_);
    }
    if (teamDamagePokeballs_ != 0) {
      output.writeInt32(2, teamDamagePokeballs_);
    }
    if (gymOwnershipPokeballs_ != 0) {
      output.writeInt32(3, gymOwnershipPokeballs_);
    }
    if (basePokeballs_ != 0) {
      output.writeInt32(4, basePokeballs_);
    }
    if (bluePercentage_ != 0D) {
      output.writeDouble(5, bluePercentage_);
    }
    if (redPercentage_ != 0D) {
      output.writeDouble(6, redPercentage_);
    }
    if (yellowPercentage_ != 0D) {
      output.writeDouble(7, yellowPercentage_);
    }
    if (bonusItemMultiplier_ != 0F) {
      output.writeFloat(8, bonusItemMultiplier_);
    }
    if (highestFriendshipMilestone_ != POGOProtos.Enums.FriendshipLevelMilestone.FRIENDSHIP_LEVEL_UNSET.getNumber()) {
      output.writeEnum(9, highestFriendshipMilestone_);
    }
    if (highestFriendshipPokeballs_ != 0) {
      output.writeInt32(10, highestFriendshipPokeballs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (individualDamagePokeballs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, individualDamagePokeballs_);
    }
    if (teamDamagePokeballs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, teamDamagePokeballs_);
    }
    if (gymOwnershipPokeballs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, gymOwnershipPokeballs_);
    }
    if (basePokeballs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, basePokeballs_);
    }
    if (bluePercentage_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, bluePercentage_);
    }
    if (redPercentage_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, redPercentage_);
    }
    if (yellowPercentage_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, yellowPercentage_);
    }
    if (bonusItemMultiplier_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(8, bonusItemMultiplier_);
    }
    if (highestFriendshipMilestone_ != POGOProtos.Enums.FriendshipLevelMilestone.FRIENDSHIP_LEVEL_UNSET.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(9, highestFriendshipMilestone_);
    }
    if (highestFriendshipPokeballs_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, highestFriendshipPokeballs_);
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
    if (!(obj instanceof POGOProtos.Data.Raid.Participation)) {
      return super.equals(obj);
    }
    POGOProtos.Data.Raid.Participation other = (POGOProtos.Data.Raid.Participation) obj;

    if (getIndividualDamagePokeballs()
        != other.getIndividualDamagePokeballs()) return false;
    if (getTeamDamagePokeballs()
        != other.getTeamDamagePokeballs()) return false;
    if (getGymOwnershipPokeballs()
        != other.getGymOwnershipPokeballs()) return false;
    if (getBasePokeballs()
        != other.getBasePokeballs()) return false;
    if (java.lang.Double.doubleToLongBits(getBluePercentage())
        != java.lang.Double.doubleToLongBits(
            other.getBluePercentage())) return false;
    if (java.lang.Double.doubleToLongBits(getRedPercentage())
        != java.lang.Double.doubleToLongBits(
            other.getRedPercentage())) return false;
    if (java.lang.Double.doubleToLongBits(getYellowPercentage())
        != java.lang.Double.doubleToLongBits(
            other.getYellowPercentage())) return false;
    if (java.lang.Float.floatToIntBits(getBonusItemMultiplier())
        != java.lang.Float.floatToIntBits(
            other.getBonusItemMultiplier())) return false;
    if (highestFriendshipMilestone_ != other.highestFriendshipMilestone_) return false;
    if (getHighestFriendshipPokeballs()
        != other.getHighestFriendshipPokeballs()) return false;
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
    hash = (37 * hash) + INDIVIDUAL_DAMAGE_POKEBALLS_FIELD_NUMBER;
    hash = (53 * hash) + getIndividualDamagePokeballs();
    hash = (37 * hash) + TEAM_DAMAGE_POKEBALLS_FIELD_NUMBER;
    hash = (53 * hash) + getTeamDamagePokeballs();
    hash = (37 * hash) + GYM_OWNERSHIP_POKEBALLS_FIELD_NUMBER;
    hash = (53 * hash) + getGymOwnershipPokeballs();
    hash = (37 * hash) + BASE_POKEBALLS_FIELD_NUMBER;
    hash = (53 * hash) + getBasePokeballs();
    hash = (37 * hash) + BLUE_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBluePercentage()));
    hash = (37 * hash) + RED_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getRedPercentage()));
    hash = (37 * hash) + YELLOW_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getYellowPercentage()));
    hash = (37 * hash) + BONUS_ITEM_MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBonusItemMultiplier());
    hash = (37 * hash) + HIGHEST_FRIENDSHIP_MILESTONE_FIELD_NUMBER;
    hash = (53 * hash) + highestFriendshipMilestone_;
    hash = (37 * hash) + HIGHEST_FRIENDSHIP_POKEBALLS_FIELD_NUMBER;
    hash = (53 * hash) + getHighestFriendshipPokeballs();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static POGOProtos.Data.Raid.Participation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.Participation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Raid.Participation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static POGOProtos.Data.Raid.Participation parseFrom(
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
  public static Builder newBuilder(POGOProtos.Data.Raid.Participation prototype) {
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
   * Protobuf type {@code POGOProtos.Data.Raid.Participation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:POGOProtos.Data.Raid.Participation)
      POGOProtos.Data.Raid.ParticipationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return POGOProtos.Data.Raid.ParticipationOuterClass.internal_static_POGOProtos_Data_Raid_Participation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return POGOProtos.Data.Raid.ParticipationOuterClass.internal_static_POGOProtos_Data_Raid_Participation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              POGOProtos.Data.Raid.Participation.class, POGOProtos.Data.Raid.Participation.Builder.class);
    }

    // Construct using POGOProtos.Data.Raid.Participation.newBuilder()
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
      individualDamagePokeballs_ = 0;

      teamDamagePokeballs_ = 0;

      gymOwnershipPokeballs_ = 0;

      basePokeballs_ = 0;

      bluePercentage_ = 0D;

      redPercentage_ = 0D;

      yellowPercentage_ = 0D;

      bonusItemMultiplier_ = 0F;

      highestFriendshipMilestone_ = 0;

      highestFriendshipPokeballs_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return POGOProtos.Data.Raid.ParticipationOuterClass.internal_static_POGOProtos_Data_Raid_Participation_descriptor;
    }

    @java.lang.Override
    public POGOProtos.Data.Raid.Participation getDefaultInstanceForType() {
      return POGOProtos.Data.Raid.Participation.getDefaultInstance();
    }

    @java.lang.Override
    public POGOProtos.Data.Raid.Participation build() {
      POGOProtos.Data.Raid.Participation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public POGOProtos.Data.Raid.Participation buildPartial() {
      POGOProtos.Data.Raid.Participation result = new POGOProtos.Data.Raid.Participation(this);
      result.individualDamagePokeballs_ = individualDamagePokeballs_;
      result.teamDamagePokeballs_ = teamDamagePokeballs_;
      result.gymOwnershipPokeballs_ = gymOwnershipPokeballs_;
      result.basePokeballs_ = basePokeballs_;
      result.bluePercentage_ = bluePercentage_;
      result.redPercentage_ = redPercentage_;
      result.yellowPercentage_ = yellowPercentage_;
      result.bonusItemMultiplier_ = bonusItemMultiplier_;
      result.highestFriendshipMilestone_ = highestFriendshipMilestone_;
      result.highestFriendshipPokeballs_ = highestFriendshipPokeballs_;
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
      if (other instanceof POGOProtos.Data.Raid.Participation) {
        return mergeFrom((POGOProtos.Data.Raid.Participation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(POGOProtos.Data.Raid.Participation other) {
      if (other == POGOProtos.Data.Raid.Participation.getDefaultInstance()) return this;
      if (other.getIndividualDamagePokeballs() != 0) {
        setIndividualDamagePokeballs(other.getIndividualDamagePokeballs());
      }
      if (other.getTeamDamagePokeballs() != 0) {
        setTeamDamagePokeballs(other.getTeamDamagePokeballs());
      }
      if (other.getGymOwnershipPokeballs() != 0) {
        setGymOwnershipPokeballs(other.getGymOwnershipPokeballs());
      }
      if (other.getBasePokeballs() != 0) {
        setBasePokeballs(other.getBasePokeballs());
      }
      if (other.getBluePercentage() != 0D) {
        setBluePercentage(other.getBluePercentage());
      }
      if (other.getRedPercentage() != 0D) {
        setRedPercentage(other.getRedPercentage());
      }
      if (other.getYellowPercentage() != 0D) {
        setYellowPercentage(other.getYellowPercentage());
      }
      if (other.getBonusItemMultiplier() != 0F) {
        setBonusItemMultiplier(other.getBonusItemMultiplier());
      }
      if (other.highestFriendshipMilestone_ != 0) {
        setHighestFriendshipMilestoneValue(other.getHighestFriendshipMilestoneValue());
      }
      if (other.getHighestFriendshipPokeballs() != 0) {
        setHighestFriendshipPokeballs(other.getHighestFriendshipPokeballs());
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
      POGOProtos.Data.Raid.Participation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (POGOProtos.Data.Raid.Participation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int individualDamagePokeballs_ ;
    /**
     * <code>int32 individual_damage_pokeballs = 1;</code>
     * @return The individualDamagePokeballs.
     */
    public int getIndividualDamagePokeballs() {
      return individualDamagePokeballs_;
    }
    /**
     * <code>int32 individual_damage_pokeballs = 1;</code>
     * @param value The individualDamagePokeballs to set.
     * @return This builder for chaining.
     */
    public Builder setIndividualDamagePokeballs(int value) {
      
      individualDamagePokeballs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 individual_damage_pokeballs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIndividualDamagePokeballs() {
      
      individualDamagePokeballs_ = 0;
      onChanged();
      return this;
    }

    private int teamDamagePokeballs_ ;
    /**
     * <code>int32 team_damage_pokeballs = 2;</code>
     * @return The teamDamagePokeballs.
     */
    public int getTeamDamagePokeballs() {
      return teamDamagePokeballs_;
    }
    /**
     * <code>int32 team_damage_pokeballs = 2;</code>
     * @param value The teamDamagePokeballs to set.
     * @return This builder for chaining.
     */
    public Builder setTeamDamagePokeballs(int value) {
      
      teamDamagePokeballs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 team_damage_pokeballs = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeamDamagePokeballs() {
      
      teamDamagePokeballs_ = 0;
      onChanged();
      return this;
    }

    private int gymOwnershipPokeballs_ ;
    /**
     * <code>int32 gym_ownership_pokeballs = 3;</code>
     * @return The gymOwnershipPokeballs.
     */
    public int getGymOwnershipPokeballs() {
      return gymOwnershipPokeballs_;
    }
    /**
     * <code>int32 gym_ownership_pokeballs = 3;</code>
     * @param value The gymOwnershipPokeballs to set.
     * @return This builder for chaining.
     */
    public Builder setGymOwnershipPokeballs(int value) {
      
      gymOwnershipPokeballs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gym_ownership_pokeballs = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGymOwnershipPokeballs() {
      
      gymOwnershipPokeballs_ = 0;
      onChanged();
      return this;
    }

    private int basePokeballs_ ;
    /**
     * <code>int32 base_pokeballs = 4;</code>
     * @return The basePokeballs.
     */
    public int getBasePokeballs() {
      return basePokeballs_;
    }
    /**
     * <code>int32 base_pokeballs = 4;</code>
     * @param value The basePokeballs to set.
     * @return This builder for chaining.
     */
    public Builder setBasePokeballs(int value) {
      
      basePokeballs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 base_pokeballs = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBasePokeballs() {
      
      basePokeballs_ = 0;
      onChanged();
      return this;
    }

    private double bluePercentage_ ;
    /**
     * <code>double blue_percentage = 5;</code>
     * @return The bluePercentage.
     */
    public double getBluePercentage() {
      return bluePercentage_;
    }
    /**
     * <code>double blue_percentage = 5;</code>
     * @param value The bluePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setBluePercentage(double value) {
      
      bluePercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double blue_percentage = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBluePercentage() {
      
      bluePercentage_ = 0D;
      onChanged();
      return this;
    }

    private double redPercentage_ ;
    /**
     * <code>double red_percentage = 6;</code>
     * @return The redPercentage.
     */
    public double getRedPercentage() {
      return redPercentage_;
    }
    /**
     * <code>double red_percentage = 6;</code>
     * @param value The redPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setRedPercentage(double value) {
      
      redPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double red_percentage = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRedPercentage() {
      
      redPercentage_ = 0D;
      onChanged();
      return this;
    }

    private double yellowPercentage_ ;
    /**
     * <code>double yellow_percentage = 7;</code>
     * @return The yellowPercentage.
     */
    public double getYellowPercentage() {
      return yellowPercentage_;
    }
    /**
     * <code>double yellow_percentage = 7;</code>
     * @param value The yellowPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setYellowPercentage(double value) {
      
      yellowPercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double yellow_percentage = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearYellowPercentage() {
      
      yellowPercentage_ = 0D;
      onChanged();
      return this;
    }

    private float bonusItemMultiplier_ ;
    /**
     * <code>float bonus_item_multiplier = 8;</code>
     * @return The bonusItemMultiplier.
     */
    public float getBonusItemMultiplier() {
      return bonusItemMultiplier_;
    }
    /**
     * <code>float bonus_item_multiplier = 8;</code>
     * @param value The bonusItemMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setBonusItemMultiplier(float value) {
      
      bonusItemMultiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bonus_item_multiplier = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearBonusItemMultiplier() {
      
      bonusItemMultiplier_ = 0F;
      onChanged();
      return this;
    }

    private int highestFriendshipMilestone_ = 0;
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
     * @return The enum numeric value on the wire for highestFriendshipMilestone.
     */
    public int getHighestFriendshipMilestoneValue() {
      return highestFriendshipMilestone_;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
     * @param value The enum numeric value on the wire for highestFriendshipMilestone to set.
     * @return This builder for chaining.
     */
    public Builder setHighestFriendshipMilestoneValue(int value) {
      highestFriendshipMilestone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
     * @return The highestFriendshipMilestone.
     */
    public POGOProtos.Enums.FriendshipLevelMilestone getHighestFriendshipMilestone() {
      @SuppressWarnings("deprecation")
      POGOProtos.Enums.FriendshipLevelMilestone result = POGOProtos.Enums.FriendshipLevelMilestone.valueOf(highestFriendshipMilestone_);
      return result == null ? POGOProtos.Enums.FriendshipLevelMilestone.UNRECOGNIZED : result;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
     * @param value The highestFriendshipMilestone to set.
     * @return This builder for chaining.
     */
    public Builder setHighestFriendshipMilestone(POGOProtos.Enums.FriendshipLevelMilestone value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      highestFriendshipMilestone_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.POGOProtos.Enums.FriendshipLevelMilestone highest_friendship_milestone = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighestFriendshipMilestone() {
      
      highestFriendshipMilestone_ = 0;
      onChanged();
      return this;
    }

    private int highestFriendshipPokeballs_ ;
    /**
     * <code>int32 highest_friendship_pokeballs = 10;</code>
     * @return The highestFriendshipPokeballs.
     */
    public int getHighestFriendshipPokeballs() {
      return highestFriendshipPokeballs_;
    }
    /**
     * <code>int32 highest_friendship_pokeballs = 10;</code>
     * @param value The highestFriendshipPokeballs to set.
     * @return This builder for chaining.
     */
    public Builder setHighestFriendshipPokeballs(int value) {
      
      highestFriendshipPokeballs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 highest_friendship_pokeballs = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearHighestFriendshipPokeballs() {
      
      highestFriendshipPokeballs_ = 0;
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


    // @@protoc_insertion_point(builder_scope:POGOProtos.Data.Raid.Participation)
  }

  // @@protoc_insertion_point(class_scope:POGOProtos.Data.Raid.Participation)
  private static final POGOProtos.Data.Raid.Participation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new POGOProtos.Data.Raid.Participation();
  }

  public static POGOProtos.Data.Raid.Participation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Participation>
      PARSER = new com.google.protobuf.AbstractParser<Participation>() {
    @java.lang.Override
    public Participation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Participation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Participation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Participation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public POGOProtos.Data.Raid.Participation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

