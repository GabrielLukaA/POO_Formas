import java.util.ArrayList;

public class Escaleno extends Triangulo {


    public Escaleno(double a, double b, double c) {
        super(a, b, c);
        this.setLadoA(a);
        this.setLadoB(c);
        this.setLadoC(c);
        this.setTipo("Escaleno");
        this.setPerimetro(calculaPerimetro());
        this.setArea(calculaArea());

    }

    @Override
    public double calculaArea() {
        double semiperimetro = this.getPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - getLadoA()) * (semiperimetro - getLadoB()) * (semiperimetro - getLadoC()));
    }
}
