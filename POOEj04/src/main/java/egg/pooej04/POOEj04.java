
package egg.pooej04;

import Entidad.Rectangulo;
public class POOEj04 {

    public static void main(String[] args) {
       Rectangulo rec1 = new Rectangulo(15, 10);
        System.out.println("El area del rectangulo es: "+rec1.calcularArea(rec1.getBase(),rec1.getAltura()));
        Rectangulo rec2 = new Rectangulo();
        rec2.crearRectangulo();
        System.out.println("El perimetro del rectangulo es: "+ rec2.calcularPerimetro() );
        Rectangulo rec3 = new Rectangulo(20, 10);
        rec3.dibujarRectangulo();
    }
}
