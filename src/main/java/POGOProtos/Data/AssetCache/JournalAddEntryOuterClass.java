// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/AssetCache/JournalAddEntry.proto

package POGOProtos.Data.AssetCache;

public final class JournalAddEntryOuterClass {
  private JournalAddEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0POGOProtos/Data/AssetCache/JournalAddE" +
      "ntry.proto\022\032POGOProtos.Data.AssetCache\032*" +
      "POGOProtos/Data/AssetCache/HashedKey.pro" +
      "to\"`\n\017JournalAddEntry\0229\n\nhashed_key\030\001 \001(" +
      "\0132%.POGOProtos.Data.AssetCache.HashedKey" +
      "\022\022\n\nentry_size\030\002 \001(\003B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          POGOProtos.Data.AssetCache.HashedKeyOuterClass.getDescriptor(),
        });
    internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_POGOProtos_Data_AssetCache_JournalAddEntry_descriptor,
        new java.lang.String[] { "HashedKey", "EntrySize", });
    POGOProtos.Data.AssetCache.HashedKeyOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}