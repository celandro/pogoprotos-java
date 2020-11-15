// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/AttackRaidBattleResponse.proto

package POGOProtos.Networking.Responses;

public interface AttackRaidBattleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.AttackRaidBattleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.AttackRaidBattleResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.AttackRaidBattleResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.AttackRaidBattleResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Battle.BattleUpdate battle_update = 2;</code>
   * @return Whether the battleUpdate field is set.
   */
  boolean hasBattleUpdate();
  /**
   * <code>.POGOProtos.Data.Battle.BattleUpdate battle_update = 2;</code>
   * @return The battleUpdate.
   */
  POGOProtos.Data.Battle.BattleUpdate getBattleUpdate();
  /**
   * <code>.POGOProtos.Data.Battle.BattleUpdate battle_update = 2;</code>
   */
  POGOProtos.Data.Battle.BattleUpdateOrBuilder getBattleUpdateOrBuilder();

  /**
   * <code>.POGOProtos.Data.Vasa.AdDetails sponsored_gift = 3;</code>
   * @return Whether the sponsoredGift field is set.
   */
  boolean hasSponsoredGift();
  /**
   * <code>.POGOProtos.Data.Vasa.AdDetails sponsored_gift = 3;</code>
   * @return The sponsoredGift.
   */
  POGOProtos.Data.Vasa.AdDetails getSponsoredGift();
  /**
   * <code>.POGOProtos.Data.Vasa.AdDetails sponsored_gift = 3;</code>
   */
  POGOProtos.Data.Vasa.AdDetailsOrBuilder getSponsoredGiftOrBuilder();
}
