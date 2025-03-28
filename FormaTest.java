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
        assertEquals(areaEsperada, esfera.area(),0.001);
    }

    @Test
    public void testDevolverAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 20, 35);
        double areaEsperada = 20 * 35; // longitud * ancho
        assertEquals(areaEsperada, rectangulo.area(),0.001);
    }

    @Test
    public void testDevolverAreaCilindro() {
        Cilindro cilindro = new Cilindro("Cilindro", 10, 30);
        double areaEsperada = Math.PI * 10 * 10 * 30; // pi * radio^2 * altura
        assertEquals(areaEsperada, cilindro.area(),0.001);
    }
}