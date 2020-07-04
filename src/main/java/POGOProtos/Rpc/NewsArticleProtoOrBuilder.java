// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface NewsArticleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.NewsArticleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>repeated string image_url = 2;</code>
   * @return A list containing the imageUrl.
   */
  java.util.List<java.lang.String>
      getImageUrlList();
  /**
   * <code>repeated string image_url = 2;</code>
   * @return The count of imageUrl.
   */
  int getImageUrlCount();
  /**
   * <code>repeated string image_url = 2;</code>
   * @param index The index of the element to return.
   * @return The imageUrl at the given index.
   */
  java.lang.String getImageUrl(int index);
  /**
   * <code>repeated string image_url = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageUrl at the given index.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes(int index);

  /**
   * <code>string header_key = 3;</code>
   * @return The headerKey.
   */
  java.lang.String getHeaderKey();
  /**
   * <code>string header_key = 3;</code>
   * @return The bytes for headerKey.
   */
  com.google.protobuf.ByteString
      getHeaderKeyBytes();

  /**
   * <code>string subheader_key = 4;</code>
   * @return The subheaderKey.
   */
  java.lang.String getSubheaderKey();
  /**
   * <code>string subheader_key = 4;</code>
   * @return The bytes for subheaderKey.
   */
  com.google.protobuf.ByteString
      getSubheaderKeyBytes();

  /**
   * <code>string main_text_key = 5;</code>
   * @return The mainTextKey.
   */
  java.lang.String getMainTextKey();
  /**
   * <code>string main_text_key = 5;</code>
   * @return The bytes for mainTextKey.
   */
  com.google.protobuf.ByteString
      getMainTextKeyBytes();

  /**
   * <code>int64 timestamp = 6;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>.POGOProtos.Rpc.NewsArticleProto.NewsTemplate template = 7;</code>
   * @return The enum numeric value on the wire for template.
   */
  int getTemplateValue();
  /**
   * <code>.POGOProtos.Rpc.NewsArticleProto.NewsTemplate template = 7;</code>
   * @return The template.
   */
  POGOProtos.Rpc.NewsArticleProto.NewsTemplate getTemplate();

  /**
   * <code>bool enabled = 8;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <code>bool article_read = 9;</code>
   * @return The articleRead.
   */
  boolean getArticleRead();
}
