import java.util.ArrayList;

public class Circulo extends Formas {

    private double raio;

    public Circulo(double raio) {
        super(1);
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 3.14 * (this.raio * this.raio);
    }

    @Override
    public double calculaPerimetro() {
        return 3.14 * (this.raio * 2);
    }

    @Override
    public String toString() {
        return "Circulo: " + "\n" +
                "Raio: " + this.raio + "\n" +
                "Área: " + calculaArea() + "\n" +
                "Perímetro: " + calculaPerimetro() + "\n" +
                "Diametro: " + this.raio * 2 + "\n\n";
    }
}
