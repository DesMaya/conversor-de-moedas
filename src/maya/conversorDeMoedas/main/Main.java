package maya.conversorDeMoedas.main;

import maya.conversorDeMoedas.models.Conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();
        var menssagemOpcoes = """
        *****************************************************
       \s
        1) Dólar Americano => Real Brasileiro
        2) Real Brasileiro => Dólar Americano
        3) Euro => Real Brasileiro
        4) Real Brasileiro => Euro
        5) Dolar Americano => Euro
        6) Euro => Dolar Americano
        7) Sair
       \s
        Escolha uma opção:\s
        *****************************************************
       \s""";

        System.out.println("""
        
        Bem vindo/a ao Conversor de Moedas!
        
        """);

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(menssagemOpcoes);
                var opcao = sc.nextInt();
                var quantia = 0.0;
                if (opcao == 7 ) break;

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor que deseja converter: ");
                        quantia = sc.nextDouble();
                        conversor.converter("USD", "BRL", quantia);
                        conversor.mostraConversao();
                        continue;

                    case 2:
                        System.out.println("Digite o valor que deseja converter: ");
                        quantia = sc.nextDouble();
                        conversor.converter("BRL", "USD", quantia);
                        conversor.mostraConversao();
                        continue;

                    case 3:
                        System.out.println("Digite o valor que deseja converter: ");
                        quantia = sc.nextDouble();
                        conversor.converter("EUR", "BRL", quantia);
                        conversor.mostraConversao();
                        continue;

                    case 4:
                        System.out.println("Digite o valor que deseja converter: ");
                        quantia = sc.nextDouble();
                        conversor.converter("BRL", "EUR", quantia);
                        conversor.mostraConversao();
                        continue;

                    case 5:
                        System.out.println("Digite o valor que deseja converter: ");
                        quantia = sc.nextDouble();
                        conversor.converter("USD", "EUR", quantia);
                        conversor.mostraConversao();
                        continue;

                    case 6:
                        System.out.println("Digite o valor que deseja converter: ");
                        quantia = sc.nextDouble();
                        conversor.converter("EUR", "USD", quantia);
                        conversor.mostraConversao();
                        continue;

                    default:
                        System.out.println("Digite uma opção válida!");
                }


            } catch (InputMismatchException e) {
                System.out.println("Ops! Você digitou um valor inválido, tente novamente!");
            }
        }

        System.out.println("""
        Obrigada por utilizar o conversor de moedas!
        Até breve <3
        """);


    }
}
