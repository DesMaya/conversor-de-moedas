package maya.conversorDeMoedas.main;

import maya.conversorDeMoedas.models.Conversor;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        conversor.converter("BRL", "USD", 100);
    }
}
