

package egg.pooej01;

import Entidad.Persona;
import java.util.Scanner;


public class POOEj01 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in); 
      //Instanciación utilizando el constructor vacio (o por defecto)
      Persona primeraPersona = new Persona();
      //Instanciación utilizando el constructor por parámetro
      Persona segundaPersona = new Persona("Aurelia", "Caruso", 25);
        System.out.println(segundaPersona);
        System.out.println(primeraPersona);
        System.out.println(segundaPersona.nombre);
        System.out.println(segundaPersona.edad);
        primeraPersona.apellido="Caruso";
        primeraPersona.nombre=leer.next();
        System.out.println(primeraPersona.nombre);
        System.out.println(primeraPersona.apellido);
        

        
    }
}
