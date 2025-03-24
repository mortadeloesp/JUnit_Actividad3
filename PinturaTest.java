package Ej3Polimorfismo.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {

    @Test
    public void testCalcularPinturaEsfera() {
        Pintura pintura = new Pintura(250);
        Esfera esfera = new Esfera("Esfera", 15);
        double area = 4 * Math.PI * Math.pow(15, 2);
        double pinturaEsperada = area / 250; // area / cobertura
        assertEquals(pinturaEsperada, pintura.CalcularPinturaNecesaria(esfera),0.001);
    }

    @Test
    public void testCalcularPinturaRectangulo() {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 20, 35);
        double area = 20 * 35;
        double pinturaEsperada = area / 250; // area / cobertura
        assertEquals(pinturaEsperada, pintura.CalcularPinturaNecesaria(rectangulo),0.001);
    }

    @Test
    public void testCalcularPinturaCilindro() {
        Pintura pintura = new Pintura(250);
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        double area = Math.PI * 10 * 10 * 30;
        double pinturaEsperada = area / 250; // area / cobertura
        assertEquals(pinturaEsperada, pintura.CalcularPinturaNecesaria(cilindro), 0.001);
    }
}