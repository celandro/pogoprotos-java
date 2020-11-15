// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/UnClassed/GetProfileResponse.proto

package POGOProtos.Data.UnClassed;

public interface GetProfileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.UnClassed.GetProfileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.UnClassed.GetProfileResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.UnClassed.GetProfileResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.UnClassed.GetProfileResponse.Result getResult();

  /**
   * <code>.POGOProtos.Data.UnClassed.GetProfileResponse.ProfileDetails profile_details = 2;</code>
   * @return Whether the profileDetails field is set.
   */
  boolean hasProfileDetails();
  /**
   * <code>.POGOProtos.Data.UnClassed.GetProfileResponse.ProfileDetails profile_details = 2;</code>
   * @return The profileDetails.
   */
  POGOProtos.Data.UnClassed.GetProfileResponse.ProfileDetails getProfileDetails();
  /**
   * <code>.POGOProtos.Data.UnClassed.GetProfileResponse.ProfileDetails profile_details = 2;</code>
   */
  POGOProtos.Data.UnClassed.GetProfileResponse.ProfileDetailsOrBuilder getProfileDetailsOrBuilder();

  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails player_profile_details = 3;</code>
   */
  java.util.List<POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails> 
      getPlayerProfileDetailsList();
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails player_profile_details = 3;</code>
   */
  POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails getPlayerProfileDetails(int index);
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails player_profile_details = 3;</code>
   */
  int getPlayerProfileDetailsCount();
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails player_profile_details = 3;</code>
   */
  java.util.List<? extends POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetailsOrBuilder> 
      getPlayerProfileDetailsOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetails player_profile_details = 3;</code>
   */
  POGOProtos.Data.UnClassed.GetProfileResponse.PlayerProfileDetailsOrBuilder getPlayerProfileDetailsOrBuilder(
      int index);
}
