// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface CombatMoveSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.CombatMoveSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove unique_id = 1;</code>
   * @return The enum numeric value on the wire for uniqueId.
   */
  int getUniqueIdValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonMove unique_id = 1;</code>
   * @return The uniqueId.
   */
  POGOProtos.Rpc.HoloPokemonMove getUniqueId();

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType type = 2;</code>
   * @return The type.
   */
  POGOProtos.Rpc.HoloPokemonType getType();

  /**
   * <code>float power = 3;</code>
   * @return The power.
   */
  float getPower();

  /**
   * <code>string vfx_name = 4;</code>
   * @return The vfxName.
   */
  java.lang.String getVfxName();
  /**
   * <code>string vfx_name = 4;</code>
   * @return The bytes for vfxName.
   */
  com.google.protobuf.ByteString
      getVfxNameBytes();

  /**
   * <code>int32 duration_turns = 5;</code>
   * @return The durationTurns.
   */
  int getDurationTurns();

  /**
   * <code>int32 energy_delta = 6;</code>
   * @return The energyDelta.
   */
  int getEnergyDelta();

  /**
   * <code>.POGOProtos.Rpc.CombatMoveSettingsProto.CombatMoveBuffsProto buffs = 7;</code>
   * @return Whether the buffs field is set.
   */
  boolean hasBuffs();
  /**
   * <code>.POGOProtos.Rpc.CombatMoveSettingsProto.CombatMoveBuffsProto buffs = 7;</code>
   * @return The buffs.
   */
  POGOProtos.Rpc.CombatMoveSettingsProto.CombatMoveBuffsProto getBuffs();
  /**
   * <code>.POGOProtos.Rpc.CombatMoveSettingsProto.CombatMoveBuffsProto buffs = 7;</code>
   */
  POGOProtos.Rpc.CombatMoveSettingsProto.CombatMoveBuffsProtoOrBuilder getBuffsOrBuilder();
}
