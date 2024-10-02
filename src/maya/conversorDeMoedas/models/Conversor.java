package maya.conversorDeMoedas.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT

public class Conversor {
    private Conversao conversao;

    public void converter(String moeda_base, String moeda_alvo) {
        var key = "05c0ca24299e9c5398f611e0";
        var uri = URI.create(
                "https://v6.exchangerate-api.com/v6/" +
                key + "/pair/" +
                moeda_alvo + "/" +
                moeda_base + "/AMOUNT" );

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        try {
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
            var json = response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível encontrar esse par para conversão!");
        }

    }
}
