/**
 * Clase DemoDistancia — prueba la clase Punto y Distancia.
 */
public class DemoDistancia {

    public static void main(String[] args) {

        Punto puntoA = new Punto("A", 3, -5);
        Punto puntoB = new Punto("B", -2, 6);
        Punto puntoC = new Punto("C", 0, 0);
        Punto puntoD = new Punto("D", 4, 4);

        System.out.println("--- Puntos creados ---");
        System.out.println(puntoA);
        System.out.println(puntoB);
        System.out.println(puntoC);
        System.out.println(puntoD);

        Distancia d1 = new Distancia(puntoA, puntoB);
        Distancia d2 = new Distancia(puntoC, puntoD);

        System.out.println("\n--- Cálculo de distancias ---");
        System.out.println(d1);
        System.out.println(d2);

        System.out.printf("Valor numérico d1: %.4f%n", d1.getDistancia());
        System.out.printf("Valor numérico d2: %.4f%n", d2.getDistancia());
    }
}
