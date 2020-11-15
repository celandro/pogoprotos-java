// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Game/GameAccountRegistry/Requests/ReplaceLoginActionMessage.proto

package POGOProtos.Networking.Requests.Game.GameAccountRegistry.Requests;

public interface ReplaceLoginActionMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Game.GameAccountRegistry.Requests.ReplaceLoginActionMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
   * @return The enum numeric value on the wire for existingIdentityProvider.
   */
  int getExistingIdentityProviderValue();
  /**
   * <code>.POGOProtos.Enums.IdentityProvider existing_identity_provider = 1;</code>
   * @return The existingIdentityProvider.
   */
  POGOProtos.Enums.IdentityProvider getExistingIdentityProvider();

  /**
   * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
   * @return Whether the newLogin field is set.
   */
  boolean hasNewLogin();
  /**
   * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
   * @return The newLogin.
   */
  POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage getNewLogin();
  /**
   * <code>.POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessage new_login = 2;</code>
   */
  POGOProtos.Networking.Requests.Platform.Requests.AddLoginActionMessageOrBuilder getNewLoginOrBuilder();

  /**
   * <code>string auth_provider_id = 3;</code>
   * @return The authProviderId.
   */
  java.lang.String getAuthProviderId();
  /**
   * <code>string auth_provider_id = 3;</code>
   * @return The bytes for authProviderId.
   */
  com.google.protobuf.ByteString
      getAuthProviderIdBytes();
}
