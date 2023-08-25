import java.util.ArrayList;

public class Retangulo extends Formas {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        super(3);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calculaArea() {
        return this.ladoA * this.ladoB;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (this.ladoA + this.ladoB);
    }

    @Override
    public String toString() {
        return "Retângulo: " + "\n" +
                "Lado A: " + this.ladoA + "\n" +
                "Lado B: " + this.ladoB + "\n" +
                "Área: " + calculaArea() + "\n" +
                "Perímetro: " + calculaPerimetro() + "\n\n";
    }
}
