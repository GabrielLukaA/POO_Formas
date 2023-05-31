import java.util.ArrayList;

public abstract class Triangulo extends Formas {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private String tipo;

    public static String mostrarObjetos() {
        String objetos = "";
        for (Formas forma : getLista()) {
            if (forma instanceof Triangulo) {
                objetos += forma;
            }
        }
        return objetos;

    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        //   String tipo = tipoTriangulo(ladoA, ladoB, ladoC);
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
                "lado A: " + ladoA + "\n" +
                "lado B: " + ladoB + "\n" +
                "lado C: " + ladoC + "\n" +
                "Area: " + getArea() + "\n" +
                "Perímetro: " + getPerimetro() + "\n\n";
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


    @Override
    public double calculaPerimetro() {
        return getLadoA() + getLadoB() + getLadoC();
    }

}
