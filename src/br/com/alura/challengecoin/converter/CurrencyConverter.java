package br.com.alura.challengecoin.converter;
import br.com.alura.challengecoin.models.Coin;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class CurrencyConverter {

    public double converterCurrency(double coinValue, int option) {
        double convertedValue = 0;
        String typeSearch = selectTypeSearch(option);
        Coin quote = searchQuote(typeSearch);
        Map<String, Double> conversionRates = quote.getConversion_rates();

        if(option == 1){
            double  valueRate = conversionRates.getOrDefault("BRL", -1.0);
            convertedValue = coinValue/valueRate;

        }

      return  convertedValue;

    }

    private String selectTypeSearch(int option){

        if(option == 1 || option == 2){

            return "USD";
        }

        if(option == 3 || option == 4){

            return "EUR";
        }

        if(option == 5 || option == 6){

            return "GBP";
        }

        return "";

    }

    private Coin searchQuote(String type){

        URI address = URI.create("https://v6.exchangerate-api.com/v6/423ab80eac6b161dad425b6c/latest/"+type);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Coin.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter a cotação neste momento - Tente mais tarde! ");
        }

    }

}
