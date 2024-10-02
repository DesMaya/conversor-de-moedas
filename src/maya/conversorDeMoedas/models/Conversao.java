package maya.conversorDeMoedas.models;

public record Conversao(
        String base_code,
        String target_code,
        Double conversion_result
) {
}
