import java.util.ArrayList;

public class Circulo extends Formas {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.setArea(calculaArea());
        this.setPerimetro(calculaPerimetro());
        Formas.adicionarForma(this);
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
        return 3.14 * (raio*2);
    }



    @Override
    public String toString() {
        return "Circulo: " + "\n" +
                "Raio: " + raio + "\n" +
                "Área: " + getArea() + "\n" +
                "Perimetro: " + getPerimetro() + "\n" +
                "Diametro: " + raio*2 + "\n\n";
    }
}
