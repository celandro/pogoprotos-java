// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Player/PlayerReputation.proto

package POGOProtos.Data.Player;

public final class PlayerReputationOuterClass {
  private PlayerReputationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Player_PlayerReputation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Player_PlayerReputation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-POGOProtos/Data/Player/PlayerReputatio" +
      "n.proto\022\026POGOProtos.Data.Player\"\332\001\n\020Play" +
      "erReputation\022\026\n\016account_age_ms\030\001 \001(\003\022\024\n\014" +
      "player_level\030\002 \001(\003\022R\n\020cheat_reputation\030\003" +
      " \003(\01628.POGOProtos.Data.Player.PlayerRepu" +
      "tation.CheatReputation\022\020\n\010is_minor\030\004 \001(\010" +
      "\"2\n\017CheatReputation\022\t\n\005UNSET\020\000\022\007\n\003BOT\020\001\022" +
      "\013\n\007SPOOFER\020\002B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Player_PlayerReputation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Player_PlayerReputation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Player_PlayerReputation_descriptor,
        new java.lang.String[] { "AccountAgeMs", "PlayerLevel", "CheatReputation", "IsMinor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
