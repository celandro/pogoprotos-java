// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface WithBadgeTypeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.WithBadgeTypeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @return A list containing the badgeType.
   */
  java.util.List<POGOProtos.Rpc.HoloBadgeType> getBadgeTypeList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @return The count of badgeType.
   */
  int getBadgeTypeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @param index The index of the element to return.
   * @return The badgeType at the given index.
   */
  POGOProtos.Rpc.HoloBadgeType getBadgeType(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @return A list containing the enum numeric values on the wire for badgeType.
   */
  java.util.List<java.lang.Integer>
  getBadgeTypeValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_type = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of badgeType at the given index.
   */
  int getBadgeTypeValue(int index);

  /**
   * <code>int32 badge_rank = 2;</code>
   * @return The badgeRank.
   */
  int getBadgeRank();

  /**
   * <code>int32 amount = 3;</code>
   * @return The amount.
   */
  int getAmount();

  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @return A list containing the badgeTypesToExclude.
   */
  java.util.List<POGOProtos.Rpc.HoloBadgeType> getBadgeTypesToExcludeList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @return The count of badgeTypesToExclude.
   */
  int getBadgeTypesToExcludeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @param index The index of the element to return.
   * @return The badgeTypesToExclude at the given index.
   */
  POGOProtos.Rpc.HoloBadgeType getBadgeTypesToExclude(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @return A list containing the enum numeric values on the wire for badgeTypesToExclude.
   */
  java.util.List<java.lang.Integer>
  getBadgeTypesToExcludeValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.HoloBadgeType badge_types_to_exclude = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of badgeTypesToExclude at the given index.
   */
  int getBadgeTypesToExcludeValue(int index);
}
