/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá́definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */

package Entidad;


public class Cancion {
 //Declaro atributos
    private String titulo;
    private String autor;

    // Definición de Constructores
    //1.- Vacio
    public Cancion() {
        titulo = "";
        autor = "";
    }

    //2.- Constructor que recibe parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
