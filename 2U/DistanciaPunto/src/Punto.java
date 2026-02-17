/**
 * Clase Punto — modela un punto del plano cartesiano.
 */
public class Punto {

    private String etiqueta;
    private int x;
    private int y;

    public Punto(String etiqueta, int x, int y) {
        this.etiqueta = etiqueta;
        this.x = x;
        this.y = y;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return etiqueta + "(" + x + "," + y + ")";
    }
}
