// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GymFeedPokemonMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface GymFeedPokemonMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.GymFeedPokemonMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
   * @return The enum numeric value on the wire for item.
   */
  int getItemValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item = 1;</code>
   * @return The item.
   */
  POGOProtos.Inventory.Item.ItemId getItem();

  /**
   * <code>int32 starting_quantity = 2;</code>
   * @return The startingQuantity.
   */
  int getStartingQuantity();

  /**
   * <code>string gym_id = 3;</code>
   * @return The gymId.
   */
  java.lang.String getGymId();
  /**
   * <code>string gym_id = 3;</code>
   * @return The bytes for gymId.
   */
  com.google.protobuf.ByteString
      getGymIdBytes();

  /**
   * <code>fixed64 pokemon_id = 4;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>double player_lat_degrees = 5;</code>
   * @return The playerLatDegrees.
   */
  double getPlayerLatDegrees();

  /**
   * <code>double player_lng_degrees = 6;</code>
   * @return The playerLngDegrees.
   */
  double getPlayerLngDegrees();
}
