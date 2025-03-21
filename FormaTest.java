package Ej3Polimorfismo.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    public void testToStringEsfera() {
        Esfera esfera = new Esfera("Esfera", 15);
        assertEquals("Forma{nombre='Esfera'}", esfera.toString());
    }

    @Test
    public void testToStringRectangulo() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 20, 35);
        assertEquals("Forma{nombre='Rectangulo'}", rectangulo.toString());
    }

    @Test
    public void testToStringCilindro() {
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        assertEquals("Forma{nombre='Cilindro'}", cilindro.toString());
    }

    @Test
    public void testDevolverAreaEsfera() {
        Esfera esfera = new Esfera("Esfera", 15);
        double areaEsperada = 4 * Math.PI * Math.pow(15, 2); // 4 * pi * radio^2
        assertEquals(areaEsperada, esfera.area());
    }

    @Test
    public void testDevolverAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 20, 35);
        double areaEsperada = 20 * 35; // longitud * ancho
        assertEquals(areaEsperada, rectangulo.area());
    }

    @Test
    public void testDevolverAreaCilindro() {
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        double areaEsperada = Math.PI * 10 * 10 * 30; // pi * radio^2 * altura
        assertEquals(areaEsperada, cilindro.area());
    }

    @Test
    public void testCalcularPinturaEsfera() {
        Pintura pintura = new Pintura(250);
        Esfera esfera = new Esfera("Esfera", 15);
        double area = 4 * Math.PI * Math.pow(15, 2);
        double pinturaEsperada = area / 250; // area / cobertura
        assertEquals(pinturaEsperada, pintura.CalcularPinturaNecesaria(esfera));
    }

    @Test
    public void testCalcularPinturaRectangulo() {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 20, 35);
        double area = 20 * 35;
        double pinturaEsperada = area / 250; // area / cobertura
        assertEquals(pinturaEsperada, pintura.CalcularPinturaNecesaria(rectangulo));
    }

    @Test
    public void testCalcularPinturaCilindro() {
        Pintura pintura = new Pintura(250);
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        double area = Math.PI * 10 * 10 * 30;
        double pinturaEsperada = area / 250; // area / cobertura
        assertEquals(pinturaEsperada, pintura.CalcularPinturaNecesaria(cilindro));
    }
}