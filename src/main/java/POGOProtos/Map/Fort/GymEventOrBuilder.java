// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/Fort/GymEvent.proto

package POGOProtos.Map.Fort;

public interface GymEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Map.Fort.GymEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string trainer = 1;</code>
   * @return The trainer.
   */
  java.lang.String getTrainer();
  /**
   * <code>string trainer = 1;</code>
   * @return The bytes for trainer.
   */
  com.google.protobuf.ByteString
      getTrainerBytes();

  /**
   * <code>int64 timestamp_ms = 2;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();

  /**
   * <code>.POGOProtos.Map.Fort.GymEvent.Event event = 3;</code>
   * @return The enum numeric value on the wire for event.
   */
  int getEventValue();
  /**
   * <code>.POGOProtos.Map.Fort.GymEvent.Event event = 3;</code>
   * @return The event.
   */
  POGOProtos.Map.Fort.GymEvent.Event getEvent();

  /**
   * <code>int32 pokedex_id = 4;</code>
   * @return The pokedexId.
   */
  int getPokedexId();

  /**
   * <code>fixed64 pokemon_id = 5;</code>
   * @return The pokemonId.
   */
  long getPokemonId();
}
