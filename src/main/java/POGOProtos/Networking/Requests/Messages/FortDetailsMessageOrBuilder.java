// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/FortDetailsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface FortDetailsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.FortDetailsMessage)
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
   * <code>double latitude = 2;</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <code>double longitude = 3;</code>
   * @return The longitude.
   */
  double getLongitude();
}
