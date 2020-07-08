// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/FeedBuddyResponse.proto

package POGOProtos.Networking.Responses;

public interface FeedBuddyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.FeedBuddyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.FeedBuddyResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.FeedBuddyResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.FeedBuddyResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.Buddy.BuddyObservedData observed_data = 3;</code>
   * @return Whether the observedData field is set.
   */
  boolean hasObservedData();
  /**
   * <code>.POGOProtos.Data.Buddy.BuddyObservedData observed_data = 3;</code>
   * @return The observedData.
   */
  POGOProtos.Data.Buddy.BuddyObservedData getObservedData();
  /**
   * <code>.POGOProtos.Data.Buddy.BuddyObservedData observed_data = 3;</code>
   */
  POGOProtos.Data.Buddy.BuddyObservedDataOrBuilder getObservedDataOrBuilder();

  /**
   * <code>.POGOProtos.Data.Buddy.BuddyStatsShownHearts.BuddyShownHeartType shown_hearts = 4;</code>
   * @return The enum numeric value on the wire for shownHearts.
   */
  int getShownHeartsValue();
  /**
   * <code>.POGOProtos.Data.Buddy.BuddyStatsShownHearts.BuddyShownHeartType shown_hearts = 4;</code>
   * @return The shownHearts.
   */
  POGOProtos.Data.Buddy.BuddyStatsShownHearts.BuddyShownHeartType getShownHearts();
}