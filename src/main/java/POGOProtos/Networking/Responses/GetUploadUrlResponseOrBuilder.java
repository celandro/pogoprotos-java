// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GetUploadUrlResponse.proto

package POGOProtos.Networking.Responses;

public interface GetUploadUrlResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GetUploadUrlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GetUploadUrlResponse.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GetUploadUrlResponse.Status status = 1;</code>
   * @return The status.
   */
  POGOProtos.Networking.Responses.GetUploadUrlResponse.Status getStatus();

  /**
   * <code>string signed_url = 2;</code>
   * @return The signedUrl.
   */
  java.lang.String getSignedUrl();
  /**
   * <code>string signed_url = 2;</code>
   * @return The bytes for signedUrl.
   */
  com.google.protobuf.ByteString
      getSignedUrlBytes();

  /**
   * <code>string supporting_image_signed_url = 3;</code>
   * @return The supportingImageSignedUrl.
   */
  java.lang.String getSupportingImageSignedUrl();
  /**
   * <code>string supporting_image_signed_url = 3;</code>
   * @return The bytes for supportingImageSignedUrl.
   */
  com.google.protobuf.ByteString
      getSupportingImageSignedUrlBytes();

  /**
   * <code>map&lt;string, string&gt; context_signed_urls = 4;</code>
   */
  int getContextSignedUrlsCount();
  /**
   * <code>map&lt;string, string&gt; context_signed_urls = 4;</code>
   */
  boolean containsContextSignedUrls(
      java.lang.String key);
  /**
   * Use {@link #getContextSignedUrlsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getContextSignedUrls();
  /**
   * <code>map&lt;string, string&gt; context_signed_urls = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getContextSignedUrlsMap();
  /**
   * <code>map&lt;string, string&gt; context_signed_urls = 4;</code>
   */

  java.lang.String getContextSignedUrlsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; context_signed_urls = 4;</code>
   */

  java.lang.String getContextSignedUrlsOrThrow(
      java.lang.String key);
}
