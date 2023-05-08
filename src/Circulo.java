import java.util.ArrayList;

public class Circulo extends Formas {
    static ArrayList<Circulo> circulos = new ArrayList<>();
    private double raio;
    private double diametro;

    public Circulo(double raio) {
        this.raio = raio;
        this.diametro = raio * 2;
        this.area = calculaArea();
        this.area = calculaPerimetro();
    }

    public boolean verificaCirculo() {
        if (this.raio > 0) {
            return true;
        }
        return false;
    }

    public double calculaArea() {
        return 3.14 * (this.raio * this.raio);
    }

    public double calculaPerimetro() {
        return 3.14 * this.diametro;
    }

    public static ArrayList<Circulo> getCirculos() {
        return circulos;
    }
}
