// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/DownloadRemoteConfigVersionResponse.proto

package POGOProtos.Networking.Responses;

public final class DownloadRemoteConfigVersionResponseOuterClass {
  private DownloadRemoteConfigVersionResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_DownloadRemoteConfigVersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_DownloadRemoteConfigVersionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIPOGOProtos/Networking/Responses/Downlo" +
      "adRemoteConfigVersionResponse.proto\022\037POG" +
      "OProtos.Networking.Responses\"\203\002\n#Downloa" +
      "dRemoteConfigVersionResponse\022[\n\006result\030\001" +
      " \001(\0162K.POGOProtos.Networking.Responses.D" +
      "ownloadRemoteConfigVersionResponse.Resul" +
      "t\022#\n\033item_templates_timestamp_ms\030\002 \001(\004\022!" +
      "\n\031asset_digest_timestamp_ms\030\003 \001(\004\022\025\n\rexp" +
      "eriment_id\030\004 \003(\r\" \n\006Result\022\t\n\005UNSET\020\000\022\013\n" +
      "\007SUCCESS\020\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_DownloadRemoteConfigVersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_DownloadRemoteConfigVersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_DownloadRemoteConfigVersionResponse_descriptor,
        new java.lang.String[] { "Result", "ItemTemplatesTimestampMs", "AssetDigestTimestampMs", "ExperimentId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
