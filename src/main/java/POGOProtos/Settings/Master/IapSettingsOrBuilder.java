// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/IapSettings.proto

package POGOProtos.Settings.Master;

public interface IapSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.IapSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 daily_bonus_coins = 1;</code>
   * @return The dailyBonusCoins.
   */
  int getDailyBonusCoins();

  /**
   * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
   * @return A list containing the dailyDefenderBonusPerPokemon.
   */
  java.util.List<java.lang.Integer> getDailyDefenderBonusPerPokemonList();
  /**
   * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
   * @return The count of dailyDefenderBonusPerPokemon.
   */
  int getDailyDefenderBonusPerPokemonCount();
  /**
   * <code>repeated int32 daily_defender_bonus_per_pokemon = 2;</code>
   * @param index The index of the element to return.
   * @return The dailyDefenderBonusPerPokemon at the given index.
   */
  int getDailyDefenderBonusPerPokemon(int index);

  /**
   * <code>int32 daily_defender_bonus_max_defenders = 3;</code>
   * @return The dailyDefenderBonusMaxDefenders.
   */
  int getDailyDefenderBonusMaxDefenders();

  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @return A list containing the dailyDefenderBonusCurrency.
   */
  java.util.List<java.lang.String>
      getDailyDefenderBonusCurrencyList();
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @return The count of dailyDefenderBonusCurrency.
   */
  int getDailyDefenderBonusCurrencyCount();
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @param index The index of the element to return.
   * @return The dailyDefenderBonusCurrency at the given index.
   */
  java.lang.String getDailyDefenderBonusCurrency(int index);
  /**
   * <code>repeated string daily_defender_bonus_currency = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dailyDefenderBonusCurrency at the given index.
   */
  com.google.protobuf.ByteString
      getDailyDefenderBonusCurrencyBytes(int index);

  /**
   * <code>int64 min_time_between_claims_ms = 5;</code>
   * @return The minTimeBetweenClaimsMs.
   */
  long getMinTimeBetweenClaimsMs();

  /**
   * <code>bool daily_bonus_enabled = 6;</code>
   * @return The dailyBonusEnabled.
   */
  boolean getDailyBonusEnabled();

  /**
   * <code>bool daily_defender_bonus_enabled = 7;</code>
   * @return The dailyDefenderBonusEnabled.
   */
  boolean getDailyDefenderBonusEnabled();
}
