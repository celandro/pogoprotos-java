// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface BuddyFeedingOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.BuddyFeedingOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.BuddyFeedingOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.BuddyFeedingOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.BuddyFeedingOutProto.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 3;</code>
   * @return Whether the observedData field is set.
   */
  boolean hasObservedData();
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 3;</code>
   * @return The observedData.
   */
  POGOProtos.Rpc.BuddyObservedData getObservedData();
  /**
   * <code>.POGOProtos.Rpc.BuddyObservedData observed_data = 3;</code>
   */
  POGOProtos.Rpc.BuddyObservedDataOrBuilder getObservedDataOrBuilder();

  /**
   * <code>.POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartType shown_hearts = 4;</code>
   * @return The enum numeric value on the wire for shownHearts.
   */
  int getShownHeartsValue();
  /**
   * <code>.POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartType shown_hearts = 4;</code>
   * @return The shownHearts.
   */
  POGOProtos.Rpc.BuddyStatsShownHearts.BuddyShownHeartType getShownHearts();
}
