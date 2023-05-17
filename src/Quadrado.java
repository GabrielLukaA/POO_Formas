import java.util.ArrayList;

public class Quadrado extends Formas {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        this.setPerimetro(calculaPerimetro());
        this.setArea(calculaArea());
        Formas.adicionarForma(this);
    }


    public boolean verificaQuadrado() {
        if (this.lado > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Quadrado: " + "\n" +
                "Área: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n" +
                "Lado: " + lado + "\n\n";

    }

    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calculaPerimetro() {
        return this.lado * 4;
    }
}
