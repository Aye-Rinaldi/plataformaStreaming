package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Episodio implements Medio{
    //atributos
    private double duracion;
    private List<Subtitulo> subtitulos = new ArrayList<>();
    private Double progreso;

    @Override
    public void reproducir() {
        this.progreso += 5.0;
    }
}
