

package egg.extra6empleado;

import Entidad.Empleado;
import java.util.Scanner;


public class Extra6Empleado {

    public static void main(String[] args) {
        double aumento=0;
        Scanner leer= new Scanner(System.in); 
        Empleado emp1 = new Empleado();
        System.out.println("Ingrese el nombre del empleado");
        emp1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        emp1.setEdad(leer.nextInt());
        System.out.println("Ingrese el salario");
        emp1.setSalario(leer.nextDouble());
        System.out.println("El aumento calculado para "+emp1.getNombre()+ " es de: "+ emp1.calcular_aumento());
        System.out.println("------------------------------------------------------------------");
        Empleado emp2 = new Empleado("Aure", 25, 20000);
        System.out.println("El aumento calculado para "+emp2.getNombre()+ " es de: "+ emp2.calcular_aumento());
        
        
        
    }
}
