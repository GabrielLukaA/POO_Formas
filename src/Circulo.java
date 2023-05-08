import java.util.ArrayList;

public class Circulo extends Formas {
    static ArrayList<Circulo> circulos = new ArrayList<>();
    private double raio;
    private double diametro;

    public Circulo(double raio) {
        this.raio = raio;
        this.diametro = raio * 2;
        this.setArea(calculaArea());
        this.setPerimetro(calculaPerimetro());
    }

    public boolean verificaCirculo() {
        if (this.raio > 0) {
            return true;
        }
        return false;
    }

    private double calculaArea() {
        return 3.14 * (this.raio * this.raio);
    }

    private double calculaPerimetro() {
        return 3.14 * this.diametro;
    }

    public static ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public static void setCirculos(Circulo circulo) {
        Circulo.circulos.add(circulo);
    }

    @Override
    public String toString() {
        return "Circulo: " + "\n" +
                "Raio: " + raio + "\n" +
                "Área: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n" +
                "Diametro: " + diametro + "\n\n";
    }
}
