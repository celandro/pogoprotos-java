// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Logs/ShareExRaidPassLogEntry.proto

package POGOProtos.Data.Logs;

public interface ShareExRaidPassLogEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Logs.ShareExRaidPassLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Logs.ShareExRaidPassLogEntry.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Data.Logs.ShareExRaidPassLogEntry.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Data.Logs.ShareExRaidPassLogEntry.Result getResult();

  /**
   * <code>string friend_codename = 2;</code>
   * @return The friendCodename.
   */
  java.lang.String getFriendCodename();
  /**
   * <code>string friend_codename = 2;</code>
   * @return The bytes for friendCodename.
   */
  com.google.protobuf.ByteString
      getFriendCodenameBytes();
}
