import java.util.ArrayList;

public class Quadrado extends Formas {

    private static ArrayList<Quadrado> quadrados = new ArrayList<>();
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        this.setPerimetro(this.lado * 4);
        this.setArea(this.lado * this.lado);
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
        return "Quadrado: " + "\n" +
                "Área: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n" +
                "Lado: " + lado + "\n\n";

    }

}
