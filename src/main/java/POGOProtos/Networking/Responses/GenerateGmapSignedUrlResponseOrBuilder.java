// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/GenerateGmapSignedUrlResponse.proto

package POGOProtos.Networking.Responses;

public interface GenerateGmapSignedUrlResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.GenerateGmapSignedUrlResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Networking.Responses.GenerateGmapSignedUrlResponse.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Networking.Responses.GenerateGmapSignedUrlResponse.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Networking.Responses.GenerateGmapSignedUrlResponse.Result getResult();

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
}
