// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface ClaimVsSeekerRewardsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.ClaimVsSeekerRewardsOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return Whether the rewards field is set.
   */
  boolean hasRewards();
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   * @return The rewards.
   */
  POGOProtos.Rpc.LootProto getRewards();
  /**
   * <code>.POGOProtos.Rpc.LootProto rewards = 2;</code>
   */
  POGOProtos.Rpc.LootProtoOrBuilder getRewardsOrBuilder();
}
