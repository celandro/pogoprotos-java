// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/QuestEncounterResponse.proto

package POGOProtos.Networking.Responses;

public interface QuestEncounterResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.QuestEncounterResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.QuestEncounterResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.QuestEncounterResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.QuestEncounterResponse.Result getResult();

  /**
   * <code>.POGOProtos.Map.Pokemon.WildPokemon pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Map.Pokemon.WildPokemon pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Map.Pokemon.WildPokemon getPokemon();
  /**
   * <code>.POGOProtos.Map.Pokemon.WildPokemon pokemon = 2;</code>
   */
  POGOProtos.Map.Pokemon.WildPokemonOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Data.Capture.CaptureProbability capture_probability = 3;</code>
   * @return Whether the captureProbability field is set.
   */
  boolean hasCaptureProbability();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureProbability capture_probability = 3;</code>
   * @return The captureProbability.
   */
  POGOProtos.Data.Capture.CaptureProbability getCaptureProbability();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureProbability capture_probability = 3;</code>
   */
  POGOProtos.Data.Capture.CaptureProbabilityOrBuilder getCaptureProbabilityOrBuilder();

  /**
   * <code>.POGOProtos.Inventory.Item.ItemId active_item = 4;</code>
   * @return The enum numeric value on the wire for activeItem.
   */
  int getActiveItemValue();
  /**
   * <code>.POGOProtos.Inventory.Item.ItemId active_item = 4;</code>
   * @return The activeItem.
   */
  POGOProtos.Inventory.Item.ItemId getActiveItem();
}