package maya.conversorDeMoedas.main;

import maya.conversorDeMoedas.models.Conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();
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

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(menssagemOpcoes);
                var opcao = sc.nextInt();
                if (opcao == 7 ) break;

                conversor.converter("BRL", "USD", 100);
                System.out.println("Valor convertido: " + conversor.getQuantia());

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida!");
            }
        }


    }
}
