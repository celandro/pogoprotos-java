// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/EditPokemonTagResponse.proto

package POGOProtos.Networking.Responses;

public interface EditPokemonTagResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Networking.Responses.EditPokemonTagResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .POGOProtos.Networking.Responses.EditPokemonTagResponse.Result edit_result = 2;</code>
   * @return A list containing the editResult.
   */
  java.util.List<POGOProtos.Networking.Responses.EditPokemonTagResponse.Result> getEditResultList();
  /**
   * <code>repeated .POGOProtos.Networking.Responses.EditPokemonTagResponse.Result edit_result = 2;</code>
   * @return The count of editResult.
   */
  int getEditResultCount();
  /**
   * <code>repeated .POGOProtos.Networking.Responses.EditPokemonTagResponse.Result edit_result = 2;</code>
   * @param index The index of the element to return.
   * @return The editResult at the given index.
   */
  POGOProtos.Networking.Responses.EditPokemonTagResponse.Result getEditResult(int index);
  /**
   * <code>repeated .POGOProtos.Networking.Responses.EditPokemonTagResponse.Result edit_result = 2;</code>
   * @return A list containing the enum numeric values on the wire for editResult.
   */
  java.util.List<java.lang.Integer>
  getEditResultValueList();
  /**
   * <code>repeated .POGOProtos.Networking.Responses.EditPokemonTagResponse.Result edit_result = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of editResult at the given index.
   */
  int getEditResultValue(int index);
}
