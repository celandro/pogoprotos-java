// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/GetDownloadUrlsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface GetDownloadUrlsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.GetDownloadUrlsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string asset_id = 1;</code>
   * @return A list containing the assetId.
   */
  java.util.List<java.lang.String>
      getAssetIdList();
  /**
   * <code>repeated string asset_id = 1;</code>
   * @return The count of assetId.
   */
  int getAssetIdCount();
  /**
   * <code>repeated string asset_id = 1;</code>
   * @param index The index of the element to return.
   * @return The assetId at the given index.
   */
  java.lang.String getAssetId(int index);
  /**
   * <code>repeated string asset_id = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the assetId at the given index.
   */
  com.google.protobuf.ByteString
      getAssetIdBytes(int index);
}
