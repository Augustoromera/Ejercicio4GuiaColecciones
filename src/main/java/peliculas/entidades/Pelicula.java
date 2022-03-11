
package peliculas.entidades;
import java.util.Scanner;
public class Pelicula {
    String titulo;
    String director;
    Double duracion;
    Scanner leer;
   
    public Pelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public String toString() {
        return "Titulo:" + titulo + "\n Director:" + director + "\n Duracion:" + duracion + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
}
