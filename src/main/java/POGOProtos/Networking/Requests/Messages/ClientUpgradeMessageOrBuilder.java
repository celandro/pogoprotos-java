// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ClientUpgradeMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface ClientUpgradeMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
   * @return The enum numeric value on the wire for operatingSystem.
   */
  int getOperatingSystemValue();
  /**
   * <code>.POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem operating_system = 2;</code>
   * @return The operatingSystem.
   */
  POGOProtos.Networking.Requests.Messages.ClientUpgradeMessage.ClientOperatingSystem getOperatingSystem();
}
