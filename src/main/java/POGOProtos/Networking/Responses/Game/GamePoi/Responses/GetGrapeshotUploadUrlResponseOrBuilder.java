// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Game/GamePoi/Responses/GetGrapeshotUploadUrlResponse.proto

package POGOProtos.Networking.Responses.Game.GamePoi.Responses;

public interface GetGrapeshotUploadUrlResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.Game.GamePoi.Responses.GetGrapeshotUploadUrlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.GetGrapeshotUploadUrlResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.Game.GamePoi.Responses.GetGrapeshotUploadUrlResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.Game.GamePoi.Responses.GetGrapeshotUploadUrlResponse.Status getStatus();

  /**
   * <code>map&lt;string, .POGOProtos.Data.Grapeshot.GrapeshotUploadingData&gt; file_context_to_grapeshot_data = 4;</code>
   */
  int getFileContextToGrapeshotDataCount();
  /**
   * <code>map&lt;string, .POGOProtos.Data.Grapeshot.GrapeshotUploadingData&gt; file_context_to_grapeshot_data = 4;</code>
   */
  boolean containsFileContextToGrapeshotData(
      java.lang.String key);
  /**
   * Use {@link #getFileContextToGrapeshotDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, POGOProtos.Data.Grapeshot.GrapeshotUploadingData>
  getFileContextToGrapeshotData();
  /**
   * <code>map&lt;string, .POGOProtos.Data.Grapeshot.GrapeshotUploadingData&gt; file_context_to_grapeshot_data = 4;</code>
   */
  java.util.Map<java.lang.String, POGOProtos.Data.Grapeshot.GrapeshotUploadingData>
  getFileContextToGrapeshotDataMap();
  /**
   * <code>map&lt;string, .POGOProtos.Data.Grapeshot.GrapeshotUploadingData&gt; file_context_to_grapeshot_data = 4;</code>
   */

  POGOProtos.Data.Grapeshot.GrapeshotUploadingData getFileContextToGrapeshotDataOrDefault(
      java.lang.String key,
      POGOProtos.Data.Grapeshot.GrapeshotUploadingData defaultValue);
  /**
   * <code>map&lt;string, .POGOProtos.Data.Grapeshot.GrapeshotUploadingData&gt; file_context_to_grapeshot_data = 4;</code>
   */

  POGOProtos.Data.Grapeshot.GrapeshotUploadingData getFileContextToGrapeshotDataOrThrow(
      java.lang.String key);
}