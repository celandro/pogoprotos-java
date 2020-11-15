// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/EncounterTutorialCompleteResponse.proto

package POGOProtos.Networking.Responses;

public interface EncounterTutorialCompleteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.EncounterTutorialCompleteResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
   * @return Whether the pokemonData field is set.
   */
  boolean hasPokemonData();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
   * @return The pokemonData.
   */
  POGOProtos.Data.PokemonData getPokemonData();
  /**
   * <code>.POGOProtos.Data.PokemonData pokemon_data = 2;</code>
   */
  POGOProtos.Data.PokemonDataOrBuilder getPokemonDataOrBuilder();

  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
   * @return Whether the captureAward field is set.
   */
  boolean hasCaptureAward();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
   * @return The captureAward.
   */
  POGOProtos.Data.Capture.CaptureAward getCaptureAward();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 3;</code>
   */
  POGOProtos.Data.Capture.CaptureAwardOrBuilder getCaptureAwardOrBuilder();
}
