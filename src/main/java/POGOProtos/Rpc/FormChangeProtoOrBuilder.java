// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface FormChangeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.FormChangeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form available_form = 1;</code>
   * @return A list containing the availableForm.
   */
  java.util.List<POGOProtos.Rpc.PokemonDisplayProto.Form> getAvailableFormList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form available_form = 1;</code>
   * @return The count of availableForm.
   */
  int getAvailableFormCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form available_form = 1;</code>
   * @param index The index of the element to return.
   * @return The availableForm at the given index.
   */
  POGOProtos.Rpc.PokemonDisplayProto.Form getAvailableForm(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form available_form = 1;</code>
   * @return A list containing the enum numeric values on the wire for availableForm.
   */
  java.util.List<java.lang.Integer>
  getAvailableFormValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonDisplayProto.Form available_form = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of availableForm at the given index.
   */
  int getAvailableFormValue(int index);

  /**
   * <code>int32 candy_cost = 2;</code>
   * @return The candyCost.
   */
  int getCandyCost();

  /**
   * <code>int32 stardust_cost = 3;</code>
   * @return The stardustCost.
   */
  int getStardustCost();

  /**
   * <code>.POGOProtos.Rpc.Item item_cost = 4;</code>
   * @return The enum numeric value on the wire for itemCost.
   */
  int getItemCostValue();
  /**
   * <code>.POGOProtos.Rpc.Item item_cost = 4;</code>
   * @return The itemCost.
   */
  POGOProtos.Rpc.Item getItemCost();

  /**
   * <code>repeated .POGOProtos.Rpc.EvolutionQuestInfoProto quest_requirement = 5;</code>
   */
  java.util.List<POGOProtos.Rpc.EvolutionQuestInfoProto> 
      getQuestRequirementList();
  /**
   * <code>repeated .POGOProtos.Rpc.EvolutionQuestInfoProto quest_requirement = 5;</code>
   */
  POGOProtos.Rpc.EvolutionQuestInfoProto getQuestRequirement(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.EvolutionQuestInfoProto quest_requirement = 5;</code>
   */
  int getQuestRequirementCount();
  /**
   * <code>repeated .POGOProtos.Rpc.EvolutionQuestInfoProto quest_requirement = 5;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder> 
      getQuestRequirementOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.EvolutionQuestInfoProto quest_requirement = 5;</code>
   */
  POGOProtos.Rpc.EvolutionQuestInfoProtoOrBuilder getQuestRequirementOrBuilder(
      int index);
}
