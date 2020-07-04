// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface AttackGymOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AttackGymOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.AttackGymOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.AttackGymOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.AttackGymOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.BattleLogProto battle_log = 2;</code>
   * @return Whether the battleLog field is set.
   */
  boolean hasBattleLog();
  /**
   * <code>.POGOProtos.Rpc.BattleLogProto battle_log = 2;</code>
   * @return The battleLog.
   */
  POGOProtos.Rpc.BattleLogProto getBattleLog();
  /**
   * <code>.POGOProtos.Rpc.BattleLogProto battle_log = 2;</code>
   */
  POGOProtos.Rpc.BattleLogProtoOrBuilder getBattleLogOrBuilder();

  /**
   * <code>string battle_id = 3;</code>
   * @return The battleId.
   */
  java.lang.String getBattleId();
  /**
   * <code>string battle_id = 3;</code>
   * @return The bytes for battleId.
   */
  com.google.protobuf.ByteString
      getBattleIdBytes();

  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_defender = 4;</code>
   * @return Whether the activeDefender field is set.
   */
  boolean hasActiveDefender();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_defender = 4;</code>
   * @return The activeDefender.
   */
  POGOProtos.Rpc.PokemonInfo getActiveDefender();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_defender = 4;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getActiveDefenderOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_attacker = 5;</code>
   * @return Whether the activeAttacker field is set.
   */
  boolean hasActiveAttacker();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_attacker = 5;</code>
   * @return The activeAttacker.
   */
  POGOProtos.Rpc.PokemonInfo getActiveAttacker();
  /**
   * <code>.POGOProtos.Rpc.PokemonInfo active_attacker = 5;</code>
   */
  POGOProtos.Rpc.PokemonInfoOrBuilder getActiveAttackerOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.BattleUpdateProto battle_update = 6;</code>
   * @return Whether the battleUpdate field is set.
   */
  boolean hasBattleUpdate();
  /**
   * <code>.POGOProtos.Rpc.BattleUpdateProto battle_update = 6;</code>
   * @return The battleUpdate.
   */
  POGOProtos.Rpc.BattleUpdateProto getBattleUpdate();
  /**
   * <code>.POGOProtos.Rpc.BattleUpdateProto battle_update = 6;</code>
   */
  POGOProtos.Rpc.BattleUpdateProtoOrBuilder getBattleUpdateOrBuilder();
}
