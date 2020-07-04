// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PlatformGetProfileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PlatformGetProfileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.PlatformGetProfileResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.PlatformGetProfileResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.PlatformGetProfileResponse.Result getResult();

  /**
   * <code>.POGOProtos.Rpc.PlatformProfileDetailsProto profile_details = 2;</code>
   * @return Whether the profileDetails field is set.
   */
  boolean hasProfileDetails();
  /**
   * <code>.POGOProtos.Rpc.PlatformProfileDetailsProto profile_details = 2;</code>
   * @return The profileDetails.
   */
  POGOProtos.Rpc.PlatformProfileDetailsProto getProfileDetails();
  /**
   * <code>.POGOProtos.Rpc.PlatformProfileDetailsProto profile_details = 2;</code>
   */
  POGOProtos.Rpc.PlatformProfileDetailsProtoOrBuilder getProfileDetailsOrBuilder();

  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto player_profile_details = 3;</code>
   */
  java.util.List<POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto> 
      getPlayerProfileDetailsList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto player_profile_details = 3;</code>
   */
  POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto getPlayerProfileDetails(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto player_profile_details = 3;</code>
   */
  int getPlayerProfileDetailsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto player_profile_details = 3;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProtoOrBuilder> 
      getPlayerProfileDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProto player_profile_details = 3;</code>
   */
  POGOProtos.Rpc.PlatformGetProfileResponse.PlayerProfileDetailsProtoOrBuilder getPlayerProfileDetailsOrBuilder(
      int index);
}