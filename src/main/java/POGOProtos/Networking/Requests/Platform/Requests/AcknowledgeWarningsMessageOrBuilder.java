// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Platform/Requests/AcknowledgeWarningsMessage.proto

package POGOProtos.Networking.Requests.Platform.Requests;

public interface AcknowledgeWarningsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Platform.Requests.AcknowledgeWarningsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Enums.PlatformWarningType warning = 1;</code>
   * @return A list containing the warning.
   */
  java.util.List<POGOProtos.Enums.PlatformWarningType> getWarningList();
  /**
   * <code>repeated .POGOProtos.Enums.PlatformWarningType warning = 1;</code>
   * @return The count of warning.
   */
  int getWarningCount();
  /**
   * <code>repeated .POGOProtos.Enums.PlatformWarningType warning = 1;</code>
   * @param index The index of the element to return.
   * @return The warning at the given index.
   */
  POGOProtos.Enums.PlatformWarningType getWarning(int index);
  /**
   * <code>repeated .POGOProtos.Enums.PlatformWarningType warning = 1;</code>
   * @return A list containing the enum numeric values on the wire for warning.
   */
  java.util.List<java.lang.Integer>
  getWarningValueList();
  /**
   * <code>repeated .POGOProtos.Enums.PlatformWarningType warning = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of warning at the given index.
   */
  int getWarningValue(int index);
}