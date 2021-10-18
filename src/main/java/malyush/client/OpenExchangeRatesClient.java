package malyush.client;

import malyush.model.ExchangeRates;

public interface OpenExchangeRatesClient {
    ExchangeRates getLatestRates(String appId);

    ExchangeRates getHistoricalRates(String date, String appId);
}
