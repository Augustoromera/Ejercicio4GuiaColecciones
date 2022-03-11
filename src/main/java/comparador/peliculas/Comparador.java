
package comparador.peliculas;
import java.util.Comparator;
import peliculas.entidades.Pelicula;

public class Comparador {
    public static Comparator<Pelicula> ordenarPorDuracDesc =new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracAsce =new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarPorTituloAsce =new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorDirectorAsce =new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
           return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
