import java.util.ArrayList;

public class Formas {

    private static ArrayList<Formas> formasLista = new ArrayList<>();
    private double area;
    private double perimetro;


    public static void adicionarForma(Formas forma){
        formasLista.add(forma);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public static ArrayList<Formas> getLista() {
        return formasLista;
    }

    public static void setLista(Formas forma) {
        formasLista.add(forma);
    }
}
