// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface AsyncFileUploadCompleteProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.AsyncFileUploadCompleteProto)
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
   * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 2;</code>
   * @return The enum numeric value on the wire for uploadStatus.
   */
  int getUploadStatusValue();
  /**
   * <code>.POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status upload_status = 2;</code>
   * @return The uploadStatus.
   */
  POGOProtos.Rpc.AsyncFileUploadCompleteProto.Status getUploadStatus();
}