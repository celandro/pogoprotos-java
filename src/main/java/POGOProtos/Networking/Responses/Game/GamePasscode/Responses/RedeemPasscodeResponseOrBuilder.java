// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePasscode/Responses/RedeemPasscodeResponse.proto

package POGOProtos.Networking.Responses.Game.GamePasscode.Responses;

public interface RedeemPasscodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.Game.GamePasscode.Responses.RedeemPasscodeResponse.Status getStatus();

  /**
   * <code>string qrcode = 4;</code>
   * @return The qrcode.
   */
  java.lang.String getQrcode();
  /**
   * <code>string qrcode = 4;</code>
   * @return The bytes for qrcode.
   */
  com.google.protobuf.ByteString
      getQrcodeBytes();
}