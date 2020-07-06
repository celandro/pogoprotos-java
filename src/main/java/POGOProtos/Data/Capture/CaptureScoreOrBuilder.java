// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Capture/CaptureScore.proto

package POGOProtos.Data.Capture;

public interface CaptureScoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Capture.CaptureScore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Enums.ActivityType activity_type = 1;</code>
   * @return A list containing the activityType.
   */
  java.util.List<POGOProtos.Enums.ActivityType> getActivityTypeList();
  /**
   * <code>repeated .POGOProtos.Enums.ActivityType activity_type = 1;</code>
   * @return The count of activityType.
   */
  int getActivityTypeCount();
  /**
   * <code>repeated .POGOProtos.Enums.ActivityType activity_type = 1;</code>
   * @param index The index of the element to return.
   * @return The activityType at the given index.
   */
  POGOProtos.Enums.ActivityType getActivityType(int index);
  /**
   * <code>repeated .POGOProtos.Enums.ActivityType activity_type = 1;</code>
   * @return A list containing the enum numeric values on the wire for activityType.
   */
  java.util.List<java.lang.Integer>
  getActivityTypeValueList();
  /**
   * <code>repeated .POGOProtos.Enums.ActivityType activity_type = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of activityType at the given index.
   */
  int getActivityTypeValue(int index);

  /**
   * <code>repeated int32 exp = 2;</code>
   * @return A list containing the exp.
   */
  java.util.List<java.lang.Integer> getExpList();
  /**
   * <code>repeated int32 exp = 2;</code>
   * @return The count of exp.
   */
  int getExpCount();
  /**
   * <code>repeated int32 exp = 2;</code>
   * @param index The index of the element to return.
   * @return The exp at the given index.
   */
  int getExp(int index);

  /**
   * <code>repeated int32 candy = 3;</code>
   * @return A list containing the candy.
   */
  java.util.List<java.lang.Integer> getCandyList();
  /**
   * <code>repeated int32 candy = 3;</code>
   * @return The count of candy.
   */
  int getCandyCount();
  /**
   * <code>repeated int32 candy = 3;</code>
   * @param index The index of the element to return.
   * @return The candy at the given index.
   */
  int getCandy(int index);

  /**
   * <code>repeated int32 stardust = 4;</code>
   * @return A list containing the stardust.
   */
  java.util.List<java.lang.Integer> getStardustList();
  /**
   * <code>repeated int32 stardust = 4;</code>
   * @return The count of stardust.
   */
  int getStardustCount();
  /**
   * <code>repeated int32 stardust = 4;</code>
   * @param index The index of the element to return.
   * @return The stardust at the given index.
   */
  int getStardust(int index);
}
