// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POGOProtos/Rpc/Rpc.proto

package POGOProtos.Rpc;

public interface PokecoinPurchaseDisplaySettingsProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:POGOProtos.Rpc.PokecoinPurchaseDisplaySettingsProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool feature_enabled = 1;</code>
   * @return The featureEnabled.
   */
  boolean getFeatureEnabled();

  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @return A list containing the enabledCountries.
   */
  java.util.List<java.lang.String>
      getEnabledCountriesList();
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @return The count of enabledCountries.
   */
  int getEnabledCountriesCount();
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @param index The index of the element to return.
   * @return The enabledCountries at the given index.
   */
  java.lang.String getEnabledCountries(int index);
  /**
   * <code>repeated string enabled_countries = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the enabledCountries at the given index.
   */
  com.google.protobuf.ByteString
      getEnabledCountriesBytes(int index);

  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @return A list containing the enabledCurrencies.
   */
  java.util.List<java.lang.String>
      getEnabledCurrenciesList();
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @return The count of enabledCurrencies.
   */
  int getEnabledCurrenciesCount();
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @param index The index of the element to return.
   * @return The enabledCurrencies at the given index.
   */
  java.lang.String getEnabledCurrencies(int index);
  /**
   * <code>repeated string enabled_currencies = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the enabledCurrencies at the given index.
   */
  com.google.protobuf.ByteString
      getEnabledCurrenciesBytes(int index);

  /**
   * <code>bool use_pokecoin_purchase_display_gmt = 4;</code>
   * @return The usePokecoinPurchaseDisplayGmt.
   */
  boolean getUsePokecoinPurchaseDisplayGmt();
}
