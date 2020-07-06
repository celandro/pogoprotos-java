// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/PlatformServerData.proto

package POGOProtos.Data.Telemetry;

public interface PlatformServerDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.PlatformServerData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string telemetry_id = 2;</code>
   * @return The telemetryId.
   */
  java.lang.String getTelemetryId();
  /**
   * <code>string telemetry_id = 2;</code>
   * @return The bytes for telemetryId.
   */
  com.google.protobuf.ByteString
      getTelemetryIdBytes();

  /**
   * <code>string session_id = 3;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 3;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>repeated int32 experiment_ids = 4;</code>
   * @return A list containing the experimentIds.
   */
  java.util.List<java.lang.Integer> getExperimentIdsList();
  /**
   * <code>repeated int32 experiment_ids = 4;</code>
   * @return The count of experimentIds.
   */
  int getExperimentIdsCount();
  /**
   * <code>repeated int32 experiment_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The experimentIds at the given index.
   */
  int getExperimentIds(int index);

  /**
   * <code>string event_request_id = 5;</code>
   * @return The eventRequestId.
   */
  java.lang.String getEventRequestId();
  /**
   * <code>string event_request_id = 5;</code>
   * @return The bytes for eventRequestId.
   */
  com.google.protobuf.ByteString
      getEventRequestIdBytes();

  /**
   * <code>int64 server_timestamp_ms = 6;</code>
   * @return The serverTimestampMs.
   */
  long getServerTimestampMs();
}
