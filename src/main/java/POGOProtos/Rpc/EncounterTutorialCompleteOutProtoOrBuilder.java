// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface EncounterTutorialCompleteOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.EncounterTutorialCompleteOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.EncounterTutorialCompleteOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return Whether the pokemon field is set.
   */
  boolean hasPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   * @return The pokemon.
   */
  POGOProtos.Rpc.PokemonProto getPokemon();
  /**
   * <code>.POGOProtos.Rpc.PokemonProto pokemon = 2;</code>
   */
  POGOProtos.Rpc.PokemonProtoOrBuilder getPokemonOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
   * @return Whether the scores field is set.
   */
  boolean hasScores();
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
   * @return The scores.
   */
  POGOProtos.Rpc.CaptureScoreProto getScores();
  /**
   * <code>.POGOProtos.Rpc.CaptureScoreProto scores = 3;</code>
   */
  POGOProtos.Rpc.CaptureScoreProtoOrBuilder getScoresOrBuilder();
}
