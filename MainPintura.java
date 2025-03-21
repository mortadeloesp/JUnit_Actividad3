package Ej3Polimorfismo.ej4;

import java.util.ArrayList;

public class MainPintura {
    public static void main(String[] args) {


        Pintura pintura = new Pintura(250);

        Rectangulo rectangulo = new Rectangulo("Rectangulo",20,35);
        Cilindro cilindro = new Cilindro("Cilindro",10,30);
        Esfera esfera = new Esfera("Esfera",15);

        System.out.println("Pintura necesaria para el rectangulo: " + pintura.CalcularPinturaNecesaria(rectangulo));
        System.out.println("Pintura necesaria para el cilindro: " + pintura.CalcularPinturaNecesaria(cilindro));
        System.out.println("Pintura necesaria para la esfera: " + pintura.CalcularPinturaNecesaria(esfera));
    }
}
