// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/LevelUpRewardsResponse.proto

package POGOProtos.Networking.Responses;

public final class LevelUpRewardsResponseOuterClass {
  private LevelUpRewardsResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_LevelUpRewardsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_LevelUpRewardsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<POGOProtos/Networking/Responses/LevelU" +
      "pRewardsResponse.proto\022\037POGOProtos.Netwo" +
      "rking.Responses\032&POGOProtos/Inventory/It" +
      "em/ItemId.proto\032)POGOProtos/Inventory/It" +
      "em/ItemAward.proto\"\264\002\n\026LevelUpRewardsRes" +
      "ponse\022N\n\006result\030\001 \001(\0162>.POGOProtos.Netwo" +
      "rking.Responses.LevelUpRewardsResponse.R" +
      "esult\022;\n\ritems_awarded\030\002 \003(\0132$.POGOProto" +
      "s.Inventory.Item.ItemAward\0229\n\016items_unlo" +
      "cked\030\004 \003(\0162!.POGOProtos.Inventory.Item.I" +
      "temId\022\033\n\023avatar_template_ids\030\005 \003(\t\"5\n\006Re" +
      "sult\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\023\n\017AWARDED_" +
      "ALREADY\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor(),
          POGOProtos.Inventory.Item.ItemAwardOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_LevelUpRewardsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_LevelUpRewardsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_LevelUpRewardsResponse_descriptor,
        new java.lang.String[] { "Result", "ItemsAwarded", "ItemsUnlocked", "AvatarTemplateIds", });
    POGOProtos.Inventory.Item.ItemIdOuterClass.getDescriptor();
    POGOProtos.Inventory.Item.ItemAwardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
