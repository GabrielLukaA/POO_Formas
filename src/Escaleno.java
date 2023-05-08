import java.util.ArrayList;

public class Escaleno extends Triangulo {
    private static ArrayList<Escaleno> escalenos = new ArrayList<>();


    public Escaleno(double a, double b, double c) {
        this.setLadoA(a);
        this.setLadoB(c);
        this.setLadoC(c);
        this.setTipo("Escaleno");
        this.setPerimetro(calculaPerimetro());
        this.setArea(calculaArea());

    }


    private double calculaArea() {
        double semiperimetro = this.getPerimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - getLadoA()) * (semiperimetro - getLadoB()) * (semiperimetro - getLadoC()));
    }

    private double calculaPerimetro() {
        return getLadoA() + getLadoB() + getLadoC();
    }

    public static ArrayList<Escaleno> getEscalenos() {
        return escalenos;
    }

    public static void setEscaleno(Escaleno escaleno) {
        Escaleno.escalenos.add(escaleno);
        ;
    }

}
