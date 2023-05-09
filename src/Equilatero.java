import java.util.ArrayList;

public class Equilatero extends Triangulo {


    public Equilatero(double a, double b, double c) {
        this.setLadoA(a);
        this.setLadoB(c);
        this.setLadoC(c);
        this.setTipo("Equilátero");
        this.setArea(calculaArea());
        this.setPerimetro(calculaPerimetro());
    }


    private double calculaArea() {
        return Math.sqrt(3) / 4 * Math.pow(this.getLadoA(), 2);
    }

    private double calculaPerimetro() {
        return getLadoA() * 3;
    }


}
