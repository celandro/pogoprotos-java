// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/FortSearchMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface FortSearchMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.FortSearchMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fort_id = 1;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 1;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

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
   * <code>double fort_lat_degrees = 4;</code>
   * @return The fortLatDegrees.
   */
  double getFortLatDegrees();

  /**
   * <code>double fort_lng_degrees = 5;</code>
   * @return The fortLngDegrees.
   */
  double getFortLngDegrees();
}