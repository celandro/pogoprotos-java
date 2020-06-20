// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/CatchPokemonResponse.proto

package POGOProtos.Networking.Responses;

public interface CatchPokemonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.CatchPokemonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.CatchPokemonResponse.CatchStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.CatchPokemonResponse.CatchStatus status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.CatchPokemonResponse.CatchStatus getStatus();

  /**
   * <code>double miss_percent = 2;</code>
   * @return The missPercent.
   */
  double getMissPercent();

  /**
   * <code>fixed64 captured_pokemon_id = 3;</code>
   * @return The capturedPokemonId.
   */
  long getCapturedPokemonId();

  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 4;</code>
   * @return Whether the captureAward field is set.
   */
  boolean hasCaptureAward();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 4;</code>
   * @return The captureAward.
   */
  POGOProtos.Data.Capture.CaptureAward getCaptureAward();
  /**
   * <code>.POGOProtos.Data.Capture.CaptureAward capture_award = 4;</code>
   */
  POGOProtos.Data.Capture.CaptureAwardOrBuilder getCaptureAwardOrBuilder();

  /**
   * <code>.POGOProtos.Networking.Responses.CatchPokemonResponse.CaptureReason capture_reason = 5;</code>
   * @return The enum numeric value on the wire for captureReason.
   */
  int getCaptureReasonValue();
  /**
   * <code>.POGOProtos.Networking.Responses.CatchPokemonResponse.CaptureReason capture_reason = 5;</code>
   * @return The captureReason.
   */
  POGOProtos.Networking.Responses.CatchPokemonResponse.CaptureReason getCaptureReason();

  /**
   * <code>int32 display_pokedex_id = 6;</code>
   * @return The displayPokedexId.
   */
  int getDisplayPokedexId();

  /**
   * <code>int32 throws_remaining = 7;</code>
   * @return The throwsRemaining.
   */
  int getThrowsRemaining();

  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 8;</code>
   * @return Whether the pokemonDisplay field is set.
   */
  boolean hasPokemonDisplay();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 8;</code>
   * @return The pokemonDisplay.
   */
  POGOProtos.Data.PokemonDisplay getPokemonDisplay();
  /**
   * <code>.POGOProtos.Data.PokemonDisplay pokemon_display = 8;</code>
   */
  POGOProtos.Data.PokemonDisplayOrBuilder getPokemonDisplayOrBuilder();
}
