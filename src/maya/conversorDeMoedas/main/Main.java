package maya.conversorDeMoedas.main;

import maya.conversorDeMoedas.models.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();
        var opcao = 0;
        var menssagemOpcoes = """
        *****************************************************
        
        1) Dólar Americano => Real Brasileiro
        2) Real Brasileiro => Dólar Americano
        3) Euro => Real Brasileiro
        4) Real Brasileiro => Euro
        5) Dolar Americano => Euro
        6) Euro => Dolar Americano
        7) Sair
        
        Escolha uma opção válida: 
        *****************************************************
        """;

        System.out.println("""
        
        Bem vindo/a ao Conversor de Moedas!
        
        """);

        try {
            conversor.converter("BRL", "USD", 100);
            System.out.println("Valor convertido: " + conversor.getQuantia());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
