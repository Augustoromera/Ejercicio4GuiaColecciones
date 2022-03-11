package paquete.main;

import java.util.ArrayList;
import java.util.Scanner;
import peliculas.entidades.Pelicula;
import servicio.peliculas.PeliculaServicio;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String res = "";
PeliculaServicio pServ = new PeliculaServicio();
        ArrayList<Pelicula> peliculas = new ArrayList();

        do {
            Pelicula p = new Pelicula();
            
            System.out.println("Ingrese una pelicula");
            res = leer.next();
            p.setTitulo(res);
            System.out.println("Ingrese su director");
            res = leer.next();
            p.setDirector(res);
            System.out.println("Ahora ingrese la duracion en horas");
            Double s=0.0;
            s=leer.nextDouble();
            p.setDuracion(s);
            peliculas.add(p);

            System.out.println("Quiere ingresar otro alumno ?");
            res = leer.next();
        } while (res.equalsIgnoreCase("Si"));
        pServ.mostrarPeliculas(peliculas);
        pServ.mostrarPeliculasOtroMetodo(peliculas);
        pServ.mostrarTituloMayorAHora(peliculas);
        pServ.ordenarDeMayorAMenor(peliculas);
        System.out.println("");
        pServ.ordenarDeMenorAMayor(peliculas);
        System.out.println("");
        pServ.ordenarTituloAlfabet(peliculas);
        System.out.println("");
        pServ.ordenarDirectAlfabet(peliculas);
    }

}
