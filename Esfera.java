package Ej3Polimorfismo.ej4;

public class Esfera extends Forma{
    protected double radio;

    public Esfera(String nombre, double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
        public double area () {
        return 4 * Math.PI * Math.pow(radio, 2);    }
}
