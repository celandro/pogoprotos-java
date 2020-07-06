// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Social/Responses/UpdateNotificationResponse.proto

package POGOProtos.Networking.Responses.Social.Responses;

public interface UpdateNotificationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Social.Responses.UpdateNotificationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string notification_ids = 1;</code>
   * @return A list containing the notificationIds.
   */
  java.util.List<java.lang.String>
      getNotificationIdsList();
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @return The count of notificationIds.
   */
  int getNotificationIdsCount();
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The notificationIds at the given index.
   */
  java.lang.String getNotificationIds(int index);
  /**
   * <code>repeated string notification_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notificationIds at the given index.
   */
  com.google.protobuf.ByteString
      getNotificationIdsBytes(int index);

  /**
   * <code>repeated int64 create_timestamp_ms = 2;</code>
   * @return A list containing the createTimestampMs.
   */
  java.util.List<java.lang.Long> getCreateTimestampMsList();
  /**
   * <code>repeated int64 create_timestamp_ms = 2;</code>
   * @return The count of createTimestampMs.
   */
  int getCreateTimestampMsCount();
  /**
   * <code>repeated int64 create_timestamp_ms = 2;</code>
   * @param index The index of the element to return.
   * @return The createTimestampMs at the given index.
   */
  long getCreateTimestampMs(int index);

  /**
   * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.POGOProtos.Enums.NotificationState state = 3;</code>
   * @return The state.
   */
  POGOProtos.Enums.NotificationState getState();
}
