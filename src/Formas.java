import java.util.ArrayList;

public abstract class Formas {

    private static ArrayList<Formas> formasLista = new ArrayList<>();
    private double area;
    private double perimetro;

    public static void mostrarTodos() {
        for (Formas forma : formasLista) {
            System.out.println(forma);
        }
    }

    public static void mostrarQuadrados() {
        for (Formas forma : formasLista) {
            if (forma instanceof Quadrado) {
                System.out.println(forma);
            }
        }
    }

    public static void mostrarCirculos() {
        for (Formas forma : formasLista) {
            if (forma instanceof Circulo) {
                System.out.println(forma);
            }
        }
    }

    public static void mostrarRetangulos() {
        for (Formas forma : formasLista) {
            if (forma instanceof Retangulo) {
                System.out.println(forma);
            }
        }
    }

    public static void mostrarTriangulos() {
        for (Formas forma : formasLista) {
            if (forma instanceof Triangulo) {
                System.out.println(forma);
            }
        }
    }

    public static void adicionarForma(Formas forma) {
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

    public abstract double calculaArea();

    public abstract double calculaPerimetro();
}
