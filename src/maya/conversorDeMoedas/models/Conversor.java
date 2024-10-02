package maya.conversorDeMoedas.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private Conversao conversao;

    public void converter(String moeda_base, String moeda_alvo, double quantia) {

        var key = "05c0ca24299e9c5398f611e0";
        var uri = URI.create(
                "https://v6.exchangerate-api.com/v6/" +
                key + "/pair/" +
                moeda_base + "/" +
                moeda_alvo + "/" +
                quantia );

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        try {
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            conversao = new Gson().fromJson(response.body(), Conversao.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível encontrar esse par para conversão!");
        }

    }

    Double getQuantia (){
        return conversao.conversion_result();
    }

    String getMoedaBase() {
        return conversao.base_code();
    }

    String getMoedaAlvo() {
        return conversao.target_code();
    }
}
