// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface RaidTelemetryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.RaidTelemetry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.RaidTelemetryIds raid_telemetry_id = 1;</code>
   * @return The enum numeric value on the wire for raidTelemetryId.
   */
  int getRaidTelemetryIdValue();
  /**
   * <code>.POGOProtos.Rpc.RaidTelemetryIds raid_telemetry_id = 1;</code>
   * @return The raidTelemetryId.
   */
  POGOProtos.Rpc.RaidTelemetryIds getRaidTelemetryId();

  /**
   * <code>string bundle_version = 2;</code>
   * @return The bundleVersion.
   */
  java.lang.String getBundleVersion();
  /**
   * <code>string bundle_version = 2;</code>
   * @return The bytes for bundleVersion.
   */
  com.google.protobuf.ByteString
      getBundleVersionBytes();

  /**
   * <code>float time_since_enter_raid = 3;</code>
   * @return The timeSinceEnterRaid.
   */
  float getTimeSinceEnterRaid();

  /**
   * <code>float time_since_last_raid_telemetry = 4;</code>
   * @return The timeSinceLastRaidTelemetry.
   */
  float getTimeSinceLastRaidTelemetry();

  /**
   * <code>int32 raid_level = 5;</code>
   * @return The raidLevel.
   */
  int getRaidLevel();

  /**
   * <code>bool private_lobby = 6;</code>
   * @return The privateLobby.
   */
  boolean getPrivateLobby();

  /**
   * <code>string ticket_item = 7;</code>
   * @return The ticketItem.
   */
  java.lang.String getTicketItem();
  /**
   * <code>string ticket_item = 7;</code>
   * @return The bytes for ticketItem.
   */
  com.google.protobuf.ByteString
      getTicketItemBytes();

  /**
   * <code>int32 num_players_in_lobby = 8;</code>
   * @return The numPlayersInLobby.
   */
  int getNumPlayersInLobby();

  /**
   * <code>int32 battle_party_number = 9;</code>
   * @return The battlePartyNumber.
   */
  int getBattlePartyNumber();
}
