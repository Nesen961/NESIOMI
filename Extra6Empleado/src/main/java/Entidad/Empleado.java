/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
"salario". Luego, crea un método "calcular_aumento" que calcule el 
aumento salarial de un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 
años o del 5% si tiene menos de 30 años.
*/

package Entidad;


public class Empleado {
    //atributos
    private String nombre;
    private int edad;
    private double salario;
    //constructores

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public double calcular_aumento(){
        
        if (this.edad>30) 
            return this.salario*0.10;
        else
            return this.salario*0.05;
        
            
        
    }
    

}
