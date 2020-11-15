// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/GymBadgeGmtSettings.proto

package POGOProtos.Settings.Master;

public interface GymBadgeGmtSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.GymBadgeGmtSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated int32 target = 1;</code>
   * @return A list containing the target.
   */
  java.util.List<java.lang.Integer> getTargetList();
  /**
   * <code>repeated int32 target = 1;</code>
   * @return The count of target.
   */
  int getTargetCount();
  /**
   * <code>repeated int32 target = 1;</code>
   * @param index The index of the element to return.
   * @return The target at the given index.
   */
  int getTarget(int index);

  /**
   * <code>float battle_winning_score_per_defender_cp = 2;</code>
   * @return The battleWinningScorePerDefenderCp.
   */
  float getBattleWinningScorePerDefenderCp();

  /**
   * <code>float gym_defending_score_per_minute = 3;</code>
   * @return The gymDefendingScorePerMinute.
   */
  float getGymDefendingScorePerMinute();

  /**
   * <code>int32 berry_feeding_score = 4;</code>
   * @return The berryFeedingScore.
   */
  int getBerryFeedingScore();

  /**
   * <code>int32 pokemon_deploy_score = 5;</code>
   * @return The pokemonDeployScore.
   */
  int getPokemonDeployScore();

  /**
   * <code>int32 raid_battle_winning_score = 6;</code>
   * @return The raidBattleWinningScore.
   */
  int getRaidBattleWinningScore();

  /**
   * <code>int32 lose_all_battles_score = 7;</code>
   * @return The loseAllBattlesScore.
   */
  int getLoseAllBattlesScore();
}
