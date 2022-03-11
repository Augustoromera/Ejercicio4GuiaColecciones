package servicio.peliculas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import peliculas.entidades.Pelicula;
import comparador.peliculas.Comparador;

public class PeliculaServicio {

    Scanner leer;

    public PeliculaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void mostrarPeliculas(ArrayList<Pelicula> p) {
        Pelicula pelis = new Pelicula();

        for (int i = 0; i < p.size(); i++) {
            pelis = p.get(i);
            System.out.println(pelis.getTitulo());
        }

    }

    public void mostrarPeliculasOtroMetodo(ArrayList<Pelicula> p) {
        Iterator<Pelicula> it = p.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getTitulo());
            
        }
    
    }
    public void mostrarTituloMayorAHora(ArrayList<Pelicula> p){
    Iterator<Pelicula> it = p.iterator();
    Pelicula pe = new Pelicula();
    
        System.out.println("-----------------------");
        System.out.println("A continuacion se muestran las peliculas con duracion mayor a una hora");
        
        while (it.hasNext()) {
            pe=it.next();
        if(pe.getDuracion()>(1.0)){
            System.out.println(pe.getTitulo());
        }  
        }
    }
    public void ordenarDeMayorAMenor(ArrayList<Pelicula> p){
        System.out.println("----------------------------");
        System.out.println("A continuacion se ordena por duracion de mayor a menor");
    Collections.sort(p, Comparador.ordenarPorDuracDesc);
        System.out.println(p.toString());;
    }
    public void ordenarDeMenorAMayor(ArrayList<Pelicula> p){
        System.out.println("----------------------------");
        System.out.println("A continuacion se ordena por duracion de menor a mayor");
    Collections.sort(p, Comparador.ordenarPorDirectorAsce);
        System.out.println(p.toString());
    }
    public void ordenarTituloAlfabet(ArrayList<Pelicula> p){
        System.out.println("----------------------------");
        System.out.println("A continuacion se ordena por titulo alfabeticamente");
    Collections.sort(p, Comparador.ordenarPorTituloAsce);
        System.out.println(p.toString());
    }
    public void ordenarDirectAlfabet(ArrayList<Pelicula> p){
        System.out.println("----------------------------");
        System.out.println("A continuacion se ordena por director alfabeticamente");
    Collections.sort(p, Comparador.ordenarPorDirectorAsce);
       System.out.println(p.toString());
    }
}
