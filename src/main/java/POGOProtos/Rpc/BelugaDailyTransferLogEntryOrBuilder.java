// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface BelugaDailyTransferLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BelugaDailyTransferLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.BelugaDailyTransferLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.BelugaDailyTransferLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.BelugaDailyTransferLogEntry.Result getResult();

  /**
   * <code>bool includes_weekly_bonus = 2;</code>
   * @return The includesWeeklyBonus.
   */
  boolean getIncludesWeeklyBonus();

  /**
   * <code>.POGOProtos.Rpc.LootProto items_awarded = 3;</code>
   * @return Whether the itemsAwarded field is set.
   */
  boolean hasItemsAwarded();
  /**
   * <code>.POGOProtos.Rpc.LootProto items_awarded = 3;</code>
   * @return The itemsAwarded.
   */
  POGOProtos.Rpc.LootProto getItemsAwarded();
  /**
   * <code>.POGOProtos.Rpc.LootProto items_awarded = 3;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getItemsAwardedOrBuilder();
}
