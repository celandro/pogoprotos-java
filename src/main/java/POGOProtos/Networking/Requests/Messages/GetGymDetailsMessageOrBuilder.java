// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetGymDetailsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface GetGymDetailsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.GetGymDetailsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string gym_id = 1;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 1;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>double player_latitude = 2;</code>
   * @return The playerLatitude.
   */
  double getPlayerLatitude();

  /**
   * <code>double player_longitude = 3;</code>
   * @return The playerLongitude.
   */
  double getPlayerLongitude();

  /**
   * <code>double gym_latitude = 4;</code>
   * @return The gymLatitude.
   */
  double getGymLatitude();

  /**
   * <code>double gym_longitude = 5;</code>
   * @return The gymLongitude.
   */
  double getGymLongitude();

  /**
   * <code>string client_version = 6;</code>
   * @return The clientVersion.
   */
  java.lang.String getClientVersion();
  /**
   * <code>string client_version = 6;</code>
   * @return The bytes for clientVersion.
   */
  com.google.protobuf.ByteString
      getClientVersionBytes();
}