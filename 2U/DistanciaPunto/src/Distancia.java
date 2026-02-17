/**
 * Clase Distancia — calcula la distancia entre dos puntos.
 */
public class Distancia {

    private Punto puntoA;
    private Punto puntoB;
    private double distancia;

    public Distancia(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        calcular();
    }

    private void calcular() {
        double dx = puntoB.getX() - puntoA.getX();
        double dy = puntoB.getY() - puntoA.getY();
        distancia = Math.sqrt(dx * dx + dy * dy);
    }

    public double getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return "Distancia entre " + puntoA + " y " + puntoB +
               " = " + String.format("%.4f", distancia);
    }
}


