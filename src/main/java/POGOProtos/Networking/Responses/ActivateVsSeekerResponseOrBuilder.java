// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/ActivateVsSeekerResponse.proto

package POGOProtos.Networking.Responses;

public interface ActivateVsSeekerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.ActivateVsSeekerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.ActivateVsSeekerResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.ActivateVsSeekerResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.ActivateVsSeekerResponse.Result getResult();

  /**
   * <code>.POGOProtos.Settings.Master.Item.VsSeekerAttributes vs_seeker = 2;</code>
   * @return Whether the vsSeeker field is set.
   */
  boolean hasVsSeeker();
  /**
   * <code>.POGOProtos.Settings.Master.Item.VsSeekerAttributes vs_seeker = 2;</code>
   * @return The vsSeeker.
   */
  POGOProtos.Settings.Master.Item.VsSeekerAttributes getVsSeeker();
  /**
   * <code>.POGOProtos.Settings.Master.Item.VsSeekerAttributes vs_seeker = 2;</code>
   */
  POGOProtos.Settings.Master.Item.VsSeekerAttributesOrBuilder getVsSeekerOrBuilder();
}