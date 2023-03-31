/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
a dos jugadores jugar un juego de adivinanza de números. El primer 
jugador elige un número y el segundo jugador intenta adivinarlo. El 
segundo jugador tiene un número limitado de intentos y recibe una pista 
de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el 
número de veces que cada jugador ha ganado.

 */
package Entidad;

import java.util.Scanner;

public class Juego {

    //atributos
    private int numincognitoJug1;
    private int numincognitoJug2;
    private int numintentosJug1;
    private int numintentosJug2;
    private Boolean flagJug1;
    private Boolean flagJug2;

    //constructor   
    public Juego() {
        this.numintentosJug1 = 4;
        this.numintentosJug2 = 4;
        this.flagJug1 = true;
        this.flagJug2 = true;
    }

    public void iniciar_juego() {

        System.out.println("Jugador 1 elija un numero entero del 1 al 10 para adivinar");
        Scanner leer = new Scanner(System.in);
        this.numincognitoJug1 = leer.nextInt();
        System.out.println("Jugador 2 elija un numero entero del 1 al 10 para adivinar");
        this.numincognitoJug2 = leer.nextInt();

        while (this.flagJug1 == true) {
            System.out.println(" Jugador1 Ingrese un numero");
            int intento = leer.nextInt();
            if (this.numincognitoJug2 == intento) {
                System.out.println("El jugador 1 ha ganado");
                this.flagJug1 = false;
                this.flagJug2 = false;
            } else {
                if (this.numincognitoJug2 > intento) {
                    System.out.println("El numero escondido es mayor");
                }
                if (this.numincognitoJug2 < intento) {
                    System.out.println("El numero escondido es menor");
                }
                this.numintentosJug1--;
            }
            if (this.numintentosJug1 == 0) {
                System.out.println("El jugador1 perdió");
                this.flagJug1 = false;
            }
        }

        while (this.flagJug2 == true) {
            System.out.println(" Jugador2 Ingrese un numero");
            int intento = leer.nextInt();
            if (this.numincognitoJug1 == intento) {
                System.out.println("El jugador 2 ha ganado");
                this.flagJug1 = false;
                this.flagJug2 = false;
            } else {
                if (this.numincognitoJug1 > intento) {
                    System.out.println("El numero escondido es mayor");
                }
                if (this.numincognitoJug1 < intento) {
                    System.out.println("El numero escondido es menor");
                }
                this.numintentosJug2--;
            }
            if (this.numintentosJug2 == 0) {
                System.out.println("El jugador2 perdio");
                this.flagJug1 = false;
            }
        }

    }
}
