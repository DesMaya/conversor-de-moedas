package maya.conversorDeMoedas.exceptions;

public class OpcaoInvalida extends RuntimeException {
  private final String mensagem;

    public OpcaoInvalida(String mensagem) {
        this.mensagem = mensagem;
    }

  @Override
  public String getMessage() {
    return this.mensagem;
  }
}

