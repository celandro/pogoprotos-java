// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PokedexEntryProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokedexEntryProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 pokedex_entry_number = 1;</code>
   * @return The pokedexEntryNumber.
   */
  int getPokedexEntryNumber();

  /**
   * <code>int32 times_encountered = 2;</code>
   * @return The timesEncountered.
   */
  int getTimesEncountered();

  /**
   * <code>int32 times_captured = 3;</code>
   * @return The timesCaptured.
   */
  int getTimesCaptured();

  /**
   * <code>int32 evolution_stone_pieces = 4;</code>
   * @return The evolutionStonePieces.
   */
  int getEvolutionStonePieces();

  /**
   * <code>int32 evolution_stones = 5;</code>
   * @return The evolutionStones.
   */
  int getEvolutionStones();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume captured_costumes = 6;</code>
   * @return A list containing the capturedCostumes.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Costume> getCapturedCostumesList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume captured_costumes = 6;</code>
   * @return The count of capturedCostumes.
   */
  int getCapturedCostumesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume captured_costumes = 6;</code>
   * @param index The index of the element to return.
   * @return The capturedCostumes at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Costume getCapturedCostumes(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume captured_costumes = 6;</code>
   * @return A list containing the enum numeric values on the wire for capturedCostumes.
   */
  java.util.List<java.lang.Integer>
  getCapturedCostumesValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume captured_costumes = 6;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capturedCostumes at the given index.
   */
  int getCapturedCostumesValue(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_forms = 7;</code>
   * @return A list containing the capturedForms.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Form> getCapturedFormsList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_forms = 7;</code>
   * @return The count of capturedForms.
   */
  int getCapturedFormsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_forms = 7;</code>
   * @param index The index of the element to return.
   * @return The capturedForms at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Form getCapturedForms(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_forms = 7;</code>
   * @return A list containing the enum numeric values on the wire for capturedForms.
   */
  java.util.List<java.lang.Integer>
  getCapturedFormsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_forms = 7;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capturedForms at the given index.
   */
  int getCapturedFormsValue(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender captured_genders = 8;</code>
   * @return A list containing the capturedGenders.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Gender> getCapturedGendersList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender captured_genders = 8;</code>
   * @return The count of capturedGenders.
   */
  int getCapturedGendersCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender captured_genders = 8;</code>
   * @param index The index of the element to return.
   * @return The capturedGenders at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Gender getCapturedGenders(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender captured_genders = 8;</code>
   * @return A list containing the enum numeric values on the wire for capturedGenders.
   */
  java.util.List<java.lang.Integer>
  getCapturedGendersValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender captured_genders = 8;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capturedGenders at the given index.
   */
  int getCapturedGendersValue(int index);

  /**
   * <code>bool captured_shiny = 9;</code>
   * @return The capturedShiny.
   */
  boolean getCapturedShiny();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume encountered_costumes = 10;</code>
   * @return A list containing the encounteredCostumes.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Costume> getEncounteredCostumesList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume encountered_costumes = 10;</code>
   * @return The count of encounteredCostumes.
   */
  int getEncounteredCostumesCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume encountered_costumes = 10;</code>
   * @param index The index of the element to return.
   * @return The encounteredCostumes at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Costume getEncounteredCostumes(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume encountered_costumes = 10;</code>
   * @return A list containing the enum numeric values on the wire for encounteredCostumes.
   */
  java.util.List<java.lang.Integer>
  getEncounteredCostumesValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Costume encountered_costumes = 10;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of encounteredCostumes at the given index.
   */
  int getEncounteredCostumesValue(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form encountered_forms = 11;</code>
   * @return A list containing the encounteredForms.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Form> getEncounteredFormsList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form encountered_forms = 11;</code>
   * @return The count of encounteredForms.
   */
  int getEncounteredFormsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form encountered_forms = 11;</code>
   * @param index The index of the element to return.
   * @return The encounteredForms at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Form getEncounteredForms(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form encountered_forms = 11;</code>
   * @return A list containing the enum numeric values on the wire for encounteredForms.
   */
  java.util.List<java.lang.Integer>
  getEncounteredFormsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form encountered_forms = 11;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of encounteredForms at the given index.
   */
  int getEncounteredFormsValue(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender encountered_genders = 12;</code>
   * @return A list containing the encounteredGenders.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Gender> getEncounteredGendersList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender encountered_genders = 12;</code>
   * @return The count of encounteredGenders.
   */
  int getEncounteredGendersCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender encountered_genders = 12;</code>
   * @param index The index of the element to return.
   * @return The encounteredGenders at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Gender getEncounteredGenders(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender encountered_genders = 12;</code>
   * @return A list containing the enum numeric values on the wire for encounteredGenders.
   */
  java.util.List<java.lang.Integer>
  getEncounteredGendersValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Gender encountered_genders = 12;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of encounteredGenders at the given index.
   */
  int getEncounteredGendersValue(int index);

  /**
   * <code>bool encountered_shiny = 13;</code>
   * @return The encounteredShiny.
   */
  boolean getEncounteredShiny();

  /**
   * <code>int32 times_lucky_received = 14;</code>
   * @return The timesLuckyReceived.
   */
  int getTimesLuckyReceived();

  /**
   * <code>int32 times_purified = 15;</code>
   * @return The timesPurified.
   */
  int getTimesPurified();

  /**
   * <code>repeated .POGOProtos.Rpc.PokedexEntryProto.TempEvoData temp_evo_data = 16;</code>
   */
  java.util.List<POGOProtos.Rpc.PokedexEntryProto.TempEvoData> 
      getTempEvoDataList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokedexEntryProto.TempEvoData temp_evo_data = 16;</code>
   */
  POGOProtos.Rpc.PokedexEntryProto.TempEvoData getTempEvoData(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokedexEntryProto.TempEvoData temp_evo_data = 16;</code>
   */
  int getTempEvoDataCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokedexEntryProto.TempEvoData temp_evo_data = 16;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokedexEntryProto.TempEvoDataOrBuilder> 
      getTempEvoDataOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokedexEntryProto.TempEvoData temp_evo_data = 16;</code>
   */
  POGOProtos.Rpc.PokedexEntryProto.TempEvoDataOrBuilder getTempEvoDataOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_shiny_forms = 17;</code>
   * @return A list containing the capturedShinyForms.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Form> getCapturedShinyFormsList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_shiny_forms = 17;</code>
   * @return The count of capturedShinyForms.
   */
  int getCapturedShinyFormsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_shiny_forms = 17;</code>
   * @param index The index of the element to return.
   * @return The capturedShinyForms at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Form getCapturedShinyForms(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_shiny_forms = 17;</code>
   * @return A list containing the enum numeric values on the wire for capturedShinyForms.
   */
  java.util.List<java.lang.Integer>
  getCapturedShinyFormsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form captured_shiny_forms = 17;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of capturedShinyForms at the given index.
   */
  int getCapturedShinyFormsValue(int index);
}
