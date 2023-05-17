import java.util.ArrayList;

public class Equilatero extends Triangulo {


    public Equilatero(double a, double b, double c) {
        super(a, b, c);
        this.setLadoA(a);
        this.setLadoB(c);
        this.setLadoC(c);
        this.setTipo("Equilátero");
        this.setArea(calculaArea());
        this.setPerimetro(calculaPerimetro());
    }

    @Override
    public double calculaArea() {
        return Math.sqrt(3) / 4 * Math.pow(this.getLadoA(), 2);
    }


}
