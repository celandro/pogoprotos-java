// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Store/CurrencyUpdate.proto

package POGOProtos.Data.Store;

public final class CurrencyUpdateOuterClass {
  private CurrencyUpdateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_Store_CurrencyUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_Store_CurrencyUpdate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*POGOProtos/Data/Store/CurrencyUpdate.p" +
      "roto\022\025POGOProtos.Data.Store\"y\n\016CurrencyU" +
      "pdate\022\025\n\rcurrency_name\030\001 \001(\t\022\026\n\016currency" +
      "_delta\030\002 \001(\005\022\030\n\020currency_balance\030\003 \001(\005\022\036" +
      "\n\026fiat_purchased_balance\030\004 \001(\005B\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_POGOProtos_Data_Store_CurrencyUpdate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_Store_CurrencyUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_Store_CurrencyUpdate_descriptor,
        new java.lang.String[] { "CurrencyName", "CurrencyDelta", "CurrencyBalance", "FiatPurchasedBalance", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
