// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/UseItemEggIncubatorResponse.proto

package POGOProtos.Networking.Responses;

public final class UseItemEggIncubatorResponseOuterClass {
  private UseItemEggIncubatorResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_UseItemEggIncubatorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_UseItemEggIncubatorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAPOGOProtos/Networking/Responses/UseIte" +
      "mEggIncubatorResponse.proto\022\037POGOProtos." +
      "Networking.Responses\032\'POGOProtos/Invento" +
      "ry/EggIncubator.proto\"\237\003\n\033UseItemEggIncu" +
      "batorResponse\022S\n\006result\030\001 \001(\0162C.POGOProt" +
      "os.Networking.Responses.UseItemEggIncuba" +
      "torResponse.Result\0229\n\regg_incubator\030\002 \001(" +
      "\0132\".POGOProtos.Inventory.EggIncubator\"\357\001" +
      "\n\006Result\022\t\n\005UNSET\020\000\022\013\n\007SUCCESS\020\001\022\035\n\031ERRO" +
      "R_INCUBATOR_NOT_FOUND\020\002\022\037\n\033ERROR_POKEMON" +
      "_EGG_NOT_FOUND\020\003\022\034\n\030ERROR_POKEMON_ID_NOT" +
      "_EGG\020\004\022\"\n\036ERROR_INCUBATOR_ALREADY_IN_USE" +
      "\020\005\022$\n ERROR_POKEMON_ALREADY_INCUBATING\020\006" +
      "\022%\n!ERROR_INCUBATOR_NO_USES_REMAINING\020\007B" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Inventory.EggIncubatorOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Networking_Responses_UseItemEggIncubatorResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_UseItemEggIncubatorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_UseItemEggIncubatorResponse_descriptor,
        new java.lang.String[] { "Result", "EggIncubator", });
    POGOProtos.Inventory.EggIncubatorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
