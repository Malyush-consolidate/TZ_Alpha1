package malyush.client;

import malyush.model.ExchangeRates;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface FeignOpenExchangeRatesClient extends OpenExchangeRatesClient{
    @Override
    @GetMapping("/latest.json")
    ExchangeRates getLatestRates(
            @RequestParam("app_id") String appId
    );

    @Override
    @GetMapping("/historical/{date}.json")
    ExchangeRates getHistoricalRates(
            @PathVariable String date,
            @RequestParam("app_id") String appId
    );
}
