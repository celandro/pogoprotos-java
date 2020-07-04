// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface AddFortModifierProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AddFortModifierProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
   * @return The enum numeric value on the wire for modifierType.
   */
  int getModifierTypeValue();
  /**
   * <code>.POGOProtos.Rpc.Item modifier_type = 1;</code>
   * @return The modifierType.
   */
  POGOProtos.Rpc.Item getModifierType();

  /**
   * <code>string fort_id = 2;</code>
   * @return The fortId.
   */
  java.lang.String getFortId();
  /**
   * <code>string fort_id = 2;</code>
   * @return The bytes for fortId.
   */
  com.google.protobuf.ByteString
      getFortIdBytes();

  /**
   * <code>double player_lat_degrees = 3;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 4;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();
}
