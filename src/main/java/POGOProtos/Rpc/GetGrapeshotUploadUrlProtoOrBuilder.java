// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface GetGrapeshotUploadUrlProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetGrapeshotUploadUrlProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string submission_id = 1;</code>
   * @return The submissionId.
   */
  java.lang.String getSubmissionId();
  /**
   * <code>string submission_id = 1;</code>
   * @return The bytes for submissionId.
   */
  com.google.protobuf.ByteString
      getSubmissionIdBytes();

  /**
   * <code>repeated string file_upload_context = 2;</code>
   * @return A list containing the fileUploadContext.
   */
  java.util.List<java.lang.String>
      getFileUploadContextList();
  /**
   * <code>repeated string file_upload_context = 2;</code>
   * @return The count of fileUploadContext.
   */
  int getFileUploadContextCount();
  /**
   * <code>repeated string file_upload_context = 2;</code>
   * @param index The index of the element to return.
   * @return The fileUploadContext at the given index.
   */
  java.lang.String getFileUploadContext(int index);
  /**
   * <code>repeated string file_upload_context = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fileUploadContext at the given index.
   */
  com.google.protobuf.ByteString
      getFileUploadContextBytes(int index);
}
