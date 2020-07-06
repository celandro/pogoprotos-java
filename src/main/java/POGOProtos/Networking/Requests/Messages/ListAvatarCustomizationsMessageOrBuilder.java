// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Requests/Messages/ListAvatarCustomizationsMessage.proto

package POGOProtos.Networking.Requests.Messages;

public interface ListAvatarCustomizationsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Requests.Messages.ListAvatarCustomizationsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatarType avatar_type = 1;</code>
   * @return The enum numeric value on the wire for avatarType.
   */
  int getAvatarTypeValue();
  /**
   * <code>.POGOProtos.Data.Player.PlayerAvatarType avatar_type = 1;</code>
   * @return The avatarType.
   */
  POGOProtos.Data.Player.PlayerAvatarType getAvatarType();

  /**
   * <code>repeated .POGOProtos.Data.Avatar.AvatarCustomization.Slot slot = 2;</code>
   * @return A list containing the slot.
   */
  java.util.List<POGOProtos.Data.Avatar.AvatarCustomization.Slot> getSlotList();
  /**
   * <code>repeated .POGOProtos.Data.Avatar.AvatarCustomization.Slot slot = 2;</code>
   * @return The count of slot.
   */
  int getSlotCount();
  /**
   * <code>repeated .POGOProtos.Data.Avatar.AvatarCustomization.Slot slot = 2;</code>
   * @param index The index of the element to return.
   * @return The slot at the given index.
   */
  POGOProtos.Data.Avatar.AvatarCustomization.Slot getSlot(int index);
  /**
   * <code>repeated .POGOProtos.Data.Avatar.AvatarCustomization.Slot slot = 2;</code>
   * @return A list containing the enum numeric values on the wire for slot.
   */
  java.util.List<java.lang.Integer>
  getSlotValueList();
  /**
   * <code>repeated .POGOProtos.Data.Avatar.AvatarCustomization.Slot slot = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of slot at the given index.
   */
  int getSlotValue(int index);

  /**
   * <code>repeated .POGOProtos.Enums.Filter filters = 3;</code>
   * @return A list containing the filters.
   */
  java.util.List<POGOProtos.Enums.Filter> getFiltersList();
  /**
   * <code>repeated .POGOProtos.Enums.Filter filters = 3;</code>
   * @return The count of filters.
   */
  int getFiltersCount();
  /**
   * <code>repeated .POGOProtos.Enums.Filter filters = 3;</code>
   * @param index The index of the element to return.
   * @return The filters at the given index.
   */
  POGOProtos.Enums.Filter getFilters(int index);
  /**
   * <code>repeated .POGOProtos.Enums.Filter filters = 3;</code>
   * @return A list containing the enum numeric values on the wire for filters.
   */
  java.util.List<java.lang.Integer>
  getFiltersValueList();
  /**
   * <code>repeated .POGOProtos.Enums.Filter filters = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of filters at the given index.
   */
  int getFiltersValue(int index);

  /**
   * <code>int32 start = 4;</code>
   * @return The start.
   */
  int getStart();

  /**
   * <code>int32 limit = 5;</code>
   * @return The limit.
   */
  int getLimit();
}
