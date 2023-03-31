/*
 Crea una clase cocina que tenga una lista de objetos "Receta". Luego
crea métodos para agregar nuevas recetas a la lista, para buscar una 
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina
 */
package Entidad;

public class Cocina {
    // atributo nombre de la lista que contiene nombre de Recetas

    private String[] lista;
    private int contador;

    //constructor sin parametros
    public Cocina() {
        lista = new String[100];
        contador = 0;
        for (int i = 0; i < 100; i++) {
            this.lista[i]="";
            
        }
    }

    public void agregarRecetas(String x) {
        if (contador < 100) {
            lista[contador] = x;
            contador++;
        }
    }

    public void buscarReceta(String y) {
        Boolean flag = false;
        int pos = 0;
        for (int i = 0; i < 100; i++) {
            if (this.lista[i].equalsIgnoreCase(y)) {
                pos = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("La receta se encuentra en la lista en la posicion" + pos);
        } else {
            System.out.println("La receta no se encuentra en la lista");
        }
    }

    public void mostrarRecetas() {
        for (int i = 0; i < 100; i++) {
            if (this.lista[i].equalsIgnoreCase("")) {
                break;
            } else {
                System.out.println(lista[i]);
            }

        }
    }
}
