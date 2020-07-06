// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Settings/WeatherAlertSettings.proto

package POGOProtos.Settings;

public interface WeatherAlertSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Settings.WeatherAlertSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool warn_weather = 1;</code>
   * @return The warnWeather.
   */
  boolean getWarnWeather();

  /**
   * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity default_severity = 2;</code>
   * @return The enum numeric value on the wire for defaultSeverity.
   */
  int getDefaultSeverityValue();
  /**
   * <code>.POGOProtos.Map.Weather.WeatherAlert.Severity default_severity = 2;</code>
   * @return The defaultSeverity.
   */
  POGOProtos.Map.Weather.WeatherAlert.Severity getDefaultSeverity();

  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings ignores = 3;</code>
   */
  java.util.List<POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings> 
      getIgnoresList();
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings ignores = 3;</code>
   */
  POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings getIgnores(int index);
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings ignores = 3;</code>
   */
  int getIgnoresCount();
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings ignores = 3;</code>
   */
  java.util.List<? extends POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettingsOrBuilder> 
      getIgnoresOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettings ignores = 3;</code>
   */
  POGOProtos.Settings.WeatherAlertSettings.AlertIgnoreSettingsOrBuilder getIgnoresOrBuilder(
      int index);

  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings enforces = 4;</code>
   */
  java.util.List<POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings> 
      getEnforcesList();
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings enforces = 4;</code>
   */
  POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings getEnforces(int index);
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings enforces = 4;</code>
   */
  int getEnforcesCount();
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings enforces = 4;</code>
   */
  java.util.List<? extends POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettingsOrBuilder> 
      getEnforcesOrBuilderList();
  /**
   * <code>repeated .POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettings enforces = 4;</code>
   */
  POGOProtos.Settings.WeatherAlertSettings.AlertEnforceSettingsOrBuilder getEnforcesOrBuilder(
      int index);
}
