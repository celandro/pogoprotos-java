// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/EquippedBadge.proto

package POGOProtos.Data.Player;

public interface EquippedBadgeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Player.EquippedBadge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.BadgeType badge_type = 1;</code>
   * @return The enum numeric value on the wire for badgeType.
   */
  int getBadgeTypeValue();
  /**
   * <code>.POGOProtos.Enums.BadgeType badge_type = 1;</code>
   * @return The badgeType.
   */
  POGOProtos.Enums.BadgeType getBadgeType();

  /**
   * <code>int32 level = 2;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>int64 next_equip_change_allowed_timestamp_ms = 3;</code>
   * @return The nextEquipChangeAllowedTimestampMs.
   */
  long getNextEquipChangeAllowedTimestampMs();
}