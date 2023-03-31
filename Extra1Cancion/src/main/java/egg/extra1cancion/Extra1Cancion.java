

package egg.extra1cancion;

import Entidad.Cancion;


public class Extra1Cancion {

    public static void main(String[] args) {
     // creo una instancia cancion1
        Cancion cancion1 = new Cancion();
        // si inicializo en el constructor con cadena vacia autor y titulo = vacio. Si no lo inicializo es null
        System.out.println("titulo "+cancion1.getTitulo()+"autor "+cancion1.getAutor());
        //Le paso los valores de los atributos mediante el metodo set
        cancion1.setAutor("Serrat");
        cancion1.setTitulo("Mediterraneo");
        //Obtengo los valores de los atributos mediante el metodo get
        System.out.println("El autor de la cancion es: "+cancion1.getAutor());
        System.out.println("El titulo de la cancion es: "+cancion1.getTitulo());     
    }
}
