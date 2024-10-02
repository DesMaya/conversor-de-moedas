package maya.conversorDeMoedas.main;

import maya.conversorDeMoedas.models.Conversor;

public class Main {
    public static void main(String[] args) {
        try {
            Conversor conversor = new Conversor();
            conversor.converter("BRL", "USD", 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
