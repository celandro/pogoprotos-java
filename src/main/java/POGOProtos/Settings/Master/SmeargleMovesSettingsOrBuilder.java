// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/SmeargleMovesSettings.proto

package POGOProtos.Settings.Master;

public interface SmeargleMovesSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.SmeargleMovesSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove quick_moves = 1;</code>
   * @return A list containing the quickMoves.
   */
  java.util.List<POGOProtos.Enums.PokemonMove> getQuickMovesList();
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove quick_moves = 1;</code>
   * @return The count of quickMoves.
   */
  int getQuickMovesCount();
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove quick_moves = 1;</code>
   * @param index The index of the element to return.
   * @return The quickMoves at the given index.
   */
  POGOProtos.Enums.PokemonMove getQuickMoves(int index);
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove quick_moves = 1;</code>
   * @return A list containing the enum numeric values on the wire for quickMoves.
   */
  java.util.List<java.lang.Integer>
  getQuickMovesValueList();
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove quick_moves = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of quickMoves at the given index.
   */
  int getQuickMovesValue(int index);

  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove cinematic_moves = 2;</code>
   * @return A list containing the cinematicMoves.
   */
  java.util.List<POGOProtos.Enums.PokemonMove> getCinematicMovesList();
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove cinematic_moves = 2;</code>
   * @return The count of cinematicMoves.
   */
  int getCinematicMovesCount();
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove cinematic_moves = 2;</code>
   * @param index The index of the element to return.
   * @return The cinematicMoves at the given index.
   */
  POGOProtos.Enums.PokemonMove getCinematicMoves(int index);
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove cinematic_moves = 2;</code>
   * @return A list containing the enum numeric values on the wire for cinematicMoves.
   */
  java.util.List<java.lang.Integer>
  getCinematicMovesValueList();
  /**
   * <code>repeated .POGOProtos.Enums.PokemonMove cinematic_moves = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of cinematicMoves at the given index.
   */
  int getCinematicMovesValue(int index);
}