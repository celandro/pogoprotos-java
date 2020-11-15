// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/PokemonTagSettings.proto

package POGOProtos.Settings.Master;

public interface PokemonTagSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.PokemonTagSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 min_player_level_for_pokemon_tagging = 1;</code>
   * @return The minPlayerLevelForPokemonTagging.
   */
  int getMinPlayerLevelForPokemonTagging();

  /**
   * <code>repeated .POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding color_binding = 2;</code>
   */
  java.util.List<POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding> 
      getColorBindingList();
  /**
   * <code>repeated .POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding color_binding = 2;</code>
   */
  POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding getColorBinding(int index);
  /**
   * <code>repeated .POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding color_binding = 2;</code>
   */
  int getColorBindingCount();
  /**
   * <code>repeated .POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding color_binding = 2;</code>
   */
  java.util.List<? extends POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBindingOrBuilder> 
      getColorBindingOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBinding color_binding = 2;</code>
   */
  POGOProtos.Settings.Master.PokemonTagSettings.PokemonTagColorBindingOrBuilder getColorBindingOrBuilder(
      int index);

  /**
   * <code>int32 max_num_tags_allowed = 3;</code>
   * @return The maxNumTagsAllowed.
   */
  int getMaxNumTagsAllowed();

  /**
   * <code>int32 tag_name_character_limit = 4;</code>
   * @return The tagNameCharacterLimit.
   */
  int getTagNameCharacterLimit();
}
