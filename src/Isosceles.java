import java.util.ArrayList;

public class Isosceles extends Triangulo {
    private double altura;

    public Isosceles(double a, double b, double c) {
        super( a,  b,  c);
        this.setTipo("Isósceles.");
        this.setArea(calculaArea());
        this.setPerimetro(calculaPerimetro());
        this.altura = calculaAltura();
    }


    private double calculaArea() {
        if (getLadoA() != getLadoB() && getLadoA() != getLadoC()) {
            return getLadoA() / 2;
        } else if (getLadoB() != getLadoC() && getLadoB() != getLadoA()) {
            return getLadoB() / 2;
        } else {
            return getLadoC() / 2;
        }
    }

    private double calculaPerimetro() {
        if (getLadoA() != getLadoB() && getLadoA() != getLadoC()) {
            return Math.sqrt(getLadoB() * getLadoB() - (getLadoA() * getLadoA() / 4));
        } else if (getLadoB() != getLadoC() && getLadoB() != getLadoA()) {
            return Math.sqrt(getLadoC() * getLadoC() - (getLadoB() * getLadoB() / 4));
        } else {
            return Math.sqrt(getLadoA() * getLadoA() - (getLadoC() * getLadoC() / 4));
        }
    }

    private double calculaAltura() {
        if (getLadoA() != getLadoB() && getLadoA() != getLadoC()) {
            return getLadoA() + (2 * getLadoC());
        } else if (getLadoB() != getLadoC() && getLadoB() != getLadoA()) {
            return getLadoB() + (2 * getLadoC());
        } else {
            return getLadoC() + (2 * getLadoA());
        }
    }

    @Override
    public String toString() {
        return "Triangulo Isósceles: \n" +
                "Lado A: " + getLadoA() + "\n" +
                "Lado B: " + getLadoB() + "\n" +
                "Lado C: " + getLadoC() + "\n" +
                "Altura: " + altura + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n\n";
    }
}
