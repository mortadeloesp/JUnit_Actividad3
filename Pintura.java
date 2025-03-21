package Ej3Polimorfismo.ej4;

public class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double CalcularPinturaNecesaria (Forma forma) {
        return forma.area()/this.cobertura;
    }
}
