// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Combat/CombatPlayerProfile.proto

package POGOProtos.Data.Combat;

public final class CombatPlayerProfileOuterClass {
  private CombatPlayerProfileOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_Location_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0POGOProtos/Data/Combat/CombatPlayerPro" +
      "file.proto\022\026POGOProtos.Data.Combat\0320POGO" +
      "Protos/Data/Player/PlayerPublicProfile.p" +
      "roto\0324POGOProtos/Data/Combat/CombatPlaye" +
      "rPreferences.proto\"\372\002\n\023CombatPlayerProfi" +
      "le\022\021\n\tplayer_id\030\001 \001(\t\022C\n\016public_profile\030" +
      "\002 \001(\0132+.POGOProtos.Data.Player.PlayerPub" +
      "licProfile\022!\n\031combat_league_template_id\030" +
      "\003 \003(\t\022\030\n\020buddy_pokemon_id\030\004 \001(\006\022F\n\010locat" +
      "ion\030\005 \001(\01324.POGOProtos.Data.Combat.Comba" +
      "tPlayerProfile.Location\022R\n\031combat_player" +
      "_preferences\030\006 \001(\0132/.POGOProtos.Data.Com" +
      "bat.CombatPlayerPreferences\0322\n\010Location\022" +
      "\022\n\nlat_degree\030\001 \001(\001\022\022\n\nlng_degree\030\002 \001(\001B" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.Player.PlayerPublicProfileOuterClass.getDescriptor(),
          POGOProtos.Data.Combat.CombatPlayerPreferencesOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_descriptor,
        new java.lang.String[] { "PlayerId", "PublicProfile", "CombatLeagueTemplateId", "BuddyPokemonId", "Location", "CombatPlayerPreferences", });
    internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_Location_descriptor =
      internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_descriptor.getNestedTypes().get(0);
    internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Combat_CombatPlayerProfile_Location_descriptor,
        new java.lang.String[] { "LatDegree", "LngDegree", });
    POGOProtos.Data.Player.PlayerPublicProfileOuterClass.getDescriptor();
    POGOProtos.Data.Combat.CombatPlayerPreferencesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
