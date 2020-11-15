// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface TypeEffectiveSettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.TypeEffectiveSettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated float attack_scalar = 1;</code>
   * @return A list containing the attackScalar.
   */
  java.util.List<java.lang.Float> getAttackScalarList();
  /**
   * <code>repeated float attack_scalar = 1;</code>
   * @return The count of attackScalar.
   */
  int getAttackScalarCount();
  /**
   * <code>repeated float attack_scalar = 1;</code>
   * @param index The index of the element to return.
   * @return The attackScalar at the given index.
   */
  float getAttackScalar(int index);

  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
   * @return The enum numeric value on the wire for attackType.
   */
  int getAttackTypeValue();
  /**
   * <code>.POGOProtos.Rpc.HoloPokemonType attack_type = 2;</code>
   * @return The attackType.
   */
  POGOProtos.Rpc.HoloPokemonType getAttackType();
}
