import java.util.ArrayList;

public class Triangulo extends Formas {
    static ArrayList<Triangulo> triangulos = new ArrayList<>();
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String tipo;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
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
        return "Triangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
