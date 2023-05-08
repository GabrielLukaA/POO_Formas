import java.util.ArrayList;

public class Triangulo extends Formas {
    private static ArrayList<Triangulo> triangulos = new ArrayList<>();
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String tipo;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        String tipo = tipoTriangulo(ladoA, ladoB, ladoC);
    }

    public Triangulo() {
    }

    public boolean verificaTriangulo() {
        double a = this.ladoA;
        double b = this.ladoB;
        double c = this.ladoC;
        if (a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }

    public static String tipoTriangulo(double a, double b, double c) {

        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void setTriangulos(Triangulo triangulo) {
        Triangulo.triangulos.add(triangulo);
    }

    public static ArrayList<Triangulo> getTriangulos() {
        return triangulos;
    }

    @Override
    public String toString() {
        return "Triangulo " + getTipo() + ":\n" +
                "lado A: " + ladoA + "\n" +
                "lado B: " + ladoB + "\n" +
                "lado C: " + ladoC + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n\n";
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
