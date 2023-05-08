public class Retangulo extends Formas {
    double ladoA;
    double ladoB;

    public boolean verificaRetangulo(double a, double b) {
        if (a > 0 && b > 0) {
            return true;
        }
        return false;
    }
}
