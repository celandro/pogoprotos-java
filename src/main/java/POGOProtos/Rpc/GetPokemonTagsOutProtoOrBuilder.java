// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface GetPokemonTagsOutProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.GetPokemonTagsOutProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <code>.POGOProtos.Rpc.GetPokemonTagsOutProto.Result result = 1;</code>
   * @return The result.
   */
  POGOProtos.Rpc.GetPokemonTagsOutProto.Result getResult();

  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  java.util.List<POGOProtos.Rpc.PokemonTagProto> 
      getTagList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  POGOProtos.Rpc.PokemonTagProto getTag(int index);
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  int getTagCount();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  java.util.List<? extends POGOProtos.Rpc.PokemonTagProtoOrBuilder> 
      getTagOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Rpc.PokemonTagProto tag = 2;</code>
   */
  POGOProtos.Rpc.PokemonTagProtoOrBuilder getTagOrBuilder(
      int index);
}
