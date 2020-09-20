// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ArdkConfigSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ArdkConfigSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string orb_vocab_url = 1;</code>
   * @return The orbVocabUrl.
   */
  java.lang.String getOrbVocabUrl();
  /**
   * <code>string orb_vocab_url = 1;</code>
   * @return The bytes for orbVocabUrl.
   */
  com.google.protobuf.ByteString
      getOrbVocabUrlBytes();

  /**
   * <code>string monodpeth_model_url = 2;</code>
   * @return The monodpethModelUrl.
   */
  java.lang.String getMonodpethModelUrl();
  /**
   * <code>string monodpeth_model_url = 2;</code>
   * @return The bytes for monodpethModelUrl.
   */
  com.google.protobuf.ByteString
      getMonodpethModelUrlBytes();

  /**
   * <code>repeated string monodepth_devices = 3;</code>
   * @return A list containing the monodepthDevices.
   */
  java.util.List<java.lang.String>
      getMonodepthDevicesList();
  /**
   * <code>repeated string monodepth_devices = 3;</code>
   * @return The count of monodepthDevices.
   */
  int getMonodepthDevicesCount();
  /**
   * <code>repeated string monodepth_devices = 3;</code>
   * @param index The index of the element to return.
   * @return The monodepthDevices at the given index.
   */
  java.lang.String getMonodepthDevices(int index);
  /**
   * <code>repeated string monodepth_devices = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the monodepthDevices at the given index.
   */
  com.google.protobuf.ByteString
      getMonodepthDevicesBytes(int index);

  /**
   * <code>repeated .POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext monodepth_contexts = 4;</code>
   * @return A list containing the monodepthContexts.
   */
  java.util.List<POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext> getMonodepthContextsList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext monodepth_contexts = 4;</code>
   * @return The count of monodepthContexts.
   */
  int getMonodepthContextsCount();
  /**
   * <code>repeated .POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext monodepth_contexts = 4;</code>
   * @param index The index of the element to return.
   * @return The monodepthContexts at the given index.
   */
  POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext getMonodepthContexts(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext monodepth_contexts = 4;</code>
   * @return A list containing the enum numeric values on the wire for monodepthContexts.
   */
  java.util.List<java.lang.Integer>
  getMonodepthContextsValueList();
  /**
   * <code>repeated .POGOProtos.Rpc.ArdkConfigSettingsProto.ArContext monodepth_contexts = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of monodepthContexts at the given index.
   */
  int getMonodepthContextsValue(int index);

  /**
   * <code>string ios_monodepth_model_url = 5;</code>
   * @return The iosMonodepthModelUrl.
   */
  java.lang.String getIosMonodepthModelUrl();
  /**
   * <code>string ios_monodepth_model_url = 5;</code>
   * @return The bytes for iosMonodepthModelUrl.
   */
  com.google.protobuf.ByteString
      getIosMonodepthModelUrlBytes();

  /**
   * <code>string android_monodepth_model_url = 6;</code>
   * @return The androidMonodepthModelUrl.
   */
  java.lang.String getAndroidMonodepthModelUrl();
  /**
   * <code>string android_monodepth_model_url = 6;</code>
   * @return The bytes for androidMonodepthModelUrl.
   */
  com.google.protobuf.ByteString
      getAndroidMonodepthModelUrlBytes();

  /**
   * <code>string field1 = 7;</code>
   * @return The field1.
   */
  java.lang.String getField1();
  /**
   * <code>string field1 = 7;</code>
   * @return The bytes for field1.
   */
  com.google.protobuf.ByteString
      getField1Bytes();
}
