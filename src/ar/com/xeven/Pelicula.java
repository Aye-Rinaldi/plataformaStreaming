package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Contenido implements Medio{
    //atributos
    private double duracion; //de la pelicula
    private List<Subtitulo> subtitulos = new ArrayList<>();
    private Double progreso;

    @Override
    public void reproducir() {
        this.progreso += 5.0;
        //reproducir es avanzar 5min
    }
}
