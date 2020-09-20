// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ArBuddyMultiplayerSessionTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ArBuddyMultiplayerSessionTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool camera_permission_granted = 1;</code>
   * @return The cameraPermissionGranted.
   */
  boolean getCameraPermissionGranted();

  /**
   * <code>int64 host_time_to_publish_first_map = 2;</code>
   * @return The hostTimeToPublishFirstMap.
   */
  long getHostTimeToPublishFirstMap();

  /**
   * <code>int32 host_number_of_maps_published = 3;</code>
   * @return The hostNumberOfMapsPublished.
   */
  int getHostNumberOfMapsPublished();

  /**
   * <code>bool host_mapping_successful = 4;</code>
   * @return The hostMappingSuccessful.
   */
  boolean getHostMappingSuccessful();

  /**
   * <code>bool lobby_connection_successful = 5;</code>
   * @return The lobbyConnectionSuccessful.
   */
  boolean getLobbyConnectionSuccessful();

  /**
   * <code>int64 time_from_start_of_session_to_sync = 6;</code>
   * @return The timeFromStartOfSessionToSync.
   */
  long getTimeFromStartOfSessionToSync();

  /**
   * <code>bool sync_successful = 7;</code>
   * @return The syncSuccessful.
   */
  boolean getSyncSuccessful();

  /**
   * <code>int64 session_length = 8;</code>
   * @return The sessionLength.
   */
  long getSessionLength();

  /**
   * <code>int32 crash_count = 9;</code>
   * @return The crashCount.
   */
  int getCrashCount();

  /**
   * <code>int64 duration_spent_in_lobby = 10;</code>
   * @return The durationSpentInLobby.
   */
  long getDurationSpentInLobby();

  /**
   * <code>int64 time_from_invite_to_lobby = 11;</code>
   * @return The timeFromInviteToLobby.
   */
  long getTimeFromInviteToLobby();

  /**
   * <code>int64 time_from_lobby_to_session = 12;</code>
   * @return The timeFromLobbyToSession.
   */
  long getTimeFromLobbyToSession();

  /**
   * <code>int64 length_of_ar_session = 13;</code>
   * @return The lengthOfArSession.
   */
  long getLengthOfArSession();

  /**
   * <code>int32 players_connected = 14;</code>
   * @return The playersConnected.
   */
  int getPlayersConnected();

  /**
   * <code>int32 players_dropped = 15;</code>
   * @return The playersDropped.
   */
  int getPlayersDropped();

  /**
   * <code>int32 num_photos_taken = 16;</code>
   * @return The numPhotosTaken.
   */
  int getNumPhotosTaken();

  /**
   * <code>bool is_host = 17;</code>
   * @return The isHost.
   */
  boolean getIsHost();
}
