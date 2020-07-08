// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Quests/Quests.proto

package POGOProtos.Data.Quests;

public interface QuestsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Quests.Quests)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Data.Quests.Quest quest = 1;</code>
   */
  java.util.List<POGOProtos.Data.Quests.Quest> 
      getQuestList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.Quest quest = 1;</code>
   */
  POGOProtos.Data.Quests.Quest getQuest(int index);
  /**
   * <code>repeated .POGOProtos.Data.Quests.Quest quest = 1;</code>
   */
  int getQuestCount();
  /**
   * <code>repeated .POGOProtos.Data.Quests.Quest quest = 1;</code>
   */
  java.util.List<? extends POGOProtos.Data.Quests.QuestOrBuilder> 
      getQuestOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.Quest quest = 1;</code>
   */
  POGOProtos.Data.Quests.QuestOrBuilder getQuestOrBuilder(
      int index);

  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @return A list containing the completedStoryQuest.
   */
  java.util.List<java.lang.String>
      getCompletedStoryQuestList();
  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @return The count of completedStoryQuest.
   */
  int getCompletedStoryQuestCount();
  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @param index The index of the element to return.
   * @return The completedStoryQuest at the given index.
   */
  java.lang.String getCompletedStoryQuest(int index);
  /**
   * <code>repeated string completed_story_quest = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the completedStoryQuest at the given index.
   */
  com.google.protobuf.ByteString
      getCompletedStoryQuestBytes(int index);

  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestPokemonEncounter quest_pokemon_encounter = 3;</code>
   */
  java.util.List<POGOProtos.Data.Quests.QuestPokemonEncounter> 
      getQuestPokemonEncounterList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestPokemonEncounter quest_pokemon_encounter = 3;</code>
   */
  POGOProtos.Data.Quests.QuestPokemonEncounter getQuestPokemonEncounter(int index);
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestPokemonEncounter quest_pokemon_encounter = 3;</code>
   */
  int getQuestPokemonEncounterCount();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestPokemonEncounter quest_pokemon_encounter = 3;</code>
   */
  java.util.List<? extends POGOProtos.Data.Quests.QuestPokemonEncounterOrBuilder> 
      getQuestPokemonEncounterOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.Quests.QuestPokemonEncounter quest_pokemon_encounter = 3;</code>
   */
  POGOProtos.Data.Quests.QuestPokemonEncounterOrBuilder getQuestPokemonEncounterOrBuilder(
      int index);

  /**
   * <code>.POGOProtos.Data.Quests.QuestStampCard stamp_card = 4;</code>
   * @return Whether the stampCard field is set.
   */
  boolean hasStampCard();
  /**
   * <code>.POGOProtos.Data.Quests.QuestStampCard stamp_card = 4;</code>
   * @return The stampCard.
   */
  POGOProtos.Data.Quests.QuestStampCard getStampCard();
  /**
   * <code>.POGOProtos.Data.Quests.QuestStampCard stamp_card = 4;</code>
   */
  POGOProtos.Data.Quests.QuestStampCardOrBuilder getStampCardOrBuilder();
}