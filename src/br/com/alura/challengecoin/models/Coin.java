package br.com.alura.challengecoin.models;

import java.util.Map;

public class Coin {

    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "conversion_rates=" + conversion_rates +
                '}';
    }
}
