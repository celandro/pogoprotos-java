// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/FortSettings.proto

package POGOProtos.Settings;

public interface FortSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.FortSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double interaction_range_meters = 1;</code>
   * @return The interactionRangeMeters.
   */
  double getInteractionRangeMeters();

  /**
   * <code>int32 max_total_deployed_pokemon = 2;</code>
   * @return The maxTotalDeployedPokemon.
   */
  int getMaxTotalDeployedPokemon();

  /**
   * <code>int32 max_player_deployed_pokemon = 3;</code>
   * @return The maxPlayerDeployedPokemon.
   */
  int getMaxPlayerDeployedPokemon();

  /**
   * <code>double deploy_stamina_multiplier = 4;</code>
   * @return The deployStaminaMultiplier.
   */
  double getDeployStaminaMultiplier();

  /**
   * <code>double deploy_attack_multiplier = 5;</code>
   * @return The deployAttackMultiplier.
   */
  double getDeployAttackMultiplier();

  /**
   * <code>double far_interaction_range_meters = 6;</code>
   * @return The farInteractionRangeMeters.
   */
  double getFarInteractionRangeMeters();

  /**
   * <code>bool disable_gyms = 7;</code>
   * @return The disableGyms.
   */
  boolean getDisableGyms();

  /**
   * <code>int32 max_same_pokemon_at_fort = 8;</code>
   * @return The maxSamePokemonAtFort.
   */
  int getMaxSamePokemonAtFort();

  /**
   * <code>int32 max_player_total_deployed_pokemon = 9;</code>
   * @return The maxPlayerTotalDeployedPokemon.
   */
  int getMaxPlayerTotalDeployedPokemon();

  /**
   * <code>bool enable_hyperlinks_in_poi_descriptions = 10;</code>
   * @return The enableHyperlinksInPoiDescriptions.
   */
  boolean getEnableHyperlinksInPoiDescriptions();

  /**
   * <code>bool enable_right_to_left_text_display = 11;</code>
   * @return The enableRightToLeftTextDisplay.
   */
  boolean getEnableRightToLeftTextDisplay();

  /**
   * <code>bool enable_sponsored_poi_decorators = 12;</code>
   * @return The enableSponsoredPoiDecorators.
   */
  boolean getEnableSponsoredPoiDecorators();

  /**
   * <code>double remote_interaction_range_meters = 13;</code>
   * @return The remoteInteractionRangeMeters.
   */
  double getRemoteInteractionRangeMeters();
}
