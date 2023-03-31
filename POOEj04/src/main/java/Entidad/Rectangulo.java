/*
 Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

package Entidad;

import java.util.Scanner;

public class Rectangulo {
// Atributos privados base y altura
    private int base;
    private int altura;
    // Constructores

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base=leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura=leer.nextInt();   
    }
    
    public int calcularPerimetro(){
        return 2*(this.altura+this.base);
    }
    
    public int calcularArea(int alt, int bas){
        this.altura=alt;
        this.base=bas;
        return this.altura*this.base;
    }
    
    public void dibujarRectangulo(){
        int alto = this.altura;
        int ancho = this.base;
        
        for (int i=0; i< alto;i++){
            for(int j=0; j< ancho; j++){
                if(i==0 || i==alto-1)
                    System.out.print("* ");
                else
                    if(j==0||j==ancho-1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
