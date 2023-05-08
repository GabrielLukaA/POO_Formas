import java.util.ArrayList;

public class Triangulo extends Formas {
    static ArrayList<Triangulo> triangulos = new ArrayList<>();

    double ladoA;
    double ladoB;
    double ladoC;

    double area;
    double perimetro;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean verificaTriangulo(double a, double b, double c) {
        if (a + b > c || b + c > a || c + a > b) {
            return true;
        }
        return false;
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
