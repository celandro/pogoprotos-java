// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/FestivalSettings.proto

package POGOProtos.Settings;

public interface FestivalSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.FestivalSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Settings.FestivalSettings.FestivalType festival_type = 1;</code>
   * @return The enum numeric value on the wire for festivalType.
   */
  int getFestivalTypeValue();
  /**
   * <code>.POGOProtos.Settings.FestivalSettings.FestivalType festival_type = 1;</code>
   * @return The festivalType.
   */
  POGOProtos.Settings.FestivalSettings.FestivalType getFestivalType();

  /**
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string vector = 3;</code>
   * @return The vector.
   */
  java.lang.String getVector();
  /**
   * <code>string vector = 3;</code>
   * @return The bytes for vector.
   */
  com.google.protobuf.ByteString
      getVectorBytes();
}