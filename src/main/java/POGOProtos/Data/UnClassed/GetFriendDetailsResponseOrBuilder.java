// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/UnClassed/GetFriendDetailsResponse.proto

package POGOProtos.Data.UnClassed;

public interface GetFriendDetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.UnClassed.GetFriendDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.UnClassed.GetFriendDetailsResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.UnClassed.GetFriendDetailsResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.UnClassed.GetFriendDetailsResponse.Result getResult();

  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto friend_details = 2;</code>
   */
  java.util.List<POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto> 
      getFriendDetailsList();
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto friend_details = 2;</code>
   */
  POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto getFriendDetails(int index);
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto friend_details = 2;</code>
   */
  int getFriendDetailsCount();
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto friend_details = 2;</code>
   */
  java.util.List<? extends POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProtoOrBuilder> 
      getFriendDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProto friend_details = 2;</code>
   */
  POGOProtos.Data.UnClassed.GetFriendDetailsResponse.FriendDetailsEntryProtoOrBuilder getFriendDetailsOrBuilder(
      int index);
}