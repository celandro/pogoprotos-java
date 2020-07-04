// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GetGymDetailsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetGymDetailsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GymStateProto gym_state = 1;</code>
   * @return Whether the gymState field is set.
   */
  boolean hasGymState();
  /**
   * <code>.POGOProtos.Rpc.GymStateProto gym_state = 1;</code>
   * @return The gymState.
   */
  POGOProtos.Rpc.GymStateProto getGymState();
  /**
   * <code>.POGOProtos.Rpc.GymStateProto gym_state = 1;</code>
   */
  POGOProtos.Rpc.GymStateProtoOrBuilder getGymStateOrBuilder();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string url = 3;</code>
   * @return A list containing the url.
   */
  java.util.List<java.lang.String>
      getUrlList();
  /**
   * <code>repeated string url = 3;</code>
   * @return The count of url.
   */
  int getUrlCount();
  /**
   * <code>repeated string url = 3;</code>
   * @param index The index of the element to return.
   * @return The url at the given index.
   */
  java.lang.String getUrl(int index);
  /**
   * <code>repeated string url = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the url at the given index.
   */
  com.google.protobuf.ByteString
      getUrlBytes(int index);

  /**
   * <code>.POGOProtos.Rpc.GetGymDetailsOutProto.Result result = 4;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetGymDetailsOutProto.Result result = 4;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetGymDetailsOutProto.Result getResult();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated string secondary_url = 6;</code>
   * @return A list containing the secondaryUrl.
   */
  java.util.List<java.lang.String>
      getSecondaryUrlList();
  /**
   * <code>repeated string secondary_url = 6;</code>
   * @return The count of secondaryUrl.
   */
  int getSecondaryUrlCount();
  /**
   * <code>repeated string secondary_url = 6;</code>
   * @param index The index of the element to return.
   * @return The secondaryUrl at the given index.
   */
  java.lang.String getSecondaryUrl(int index);
  /**
   * <code>repeated string secondary_url = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the secondaryUrl at the given index.
   */
  com.google.protobuf.ByteString
      getSecondaryUrlBytes(int index);

  /**
   * <code>string checkin_image_url = 7;</code>
   * @return The checkinImageUrl.
   */
  java.lang.String getCheckinImageUrl();
  /**
   * <code>string checkin_image_url = 7;</code>
   * @return The bytes for checkinImageUrl.
   */
  com.google.protobuf.ByteString
      getCheckinImageUrlBytes();

  /**
   * <code>.POGOProtos.Rpc.EventInfoProto event_info = 8;</code>
   * @return Whether the eventInfo field is set.
   */
  boolean hasEventInfo();
  /**
   * <code>.POGOProtos.Rpc.EventInfoProto event_info = 8;</code>
   * @return The eventInfo.
   */
  POGOProtos.Rpc.EventInfoProto getEventInfo();
  /**
   * <code>.POGOProtos.Rpc.EventInfoProto event_info = 8;</code>
   */
  POGOProtos.Rpc.EventInfoProtoOrBuilder getEventInfoOrBuilder();
}