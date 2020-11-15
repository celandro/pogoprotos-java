// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/BuddyLevelSettings.proto

package POGOProtos.Settings.Master;

public interface BuddyLevelSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.BuddyLevelSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.BuddyLevel level = 1;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <code>.POGOProtos.Enums.BuddyLevel level = 1;</code>
   * @return The level.
   */
  POGOProtos.Enums.BuddyLevel getLevel();

  /**
   * <code>int32 min_non_cumulative_points_required = 2;</code>
   * @return The minNonCumulativePointsRequired.
   */
  int getMinNonCumulativePointsRequired();

  /**
   * <code>repeated .POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait unlocked_traits = 3;</code>
   * @return A list containing the unlockedTraits.
   */
  java.util.List<POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait> getUnlockedTraitsList();
  /**
   * <code>repeated .POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait unlocked_traits = 3;</code>
   * @return The count of unlockedTraits.
   */
  int getUnlockedTraitsCount();
  /**
   * <code>repeated .POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait unlocked_traits = 3;</code>
   * @param index The index of the element to return.
   * @return The unlockedTraits at the given index.
   */
  POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait getUnlockedTraits(int index);
  /**
   * <code>repeated .POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait unlocked_traits = 3;</code>
   * @return A list containing the enum numeric values on the wire for unlockedTraits.
   */
  java.util.List<java.lang.Integer>
  getUnlockedTraitsValueList();
  /**
   * <code>repeated .POGOProtos.Settings.Master.BuddyLevelSettings.BuddyTrait unlocked_traits = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of unlockedTraits at the given index.
   */
  int getUnlockedTraitsValue(int index);
}
