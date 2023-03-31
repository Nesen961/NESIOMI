/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
 */
package Entidad;

public class Puntos {
//Atributos

    private double X1;
    private double Y1;
    private double X2;
    private double Y2;
//Constructor

    //public Puntos() {
    //}
//Crear metodo crearPuntos()
    public void crearPuntos(double x1, double y1, double x2, double y2) {
        this.X1 = x1;
        this.Y1 = y1;
        this.X2 = x2;
        this.Y2 = y2;
    }

    public double calcularDistancia() {

        return Math.sqrt((Math.pow((this.X2 - this.X1), 2) + Math.pow((this.Y2 - this.Y1), 2)));

    }
}
