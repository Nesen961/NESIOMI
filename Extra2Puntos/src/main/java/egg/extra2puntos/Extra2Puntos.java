package egg.extra2puntos;

import Entidad.Puntos;
import java.util.Scanner;

public class Extra2Puntos {

    public static void main(String[] args) {
        Puntos punto1 = new Puntos();
        System.out.println("Ingrese las coordenadas del primer punto (x1,y1)");
        Scanner leer = new Scanner(System.in);
        System.out.print("X1: ");
        double x1 = leer.nextDouble();
        System.out.print("Y1: ");
        double y1 = leer.nextDouble();
        System.out.println("Ingrese las coordenadas del primer punto (x2,y2)");
        System.out.print("X2: ");
        double x2 = leer.nextDouble();
        System.out.print("Y2: ");
        double y2 = leer.nextDouble();
        punto1.crearPuntos(x1, y1, x2, y2);
        System.out.println("La distancia entre los puntos es: " + punto1.calcularDistancia());

    }
}
