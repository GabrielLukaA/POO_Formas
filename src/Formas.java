import java.util.ArrayList;

public abstract class Formas {

    private static ArrayList<Formas> formasLista = new ArrayList<>();
    private double area;
    private double perimetro;


    public static String mostrarObjetos() {
        String objetos = "";
        for (Formas forma : getLista()) {
            objetos += forma;
        }
        return objetos;
    }

    //objeto que tem que chamar, porque é caracteristíca do objeto

    public static void adicionarForma(Formas forma) {
        formasLista.add(forma);
        //aplicar usando this(no parameter)
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

    public abstract double calculaArea();

    public abstract double calculaPerimetro();
}
