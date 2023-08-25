import java.util.ArrayList;

public class Quadrado extends Formas {

    private double lado;

    public Quadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calculaPerimetro() {
        return this.lado * 4;
    }

    @Override
    public String toString() {
        return "Quadrado: " + "\n" +
                "Área: " + calculaArea()+ "\n" +
                "Perímetro: " + calculaArea() + "\n" +
                "Lado: " + this.lado + "\n\n";

    }
}
