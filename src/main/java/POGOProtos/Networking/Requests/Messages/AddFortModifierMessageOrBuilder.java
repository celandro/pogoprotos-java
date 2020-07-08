// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/AddFortModifierMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface AddFortModifierMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.AddFortModifierMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId modifier_type = 1;</code>
   * @return The enum numeric value on the wire for modifierType.
   */
  int getModifierTypeValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId modifier_type = 1;</code>
   * @return The modifierType.
   */
  POGOProtos.Inventory.Item.ItemId getModifierType();

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
   * <code>double player_latitude = 3;</code>
   * @return The playerLatitude.
   */
  double getPlayerLatitude();

  /**
   * <code>double player_longitude = 4;</code>
   * @return The playerLongitude.
   */
  double getPlayerLongitude();
}