import java.util.ArrayList;

public abstract class Triangulo extends Formas {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String tipo;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super(2);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calculaPerimetro() {
        return getLadoA() + getLadoB() + getLadoC();
    }

    public static boolean verificaTriangulo(double a, double b, double c) {
        if (a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }

    public static Triangulo tipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return new Equilatero(a, b, c);
        } else if (a == b || b == c || a == c) {
            return new Isosceles(a, b, c);
        } else {
            return new Escaleno(a, b, c);
        }
    }

    @Override
    public String toString() {
        return "Triângulo " + getTipo() + ":\n" +
                "lado A: " + this.ladoA + "\n" +
                "lado B: " + this.ladoB + "\n" +
                "lado C: " + this.ladoC + "\n" +
                "Area: " + calculaArea() + "\n" +
                "Perímetro: " + calculaPerimetro() + "\n\n";
    }

    //region getters and setters
    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //endregion
}
