/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
*/

package Entidad;


public class Circunferencia {
//atributo privado
    private double radio;
    
    //Constructor con detalle

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double r){
        this.radio=r;
    }
    
    public double area(){
        return (3.14*this.radio*this.radio);
    }
    
    public double perimetro(){
        return (2*3.14*this.radio);
    }
}
