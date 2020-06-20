// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Data/Telemetry/PlatformMetricData.proto

package POGOProtos.Data.Telemetry;

public interface PlatformMetricDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Data.Telemetry.PlatformMetricData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.TelemetryCommon common_telemetry = 1;</code>
   * @return Whether the commonTelemetry field is set.
   */
  boolean hasCommonTelemetry();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.TelemetryCommon common_telemetry = 1;</code>
   * @return The commonTelemetry.
   */
  POGOProtos.Data.Telemetry.PlatformMetricData.TelemetryCommon getCommonTelemetry();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.TelemetryCommon common_telemetry = 1;</code>
   */
  POGOProtos.Data.Telemetry.PlatformMetricData.TelemetryCommonOrBuilder getCommonTelemetryOrBuilder();

  /**
   * <code>int64 long_value = 2;</code>
   * @return The longValue.
   */
  long getLongValue();

  /**
   * <code>double double_value = 3;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <code>bool boolean_value = 4;</code>
   * @return The booleanValue.
   */
  boolean getBooleanValue();

  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.Distribution distribution = 5;</code>
   * @return Whether the distribution field is set.
   */
  boolean hasDistribution();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.Distribution distribution = 5;</code>
   * @return The distribution.
   */
  POGOProtos.Data.Telemetry.PlatformMetricData.Distribution getDistribution();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.Distribution distribution = 5;</code>
   */
  POGOProtos.Data.Telemetry.PlatformMetricData.DistributionOrBuilder getDistributionOrBuilder();

  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.Kind metric_kind = 6;</code>
   * @return The enum numeric value on the wire for metricKind.
   */
  int getMetricKindValue();
  /**
   * <code>.POGOProtos.Data.Telemetry.PlatformMetricData.Kind metric_kind = 6;</code>
   * @return The metricKind.
   */
  POGOProtos.Data.Telemetry.PlatformMetricData.Kind getMetricKind();

  public POGOProtos.Data.Telemetry.PlatformMetricData.DatapointValueCase getDatapointValueCase();
}
