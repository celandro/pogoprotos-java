// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface WithCombatTypeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.WithCombatTypeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Rpc.CombatType combat_type = 1;</code>
   * @return A list containing the combatType.
   */
  java.util.List<POGOProtos.Rpc.CombatType> getCombatTypeList();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatType combat_type = 1;</code>
   * @return The count of combatType.
   */
  int getCombatTypeCount();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatType combat_type = 1;</code>
   * @param index The index of the element to return.
   * @return The combatType at the given index.
   */
  POGOProtos.Rpc.CombatType getCombatType(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.CombatType combat_type = 1;</code>
   * @return A list containing the enum numeric values on the wire for combatType.
   */
  java.util.List<java.lang.Integer>
  getCombatTypeValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.CombatType combat_type = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of combatType at the given index.
   */
  int getCombatTypeValue(int index);
}