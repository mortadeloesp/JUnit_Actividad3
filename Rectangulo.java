package Ej3Polimorfismo.ej4;

public class Rectangulo extends Forma{
    protected double longitud;
    protected double ancho;

    public Rectangulo(String nombre, double longitud, double ancho) {
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area () {
        return longitud * ancho;
    }
}
