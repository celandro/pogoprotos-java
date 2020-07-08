// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GymGetInfoMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface GymGetInfoMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.GymGetInfoMessage)
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
   * <code>double player_lat_degrees = 2;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 3;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();

  /**
   * <code>double gym_lat_degrees = 4;</code>
   * @return The gymLatDegrees.
   */
  double getGymLatDegrees();

  /**
   * <code>double gym_lng_degrees = 5;</code>
   * @return The gymLngDegrees.
   */
  double getGymLngDegrees();

  /**
   * <code>string inviter_id = 6;</code>
   * @return The inviterId.
   */
  java.lang.String getInviterId();
  /**
   * <code>string inviter_id = 6;</code>
   * @return The bytes for inviterId.
   */
  com.google.protobuf.ByteString
      getInviterIdBytes();
}