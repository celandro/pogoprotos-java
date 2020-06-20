// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Inventory/EggIncubator.proto

package POGOProtos.Inventory;

public interface EggIncubatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Inventory.EggIncubator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
   * @return The enum numeric value on the wire for itemId.
   */
  int getItemIdValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId item_id = 2;</code>
   * @return The itemId.
   */
  POGOProtos.Inventory.Item.ItemId getItemId();

  /**
   * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
   * @return The enum numeric value on the wire for incubatorType.
   */
  int getIncubatorTypeValue();
  /**
   * <code>.POGOProtos.Inventory.EggIncubatorType incubator_type = 3;</code>
   * @return The incubatorType.
   */
  POGOProtos.Inventory.EggIncubatorType getIncubatorType();

  /**
   * <code>int32 uses_remaining = 4;</code>
   * @return The usesRemaining.
   */
  int getUsesRemaining();

  /**
   * <code>fixed64 pokemon_id = 5;</code>
   * @return The pokemonId.
   */
  long getPokemonId();

  /**
   * <code>double start_km_walked = 6;</code>
   * @return The startKmWalked.
   */
  double getStartKmWalked();

  /**
   * <code>double target_km_walked = 7;</code>
   * @return The targetKmWalked.
   */
  double getTargetKmWalked();
}
