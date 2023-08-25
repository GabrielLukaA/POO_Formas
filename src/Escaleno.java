import java.util.ArrayList;

public class Escaleno extends Triangulo {

    public Escaleno(double a, double b, double c) {
        super(a, b, c);
        this.setTipo("Escaleno");
    }

    @Override
    public double calculaArea() {
        double semiperimetro = this.calculaPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - getLadoA()) * (semiperimetro - getLadoB()) * (semiperimetro - getLadoC()));
    }
}
