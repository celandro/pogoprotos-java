// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos.Rpc.proto

package POGOProtos.Rpc;

public interface ProgressQuestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.ProgressQuestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
   * @return Whether the geotargetedQuestValidation field is set.
   */
  boolean hasGeotargetedQuestValidation();
  /**
   * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
   * @return The geotargetedQuestValidation.
   */
  POGOProtos.Rpc.GeotargetedQuestValidation getGeotargetedQuestValidation();
  /**
   * <code>.POGOProtos.Rpc.GeotargetedQuestValidation geotargeted_quest_validation = 3;</code>
   */
  POGOProtos.Rpc.GeotargetedQuestValidationOrBuilder getGeotargetedQuestValidationOrBuilder();

  /**
   * <code>string quest_id = 1;</code>
   * @return The questId.
   */
  java.lang.String getQuestId();
  /**
   * <code>string quest_id = 1;</code>
   * @return The bytes for questId.
   */
  com.google.protobuf.ByteString
      getQuestIdBytes();

  /**
   * <code>int32 current_progress = 2;</code>
   * @return The currentProgress.
   */
  int getCurrentProgress();

  public POGOProtos.Rpc.ProgressQuestProto.ValidationCase getValidationCase();
}