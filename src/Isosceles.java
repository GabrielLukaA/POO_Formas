import java.util.ArrayList;

public class Isosceles extends Triangulo {
    private double altura;

    public Isosceles(double a, double b, double c) {
        super(a, b, c);
        this.setTipo("Isósceles");
        this.setArea(calculaArea());
        this.setPerimetro(calculaPerimetro());
        this.altura = calculaAltura();
    }

    @Override
    public double calculaArea() {
        if (getLadoA() != getLadoB() && getLadoA() != getLadoC()) {
            return getLadoA() * calculaAltura() / 2;
        } else if (getLadoB() != getLadoC() && getLadoB() != getLadoA()) {
            return getLadoB() * calculaAltura() / 2;
        } else {
            return getLadoC() * calculaAltura() / 2;
        }
    }

    public double calculaAltura() {
        if (getLadoA() != getLadoB() && getLadoA() != getLadoC()) {
            return Math.sqrt(getLadoB() * getLadoB() - (getLadoA() * getLadoA() / 4));
        } else if (getLadoB() != getLadoC() && getLadoB() != getLadoA()) {
            return Math.sqrt(getLadoC() * getLadoC() - (getLadoB() * getLadoB() / 4));
        } else {
            return Math.sqrt(getLadoA() * getLadoA() - (getLadoC() * getLadoC() / 4));
        }
    }

    @Override
    public String toString() {
        return "Triângulo Isósceles: \n" +
                "Lado A: " + getLadoA() + "\n" +
                "Lado B: " + getLadoB() + "\n" +
                "Lado C: " + getLadoC() + "\n" +
                "Altura: " + altura + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n\n";
    }
}
