// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Beluga/BelugaPokemon.proto

package POGOProtos.Data.Beluga;

public interface BelugaPokemonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Beluga.BelugaPokemon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string trainer_name = 1;</code>
   * @return The trainerName.
   */
  java.lang.String getTrainerName();
  /**
   * <code>string trainer_name = 1;</code>
   * @return The bytes for trainerName.
   */
  com.google.protobuf.ByteString
      getTrainerNameBytes();

  /**
   * <code>.POGOProtos.Data.Beluga.BelugaPokemon.TrainerGender trainer_gender = 2;</code>
   * @return The enum numeric value on the wire for trainerGender.
   */
  int getTrainerGenderValue();
  /**
   * <code>.POGOProtos.Data.Beluga.BelugaPokemon.TrainerGender trainer_gender = 2;</code>
   * @return The trainerGender.
   */
  POGOProtos.Data.Beluga.BelugaPokemon.TrainerGender getTrainerGender();

  /**
   * <code>.POGOProtos.Enums.TeamColor trainer_team = 3;</code>
   * @return The enum numeric value on the wire for trainerTeam.
   */
  int getTrainerTeamValue();
  /**
   * <code>.POGOProtos.Enums.TeamColor trainer_team = 3;</code>
   * @return The trainerTeam.
   */
  POGOProtos.Enums.TeamColor getTrainerTeam();

  /**
   * <code>int32 trainer_level = 4;</code>
   * @return The trainerLevel.
   */
  int getTrainerLevel();

  /**
   * <code>int32 pokedex_id = 5;</code>
   * @return The pokedexId.
   */
  int getPokedexId();

  /**
   * <code>int32 cp = 6;</code>
   * @return The cp.
   */
  int getCp();

  /**
   * <code>float pokemon_level = 7;</code>
   * @return The pokemonLevel.
   */
  float getPokemonLevel();

  /**
   * <code>int32 max_hp = 8;</code>
   * @return The maxHp.
   */
  int getMaxHp();

  /**
   * <code>double origin_lat = 9;</code>
   * @return The originLat.
   */
  double getOriginLat();

  /**
   * <code>double origin_lng = 10;</code>
   * @return The originLng.
   */
  double getOriginLng();

  /**
   * <code>float height = 11;</code>
   * @return The height.
   */
  float getHeight();

  /**
   * <code>float weight = 12;</code>
   * @return The weight.
   */
  float getWeight();

  /**
   * <code>int32 individual_attack = 13;</code>
   * @return The individualAttack.
   */
  int getIndividualAttack();

  /**
   * <code>int32 individual_defense = 14;</code>
   * @return The individualDefense.
   */
  int getIndividualDefense();

  /**
   * <code>int32 individual_stamina = 15;</code>
   * @return The individualStamina.
   */
  int getIndividualStamina();

  /**
   * <code>int32 creation_day = 16;</code>
   * @return The creationDay.
   */
  int getCreationDay();

  /**
   * <code>int32 creation_month = 17;</code>
   * @return The creationMonth.
   */
  int getCreationMonth();

  /**
   * <code>int32 creation_year = 18;</code>
   * @return The creationYear.
   */
  int getCreationYear();

  /**
   * <code>string nickname = 19;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 19;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>.POGOProtos.Enums.Gender gender = 20;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.POGOProtos.Enums.Gender gender = 20;</code>
   * @return The gender.
   */
  POGOProtos.Enums.Gender getGender();

  /**
   * <code>.POGOProtos.Enums.Costume costume = 21;</code>
   * @return The enum numeric value on the wire for costume.
   */
  int getCostumeValue();
  /**
   * <code>.POGOProtos.Enums.Costume costume = 21;</code>
   * @return The costume.
   */
  POGOProtos.Enums.Costume getCostume();

  /**
   * <code>.POGOProtos.Data.Beluga.BelugaPokemon.PokemonForm form = 22;</code>
   * @return The enum numeric value on the wire for form.
   */
  int getFormValue();
  /**
   * <code>.POGOProtos.Data.Beluga.BelugaPokemon.PokemonForm form = 22;</code>
   * @return The form.
   */
  POGOProtos.Data.Beluga.BelugaPokemon.PokemonForm getForm();

  /**
   * <code>bool shiny = 23;</code>
   * @return The shiny.
   */
  boolean getShiny();

  /**
   * <code>.POGOProtos.Enums.PokemonMove move1 = 24;</code>
   * @return The enum numeric value on the wire for move1.
   */
  int getMove1Value();
  /**
   * <code>.POGOProtos.Enums.PokemonMove move1 = 24;</code>
   * @return The move1.
   */
  POGOProtos.Enums.PokemonMove getMove1();

  /**
   * <code>.POGOProtos.Enums.PokemonMove move2 = 25;</code>
   * @return The enum numeric value on the wire for move2.
   */
  int getMove2Value();
  /**
   * <code>.POGOProtos.Enums.PokemonMove move2 = 25;</code>
   * @return The move2.
   */
  POGOProtos.Enums.PokemonMove getMove2();
}
