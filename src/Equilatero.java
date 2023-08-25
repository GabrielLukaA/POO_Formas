import java.util.ArrayList;

public class Equilatero extends Triangulo {

    public Equilatero(double a, double b, double c) {
        super(a, b, c);
        this.setTipo("Equilátero");
    }

    @Override
    public double calculaArea() {
        return Math.sqrt(3) / 4 * Math.pow(this.getLadoA(), 2);
    }
}
