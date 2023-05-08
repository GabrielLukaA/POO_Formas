import java.util.ArrayList;

public class Retangulo extends Formas {
    static ArrayList<Retangulo> retangulos = new ArrayList<>();
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.perimetro = calculaPerimetro();
        this.area = calculaArea();
    }

    public boolean verificaRetangulo() {
        if (this.ladoA > 0 && this.ladoB > 0) {
            return true;
        }
        return false;
    }

    public double calculaArea() {
        return this.ladoA * this.ladoB;
    }

    public double calculaPerimetro() {
        return 2 * (this.ladoA + this.ladoB);
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public static ArrayList<Retangulo> getRetangulos() {
        return retangulos;
    }

    public static void setRetangulos(Retangulo retangulo) {
        Retangulo.retangulos.add(retangulo);
    }
}
