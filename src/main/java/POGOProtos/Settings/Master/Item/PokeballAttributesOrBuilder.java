// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/Master/Item/PokeballAttributes.proto

package POGOProtos.Settings.Master.Item;

public interface PokeballAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.Master.Item.PokeballAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
   * @return The enum numeric value on the wire for itemEffect.
   */
  int getItemEffectValue();
  /**
   * <code>.POGOProtos.Enums.ItemEffect item_effect = 1;</code>
   * @return The itemEffect.
   */
  POGOProtos.Enums.ItemEffect getItemEffect();

  /**
   * <code>float capture_multi = 2;</code>
   * @return The captureMulti.
   */
  float getCaptureMulti();

  /**
   * <code>float capture_multi_effect = 3;</code>
   * @return The captureMultiEffect.
   */
  float getCaptureMultiEffect();

  /**
   * <code>float item_effect_mod = 4;</code>
   * @return The itemEffectMod.
   */
  float getItemEffectMod();
}
