// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/DownloadItemTemplatesResponse.proto

package POGOProtos.Networking.Responses;

public interface DownloadItemTemplatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.DownloadItemTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.Result getResult();

  /**
   * <code>repeated .POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate item_template = 2;</code>
   */
  java.util.List<POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate> 
      getItemTemplateList();
  /**
   * <code>repeated .POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate item_template = 2;</code>
   */
  POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate getItemTemplate(int index);
  /**
   * <code>repeated .POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate item_template = 2;</code>
   */
  int getItemTemplateCount();
  /**
   * <code>repeated .POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate item_template = 2;</code>
   */
  java.util.List<? extends POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplateOrBuilder> 
      getItemTemplateOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplate item_template = 2;</code>
   */
  POGOProtos.Networking.Responses.DownloadItemTemplatesResponse.GameMasterClientTemplateOrBuilder getItemTemplateOrBuilder(
      int index);

  /**
   * <code>uint64 timestamp_ms = 3;</code>
   * @return The timestampMs.
   */
  long getTimestampMs();

  /**
   * <code>int32 page_offset = 4;</code>
   * @return The pageOffset.
   */
  int getPageOffset();
}
