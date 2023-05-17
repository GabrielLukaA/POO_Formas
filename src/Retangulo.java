import java.util.ArrayList;

public class Retangulo extends Formas {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setPerimetro(calculaPerimetro());
        this.setArea(calculaArea());
        Formas.adicionarForma(this);
    }

    public boolean verificaRetangulo() {
        if (this.ladoA > 0 && this.ladoB > 0) {
            return true;
        }
        return false;
    }

    @Override
    public double calculaArea() {
        return this.ladoA * this.ladoB;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (this.ladoA + this.ladoB);
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }


    @Override
    public String toString() {
        return "Retangulo: " + "\n" +
                "Lado A: " + ladoA + "\n" +
                "Lado B: " + ladoB + "\n" +
                "Área: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n\n";
    }
}
