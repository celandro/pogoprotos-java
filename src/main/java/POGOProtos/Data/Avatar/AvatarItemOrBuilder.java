// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Avatar/AvatarItem.proto

package POGOProtos.Data.Avatar;

public interface AvatarItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Avatar.AvatarItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string avatar_template_id = 1;</code>
   * @return The avatarTemplateId.
   */
  java.lang.String getAvatarTemplateId();
  /**
   * <code>string avatar_template_id = 1;</code>
   * @return The bytes for avatarTemplateId.
   */
  com.google.protobuf.ByteString
      getAvatarTemplateIdBytes();

  /**
   * <code>int64 new_timestamp_ms = 2;</code>
   * @return The newTimestampMs.
   */
  long getNewTimestampMs();

  /**
   * <code>bool viewed = 3;</code>
   * @return The viewed.
   */
  boolean getViewed();
}
