// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Grapeshot/GrapeshotComposeData.proto

package POGOProtos.Data.Grapeshot;

public interface GrapeshotComposeDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Grapeshot.GrapeshotComposeData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string target_file_path = 1;</code>
   * @return The targetFilePath.
   */
  java.lang.String getTargetFilePath();
  /**
   * <code>string target_file_path = 1;</code>
   * @return The bytes for targetFilePath.
   */
  com.google.protobuf.ByteString
      getTargetFilePathBytes();

  /**
   * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
   * @return Whether the authentication field is set.
   */
  boolean hasAuthentication();
  /**
   * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
   * @return The authentication.
   */
  POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData getAuthentication();
  /**
   * <code>.POGOProtos.Data.Grapeshot.GrapeshotAuthenticationData authentication = 2;</code>
   */
  POGOProtos.Data.Grapeshot.GrapeshotAuthenticationDataOrBuilder getAuthenticationOrBuilder();
}