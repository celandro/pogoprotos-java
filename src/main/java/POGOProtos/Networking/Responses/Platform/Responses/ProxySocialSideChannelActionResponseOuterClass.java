// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Networking/Responses/Platform/Responses/ProxySocialSideChannelActionResponse.proto

package POGOProtos.Networking.Responses.Platform.Responses;

public final class ProxySocialSideChannelActionResponseOuterClass {
  private ProxySocialSideChannelActionResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_ProxySocialSideChannelActionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Networking_Responses_Platform_Responses_ProxySocialSideChannelActionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n]POGOProtos/Networking/Responses/Platfo" +
      "rm/Responses/ProxySocialSideChannelActio" +
      "nResponse.proto\0222POGOProtos.Networking.R" +
      "esponses.Platform.Responses\"\251\003\n$ProxySoc" +
      "ialSideChannelActionResponse\022o\n\006status\030\001" +
      " \001(\0162_.POGOProtos.Networking.Responses.P" +
      "latform.Responses.ProxySocialSideChannel" +
      "ActionResponse.Status\022\025\n\rassigned_host\030\002" +
      " \001(\t\022\017\n\007payload\030\003 \001(\014\"\347\001\n\006Status\022\t\n\005UNSE" +
      "T\020\000\022\r\n\tCOMPLETED\020\001\022\034\n\030COMPLETED_AND_REAS" +
      "SIGNED\020\002\022\024\n\020ACTION_NOT_FOUND\020\003\022\024\n\020ASSIGN" +
      "MENT_ERROR\020\004\022\034\n\030PROXY_UNAUTHORIZED_ERROR" +
      "\020\005\022\022\n\016INTERNAL_ERROR\020\006\022\017\n\013BAD_REQUEST\020\007\022" +
      "\021\n\rACCESS_DENIED\020\010\022\021\n\rTIMEOUT_ERROR\020\t\022\020\n" +
      "\014RATE_LIMITED\020\nB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_ProxySocialSideChannelActionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Networking_Responses_Platform_Responses_ProxySocialSideChannelActionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Networking_Responses_Platform_Responses_ProxySocialSideChannelActionResponse_descriptor,
        new java.lang.String[] { "Status", "AssignedHost", "Payload", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
