import java.util.ArrayList;

public class Quadrado extends Formas {

    private static ArrayList<Quadrado> quadrados = new ArrayList<>();
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        this.perimetro = this.lado * 4;
        this.area = this.lado * this.lado;
    }

    public static ArrayList<Quadrado> getQuadrados() {
        return quadrados;
    }

    public static void setQuadrados(Quadrado quadrado) {
        Quadrado.quadrados.add(quadrado);
    }

    public boolean verificaQuadrado() {
        if (this.lado > 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                ", area=" + area +
                ", perimetro=" + perimetro +
                ", lado=" + lado +
                '}';
    }

}
