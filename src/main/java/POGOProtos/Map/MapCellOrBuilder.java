// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Map/MapCell.proto

package POGOProtos.Map;

public interface MapCellOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Map.MapCell)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * S2 geographic area that the cell covers (http://s2map.com/) (https://code.google.com/archive/p/s2-geometry-library/)
   * </pre>
   *
   * <code>uint64 s2_cell_id = 1;</code>
   * @return The s2CellId.
   */
  long getS2CellId();

  /**
   * <code>int64 current_timestamp_ms = 2;</code>
   * @return The currentTimestampMs.
   */
  long getCurrentTimestampMs();

  /**
   * <code>repeated .POGOProtos.Map.Fort.FortData forts = 3;</code>
   */
  java.util.List<POGOProtos.Map.Fort.FortData> 
      getFortsList();
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortData forts = 3;</code>
   */
  POGOProtos.Map.Fort.FortData getForts(int index);
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortData forts = 3;</code>
   */
  int getFortsCount();
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortData forts = 3;</code>
   */
  java.util.List<? extends POGOProtos.Map.Fort.FortDataOrBuilder> 
      getFortsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortData forts = 3;</code>
   */
  POGOProtos.Map.Fort.FortDataOrBuilder getFortsOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint spawn_points = 4;</code>
   */
  java.util.List<POGOProtos.Map.SpawnPoint> 
      getSpawnPointsList();
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint spawn_points = 4;</code>
   */
  POGOProtos.Map.SpawnPoint getSpawnPoints(int index);
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint spawn_points = 4;</code>
   */
  int getSpawnPointsCount();
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint spawn_points = 4;</code>
   */
  java.util.List<? extends POGOProtos.Map.SpawnPointOrBuilder> 
      getSpawnPointsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint spawn_points = 4;</code>
   */
  POGOProtos.Map.SpawnPointOrBuilder getSpawnPointsOrBuilder(
      int index);

  /**
   * <code>repeated string deleted_objects = 6;</code>
   * @return A list containing the deletedObjects.
   */
  java.util.List<java.lang.String>
      getDeletedObjectsList();
  /**
   * <code>repeated string deleted_objects = 6;</code>
   * @return The count of deletedObjects.
   */
  int getDeletedObjectsCount();
  /**
   * <code>repeated string deleted_objects = 6;</code>
   * @param index The index of the element to return.
   * @return The deletedObjects at the given index.
   */
  java.lang.String getDeletedObjects(int index);
  /**
   * <code>repeated string deleted_objects = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the deletedObjects at the given index.
   */
  com.google.protobuf.ByteString
      getDeletedObjectsBytes(int index);

  /**
   * <code>bool is_truncated_list = 7;</code>
   * @return The isTruncatedList.
   */
  boolean getIsTruncatedList();

  /**
   * <code>repeated .POGOProtos.Map.Fort.FortSummary fort_summaries = 8;</code>
   */
  java.util.List<POGOProtos.Map.Fort.FortSummary> 
      getFortSummariesList();
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortSummary fort_summaries = 8;</code>
   */
  POGOProtos.Map.Fort.FortSummary getFortSummaries(int index);
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortSummary fort_summaries = 8;</code>
   */
  int getFortSummariesCount();
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortSummary fort_summaries = 8;</code>
   */
  java.util.List<? extends POGOProtos.Map.Fort.FortSummaryOrBuilder> 
      getFortSummariesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Map.Fort.FortSummary fort_summaries = 8;</code>
   */
  POGOProtos.Map.Fort.FortSummaryOrBuilder getFortSummariesOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint decimated_spawn_points = 9;</code>
   */
  java.util.List<POGOProtos.Map.SpawnPoint> 
      getDecimatedSpawnPointsList();
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint decimated_spawn_points = 9;</code>
   */
  POGOProtos.Map.SpawnPoint getDecimatedSpawnPoints(int index);
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint decimated_spawn_points = 9;</code>
   */
  int getDecimatedSpawnPointsCount();
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint decimated_spawn_points = 9;</code>
   */
  java.util.List<? extends POGOProtos.Map.SpawnPointOrBuilder> 
      getDecimatedSpawnPointsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Map.SpawnPoint decimated_spawn_points = 9;</code>
   */
  POGOProtos.Map.SpawnPointOrBuilder getDecimatedSpawnPointsOrBuilder(
      int index);

  /**
   * <pre>
   * Pokemon within 2 steps or less.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.WildPokemon wild_pokemons = 5;</code>
   */
  java.util.List<POGOProtos.Map.Pokemon.WildPokemon> 
      getWildPokemonsList();
  /**
   * <pre>
   * Pokemon within 2 steps or less.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.WildPokemon wild_pokemons = 5;</code>
   */
  POGOProtos.Map.Pokemon.WildPokemon getWildPokemons(int index);
  /**
   * <pre>
   * Pokemon within 2 steps or less.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.WildPokemon wild_pokemons = 5;</code>
   */
  int getWildPokemonsCount();
  /**
   * <pre>
   * Pokemon within 2 steps or less.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.WildPokemon wild_pokemons = 5;</code>
   */
  java.util.List<? extends POGOProtos.Map.Pokemon.WildPokemonOrBuilder> 
      getWildPokemonsOrBuilderList();
  /**
   * <pre>
   * Pokemon within 2 steps or less.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.WildPokemon wild_pokemons = 5;</code>
   */
  POGOProtos.Map.Pokemon.WildPokemonOrBuilder getWildPokemonsOrBuilder(
      int index);

  /**
   * <pre>
   * Pokemon within 1 step or none.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.MapPokemon catchable_pokemons = 10;</code>
   */
  java.util.List<POGOProtos.Map.Pokemon.MapPokemon> 
      getCatchablePokemonsList();
  /**
   * <pre>
   * Pokemon within 1 step or none.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.MapPokemon catchable_pokemons = 10;</code>
   */
  POGOProtos.Map.Pokemon.MapPokemon getCatchablePokemons(int index);
  /**
   * <pre>
   * Pokemon within 1 step or none.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.MapPokemon catchable_pokemons = 10;</code>
   */
  int getCatchablePokemonsCount();
  /**
   * <pre>
   * Pokemon within 1 step or none.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.MapPokemon catchable_pokemons = 10;</code>
   */
  java.util.List<? extends POGOProtos.Map.Pokemon.MapPokemonOrBuilder> 
      getCatchablePokemonsOrBuilderList();
  /**
   * <pre>
   * Pokemon within 1 step or none.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.MapPokemon catchable_pokemons = 10;</code>
   */
  POGOProtos.Map.Pokemon.MapPokemonOrBuilder getCatchablePokemonsOrBuilder(
      int index);

  /**
   * <pre>
   * Pokemon farther away than 2 steps, but still in the area.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.NearbyPokemon nearby_pokemons = 11;</code>
   */
  java.util.List<POGOProtos.Map.Pokemon.NearbyPokemon> 
      getNearbyPokemonsList();
  /**
   * <pre>
   * Pokemon farther away than 2 steps, but still in the area.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.NearbyPokemon nearby_pokemons = 11;</code>
   */
  POGOProtos.Map.Pokemon.NearbyPokemon getNearbyPokemons(int index);
  /**
   * <pre>
   * Pokemon farther away than 2 steps, but still in the area.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.NearbyPokemon nearby_pokemons = 11;</code>
   */
  int getNearbyPokemonsCount();
  /**
   * <pre>
   * Pokemon farther away than 2 steps, but still in the area.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.NearbyPokemon nearby_pokemons = 11;</code>
   */
  java.util.List<? extends POGOProtos.Map.Pokemon.NearbyPokemonOrBuilder> 
      getNearbyPokemonsOrBuilderList();
  /**
   * <pre>
   * Pokemon farther away than 2 steps, but still in the area.
   * </pre>
   *
   * <code>repeated .POGOProtos.Map.Pokemon.NearbyPokemon nearby_pokemons = 11;</code>
   */
  POGOProtos.Map.Pokemon.NearbyPokemonOrBuilder getNearbyPokemonsOrBuilder(
      int index);
}