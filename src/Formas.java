import java.util.ArrayList;

public abstract class Formas {

    private int numero;
    private static ArrayList<Formas> formasLista = new ArrayList<>();

    public Formas (int numero){
        formasLista.add(this);
        this.numero = numero;
    }

    public static String mostrarObjetos() {
        String objetos = "";
        for (Formas forma : formasLista) {
            objetos += forma;
        }
        return objetos;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    //region getters and setters

    public static ArrayList<Formas> mostrarObjetosFiltrados(int opcao) {
        ArrayList<Formas> formas = new ArrayList<>();
        for (Formas forma : formasLista) {
            if (forma.numero == opcao) {
                formas.add(forma);
            }
        }
        return formas;
    }

    //endregion
}
