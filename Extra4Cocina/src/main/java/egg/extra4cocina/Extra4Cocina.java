
package egg.extra4cocina;

import Entidad.Cocina;
import java.util.Scanner;

public class Extra4Cocina {

    public static void main(String[] args) {
        Cocina cocina1 = new Cocina();
        int opcion;
        String x;
        Boolean bandera = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1  Ingresar Recetas");
        System.out.println("2  Buscar Recetas");
        System.out.println("3  Mostrar Lista");
        System.out.println("4  Salir ");
        while (bandera) {
            do {
                System.out.println("Ingrese una opcion valida");
                opcion = leer.nextInt();
            } while (opcion < 1 || opcion > 4);
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre de la receta a guardar");
                    x = leer.next();
                    cocina1.agregarRecetas(x);
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre de la receta a buscar");
                    x = leer.next();
                    cocina1.buscarReceta(x);
                }
                case 3 -> cocina1.mostrarRecetas();
                case 4 -> {
                    System.out.println("gracias por usar nuestra app");
                    bandera = false;
                }
            }
        }
    }
}


