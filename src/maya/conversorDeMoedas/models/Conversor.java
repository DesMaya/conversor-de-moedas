package maya.conversorDeMoedas.models;

import com.google.gson.Gson;

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

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível realizar a conversão!");
        }

    }

    public void mostraConversao() {
        System.out.printf("""
        Conversão de %s para %s --> %.2f
        """,conversao.base_code(), conversao.target_code(), conversao.conversion_result());
    }
}
